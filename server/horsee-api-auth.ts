import { createHash, timingSafeEqual } from "node:crypto";
import {
  authenticateCouncilRequest,
  CouncilAuthenticationError,
  createCouncilUnauthorizedResponse,
  resolveCouncilAuthConfig,
} from "./council-auth.js";
import type { HorseeConfig } from "./horsee-config.js";

type HorseeAuthEnvironment = Readonly<Record<string, string | undefined>>;

function bearerToken(request: Request): string | null {
  const value = request.headers.get("authorization")?.trim();
  if (!value) return null;
  return /^Bearer\s+(.+)$/i.exec(value)?.[1] ?? null;
}

/** Hash both values first so key comparison always uses equal-length buffers. */
export function matchesHorseeSchedulerKey(candidate: string, expected: string): boolean {
  const candidateDigest = createHash("sha256").update(candidate, "utf8").digest();
  const expectedDigest = createHash("sha256").update(expected, "utf8").digest();
  return timingSafeEqual(candidateDigest, expectedDigest);
}

export type HorseeMutationAuthorization =
  | { authorized: true; method: "scheduler-key" | "oauth" }
  | { authorized: false; response: Response };

export async function authorizeHorseeMutation(
  request: Request,
  config: HorseeConfig,
  environment: HorseeAuthEnvironment = process.env,
): Promise<HorseeMutationAuthorization> {
  const token = bearerToken(request);
  if (token && config.schedulerApiKey && matchesHorseeSchedulerKey(token, config.schedulerApiKey)) {
    return { authorized: true, method: "scheduler-key" };
  }

  const authConfig = resolveCouncilAuthConfig(request.url, environment);
  try {
    const authInfo = await authenticateCouncilRequest(request, authConfig);
    if (!authInfo) {
      return {
        authorized: false,
        response: createCouncilUnauthorizedResponse(authConfig, "A valid bearer token is required."),
      };
    }
    return { authorized: true, method: "oauth" };
  } catch (error) {
    const description = error instanceof CouncilAuthenticationError
      ? error.message
      : "The access token could not be verified.";
    const oauthError = error instanceof CouncilAuthenticationError
      ? error.oauthError
      : "invalid_token";
    return {
      authorized: false,
      response: createCouncilUnauthorizedResponse(authConfig, description, oauthError),
    };
  }
}

export function horseeErrorResponse(
  status: number,
  error: string,
  description: string,
): Response {
  const sanitizedDescription = description
    .replace(/Bearer\s+\S+/gi, "Bearer [redacted]")
    .replace(/((?:token|secret|api[_ -]?key))\s*[=:]\s*\S+/gi, "$1=[redacted]")
    .slice(0, 500);
  return Response.json(
    { error, error_description: sanitizedDescription },
    { status, headers: { "Cache-Control": "no-store" } },
  );
}
