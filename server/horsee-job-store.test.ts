import assert from "node:assert/strict";
import { mkdtemp, rm } from "node:fs/promises";
import { tmpdir } from "node:os";
import { join } from "node:path";
import { afterEach, describe, it } from "node:test";
import { parseHorseeConfig } from "./horsee-config.js";
import {
  HORSEE_SCHEDULER_PRODUCTION_STORE_NAME,
  LocalFileHorseeJobStore,
  MemoryHorseeJobStore,
  resolveHorseeSchedulerStoreName,
} from "./horsee-job-store.js";
import { reconcileHorseeQueue } from "./horsee-scheduler.js";
import { createTestRacecard } from "./horsee-test-helpers.js";

const temporaryDirectories: string[] = [];
afterEach(async () => {
  await Promise.all(temporaryDirectories.splice(0).map((path) => rm(path, { recursive: true, force: true })));
});

describe("HORSEE job store", () => {
  it("uses a stable production namespace and isolated previews", () => {
    assert.equal(resolveHorseeSchedulerStoreName({ CONTEXT: "production" }), HORSEE_SCHEDULER_PRODUCTION_STORE_NAME);
    assert.equal(resolveHorseeSchedulerStoreName({ CONTEXT: "deploy-preview", REVIEW_ID: "42" }), "horsee-scheduler-deploy-preview-42");
    assert.notEqual(resolveHorseeSchedulerStoreName({ CONTEXT: "branch-deploy", BRANCH: "feature/x" }), HORSEE_SCHEDULER_PRODUCTION_STORE_NAME);
  });

  it("rejects stale CAS queue writes", async () => {
    const store = new MemoryHorseeJobStore();
    const queue = reconcileHorseeQueue(createTestRacecard(), null, [], new Date("2026-08-23T10:00:00.000Z"), parseHorseeConfig({}));
    assert.equal(await store.putQueue(queue), true);
    const current = await store.getQueue(queue.programme_date);
    assert.equal(await store.putQueue({ ...queue, revision: 2 }, '"stale"'), false);
    assert.equal(await store.putQueue({ ...queue, revision: 2 }, current.etag), true);
  });

  it("allows an expired lease takeover and ignores a stale owner release", async () => {
    const store = new MemoryHorseeJobStore();
    const start = new Date("2026-08-23T10:00:00.000Z");
    const firstOwner = "11111111-1111-4111-8111-111111111111";
    const secondOwner = "22222222-2222-4222-8222-222222222222";
    assert.equal(await store.acquireLease("scheduler", {
      owner: firstOwner, purpose: "SCHEDULER", acquired_at: start.toISOString(),
      expires_at: new Date(start.getTime() + 60_000).toISOString(),
    }, start), true);
    assert.equal(await store.acquireLease("scheduler", {
      owner: secondOwner, purpose: "SCHEDULER", acquired_at: start.toISOString(),
      expires_at: new Date(start.getTime() + 60_000).toISOString(),
    }, start), false);
    const later = new Date(start.getTime() + 61_000);
    assert.equal(await store.acquireLease("scheduler", {
      owner: secondOwner, purpose: "SCHEDULER", acquired_at: later.toISOString(),
      expires_at: new Date(later.getTime() + 60_000).toISOString(),
    }, later), true);
    await store.releaseLease("scheduler", firstOwner, later);
    assert.equal(await store.acquireLease("scheduler", {
      owner: firstOwner, purpose: "SCHEDULER", acquired_at: later.toISOString(),
      expires_at: new Date(later.getTime() + 60_000).toISOString(),
    }, later), false);
  });

  it("persists local queues atomically across store instances", async () => {
    const directory = await mkdtemp(join(tmpdir(), "horsee-store-"));
    temporaryDirectories.push(directory);
    const filePath = join(directory, "scheduler.json");
    const queue = reconcileHorseeQueue(createTestRacecard(), null, [], new Date("2026-08-23T10:00:00.000Z"), parseHorseeConfig({}));
    assert.equal(await new LocalFileHorseeJobStore(filePath).putQueue(queue), true);
    assert.deepEqual(
      (await new LocalFileHorseeJobStore(filePath).getQueue(queue.programme_date)).value,
      JSON.parse(JSON.stringify(queue)),
    );
  });
});
