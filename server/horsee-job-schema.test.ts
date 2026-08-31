import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  HorseeArchiveDayStateSchema,
  HorseeArchiveIndexSchema,
  HorseeDailyQueueSchema,
  HorseeJobSchema,
  HorseeOperationalLeaseSchema,
  canTransitionHorseeJob,
  createHorseeJobId,
} from "./horsee-job-schema.js";

const job = {
  id: "2026-08-23:R4C5",
  programme_date: "2026-08-23",
  race_id: "R4C5",
  meeting_number: 4,
  race_number: 5,
  racecourse: "Test",
  off_time_mauritius: "15:03",
  created_at: "2026-08-23T10:00:00.000Z",
  updated_at: "2026-08-23T10:00:00.000Z",
  status: "PENDING",
  mode: null,
  source_status: "ACTIVE",
  attempts: 0,
} as const;

describe("HORSEE persisted schemas", () => {
  it("validates a deterministic job and rejects a mismatched identity", () => {
    assert.equal(HorseeJobSchema.parse(job).id, job.id);
    assert.equal(HorseeJobSchema.parse(job).source_revision, 0);
    assert.equal(createHorseeJobId("2026-08-23", "R4C5"), job.id);
    assert.equal(HorseeJobSchema.safeParse({ ...job, id: "wrong" }).success, false);
    assert.equal(HorseeJobSchema.safeParse({
      ...job,
      source_revision: 1,
      source_changed_at: "2026-08-23T10:05:00.000Z",
      source_change_fields: ["OFF_TIME"],
    }).success, true);
    assert.equal(HorseeJobSchema.safeParse({ ...job, source_revision: 1, source_change_fields: ["OFF_TIME"] }).success, false);
  });

  it("validates queue keys against contained job identities", () => {
    const queue = {
      programme_date: "2026-08-23",
      timezone: "Indian/Mauritius",
      source: "https://www.smspariaz.com/racecard/",
      programme_fetched_at: "2026-08-23T08:00:00.000Z",
      created_at: "2026-08-23T08:00:00.000Z",
      updated_at: "2026-08-23T08:00:00.000Z",
      revision: 1,
      jobs: { [job.id]: job },
    };
    assert.equal(HorseeDailyQueueSchema.safeParse(queue).success, true);
    assert.equal(HorseeDailyQueueSchema.safeParse({ ...queue, jobs: { wrong: job } }).success, false);
  });

  it("enforces valid job transitions", () => {
    assert.equal(canTransitionHorseeJob("PENDING", "READY"), true);
    assert.equal(canTransitionHorseeJob("READY", "DISPATCHED"), true);
    assert.equal(canTransitionHorseeJob("SAVED", "READY"), false);
    assert.equal(canTransitionHorseeJob("PENDING", "SAVED"), true);
  });

  it("validates leases and archive metadata", () => {
    assert.equal(HorseeOperationalLeaseSchema.safeParse({
      owner: "02e7b16f-b77a-49e1-b639-8bcb5d18cc3b",
      purpose: "SCHEDULER",
      acquired_at: "2026-08-23T10:00:00.000Z",
      expires_at: "2026-08-23T10:04:00.000Z",
    }).success, true);
    assert.equal(HorseeArchiveDayStateSchema.safeParse({
      date: "2026-08-22",
      status: "ARCHIVED",
      repo: "Kassix007/horsee-archive-2026",
      archived_at: "2026-08-23T02:30:00.000Z",
      result_count: 2,
      race_count: 3,
      content_hash: "a".repeat(64),
      attempts: 1,
    }).success, true);
    assert.equal(HorseeArchiveIndexSchema.safeParse({
      year: 2026,
      month: 8,
      days: {},
    }).success, true);
  });
});
