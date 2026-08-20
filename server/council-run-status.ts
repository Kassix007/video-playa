import { getStore, type Store } from "@netlify/blobs";
import { randomUUID } from "node:crypto";
import { mkdir, readFile, rename, writeFile } from "node:fs/promises";
import { dirname, resolve } from "node:path";
import { z } from "zod";
import { resolveCouncilStoreName } from "./council-store.js";

export const COUNCIL_RUN_STAGES = [
  "RECEIVED",
  "RESOLVING_RACE",
  "FACT_LOCK",
  "ANALYSING_RUNNERS",
  "MARKET_AUDIT",
  "VERDICT_READY",
  "SAVING",
  "SAVED",
  "FAILED",
] as const;

export const CouncilRunStageSchema = z.enum(COUNCIL_RUN_STAGES);

export const CouncilRunStatusSchema = z.object({
  command: z.string().trim().min(1).max(160),
  stage: CouncilRunStageSchema,
  message: z.string().trim().min(1).max(280).optional(),
  updated_at: z.iso.datetime().max(40),
}).strict();

export type CouncilRunStatus = z.infer<typeof CouncilRunStatusSchema>;

type NetlifyDeployEnvironment = Readonly<Record<string, string | undefined>>;

export interface CouncilRunStatusStore {
  set(status: CouncilRunStatus): Promise<void>;
  get(): Promise<CouncilRunStatus | null>;
}

const STATUS_KEY = "current.json";
const RESULT_STORE_PREFIX = "horsee-council-results";
const STATUS_STORE_PREFIX = "horsee-council-run-status";

function parseStoredStatus(value: unknown): CouncilRunStatus | null {
  const parsed = CouncilRunStatusSchema.safeParse(value);
  return parsed.success ? parsed.data : null;
}

export function resolveCouncilRunStatusStoreName(
  environment: NetlifyDeployEnvironment = process.env,
): string {
  const resultStoreName = resolveCouncilStoreName(environment);
  if (!resultStoreName.startsWith(RESULT_STORE_PREFIX)) {
    throw new Error("Council result storage returned an unexpected namespace.");
  }
  return `${STATUS_STORE_PREFIX}${resultStoreName.slice(RESULT_STORE_PREFIX.length)}`;
}

class NetlifyCouncilRunStatusStore implements CouncilRunStatusStore {
  private readonly store: Store;

  constructor(storeName: string) {
    this.store = getStore({ name: storeName, consistency: "strong" });
  }

  async set(status: CouncilRunStatus): Promise<void> {
    await this.store.setJSON(STATUS_KEY, CouncilRunStatusSchema.parse(status));
  }

  async get(): Promise<CouncilRunStatus | null> {
    return parseStoredStatus(await this.store.get(STATUS_KEY, { type: "json" }));
  }
}

class LocalFileCouncilRunStatusStore implements CouncilRunStatusStore {
  constructor(
    private readonly filePath = resolve(
      process.cwd(),
      ".netlify",
      "horsee-council-run-status.json",
    ),
  ) {}

  async set(status: CouncilRunStatus): Promise<void> {
    const validatedStatus = CouncilRunStatusSchema.parse(status);
    const temporaryPath = `${this.filePath}.${process.pid}.${randomUUID()}.tmp`;
    await mkdir(dirname(this.filePath), { recursive: true });
    await writeFile(temporaryPath, JSON.stringify(validatedStatus, null, 2), "utf8");
    await rename(temporaryPath, this.filePath);
  }

  async get(): Promise<CouncilRunStatus | null> {
    try {
      return parseStoredStatus(JSON.parse(await readFile(this.filePath, "utf8")) as unknown);
    } catch (error) {
      if (error instanceof Error && "code" in error && error.code === "ENOENT") return null;
      throw error;
    }
  }
}

export function createCouncilRunStatusStore(
  environment: NetlifyDeployEnvironment = process.env,
  localFilePath?: string,
): CouncilRunStatusStore {
  if (environment.NETLIFY === "true" && environment.CONTEXT !== "dev") {
    return new NetlifyCouncilRunStatusStore(resolveCouncilRunStatusStoreName(environment));
  }

  return new LocalFileCouncilRunStatusStore(localFilePath);
}
