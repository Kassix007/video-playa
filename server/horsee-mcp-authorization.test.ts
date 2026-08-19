import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { Client } from "@modelcontextprotocol/sdk/client/index.js";
import { InMemoryTransport } from "@modelcontextprotocol/sdk/inMemory.js";
import type { AuthInfo } from "@modelcontextprotocol/sdk/server/auth/types.js";
import type { CouncilWriteActor } from "./council-audit.js";
import type { CouncilWritePolicy } from "./council-auth.js";
import type { CouncilResult } from "./council-schema.js";
import type { CouncilResultStore } from "./council-store.js";
import { createHorseeMcpServer } from "./horsee-mcp.js";

const result: CouncilResult = {
  race_id: "equidia-r1c1",
  racecourse: "Equidia Test",
  race_number: 1,
  off_time: "14:30",
  distance: "1600m",
  surface: "Turf",
  going: "Good",
  race_type: "Flat",
  field_size: 2,
  most_likely_winner: { number: 4, name: "Alpha", probability: 60 },
  principal_danger: { number: 7, name: "Bravo", probability: 40 },
  best_value: { number: 7, name: "Bravo", probability: 40 },
  ranking: [
    { number: 4, name: "Alpha", probability: 60 },
    { number: 7, name: "Bravo", probability: 40 },
  ],
  confidence: "high",
  strongest_loss_reason: "The pace may become tactical.",
  final_selection: "#4 Alpha",
  council_status: "complete",
  analysed_at: "2026-08-20T12:00:00.000Z",
};

const writePolicy: CouncilWritePolicy = {
  enabled: true,
  resource: "https://horsee.example/mcp",
  resourceMetadataUrl: "https://horsee.example/.well-known/oauth-protected-resource",
  writeScope: "horsee:council:write",
};

class RecordingStore implements CouncilResultStore {
  readonly kind = "local-file" as const;
  readonly writes: Array<{ result: CouncilResult; actor: CouncilWriteActor }> = [];

  async save(savedResult: CouncilResult, actor: CouncilWriteActor): Promise<void> {
    this.writes.push({ result: savedResult, actor });
  }

  async getLatest(): Promise<CouncilResult | null> {
    return this.writes.at(-1)?.result ?? null;
  }

  async getHistory(limit: number): Promise<CouncilResult[]> {
    return this.writes.slice(-limit).map((write) => write.result).reverse();
  }
}

async function withClient(
  store: RecordingStore,
  authInfo: AuthInfo | undefined,
  run: (client: Client) => Promise<void>,
): Promise<void> {
  const server = createHorseeMcpServer(store, writePolicy, { requestId: "test-request" });
  const [clientTransport, serverTransport] = InMemoryTransport.createLinkedPair();
  if (authInfo) {
    const send = clientTransport.send.bind(clientTransport);
    clientTransport.send = (message, options) => send(message, { ...options, authInfo });
  }
  const client = new Client({ name: "horsee-security-test", version: "1.0.0" });

  try {
    await server.connect(serverTransport);
    await client.connect(clientTransport);
    await run(client);
  } finally {
    await client.close();
    await server.close();
  }
}

describe("save_council_result authorization boundary", () => {
  it("does not mutate storage for an unauthenticated tool call", async () => {
    const store = new RecordingStore();

    await withClient(store, undefined, async (client) => {
      const response = await client.callTool({ name: "save_council_result", arguments: result });
      assert.equal(response.isError, true);
    });

    assert.equal(store.writes.length, 0);
  });

  it("passes the authenticated client identity to storage", async () => {
    const store = new RecordingStore();
    const authInfo: AuthInfo = {
      token: "not-persisted",
      clientId: "chatgpt-test-client",
      scopes: [writePolicy.writeScope],
      resource: new URL(writePolicy.resource!),
      extra: { subject: "test-subject" },
    };

    await withClient(store, authInfo, async (client) => {
      const response = await client.callTool({ name: "save_council_result", arguments: result });
      assert.notEqual(response.isError, true);
    });

    assert.equal(store.writes.length, 1);
    assert.deepEqual(store.writes[0]?.actor, {
      clientId: "chatgpt-test-client",
      subject: "test-subject",
    });
    assert.equal(JSON.stringify(store.writes).includes("not-persisted"), false);
  });

  it("rejects an invalid result before storage", async () => {
    const store = new RecordingStore();
    const authInfo: AuthInfo = {
      token: "not-persisted",
      clientId: "chatgpt-test-client",
      scopes: [writePolicy.writeScope],
      resource: new URL(writePolicy.resource!),
    };

    await withClient(store, authInfo, async (client) => {
      const response = await client.callTool({
        name: "save_council_result",
        arguments: { ...result, ranking: result.ranking.slice(0, 1) },
      });
      assert.equal(response.isError, true);
    });

    assert.equal(store.writes.length, 0);
  });
});
