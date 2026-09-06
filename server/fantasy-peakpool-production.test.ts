import assert from "node:assert/strict";
import test from "node:test";
import { readFile } from "node:fs/promises";
import { verifyFantasyPeakpoolProduction } from "./fantasy-peakpool-production.js";

function response(body: string, status = 200, contentType = "application/json"): Response {
  return new Response(body, { status, headers: { "content-type": contentType } });
}

test("result worker uses an explicit Deno package specifier for hosted bundling", async () => {
  const source = await readFile("supabase/functions/fantasy-result-checker/index.ts", "utf8");
  assert.match(source, /from ["']npm:@supabase\/supabase-js@2["']/);
  assert.doesNotMatch(source, /from ["']@supabase\/supabase-js["']/);
});

test("production smoke check verifies the app, anonymous privacy, and sync authorization", async () => {
  const requests: Array<{ url: string; method: string }> = [];
  const report = await verifyFantasyPeakpoolProduction({
    siteUrl: "https://video.example",
    supabaseUrl: "https://project.supabase.co",
    publishableKey: "sb_publishable_fixture",
    fetchImpl: async (input, init) => {
      const url = String(input);
      requests.push({ url, method: init?.method ?? "GET" });
      if (url === "https://video.example/") return response('<div id="root"></div>', 200, "text/html");
      if (url.includes("get_fantasy_peakpool_bootstrap")) {
        return response(JSON.stringify({ profile: null, wallet: null, races: [], leaderboard: [] }));
      }
      return response('{"error":"unauthorized"}', 401);
    },
  });

  assert.deepEqual(requests.map(({ method }) => method), ["GET", "POST", "POST"]);
  assert.equal(report.protectedSync.status, 401);
  assert.equal(report.anonymousBootstrap.races, 0);
});

test("production smoke check fails if anonymous output contains private account data", async () => {
  await assert.rejects(
    verifyFantasyPeakpoolProduction({
      siteUrl: "https://video.example",
      supabaseUrl: "https://project.supabase.co",
      publishableKey: "sb_publishable_fixture",
      fetchImpl: async (input) => String(input).includes("supabase.co")
        ? response(JSON.stringify({ profile: { id: "private" }, wallet: null, races: [], leaderboard: [] }))
        : response('<div id="root"></div>', 200, "text/html"),
    }),
    /ANONYMOUS_PRIVATE_DATA_EXPOSED/,
  );
});

test("production smoke check requires HTTPS origins and rejects secret-looking keys", async () => {
  await assert.rejects(
    verifyFantasyPeakpoolProduction({ siteUrl: "http://video.example", supabaseUrl: "https://project.supabase.co", publishableKey: "sb_publishable_fixture" }),
    /SITE_HTTPS_ORIGIN_REQUIRED/,
  );
  await assert.rejects(
    verifyFantasyPeakpoolProduction({ siteUrl: "https://video.example", supabaseUrl: "https://project.supabase.co", publishableKey: "service_role_fixture" }),
    /PUBLISHABLE_KEY_REQUIRED/,
  );
});
