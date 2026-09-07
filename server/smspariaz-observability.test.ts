import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { createSmspariazObservability } from "./smspariaz-observability.js";

describe("SMSPariaz observability", () => {
  it("logs only allowlisted bounded fields", () => {
    const lines: string[] = [];
    const telemetry = createSmspariazObservability((line) => lines.push(line));
    telemetry.emit("login_failed", {
      request_id: "req-1",
      error_code: "OTP_INVALID",
      provider_status: 401,
      phone: "SENTINEL_PHONE",
      otp: "SENTINEL_OTP",
      token: "SENTINEL_TOKEN",
      cookie: "SENTINEL_COOKIE",
    } as never);
    const serialized = lines.join("\n");
    assert.match(serialized, /login_failed/);
    assert.match(serialized, /OTP_INVALID/);
    for (const secret of ["SENTINEL_PHONE", "SENTINEL_OTP", "SENTINEL_TOKEN", "SENTINEL_COOKIE"]) {
      assert.equal(serialized.includes(secret), false);
    }
  });

  it("keeps only safe diagnostic state", () => {
    const telemetry = createSmspariazObservability(() => undefined);
    telemetry.updateDiagnostics({
      session_present: true,
      auth_valid: false,
      last_error: "SESSION_EXPIRED",
      flow_fingerprint: "sha256:safe",
      token: "SENTINEL_TOKEN",
    } as never);
    const serialized = JSON.stringify(telemetry.getDiagnostics());
    assert.equal(serialized.includes("SENTINEL_TOKEN"), false);
    assert.match(serialized, /SESSION_EXPIRED/);
  });
});
