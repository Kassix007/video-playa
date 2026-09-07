import { timingSafeEqual } from "node:crypto";
import { getSmspariazDailyRacecard, type SmspariazRacecardResponse } from "./smspariaz-racecard.js";
import {
  createUnavailableFantasyPeakpoolSnapshot,
  FANTASY_PEAKPOOL_MARKET_SOURCE,
  parseFantasyPeakpoolPayloadTolerant,
  type TolerantFantasyPeakpoolMarketSnapshot,
} from "./fantasy-peakpool-market.js";
import { reconcileFantasyPeakpool } from "./fantasy-peakpool-reconciliation.js";

type FetchLike = (input: string | URL | Request, init?: RequestInit) => Promise<Response>;

type SyncDependencies = {
  getRacecard?: () => Promise<SmspariazRacecardResponse>;
  fetchImpl?: FetchLike;
  ingest: (payload: Record<string, unknown>) => Promise<Record<string, unknown>>;
  now?: () => Date;
};

export function authorizeFantasyPeakpoolSync(authorization: string | null, expectedToken?: string): boolean {
  if (!expectedToken || expectedToken.length < 1 || !authorization?.startsWith("Bearer ")) return false;
  const supplied = authorization.slice(7);
  const expectedBytes = Buffer.from(expectedToken);
  const suppliedBytes = Buffer.from(supplied);
  return suppliedBytes.length === expectedBytes.length && timingSafeEqual(suppliedBytes, expectedBytes);
}

export async function syncFantasyPeakpool(dependencies: SyncDependencies): Promise<{
  programmeDate: string;
  canonicalRaces: number;
  marketRaces: number;
  reconciledRaces: number;
  validPrices: number;
  unavailablePrices: number;
  rejectedMarketRaces: number;
  marketAvailable: boolean;
  payloadSha256: string;
  observedAt: string;
}> {
  const racecard = await (dependencies.getRacecard ?? (() => getSmspariazDailyRacecard()))();
  if (!racecard.success) throw new Error(`Canonical SMSPariaz racecard unavailable: ${racecard.error_code}.`);
  const fetchImpl = dependencies.fetchImpl ?? fetch;
  const observedAt = (dependencies.now ?? (() => new Date()))().toISOString();
  let response: Response | undefined;
  let body = new TextEncoder().encode("[]");
  let market: TolerantFantasyPeakpoolMarketSnapshot;
  let marketAvailable = false;
  try {
    response = await fetchImpl(FANTASY_PEAKPOOL_MARKET_SOURCE, {
      method: "GET",
      redirect: "manual",
      cache: "no-store",
      headers: { Accept: "application/json, text/plain;q=0.9, */*;q=0.1" },
    });
    body = new Uint8Array(await response.arrayBuffer());
    if (response.ok && !(response.status >= 300 && response.status < 400)) {
      market = parseFantasyPeakpoolPayloadTolerant(body, observedAt);
      marketAvailable = true;
    } else {
      market = createUnavailableFantasyPeakpoolSnapshot(body, observedAt);
    }
  } catch {
    market = createUnavailableFantasyPeakpoolSnapshot(body, observedAt);
  }

  const dateMatches = (value: string): boolean => {
    if (value === racecard.programme_date) return true;
    const match = value.match(/^(\d{2})[/-](\d{2})[/-](\d{4})$/);
    return Boolean(match && `${match[3]}-${match[2]}-${match[1]}` === racecard.programme_date);
  };
  const datedRaces = market.races.filter((race) => dateMatches(race.programmeDate));
  market = {
    ...market,
    races: datedRaces,
    rejectedRaceCount: market.rejectedRaceCount + market.races.length - datedRaces.length,
  };
  const reconciled = reconcileFantasyPeakpool(racecard, market);
  const races = reconciled.races.map((race) => ({
    programme_date: race.programmeDate,
    external_race_id: race.externalRaceId,
    meeting_number: race.meetingNumber,
    race_number: race.raceNumber,
    racecourse: race.racecourse,
    race_name: race.raceName ?? "",
    discipline: race.discipline ?? "",
    distance: race.distance ?? "",
    official_off_at: race.officialOffAt,
    racecard_observed_at: racecard.fetched_at,
    racecard_payload_hash: "",
    runners: race.runners.map((runner) => ({
      runner_number: runner.runnerNumber,
      name: runner.name,
      raw_price: runner.rawPrice,
      normalized_price: "",
      normalization_rule: "",
      availability_reason: runner.availabilityReason,
      valid_until: "",
      is_valid: false,
    })),
  }));
  await dependencies.ingest({
    payload: {
      sha256: market.payloadSha256,
      source_url: market.source,
      observed_at: market.observedAt,
      byte_length: market.byteLength,
      content_type: response?.headers.get("content-type") ?? "",
      raw_body: (() => {
        if (body.byteLength === 0 || body.byteLength > 1_000_000) return null;
        try { return new TextDecoder("utf-8", { fatal: true }).decode(body); } catch { return null; }
      })(),
    },
    races,
  });
  const unavailablePrices = races.reduce((sum, race) => sum + race.runners.length, 0);
  return {
    programmeDate: racecard.programme_date,
    canonicalRaces: racecard.race_count,
    marketRaces: market.races.length,
    reconciledRaces: races.filter((race) => race.runners.length > 0).length,
    validPrices: 0,
    unavailablePrices,
    rejectedMarketRaces: market.rejectedRaceCount,
    marketAvailable,
    payloadSha256: market.payloadSha256,
    observedAt,
  };
}
