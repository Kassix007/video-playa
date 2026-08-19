import { timingSafeEqual } from "node:crypto";
import type { AuthInfo } from "@modelcontextprotocol/sdk/server/auth/types.js";
import { createRemoteJWKSet, jwtVerify, type JWTPayload } from "jose";

export const DEFAULT_COUNCIL_WRITE_SCOPE = "horsee:council:write";

type CouncilAuthEnvironment = Readonly<Record<string, string | undefined>>;

interface BaseCouncilAuthConfig {
  resourceMetadataUrl: string;
  writeScope: string;
}

export interface OAuthCouncilAuthConfig extends BaseCouncilAuthConfig {
  mode: "oauth";
  issuer: string;
  jwksUri: string;
  resource: string;
}

export interface DevelopmentCouncilAuthConfig extends BaseCouncilAuthConfig {
  mode: "development-token";
  developmentToken: string;
  resource: string;
}

export interface DisabledCouncilAuthConfig extends BaseCouncilAuthConfig {
  mode: "disabled";
  reason: string;
}

export type CouncilAuthConfig =
  | OAuthCouncilAuthConfig
  | DevelopmentCouncilAuthConfig
  | DisabledCouncilAuthConfig;

export interface CouncilWritePolicy {
  enabled: boolean;
  resource?: string;
  resourceMetadataUrl: string;
  writeScope: string;
}

export class CouncilAuthenticationError extends Error {
  constructor(
    message: string,
    readonly oauthError: "invalid_token" | "insufficient_scope" = "invalid_token",
  ) {
    super(message);
    this.name = "CouncilAuthenticationError";
  }
}

const jwksByUri = new Map<string, ReturnType<typeof createRemoteJWKSet>>();

function getRemoteJwks(uri: string): ReturnType<typeof createRemoteJWKSet> {
  const cached = jwksByUri.get(uri);
  if (cached) return cached;

  const remoteJwks = createRemoteJWKSet(new URL(uri));
  jwksByUri.set(uri, remoteJwks);
  return remoteJwks;
}

function parseUrl(
  value: string | undefined,
  requireHttps: boolean,
  preserveExactValue = false,
): string | null {
  if (!value) return null;

  try {
    const trimmedValue = value.trim();
    const url = new URL(trimmedValue);
    if (url.hash || (requireHttps && url.protocol !== "https:")) return null;
    return preserveExactValue ? trimmedValue : url.href;
  } catch {
    return null;
  }
}

function valuesMatch(left: string, right: string): boolean {
  const leftBuffer = Buffer.from(left);
  const rightBuffer = Buffer.from(right);
  return leftBuffer.length === rightBuffer.length && timingSafeEqual(leftBuffer, rightBuffer);
}

function getScopes(payload: JWTPayload): string[] {
  const scopeClaim = typeof payload.scope === "string" ? payload.scope.split(/\s+/) : [];
  const scpClaim = Array.isArray(payload.scp)
    ? payload.scp.filter((scope): scope is string => typeof scope === "string")
    : typeof payload.scp === "string"
      ? payload.scp.split(/\s+/)
      : [];

  return [...new Set([...scopeClaim, ...scpClaim].filter(Boolean))];
}

function claimContainsResource(claim: unknown, expectedResource: string): boolean {
  if (typeof claim === "string") return claim === expectedResource;
  return Array.isArray(claim) && claim.some((value) => value === expectedResource);
}

export function resolveCouncilAuthConfig(
  requestUrl: string | URL,
  environment: CouncilAuthEnvironment = process.env,
): CouncilAuthConfig {
  const requestOrigin = new URL(requestUrl).origin;
  const writeScope = environment.HORSEE_OAUTH_WRITE_SCOPE?.trim()
    || DEFAULT_COUNCIL_WRITE_SCOPE;
  const isNetlifyDeployment = environment.NETLIFY === "true" && environment.CONTEXT !== "dev";
  const requireHttps = isNetlifyDeployment;

  const issuer = parseUrl(environment.HORSEE_OAUTH_ISSUER, requireHttps, true);
  const jwksUri = parseUrl(environment.HORSEE_OAUTH_JWKS_URI, requireHttps);
  const resource = parseUrl(environment.HORSEE_MCP_RESOURCE, requireHttps);
  const oauthValuesProvided = Boolean(
    environment.HORSEE_OAUTH_ISSUER
      || environment.HORSEE_OAUTH_JWKS_URI
      || environment.HORSEE_MCP_RESOURCE,
  );

  if (issuer && jwksUri && resource) {
    return {
      mode: "oauth",
      issuer,
      jwksUri,
      resource,
      resourceMetadataUrl: new URL("/.well-known/oauth-protected-resource", resource).href,
      writeScope,
    };
  }

  if (!isNetlifyDeployment && environment.HORSEE_COUNCIL_DEV_WRITE_TOKEN) {
    const developmentResource = resource ?? new URL("/mcp", requestOrigin).href;
    return {
      mode: "development-token",
      developmentToken: environment.HORSEE_COUNCIL_DEV_WRITE_TOKEN,
      resource: developmentResource,
      resourceMetadataUrl: new URL("/.well-known/oauth-protected-resource", requestOrigin).href,
      writeScope,
    };
  }

  return {
    mode: "disabled",
    resourceMetadataUrl: new URL("/.well-known/oauth-protected-resource", requestOrigin).href,
    writeScope,
    reason: oauthValuesProvided
      ? "OAuth configuration is incomplete or contains an invalid URL."
      : "OAuth authorization is not configured for Council writes.",
  };
}

export function getCouncilWritePolicy(config: CouncilAuthConfig): CouncilWritePolicy {
  return {
    enabled: config.mode !== "disabled",
    resource: config.mode === "disabled" ? undefined : config.resource,
    resourceMetadataUrl: config.resourceMetadataUrl,
    writeScope: config.writeScope,
  };
}

export async function authenticateCouncilRequest(
  request: Request,
  config: CouncilAuthConfig,
): Promise<AuthInfo | undefined> {
  const authorization = request.headers.get("authorization");
  if (!authorization) return undefined;

  const match = /^Bearer\s+(.+)$/i.exec(authorization.trim());
  if (!match) {
    throw new CouncilAuthenticationError("Authorization must use a Bearer token.");
  }

  const token = match[1];
  if (config.mode === "disabled") {
    throw new CouncilAuthenticationError(config.reason);
  }

  if (config.mode === "development-token") {
    if (!valuesMatch(token, config.developmentToken)) {
      throw new CouncilAuthenticationError("The development bearer token is invalid.");
    }

    return {
      token,
      clientId: "mcp-inspector-local",
      scopes: [config.writeScope],
      resource: new URL(config.resource),
      extra: { developmentOnly: true },
    };
  }

  try {
    const { payload } = await jwtVerify(token, getRemoteJwks(config.jwksUri), {
      issuer: config.issuer,
    });
    if (typeof payload.exp !== "number") {
      throw new CouncilAuthenticationError("The access token does not contain an expiry.");
    }
    const scopes = getScopes(payload);
    const targetsCouncil = claimContainsResource(payload.aud, config.resource)
      || claimContainsResource(payload.resource, config.resource);

    if (!targetsCouncil) {
      throw new CouncilAuthenticationError("The access token was not issued for this MCP resource.");
    }
    if (!scopes.includes(config.writeScope)) {
      throw new CouncilAuthenticationError(
        "The access token does not grant the Council write scope.",
        "insufficient_scope",
      );
    }

    const clientId = [payload.client_id, payload.azp, payload.sub]
      .find((value): value is string => typeof value === "string")
      ?? "unknown-oauth-client";

    return {
      token,
      clientId,
      scopes,
      expiresAt: payload.exp,
      resource: new URL(config.resource),
      extra: typeof payload.sub === "string" ? { subject: payload.sub } : undefined,
    };
  } catch (error) {
    if (error instanceof CouncilAuthenticationError) throw error;
    throw new CouncilAuthenticationError("The OAuth access token could not be verified.");
  }
}

function escapeChallengeValue(value: string): string {
  return value.replace(/\\/g, "\\\\").replace(/"/g, '\\"');
}

export function createCouncilAuthChallenge(
  policy: CouncilWritePolicy,
  error: "invalid_token" | "insufficient_scope" | "temporarily_unavailable",
  description: string,
): string {
  const parameters = [
    `resource_metadata="${escapeChallengeValue(policy.resourceMetadataUrl)}"`,
    `scope="${escapeChallengeValue(policy.writeScope)}"`,
    `error="${error}"`,
    `error_description="${escapeChallengeValue(description)}"`,
  ];
  return `Bearer ${parameters.join(", ")}`;
}

export function createCouncilUnauthorizedResponse(
  config: CouncilAuthConfig,
  description: string,
  error: "invalid_token" | "insufficient_scope" = "invalid_token",
): Response {
  const policy = getCouncilWritePolicy(config);
  return Response.json(
    { error, error_description: description },
    {
      status: 401,
      headers: {
        "Cache-Control": "no-store",
        "WWW-Authenticate": createCouncilAuthChallenge(policy, error, description),
      },
    },
  );
}

export function getCouncilProtectedResourceMetadata(
  config: CouncilAuthConfig,
): Record<string, unknown> | null {
  if (config.mode !== "oauth") return null;

  return {
    resource: config.resource,
    authorization_servers: [config.issuer],
    scopes_supported: [config.writeScope],
    bearer_methods_supported: ["header"],
  };
}
