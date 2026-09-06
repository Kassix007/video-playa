import { createHash } from "node:crypto";

export const FANTASY_PEAKPOOL_MARKET_SOURCE = "https://www.smspariaz.com/service/peakpool_json.php";
const MAX_BODY_BYTES = 1_000_000;
const MAX_RACES = 100;
const MAX_RUNNERS = 100;
const MAX_TEXT = 300;

export type FantasyPriceAvailability =
  | "UNVERIFIED_PRICE_FORMAT"
  | "NON_RUNNER_DISPLAY_SENTINEL";

export type FantasyPeakpoolRunner = {
  runnerNumber: number;
  name: string;
  rawPrice: string;
  normalizedPrice: null;
  availabilityReason: FantasyPriceAvailability;
};

export type FantasyPeakpoolRace = {
  meetingNumber: number;
  programmeDate: string;
  track: string;
  raceNumber: number;
  offTime: string;
  name: string;
  runners: FantasyPeakpoolRunner[];
};

export type FantasyPeakpoolMarketSnapshot = {
  source: typeof FANTASY_PEAKPOOL_MARKET_SOURCE;
  observedAt: string;
  payloadSha256: string;
  byteLength: number;
  races: FantasyPeakpoolRace[];
};

export type TolerantFantasyPeakpoolMarketSnapshot = FantasyPeakpoolMarketSnapshot & {
  rejectedRaceCount: number;
};

export class FantasyPeakpoolMarketError extends Error {
  constructor(message: string) {
    super(message);
    this.name = "FantasyPeakpoolMarketError";
  }
}

function record(value: unknown, label: string): Record<string, unknown> {
  if (!value || typeof value !== "object" || Array.isArray(value)) {
    throw new FantasyPeakpoolMarketError(`${label} must be an object.`);
  }
  return value as Record<string, unknown>;
}

function exactKeys(value: Record<string, unknown>, expected: readonly string[], label: string): void {
  const actual = Object.keys(value).sort();
  const allowed = [...expected].sort();
  if (actual.length !== allowed.length || actual.some((key, index) => key !== allowed[index])) {
    throw new FantasyPeakpoolMarketError(`${label} contains unexpected fields.`);
  }
}

function boundedString(value: unknown, label: string): string {
  if (typeof value !== "string" || !value.trim() || value.length > MAX_TEXT) {
    throw new FantasyPeakpoolMarketError(`${label} must be bounded non-empty text.`);
  }
  return value.trim();
}

function identifier(value: unknown, label: string, allowZero = false): number {
  const text = boundedString(value, label);
  const pattern = allowZero ? /^(?:0|[1-9]\d{0,5})$/ : /^[1-9]\d{0,5}$/;
  if (!pattern.test(text)) throw new FantasyPeakpoolMarketError(`${label} is invalid.`);
  return Number(text);
}

function classifyPrice(value: unknown): Pick<FantasyPeakpoolRunner, "rawPrice" | "normalizedPrice" | "availabilityReason"> {
  const rawPrice = boundedString(value, "Runner price");
  if (rawPrice === "NP") {
    return { rawPrice, normalizedPrice: null, availabilityReason: "NON_RUNNER_DISPLAY_SENTINEL" };
  }
  if (/^[1-9]\d{0,5}$/.test(rawPrice)) {
    return { rawPrice, normalizedPrice: null, availabilityReason: "UNVERIFIED_PRICE_FORMAT" };
  }
  throw new FantasyPeakpoolMarketError("Runner price format is not a verified public Peakpool value.");
}

function bodyBytes(input: string | Uint8Array): Uint8Array {
  return typeof input === "string" ? new TextEncoder().encode(input) : input;
}

function snapshot(
  bytes: Uint8Array,
  observedAt: string,
  races: FantasyPeakpoolRace[],
): FantasyPeakpoolMarketSnapshot {
  return {
    source: FANTASY_PEAKPOOL_MARKET_SOURCE,
    observedAt: new Date(observedAt).toISOString(),
    payloadSha256: createHash("sha256").update(bytes).digest("hex"),
    byteLength: bytes.byteLength,
    races,
  };
}

function decodeRaceArray(input: string | Uint8Array, allowEmpty: boolean): {
  bytes: Uint8Array;
  decoded: unknown[];
} {
  const bytes = bodyBytes(input);
  if (bytes.byteLength === 0 || bytes.byteLength > MAX_BODY_BYTES) {
    throw new FantasyPeakpoolMarketError("Peakpool payload size is outside the safe limit.");
  }
  let text: string;
  try {
    text = new TextDecoder("utf-8", { fatal: true }).decode(bytes);
  } catch {
    throw new FantasyPeakpoolMarketError("Peakpool payload is not valid UTF-8.");
  }
  let decoded: unknown;
  try {
    decoded = JSON.parse(text) as unknown;
  } catch {
    throw new FantasyPeakpoolMarketError("Peakpool payload is not valid JSON.");
  }
  if (!Array.isArray(decoded) || (!allowEmpty && decoded.length === 0) || decoded.length > MAX_RACES) {
    throw new FantasyPeakpoolMarketError(`Peakpool fixture must be a bounded ${allowEmpty ? "" : "non-empty "}race array.`);
  }
  return { bytes, decoded };
}

function parseRace(item: unknown, raceIds: Set<string>): FantasyPeakpoolRace {
  const race = record(item, "Race");
  exactKeys(race, ["meeting_number", "date", "track", "number", "time", "name", "horses"], "Race");
  const meetingNumber = identifier(race.meeting_number, "Meeting number");
  const raceNumber = identifier(race.number, "Race number");
  const raceId = `R${meetingNumber}C${raceNumber}`;
  if (raceIds.has(raceId)) throw new FantasyPeakpoolMarketError(`Peakpool fixture contains duplicate race ${raceId}.`);
  raceIds.add(raceId);
  if (!Array.isArray(race.horses) || race.horses.length === 0 || race.horses.length > MAX_RUNNERS) {
    throw new FantasyPeakpoolMarketError(`Race ${raceId} has an invalid runner collection.`);
  }
  const runnerNumbers = new Set<number>();
  const runners = race.horses.map((runnerItem): FantasyPeakpoolRunner => {
    const runner = record(runnerItem, "Runner");
    exactKeys(runner, ["no", "name", "type"], "Runner");
    const runnerNumber = identifier(runner.no, "Runner number", true);
    if (runnerNumbers.has(runnerNumber)) {
      throw new FantasyPeakpoolMarketError(`Race ${raceId} has duplicate runner ${runnerNumber}.`);
    }
    runnerNumbers.add(runnerNumber);
    return {
      runnerNumber,
      name: boundedString(runner.name, "Runner name"),
      ...classifyPrice(runner.type),
    };
  });
  const offTime = boundedString(race.time, "Race time");
  if (!/^\d{1,2}:\d{2}$/.test(offTime)) throw new FantasyPeakpoolMarketError("Race time is invalid.");
  return {
    meetingNumber,
    programmeDate: boundedString(race.date, "Race date"),
    track: boundedString(race.track, "Race track"),
    raceNumber,
    offTime: offTime.padStart(5, "0"),
    name: boundedString(race.name, "Race name"),
    runners,
  };
}

export function parseFantasyPeakpoolPayload(
  input: string | Uint8Array,
  observedAt = new Date().toISOString(),
): FantasyPeakpoolMarketSnapshot {
  const { bytes, decoded } = decodeRaceArray(input, false);
  const raceIds = new Set<string>();
  return snapshot(bytes, observedAt, decoded.map((item) => parseRace(item, raceIds)));
}

export function parseFantasyPeakpoolPayloadTolerant(
  input: string | Uint8Array,
  observedAt = new Date().toISOString(),
): TolerantFantasyPeakpoolMarketSnapshot {
  const { bytes, decoded } = decodeRaceArray(input, true);
  const raceIds = new Set<string>();
  const races: FantasyPeakpoolRace[] = [];
  let rejectedRaceCount = 0;
  for (const item of decoded) {
    try {
      races.push(parseRace(item, raceIds));
    } catch (error) {
      if (!(error instanceof FantasyPeakpoolMarketError)) throw error;
      rejectedRaceCount += 1;
    }
  }
  return { ...snapshot(bytes, observedAt, races), rejectedRaceCount };
}

export function createUnavailableFantasyPeakpoolSnapshot(
  input: string | Uint8Array,
  observedAt = new Date().toISOString(),
): TolerantFantasyPeakpoolMarketSnapshot {
  const candidate = bodyBytes(input);
  const bytes = candidate.byteLength > 0 && candidate.byteLength <= MAX_BODY_BYTES
    ? candidate
    : new TextEncoder().encode("[]");
  return { ...snapshot(bytes, observedAt, []), rejectedRaceCount: 0 };
}
