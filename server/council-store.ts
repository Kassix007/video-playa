import { getStore, type Store } from "@netlify/blobs";
import { mkdir, readFile, rename, writeFile } from "node:fs/promises";
import { dirname, resolve } from "node:path";
import { CouncilResultSchema, type CouncilResult } from "./council-schema.js";

const STORE_NAME = "horsee-council-results";
const LATEST_KEY = "latest.json";
const HISTORY_PREFIX = "results/";
const HISTORY_LIMIT = 50;

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

class NetlifyCouncilResultStore implements CouncilResultStore {
  readonly kind = "netlify-blobs" as const;

  constructor(private readonly store: Store = getStore({ name: STORE_NAME, consistency: "strong" })) {}

  async save(result: CouncilResult): Promise<void> {
    const timestamp = String(Date.parse(result.analysed_at)).padStart(13, "0");
    const historyKey = `${HISTORY_PREFIX}${timestamp}-${crypto.randomUUID()}.json`;

    await Promise.all([
      this.store.setJSON(historyKey, result),
      this.store.setJSON(LATEST_KEY, result),
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
    const results = await this.readResults();
    results.unshift(result);
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
  if (process.env.NETLIFY === "true") {
    return new NetlifyCouncilResultStore();
  }

  return new LocalFileCouncilResultStore();
}
