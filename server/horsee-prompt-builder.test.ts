import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { buildHorseeHardPrompt } from "./horsee-prompt-builder.js";
import { HorseeJobSchema } from "./horsee-job-schema.js";

const job = HorseeJobSchema.parse({
  id: "2026-08-23:R4C5",
  programme_date: "2026-08-23",
  race_id: "R4C5",
  meeting_number: 4,
  race_number: 5,
  racecourse: "Vincennes",
  off_time_mauritius: "15:03",
  created_at: "2026-08-23T10:00:00.000Z",
  updated_at: "2026-08-23T10:00:00.000Z",
  status: "PENDING",
  mode: null,
  source_status: "ACTIVE",
  attempts: 0,
});

describe("HORSEE HARD prompt", () => {
  it("is deterministic and self-contained for a fresh session", () => {
    const prompt = buildHorseeHardPrompt(job);
    assert.equal(prompt, buildHorseeHardPrompt(job));
    for (const required of [
      "R4C5 23/08/2026 HARD",
      "FULL HORSEE HARD Council protocol",
      "FACT LOCK",
      "blind analysis before market",
      "contradiction gate",
      "win probabilities totalling approximately 100%",
      "save the structured CouncilResult",
      "get_smspariaz_daily_racecard",
      "Do not rely on any previous conversation context",
    ]) assert.match(prompt, new RegExp(required.replace(/[.*+?^${}()|[\]\\]/g, "\\$&"), "i"));
    assert.ok(prompt.length < 20_000);
  });
});

