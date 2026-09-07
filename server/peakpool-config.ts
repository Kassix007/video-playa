import { z } from "zod";
import type { SmspariazConfig } from "./smspariaz-config.js";

export const DEFAULT_PEAKPOOL_PREPARE_SCOPE = "horsee:peakpool:prepare";
export const DEFAULT_PEAKPOOL_PLACE_SCOPE = "horsee:peakpool:place";

type PeakpoolEnvironment = Readonly<Record<string, string | undefined>>;

const optionalString = z.preprocess(
  (value) => typeof value === "string" && value.trim() === "" ? undefined : value,
  z.string().trim().min(1).optional(),
);

function parseBoolean(value: string | undefined): boolean {
  return value?.trim().toLowerCase() === "true";
}

/**
 * Product-level configuration is deliberately independent of the existing
 * SMSFootball app flag.  In particular, placement requires a second explicit
 * acknowledgement that an owner-authorized virtual-unit verification was
 * completed; a deployment cannot enable it by setting a generic app flag.
 */
export interface PeakpoolConfig {
  readonly configured: boolean;
  readonly unavailableReason?: string;
  readonly enabled: boolean;
  readonly appBetEnabled: boolean;
  readonly verificationAcknowledged: boolean;
  readonly prepareScope: string;
  readonly placeScope: string;
  readonly preparedBetTtlMs: number;
}

export function parsePeakpoolConfig(
  environment: PeakpoolEnvironment = process.env,
  smspariaz: SmspariazConfig,
): PeakpoolConfig {
  const parsed = z.object({
    PEAKPOOL_ENABLED: optionalString,
    PEAKPOOL_APP_BET_ENABLED: optionalString,
    PEAKPOOL_APP_BET_VERIFIED: optionalString,
    HORSEE_OAUTH_PEAKPOOL_PREPARE_SCOPE: optionalString.default(DEFAULT_PEAKPOOL_PREPARE_SCOPE),
    HORSEE_OAUTH_PEAKPOOL_PLACE_SCOPE: optionalString.default(DEFAULT_PEAKPOOL_PLACE_SCOPE),
  }).strict().parse({
    PEAKPOOL_ENABLED: environment.PEAKPOOL_ENABLED,
    PEAKPOOL_APP_BET_ENABLED: environment.PEAKPOOL_APP_BET_ENABLED,
    PEAKPOOL_APP_BET_VERIFIED: environment.PEAKPOOL_APP_BET_VERIFIED,
    HORSEE_OAUTH_PEAKPOOL_PREPARE_SCOPE: environment.HORSEE_OAUTH_PEAKPOOL_PREPARE_SCOPE,
    HORSEE_OAUTH_PEAKPOOL_PLACE_SCOPE: environment.HORSEE_OAUTH_PEAKPOOL_PLACE_SCOPE,
  });

  const enabled = smspariaz.configured && parseBoolean(parsed.PEAKPOOL_ENABLED);
  const verificationAcknowledged = parseBoolean(parsed.PEAKPOOL_APP_BET_VERIFIED);
  const unavailableReason = !smspariaz.configured
    ? smspariaz.unavailableReason ?? "SMSPariaz session storage is not configured."
    : !enabled
      ? "PEAKPOOL_ENABLED must be explicitly true."
      : undefined;

  return {
    configured: unavailableReason === undefined,
    unavailableReason,
    enabled,
    // This second acknowledgement must only be set after the documented,
    // owner-authorized non-cash verification has captured the live request.
    appBetEnabled: unavailableReason === undefined
      && parseBoolean(parsed.PEAKPOOL_APP_BET_ENABLED)
      && verificationAcknowledged,
    verificationAcknowledged,
    prepareScope: parsed.HORSEE_OAUTH_PEAKPOOL_PREPARE_SCOPE,
    placeScope: parsed.HORSEE_OAUTH_PEAKPOOL_PLACE_SCOPE,
    preparedBetTtlMs: smspariaz.preparedBetTtlMs,
  };
}
