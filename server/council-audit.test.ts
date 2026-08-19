import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { createCouncilWriteAuditEvent } from "./council-audit.js";
import type { CouncilResult } from "./council-schema.js";

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
  analysed_at: "2099-01-01T00:00:00.000Z",
};

describe("Council write audit", () => {
  it("records a redacted, attributable event using server receipt time", () => {
    const event = createCouncilWriteAuditEvent(
      result,
      { clientId: "chatgpt-client", subject: "user@example.test" },
      1_776_672_000_000,
      "event-id",
    );

    assert.equal(event.occurred_at, "2026-04-20T08:00:00.000Z");
    assert.equal(event.client_id, "chatgpt-client");
    assert.match(event.subject_sha256 ?? "", /^[a-f0-9]{64}$/);
    assert.match(event.result_sha256, /^[a-f0-9]{64}$/);
    assert.equal("subject" in event, false);
    assert.equal(JSON.stringify(event).includes("user@example.test"), false);
    assert.notEqual(event.occurred_at, result.analysed_at);
  });
});
