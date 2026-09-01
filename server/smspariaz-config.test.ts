import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  DEFAULT_SMSPARIAZ_APP_BET_SCOPE,
  DEFAULT_SMSPARIAZ_SESSION_SCOPE,
  parseSmspariazConfig,
  SMSPARIAZ_PRODUCTION_ORIGIN,
} from "./smspariaz-config.js";

const key = Buffer.alloc(32, 7).toString("base64");

describe("SMSPariaz configuration", () => {
  it("is safely unconfigured without an encryption key", () => {
    const config = parseSmspariazConfig({ SMSPARIAZ_APP_BET_ENABLED: "true" });
    assert.equal(config.configured, false);
    assert.equal(config.appBetEnabled, false);
    assert.equal(config.baseUrl, SMSPARIAZ_PRODUCTION_ORIGIN);
  });

  it("accepts a canonical 32-byte Base64 key and keeps placement disabled by default", () => {
    const config = parseSmspariazConfig({ SMSPARIAZ_SESSION_ENCRYPTION_KEY: key });
    assert.equal(config.configured, true);
    assert.equal(config.currentKey?.bytes.length, 32);
    assert.equal(config.appBetEnabled, false);
    assert.equal(config.sessionScope, DEFAULT_SMSPARIAZ_SESSION_SCOPE);
    assert.equal(config.appBetScope, DEFAULT_SMSPARIAZ_APP_BET_SCOPE);
  });

  it("rejects malformed keys and base URLs with paths or credentials", () => {
    assert.equal(parseSmspariazConfig({ SMSPARIAZ_SESSION_ENCRYPTION_KEY: "not-a-key" }).configured, false);
    assert.equal(parseSmspariazConfig({
      SMSPARIAZ_SESSION_ENCRYPTION_KEY: key,
      SMSPARIAZ_BASE_URL: "https://user:pass@example.test/path",
    }).configured, false);
    assert.equal(parseSmspariazConfig({
      SMSPARIAZ_SESSION_ENCRYPTION_KEY: key,
      SMSPARIAZ_BASE_URL: "https://other.example",
    }).configured, false);
  });

  it("enables app placement only with complete configuration and an explicit true flag", () => {
    const config = parseSmspariazConfig({
      SMSPARIAZ_SESSION_ENCRYPTION_KEY: key,
      SMSPARIAZ_APP_BET_ENABLED: "TRUE",
    });
    assert.equal(config.configured, true);
    assert.equal(config.appBetEnabled, true);
  });
});
