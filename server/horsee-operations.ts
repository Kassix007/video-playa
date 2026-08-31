import { z } from "zod";
import type { CouncilResultStore } from "./council-store.js";
import type { HorseeArchiveService } from "./horsee-archive.js";
import type { HorseeDispatcher, HorseeDispatchResult } from "./horsee-dispatch.js";
import type { HorseeJobStore } from "./horsee-job-store.js";
import {
  canTransitionHorseeJob,
  HorseeDailyQueueSchema,
  HorseeJobSchema,
  type HorseeDailyQueue,
  type HorseeJob,
  type HorseeJobStatus,
} from "./horsee-job-schema.js";
import { formatMauritiusTimestamp, getMauritiusDate } from "./mauritius-time.js";
import { sortHorseeJobs } from "./horsee-scheduler.js";

const OPERATION_CAS_ATTEMPTS = 5;

export class HorseeOperationError extends Error {
  constructor(readonly code: string, readonly status: number, message: string) {
    super(message);
    this.name = "HorseeOperationError";
  }
}

export const HorseeStatusTransitionRequestSchema = z.object({
  status: z.enum(["DISPATCHED", "RUNNING", "SAVED", "FAILED"]),
  error: z.string().trim().min(1).max(1_000).nullable().optional(),
}).strict().superRefine((value, context) => {
  if (value.status === "FAILED" && !value.error) {
    context.addIssue({ code: "custom", path: ["error"], message: "A bounded error is required for FAILED." });
  }
  if (value.status !== "FAILED" && value.error !== undefined && value.error !== null) {
    context.addIssue({ code: "custom", path: ["error"], message: "Error is accepted only for FAILED." });
  }
});

export type HorseePublicJob = Pick<HorseeJob,
  "id" | "programme_date" | "race_id" | "meeting_number" | "race_number" |
  "racecourse" | "off_time_mauritius" | "status" | "mode" | "attempts" | "updated_at"
> & { prompt?: string };

export function projectHorseeJob(job: HorseeJob): HorseePublicJob {
  return {
    id: job.id,
    programme_date: job.programme_date,
    race_id: job.race_id,
    meeting_number: job.meeting_number,
    race_number: job.race_number,
    racecourse: job.racecourse,
    off_time_mauritius: job.off_time_mauritius,
    status: job.status,
    mode: job.mode,
    attempts: job.attempts,
    ...(job.status === "READY" && job.prompt ? { prompt: job.prompt } : {}),
    updated_at: job.updated_at,
  };
}

export function publicJobs(queue: HorseeDailyQueue | null): HorseePublicJob[] {
  return sortHorseeJobs(Object.values(queue?.jobs ?? {})).map(projectHorseeJob);
}

function publicOperationalMessage(value: string | null | undefined): string | null {
  if (!value) return null;
  return value
    .replace(/Bearer\s+\S+/gi, "Bearer [redacted]")
    .replace(/((?:token|secret|api[_ -]?key))\s*[=:]\s*\S+/gi, "$1=[redacted]")
    .slice(0, 500);
}

export async function getHorseeSchedulerSnapshot(options: {
  jobStore: HorseeJobStore;
  archive: Pick<HorseeArchiveService, "getArchiveHealth">;
  now?: Date;
}) {
  const now = options.now ?? new Date();
  const date = getMauritiusDate(now);
  const [queueValue, schedulerState, archive] = await Promise.all([
    options.jobStore.getQueue(date),
    options.jobStore.getSchedulerState(),
    options.archive.getArchiveHealth(),
  ]);
  const queue = queueValue.value;
  const jobs = Object.values(queue?.jobs ?? {});
  const count = (status: HorseeJobStatus) => jobs.filter((job) => job.status === status).length;
  const upcoming = sortHorseeJobs(jobs.filter((job) => !["SAVED", "MISSED"].includes(job.status))).slice(0, 10);
  return {
    programme_date: date,
    timezone: "Indian/Mauritius" as const,
    observed_at: formatMauritiusTimestamp(now),
    last_run_at: schedulerState.value?.last_run_at ?? null,
    revision: queue?.revision ?? 0,
    counts: {
      programme: jobs.filter((job) => job.source_status === "ACTIVE").length,
      completed: count("SAVED"),
      ready: count("READY"),
      pending: count("PENDING"),
      dispatched: count("DISPATCHED"),
      running: count("RUNNING"),
      failed: count("FAILED"),
      missed: count("MISSED"),
    },
    upcoming_jobs: upcoming.map(projectHorseeJob),
    archive: { ...archive, last_error: publicOperationalMessage(archive.last_error) },
    last_error: publicOperationalMessage(schedulerState.value?.last_error),
  };
}

function parseJobIdentity(id: string): { date: string; raceId: string } {
  const match = /^(\d{4}-\d{2}-\d{2}):(.+)$/.exec(id);
  if (!match) throw new HorseeOperationError("invalid_job_id", 400, "Job ID must use programme-date:race-id.");
  return { date: match[1], raceId: match[2] };
}

async function updateQueueJob(options: {
  jobStore: HorseeJobStore;
  id: string;
  update: (job: HorseeJob) => Promise<HorseeJob> | HorseeJob;
}): Promise<HorseeJob> {
  const { date } = parseJobIdentity(options.id);
  for (let attempt = 0; attempt < OPERATION_CAS_ATTEMPTS; attempt += 1) {
    const current = await options.jobStore.getQueue(date);
    const queue = current.value;
    if (!queue?.jobs[options.id]) throw new HorseeOperationError("job_not_found", 404, "The requested job does not exist in hot storage.");
    const job = HorseeJobSchema.parse(await options.update(queue.jobs[options.id]));
    const next = HorseeDailyQueueSchema.parse({
      ...queue,
      updated_at: job.updated_at,
      revision: queue.revision + 1,
      jobs: { ...queue.jobs, [job.id]: job },
    });
    if (await options.jobStore.putQueue(next, current.etag)) return job;
  }
  throw new HorseeOperationError("queue_conflict", 409, "The daily queue changed too many times concurrently.");
}

export async function transitionHorseeJob(options: {
  jobStore: HorseeJobStore;
  resultStore: Pick<CouncilResultStore, "getByDate">;
  id: string;
  target: HorseeJobStatus;
  error?: string | null;
  now?: Date;
}): Promise<HorseeJob> {
  const { date, raceId } = parseJobIdentity(options.id);
  const now = options.now ?? new Date();
  const matchingResult = options.target === "SAVED"
    ? (await options.resultStore.getByDate(date)).find((result) => result.race_id === raceId)
    : undefined;
  if (options.target === "SAVED" && !matchingResult) {
    throw new HorseeOperationError("result_not_found", 409, "SAVED requires a matching validated Council result.");
  }
  return updateQueueJob({
    jobStore: options.jobStore,
    id: options.id,
    update: (job) => {
      if (!canTransitionHorseeJob(job.status, options.target)) {
        throw new HorseeOperationError("invalid_job_transition", 409, `Cannot transition ${job.status} to ${options.target}.`);
      }
      return HorseeJobSchema.parse({
        ...job,
        status: options.target,
        updated_at: now.toISOString(),
        attempts: options.target === "FAILED" ? job.attempts + 1 : job.attempts,
        dispatched_at: options.target === "DISPATCHED" ? now.toISOString() : job.dispatched_at,
        completed_at: options.target === "SAVED" ? matchingResult?.analysed_at : job.completed_at,
        last_error: options.target === "FAILED" ? options.error : undefined,
      });
    },
  });
}

export async function dispatchHorseeJob(options: {
  jobStore: HorseeJobStore;
  dispatcher: HorseeDispatcher;
  id: string;
  now?: Date;
}): Promise<HorseeDispatchResult & { job: HorseeJob }> {
  const { date } = parseJobIdentity(options.id);
  const current = await options.jobStore.getQueue(date);
  const job = current.value?.jobs[options.id];
  if (!job) throw new HorseeOperationError("job_not_found", 404, "The requested job does not exist in hot storage.");
  if (["DISPATCHED", "RUNNING", "SAVED"].includes(job.status)) {
    return {
      accepted: false,
      provider: options.dispatcher.name,
      retryable: false,
      message: "The job has already been handed off or completed.",
      job,
    };
  }
  if (job.status !== "READY") {
    throw new HorseeOperationError("job_not_dispatchable", 409, `A ${job.status} job cannot be dispatched.`);
  }
  const result = await options.dispatcher.dispatch(job);
  if (!result.accepted) return { ...result, job };
  const dispatched = await updateQueueJob({
    jobStore: options.jobStore,
    id: options.id,
    update: (fresh) => {
      if (fresh.status !== "READY") {
        throw new HorseeOperationError("job_not_dispatchable", 409, `A ${fresh.status} job cannot be dispatched.`);
      }
      return HorseeJobSchema.parse({
        ...fresh,
        status: "DISPATCHED",
        dispatched_at: result.dispatched_at,
        updated_at: (options.now ?? new Date()).toISOString(),
      });
    },
  });
  return { ...result, job: dispatched };
}
