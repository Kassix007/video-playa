import { createMauritiusRaceDate } from "./mauritius-time.js";
import type { SmspariazRacecardSuccess } from "./smspariaz-racecard.js";
import type { FantasyPeakpoolMarketSnapshot } from "./fantasy-peakpool-market.js";

function normalize(value: string): string {
  return value.normalize("NFD").replace(/[\u0300-\u036f]/g, "").replace(/[^a-z0-9]/gi, "").toLowerCase();
}

function normalizeDate(value: string): string | null {
  if (/^\d{4}-\d{2}-\d{2}$/.test(value)) return value;
  const match = value.match(/^(\d{2})[/-](\d{2})[/-](\d{4})$/);
  return match ? `${match[3]}-${match[2]}-${match[1]}` : null;
}

export type ReconciledFantasyRunner = {
  runnerNumber: number;
  name: string;
  rawPrice: string;
  normalizedPrice: null;
  available: false;
  availabilityReason: string;
};

export type ReconciledFantasyRace = {
  externalRaceId: string;
  programmeDate: string;
  meetingNumber: number;
  raceNumber: number;
  racecourse: string;
  raceName?: string;
  discipline?: string;
  distance?: string;
  officialOffAt: string;
  marketMatched: boolean;
  runners: ReconciledFantasyRunner[];
};

export function reconcileFantasyPeakpool(
  racecard: SmspariazRacecardSuccess,
  market: FantasyPeakpoolMarketSnapshot,
): { races: ReconciledFantasyRace[]; excludedMarketRaceIds: string[] } {
  const marketById = new Map(market.races.map((race) => [`R${race.meetingNumber}C${race.raceNumber}`, race]));
  for (const race of market.races) {
    if (normalizeDate(race.programmeDate) !== racecard.programme_date) {
      throw new Error(`Peakpool market programme date ${race.programmeDate} does not match ${racecard.programme_date}.`);
    }
  }
  const canonicalIds = new Set(racecard.races.map((race) => race.race_id));
  const races = racecard.races.map((race): ReconciledFantasyRace => {
    const marketRace = marketById.get(race.race_id);
    const trackMatches = marketRace && normalize(marketRace.track) === normalize(race.racecourse);
    const runners = trackMatches ? marketRace.runners.map((runner): ReconciledFantasyRunner => ({
      runnerNumber: runner.runnerNumber,
      name: runner.name,
      rawPrice: runner.rawPrice,
      normalizedPrice: null,
      available: false,
      availabilityReason: runner.availabilityReason,
    })) : [];
    return {
      externalRaceId: race.race_id,
      programmeDate: racecard.programme_date,
      meetingNumber: race.meeting_number,
      raceNumber: race.race_number,
      racecourse: race.racecourse,
      ...(race.race_name ? { raceName: race.race_name } : {}),
      ...(race.discipline ? { discipline: race.discipline } : {}),
      ...(race.distance ? { distance: race.distance } : {}),
      officialOffAt: createMauritiusRaceDate(racecard.programme_date, race.off_time_mauritius).toISOString(),
      marketMatched: Boolean(trackMatches),
      runners,
    };
  });
  return {
    races,
    excludedMarketRaceIds: [...marketById.keys()].filter((raceId) => !canonicalIds.has(raceId)).sort(),
  };
}
