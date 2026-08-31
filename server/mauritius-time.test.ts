import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  createMauritiusRaceDate,
  differenceInMauritiusWallMinutes,
  getMauritiusDate,
  subtractMauritiusDays,
  truncateToMinute,
} from "./mauritius-time.js";

describe("Mauritius scheduler time", () => {
  it("creates race instants at the Mauritius UTC+4 wall time", () => {
    assert.equal(createMauritiusRaceDate("2026-08-23", "14:55").toISOString(), "2026-08-23T10:55:00.000Z");
  });

  it("truncates invocation seconds before applying minute windows", () => {
    const now = new Date("2026-08-23T10:25:59.999Z");
    assert.equal(truncateToMinute(now).toISOString(), "2026-08-23T10:25:00.000Z");
    assert.equal(differenceInMauritiusWallMinutes(now, "2026-08-23", "14:55"), 30);
  });

  it("uses Mauritius dates around UTC midnight", () => {
    const instant = new Date("2026-08-22T22:30:00.000Z");
    assert.equal(getMauritiusDate(instant), "2026-08-23");
    assert.equal(differenceInMauritiusWallMinutes(instant, "2026-08-23", "03:00"), 30);
  });

  it("subtracts calendar days safely", () => {
    assert.equal(subtractMauritiusDays("2026-03-01", 1), "2026-02-28");
    assert.equal(subtractMauritiusDays("2024-03-01", 1), "2024-02-29");
  });
});

