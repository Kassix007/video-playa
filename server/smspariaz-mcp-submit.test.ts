import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { Client } from "@modelcontextprotocol/sdk/client/index.js";
import { InMemoryTransport } from "@modelcontextprotocol/sdk/inMemory.js";
import type { AuthInfo } from "@modelcontextprotocol/sdk/server/auth/types.js";
import type { CouncilRunStatusStore } from "./council-run-status.js";
import type { CouncilResultStore } from "./council-store.js";
import { createHorseeMcpServer } from "./horsee-mcp.js";
import { createTestSmspariazSubsystem } from "./smspariaz-test-helpers.js";

const resource = "https://horsee.example/mcp";
const writePolicy = { enabled: true, resource, resourceMetadataUrl: "https://horsee.example/.well-known/oauth-protected-resource", writeScope: "horsee:council:write" };
const authPolicy = { enabled: true, resource, resourceMetadataUrl: writePolicy.resourceMetadataUrl, sessionScope: "horsee:smspariaz:session", appBetScope: "horsee:smspariaz:app-bet" };
const resultStore: CouncilResultStore = { kind: "local-file", save: async () => undefined, getLatest: async () => null, getHistory: async () => [], getByDate: async () => [], getDateCounts: async () => [] };
const statusStore: CouncilRunStatusStore = { set: async () => undefined, get: async () => null };
const auth = (scopes: string[]): AuthInfo => ({ token: "not-returned", clientId: "client", scopes, resource: new URL(resource), extra: { subject: "user" } });

describe("SMSPariaz MCP placement authorization", () => {
  it("requires the independent app-bet scope", async () => {
    const { subsystem } = createTestSmspariazSubsystem();
    const server = createHorseeMcpServer(resultStore, statusStore, writePolicy, {}, { subsystem, authPolicy });
    const [clientTransport, serverTransport] = InMemoryTransport.createLinkedPair();
    let authInfo: AuthInfo | undefined = auth([authPolicy.sessionScope]);
    const send = clientTransport.send.bind(clientTransport);
    clientTransport.send = (message, options) => send(message, { ...options, authInfo });
    const client = new Client({ name: "submit-scope-test", version: "1" });
    try {
      await server.connect(serverTransport); await client.connect(clientTransport);
      await client.callTool({ name: "smspariaz_start_login", arguments: { phone: "23050000000" } });
      await client.callTool({ name: "smspariaz_confirm_otp", arguments: { otp: "123456" } });
      const prepared = await client.callTool({ name: "smspariaz_prepare_app_bet", arguments: { stake: 200, selections: [{ event_id: "303589", market: "1", selection: "1" }] } });
      const handle = (prepared.structuredContent as { prepared_bet: string }).prepared_bet;
      const denied = await client.callTool({ name: "smspariaz_place_app_bet", arguments: { prepared_bet: handle, approved: true } });
      assert.equal(denied.isError, true);
      assert.match(String(denied._meta?.["mcp/www_authenticate"]), /insufficient_scope/);
      authInfo = auth([authPolicy.appBetScope]);
      const placed = await client.callTool({ name: "smspariaz_place_app_bet", arguments: { prepared_bet: handle, approved: true } });
      assert.notEqual(placed.isError, true);
      assert.equal((placed.structuredContent as { submitted_via: string }).submitted_via, "smspariaz_app_flow");
    } finally { await client.close(); await server.close(); }
  });
});
