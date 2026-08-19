export const MAX_COUNCIL_REQUEST_BYTES = 256 * 1024;

type CouncilRequestEnvironment = Readonly<Record<string, string | undefined>>;

export type CouncilRequestGuardResult =
  | { allowed: true; request: Request }
  | { allowed: false; response: Response; reason: string };

function parseOrigin(value: string | undefined): string | null {
  if (!value) return null;

  try {
    const url = new URL(value.trim());
    if (!url.hostname || !["http:", "https:"].includes(url.protocol)) return null;
    return url.origin;
  } catch {
    return null;
  }
}

function isLocalOrigin(origin: string): boolean {
  const hostname = new URL(origin).hostname;
  return hostname === "localhost" || hostname === "127.0.0.1" || hostname === "[::1]";
}

function netlifySiteSlug(environment: CouncilRequestEnvironment): string | null {
  const configuredSlug = environment.HORSEE_NETLIFY_SITE_NAME?.trim().toLowerCase();
  if (configuredSlug && /^[a-z0-9-]+$/.test(configuredSlug)) return configuredSlug;

  const productionOrigin = parseOrigin(environment.URL);
  if (!productionOrigin) return null;
  const hostname = new URL(productionOrigin).hostname.toLowerCase();
  const suffix = ".netlify.app";
  if (!hostname.endsWith(suffix)) return null;
  return hostname.slice(0, -suffix.length) || null;
}

function isExpectedNetlifyDeployOrigin(
  origin: string,
  environment: CouncilRequestEnvironment,
): boolean {
  if (environment.NETLIFY !== "true") return false;
  const url = new URL(origin);
  if (url.protocol !== "https:") return false;

  const siteSlug = netlifySiteSlug(environment);
  if (!siteSlug) return false;
  const deploySuffix = `--${siteSlug}.netlify.app`;
  if (!url.hostname.endsWith(deploySuffix)) return false;
  const deployPrefix = url.hostname.slice(0, -deploySuffix.length);

  if (environment.CONTEXT === "deploy-preview") {
    const reviewId = environment.REVIEW_ID?.trim();
    return reviewId && /^\d+$/.test(reviewId)
      ? deployPrefix === `deploy-preview-${reviewId}`
      : /^deploy-preview-\d+$/.test(deployPrefix);
  }

  return environment.CONTEXT === "branch-deploy"
    && /^[a-z0-9][a-z0-9-]{0,62}$/.test(deployPrefix);
}

export function resolveAllowedCouncilOrigins(
  environment: CouncilRequestEnvironment = process.env,
): Set<string> {
  const candidates = [
    environment.HORSEE_MCP_RESOURCE,
    environment.URL,
    environment.DEPLOY_PRIME_URL,
    environment.DEPLOY_URL,
    ...(environment.HORSEE_ALLOWED_ORIGINS?.split(",") ?? []),
  ];

  return new Set(candidates.flatMap((candidate) => {
    const origin = parseOrigin(candidate);
    return origin ? [origin] : [];
  }));
}

function denied(status: number, reason: string, message: string): CouncilRequestGuardResult {
  return {
    allowed: false,
    reason,
    response: Response.json(
      { error: reason, error_description: message },
      { status, headers: { "Cache-Control": "no-store" } },
    ),
  };
}

function validateRequestSource(
  request: Request,
  environment: CouncilRequestEnvironment,
): CouncilRequestGuardResult | null {
  const requestUrl = new URL(request.url);
  const allowedOrigins = resolveAllowedCouncilOrigins(environment);
  const isLocalDevelopment = environment.NETLIFY !== "true" || environment.CONTEXT === "dev";
  if (isLocalDevelopment && isLocalOrigin(requestUrl.origin)) {
    allowedOrigins.add(requestUrl.origin);
  }
  if (isExpectedNetlifyDeployOrigin(requestUrl.origin, environment)) {
    allowedOrigins.add(requestUrl.origin);
  }

  if (!allowedOrigins.has(requestUrl.origin)) {
    return denied(403, "untrusted_host", "The request host is not configured for this MCP resource.");
  }

  const hostHeader = request.headers.get("host");
  if (hostHeader && hostHeader.toLowerCase() !== requestUrl.host.toLowerCase()) {
    return denied(403, "untrusted_host", "The Host header does not match the MCP request URL.");
  }

  const originHeader = request.headers.get("origin");
  if (originHeader) {
    const origin = parseOrigin(originHeader);
    if (!origin || !allowedOrigins.has(origin)) {
      return denied(403, "untrusted_origin", "The request Origin is not allowed for this MCP resource.");
    }
  }

  return null;
}

async function readBoundedRequest(request: Request): Promise<CouncilRequestGuardResult> {
  const contentLength = request.headers.get("content-length");
  if (contentLength && !/^\d+$/.test(contentLength)) {
    return denied(400, "invalid_content_length", "Content-Length must be a non-negative integer.");
  }
  if (contentLength && Number(contentLength) > MAX_COUNCIL_REQUEST_BYTES) {
    return denied(413, "request_too_large", "The MCP request body exceeds 256 KiB.");
  }
  if (!request.body) return { allowed: true, request };

  const reader = request.body.getReader();
  const chunks: Uint8Array[] = [];
  let byteLength = 0;

  while (true) {
    const { done, value } = await reader.read();
    if (done) break;
    byteLength += value.byteLength;
    if (byteLength > MAX_COUNCIL_REQUEST_BYTES) {
      await reader.cancel();
      return denied(413, "request_too_large", "The MCP request body exceeds 256 KiB.");
    }
    chunks.push(value);
  }

  const body = new Uint8Array(byteLength);
  let offset = 0;
  for (const chunk of chunks) {
    body.set(chunk, offset);
    offset += chunk.byteLength;
  }

  const headers = new Headers(request.headers);
  headers.set("content-length", String(byteLength));
  const boundedRequest = new Request(request.url, {
    method: request.method,
    headers,
    body,
    redirect: request.redirect,
    signal: request.signal,
  });
  return { allowed: true, request: boundedRequest };
}

export async function guardCouncilMcpRequest(
  request: Request,
  environment: CouncilRequestEnvironment = process.env,
): Promise<CouncilRequestGuardResult> {
  const sourceFailure = validateRequestSource(request, environment);
  if (sourceFailure) return sourceFailure;
  return readBoundedRequest(request);
}
