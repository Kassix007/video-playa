import { z } from "zod";
import { isCouncilHistoryDate } from "./council-history.js";

const ProgrammeDateSchema = z.string().refine(isCouncilHistoryDate, "Date must be valid YYYY-MM-DD.");
const IsoTimestampSchema = z.string().min(1).max(50).refine(
  (value) => Number.isFinite(Date.parse(value)),
  "Timestamp must be valid ISO 8601.",
);

export const HorseeJobStatusSchema = z.enum([
  "PENDING",
  "READY",
  "DISPATCHED",
  "RUNNING",
  "SAVED",
  "FAILED",
  "MISSED",
]);
export const HorseeJobModeSchema = z.enum(["PRIMARY", "RECOVERY"]);
export const HorseeSourceChangeFieldSchema = z.enum([
  "MEETING_NUMBER",
  "RACE_NUMBER",
  "RACECOURSE",
  "OFF_TIME",
  "RESTORED",
  "REMOVED",
]);

export function createHorseeJobId(programmeDate: string, raceId: string): string {
  if (!isCouncilHistoryDate(programmeDate)) throw new TypeError("Invalid HORSEE programme date.");
  if (!raceId.trim() || raceId.length > 160) throw new TypeError("Invalid HORSEE race ID.");
  return `${programmeDate}:${raceId}`;
}

export const HorseeJobSchema = z.object({
  id: z.string().min(3).max(200),
  programme_date: ProgrammeDateSchema,
  race_id: z.string().trim().min(1).max(160),
  meeting_number: z.number().int().positive().max(999),
  race_number: z.number().int().positive().max(999),
  racecourse: z.string().trim().min(1).max(160),
  off_time_mauritius: z.string().regex(/^\d{2}:\d{2}$/),
  created_at: IsoTimestampSchema,
  updated_at: IsoTimestampSchema,
  status: HorseeJobStatusSchema,
  mode: HorseeJobModeSchema.nullable(),
  source_status: z.enum(["ACTIVE", "REMOVED"]),
  source_revision: z.number().int().nonnegative().max(10_000).default(0),
  source_changed_at: IsoTimestampSchema.optional(),
  source_change_fields: z.array(HorseeSourceChangeFieldSchema).min(1).max(6).optional(),
  attempts: z.number().int().nonnegative().max(10_000),
  prompt: z.string().min(1).max(20_000).optional(),
  dispatched_at: IsoTimestampSchema.optional(),
  completed_at: IsoTimestampSchema.optional(),
  last_error: z.string().trim().min(1).max(1_000).optional(),
}).strict().superRefine((job, context) => {
  if (job.id !== `${job.programme_date}:${job.race_id}`) {
    context.addIssue({ code: "custom", path: ["id"], message: "Job ID must match programme date and race ID." });
  }
  if (["READY", "DISPATCHED", "RUNNING"].includes(job.status) && !job.prompt) {
    context.addIssue({ code: "custom", path: ["prompt"], message: "Active jobs require a prompt." });
  }
  if (job.status === "FAILED" && !job.last_error) {
    context.addIssue({ code: "custom", path: ["last_error"], message: "Failed jobs require a last error." });
  }
  if (Boolean(job.source_changed_at) !== Boolean(job.source_change_fields)) {
    context.addIssue({ code: "custom", path: ["source_changed_at"], message: "Source change time and fields must be recorded together." });
  }
  if (job.source_change_fields && job.source_revision === 0) {
    context.addIssue({ code: "custom", path: ["source_revision"], message: "Source changes require a positive source revision." });
  }
});

export type HorseeJobStatus = z.infer<typeof HorseeJobStatusSchema>;
export type HorseeJobMode = z.infer<typeof HorseeJobModeSchema>;
export type HorseeSourceChangeField = z.infer<typeof HorseeSourceChangeFieldSchema>;
export type HorseeJob = z.infer<typeof HorseeJobSchema>;

export const HorseeDailyQueueSchema = z.object({
  programme_date: ProgrammeDateSchema,
  timezone: z.literal("Indian/Mauritius"),
  source: z.url(),
  programme_fetched_at: IsoTimestampSchema,
  created_at: IsoTimestampSchema,
  updated_at: IsoTimestampSchema,
  revision: z.number().int().nonnegative(),
  jobs: z.record(z.string(), HorseeJobSchema),
}).strict().superRefine((queue, context) => {
  for (const [key, job] of Object.entries(queue.jobs)) {
    if (key !== job.id) context.addIssue({ code: "custom", path: ["jobs", key], message: "Queue key must match job ID." });
    if (job.programme_date !== queue.programme_date) context.addIssue({ code: "custom", path: ["jobs", key, "programme_date"], message: "Job date must match queue date." });
  }
});
export type HorseeDailyQueue = z.infer<typeof HorseeDailyQueueSchema>;

export const HorseeSchedulerStateSchema = z.object({
  current_programme_date: ProgrammeDateSchema.nullable(),
  last_run_at: IsoTimestampSchema.nullable(),
  last_success_at: IsoTimestampSchema.nullable(),
  last_error_at: IsoTimestampSchema.nullable(),
  last_error: z.string().max(1_000).nullable(),
  last_programme_race_count: z.number().int().nonnegative(),
  updated_at: IsoTimestampSchema,
}).strict();
export type HorseeSchedulerState = z.infer<typeof HorseeSchedulerStateSchema>;

export const HorseeOperationalLeaseSchema = z.object({
  owner: z.uuid(),
  purpose: z.enum(["SCHEDULER", "ARCHIVE", "CLEANUP", "MIGRATION"]),
  acquired_at: IsoTimestampSchema,
  expires_at: IsoTimestampSchema,
}).strict().refine((lease) => Date.parse(lease.expires_at) > Date.parse(lease.acquired_at), {
  message: "Lease expiry must follow acquisition.",
  path: ["expires_at"],
});
export type HorseeOperationalLease = z.infer<typeof HorseeOperationalLeaseSchema>;

export const HorseeArchiveDayStateSchema = z.object({
  date: ProgrammeDateSchema,
  status: z.enum(["PENDING", "ARCHIVING", "ARCHIVED", "FAILED"]),
  repo: z.string().min(3).max(200),
  result_path: z.string().min(1).max(600).optional(),
  racecard_path: z.string().min(1).max(600).optional(),
  index_path: z.string().min(1).max(600).optional(),
  started_at: IsoTimestampSchema.optional(),
  archived_at: IsoTimestampSchema.optional(),
  result_count: z.number().int().nonnegative().optional(),
  race_count: z.number().int().nonnegative().optional(),
  content_hash: z.string().regex(/^[a-f0-9]{64}$/).optional(),
  last_error: z.string().trim().min(1).max(1_000).optional(),
  attempts: z.number().int().nonnegative(),
}).strict().superRefine((state, context) => {
  if (state.status === "ARCHIVED" && (!state.archived_at || !state.content_hash)) {
    context.addIssue({ code: "custom", path: ["status"], message: "Archived state requires time and content hash." });
  }
  if (state.status === "FAILED" && !state.last_error) {
    context.addIssue({ code: "custom", path: ["last_error"], message: "Failed archive state requires an error." });
  }
});
export type HorseeArchiveDayState = z.infer<typeof HorseeArchiveDayStateSchema>;

export const HorseeArchiveIndexDaySchema = z.object({
  race_count: z.number().int().nonnegative(),
  completed_count: z.number().int().nonnegative(),
  archive_file: z.string().min(1).max(600),
  racecard_file: z.string().min(1).max(600),
  content_hash: z.string().regex(/^[a-f0-9]{64}$/),
  archived_at: IsoTimestampSchema,
}).strict();

export const HorseeArchiveIndexSchema = z.object({
  year: z.number().int().min(2000).max(9999),
  month: z.number().int().min(1).max(12),
  days: z.record(ProgrammeDateSchema, HorseeArchiveIndexDaySchema),
}).strict().superRefine((index, context) => {
  const prefix = `${index.year}-${String(index.month).padStart(2, "0")}-`;
  for (const date of Object.keys(index.days)) {
    if (!date.startsWith(prefix)) context.addIssue({ code: "custom", path: ["days", date], message: "Index date must belong to its month." });
  }
});
export type HorseeArchiveIndex = z.infer<typeof HorseeArchiveIndexSchema>;

const TRANSITIONS: Record<HorseeJobStatus, ReadonlySet<HorseeJobStatus>> = {
  PENDING: new Set(["PENDING", "READY", "MISSED", "SAVED"]),
  READY: new Set(["READY", "DISPATCHED", "FAILED", "SAVED"]),
  DISPATCHED: new Set(["DISPATCHED", "RUNNING", "FAILED", "SAVED"]),
  RUNNING: new Set(["RUNNING", "FAILED", "SAVED"]),
  SAVED: new Set(["SAVED"]),
  FAILED: new Set(["FAILED", "READY", "MISSED", "SAVED"]),
  MISSED: new Set(["MISSED", "READY", "SAVED"]),
};

export function canTransitionHorseeJob(from: HorseeJobStatus, to: HorseeJobStatus): boolean {
  return TRANSITIONS[from].has(to);
}
