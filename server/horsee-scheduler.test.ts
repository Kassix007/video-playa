import assert from "node:assert/strict";
import { describe, it } from "node:test";
import type { CouncilResult } from "./council-schema.js";
import type { CouncilResultStore } from "./council-store.js";
import { parseHorseeConfig } from "./horsee-config.js";
import { MemoryHorseeJobStore } from "./horsee-job-store.js";
import {
  HorseeSchedulerBusyError,
  reconcileHorseeQueue,
  runHorseeScheduler,
} from "./horsee-scheduler.js";
import { createTestCouncilResult, createTestRace, createTestRacecard } from "./horsee-test-helpers.js";

class MemoryCouncilStore implements CouncilResultStore {
  readonly kind = "local-file" as const;
  constructor(readonly results: CouncilResult[] = []) {}
  async save(result: CouncilResult): Promise<void> { this.results.unshift(result); }
  async getLatest(): Promise<CouncilResult | null> { return this.results[0] ?? null; }
  async getHistory(limit: number): Promise<CouncilResult[]> { return this.results.slice(0, limit); }
  async getByDate(): Promise<CouncilResult[]> { return this.results; }
  async getDateCounts(): Promise<Array<{ date: string; count: number }>> { return []; }
}

const config = parseHorseeConfig({});
const date = "2026-08-23";

describe("HORSEE scheduler", () => {
  it("reconciles every authoritative race once and preserves deterministic identities", () => {
    const card = createTestRacecard([
      createTestRace("R1C1", "14:55"),
      createTestRace("R2C3", "16:00"),
    ]);
    const first = reconcileHorseeQueue(card, null, [], new Date("2026-08-23T10:20:00.000Z"), config);
    const second = reconcileHorseeQueue(card, first, [], new Date("2026-08-23T10:20:00.000Z"), config);
    assert.deepEqual(Object.keys(first.jobs), [`${date}:R1C1`, `${date}:R2C3`]);
    assert.deepEqual(Object.keys(second.jobs), Object.keys(first.jobs));
    assert.equal(second.jobs[`${date}:R1C1`].prompt, first.jobs[`${date}:R1C1`].prompt);
  });

  it("keeps saved work and marks a removed pending race without deleting it", () => {
    const original = createTestRacecard([createTestRace("R1C1", "14:55"), createTestRace("R1C2", "16:00")]);
    const first = reconcileHorseeQueue(original, null, [createTestCouncilResult("R1C1")], new Date("2026-08-23T10:20:00.000Z"), config);
    const updated = reconcileHorseeQueue(createTestRacecard([createTestRace("R1C1", "14:55")]), first, [createTestCouncilResult("R1C1")], new Date("2026-08-23T10:21:00.000Z"), config);
    assert.equal(updated.jobs[`${date}:R1C1`].status, "SAVED");
    assert.equal(updated.jobs[`${date}:R1C2`].status, "MISSED");
    assert.equal(updated.jobs[`${date}:R1C2`].source_status, "REMOVED");
  });

  it("regenerates a READY prompt and records authoritative source changes", () => {
    const original = createTestRacecard([createTestRace("R1C1", "14:55")]);
    const first = reconcileHorseeQueue(original, null, [], new Date("2026-08-23T10:20:00.000Z"), config);
    const changedRace = {
      ...createTestRace("R1C1", "15:00"),
      racecourse: "Updated Racecourse",
    };
    const updated = reconcileHorseeQueue(
      createTestRacecard([changedRace]),
      first,
      [],
      new Date("2026-08-23T10:21:00.000Z"),
      config,
    );
    const job = updated.jobs[`${date}:R1C1`];
    assert.equal(job.status, "READY");
    assert.equal(job.source_revision, 1);
    assert.deepEqual(job.source_change_fields, ["RACECOURSE", "OFF_TIME"]);
    assert.equal(job.source_changed_at, "2026-08-23T10:21:00.000Z");
    assert.notEqual(job.prompt, first.jobs[`${date}:R1C1`].prompt);
    assert.match(job.prompt ?? "", /Updated Racecourse/);
    assert.match(job.prompt ?? "", /scheduled 15:00 Indian\/Mauritius/);
  });

  for (const [minutes, expectedStatus, expectedMode] of [
    [45, "PENDING", null],
    [44, "READY", "PRIMARY"],
    [30, "READY", "PRIMARY"],
    [29, "READY", "RECOVERY"],
    [15, "READY", "RECOVERY"],
    [14, "MISSED", null],
  ] as const) {
    it(`${minutes} minutes before off becomes ${expectedStatus}${expectedMode ? ` ${expectedMode}` : ""}`, () => {
      const now = new Date(Date.parse("2026-08-23T10:55:00.000Z") - minutes * 60_000);
      now.setUTCSeconds(59, 999);
      const queue = reconcileHorseeQueue(createTestRacecard([createTestRace("R1C1", "14:55")]), null, [], now, config);
      assert.equal(queue.jobs[`${date}:R1C1`].status, expectedStatus);
      assert.equal(queue.jobs[`${date}:R1C1`].mode, expectedMode);
    });
  }

  it("marks a job saved only when a matching validated result exists", () => {
    const queue = reconcileHorseeQueue(
      createTestRacecard([createTestRace("R4C5", "14:55")]),
      null,
      [createTestCouncilResult("R4C5")],
      new Date("2026-08-23T10:20:00.000Z"),
      config,
    );
    assert.equal(queue.jobs[`${date}:R4C5`].status, "SAVED");
    assert.equal(queue.jobs[`${date}:R4C5`].completed_at, "2026-08-23T10:00:00.000Z");
  });

  it("recovers a failed job in-window without redispatching in-flight work", () => {
    const card = createTestRacecard([createTestRace("R1C1", "14:55")]);
    const ready = reconcileHorseeQueue(card, null, [], new Date("2026-08-23T10:25:00.000Z"), config);
    const failed = structuredClone(ready);
    failed.jobs[`${date}:R1C1`] = {
      ...failed.jobs[`${date}:R1C1`], status: "FAILED", last_error: "Provider unavailable.", attempts: 1,
    };
    const recovered = reconcileHorseeQueue(card, failed, [], new Date("2026-08-23T10:26:00.000Z"), config);
    assert.equal(recovered.jobs[`${date}:R1C1`].status, "READY");
    assert.equal(recovered.jobs[`${date}:R1C1`].mode, "RECOVERY");

    const inFlight = structuredClone(recovered);
    inFlight.jobs[`${date}:R1C1`] = {
      ...inFlight.jobs[`${date}:R1C1`], status: "DISPATCHED", dispatched_at: "2026-08-23T10:26:00.000Z",
    };
    const repeated = reconcileHorseeQueue(card, inFlight, [], new Date("2026-08-23T10:40:00.000Z"), config);
    assert.equal(repeated.jobs[`${date}:R1C1`].status, "DISPATCHED");
    assert.equal(repeated.jobs[`${date}:R1C1`].attempts, 1);
  });

  it("persists one queue and one prompt across repeated scheduler runs", async () => {
    const jobStore = new MemoryHorseeJobStore();
    const card = createTestRacecard([createTestRace("R4C5", "14:55")]);
    const dependencies = {
      config,
      jobStore,
      resultStore: new MemoryCouncilStore(),
      now: () => new Date("2026-08-23T10:26:00.000Z"),
      fetchRacecard: async () => card,
      log: () => undefined,
    };
    const first = await runHorseeScheduler(dependencies);
    const second = await runHorseeScheduler(dependencies);
    assert.equal(Object.keys(first.queue.jobs).length, 1);
    assert.equal(Object.keys(second.queue.jobs).length, 1);
    assert.equal(second.queue.jobs[`${date}:R4C5`].prompt, first.queue.jobs[`${date}:R4C5`].prompt);
  });

  it("rejects stale programme data and remains runnable later", async () => {
    const jobStore = new MemoryHorseeJobStore();
    const resultStore = new MemoryCouncilStore();
    await assert.rejects(() => runHorseeScheduler({
      config, jobStore, resultStore,
      now: () => new Date("2026-08-23T10:20:00.000Z"),
      fetchRacecard: async () => createTestRacecard([], "2026-08-22"),
      log: () => undefined,
    }), /current Mauritius programme/);
    const recovered = await runHorseeScheduler({
      config, jobStore, resultStore,
      now: () => new Date("2026-08-23T10:25:00.000Z"),
      fetchRacecard: async () => createTestRacecard([createTestRace("R1C1", "14:55")]),
      log: () => undefined,
    });
    assert.equal(Object.keys(recovered.queue.jobs).length, 1);
  });

  it("rejects duplicate race identities and invalid Mauritius off-times before persistence", async () => {
    for (const card of [
      createTestRacecard([createTestRace("R1C1", "14:55"), createTestRace("R1C1", "15:05")]),
      createTestRacecard([createTestRace("R1C1", "24:00")]),
    ]) {
      const jobStore = new MemoryHorseeJobStore();
      await assert.rejects(() => runHorseeScheduler({
        config,
        jobStore,
        resultStore: new MemoryCouncilStore(),
        now: () => new Date("2026-08-23T10:20:00.000Z"),
        fetchRacecard: async () => card,
        log: () => undefined,
      }), /duplicate race identity|invalid Mauritius off-time/i);
      assert.equal((await jobStore.getQueue(date)).value, null);
      assert.equal(await jobStore.getRacecard(date), null);
    }
  });

  it("logs transitions, recovery decisions, completed work, and source changes without payloads", async () => {
    const jobStore = new MemoryHorseeJobStore();
    const logs: string[] = [];
    const firstCard = createTestRacecard([
      createTestRace("R1C1", "14:55"),
      createTestRace("R1C2", "15:20"),
    ]);
    const dependencies = {
      config,
      jobStore,
      resultStore: new MemoryCouncilStore([createTestCouncilResult("R1C2")]),
      now: () => new Date("2026-08-23T10:26:00.000Z"),
      fetchRacecard: async () => firstCard,
      log: (message: string) => { logs.push(message); },
    };
    await runHorseeScheduler(dependencies);
    const changed = createTestRacecard([{ ...createTestRace("R1C1", "15:00"), racecourse: "Changed Course" }]);
    await runHorseeScheduler({
      ...dependencies,
      now: () => new Date("2026-08-23T10:27:00.000Z"),
      fetchRacecard: async () => changed,
    });
    assert.equal(logs.some((message) => /Programme: 2 races/.test(message)), true);
    assert.equal(logs.some((message) => /Transition: R1C1 .*READY.*RECOVERY/.test(message)), true);
    assert.equal(logs.some((message) => /Already completed: 1/.test(message)), true);
    assert.equal(logs.some((message) => /Source changed: R1C1.*RACECOURSE.*OFF_TIME/.test(message)), true);
    assert.equal(logs.some((message) => /Source removed: R1C2/.test(message)), true);
    assert.equal(logs.join("\n").includes("Run the FULL HORSEE HARD Council protocol"), false);
    assert.equal(logs.join("\n").includes("most_likely_winner"), false);
  });

  it("does not overlap a live scheduler lease", async () => {
    const jobStore = new MemoryHorseeJobStore();
    const now = new Date("2026-08-23T10:20:00.000Z");
    await jobStore.acquireLease("scheduler", {
      owner: "a1e0bc8c-a12e-4d5c-8645-424f7a4ec17b",
      purpose: "SCHEDULER",
      acquired_at: now.toISOString(),
      expires_at: new Date(now.getTime() + 60_000).toISOString(),
    }, now);
    await assert.rejects(() => runHorseeScheduler({
      config, jobStore, resultStore: new MemoryCouncilStore(), now: () => now,
      fetchRacecard: async () => createTestRacecard(), log: () => undefined,
    }), HorseeSchedulerBusyError);
  });
});
