import { createHash } from "node:crypto";
import { AUDITED_PEAKPOOL_FLOW } from "./test-fixtures/peakpool/flow-fixtures.js";

/**
 * Immutable, product-specific evidence for the public Peakpool app client.
 *
 * This profile is deliberately not shared with SMSFootball.  Although both
 * products currently use `/placebet/`, allowing that path alone would permit a
 * caller to switch products by changing a compact provider message.
 */
export const PEAKPOOL_PRODUCT = "peakpool_virtual_balance" as const;
export const PEAKPOOL_APP_BET_ALLOWED_ENDPOINTS = Object.freeze(["/placebet/"] as const);
export const PEAKPOOL_APP_BET_FORM_FIELDS = Object.freeze([
  "loginid",
  "phone",
  "token",
  "message",
] as const);

export interface PeakpoolObservedSourceHashes {
  site: string;
  root_mobile: string;
}

export interface PeakpoolAppFlowProfile {
  readonly product: typeof PEAKPOOL_PRODUCT;
  readonly audited_at: string;
  readonly verification_status: "STATIC_SOURCE_ONLY";
  readonly origin: "https://www.smspariaz.com";
  readonly method: "POST";
  readonly path: "/placebet/";
  readonly request_fields: typeof PEAKPOOL_APP_BET_FORM_FIELDS;
  readonly content_type: "application/x-www-form-urlencoded; charset=UTF-8";
  readonly app_user_agent: "SMSPARIAZAPP001";
  readonly app_mode: "MOBILE=1";
  readonly source_paths: Readonly<{
    programme: "/service/peakpool_json.php?";
    site: "/js/site.js?v=1.590";
    root_mobile: "/js/mobile.js";
  }>;
  readonly source_sha256: Readonly<PeakpoolObservedSourceHashes>;
}

/**
 * This is only static-source evidence.  `PEAKPOOL_APP_BET_ENABLED` must remain
 * false until an owner-authorized virtual-unit transaction verifies the final
 * authenticated request and response semantics.
 */
export const PEAKPOOL_APP_FLOW_PROFILE: PeakpoolAppFlowProfile = Object.freeze({
  product: PEAKPOOL_PRODUCT,
  audited_at: AUDITED_PEAKPOOL_FLOW.auditedAt,
  verification_status: "STATIC_SOURCE_ONLY",
  origin: AUDITED_PEAKPOOL_FLOW.origin,
  method: "POST",
  path: "/placebet/",
  request_fields: PEAKPOOL_APP_BET_FORM_FIELDS,
  content_type: "application/x-www-form-urlencoded; charset=UTF-8",
  app_user_agent: AUDITED_PEAKPOOL_FLOW.appUserAgent,
  app_mode: AUDITED_PEAKPOOL_FLOW.session.appMode,
  source_paths: Object.freeze({
    programme: AUDITED_PEAKPOOL_FLOW.paths.programme,
    site: AUDITED_PEAKPOOL_FLOW.paths.siteScript,
    root_mobile: AUDITED_PEAKPOOL_FLOW.paths.mobileScript,
  }),
  source_sha256: Object.freeze({
    site: AUDITED_PEAKPOOL_FLOW.scriptSha256.site,
    root_mobile: AUDITED_PEAKPOOL_FLOW.scriptSha256.mobile,
  }),
});

export type PeakpoolAppFlowErrorCode = "PEAKPOOL_APP_FLOW_CHANGED";

export class PeakpoolAppFlowError extends Error {
  constructor(readonly code: PeakpoolAppFlowErrorCode, message = "Peakpool app flow no longer matches the audited profile.") {
    super(message);
    this.name = "PeakpoolAppFlowError";
  }
}

export type PeakpoolBetType = "win" | "place";
export type PeakpoolNumericIdentifier = number | string;

export interface PeakpoolAppSessionFields {
  login_id: string;
  phone: string;
  token: string;
}

/** Structured values only; a caller cannot provide a provider `message`. */
export interface PeakpoolAppBetInput {
  unit_stake: number;
  meeting_number: PeakpoolNumericIdentifier;
  race_number: PeakpoolNumericIdentifier;
  runner_number: PeakpoolNumericIdentifier;
  bet_type: PeakpoolBetType;
}

export interface PeakpoolAppBetRequest {
  readonly product: typeof PEAKPOOL_PRODUCT;
  readonly origin: typeof PEAKPOOL_APP_FLOW_PROFILE.origin;
  readonly method: typeof PEAKPOOL_APP_FLOW_PROFILE.method;
  readonly path: typeof PEAKPOOL_APP_FLOW_PROFILE.path;
  readonly fields: Readonly<{
    loginid: string;
    phone: string;
    token: string;
    message: string;
  }>;
}

export interface PeakpoolAppFlowVerification {
  readonly valid: boolean;
  readonly fingerprint: string;
  readonly observed: Readonly<PeakpoolObservedSourceHashes>;
}

const POSITIVE_INTEGER = /^[1-9]\d*$/;
const NON_NEGATIVE_INTEGER = /^(?:0|[1-9]\d*)$/;
const MESSAGE_GRAMMAR = /^([1-9]\d*)R([1-9]\d*)C([1-9]\d*)H((?:0|[1-9]\d*))(P?)$/;
const SHA256_HEX = /^[a-f0-9]{64}$/;
// Runtime provenance guard: an egress request must be the exact object made by
// `buildPeakpoolAppBetRequest`, not a structurally similar caller-created body.
const generatedRequests = new WeakSet<object>();

function fail(message?: string): never {
  throw new PeakpoolAppFlowError("PEAKPOOL_APP_FLOW_CHANGED", message);
}

function safeIntegerText(value: PeakpoolNumericIdentifier, pattern: RegExp): string {
  const text = typeof value === "number"
    ? Number.isSafeInteger(value) ? String(value) : ""
    : typeof value === "string" ? value : "";
  if (!pattern.test(text) || !Number.isSafeInteger(Number(text))) fail();
  return text;
}

function positiveIntegerText(value: PeakpoolNumericIdentifier): string {
  return safeIntegerText(value, POSITIVE_INTEGER);
}

function runnerIdentifierText(value: PeakpoolNumericIdentifier): string {
  return safeIntegerText(value, NON_NEGATIVE_INTEGER);
}

function sessionValue(value: unknown): string {
  if (typeof value !== "string"
    || value.length < 1
    || value.length > 4_096
    || value.includes(String.fromCharCode(0))
    || value.includes("\r")
    || value.includes("\n")) fail();
  return value;
}

function exactFieldNames(fields: Readonly<Record<string, string>>): boolean {
  const names = Object.keys(fields);
  return names.length === PEAKPOOL_APP_BET_FORM_FIELDS.length
    && names.every((name, index) => name === PEAKPOOL_APP_BET_FORM_FIELDS[index]);
}

function canonicalMessage(input: PeakpoolAppBetInput): string {
  const stake = positiveIntegerText(input.unit_stake);
  const meeting = positiveIntegerText(input.meeting_number);
  const race = positiveIntegerText(input.race_number);
  const runner = runnerIdentifierText(input.runner_number);
  if (input.bet_type !== "win" && input.bet_type !== "place") fail();
  return `${stake}R${meeting}C${race}H${runner}${input.bet_type === "place" ? "P" : ""}`;
}

function isExpectedMessage(message: string): boolean {
  const match = MESSAGE_GRAMMAR.exec(message);
  if (!match) return false;
  return match.slice(1, 5).every((value) => Number.isSafeInteger(Number(value)));
}

/**
 * Creates the only request shape that the later provider boundary may send for
 * Peakpool.  Auth fields are retained only to form the audited provider body;
 * no raw message, path, method, headers, or destination is accepted here.
 */
export function buildPeakpoolAppBetRequest(
  session: PeakpoolAppSessionFields,
  input: PeakpoolAppBetInput,
): PeakpoolAppBetRequest {
  const request: PeakpoolAppBetRequest = {
    product: PEAKPOOL_PRODUCT,
    origin: PEAKPOOL_APP_FLOW_PROFILE.origin,
    method: PEAKPOOL_APP_FLOW_PROFILE.method,
    path: PEAKPOOL_APP_FLOW_PROFILE.path,
    fields: Object.freeze({
      loginid: sessionValue(session.login_id),
      phone: sessionValue(session.phone),
      token: sessionValue(session.token),
      message: canonicalMessage(input),
    }),
  };
  generatedRequests.add(request);
  assertPeakpoolAppBetRequest(request);
  return Object.freeze(request);
}

/**
 * Re-check the complete request immediately before egress.  A generic form
 * helper must call this with a request created above rather than accepting a
 * caller-supplied provider message or endpoint.
 */
export function assertPeakpoolAppBetRequest(request: PeakpoolAppBetRequest): void {
  if (!generatedRequests.has(request)
    || request.product !== PEAKPOOL_PRODUCT
    || request.origin !== PEAKPOOL_APP_FLOW_PROFILE.origin
    || request.method !== PEAKPOOL_APP_FLOW_PROFILE.method
    || request.path !== PEAKPOOL_APP_FLOW_PROFILE.path
    || !PEAKPOOL_APP_BET_ALLOWED_ENDPOINTS.includes(request.path)
    || !exactFieldNames(request.fields)
    || !isExpectedMessage(request.fields.message)
    || !sessionValue(request.fields.loginid)
    || !sessionValue(request.fields.phone)
    || !sessionValue(request.fields.token)) {
    fail();
  }
}

/** Reject all redirect outcomes; the provider transport must use `redirect: manual`. */
export function assertPeakpoolAppResponseIsNotRedirect(status: number, location?: string | null): void {
  if (!Number.isInteger(status) || status < 100 || status > 599 || (status >= 300 && status < 400) || location) fail();
}

function evidenceMaterial(observed: PeakpoolObservedSourceHashes): string {
  return JSON.stringify({
    product: PEAKPOOL_PRODUCT,
    origin: PEAKPOOL_APP_FLOW_PROFILE.origin,
    method: PEAKPOOL_APP_FLOW_PROFILE.method,
    path: PEAKPOOL_APP_FLOW_PROFILE.path,
    fields: PEAKPOOL_APP_BET_FORM_FIELDS,
    source_sha256: { site: observed.site, root_mobile: observed.root_mobile },
  });
}

/** A stable, secret-free identity binding a prepared ticket to current source evidence. */
export function createPeakpoolAppFlowFingerprint(observed: PeakpoolObservedSourceHashes): string {
  if (!SHA256_HEX.test(observed.site) || !SHA256_HEX.test(observed.root_mobile)) fail();
  return createHash("sha256").update(evidenceMaterial(observed)).digest("hex");
}

export function verifyPeakpoolAppFlowEvidence(observed: PeakpoolObservedSourceHashes): PeakpoolAppFlowVerification {
  const fingerprint = createPeakpoolAppFlowFingerprint(observed);
  return Object.freeze({
    valid: observed.site === PEAKPOOL_APP_FLOW_PROFILE.source_sha256.site
      && observed.root_mobile === PEAKPOOL_APP_FLOW_PROFILE.source_sha256.root_mobile,
    fingerprint,
    observed: Object.freeze({ ...observed }),
  });
}

export function assertPeakpoolAppFlowEvidence(observed: PeakpoolObservedSourceHashes): PeakpoolAppFlowVerification {
  const verification = verifyPeakpoolAppFlowEvidence(observed);
  if (!verification.valid) fail();
  return verification;
}

export const PEAKPOOL_APP_FLOW_FINGERPRINT = createPeakpoolAppFlowFingerprint(PEAKPOOL_APP_FLOW_PROFILE.source_sha256);
