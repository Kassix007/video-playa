import { getStore, type Store } from "@netlify/blobs";
import { createHash, randomUUID } from "node:crypto";
import { mkdir, readFile, rename, writeFile } from "node:fs/promises";
import { dirname, resolve } from "node:path";
import { z } from "zod";
import {
  createCouncilWriteAuditEvent,
  logCouncilSecurityEvent,
  type CouncilWriteActor,
  type CouncilWriteAuditEvent,
} from "./council-audit.js";
import {
  aggregateCouncilDateCounts,
  filterCouncilResultsByDate,
  getCouncilResultMauritiusDate,
  isCouncilHistoryDate,
  sortCouncilResultsNewest,
  type CouncilDateCount,
} from "./council-history.js";
import { parseHorseeConfig } from "./horsee-config.js";
import { CouncilResultSchema, type CouncilResult } from "./council-schema.js";

export const PRODUCTION_STORE_NAME = "horsee-council-results-production";
const LATEST_KEY = "latest.json";
const RECENT_KEY = "recent.json";
const HOT_DAY_PREFIX = "days/";
const HISTORY_PREFIX = "results/";
const MIGRATION_PREFIX = "migration/days/";
const AUDIT_PREFIX = "private-audit/";
const AUDIT_LIMIT = 500;
const CAS_ATTEMPTS = 5;

type NetlifyDeployEnvironment = Readonly<Record<string, string | undefined>>;

const CouncilHotDaySchema = z.object({
  programme_date: z.string().refine(isCouncilHistoryDate),
  updated_at: z.string().refine((value) => Number.isFinite(Date.parse(value))),
  results: z.record(z.string(), CouncilResultSchema),
}).strict().superRefine((day, context) => {
  for (const [raceId, result] of Object.entries(day.results)) {
    if (raceId !== result.race_id) context.addIssue({ code: "custom", path: ["results", raceId], message: "Result key must match race ID." });
    if (getCouncilResultMauritiusDate(result) !== day.programme_date) context.addIssue({ code: "custom", path: ["results", raceId, "analysed_at"], message: "Result date must match hot day." });
  }
});
type CouncilHotDay = z.infer<typeof CouncilHotDaySchema>;

const CouncilRecentSchema = z.object({
  updated_at: z.string().refine((value) => Number.isFinite(Date.parse(value))),
  limit: z.number().int().positive().max(1_000),
  results: z.array(CouncilResultSchema).max(1_000),
}).strict();

export interface CouncilResultStore {
  readonly kind: "netlify-blobs" | "local-file";
  save(result: CouncilResult, actor: CouncilWriteActor): Promise<void>;
  getLatest(): Promise<CouncilResult | null>;
  getHistory(limit: number): Promise<CouncilResult[]>;
  getByDate(date: string): Promise<CouncilResult[]>;
  getDateCounts(month: string): Promise<CouncilDateCount[]>;
}

export interface CouncilLegacyEntry {
  key: string;
  value: unknown;
  result: CouncilResult | null;
}

export interface CouncilMigrationMarker {
  date: string;
  verified_at: string;
  source_keys: string[];
  content_hash: string;
}

export interface CouncilArchiveStore extends CouncilResultStore {
  getHotByDate(date: string): Promise<CouncilResult[]>;
  listHotDates(): Promise<string[]>;
  deleteHotDay(date: string): Promise<void>;
  listLegacyEntries(): Promise<CouncilLegacyEntry[]>;
  deleteLegacyKeys(keys: string[]): Promise<void>;
  getMigrationMarker(date: string): Promise<CouncilMigrationMarker | null>;
  putMigrationMarker(marker: CouncilMigrationMarker): Promise<void>;
}

export function createCouncilHistoryKey(
  occurredAt = Date.now(),
  eventId: string = randomUUID(),
): string {
  if (!Number.isSafeInteger(occurredAt) || occurredAt < 0) {
    throw new TypeError("Council storage time must be a non-negative safe integer.");
  }
  return `${HISTORY_PREFIX}${String(occurredAt).padStart(13, "0")}-${eventId}.json`;
}

export function createCouncilDatedHistoryKey(
  programmeDate: string,
  occurredAt = Date.now(),
  eventId: string = randomUUID(),
): string {
  if (!isCouncilHistoryDate(programmeDate)) {
    throw new TypeError("Council programme date must use YYYY-MM-DD.");
  }
  if (!Number.isSafeInteger(occurredAt) || occurredAt < 0) {
    throw new TypeError("Council storage time must be a non-negative safe integer.");
  }
  return `${HISTORY_PREFIX}${programmeDate}/${String(occurredAt).padStart(13, "0")}-${eventId}.json`;
}

function hotDayKey(date: string): string {
  if (!isCouncilHistoryDate(date)) throw new TypeError("Council hot day must use YYYY-MM-DD.");
  return `${HOT_DAY_PREFIX}${date}.json`;
}

function createCouncilAuditKey(event: CouncilWriteAuditEvent): string {
  return `${AUDIT_PREFIX}${String(Date.parse(event.occurred_at)).padStart(13, "0")}-${event.event_id}.json`;
}

function parseStoredResult(value: unknown): CouncilResult | null {
  const parsed = CouncilResultSchema.safeParse(value);
  return parsed.success ? parsed.data : null;
}

function isLegacyCouncilHistoryKey(key: string): boolean {
  return /^results\/(?:\d{4}-\d{2}-\d{2}\/)?\d{13}-[^/]+\.json$/.test(key);
}

export function councilResultIdentity(result: CouncilResult): string {
  return `${getCouncilResultMauritiusDate(result)}:${result.race_id}`;
}

export function deduplicateCouncilResults(results: CouncilResult[]): CouncilResult[] {
  const newest = sortCouncilResultsNewest(results);
  const seen = new Set<string>();
  return newest.filter((result) => {
    const identity = councilResultIdentity(result);
    if (seen.has(identity)) return false;
    seen.add(identity);
    return true;
  });
}

function mergeCanonicalAndLegacy(canonical: CouncilResult[], legacy: CouncilResult[]): CouncilResult[] {
  const byIdentity = new Map(deduplicateCouncilResults(legacy).map((result) => [councilResultIdentity(result), result]));
  for (const result of canonical) byIdentity.set(councilResultIdentity(result), result);
  return sortCouncilResultsNewest([...byIdentity.values()]);
}

function safeNamespacePart(value: string | undefined, fallback: string, maxLength: number): string {
  const safeValue = value?.toLowerCase().replace(/[^a-z0-9-]+/g, "-").replace(/^-+|-+$/g, "");
  if (!safeValue) return fallback;
  if (safeValue.length <= maxLength) return safeValue;
  const hash = createHash("sha256").update(value ?? safeValue).digest("hex").slice(0, 8);
  return `${safeValue.slice(0, maxLength - hash.length - 1)}-${hash}`;
}

export function resolveCouncilStoreName(
  environment: NetlifyDeployEnvironment = process.env,
): string {
  if (environment.CONTEXT === "production") return PRODUCTION_STORE_NAME;
  if (environment.CONTEXT === "deploy-preview") {
    return `horsee-council-results-deploy-preview-${safeNamespacePart(environment.REVIEW_ID ?? environment.DEPLOY_ID, "unknown", 24)}`;
  }
  if (environment.CONTEXT === "branch-deploy") {
    return `horsee-council-results-branch-${safeNamespacePart(environment.BRANCH ?? environment.DEPLOY_ID, "unknown", 30)}`;
  }
  const context = safeNamespacePart(environment.CONTEXT, "nonproduction", 12);
  const deployId = safeNamespacePart(environment.DEPLOY_ID, "unknown", 24);
  return `horsee-council-results-${context}-${deployId}`;
}

export class NetlifyCouncilResultStore implements CouncilArchiveStore {
  readonly kind = "netlify-blobs" as const;
  private readonly store: Store;

  constructor(storeName: string, private readonly recentLimit = 100) {
    this.store = getStore({ name: storeName, consistency: "strong" });
  }

  private async listKeys(prefix: string): Promise<string[]> {
    const keys: string[] = [];
    for await (const page of this.store.list({ prefix, paginate: true })) keys.push(...page.blobs.map((blob) => blob.key));
    return keys;
  }

  private async readResults(keys: string[]): Promise<CouncilResult[]> {
    const values = await Promise.all(keys.map((key) => this.store.get(key, { type: "json", consistency: "strong" })));
    return values.flatMap((value) => {
      const result = parseStoredResult(value);
      return result ? [result] : [];
    });
  }

  private async getHotDayWithMetadata(date: string): Promise<{ day: CouncilHotDay | null; etag?: string }> {
    const entry = await this.store.getWithMetadata(hotDayKey(date), { type: "json", consistency: "strong" });
    if (!entry) return { day: null };
    const parsed = CouncilHotDaySchema.safeParse(entry.data);
    return { day: parsed.success ? parsed.data : null, etag: entry.etag };
  }

  private async upsertHotDay(result: CouncilResult): Promise<void> {
    const date = getCouncilResultMauritiusDate(result);
    for (let attempt = 0; attempt < CAS_ATTEMPTS; attempt += 1) {
      const current = await this.getHotDayWithMetadata(date);
      const day = CouncilHotDaySchema.parse({
        programme_date: date,
        updated_at: new Date().toISOString(),
        results: { ...(current.day?.results ?? {}), [result.race_id]: result },
      });
      const write = await this.store.setJSON(hotDayKey(date), day, current.etag
        ? { onlyIfMatch: current.etag }
        : { onlyIfNew: true });
      if (write.modified) return;
    }
    throw new Error("Council hot day changed too many times concurrently.");
  }

  private async refreshRecent(result: CouncilResult): Promise<CouncilResult[]> {
    for (let attempt = 0; attempt < CAS_ATTEMPTS; attempt += 1) {
      const entry = await this.store.getWithMetadata(RECENT_KEY, { type: "json", consistency: "strong" });
      const parsed = CouncilRecentSchema.safeParse(entry?.data);
      const results = deduplicateCouncilResults([result, ...(parsed.success ? parsed.data.results : [])])
        .slice(0, this.recentLimit);
      const cache = CouncilRecentSchema.parse({ updated_at: new Date().toISOString(), limit: this.recentLimit, results });
      const write = await this.store.setJSON(RECENT_KEY, cache, entry?.etag
        ? { onlyIfMatch: entry.etag }
        : { onlyIfNew: true });
      if (write.modified) return results;
    }
    throw new Error("Council recent cache changed too many times concurrently.");
  }

  private async persistAudit(auditEvent: CouncilWriteAuditEvent): Promise<void> {
    try {
      await this.store.setJSON(createCouncilAuditKey(auditEvent), auditEvent);
      const listing = await this.store.list({ prefix: AUDIT_PREFIX });
      const stale = listing.blobs.map((blob) => blob.key).sort().reverse().slice(AUDIT_LIMIT);
      await Promise.all(stale.map((key) => this.store.delete(key)));
    } catch {
      logCouncilSecurityEvent("council_audit_persistence_failed", { race_id: auditEvent.race_id, event_id: auditEvent.event_id });
    }
  }

  async save(result: CouncilResult, actor: CouncilWriteActor): Promise<void> {
    const validated = CouncilResultSchema.parse(result);
    const occurredAt = Date.now();
    const eventId = randomUUID();
    await this.upsertHotDay(validated);
    const recent = await this.refreshRecent(validated);
    await this.store.setJSON(LATEST_KEY, recent[0] ?? validated);
    await this.persistAudit(createCouncilWriteAuditEvent(validated, actor, occurredAt, eventId));
  }

  async getLatest(): Promise<CouncilResult | null> {
    return parseStoredResult(await this.store.get(LATEST_KEY, { type: "json", consistency: "strong" }));
  }

  async getHistory(limit: number): Promise<CouncilResult[]> {
    const boundedLimit = Math.max(0, limit);
    const recent = CouncilRecentSchema.safeParse(await this.store.get(RECENT_KEY, { type: "json", consistency: "strong" }));
    if (recent.success && recent.data.results.length >= boundedLimit) return recent.data.results.slice(0, boundedLimit);
    const [hotDates, legacy] = await Promise.all([this.listHotDates(), this.listLegacyEntries()]);
    const hot = (await Promise.all(hotDates.map((date) => this.getHotByDate(date)))).flat();
    return mergeCanonicalAndLegacy(hot, legacy.flatMap((entry) => entry.result ? [entry.result] : [])).slice(0, boundedLimit);
  }

  async getHotByDate(date: string): Promise<CouncilResult[]> {
    const { day } = await this.getHotDayWithMetadata(date);
    return day ? sortCouncilResultsNewest(Object.values(day.results)) : [];
  }

  async getByDate(date: string): Promise<CouncilResult[]> {
    const [canonical, datedKeys, flatKeys] = await Promise.all([
      this.getHotByDate(date),
      this.listKeys(`${HISTORY_PREFIX}${date}/`),
      this.listKeys(HISTORY_PREFIX),
    ]);
    const flatLegacyKeys = flatKeys.filter((key) => /^results\/\d{13}-[^/]+\.json$/.test(key));
    const legacy = await this.readResults([...datedKeys, ...flatLegacyKeys]);
    return mergeCanonicalAndLegacy(canonical, filterCouncilResultsByDate(legacy, date));
  }

  async listHotDates(): Promise<string[]> {
    return (await this.listKeys(HOT_DAY_PREFIX))
      .flatMap((key) => /^days\/(\d{4}-\d{2}-\d{2})\.json$/.exec(key)?.[1] ?? [])
      .sort();
  }

  async getDateCounts(month: string): Promise<CouncilDateCount[]> {
    const hotDates = (await this.listHotDates()).filter((date) => date.startsWith(`${month}-`));
    const hot = (await Promise.all(hotDates.map((date) => this.getHotByDate(date)))).flat();
    const legacy = (await this.listLegacyEntries()).flatMap((entry) => entry.result ? [entry.result] : []);
    return aggregateCouncilDateCounts(mergeCanonicalAndLegacy(hot, legacy), month);
  }

  async deleteHotDay(date: string): Promise<void> { await this.store.delete(hotDayKey(date)); }

  async listLegacyEntries(): Promise<CouncilLegacyEntry[]> {
    const keys = (await this.listKeys(HISTORY_PREFIX)).filter(isLegacyCouncilHistoryKey).sort();
    const values = await Promise.all(keys.map((key) => this.store.get(key, { type: "json", consistency: "strong" })));
    return keys.map((key, index) => ({ key, value: values[index], result: parseStoredResult(values[index]) }));
  }

  async deleteLegacyKeys(keys: string[]): Promise<void> {
    const safeKeys = keys.filter(isLegacyCouncilHistoryKey);
    if (safeKeys.length !== keys.length) throw new TypeError("Refusing to delete a non-legacy Council key.");
    await Promise.all(safeKeys.map((key) => this.store.delete(key)));
  }

  async getMigrationMarker(date: string): Promise<CouncilMigrationMarker | null> {
    const value = await this.store.get(`${MIGRATION_PREFIX}${date}.json`, { type: "json", consistency: "strong" });
    if (!value || typeof value !== "object") return null;
    const marker = value as Partial<CouncilMigrationMarker>;
    return marker.date === date
      && typeof marker.verified_at === "string"
      && Array.isArray(marker.source_keys)
      && typeof marker.content_hash === "string"
      ? marker as CouncilMigrationMarker
      : null;
  }

  async putMigrationMarker(marker: CouncilMigrationMarker): Promise<void> {
    if (!isCouncilHistoryDate(marker.date)) throw new TypeError("Migration marker date must use YYYY-MM-DD.");
    await this.store.setJSON(`${MIGRATION_PREFIX}${marker.date}.json`, marker);
  }
}

type LocalCouncilFile = {
  version: 2;
  days: Record<string, CouncilHotDay>;
  recent: CouncilResult[];
  latest: CouncilResult | null;
  legacy: unknown[];
  migrationMarkers: Record<string, CouncilMigrationMarker>;
};

function emptyLocalCouncilFile(): LocalCouncilFile {
  return { version: 2, days: {}, recent: [], latest: null, legacy: [], migrationMarkers: {} };
}

export class LocalFileCouncilResultStore implements CouncilArchiveStore {
  readonly kind = "local-file" as const;
  private operation = Promise.resolve();

  constructor(
    private readonly filePath = resolve(process.cwd(), ".netlify", "horsee-council-results.json"),
    private readonly auditFilePath = resolve(process.cwd(), ".netlify", "horsee-council-write-audit.json"),
    private readonly recentLimit = 100,
  ) {}

  private async readFileState(): Promise<LocalCouncilFile> {
    try {
      const raw = JSON.parse(await readFile(this.filePath, "utf8")) as unknown;
      if (Array.isArray(raw)) return { ...emptyLocalCouncilFile(), legacy: raw };
      if (!raw || typeof raw !== "object") return emptyLocalCouncilFile();
      const value = raw as Partial<LocalCouncilFile>;
      return {
        version: 2,
        days: value.days ?? {},
        recent: Array.isArray(value.recent) ? value.recent.flatMap((item) => parseStoredResult(item) ?? []) : [],
        latest: parseStoredResult(value.latest),
        legacy: Array.isArray(value.legacy) ? value.legacy : [],
        migrationMarkers: value.migrationMarkers ?? {},
      };
    } catch (error) {
      if (error instanceof Error && "code" in error && error.code === "ENOENT") return emptyLocalCouncilFile();
      throw error;
    }
  }

  private async writeFileState(state: LocalCouncilFile): Promise<void> {
    const temporaryPath = `${this.filePath}.${process.pid}.${randomUUID()}.tmp`;
    await mkdir(dirname(this.filePath), { recursive: true });
    await writeFile(temporaryPath, JSON.stringify(state, null, 2), "utf8");
    await rename(temporaryPath, this.filePath);
  }

  private async mutate<T>(operation: (state: LocalCouncilFile) => Promise<T> | T): Promise<T> {
    let release: () => void = () => undefined;
    const previous = this.operation;
    this.operation = new Promise<void>((resolveOperation) => { release = resolveOperation; });
    await previous;
    try { return await operation(await this.readFileState()); } finally { release(); }
  }

  private async readAuditEvents(): Promise<CouncilWriteAuditEvent[]> {
    try {
      const raw = JSON.parse(await readFile(this.auditFilePath, "utf8")) as unknown;
      return Array.isArray(raw) ? raw as CouncilWriteAuditEvent[] : [];
    } catch (error) {
      if (error instanceof Error && "code" in error && error.code === "ENOENT") return [];
      throw error;
    }
  }

  private async writeAuditEvents(events: CouncilWriteAuditEvent[]): Promise<void> {
    const temporaryPath = `${this.auditFilePath}.${process.pid}.${randomUUID()}.tmp`;
    await mkdir(dirname(this.auditFilePath), { recursive: true });
    await writeFile(temporaryPath, JSON.stringify(events, null, 2), "utf8");
    await rename(temporaryPath, this.auditFilePath);
  }

  async save(result: CouncilResult, actor: CouncilWriteActor): Promise<void> {
    const validated = CouncilResultSchema.parse(result);
    const occurredAt = Date.now();
    await this.mutate(async (state) => {
      const date = getCouncilResultMauritiusDate(validated);
      const current = CouncilHotDaySchema.safeParse(state.days[date]);
      state.days[date] = CouncilHotDaySchema.parse({
        programme_date: date,
        updated_at: new Date(occurredAt).toISOString(),
        results: { ...(current.success ? current.data.results : {}), [validated.race_id]: validated },
      });
      state.recent = deduplicateCouncilResults([validated, ...state.recent]).slice(0, this.recentLimit);
      state.latest = state.recent[0] ?? validated;
      await this.writeFileState(state);
    });
    try {
      const auditEvents = await this.readAuditEvents();
      auditEvents.unshift(createCouncilWriteAuditEvent(validated, actor, occurredAt));
      await this.writeAuditEvents(auditEvents.slice(0, AUDIT_LIMIT));
    } catch {
      logCouncilSecurityEvent("council_audit_persistence_failed", { race_id: validated.race_id });
    }
  }

  async getLatest(): Promise<CouncilResult | null> { return (await this.readFileState()).latest; }

  async getHistory(limit: number): Promise<CouncilResult[]> {
    const state = await this.readFileState();
    const hot = Object.values(state.days).flatMap((day) => CouncilHotDaySchema.safeParse(day).success ? Object.values(day.results) : []);
    const legacy = state.legacy.flatMap((value) => parseStoredResult(value) ?? []);
    return mergeCanonicalAndLegacy(hot, legacy).slice(0, Math.max(0, limit));
  }

  async getHotByDate(date: string): Promise<CouncilResult[]> {
    const parsed = CouncilHotDaySchema.safeParse((await this.readFileState()).days[date]);
    return parsed.success ? sortCouncilResultsNewest(Object.values(parsed.data.results)) : [];
  }

  async getByDate(date: string): Promise<CouncilResult[]> {
    const state = await this.readFileState();
    const parsed = CouncilHotDaySchema.safeParse(state.days[date]);
    const canonical = parsed.success ? Object.values(parsed.data.results) : [];
    const legacy = filterCouncilResultsByDate(state.legacy.flatMap((value) => parseStoredResult(value) ?? []), date);
    return mergeCanonicalAndLegacy(canonical, legacy);
  }

  async listHotDates(): Promise<string[]> { return Object.keys((await this.readFileState()).days).sort(); }

  async getDateCounts(month: string): Promise<CouncilDateCount[]> {
    const state = await this.readFileState();
    const hot = Object.values(state.days).flatMap((day) => {
      const parsed = CouncilHotDaySchema.safeParse(day);
      return parsed.success ? Object.values(parsed.data.results) : [];
    });
    const legacy = state.legacy.flatMap((value) => parseStoredResult(value) ?? []);
    return aggregateCouncilDateCounts(mergeCanonicalAndLegacy(hot, legacy), month);
  }

  async deleteHotDay(date: string): Promise<void> {
    await this.mutate(async (state) => { delete state.days[date]; await this.writeFileState(state); });
  }

  async listLegacyEntries(): Promise<CouncilLegacyEntry[]> {
    return (await this.readFileState()).legacy.map((value, index) => ({ key: `local:${index}`, value, result: parseStoredResult(value) }));
  }

  async deleteLegacyKeys(keys: string[]): Promise<void> {
    if (keys.some((key) => !/^local:\d+$/.test(key))) throw new TypeError("Refusing to delete a non-legacy Council key.");
    const indexes = new Set(keys.map((key) => Number(key.slice("local:".length))));
    await this.mutate(async (state) => {
      state.legacy = state.legacy.filter((_value, index) => !indexes.has(index));
      await this.writeFileState(state);
    });
  }

  async getMigrationMarker(date: string): Promise<CouncilMigrationMarker | null> {
    return (await this.readFileState()).migrationMarkers[date] ?? null;
  }

  async putMigrationMarker(marker: CouncilMigrationMarker): Promise<void> {
    if (!isCouncilHistoryDate(marker.date)) throw new TypeError("Migration marker date must use YYYY-MM-DD.");
    await this.mutate(async (state) => {
      state.migrationMarkers[marker.date] = structuredClone(marker);
      await this.writeFileState(state);
    });
  }
}

export function createCouncilResultStore(
  environment: NetlifyDeployEnvironment = process.env,
): CouncilArchiveStore {
  const recentLimit = parseHorseeConfig(environment).recentResultLimit;
  if (environment.NETLIFY === "true" && environment.CONTEXT !== "dev") {
    return new NetlifyCouncilResultStore(resolveCouncilStoreName(environment), recentLimit);
  }
  return new LocalFileCouncilResultStore(undefined, undefined, recentLimit);
}
