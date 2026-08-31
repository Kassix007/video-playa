import assert from "node:assert/strict";
import { describe, it } from "node:test";
import type { Context } from "@netlify/functions";
import { createHorseeSchedulerApiHandler } from "../netlify/functions/horsee-scheduler-api.js";
import { authorizeHorseeMutation, horseeErrorResponse, matchesHorseeSchedulerKey } from "./horsee-api-auth.js";
import { parseHorseeConfig } from "./horsee-config.js";
import { QueueOnlyDispatcher } from "./horsee-dispatch.js";
import { MemoryHorseeJobStore } from "./horsee-job-store.js";
import { dispatchHorseeJob, HorseeOperationError, HorseeStatusTransitionRequestSchema, transitionHorseeJob } from "./horsee-operations.js";
import type { HorseeRuntime } from "./horsee-runtime.js";
import { reconcileHorseeQueue } from "./horsee-scheduler.js";
import { createTestRacecard } from "./horsee-test-helpers.js";

async function readyStore(): Promise<MemoryHorseeJobStore> {
  const store = new MemoryHorseeJobStore();
  const queue = reconcileHorseeQueue(
    createTestRacecard(undefined, "2026-08-23"),
    null,
    [],
    new Date("2026-08-23T10:00:00.000Z"),
    parseHorseeConfig({}),
  );
  assert.equal(queue.jobs["2026-08-23:R1C1"]?.status, "READY");
  assert.equal(await store.putQueue(queue), true);
  return store;
}

describe("HORSEE API security and transitions", () => {
  it("compares scheduler keys with fixed-length constant-time digests", () => {
    assert.equal(matchesHorseeSchedulerKey("scheduler-secret", "scheduler-secret"), true);
    assert.equal(matchesHorseeSchedulerKey("short", "scheduler-secret"), false);
    assert.equal(matchesHorseeSchedulerKey("scheduler-secreu", "scheduler-secret"), false);
  });

  it("accepts either the scheduler key or existing development OAuth policy", async () => {
    const schedulerConfig = parseHorseeConfig({ HORSEE_SCHEDULER_API_KEY: "scheduler-secret" });
    const scheduler = await authorizeHorseeMutation(new Request("http://localhost/api/horsee/archive/run", {
      method: "POST", headers: { Authorization: "Bearer scheduler-secret" },
    }), schedulerConfig, {});
    assert.deepEqual(scheduler, { authorized: true, method: "scheduler-key" });

    const oauth = await authorizeHorseeMutation(new Request("http://localhost/api/horsee/archive/run", {
      method: "POST", headers: { Authorization: "Bearer development-secret" },
    }), parseHorseeConfig({}), { HORSEE_COUNCIL_DEV_WRITE_TOKEN: "development-secret" });
    assert.deepEqual(oauth, { authorized: true, method: "oauth" });

    const denied = await authorizeHorseeMutation(new Request("http://localhost/api/horsee/archive/run", {
      method: "POST", headers: { Authorization: "Bearer wrong-value" },
    }), schedulerConfig, {});
    assert.equal(denied.authorized, false);
    if (!denied.authorized) assert.equal(denied.response.status, 401);
  });

  it("rejects unknown status fields, missing failure errors, and invalid transitions", async () => {
    assert.equal(HorseeStatusTransitionRequestSchema.safeParse({ status: "FAILED" }).success, false);
    assert.equal(HorseeStatusTransitionRequestSchema.safeParse({ status: "RUNNING", error: "no", extra: true }).success, false);
    const store = await readyStore();
    await assert.rejects(
      transitionHorseeJob({
        jobStore: store,
        resultStore: { getByDate: async () => [] },
        id: "2026-08-23:R1C1",
        target: "RUNNING",
      }),
      (error: unknown) => error instanceof HorseeOperationError && error.code === "invalid_job_transition",
    );
    await assert.rejects(
      transitionHorseeJob({
        jobStore: store,
        resultStore: { getByDate: async () => [] },
        id: "2026-08-23:R1C1",
        target: "SAVED",
      }),
      (error: unknown) => error instanceof HorseeOperationError && error.code === "result_not_found",
    );
  });

  it("keeps queue-only dispatch idempotently READY", async () => {
    const store = await readyStore();
    const first = await dispatchHorseeJob({ jobStore: store, dispatcher: new QueueOnlyDispatcher(), id: "2026-08-23:R1C1" });
    const second = await dispatchHorseeJob({ jobStore: store, dispatcher: new QueueOnlyDispatcher(), id: "2026-08-23:R1C1" });
    assert.equal(first.accepted, false);
    assert.equal(second.accepted, false);
    assert.equal((await store.getQueue("2026-08-23")).value?.jobs["2026-08-23:R1C1"]?.status, "READY");
  });

  it("enforces methods and empty scheduler bodies without exposing secrets", async () => {
    const store = new MemoryHorseeJobStore();
    const config = parseHorseeConfig({ HORSEE_SCHEDULER_API_KEY: "scheduler-secret" });
    const runtime = {
      config,
      jobStore: store,
      archive: { getArchiveHealth: async () => ({ status: "NOT_CONFIGURED", last_archived_day: null, repo: null, pending_days: 0, last_error: null }) },
      runScheduler: async () => { throw new Error("must not run"); },
    } as unknown as HorseeRuntime;
    const handler = createHorseeSchedulerApiHandler(() => runtime);
    const wrongMethod = await handler(new Request("http://localhost/api/horsee/scheduler/status", { method: "POST" }), {} as Context);
    assert.equal(wrongMethod.status, 405);
    const body = await handler(new Request("http://localhost/api/horsee/scheduler/run", {
      method: "POST",
      headers: { Authorization: "Bearer scheduler-secret" },
      body: "{}",
    }), {} as Context);
    assert.equal(body.status, 400);
    const sanitized = await horseeErrorResponse(503, "failed", "token=scheduler-secret Bearer scheduler-secret").text();
    assert.equal(sanitized.includes("scheduler-secret"), false);
  });
});
