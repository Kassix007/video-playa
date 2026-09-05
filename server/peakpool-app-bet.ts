import { createHash, randomBytes } from "node:crypto";
import type { PeakpoolConfig } from "./peakpool-config.js";
import {
  buildPeakpoolAppBetRequest,
  type PeakpoolAppBetRequest,
  type PeakpoolAppFlowVerification,
  type PeakpoolBetType,
} from "./peakpool-flow-profile.js";
import {
  PeakpoolProgrammeError,
  type PeakpoolProgramme,
  type PeakpoolRace,
  type PeakpoolRunner,
} from "./peakpool-programme.js";
import type { SmspariazObservability } from "./smspariaz-observability.js";
import {
  PeakpoolPreparedBetSchema,
  PeakpoolPreparedSelectionSchema,
  type SmspariazPreparedBetStore,
} from "./smspariaz-prepared-store.js";
import type { SmspariazAuthenticatedSession } from "./smspariaz-session-store.js";
import type { z } from "zod";

type PeakpoolPreparedTicket = z.infer<typeof PeakpoolPreparedBetSchema>;
type PeakpoolPreparedSelection = z.infer<typeof PeakpoolPreparedSelectionSchema>;

interface PeakpoolProvider {
  verifyPeakpoolAppFlow(): Promise<PeakpoolAppFlowVerification>;
  checkLogin(session: { login_id: string; phone: string; token: string; cookies: SmspariazAuthenticatedSession["cookies"] }): Promise<boolean>;
  postPeakpoolAppBet(request: PeakpoolAppBetRequest, cookies?: SmspariazAuthenticatedSession["cookies"]): Promise<{ text: string }>;
}

interface PeakpoolProgrammeProvider {
  getProgramme(): Promise<PeakpoolProgramme>;
}

export interface PreparePeakpoolAppBetInput {
  unit_stake: number;
  selection: {
    meeting_number: string;
    race_number: string;
    runner_number: string;
    bet_type: PeakpoolBetType;
  };
}

export interface PreparedPeakpoolAppBetOutput {
  prepared_bet: string;
  expires_at: string;
  selection: PeakpoolPreparedSelection;
  unit_stake: number;
  displayed_pool_value?: string;
  fixture_fingerprint: string;
  submitted: false;
}

export interface PeakpoolPlacementOutput {
  success: true;
  reference: null;
  confirmation: string;
  unit_stake: number;
  submitted_via: "smspariaz_peakpool_app_flow";
}

function principalHash(principal: string): string {
  return createHash("sha256").update(principal).digest("hex");
}

function normalIdentifier(value: unknown): string {
  const text = typeof value === "string" ? value.trim() : "";
  return /^(?:0|[1-9]\d*)$/.test(text) && Number.isSafeInteger(Number(text)) ? text : "";
}

function readProviderError(error: unknown): never {
  if (error instanceof PeakpoolProgrammeError) throw new Error(error.code);
  throw error;
}

function resolveSelection(
  programme: PeakpoolProgramme,
  input: PreparePeakpoolAppBetInput["selection"],
): PeakpoolPreparedSelection {
  const meeting = normalIdentifier(input.meeting_number);
  const raceNumber = normalIdentifier(input.race_number);
  const runnerNumber = normalIdentifier(input.runner_number);
  if (!meeting || meeting === "0" || !raceNumber || raceNumber === "0" || !runnerNumber
    || (input.bet_type !== "win" && input.bet_type !== "place")) {
    throw new Error("PEAKPOOL_SELECTION_INVALID");
  }
  const race = programme.races.find((candidate) => candidate.meeting_number === meeting && candidate.race_number === raceNumber);
  const runner = race?.runners.find((candidate) => candidate.runner_number === runnerNumber);
  if (!race || !runner) throw new Error("PEAKPOOL_SELECTION_INVALID");
  return {
    meeting_number: race.meeting_number,
    race_number: race.race_number,
    runner_number: runner.runner_number,
    selection_code: runner.selection_code,
    bet_type: input.bet_type,
    runner_name: runner.name,
    ...(runner.displayed_pool_value ? { displayed_pool_value: runner.displayed_pool_value } : {}),
  };
}

function sameSelection(
  selection: PeakpoolPreparedSelection,
  race: PeakpoolRace | undefined,
  runner: PeakpoolRunner | undefined,
): boolean {
  return Boolean(race && runner
    && race.meeting_number === selection.meeting_number
    && race.race_number === selection.race_number
    && runner.runner_number === selection.runner_number
    && runner.selection_code === selection.selection_code
    && runner.name === selection.runner_name
    && runner.displayed_pool_value === selection.displayed_pool_value);
}

function providerReply(value: unknown): Record<string, unknown> | null {
  return value !== null && typeof value === "object" && !Array.isArray(value)
    ? value as Record<string, unknown>
    : null;
}

function confirmationFromReply(reply: Record<string, unknown> | null): string | null {
  const message = typeof reply?.message === "string" ? reply.message.trim() : "";
  const out = typeof reply?.out === "string" ? reply.out.trim() : "";
  // The public client displays only `reply.out` and `reply.message`.  Do not
  // infer undocumented balance, leaderboard, or reference fields.
  const confirmation = [message, out].filter(Boolean).join(" ").slice(0, 500);
  return confirmation || null;
}

export class PeakpoolAppBetService {
  constructor(
    private readonly config: PeakpoolConfig,
    private readonly provider: PeakpoolProvider,
    private readonly programmeProvider: PeakpoolProgrammeProvider,
    private readonly preparedStore: SmspariazPreparedBetStore,
    private readonly telemetry?: SmspariazObservability,
    private readonly now: () => number = Date.now,
  ) {}

  async getProgramme(): Promise<PeakpoolProgramme> {
    try {
      const programme = await this.programmeProvider.getProgramme();
      this.telemetry?.emit("peakpool_programme_retrieved", { event_count: programme.races.length });
      return programme;
    } catch (error) {
      this.telemetry?.emit("peakpool_programme_failed", { error_code: error instanceof PeakpoolProgrammeError ? error.code : "PEAKPOOL_PROGRAMME_UNAVAILABLE" });
      return readProviderError(error);
    }
  }

  async prepare(
    session: SmspariazAuthenticatedSession,
    principal: string,
    input: PreparePeakpoolAppBetInput,
  ): Promise<PreparedPeakpoolAppBetOutput> {
    if (!Number.isSafeInteger(input.unit_stake) || input.unit_stake < 1 || input.unit_stake > 1_000_000) {
      throw new Error("INVALID_STAKE");
    }
    const flow = await this.provider.verifyPeakpoolAppFlow();
    if (!flow.valid) throw new Error("PEAKPOOL_APP_FLOW_CHANGED");
    const programme = await this.getProgramme();
    let selection: PeakpoolPreparedSelection;
    try {
      selection = resolveSelection(programme, input.selection);
    } catch (error) {
      this.telemetry?.emit("peakpool_bet_validation_failed", { error_code: error instanceof Error ? error.message : "PEAKPOOL_SELECTION_INVALID" });
      throw error;
    }
    const createdAt = this.now();
    const record: PeakpoolPreparedTicket = {
      schema_version: 1,
      product: "peakpool",
      handle: randomBytes(32).toString("base64url"),
      state: "PREPARED",
      principal_hash: principalHash(principal),
      session_generation: session.generation,
      selection,
      unit_stake: input.unit_stake,
      programme_fingerprint: programme.fixture_fingerprint,
      flow_fingerprint: flow.fingerprint,
      created_at: new Date(createdAt).toISOString(),
      expires_at: new Date(createdAt + this.config.preparedBetTtlMs).toISOString(),
    };
    await this.preparedStore.create(record);
    this.telemetry?.emit("peakpool_bet_prepared", { selection_count: 1, flow_fingerprint: flow.fingerprint });
    return {
      prepared_bet: record.handle,
      expires_at: record.expires_at,
      selection: record.selection,
      unit_stake: record.unit_stake,
      ...(record.selection.displayed_pool_value ? { displayed_pool_value: record.selection.displayed_pool_value } : {}),
      fixture_fingerprint: record.programme_fingerprint,
      submitted: false,
    };
  }

  async place(
    session: SmspariazAuthenticatedSession,
    principal: string,
    handle: string,
    approved: boolean,
  ): Promise<PeakpoolPlacementOutput> {
    if (!this.config.appBetEnabled) throw new Error("PEAKPOOL_APP_BET_DISABLED");
    if (approved !== true) throw new Error("PREPARED_BET_INVALID");
    const current = await this.preparedStore.get(handle);
    if (!current || current.product !== "peakpool") throw new Error("PREPARED_BET_INVALID");
    if (current.state !== "PREPARED") throw new Error("PREPARED_BET_ALREADY_USED");
    if (!session.app_registered) throw new Error("APP_REGISTRATION_REQUIRED");
    if (!await this.provider.checkLogin(session)) throw new Error("SESSION_EXPIRED");
    const flow = await this.provider.verifyPeakpoolAppFlow();
    if (!flow.valid || flow.fingerprint !== current.flow_fingerprint) throw new Error("PEAKPOOL_APP_FLOW_CHANGED");
    const programme = await this.getProgramme();
    if (programme.fixture_fingerprint !== current.programme_fingerprint) throw new Error("PEAKPOOL_FIXTURE_CHANGED");
    const race = programme.races.find((candidate) => candidate.meeting_number === current.selection.meeting_number
      && candidate.race_number === current.selection.race_number);
    const runner = race?.runners.find((candidate) => candidate.runner_number === current.selection.runner_number);
    if (!sameSelection(current.selection, race, runner)) throw new Error("PEAKPOOL_FIXTURE_CHANGED");

    const claimed = await this.preparedStore.claim(handle, principalHash(principal), session.generation, this.now(), "peakpool");
    if (claimed.product !== "peakpool") throw new Error("PREPARED_BET_INVALID");
    const request = buildPeakpoolAppBetRequest(session, {
      unit_stake: claimed.unit_stake,
      meeting_number: claimed.selection.meeting_number,
      race_number: claimed.selection.race_number,
      runner_number: claimed.selection.runner_number,
      bet_type: claimed.selection.bet_type,
    });
    this.telemetry?.emit("peakpool_app_bet_submitting", { selection_count: 1, flow_fingerprint: flow.fingerprint });
    let responseText: string;
    try {
      responseText = (await this.provider.postPeakpoolAppBet(request, session.cookies)).text;
    } catch (error) {
      if (error && typeof error === "object" && (error as { code?: unknown }).code === "PEAKPOOL_APP_FLOW_CHANGED") {
        await this.preparedStore.complete(handle, "REJECTED", {
          error_code: "PEAKPOOL_APP_FLOW_CHANGED",
          completed_at: new Date(this.now()).toISOString(),
        });
        throw new Error("PEAKPOOL_APP_FLOW_CHANGED");
      }
      await this.preparedStore.complete(handle, "AMBIGUOUS", {
        error_code: "SUBMISSION_AMBIGUOUS",
        completed_at: new Date(this.now()).toISOString(),
      });
      throw new Error("SUBMISSION_AMBIGUOUS");
    }
    let payload: Record<string, unknown>;
    try {
      const parsed = JSON.parse(responseText) as unknown;
      const object = providerReply(parsed);
      if (!object) throw new Error();
      payload = object;
    } catch {
      await this.preparedStore.complete(handle, "AMBIGUOUS", { error_code: "SUBMISSION_AMBIGUOUS", completed_at: new Date(this.now()).toISOString() });
      throw new Error("SUBMISSION_AMBIGUOUS");
    }
    const status = payload.status;
    if (status !== 0 && status !== "0") {
      await this.preparedStore.complete(handle, "REJECTED", { error_code: "PROVIDER_REJECTED", completed_at: new Date(this.now()).toISOString() });
      throw new Error("PROVIDER_REJECTED");
    }
    const confirmation = confirmationFromReply(providerReply(payload.reply));
    if (!confirmation) {
      await this.preparedStore.complete(handle, "AMBIGUOUS", { error_code: "SUBMISSION_AMBIGUOUS", completed_at: new Date(this.now()).toISOString() });
      throw new Error("SUBMISSION_AMBIGUOUS");
    }
    await this.preparedStore.complete(handle, "SUCCEEDED", { confirmation, completed_at: new Date(this.now()).toISOString() });
    this.telemetry?.emit("peakpool_app_bet_response", { flow_fingerprint: flow.fingerprint });
    return {
      success: true,
      reference: null,
      confirmation,
      unit_stake: claimed.unit_stake,
      submitted_via: "smspariaz_peakpool_app_flow",
    };
  }
}
