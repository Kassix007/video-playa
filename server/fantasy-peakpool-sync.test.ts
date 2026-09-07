import assert from "node:assert/strict";
import { test } from "node:test";
import type { SmspariazRacecardSuccess } from "./smspariaz-racecard.js";
import { authorizeFantasyPeakpoolSync, syncFantasyPeakpool } from "./fantasy-peakpool-sync.js";

const racecard: SmspariazRacecardSuccess = {
  success: true,
  programme_date: "2026-09-04",
  timezone: "Indian/Mauritius",
  fetched_at: "2026-09-04T09:00:00+04:00",
  source: "https://www.smspariaz.com/racecard/",
  meeting_count: 1,
  race_count: 1,
  french_race_count: 1,
  meetings: [{ meeting_number: 1, racecourse: "CHANTILLY", country: "France", race_count: 1, race_ids: ["R1C1"] }],
  races: [{ race_id: "R1C1", meeting_number: 1, race_number: 1, racecourse: "CHANTILLY", off_time: "13:50", off_time_mauritius: "13:50", race_name: "Prix A", country: "France" }],
};

test("sync fetches only the public market, reconciles canonical races, and ingests no invented prices", async () => {
  const urls: string[] = [];
  let ingestion: unknown;
  const result = await syncFantasyPeakpool({
    getRacecard: async () => racecard,
    fetchImpl: async (input, init) => {
      urls.push(String(input));
      assert.equal(init?.method, "GET");
      assert.equal(init?.redirect, "manual");
      return new Response(JSON.stringify([{
        meeting_number: "1", date: "2026-09-04", track: "Chantilly", number: "1", time: "13:50", name: "Prix A",
        horses: [{ no: "1", name: "Alpha", type: "940" }],
      }]), { status: 200, headers: { "content-type": "text/html; charset=UTF-8" } });
    },
    ingest: async (payload) => { ingestion = payload; return { valid_prices: 0 }; },
    now: () => new Date("2026-09-04T09:14:35.000Z"),
  });

  assert.deepEqual(urls, ["https://www.smspariaz.com/service/peakpool_json.php"]);
  assert.equal(result.validPrices, 0);
  assert.equal(result.unavailablePrices, 1);
  assert.match(JSON.stringify(ingestion), /UNVERIFIED_PRICE_FORMAT/);
  assert.doesNotMatch(JSON.stringify(ingestion), /normalized_price":"[0-9]/);
});

test("sync fails closed when the canonical daily racecard is unavailable", async () => {
  await assert.rejects(() => syncFantasyPeakpool({
    getRacecard: async () => ({ success: false, programme_date: "2026-09-04", timezone: "Indian/Mauritius", fetched_at: "x", source: "https://www.smspariaz.com/racecard/", error_code: "SMSPARIAZ_RACECARD_STALE", error: "stale" }),
    fetchImpl: async () => new Response("[]"), ingest: async () => ({}),
  }), /racecard unavailable/i);
});

test("sync ingests every canonical PDF race when optional market data is empty or unavailable", async () => {
  for (const response of [
    new Response("[]", { status: 200, headers: { "content-type": "application/json" } }),
    new Response("upstream unavailable", { status: 503, headers: { "content-type": "text/plain" } }),
    new Response(null, { status: 302, headers: { location: "https://example.com" } }),
  ]) {
    let ingestion: Record<string, unknown> | undefined;
    const result = await syncFantasyPeakpool({
      getRacecard: async () => racecard,
      fetchImpl: async () => response,
      ingest: async (payload) => { ingestion = payload; return {}; },
      now: () => new Date("2026-09-04T09:14:35.000Z"),
    });

    assert.equal(result.canonicalRaces, 1);
    assert.equal(result.marketRaces, 0);
    const ingestedRaces = ingestion?.races as Array<{ external_race_id: string; runners: unknown[] }>;
    assert.equal(ingestedRaces.length, 1);
    assert.equal(ingestedRaces[0]?.external_race_id, "R1C1");
    assert.deepEqual(ingestedRaces[0]?.runners, []);
  }
});

test("sync skips an invalid market race without suppressing its canonical PDF race", async () => {
  let ingestion: Record<string, unknown> | undefined;
  const result = await syncFantasyPeakpool({
    getRacecard: async () => racecard,
    fetchImpl: async () => new Response(JSON.stringify([{
      meeting_number: "1", date: "2026-09-04", track: "Chantilly", number: "1", time: "13:50", name: "Prix A",
      horses: [{ no: "0", name: "Header A", type: "940" }, { no: "0", name: "Header B", type: "940" }],
    }]), { status: 200, headers: { "content-type": "application/json" } }),
    ingest: async (payload) => { ingestion = payload; return {}; },
    now: () => new Date("2026-09-04T09:14:35.000Z"),
  });

  assert.equal(result.canonicalRaces, 1);
  assert.equal(result.marketRaces, 0);
  const ingestedRaces = ingestion?.races as Array<{ external_race_id: string; runners: unknown[] }>;
  assert.equal(ingestedRaces.length, 1);
  assert.deepEqual(ingestedRaces[0]?.runners, []);
});

test("server sync authorization uses an exact bearer token", () => {
  assert.equal(authorizeFantasyPeakpoolSync("Bearer correct", "correct"), true);
  assert.equal(authorizeFantasyPeakpoolSync("Bearer wrong", "correct"), false);
  assert.equal(authorizeFantasyPeakpoolSync(null, "correct"), false);
  assert.equal(authorizeFantasyPeakpoolSync("Bearer correct", undefined), false);
});
