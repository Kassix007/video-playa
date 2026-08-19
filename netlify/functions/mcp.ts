import { WebStandardStreamableHTTPServerTransport } from "@modelcontextprotocol/sdk/server/webStandardStreamableHttp.js";
import {
  authenticateCouncilRequest,
  CouncilAuthenticationError,
  createCouncilUnauthorizedResponse,
  getCouncilWritePolicy,
  resolveCouncilAuthConfig,
} from "../../server/council-auth.js";
import { createCouncilResultStore } from "../../server/council-store.js";
import { createHorseeMcpServer } from "../../server/horsee-mcp.js";
import { addHorseeToolSecuritySchemes } from "../../server/horsee-tool-security.js";

const store = createCouncilResultStore();

export default async function handler(request: Request): Promise<Response> {
  const authConfig = resolveCouncilAuthConfig(request.url);
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
    return createCouncilUnauthorizedResponse(authConfig, description, oauthError);
  }

  const writePolicy = getCouncilWritePolicy(authConfig);
  const server = createHorseeMcpServer(store, writePolicy);
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
