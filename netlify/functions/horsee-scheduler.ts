import type { Config, Context } from "@netlify/functions";
import { createHorseeRuntime } from "../../server/horsee-runtime.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";

export const config: Config = { schedule: "*/5 * * * *" };

export default async function handler(_request: Request, context: Context): Promise<Response> {
  try {
    const runtime = createHorseeRuntime(createCouncilRuntimeEnvironment(context));
    const result = await runtime.runScheduler();
    return Response.json({ status: "COMPLETED", created_jobs: result.created_jobs, ready_jobs: result.ready_jobs });
  } catch (error) {
    console.error(`[HORSEE SCHEDULER] Scheduled invocation failed: ${error instanceof Error ? error.name : "UnknownError"}`);
    return Response.json({ status: "FAILED" }, { status: 503 });
  }
}
