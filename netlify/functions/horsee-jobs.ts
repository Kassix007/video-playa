import type { Context } from "@netlify/functions";
import { authorizeHorseeMutation, horseeErrorResponse } from "../../server/horsee-api-auth.js";
import {
  dispatchHorseeJob,
  HorseeOperationError,
  HorseeStatusTransitionRequestSchema,
  projectHorseeJob,
  publicJobs,
  transitionHorseeJob,
} from "../../server/horsee-operations.js";
import { createHorseeRuntime, type HorseeRuntime } from "../../server/horsee-runtime.js";
import { getMauritiusDate } from "../../server/mauritius-time.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";

type RuntimeFactory = (environment: Readonly<Record<string, string | undefined>>) => HorseeRuntime;
const jsonHeaders = { "Cache-Control": "no-store" };

function operationFailure(error: unknown): Response {
  if (error instanceof HorseeOperationError) return horseeErrorResponse(error.status, error.code, error.message);
  return horseeErrorResponse(503, "jobs_unavailable", "HORSEE jobs are temporarily unavailable.");
}

async function parseStrictJson(request: Request): Promise<unknown> {
  const text = await request.text();
  if (!text.trim()) throw new HorseeOperationError("body_required", 400, "A JSON request body is required.");
  try { return JSON.parse(text) as unknown; }
  catch { throw new HorseeOperationError("invalid_json", 400, "The request body must be valid JSON."); }
}

function mutationRoute(pathname: string): { id: string; action: "dispatch" | "status" } | null {
  const match = /\/api\/horsee\/jobs\/(.+)\/(dispatch|status)\/?$/.exec(pathname);
  if (!match) return null;
  try { return { id: decodeURIComponent(match[1]), action: match[2] as "dispatch" | "status" }; }
  catch { return null; }
}

export function createHorseeJobsHandler(createRuntime: RuntimeFactory = createHorseeRuntime) {
  return async (request: Request, context: Context): Promise<Response> => {
    const environment = createCouncilRuntimeEnvironment(context);
    let runtime: HorseeRuntime;
    try { runtime = createRuntime(environment); }
    catch { return horseeErrorResponse(422, "invalid_configuration", "HORSEE configuration is invalid."); }
    const pathname = new URL(request.url).pathname.replace(/\/+$/, "");
    const date = getMauritiusDate(new Date());

    for (const route of ["today", "ready", "next"] as const) {
      if (!pathname.endsWith(`/jobs/${route}`)) continue;
      if (request.method !== "GET") return horseeErrorResponse(405, "method_not_allowed", `Jobs ${route} requires GET.`);
      try {
        const queue = (await runtime.jobStore.getQueue(date)).value;
        const jobs = publicJobs(queue);
        if (route === "today") return Response.json({ programme_date: date, timezone: "Indian/Mauritius", count: jobs.length, jobs }, { headers: jsonHeaders });
        if (route === "ready") {
          const ready = jobs.filter((job) => job.status === "READY" && job.prompt);
          return Response.json({ programme_date: date, timezone: "Indian/Mauritius", count: ready.length, jobs: ready }, { headers: jsonHeaders });
        }
        const next = jobs.find((job) => !["SAVED", "MISSED"].includes(job.status)) ?? null;
        return Response.json({ programme_date: date, timezone: "Indian/Mauritius", job: next }, { headers: jsonHeaders });
      } catch (error) { return operationFailure(error); }
    }

    const route = mutationRoute(new URL(request.url).pathname);
    if (!route) return horseeErrorResponse(404, "route_not_found", "Unknown HORSEE job route.");
    if (request.method !== "POST") return horseeErrorResponse(405, "method_not_allowed", "Job mutations require POST.");
    const authorization = await authorizeHorseeMutation(request, runtime.config, environment);
    if (!authorization.authorized) return authorization.response;

    try {
      if (route.action === "dispatch") {
        if ((await request.text()).trim()) throw new HorseeOperationError("unexpected_body", 400, "Dispatch does not accept a request body.");
        const result = await dispatchHorseeJob({ jobStore: runtime.jobStore, dispatcher: runtime.dispatcher, id: route.id });
        return Response.json({
          job_id: result.job.id,
          accepted: result.accepted,
          provider: result.provider,
          status: result.job.status,
          ...(result.accepted ? {} : { message: result.message }),
        }, { headers: jsonHeaders });
      }
      const parsed = HorseeStatusTransitionRequestSchema.safeParse(await parseStrictJson(request));
      if (!parsed.success) throw new HorseeOperationError("invalid_status_body", 400, parsed.error.issues[0]?.message ?? "Status body is invalid.");
      const job = await transitionHorseeJob({
        jobStore: runtime.jobStore,
        resultStore: runtime.councilStore,
        id: route.id,
        target: parsed.data.status,
        error: parsed.data.error,
      });
      return Response.json({ job: projectHorseeJob(job) }, { headers: jsonHeaders });
    } catch (error) { return operationFailure(error); }
  };
}

export default createHorseeJobsHandler();
