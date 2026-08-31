export type HorseeJobStatus = "PENDING" | "READY" | "DISPATCHED" | "RUNNING" | "SAVED" | "FAILED" | "MISSED";

export type HorseePublicJob = {
  id: string;
  programme_date: string;
  race_id: string;
  meeting_number: number;
  race_number: number;
  racecourse: string;
  off_time_mauritius: string;
  status: HorseeJobStatus;
  mode: "PRIMARY" | "RECOVERY" | null;
  attempts: number;
  prompt?: string;
  updated_at: string;
};

export type HorseeArchiveHealth = {
  status: "HEALTHY" | "DEGRADED" | "NOT_CONFIGURED";
  last_archived_day: string | null;
  repo: string | null;
  pending_days: number;
  last_error: string | null;
};

export type HorseeSchedulerStatus = {
  programme_date: string;
  timezone: "Indian/Mauritius";
  observed_at: string;
  last_run_at: string | null;
  revision: number;
  counts: {
    programme: number;
    completed: number;
    ready: number;
    pending: number;
    dispatched: number;
    running: number;
    failed: number;
    missed: number;
  };
  upcoming_jobs: HorseePublicJob[];
  archive: HorseeArchiveHealth;
  last_error: string | null;
};

const JOB_STATUSES = new Set<HorseeJobStatus>(["PENDING", "READY", "DISPATCHED", "RUNNING", "SAVED", "FAILED", "MISSED"]);

function isObject(value: unknown): value is Record<string, unknown> {
  return Boolean(value) && typeof value === "object";
}

function isNullableString(value: unknown): value is string | null {
  return value === null || typeof value === "string";
}

function hasOnlyKeys(value: Record<string, unknown>, allowed: readonly string[]): boolean {
  const allowedKeys = new Set(allowed);
  return Object.keys(value).every((key) => allowedKeys.has(key));
}

export function isHorseePublicJob(value: unknown): value is HorseePublicJob {
  if (!isObject(value)) return false;
  return hasOnlyKeys(value, [
    "id", "programme_date", "race_id", "meeting_number", "race_number", "racecourse",
    "off_time_mauritius", "status", "mode", "attempts", "prompt", "updated_at",
  ])
    && typeof value.id === "string"
    && typeof value.programme_date === "string"
    && typeof value.race_id === "string"
    && typeof value.meeting_number === "number"
    && typeof value.race_number === "number"
    && typeof value.racecourse === "string"
    && typeof value.off_time_mauritius === "string"
    && typeof value.status === "string"
    && JOB_STATUSES.has(value.status as HorseeJobStatus)
    && (value.mode === null || value.mode === "PRIMARY" || value.mode === "RECOVERY")
    && typeof value.attempts === "number"
    && (value.prompt === undefined || typeof value.prompt === "string")
    && typeof value.updated_at === "string";
}

export function isHorseeSchedulerStatus(value: unknown): value is HorseeSchedulerStatus {
  if (!isObject(value) || !isObject(value.counts) || !isObject(value.archive)) return false;
  const counts = value.counts;
  const archive = value.archive;
  return hasOnlyKeys(value, [
    "programme_date", "timezone", "observed_at", "last_run_at", "revision", "counts",
    "upcoming_jobs", "archive", "last_error",
  ])
    && hasOnlyKeys(counts, ["programme", "completed", "ready", "pending", "dispatched", "running", "failed", "missed"])
    && hasOnlyKeys(archive, ["status", "last_archived_day", "repo", "pending_days", "last_error"])
    && typeof value.programme_date === "string"
    && value.timezone === "Indian/Mauritius"
    && typeof value.observed_at === "string"
    && isNullableString(value.last_run_at)
    && typeof value.revision === "number"
    && ["programme", "completed", "ready", "pending", "dispatched", "running", "failed", "missed"]
      .every((key) => typeof counts[key] === "number")
    && Array.isArray(value.upcoming_jobs)
    && value.upcoming_jobs.every(isHorseePublicJob)
    && (archive.status === "HEALTHY" || archive.status === "DEGRADED" || archive.status === "NOT_CONFIGURED")
    && isNullableString(archive.last_archived_day)
    && isNullableString(archive.repo)
    && typeof archive.pending_days === "number"
    && isNullableString(archive.last_error)
    && isNullableString(value.last_error);
}

export async function loadHorseeSchedulerStatus(signal?: AbortSignal): Promise<HorseeSchedulerStatus> {
  const response = await fetch("/api/horsee/scheduler/status", {
    cache: "no-store",
    headers: { Accept: "application/json" },
    signal,
  });
  const payload = await response.json().catch(() => null) as unknown;
  if (!response.ok) throw new Error(`Scheduler status returned HTTP ${response.status}.`);
  if (!isHorseeSchedulerStatus(payload)) throw new Error("The scheduler status response was malformed.");
  return payload;
}
