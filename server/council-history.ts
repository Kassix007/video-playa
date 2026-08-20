import type { CouncilResult } from "./council-schema.js";
import { getMauritiusDate } from "./mauritius-time.js";

export type CouncilDateCount = {
  date: string;
  count: number;
};

export function isCouncilHistoryDate(value: string): boolean {
  const match = value.match(/^(\d{4})-(\d{2})-(\d{2})$/);
  if (!match) return false;
  const candidate = new Date(Date.UTC(Number(match[1]), Number(match[2]) - 1, Number(match[3])));
  return candidate.getUTCFullYear() === Number(match[1])
    && candidate.getUTCMonth() === Number(match[2]) - 1
    && candidate.getUTCDate() === Number(match[3]);
}

export function isCouncilHistoryMonth(value: string): boolean {
  const match = value.match(/^(\d{4})-(\d{2})$/);
  return Boolean(match && Number(match[2]) >= 1 && Number(match[2]) <= 12);
}

export function getCouncilResultMauritiusDate(result: CouncilResult): string {
  return getMauritiusDate(new Date(result.analysed_at));
}

export function filterCouncilResultsByDate(
  results: CouncilResult[],
  date: string,
): CouncilResult[] {
  return results.filter((result) => getCouncilResultMauritiusDate(result) === date);
}

export function sortCouncilResultsNewest(results: CouncilResult[]): CouncilResult[] {
  return [...results].sort((left, right) => Date.parse(right.analysed_at) - Date.parse(left.analysed_at));
}

export function aggregateCouncilDateCounts(
  results: CouncilResult[],
  month: string,
): CouncilDateCount[] {
  const counts = new Map<string, number>();
  for (const result of results) {
    const date = getCouncilResultMauritiusDate(result);
    if (!date.startsWith(`${month}-`)) continue;
    counts.set(date, (counts.get(date) ?? 0) + 1);
  }
  return [...counts.entries()]
    .sort(([left], [right]) => left.localeCompare(right))
    .map(([date, count]) => ({ date, count }));
}
