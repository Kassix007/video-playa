import type { Context } from "@netlify/functions";
import { z } from "zod";
import { authorizeHorseeMutation, horseeErrorResponse } from "../../server/horsee-api-auth.js";
import { getHorseeSchedulerSnapshot } from "../../server/horsee-operations.js";
import { createHorseeRuntime, type HorseeRuntime } from "../../server/horsee-runtime.js";
import { HorseeSchedulerBusyError, HorseeSchedulerError } from "../../server/horsee-scheduler.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";

type RuntimeFactory = (environment: Readonly<Record<string, string | undefined>>) => HorseeRuntime;

const jsonHeaders = { "Cache-Control": "no-store" };

function schedulerFailure(error: unknown): Response {
  if (error instanceof HorseeSchedulerBusyError) {
    return horseeErrorResponse(409, "scheduler_busy", "Another scheduler invocation is already running.");
  }
  if (error instanceof HorseeSchedulerError) {
    const status = error.code === "SCHEDULER_STATE_CONFLICT" || error.code === "QUEUE_CONFLICT" ? 409
      : error.code.includes("STALE") || error.code.includes("DATE_MISMATCH") ? 422
        : 503;
    return horseeErrorResponse(status, error.code.toLowerCase(), error.message);
  }
  if (error instanceof z.ZodError) return horseeErrorResponse(422, "invalid_configuration", error.issues[0]?.message ?? "Configuration is invalid.");
  return horseeErrorResponse(503, "scheduler_unavailable", "The scheduler could not complete this invocation.");
}

export function createHorseeSchedulerApiHandler(createRuntime: RuntimeFactory = createHorseeRuntime) {
  return async (request: Request, context: Context): Promise<Response> => {
    const environment = createCouncilRuntimeEnvironment(context);
    let runtime: HorseeRuntime;
    try { runtime = createRuntime(environment); }
    catch (error) { return schedulerFailure(error); }
    const pathname = new URL(request.url).pathname.replace(/\/+$/, "");

    if (pathname.endsWith("/status")) {
      if (request.method !== "GET") return horseeErrorResponse(405, "method_not_allowed", "Scheduler status requires GET.");
      try {
        return Response.json(await getHorseeSchedulerSnapshot({ jobStore: runtime.jobStore, archive: runtime.archive }), { headers: jsonHeaders });
      } catch {
        return horseeErrorResponse(503, "status_unavailable", "Scheduler status is temporarily unavailable.");
      }
    }

    if (!pathname.endsWith("/run")) return horseeErrorResponse(404, "route_not_found", "Unknown scheduler route.");
    if (request.method !== "POST") return horseeErrorResponse(405, "method_not_allowed", "Scheduler run requires POST.");
    const authorization = await authorizeHorseeMutation(request, runtime.config, environment);
    if (!authorization.authorized) return authorization.response;
    if ((await request.text()).trim()) return horseeErrorResponse(400, "unexpected_body", "Scheduler run does not accept a request body.");

    try {
      const result = await runtime.runScheduler();
      const snapshot = await getHorseeSchedulerSnapshot({ jobStore: runtime.jobStore, archive: runtime.archive });
      return Response.json({
        ...snapshot,
        run: {
          status: "COMPLETED",
          created_jobs: result.created_jobs,
          ready_jobs: result.ready_jobs,
          recovered_jobs: result.recovery_jobs,
          saved_jobs: result.saved_jobs,
          missed_jobs: result.missed_jobs,
        },
      }, { headers: jsonHeaders });
    } catch (error) {
      return schedulerFailure(error);
    }
  };
}

export default createHorseeSchedulerApiHandler();
