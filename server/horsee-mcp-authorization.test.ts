import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { Client } from "@modelcontextprotocol/sdk/client/index.js";
import { InMemoryTransport } from "@modelcontextprotocol/sdk/inMemory.js";
import type { AuthInfo } from "@modelcontextprotocol/sdk/server/auth/types.js";
import type { CouncilWriteActor } from "./council-audit.js";
import type { CouncilWritePolicy } from "./council-auth.js";
import type {
  CouncilRunStatus,
  CouncilRunStatusStore,
} from "./council-run-status.js";
import type { CouncilResult } from "./council-schema.js";
import type { CouncilResultStore } from "./council-store.js";
import {
  createHorseeMcpServer,
  HORSEE_PRODUCTION_MCP_RESOURCE,
} from "./horsee-mcp.js";

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
  resource: HORSEE_PRODUCTION_MCP_RESOURCE,
  resourceMetadataUrl: "https://videoplaya.kassinathdoss.dev/.well-known/oauth-protected-resource",
  writeScope: "horsee:council:write",
};

const receivedStatus: CouncilRunStatus = {
  command: "R2C5 hard",
  stage: "RECEIVED",
  message: "Command accepted.",
  updated_at: "2026-08-20T15:21:34.000Z",
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

class RecordingRunStatusStore implements CouncilRunStatusStore {
  readonly writes: CouncilRunStatus[] = [];

  async set(status: CouncilRunStatus): Promise<void> {
    this.writes.push(status);
  }

  async get(): Promise<CouncilRunStatus | null> {
    return this.writes.at(-1) ?? null;
  }
}

async function withClient(
  store: RecordingStore,
  authInfo: AuthInfo | undefined,
  run: (client: Client) => Promise<void>,
  statusStore = new RecordingRunStatusStore(),
): Promise<void> {
  const server = createHorseeMcpServer(
    store,
    statusStore,
    writePolicy,
    { requestId: "test-request" },
  );
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

function validAuthInfo(): AuthInfo {
  return {
    token: "not-persisted",
    clientId: "chatgpt-test-client",
    scopes: [writePolicy.writeScope],
    resource: new URL(writePolicy.resource!),
    extra: { subject: "test-subject" },
  };
}

describe("check_council_write_access OAuth diagnostic", () => {
  it("requires OAuth and returns the existing challenge without a token", async () => {
    await withClient(new RecordingStore(), undefined, async (client) => {
      const response = await client.callTool({
        name: "check_council_write_access",
        arguments: {},
      });
      assert.equal(response.isError, true);
      const content = response.content as Array<{ text?: string }>;
      assert.match(content[0]?.text ?? "", /Authentication is required to save a Council result/);
      assert.match(
        String(response._meta?.["mcp/www_authenticate"]),
        /error="invalid_token"/,
      );
    });
  });

  it("returns only the non-sensitive authenticated write-access result", async () => {
    const resultStore = new RecordingStore();
    const statusStore = new RecordingRunStatusStore();
    await withClient(resultStore, validAuthInfo(), async (client) => {
      const response = await client.callTool({
        name: "check_council_write_access",
        arguments: {},
      });
      assert.notEqual(response.isError, true);
      assert.deepEqual(response.content, []);
      assert.deepEqual(response.structuredContent, {
        authenticated: true,
        write_scope: "horsee:council:write",
        resource: HORSEE_PRODUCTION_MCP_RESOURCE,
      });
      const serialized = JSON.stringify(response);
      assert.equal(serialized.includes("not-persisted"), false);
      assert.equal(serialized.includes("test-subject"), false);
    }, statusStore);
    assert.equal(resultStore.writes.length, 0);
    assert.equal(statusStore.writes.length, 0);
  });

  it("rejects auth context without the required scope", async () => {
    const authInfo = { ...validAuthInfo(), scopes: [] };
    await withClient(new RecordingStore(), authInfo, async (client) => {
      const response = await client.callTool({
        name: "check_council_write_access",
        arguments: {},
      });
      assert.equal(response.isError, true);
      assert.match(String(response._meta?.["mcp/www_authenticate"]), /insufficient_scope/);
    });
  });

  it("rejects auth context issued for another resource", async () => {
    const authInfo = {
      ...validAuthInfo(),
      resource: new URL("https://other.example/mcp"),
    };
    await withClient(new RecordingStore(), authInfo, async (client) => {
      const response = await client.callTool({
        name: "check_council_write_access",
        arguments: {},
      });
      assert.equal(response.isError, true);
      assert.match(String(response._meta?.["mcp/www_authenticate"]), /invalid_token/);
    });
  });
});

describe("Council run status isolation", () => {
  it("does not accept an unauthenticated status update", async () => {
    const resultStore = new RecordingStore();
    const statusStore = new RecordingRunStatusStore();

    await withClient(resultStore, undefined, async (client) => {
      const response = await client.callTool({
        name: "update_council_run_status",
        arguments: receivedStatus,
      });
      assert.equal(response.isError, true);
    }, statusStore);

    assert.equal(statusStore.writes.length, 0);
    assert.equal(resultStore.writes.length, 0);
  });

  it("stores and reads stage transitions without modifying the latest verdict", async () => {
    const resultStore = new RecordingStore();
    const statusStore = new RecordingRunStatusStore();
    const transitions: CouncilRunStatus[] = [
      receivedStatus,
      {
        ...receivedStatus,
        stage: "ANALYSING_RUNNERS",
        message: "Council analysts are evaluating every runner.",
        updated_at: "2026-08-20T15:24:00.000Z",
      },
    ];

    await withClient(resultStore, validAuthInfo(), async (client) => {
      for (const status of transitions) {
        const update = await client.callTool({
          name: "update_council_run_status",
          arguments: status,
        });
        assert.notEqual(update.isError, true);
      }

      const latest = await client.callTool({
        name: "get_latest_council_result",
        arguments: {},
      });
      assert.deepEqual(latest.structuredContent, {
        result: null,
        status: transitions[1],
      });
    }, statusStore);

    assert.deepEqual(statusStore.writes, transitions);
    assert.equal(resultStore.writes.length, 0);
  });

  it("keeps save_council_result as the only operation that publishes a verdict", async () => {
    const resultStore = new RecordingStore();
    const statusStore = new RecordingRunStatusStore();

    await withClient(resultStore, validAuthInfo(), async (client) => {
      await client.callTool({ name: "check_council_write_access", arguments: {} });
      await client.callTool({
        name: "update_council_run_status",
        arguments: receivedStatus,
      });
      assert.equal(resultStore.writes.length, 0);

      const save = await client.callTool({
        name: "save_council_result",
        arguments: result,
      });
      assert.notEqual(save.isError, true);
      assert.equal(resultStore.writes.length, 1);
    }, statusStore);
  });
});

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
    const authInfo = validAuthInfo();

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
    const authInfo = validAuthInfo();

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
