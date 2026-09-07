import { createHash } from "node:crypto";
import { z } from "zod";

export const PEAKPOOL_PROGRAMME_PATH = "/service/peakpool_json.php?";
export const PEAKPOOL_PROGRAMME_SOURCE = `https://www.smspariaz.com${PEAKPOOL_PROGRAMME_PATH}`;

const PEAKPOOL_ORIGIN = "https://www.smspariaz.com";
const MAX_RACES = 100;
const MAX_RUNNERS_PER_RACE = 100;
const MAX_DISPLAY_TEXT_LENGTH = 300;
const DEFAULT_TIMEOUT_MS = 10_000;
const DEFAULT_MAX_RESPONSE_BYTES = 1_000_000;

const positiveIdentifierPattern = /^[1-9]\d{0,5}$/;
const runnerIdentifierPattern = /^(?:0|[1-9]\d{0,5})$/;
const selectionCodePattern = /^R[1-9]\d{0,5}C[1-9]\d{0,5}H(?:0|[1-9]\d{0,5})$/;

export const PeakpoolRunnerSchema = z.object({
  runner_number: z.string().regex(runnerIdentifierPattern),
  name: z.string().min(1).max(MAX_DISPLAY_TEXT_LENGTH),
  displayed_pool_value: z.string().min(1).max(MAX_DISPLAY_TEXT_LENGTH).optional(),
  selection_code: z.string().regex(selectionCodePattern),
}).strict();

export const PeakpoolRaceSchema = z.object({
  meeting_number: z.string().regex(positiveIdentifierPattern),
  race_number: z.string().regex(positiveIdentifierPattern),
  date: z.string().min(1).max(MAX_DISPLAY_TEXT_LENGTH).optional(),
  time: z.string().min(1).max(MAX_DISPLAY_TEXT_LENGTH).optional(),
  track: z.string().min(1).max(MAX_DISPLAY_TEXT_LENGTH).optional(),
  name: z.string().min(1).max(MAX_DISPLAY_TEXT_LENGTH).optional(),
  runners: z.array(PeakpoolRunnerSchema).min(1).max(MAX_RUNNERS_PER_RACE),
}).strict();

export const PeakpoolProgrammeSchema = z.object({
  source: z.literal(PEAKPOOL_PROGRAMME_SOURCE),
  retrieved_at: z.string().datetime(),
  fixture_fingerprint: z.string().regex(/^[a-f0-9]{64}$/),
  races: z.array(PeakpoolRaceSchema).min(1).max(MAX_RACES),
}).strict();

export type PeakpoolRunner = z.infer<typeof PeakpoolRunnerSchema>;
export type PeakpoolRace = z.infer<typeof PeakpoolRaceSchema>;
export type PeakpoolProgramme = z.infer<typeof PeakpoolProgrammeSchema>;

export type PeakpoolProgrammeErrorCode = "PEAKPOOL_PROGRAMME_UNAVAILABLE" | "PEAKPOOL_PROGRAMME_INVALID";

export class PeakpoolProgrammeError extends Error {
  constructor(readonly code: PeakpoolProgrammeErrorCode, message: string) {
    super(message);
    this.name = "PeakpoolProgrammeError";
  }
}

type FetchLike = (input: string | URL | Request, init?: RequestInit) => Promise<Response>;

export interface PeakpoolProgrammeClientOptions {
  readonly baseUrl: string;
  readonly fetchImpl?: FetchLike;
  readonly now?: () => Date;
  readonly requestTimeoutMs?: number;
  readonly maxResponseBytes?: number;
}

function recordValue(value: unknown): Record<string, unknown> | null {
  return value !== null && typeof value === "object" && !Array.isArray(value)
    ? value as Record<string, unknown>
    : null;
}

function invalidFixture(message: string): never {
  throw new PeakpoolProgrammeError("PEAKPOOL_PROGRAMME_INVALID", message);
}

function sourceIdentifier(value: unknown, field: string, pattern = positiveIdentifierPattern): string {
  const candidate = typeof value === "number" && Number.isSafeInteger(value)
    ? String(value)
    : typeof value === "string"
      ? value.trim()
      : "";
  if (!pattern.test(candidate)) invalidFixture(`Peakpool fixture has an invalid ${field}.`);
  return candidate;
}

function requiredDisplayText(value: unknown, field: string): string {
  if (typeof value !== "string") invalidFixture(`Peakpool fixture has an invalid ${field}.`);
  const text = value.trim();
  if (!text || text.length > MAX_DISPLAY_TEXT_LENGTH) invalidFixture(`Peakpool fixture has an invalid ${field}.`);
  return text;
}

function optionalDisplayText(value: unknown, field: string): string | undefined {
  if (value === undefined || value === null || value === "") return undefined;
  if (typeof value !== "string" && typeof value !== "number") {
    invalidFixture(`Peakpool fixture has an invalid ${field}.`);
  }
  const text = String(value).trim();
  if (!text || text.length > MAX_DISPLAY_TEXT_LENGTH) invalidFixture(`Peakpool fixture has an invalid ${field}.`);
  return text;
}

function parseFixtureValue(value: unknown): { fixture: unknown; fingerprintMaterial: string } {
  if (typeof value !== "string") return { fixture: value, fingerprintMaterial: JSON.stringify(value) };
  try {
    return { fixture: JSON.parse(value) as unknown, fingerprintMaterial: value };
  } catch {
    invalidFixture("Peakpool fixture was not valid JSON.");
  }
}

function parseRace(value: unknown, raceCodes: Set<string>, selectionCodes: Set<string>): PeakpoolRace {
  const race = recordValue(value);
  if (!race) invalidFixture("Peakpool fixture has an invalid race record.");
  const meetingNumber = sourceIdentifier(race.meeting_number, "meeting number");
  const raceNumber = sourceIdentifier(race.number, "race number");
  const raceCode = `R${meetingNumber}C${raceNumber}`;
  if (raceCodes.has(raceCode)) invalidFixture("Peakpool fixture contains duplicate races.");
  raceCodes.add(raceCode);
  if (!Array.isArray(race.horses) || race.horses.length === 0 || race.horses.length > MAX_RUNNERS_PER_RACE) {
    invalidFixture("Peakpool fixture has an invalid runner collection.");
  }

  const runners = race.horses.map((value): PeakpoolRunner => {
    const horse = recordValue(value);
    if (!horse) invalidFixture("Peakpool fixture has an invalid runner record.");
    const runnerNumber = sourceIdentifier(horse.no, "runner number", runnerIdentifierPattern);
    const selectionCode = `${raceCode}H${runnerNumber}`;
    if (selectionCodes.has(selectionCode)) invalidFixture("Peakpool fixture contains duplicate runner selections.");
    selectionCodes.add(selectionCode);
    return PeakpoolRunnerSchema.parse({
      runner_number: runnerNumber,
      name: requiredDisplayText(horse.name, "runner name"),
      ...(optionalDisplayText(horse.type, "runner displayed value")
        ? { displayed_pool_value: optionalDisplayText(horse.type, "runner displayed value") }
        : {}),
      selection_code: selectionCode,
    });
  });

  return PeakpoolRaceSchema.parse({
    meeting_number: meetingNumber,
    race_number: raceNumber,
    ...(optionalDisplayText(race.date, "race date") ? { date: optionalDisplayText(race.date, "race date") } : {}),
    ...(optionalDisplayText(race.time, "race time") ? { time: optionalDisplayText(race.time, "race time") } : {}),
    ...(optionalDisplayText(race.track, "race track") ? { track: optionalDisplayText(race.track, "race track") } : {}),
    ...(optionalDisplayText(race.name, "race name") ? { name: optionalDisplayText(race.name, "race name") } : {}),
    runners,
  });
}

/**
 * Parses only the observed public `peakpool_json.php` fixture shape. It does
 * not authenticate, call any app endpoint, or accept caller-controlled paths.
 */
export function parsePeakpoolProgramme(value: unknown, retrievedAt = new Date().toISOString()): PeakpoolProgramme {
  const { fixture, fingerprintMaterial } = parseFixtureValue(value);
  if (!Array.isArray(fixture)) invalidFixture("Peakpool fixture must be a race array.");
  if (fixture.length === 0) {
    throw new PeakpoolProgrammeError("PEAKPOOL_PROGRAMME_UNAVAILABLE", "Peakpool has no current fixture.");
  }
  if (fixture.length > MAX_RACES) invalidFixture("Peakpool fixture exceeded the maximum race count.");
  const raceCodes = new Set<string>();
  const selectionCodes = new Set<string>();
  try {
    return PeakpoolProgrammeSchema.parse({
      source: PEAKPOOL_PROGRAMME_SOURCE,
      retrieved_at: retrievedAt,
      fixture_fingerprint: createHash("sha256").update(fingerprintMaterial).digest("hex"),
      races: fixture.map((race) => parseRace(race, raceCodes, selectionCodes)),
    });
  } catch (error) {
    if (error instanceof PeakpoolProgrammeError) throw error;
    invalidFixture("Peakpool fixture did not match the observed programme shape.");
  }
}

function approvedOrigin(baseUrl: string): URL | null {
  try {
    const origin = new URL(baseUrl);
    if (origin.protocol !== "https:" || origin.username || origin.password
      || origin.pathname !== "/" || origin.search || origin.hash || origin.origin !== PEAKPOOL_ORIGIN) {
      return null;
    }
    return origin;
  } catch {
    return null;
  }
}

export class PeakpoolProgrammeClient {
  private readonly fetchImpl: FetchLike;
  private readonly now: () => Date;
  private readonly requestTimeoutMs: number;
  private readonly maxResponseBytes: number;

  constructor(private readonly options: PeakpoolProgrammeClientOptions) {
    this.fetchImpl = options.fetchImpl ?? fetch;
    this.now = options.now ?? (() => new Date());
    this.requestTimeoutMs = options.requestTimeoutMs ?? DEFAULT_TIMEOUT_MS;
    this.maxResponseBytes = options.maxResponseBytes ?? DEFAULT_MAX_RESPONSE_BYTES;
  }

  async getProgramme(): Promise<PeakpoolProgramme> {
    const origin = approvedOrigin(this.options.baseUrl);
    if (!origin || !Number.isInteger(this.requestTimeoutMs) || this.requestTimeoutMs < 1_000 || this.requestTimeoutMs > 30_000
      || !Number.isInteger(this.maxResponseBytes) || this.maxResponseBytes < 1_024 || this.maxResponseBytes > 5_000_000) {
      throw new PeakpoolProgrammeError("PEAKPOOL_PROGRAMME_UNAVAILABLE", "Peakpool programme retrieval is not safely configured.");
    }
    const url = new URL(PEAKPOOL_PROGRAMME_PATH, origin);
    if (url.origin !== PEAKPOOL_ORIGIN || url.pathname !== "/service/peakpool_json.php" || url.search !== "") {
      throw new PeakpoolProgrammeError("PEAKPOOL_PROGRAMME_UNAVAILABLE", "Peakpool programme path is not approved.");
    }
    const controller = new AbortController();
    const timer = setTimeout(() => controller.abort(), this.requestTimeoutMs);
    try {
      const response = await this.fetchImpl(url, {
        method: "GET",
        cache: "no-store",
        redirect: "manual",
        headers: {
          Accept: "application/json, text/plain;q=0.9, */*;q=0.1",
        },
        signal: controller.signal,
      });
      if (response.status >= 300 && response.status < 400) {
        throw new PeakpoolProgrammeError("PEAKPOOL_PROGRAMME_UNAVAILABLE", "Peakpool programme returned an unapproved redirect.");
      }
      if (!response.ok) {
        throw new PeakpoolProgrammeError("PEAKPOOL_PROGRAMME_UNAVAILABLE", "Peakpool programme could not be retrieved.");
      }
      const bytes = Buffer.from(await response.arrayBuffer());
      if (bytes.length > this.maxResponseBytes) {
        throw new PeakpoolProgrammeError("PEAKPOOL_PROGRAMME_UNAVAILABLE", "Peakpool programme response exceeded the safe size limit.");
      }
      return parsePeakpoolProgramme(bytes.toString("utf8"), this.now().toISOString());
    } catch (error) {
      if (error instanceof PeakpoolProgrammeError) throw error;
      throw new PeakpoolProgrammeError("PEAKPOOL_PROGRAMME_UNAVAILABLE", "Peakpool programme could not be retrieved.");
    } finally {
      clearTimeout(timer);
    }
  }
}
