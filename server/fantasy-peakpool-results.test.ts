import assert from "node:assert/strict";
import { readFile } from "node:fs/promises";
import { test } from "node:test";
import { parseAtrHtml, matchEdgeObservation } from "../supabase/functions/_shared/results.js";
import { ATR_LIVE_LAYOUT } from "./test-fixtures/fantasy-peakpool/atr-live-layout.js";
import {
  matchFantasyResult,
  parseAtrResultHtml,
} from "./fantasy-peakpool-results.js";
import {
  ATR_CHALLENGE_HTML,
  ATR_CONFIRMED_RESULT_HTML,
  ATR_DEAD_HEAT_RESULT_HTML,
  ATR_MALFORMED_WINNER_PRICE_HTML,
  ATR_MISSING_WINNER_PRICE_HTML,
  ATR_PARTIAL_RESULT_HTML,
  ATR_VOID_HTML,
  ATR_ZERO_DENOMINATOR_PRICE_HTML,
} from "./test-fixtures/fantasy-peakpool/results.js";

const race = {
  id: "race", programmeDate: "2026-09-04", course: "TEST-COURSE", scheduledAt: "2026-09-04T13:10:00.000Z",
  raceNumber: 3, raceName: "Prix Example",
};
const runners = [
  { id: "alpha", number: 4, name: "Alpha Star" },
  { id: "beta", number: 2, name: "Beta Moon" },
];

test("actual ATR layout accepts passive Fastly script, London local time and SP cell", async () => {
  const target = { id: "h", programme_date: "2026-09-04", racecourse: "Haydock", official_off_at: "2026-09-04T13:05:00Z",
    race_number: 2, race_name: "Lee Thomas Christy Memorial EBF Fillies' Novice Stakes" };
  const observation = await parseAtrHtml(target, "https://www.attheraces.com/racecard/Haydock/04-September-2026/1405", ATR_LIVE_LAYOUT);
  assert.equal(observation.finishing_order[0].finalizedStartingPriceRaw, "9/4 2F");
  assert.equal(matchEdgeObservation(target, [{ id: "g", runner_number: 1, runner_name: "Girl Scout" }], observation).status, "CONFIRMED");
  const wrong = await parseAtrHtml(target, observation.source_url, ATR_LIVE_LAYOUT.replace("Haydock 04 Sep", "Ascot 04 Sep"));
  assert.equal(matchEdgeObservation(target, [], wrong).status, "NEEDS_REVIEW");
});

test("parses a final ATR result and supports multiple position-one winners", () => {
  const normal = parseAtrResultHtml(ATR_CONFIRMED_RESULT_HTML, {
    sourceUrl: "https://www.attheraces.com/racecard/Test-Course/04-September-2026/1410",
    retrievedAt: "2026-09-04T14:30:00Z", programmeDate: "2026-09-04", course: "Test Course", raceNumber: 3, raceName: "Prix Example",
  });
  assert.equal(normal.status, "CONFIRMED");
  assert.deepEqual(normal.finishingOrder.map((row) => row.runnerNumber), [4, 2]);
  assert.equal(normal.finishingOrder[0]?.finalizedStartingPriceRaw, "4/1 F");
  const deadHeat = parseAtrResultHtml(ATR_DEAD_HEAT_RESULT_HTML, {
    sourceUrl: normal.sourceUrl, retrievedAt: normal.retrievedAt, programmeDate: normal.programmeDate, course: normal.course, raceNumber: 3, raceName: "Prix Example",
  });
  assert.equal(deadHeat.finishingOrder.filter((row) => row.position === 1).length, 2);
  assert.deepEqual(
    deadHeat.finishingOrder.filter((row) => row.position === 1).map((row) => row.finalizedStartingPriceRaw),
    ["4/1 F", "7/2"],
  );
});

test("requires a bounded finalized starting price on every ATR winner", () => {
  const metadata = {
    sourceUrl: "https://www.attheraces.com/racecard/Test-Course/04-September-2026/1410",
    retrievedAt: "2026-09-04T14:30:00Z", programmeDate: "2026-09-04", course: "Test Course", raceNumber: 3,
  };
  const missing = parseAtrResultHtml(ATR_MISSING_WINNER_PRICE_HTML, metadata);
  const malformed = parseAtrResultHtml(ATR_MALFORMED_WINNER_PRICE_HTML, metadata);
  const zeroDenominator = parseAtrResultHtml(ATR_ZERO_DENOMINATOR_PRICE_HTML, metadata);
  assert.equal(missing.status, "NEEDS_REVIEW");
  assert.equal(malformed.status, "NEEDS_REVIEW");
  assert.equal(zeroDenominator.status, "NEEDS_REVIEW");
  assert.equal(missing.finishingOrder[0]?.finalizedStartingPriceRaw, undefined);
  assert.equal(malformed.finishingOrder[0]?.finalizedStartingPriceRaw, undefined);
  assert.equal(zeroDenominator.finishingOrder[0]?.finalizedStartingPriceRaw, undefined);
});

test("challenge, partial, and abandoned pages fail closed", () => {
  const metadata = { sourceUrl: "https://www.attheraces.com/results", retrievedAt: "2026-09-04T14:30:00Z", programmeDate: "2026-09-04", course: "Test Course", raceNumber: 3 };
  assert.equal(parseAtrResultHtml(ATR_CHALLENGE_HTML, metadata).status, "NEEDS_REVIEW");
  assert.equal(parseAtrResultHtml(ATR_PARTIAL_RESULT_HTML, metadata).status, "NEEDS_REVIEW");
  assert.equal(parseAtrResultHtml(ATR_VOID_HTML, metadata).status, "VOID");
});

test("matches on date, course alias, time, race identity, and runner field", () => {
  const observation = parseAtrResultHtml(ATR_CONFIRMED_RESULT_HTML, {
    sourceUrl: "https://www.attheraces.com/racecard/Test-Course/04-September-2026/1410",
    retrievedAt: "2026-09-04T14:30:00Z", programmeDate: "2026-09-04", course: "Test Course", raceNumber: 3, raceName: "Prix Example",
  });
  const decision = matchFantasyResult(race, runners, observation, { "testcourse": "testcourse" });
  assert.equal(decision.status, "CONFIRMED");
  assert.deepEqual(decision.winnerRunnerIds, ["alpha"]);
  assert.equal(decision.matchEvidence.winnerPrices, true);
  assert.equal(matchFantasyResult({ ...race, programmeDate: "2026-09-05" }, runners, observation).status, "NEEDS_REVIEW");
  assert.equal(matchFantasyResult(race, [{ id: "wrong", number: 4, name: "Different" }], observation).status, "NEEDS_REVIEW");
});

test("keeps the Edge result adapter aligned with finalized winner-price evidence", async () => {
  const edgeSource = await readFile("supabase/functions/_shared/results.ts", "utf8");
  assert.match(edgeSource, /finalizedStartingPriceRaw/);
  assert.match(edgeSource, /winners\.every\([^\n]+finalizedStartingPriceRaw/);
  assert.doesNotMatch(edgeSource, /locked_price|potential_gross_return/);
});

const edgeRace = { id: race.id, programme_date: race.programmeDate, racecourse: race.course,
  official_off_at: race.scheduledAt, race_number: race.raceNumber, race_name: race.raceName };
const metadata = { sourceUrl: "https://www.attheraces.com/racecard/Test-Course/04-September-2026/1410",
  retrievedAt: "2026-09-04T14:30:00Z", programmeDate: race.programmeDate,
  course: race.course, raceNumber: race.raceNumber, raceName: race.raceName };

async function decisions(html: string) {
  const node = matchFantasyResult(race, runners, parseAtrResultHtml(html, metadata));
  const edge = matchEdgeObservation(edgeRace, runners.map(r => ({ id: r.id, runner_number: r.number, runner_name: r.name })),
    await parseAtrHtml(edgeRace, metadata.sourceUrl, html));
  return [node, { status: edge.status, confidence: edge.confidence,
    winnerRunnerIds: edge.winner_runner_ids, nonRunnerIds: edge.non_runner_ids }];
}

test("Node and Edge reject the supplied challenge with zero evidence even with result-looking content", async () => {
  for (const marker of ["Client Challenge", "/_fs-ch-1T1wmsGaOgGaSxcX/script.js", "JavaScript is disabled in your browser"]) {
    const html = `<title>${marker}</title>${ATR_CONFIRMED_RESULT_HTML}`;
    for (const decision of await decisions(html)) {
      assert.equal(decision.status, "NEEDS_REVIEW");
      assert.equal(decision.confidence, 0);
      assert.deepEqual(decision.winnerRunnerIds, []);
      assert.deepEqual(decision.nonRunnerIds, []);
    }
    assert.equal((await parseAtrHtml(edgeRace, metadata.sourceUrl, html)).sanitized_fragment, "Access challenge received");
  }
});

test("both adapters require independently observed identity rather than requested metadata", async () => {
  const invalidPages = [
    ATR_CONFIRMED_RESULT_HTML.replace(/<script[\s\S]*?<\/script>/, ""),
    ATR_CONFIRMED_RESULT_HTML.replaceAll("Test Course", "Other Course"),
    ATR_CONFIRMED_RESULT_HTML.replace("2026-09-04T", "2026-09-03T"),
    ATR_CONFIRMED_RESULT_HTML.replace("Race 3", "Race 9"),
    ATR_CONFIRMED_RESULT_HTML.replace("Prix Example", "Prix Different"),
    ATR_CONFIRMED_RESULT_HTML.replace(" - Prix Example", ""),
    ATR_CONFIRMED_RESULT_HTML.replace("14:10:00+01:00", "14:10:00"),
    ATR_CONFIRMED_RESULT_HTML.replace("SportsEvent", "WebPage"),
    ATR_CONFIRMED_RESULT_HTML + ATR_CONFIRMED_RESULT_HTML,
  ];
  for (const html of invalidPages) for (const decision of await decisions(html)) {
    assert.equal(decision.status, "NEEDS_REVIEW");
    assert.deepEqual(decision.winnerRunnerIds, []);
    assert.deepEqual(decision.nonRunnerIds, []);
  }
  for (const decision of await decisions(ATR_CONFIRMED_RESULT_HTML)) assert.equal(decision.status, "CONFIRMED");
});

test("both adapters reject unmatched, duplicate or contradictory field evidence", async () => {
  for (const html of [
    ATR_CONFIRMED_RESULT_HTML.replace("Beta Moon", "Unknown Horse"),
    ATR_DEAD_HEAT_RESULT_HTML.replace("Beta Moon", "Alpha Star").replace('class="cloth">2', 'class="cloth">4'),
    ATR_CONFIRMED_RESULT_HTML + '<div class="non-runner" data-number="4">Alpha Star</div>',
    ATR_CONFIRMED_RESULT_HTML + '<div class="non-runner" data-number="7">Unknown Horse</div>',
    ATR_MISSING_WINNER_PRICE_HTML.replace(/data-position="2"[\s\S]*?<\/div>/, 'data-position="2"></div>') + '<span class="starting-price">4/1</span>',
  ]) for (const decision of await decisions(html)) {
    assert.equal(decision.status, "NEEDS_REVIEW");
    assert.deepEqual(decision.winnerRunnerIds, []);
    assert.deepEqual(decision.nonRunnerIds, []);
  }
});

test("smoke diagnostics use the shared challenge detector and cannot claim settlement readiness", async () => {
  const source = await readFile("supabase/functions/fantasy-result-checker/index.ts", "utf8");
  assert.match(source, /const challenge = isAtrAccessChallenge\(html\)/);
  assert.match(source, /settlementReady: false/);
  assert.doesNotMatch(source, /\? "PASS"/);
});

test("voids also need independent identity; context-only voids cannot refund", async () => {
  for (const decision of await decisions(ATR_VOID_HTML)) assert.equal(decision.status, "NEEDS_REVIEW");
  for (const decision of await decisions(ATR_CONFIRMED_RESULT_HTML.replace("Weighed In", "Race Abandoned"))) {
    assert.equal(decision.status, "VOID");
  }
});
