export type EdgeRace = {
  id: string;
  programme_date: string;
  racecourse: string;
  race_number: number;
  race_name?: string | null;
  official_off_at: string;
};

export type EdgeRunner = { id: string; runner_number: number; runner_name: string };

export type ObservedRaceIdentity = {
  programmeDate?: string; course?: string; scheduledAt?: string; raceNumber?: number; raceName?: string;
};

export function isAtrAccessChallenge(html: string): boolean {
  // ATR also includes /_fs-ch-.../assets/script.js on genuine result pages.
  const withoutPassiveScript = html.replace(/<script\b[^>]*src=["']\/_fs-ch-[^"']+\/assets\/script\.js["'][^>]*>\s*<\/script>/gi, "");
  return /_fs[-_]ch|client\s+challenge|checking your browser|f5 challenge|javascript is disabled in your browser|access challenge or unavailable result/i.test(withoutPassiveScript);
}

function londonInstant(local: string): string | undefined {
  if (!/^\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}$/.test(local)) return undefined;
  const possible = [0, 60].map(offset => new Date(Date.parse(`${local}Z`) - offset * 60_000));
  const matches = possible.filter(date => {
    if (!Number.isFinite(date.getTime())) return false;
    const p = Object.fromEntries(new Intl.DateTimeFormat("en-GB", { timeZone: "Europe/London", year: "numeric", month: "2-digit",
      day: "2-digit", hour: "2-digit", minute: "2-digit", second: "2-digit", hourCycle: "h23" }).formatToParts(date).map(x => [x.type, x.value]));
    return `${p.year}-${p.month}-${p.day}T${p.hour}:${p.minute}:${p.second}` === local;
  });
  return matches.length === 1 ? matches[0].toISOString() : undefined;
}

// Return complete nested DIV elements, rather than mixing adjacent result rows.
function divBlocks(html: string, attribute: RegExp): string[] {
  const blocks: string[] = [];
  const tags = [...html.matchAll(/<\/?div\b[^>]*>/gi)];
  for (let i = 0; i < tags.length; i++) {
    if (!attribute.test(tags[i][0]) || /^<\//.test(tags[i][0])) continue;
    let depth = 1, j = i + 1;
    for (; j < tags.length; j++) {
      depth += /^<\//.test(tags[j][0]) ? -1 : 1;
      if (!depth) break;
    }
    if (!depth) blocks.push(html.slice(tags[i].index, tags[j].index! + tags[j][0].length));
    i = j;
  }
  return blocks;
}

// Request parameters are deliberately not accepted by this extractor. Unsupported
// or ambiguous response layouts are review-only, never filled from the target URL.
export function extractAtrIdentity(html: string): ObservedRaceIdentity {
  if (isAtrAccessChallenge(html)) return {};
  const events: Record<string, unknown>[] = [];
  const visit = (value: unknown): void => {
    if (Array.isArray(value)) { value.forEach(visit); return; }
    if (!value || typeof value !== "object") return;
    const item = value as Record<string, unknown>;
    if (item["@type"] === "SportsEvent") events.push(item);
    if (item["@graph"]) visit(item["@graph"]);
  };
  for (const match of html.matchAll(/<script[^>]*type=["']application\/ld\+json["'][^>]*>([\s\S]*?)<\/script>/gi)) {
    try { visit(JSON.parse(match[1])); } catch { /* Not evidence. */ }
  }
  const headings = [...html.matchAll(/<h1\b[^>]*>([\s\S]*?)<\/h1>/gi)];
  if (events.length !== 1) return {};
  const event = events[0];
  if (headings.length === 0 && typeof event.url === "string" && typeof event.startDate === "string") {
    // Live ATR layout captured 2026-09-05: local London time + response URL,
    // numbered race header and explicit title, all independently published.
    const header = divBlocks(html, /class=["'][^"']*\brace-header\b[^"']*["']/i);
    if (header.length !== 1) return {};
    const h = header[0];
    const number = h.match(/class=["']post__number["'][^>]*>\s*(\d+)\s*</i)?.[1];
    const title = h.match(/<p class=["']p--medium["'][^>]*>\s*<b>([\s\S]*?)<\/b>/i)?.[1];
    const heading = h.match(/<h2\b[^>]*>([\s\S]*?)<\/h2>/i)?.[1];
    let url: URL;
    try { url = new URL(event.url); } catch { return {}; }
    const path = url.pathname.match(/^\/racecard\/([^/]+)\/(\d{2})-([A-Za-z]+)-(\d{4})\/(\d{2})(\d{2})$/);
    if (url.origin !== "https://www.attheraces.com" || !path || !number || !title || !heading) return {};
    const scheduledAt = londonInstant(event.startDate);
    if (!scheduledAt || !event.startDate.endsWith(`T${path[5]}:${path[6]}:00`)) return {};
    const course = decodeURIComponent(path[1]).replace(/-/g, " ");
    const publishedDate = `${path[2]} ${path[3].slice(0, 3)} ${path[4]}`;
    if (normalize(text(heading)) !== normalize(`${path[5]}:${path[6]} ${course} ${publishedDate}`)) return {};
    const londonDate = new Intl.DateTimeFormat("en-GB", { timeZone: "Europe/London", day: "2-digit", month: "short", year: "numeric" }).format(new Date(scheduledAt));
    if (normalize(londonDate.replace("Sept", "Sep")) !== normalize(publishedDate)) return {};
    const p = Object.fromEntries(new Intl.DateTimeFormat("en-GB", { timeZone: "Indian/Mauritius", year: "numeric", month: "2-digit", day: "2-digit" }).formatToParts(new Date(scheduledAt)).map(x => [x.type, x.value]));
    return { course, programmeDate: `${p.year}-${p.month}-${p.day}`, scheduledAt, raceNumber: Number(number), raceName: text(title) };
  }
  if (headings.length !== 1) return {};
  const start = event.startDate;
  const location = event.location as { name?: unknown } | undefined;
  if (typeof start !== "string" || !/^\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}(?:\.\d+)?(?:Z|[+-]\d{2}:\d{2})$/.test(start)
    || !Number.isFinite(Date.parse(start)) || typeof location?.name !== "string") return {};
  const course = text(location.name);
  const heading = text(headings[0][1]).match(/^(\d{2}:\d{2})\s+(.+?)\s+-\s+Race\s+(\d+)(?:\s+-\s+(.+))?$/i);
  const date = new Date(start);
  const londonTime = new Intl.DateTimeFormat("en-GB", { timeZone: "Europe/London", hour: "2-digit", minute: "2-digit", hourCycle: "h23" }).format(date);
  if (!course || !heading || normalize(heading[2]) !== normalize(course) || heading[1] !== londonTime) return {};
  const raceNumber = Number(heading[3]);
  if (!Number.isSafeInteger(raceNumber) || raceNumber < 1) return {};
  const parts = Object.fromEntries(new Intl.DateTimeFormat("en-GB", { timeZone: "Indian/Mauritius",
    year: "numeric", month: "2-digit", day: "2-digit" }).formatToParts(date).map(p => [p.type, p.value]));
  return { programmeDate: `${parts.year}-${parts.month}-${parts.day}`, course,
    scheduledAt: date.toISOString(), raceNumber, ...(heading[4] ? { raceName: heading[4] } : {}) };
}

export type EdgeObservation = {
  observedIdentity?: ObservedRaceIdentity;
  race_id: string;
  provider: "at-the-races" | "zone-turf";
  source_url: string;
  retrieved_at: string;
  programme_date: string;
  course: string;
  scheduled_at?: string;
  race_number: number;
  race_name?: string;
  status: "CONFIRMED" | "VOID" | "NEEDS_REVIEW";
  finishing_order: Array<{
    position: number;
    runnerNumber: number;
    runnerName: string;
    finalizedStartingPriceRaw?: string;
  }>;
  non_runners: Array<{ runnerNumber: number; runnerName: string }>;
  payload_hash: string;
  sanitized_fragment: string;
};

function normalize(value: string): string {
  return value.normalize("NFD").replace(/[\u0300-\u036f]/g, "").replace(/[^a-z0-9]/gi, "").toLowerCase();
}

function text(value: string): string {
  return value.replace(/<(script|style)\b[^>]*>[\s\S]*?<\/\1>/gi, " ").replace(/<[^>]*>/g, " ").replace(/&amp;/gi, "&").replace(/&#39;|&apos;/gi, "'").replace(/\s+/g, " ").trim();
}

function finalizedStartingPrice(rowHtml: string): string | undefined {
  const dataValue = rowHtml.match(/data-(?:starting-price|sp)=["']([^"']+)["']/i)?.[1];
  let candidate = dataValue ? text(dataValue) : undefined;
  if (!candidate) {
    for (const match of rowHtml.matchAll(/<[^>]*class=["']([^"']*)["'][^>]*>([^<]*)</gi)) {
      const classes = match[1].toLowerCase().split(/\s+/);
      if (classes.some((name) => ["starting-price", "result-price", "odds", "sp"].includes(name))) {
        candidate = text(match[2]);
        break;
      }
    }
  }
  if (!candidate || candidate.length > 20) return undefined;
  return /^(?:(?:[1-9]\d{0,3}\/[1-9]\d{0,3})|(?:evs|evens))(?:\s*(?:f|jf|[2-9]f))?$/i.test(candidate)
    ? candidate
    : undefined;
}

export function finishingRows(html: string): EdgeObservation["finishing_order"] {
  const resultPanels = divBlocks(html, /\bid=["']tab-full-result["']/i);
  if (resultPanels.length === 1) {
    const entries = divBlocks(resultPanels[0], /class=["'][^"']*\bcard-entry\b[^"']*["']/i);
    if (entries.length && !/data-position=/.test(resultPanels[0])) return entries.map(entry => {
      const positionText = text(divBlocks(entry, /class=["']card-no-draw__inner["']/i)[0] ?? "");
      const horse = entry.match(/<h2\b[^>]*>\s*<span>\s*(\d+)\.\s*<\/span>\s*<a\b[^>]*class=["'][^"']*\bhorse__link\b[^"']*["'][^>]*>([\s\S]*?)<\/a>/i);
      const odds = text(divBlocks(entry, /class=["'][^"']*\bcard-cell--odds\b[^"']*["']/i)[0] ?? "").replace(/\b([2-9]?|J)Fav\b/gi, "$1F");
      if (!/^\d+$/.test(positionText) || !horse) throw new Error("ATR_RESULT_ROW_UNSUPPORTED");
      const price = finalizedStartingPrice(`<span class="sp">${odds}</span>`);
      return { position: Number(positionText), runnerNumber: Number(horse[1]), runnerName: text(horse[2]),
        ...(price ? { finalizedStartingPriceRaw: price } : {}) };
    });
  }
  const starts = [...html.matchAll(/data-position=["'](\d+)["']/gi)];
  const rows: EdgeObservation["finishing_order"] = [];
  for (let index = 0; index < starts.length; index += 1) {
    const start = starts[index];
    const rowHtml = html.slice(start.index ?? 0, starts[index + 1]?.index ?? html.length).split(/<\/div>/i)[0];
    const position = Number(start[1]);
    const runnerNumber = Number(text(rowHtml.match(/class=["'][^"']*\bcloth\b[^"']*["'][^>]*>([^<]+)</i)?.[1] ?? ""));
    const runnerName = text(rowHtml.match(/class=["'][^"']*\bhorse-name\b[^"']*["'][^>]*>([^<]+)</i)?.[1] ?? "");
    if (Number.isSafeInteger(position) && position > 0 && Number.isSafeInteger(runnerNumber) && runnerNumber >= 0 && runnerName) {
      const price = finalizedStartingPrice(rowHtml);
      rows.push({ position, runnerNumber, runnerName, ...(price ? { finalizedStartingPriceRaw: price } : {}) });
    }
  }
  return rows;
}

async function sha256(value: string): Promise<string> {
  const digest = await crypto.subtle.digest("SHA-256", new TextEncoder().encode(value));
  return [...new Uint8Array(digest)].map((byte) => byte.toString(16).padStart(2, "0")).join("");
}

export function atrDetailUrl(race: EdgeRace): string {
  const date = new Date(race.official_off_at);
  const parts = Object.fromEntries(new Intl.DateTimeFormat("en-GB", {
    timeZone: "Europe/London", year: "numeric", month: "2-digit", day: "2-digit", hour: "2-digit", minute: "2-digit", hourCycle: "h23",
  }).formatToParts(date).map((part) => [part.type, part.value]));
  const month = new Intl.DateTimeFormat("en-GB", { timeZone: "Europe/London", month: "long" }).format(date);
  const course = race.racecourse.normalize("NFD").replace(/[\u0300-\u036f]/g, "").replace(/[^a-zA-Z0-9]+/g, "-").replace(/^-|-$/g, "");
  return `https://www.attheraces.com/racecard/${course}/${parts.day}-${month}-${parts.year}/${parts.hour}${parts.minute}`;
}

export async function parseAtrHtml(race: EdgeRace, sourceUrl: string, html: string): Promise<EdgeObservation> {
  if (!html || html.length > 2_000_000) throw new Error("ATR result body is outside the safe size limit.");
  const retrievedAt = new Date().toISOString();
  const observedIdentity = extractAtrIdentity(html);
  const common = {
    observedIdentity,
    race_id: race.id, provider: "at-the-races" as const, source_url: sourceUrl, retrieved_at: retrievedAt,
    programme_date: observedIdentity.programmeDate ?? race.programme_date,
    course: observedIdentity.course ?? race.racecourse, race_number: observedIdentity.raceNumber ?? race.race_number,
    ...(observedIdentity.raceName ? { race_name: observedIdentity.raceName } : {}), payload_hash: await sha256(html),
  };
  if (isAtrAccessChallenge(html)) {
    return { ...common, status: "NEEDS_REVIEW", finishing_order: [], non_runners: [], sanitized_fragment: "Access challenge received" };
  }
  if (/race abandoned|race void|no contest/i.test(text(html))) {
    return { ...common, ...(observedIdentity.scheduledAt ? { scheduled_at: observedIdentity.scheduledAt } : {}), status: "VOID", finishing_order: [], non_runners: [], sanitized_fragment: "Race reported void or abandoned" };
  }
  const scheduledAt = observedIdentity.scheduledAt;
  const finishingOrder = finishingRows(html);
  const nonRunners: EdgeObservation["non_runners"] = [];
  for (const match of html.matchAll(/class=["']non-runner["'][^>]*data-number=["'](\d+)["'][^>]*>([^<]+)</gi)) {
    nonRunners.push({ runnerNumber: Number(match[1]), runnerName: text(match[2]) });
  }
  const winners = finishingOrder.filter((row) => row.position === 1);
  const confirmed = /weighed in/i.test(text(html)) && winners.length > 0
    && winners.every((row) => Boolean(row.finalizedStartingPriceRaw));
  return {
    ...common, ...(scheduledAt ? { scheduled_at: scheduledAt } : {}), status: confirmed ? "CONFIRMED" : "NEEDS_REVIEW",
    finishing_order: finishingOrder, non_runners: nonRunners, sanitized_fragment: text(html).slice(0, 2000),
  };
}

export function matchEdgeObservation(race: EdgeRace, runners: EdgeRunner[], observation: EdgeObservation) {
  const identity = observation.observedIdentity ?? {};
  const timeMatch = Boolean(identity.scheduledAt)
    && Math.abs(new Date(race.official_off_at).getTime() - new Date(identity.scheduledAt as string).getTime()) <= 5 * 60_000;
  const evidence = {
    date: Boolean(identity.programmeDate) && identity.programmeDate === race.programme_date,
    course: Boolean(identity.course) && normalize(identity.course ?? "") === normalize(race.racecourse),
    time: timeMatch,
    raceNumber: identity.raceNumber === race.race_number,
    raceName: race.race_name ? Boolean(identity.raceName) && normalize(identity.raceName ?? "") === normalize(race.race_name) : Boolean(identity.raceNumber),
    winnerPrices: observation.finishing_order.filter((row) => row.position === 1).length > 0
      && observation.finishing_order.filter((row) => row.position === 1).every((row) => Boolean(row.finalizedStartingPriceRaw)),
  };
  if (observation.status === "VOID" && evidence.date && evidence.course && evidence.time && evidence.raceNumber && evidence.raceName) {
    return { status: "VOID", winner_runner_ids: [], non_runner_ids: [], confidence: 1, match_evidence: evidence };
  }
  const winnerRows = observation.finishing_order.filter((row) => row.position === 1);
  const resolve = (source: { runnerNumber: number; runnerName: string }) => {
    const matches = runners.filter((runner) => runner.runner_number === source.runnerNumber && normalize(runner.runner_name) === normalize(source.runnerName));
    return matches.length === 1 ? matches[0].id : undefined;
  };
  const field = [...observation.finishing_order, ...observation.non_runners];
  const runnerField = field.length > 0 && field.every(row => Boolean(resolve(row)))
    && new Set(field.map(row => row.runnerNumber)).size === field.length;
  const winners = winnerRows.map(resolve).filter((id): id is string => Boolean(id));
  const nonRunners = observation.non_runners.map(resolve).filter((id): id is string => Boolean(id));
  const confirmed = observation.status === "CONFIRMED" && Object.values(evidence).every(Boolean) && runnerField
    && winners.length > 0 && winners.length === winnerRows.length;
  const allEvidence = { ...evidence, runnerField };
  return {
    status: confirmed ? "CONFIRMED" : "NEEDS_REVIEW",
    winner_runner_ids: confirmed ? winners : [], non_runner_ids: confirmed ? nonRunners : [],
    confidence: confirmed ? 1 : Object.values(allEvidence).filter(Boolean).length / Object.keys(allEvidence).length,
    match_evidence: allEvidence,
  };
}

export async function parseZoneTurfHtml(race: EdgeRace, sourceUrl: string, html: string): Promise<EdgeObservation> {
  const retrievedAt = new Date().toISOString();
  const common = {
    race_id: race.id, provider: "zone-turf" as const, source_url: sourceUrl, retrieved_at: retrievedAt,
    programme_date: race.programme_date, course: race.racecourse, race_number: race.race_number,
    ...(race.race_name ? { race_name: race.race_name } : {}), payload_hash: await sha256(html),
  };

  const finishingOrder: EdgeObservation["finishing_order"] = [];
  const rows = html.split(/<tr[^>]*>/gi).slice(1);
  for (const row of rows) {
    const posMatch = row.match(/<td[^>]*>(\d+)<\/td>/i);
    const numMatch = row.match(/<td[^>]*>(\d+)<\/td>/i);
    const nameMatch = row.match(/<a[^>]*>([\s\S]*?)<\/a>/i);
    const oddsMatch = row.match(/\*\*([\d\.,]+)\*\*/);

    if (posMatch && nameMatch && oddsMatch) {
      const price = oddsMatch[1].replace(',', '.');
      finishingOrder.push({
        position: Number(posMatch[1]),
        runnerNumber: Number(numMatch ? numMatch[1] : 0),
        runnerName: text(nameMatch[1]),
        finalizedStartingPriceRaw: price,
      });
    }
  }

  const confirmed = finishingOrder.length > 0;
  return {
    ...common, status: confirmed ? "CONFIRMED" : "NEEDS_REVIEW",
    finishing_order: finishingOrder, non_runners: [], sanitized_fragment: text(html).slice(0, 2000),
  };
}
