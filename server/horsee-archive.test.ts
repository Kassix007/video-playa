import assert from "node:assert/strict";
import { describe, it } from "node:test";
import type { CouncilResult } from "./council-schema.js";
import type { CouncilArchiveStore, CouncilLegacyEntry } from "./council-store.js";
import type { GitHubArchiveFile, GitHubArchiveReadOptions, GitHubArchiveWriteResult } from "./github-archive-client.js";
import { parseHorseeConfig } from "./horsee-config.js";
import {
  HorseeArchiveService,
  createArchivePaths,
  createCouncilNdjson,
  sha256Content,
} from "./horsee-archive.js";
import { MemoryHorseeJobStore } from "./horsee-job-store.js";
import { createTestCouncilResult, createTestRace, createTestRacecard } from "./horsee-test-helpers.js";

class MemoryCouncilArchiveStore implements CouncilArchiveStore {
  readonly kind = "local-file" as const;
  readonly days = new Map<string, CouncilResult[]>();
  async save(): Promise<void> {}
  async getLatest(): Promise<CouncilResult | null> { return [...this.days.values()].flat().at(-1) ?? null; }
  async getHistory(limit: number): Promise<CouncilResult[]> { return [...this.days.values()].flat().slice(0, limit); }
  async getByDate(date: string): Promise<CouncilResult[]> { return this.days.get(date) ?? []; }
  async getHotByDate(date: string): Promise<CouncilResult[]> { return this.getByDate(date); }
  async getDateCounts(): Promise<Array<{ date: string; count: number }>> { return []; }
  async listHotDates(): Promise<string[]> { return [...this.days.keys()].sort(); }
  async deleteHotDay(date: string): Promise<void> { this.days.delete(date); }
  async listLegacyEntries(): Promise<CouncilLegacyEntry[]> { return []; }
  async deleteLegacyKeys(): Promise<void> {}
  async getMigrationMarker(): Promise<null> { return null; }
  async putMigrationMarker(): Promise<void> {}
}

class MemoryGitHubArchiveClient {
  readonly files = new Map<string, string>();
  changedWrites = 0;
  failPath: string | null = null;
  readonly readOptions: Array<GitHubArchiveReadOptions | undefined> = [];
  key(repository: string, path: string): string { return `${repository}:${path}`; }
  async getFile(repository: string, path: string, options?: GitHubArchiveReadOptions): Promise<GitHubArchiveFile | null> {
    this.readOptions.push(options);
    const content = this.files.get(this.key(repository, path));
    return content === undefined ? null : { path, sha: sha256Content(content), content };
  }
  async upsertFile(repository: string, path: string, content: string): Promise<GitHubArchiveWriteResult> {
    if (this.failPath === path) throw new Error("simulated archive failure");
    const key = this.key(repository, path);
    const existing = this.files.get(key);
    if (existing === content) return { status: "UNCHANGED", repository, path, sha: sha256Content(content) };
    this.files.set(key, content); this.changedWrites += 1;
    return { status: existing === undefined ? "CREATED" : "UPDATED", repository, path, sha: sha256Content(content) };
  }
}

function configured() {
  return parseHorseeConfig({ HORSEE_GITHUB_TOKEN: "test-token" });
}

describe("HORSEE daily archive", () => {
  it("uses unauthenticated reads only for public archive lookup methods", async () => {
    const councilStore = new MemoryCouncilArchiveStore();
    const jobStore = new MemoryHorseeJobStore();
    const github = new MemoryGitHubArchiveClient();
    const service = new HorseeArchiveService({ config: configured(), councilStore, jobStore, github });
    await service.readArchivedDay("2026-08-22");
    await service.readArchiveMonthIndex("2026-08");
    assert.deepEqual(github.readOptions, [{ authenticate: false }, { authenticate: false }]);
  });

  it("generates deterministic NDJSON in meeting then race order", () => {
    const results = [
      createTestCouncilResult("R4C5", "2026-08-22T10:00:00.000Z"),
      createTestCouncilResult("R2C1", "2026-08-22T09:00:00.000Z"),
    ];
    const racecard = createTestRacecard([createTestRace("R4C5"), createTestRace("R2C1")], "2026-08-22");
    const ndjson = createCouncilNdjson(results, racecard);
    assert.deepEqual(ndjson.trim().split("\n").map((line) => JSON.parse(line).race_id), ["R2C1", "R4C5"]);
    assert.equal(sha256Content(ndjson), sha256Content(createCouncilNdjson([...results].reverse(), racecard)));
  });

  it("archives results and exact racecard once, then no-ops nine identical reruns", async () => {
    const councilStore = new MemoryCouncilArchiveStore();
    councilStore.days.set("2026-08-22", [
      createTestCouncilResult("R4C5", "2026-08-22T10:00:00.000Z"),
      createTestCouncilResult("R2C1", "2026-08-22T09:00:00.000Z"),
    ]);
    const jobStore = new MemoryHorseeJobStore();
    await jobStore.putRacecard(createTestRacecard([createTestRace("R4C5"), createTestRace("R2C1")], "2026-08-22"));
    const github = new MemoryGitHubArchiveClient();
    const service = new HorseeArchiveService({
      config: configured(), councilStore, jobStore, github,
      now: () => new Date("2026-08-23T02:30:00.000Z"), log: () => undefined,
    });
    const first = await service.archiveDay("2026-08-22");
    assert.equal(first.status, "ARCHIVED");
    assert.equal(first.unchanged, false);
    assert.equal(github.changedWrites, 3);
    for (let rerun = 0; rerun < 9; rerun += 1) {
      assert.equal((await service.archiveDay("2026-08-22")).unchanged, true);
    }
    assert.equal(github.changedWrites, 3);
    assert.equal((await jobStore.getArchiveDayState("2026-08-22")).value?.status, "ARCHIVED");
    assert.equal(await service.verifyArchive("2026-08-22"), true);
  });

  it("repairs a partial logical batch and preserves hot data on failure", async () => {
    const date = "2026-08-22";
    const councilStore = new MemoryCouncilArchiveStore();
    councilStore.days.set(date, [createTestCouncilResult("R1C1", "2026-08-22T10:00:00.000Z")]);
    const jobStore = new MemoryHorseeJobStore();
    await jobStore.putRacecard(createTestRacecard([createTestRace("R1C1")], date));
    const github = new MemoryGitHubArchiveClient();
    const paths = createArchivePaths(date);
    github.failPath = paths.index;
    const service = new HorseeArchiveService({ config: configured(), councilStore, jobStore, github, now: () => new Date("2026-08-23T02:30:00.000Z"), log: () => undefined });
    await assert.rejects(() => service.archiveDay(date), /simulated archive failure/);
    assert.equal(councilStore.days.has(date), true);
    assert.equal((await jobStore.getArchiveDayState(date)).value?.status, "FAILED");
    github.failPath = null;
    assert.equal((await service.archiveDay(date)).status, "ARCHIVED");
    assert.equal(await service.verifyArchive(date), true);
  });

  it("archives legacy results with a deterministic reconstruction manifest", async () => {
    const councilStore = new MemoryCouncilArchiveStore();
    const jobStore = new MemoryHorseeJobStore();
    const github = new MemoryGitHubArchiveClient();
    const service = new HorseeArchiveService({
      config: configured(), councilStore, jobStore, github,
      now: () => new Date("2026-08-23T02:30:00.000Z"),
    });
    const results = [createTestCouncilResult("R2C1", "2026-08-22T10:00:00.000Z")];
    const first = await service.archiveLegacyDay("2026-08-22", results);
    const second = await service.archiveLegacyDay("2026-08-22", results);
    assert.equal(first.unchanged, false);
    assert.equal(second.unchanged, true);
    assert.equal(github.changedWrites, 3);
    const manifest = github.files.get(`horsee-archive-2026:${createArchivePaths("2026-08-22").racecard}`);
    assert.equal(JSON.parse(manifest ?? "{}").kind, "legacy-reconstruction");
    assert.equal(await service.verifyArchive("2026-08-22"), true);
  });
});
