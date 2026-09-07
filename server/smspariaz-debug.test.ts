import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { createTestSmspariazSubsystem } from "./smspariaz-test-helpers.js";

describe("SMSPariaz safe diagnostics", () => {
  it("reports flow/session state without OTP, token, cookie, phone, or prepared handles", async () => {
    const lines: string[] = [];
    const { subsystem } = createTestSmspariazSubsystem({ lines });
    await subsystem.startLogin("23050000000");
    await subsystem.confirmOtp("123456");
    const debug = await subsystem.debugStatus();
    const serialized = JSON.stringify({ debug, lines });
    assert.equal(debug.app_mode_detected, true);
    assert.equal(debug.auth_valid, true);
    for (const secret of ["123456", "SENTINEL_TOKEN", "23050000000"]) assert.equal(serialized.includes(secret), false);
  });
});
