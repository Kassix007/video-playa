import assert from "node:assert/strict";
import { readFile } from "node:fs/promises";
import { describe, it } from "node:test";
import { isHorseeSchedulerStatus } from "../src/services/horsee.js";
import { getHorseeSchedulerSnapshot, projectHorseeJob } from "./horsee-operations.js";
import { createTestRace, createTestRacecard } from "./horsee-test-helpers.js";
import { parseHorseeConfig } from "./horsee-config.js";
import { reconcileHorseeQueue } from "./horsee-scheduler.js";
import { MemoryHorseeJobStore } from "./horsee-job-store.js";

function statusFixture() {
  return {
    programme_date: "2026-08-23",
    timezone: "Indian/Mauritius",
    observed_at: "2026-08-23T14:00:00+04:00",
    last_run_at: null,
    revision: 1,
    counts: { programme: 1, completed: 0, ready: 1, pending: 0, dispatched: 0, running: 0, failed: 0, missed: 0 },
    upcoming_jobs: [{
      id: "2026-08-23:R1C1", programme_date: "2026-08-23", race_id: "R1C1",
      meeting_number: 1, race_number: 1, racecourse: "Test", off_time_mauritius: "14:30",
      status: "READY", mode: "PRIMARY", attempts: 0, prompt: "HARD", updated_at: "2026-08-23T10:00:00.000Z",
    }],
    archive: { status: "NOT_CONFIGURED", last_archived_day: null, repo: "horsee-archive-2026", pending_days: 0, last_error: null },
    last_error: null,
  };
}

describe("HORSEE dashboard contract", () => {
  it("accepts the exact status DTO and rejects internal or secret fields", () => {
    assert.equal(isHorseeSchedulerStatus(statusFixture()), true);
    assert.equal(isHorseeSchedulerStatus({ ...statusFixture(), scheduler_key: "secret" }), false);
    const fixture = statusFixture();
    assert.equal(isHorseeSchedulerStatus({ ...fixture, upcoming_jobs: [{ ...fixture.upcoming_jobs[0], last_error: "internal" }] }), false);
  });

  it("projects prompts only for READY jobs", () => {
    const queue = reconcileHorseeQueue(createTestRacecard(), null, [], new Date("2026-08-23T10:00:00.000Z"), parseHorseeConfig({}));
    const ready = queue.jobs["2026-08-23:R1C1"];
    assert.ok(ready);
    assert.equal(typeof projectHorseeJob(ready).prompt, "string");
    assert.equal("prompt" in projectHorseeJob({ ...ready, status: "SAVED" }), false);
  });

  it("sorts upcoming jobs, degrades when archive is unconfigured, and sanitizes status errors", async () => {
    const store = new MemoryHorseeJobStore();
    const now = new Date("2026-08-23T10:00:00.000Z");
    const queue = reconcileHorseeQueue(
      createTestRacecard([createTestRace("R1C2", "15:00"), createTestRace("R1C1", "14:30")]),
      null, [], now, parseHorseeConfig({}),
    );
    assert.equal(await store.putQueue(queue), true);
    assert.equal(await store.putSchedulerState({
      current_programme_date: "2026-08-23",
      last_run_at: now.toISOString(),
      last_success_at: null,
      last_error_at: now.toISOString(),
      last_error: "Bearer private-value",
      last_programme_race_count: 2,
      updated_at: now.toISOString(),
    }), true);
    const snapshot = await getHorseeSchedulerSnapshot({
      jobStore: store,
      archive: { getArchiveHealth: async () => ({
        status: "NOT_CONFIGURED" as const,
        last_archived_day: null,
        repo: "horsee-archive-2026",
        pending_days: 0,
        last_error: "token=another-private-value",
      }) },
      now,
    });
    assert.deepEqual(snapshot.upcoming_jobs.map((job) => job.race_id), ["R1C1", "R1C2"]);
    assert.equal(snapshot.archive.status, "NOT_CONFIGURED");
    assert.equal(JSON.stringify(snapshot).includes("private-value"), false);
  });

  it("implements loading/error/empty/ready copy states and a thirty-second poll", async () => {
    const source = await readFile(new URL("../src/components/council/HorseeSchedulerDashboard.tsx", import.meta.url), "utf8");
    for (const marker of ["loading", "error", "Showing last good status", "No READY prompts", "Copy prompt", "30_000", "aria-live=\"polite\""]) {
      assert.ok(source.includes(marker), `Missing dashboard state marker: ${marker}`);
    }
    assert.equal(source.includes("HORSEE_SCHEDULER_API_KEY"), false);
    assert.equal(source.includes("Authorization"), false);
  });
});
