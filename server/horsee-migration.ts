import { CouncilResultSchema, type CouncilResult } from "./council-schema.js";
import {
  councilResultIdentity,
  type CouncilArchiveStore,
  type CouncilLegacyEntry,
} from "./council-store.js";
import { getCouncilResultMauritiusDate } from "./council-history.js";

export interface LegacyMigrationDay {
  date: string;
  results: CouncilResult[];
  source_keys: string[];
  duplicate_count: number;
}

export interface LegacyMigrationPreparation {
  days: LegacyMigrationDay[];
  invalid: Array<{ source_key: string; reason: string }>;
  source_count: number;
  valid_count: number;
}

type SelectedLegacyResult = {
  sourceKey: string;
  result: CouncilResult;
  analysedEpochMs: number;
};

function safeValidationReason(entry: CouncilLegacyEntry): string {
  const parsed = CouncilResultSchema.safeParse(entry.value);
  if (parsed.success) return "Legacy entry was not exposed as a validated result.";
  return parsed.error.issues[0]?.message.slice(0, 240) ?? "Legacy entry failed Council validation.";
}

/** Prepare legacy objects without writing or deleting anything. */
export function prepareLegacyCouncilMigration(
  entries: CouncilLegacyEntry[],
): LegacyMigrationPreparation {
  const invalid: LegacyMigrationPreparation["invalid"] = [];
  const grouped = new Map<string, {
    selected: Map<string, SelectedLegacyResult>;
    sourceKeys: Set<string>;
    validCount: number;
  }>();

  for (const entry of [...entries].sort((left, right) => left.key.localeCompare(right.key))) {
    const parsed = CouncilResultSchema.safeParse(entry.result ?? entry.value);
    if (!parsed.success) {
      invalid.push({ source_key: entry.key, reason: safeValidationReason(entry) });
      continue;
    }
    const result = parsed.data;
    const date = getCouncilResultMauritiusDate(result);
    const identity = councilResultIdentity(result);
    const candidate: SelectedLegacyResult = {
      sourceKey: entry.key,
      result,
      analysedEpochMs: Date.parse(result.analysed_at),
    };
    const day = grouped.get(date) ?? { selected: new Map(), sourceKeys: new Set(), validCount: 0 };
    day.validCount += 1;
    day.sourceKeys.add(entry.key);
    const current = day.selected.get(identity);
    if (!current
      || candidate.analysedEpochMs > current.analysedEpochMs
      || (candidate.analysedEpochMs === current.analysedEpochMs && candidate.sourceKey > current.sourceKey)) {
      day.selected.set(identity, candidate);
    }
    grouped.set(date, day);
  }

  const days = [...grouped.entries()].sort(([left], [right]) => left.localeCompare(right)).map(([date, day]) => ({
    date,
    results: [...day.selected.values()]
      .sort((left, right) => left.result.race_id.localeCompare(right.result.race_id))
      .map((entry) => entry.result),
    source_keys: [...day.sourceKeys].sort(),
    duplicate_count: day.validCount - day.selected.size,
  }));
  return {
    days,
    invalid,
    source_count: entries.length,
    valid_count: days.reduce((total, day) => total + day.results.length + day.duplicate_count, 0),
  };
}

export interface LegacyMigrationArchive {
  archiveLegacyDay(date: string, results: CouncilResult[]): Promise<{ content_hash: string }>;
  verifyArchive(date: string): Promise<boolean>;
}

export interface CouncilMigrationReport {
  dry_run: boolean;
  delete_after_verified: boolean;
  source_count: number;
  valid_count: number;
  invalid: LegacyMigrationPreparation["invalid"];
  days: Array<{
    date: string;
    result_count: number;
    duplicate_count: number;
    status: "PLANNED" | "VERIFIED" | "FAILED";
    deleted_source_count: number;
    error?: string;
  }>;
}

function safeMigrationError(error: unknown): string {
  return (error instanceof Error ? error.message : "Unknown migration failure.")
    .replace(/Bearer\s+\S+/gi, "Bearer [redacted]")
    .slice(0, 500);
}

export async function runCouncilLegacyMigration(options: {
  store: CouncilArchiveStore;
  archive: LegacyMigrationArchive;
  dryRun?: boolean;
  deleteAfterVerified?: boolean;
  now?: () => Date;
}): Promise<CouncilMigrationReport> {
  const dryRun = options.dryRun ?? false;
  const deleteAfterVerified = options.deleteAfterVerified ?? false;
  const prepared = prepareLegacyCouncilMigration(await options.store.listLegacyEntries());
  const report: CouncilMigrationReport = {
    dry_run: dryRun,
    delete_after_verified: deleteAfterVerified,
    source_count: prepared.source_count,
    valid_count: prepared.valid_count,
    invalid: prepared.invalid,
    days: [],
  };

  for (const day of prepared.days) {
    if (dryRun) {
      report.days.push({
        date: day.date,
        result_count: day.results.length,
        duplicate_count: day.duplicate_count,
        status: "PLANNED",
        deleted_source_count: 0,
      });
      continue;
    }
    try {
      const archived = await options.archive.archiveLegacyDay(day.date, day.results);
      if (!await options.archive.verifyArchive(day.date)) throw new Error("Archive verification failed after migration write.");
      await options.store.putMigrationMarker({
        date: day.date,
        verified_at: (options.now?.() ?? new Date()).toISOString(),
        source_keys: day.source_keys,
        content_hash: archived.content_hash,
      });
      if (deleteAfterVerified) await options.store.deleteLegacyKeys(day.source_keys);
      report.days.push({
        date: day.date,
        result_count: day.results.length,
        duplicate_count: day.duplicate_count,
        status: "VERIFIED",
        deleted_source_count: deleteAfterVerified ? day.source_keys.length : 0,
      });
    } catch (error) {
      report.days.push({
        date: day.date,
        result_count: day.results.length,
        duplicate_count: day.duplicate_count,
        status: "FAILED",
        deleted_source_count: 0,
        error: safeMigrationError(error),
      });
    }
  }
  return report;
}
