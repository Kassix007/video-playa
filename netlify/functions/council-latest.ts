import type { Context } from "@netlify/functions";
import { createCouncilResultStore } from "../../server/council-store.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";

export default async function handler(_request: Request, context: Context): Promise<Response> {
  const store = createCouncilResultStore(createCouncilRuntimeEnvironment(context));
  return Response.json(
    { result: await store.getLatest() },
    { headers: { "Cache-Control": "no-store" } },
  );
}
