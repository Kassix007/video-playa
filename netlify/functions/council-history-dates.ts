import type { Context } from "@netlify/functions";
import { isCouncilHistoryMonth } from "../../server/council-history.js";
import { createCouncilResultStore } from "../../server/council-store.js";
import { MAURITIUS_TIMEZONE } from "../../server/mauritius-time.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";

export default async function handler(request: Request, context: Context): Promise<Response> {
  if (request.method !== "GET") {
    return Response.json({ error: "Method not allowed." }, { status: 405, headers: { Allow: "GET" } });
  }
  const month = new URL(request.url).searchParams.get("month") ?? "";
  if (!isCouncilHistoryMonth(month)) {
    return Response.json(
      { error: "The month query must be a valid YYYY-MM value." },
      { status: 400, headers: { "Cache-Control": "no-store" } },
    );
  }
  const store = createCouncilResultStore(createCouncilRuntimeEnvironment(context));
  const dates = await store.getDateCounts(month);
  return Response.json(
    { month, timezone: MAURITIUS_TIMEZONE, dates },
    { headers: { "Cache-Control": "no-store" } },
  );
}
