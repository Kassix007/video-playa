export type SmspariazEventName =
  | "login_started"
  | "login_confirmed"
  | "login_failed"
  | "session_restored"
  | "session_expired"
  | "session_logout"
  | "programme_retrieved"
  | "programme_failed"
  | "bet_prepared"
  | "bet_validation_failed"
  | "app_bet_guard_rejected"
  | "app_bet_submitting"
  | "app_bet_response"
  | "app_bet_flow_changed";

export interface SmspariazSafeEventFields {
  request_id?: string;
  error_code?: string;
  provider_status?: number;
  latency_ms?: number;
  event_count?: number;
  selection_count?: number;
  session_state?: string;
  storage_kind?: string;
  flow_fingerprint?: string;
  reference_hash?: string;
  retryable?: boolean;
}

export interface SmspariazSafeDiagnostics {
  configured?: boolean;
  app_bet_enabled?: boolean;
  session_present?: boolean;
  auth_valid?: boolean;
  app_registered?: boolean;
  app_mode_detected?: boolean;
  session_state?: string;
  storage_kind?: string;
  site_script_sha256?: string;
  mobile_script_sha256?: string;
  root_mobile_script_sha256?: string;
  flow_fingerprint?: string;
  last_error?: string;
  last_event_at?: string;
}

const EVENT_KEYS = new Set<keyof SmspariazSafeEventFields>([
  "request_id", "error_code", "provider_status", "latency_ms", "event_count",
  "selection_count", "session_state", "storage_kind", "flow_fingerprint",
  "reference_hash", "retryable",
]);

const DIAGNOSTIC_KEYS = new Set<keyof SmspariazSafeDiagnostics>([
  "configured", "app_bet_enabled", "session_present", "auth_valid", "app_registered",
  "app_mode_detected", "session_state", "storage_kind", "site_script_sha256",
  "mobile_script_sha256", "root_mobile_script_sha256", "flow_fingerprint",
  "last_error", "last_event_at",
]);

function bounded(value: unknown): unknown {
  return typeof value === "string" ? value.slice(0, 200) : value;
}

export function createSmspariazObservability(
  sink: (line: string) => void = (line) => console.info(line),
) {
  let diagnostics: SmspariazSafeDiagnostics = {};
  return {
    emit(event: SmspariazEventName, unsafeFields: SmspariazSafeEventFields): void {
      const fields: Record<string, unknown> = {};
      for (const [key, value] of Object.entries(unsafeFields)) {
        if (EVENT_KEYS.has(key as keyof SmspariazSafeEventFields) && value !== undefined) {
          fields[key] = bounded(value);
        }
      }
      const occurredAt = new Date().toISOString();
      diagnostics = {
        ...diagnostics,
        last_event_at: occurredAt,
        ...(typeof fields.error_code === "string" ? { last_error: fields.error_code } : {}),
      };
      sink(JSON.stringify({ component: "smspariaz", event, occurred_at: occurredAt, ...fields }));
    },

    updateDiagnostics(unsafeState: SmspariazSafeDiagnostics): void {
      const safe: SmspariazSafeDiagnostics = {};
      for (const [key, value] of Object.entries(unsafeState)) {
        if (DIAGNOSTIC_KEYS.has(key as keyof SmspariazSafeDiagnostics) && value !== undefined) {
          Object.assign(safe, { [key]: bounded(value) });
        }
      }
      diagnostics = { ...diagnostics, ...safe };
    },

    getDiagnostics(): Readonly<SmspariazSafeDiagnostics> {
      return Object.freeze({ ...diagnostics });
    },
  };
}

export type SmspariazObservability = ReturnType<typeof createSmspariazObservability>;
