import type { Context } from "@netlify/functions";
import { z } from "zod";
import { authorizeHorseeMutation, horseeErrorResponse } from "../../server/horsee-api-auth.js";
import { GitHubArchiveError } from "../../server/github-archive-client.js";
import { HorseeArchiveError } from "../../server/horsee-archive.js";
import { createHorseeRuntime, type HorseeRuntime } from "../../server/horsee-runtime.js";
import { getMauritiusDate } from "../../server/mauritius-time.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";

type RuntimeFactory = (environment: Readonly<Record<string, string | undefined>>) => HorseeRuntime;
const ArchiveRunBodySchema = z.object({ date: z.string().regex(/^\d{4}-\d{2}-\d{2}$/).optional() }).strict();
const jsonHeaders = { "Cache-Control": "no-store" };

function archiveFailure(error: unknown): Response {
  if (error instanceof HorseeArchiveError) {
    const status = error.code === "INVALID_JSON" || error.code === "INVALID_BODY" ? 400
      : error.code.includes("NOT_FOUND") ? 404
      : error.code.includes("BUSY") || error.code.includes("CONFLICT") ? 409
        : error.code.includes("NOT_CONFIGURED") || error.code.includes("MISMATCH") ? 422
          : 503;
    return horseeErrorResponse(status, error.code.toLowerCase(), error.message);
  }
  if (error instanceof GitHubArchiveError) {
    const status = error.code === "GITHUB_CONFLICT" ? 409
      : error.code === "GITHUB_VALIDATION_FAILED" ? 422
        : 503;
    return horseeErrorResponse(status, error.code.toLowerCase(), error.message);
  }
  if (error instanceof z.ZodError) return horseeErrorResponse(422, "invalid_configuration", error.issues[0]?.message ?? "Configuration is invalid.");
  return horseeErrorResponse(503, "archive_unavailable", "The archive operation could not be completed.");
}

async function parseOptionalBody(request: Request) {
  const text = await request.text();
  if (!text.trim()) return {};
  try { return ArchiveRunBodySchema.parse(JSON.parse(text) as unknown); }
  catch (error) {
    if (error instanceof SyntaxError) throw new HorseeArchiveError("INVALID_JSON", "The request body must be valid JSON.");
    if (error instanceof z.ZodError) {
      throw new HorseeArchiveError("INVALID_BODY", error.issues[0]?.message ?? "The request body is invalid.");
    }
    throw error;
  }
}

export function createHorseeArchiveApiHandler(createRuntime: RuntimeFactory = createHorseeRuntime) {
  return async (request: Request, context: Context): Promise<Response> => {
    const environment = createCouncilRuntimeEnvironment(context);
    let runtime: HorseeRuntime;
    try { runtime = createRuntime(environment); }
    catch (error) { return archiveFailure(error); }
    const pathname = new URL(request.url).pathname.replace(/\/+$/, "");

    if (pathname.endsWith("/status")) {
      if (request.method !== "GET") return horseeErrorResponse(405, "method_not_allowed", "Archive status requires GET.");
      try { return Response.json(await runtime.archive.getArchiveHealth(), { headers: jsonHeaders }); }
      catch { return horseeErrorResponse(503, "archive_status_unavailable", "Archive status is temporarily unavailable."); }
    }

    if (!pathname.endsWith("/run") && !pathname.endsWith("/cleanup")) {
      return horseeErrorResponse(404, "route_not_found", "Unknown archive route.");
    }
    if (request.method !== "POST") return horseeErrorResponse(405, "method_not_allowed", "Archive mutations require POST.");
    const authorization = await authorizeHorseeMutation(request, runtime.config, environment);
    if (!authorization.authorized) return authorization.response;

    try {
      if (pathname.endsWith("/cleanup")) {
        if ((await request.text()).trim()) return horseeErrorResponse(400, "unexpected_body", "Archive cleanup does not accept a request body.");
        return Response.json(await runtime.archive.cleanupExpiredHotData(), { headers: jsonHeaders });
      }
      const body = await parseOptionalBody(request);
      if (body.date) {
        if (body.date >= getMauritiusDate(new Date())) {
          return horseeErrorResponse(422, "date_not_completed", "Only a completed Mauritius programme date can be archived.");
        }
        return Response.json(await runtime.archive.archiveDay(body.date), { headers: jsonHeaders });
      }
      return Response.json({ outcomes: await runtime.archive.archiveExpiredHotDays() }, { headers: jsonHeaders });
    } catch (error) { return archiveFailure(error); }
  };
}

export default createHorseeArchiveApiHandler();
