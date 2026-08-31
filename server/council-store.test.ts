import assert from "node:assert/strict";
import { mkdtemp, readFile, rm, writeFile } from "node:fs/promises";
import { tmpdir } from "node:os";
import { join } from "node:path";
import { afterEach, describe, it } from "node:test";
import {
  createCouncilDatedHistoryKey,
  createCouncilHistoryKey,
  LocalFileCouncilResultStore,
  PRODUCTION_STORE_NAME,
  deduplicateCouncilResults,
  resolveCouncilStoreName,
} from "./council-store.js";
import { createTestCouncilResult } from "./horsee-test-helpers.js";

const temporaryDirectories: string[] = [];
afterEach(async () => {
  await Promise.all(temporaryDirectories.splice(0).map((path) => rm(path, { recursive: true, force: true })));
});

describe("Netlify Council store namespaces", () => {
  it("keeps one stable namespace across production deployments", () => {
    const first = resolveCouncilStoreName({
      NETLIFY: "true",
      CONTEXT: "production",
      DEPLOY_ID: "deploy-one",
    });
    const second = resolveCouncilStoreName({
      NETLIFY: "true",
      CONTEXT: "production",
      DEPLOY_ID: "deploy-two",
    });

    assert.equal(first, PRODUCTION_STORE_NAME);
    assert.equal(second, PRODUCTION_STORE_NAME);
  });

  it("isolates Deploy Preview data from production and other previews", () => {
    const production = resolveCouncilStoreName({ NETLIFY: "true", CONTEXT: "production" });
    const previewTwo = resolveCouncilStoreName({
      NETLIFY: "true",
      CONTEXT: "deploy-preview",
      REVIEW_ID: "2",
    });
    const previewThree = resolveCouncilStoreName({
      NETLIFY: "true",
      CONTEXT: "deploy-preview",
      REVIEW_ID: "3",
    });

    assert.notEqual(previewTwo, production);
    assert.notEqual(previewThree, production);
    assert.notEqual(previewTwo, previewThree);
    assert.equal(previewTwo, "horsee-council-results-deploy-preview-2");
  });

  it("isolates branch deploys by branch", () => {
    const branchStore = resolveCouncilStoreName({
      NETLIFY: "true",
      CONTEXT: "branch-deploy",
      BRANCH: "feature/HORSEE auth",
    });

    assert.equal(branchStore, "horsee-council-results-branch-feature-horsee-auth");
    assert.notEqual(branchStore, PRODUCTION_STORE_NAME);
  });

  it("creates history keys from server receipt time", () => {
    assert.equal(
      createCouncilHistoryKey(1_776_672_000_000, "event-id"),
      "results/1776672000000-event-id.json",
    );
  });

  it("creates date-partitioned history keys for efficient archive queries", () => {
    assert.equal(
      createCouncilDatedHistoryKey("2026-08-21", 1_776_672_000_000, "event-id"),
      "results/2026-08-21/1776672000000-event-id.json",
    );
  });

  it("deduplicates by Mauritius date and exact race identity using the newest result", () => {
    const older = createTestCouncilResult("R4C5", "2026-08-23T08:00:00.000Z");
    const newer = createTestCouncilResult("R4C5", "2026-08-23T09:00:00.000Z");
    assert.deepEqual(deduplicateCouncilResults([older, newer]), [newer]);
  });

  it("replaces the same race in the canonical local day and keeps caches bounded", async () => {
    const directory = await mkdtemp(join(tmpdir(), "council-store-"));
    temporaryDirectories.push(directory);
    const store = new LocalFileCouncilResultStore(
      join(directory, "results.json"),
      join(directory, "audit.json"),
      2,
    );
    const actor = { clientId: "test-client" };
    await store.save(createTestCouncilResult("R4C5", "2026-08-23T08:00:00.000Z"), actor);
    await store.save(createTestCouncilResult("R4C5", "2026-08-23T09:00:00.000Z"), actor);
    await store.save(createTestCouncilResult("R4C6", "2026-08-23T09:30:00.000Z"), actor);
    await store.save(createTestCouncilResult("R4C7", "2026-08-23T10:00:00.000Z"), actor);
    const day = await store.getByDate("2026-08-23");
    assert.equal(day.length, 3);
    assert.equal(day.find((result) => result.race_id === "R4C5")?.analysed_at, "2026-08-23T09:00:00.000Z");
    assert.equal((await store.getLatest())?.race_id, "R4C7");
    const raw = JSON.parse(await readFile(join(directory, "results.json"), "utf8")) as { recent: unknown[] };
    assert.equal(raw.recent.length, 2);
  });

  it("keeps one current result after 1,000 saves for the same date and race", async () => {
    const directory = await mkdtemp(join(tmpdir(), "council-scale-"));
    temporaryDirectories.push(directory);
    const store = new LocalFileCouncilResultStore(
      join(directory, "results.json"),
      join(directory, "audit.json"),
      100,
    );
    const base = Date.parse("2026-08-23T08:00:00.000Z");
    for (let index = 0; index < 1_000; index += 1) {
      await store.save(
        createTestCouncilResult("R4C5", new Date(base + index * 1_000).toISOString()),
        { clientId: "scale-test" },
      );
    }
    const day = await store.getByDate("2026-08-23");
    assert.equal(day.length, 1);
    assert.equal(day[0]?.analysed_at, new Date(base + 999_000).toISOString());
    assert.equal((await store.getHistory(100)).length, 1);
  });

  it("keeps legacy arrays readable while canonical results take precedence", async () => {
    const directory = await mkdtemp(join(tmpdir(), "council-legacy-"));
    temporaryDirectories.push(directory);
    const filePath = join(directory, "results.json");
    const older = createTestCouncilResult("R1C1", "2026-08-23T08:00:00.000Z");
    await writeFile(filePath, JSON.stringify([older]), "utf8");
    const store = new LocalFileCouncilResultStore(filePath, join(directory, "audit.json"));
    await store.save(createTestCouncilResult("R1C1", "2026-08-23T09:00:00.000Z"), { clientId: "test" });
    assert.deepEqual((await store.getByDate("2026-08-23")).map((result) => result.analysed_at), ["2026-08-23T09:00:00.000Z"]);
    assert.equal((await store.listLegacyEntries()).length, 1);
  });

  it("rejects invalid Council results before touching storage", async () => {
    const directory = await mkdtemp(join(tmpdir(), "council-invalid-"));
    temporaryDirectories.push(directory);
    const store = new LocalFileCouncilResultStore(join(directory, "results.json"), join(directory, "audit.json"));
    const invalid = { ...createTestCouncilResult(), ranking: [] };
    await assert.rejects(() => store.save(invalid as never, { clientId: "test" }));
  });
});
