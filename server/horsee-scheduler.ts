import { randomUUID } from "node:crypto";
import { CouncilResultSchema, type CouncilResult } from "./council-schema.js";
import type { CouncilResultStore } from "./council-store.js";
import type { HorseeConfig } from "./horsee-config.js";
import type { HorseeJobStore } from "./horsee-job-store.js";
import {
  HorseeDailyQueueSchema,
  HorseeJobSchema,
  createHorseeJobId,
  type HorseeDailyQueue,
  type HorseeJob,
  type HorseeJobMode,
  type HorseeSourceChangeField,
} from "./horsee-job-schema.js";
import { buildHorseeHardPrompt } from "./horsee-prompt-builder.js";
import {
  getSmspariazDailyRacecard,
  type SmspariazRace,
  type SmspariazRacecardResponse,
  type SmspariazRacecardSuccess,
} from "./smspariaz-racecard.js";
import {
  differenceInMauritiusWallMinutes,
  getMauritiusDate,
} from "./mauritius-time.js";

const MAX_CAS_ATTEMPTS = 5;

export class HorseeSchedulerBusyError extends Error {
  constructor() {
    super("Another HORSEE scheduler invocation owns the current lease.");
    this.name = "HorseeSchedulerBusyError";
  }
}

export class HorseeSchedulerError extends Error {
  constructor(readonly code: string, message: string) {
    super(message);
    this.name = "HorseeSchedulerError";
  }
}

export interface HorseeSchedulerDependencies {
  config: HorseeConfig;
  jobStore: HorseeJobStore;
  resultStore: Pick<CouncilResultStore, "getByDate">;
  now?: () => Date;
  fetchRacecard?: () => Promise<SmspariazRacecardResponse>;
  buildPrompt?: (job: HorseeJob) => string;
  log?: (message: string) => void;
}

export interface HorseeSchedulerRunResult {
  queue: HorseeDailyQueue;
  created_jobs: number;
  ready_jobs: number;
  recovery_jobs: number;
  saved_jobs: number;
  missed_jobs: number;
}

function sanitizedError(error: unknown): string {
  const message = error instanceof Error ? error.message : "Unknown scheduler failure.";
  return message.replace(/Bearer\s+\S+/gi, "Bearer [redacted]").slice(0, 1_000);
}

function assertValidSchedulerRacecard(racecard: SmspariazRacecardSuccess): void {
  const seen = new Set<string>();
  for (const race of racecard.races) {
    if (seen.has(race.race_id)) {
      throw new HorseeSchedulerError(
        "SMSPARIAZ_RACECARD_INVALID",
        `The authoritative programme contains duplicate race identity ${race.race_id}.`,
      );
    }
    seen.add(race.race_id);
    if (!/^(?:[01]\d|2[0-3]):[0-5]\d$/.test(race.off_time_mauritius)) {
      throw new HorseeSchedulerError(
        "SMSPARIAZ_RACECARD_INVALID",
        `The authoritative programme contains an invalid Mauritius off-time for ${race.race_id}.`,
      );
    }
    if (race.race_id !== `R${race.meeting_number}C${race.race_number}`) {
      throw new HorseeSchedulerError(
        "SMSPARIAZ_RACECARD_INVALID",
        `The authoritative programme contains inconsistent race identity ${race.race_id}.`,
      );
    }
  }
  if (racecard.race_count !== racecard.races.length) {
    throw new HorseeSchedulerError(
      "SMSPARIAZ_RACECARD_INVALID",
      "The authoritative programme race count does not match its race list.",
    );
  }
}

function authoritativeSourceChanges(previous: HorseeJob, race: SmspariazRace): HorseeSourceChangeField[] {
  const changes: HorseeSourceChangeField[] = [];
  if (previous.meeting_number !== race.meeting_number) changes.push("MEETING_NUMBER");
  if (previous.race_number !== race.race_number) changes.push("RACE_NUMBER");
  if (previous.racecourse !== race.racecourse) changes.push("RACECOURSE");
  if (previous.off_time_mauritius !== race.off_time_mauritius) changes.push("OFF_TIME");
  if (previous.source_status === "REMOVED") changes.push("RESTORED");
  return changes;
}

function transitionLabel(job: HorseeJob): string {
  return job.mode ? `${job.status} (${job.mode})` : job.status;
}

function logQueueOutcome(
  log: (message: string) => void,
  previous: HorseeDailyQueue | null,
  current: HorseeDailyQueue,
): void {
  const previousJobs = previous?.jobs ?? {};
  const jobs = Object.values(current.jobs).sort((left, right) => left.id.localeCompare(right.id));
  for (const job of jobs) {
    const prior = previousJobs[job.id];
    if (!prior) {
      log(`[HORSEE SCHEDULER] Transition: ${job.race_id} NEW -> ${transitionLabel(job)}`);
    } else if (prior.status !== job.status || prior.mode !== job.mode) {
      log(`[HORSEE SCHEDULER] Transition: ${job.race_id} ${transitionLabel(prior)} -> ${transitionLabel(job)}`);
    }
    if (job.source_revision > (prior?.source_revision ?? 0)) {
      if (job.source_change_fields?.includes("REMOVED")) {
        log(`[HORSEE SCHEDULER] Source removed: ${job.race_id}`);
      } else {
        log(`[HORSEE SCHEDULER] Source changed: ${job.race_id} ${job.source_change_fields?.join(",") ?? "UNKNOWN"}`);
      }
    }
  }
  const count = (status: HorseeJob["status"]) => jobs.filter((job) => job.status === status).length;
  log(`[HORSEE SCHEDULER] Already completed: ${count("SAVED")} races`);
  log(`[HORSEE SCHEDULER] States: pending=${count("PENDING")} ready=${count("READY")} dispatched=${count("DISPATCHED")} running=${count("RUNNING")} saved=${count("SAVED")} failed=${count("FAILED")} missed=${count("MISSED")}`);
}

function createPendingJob(race: SmspariazRace, date: string, now: string): HorseeJob {
  return {
    id: createHorseeJobId(date, race.race_id),
    programme_date: date,
    race_id: race.race_id,
    meeting_number: race.meeting_number,
    race_number: race.race_number,
    racecourse: race.racecourse,
    off_time_mauritius: race.off_time_mauritius,
    created_at: now,
    updated_at: now,
    status: "PENDING",
    mode: null,
    source_status: "ACTIVE",
    source_revision: 0,
    attempts: 0,
  };
}

function timingMode(minutesUntilOff: number, config: HorseeConfig): HorseeJobMode | null {
  if (minutesUntilOff >= config.primaryWindow.min && minutesUntilOff <= config.primaryWindow.max) return "PRIMARY";
  if (minutesUntilOff >= config.recoveryWindow.min && minutesUntilOff <= config.recoveryWindow.max) return "RECOVERY";
  if (config.allowLateAnalysis && minutesUntilOff >= 0 && minutesUntilOff < config.recoveryWindow.min) return "RECOVERY";
  return null;
}

function activatePendingJob(
  job: HorseeJob,
  now: Date,
  config: HorseeConfig,
  buildPrompt: (job: HorseeJob) => string,
): HorseeJob {
  let minutesUntilOff: number;
  try {
    minutesUntilOff = differenceInMauritiusWallMinutes(
      now,
      job.programme_date,
      job.off_time_mauritius,
    );
  } catch {
    return HorseeJobSchema.parse({
      ...job,
      status: "FAILED",
      mode: null,
      attempts: job.attempts + 1,
      updated_at: now.toISOString(),
      last_error: "The authoritative Mauritius off-time is invalid.",
      prompt: undefined,
    });
  }

  const mode = timingMode(minutesUntilOff, config);
  if (mode) {
    const readyJob: HorseeJob = {
      ...job,
      status: "READY",
      mode,
      updated_at: now.toISOString(),
      last_error: undefined,
    };
    return HorseeJobSchema.parse({ ...readyJob, prompt: job.prompt ?? buildPrompt(readyJob) });
  }

  if (minutesUntilOff < config.recoveryWindow.min) {
    return HorseeJobSchema.parse({
      ...job,
      status: "MISSED",
      mode: null,
      updated_at: now.toISOString(),
      last_error: "Race passed the configured recovery cutoff.",
      prompt: undefined,
    });
  }

  if (job.status === "FAILED") return HorseeJobSchema.parse(job);
  return HorseeJobSchema.parse({
    ...job,
    status: "PENDING",
    mode: null,
    last_error: undefined,
    prompt: undefined,
  });
}

export function reconcileHorseeQueue(
  racecard: SmspariazRacecardSuccess,
  existing: HorseeDailyQueue | null,
  storedResults: CouncilResult[],
  now: Date,
  config: HorseeConfig,
  buildPrompt: (job: HorseeJob) => string = buildHorseeHardPrompt,
): HorseeDailyQueue {
  assertValidSchedulerRacecard(racecard);
  const timestamp = now.toISOString();
  const validResults = storedResults.flatMap((result) => {
    const parsed = CouncilResultSchema.safeParse(result);
    return parsed.success ? [parsed.data] : [];
  });
  const resultByRace = new Map(validResults.map((result) => [result.race_id, result]));
  const jobs: Record<string, HorseeJob> = {};

  for (const race of racecard.races) {
    const id = createHorseeJobId(racecard.programme_date, race.race_id);
    const previous = existing?.jobs[id];
    const sourceChanges = previous ? authoritativeSourceChanges(previous, race) : [];
    let job: HorseeJob;
    if (previous) {
      const needsFreshPrompt = sourceChanges.length > 0
        && ["READY", "FAILED", "MISSED"].includes(previous.status);
      job = HorseeJobSchema.parse({
        ...previous,
        meeting_number: race.meeting_number,
        race_number: race.race_number,
        racecourse: race.racecourse,
        off_time_mauritius: race.off_time_mauritius,
        source_status: "ACTIVE",
        source_revision: previous.source_revision + (sourceChanges.length ? 1 : 0),
        source_changed_at: sourceChanges.length ? timestamp : previous.source_changed_at,
        source_change_fields: sourceChanges.length ? sourceChanges : previous.source_change_fields,
        updated_at: sourceChanges.length ? timestamp : previous.updated_at,
        ...(needsFreshPrompt ? {
          status: "FAILED",
          mode: null,
          prompt: undefined,
          last_error: "Authoritative programme details changed; the job requires a fresh prompt.",
        } : {}),
      });
    } else {
      job = createPendingJob(race, racecard.programme_date, timestamp);
    }

    const result = resultByRace.get(race.race_id);
    if (result) {
      job = HorseeJobSchema.parse({
        ...job,
        status: "SAVED",
        updated_at: previous?.status === "SAVED" ? previous.updated_at : timestamp,
        completed_at: result.analysed_at,
        last_error: undefined,
      });
    } else if (!["READY", "DISPATCHED", "RUNNING", "SAVED", "MISSED"].includes(job.status)) {
      job = activatePendingJob(job, now, config, buildPrompt);
    }
    jobs[id] = job;
  }

  for (const previous of Object.values(existing?.jobs ?? {}).sort((left, right) => left.id.localeCompare(right.id))) {
    if (jobs[previous.id]) continue;
    const result = resultByRace.get(previous.race_id);
    if (result) {
      const newlyRemoved = previous.source_status !== "REMOVED";
      jobs[previous.id] = HorseeJobSchema.parse({
        ...previous,
        status: "SAVED",
        source_status: "REMOVED",
        source_revision: previous.source_revision + (newlyRemoved ? 1 : 0),
        source_changed_at: newlyRemoved ? timestamp : previous.source_changed_at,
        source_change_fields: newlyRemoved ? ["REMOVED"] : previous.source_change_fields,
        updated_at: previous.status === "SAVED" && !newlyRemoved ? previous.updated_at : timestamp,
        completed_at: result.analysed_at,
        last_error: undefined,
      });
      continue;
    }
    const newlyRemoved = previous.source_status !== "REMOVED";
    jobs[previous.id] = HorseeJobSchema.parse({
      ...previous,
      source_status: "REMOVED",
      source_revision: previous.source_revision + (newlyRemoved ? 1 : 0),
      source_changed_at: newlyRemoved ? timestamp : previous.source_changed_at,
      source_change_fields: newlyRemoved ? ["REMOVED"] : previous.source_change_fields,
      status: ["PENDING", "FAILED"].includes(previous.status) ? "MISSED" : previous.status,
      mode: ["PENDING", "FAILED"].includes(previous.status) ? null : previous.mode,
      updated_at: newlyRemoved ? timestamp : previous.updated_at,
      last_error: ["PENDING", "FAILED"].includes(previous.status)
        ? "Race was removed from the current authoritative programme."
        : previous.last_error,
    });
  }

  return HorseeDailyQueueSchema.parse({
    programme_date: racecard.programme_date,
    timezone: "Indian/Mauritius",
    source: racecard.source,
    programme_fetched_at: racecard.fetched_at,
    created_at: existing?.created_at ?? timestamp,
    updated_at: timestamp,
    revision: (existing?.revision ?? 0) + 1,
    jobs,
  });
}

async function updateSchedulerState(
  dependencies: HorseeSchedulerDependencies,
  values: {
    date: string | null;
    now: Date;
    success: boolean;
    raceCount: number;
    error?: string;
  },
): Promise<void> {
  for (let attempt = 0; attempt < MAX_CAS_ATTEMPTS; attempt += 1) {
    const current = await dependencies.jobStore.getSchedulerState();
    const state = {
      current_programme_date: values.date,
      last_run_at: values.now.toISOString(),
      last_success_at: values.success ? values.now.toISOString() : current.value?.last_success_at ?? null,
      last_error_at: values.success ? null : values.now.toISOString(),
      last_error: values.success ? null : values.error ?? "Scheduler failed.",
      last_programme_race_count: values.success ? values.raceCount : current.value?.last_programme_race_count ?? 0,
      updated_at: values.now.toISOString(),
    };
    if (await dependencies.jobStore.putSchedulerState(state, current.etag)) return;
  }
  throw new HorseeSchedulerError("SCHEDULER_STATE_CONFLICT", "Scheduler state changed too many times concurrently.");
}

export async function runHorseeScheduler(
  dependencies: HorseeSchedulerDependencies,
): Promise<HorseeSchedulerRunResult> {
  const now = dependencies.now?.() ?? new Date();
  const log = dependencies.log ?? ((message: string) => console.log(message));
  const owner = randomUUID();
  const lease = {
    owner,
    purpose: "SCHEDULER" as const,
    acquired_at: now.toISOString(),
    expires_at: new Date(now.getTime() + dependencies.config.schedulerLockSeconds * 1_000).toISOString(),
  };
  if (!await dependencies.jobStore.acquireLease("scheduler", lease, now)) throw new HorseeSchedulerBusyError();

  try {
    const expectedDate = getMauritiusDate(now);
    const response = dependencies.fetchRacecard
      ? await dependencies.fetchRacecard()
      : await getSmspariazDailyRacecard({ now: () => now });
    if (!response.success) {
      throw new HorseeSchedulerError(response.error_code, `SMSPariaz programme unavailable: ${response.error_code}.`);
    }
    if (response.programme_date !== expectedDate) {
      throw new HorseeSchedulerError(
        "SMSPARIAZ_RACECARD_STALE",
        `Expected the current Mauritius programme ${expectedDate}, received ${response.programme_date}.`,
      );
    }
    assertValidSchedulerRacecard(response);

    const results = await dependencies.resultStore.getByDate(expectedDate);
    await dependencies.jobStore.putRacecard(response);
    let persisted: HorseeDailyQueue | null = null;
    let previousQueue: HorseeDailyQueue | null = null;
    let startingCount = 0;
    for (let attempt = 0; attempt < MAX_CAS_ATTEMPTS; attempt += 1) {
      const current = await dependencies.jobStore.getQueue(expectedDate);
      startingCount = Object.keys(current.value?.jobs ?? {}).length;
      const reconciled = reconcileHorseeQueue(
        response,
        current.value,
        results,
        now,
        dependencies.config,
        dependencies.buildPrompt,
      );
      if (await dependencies.jobStore.putQueue(reconciled, current.etag)) {
        persisted = reconciled;
        previousQueue = current.value;
        break;
      }
    }
    if (!persisted) throw new HorseeSchedulerError("QUEUE_CONFLICT", "Daily queue changed too many times concurrently.");

    await updateSchedulerState(dependencies, {
      date: expectedDate,
      now,
      success: true,
      raceCount: response.race_count,
    });

    const jobs = Object.values(persisted.jobs);
    const ready = jobs.filter((job) => job.status === "READY");
    logQueueOutcome(log, previousQueue, persisted);
    log(`[HORSEE SCHEDULER] Programme: ${response.race_count} races`);
    return {
      queue: persisted,
      created_jobs: Math.max(0, jobs.length - startingCount),
      ready_jobs: ready.length,
      recovery_jobs: ready.filter((job) => job.mode === "RECOVERY").length,
      saved_jobs: jobs.filter((job) => job.status === "SAVED").length,
      missed_jobs: jobs.filter((job) => job.status === "MISSED").length,
    };
  } catch (error) {
    const message = sanitizedError(error);
    log(`[HORSEE SCHEDULER] Failed: ${message}`);
    try {
      await updateSchedulerState(dependencies, {
        date: getMauritiusDate(now),
        now,
        success: false,
        raceCount: 0,
        error: message,
      });
    } catch {
      log("[HORSEE SCHEDULER] Failed to persist scheduler failure state.");
    }
    throw error;
  } finally {
    await dependencies.jobStore.releaseLease("scheduler", owner, dependencies.now?.() ?? new Date());
  }
}

export function sortHorseeJobs(jobs: HorseeJob[]): HorseeJob[] {
  return [...jobs].sort((left, right) => left.off_time_mauritius.localeCompare(right.off_time_mauritius)
    || left.meeting_number - right.meeting_number
    || left.race_number - right.race_number
    || left.id.localeCompare(right.id));
}
