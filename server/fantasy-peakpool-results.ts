import { createHash } from "node:crypto";
import { extractAtrIdentity, finishingRows, isAtrAccessChallenge, matchEdgeObservation, type ObservedRaceIdentity } from "../supabase/functions/_shared/results.js";

export type FantasyResultState = "PENDING" | "PROVISIONAL" | "CONFIRMED" | "VOID" | "NEEDS_REVIEW";
export type ResultOrderRow = {
  position: number;
  runnerNumber: number;
  runnerName: string;
  finalizedStartingPriceRaw?: string;
};
export type ResultNonRunner = { runnerNumber: number; runnerName: string };

export type ResultObservation = {
  observedIdentity?: ObservedRaceIdentity;
  provider: "at-the-races";
  sourceUrl: string;
  retrievedAt: string;
  programmeDate: string;
  course: string;
  scheduledAt?: string;
  raceNumber?: number;
  raceName?: string;
  status: FantasyResultState;
  finishingOrder: ResultOrderRow[];
  nonRunners: ResultNonRunner[];
  rawPayloadSha256: string;
  sanitizedRelevantFragment?: string;
};

type ObservationMetadata = Omit<ResultObservation, "provider" | "status" | "finishingOrder" | "nonRunners" | "rawPayloadSha256" | "scheduledAt">;

function cleanText(value: string): string {
  return value.replace(/<(script|style)\b[^>]*>[\s\S]*?<\/\1>/gi, " ").replace(/<[^>]*>/g, " ").replace(/&amp;/gi, "&").replace(/&#39;|&apos;/gi, "'").replace(/\s+/g, " ").trim();
}

function normalize(value: string): string {
  return value.normalize("NFD").replace(/[\u0300-\u036f]/g, "").replace(/[^a-z0-9]/gi, "").toLowerCase();
}

function finalizedStartingPrice(rowHtml: string): string | undefined {
  const dataValue = rowHtml.match(/data-(?:starting-price|sp)=["']([^"']+)["']/i)?.[1];
  let candidate = dataValue ? cleanText(dataValue) : undefined;
  if (!candidate) {
    for (const match of rowHtml.matchAll(/<[^>]*class=["']([^"']*)["'][^>]*>([^<]*)</gi)) {
      const classes = match[1].toLowerCase().split(/\s+/);
      if (classes.some((name) => ["starting-price", "result-price", "odds", "sp"].includes(name))) {
        candidate = cleanText(match[2]);
        break;
      }
    }
  }
  if (!candidate || candidate.length > 20) return undefined;
  return /^(?:(?:[1-9]\d{0,3}\/[1-9]\d{0,3})|(?:evs|evens))(?:\s*(?:f|jf|[2-9]f))?$/i.test(candidate)
    ? candidate
    : undefined;
}

function parseFinishingOrder(html: string): ResultOrderRow[] {
  const starts = [...html.matchAll(/data-position=["'](\d+)["']/gi)];
  const rows: ResultOrderRow[] = [];
  for (let index = 0; index < starts.length; index += 1) {
    const start = starts[index];
    const startIndex = start.index ?? 0;
    const endIndex = starts[index + 1]?.index ?? html.length;
    const rowHtml = html.slice(startIndex, endIndex).split(/<\/div>/i)[0];
    const position = Number(start[1]);
    const cloth = rowHtml.match(/class=["'][^"']*\bcloth\b[^"']*["'][^>]*>([^<]+)</i)?.[1];
    const horse = rowHtml.match(/class=["'][^"']*\bhorse-name\b[^"']*["'][^>]*>([^<]+)</i)?.[1];
    const runnerNumber = Number(cleanText(cloth ?? ""));
    const runnerName = cleanText(horse ?? "");
    if (Number.isSafeInteger(position) && position > 0 && Number.isSafeInteger(runnerNumber) && runnerNumber >= 0 && runnerName) {
      const price = finalizedStartingPrice(rowHtml);
      rows.push({ position, runnerNumber, runnerName, ...(price ? { finalizedStartingPriceRaw: price } : {}) });
    }
  }
  return rows;
}

export function parseAtrResultHtml(html: string, metadata: ObservationMetadata): ResultObservation {
  if (!html || html.length > 2_000_000) throw new Error("ATR result body is outside the safe size limit.");
  const hash = createHash("sha256").update(html).digest("hex");
  const observedIdentity = extractAtrIdentity(html);
  const common = { provider: "at-the-races" as const, ...metadata, observedIdentity, rawPayloadSha256: hash };
  if (isAtrAccessChallenge(html)) {
    return { ...common, status: "NEEDS_REVIEW", finishingOrder: [], nonRunners: [], sanitizedRelevantFragment: "Access challenge received" };
  }
  if (/race abandoned|race void|no contest/i.test(cleanText(html))) {
    return { ...common, status: "VOID", finishingOrder: [], nonRunners: [], sanitizedRelevantFragment: "Race reported void or abandoned" };
  }
  const finishingOrder = finishingRows(html);
  const nonRunners: ResultNonRunner[] = [];
  for (const match of html.matchAll(/class=["']non-runner["'][^>]*data-number=["'](\d+)["'][^>]*>([^<]+)</gi)) {
    nonRunners.push({ runnerNumber: Number(match[1]), runnerName: cleanText(match[2]) });
  }
  const weighedIn = /weighed in/i.test(cleanText(html));
  const winners = finishingOrder.filter((row) => row.position === 1);
  const finalizedWinnerPrices = winners.length > 0 && winners.every((row) => Boolean(row.finalizedStartingPriceRaw));
  const status: FantasyResultState = weighedIn && finalizedWinnerPrices ? "CONFIRMED" : "NEEDS_REVIEW";
  return {
    ...common,
    ...(observedIdentity.scheduledAt ? { scheduledAt: observedIdentity.scheduledAt } : {}),
    status,
    finishingOrder,
    nonRunners,
    sanitizedRelevantFragment: cleanText(html).slice(0, 2000),
  };
}

export type MatchDecision = {
  status: "CONFIRMED" | "VOID" | "NEEDS_REVIEW";
  winnerRunnerIds: string[];
  nonRunnerIds: string[];
  confidence: number;
  matchEvidence: Record<string, boolean>;
};

export function matchFantasyResult(
  race: { programmeDate: string; course: string; scheduledAt: string; raceNumber: number; raceName?: string },
  runners: Array<{ id: string; number: number; name: string }>,
  observation: ResultObservation,
  aliases: Record<string, string> = {},
): MatchDecision {
  const courseAlias = (course: string) => aliases[normalize(course)] ?? normalize(course);
  const decision = matchEdgeObservation({ id: "", programme_date: race.programmeDate,
    racecourse: courseAlias(race.course), official_off_at: race.scheduledAt,
    race_number: race.raceNumber, race_name: race.raceName },
  runners.map(row => ({ id: row.id, runner_number: row.number, runner_name: row.name })), {
    race_id: "", provider: observation.provider, source_url: observation.sourceUrl,
    retrieved_at: observation.retrievedAt, programme_date: observation.programmeDate,
    course: observation.course, race_number: observation.raceNumber ?? 0,
    observedIdentity: observation.observedIdentity ? { ...observation.observedIdentity,
      course: observation.observedIdentity.course ? courseAlias(observation.observedIdentity.course) : undefined } : undefined,
    status: observation.status === "CONFIRMED" || observation.status === "VOID" ? observation.status : "NEEDS_REVIEW",
    finishing_order: observation.finishingOrder, non_runners: observation.nonRunners,
    payload_hash: observation.rawPayloadSha256, sanitized_fragment: observation.sanitizedRelevantFragment ?? "",
  });
  return { status: decision.status as MatchDecision["status"], winnerRunnerIds: decision.winner_runner_ids,
    nonRunnerIds: decision.non_runner_ids, confidence: decision.confidence, matchEvidence: decision.match_evidence };
}
