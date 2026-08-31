import type { Context } from "@netlify/functions";
import { createArchiveAwareCouncilResultStore } from "../../server/council-archive-runtime.js";
import { getMauritiusDate, MAURITIUS_TIMEZONE } from "../../server/mauritius-time.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";

export default async function handler(request: Request, context: Context): Promise<Response> {
  if (request.method !== "GET") {
    return Response.json({ error: "Method not allowed." }, { status: 405, headers: { Allow: "GET" } });
  }
  const date = getMauritiusDate(new Date());
  const store = createArchiveAwareCouncilResultStore(createCouncilRuntimeEnvironment(context));
  const results = await store.getByDate(date);
  return Response.json(
    { date, timezone: MAURITIUS_TIMEZONE, count: results.length, results },
    { headers: { "Cache-Control": "no-store" } },
  );
}
