import { createHash, randomUUID } from "node:crypto";
import { z } from "zod";
import { CouncilResultSchema, type CouncilResult } from "./council-schema.js";
import {
  deduplicateCouncilResults,
  type CouncilArchiveStore,
} from "./council-store.js";
import {
  GitHubArchiveClient,
  type GitHubArchiveFile,
  type GitHubArchiveReadOptions,
  type GitHubArchiveWriteResult,
} from "./github-archive-client.js";
import type { HorseeConfig } from "./horsee-config.js";
import type { HorseeJobStore } from "./horsee-job-store.js";
import {
  HorseeArchiveIndexSchema,
  type HorseeArchiveDayState,
  type HorseeArchiveIndex,
} from "./horsee-job-schema.js";
import {
  SmspariazRacecardSuccessSchema,
  type SmspariazRacecardSuccess,
} from "./smspariaz-racecard.js";
import { getMauritiusDate, subtractMauritiusDays } from "./mauritius-time.js";

const ARCHIVE_CAS_ATTEMPTS = 5;

const LegacyMigrationRacecardSchema = z.object({
  kind: z.literal("legacy-reconstruction"),
  programme_date: z.string().regex(/^\d{4}-\d{2}-\d{2}$/),
  timezone: z.literal("Indian/Mauritius"),
  source_latest_analysed_at: z.iso.datetime(),
  reason: z.literal("Original parsed racecard was not retained by the legacy Council store."),
  race_count: z.number().int().nonnegative(),
  races: z.array(z.object({
    race_id: z.string().min(1).max(160),
    meeting_number: z.number().int().positive(),
    race_number: z.number().int().positive(),
    racecourse: z.string().min(1).max(120),
    off_time: z.string().min(1).max(40),
    distance: z.string().min(1).max(80),
  }).strict()),
}).strict();

export interface GitHubArchiveClientLike {
  getFile(repository: string, path: string, options?: GitHubArchiveReadOptions): Promise<GitHubArchiveFile | null>;
  upsertFile(repository: string, path: string, content: string, message: string): Promise<GitHubArchiveWriteResult>;
}

export interface HorseeArchivePaths {
  results: string;
  racecard: string;
  index: string;
}

export interface HorseeArchiveDependencies {
  config: HorseeConfig;
  councilStore: CouncilArchiveStore;
  jobStore: HorseeJobStore;
  github?: GitHubArchiveClientLike;
  now?: () => Date;
  log?: (message: string) => void;
}

export class HorseeArchiveError extends Error {
  constructor(readonly code: string, message: string) {
    super(message);
    this.name = "HorseeArchiveError";
  }
}

export function sha256Content(content: string): string {
  return createHash("sha256").update(content, "utf8").digest("hex");
}

export function createArchivePaths(date: string): HorseeArchivePaths {
  const [year, month] = date.split("-");
  if (!/^\d{4}-\d{2}-\d{2}$/.test(date)) throw new TypeError("Archive date must use YYYY-MM-DD.");
  return {
    results: `results/${year}/${month}/${date}.ndjson`,
    racecard: `racecards/${year}/${month}/${date}.json`,
    index: `indexes/${year}/${month}.json`,
  };
}

function raceOrder(racecard: SmspariazRacecardSuccess): Map<string, { meeting: number; race: number }> {
  return new Map(racecard.races.map((race) => [race.race_id, { meeting: race.meeting_number, race: race.race_number }]));
}

function fallbackRaceOrder(result: CouncilResult): { meeting: number; race: number } {
  const match = /^R(\d+)C(\d+)$/.exec(result.race_id);
  return {
    meeting: Number(match?.[1] ?? Number.MAX_SAFE_INTEGER),
    race: Number(match?.[2] ?? result.race_number),
  };
}

export function sortCouncilResultsForArchive(
  results: CouncilResult[],
  racecard: SmspariazRacecardSuccess,
): CouncilResult[] {
  const order = raceOrder(racecard);
  return [...deduplicateCouncilResults(results)].sort((left, right) => {
    const leftOrder = order.get(left.race_id) ?? fallbackRaceOrder(left);
    const rightOrder = order.get(right.race_id) ?? fallbackRaceOrder(right);
    return leftOrder.meeting - rightOrder.meeting
      || leftOrder.race - rightOrder.race
      || left.race_number - right.race_number
      || left.race_id.localeCompare(right.race_id)
      || left.analysed_at.localeCompare(right.analysed_at);
  });
}

export function createCouncilNdjson(
  results: CouncilResult[],
  racecard: SmspariazRacecardSuccess,
): string {
  const validatedCard = SmspariazRacecardSuccessSchema.parse(racecard);
  const validated = results.map((result) => CouncilResultSchema.parse(result));
  const ordered = sortCouncilResultsForArchive(validated, validatedCard);
  return ordered.length ? `${ordered.map((result) => JSON.stringify(result)).join("\n")}\n` : "";
}

export function createLegacyCouncilNdjson(results: CouncilResult[], date: string): string {
  const ordered = deduplicateCouncilResults(results.map((result) => {
    const validated = CouncilResultSchema.parse(result);
    if (getMauritiusDate(new Date(validated.analysed_at)) !== date) {
      throw new HorseeArchiveError("LEGACY_DATE_MISMATCH", "Legacy result date does not match its migration day.");
    }
    return validated;
  })).sort((left, right) => {
    const leftOrder = fallbackRaceOrder(left);
    const rightOrder = fallbackRaceOrder(right);
    return leftOrder.meeting - rightOrder.meeting
      || leftOrder.race - rightOrder.race
      || left.race_id.localeCompare(right.race_id)
      || left.analysed_at.localeCompare(right.analysed_at);
  });
  return ordered.length ? `${ordered.map((result) => JSON.stringify(result)).join("\n")}\n` : "";
}

function createLegacyMigrationRacecard(date: string, results: CouncilResult[]) {
  const races = [...deduplicateCouncilResults(results)].sort((left, right) => left.race_id.localeCompare(right.race_id)).map((result) => ({
    race_id: result.race_id,
    meeting_number: fallbackRaceOrder(result).meeting === Number.MAX_SAFE_INTEGER ? 1 : fallbackRaceOrder(result).meeting,
    race_number: result.race_number,
    racecourse: result.racecourse,
    off_time: result.off_time,
    distance: result.distance,
  }));
  return LegacyMigrationRacecardSchema.parse({
    kind: "legacy-reconstruction",
    programme_date: date,
    timezone: "Indian/Mauritius",
    source_latest_analysed_at: results.map((result) => result.analysed_at).sort().at(-1) ?? `${date}T00:00:00.000Z`,
    reason: "Original parsed racecard was not retained by the legacy Council store.",
    race_count: races.length,
    races,
  });
}

function parseNdjson(content: string, expectedDate: string): CouncilResult[] | null {
  try {
    if (!content.trim()) return [];
    return content.trimEnd().split("\n").map((line) => {
      const result = CouncilResultSchema.parse(JSON.parse(line) as unknown);
      const analysedDate = getMauritiusDate(new Date(result.analysed_at));
      if (analysedDate !== expectedDate) throw new Error("Archived result date mismatch.");
      return result;
    });
  } catch {
    return null;
  }
}

function sanitizedError(error: unknown): string {
  return (error instanceof Error ? error.message : "Unknown archive failure.")
    .replace(/Bearer\s+\S+/gi, "Bearer [redacted]")
    .slice(0, 1_000);
}

export class HorseeArchiveService {
  private readonly github: GitHubArchiveClientLike;

  constructor(private readonly dependencies: HorseeArchiveDependencies) {
    this.github = dependencies.github ?? new GitHubArchiveClient({
      owner: dependencies.config.archive.owner,
      token: dependencies.config.archive.token,
      apiVersion: dependencies.config.archive.apiVersion,
      timeoutMs: dependencies.config.githubTimeoutMs,
    });
  }

  getArchiveRepository(year: number | string): string {
    return `${this.dependencies.config.archive.prefix}${year}`;
  }

  private fullRepository(repository: string): string {
    return `${this.dependencies.config.archive.owner}/${repository}`;
  }

  private async persistArchiveState(
    date: string,
    makeState: (current: HorseeArchiveDayState | null) => HorseeArchiveDayState,
  ): Promise<HorseeArchiveDayState> {
    for (let attempt = 0; attempt < ARCHIVE_CAS_ATTEMPTS; attempt += 1) {
      const current = await this.dependencies.jobStore.getArchiveDayState(date);
      const next = makeState(current.value);
      if (await this.dependencies.jobStore.putArchiveDayState(next, current.etag)) return next;
    }
    throw new HorseeArchiveError("ARCHIVE_STATE_CONFLICT", "Archive state changed too many times concurrently.");
  }

  async archiveDay(date: string): Promise<{
    date: string;
    status: "ARCHIVED";
    repo: string;
    result_path: string;
    racecard_path: string;
    index_path: string;
    result_count: number;
    content_hash: string;
    unchanged: boolean;
  }> {
    if (!this.dependencies.config.archive.configured) {
      throw new HorseeArchiveError("ARCHIVE_NOT_CONFIGURED", "GitHub archive writes are not configured.");
    }
    const now = this.dependencies.now?.() ?? new Date();
    const owner = randomUUID();
    const repository = this.getArchiveRepository(date.slice(0, 4));
    const fullRepository = this.fullRepository(repository);
    const leaseKey = `archive-${date}`;
    const acquired = await this.dependencies.jobStore.acquireLease(leaseKey, {
      owner,
      purpose: "ARCHIVE",
      acquired_at: now.toISOString(),
      expires_at: new Date(now.getTime() + this.dependencies.config.schedulerLockSeconds * 1_000).toISOString(),
    }, now);
    if (!acquired) throw new HorseeArchiveError("ARCHIVE_BUSY", "Another archive invocation owns this date.");

    let paths: HorseeArchivePaths | null = null;
    try {
      await this.persistArchiveState(date, (current) => ({
        date,
        status: "ARCHIVING",
        repo: fullRepository,
        result_path: current?.result_path,
        racecard_path: current?.racecard_path,
        index_path: current?.index_path,
        started_at: now.toISOString(),
        attempts: (current?.attempts ?? 0) + 1,
      }));

      const [results, racecard] = await Promise.all([
        this.dependencies.councilStore.getHotByDate(date),
        this.dependencies.jobStore.getRacecard(date),
      ]);
      if (!racecard) throw new HorseeArchiveError("RACECARD_NOT_FOUND", `No stored SMSPariaz racecard exists for ${date}.`);
      if (racecard.programme_date !== date) throw new HorseeArchiveError("RACECARD_DATE_MISMATCH", "Stored racecard date does not match archive date.");

      paths = createArchivePaths(date);
      const ndjson = createCouncilNdjson(results, racecard);
      const contentHash = sha256Content(ndjson);
      const racecardContent = `${JSON.stringify(SmspariazRacecardSuccessSchema.parse(racecard))}\n`;
      const existingIndexFile = await this.github.getFile(repository, paths.index);
      const parsedIndex = existingIndexFile
        ? HorseeArchiveIndexSchema.safeParse(JSON.parse(existingIndexFile.content) as unknown)
        : null;
      const [year, month] = date.split("-").map(Number);
      const existingIndex: HorseeArchiveIndex = parsedIndex?.success
        ? parsedIndex.data
        : { year, month, days: {} };
      const previousEntry = existingIndex.days[date];
      const entryUnchanged = previousEntry?.content_hash === contentHash
        && previousEntry.race_count === racecard.race_count
        && previousEntry.completed_count === results.length
        && previousEntry.archive_file === paths.results
        && previousEntry.racecard_file === paths.racecard;
      const index = HorseeArchiveIndexSchema.parse({
        ...existingIndex,
        days: {
          ...existingIndex.days,
          [date]: {
            race_count: racecard.race_count,
            completed_count: results.length,
            archive_file: paths.results,
            racecard_file: paths.racecard,
            content_hash: contentHash,
            archived_at: entryUnchanged ? previousEntry.archived_at : now.toISOString(),
          },
        },
      });
      const sortedDays = Object.fromEntries(Object.entries(index.days).sort(([left], [right]) => left.localeCompare(right)));
      const indexContent = `${JSON.stringify({ ...index, days: sortedDays }, null, 2)}\n`;

      this.dependencies.log?.(`[HORSEE ARCHIVE] Archiving ${date}: ${results.length} results`);
      const writes = [
        await this.github.upsertFile(repository, paths.results, ndjson, `Archive HORSEE results for ${date}`),
        await this.github.upsertFile(repository, paths.racecard, racecardContent, `Archive HORSEE racecard for ${date}`),
      ];
      writes.push(await this.github.upsertFile(repository, paths.index, indexContent, `Update HORSEE archive index for ${date}`));

      if (!await this.verifyRemoteFiles(repository, date, paths, contentHash, racecardContent)) {
        throw new HorseeArchiveError("ARCHIVE_VERIFICATION_FAILED", "GitHub archive read-back verification failed.");
      }

      await this.persistArchiveState(date, (current) => ({
        date,
        status: "ARCHIVED",
        repo: fullRepository,
        result_path: paths?.results,
        racecard_path: paths?.racecard,
        index_path: paths?.index,
        started_at: current?.started_at,
        archived_at: now.toISOString(),
        result_count: results.length,
        race_count: racecard.race_count,
        content_hash: contentHash,
        attempts: current?.attempts ?? 1,
      }));
      const unchanged = writes.every((write) => write.status === "UNCHANGED");
      if (unchanged) this.dependencies.log?.("[HORSEE ARCHIVE] Archive unchanged; skipping commit");
      return {
        date,
        status: "ARCHIVED",
        repo: fullRepository,
        result_path: paths.results,
        racecard_path: paths.racecard,
        index_path: paths.index,
        result_count: results.length,
        content_hash: contentHash,
        unchanged,
      };
    } catch (error) {
      const message = sanitizedError(error);
      try {
        await this.persistArchiveState(date, (current) => ({
          date,
          status: "FAILED",
          repo: fullRepository,
          result_path: paths?.results ?? current?.result_path,
          racecard_path: paths?.racecard ?? current?.racecard_path,
          index_path: paths?.index ?? current?.index_path,
          started_at: current?.started_at ?? now.toISOString(),
          attempts: current?.attempts ?? 1,
          last_error: message,
        }));
      } catch {
        this.dependencies.log?.("[HORSEE ARCHIVE] Failed to persist archive failure state.");
      }
      throw error;
    } finally {
      await this.dependencies.jobStore.releaseLease(leaseKey, owner, this.dependencies.now?.() ?? new Date());
    }
  }

  /**
   * Migrates validated legacy Council results into the normal daily file/index
   * layout. Old Council objects did not retain their parsed card, so the card
   * path contains an explicit, schema-validated reconstruction manifest.
   */
  async archiveLegacyDay(date: string, legacyResults: CouncilResult[]): Promise<{
    date: string;
    status: "ARCHIVED";
    repo: string;
    result_path: string;
    racecard_path: string;
    index_path: string;
    result_count: number;
    content_hash: string;
    unchanged: boolean;
  }> {
    if (!this.dependencies.config.archive.configured) {
      throw new HorseeArchiveError("ARCHIVE_NOT_CONFIGURED", "GitHub archive writes are not configured.");
    }
    const now = this.dependencies.now?.() ?? new Date();
    const owner = randomUUID();
    const repository = this.getArchiveRepository(date.slice(0, 4));
    const fullRepository = this.fullRepository(repository);
    const paths = createArchivePaths(date);
    const leaseKey = `archive-${date}`;
    const acquired = await this.dependencies.jobStore.acquireLease(leaseKey, {
      owner,
      purpose: "MIGRATION",
      acquired_at: now.toISOString(),
      expires_at: new Date(now.getTime() + this.dependencies.config.schedulerLockSeconds * 1_000).toISOString(),
    }, now);
    if (!acquired) throw new HorseeArchiveError("ARCHIVE_BUSY", "Another archive invocation owns this date.");

    try {
      await this.persistArchiveState(date, (current) => ({
        date,
        status: "ARCHIVING",
        repo: fullRepository,
        result_path: paths.results,
        racecard_path: paths.racecard,
        index_path: paths.index,
        started_at: now.toISOString(),
        attempts: (current?.attempts ?? 0) + 1,
      }));
      const results = deduplicateCouncilResults(legacyResults.map((result) => CouncilResultSchema.parse(result)));
      const ndjson = createLegacyCouncilNdjson(results, date);
      const contentHash = sha256Content(ndjson);
      const racecard = createLegacyMigrationRacecard(date, results);
      const racecardContent = `${JSON.stringify(racecard)}\n`;
      const existingIndexFile = await this.github.getFile(repository, paths.index);
      const parsedIndex = existingIndexFile
        ? HorseeArchiveIndexSchema.safeParse(JSON.parse(existingIndexFile.content) as unknown)
        : null;
      const [year, month] = date.split("-").map(Number);
      const existingIndex: HorseeArchiveIndex = parsedIndex?.success ? parsedIndex.data : { year, month, days: {} };
      const previousEntry = existingIndex.days[date];
      const entryUnchanged = previousEntry?.content_hash === contentHash
        && previousEntry.race_count === racecard.race_count
        && previousEntry.completed_count === results.length
        && previousEntry.archive_file === paths.results
        && previousEntry.racecard_file === paths.racecard;
      const index = HorseeArchiveIndexSchema.parse({
        ...existingIndex,
        days: {
          ...existingIndex.days,
          [date]: {
            race_count: racecard.race_count,
            completed_count: results.length,
            archive_file: paths.results,
            racecard_file: paths.racecard,
            content_hash: contentHash,
            archived_at: entryUnchanged ? previousEntry.archived_at : now.toISOString(),
          },
        },
      });
      const sortedDays = Object.fromEntries(Object.entries(index.days).sort(([left], [right]) => left.localeCompare(right)));
      const indexContent = `${JSON.stringify({ ...index, days: sortedDays }, null, 2)}\n`;
      const writes = [
        await this.github.upsertFile(repository, paths.results, ndjson, `Migrate HORSEE results for ${date}`),
        await this.github.upsertFile(repository, paths.racecard, racecardContent, `Record HORSEE legacy racecard reconstruction for ${date}`),
      ];
      writes.push(await this.github.upsertFile(repository, paths.index, indexContent, `Update HORSEE archive index for ${date}`));
      if (!await this.verifyRemoteFiles(repository, date, paths, contentHash, racecardContent)) {
        throw new HorseeArchiveError("ARCHIVE_VERIFICATION_FAILED", "GitHub archive read-back verification failed.");
      }
      await this.persistArchiveState(date, (current) => ({
        date,
        status: "ARCHIVED",
        repo: fullRepository,
        result_path: paths.results,
        racecard_path: paths.racecard,
        index_path: paths.index,
        started_at: current?.started_at,
        archived_at: now.toISOString(),
        result_count: results.length,
        race_count: racecard.race_count,
        content_hash: contentHash,
        attempts: current?.attempts ?? 1,
      }));
      return {
        date,
        status: "ARCHIVED",
        repo: fullRepository,
        result_path: paths.results,
        racecard_path: paths.racecard,
        index_path: paths.index,
        result_count: results.length,
        content_hash: contentHash,
        unchanged: writes.every((write) => write.status === "UNCHANGED"),
      };
    } catch (error) {
      const message = sanitizedError(error);
      try {
        await this.persistArchiveState(date, (current) => ({
          date,
          status: "FAILED",
          repo: fullRepository,
          result_path: paths.results,
          racecard_path: paths.racecard,
          index_path: paths.index,
          started_at: current?.started_at ?? now.toISOString(),
          attempts: current?.attempts ?? 1,
          last_error: message,
        }));
      } catch {
        this.dependencies.log?.("[HORSEE MIGRATION] Failed to persist migration archive failure state.");
      }
      throw error;
    } finally {
      await this.dependencies.jobStore.releaseLease(leaseKey, owner, this.dependencies.now?.() ?? new Date());
    }
  }

  private async verifyRemoteFiles(
    repository: string,
    date: string,
    paths: HorseeArchivePaths,
    contentHash: string,
    racecardContent?: string,
  ): Promise<boolean> {
    const [resultFile, racecardFile, indexFile] = await Promise.all([
      this.github.getFile(repository, paths.results),
      this.github.getFile(repository, paths.racecard),
      this.github.getFile(repository, paths.index),
    ]);
    if (!resultFile || !racecardFile || !indexFile) return false;
    if (sha256Content(resultFile.content) !== contentHash || parseNdjson(resultFile.content, date) === null) return false;
    if (racecardContent !== undefined && racecardFile.content !== racecardContent) return false;
    const racecard = z.union([SmspariazRacecardSuccessSchema, LegacyMigrationRacecardSchema])
      .safeParse(JSON.parse(racecardFile.content) as unknown);
    const index = HorseeArchiveIndexSchema.safeParse(JSON.parse(indexFile.content) as unknown);
    return racecard.success
      && racecard.data.programme_date === date
      && index.success
      && index.data.days[date]?.content_hash === contentHash
      && index.data.days[date]?.archive_file === paths.results
      && index.data.days[date]?.racecard_file === paths.racecard;
  }

  async verifyArchive(date: string): Promise<boolean> {
    const state = (await this.dependencies.jobStore.getArchiveDayState(date)).value;
    if (!state?.content_hash) return false;
    const repository = this.getArchiveRepository(date.slice(0, 4));
    return this.verifyRemoteFiles(repository, date, createArchivePaths(date), state.content_hash);
  }

  async readArchivedDay(date: string): Promise<CouncilResult[] | null> {
    const repository = this.getArchiveRepository(date.slice(0, 4));
    const file = await this.github.getFile(repository, createArchivePaths(date).results, { authenticate: false });
    return file ? parseNdjson(file.content, date) : null;
  }

  async readArchiveMonthIndex(month: string): Promise<HorseeArchiveIndex | null> {
    const match = /^(\d{4})-(\d{2})$/.exec(month);
    if (!match) return null;
    const repository = this.getArchiveRepository(match[1]);
    const file = await this.github.getFile(repository, `indexes/${match[1]}/${match[2]}.json`, { authenticate: false });
    if (!file) return null;
    const parsed = HorseeArchiveIndexSchema.safeParse(JSON.parse(file.content) as unknown);
    return parsed.success ? parsed.data : null;
  }

  async archiveExpiredHotDays(): Promise<Array<{ date: string; status: "ARCHIVED" | "FAILED" }>> {
    const today = getMauritiusDate(this.dependencies.now?.() ?? new Date());
    const stateByDate = new Map((await this.dependencies.jobStore.listArchiveDayStates())
      .map((state) => [state.date, state]));
    const dates = (await this.dependencies.jobStore.listQueueDates())
      .filter((date) => date < today && stateByDate.get(date)?.status !== "ARCHIVED")
      .slice(0, this.dependencies.config.archiveBatchDays);
    const outcomes: Array<{ date: string; status: "ARCHIVED" | "FAILED" }> = [];
    for (const date of dates) {
      try { await this.archiveDay(date); outcomes.push({ date, status: "ARCHIVED" }); }
      catch { outcomes.push({ date, status: "FAILED" }); }
    }
    return outcomes;
  }

  async cleanupExpiredHotData(): Promise<RetentionResult> {
    const dates = [...new Set([
      ...await this.dependencies.councilStore.listHotDates(),
      ...await this.dependencies.jobStore.listQueueDates(),
    ])].sort();
    return cleanupExpiredHotData({
      config: this.dependencies.config,
      now: this.dependencies.now?.() ?? new Date(),
      dates,
      getArchiveStatus: async (date) => {
        const state = (await this.dependencies.jobStore.getArchiveDayState(date)).value;
        return { status: state?.status ?? "PENDING", verified: state?.status === "ARCHIVED" && await this.verifyArchive(date) };
      },
      deleteDate: async (date) => {
        await this.dependencies.councilStore.deleteHotDay(date);
        await this.dependencies.jobStore.deleteHotDay(date);
      },
    });
  }

  async getArchiveHealth(): Promise<{
    status: "HEALTHY" | "DEGRADED" | "NOT_CONFIGURED";
    last_archived_day: string | null;
    repo: string | null;
    pending_days: number;
    last_error: string | null;
  }> {
    const now = this.dependencies.now?.() ?? new Date();
    const states = await this.dependencies.jobStore.listArchiveDayStates();
    const archived = states.filter((state) => state.status === "ARCHIVED").sort((a, b) => b.date.localeCompare(a.date));
    const failed = states.filter((state) => state.status === "FAILED").sort((a, b) => (b.started_at ?? "").localeCompare(a.started_at ?? ""));
    const today = getMauritiusDate(now);
    const pending = (await this.dependencies.jobStore.listQueueDates()).filter((date) => date < today && !archived.some((state) => state.date === date));
    return {
      status: !this.dependencies.config.archive.configured ? "NOT_CONFIGURED" : failed.length ? "DEGRADED" : "HEALTHY",
      last_archived_day: archived[0]?.date ?? null,
      repo: this.getArchiveRepository(today.slice(0, 4)),
      pending_days: pending.length,
      last_error: failed[0]?.last_error ?? null,
    };
  }
}

export interface RetentionResult {
  retention_days: number;
  evaluated_dates: number;
  deleted_dates: string[];
  preserved: Array<{ date: string; reason: string }>;
}

export async function cleanupExpiredHotData(options: {
  config: HorseeConfig;
  now: Date;
  dates: string[];
  getArchiveStatus: (date: string) => Promise<{ status: string; verified: boolean }>;
  deleteDate: (date: string) => Promise<void>;
}): Promise<RetentionResult> {
  const today = getMauritiusDate(options.now);
  const oldestRetained = subtractMauritiusDays(today, options.config.hotRetentionDays);
  const result: RetentionResult = {
    retention_days: options.config.hotRetentionDays,
    evaluated_dates: options.dates.length,
    deleted_dates: [],
    preserved: [],
  };
  for (const date of [...new Set(options.dates)].sort()) {
    if (date >= oldestRetained) {
      result.preserved.push({ date, reason: date === today ? "TODAY" : "WITHIN_RETENTION" });
      continue;
    }
    const archive = await options.getArchiveStatus(date);
    if (archive.status !== "ARCHIVED" || !archive.verified) {
      result.preserved.push({ date, reason: archive.status === "FAILED" ? "ARCHIVE_FAILED" : "ARCHIVE_NOT_VERIFIED" });
      continue;
    }
    await options.deleteDate(date);
    result.deleted_dates.push(date);
  }
  return result;
}
