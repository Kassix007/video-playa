import { WebStandardStreamableHTTPServerTransport } from "@modelcontextprotocol/sdk/server/webStandardStreamableHttp.js";
import type { Config, Context } from "@netlify/functions";
import { randomUUID } from "node:crypto";
import {
  authenticateCouncilRequest,
  CouncilAuthenticationError,
  createCouncilUnauthorizedResponse,
  getCouncilWritePolicy,
  getHorseeAuthScopes,
  resolveCouncilAuthConfig,
} from "../../server/council-auth.js";
import { logCouncilSecurityEvent } from "../../server/council-audit.js";
import { guardCouncilMcpRequest } from "../../server/council-request-security.js";
import { createCouncilRunStatusStore } from "../../server/council-run-status.js";
import { createArchiveAwareCouncilResultStore } from "../../server/council-archive-runtime.js";
import { createHorseeMcpServer } from "../../server/horsee-mcp.js";
import { addHorseeToolSecuritySchemes } from "../../server/horsee-tool-security.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";
import { SmspariazAppBetService } from "../../server/smspariaz-app-bet.js";
import { parseSmspariazConfig } from "../../server/smspariaz-config.js";
import { SmspariazFootballClient } from "../../server/smspariaz-football.js";
import { SmspariazSubsystem } from "../../server/smspariaz-mcp.js";
import { createSmspariazObservability } from "../../server/smspariaz-observability.js";
import { createSmspariazPreparedBetStore } from "../../server/smspariaz-prepared-store.js";
import { SmspariazProviderClient } from "../../server/smspariaz-provider.js";
import { createSmspariazSessionStore } from "../../server/smspariaz-session-store.js";

export const config: Config = {
  path: "/mcp",
  rateLimit: {
    windowLimit: 120,
    windowSize: 60,
    aggregateBy: ["ip", "domain"],
  },
};

export default async function handler(
  incomingRequest: Request,
  context: Context,
): Promise<Response> {
  const requestId = context.requestId || randomUUID();
  const runtimeEnvironment = createCouncilRuntimeEnvironment(context);
  const guardedRequest = await guardCouncilMcpRequest(incomingRequest, runtimeEnvironment);
  if (!guardedRequest.allowed) {
    logCouncilSecurityEvent("mcp_request_denied", {
      request_id: requestId,
      reason: guardedRequest.reason,
      status: guardedRequest.response.status,
    });
    return guardedRequest.response;
  }

  const request = guardedRequest.request;
  const authConfig = resolveCouncilAuthConfig(request.url, runtimeEnvironment);
  let authInfo;

  try {
    authInfo = await authenticateCouncilRequest(request, authConfig);
  } catch (error) {
    const description = error instanceof CouncilAuthenticationError
      ? error.message
      : "The access token could not be verified.";
    const oauthError = error instanceof CouncilAuthenticationError
      ? error.oauthError
      : "invalid_token";
    logCouncilSecurityEvent("mcp_authentication_failed", {
      request_id: requestId,
      reason: oauthError,
    });
    return createCouncilUnauthorizedResponse(authConfig, description, oauthError);
  }

  const writePolicy = getCouncilWritePolicy(authConfig);
  const store = createArchiveAwareCouncilResultStore(runtimeEnvironment);
  const statusStore = createCouncilRunStatusStore(runtimeEnvironment);
  const smspariazConfig = parseSmspariazConfig(runtimeEnvironment);
  let smspariazRuntime;
  if (smspariazConfig.configured) {
    const telemetry = createSmspariazObservability();
    const provider = new SmspariazProviderClient(smspariazConfig, fetch, telemetry);
    const football = new SmspariazFootballClient(provider, telemetry);
    const preparedStore = createSmspariazPreparedBetStore(smspariazConfig, runtimeEnvironment);
    const subsystem = new SmspariazSubsystem(
      smspariazConfig,
      createSmspariazSessionStore(smspariazConfig, runtimeEnvironment),
      provider,
      football,
      new SmspariazAppBetService(smspariazConfig, provider, football, preparedStore, telemetry),
      telemetry,
    );
    smspariazRuntime = {
      subsystem,
      authPolicy: {
        enabled: authConfig.mode !== "disabled",
        resource: authConfig.mode === "disabled" ? undefined : authConfig.resource,
        resourceMetadataUrl: authConfig.resourceMetadataUrl,
        sessionScope: authConfig.smspariazSessionScope,
        appBetScope: authConfig.smspariazAppBetScope,
      },
    };
  }
  const server = createHorseeMcpServer(store, statusStore, writePolicy, { requestId }, smspariazRuntime);
  const transport = new WebStandardStreamableHTTPServerTransport({
    sessionIdGenerator: undefined,
    enableJsonResponse: true,
  });

  try {
    await server.connect(transport);
    const response = await transport.handleRequest(request, { authInfo });
    return await addHorseeToolSecuritySchemes(response, getHorseeAuthScopes(authConfig));
  } finally {
    await server.close();
  }
}
