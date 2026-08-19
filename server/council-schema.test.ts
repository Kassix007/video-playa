import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  CouncilResultSchema,
  MAX_COUNCIL_FIELD_SIZE,
  type CouncilResult,
} from "./council-schema.js";

const validResult: CouncilResult = {
  race_id: "equidia-r1c1",
  racecourse: "Equidia Test",
  race_number: 1,
  off_time: "14:30",
  distance: "1600m",
  surface: "Turf",
  going: "Good",
  race_type: "Flat",
  field_size: 4,
  most_likely_winner: { number: 4, name: "Alpha", probability: 42 },
  principal_danger: { number: 7, name: "Bravo", probability: 28 },
  best_value: { number: 2, name: "Charlie", probability: 18 },
  ranking: [
    { number: 4, name: "Alpha", probability: 42 },
    { number: 7, name: "Bravo", probability: 28 },
    { number: 2, name: "Charlie", probability: 18 },
    { number: 9, name: "Delta", probability: 12 },
  ],
  confidence: "high",
  strongest_loss_reason: "The pace may become tactical.",
  final_selection: "#4 Alpha",
  council_status: "complete",
  analysed_at: "2026-08-19T12:00:00.000Z",
};

function expectRejected(result: CouncilResult): void {
  assert.equal(CouncilResultSchema.safeParse(result).success, false);
}

describe("CouncilResultSchema integrity", () => {
  it("accepts a complete, internally consistent Council verdict", () => {
    assert.equal(CouncilResultSchema.safeParse(validResult).success, true);
  });

  it("rejects a partial ranking", () => {
    expectRejected({ ...validResult, ranking: validResult.ranking.slice(0, 3) });
  });

  it("rejects duplicate runner numbers", () => {
    const ranking = validResult.ranking.map((runner) => ({ ...runner }));
    ranking[3] = { ...ranking[3], number: ranking[2].number };
    expectRejected({ ...validResult, ranking });
  });

  it("rejects a winner inconsistent with ranking[0]", () => {
    expectRejected({ ...validResult, most_likely_winner: validResult.ranking[1] });
  });

  it("rejects a probability total far from 100", () => {
    const ranking = validResult.ranking.map((runner, index) => (
      index === 3 ? { ...runner, probability: 2 } : runner
    ));
    expectRejected({ ...validResult, ranking });
  });

  it("rejects oversized text fields", () => {
    expectRejected({ ...validResult, strongest_loss_reason: "x".repeat(2_001) });
  });

  it("rejects a field size above the supported maximum", () => {
    expectRejected({ ...validResult, field_size: MAX_COUNCIL_FIELD_SIZE + 1 });
  });
});
