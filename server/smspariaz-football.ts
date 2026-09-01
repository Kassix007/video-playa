import { z } from "zod";
import type { SmspariazObservability } from "./smspariaz-observability.js";
import { AUDITED_SMSPARIAZ_FLOW } from "./test-fixtures/smspariaz/flow-fixtures.js";

export const SmsfootballSelectionSchema = z.object({
  selection_id: z.string(),
  selection_code: z.string(),
  selection: z.string(),
  odds: z.number().positive().nullable(),
  status: z.enum(["OPEN", "UNAVAILABLE"]),
  open: z.boolean(),
}).strict();

export const SmsfootballMarketSchema = z.object({
  market_id: z.string(),
  market: z.string(),
  bet_code: z.string(),
  status: z.enum(["OPEN", "CLOSED"]),
  open: z.boolean(),
  selections: z.array(SmsfootballSelectionSchema),
}).strict();

export const SmsfootballEventSchema = z.object({
  event_id: z.string(),
  bet_code: z.string(),
  kickoff: z.string(),
  country: z.string(),
  league: z.string(),
  home: z.string(),
  away: z.string(),
  status: z.enum(["OPEN", "CLOSED"]),
  open: z.boolean(),
  markets: z.array(SmsfootballMarketSchema),
}).strict();

export const SmsfootballProgrammeSchema = z.object({
  programme_date: z.string().regex(/^\d{4}-\d{2}-\d{2}$/),
  timezone: z.literal("Indian/Mauritius"),
  provider_updated_at: z.string(),
  events: z.array(SmsfootballEventSchema),
}).strict();

export type SmsfootballSelection = z.infer<typeof SmsfootballSelectionSchema>;
export type SmsfootballMarket = z.infer<typeof SmsfootballMarketSchema>;
export type SmsfootballEvent = z.infer<typeof SmsfootballEventSchema>;
export type SmsfootballProgramme = z.infer<typeof SmsfootballProgrammeSchema>;

function objectValue(value: unknown): Record<string, unknown> | null {
  return value !== null && typeof value === "object" && !Array.isArray(value)
    ? value as Record<string, unknown>
    : null;
}

function stringValue(value: unknown): string {
  return typeof value === "string" || typeof value === "number" ? String(value) : "";
}

function recordOfStrings(value: unknown): Record<string, string> {
  const object = objectValue(value);
  if (!object) return {};
  return Object.fromEntries(Object.entries(object).flatMap(([key, item]) =>
    typeof item === "string" || typeof item === "number" ? [[key, String(item)]] : []));
}

function parseSelection(raw: unknown, selectionCode: string, name: string): SmsfootballSelection {
  const parts = typeof raw === "string" ? raw.split(",") : [];
  const selectionId = parts.length === 2 && /^\d+$/.test(parts[0] ?? "") ? parts[0]! : "";
  const oddsHundredths = parts.length === 2 && /^\d+$/.test(parts[1] ?? "") ? Number(parts[1]) : NaN;
  const odds = Number.isFinite(oddsHundredths) && oddsHundredths > 0 ? oddsHundredths / 100 : null;
  return {
    selection_id: selectionId,
    selection_code: selectionCode,
    selection: name || selectionCode,
    odds,
    status: selectionId && odds ? "OPEN" : "UNAVAILABLE",
    open: Boolean(selectionId && odds),
  };
}

function kickoff(date: string, time: string): string {
  if (!/^\d{4}-\d{2}-\d{2}$/.test(date) || !/^\d{2}:\d{2}$/.test(time)) return "";
  return `${date}T${time}:00+04:00`;
}

export function parseSmsfootballProgramme(metadataValue: unknown, fragmentValues: unknown[]): SmsfootballProgramme {
  const metadata = objectValue(metadataValue);
  if (!metadata) throw new Error("PROVIDER_UNAVAILABLE");
  const programmeDate = stringValue(metadata.nextdate);
  if (!/^\d{4}-\d{2}-\d{2}$/.test(programmeDate)) throw new Error("PROVIDER_UNAVAILABLE");
  const marketNames = recordOfStrings(metadata.markets);
  const selectionNames = recordOfStrings(metadata.selections);
  const events: SmsfootballEvent[] = [];

  for (const fragmentValue of fragmentValues) {
    const fragment = objectValue(fragmentValue);
    if (!fragment) continue;
    for (const countryValue of Object.values(fragment)) {
      const country = objectValue(countryValue);
      if (!country || !Array.isArray(country.league)) continue;
      for (const leagueValue of country.league) {
        const league = objectValue(leagueValue);
        if (!league || !Array.isArray(league.match)) continue;
        for (const matchValue of league.match) {
          const match = objectValue(matchValue);
          const rawMarkets = objectValue(match?.market);
          if (!match || !rawMarkets) continue;
          const markets: SmsfootballMarket[] = [];
          for (const [marketId, marketValue] of Object.entries(rawMarkets)) {
            const rawMarket = objectValue(marketValue);
            const rawSelections = objectValue(rawMarket?.s);
            if (!rawMarket || !rawSelections) continue;
            const selections = Object.entries(rawSelections).map(([selectionCode, raw]) =>
              parseSelection(raw, selectionCode, selectionNames[selectionCode] ?? selectionCode));
            const open = selections.some((selection) => selection.open);
            markets.push({
              market_id: marketId,
              market: marketNames[marketId] ?? marketId,
              bet_code: stringValue(rawMarket[marketId]),
              status: open ? "OPEN" : "CLOSED",
              open,
              selections,
            });
          }
          const open = markets.some((market) => market.open);
          const event = {
            event_id: stringValue(match.i),
            bet_code: stringValue(match.c),
            kickoff: kickoff(programmeDate, stringValue(match.t)),
            country: stringValue(country.name),
            league: stringValue(league.name),
            home: stringValue(match.home),
            away: stringValue(match.away),
            status: open ? "OPEN" as const : "CLOSED" as const,
            open,
            markets,
          };
          if (event.event_id && event.home && event.away) events.push(event);
        }
      }
    }
  }

  return SmsfootballProgrammeSchema.parse({
    programme_date: programmeDate,
    timezone: "Indian/Mauritius",
    provider_updated_at: stringValue(metadata.lu),
    events,
  });
}

interface TextProvider { getText(path: string): Promise<string> }

export class SmspariazFootballClient {
  constructor(private readonly provider: TextProvider, private readonly telemetry?: SmspariazObservability) {}
  async getProgramme(): Promise<SmsfootballProgramme> {
    try {
      const metadataText = await this.provider.getText(AUDITED_SMSPARIAZ_FLOW.paths.metadata);
      const metadata = JSON.parse(metadataText) as unknown;
      const count = Number(objectValue(metadata)?.nf);
      if (!Number.isInteger(count) || count < 1 || count > 100) throw new Error("Invalid fragment count");
      const fragmentTexts = await Promise.all(Array.from({ length: count }, (_, index) =>
        this.provider.getText(`${AUDITED_SMSPARIAZ_FLOW.paths.cachePrefix}${index + 1}`)));
      const programme = parseSmsfootballProgramme(metadata, fragmentTexts.map((value) => JSON.parse(value) as unknown));
      this.telemetry?.emit("programme_retrieved", { event_count: programme.events.length });
      return programme;
    } catch {
      this.telemetry?.emit("programme_failed", { error_code: "PROVIDER_UNAVAILABLE", retryable: true });
      throw new Error("PROVIDER_UNAVAILABLE");
    }
  }
}
