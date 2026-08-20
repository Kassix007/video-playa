import { PDFParse } from "pdf-parse";
import { z } from "zod";
import {
  formatMauritiusTimestamp,
  getMauritiusDate,
  MAURITIUS_TIMEZONE,
} from "./mauritius-time.js";

export { getMauritiusDate } from "./mauritius-time.js";

export const SMSPARIAZ_RACECARD_SOURCE = "https://www.smspariaz.com/racecard/";

const MAX_RACECARD_BYTES = 20 * 1024 * 1024;
const FETCH_TIMEOUT_MS = 25_000;

export const SmspariazRaceSchema = z.object({
  race_id: z.string().regex(/^R\d+C\d+$/),
  meeting_number: z.number().int().positive(),
  race_number: z.number().int().positive(),
  racecourse: z.string().min(1),
  off_time: z.string().regex(/^\d{2}:\d{2}$/),
  off_time_mauritius: z.string().regex(/^\d{2}:\d{2}$/),
  race_name: z.string().min(1).optional(),
  country: z.string().min(1).optional(),
  discipline: z.string().min(1).optional(),
  distance: z.string().min(1).optional(),
}).strict();

export const SmspariazMeetingSchema = z.object({
  meeting_number: z.number().int().positive(),
  racecourse: z.string().min(1),
  country: z.string().min(1).optional(),
  race_count: z.number().int().positive(),
  race_ids: z.array(z.string().regex(/^R\d+C\d+$/)).min(1),
}).strict();

export const SmspariazRacecardSuccessSchema = z.object({
  success: z.literal(true),
  programme_date: z.string().regex(/^\d{4}-\d{2}-\d{2}$/),
  timezone: z.literal(MAURITIUS_TIMEZONE),
  fetched_at: z.string().min(1),
  source: z.literal(SMSPARIAZ_RACECARD_SOURCE),
  meeting_count: z.number().int().nonnegative(),
  race_count: z.number().int().nonnegative(),
  french_race_count: z.number().int().nonnegative(),
  meetings: z.array(SmspariazMeetingSchema),
  races: z.array(SmspariazRaceSchema),
}).strict();

export const SmspariazRacecardErrorCodeSchema = z.enum([
  "SMSPARIAZ_RACECARD_FETCH_FAILED",
  "SMSPARIAZ_RACECARD_STALE",
  "SMSPARIAZ_RACECARD_PARSE_FAILED",
  "SMSPARIAZ_RACECARD_DATE_MISMATCH",
]);

export const SmspariazRacecardFailureSchema = z.object({
  success: z.literal(false),
  programme_date: z.string().regex(/^\d{4}-\d{2}-\d{2}$/),
  timezone: z.literal(MAURITIUS_TIMEZONE),
  fetched_at: z.string().min(1),
  source: z.literal(SMSPARIAZ_RACECARD_SOURCE),
  error_code: SmspariazRacecardErrorCodeSchema,
  error: z.string().min(1),
}).strict();

export const SmspariazRacecardResponseSchema = z.discriminatedUnion("success", [
  SmspariazRacecardSuccessSchema,
  SmspariazRacecardFailureSchema,
]);

export type SmspariazRace = z.infer<typeof SmspariazRaceSchema>;
export type SmspariazRacecardSuccess = z.infer<typeof SmspariazRacecardSuccessSchema>;
export type SmspariazRacecardFailure = z.infer<typeof SmspariazRacecardFailureSchema>;
export type SmspariazRacecardResponse = z.infer<typeof SmspariazRacecardResponseSchema>;

type FetchImplementation = (
  input: string | URL | Request,
  init?: RequestInit,
) => Promise<Response>;

export type SmspariazRacecardOptions = {
  fetchImpl?: FetchImplementation;
  now?: () => Date;
  extractPdfText?: (data: Uint8Array) => Promise<string>;
};

class RacecardFetchError extends Error {}
class RacecardParseError extends Error {}

class RacecardDateMismatchError extends Error {
  constructor(
    message: string,
    readonly actualDate: string | null,
  ) {
    super(message);
  }
}

const FRENCH_MONTHS = new Map([
  ["JANVIER", 1], ["FEVRIER", 2], ["MARS", 3], ["AVRIL", 4], ["MAI", 5], ["JUIN", 6],
  ["JUILLET", 7], ["AOUT", 8], ["SEPTEMBRE", 9], ["OCTOBRE", 10], ["NOVEMBRE", 11], ["DECEMBRE", 12],
]);

const ENGLISH_MONTHS = new Map([
  ["JANUARY", 1], ["FEBRUARY", 2], ["MARCH", 3], ["APRIL", 4], ["MAY", 5], ["JUNE", 6],
  ["JULY", 7], ["AUGUST", 8], ["SEPTEMBER", 9], ["OCTOBER", 10], ["NOVEMBER", 11], ["DECEMBER", 12],
]);

function normalizeForMatching(value: string): string {
  return value
    .normalize("NFD")
    .replace(/[\u0300-\u036f]/g, "")
    .toUpperCase();
}

function isoDate(year: number, month: number, day: number): string | null {
  const candidate = new Date(Date.UTC(year, month - 1, day));
  if (candidate.getUTCFullYear() !== year
    || candidate.getUTCMonth() !== month - 1
    || candidate.getUTCDate() !== day) return null;
  return `${String(year).padStart(4, "0")}-${String(month).padStart(2, "0")}-${String(day).padStart(2, "0")}`;
}

function extractFilenameDate(contentDisposition: string | null): string | null {
  const match = contentDisposition?.match(/Racecards?-(\d{4}-\d{2}-\d{2})\.pdf/i);
  return match?.[1] ?? null;
}

export function extractProgrammeDates(text: string): string[] {
  const dates = new Set<string>();
  const normalized = normalizeForMatching(text);
  const monthNames = new Map([...FRENCH_MONTHS, ...ENGLISH_MONTHS]);
  const writtenDatePattern = /\b(\d{1,2})\s+([A-Z]+)\s+(20\d{2})\b/g;

  for (const match of normalized.matchAll(writtenDatePattern)) {
    const month = monthNames.get(match[2]);
    if (!month) continue;
    const parsed = isoDate(Number(match[3]), month, Number(match[1]));
    if (parsed) dates.add(parsed);
  }

  for (const match of text.matchAll(/\b(20\d{2})[-/.](\d{1,2})[-/.](\d{1,2})\b/g)) {
    const parsed = isoDate(Number(match[1]), Number(match[2]), Number(match[3]));
    if (parsed) dates.add(parsed);
  }

  return [...dates];
}

function normalizeRaceId(value: string): string {
  return value.toUpperCase().replace(/\s+/g, "");
}

function cleanRacecourse(value: string): string {
  return value
    .replace(/^.*?\b\d{1,2}H\d{2}\s+/i, "")
    .replace(/^.*?\bR\d+C\d+\s+-\s+\d{1,2}H\d{2}\s*/i, "")
    .replace(/^[\s:;,-]+|[\s:;,-]+$/g, "")
    .replace(/\s+/g, " ")
    .trim();
}

function extractDistance(value: string): string | undefined {
  const metric = [...value.matchAll(/\b(\d{3,5})\s*M\b/gi)].at(-1);
  if (metric) return `${metric[1]}m`;
  const imperial = [...value.matchAll(/\b(\d+\s*m(?:\s*\d+\s*f)?|\d+\s*f(?:\s*\d+\s*y)?)\b/gi)].at(-1);
  return imperial?.[1].replace(/\s+/g, " ").toLowerCase();
}

function extractDiscipline(value: string, raceName: string, country?: string): string | undefined {
  const classify = (candidate: string): string | undefined => {
    const normalized = normalizeForMatching(candidate);
    if (/\bMONTE\b/.test(normalized)) return "Mounted Trot";
    if (/\bATTELE\b|\bTROT\b/.test(normalized)) return "Harness";
    if (/\bSTEEPLE|\bCHASE\b/.test(normalized)) return "Steeplechase";
    if (/\bHAIES\b|\bHURDLE/.test(normalized)) return "Hurdles";
    if (/\bPLAT\b/.test(normalized)) return "Flat";
    return undefined;
  };
  const raceNameDiscipline = classify(raceName);
  if (raceNameDiscipline) return raceNameDiscipline;
  const contextDiscipline = classify(value);
  if (contextDiscipline) return contextDiscipline;
  if (country === "United Kingdom") return "Flat";
  return undefined;
}

function cleanRaceName(value: string): string | undefined {
  const cleaned = value
    .replace(/\b(?:Attel[eé]|Mont[eé]|Plat|Trot|Hurdles?|Steeplechase|Chase)\b/gi, "")
    .replace(/\b\d{3,5}\s*M\b/gi, "")
    .replace(/\b(?:\d+\s*m(?:\s*\d+\s*f)?|\d+\s*f(?:\s*\d+\s*y)?)\b/gi, "")
    .replace(/\s+/g, " ")
    .replace(/[\s:;,-]+$/g, "")
    .trim();
  return cleaned || undefined;
}

type CountryMarker = { index: number; country: string };

function extractCountryMarkers(text: string): CountryMarker[] {
  const markers: CountryMarker[] = [];
  const patterns: Array<[RegExp, string]> = [
    [/PROGRAMME DES COURSES FRAN[ÇC]AISES/gi, "France"],
    [/\bUK RACES\b/gi, "United Kingdom"],
    [/\bSOUTH AFRICAN RACES\b/gi, "South Africa"],
    [/\bIRISH RACES\b/gi, "Ireland"],
    [/\bAUSTRALIAN RACES\b/gi, "Australia"],
  ];
  for (const [pattern, country] of patterns) {
    for (const match of text.matchAll(pattern)) markers.push({ index: match.index, country });
  }
  return markers.sort((left, right) => left.index - right.index);
}

function countryAt(markers: CountryMarker[], index: number): string | undefined {
  return markers.filter((marker) => marker.index <= index).at(-1)?.country;
}

function instructionContext(text: string, raceId: string): string {
  const pattern = new RegExp(`(?:Envoyez|Send)\\s*:[^\\n]*${raceId}H\\d+`, "ig");
  const match = pattern.exec(text);
  if (!match) return "";
  return text.slice(Math.max(0, match.index - 180), match.index);
}

function parseTimeMap(text: string): Map<string, string> {
  const times = new Map<string, string>();
  const patterns = [
    /\b(R\d+C\d+)\s*-\s*(\d{1,2})H(\d{2})\b/gi,
    /\b(\d{1,2})H(\d{2})\s*-\s*(R\d+C\d+)\b/gi,
  ];
  for (const [index, pattern] of patterns.entries()) {
    for (const match of text.matchAll(pattern)) {
      const raceId = normalizeRaceId(index === 0 ? match[1] : match[3]);
      const hour = Number(index === 0 ? match[2] : match[1]);
      const minute = Number(match[3 - index]);
      if (hour > 23 || minute > 59) continue;
      times.set(raceId, `${String(hour).padStart(2, "0")}:${String(minute).padStart(2, "0")}`);
    }
  }
  return times;
}

export function parseSmspariazRacecardText(text: string): SmspariazRace[] {
  const normalizedText = text.normalize("NFKC").replaceAll("\0", "").replace(/\u00a0/g, " ");
  const countryMarkers = extractCountryMarkers(normalizedText);
  const times = parseTimeMap(normalizedText);
  const headers = new Map<string, { racecourse: string; raceName: string; country?: string; context: string }>();
  const headerPattern = /^(.+?)\s+-\s+(R\d+C\d+)\s+-\s+(.+)$/gimu;

  for (const match of normalizedText.matchAll(headerPattern)) {
    const raceId = normalizeRaceId(match[2]);
    const racecourse = cleanRacecourse(match[1]);
    const raceName = match[3].trim();
    if (!racecourse || /^R\d+C\d+$/i.test(racecourse) || headers.has(raceId)) continue;
    headers.set(raceId, {
      racecourse,
      raceName,
      country: countryAt(countryMarkers, match.index),
      context: `${raceName}\n${instructionContext(normalizedText, raceId)}`,
    });
  }

  if (headers.size === 0 || times.size === 0) {
    throw new RacecardParseError("The PDF did not contain recognisable race headings and scheduled off times.");
  }

  const missingHeadings = [...times.keys()].filter((raceId) => !headers.has(raceId));
  const missingTimes = [...headers.keys()].filter((raceId) => !times.has(raceId));
  if (missingHeadings.length || missingTimes.length) {
    const details = [
      missingHeadings.length ? `missing headings for ${missingHeadings.join(", ")}` : "",
      missingTimes.length ? `missing off times for ${missingTimes.join(", ")}` : "",
    ].filter(Boolean).join("; ");
    throw new RacecardParseError(`The PDF race list was incomplete: ${details}.`);
  }

  const races = [...headers].map(([raceId, header]): SmspariazRace => {
    const identity = raceId.match(/^R(\d+)C(\d+)$/)!;
    const distance = extractDistance(header.context);
    const raceName = cleanRaceName(header.raceName);
    const offTime = times.get(raceId)!;
    return {
      race_id: raceId,
      meeting_number: Number(identity[1]),
      race_number: Number(identity[2]),
      racecourse: header.racecourse,
      off_time: offTime,
      off_time_mauritius: offTime,
      ...(raceName ? { race_name: raceName } : {}),
      ...(header.country ? { country: header.country } : {}),
      ...(extractDiscipline(header.context, header.raceName, header.country)
        ? { discipline: extractDiscipline(header.context, header.raceName, header.country) }
        : {}),
      ...(distance ? { distance } : {}),
    };
  });

  return races.sort((left, right) => left.off_time.localeCompare(right.off_time)
    || left.meeting_number - right.meeting_number
    || left.race_number - right.race_number);
}

async function extractTextFromPdf(data: Uint8Array): Promise<string> {
  const parser = new PDFParse({ data });
  try {
    const result = await parser.getText();
    return result.text;
  } finally {
    await parser.destroy();
  }
}

function createMeetings(races: SmspariazRace[]): SmspariazRacecardSuccess["meetings"] {
  const grouped = new Map<number, SmspariazRace[]>();
  for (const race of races) grouped.set(race.meeting_number, [...(grouped.get(race.meeting_number) ?? []), race]);
  return [...grouped.entries()]
    .sort(([left], [right]) => left - right)
    .map(([meetingNumber, meetingRaces]) => ({
      meeting_number: meetingNumber,
      racecourse: meetingRaces[0].racecourse,
      ...(meetingRaces[0].country ? { country: meetingRaces[0].country } : {}),
      race_count: meetingRaces.length,
      race_ids: meetingRaces.map((race) => race.race_id),
    }));
}

async function fetchAndParseAttempt(
  fetchImpl: FetchImplementation,
  extractPdfText: (data: Uint8Array) => Promise<string>,
  expectedDate: string,
  retry: boolean,
): Promise<{ races: SmspariazRace[]; documentDate: string }> {
  const url = new URL(SMSPARIAZ_RACECARD_SOURCE);
  if (retry) url.searchParams.set("_horsee_cache_bust", `${Date.now()}-${Math.random().toString(36).slice(2)}`);

  let response: Response;
  try {
    response = await fetchImpl(url, {
      cache: "no-store",
      redirect: "follow",
      headers: {
        Accept: "application/pdf,text/html;q=0.8,*/*;q=0.5",
        "Cache-Control": "no-cache, no-store, max-age=0",
        Pragma: "no-cache",
        "User-Agent": "HORSEE-Racecard/1.0",
      },
      signal: AbortSignal.timeout(FETCH_TIMEOUT_MS),
    });
  } catch (error) {
    throw new RacecardFetchError(`SMSPariaz could not be reached: ${error instanceof Error ? error.message : "network error"}`);
  }

  if (!response.ok) throw new RacecardFetchError(`SMSPariaz returned HTTP ${response.status}.`);
  const contentType = response.headers.get("content-type")?.toLowerCase() ?? "";
  const contentDisposition = response.headers.get("content-disposition");
  const declaredLength = Number(response.headers.get("content-length") ?? "0");
  if (Number.isFinite(declaredLength) && declaredLength > MAX_RACECARD_BYTES) {
    throw new RacecardFetchError(`SMSPariaz returned a racecard larger than ${MAX_RACECARD_BYTES} bytes.`);
  }

  const data = new Uint8Array(await response.arrayBuffer());
  if (data.byteLength === 0 || data.byteLength > MAX_RACECARD_BYTES) {
    throw new RacecardFetchError("SMSPariaz returned an empty or oversized racecard document.");
  }
  const hasPdfMagic = data.byteLength >= 5
    && String.fromCharCode(...data.slice(0, 5)) === "%PDF-";
  if (!hasPdfMagic) {
    throw new RacecardFetchError(`SMSPariaz did not return a PDF (Content-Type: ${contentType || "missing"}).`);
  }

  let text: string;
  try {
    text = await extractPdfText(data);
  } catch (error) {
    throw new RacecardParseError(`The SMSPariaz PDF could not be parsed: ${error instanceof Error ? error.message : "malformed PDF"}`);
  }
  if (!text.trim()) throw new RacecardParseError("The SMSPariaz PDF contained no extractable text.");

  const textDates = extractProgrammeDates(text);
  const filenameDate = extractFilenameDate(contentDisposition);
  if (textDates.length > 1) {
    throw new RacecardDateMismatchError(`The PDF contains conflicting programme dates: ${textDates.join(", ")}.`, textDates[0]);
  }
  const documentDate = textDates[0] ?? filenameDate;
  if (!documentDate) {
    throw new RacecardParseError("The SMSPariaz PDF did not expose a verifiable programme date in its text or filename.");
  }
  if (filenameDate && textDates[0] && filenameDate !== textDates[0]) {
    throw new RacecardDateMismatchError(`The PDF filename date ${filenameDate} conflicts with document date ${textDates[0]}.`, textDates[0]);
  }
  if (documentDate !== expectedDate) {
    throw new RacecardDateMismatchError(`Expected the Mauritius programme for ${expectedDate}, but SMSPariaz returned ${documentDate}.`, documentDate);
  }

  const races = parseSmspariazRacecardText(text);
  return { races, documentDate };
}

export async function getSmspariazDailyRacecard(
  options: SmspariazRacecardOptions = {},
): Promise<SmspariazRacecardResponse> {
  const fetchImpl = options.fetchImpl ?? globalThis.fetch;
  const now = (options.now ?? (() => new Date()))();
  const expectedDate = getMauritiusDate(now);
  const fetchedAt = formatMauritiusTimestamp(now);
  const extractPdfText = options.extractPdfText ?? extractTextFromPdf;
  let lastError: unknown;

  console.info("[HORSEE RACECARD] Fetching SMSPariaz daily racecard");
  for (let attempt = 0; attempt < 2; attempt += 1) {
    if (attempt === 1) console.info("[HORSEE RACECARD] Retrying with cache bypass");
    try {
      const { races, documentDate } = await fetchAndParseAttempt(
        fetchImpl,
        extractPdfText,
        expectedDate,
        attempt === 1,
      );
      const meetings = createMeetings(races);
      const frenchRaceCount = races.filter((race) => race.country === "France").length;
      console.info(`[HORSEE RACECARD] Document date: ${documentDate}`);
      console.info(`[HORSEE RACECARD] Meetings parsed: ${meetings.length}`);
      console.info(`[HORSEE RACECARD] Races parsed: ${races.length}`);
      console.info(`[HORSEE RACECARD] French races: ${frenchRaceCount}`);
      return {
        success: true,
        programme_date: documentDate,
        timezone: MAURITIUS_TIMEZONE,
        fetched_at: fetchedAt,
        source: SMSPARIAZ_RACECARD_SOURCE,
        meeting_count: meetings.length,
        race_count: races.length,
        french_race_count: frenchRaceCount,
        meetings,
        races,
      };
    } catch (error) {
      lastError = error;
      if (error instanceof RacecardDateMismatchError) {
        console.warn(`[HORSEE RACECARD] Date mismatch: expected ${expectedDate}, got ${error.actualDate ?? "unknown"}`);
      }
    }
  }

  const errorCode = lastError instanceof RacecardDateMismatchError
    ? "SMSPARIAZ_RACECARD_STALE"
    : lastError instanceof RacecardParseError
      ? "SMSPARIAZ_RACECARD_PARSE_FAILED"
      : "SMSPARIAZ_RACECARD_FETCH_FAILED";
  const message = lastError instanceof Error ? lastError.message : "SMSPariaz racecard retrieval failed.";
  console.error(`[HORSEE RACECARD] ${errorCode}: ${message}`);
  return {
    success: false,
    programme_date: expectedDate,
    timezone: MAURITIUS_TIMEZONE,
    fetched_at: fetchedAt,
    source: SMSPARIAZ_RACECARD_SOURCE,
    error_code: errorCode,
    error: message,
  };
}
