import { getStore, type Store } from "@netlify/blobs";
import { createHash, randomUUID } from "node:crypto";
import { mkdir, readFile, rename, writeFile } from "node:fs/promises";
import { dirname, resolve } from "node:path";
import {
  SmspariazRacecardSuccessSchema,
  type SmspariazRacecardSuccess,
} from "./smspariaz-racecard.js";
import {
  HorseeArchiveDayStateSchema,
  HorseeDailyQueueSchema,
  HorseeOperationalLeaseSchema,
  HorseeSchedulerStateSchema,
  type HorseeArchiveDayState,
  type HorseeDailyQueue,
  type HorseeOperationalLease,
  type HorseeSchedulerState,
} from "./horsee-job-schema.js";

type NetlifyDeployEnvironment = Readonly<Record<string, string | undefined>>;

export const HORSEE_SCHEDULER_PRODUCTION_STORE_NAME = "horsee-scheduler-production";

export interface VersionedValue<T> {
  value: T | null;
  etag?: string;
}

export interface HorseeJobStore {
  readonly kind: "netlify-blobs" | "local-file" | "memory";
  getQueue(date: string): Promise<VersionedValue<HorseeDailyQueue>>;
  putQueue(queue: HorseeDailyQueue, expectedEtag?: string): Promise<boolean>;
  getRacecard(date: string): Promise<SmspariazRacecardSuccess | null>;
  putRacecard(racecard: SmspariazRacecardSuccess): Promise<void>;
  getSchedulerState(): Promise<VersionedValue<HorseeSchedulerState>>;
  putSchedulerState(state: HorseeSchedulerState, expectedEtag?: string): Promise<boolean>;
  getArchiveDayState(date: string): Promise<VersionedValue<HorseeArchiveDayState>>;
  putArchiveDayState(state: HorseeArchiveDayState, expectedEtag?: string): Promise<boolean>;
  listQueueDates(): Promise<string[]>;
  listArchiveDayStates(): Promise<HorseeArchiveDayState[]>;
  deleteHotDay(date: string): Promise<void>;
  acquireLease(key: string, lease: HorseeOperationalLease, now: Date): Promise<boolean>;
  releaseLease(key: string, owner: string, now: Date): Promise<void>;
}

function safeNamespacePart(value: string | undefined, fallback: string, maxLength: number): string {
  const safeValue = value?.toLowerCase().replace(/[^a-z0-9-]+/g, "-").replace(/^-+|-+$/g, "");
  if (!safeValue) return fallback;
  if (safeValue.length <= maxLength) return safeValue;
  const hash = createHash("sha256").update(value ?? safeValue).digest("hex").slice(0, 8);
  return `${safeValue.slice(0, maxLength - hash.length - 1)}-${hash}`;
}

export function resolveHorseeSchedulerStoreName(
  environment: NetlifyDeployEnvironment = process.env,
): string {
  if (environment.CONTEXT === "production") return HORSEE_SCHEDULER_PRODUCTION_STORE_NAME;
  if (environment.CONTEXT === "deploy-preview") {
    return `horsee-scheduler-deploy-preview-${safeNamespacePart(environment.REVIEW_ID ?? environment.DEPLOY_ID, "unknown", 24)}`;
  }
  if (environment.CONTEXT === "branch-deploy") {
    return `horsee-scheduler-branch-${safeNamespacePart(environment.BRANCH ?? environment.DEPLOY_ID, "unknown", 34)}`;
  }
  return `horsee-scheduler-${safeNamespacePart(environment.CONTEXT, "nonproduction", 12)}-${safeNamespacePart(environment.DEPLOY_ID, "unknown", 24)}`;
}

export const horseeQueueKey = (date: string): string => `jobs/${date}.json`;
export const horseeRacecardKey = (date: string): string => `racecards/${date}.json`;
export const horseeArchiveStateKey = (date: string): string => `archive-days/${date}.json`;
export const horseeLeaseKey = (key: string): string => `locks/${key}.json`;

const SCHEDULER_STATE_KEY = "scheduler-state.json";

function valueEtag(value: unknown): string {
  return `"${createHash("sha256").update(JSON.stringify(value)).digest("hex")}"`;
}

function parseOrNull<T>(schema: { safeParse: (value: unknown) => { success: boolean; data?: T } }, value: unknown): T | null {
  const parsed = schema.safeParse(value);
  return parsed.success ? parsed.data ?? null : null;
}

class NetlifyHorseeJobStore implements HorseeJobStore {
  readonly kind = "netlify-blobs" as const;
  private readonly store: Store;

  constructor(storeName: string) {
    this.store = getStore({ name: storeName, consistency: "strong" });
  }

  private async getVersioned<T>(key: string, schema: { safeParse: (value: unknown) => { success: boolean; data?: T } }): Promise<VersionedValue<T>> {
    const entry = await this.store.getWithMetadata(key, { type: "json", consistency: "strong" });
    if (!entry) return { value: null };
    return { value: parseOrNull(schema, entry.data), etag: entry.etag };
  }

  private async putVersioned(key: string, value: unknown, expectedEtag?: string): Promise<boolean> {
    const result = await this.store.setJSON(key, value, expectedEtag
      ? { onlyIfMatch: expectedEtag }
      : { onlyIfNew: true });
    return result.modified;
  }

  async getQueue(date: string): Promise<VersionedValue<HorseeDailyQueue>> {
    return this.getVersioned(horseeQueueKey(date), HorseeDailyQueueSchema);
  }

  async putQueue(queue: HorseeDailyQueue, expectedEtag?: string): Promise<boolean> {
    return this.putVersioned(
      horseeQueueKey(queue.programme_date),
      HorseeDailyQueueSchema.parse(queue),
      expectedEtag,
    );
  }

  async getRacecard(date: string): Promise<SmspariazRacecardSuccess | null> {
    return parseOrNull(
      SmspariazRacecardSuccessSchema,
      await this.store.get(horseeRacecardKey(date), { type: "json", consistency: "strong" }),
    );
  }

  async putRacecard(racecard: SmspariazRacecardSuccess): Promise<void> {
    await this.store.setJSON(horseeRacecardKey(racecard.programme_date), SmspariazRacecardSuccessSchema.parse(racecard));
  }

  async getSchedulerState(): Promise<VersionedValue<HorseeSchedulerState>> {
    return this.getVersioned(SCHEDULER_STATE_KEY, HorseeSchedulerStateSchema);
  }

  async putSchedulerState(state: HorseeSchedulerState, expectedEtag?: string): Promise<boolean> {
    return this.putVersioned(SCHEDULER_STATE_KEY, HorseeSchedulerStateSchema.parse(state), expectedEtag);
  }

  async getArchiveDayState(date: string): Promise<VersionedValue<HorseeArchiveDayState>> {
    return this.getVersioned(horseeArchiveStateKey(date), HorseeArchiveDayStateSchema);
  }

  async putArchiveDayState(state: HorseeArchiveDayState, expectedEtag?: string): Promise<boolean> {
    return this.putVersioned(horseeArchiveStateKey(state.date), HorseeArchiveDayStateSchema.parse(state), expectedEtag);
  }

  private async listKeys(prefix: string): Promise<string[]> {
    const keys: string[] = [];
    for await (const page of this.store.list({ prefix, paginate: true })) {
      keys.push(...page.blobs.map((blob) => blob.key));
    }
    return keys;
  }

  async listQueueDates(): Promise<string[]> {
    return (await this.listKeys("jobs/"))
      .flatMap((key) => /^jobs\/(\d{4}-\d{2}-\d{2})\.json$/.exec(key)?.[1] ?? [])
      .sort();
  }

  async listArchiveDayStates(): Promise<HorseeArchiveDayState[]> {
    const keys = await this.listKeys("archive-days/");
    const values = await Promise.all(keys.map((key) => this.store.get(key, { type: "json", consistency: "strong" })));
    return values.flatMap((value) => {
      const parsed = HorseeArchiveDayStateSchema.safeParse(value);
      return parsed.success ? [parsed.data] : [];
    }).sort((left, right) => left.date.localeCompare(right.date));
  }

  async deleteHotDay(date: string): Promise<void> {
    await Promise.all([
      this.store.delete(horseeQueueKey(date)),
      this.store.delete(horseeRacecardKey(date)),
    ]);
  }

  async acquireLease(key: string, lease: HorseeOperationalLease, now: Date): Promise<boolean> {
    const storageKey = horseeLeaseKey(key);
    const validated = HorseeOperationalLeaseSchema.parse(lease);
    const current = await this.store.getWithMetadata(storageKey, { type: "json", consistency: "strong" });
    if (!current) return (await this.store.setJSON(storageKey, validated, { onlyIfNew: true })).modified;
    const currentLease = HorseeOperationalLeaseSchema.safeParse(current.data);
    if (currentLease.success && Date.parse(currentLease.data.expires_at) > now.getTime()) return false;
    if (!current.etag) return false;
    return (await this.store.setJSON(storageKey, validated, { onlyIfMatch: current.etag })).modified;
  }

  async releaseLease(key: string, owner: string, now: Date): Promise<void> {
    const storageKey = horseeLeaseKey(key);
    const current = await this.store.getWithMetadata(storageKey, { type: "json", consistency: "strong" });
    if (!current?.etag) return;
    const lease = HorseeOperationalLeaseSchema.safeParse(current.data);
    if (!lease.success || lease.data.owner !== owner) return;
    await this.store.setJSON(storageKey, {
      ...lease.data,
      expires_at: now.toISOString(),
    }, { onlyIfMatch: current.etag });
  }
}

type LocalState = {
  queues: Record<string, HorseeDailyQueue>;
  racecards: Record<string, SmspariazRacecardSuccess>;
  schedulerState: HorseeSchedulerState | null;
  archiveStates: Record<string, HorseeArchiveDayState>;
  leases: Record<string, HorseeOperationalLease>;
};

function emptyLocalState(): LocalState {
  return { queues: {}, racecards: {}, schedulerState: null, archiveStates: {}, leases: {} };
}

export class LocalFileHorseeJobStore implements HorseeJobStore {
  readonly kind: HorseeJobStore["kind"] = "local-file";
  private operation = Promise.resolve();

  constructor(private readonly filePath = resolve(process.cwd(), ".netlify", "horsee-scheduler.json")) {}

  private async readState(): Promise<LocalState> {
    try {
      const value = JSON.parse(await readFile(this.filePath, "utf8")) as Partial<LocalState>;
      return {
        queues: value.queues ?? {},
        racecards: value.racecards ?? {},
        schedulerState: value.schedulerState ?? null,
        archiveStates: value.archiveStates ?? {},
        leases: value.leases ?? {},
      };
    } catch (error) {
      if (error instanceof Error && "code" in error && error.code === "ENOENT") return emptyLocalState();
      throw error;
    }
  }

  private async writeState(state: LocalState): Promise<void> {
    const temporaryPath = `${this.filePath}.${process.pid}.${randomUUID()}.tmp`;
    await mkdir(dirname(this.filePath), { recursive: true });
    await writeFile(temporaryPath, JSON.stringify(state, null, 2), "utf8");
    await rename(temporaryPath, this.filePath);
  }

  private async mutate<T>(operation: (state: LocalState) => Promise<T> | T): Promise<T> {
    let release: () => void = () => undefined;
    const previous = this.operation;
    this.operation = new Promise<void>((resolveOperation) => { release = resolveOperation; });
    await previous;
    try {
      return await operation(await this.readState());
    } finally {
      release();
    }
  }

  async getQueue(date: string): Promise<VersionedValue<HorseeDailyQueue>> {
    const value = (await this.readState()).queues[date] ?? null;
    return { value, etag: value ? valueEtag(value) : undefined };
  }

  async putQueue(queue: HorseeDailyQueue, expectedEtag?: string): Promise<boolean> {
    return this.mutate(async (state) => {
      const current = state.queues[queue.programme_date];
      if ((current && valueEtag(current) !== expectedEtag) || (!current && expectedEtag)) return false;
      if (current && !expectedEtag) return false;
      state.queues[queue.programme_date] = HorseeDailyQueueSchema.parse(queue);
      await this.writeState(state);
      return true;
    });
  }

  async getRacecard(date: string): Promise<SmspariazRacecardSuccess | null> {
    return (await this.readState()).racecards[date] ?? null;
  }

  async putRacecard(racecard: SmspariazRacecardSuccess): Promise<void> {
    await this.mutate(async (state) => {
      state.racecards[racecard.programme_date] = SmspariazRacecardSuccessSchema.parse(racecard);
      await this.writeState(state);
    });
  }

  async getSchedulerState(): Promise<VersionedValue<HorseeSchedulerState>> {
    const value = (await this.readState()).schedulerState;
    return { value, etag: value ? valueEtag(value) : undefined };
  }

  async putSchedulerState(stateValue: HorseeSchedulerState, expectedEtag?: string): Promise<boolean> {
    return this.mutate(async (state) => {
      const current = state.schedulerState;
      if ((current && valueEtag(current) !== expectedEtag) || (!current && expectedEtag)) return false;
      if (current && !expectedEtag) return false;
      state.schedulerState = HorseeSchedulerStateSchema.parse(stateValue);
      await this.writeState(state);
      return true;
    });
  }

  async getArchiveDayState(date: string): Promise<VersionedValue<HorseeArchiveDayState>> {
    const value = (await this.readState()).archiveStates[date] ?? null;
    return { value, etag: value ? valueEtag(value) : undefined };
  }

  async putArchiveDayState(stateValue: HorseeArchiveDayState, expectedEtag?: string): Promise<boolean> {
    return this.mutate(async (state) => {
      const current = state.archiveStates[stateValue.date];
      if ((current && valueEtag(current) !== expectedEtag) || (!current && expectedEtag)) return false;
      if (current && !expectedEtag) return false;
      state.archiveStates[stateValue.date] = HorseeArchiveDayStateSchema.parse(stateValue);
      await this.writeState(state);
      return true;
    });
  }

  async listQueueDates(): Promise<string[]> {
    return Object.keys((await this.readState()).queues).sort();
  }

  async listArchiveDayStates(): Promise<HorseeArchiveDayState[]> {
    return Object.values((await this.readState()).archiveStates).sort((left, right) => left.date.localeCompare(right.date));
  }

  async deleteHotDay(date: string): Promise<void> {
    await this.mutate(async (state) => {
      delete state.queues[date];
      delete state.racecards[date];
      await this.writeState(state);
    });
  }

  async acquireLease(key: string, leaseValue: HorseeOperationalLease, now: Date): Promise<boolean> {
    return this.mutate(async (state) => {
      const current = state.leases[key];
      if (current && Date.parse(current.expires_at) > now.getTime()) return false;
      state.leases[key] = HorseeOperationalLeaseSchema.parse(leaseValue);
      await this.writeState(state);
      return true;
    });
  }

  async releaseLease(key: string, owner: string, now: Date): Promise<void> {
    await this.mutate(async (state) => {
      const current = state.leases[key];
      if (!current || current.owner !== owner) return;
      state.leases[key] = { ...current, expires_at: now.toISOString() };
      await this.writeState(state);
    });
  }
}

export class MemoryHorseeJobStore extends LocalFileHorseeJobStore {
  readonly kind = "memory" as const;
  private state = emptyLocalState();
  private versions = new Map<string, number>();

  constructor() { super("memory-unused"); }

  private etag(key: string): string | undefined {
    const version = this.versions.get(key);
    return version === undefined ? undefined : `"${version}"`;
  }

  private commit(key: string): void {
    this.versions.set(key, (this.versions.get(key) ?? 0) + 1);
  }

  override async getQueue(date: string): Promise<VersionedValue<HorseeDailyQueue>> {
    return { value: this.state.queues[date] ?? null, etag: this.etag(`q:${date}`) };
  }
  override async putQueue(queue: HorseeDailyQueue, expectedEtag?: string): Promise<boolean> {
    const key = `q:${queue.programme_date}`;
    if (this.etag(key) !== expectedEtag) return false;
    this.state.queues[queue.programme_date] = structuredClone(HorseeDailyQueueSchema.parse(queue));
    this.commit(key);
    return true;
  }
  override async getRacecard(date: string): Promise<SmspariazRacecardSuccess | null> { return structuredClone(this.state.racecards[date] ?? null); }
  override async putRacecard(racecard: SmspariazRacecardSuccess): Promise<void> { this.state.racecards[racecard.programme_date] = structuredClone(racecard); }
  override async getSchedulerState(): Promise<VersionedValue<HorseeSchedulerState>> { return { value: structuredClone(this.state.schedulerState), etag: this.etag("state") }; }
  override async putSchedulerState(value: HorseeSchedulerState, expectedEtag?: string): Promise<boolean> {
    if (this.etag("state") !== expectedEtag) return false;
    this.state.schedulerState = structuredClone(HorseeSchedulerStateSchema.parse(value)); this.commit("state"); return true;
  }
  override async getArchiveDayState(date: string): Promise<VersionedValue<HorseeArchiveDayState>> { return { value: structuredClone(this.state.archiveStates[date] ?? null), etag: this.etag(`a:${date}`) }; }
  override async putArchiveDayState(value: HorseeArchiveDayState, expectedEtag?: string): Promise<boolean> {
    const key = `a:${value.date}`; if (this.etag(key) !== expectedEtag) return false;
    this.state.archiveStates[value.date] = structuredClone(HorseeArchiveDayStateSchema.parse(value)); this.commit(key); return true;
  }
  override async listQueueDates(): Promise<string[]> { return Object.keys(this.state.queues).sort(); }
  override async listArchiveDayStates(): Promise<HorseeArchiveDayState[]> { return structuredClone(Object.values(this.state.archiveStates).sort((a, b) => a.date.localeCompare(b.date))); }
  override async deleteHotDay(date: string): Promise<void> { delete this.state.queues[date]; delete this.state.racecards[date]; }
  override async acquireLease(key: string, lease: HorseeOperationalLease, now: Date): Promise<boolean> {
    const current = this.state.leases[key]; if (current && Date.parse(current.expires_at) > now.getTime()) return false;
    this.state.leases[key] = structuredClone(lease); return true;
  }
  override async releaseLease(key: string, owner: string, now: Date): Promise<void> {
    const current = this.state.leases[key]; if (current?.owner === owner) current.expires_at = now.toISOString();
  }
}

export function createHorseeJobStore(
  environment: NetlifyDeployEnvironment = process.env,
): HorseeJobStore {
  if (environment.NETLIFY === "true" && environment.CONTEXT !== "dev") {
    return new NetlifyHorseeJobStore(resolveHorseeSchedulerStoreName(environment));
  }
  return new LocalFileHorseeJobStore();
}
