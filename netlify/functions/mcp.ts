import { WebStandardStreamableHTTPServerTransport } from "@modelcontextprotocol/sdk/server/webStandardStreamableHttp.js";
import { createCouncilResultStore } from "../../server/council-store.js";
import { createHorseeMcpServer } from "../../server/horsee-mcp.js";

const store = createCouncilResultStore();

export default async function handler(request: Request): Promise<Response> {
  const server = createHorseeMcpServer(store);
  const transport = new WebStandardStreamableHTTPServerTransport({
    sessionIdGenerator: undefined,
    enableJsonResponse: true,
  });

  try {
    await server.connect(transport);
    return await transport.handleRequest(request);
  } finally {
    await server.close();
  }
}
