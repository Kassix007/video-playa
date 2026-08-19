import { getStore, type Store } from "@netlify/blobs";
import { createHash } from "node:crypto";
import { mkdir, readFile, rename, writeFile } from "node:fs/promises";
import { dirname, resolve } from "node:path";
import { CouncilResultSchema, type CouncilResult } from "./council-schema.js";

export const PRODUCTION_STORE_NAME = "horsee-council-results-production";
const LATEST_KEY = "latest.json";
const HISTORY_PREFIX = "results/";
const HISTORY_LIMIT = 50;

type NetlifyDeployEnvironment = Readonly<Record<string, string | undefined>>;

export interface CouncilResultStore {
  readonly kind: "netlify-blobs" | "local-file";
  save(result: CouncilResult): Promise<void>;
  getLatest(): Promise<CouncilResult | null>;
  getHistory(limit: number): Promise<CouncilResult[]>;
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

  async save(result: CouncilResult): Promise<void> {
    const validatedResult = CouncilResultSchema.parse(result);
    const timestamp = String(Date.parse(validatedResult.analysed_at)).padStart(13, "0");
    const historyKey = `${HISTORY_PREFIX}${timestamp}-${crypto.randomUUID()}.json`;

    await Promise.all([
      this.store.setJSON(historyKey, validatedResult),
      this.store.setJSON(LATEST_KEY, validatedResult),
    ]);

    const listing = await this.store.list({ prefix: HISTORY_PREFIX });
    const staleKeys = listing.blobs
      .map((blob) => blob.key)
      .sort()
      .reverse()
      .slice(HISTORY_LIMIT);

    await Promise.all(staleKeys.map((key) => this.store.delete(key)));
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

  async save(result: CouncilResult): Promise<void> {
    const validatedResult = CouncilResultSchema.parse(result);
    const results = await this.readResults();
    results.unshift(validatedResult);
    await this.writeResults(results.slice(0, HISTORY_LIMIT));
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
