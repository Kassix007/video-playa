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
import { CouncilResultSchema, type CouncilResult } from "./council-schema.js";

export const PRODUCTION_STORE_NAME = "horsee-council-results-production";
const LATEST_KEY = "latest.json";
const HISTORY_PREFIX = "results/";
const AUDIT_PREFIX = "private-audit/";
const HISTORY_LIMIT = 50;
const AUDIT_LIMIT = 500;

type NetlifyDeployEnvironment = Readonly<Record<string, string | undefined>>;

export interface CouncilResultStore {
  readonly kind: "netlify-blobs" | "local-file";
  save(result: CouncilResult, actor: CouncilWriteActor): Promise<void>;
  getLatest(): Promise<CouncilResult | null>;
  getHistory(limit: number): Promise<CouncilResult[]>;
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

function createCouncilAuditKey(event: CouncilWriteAuditEvent): string {
  return `${AUDIT_PREFIX}${String(Date.parse(event.occurred_at)).padStart(13, "0")}-${event.event_id}.json`;
}

function parseStoredResult(value: unknown): CouncilResult | null {
  const parsed = CouncilResultSchema.safeParse(value);
  return parsed.success ? parsed.data : null;
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

  async save(result: CouncilResult, actor: CouncilWriteActor): Promise<void> {
    const validatedResult = CouncilResultSchema.parse(result);
    const occurredAt = Date.now();
    const eventId = randomUUID();
    const historyKey = createCouncilHistoryKey(occurredAt, eventId);
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

    try {
      const historyListing = await this.store.list({ prefix: HISTORY_PREFIX });
      const staleHistoryKeys = historyListing.blobs
        .map((blob) => blob.key)
        .sort()
        .reverse()
        .slice(HISTORY_LIMIT);
      await Promise.all(staleHistoryKeys.map((key) => this.store.delete(key)));
    } catch {
      logCouncilSecurityEvent("council_history_pruning_failed", {
        race_id: validatedResult.race_id,
        event_id: eventId,
      });
    }
  }

  async getLatest(): Promise<CouncilResult | null> {
    return parseStoredResult(await this.store.get(LATEST_KEY, { type: "json" }));
  }

  async getHistory(limit: number): Promise<CouncilResult[]> {
    const listing = await this.store.list({ prefix: HISTORY_PREFIX });
    const keys = listing.blobs
      .map((blob) => blob.key)
      .sort()
      .reverse()
      .slice(0, Math.min(limit, HISTORY_LIMIT));
    const values = await Promise.all(keys.map((key) => this.store.get(key, { type: "json" })));

    return values.flatMap((value) => {
      const result = parseStoredResult(value);
      return result ? [result] : [];
    });
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
    await this.writeResults(results.slice(0, HISTORY_LIMIT));
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
    return (await this.readResults()).slice(0, Math.min(limit, HISTORY_LIMIT));
  }
}

export function createCouncilResultStore(): CouncilResultStore {
  if (process.env.NETLIFY === "true" && process.env.CONTEXT !== "dev") {
    return new NetlifyCouncilResultStore(resolveCouncilStoreName());
  }

  return new LocalFileCouncilResultStore();
}
