import { createHash } from "node:crypto";
import type { SmspariazConfig } from "./smspariaz-config.js";
import type { SmspariazObservability } from "./smspariaz-observability.js";
import type { SmspariazCookie } from "./smspariaz-session-store.js";
import { APP_BET_ALLOWED_ENDPOINTS, AUDITED_SMSPARIAZ_FLOW } from "./test-fixtures/smspariaz/flow-fixtures.js";

export type SmspariazErrorCode =
  | "NOT_CONFIGURED"
  | "AUTH_REQUIRED"
  | "OTP_REQUIRED"
  | "OTP_INVALID"
  | "SESSION_EXPIRED"
  | "APP_REGISTRATION_REQUIRED"
  | "INVALID_SELECTION"
  | "INVALID_STAKE"
  | "EVENT_CLOSED"
  | "ODDS_CHANGED"
  | "PREPARED_BET_INVALID"
  | "PREPARED_BET_EXPIRED"
  | "PREPARED_BET_ALREADY_USED"
  | "APP_BET_DISABLED"
  | "APP_BET_FLOW_CHANGED"
  | "PROVIDER_REJECTED"
  | "PROVIDER_UNAVAILABLE"
  | "SUBMISSION_AMBIGUOUS"
  | "SESSION_STORAGE_CORRUPT"
  | "SESSION_KEY_UNAVAILABLE";

export class SmspariazProviderError extends Error {
  constructor(
    readonly code: SmspariazErrorCode,
    message: string,
    readonly retryable = false,
    readonly providerStatus?: number,
  ) {
    super(message);
    this.name = "SmspariazProviderError";
  }
}

export interface ProviderPendingLogin {
  phone: string;
  referrer: string;
  cookies: SmspariazCookie[];
  requested_at: string;
  expires_at: string;
}

export interface ProviderAuthenticatedSession {
  login_id: string;
  phone: string;
  token: string;
  cookies: SmspariazCookie[];
}

export interface SmspariazFlowVerification {
  valid: boolean;
  fingerprint: string;
  observed: { site: string; footballMobile: string; rootMobile: string };
}

type FetchLike = (input: string | URL | Request, init?: RequestInit) => Promise<Response>;

function jsonObject(value: unknown): Record<string, unknown> | null {
  return value !== null && typeof value === "object" && !Array.isArray(value)
    ? value as Record<string, unknown>
    : null;
}

function responseStatus(value: unknown): number | null {
  const object = jsonObject(value);
  if (typeof object?.status === "number") return object.status;
  return typeof object?.status === "string" && /^-?\d+$/.test(object.status)
    ? Number(object.status)
    : null;
}

function getSetCookies(headers: Headers): string[] {
  const enhanced = headers as Headers & { getSetCookie?: () => string[] };
  const cookies = enhanced.getSetCookie?.();
  if (cookies?.length) return cookies;
  const combined = headers.get("set-cookie");
  return combined ? [combined] : [];
}

function parseSetCookie(value: string, origin: URL): SmspariazCookie | null {
  const parts = value.split(";").map((part) => part.trim());
  const separator = parts[0]?.indexOf("=") ?? -1;
  if (separator <= 0) return null;
  const name = parts[0]!.slice(0, separator);
  const cookieValue = parts[0]!.slice(separator + 1);
  let domain = origin.hostname;
  let path = "/";
  let secure = false;
  let httpOnly = false;
  let expiresAt: string | undefined;
  let sameSite: SmspariazCookie["same_site"];
  for (const part of parts.slice(1)) {
    const [rawName, ...rawValue] = part.split("=");
    const attribute = rawName?.toLowerCase();
    const attributeValue = rawValue.join("=");
    if (attribute === "domain" && attributeValue) domain = attributeValue.replace(/^\./, "").toLowerCase();
    if (attribute === "path" && attributeValue) path = attributeValue;
    if (attribute === "secure") secure = true;
    if (attribute === "httponly") httpOnly = true;
    if (attribute === "expires" && Number.isFinite(Date.parse(attributeValue))) expiresAt = new Date(attributeValue).toISOString();
    if (attribute === "samesite" && ["strict", "lax", "none"].includes(attributeValue.toLowerCase())) {
      sameSite = `${attributeValue[0]?.toUpperCase()}${attributeValue.slice(1).toLowerCase()}` as SmspariazCookie["same_site"];
    }
  }
  if (domain !== origin.hostname || name.length > 100 || cookieValue.length > 4_096) return null;
  return { name, value: cookieValue, domain, path, secure, http_only: httpOnly, ...(expiresAt ? { expires_at: expiresAt } : {}), ...(sameSite ? { same_site: sameSite } : {}) };
}

function mergeCookies(existing: SmspariazCookie[], response: Response, origin: URL): SmspariazCookie[] {
  const byIdentity = new Map(existing.map((cookie) => [`${cookie.name}|${cookie.domain}|${cookie.path}`, cookie]));
  for (const header of getSetCookies(response.headers)) {
    const cookie = parseSetCookie(header, origin);
    if (!cookie) continue;
    byIdentity.set(`${cookie.name}|${cookie.domain}|${cookie.path}`, cookie);
  }
  const now = Date.now();
  return [...byIdentity.values()].filter((cookie) => !cookie.expires_at || Date.parse(cookie.expires_at) > now).slice(0, 30);
}

function cookieHeader(cookies: SmspariazCookie[], path: string): string | undefined {
  const now = Date.now();
  const values = cookies.filter((cookie) => path.startsWith(cookie.path) && (!cookie.expires_at || Date.parse(cookie.expires_at) > now));
  return values.length ? values.map((cookie) => `${cookie.name}=${cookie.value}`).join("; ") : undefined;
}

export class SmspariazProviderClient {
  private readonly origin: URL;
  constructor(
    private readonly config: SmspariazConfig,
    private readonly fetchImpl: FetchLike = fetch,
    private readonly telemetry?: SmspariazObservability,
    private readonly now: () => number = Date.now,
  ) {
    this.origin = new URL(config.baseUrl);
  }

  private resolve(path: string): URL {
    const url = new URL(path, this.origin);
    if (url.origin !== this.origin.origin) throw new SmspariazProviderError("APP_BET_FLOW_CHANGED", "Provider destination left the approved origin.");
    return url;
  }

  private async request(path: string, init: RequestInit, cookies: SmspariazCookie[] = []): Promise<{ response: Response; text: string; cookies: SmspariazCookie[] }> {
    const url = this.resolve(path);
    const controller = new AbortController();
    const timer = setTimeout(() => controller.abort(), this.config.requestTimeoutMs);
    const headers = new Headers(init.headers);
    headers.set("User-Agent", AUDITED_SMSPARIAZ_FLOW.appUserAgent);
    headers.set("Accept", "application/json, text/javascript, */*; q=0.01");
    headers.set("X-Requested-With", "XMLHttpRequest");
    const outboundCookies = cookieHeader(cookies, url.pathname);
    if (outboundCookies) headers.set("Cookie", outboundCookies);
    try {
      const response = await this.fetchImpl(url, { ...init, headers, redirect: "manual", signal: controller.signal });
      if (response.status >= 300 && response.status < 400) {
        throw new SmspariazProviderError("APP_BET_FLOW_CHANGED", "SMSPariaz returned an unapproved redirect.", false, response.status);
      }
      const bytes = Buffer.from(await response.arrayBuffer());
      if (bytes.length > this.config.maxResponseBytes) {
        throw new SmspariazProviderError("PROVIDER_UNAVAILABLE", "SMSPariaz response exceeded the safe size limit.", true, response.status);
      }
      const text = bytes.toString("utf8");
      if (!response.ok) {
        throw new SmspariazProviderError("PROVIDER_UNAVAILABLE", "SMSPariaz returned an unsuccessful HTTP response.", response.status >= 500, response.status);
      }
      return { response, text, cookies: mergeCookies(cookies, response, this.origin) };
    } catch (error) {
      if (error instanceof SmspariazProviderError) throw error;
      throw new SmspariazProviderError("PROVIDER_UNAVAILABLE", "SMSPariaz could not be reached.", true);
    } finally {
      clearTimeout(timer);
    }
  }

  private async postForm(path: string, form: URLSearchParams, cookies: SmspariazCookie[] = []) {
    return this.request(path, {
      method: "POST",
      headers: {
        "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
        Origin: this.origin.origin,
        Referer: new URL("/smsfootball/", this.origin).href,
      },
      body: form.toString(),
    }, cookies);
  }

  async startLogin(phoneValue: string, referrerValue = ""): Promise<ProviderPendingLogin> {
    const phone = phoneValue.trim();
    const referrer = referrerValue.trim();
    if (!/^\+?\d{5,20}$/.test(phone) || referrer && !/^\+?\d{5,20}$/.test(referrer)) {
      throw new SmspariazProviderError("PROVIDER_REJECTED", "A valid phone number is required.");
    }
    const login = await this.request(AUDITED_SMSPARIAZ_FLOW.paths.login, { method: "GET" });
    const otp = await this.postForm(AUDITED_SMSPARIAZ_FLOW.paths.otp, new URLSearchParams({ number: phone }), login.cookies);
    let payload: unknown;
    try { payload = JSON.parse(otp.text); } catch { throw new SmspariazProviderError("PROVIDER_REJECTED", "SMSPariaz returned an unrecognized OTP response."); }
    if (responseStatus(payload) !== 0) throw new SmspariazProviderError("PROVIDER_REJECTED", "SMSPariaz did not start the OTP login.");
    const requested = this.now();
    this.telemetry?.emit("login_started", {});
    return {
      phone,
      referrer,
      cookies: otp.cookies,
      requested_at: new Date(requested).toISOString(),
      expires_at: new Date(requested + this.config.pendingLoginTtlMs).toISOString(),
    };
  }

  async confirmOtp(pending: ProviderPendingLogin, otpValue: string): Promise<ProviderAuthenticatedSession> {
    const otp = otpValue.trim();
    if (!/^\d{4,10}$/.test(otp)) throw new SmspariazProviderError("OTP_REQUIRED", "A valid SMSPariaz OTP is required.");
    if (Date.parse(pending.expires_at) <= this.now()) throw new SmspariazProviderError("OTP_INVALID", "The SMSPariaz OTP attempt has expired.");
    const result = await this.postForm(AUDITED_SMSPARIAZ_FLOW.paths.confirm, new URLSearchParams({
      number: pending.phone,
      otp,
      referer: pending.referrer,
    }), pending.cookies);
    let payload: unknown;
    try { payload = JSON.parse(result.text); } catch { throw new SmspariazProviderError("OTP_INVALID", "SMSPariaz returned an unrecognized OTP response."); }
    const object = jsonObject(payload);
    const reply = jsonObject(object?.reply);
    if (responseStatus(payload) !== 0 || typeof reply?.id !== "string" && typeof reply?.id !== "number"
      || typeof reply?.phone !== "string" && typeof reply?.phone !== "number" || typeof reply?.token !== "string") {
      this.telemetry?.emit("login_failed", { error_code: "OTP_INVALID" });
      throw new SmspariazProviderError("OTP_INVALID", "SMSPariaz rejected the OTP.");
    }
    this.telemetry?.emit("login_confirmed", {});
    return {
      login_id: String(reply.id),
      phone: String(reply.phone),
      token: reply.token,
      cookies: result.cookies,
    };
  }

  async checkLogin(session: ProviderAuthenticatedSession): Promise<boolean> {
    const result = await this.postForm(AUDITED_SMSPARIAZ_FLOW.paths.checkLogin, new URLSearchParams({
      loginid: session.login_id,
      phone: session.phone,
      token: session.token,
    }), session.cookies);
    try { return responseStatus(JSON.parse(result.text)) === 0; } catch { return false; }
  }

  async getText(path: string): Promise<string> {
    return (await this.request(path, { method: "GET" })).text;
  }

  async postProviderForm(path: string, fields: Readonly<Record<string, string>>, cookies: SmspariazCookie[] = []) {
    const keys = Object.keys(fields).sort();
    if (path === AUDITED_SMSPARIAZ_FLOW.paths.validateBet) {
      const single = ["bet-game", "bet-payout", "bet-selection", "bet-stake", "bet-staketax"];
      const accumulator = ["bet-from", "bet-game", "bet-selection", "bet-stake", "bet-staketax"];
      const expected = fields["bet-game"] === "s" ? single : fields["bet-game"] === "a" ? accumulator : [];
      if (keys.join(",") !== expected.join(",")
        || !/^\d+(?:\.\d{1,2})?$/.test(fields["bet-stake"] ?? "")
        || !/^\d+(?:\.\d{2})$/.test(fields["bet-staketax"] ?? "")
        || !/^\d+(?:,\d+){0,24}$/.test(fields["bet-selection"] ?? "")
        || fields["bet-game"] === "s" && !/^\d+(?:\.\d{1,2})?$/.test(fields["bet-payout"] ?? "")
        || fields["bet-game"] === "a" && !/^(?:[2-9]|[12]\d|25)$/.test(fields["bet-from"] ?? "")) {
        throw new SmspariazProviderError("APP_BET_FLOW_CHANGED", "Coupon validation request no longer matches the audited shape.");
      }
    } else if (APP_BET_ALLOWED_ENDPOINTS.includes(path as "/placebet/")) {
      if (this.origin.origin !== "https://www.smspariaz.com"
        || keys.join(",") !== AUDITED_SMSPARIAZ_FLOW.appRequestFields.join(",")
        || !/^n[A-Za-z0-9_-]{1,100}$/.test(fields.message ?? "")) {
        throw new SmspariazProviderError("APP_BET_FLOW_CHANGED", "App submission request no longer matches the audited shape.");
      }
    } else {
      throw new SmspariazProviderError("APP_BET_FLOW_CHANGED", "The requested provider POST path is not allowlisted.");
    }
    return this.postForm(path, new URLSearchParams(fields), cookies);
  }

  async verifyAppFlow(): Promise<SmspariazFlowVerification> {
    const [site, footballMobile, rootMobile] = await Promise.all([
      this.getText(AUDITED_SMSPARIAZ_FLOW.paths.siteScript),
      this.getText(AUDITED_SMSPARIAZ_FLOW.paths.mobileScript),
      this.getText(AUDITED_SMSPARIAZ_FLOW.paths.rootMobileScript),
    ]);
    const observed = {
      site: createHash("sha256").update(site).digest("hex"),
      footballMobile: createHash("sha256").update(footballMobile).digest("hex"),
      rootMobile: createHash("sha256").update(rootMobile).digest("hex"),
    };
    const valid = observed.site === AUDITED_SMSPARIAZ_FLOW.scriptSha256.site
      && observed.footballMobile === AUDITED_SMSPARIAZ_FLOW.scriptSha256.footballMobile
      && observed.rootMobile === AUDITED_SMSPARIAZ_FLOW.scriptSha256.rootMobile;
    const fingerprint = createHash("sha256").update(JSON.stringify({
      origin: this.origin.origin,
      paths: AUDITED_SMSPARIAZ_FLOW.paths,
      fields: AUDITED_SMSPARIAZ_FLOW.appRequestFields,
      hashes: observed,
    })).digest("hex");
    if (!valid) this.telemetry?.emit("app_bet_flow_changed", { error_code: "APP_BET_FLOW_CHANGED", flow_fingerprint: fingerprint });
    return { valid, fingerprint, observed };
  }
}
