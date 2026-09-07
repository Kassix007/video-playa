import assert from "node:assert/strict";
import { test } from "node:test";
import {
  completeSupabaseOAuthCodeCallback,
  isSupabaseOAuthCallbackHash,
  readSupabaseBrowserConfig,
} from "../src/lib/supabase.js";

function callbackStorage(entries: Record<string, string> = {}) {
  const values = new Map(Object.entries(entries));
  return {
    getItem: (key: string) => values.get(key) ?? null,
    removeItem: (key: string) => { values.delete(key); },
    setItem: (key: string, value: string) => { values.set(key, value); },
  };
}

test("exchanges a marked PKCE callback before routing and removes callback data", async () => {
  const exchanged: string[] = [];
  const replacements: string[] = [];
  const storage = callbackStorage({ "fantasy-peakpool-return": "1" });
  const handled = await completeSupabaseOAuthCodeCallback({
    client: { auth: { exchangeCodeForSession: async (code) => { exchanged.push(code); return { error: null }; } } },
    history: { replaceState: (_data, _unused, url) => { replacements.push(String(url)); } },
    location: { pathname: "/", search: "?code=short-lived-code" },
    storage,
  });
  assert.equal(handled, true);
  assert.deepEqual(exchanged, ["short-lived-code"]);
  assert.deepEqual(replacements, ["/#/peakpool"]);
  assert.equal(storage.getItem("fantasy-peakpool-return"), null);
});

test("ignores unmarked authorization codes and records a bounded exchange failure", async () => {
  const unmarkedStorage = callbackStorage();
  assert.equal(await completeSupabaseOAuthCodeCallback({
    client: { auth: { exchangeCodeForSession: async () => ({ error: null }) } },
    history: { replaceState: () => undefined },
    location: { pathname: "/", search: "?code=unrelated" },
    storage: unmarkedStorage,
  }), false);

  const failedStorage = callbackStorage({ "fantasy-peakpool-return": "1" });
  assert.equal(await completeSupabaseOAuthCodeCallback({
    client: { auth: { exchangeCodeForSession: async () => ({ error: new Error("sensitive provider detail") }) } },
    history: { replaceState: () => undefined },
    location: { pathname: "/", search: "?code=failed" },
    storage: failedStorage,
  }), true);
  assert.equal(failedStorage.getItem("fantasy-peakpool-oauth-error"), "1");
});

test("recognizes only Supabase OAuth callback fragments", () => {
  assert.equal(isSupabaseOAuthCallbackHash("#access_token=token&refresh_token=refresh"), true);
  assert.equal(isSupabaseOAuthCallbackHash("#/access_token=token&refresh_token=refresh"), true);
  assert.equal(isSupabaseOAuthCallbackHash("#error=access_denied&error_description=cancelled"), true);
  assert.equal(isSupabaseOAuthCallbackHash("#/peakpool"), false);
  assert.equal(isSupabaseOAuthCallbackHash("#/access_token/help"), false);
  assert.equal(isSupabaseOAuthCallbackHash(""), false);
});

test("browser config is optional and accepts only public/publishable keys", () => {
  assert.equal(readSupabaseBrowserConfig({}), null);
  assert.deepEqual(readSupabaseBrowserConfig({
    VITE_SUPABASE_URL: "https://project.supabase.co",
    VITE_SUPABASE_PUBLISHABLE_KEY: "sb_publishable_example",
  }), { url: "https://project.supabase.co", publishableKey: "sb_publishable_example" });
  assert.deepEqual(readSupabaseBrowserConfig({
    VITE_SUPABASE_URL: "http://127.0.0.1:54321",
    VITE_SUPABASE_PUBLISHABLE_KEY: "sb_publishable_example",
  }), { url: "http://127.0.0.1:54321", publishableKey: "sb_publishable_example" });
  assert.throws(() => readSupabaseBrowserConfig({
    VITE_SUPABASE_URL: "https://project.supabase.co",
    VITE_SUPABASE_PUBLISHABLE_KEY: "sb_secret_forbidden",
  }), /publishable/i);
});

test("browser config rejects unsafe origins", () => {
  assert.throws(() => readSupabaseBrowserConfig({
    VITE_SUPABASE_URL: "http://project.supabase.co",
    VITE_SUPABASE_PUBLISHABLE_KEY: "sb_publishable_example",
  }), /https/i);
  assert.throws(() => readSupabaseBrowserConfig({
    VITE_SUPABASE_URL: "http://localhost.example",
    VITE_SUPABASE_PUBLISHABLE_KEY: "sb_publishable_example",
  }), /loopback/i);
});
