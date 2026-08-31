import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  aggregateCouncilDateCounts,
  filterCouncilResultsByDate,
  sortCouncilResultsNewest,
} from "./council-history.js";
import type { CouncilResult } from "./council-schema.js";
import { deduplicateCouncilResults } from "./council-store.js";

function result(raceId: string, analysedAt: string): CouncilResult {
  return {
    race_id: raceId,
    racecourse: "Test Course",
    race_number: 1,
    off_time: "14:30",
    distance: "1600m",
    surface: "Turf",
    going: "Good",
    race_type: "Flat",
    field_size: 2,
    most_likely_winner: { number: 1, name: "Alpha", probability: 60 },
    principal_danger: { number: 2, name: "Bravo", probability: 40 },
    best_value: { number: 2, name: "Bravo", probability: 40 },
    ranking: [
      { number: 1, name: "Alpha", probability: 60 },
      { number: 2, name: "Bravo", probability: 40 },
    ],
    confidence: "medium",
    strongest_loss_reason: "A slow pace.",
    final_selection: "#1 Alpha",
    council_status: "complete",
    analysed_at: analysedAt,
  };
}

const RESULTS = [
  result("before-midnight", "2026-08-19T19:59:59.999Z"),
  result("mauritius-midnight", "2026-08-19T20:00:00.000Z"),
  result("same-day-later", "2026-08-20T15:45:00.000Z"),
  result("next-day", "2026-08-20T20:00:00.000Z"),
];

describe("Council history date queries", () => {
  it("uses Mauritius midnight for today's result boundaries", () => {
    assert.deepEqual(
      filterCouncilResultsByDate(RESULTS, "2026-08-20").map((item) => item.race_id),
      ["mauritius-midnight", "same-day-later"],
    );
  });

  it("returns every analysis for a historical date newest first", () => {
    const historical = sortCouncilResultsNewest(
      filterCouncilResultsByDate(RESULTS, "2026-08-20"),
    );
    assert.deepEqual(historical.map((item) => item.race_id), ["same-day-later", "mauritius-midnight"]);
  });

  it("returns an empty list for a day without analyses", () => {
    assert.deepEqual(filterCouncilResultsByDate(RESULTS, "2026-08-18"), []);
  });

  it("aggregates multiple analyses into Mauritius-local monthly date counts", () => {
    assert.deepEqual(aggregateCouncilDateCounts(RESULTS, "2026-08"), [
      { date: "2026-08-19", count: 1 },
      { date: "2026-08-20", count: 2 },
      { date: "2026-08-21", count: 1 },
    ]);
  });

  it("counts only the newest current result for a legacy date/race identity", () => {
    const older = result("R1C1", "2026-08-20T10:00:00.000Z");
    const newer = { ...older, analysed_at: "2026-08-20T11:00:00.000Z", final_selection: "Updated" };
    const current = deduplicateCouncilResults([older, newer, result("R1C2", "2026-08-20T12:00:00.000Z")]);
    assert.deepEqual(current.map((item) => item.final_selection), ["#1 Alpha", "Updated"]);
    assert.deepEqual(aggregateCouncilDateCounts(current, "2026-08"), [{ date: "2026-08-20", count: 2 }]);
  });
});
