import { getStore, type Store } from "@netlify/blobs";
import { randomUUID } from "node:crypto";
import { mkdir, readFile, rename, writeFile } from "node:fs/promises";
import { dirname, resolve } from "node:path";
import { z } from "zod";
import type { SmspariazConfig } from "./smspariaz-config.js";
import { createSmspariazCipher, type SmspariazCipher, type SmspariazEncryptedEnvelope } from "./smspariaz-crypto.js";
import { resolveSmspariazStoreName } from "./smspariaz-session-store.js";

export const SmspariazCanonicalSelectionSchema = z.object({
  event_id: z.string().min(1).max(100),
  market_id: z.string().min(1).max(100),
  selection_code: z.string().min(1).max(100),
  selection_id: z.string().min(1).max(100),
  odds: z.number().positive(),
  bet_code: z.string().min(1).max(100),
  home: z.string().min(1).max(300),
  away: z.string().min(1).max(300),
}).strict();

export const SmspariazPreparedBetSchema = z.object({
  schema_version: z.literal(1),
  handle: z.string().regex(/^[A-Za-z0-9_-]{43}$/),
  state: z.enum(["PREPARED", "SUBMITTING", "SUCCEEDED", "REJECTED", "AMBIGUOUS", "EXPIRED"]),
  principal_hash: z.string().regex(/^[a-f0-9]{64}$/),
  session_generation: z.number().int().nonnegative(),
  game: z.enum(["s", "a"]),
  selections: z.array(SmspariazCanonicalSelectionSchema).min(1).max(25),
  stake: z.number().positive().max(1_000_000),
  stake_tax: z.number().nonnegative().max(1_000_000),
  total_odds: z.number().positive(),
  estimated_payout: z.number().nonnegative(),
  bookcode: z.string().min(1).max(500),
  flow_fingerprint: z.string().regex(/^[a-f0-9]{64}$/),
  created_at: z.string().datetime(),
  expires_at: z.string().datetime(),
  terminal: z.object({
    error_code: z.string().max(100).optional(),
    confirmation: z.string().max(500).optional(),
    reference_hash: z.string().max(100).optional(),
    completed_at: z.string().datetime(),
  }).strict().optional(),
}).strict();
export type SmspariazPreparedBet = z.infer<typeof SmspariazPreparedBetSchema>;
export type SmspariazPreparedBetTerminal = NonNullable<SmspariazPreparedBet["terminal"]>;

export interface SmspariazPreparedBetStore {
  readonly kind: "netlify-blobs" | "local-file" | "memory";
  create(record: SmspariazPreparedBet): Promise<void>;
  get(handle: string): Promise<SmspariazPreparedBet | null>;
  claim(handle: string, principalHash: string, sessionGeneration: number, now: number): Promise<SmspariazPreparedBet>;
  complete(handle: string, state: "SUCCEEDED" | "REJECTED" | "AMBIGUOUS", terminal: SmspariazPreparedBetTerminal): Promise<void>;
}

function validateHandle(handle: string): void {
  if (!/^[A-Za-z0-9_-]{43}$/.test(handle)) throw new Error("PREPARED_BET_INVALID");
}

function claimRecord(record: SmspariazPreparedBet | null, principalHash: string, sessionGeneration: number, now: number): SmspariazPreparedBet {
  if (!record) throw new Error("PREPARED_BET_INVALID");
  if (record.state !== "PREPARED") throw new Error("PREPARED_BET_ALREADY_USED");
  if (Date.parse(record.expires_at) <= now) return { ...record, state: "EXPIRED" };
  if (record.principal_hash !== principalHash || record.session_generation !== sessionGeneration) throw new Error("PREPARED_BET_INVALID");
  return { ...record, state: "SUBMITTING" };
}

export class MemorySmspariazPreparedBetStore implements SmspariazPreparedBetStore {
  readonly kind = "memory" as const;
  private readonly records = new Map<string, SmspariazPreparedBet>();
  private operation = Promise.resolve();
  async create(recordValue: SmspariazPreparedBet): Promise<void> {
    const record = SmspariazPreparedBetSchema.parse(recordValue);
    if (this.records.has(record.handle)) throw new Error("PREPARED_BET_INVALID");
    this.records.set(record.handle, structuredClone(record));
  }
  async get(handle: string): Promise<SmspariazPreparedBet | null> {
    validateHandle(handle);
    const record = this.records.get(handle);
    return record ? structuredClone(record) : null;
  }
  async claim(handle: string, principalHash: string, sessionGeneration: number, now: number): Promise<SmspariazPreparedBet> {
    validateHandle(handle);
    let output!: SmspariazPreparedBet;
    const next = this.operation.then(() => {
      const claimed = claimRecord(this.records.get(handle) ?? null, principalHash, sessionGeneration, now);
      this.records.set(handle, claimed);
      if (claimed.state === "EXPIRED") throw new Error("PREPARED_BET_EXPIRED");
      output = structuredClone(claimed);
    });
    this.operation = next.catch(() => undefined);
    await next;
    return output;
  }
  async complete(handle: string, state: "SUCCEEDED" | "REJECTED" | "AMBIGUOUS", terminal: SmspariazPreparedBetTerminal): Promise<void> {
    const next = this.operation.then(() => {
      const current = this.records.get(handle);
      if (!current || current.state !== "SUBMITTING") throw new Error("PREPARED_BET_INVALID");
      this.records.set(handle, SmspariazPreparedBetSchema.parse({ ...current, state, terminal }));
    });
    this.operation = next.catch(() => undefined);
    return next;
  }
}

type StoredEnvelope = { version: 1; envelope: SmspariazEncryptedEnvelope };

abstract class EncryptedPreparedStore implements SmspariazPreparedBetStore {
  abstract readonly kind: "netlify-blobs" | "local-file";
  protected constructor(protected readonly namespace: string, protected readonly origin: string, protected readonly cipher: SmspariazCipher) {}
  protected context(handle: string) { return { namespace: this.namespace, recordKey: `prepared/${handle}`, providerOrigin: this.origin }; }
  protected encrypt(record: SmspariazPreparedBet): StoredEnvelope { return { version: 1, envelope: this.cipher.encrypt(record, this.context(record.handle)) }; }
  protected decrypt(value: unknown, handle: string): SmspariazPreparedBet {
    const container = value as Partial<StoredEnvelope>;
    if (!container || container.version !== 1 || !container.envelope) throw new Error("SESSION_STORAGE_CORRUPT");
    return SmspariazPreparedBetSchema.parse(this.cipher.decrypt(container.envelope, this.context(handle)).value);
  }
  abstract create(record: SmspariazPreparedBet): Promise<void>;
  abstract get(handle: string): Promise<SmspariazPreparedBet | null>;
  abstract claim(handle: string, principalHash: string, sessionGeneration: number, now: number): Promise<SmspariazPreparedBet>;
  abstract complete(handle: string, state: "SUCCEEDED" | "REJECTED" | "AMBIGUOUS", terminal: SmspariazPreparedBetTerminal): Promise<void>;
}

export class LocalFileSmspariazPreparedBetStore extends EncryptedPreparedStore {
  readonly kind = "local-file" as const;
  private operation = Promise.resolve();
  constructor(private readonly directory: string, namespace: string, origin: string, cipher: SmspariazCipher) { super(namespace, origin, cipher); }
  private path(handle: string) { validateHandle(handle); return resolve(this.directory, `${handle}.json`); }
  private async read(handle: string): Promise<SmspariazPreparedBet | null> {
    try { return this.decrypt(JSON.parse(await readFile(this.path(handle), "utf8")) as unknown, handle); }
    catch (error) {
      if (error instanceof Error && "code" in error && error.code === "ENOENT") return null;
      throw error;
    }
  }
  private async write(record: SmspariazPreparedBet): Promise<void> {
    const path = this.path(record.handle);
    const temporary = `${path}.${process.pid}.${randomUUID()}.tmp`;
    await mkdir(dirname(path), { recursive: true });
    await writeFile(temporary, JSON.stringify(this.encrypt(record)), "utf8");
    await rename(temporary, path);
  }
  async create(recordValue: SmspariazPreparedBet): Promise<void> {
    const record = SmspariazPreparedBetSchema.parse(recordValue);
    if (await this.read(record.handle)) throw new Error("PREPARED_BET_INVALID");
    await this.write(record);
  }
  async get(handle: string) { return this.read(handle); }
  async claim(handle: string, principalHash: string, sessionGeneration: number, now: number): Promise<SmspariazPreparedBet> {
    let output!: SmspariazPreparedBet;
    const next = this.operation.then(async () => {
      const claimed = claimRecord(await this.read(handle), principalHash, sessionGeneration, now);
      await this.write(claimed);
      if (claimed.state === "EXPIRED") throw new Error("PREPARED_BET_EXPIRED");
      output = claimed;
    });
    this.operation = next.catch(() => undefined);
    await next;
    return output;
  }
  async complete(handle: string, state: "SUCCEEDED" | "REJECTED" | "AMBIGUOUS", terminal: SmspariazPreparedBetTerminal): Promise<void> {
    const next = this.operation.then(async () => {
      const current = await this.read(handle);
      if (!current || current.state !== "SUBMITTING") throw new Error("PREPARED_BET_INVALID");
      await this.write(SmspariazPreparedBetSchema.parse({ ...current, state, terminal }));
    });
    this.operation = next.catch(() => undefined);
    return next;
  }
}

export class NetlifySmspariazPreparedBetStore extends EncryptedPreparedStore {
  readonly kind = "netlify-blobs" as const;
  private readonly store: Store;
  constructor(namespace: string, origin: string, cipher: SmspariazCipher) {
    super(namespace, origin, cipher);
    this.store = getStore({ name: namespace, consistency: "strong" });
  }
  private key(handle: string) { validateHandle(handle); return `prepared/${handle}.json`; }
  private async read(handle: string) {
    const entry = await this.store.getWithMetadata(this.key(handle), { type: "json", consistency: "strong" });
    return { record: entry ? this.decrypt(entry.data, handle) : null, etag: entry?.etag };
  }
  async create(recordValue: SmspariazPreparedBet): Promise<void> {
    const record = SmspariazPreparedBetSchema.parse(recordValue);
    const result = await this.store.setJSON(this.key(record.handle), this.encrypt(record), { onlyIfNew: true });
    if (!result.modified) throw new Error("PREPARED_BET_INVALID");
  }
  async get(handle: string) { return (await this.read(handle)).record; }
  async claim(handle: string, principalHash: string, sessionGeneration: number, now: number): Promise<SmspariazPreparedBet> {
    for (let attempt = 0; attempt < 5; attempt += 1) {
      const current = await this.read(handle);
      const claimed = claimRecord(current.record, principalHash, sessionGeneration, now);
      const result = await this.store.setJSON(this.key(handle), this.encrypt(claimed), { onlyIfMatch: current.etag! });
      if (!result.modified) continue;
      if (claimed.state === "EXPIRED") throw new Error("PREPARED_BET_EXPIRED");
      return claimed;
    }
    throw new Error("PREPARED_BET_ALREADY_USED");
  }
  async complete(handle: string, state: "SUCCEEDED" | "REJECTED" | "AMBIGUOUS", terminal: SmspariazPreparedBetTerminal): Promise<void> {
    for (let attempt = 0; attempt < 5; attempt += 1) {
      const current = await this.read(handle);
      if (!current.record || current.record.state !== "SUBMITTING") throw new Error("PREPARED_BET_INVALID");
      const completed = SmspariazPreparedBetSchema.parse({ ...current.record, state, terminal });
      const result = await this.store.setJSON(this.key(handle), this.encrypt(completed), { onlyIfMatch: current.etag! });
      if (result.modified) return;
    }
    throw new Error("PREPARED_BET_INVALID");
  }
}

export function createSmspariazPreparedBetStore(
  config: SmspariazConfig,
  environment: Readonly<Record<string, string | undefined>> = process.env,
): SmspariazPreparedBetStore {
  if (!config.currentKey) throw new Error("SESSION_KEY_UNAVAILABLE");
  const namespace = resolveSmspariazStoreName(environment);
  const cipher = createSmspariazCipher(config.currentKey, config.previousKey);
  return environment.NETLIFY === "true" && environment.CONTEXT !== "dev"
    ? new NetlifySmspariazPreparedBetStore(namespace, config.baseUrl, cipher)
    : new LocalFileSmspariazPreparedBetStore(
        resolve(process.cwd(), ".netlify", `${namespace}-prepared`), namespace, config.baseUrl, cipher,
      );
}
