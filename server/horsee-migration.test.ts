import assert from "node:assert/strict";
import { describe, it } from "node:test";
import type { CouncilArchiveStore, CouncilLegacyEntry, CouncilMigrationMarker } from "./council-store.js";
import { prepareLegacyCouncilMigration, runCouncilLegacyMigration } from "./horsee-migration.js";
import { createTestCouncilResult } from "./horsee-test-helpers.js";

function legacy(key: string, value: unknown): CouncilLegacyEntry {
  return { key, value, result: null };
}

function migrationStore(entries: CouncilLegacyEntry[], deleted: string[], markers: CouncilMigrationMarker[]): CouncilArchiveStore {
  return {
    kind: "local-file",
    save: async () => undefined,
    getLatest: async () => null,
    getHistory: async () => [],
    getByDate: async () => [],
    getDateCounts: async () => [],
    getHotByDate: async () => [],
    listHotDates: async () => [],
    deleteHotDay: async () => undefined,
    listLegacyEntries: async () => entries,
    deleteLegacyKeys: async (keys) => { deleted.push(...keys); },
    getMigrationMarker: async () => null,
    putMigrationMarker: async (marker) => { markers.push(marker); },
  };
}

describe("Council legacy migration", () => {
  it("validates, groups by Mauritius date, and keeps deterministic newest results", () => {
    const older = createTestCouncilResult("R1C1", "2026-08-01T18:00:00.000Z");
    const newer = { ...older, analysed_at: "2026-08-01T19:00:00.000Z", final_selection: "New selection" };
    const afterMidnight = createTestCouncilResult("R1C2", "2026-08-01T22:30:00.000Z");
    const prepared = prepareLegacyCouncilMigration([
      legacy("results/z.json", newer),
      legacy("results/a.json", older),
      legacy("results/midnight.json", afterMidnight),
      legacy("results/bad.json", { race_id: "R9C9" }),
    ]);
    assert.equal(prepared.source_count, 4);
    assert.equal(prepared.valid_count, 3);
    assert.equal(prepared.invalid.length, 1);
    assert.deepEqual(prepared.days.map((day) => day.date), ["2026-08-01", "2026-08-02"]);
    assert.equal(prepared.days[0]?.results[0]?.final_selection, "New selection");
    assert.equal(prepared.days[0]?.duplicate_count, 1);
  });

  it("dry-runs without archive writes, markers, or deletion", async () => {
    const entries = [legacy("results/one.json", createTestCouncilResult("R1C1", "2026-08-01T10:00:00.000Z"))];
    const deleted: string[] = [];
    const markers: CouncilMigrationMarker[] = [];
    let writes = 0;
    const report = await runCouncilLegacyMigration({
      store: migrationStore(entries, deleted, markers),
      archive: { archiveLegacyDay: async () => { writes += 1; return { content_hash: "a".repeat(64) }; }, verifyArchive: async () => true },
      dryRun: true,
      deleteAfterVerified: true,
    });
    assert.equal(report.days[0]?.status, "PLANNED");
    assert.equal(writes, 0);
    assert.deepEqual(deleted, []);
    assert.deepEqual(markers, []);
  });

  it("deletes exact valid date keys only after verified archive and remains rerunnable", async () => {
    const entries = [
      legacy("results/a.json", createTestCouncilResult("R1C1", "2026-08-01T10:00:00.000Z")),
      legacy("results/b.json", createTestCouncilResult("R1C2", "2026-08-02T10:00:00.000Z")),
      legacy("results/invalid.json", { secret: "not a result" }),
    ];
    const deleted: string[] = [];
    const markers: CouncilMigrationMarker[] = [];
    let run = 0;
    const archive = {
      archiveLegacyDay: async () => { run += 1; return { content_hash: "b".repeat(64) }; },
      verifyArchive: async (date: string) => date === "2026-08-01",
    };
    const store = migrationStore(entries, deleted, markers);
    const first = await runCouncilLegacyMigration({ store, archive, deleteAfterVerified: true, now: () => new Date("2026-08-10T00:00:00Z") });
    const second = await runCouncilLegacyMigration({ store, archive, deleteAfterVerified: false, now: () => new Date("2026-08-10T00:00:00Z") });
    assert.deepEqual(first.days.map((day) => day.status), ["VERIFIED", "FAILED"]);
    assert.deepEqual(deleted, ["results/a.json"]);
    assert.equal(markers.length, 2);
    assert.equal(run, 4);
    assert.equal(second.days[0]?.status, "VERIFIED");
    assert.equal(second.invalid[0]?.source_key, "results/invalid.json");
  });
});
