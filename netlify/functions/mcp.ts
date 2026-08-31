import { WebStandardStreamableHTTPServerTransport } from "@modelcontextprotocol/sdk/server/webStandardStreamableHttp.js";
import type { Config, Context } from "@netlify/functions";
import { randomUUID } from "node:crypto";
import {
  authenticateCouncilRequest,
  CouncilAuthenticationError,
  createCouncilUnauthorizedResponse,
  getCouncilWritePolicy,
  resolveCouncilAuthConfig,
} from "../../server/council-auth.js";
import { logCouncilSecurityEvent } from "../../server/council-audit.js";
import { guardCouncilMcpRequest } from "../../server/council-request-security.js";
import { createCouncilRunStatusStore } from "../../server/council-run-status.js";
import { createArchiveAwareCouncilResultStore } from "../../server/council-archive-runtime.js";
import { createHorseeMcpServer } from "../../server/horsee-mcp.js";
import { addHorseeToolSecuritySchemes } from "../../server/horsee-tool-security.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";

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
  const server = createHorseeMcpServer(store, statusStore, writePolicy, { requestId });
  const transport = new WebStandardStreamableHTTPServerTransport({
    sessionIdGenerator: undefined,
    enableJsonResponse: true,
  });

  try {
    await server.connect(transport);
    const response = await transport.handleRequest(request, { authInfo });
    return await addHorseeToolSecuritySchemes(response, writePolicy.writeScope);
  } finally {
    await server.close();
  }
}
