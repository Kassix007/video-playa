import assert from "node:assert/strict";
import { test } from "node:test";
import {
  calculateGrossReturn,
  formatCredits,
  isBettingOpen,
  isQuoteFresh,
  parseCredits,
} from "./fantasy-peakpool-domain.js";

test("credit parsing and formatting are exact and reject unsafe precision", () => {
  assert.equal(parseCredits("1000.00"), 100_000n);
  assert.equal(formatCredits(100_005n), "1000.05");
  assert.throws(() => parseCredits("0.001"), /two decimal/i);
  assert.throws(() => parseCredits("NaN"), /credit/i);
});

test("normal and dead-heat gross returns use deterministic exact arithmetic", () => {
  assert.equal(calculateGrossReturn("100.00", "4.50"), "450.00");
  assert.equal(calculateGrossReturn("100.00", "4.50", 2), "225.00");
  assert.equal(calculateGrossReturn("1.00", "3.33", 2), "1.67");
  assert.throws(() => calculateGrossReturn("1.00", "3.33", 0), /divisor/i);
});

test("close buffer and quote age use authoritative instants", () => {
  const offAt = new Date("2026-09-04T10:00:00.000Z");
  assert.equal(isBettingOpen(new Date("2026-09-04T09:58:59.999Z"), offAt, 60), true);
  assert.equal(isBettingOpen(new Date("2026-09-04T09:59:00.000Z"), offAt, 60), false);
  assert.equal(isQuoteFresh(new Date("2026-09-04T09:58:00.000Z"), new Date("2026-09-04T09:58:30.000Z"), 30), true);
  assert.equal(isQuoteFresh(new Date("2026-09-04T09:58:00.000Z"), new Date("2026-09-04T09:58:30.001Z"), 30), false);
});
