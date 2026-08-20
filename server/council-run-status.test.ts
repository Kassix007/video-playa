import assert from "node:assert/strict";
import { mkdtemp, rm } from "node:fs/promises";
import { tmpdir } from "node:os";
import { join } from "node:path";
import { describe, it } from "node:test";
import {
  COUNCIL_RUN_STAGES,
  CouncilRunStatusSchema,
  createCouncilRunStatusStore,
  resolveCouncilRunStatusStoreName,
  type CouncilRunStatus,
} from "./council-run-status.js";
import { resolveCouncilStoreName } from "./council-store.js";

function statusFor(stage: CouncilRunStatus["stage"], index: number): CouncilRunStatus {
  return {
    command: "R2C5 hard",
    stage,
    message: `Stage transition ${index + 1}`,
    updated_at: `2026-08-20T15:${String(index).padStart(2, "0")}:00.000Z`,
  };
}

describe("Council run status persistence", () => {
  it("uses a separate deploy-isolated namespace from Council results", () => {
    const productionEnvironment = { NETLIFY: "true", CONTEXT: "production" };
    const previewEnvironment = {
      NETLIFY: "true",
      CONTEXT: "deploy-preview",
      REVIEW_ID: "7",
    };

    assert.equal(
      resolveCouncilRunStatusStoreName(productionEnvironment),
      "horsee-council-run-status-production",
    );
    assert.equal(
      resolveCouncilRunStatusStoreName(previewEnvironment),
      "horsee-council-run-status-deploy-preview-7",
    );
    assert.notEqual(
      resolveCouncilRunStatusStoreName(productionEnvironment),
      resolveCouncilStoreName(productionEnvironment),
    );
  });

  it("stores and reads every supported stage as the current ephemeral status", async () => {
    const temporaryDirectory = await mkdtemp(join(tmpdir(), "horsee-run-status-"));
    const filePath = join(temporaryDirectory, "current.json");
    const store = createCouncilRunStatusStore({}, filePath);

    try {
      assert.equal(await store.get(), null);
      for (const [index, stage] of COUNCIL_RUN_STAGES.entries()) {
        const status = statusFor(stage, index);
        await store.set(status);
        assert.deepEqual(await store.get(), status);
      }
    } finally {
      await rm(temporaryDirectory, { recursive: true, force: true });
    }
  });

  it("rejects unbounded or malformed status payloads", () => {
    assert.equal(CouncilRunStatusSchema.safeParse({
      ...statusFor("RECEIVED", 0),
      command: "R".repeat(161),
    }).success, false);
    assert.equal(CouncilRunStatusSchema.safeParse({
      ...statusFor("RECEIVED", 0),
      message: "x".repeat(281),
    }).success, false);
    assert.equal(CouncilRunStatusSchema.safeParse({
      ...statusFor("RECEIVED", 0),
      stage: "UNKNOWN",
    }).success, false);
    assert.equal(CouncilRunStatusSchema.safeParse({
      ...statusFor("RECEIVED", 0),
      updated_at: "not-a-timestamp",
    }).success, false);
  });
});
