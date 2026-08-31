import type { Config, Context } from "@netlify/functions";
import { createHorseeRuntime } from "../../server/horsee-runtime.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";

// 22:30 UTC is 02:30 the following day in Mauritius (UTC+4).
export const config: Config = { schedule: "30 22 * * *" };

export default async function handler(_request: Request, context: Context): Promise<Response> {
  try {
    const runtime = createHorseeRuntime(createCouncilRuntimeEnvironment(context));
    const archived = await runtime.archive.archiveExpiredHotDays();
    const cleanup = await runtime.archive.cleanupExpiredHotData();
    return Response.json({ status: "COMPLETED", archived, cleanup });
  } catch (error) {
    console.error(`[HORSEE ARCHIVE] Scheduled invocation failed: ${error instanceof Error ? error.name : "UnknownError"}`);
    return Response.json({ status: "FAILED" }, { status: 503 });
  }
}
