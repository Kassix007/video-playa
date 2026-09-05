import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  PEAKPOOL_PROGRAMME_PATH,
  PeakpoolProgrammeClient,
  PeakpoolProgrammeError,
  parsePeakpoolProgramme,
} from "./peakpool-programme.js";

const SAMPLE_FIXTURE = [
  {
    meeting_number: 3,
    number: 1,
    date: "2026-09-01",
    time: "12:30",
    track: "Longchamp",
    name: "Prix Example",
    horses: [
      { no: 4, name: "Blue Comet", type: "42" },
      { no: "9", name: "Silver Star", type: "38" },
      { no: "0", name: "Provider Reserve", type: "12" },
    ],
  },
];

function responseFor(value: unknown, status = 200, headers?: HeadersInit): Response {
  return new Response(JSON.stringify(value), { status, headers });
}

describe("Peakpool programme", () => {
  it("parses the observed fixture shape into races, runners, displayed values, and provider codes", () => {
    const programme = parsePeakpoolProgramme(SAMPLE_FIXTURE, "2026-09-01T10:00:00.000Z");

    assert.equal(programme.retrieved_at, "2026-09-01T10:00:00.000Z");
    assert.equal(programme.races.length, 1);
    assert.deepEqual(programme.races[0], {
      meeting_number: "3",
      race_number: "1",
      date: "2026-09-01",
      time: "12:30",
      track: "Longchamp",
      name: "Prix Example",
      runners: [
        {
          runner_number: "4",
          name: "Blue Comet",
          displayed_pool_value: "42",
          selection_code: "R3C1H4",
        },
        {
          runner_number: "9",
          name: "Silver Star",
          displayed_pool_value: "38",
          selection_code: "R3C1H9",
        },
        {
          runner_number: "0",
          name: "Provider Reserve",
          displayed_pool_value: "12",
          selection_code: "R3C1H0",
        },
      ],
    });
    assert.match(programme.fixture_fingerprint, /^[a-f0-9]{64}$/);
  });

  it("rejects a malformed, empty, or duplicate-runner fixture instead of guessing a selection", () => {
    assert.throws(
      () => parsePeakpoolProgramme({ races: SAMPLE_FIXTURE }),
      (error: unknown) => error instanceof PeakpoolProgrammeError && error.code === "PEAKPOOL_PROGRAMME_INVALID",
    );
    assert.throws(
      () => parsePeakpoolProgramme([]),
      (error: unknown) => error instanceof PeakpoolProgrammeError && error.code === "PEAKPOOL_PROGRAMME_UNAVAILABLE",
    );
    const duplicateRunner = structuredClone(SAMPLE_FIXTURE);
    duplicateRunner[0]!.horses.push({ no: 4, name: "Duplicate", type: "12" });
    assert.throws(
      () => parsePeakpoolProgramme(duplicateRunner),
      (error: unknown) => error instanceof PeakpoolProgrammeError && error.code === "PEAKPOOL_PROGRAMME_INVALID",
    );
    const zeroRace = structuredClone(SAMPLE_FIXTURE);
    zeroRace[0]!.number = 0;
    assert.throws(
      () => parsePeakpoolProgramme(zeroRace),
      (error: unknown) => error instanceof PeakpoolProgrammeError && error.code === "PEAKPOOL_PROGRAMME_INVALID",
    );
  });

  it("uses exactly the approved read-only endpoint and bounds its response", async () => {
    const calls: Array<{ url: URL; init?: RequestInit }> = [];
    const client = new PeakpoolProgrammeClient({
      baseUrl: "https://www.smspariaz.com/",
      now: () => new Date("2026-09-01T10:00:00.000Z"),
      fetchImpl: async (input, init) => {
        calls.push({ url: new URL(input.toString()), init });
        return responseFor(SAMPLE_FIXTURE);
      },
    });

    const programme = await client.getProgramme();

    assert.equal(programme.races[0]?.runners[0]?.selection_code, "R3C1H4");
    assert.equal(calls.length, 1);
    assert.equal(calls[0]?.url.origin, "https://www.smspariaz.com");
    assert.equal(calls[0]?.url.pathname, PEAKPOOL_PROGRAMME_PATH.replace(/\?$/, ""));
    assert.equal(calls[0]?.url.search, "");
    assert.equal(calls[0]?.init?.method, "GET");
    assert.equal(calls[0]?.init?.redirect, "manual");
    assert.equal(calls[0]?.init?.cache, "no-store");
    assert.equal(calls[0]?.init?.body, undefined);
  });

  it("fails closed for a redirect, oversized response, or unsafe configured origin", async () => {
    const redirected = new PeakpoolProgrammeClient({
      baseUrl: "https://www.smspariaz.com",
      fetchImpl: async () => responseFor({}, 302, { Location: "https://example.invalid/" }),
    });
    await assert.rejects(
      redirected.getProgramme(),
      (error: unknown) => error instanceof PeakpoolProgrammeError && error.code === "PEAKPOOL_PROGRAMME_UNAVAILABLE",
    );

    const oversized = new PeakpoolProgrammeClient({
      baseUrl: "https://www.smspariaz.com",
      maxResponseBytes: 1_024,
      fetchImpl: async () => new Response("x".repeat(1_025)),
    });
    await assert.rejects(
      oversized.getProgramme(),
      (error: unknown) => error instanceof PeakpoolProgrammeError && error.code === "PEAKPOOL_PROGRAMME_UNAVAILABLE",
    );

    let calls = 0;
    const unsafeOrigin = new PeakpoolProgrammeClient({
      baseUrl: "https://example.invalid",
      fetchImpl: async () => {
        calls += 1;
        return responseFor(SAMPLE_FIXTURE);
      },
    });
    await assert.rejects(
      unsafeOrigin.getProgramme(),
      (error: unknown) => error instanceof PeakpoolProgrammeError && error.code === "PEAKPOOL_PROGRAMME_UNAVAILABLE",
    );
    assert.equal(calls, 0);
  });
});
