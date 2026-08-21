import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { McpServer } from "@modelcontextprotocol/sdk/server/mcp.js";
import { z } from "zod";
import {
  extractTextFromPdf,
  getMauritiusDate,
  getSmspariazDailyRacecard,
  parseSmspariazRacecardText,
  SMSPARIAZ_RACECARD_SOURCE,
  SmspariazRacecardResponseSchema,
} from "./smspariaz-racecard.js";
import { MAURITIUS_TIMEZONE } from "./mauritius-time.js";

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

function createTextPdf(text: string): Uint8Array {
  const stream = `BT /F1 12 Tf 72 720 Td (${text}) Tj ET`;
  const objects = [
    "<< /Type /Catalog /Pages 2 0 R >>",
    "<< /Type /Pages /Kids [3 0 R] /Count 1 >>",
    "<< /Type /Page /Parent 2 0 R /MediaBox [0 0 612 792] /Resources << /Font << /F1 4 0 R >> >> /Contents 5 0 R >>",
    "<< /Type /Font /Subtype /Type1 /BaseFont /Helvetica >>",
    `<< /Length ${Buffer.byteLength(stream)} >>\nstream\n${stream}\nendstream`,
  ];
  let pdf = "%PDF-1.4\n";
  const offsets = [0];
  objects.forEach((object, index) => {
    offsets.push(Buffer.byteLength(pdf));
    pdf += `${index + 1} 0 obj\n${object}\nendobj\n`;
  });
  const xrefOffset = Buffer.byteLength(pdf);
  pdf += `xref\n0 ${objects.length + 1}\n0000000000 65535 f \n`;
  pdf += offsets.slice(1)
    .map((offset) => `${String(offset).padStart(10, "0")} 00000 n \n`)
    .join("");
  pdf += `trailer\n<< /Size ${objects.length + 1} /Root 1 0 R >>\nstartxref\n${xrefOffset}\n%%EOF\n`;
  return new Uint8Array(Buffer.from(pdf, "ascii"));
}

describe("SMSPariaz daily racecard", () => {
  it("loads the Node PDF runtime lazily and extracts text without browser globals", async () => {
    const runtime = globalThis as unknown as Record<string, unknown>;
    const keys = ["DOMMatrix", "ImageData", "Path2D"] as const;
    const previous = Object.fromEntries(keys.map((key) => [key, runtime[key]]));
    keys.forEach((key) => delete runtime[key]);

    try {
      const text = await extractTextFromPdf(createTextPdf("HORSEE RACECARD"));
      assert.match(text, /HORSEE RACECARD/);
      keys.forEach((key) => assert.equal(typeof runtime[key], "function"));
    } finally {
      keys.forEach((key) => {
        if (previous[key] === undefined) delete runtime[key];
        else runtime[key] = previous[key];
      });
    }
  });

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

describe("SMSPariaz racecard MCP output schema", () => {
  const successOutput = {
    success: true as const,
    programme_date: "2026-08-21",
    timezone: MAURITIUS_TIMEZONE,
    fetched_at: "2026-08-21T08:00:00+04:00",
    source: SMSPARIAZ_RACECARD_SOURCE,
    meeting_count: 1,
    race_count: 1,
    french_race_count: 1,
    meetings: [{
      meeting_number: 2,
      racecourse: "Longchamp",
      country: "France",
      race_count: 1,
      race_ids: ["R2C1"],
    }],
    races: [{
      race_id: "R2C1",
      meeting_number: 2,
      race_number: 1,
      racecourse: "Longchamp",
      off_time: "14:30",
      off_time_mauritius: "14:30",
      country: "France",
    }],
  };
  const failureOutput = {
    success: false as const,
    programme_date: "2026-08-21",
    timezone: MAURITIUS_TIMEZONE,
    fetched_at: "2026-08-21T08:00:00+04:00",
    source: SMSPARIAZ_RACECARD_SOURCE,
    error_code: "SMSPARIAZ_RACECARD_STALE" as const,
    error: "Expected the Mauritius programme for 2026-08-21, but SMSPariaz returned 2026-08-10.",
  };

  function callTool(structuredContent: unknown, isError: boolean) {
    const server = new McpServer({ name: "racecard-schema-test", version: "1.0.0" });
    server.registerTool(
      "get_smspariaz_daily_racecard",
      {
        title: "Get current SMSPariaz daily racecard",
        description: "Regression fixture for the racecard output schema.",
        inputSchema: z.object({}).strict(),
        outputSchema: SmspariazRacecardResponseSchema,
      },
      async () => ({
        content: [{ type: "text" as const, text: "fixture" }],
        structuredContent: structuredContent as Record<string, unknown>,
        ...(isError ? { isError: true } : {}),
      }),
    );
    const handler = (server.server as unknown as {
      _requestHandlers: Map<string, (request: unknown, extra: unknown) => Promise<unknown>>;
    })._requestHandlers.get("tools/call")!;
    return handler(
      { method: "tools/call", params: { name: "get_smspariaz_daily_racecard", arguments: {} } },
      { signal: new AbortController().signal, requestId: 1, sendNotification: async () => {}, sendRequest: async () => {} },
    ) as Promise<{ isError?: boolean; content: Array<{ type: string; text: string }>; structuredContent?: unknown }>;
  }

  it("validates a successful programme through the tools/call path without a _zod crash", async () => {
    const result = await callTool(successOutput, false);
    assert.notEqual(result.isError, true);
    assert.deepEqual(result.structuredContent, successOutput);
    for (const item of result.content) {
      assert.doesNotMatch(item.text, /_zod/);
    }
  });

  it("passes a structured failure result through untouched", async () => {
    const result = await callTool(failureOutput, true);
    assert.equal(result.isError, true);
    for (const item of result.content) {
      assert.doesNotMatch(item.text, /_zod/);
    }
  });

  it("rejects a success payload missing required programme fields", async () => {
    const { races: _races, ...withoutRaces } = successOutput;
    const result = await callTool(withoutRaces, false);
    assert.equal(result.isError, true);
    assert.match(result.content[0].text, /Output validation error/);
    assert.doesNotMatch(result.content[0].text, /_zod/);
  });

  it("accepts both discriminated branches at the schema level", () => {
    assert.equal(SmspariazRacecardResponseSchema.safeParse(successOutput).success, true);
    assert.equal(SmspariazRacecardResponseSchema.safeParse(failureOutput).success, true);
    assert.equal(
      SmspariazRacecardResponseSchema.safeParse({ ...failureOutput, races: [] }).success,
      false,
    );
  });
});
