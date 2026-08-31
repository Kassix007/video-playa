import assert from "node:assert/strict";
import { readFile } from "node:fs/promises";
import { describe, it } from "node:test";
import { config as archiveConfig } from "../netlify/functions/horsee-archive.js";
import { config as schedulerConfig } from "../netlify/functions/horsee-scheduler.js";

describe("Netlify HORSEE routing and schedules", () => {
  it("declares five-minute scheduling and daily Mauritius catch-up", () => {
    assert.equal(schedulerConfig.schedule, "*/5 * * * *");
    assert.equal(archiveConfig.schedule, "30 22 * * *");
  });

  it("maps specific read routes before the wildcard and never redirects scheduled functions", async () => {
    const configuration = await readFile(new URL("../netlify.toml", import.meta.url), "utf8");
    const today = configuration.indexOf('from = "/api/horsee/jobs/today"');
    const wildcard = configuration.indexOf('from = "/api/horsee/jobs/*"');
    assert.ok(today >= 0 && wildcard > today);
    for (const route of [
      "/api/horsee/scheduler/status", "/api/horsee/scheduler/run",
      "/api/horsee/archive/status", "/api/horsee/archive/run", "/api/horsee/archive/cleanup",
    ]) assert.ok(configuration.includes(`from = "${route}"`));
    assert.equal(configuration.includes('to = "/.netlify/functions/horsee-scheduler"'), false);
    assert.equal(configuration.includes('to = "/.netlify/functions/horsee-archive"'), false);
  });
});
