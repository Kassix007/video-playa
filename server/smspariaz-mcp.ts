import { randomUUID } from "node:crypto";
import type { AuthInfo } from "@modelcontextprotocol/sdk/server/auth/types.js";
import type { McpServer } from "@modelcontextprotocol/sdk/server/mcp.js";
import { z } from "zod";
import type { SmspariazAppBetService } from "./smspariaz-app-bet.js";
import type { SmspariazConfig } from "./smspariaz-config.js";
import { SmsfootballProgrammeSchema, type SmspariazFootballClient } from "./smspariaz-football.js";
import type { SmspariazObservability } from "./smspariaz-observability.js";
import { SmspariazProviderError, type SmspariazProviderClient } from "./smspariaz-provider.js";
import type {
  SmspariazAuthenticatedSession,
  SmspariazSessionRecord,
  SmspariazSessionStore,
} from "./smspariaz-session-store.js";

const SessionStatusSchema = z.object({
  authenticated: z.boolean(),
  app_registered: z.boolean(),
  account: z.string().nullable(),
  session_valid: z.boolean(),
  requires_otp: z.boolean(),
  state: z.enum(["AUTH_REQUIRED", "OTP_REQUIRED", "AUTHENTICATED", "SESSION_EXPIRED", "APP_REGISTRATION_REQUIRED"]),
  error_code: z.string().optional(),
}).strict();

const CanonicalSelectionOutputSchema = z.object({
  event_id: z.string(), market_id: z.string(), selection_code: z.string(), selection_id: z.string(),
  odds: z.number(), bet_code: z.string(), home: z.string(), away: z.string(),
}).strict();

const PreparedOutputSchema = z.object({
  prepared_bet: z.string(),
  expires_at: z.string(),
  resolved_events: z.array(CanonicalSelectionOutputSchema),
  total_odds: z.number(),
  stake: z.number(),
  estimated_payout: z.number(),
  all_open: z.literal(true),
  changed_odds: z.array(z.object({ event_id: z.string(), selection_id: z.string(), expected: z.number(), current: z.number() }).strict()),
  validation_errors: z.tuple([]),
  submitted: z.literal(false),
}).strict();

const PlacementOutputSchema = z.object({
  success: z.literal(true),
  reference: z.string().nullable(),
  confirmation: z.string(),
  stake: z.number(),
  payout: z.number(),
  submitted_via: z.literal("smspariaz_app_flow"),
}).strict();

const READ_ONLY = { readOnlyHint: true, destructiveHint: false, idempotentHint: true, openWorldHint: true } as const;
const STATE_WRITE = { readOnlyHint: false, destructiveHint: false, idempotentHint: false, openWorldHint: true } as const;
const LOGOUT = { readOnlyHint: false, destructiveHint: true, idempotentHint: true, openWorldHint: false } as const;
const PLACE = { readOnlyHint: false, destructiveHint: true, idempotentHint: false, openWorldHint: true } as const;

export interface SmspariazAuthPolicy {
  enabled: boolean;
  resource?: string;
  resourceMetadataUrl: string;
  sessionScope: string;
  appBetScope: string;
}

function maskAccount(phone: string): string {
  const suffix = phone.slice(-4);
  return suffix ? `••••${suffix}` : "••••";
}

function generationAfter(record: SmspariazSessionRecord | null): number {
  return (record?.generation ?? 0) + 1;
}

function publicStatus(record: SmspariazSessionRecord | null) {
  if (!record || record.state === "LOGGED_OUT") return {
    authenticated: false, app_registered: false, account: null, session_valid: false,
    requires_otp: false, state: "AUTH_REQUIRED" as const, error_code: "AUTH_REQUIRED",
  };
  if (record.state === "OTP_PENDING") return {
    authenticated: false, app_registered: false, account: maskAccount(record.phone), session_valid: false,
    requires_otp: true, state: "OTP_REQUIRED" as const, error_code: "OTP_REQUIRED",
  };
  if (record.state === "EXPIRED") return {
    authenticated: false, app_registered: false, account: null, session_valid: false,
    requires_otp: false, state: record.last_error as "SESSION_EXPIRED" | "APP_REGISTRATION_REQUIRED", error_code: record.last_error,
  };
  return {
    authenticated: true, app_registered: record.app_registered, account: maskAccount(record.phone),
    session_valid: true, requires_otp: false,
    state: record.app_registered ? "AUTHENTICATED" as const : "APP_REGISTRATION_REQUIRED" as const,
    ...(!record.app_registered ? { error_code: "APP_REGISTRATION_REQUIRED" } : {}),
  };
}

export class SmspariazSubsystem {
  constructor(
    readonly config: SmspariazConfig,
    private readonly sessionStore: SmspariazSessionStore,
    private readonly provider: SmspariazProviderClient,
    private readonly football: SmspariazFootballClient,
    private readonly appBet: SmspariazAppBetService,
    private readonly telemetry: SmspariazObservability,
    private readonly now: () => number = Date.now,
  ) {}

  async sessionStatus(validate = true) {
    const record = await this.sessionStore.get();
    if (record?.state === "OTP_PENDING" && Date.parse(record.expires_at) <= this.now()) {
      const expired: SmspariazSessionRecord = {
        schema_version: 1, generation: record.generation + 1, state: "LOGGED_OUT",
        provider_origin: this.config.baseUrl, updated_at: new Date(this.now()).toISOString(),
      };
      await this.sessionStore.replace(expired, record.generation);
      return publicStatus(expired);
    }
    if (validate && record?.state === "AUTHENTICATED") {
      const valid = await this.provider.checkLogin(record);
      if (!valid) {
        const expired: SmspariazSessionRecord = {
          schema_version: 1, generation: record.generation + 1, state: "EXPIRED",
          provider_origin: this.config.baseUrl, updated_at: new Date(this.now()).toISOString(), last_error: "SESSION_EXPIRED",
        };
        await this.sessionStore.replace(expired, record.generation);
        this.telemetry.emit("session_expired", { error_code: "SESSION_EXPIRED" });
        return publicStatus(expired);
      }
      this.telemetry.emit("session_restored", { session_state: record.state, storage_kind: this.sessionStore.kind });
    }
    return publicStatus(record);
  }

  async startLogin(phone: string, referrer = "") {
    const pending = await this.provider.startLogin(phone, referrer);
    const current = await this.sessionStore.get();
    const record: SmspariazSessionRecord = {
      schema_version: 1,
      generation: generationAfter(current),
      state: "OTP_PENDING",
      provider_origin: this.config.baseUrl,
      updated_at: new Date(this.now()).toISOString(),
      attempt_id: randomUUID(),
      ...pending,
    };
    await this.sessionStore.replace(record, current?.generation);
    return { success: true as const, requires_otp: true as const, attempt_expires_at: record.expires_at };
  }

  async confirmOtp(otp: string) {
    const current = await this.sessionStore.get();
    if (!current || current.state !== "OTP_PENDING") throw new Error("OTP_REQUIRED");
    const authenticated = await this.provider.confirmOtp(current, otp);
    const now = new Date(this.now()).toISOString();
    const record: SmspariazAuthenticatedSession = {
      schema_version: 1,
      generation: current.generation + 1,
      state: "AUTHENTICATED",
      provider_origin: this.config.baseUrl,
      updated_at: now,
      ...authenticated,
      app_registered: true,
      confirmed_at: now,
      last_validated_at: now,
    };
    await this.sessionStore.replace(record, current.generation);
    return publicStatus(record);
  }

  async logout() {
    const current = await this.sessionStore.get();
    const record: SmspariazSessionRecord = {
      schema_version: 1,
      generation: generationAfter(current),
      state: "LOGGED_OUT",
      provider_origin: this.config.baseUrl,
      updated_at: new Date(this.now()).toISOString(),
    };
    await this.sessionStore.replace(record, current?.generation);
    this.telemetry.emit("session_logout", { storage_kind: this.sessionStore.kind });
    return { success: true as const, authenticated: false as const, state: "LOGGED_OUT" as const };
  }

  private async expireSession(current: SmspariazAuthenticatedSession): Promise<void> {
    const expired: SmspariazSessionRecord = {
      schema_version: 1,
      generation: current.generation + 1,
      state: "EXPIRED",
      provider_origin: this.config.baseUrl,
      updated_at: new Date(this.now()).toISOString(),
      last_error: "SESSION_EXPIRED",
    };
    await this.sessionStore.replace(expired, current.generation);
    this.telemetry.emit("session_expired", { error_code: "SESSION_EXPIRED" });
  }

  private async requireSession(): Promise<SmspariazAuthenticatedSession> {
    const current = await this.sessionStore.get();
    if (!current || current.state !== "AUTHENTICATED") throw new Error(current?.state === "OTP_PENDING" ? "OTP_REQUIRED" : "AUTH_REQUIRED");
    if (!current.app_registered) throw new Error("APP_REGISTRATION_REQUIRED");
    if (!await this.provider.checkLogin(current)) {
      await this.expireSession(current);
      throw new Error("SESSION_EXPIRED");
    }
    return current;
  }

  async getProgramme() { return this.football.getProgramme(); }
  async prepare(principal: string, input: Parameters<SmspariazAppBetService["prepare"]>[2]) {
    return this.appBet.prepare(await this.requireSession(), principal, input);
  }
  async place(principal: string, preparedBet: string, approved: boolean) {
    const session = await this.requireSession();
    try {
      return await this.appBet.place(session, principal, preparedBet, approved);
    } catch (error) {
      if (error instanceof Error && error.message === "SESSION_EXPIRED") await this.expireSession(session);
      throw error;
    }
  }

  async debugStatus() {
    const record = await this.sessionStore.get();
    let flow: Awaited<ReturnType<SmspariazProviderClient["verifyAppFlow"]>> | null = null;
    try { flow = await this.provider.verifyAppFlow(); } catch { /* diagnostics remains safe */ }
    const status = publicStatus(record);
    return {
      configured: this.config.configured,
      app_bet_enabled: this.config.appBetEnabled,
      session_present: record !== null && record.state !== "LOGGED_OUT",
      auth_valid: status.authenticated,
      app_registered: status.app_registered,
      app_mode_detected: flow?.valid ?? false,
      session_state: status.state,
      storage_kind: this.sessionStore.kind,
      site_script_sha256: flow?.observed.site ?? null,
      mobile_script_sha256: flow?.observed.footballMobile ?? null,
      root_mobile_script_sha256: flow?.observed.rootMobile ?? null,
      flow_fingerprint: flow?.fingerprint ?? null,
      last_error: this.telemetry.getDiagnostics().last_error ?? null,
    };
  }
}

function challenge(policy: SmspariazAuthPolicy, scope: string, error: string, message: string): string {
  const escaped = (value: string) => value.replace(/\\/g, "\\\\").replace(/"/g, '\\"');
  return `Bearer resource_metadata="${escaped(policy.resourceMetadataUrl)}", scope="${escaped(scope)}", error="${escaped(error)}", error_description="${escaped(message)}"`;
}

function authFailure(policy: SmspariazAuthPolicy, scope: string, authInfo?: AuthInfo): { error: string; message: string } | null {
  if (!policy.enabled) return { error: "temporarily_unavailable", message: "HORSEE OAuth is not configured for SMSPariaz tools." };
  if (!authInfo) return { error: "invalid_token", message: `Authentication with ${scope} is required.` };
  if (!authInfo.scopes.includes(scope)) return { error: "insufficient_scope", message: `The access token does not grant ${scope}.` };
  if (policy.resource && authInfo.resource?.href !== policy.resource) return { error: "invalid_token", message: "The access token was not issued for this HORSEE MCP resource." };
  return null;
}

function principal(authInfo: AuthInfo): string {
  const subject = typeof authInfo.extra?.subject === "string" ? authInfo.extra.subject : "";
  return `${authInfo.clientId}\n${subject}`;
}

function security(scope?: string) { return scope ? [{ type: "oauth2" as const, scopes: [scope] }] : [{ type: "noauth" as const }]; }

const SAFE_CODES = new Set([
  "NOT_CONFIGURED", "AUTH_REQUIRED", "OTP_REQUIRED", "OTP_INVALID", "SESSION_EXPIRED",
  "SESSION_KEY_UNAVAILABLE", "SESSION_STORAGE_CORRUPT", "APP_REGISTRATION_REQUIRED",
  "INVALID_SELECTION", "INVALID_STAKE", "EVENT_CLOSED", "ODDS_CHANGED", "PREPARED_BET_INVALID",
  "PREPARED_BET_EXPIRED", "PREPARED_BET_ALREADY_USED", "APP_BET_DISABLED",
  "APP_BET_FLOW_CHANGED", "PROVIDER_REJECTED", "PROVIDER_UNAVAILABLE", "SUBMISSION_AMBIGUOUS",
]);

function safeCode(error: unknown): string {
  const code = error instanceof SmspariazProviderError ? error.code : error instanceof Error ? error.message : "PROVIDER_UNAVAILABLE";
  return SAFE_CODES.has(code) ? code : "PROVIDER_UNAVAILABLE";
}

function handler(
  policy: SmspariazAuthPolicy,
  scope: string | undefined,
  operation: (authInfo: AuthInfo | undefined) => Promise<unknown>,
) {
  return async (_input: unknown, extra: { authInfo?: AuthInfo }) => {
    if (scope) {
      const failure = authFailure(policy, scope, extra.authInfo);
      if (failure) return {
        content: [{ type: "text" as const, text: failure.message }],
        _meta: { "mcp/www_authenticate": [challenge(policy, scope, failure.error, failure.message)] },
        isError: true,
      };
    }
    try {
      const output = await operation(extra.authInfo);
      return { content: [{ type: "text" as const, text: "SMSPariaz operation completed." }], structuredContent: output as Record<string, unknown> };
    } catch (error) {
      const code = safeCode(error);
      return { content: [{ type: "text" as const, text: `${code}: SMSPariaz operation failed safely.` }], isError: true };
    }
  };
}

export function registerSmspariazTools(server: McpServer, subsystem: SmspariazSubsystem, policy: SmspariazAuthPolicy): void {
  const sessionScheme = security(policy.sessionScope);
  const appBetScheme = security(policy.appBetScope);
  const noauth = security();
  server.registerTool("smspariaz_session_status", {
    title: "Check SMSPariaz session", description: "Validate the persisted SMSPariaz app session without exposing its credentials.",
    inputSchema: z.object({}).strict(), outputSchema: SessionStatusSchema, annotations: READ_ONLY,
    _meta: { securitySchemes: sessionScheme },
  }, handler(policy, policy.sessionScope, async () => subsystem.sessionStatus()) as never);

  server.registerTool("smspariaz_start_login", {
    title: "Start SMSPariaz OTP login", description: "Start the legitimate SMSPariaz one-time-password login flow.",
    inputSchema: z.object({ phone: z.string().min(5).max(30), referrer: z.string().max(30).optional() }).strict(),
    outputSchema: z.object({ success: z.literal(true), requires_otp: z.literal(true), attempt_expires_at: z.string() }).strict(),
    annotations: STATE_WRITE, _meta: { securitySchemes: sessionScheme },
  }, (async ({ phone, referrer }: { phone: string; referrer?: string }, extra: { authInfo?: AuthInfo }) => handler(policy, policy.sessionScope, async () => subsystem.startLogin(phone, referrer))(undefined, extra)) as never);

  server.registerTool("smspariaz_confirm_otp", {
    title: "Confirm SMSPariaz OTP", description: "Complete the pending legitimate SMSPariaz login. The OTP is never persisted or logged.",
    inputSchema: z.object({ otp: z.string().min(1).max(20) }).strict(), outputSchema: SessionStatusSchema,
    annotations: STATE_WRITE, _meta: { securitySchemes: sessionScheme },
  }, (async ({ otp }: { otp: string }, extra: { authInfo?: AuthInfo }) => handler(policy, policy.sessionScope, async () => subsystem.confirmOtp(otp))(undefined, extra)) as never);

  server.registerTool("smspariaz_logout", {
    title: "Destroy SMSPariaz session", description: "Replace the persisted SMSPariaz session with a secret-free logout tombstone.",
    inputSchema: z.object({}).strict(), outputSchema: z.object({ success: z.literal(true), authenticated: z.literal(false), state: z.literal("LOGGED_OUT") }).strict(),
    annotations: LOGOUT, _meta: { securitySchemes: sessionScheme },
  }, handler(policy, policy.sessionScope, async () => subsystem.logout()) as never);

  server.registerTool("smspariaz_get_smsfootball", {
    title: "Get SMSFootball programme", description: "Read the current authoritative SMSFootball programme, markets, codes, and odds. This never prepares or submits a ticket.",
    inputSchema: z.object({}).strict(), outputSchema: SmsfootballProgrammeSchema, annotations: READ_ONLY,
    _meta: { securitySchemes: noauth },
  }, handler(policy, undefined, async () => subsystem.getProgramme()) as never);

  server.registerTool("smspariaz_prepare_app_bet", {
    title: "Prepare SMSPariaz app ticket", description: "Validate and create a short-lived app-flow ticket preview without submitting it.",
    inputSchema: z.object({
      stake: z.number().min(20).max(1_000_000),
      selections: z.array(z.object({ event_id: z.string().min(1), market: z.string().min(1), selection: z.string().min(1), expected_odds: z.number().positive().optional() }).strict()).min(1).max(25),
    }).strict(), outputSchema: PreparedOutputSchema, annotations: STATE_WRITE,
    _meta: { securitySchemes: sessionScheme },
  }, (async (input: { stake: number; selections: Array<{ event_id: string; market: string; selection: string; expected_odds?: number }> }, extra: { authInfo?: AuthInfo }) => handler(policy, policy.sessionScope, async (auth) => subsystem.prepare(principal(auth!), input))(undefined, extra)) as never);

  server.registerTool("smspariaz_place_app_bet", {
    title: "Place approved SMSPariaz app ticket", description: "Submit one prepared ticket only through the verified free SMSPariaz app/leaderboard flow. Never uses wallet, paid SMS, deposits, or withdrawals.",
    inputSchema: z.object({ prepared_bet: z.string().regex(/^[A-Za-z0-9_-]{43}$/), approved: z.literal(true) }).strict(),
    outputSchema: PlacementOutputSchema, annotations: PLACE, _meta: { securitySchemes: appBetScheme },
  }, (async ({ prepared_bet, approved }: { prepared_bet: string; approved: true }, extra: { authInfo?: AuthInfo }) => handler(policy, policy.appBetScope, async (auth) => subsystem.place(principal(auth!), prepared_bet, approved))(undefined, extra)) as never);

  server.registerTool("smspariaz_debug_status", {
    title: "Diagnose SMSPariaz integration", description: "Return safe session, app-mode, script-hash, flow, and last-error diagnostics without secrets.",
    inputSchema: z.object({}).strict(), annotations: READ_ONLY, _meta: { securitySchemes: sessionScheme },
  }, handler(policy, policy.sessionScope, async () => subsystem.debugStatus()) as never);
}
