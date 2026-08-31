import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { parseHorseeConfig } from "./horsee-config.js";
import { cleanupExpiredHotData } from "./horsee-archive.js";

describe("HORSEE hot retention", () => {
  it("deletes only verified archived dates older than retention", async () => {
    const deleted: string[] = [];
    const result = await cleanupExpiredHotData({
      config: parseHorseeConfig({ HORSEE_HOT_RETENTION_DAYS: "14" }),
      now: new Date("2026-08-23T08:00:00.000Z"),
      dates: ["2026-08-23", "2026-08-20", "2026-08-08", "2026-08-07", "2026-08-06"],
      getArchiveStatus: async (date) => ({
        status: date === "2026-08-07" ? "ARCHIVED" : date === "2026-08-06" ? "FAILED" : "PENDING",
        verified: date === "2026-08-07",
      }),
      deleteDate: async (date) => { deleted.push(date); },
    });
    assert.deepEqual(deleted, ["2026-08-07"]);
    assert.deepEqual(result.deleted_dates, ["2026-08-07"]);
    assert.equal(result.preserved.some((item) => item.date === "2026-08-06"), true);
    assert.equal(result.preserved.some((item) => item.date === "2026-08-23"), true);
  });
});
