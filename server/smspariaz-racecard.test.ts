import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  getMauritiusDate,
  getSmspariazDailyRacecard,
  parseSmspariazRacecardText,
} from "./smspariaz-racecard.js";

const CURRENT_TEXT = `
PROGRAMME DES COURSES FRANÇAISES DU VENDREDI 21 AOÛT 2026
Longchamp - R2C1 - Prix de Paris Plat 1600M
R2C1 - 14H30
Plat 1600M
Envoyez : Win - montantR2C1H1 au 8685
Vincennes - R3C4 - Prix de Maurice Attelé 2700M
R3C4 - 16H05
Attelé 2700M
Envoyez : Win - montantR3C4H1 au 8685

-- 2 of 2 --
UK RACES - FRIDAY 21 AUGUST 2026
13H45 - R21C2
Newmarket - R21C2 - Summer Fillies' Handicap
7f
Send : Win - montantR21C2H1 au 8685
`;

function pdfResponse(
  filenameDate = "2026-08-21",
  body = "%PDF-fixture",
): Response {
  return new Response(body, {
    status: 200,
    headers: {
      "Content-Type": "application/pdf",
      "Content-Disposition": `attachment; filename="Racecards-${filenameDate}.pdf"`,
    },
  });
}

describe("SMSPariaz daily racecard", () => {
  it("parses every page, retains French races and meetings, and sorts chronologically", async () => {
    const calls: URL[] = [];
    const result = await getSmspariazDailyRacecard({
      now: () => new Date("2026-08-21T04:00:02.000Z"),
      fetchImpl: async (input) => {
        calls.push(new URL(input.toString()));
        return pdfResponse();
      },
      extractPdfText: async () => CURRENT_TEXT,
    });

    assert.equal(result.success, true);
    if (!result.success) return;
    assert.equal(calls.length, 1);
    assert.equal(result.programme_date, "2026-08-21");
    assert.equal(result.meeting_count, 3);
    assert.equal(result.race_count, 3);
    assert.equal(result.french_race_count, 2);
    assert.deepEqual(result.races.map((race) => race.race_id), ["R21C2", "R2C1", "R3C4"]);
    assert.deepEqual(result.races.map((race) => race.racecourse), ["Newmarket", "Longchamp", "Vincennes"]);
    assert.equal(result.races.find((race) => race.race_id === "R3C4")?.discipline, "Harness");
    assert.equal(result.races.find((race) => race.race_id === "R2C1")?.distance, "1600m");
  });

  it("parses multiple meetings from a multi-page text fixture without filtering by country", () => {
    const races = parseSmspariazRacecardText(CURRENT_TEXT);
    assert.deepEqual(new Set(races.map((race) => race.meeting_number)), new Set([2, 3, 21]));
    assert.equal(races.filter((race) => race.country === "France").length, 2);
    assert.equal(races.find((race) => race.country === "United Kingdom")?.race_id, "R21C2");
  });

  it("retries a stale first document with a cache-busting URL and accepts a current retry", async () => {
    const urls: URL[] = [];
    const staleText = CURRENT_TEXT.replaceAll("21 AUGUST 2026", "20 AUGUST 2026")
      .replaceAll("21 AOÛT 2026", "20 AOÛT 2026");
    const result = await getSmspariazDailyRacecard({
      now: () => new Date("2026-08-21T04:00:02.000Z"),
      fetchImpl: async (input) => {
        urls.push(new URL(input.toString()));
        return pdfResponse(urls.length === 1 ? "2026-08-20" : "2026-08-21");
      },
      extractPdfText: async () => urls.length === 1 ? staleText : CURRENT_TEXT,
    });

    assert.equal(result.success, true);
    assert.equal(urls.length, 2);
    assert.equal(urls[0].searchParams.has("_horsee_cache_bust"), false);
    assert.equal(urls[1].searchParams.has("_horsee_cache_bust"), true);
  });

  it("returns a structured stale error rather than silently accepting an old card", async () => {
    let calls = 0;
    const staleText = CURRENT_TEXT.replaceAll("21 AUGUST 2026", "20 AUGUST 2026")
      .replaceAll("21 AOÛT 2026", "20 AOÛT 2026");
    const result = await getSmspariazDailyRacecard({
      now: () => new Date("2026-08-21T04:00:02.000Z"),
      fetchImpl: async () => {
        calls += 1;
        return pdfResponse("2026-08-20");
      },
      extractPdfText: async () => staleText,
    });

    assert.equal(calls, 2);
    assert.equal(result.success, false);
    if (result.success) return;
    assert.equal(result.error_code, "SMSPARIAZ_RACECARD_STALE");
    assert.match(result.error, /2026-08-20/);
  });

  it("uses Mauritius rather than UTC date boundaries", () => {
    assert.equal(getMauritiusDate(new Date("2026-08-20T19:59:59.999Z")), "2026-08-20");
    assert.equal(getMauritiusDate(new Date("2026-08-20T20:00:00.000Z")), "2026-08-21");
  });

  it("returns a clean parse error for a malformed PDF", async () => {
    let parseAttempts = 0;
    const result = await getSmspariazDailyRacecard({
      now: () => new Date("2026-08-21T04:00:02.000Z"),
      fetchImpl: async () => pdfResponse(),
      extractPdfText: async () => {
        parseAttempts += 1;
        throw new Error("invalid cross-reference table");
      },
    });

    assert.equal(parseAttempts, 2);
    assert.equal(result.success, false);
    if (result.success) return;
    assert.equal(result.error_code, "SMSPARIAZ_RACECARD_PARSE_FAILED");
    assert.match(result.error, /invalid cross-reference table/);
  });
});
