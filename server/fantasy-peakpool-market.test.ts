import assert from "node:assert/strict";
import { test } from "node:test";
import { SAMPLE_PEAKPOOL_FIXTURE } from "./test-fixtures/peakpool/flow-fixtures.js";
import {
  FantasyPeakpoolMarketError,
  parseFantasyPeakpoolPayload,
} from "./fantasy-peakpool-market.js";

test("parses exact public fields, hashes source bytes, and refuses to invent decimal prices", () => {
  const body = JSON.stringify(SAMPLE_PEAKPOOL_FIXTURE);
  const result = parseFantasyPeakpoolPayload(body, "2026-09-04T09:14:35.000Z");

  assert.equal(result.races.length, 2);
  assert.match(result.payloadSha256, /^[a-f0-9]{64}$/);
  assert.equal(result.byteLength, Buffer.byteLength(body));
  assert.deepEqual(result.races[0]?.runners[0], {
    runnerNumber: 1,
    name: "NOUMEA D'ECAJEUL",
    rawPrice: "940",
    normalizedPrice: null,
    availabilityReason: "UNVERIFIED_PRICE_FORMAT",
  });
  assert.equal(result.races[1]?.runners[1]?.availabilityReason, "NON_RUNNER_DISPLAY_SENTINEL");
});

test("payload hash is byte-exact and excludes response headers", () => {
  const first = parseFantasyPeakpoolPayload('[{"meeting_number":"1","date":"2026-09-04","track":"A","number":"1","time":"12:00","name":"R","horses":[{"no":"1","name":"H","type":"940"}]}]');
  const second = parseFantasyPeakpoolPayload('[ {"meeting_number":"1","date":"2026-09-04","track":"A","number":"1","time":"12:00","name":"R","horses":[{"no":"1","name":"H","type":"940"}]}]');
  assert.notEqual(first.payloadSha256, second.payloadSha256);
});

test("rejects unknown object fields, duplicates, empty fixtures, and unsupported price tokens", () => {
  assert.throws(() => parseFantasyPeakpoolPayload("[]"), FantasyPeakpoolMarketError);
  assert.throws(() => parseFantasyPeakpoolPayload(JSON.stringify([{ ...SAMPLE_PEAKPOOL_FIXTURE[0], extra: true }])), /unexpected fields/i);
  assert.throws(() => parseFantasyPeakpoolPayload(JSON.stringify([SAMPLE_PEAKPOOL_FIXTURE[0], SAMPLE_PEAKPOOL_FIXTURE[0]])), /duplicate race/i);
  assert.throws(() => parseFantasyPeakpoolPayload(JSON.stringify([{
    ...SAMPLE_PEAKPOOL_FIXTURE[0],
    horses: [{ no: "1", name: "Horse", type: "4.50" }],
  }])), /price format/i);
});

test("bounds fixture body size", () => {
  assert.throws(() => parseFantasyPeakpoolPayload(" ".repeat(1_000_001)), /size/i);
});
