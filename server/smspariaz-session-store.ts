import { getStore, type Store } from "@netlify/blobs";
import { createHash, randomUUID } from "node:crypto";
import { mkdir, readFile, rename, writeFile } from "node:fs/promises";
import { dirname, resolve } from "node:path";
import { z } from "zod";
import type { SmspariazConfig } from "./smspariaz-config.js";
import { createSmspariazCipher, type SmspariazCipher, type SmspariazEncryptedEnvelope } from "./smspariaz-crypto.js";

export const SmspariazCookieSchema = z.object({
  name: z.string().min(1).max(100),
  value: z.string().max(4_096),
  domain: z.string().min(1).max(253),
  path: z.string().min(1).max(500),
  expires_at: z.string().datetime().optional(),
  secure: z.boolean(),
  http_only: z.boolean().optional(),
  same_site: z.enum(["Strict", "Lax", "None"]).optional(),
}).strict();
export type SmspariazCookie = z.infer<typeof SmspariazCookieSchema>;

const BaseSessionSchema = z.object({
  schema_version: z.literal(1),
  generation: z.number().int().nonnegative(),
  provider_origin: z.string().url(),
  updated_at: z.string().datetime(),
});

const LoggedOutSchema = BaseSessionSchema.extend({ state: z.literal("LOGGED_OUT") }).strict();
const ExpiredSchema = BaseSessionSchema.extend({
  state: z.literal("EXPIRED"),
  last_error: z.enum(["SESSION_EXPIRED", "APP_REGISTRATION_REQUIRED"]),
}).strict();
const OtpPendingSchema = BaseSessionSchema.extend({
  state: z.literal("OTP_PENDING"),
  attempt_id: z.string().uuid(),
  phone: z.string().min(5).max(30),
  referrer: z.string().max(30),
  cookies: z.array(SmspariazCookieSchema).max(30),
  requested_at: z.string().datetime(),
  expires_at: z.string().datetime(),
}).strict();
const AuthenticatedSchema = BaseSessionSchema.extend({
  state: z.literal("AUTHENTICATED"),
  login_id: z.string().min(1).max(500),
  phone: z.string().min(1).max(30),
  token: z.string().min(1).max(4_096),
  cookies: z.array(SmspariazCookieSchema).max(30),
  app_registered: z.boolean(),
  confirmed_at: z.string().datetime(),
  last_validated_at: z.string().datetime(),
}).strict();

export const SmspariazSessionRecordSchema = z.discriminatedUnion("state", [
  LoggedOutSchema, ExpiredSchema, OtpPendingSchema, AuthenticatedSchema,
]);
export type SmspariazSessionRecord = z.infer<typeof SmspariazSessionRecordSchema>;
export type SmspariazPendingSession = z.infer<typeof OtpPendingSchema>;
export type SmspariazAuthenticatedSession = z.infer<typeof AuthenticatedSchema>;

export interface SmspariazSessionStore {
  readonly kind: "netlify-blobs" | "local-file" | "memory";
  get(): Promise<SmspariazSessionRecord | null>;
  replace(record: SmspariazSessionRecord, expectedGeneration?: number): Promise<void>;
}

export class MemorySmspariazSessionStore implements SmspariazSessionStore {
  readonly kind = "memory" as const;
  private operation = Promise.resolve();
  constructor(private record: SmspariazSessionRecord | null = null) {}
  async get(): Promise<SmspariazSessionRecord | null> { return this.record ? structuredClone(this.record) : null; }
  async replace(record: SmspariazSessionRecord, expectedGeneration?: number): Promise<void> {
    const next = this.operation.then(() => {
      const validated = SmspariazSessionRecordSchema.parse(record);
      if (expectedGeneration !== undefined && this.record?.generation !== expectedGeneration) {
        throw new Error("SESSION_CONFLICT");
      }
      if (this.record && validated.generation <= this.record.generation) throw new Error("SESSION_CONFLICT");
      this.record = structuredClone(validated);
    });
    this.operation = next.catch(() => undefined);
    return next;
  }
}

type LocalEnvelope = { version: 1; envelope: SmspariazEncryptedEnvelope };

export class LocalFileSmspariazSessionStore implements SmspariazSessionStore {
  readonly kind = "local-file" as const;
  private operation = Promise.resolve();
  private readonly context;
  constructor(
    private readonly filePath: string,
    namespace: string,
    providerOrigin: string,
    private readonly cipher: SmspariazCipher,
  ) {
    this.context = { namespace, recordKey: "session", providerOrigin };
  }

  private async readEnvelope(): Promise<LocalEnvelope | null> {
    try {
      const value = JSON.parse(await readFile(this.filePath, "utf8")) as unknown;
      if (!value || typeof value !== "object" || (value as LocalEnvelope).version !== 1) throw new Error("SESSION_STORAGE_CORRUPT");
      return value as LocalEnvelope;
    } catch (error) {
      if (error instanceof Error && "code" in error && error.code === "ENOENT") return null;
      if (error instanceof Error && error.message === "SESSION_STORAGE_CORRUPT") throw error;
      throw new Error("SESSION_STORAGE_CORRUPT");
    }
  }

  private async writeRecord(record: SmspariazSessionRecord): Promise<void> {
    const temporary = `${this.filePath}.${process.pid}.${randomUUID()}.tmp`;
    await mkdir(dirname(this.filePath), { recursive: true });
    await writeFile(temporary, JSON.stringify({ version: 1, envelope: this.cipher.encrypt(record, this.context) }), "utf8");
    await rename(temporary, this.filePath);
  }

  async get(): Promise<SmspariazSessionRecord | null> {
    const stored = await this.readEnvelope();
    if (!stored) return null;
    const decrypted = this.cipher.decrypt(stored.envelope, this.context);
    const record = SmspariazSessionRecordSchema.parse(decrypted.value);
    if (decrypted.needsRewrap) await this.writeRecord(record);
    return record;
  }

  async replace(recordValue: SmspariazSessionRecord, expectedGeneration?: number): Promise<void> {
    const next = this.operation.then(async () => {
      const record = SmspariazSessionRecordSchema.parse(recordValue);
      const current = await this.get();
      if (expectedGeneration !== undefined && current?.generation !== expectedGeneration) throw new Error("SESSION_CONFLICT");
      if (current && record.generation <= current.generation) throw new Error("SESSION_CONFLICT");
      await this.writeRecord(record);
    });
    this.operation = next.catch(() => undefined);
    return next;
  }
}

export class NetlifySmspariazSessionStore implements SmspariazSessionStore {
  readonly kind = "netlify-blobs" as const;
  private readonly store: Store;
  private readonly context;
  constructor(storeName: string, providerOrigin: string, private readonly cipher: SmspariazCipher) {
    this.store = getStore({ name: storeName, consistency: "strong" });
    this.context = { namespace: storeName, recordKey: "session", providerOrigin };
  }
  private async read() {
    const entry = await this.store.getWithMetadata("session.json", { type: "json", consistency: "strong" });
    if (!entry) return { record: null as SmspariazSessionRecord | null, etag: undefined as string | undefined };
    const container = entry.data as Partial<LocalEnvelope>;
    if (container.version !== 1 || !container.envelope) throw new Error("SESSION_STORAGE_CORRUPT");
    const decrypted = this.cipher.decrypt(container.envelope, this.context);
    return { record: SmspariazSessionRecordSchema.parse(decrypted.value), etag: entry.etag, needsRewrap: decrypted.needsRewrap };
  }
  async get(): Promise<SmspariazSessionRecord | null> {
    const current = await this.read();
    if (current.record && current.needsRewrap && current.etag) {
      await this.store.setJSON("session.json", {
        version: 1,
        envelope: this.cipher.encrypt(current.record, this.context),
      }, { onlyIfMatch: current.etag });
    }
    return current.record;
  }
  async replace(recordValue: SmspariazSessionRecord, expectedGeneration?: number): Promise<void> {
    const record = SmspariazSessionRecordSchema.parse(recordValue);
    for (let attempt = 0; attempt < 5; attempt += 1) {
      const current = await this.read();
      if (expectedGeneration !== undefined && current.record?.generation !== expectedGeneration) throw new Error("SESSION_CONFLICT");
      if (current.record && record.generation <= current.record.generation) throw new Error("SESSION_CONFLICT");
      const result = await this.store.setJSON("session.json", {
        version: 1,
        envelope: this.cipher.encrypt(record, this.context),
      }, current.etag ? { onlyIfMatch: current.etag } : { onlyIfNew: true });
      if (result.modified) return;
    }
    throw new Error("SESSION_CONFLICT");
  }
}

function safePart(value: string | undefined, fallback: string): string {
  const normalized = value?.toLowerCase().replace(/[^a-z0-9-]+/g, "-").replace(/^-+|-+$/g, "");
  if (!normalized) return fallback;
  return normalized.length <= 30 ? normalized : `${normalized.slice(0, 21)}-${createHash("sha256").update(normalized).digest("hex").slice(0, 8)}`;
}

export function resolveSmspariazStoreName(environment: Readonly<Record<string, string | undefined>> = process.env): string {
  if (environment.CONTEXT === "production") return "horsee-smspariaz-private-production";
  return `horsee-smspariaz-private-${safePart(environment.CONTEXT, "local")}-${safePart(environment.REVIEW_ID ?? environment.BRANCH ?? environment.DEPLOY_ID, "unknown")}`;
}

export function createSmspariazSessionStore(
  config: SmspariazConfig,
  environment: Readonly<Record<string, string | undefined>> = process.env,
): SmspariazSessionStore {
  if (!config.currentKey) throw new Error("SESSION_KEY_UNAVAILABLE");
  const namespace = resolveSmspariazStoreName(environment);
  const cipher = createSmspariazCipher(config.currentKey, config.previousKey);
  const hosted = environment.NETLIFY === "true" && environment.CONTEXT !== "dev";
  return hosted
    ? new NetlifySmspariazSessionStore(namespace, config.baseUrl, cipher)
    : new LocalFileSmspariazSessionStore(
        resolve(process.cwd(), ".netlify", `${namespace}-session.json`),
        namespace,
        config.baseUrl,
        cipher,
      );
}
