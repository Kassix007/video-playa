import assert from "node:assert/strict";
import { mkdtemp, readFile } from "node:fs/promises";
import { tmpdir } from "node:os";
import { join } from "node:path";
import { describe, it } from "node:test";
import { createSmspariazCipher } from "./smspariaz-crypto.js";
import {
  LocalFileSmspariazSessionStore,
  MemorySmspariazSessionStore,
  type SmspariazSessionRecord,
} from "./smspariaz-session-store.js";

const origin = "https://www.smspariaz.com";
const current = { id: "current", bytes: Buffer.alloc(32, 31) };
const previous = { id: "previous", bytes: Buffer.alloc(32, 30) };

function authenticated(generation = 1): SmspariazSessionRecord {
  return {
    schema_version: 1,
    generation,
    state: "AUTHENTICATED",
    provider_origin: origin,
    updated_at: "2026-09-01T10:00:00.000Z",
    login_id: "login-secret",
    phone: "23050000000",
    token: "token-secret",
    cookies: [{ name: "PHPSESSID", value: "cookie-secret", domain: "www.smspariaz.com", path: "/", secure: true }],
    app_registered: true,
    confirmed_at: "2026-09-01T10:00:00.000Z",
    last_validated_at: "2026-09-01T10:00:00.000Z",
  };
}

describe("SMSPariaz session persistence", () => {
  it("restores encrypted state without plaintext secrets on disk", async () => {
    const directory = await mkdtemp(join(tmpdir(), "smspariaz-session-"));
    const file = join(directory, "session.json");
    const store = new LocalFileSmspariazSessionStore(file, "test", origin, createSmspariazCipher(current));
    await store.replace(authenticated());
    assert.deepEqual(await store.get(), authenticated());
    const raw = await readFile(file, "utf8");
    for (const secret of ["login-secret", "token-secret", "cookie-secret", "23050000000"]) {
      assert.equal(raw.includes(secret), false);
    }
  });

  it("supports atomic generation checks and a secret-free logout tombstone", async () => {
    const store = new MemorySmspariazSessionStore(authenticated());
    await assert.rejects(() => store.replace({ ...authenticated(2), generation: 2 }, 0));
    await store.replace({
      schema_version: 1,
      generation: 2,
      state: "LOGGED_OUT",
      provider_origin: origin,
      updated_at: "2026-09-01T10:05:00.000Z",
    }, 1);
    assert.equal((await store.get())?.state, "LOGGED_OUT");
    assert.equal(JSON.stringify(await store.get()).includes("secret"), false);
  });

  it("rewraps records encrypted with the previous key", async () => {
    const directory = await mkdtemp(join(tmpdir(), "smspariaz-rotation-"));
    const file = join(directory, "session.json");
    await new LocalFileSmspariazSessionStore(file, "test", origin, createSmspariazCipher(previous)).replace(authenticated());
    const rotated = new LocalFileSmspariazSessionStore(file, "test", origin, createSmspariazCipher(current, previous));
    assert.equal((await rotated.get())?.state, "AUTHENTICATED");
    assert.match(await readFile(file, "utf8"), /"kid":"current"/);
  });
});
