import { z } from "zod";

type HorseeEnvironment = Readonly<Record<string, string | undefined>>;

const optionalTrimmedString = z.preprocess(
  (value) => typeof value === "string" && value.trim() === "" ? undefined : value,
  z.string().trim().min(1).optional(),
);

const optionalSecret = z.preprocess(
  (value) => typeof value === "string" && value.trim() === "" ? undefined : value,
  z.string().trim().min(8).max(500).optional(),
);

const booleanFromEnvironment = z.preprocess((value) => {
  if (value === undefined || value === "") return false;
  if (typeof value === "boolean") return value;
  if (typeof value === "string") return value.trim().toLowerCase() === "true";
  return value;
}, z.boolean());

const HorseeEnvironmentSchema = z.object({
  HORSEE_GITHUB_ARCHIVE_OWNER: optionalTrimmedString.default("Kassix007"),
  HORSEE_GITHUB_ARCHIVE_PREFIX: optionalTrimmedString.default("horsee-archive-"),
  HORSEE_GITHUB_TOKEN: optionalSecret,
  HORSEE_GITHUB_API_VERSION: optionalTrimmedString.default("2022-11-28"),
  HORSEE_HOT_RETENTION_DAYS: z.coerce.number().int().min(1).max(365).default(14),
  HORSEE_RECENT_RESULT_LIMIT: z.coerce.number().int().min(1).max(1_000).default(100),
  HORSEE_PRIMARY_MIN_MINUTES: z.coerce.number().int().min(1).max(180).default(30),
  HORSEE_PRIMARY_MAX_MINUTES: z.coerce.number().int().min(1).max(180).default(44),
  HORSEE_RECOVERY_MIN_MINUTES: z.coerce.number().int().min(0).max(180).default(15),
  HORSEE_RECOVERY_MAX_MINUTES: z.coerce.number().int().min(0).max(180).default(29),
  HORSEE_ALLOW_LATE_ANALYSIS: booleanFromEnvironment.default(false),
  HORSEE_SCHEDULER_API_KEY: optionalSecret,
  HORSEE_SCHEDULER_LOCK_SECONDS: z.coerce.number().int().min(30).max(900).default(240),
  HORSEE_GITHUB_TIMEOUT_MS: z.coerce.number().int().min(1_000).max(30_000).default(10_000),
  HORSEE_ARCHIVE_BATCH_DAYS: z.coerce.number().int().min(1).max(31).default(3),
}).strict().superRefine((value, context) => {
  if (value.HORSEE_PRIMARY_MIN_MINUTES > value.HORSEE_PRIMARY_MAX_MINUTES) {
    context.addIssue({
      code: "custom",
      path: ["HORSEE_PRIMARY_MIN_MINUTES"],
      message: "Primary minimum must not exceed primary maximum.",
    });
  }
  if (value.HORSEE_RECOVERY_MIN_MINUTES > value.HORSEE_RECOVERY_MAX_MINUTES) {
    context.addIssue({
      code: "custom",
      path: ["HORSEE_RECOVERY_MIN_MINUTES"],
      message: "Recovery minimum must not exceed recovery maximum.",
    });
  }
  if (value.HORSEE_RECOVERY_MAX_MINUTES >= value.HORSEE_PRIMARY_MIN_MINUTES) {
    context.addIssue({
      code: "custom",
      path: ["HORSEE_RECOVERY_MAX_MINUTES"],
      message: "Recovery maximum must be lower than primary minimum.",
    });
  }
});

export interface HorseeConfig {
  archive: {
    owner: string;
    prefix: string;
    token?: string;
    apiVersion: string;
    configured: boolean;
  };
  hotRetentionDays: number;
  recentResultLimit: number;
  primaryWindow: { min: number; max: number };
  recoveryWindow: { min: number; max: number };
  allowLateAnalysis: boolean;
  schedulerApiKey?: string;
  schedulerLockSeconds: number;
  githubTimeoutMs: number;
  archiveBatchDays: number;
}

export function parseHorseeConfig(
  environment: HorseeEnvironment = process.env,
): HorseeConfig {
  const parsed = HorseeEnvironmentSchema.parse({
    HORSEE_GITHUB_ARCHIVE_OWNER: environment.HORSEE_GITHUB_ARCHIVE_OWNER,
    HORSEE_GITHUB_ARCHIVE_PREFIX: environment.HORSEE_GITHUB_ARCHIVE_PREFIX,
    HORSEE_GITHUB_TOKEN: environment.HORSEE_GITHUB_TOKEN,
    HORSEE_GITHUB_API_VERSION: environment.HORSEE_GITHUB_API_VERSION,
    HORSEE_HOT_RETENTION_DAYS: environment.HORSEE_HOT_RETENTION_DAYS,
    HORSEE_RECENT_RESULT_LIMIT: environment.HORSEE_RECENT_RESULT_LIMIT,
    HORSEE_PRIMARY_MIN_MINUTES: environment.HORSEE_PRIMARY_MIN_MINUTES,
    HORSEE_PRIMARY_MAX_MINUTES: environment.HORSEE_PRIMARY_MAX_MINUTES,
    HORSEE_RECOVERY_MIN_MINUTES: environment.HORSEE_RECOVERY_MIN_MINUTES,
    HORSEE_RECOVERY_MAX_MINUTES: environment.HORSEE_RECOVERY_MAX_MINUTES,
    HORSEE_ALLOW_LATE_ANALYSIS: environment.HORSEE_ALLOW_LATE_ANALYSIS,
    HORSEE_SCHEDULER_API_KEY: environment.HORSEE_SCHEDULER_API_KEY,
    HORSEE_SCHEDULER_LOCK_SECONDS: environment.HORSEE_SCHEDULER_LOCK_SECONDS,
    HORSEE_GITHUB_TIMEOUT_MS: environment.HORSEE_GITHUB_TIMEOUT_MS,
    HORSEE_ARCHIVE_BATCH_DAYS: environment.HORSEE_ARCHIVE_BATCH_DAYS,
  });

  return {
    archive: {
      owner: parsed.HORSEE_GITHUB_ARCHIVE_OWNER,
      prefix: parsed.HORSEE_GITHUB_ARCHIVE_PREFIX,
      token: parsed.HORSEE_GITHUB_TOKEN,
      apiVersion: parsed.HORSEE_GITHUB_API_VERSION,
      configured: Boolean(parsed.HORSEE_GITHUB_TOKEN),
    },
    hotRetentionDays: parsed.HORSEE_HOT_RETENTION_DAYS,
    recentResultLimit: parsed.HORSEE_RECENT_RESULT_LIMIT,
    primaryWindow: {
      min: parsed.HORSEE_PRIMARY_MIN_MINUTES,
      max: parsed.HORSEE_PRIMARY_MAX_MINUTES,
    },
    recoveryWindow: {
      min: parsed.HORSEE_RECOVERY_MIN_MINUTES,
      max: parsed.HORSEE_RECOVERY_MAX_MINUTES,
    },
    allowLateAnalysis: parsed.HORSEE_ALLOW_LATE_ANALYSIS,
    schedulerApiKey: parsed.HORSEE_SCHEDULER_API_KEY,
    schedulerLockSeconds: parsed.HORSEE_SCHEDULER_LOCK_SECONDS,
    githubTimeoutMs: parsed.HORSEE_GITHUB_TIMEOUT_MS,
    archiveBatchDays: parsed.HORSEE_ARCHIVE_BATCH_DAYS,
  };
}

export function toPublicHorseeConfig(config: HorseeConfig): Record<string, unknown> {
  return {
    archive: {
      owner: config.archive.owner,
      prefix: config.archive.prefix,
      configured: config.archive.configured,
    },
    hot_retention_days: config.hotRetentionDays,
    recent_result_limit: config.recentResultLimit,
    primary_window: config.primaryWindow,
    recovery_window: config.recoveryWindow,
    allow_late_analysis: config.allowLateAnalysis,
  };
}

