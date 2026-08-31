import type { CouncilResult } from "./council-schema.js";
import {
  SMSPARIAZ_RACECARD_SOURCE,
  type SmspariazRace,
  type SmspariazRacecardSuccess,
} from "./smspariaz-racecard.js";

export function createTestCouncilResult(
  raceId = "R1C1",
  analysedAt = "2026-08-23T10:00:00.000Z",
): CouncilResult {
  return {
    race_id: raceId,
    racecourse: "Test Racecourse",
    race_number: Number(raceId.match(/C(\d+)$/)?.[1] ?? 1),
    off_time: "14:30",
    distance: "1600m",
    surface: "turf",
    going: "good",
    race_type: "flat",
    field_size: 3,
    most_likely_winner: { number: 1, name: "Alpha", probability: 45 },
    principal_danger: { number: 2, name: "Bravo", probability: 35 },
    best_value: { number: 3, name: "Charlie", probability: 20 },
    ranking: [
      { number: 1, name: "Alpha", probability: 45 },
      { number: 2, name: "Bravo", probability: 35 },
      { number: 3, name: "Charlie", probability: 20 },
    ],
    confidence: "medium",
    strongest_loss_reason: "The favourite may not settle.",
    final_selection: "Alpha",
    council_status: "complete",
    analysed_at: analysedAt,
  };
}

export function createTestRace(
  raceId = "R1C1",
  offTimeMauritius = "14:30",
): SmspariazRace {
  const match = /^R(\d+)C(\d+)$/.exec(raceId);
  const meetingNumber = Number(match?.[1] ?? 1);
  const raceNumber = Number(match?.[2] ?? 1);
  return {
    race_id: raceId,
    meeting_number: meetingNumber,
    race_number: raceNumber,
    racecourse: `Racecourse ${meetingNumber}`,
    off_time: offTimeMauritius,
    off_time_mauritius: offTimeMauritius,
    race_name: `Race ${raceNumber}`,
    country: "MU",
    discipline: "Flat",
    distance: "1600m",
  };
}

export function createTestRacecard(
  races: SmspariazRace[] = [createTestRace()],
  programmeDate = "2026-08-23",
): SmspariazRacecardSuccess {
  const meetings = [...new Set(races.map((race) => race.meeting_number))].map((meetingNumber) => {
    const meetingRaces = races.filter((race) => race.meeting_number === meetingNumber);
    return {
      meeting_number: meetingNumber,
      racecourse: meetingRaces[0]?.racecourse ?? `Racecourse ${meetingNumber}`,
      country: meetingRaces[0]?.country,
      race_count: meetingRaces.length,
      race_ids: meetingRaces.map((race) => race.race_id),
    };
  });
  return {
    success: true,
    programme_date: programmeDate,
    timezone: "Indian/Mauritius",
    fetched_at: `${programmeDate}T08:00:00+04:00`,
    source: SMSPARIAZ_RACECARD_SOURCE,
    meeting_count: meetings.length,
    race_count: races.length,
    french_race_count: races.filter((race) => race.country === "FR").length,
    meetings,
    races,
  };
}

