import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { parseSmsfootballProgramme, SmspariazFootballClient } from "./smspariaz-football.js";
import { SAMPLE_ODDS_FRAGMENT, SAMPLE_ODDS_METADATA } from "./test-fixtures/smspariaz/flow-fixtures.js";

describe("SMSFootball programme", () => {
  it("parses provider event, market, selection, code, odds, and Mauritius kickoff", () => {
    const programme = parseSmsfootballProgramme(SAMPLE_ODDS_METADATA, [SAMPLE_ODDS_FRAGMENT]);
    assert.equal(programme.programme_date, "2026-09-01");
    assert.equal(programme.events.length, 1);
    const event = programme.events[0]!;
    assert.deepEqual({
      event_id: event.event_id,
      bet_code: event.bet_code,
      country: event.country,
      league: event.league,
      home: event.home,
      away: event.away,
      kickoff: event.kickoff,
      open: event.open,
    }, {
      event_id: "303589",
      bet_code: "1234",
      country: "Mauritius",
      league: "Premier League",
      home: "Port Louis",
      away: "Curepipe",
      kickoff: "2026-09-01T20:00:00+04:00",
      open: true,
    });
    assert.deepEqual(event.markets[0]?.selections[0], {
      selection_id: "90001",
      selection_code: "1",
      selection: "Home",
      odds: 1.48,
      status: "OPEN",
      open: true,
    });
  });

  it("marks malformed odds unavailable instead of guessing", () => {
    const malformed = structuredClone(SAMPLE_ODDS_FRAGMENT);
    malformed["0"].league[0]!.match[0]!.market["1"]!.s["1"] = "broken";
    const programme = parseSmsfootballProgramme(SAMPLE_ODDS_METADATA, [malformed]);
    const selection = programme.events[0]?.markets[0]?.selections[0];
    assert.equal(selection?.open, false);
    assert.equal(selection?.status, "UNAVAILABLE");
  });

  it("fetches only metadata and the declared cache fragment count", async () => {
    const paths: string[] = [];
    const client = new SmspariazFootballClient({
      getText: async (path: string) => {
        paths.push(path);
        return JSON.stringify(paths.length === 1 ? SAMPLE_ODDS_METADATA : SAMPLE_ODDS_FRAGMENT);
      },
    });
    const programme = await client.getProgramme();
    assert.equal(programme.events.length, 1);
    assert.deepEqual(paths, ["/smsfootball/service/odds_json.php?", "/football/cache/odds_1"]);
  });
});
