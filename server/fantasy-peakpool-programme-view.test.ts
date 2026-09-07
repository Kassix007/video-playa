import assert from "node:assert/strict";
import { readFile } from "node:fs/promises";
import { test } from "node:test";
import { createFantasyProgrammeView } from "../src/features/fantasy-peakpool/programme-view.js";
import type { FantasyMeeting, FantasyRace } from "../src/features/fantasy-peakpool/types.js";

const meetings: FantasyMeeting[] = [
  {
    meetingNumber: 1,
    racecourse: "First",
    races: [
      { id: "race-1", externalRaceId: "R1C1", meetingNumber: 1, raceNumber: 1, racecourse: "First", officialOffAt: "2026-09-05T10:00:00Z", state: "OPEN", runners: [] },
      { id: "race-2", externalRaceId: "R1C2", meetingNumber: 1, raceNumber: 2, racecourse: "First", officialOffAt: "2026-09-05T10:30:00Z", state: "OPEN", runners: [] },
    ],
  },
  {
    meetingNumber: 2,
    racecourse: "Second",
    races: [
      { id: "race-3", externalRaceId: "R2C1", meetingNumber: 2, raceNumber: 1, racecourse: "Second", officialOffAt: "2026-09-05T11:00:00Z", state: "OPEN", runners: [] },
    ],
  },
];

test("programme view reports every PDF race while exposing one meeting at a time", () => {
  const initial = createFantasyProgrammeView(meetings);
  assert.equal(initial.totalRaces, 3);
  assert.equal(initial.activeMeeting?.racecourse, "First");
  assert.deepEqual(initial.activeMeeting?.races.map((race: FantasyRace) => race.id), ["race-1", "race-2"]);
  assert.deepEqual(initial.meetingOptions.map((meeting) => meeting.raceCount), [2, 1]);

  const selected = createFantasyProgrammeView(meetings, initial.meetingOptions[1]?.key);
  assert.equal(selected.activeMeeting?.racecourse, "Second");
  assert.deepEqual(selected.activeMeeting?.races.map((race: FantasyRace) => race.id), ["race-3"]);
});

test("race runner markup is deferred behind an initially collapsed accessible disclosure", async () => {
  const source = await readFile(new URL("../src/features/fantasy-peakpool/components/PeakpoolProgramme.tsx", import.meta.url), "utf8");
  assert.match(source, /aria-expanded=\{expandedRaceId === race\.id\}/);
  assert.match(source, /expandedRaceId === race\.id &&/);
  assert.match(source, /setExpandedRaceId\(expandedRaceId === race\.id \? null : race\.id\)/);
});
