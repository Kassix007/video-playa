import { getStore, type Store } from "@netlify/blobs";
import { createHash, randomUUID } from "node:crypto";
import { mkdir, readFile, rename, writeFile } from "node:fs/promises";
import { dirname, resolve } from "node:path";
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
import { CouncilResultSchema, type CouncilResult } from "./council-schema.js";

export const PRODUCTION_STORE_NAME = "horsee-council-results-production";
const LATEST_KEY = "latest.json";
const HISTORY_PREFIX = "results/";
const AUDIT_PREFIX = "private-audit/";
const AUDIT_LIMIT = 500;

type NetlifyDeployEnvironment = Readonly<Record<string, string | undefined>>;

export interface CouncilResultStore {
  readonly kind: "netlify-blobs" | "local-file";
  save(result: CouncilResult, actor: CouncilWriteActor): Promise<void>;
  getLatest(): Promise<CouncilResult | null>;
  getHistory(limit: number): Promise<CouncilResult[]>;
  getByDate(date: string): Promise<CouncilResult[]>;
  getDateCounts(month: string): Promise<CouncilDateCount[]>;
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

function createCouncilAuditKey(event: CouncilWriteAuditEvent): string {
  return `${AUDIT_PREFIX}${String(Date.parse(event.occurred_at)).padStart(13, "0")}-${event.event_id}.json`;
}

function parseStoredResult(value: unknown): CouncilResult | null {
  const parsed = CouncilResultSchema.safeParse(value);
  return parsed.success ? parsed.data : null;
}

function isLegacyCouncilHistoryKey(key: string): boolean {
  return /^results\/\d{13}-[^/]+\.json$/.test(key);
}

function councilHistoryKeyTimestamp(key: string): number {
  const match = key.match(/(?:^|\/)(\d{13})-[^/]+\.json$/);
  return match ? Number(match[1]) : 0;
}

function safeNamespacePart(
  value: string | undefined,
  fallback: string,
  maxLength: number,
): string {
  const safeValue = value
    ?.toLowerCase()
    .replace(/[^a-z0-9-]+/g, "-")
    .replace(/^-+|-+$/g, "");

  if (!safeValue) return fallback;
  if (safeValue.length <= maxLength) return safeValue;

  const hash = createHash("sha256").update(value ?? safeValue).digest("hex").slice(0, 8);
  return `${safeValue.slice(0, maxLength - hash.length - 1)}-${hash}`;
}

export function resolveCouncilStoreName(
  environment: NetlifyDeployEnvironment = process.env,
): string {
  if (environment.CONTEXT === "production") {
    return PRODUCTION_STORE_NAME;
  }

  if (environment.CONTEXT === "deploy-preview") {
    const previewId = safeNamespacePart(
      environment.REVIEW_ID ?? environment.DEPLOY_ID,
      "unknown",
      24,
    );
    return `horsee-council-results-deploy-preview-${previewId}`;
  }

  if (environment.CONTEXT === "branch-deploy") {
    const branch = safeNamespacePart(
      environment.BRANCH ?? environment.DEPLOY_ID,
      "unknown",
      30,
    );
    return `horsee-council-results-branch-${branch}`;
  }

  const context = safeNamespacePart(environment.CONTEXT, "nonproduction", 12);
  const deployId = safeNamespacePart(environment.DEPLOY_ID, "unknown", 24);
  return `horsee-council-results-${context}-${deployId}`;
}

class NetlifyCouncilResultStore implements CouncilResultStore {
  readonly kind = "netlify-blobs" as const;

  constructor(storeName: string) {
    this.store = getStore({ name: storeName, consistency: "strong" });
  }

  private readonly store: Store;

  private async listKeys(prefix: string): Promise<string[]> {
    const keys: string[] = [];
    for await (const page of this.store.list({ prefix, paginate: true })) {
      keys.push(...page.blobs.map((blob) => blob.key));
    }
    return keys;
  }

  private async readResults(keys: string[]): Promise<CouncilResult[]> {
    const values = await Promise.all(keys.map((key) => this.store.get(key, { type: "json" })));
    return values.flatMap((value) => {
      const result = parseStoredResult(value);
      return result ? [result] : [];
    });
  }

  async save(result: CouncilResult, actor: CouncilWriteActor): Promise<void> {
    const validatedResult = CouncilResultSchema.parse(result);
    const occurredAt = Date.now();
    const eventId = randomUUID();
    const historyKey = createCouncilDatedHistoryKey(
      getCouncilResultMauritiusDate(validatedResult),
      occurredAt,
      eventId,
    );
    const auditEvent = createCouncilWriteAuditEvent(
      validatedResult,
      actor,
      occurredAt,
      eventId,
    );

    await Promise.all([
      this.store.setJSON(historyKey, validatedResult),
      this.store.setJSON(LATEST_KEY, validatedResult),
    ]);

    try {
      await this.store.setJSON(createCouncilAuditKey(auditEvent), auditEvent);
      const auditListing = await this.store.list({ prefix: AUDIT_PREFIX });
      const staleAuditKeys = auditListing.blobs
        .map((blob) => blob.key)
        .sort()
        .reverse()
        .slice(AUDIT_LIMIT);
      await Promise.all(staleAuditKeys.map((key) => this.store.delete(key)));
    } catch {
      logCouncilSecurityEvent("council_audit_persistence_failed", {
        race_id: validatedResult.race_id,
        event_id: eventId,
      });
    }

  }

  async getLatest(): Promise<CouncilResult | null> {
    return parseStoredResult(await this.store.get(LATEST_KEY, { type: "json" }));
  }

  async getHistory(limit: number): Promise<CouncilResult[]> {
    const keys = (await this.listKeys(HISTORY_PREFIX))
      .sort((left, right) => councilHistoryKeyTimestamp(right) - councilHistoryKeyTimestamp(left))
      .slice(0, Math.max(0, limit));
    return this.readResults(keys);
  }

  async getByDate(date: string): Promise<CouncilResult[]> {
    const [datedKeys, allKeys] = await Promise.all([
      this.listKeys(`${HISTORY_PREFIX}${date}/`),
      this.listKeys(HISTORY_PREFIX),
    ]);
    const legacyKeys = allKeys.filter(isLegacyCouncilHistoryKey);
    const [datedResults, legacyResults] = await Promise.all([
      this.readResults(datedKeys),
      this.readResults(legacyKeys),
    ]);
    return sortCouncilResultsNewest([
      ...datedResults,
      ...filterCouncilResultsByDate(legacyResults, date),
    ]);
  }

  async getDateCounts(month: string): Promise<CouncilDateCount[]> {
    const [monthKeys, allKeys] = await Promise.all([
      this.listKeys(`${HISTORY_PREFIX}${month}-`),
      this.listKeys(HISTORY_PREFIX),
    ]);
    const counts = new Map<string, number>();
    for (const key of monthKeys) {
      const date = key.slice(HISTORY_PREFIX.length, HISTORY_PREFIX.length + 10);
      if (isCouncilHistoryDate(date)) counts.set(date, (counts.get(date) ?? 0) + 1);
    }
    const legacyResults = await this.readResults(allKeys.filter(isLegacyCouncilHistoryKey));
    for (const item of aggregateCouncilDateCounts(legacyResults, month)) {
      counts.set(item.date, (counts.get(item.date) ?? 0) + item.count);
    }
    return [...counts.entries()]
      .sort(([left], [right]) => left.localeCompare(right))
      .map(([date, count]) => ({ date, count }));
  }
}

class LocalFileCouncilResultStore implements CouncilResultStore {
  readonly kind = "local-file" as const;

  constructor(
    private readonly filePath = resolve(process.cwd(), ".netlify", "horsee-council-results.json"),
    private readonly auditFilePath = resolve(
      process.cwd(),
      ".netlify",
      "horsee-council-write-audit.json",
    ),
  ) {}

  private async readResults(): Promise<CouncilResult[]> {
    try {
      const raw = JSON.parse(await readFile(this.filePath, "utf8")) as unknown;
      if (!Array.isArray(raw)) return [];
      return raw.flatMap((value) => {
        const result = parseStoredResult(value);
        return result ? [result] : [];
      });
    } catch (error) {
      if (error instanceof Error && "code" in error && error.code === "ENOENT") return [];
      throw error;
    }
  }

  private async writeResults(results: CouncilResult[]): Promise<void> {
    const temporaryPath = `${this.filePath}.${process.pid}.tmp`;
    await mkdir(dirname(this.filePath), { recursive: true });
    await writeFile(temporaryPath, JSON.stringify(results, null, 2), "utf8");
    await rename(temporaryPath, this.filePath);
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
    const temporaryPath = `${this.auditFilePath}.${process.pid}.tmp`;
    await mkdir(dirname(this.auditFilePath), { recursive: true });
    await writeFile(temporaryPath, JSON.stringify(events, null, 2), "utf8");
    await rename(temporaryPath, this.auditFilePath);
  }

  async save(result: CouncilResult, actor: CouncilWriteActor): Promise<void> {
    const validatedResult = CouncilResultSchema.parse(result);
    const occurredAt = Date.now();
    const [results, auditEvents] = await Promise.all([
      this.readResults(),
      this.readAuditEvents(),
    ]);
    results.unshift(validatedResult);
    auditEvents.unshift(createCouncilWriteAuditEvent(validatedResult, actor, occurredAt));
    await this.writeResults(results);
    try {
      await this.writeAuditEvents(auditEvents.slice(0, AUDIT_LIMIT));
    } catch {
      logCouncilSecurityEvent("council_audit_persistence_failed", {
        race_id: validatedResult.race_id,
      });
    }
  }

  async getLatest(): Promise<CouncilResult | null> {
    return (await this.readResults())[0] ?? null;
  }

  async getHistory(limit: number): Promise<CouncilResult[]> {
    return (await this.readResults()).slice(0, Math.max(0, limit));
  }

  async getByDate(date: string): Promise<CouncilResult[]> {
    return sortCouncilResultsNewest(filterCouncilResultsByDate(await this.readResults(), date));
  }

  async getDateCounts(month: string): Promise<CouncilDateCount[]> {
    return aggregateCouncilDateCounts(await this.readResults(), month);
  }
}

export function createCouncilResultStore(
  environment: NetlifyDeployEnvironment = process.env,
): CouncilResultStore {
  if (environment.NETLIFY === "true" && environment.CONTEXT !== "dev") {
    return new NetlifyCouncilResultStore(resolveCouncilStoreName(environment));
  }

  return new LocalFileCouncilResultStore();
}
