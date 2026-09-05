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

const resource = "https://horsee.example/mcp";
const writePolicy = { enabled: true, resource, resourceMetadataUrl: "https://horsee.example/.well-known/oauth-protected-resource", writeScope: "horsee:council:write" };
const authPolicy = {
  enabled: true,
  resource,
  resourceMetadataUrl: writePolicy.resourceMetadataUrl,
  sessionScope: "horsee:smspariaz:session",
  appBetScope: "horsee:smspariaz:app-bet",
  peakpoolPrepareScope: "horsee:peakpool:prepare",
  peakpoolPlaceScope: "horsee:peakpool:place",
};
const resultStore: CouncilResultStore = { kind: "local-file", save: async () => undefined, getLatest: async () => null, getHistory: async () => [], getByDate: async () => [], getDateCounts: async () => [] };
const statusStore: CouncilRunStatusStore = { set: async () => undefined, get: async () => null };
const auth = (scopes: string[]): AuthInfo => ({ token: "not-returned", clientId: "peakpool-client", scopes, resource: new URL(resource), extra: { subject: "peakpool-user" } });

async function withClient(run: (client: Client, setAuth: (authInfo?: AuthInfo) => void) => Promise<void>): Promise<void> {
  const { subsystem } = createTestSmspariazSubsystem({ peakpool: true });
  const server = createHorseeMcpServer(resultStore, statusStore, writePolicy, {}, { subsystem, authPolicy });
  const [clientTransport, serverTransport] = InMemoryTransport.createLinkedPair();
  let authInfo: AuthInfo | undefined;
  const send = clientTransport.send.bind(clientTransport);
  clientTransport.send = (message, options) => send(message, { ...options, authInfo });
  const client = new Client({ name: "peakpool-mcp-test", version: "1" });
  try {
    await server.connect(serverTransport);
    await client.connect(clientTransport);
    await run(client, (value) => { authInfo = value; });
  } finally {
    await client.close();
    await server.close();
  }
}

describe("Peakpool MCP", () => {
  it("discovers the isolated public, prepare, place, and diagnostic tools with distinct scopes", async () => withClient(async (client) => {
    const listed = await client.listTools();
    decorateHorseeToolSecuritySchemes({ result: listed }, {
      writeScope: writePolicy.writeScope,
      smspariazSessionScope: authPolicy.sessionScope,
      smspariazAppBetScope: authPolicy.appBetScope,
      peakpoolPrepareScope: authPolicy.peakpoolPrepareScope,
      peakpoolPlaceScope: authPolicy.peakpoolPlaceScope,
    });
    const names = listed.tools.map((tool) => tool.name);
    assert.ok(names.includes("smspariaz_get_peakpool"));
    assert.ok(names.includes("smspariaz_prepare_peakpool_app_bet"));
    assert.ok(names.includes("smspariaz_place_peakpool_app_bet"));
    assert.ok(names.includes("smspariaz_debug_peakpool_status"));
    const find = (name: string) => listed.tools.find((tool) => tool.name === name) as { securitySchemes?: unknown };
    assert.deepEqual(find("smspariaz_get_peakpool").securitySchemes, [{ type: "noauth" }]);
    assert.deepEqual(find("smspariaz_prepare_peakpool_app_bet").securitySchemes, [{ type: "oauth2", scopes: [authPolicy.peakpoolPrepareScope] }]);
    assert.deepEqual(find("smspariaz_place_peakpool_app_bet").securitySchemes, [{ type: "oauth2", scopes: [authPolicy.peakpoolPlaceScope] }]);
  }));

  it("keeps programme read-only and enforces separate session, prepare, and explicit place authority", async () => withClient(async (client, setAuth) => {
    const programme = await client.callTool({ name: "smspariaz_get_peakpool", arguments: {} });
    assert.notEqual(programme.isError, true);
    assert.equal((programme.structuredContent as { races: unknown[] }).races.length, 2);

    setAuth(auth([authPolicy.sessionScope]));
    await client.callTool({ name: "smspariaz_start_login", arguments: { phone: "23050000000" } });
    await client.callTool({ name: "smspariaz_confirm_otp", arguments: { otp: "123456" } });
    const deniedPrepare = await client.callTool({
      name: "smspariaz_prepare_peakpool_app_bet",
      arguments: { unit_stake: 200, selection: { meeting_number: "3", race_number: "1", runner_number: "1", bet_type: "place" } },
    });
    assert.equal(deniedPrepare.isError, true);
    assert.match(String(deniedPrepare._meta?.["mcp/www_authenticate"]), /insufficient_scope/);

    setAuth(auth([authPolicy.peakpoolPrepareScope]));
    const prepared = await client.callTool({
      name: "smspariaz_prepare_peakpool_app_bet",
      arguments: { unit_stake: 200, selection: { meeting_number: "3", race_number: "1", runner_number: "1", bet_type: "place" } },
    });
    assert.notEqual(prepared.isError, true);
    assert.equal((prepared.structuredContent as { submitted: boolean }).submitted, false);
    const handle = (prepared.structuredContent as { prepared_bet: string }).prepared_bet;

    const deniedPlace = await client.callTool({ name: "smspariaz_place_peakpool_app_bet", arguments: { prepared_bet: handle, approved: true } });
    assert.equal(deniedPlace.isError, true);
    assert.match(String(deniedPlace._meta?.["mcp/www_authenticate"]), /insufficient_scope/);

    setAuth(auth([authPolicy.peakpoolPlaceScope]));
    const placed = await client.callTool({ name: "smspariaz_place_peakpool_app_bet", arguments: { prepared_bet: handle, approved: true } });
    assert.notEqual(placed.isError, true);
    assert.equal((placed.structuredContent as { submitted_via: string }).submitted_via, "smspariaz_peakpool_app_flow");
  }));
});
