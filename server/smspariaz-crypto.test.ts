import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { createSmspariazCipher, type SmspariazEncryptedEnvelope } from "./smspariaz-crypto.js";

const current = { id: "current", bytes: Buffer.alloc(32, 11) };
const previous = { id: "previous", bytes: Buffer.alloc(32, 12) };
const context = { namespace: "test-store", recordKey: "session", providerOrigin: "https://www.smspariaz.com" };

describe("SMSPariaz encrypted records", () => {
  it("round-trips a strict JSON value", () => {
    const cipher = createSmspariazCipher(current);
    const envelope = cipher.encrypt({ token: "secret", generation: 2 }, context);
    assert.deepEqual(cipher.decrypt(envelope, context).value, { token: "secret", generation: 2 });
    assert.equal(JSON.stringify(envelope).includes("secret"), false);
  });

  it("rejects tampering and wrong keys", () => {
    const envelope = createSmspariazCipher(current).encrypt({ state: "AUTHENTICATED" }, context);
    const tampered: SmspariazEncryptedEnvelope = { ...envelope, ciphertext: `${envelope.ciphertext.slice(0, -2)}AA` };
    assert.throws(() => createSmspariazCipher(current).decrypt(tampered, context));
    assert.throws(() => createSmspariazCipher(previous).decrypt(envelope, context));
  });

  it("decrypts with a previous key and reports that rewrapping is required", () => {
    const envelope = createSmspariazCipher(previous).encrypt({ state: "OTP_PENDING" }, context);
    const result = createSmspariazCipher(current, previous).decrypt(envelope, context);
    assert.deepEqual(result.value, { state: "OTP_PENDING" });
    assert.equal(result.needsRewrap, true);
  });

  it("binds ciphertext to namespace, record key, and provider origin", () => {
    const cipher = createSmspariazCipher(current);
    const envelope = cipher.encrypt({ state: "LOGGED_OUT" }, context);
    assert.throws(() => cipher.decrypt(envelope, { ...context, recordKey: "other" }));
  });
});
