import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { Client } from "@modelcontextprotocol/sdk/client/index.js";
import { InMemoryTransport } from "@modelcontextprotocol/sdk/inMemory.js";
import {
  getCouncilWritePolicy,
  resolveCouncilAuthConfig,
  type CouncilWritePolicy,
} from "./council-auth.js";
import type { CouncilResult } from "./council-schema.js";
import type { CouncilResultStore } from "./council-store.js";
import type {
  CouncilRunStatus,
  CouncilRunStatusStore,
} from "./council-run-status.js";
import {
  createHorseeMcpServer,
  getHorseeServerInstructions,
} from "./horsee-mcp.js";
import { decorateHorseeToolSecuritySchemes } from "./horsee-tool-security.js";

const publicToolNames = [
  "open_horsee_council",
  "get_smspariaz_daily_racecard",
  "get_latest_council_result",
  "get_council_history",
] as const;

class ReadOnlyStore implements CouncilResultStore {
  readonly kind = "local-file" as const;

  async save(): Promise<void> {
    throw new Error("Discovery tests must not write Council results.");
  }

  async getLatest(): Promise<CouncilResult | null> {
    return null;
  }

  async getHistory(): Promise<CouncilResult[]> {
    return [];
  }

  async getByDate(): Promise<CouncilResult[]> {
    return [];
  }

  async getDateCounts(): Promise<Array<{ date: string; count: number }>> {
    return [];
  }
}

class ReadOnlyRunStatusStore implements CouncilRunStatusStore {
  async set(): Promise<void> {
    throw new Error("Discovery tests must not update Council run status.");
  }

  async get(): Promise<CouncilRunStatus | null> {
    return null;
  }
}

async function withClient(
  writePolicy: CouncilWritePolicy,
  run: (client: Client) => Promise<void>,
): Promise<void> {
  const server = createHorseeMcpServer(
    new ReadOnlyStore(),
    new ReadOnlyRunStatusStore(),
    writePolicy,
  );
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
  it("persists through race resolution and guards the R2C1 20/08/2026 regression", () => {
    const disabledPolicy = getCouncilWritePolicy(resolveCouncilAuthConfig(
      "https://horsee.example/mcp",
      { NETLIFY: "true", CONTEXT: "production" },
    ));
    const instructions = getHorseeServerInstructions(disabledPolicy);

    assert.match(instructions, /"R2C1 20\/08\/26 hard"/);
    const raceResolutionSequence = [
      "Resolve the DATE explicitly from the command",
      "Resolve the meeting number (R1, R2, and so on) from a CURRENT DAILY RACING PROGRAMME",
      "A fixture calendar proves that a racecourse is scheduled to race; it does not by itself establish the PMU meeting number",
      "Require TWO compatible current sources",
      "If sources conflict, continue searching",
      "RESEARCH PERSISTENCE — AFTER R/C RESOLUTION",
      "If one racecard site is unavailable, do not stop",
      "FACT LOCK FAILED is a LAST RESORT",
    ];
    for (const requirement of raceResolutionSequence) {
      assert.match(instructions, new RegExp(requirement.replace(/[.*+?^${}()|[\]\\]/g, "\\$&"), "i"));
    }

    assert.match(
      instructions,
      /R2 must not be inferred as Senonnes merely from a Senonnes fixture calendar\./,
    );
    assert.match(
      instructions,
      /R2 = Le Lion-d'Angers and C1 = Prix Cocktail Vision \(Prix E\. et L\. de Tredern\), off at 11:21/,
    );
    assert.match(instructions, /never ask the user to supply the racecard unless that web research has genuinely been exhausted/i);
  });

  it("advertises exactly four noauth tools when OAuth/write policy is disabled", async () => {
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
      assert.equal(listed.tools.length, 4);
      for (const tool of listed.tools) {
        assert.deepEqual(securitySchemes(tool), [{ type: "noauth" }]);
        assert.deepEqual(tool._meta?.securitySchemes, [{ type: "noauth" }]);
      }
      assert.equal(listed.tools.some((tool) => tool.name === "save_council_result"), false);
      assert.equal(listed.tools.some((tool) => tool.name === "check_council_write_access"), false);
      assert.equal(listed.tools.some((tool) => tool.name === "update_council_run_status"), false);
      assert.match(client.getInstructions() ?? "", /publishing is not currently configured/i);
      assert.match(client.getInstructions() ?? "", /do not attempt to call save_council_result/i);
    });
  });

  it("advertises privileged OAuth tools only when OAuth is completely configured", async () => {
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
        "check_council_write_access",
        "update_council_run_status",
        "save_council_result",
        "get_smspariaz_daily_racecard",
        "get_latest_council_result",
        "get_council_history",
      ]);
      assert.equal(listed.tools.length, 7);

      for (const publicToolName of publicToolNames) {
        const publicTool = listed.tools.find((tool) => tool.name === publicToolName);
        assert.deepEqual(securitySchemes(publicTool), [{ type: "noauth" }]);
      }

      for (const protectedToolName of [
        "check_council_write_access",
        "update_council_run_status",
        "save_council_result",
      ]) {
        const protectedTool = listed.tools.find((tool) => tool.name === protectedToolName);
        assert.deepEqual(securitySchemes(protectedTool), [{
          type: "oauth2",
          scopes: ["horsee:council:write"],
        }]);
        assert.deepEqual(protectedTool?._meta?.securitySchemes, [{
          type: "oauth2",
          scopes: ["horsee:council:write"],
        }]);
      }
      const instructions = client.getInstructions() ?? "";
      const statusSequence = [
        "call check_council_write_access",
        "stage RECEIVED",
        "Set RESOLVING_RACE",
        "Set FACT_LOCK",
        "Set ANALYSING_RUNNERS",
        "Set MARKET_AUDIT",
        "Set VERDICT_READY",
        "Set SAVING",
        "Set SAVED",
        "Set FAILED",
      ];
      let previousStatusIndex = -1;
      for (const step of statusSequence) {
        const stepIndex = instructions.indexOf(step);
        assert.ok(stepIndex > previousStatusIndex, `${step} must appear in status order.`);
        previousStatusIndex = stepIndex;
      }
      assert.match(instructions, /Do not silently run for minutes without updating the stage/i);
      const mandatorySequence = [
        "Analyse EVERY runner blind to odds",
        "Run the Form Analyst",
        "Run the Conditions Analyst",
        "Run the Handicap Analyst",
        "Run the Improvement Analyst",
        "Run the Reliability Analyst",
        "Apply the contradiction gate to the top three",
        "Only then inspect the market and perform the market audit",
        "Produce the COMPLETE mandatory Council verdict",
        "Construct a schema-valid CouncilResult",
        "CALL save_council_result BEFORE ending the response",
        "Do not finish until saving succeeds or an actual save tool error is explicitly reported",
      ];
      let previousStepIndex = -1;
      for (const step of mandatorySequence) {
        const stepIndex = instructions.indexOf(step);
        assert.ok(stepIndex > previousStepIndex, `${step} must appear in mandatory order.`);
        previousStepIndex = stepIndex;
      }
      assert.match(instructions, /If save_council_result fails, explicitly report the tool error/i);
      assert.match(instructions, /If publishing succeeds, say exactly: "HORSEE dashboard updated\."/i);
      assert.match(instructions, /response is incomplete until save_council_result returns success or its tool error has been explicitly reported/i);
    });
  });
});
