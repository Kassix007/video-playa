import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { Client } from "@modelcontextprotocol/sdk/client/index.js";
import { InMemoryTransport } from "@modelcontextprotocol/sdk/inMemory.js";
import type { AuthInfo } from "@modelcontextprotocol/sdk/server/auth/types.js";
import type { CouncilRunStatusStore } from "./council-run-status.js";
import type { CouncilResultStore } from "./council-store.js";
import { createHorseeMcpServer } from "./horsee-mcp.js";
import { decorateHorseeToolSecuritySchemes } from "./horsee-tool-security.js";
import { createTestSmspariazSubsystem } from "./smspariaz-test-helpers.js";

const writePolicy = { enabled: true, resource: "https://horsee.example/mcp", resourceMetadataUrl: "https://horsee.example/.well-known/oauth-protected-resource", writeScope: "horsee:council:write" };
const authPolicy = { enabled: true, resource: writePolicy.resource, resourceMetadataUrl: writePolicy.resourceMetadataUrl, sessionScope: "horsee:smspariaz:session", appBetScope: "horsee:smspariaz:app-bet" };
const resultStore: CouncilResultStore = {
  kind: "local-file", save: async () => undefined, getLatest: async () => null, getHistory: async () => [], getByDate: async () => [], getDateCounts: async () => [],
};
const statusStore: CouncilRunStatusStore = { set: async () => undefined, get: async () => null };

async function withClient(run: (client: Client, setAuth: (auth?: AuthInfo) => void) => Promise<void>) {
  const { subsystem } = createTestSmspariazSubsystem();
  const server = createHorseeMcpServer(resultStore, statusStore, writePolicy, {}, { subsystem, authPolicy });
  const [clientTransport, serverTransport] = InMemoryTransport.createLinkedPair();
  let auth: AuthInfo | undefined;
  const send = clientTransport.send.bind(clientTransport);
  clientTransport.send = (message, options) => send(message, { ...options, authInfo: auth });
  const client = new Client({ name: "smspariaz-test", version: "1" });
  try {
    await server.connect(serverTransport); await client.connect(clientTransport);
    await run(client, (value) => { auth = value; });
  } finally { await client.close(); await server.close(); }
}

function auth(scopes: string[]): AuthInfo {
  return { token: "not-returned", clientId: "test-client", scopes, resource: new URL(writePolicy.resource), extra: { subject: "test-user" } };
}

describe("SMSPariaz MCP programme and preparation", () => {
  it("advertises the eight specified tools with explicit separate security", async () => withClient(async (client) => {
    const listed = await client.listTools();
    decorateHorseeToolSecuritySchemes({ result: listed }, {
      writeScope: writePolicy.writeScope,
      smspariazSessionScope: authPolicy.sessionScope,
      smspariazAppBetScope: authPolicy.appBetScope,
    });
    const smsTools = listed.tools.filter((tool) => tool.name.startsWith("smspariaz_") && tool.name !== "get_smspariaz_daily_racecard");
    assert.deepEqual(smsTools.map((tool) => tool.name), [
      "smspariaz_session_status", "smspariaz_start_login", "smspariaz_confirm_otp", "smspariaz_logout",
      "smspariaz_get_smsfootball", "smspariaz_prepare_app_bet", "smspariaz_place_app_bet", "smspariaz_debug_status",
    ]);
    assert.deepEqual((smsTools.find((tool) => tool.name === "smspariaz_get_smsfootball") as { securitySchemes?: unknown } | undefined)?.securitySchemes, [{ type: "noauth" }]);
    assert.deepEqual((smsTools.find((tool) => tool.name === "smspariaz_place_app_bet") as { securitySchemes?: unknown } | undefined)?.securitySchemes, [{ type: "oauth2", scopes: [authPolicy.appBetScope] }]);
  }));

  it("returns programme publicly and keeps preparation separate from submission", async () => withClient(async (client, setAuth) => {
    const programme = await client.callTool({ name: "smspariaz_get_smsfootball", arguments: {} });
    assert.notEqual(programme.isError, true);
    assert.equal((programme.structuredContent as { events: unknown[] }).events.length, 1);
    setAuth(auth([authPolicy.sessionScope]));
    await client.callTool({ name: "smspariaz_start_login", arguments: { phone: "23050000000" } });
    await client.callTool({ name: "smspariaz_confirm_otp", arguments: { otp: "123456" } });
    const prepared = await client.callTool({
      name: "smspariaz_prepare_app_bet",
      arguments: { stake: 200, selections: [{ event_id: "303589", market: "FTH", selection: "HOME" }] },
    });
    assert.notEqual(prepared.isError, true);
    assert.equal((prepared.structuredContent as { submitted: boolean }).submitted, false);
  }));
});
