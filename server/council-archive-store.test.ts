import assert from "node:assert/strict";
import { describe, it } from "node:test";
import type { CouncilArchiveStore } from "./council-store.js";
import { ArchiveAwareCouncilResultStore } from "./council-archive-store.js";
import { createTestCouncilResult } from "./horsee-test-helpers.js";

function hotStore(overrides: Partial<CouncilArchiveStore> = {}): CouncilArchiveStore {
  return {
    kind: "local-file",
    save: async () => undefined,
    getLatest: async () => null,
    getHistory: async () => [],
    getByDate: async () => [],
    getHotByDate: async () => [],
    getDateCounts: async () => [],
    listHotDates: async () => [],
    deleteHotDay: async () => undefined,
    listLegacyEntries: async () => [],
    deleteLegacyKeys: async () => undefined,
    getMigrationMarker: async () => null,
    putMigrationMarker: async () => undefined,
    ...overrides,
  };
}

describe("archive-aware Council compatibility reads", () => {
  it("falls back to archived NDJSON for an old cleaned date", async () => {
    const archived = createTestCouncilResult("R1C1", "2026-08-01T10:00:00.000Z");
    const store = new ArchiveAwareCouncilResultStore(hotStore(), {
      readArchivedDay: async () => [archived],
      readArchiveMonthIndex: async () => null,
    }, { now: () => new Date("2026-08-23T00:00:00Z") });
    assert.deepEqual(await store.getByDate("2026-08-01"), [archived]);
  });

  it("uses hot corrected dates over archive data and avoids double counts", async () => {
    const hot = createTestCouncilResult("R1C1", "2026-08-01T11:00:00.000Z");
    const store = new ArchiveAwareCouncilResultStore(hotStore({
      getByDate: async () => [hot],
      getDateCounts: async () => [{ date: "2026-08-01", count: 1 }],
    }), {
      readArchivedDay: async () => [createTestCouncilResult("R1C1", "2026-08-01T10:00:00.000Z")],
      readArchiveMonthIndex: async () => ({ days: {
        "2026-08-01": { completed_count: 5 },
        "2026-08-02": { completed_count: 3 },
      } }),
    }, { now: () => new Date("2026-08-23T00:00:00Z") });
    assert.deepEqual(await store.getByDate("2026-08-01"), [hot]);
    assert.deepEqual(await store.getDateCounts("2026-08"), [
      { date: "2026-08-01", count: 1 },
      { date: "2026-08-02", count: 3 },
    ]);
  });

  it("degrades to hot reads when the archive is unavailable", async () => {
    const store = new ArchiveAwareCouncilResultStore(hotStore(), {
      readArchivedDay: async () => { throw new Error("offline"); },
      readArchiveMonthIndex: async () => { throw new Error("offline"); },
    }, { now: () => new Date("2026-08-23T00:00:00Z") });
    assert.deepEqual(await store.getByDate("2026-08-01"), []);
    assert.deepEqual(await store.getDateCounts("2026-08"), []);
  });
});
