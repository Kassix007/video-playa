import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { createTestSmspariazSubsystem } from "./smspariaz-test-helpers.js";

describe("SMSPariaz session subsystem", () => {
  it("starts OTP, confirms it without retaining the OTP, and restores server-side state", async () => {
    const { subsystem, store } = createTestSmspariazSubsystem();
    assert.deepEqual(await subsystem.sessionStatus(false), {
      authenticated: false, app_registered: false, account: null, session_valid: false,
      requires_otp: false, state: "AUTH_REQUIRED", error_code: "AUTH_REQUIRED",
    });
    const started = await subsystem.startLogin("23050000000");
    assert.equal(started.requires_otp, true);
    assert.equal((await subsystem.sessionStatus(false)).requires_otp, true);
    const confirmed = await subsystem.confirmOtp("123456");
    assert.equal(confirmed.authenticated, true);
    assert.equal(confirmed.account, "••••0000");
    assert.equal(JSON.stringify(await store.get()).includes("123456"), false);
    assert.equal((await subsystem.sessionStatus()).session_valid, true);
  });

  it("requires a pending OTP and destroys persisted secrets on logout", async () => {
    const { subsystem, store } = createTestSmspariazSubsystem();
    await assert.rejects(() => subsystem.confirmOtp("123456"), /OTP_REQUIRED/);
    await subsystem.startLogin("23050000000");
    await subsystem.confirmOtp("123456");
    await subsystem.logout();
    const serialized = JSON.stringify(await store.get());
    assert.match(serialized, /LOGGED_OUT/);
    assert.equal(serialized.includes("SENTINEL_TOKEN"), false);
  });

  it("turns a rejected restored session into a secret-free expired record", async () => {
    const valid = createTestSmspariazSubsystem();
    await valid.subsystem.startLogin("23050000000");
    await valid.subsystem.confirmOtp("123456");
    const record = await valid.store.get();
    const expired = createTestSmspariazSubsystem({ validSession: false });
    await expired.store.replace(record!);
    const status = await expired.subsystem.sessionStatus();
    assert.equal(status.state, "SESSION_EXPIRED");
    assert.equal(JSON.stringify(await expired.store.get()).includes("SENTINEL_TOKEN"), false);
  });
});
