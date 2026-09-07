export const PMU_BASE = "https://online.turfinfo.api.pmu.fr/rest/client/1/programme";
export type PmuRace = { id: string; programme_date: string; racecourse: string; race_number: number; race_name?: string | null; official_off_at: string };
export type PmuRunner = { id: string; runner_number: number; runner_name: string };
type Obj = Record<string, unknown>;
function object(value: unknown): Obj { if (!value || typeof value !== "object" || Array.isArray(value)) throw new Error("PMU_INVALID_OBJECT"); return value as Obj; }
function array(value: unknown): unknown[] { if (!Array.isArray(value)) throw new Error("PMU_INVALID_ARRAY"); return value; }
function integer(value: unknown, min = 1): number { if (typeof value !== "number" || !Number.isSafeInteger(value) || value < min) throw new Error("PMU_INVALID_INTEGER"); return value; }
function name(value: unknown): string { if (typeof value !== "string" || !value.trim()) throw new Error("PMU_INVALID_NAME"); return value; }
function normalized(value: unknown): string { return name(value).normalize("NFD").replace(/[\u0300-\u036f]/g, "").replace(/[^a-z0-9]/gi, "").toLowerCase(); }
export function pmuRaceTitle(value: unknown): string { return normalized(name(value).normalize("NFD").replace(/[\u0300-\u036f]/g, "").replace(/\s+(?:attele|monte)\s*$/i, "")); }
export function pmuParticipants(value: unknown) {
  const rows = array(object(value).participants).map(object);
  if (!rows.length || rows.length > 100) throw new Error("PMU_FIELD_INCOMPLETE");
  const seen = new Set<number>();
  return rows.map(p => {
    const runnerNumber = integer(p.numPmu, 0), runnerName = name(p.nom).trim();
    if (seen.has(runnerNumber) || runnerName.length > 300 || !["PARTANT", "NON_PARTANT"].includes(String(p.statut))) throw new Error("PMU_RUNNER_UNMATCHED");
    seen.add(runnerNumber);
    return { runnerNumber, runnerName, active: p.statut === "PARTANT" };
  });
}
function day(milliseconds: number): string {
  const parts = Object.fromEntries(new Intl.DateTimeFormat("en-GB", { timeZone: "Indian/Mauritius", year: "numeric", month: "2-digit", day: "2-digit" }).formatToParts(new Date(milliseconds)).map(p => [p.type, p.value]));
  return `${parts.year}-${parts.month}-${parts.day}`;
}
export function pmuDate(date: string): string {
  if (!/^\d{4}-\d{2}-\d{2}$/.test(date) || new Date(`${date}T00:00:00Z`).toISOString().slice(0, 10) !== date) throw new Error("PMU_INVALID_DATE");
  return date.slice(8, 10) + date.slice(5, 7) + date.slice(0, 4);
}
export function programmeCourses(value: unknown): Obj[] {
  const meetings = array(object(object(value).programme).reunions);
  if (meetings.length > 100) throw new Error("PMU_PROGRAMME_TOO_LARGE");
  return meetings.flatMap(m => array(object(m).courses).map(c => object(c)));
}
export function matchPmuRace(race: PmuRace, courses: unknown[], requireTitle = true): Obj | undefined {
  const matches = courses.filter(value => {
    try {
      const c = object(value), off = integer(c.heureDepart);
      return day(off) === race.programme_date && normalized(object(c.hippodrome).libelleCourt) === normalized(race.racecourse)
        && integer(c.numOrdre) === race.race_number && integer(c.numReunion) > 0
        && Math.abs(off - Date.parse(race.official_off_at)) <= 5 * 60_000
        && (!requireTitle || (Boolean(race.race_name) && pmuRaceTitle(c.libelle) === pmuRaceTitle(race.race_name)));
    } catch { return false; }
  });
  return matches.length === 1 ? object(matches[0]) : undefined;
}
export function pmuDividend(groupValue: unknown, reportValue: unknown): number {
  const group = object(groupValue), report = object(reportValue);
  if (group.typePari !== "SIMPLE_GAGNANT" || group.audience !== "NATIONAL" || group.rembourse !== false
    || group.dividendeUnite !== "PourUnEuro" || report.dividendeUnite !== "PourUnEuro") throw new Error("PMU_WRONG_POOL_OR_UNIT");
  const base = integer(group.miseBase), cents = integer(report.dividendePourUnEuro, 100), baseReturn = integer(report.dividendePourUneMiseDeBase);
  if (cents > 100_000_000 || BigInt(baseReturn) * 100n !== BigInt(cents) * BigInt(base)) throw new Error("PMU_DIVIDEND_INCONSISTENT");
  return cents;
}
export function validatePmuResult(race: PmuRace, runners: PmuRunner[], courseValue: unknown, participantValue: unknown, reportValue: unknown) {
  const c = matchPmuRace(race, [courseValue], false);
  if (!c) throw new Error("PMU_RACE_UNMATCHED");
  if (c.arriveeDefinitive !== true || c.rapportsDefinitifsDisponibles !== true) throw new Error("PMU_RESULT_NOT_FINAL");
  const participants = array(object(participantValue).participants).map(object);
  if (!runners.length || participants.length !== runners.length || participants.length > 100) throw new Error("PMU_FIELD_INCOMPLETE");
  const mapped = new Map<number, PmuRunner>();
  const nonRunnerIds: string[] = [];
  for (const p of participants) {
    const number = integer(p.numPmu, 0);
    const found = runners.filter(r => r.runner_number === number && normalized(r.runner_name) === normalized(p.nom));
    if (mapped.has(number) || found.length !== 1 || !["PARTANT", "NON_PARTANT"].includes(String(p.statut))) throw new Error("PMU_RUNNER_UNMATCHED");
    mapped.set(number, found[0]);
    if (p.statut === "NON_PARTANT") nonRunnerIds.push(found[0].id);
  }
  const order = array(c.ordreArrivee).map(row => array(row).map(n => integer(n, 0)));
  if (!order.length || !order[0].length) throw new Error("PMU_WINNER_MISSING");
  const flattened = order.flat();
  if (new Set(flattened).size !== flattened.length || flattened.some(n => !mapped.has(n))) throw new Error("PMU_ORDER_INVALID");
  for (const p of participants) {
    const number = integer(p.numPmu, 0), position = order.findIndex(row => row.includes(number)) + 1;
    if (p.statut === "NON_PARTANT" && position) throw new Error("PMU_NON_RUNNER_CONFLICT");
    if (position && p.ordreArrivee !== position) throw new Error("PMU_POSITION_CONFLICT");
    if (!position && typeof p.ordreArrivee === "number" && p.ordreArrivee > 0) throw new Error("PMU_ORDER_INCOMPLETE");
  }
  const groups = array(reportValue).map(object).filter(g => g.typePari === "SIMPLE_GAGNANT" && g.audience === "NATIONAL");
  if (groups.length !== 1) throw new Error("PMU_WIN_POOL_MISSING_OR_DUPLICATE");
  const reports = array(groups[0].rapports).map(object);
  if (reports.length !== order[0].length) throw new Error("PMU_WINNER_DIVIDENDS_INCOMPLETE");
  const prices = new Map<number, number>();
  for (const report of reports) {
    if (typeof report.combinaison !== "string" || !/^\d+$/.test(report.combinaison)) throw new Error("PMU_WINNER_INVALID");
    const number = Number(report.combinaison);
    if (!order[0].includes(number) || prices.has(number)) throw new Error("PMU_WINNER_CONFLICT");
    prices.set(number, pmuDividend(groups[0], report));
  }
  const finishing_order = order.flatMap((numbers, index) => numbers.map(number => ({ position: index + 1,
    runnerNumber: number, runnerName: mapped.get(number)!.runner_name,
    ...(prices.has(number) ? { finalizedDividendCents: prices.get(number)! } : {}) })));
  return { provider: "pmu" as const, status: "CONFIRMED" as const, course: name(object(c.hippodrome).libelleCourt),
    programme_date: day(integer(c.heureDepart)), scheduled_at: new Date(integer(c.heureDepart)).toISOString(),
    race_number: integer(c.numOrdre), race_name: name(c.libelle), pmu_meeting: integer(c.numReunion),
    finishing_order, winner_runner_ids: order[0].map(n => mapped.get(n)!.id), non_runner_ids: nonRunnerIds,
    non_runners: participants.filter(p => p.statut === "NON_PARTANT").map(p => ({ runnerNumber: integer(p.numPmu, 0), runnerName: name(p.nom) })),
    participants: pmuParticipants(participantValue), match_method: "COMPLETE_CANONICAL_FIELD" as const,
    payout_divisor: 1, pricing_basis: "PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO" as const };
}

export async function fetchPmuJson(url: string, fetcher: typeof fetch = fetch): Promise<{ value: unknown; raw: string }> {
  const parsed = new URL(url);
  if (parsed.origin !== "https://online.turfinfo.api.pmu.fr" || !/^\/rest\/client\/1\/programme\/\d{8}(?:\/R\d+\/C\d+(?:\/(?:participants|rapports-definitifs))?)?$/.test(parsed.pathname)
    || parsed.search || parsed.hash || parsed.username || parsed.password) throw new Error("PMU_URL_REJECTED");
  const response = await fetcher(url, { method: "GET", redirect: "error", headers: { Accept: "application/json" }, signal: AbortSignal.timeout(12_000) });
  if (!response.ok || !response.body) throw new Error("PMU_FETCH_FAILED");
  const reader = response.body.getReader(), decoder = new TextDecoder("utf-8", { fatal: true });
  let size = 0, raw = "";
  try { while (true) { const { done, value } = await reader.read(); if (done) break; size += value.byteLength;
    if (size > 3_000_000) throw new Error("PMU_BODY_TOO_LARGE"); raw += decoder.decode(value, { stream: true }); }
    raw += decoder.decode(); return { value: JSON.parse(raw), raw };
  } finally { await reader.cancel().catch(() => {}); }
}
