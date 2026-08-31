import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { parseHorseeConfig, toPublicHorseeConfig } from "./horsee-config.js";

describe("HORSEE configuration", () => {
  it("uses safe operational defaults without requiring archive credentials", () => {
    const config = parseHorseeConfig({});
    assert.equal(config.hotRetentionDays, 14);
    assert.equal(config.recentResultLimit, 100);
    assert.deepEqual(config.primaryWindow, { min: 30, max: 44 });
    assert.deepEqual(config.recoveryWindow, { min: 15, max: 29 });
    assert.equal(config.archive.owner, "Kassix007");
    assert.equal(config.archive.prefix, "horsee-archive-");
    assert.equal(config.archive.configured, false);
  });

  it("parses supported environment overrides", () => {
    const config = parseHorseeConfig({
      HORSEE_HOT_RETENTION_DAYS: "21",
      HORSEE_RECENT_RESULT_LIMIT: "50",
      HORSEE_PRIMARY_MIN_MINUTES: "31",
      HORSEE_PRIMARY_MAX_MINUTES: "46",
      HORSEE_RECOVERY_MIN_MINUTES: "12",
      HORSEE_RECOVERY_MAX_MINUTES: "30",
      HORSEE_GITHUB_ARCHIVE_OWNER: "owner",
      HORSEE_GITHUB_ARCHIVE_PREFIX: "year-",
      HORSEE_GITHUB_TOKEN: "secret-token",
      HORSEE_SCHEDULER_API_KEY: "0123456789abcdef",
    });
    assert.equal(config.hotRetentionDays, 21);
    assert.equal(config.recentResultLimit, 50);
    assert.equal(config.archive.configured, true);
    assert.equal(config.schedulerApiKey, "0123456789abcdef");
  });

  it("rejects overlapping or inverted timing windows", () => {
    assert.throws(() => parseHorseeConfig({
      HORSEE_PRIMARY_MIN_MINUTES: "20",
      HORSEE_RECOVERY_MAX_MINUTES: "20",
    }));
    assert.throws(() => parseHorseeConfig({
      HORSEE_PRIMARY_MIN_MINUTES: "45",
      HORSEE_PRIMARY_MAX_MINUTES: "44",
    }));
  });

  it("never includes credentials in the public projection", () => {
    const projected = JSON.stringify(toPublicHorseeConfig(parseHorseeConfig({
      HORSEE_GITHUB_TOKEN: "github-super-secret",
      HORSEE_SCHEDULER_API_KEY: "scheduler-secret-1234",
    })));
    assert.doesNotMatch(projected, /github-super-secret|scheduler-secret-1234/);
  });
});

