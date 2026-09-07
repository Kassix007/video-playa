import { createHash, randomBytes } from "node:crypto";
import type { SmspariazConfig } from "./smspariaz-config.js";
import type { SmsfootballProgramme } from "./smspariaz-football.js";
import type { SmspariazObservability } from "./smspariaz-observability.js";
import {
  type SmspariazCanonicalSelectionSchema,
  type SmspariazPreparedBet,
  type SmspariazPreparedBetStore,
} from "./smspariaz-prepared-store.js";
import type { SmspariazAuthenticatedSession } from "./smspariaz-session-store.js";
import { APP_BET_ALLOWED_ENDPOINTS, AUDITED_SMSPARIAZ_FLOW } from "./test-fixtures/smspariaz/flow-fixtures.js";
import type { z } from "zod";

type CanonicalSelection = z.infer<typeof SmspariazCanonicalSelectionSchema>;

interface AppBetProvider {
  verifyAppFlow(): Promise<{ valid: boolean; fingerprint: string }>;
  checkLogin(session: { login_id: string; phone: string; token: string; cookies: SmspariazAuthenticatedSession["cookies"] }): Promise<boolean>;
  postProviderForm(path: string, fields: Readonly<Record<string, string>>, cookies?: SmspariazAuthenticatedSession["cookies"]): Promise<{ text: string }>;
}

interface FootballProvider { getProgramme(): Promise<SmsfootballProgramme> }

export interface PrepareAppBetInput {
  stake: number;
  selections: Array<{ event_id: string; market: string; selection: string; expected_odds?: number }>;
}

export interface PreparedAppBetOutput {
  prepared_bet: string;
  expires_at: string;
  resolved_events: CanonicalSelection[];
  total_odds: number;
  stake: number;
  estimated_payout: number;
  all_open: true;
  changed_odds: Array<{ event_id: string; selection_id: string; expected: number; current: number }>;
  validation_errors: [];
  submitted: false;
}

const FORBIDDEN_REAL_MONEY = /wallet|cash|payment|paid|sms|deposit|withdraw|balance|debit|credit|card|bank/i;
const MARKET_ALIASES: Record<string, string> = { FTH: "1", FT: "1", FULLTIME: "1", "FULL TIME": "1" };
const SELECTION_ALIASES: Record<string, string> = { HOME: "Home", DRAW: "Draw", AWAY: "Away" };

function round2(value: number): number { return Math.round((value + Number.EPSILON) * 100) / 100; }
function numberText(value: number): string { return Number.isInteger(value) ? String(value) : String(round2(value)); }
function normalize(value: string): string { return value.trim().replace(/[_-]+/g, " ").replace(/\s+/g, " ").toUpperCase(); }
function principalHash(principal: string): string { return createHash("sha256").update(principal).digest("hex"); }

function bonus(count: number): number {
  if (count >= 21) return 1.35;
  if (count >= 16) return 1.30;
  if (count >= 11) return 1.25;
  if (count >= 6) return 1.20;
  if (count >= 2) return 1.15;
  return 1;
}

function calculate(stake: number, odds: number, selectionCount: number) {
  const tax = round2(stake / 1.14 * 0.14);
  const payout = round2(stake / 1.14 * odds * bonus(selectionCount));
  return { tax, payout };
}

function resolveSelection(
  programme: SmsfootballProgramme,
  requested: PrepareAppBetInput["selections"][number],
): CanonicalSelection {
  const event = programme.events.find((candidate) => candidate.event_id === requested.event_id);
  if (!event) throw new Error("INVALID_SELECTION");
  if (!event.open) throw new Error("EVENT_CLOSED");
  const marketInput = normalize(requested.market);
  const marketAlias = MARKET_ALIASES[marketInput] ?? requested.market.trim();
  const market = event.markets.find((candidate) => candidate.market_id === marketAlias
    || normalize(candidate.market) === marketInput);
  if (!market) throw new Error("INVALID_SELECTION");
  if (!market.open) throw new Error("EVENT_CLOSED");
  const selectionInput = normalize(requested.selection);
  const selectionAlias = SELECTION_ALIASES[selectionInput] ?? requested.selection.trim();
  const selection = market.selections.find((candidate) =>
    candidate.selection_code === selectionAlias || candidate.selection_id === selectionAlias
    || normalize(candidate.selection) === normalize(selectionAlias));
  if (!selection) throw new Error("INVALID_SELECTION");
  if (!selection.open || !selection.odds || !selection.selection_id) throw new Error("EVENT_CLOSED");
  return {
    event_id: event.event_id,
    market_id: market.market_id,
    selection_code: selection.selection_code,
    selection_id: selection.selection_id,
    odds: selection.odds,
    bet_code: market.bet_code || event.bet_code,
    home: event.home,
    away: event.away,
  };
}

function findExactSelection(programme: SmsfootballProgramme, canonical: CanonicalSelection): CanonicalSelection {
  const event = programme.events.find((candidate) => candidate.event_id === canonical.event_id);
  const market = event?.markets.find((candidate) => candidate.market_id === canonical.market_id);
  const selection = market?.selections.find((candidate) => candidate.selection_id === canonical.selection_id
    && candidate.selection_code === canonical.selection_code);
  if (!event || !market || !selection) throw new Error("INVALID_SELECTION");
  if (!event.open || !market.open || !selection.open || !selection.odds) throw new Error("EVENT_CLOSED");
  return { ...canonical, odds: selection.odds, bet_code: market.bet_code || event.bet_code, home: event.home, away: event.away };
}

function parseBookcode(html: string): string {
  if (/BOOKINGERROR/i.test(html)) throw new Error("PROVIDER_REJECTED");
  const input = html.match(/<input\b[^>]*\bid=["']bookcode["'][^>]*>/i)?.[0];
  const code = input?.match(/\bvalue=["']([^"']+)["']/i)?.[1]?.trim();
  if (!code || !/^[A-Za-z0-9_-]{1,100}$/.test(code) || FORBIDDEN_REAL_MONEY.test(code)) {
    throw new Error("APP_BET_FLOW_CHANGED");
  }
  return code;
}

export function buildGuardedAppBetRequest(
  origin: string,
  path: string,
  session: { login_id: string; phone: string; token: string },
  bookcode: string,
): { path: "/placebet/"; fields: { loginid: string; phone: string; token: string; message: string } } {
  if (origin !== "https://www.smspariaz.com" || !APP_BET_ALLOWED_ENDPOINTS.includes(path as "/placebet/")
    || !/^[A-Za-z0-9_-]{1,100}$/.test(bookcode) || FORBIDDEN_REAL_MONEY.test(bookcode)) {
    throw new Error("APP_BET_FLOW_CHANGED");
  }
  const fields = { loginid: session.login_id, phone: session.phone, token: session.token, message: `n${bookcode}` };
  if (Object.keys(fields).sort().join(",") !== AUDITED_SMSPARIAZ_FLOW.appRequestFields.join(",")) {
    throw new Error("APP_BET_FLOW_CHANGED");
  }
  return { path: "/placebet/", fields };
}

export class SmspariazAppBetService {
  constructor(
    private readonly config: SmspariazConfig,
    private readonly provider: AppBetProvider,
    private readonly football: FootballProvider,
    private readonly preparedStore: SmspariazPreparedBetStore,
    private readonly telemetry?: SmspariazObservability,
    private readonly now: () => number = Date.now,
  ) {}

  async prepare(
    session: SmspariazAuthenticatedSession,
    principal: string,
    input: PrepareAppBetInput,
  ): Promise<PreparedAppBetOutput> {
    if (!Number.isFinite(input.stake) || input.stake < 20 || input.stake > 1_000_000) throw new Error("INVALID_STAKE");
    if (!Array.isArray(input.selections) || input.selections.length < 1 || input.selections.length > 25) throw new Error("INVALID_SELECTION");
    if (new Set(input.selections.map((selection) => selection.event_id)).size !== input.selections.length) throw new Error("INVALID_SELECTION");
    const flow = await this.provider.verifyAppFlow();
    if (!flow.valid) throw new Error("APP_BET_FLOW_CHANGED");
    const programme = await this.football.getProgramme();
    const resolved = input.selections.map((selection) => resolveSelection(programme, selection));
    const totalOdds = resolved.reduce((product, selection) => product * selection.odds, 1);
    const totals = calculate(input.stake, totalOdds, resolved.length);
    const changedOdds = input.selections.flatMap((selection, index) => {
      const current = resolved[index]!;
      return selection.expected_odds !== undefined && Math.abs(selection.expected_odds - current.odds) > 0.000001
        ? [{ event_id: current.event_id, selection_id: current.selection_id, expected: selection.expected_odds, current: current.odds }]
        : [];
    });
    const game = resolved.length === 1 ? "s" as const : "a" as const;
    const fields: Record<string, string> = {
      "bet-game": game,
      "bet-stake": numberText(input.stake),
      "bet-staketax": totals.tax.toFixed(2),
      "bet-selection": resolved.map((selection) => selection.selection_id).join(","),
    };
    if (game === "s") fields["bet-payout"] = totals.payout.toFixed(2);
    else fields["bet-from"] = String(resolved.length);
    const validation = await this.provider.postProviderForm(AUDITED_SMSPARIAZ_FLOW.paths.validateBet, fields, session.cookies);
    const bookcode = parseBookcode(validation.text);
    const createdAt = this.now();
    const handle = randomBytes(32).toString("base64url");
    const record: SmspariazPreparedBet = {
      schema_version: 1,
      handle,
      state: "PREPARED",
      principal_hash: principalHash(principal),
      session_generation: session.generation,
      game,
      selections: resolved,
      stake: input.stake,
      stake_tax: totals.tax,
      total_odds: round2(totalOdds),
      estimated_payout: totals.payout,
      bookcode,
      flow_fingerprint: flow.fingerprint,
      created_at: new Date(createdAt).toISOString(),
      expires_at: new Date(createdAt + this.config.preparedBetTtlMs).toISOString(),
    };
    await this.preparedStore.create(record);
    this.telemetry?.emit("bet_prepared", { selection_count: resolved.length, flow_fingerprint: flow.fingerprint });
    return {
      prepared_bet: handle,
      expires_at: record.expires_at,
      resolved_events: resolved,
      total_odds: record.total_odds,
      stake: input.stake,
      estimated_payout: totals.payout,
      all_open: true,
      changed_odds: changedOdds,
      validation_errors: [],
      submitted: false,
    };
  }

  async place(
    session: SmspariazAuthenticatedSession,
    principal: string,
    handle: string,
    approved: boolean,
  ): Promise<{ success: true; reference: string | null; confirmation: string; stake: number; payout: number; submitted_via: "smspariaz_app_flow" }> {
    if (!this.config.appBetEnabled) throw new Error("APP_BET_DISABLED");
    if (approved !== true) throw new Error("PREPARED_BET_INVALID");
    const current = await this.preparedStore.get(handle);
    if (!current) throw new Error("PREPARED_BET_INVALID");
    if (current.state !== "PREPARED") throw new Error("PREPARED_BET_ALREADY_USED");
    if (!session.app_registered) throw new Error("APP_REGISTRATION_REQUIRED");
    if (!await this.provider.checkLogin(session)) throw new Error("SESSION_EXPIRED");
    const flow = await this.provider.verifyAppFlow();
    if (!flow.valid || flow.fingerprint !== current.flow_fingerprint) throw new Error("APP_BET_FLOW_CHANGED");
    const programme = await this.football.getProgramme();
    for (const selection of current.selections) {
      const live = findExactSelection(programme, selection);
      if (Math.abs(live.odds - selection.odds) > 0.000001 || live.bet_code !== selection.bet_code) throw new Error("ODDS_CHANGED");
    }
    const claimed = await this.preparedStore.claim(handle, principalHash(principal), session.generation, this.now());
    const request = buildGuardedAppBetRequest(this.config.baseUrl, AUDITED_SMSPARIAZ_FLOW.paths.placeAppBet, session, claimed.bookcode);
    this.telemetry?.emit("app_bet_submitting", { selection_count: claimed.selections.length, flow_fingerprint: flow.fingerprint });
    let responseText: string;
    try {
      responseText = (await this.provider.postProviderForm(request.path, request.fields, session.cookies)).text;
    } catch {
      await this.preparedStore.complete(handle, "AMBIGUOUS", { error_code: "SUBMISSION_AMBIGUOUS", completed_at: new Date(this.now()).toISOString() });
      throw new Error("SUBMISSION_AMBIGUOUS");
    }
    let payload: Record<string, unknown>;
    try {
      const parsed = JSON.parse(responseText) as unknown;
      if (!parsed || typeof parsed !== "object" || Array.isArray(parsed)) throw new Error();
      payload = parsed as Record<string, unknown>;
    } catch {
      await this.preparedStore.complete(handle, "AMBIGUOUS", { error_code: "SUBMISSION_AMBIGUOUS", completed_at: new Date(this.now()).toISOString() });
      throw new Error("SUBMISSION_AMBIGUOUS");
    }
    const reply = payload.reply && typeof payload.reply === "object" && !Array.isArray(payload.reply)
      ? payload.reply as Record<string, unknown> : null;
    if (payload.status !== 0 && payload.status !== "0") {
      await this.preparedStore.complete(handle, "REJECTED", { error_code: "PROVIDER_REJECTED", completed_at: new Date(this.now()).toISOString() });
      throw new Error("PROVIDER_REJECTED");
    }
    const message = typeof reply?.message === "string" ? reply.message.trim() : "";
    const webmessage = typeof reply?.webmessage === "string" ? reply.webmessage.trim() : "";
    if (!message && !webmessage) {
      await this.preparedStore.complete(handle, "AMBIGUOUS", { error_code: "SUBMISSION_AMBIGUOUS", completed_at: new Date(this.now()).toISOString() });
      throw new Error("SUBMISSION_AMBIGUOUS");
    }
    const reference = [reply?.reference, reply?.ref, reply?.code, reply?.bookcode]
      .find((value): value is string => typeof value === "string" && value.length > 0) ?? null;
    const confirmation = [message, webmessage].filter(Boolean).join(" ").slice(0, 500);
    const referenceHash = reference ? createHash("sha256").update(reference).digest("hex").slice(0, 16) : undefined;
    await this.preparedStore.complete(handle, "SUCCEEDED", {
      confirmation,
      ...(referenceHash ? { reference_hash: referenceHash } : {}),
      completed_at: new Date(this.now()).toISOString(),
    });
    this.telemetry?.emit("app_bet_response", { reference_hash: referenceHash });
    return { success: true, reference, confirmation, stake: claimed.stake, payout: claimed.estimated_payout, submitted_via: "smspariaz_app_flow" };
  }
}
