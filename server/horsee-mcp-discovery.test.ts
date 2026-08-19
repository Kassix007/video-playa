import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { Client } from "@modelcontextprotocol/sdk/client/index.js";
import { InMemoryTransport } from "@modelcontextprotocol/sdk/inMemory.js";
import {
  getCouncilWritePolicy,
  resolveCouncilAuthConfig,
  type CouncilWritePolicy,
} from "./council-auth.js";
import type { CouncilWriteActor } from "./council-audit.js";
import type { CouncilResult } from "./council-schema.js";
import type { CouncilResultStore } from "./council-store.js";
import { createHorseeMcpServer } from "./horsee-mcp.js";
import { decorateHorseeToolSecuritySchemes } from "./horsee-tool-security.js";

const publicToolNames = [
  "open_horsee_council",
  "get_latest_council_result",
  "get_council_history",
] as const;

class ReadOnlyStore implements CouncilResultStore {
  readonly kind = "local-file" as const;

  async save(_result: CouncilResult, _actor: CouncilWriteActor): Promise<void> {
    throw new Error("Discovery tests must not write Council results.");
  }

  async getLatest(): Promise<CouncilResult | null> {
    return null;
  }

  async getHistory(_limit: number): Promise<CouncilResult[]> {
    return [];
  }
}

async function withClient(
  writePolicy: CouncilWritePolicy,
  run: (client: Client) => Promise<void>,
): Promise<void> {
  const server = createHorseeMcpServer(new ReadOnlyStore(), writePolicy);
  const [clientTransport, serverTransport] = InMemoryTransport.createLinkedPair();
  const client = new Client({ name: "horsee-discovery-test", version: "1.0.0" });

  try {
    await server.connect(serverTransport);
    await client.connect(clientTransport);
    await run(client);
  } finally {
    await client.close();
    await server.close();
  }
}

function advertiseTopLevelSecuritySchemes(
  listedTools: Awaited<ReturnType<Client["listTools"]>>,
  writeScope: string,
): void {
  decorateHorseeToolSecuritySchemes({ result: listedTools }, writeScope);
}

function securitySchemes(tool: unknown): unknown {
  return (tool as { securitySchemes?: unknown }).securitySchemes;
}

describe("HORSEE MCP tool discovery", () => {
  it("advertises exactly three noauth tools when OAuth/write policy is disabled", async () => {
    const authConfig = resolveCouncilAuthConfig("https://horsee.example/mcp", {
      NETLIFY: "true",
      CONTEXT: "production",
      HORSEE_OAUTH_ISSUER: "https://identity.example/",
    });
    const writePolicy = getCouncilWritePolicy(authConfig);

    assert.equal(authConfig.mode, "disabled");
    assert.equal(writePolicy.enabled, false);

    await withClient(writePolicy, async (client) => {
      const listed = await client.listTools();
      advertiseTopLevelSecuritySchemes(listed, writePolicy.writeScope);

      assert.deepEqual(listed.tools.map((tool) => tool.name), publicToolNames);
      assert.equal(listed.tools.length, 3);
      for (const tool of listed.tools) {
        assert.deepEqual(securitySchemes(tool), [{ type: "noauth" }]);
        assert.deepEqual(tool._meta?.securitySchemes, [{ type: "noauth" }]);
      }
      assert.equal(listed.tools.some((tool) => tool.name === "save_council_result"), false);
      assert.match(client.getInstructions() ?? "", /publishing is not currently configured/i);
      assert.match(client.getInstructions() ?? "", /do not attempt to call save_council_result/i);
    });
  });

  it("advertises the OAuth write tool only when OAuth is completely configured", async () => {
    const authConfig = resolveCouncilAuthConfig("https://horsee.example/mcp", {
      NETLIFY: "true",
      CONTEXT: "production",
      HORSEE_MCP_RESOURCE: "https://horsee.example/mcp",
      HORSEE_OAUTH_ISSUER: "https://identity.example/",
      HORSEE_OAUTH_JWKS_URI: "https://identity.example/.well-known/jwks.json",
    });
    const writePolicy = getCouncilWritePolicy(authConfig);

    assert.equal(authConfig.mode, "oauth");
    assert.equal(writePolicy.enabled, true);

    await withClient(writePolicy, async (client) => {
      const listed = await client.listTools();
      advertiseTopLevelSecuritySchemes(listed, writePolicy.writeScope);

      assert.deepEqual(listed.tools.map((tool) => tool.name), [
        "open_horsee_council",
        "save_council_result",
        "get_latest_council_result",
        "get_council_history",
      ]);
      assert.equal(listed.tools.length, 4);

      for (const publicToolName of publicToolNames) {
        const publicTool = listed.tools.find((tool) => tool.name === publicToolName);
        assert.deepEqual(securitySchemes(publicTool), [{ type: "noauth" }]);
      }

      const saveTool = listed.tools.find((tool) => tool.name === "save_council_result");
      assert.deepEqual(securitySchemes(saveTool), [{
        type: "oauth2",
        scopes: ["horsee:council:write"],
      }]);
      assert.deepEqual(saveTool?._meta?.securitySchemes, [{
        type: "oauth2",
        scopes: ["horsee:council:write"],
      }]);
      const instructions = client.getInstructions() ?? "";
      const mandatorySequence = [
        "Complete discovery and FACT LOCK",
        "Analyse all runners blind to market",
        "Perform the market audit",
        "Produce the COMPLETE mandatory Council verdict",
        "Construct a schema-valid CouncilResult",
        "CALL save_council_result BEFORE ending the response",
        "Do not end the response after preliminary or blind analysis",
        "If save_council_result fails, explicitly report the tool error",
        "If publishing succeeds, say exactly: \"HORSEE dashboard updated.\"",
      ];
      let previousStepIndex = -1;
      for (const step of mandatorySequence) {
        const stepIndex = instructions.indexOf(step);
        assert.ok(stepIndex > previousStepIndex, `${step} must appear in mandatory order.`);
        previousStepIndex = stepIndex;
      }
      assert.match(instructions, /response is incomplete until save_council_result returns success or its tool error has been explicitly reported/i);
    });
  });
});
