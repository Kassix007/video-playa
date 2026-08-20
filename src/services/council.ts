export type CouncilHorse = {
  number: number;
  name: string;
  probability: number;
};

export type CouncilResult = {
  race_id: string;
  racecourse: string;
  race_number: number;
  off_time: string;
  distance: string;
  surface: string;
  going: string;
  race_type: string;
  field_size: number;
  most_likely_winner: CouncilHorse;
  principal_danger: CouncilHorse;
  best_value: CouncilHorse;
  ranking: CouncilHorse[];
  confidence: "low" | "medium" | "high";
  strongest_loss_reason: string;
  final_selection: string;
  council_status: string;
  analysed_at: string;
};

export type CouncilDay = {
  date: string;
  timezone: "Indian/Mauritius";
  count: number;
  results: CouncilResult[];
};

export type CouncilDateCount = {
  date: string;
  count: number;
};

export function isCouncilResult(value: unknown): value is CouncilResult {
  if (!value || typeof value !== "object") return false;
  const result = value as Partial<CouncilResult>;
  return typeof result.race_id === "string"
    && typeof result.racecourse === "string"
    && typeof result.race_number === "number"
    && typeof result.off_time === "string"
    && typeof result.race_type === "string"
    && typeof result.most_likely_winner?.number === "number"
    && typeof result.most_likely_winner.name === "string"
    && typeof result.most_likely_winner.probability === "number"
    && typeof result.principal_danger?.name === "string"
    && typeof result.best_value?.name === "string"
    && Array.isArray(result.ranking)
    && typeof result.final_selection === "string"
    && typeof result.council_status === "string"
    && typeof result.analysed_at === "string";
}

function isCouncilDay(value: unknown): value is CouncilDay {
  if (!value || typeof value !== "object") return false;
  const day = value as Partial<CouncilDay>;
  return typeof day.date === "string"
    && day.timezone === "Indian/Mauritius"
    && typeof day.count === "number"
    && Array.isArray(day.results)
    && day.results.every(isCouncilResult);
}

async function loadJson(url: string, signal?: AbortSignal): Promise<unknown> {
  const response = await fetch(url, {
    cache: "no-store",
    headers: { Accept: "application/json" },
    signal,
  });
  const payload = await response.json().catch(() => null) as { error?: unknown } | null;
  if (!response.ok) {
    throw new Error(typeof payload?.error === "string" ? payload.error : `Council archive returned HTTP ${response.status}.`);
  }
  return payload;
}

export async function loadTodayCouncil(signal?: AbortSignal): Promise<CouncilDay> {
  const payload = await loadJson("/api/council/today", signal);
  if (!isCouncilDay(payload)) throw new Error("Today's Council response was malformed.");
  return payload;
}

export async function loadCouncilHistoryDate(
  date: string,
  signal?: AbortSignal,
): Promise<CouncilDay> {
  const payload = await loadJson(`/api/council/history?date=${encodeURIComponent(date)}`, signal);
  if (!isCouncilDay(payload)) throw new Error("The Council history response was malformed.");
  return payload;
}

export async function loadCouncilHistoryDates(
  month: string,
  signal?: AbortSignal,
): Promise<CouncilDateCount[]> {
  const payload = await loadJson(`/api/council/history/dates?month=${encodeURIComponent(month)}`, signal);
  if (!payload || typeof payload !== "object") throw new Error("The Council calendar response was malformed.");
  const dates = (payload as { dates?: unknown }).dates;
  if (!Array.isArray(dates) || !dates.every((item) => item
    && typeof item === "object"
    && typeof (item as CouncilDateCount).date === "string"
    && typeof (item as CouncilDateCount).count === "number")) {
    throw new Error("The Council calendar response was malformed.");
  }
  return dates as CouncilDateCount[];
}

export function getMauritiusToday(): string {
  const parts = new Intl.DateTimeFormat("en-GB", {
    timeZone: "Indian/Mauritius",
    year: "numeric",
    month: "2-digit",
    day: "2-digit",
  }).formatToParts(new Date());
  const values = Object.fromEntries(parts.map((part) => [part.type, part.value]));
  return `${values.year}-${values.month}-${values.day}`;
}
