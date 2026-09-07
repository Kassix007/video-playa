import { createHash } from "node:crypto";
import { z } from "zod";

export const SMSPARIAZ_PRODUCTION_ORIGIN = "https://www.smspariaz.com";
export const DEFAULT_SMSPARIAZ_SESSION_SCOPE = "horsee:smspariaz:session";
export const DEFAULT_SMSPARIAZ_APP_BET_SCOPE = "horsee:smspariaz:app-bet";

type SmspariazEnvironment = Readonly<Record<string, string | undefined>>;

const optionalString = z.preprocess(
  (value) => typeof value === "string" && value.trim() === "" ? undefined : value,
  z.string().trim().min(1).optional(),
);

function parseBoolean(value: string | undefined): boolean {
  return value?.trim().toLowerCase() === "true";
}

function parseEncryptionKey(value: string | undefined): Buffer | undefined {
  if (!value) return undefined;
  try {
    const bytes = Buffer.from(value.trim(), "base64");
    if (bytes.length !== 32 || bytes.toString("base64") !== value.trim()) return undefined;
    return bytes;
  } catch {
    return undefined;
  }
}

function keyId(key: Buffer): string {
  return createHash("sha256").update(key).digest("hex").slice(0, 16);
}

export interface SmspariazEncryptionKey {
  readonly id: string;
  readonly bytes: Buffer;
}

export interface SmspariazConfig {
  readonly configured: boolean;
  readonly unavailableReason?: string;
  readonly baseUrl: string;
  readonly sessionScope: string;
  readonly appBetScope: string;
  readonly appBetEnabled: boolean;
  readonly currentKey?: SmspariazEncryptionKey;
  readonly previousKey?: SmspariazEncryptionKey;
  readonly requestTimeoutMs: number;
  readonly maxResponseBytes: number;
  readonly pendingLoginTtlMs: number;
  readonly preparedBetTtlMs: number;
}

export function parseSmspariazConfig(
  environment: SmspariazEnvironment = process.env,
): SmspariazConfig {
  const parsed = z.object({
    SMSPARIAZ_BASE_URL: optionalString.default(SMSPARIAZ_PRODUCTION_ORIGIN),
    SMSPARIAZ_SESSION_ENCRYPTION_KEY: optionalString,
    SMSPARIAZ_SESSION_PREVIOUS_ENCRYPTION_KEY: optionalString,
    HORSEE_OAUTH_SMSPARIAZ_SESSION_SCOPE: optionalString.default(DEFAULT_SMSPARIAZ_SESSION_SCOPE),
    HORSEE_OAUTH_SMSPARIAZ_APP_BET_SCOPE: optionalString.default(DEFAULT_SMSPARIAZ_APP_BET_SCOPE),
    SMSPARIAZ_REQUEST_TIMEOUT_MS: z.coerce.number().int().min(1_000).max(30_000).default(10_000),
    SMSPARIAZ_MAX_RESPONSE_BYTES: z.coerce.number().int().min(1_024).max(5_000_000).default(1_000_000),
    SMSPARIAZ_PENDING_LOGIN_TTL_SECONDS: z.coerce.number().int().min(60).max(1_800).default(600),
    SMSPARIAZ_PREPARED_BET_TTL_SECONDS: z.coerce.number().int().min(30).max(600).default(180),
  }).strict().parse({
    SMSPARIAZ_BASE_URL: environment.SMSPARIAZ_BASE_URL,
    SMSPARIAZ_SESSION_ENCRYPTION_KEY: environment.SMSPARIAZ_SESSION_ENCRYPTION_KEY,
    SMSPARIAZ_SESSION_PREVIOUS_ENCRYPTION_KEY: environment.SMSPARIAZ_SESSION_PREVIOUS_ENCRYPTION_KEY,
    HORSEE_OAUTH_SMSPARIAZ_SESSION_SCOPE: environment.HORSEE_OAUTH_SMSPARIAZ_SESSION_SCOPE,
    HORSEE_OAUTH_SMSPARIAZ_APP_BET_SCOPE: environment.HORSEE_OAUTH_SMSPARIAZ_APP_BET_SCOPE,
    SMSPARIAZ_REQUEST_TIMEOUT_MS: environment.SMSPARIAZ_REQUEST_TIMEOUT_MS,
    SMSPARIAZ_MAX_RESPONSE_BYTES: environment.SMSPARIAZ_MAX_RESPONSE_BYTES,
    SMSPARIAZ_PENDING_LOGIN_TTL_SECONDS: environment.SMSPARIAZ_PENDING_LOGIN_TTL_SECONDS,
    SMSPARIAZ_PREPARED_BET_TTL_SECONDS: environment.SMSPARIAZ_PREPARED_BET_TTL_SECONDS,
  });

  let normalizedBaseUrl: string | undefined;
  try {
    const url = new URL(parsed.SMSPARIAZ_BASE_URL);
    if (url.protocol === "https:" && url.username === "" && url.password === ""
      && url.search === "" && url.hash === "" && (url.pathname === "/" || url.pathname === "")) {
      normalizedBaseUrl = url.origin;
    }
  } catch {
    // Returned as safe-disabled below.
  }

  const currentBytes = parseEncryptionKey(parsed.SMSPARIAZ_SESSION_ENCRYPTION_KEY);
  const previousBytes = parseEncryptionKey(parsed.SMSPARIAZ_SESSION_PREVIOUS_ENCRYPTION_KEY);
  const unavailableReason = !normalizedBaseUrl
    ? "SMSPARIAZ_BASE_URL must be an HTTPS origin with no path, query, or credentials."
    : normalizedBaseUrl !== SMSPARIAZ_PRODUCTION_ORIGIN
      ? `SMSPARIAZ_BASE_URL must be exactly ${SMSPARIAZ_PRODUCTION_ORIGIN}.`
      : !currentBytes
      ? "SMSPARIAZ_SESSION_ENCRYPTION_KEY must be a canonical Base64-encoded 32-byte key."
      : undefined;

  return {
    configured: unavailableReason === undefined,
    unavailableReason,
    baseUrl: normalizedBaseUrl ?? SMSPARIAZ_PRODUCTION_ORIGIN,
    sessionScope: parsed.HORSEE_OAUTH_SMSPARIAZ_SESSION_SCOPE,
    appBetScope: parsed.HORSEE_OAUTH_SMSPARIAZ_APP_BET_SCOPE,
    appBetEnabled: unavailableReason === undefined && parseBoolean(environment.SMSPARIAZ_APP_BET_ENABLED),
    currentKey: currentBytes ? { id: keyId(currentBytes), bytes: currentBytes } : undefined,
    previousKey: previousBytes ? { id: keyId(previousBytes), bytes: previousBytes } : undefined,
    requestTimeoutMs: parsed.SMSPARIAZ_REQUEST_TIMEOUT_MS,
    maxResponseBytes: parsed.SMSPARIAZ_MAX_RESPONSE_BYTES,
    pendingLoginTtlMs: parsed.SMSPARIAZ_PENDING_LOGIN_TTL_SECONDS * 1_000,
    preparedBetTtlMs: parsed.SMSPARIAZ_PREPARED_BET_TTL_SECONDS * 1_000,
  };
}
