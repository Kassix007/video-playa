import assert from "node:assert/strict";
import { test } from "node:test";
import type { SmspariazRacecardSuccess } from "./smspariaz-racecard.js";
import { parseFantasyPeakpoolPayload } from "./fantasy-peakpool-market.js";
import { reconcileFantasyPeakpool } from "./fantasy-peakpool-reconciliation.js";

const racecard: SmspariazRacecardSuccess = {
  success: true,
  programme_date: "2026-09-04",
  timezone: "Indian/Mauritius",
  fetched_at: "2026-09-04T09:00:00+04:00",
  source: "https://www.smspariaz.com/racecard/",
  meeting_count: 1,
  race_count: 2,
  french_race_count: 2,
  meetings: [{ meeting_number: 1, racecourse: "CHANTILLY", country: "France", race_count: 2, race_ids: ["R1C1", "R1C2"] }],
  races: [
    { race_id: "R1C1", meeting_number: 1, race_number: 1, racecourse: "CHANTILLY", off_time: "13:50", off_time_mauritius: "13:50", race_name: "Prix A", country: "France" },
    { race_id: "R1C2", meeting_number: 1, race_number: 2, racecourse: "CHANTILLY", off_time: "14:25", off_time_mauritius: "14:25", race_name: "Prix B", country: "France" },
  ],
};

test("keeps canonical races, excludes market-only races, and preserves unavailable runner values", () => {
  const market = parseFantasyPeakpoolPayload(JSON.stringify([
    { meeting_number: "1", date: "2026-09-04", track: "Chantilly", number: "1", time: "13:50", name: "Prix A", horses: [{ no: "1", name: "Alpha", type: "940" }] },
    { meeting_number: "9", date: "2026-09-04", track: "Other", number: "9", time: "20:00", name: "Extra", horses: [{ no: "1", name: "Extra", type: "500" }] },
  ]));
  const result = reconcileFantasyPeakpool(racecard, market);

  assert.equal(result.races.length, 2);
  assert.equal(result.races[0]?.externalRaceId, "R1C1");
  assert.equal(result.races[0]?.runners[0]?.available, false);
  assert.equal(result.races[0]?.officialOffAt, "2026-09-04T09:50:00.000Z");
  assert.equal(result.races[1]?.runners.length, 0);
  assert.deepEqual(result.excludedMarketRaceIds, ["R9C9"]);
});

test("rejects a stale market programme date instead of reconciling it", () => {
  const market = parseFantasyPeakpoolPayload(JSON.stringify([
    { meeting_number: "1", date: "2026-09-03", track: "Chantilly", number: "1", time: "13:50", name: "Prix A", horses: [{ no: "1", name: "Alpha", type: "940" }] },
  ]));
  assert.throws(() => reconcileFantasyPeakpool(racecard, market), /programme date/i);
});
