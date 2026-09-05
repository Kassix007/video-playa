import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { parseSmspariazConfig } from "./smspariaz-config.js";
import {
  DEFAULT_PEAKPOOL_PLACE_SCOPE,
  DEFAULT_PEAKPOOL_PREPARE_SCOPE,
  parsePeakpoolConfig,
} from "./peakpool-config.js";

const key = Buffer.alloc(32, 17).toString("base64");

describe("Peakpool configuration", () => {
  it("is not configured unless both encrypted SMSPariaz storage and the product flag are enabled", () => {
    const noSession = parsePeakpoolConfig({ PEAKPOOL_ENABLED: "true" }, parseSmspariazConfig({}));
    assert.equal(noSession.configured, false);
    assert.equal(noSession.appBetEnabled, false);

    const noProduct = parsePeakpoolConfig({}, parseSmspariazConfig({ SMSPARIAZ_SESSION_ENCRYPTION_KEY: key }));
    assert.equal(noProduct.configured, false);
    assert.equal(noProduct.enabled, false);
  });

  it("keeps placement disabled until both the runtime flag and verification acknowledgement are explicit", () => {
    const smspariaz = parseSmspariazConfig({ SMSPARIAZ_SESSION_ENCRYPTION_KEY: key });
    const configured = parsePeakpoolConfig({ PEAKPOOL_ENABLED: "true" }, smspariaz);
    assert.equal(configured.configured, true);
    assert.equal(configured.appBetEnabled, false);

    const enabledOnly = parsePeakpoolConfig({
      PEAKPOOL_ENABLED: "true",
      PEAKPOOL_APP_BET_ENABLED: "true",
    }, smspariaz);
    assert.equal(enabledOnly.appBetEnabled, false);

    const live = parsePeakpoolConfig({
      PEAKPOOL_ENABLED: "TRUE",
      PEAKPOOL_APP_BET_ENABLED: "TRUE",
      PEAKPOOL_APP_BET_VERIFIED: "TRUE",
    }, smspariaz);
    assert.equal(live.appBetEnabled, true);
    assert.equal(live.verificationAcknowledged, true);
  });

  it("uses separate default scopes and accepts deployment-specific overrides", () => {
    const smspariaz = parseSmspariazConfig({ SMSPARIAZ_SESSION_ENCRYPTION_KEY: key });
    const defaults = parsePeakpoolConfig({ PEAKPOOL_ENABLED: "true" }, smspariaz);
    assert.equal(defaults.prepareScope, DEFAULT_PEAKPOOL_PREPARE_SCOPE);
    assert.equal(defaults.placeScope, DEFAULT_PEAKPOOL_PLACE_SCOPE);

    const custom = parsePeakpoolConfig({
      PEAKPOOL_ENABLED: "true",
      HORSEE_OAUTH_PEAKPOOL_PREPARE_SCOPE: "test:peakpool:prepare",
      HORSEE_OAUTH_PEAKPOOL_PLACE_SCOPE: "test:peakpool:place",
    }, smspariaz);
    assert.equal(custom.prepareScope, "test:peakpool:prepare");
    assert.equal(custom.placeScope, "test:peakpool:place");
  });
});
