import type { Context } from "@netlify/functions";
import { isCouncilHistoryDate } from "../../server/council-history.js";
import { createCouncilResultStore } from "../../server/council-store.js";
import { MAURITIUS_TIMEZONE } from "../../server/mauritius-time.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";

export default async function handler(request: Request, context: Context): Promise<Response> {
  if (request.method !== "GET") {
    return Response.json({ error: "Method not allowed." }, { status: 405, headers: { Allow: "GET" } });
  }
  const date = new URL(request.url).searchParams.get("date") ?? "";
  if (!isCouncilHistoryDate(date)) {
    return Response.json(
      { error: "The date query must be a valid YYYY-MM-DD value." },
      { status: 400, headers: { "Cache-Control": "no-store" } },
    );
  }
  const store = createCouncilResultStore(createCouncilRuntimeEnvironment(context));
  const results = await store.getByDate(date);
  return Response.json(
    { date, timezone: MAURITIUS_TIMEZONE, count: results.length, results },
    { headers: { "Cache-Control": "no-store" } },
  );
}
