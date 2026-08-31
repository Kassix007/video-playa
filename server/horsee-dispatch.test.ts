import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { QueueOnlyDispatcher } from "./horsee-dispatch.js";
import { HorseeJobSchema } from "./horsee-job-schema.js";

describe("HORSEE provider-neutral dispatch", () => {
  it("leaves work queue-only without a provider call", async () => {
    const job = HorseeJobSchema.parse({
      id: "2026-08-23:R4C5", programme_date: "2026-08-23", race_id: "R4C5",
      meeting_number: 4, race_number: 5, racecourse: "Test", off_time_mauritius: "15:03",
      created_at: "2026-08-23T10:00:00.000Z", updated_at: "2026-08-23T10:00:00.000Z",
      status: "READY", mode: "PRIMARY", source_status: "ACTIVE", attempts: 0, prompt: "prompt",
    });
    const result = await new QueueOnlyDispatcher().dispatch(job);
    assert.deepEqual(result, {
      accepted: false,
      provider: "queue-only",
      retryable: true,
      message: "No automated dispatcher is configured.",
    });
    assert.equal(job.status, "READY");
  });
});
