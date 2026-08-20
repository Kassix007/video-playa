import { registerAppResource, registerAppTool, RESOURCE_MIME_TYPE } from "@modelcontextprotocol/ext-apps/server";
import { McpServer } from "@modelcontextprotocol/sdk/server/mcp.js";
import { z } from "zod";
import {
  createCouncilAuthChallenge,
  type CouncilWritePolicy,
} from "./council-auth.js";
import { logCouncilSecurityEvent } from "./council-audit.js";
import { isCouncilHistoryDate } from "./council-history.js";
import {
  CouncilRunStatusSchema,
  type CouncilRunStatusStore,
} from "./council-run-status.js";
import { CouncilResultSchema } from "./council-schema.js";
import type { CouncilResultStore } from "./council-store.js";
import {
  getSmspariazDailyRacecard,
  SmspariazRacecardResponseSchema,
} from "./smspariaz-racecard.js";
import { createHorseeWidgetHtml } from "./widget-html.js";

export const HORSEE_SERVER_NAME = "horsee-council";
export const HORSEE_SERVER_VERSION = "1.1.0";
export const HORSEE_WIDGET_URI = "ui://horsee-council/v1.html";
export const HORSEE_PRODUCTION_MCP_RESOURCE = "https://videoplaya.kassinathdoss.dev/mcp";

const WRITE_ENABLED_RUN_OBSERVABILITY_INSTRUCTIONS = `RUN OBSERVABILITY — REQUIRED BEFORE AND DURING EVERY FULL RACE COMMAND:
Before beginning full-race research in a connected session, call check_council_write_access. If it returns an OAuth challenge or error, stop before the long analysis and report that actual error. After access succeeds, immediately call update_council_run_status with the user's exact command, stage RECEIVED, and a current ISO timestamp before doing research.

Keep the same exact command and update the status throughout the run:
1. Set RESOLVING_RACE immediately before race resolution and discovery.
2. Set FACT_LOCK as soon as the facts are locked.
3. Set ANALYSING_RUNNERS immediately before the Council analysts begin.
4. Set MARKET_AUDIT immediately before inspecting odds or market data.
5. Set VERDICT_READY when the complete final verdict and schema-valid CouncilResult are ready.
6. Set SAVING immediately before calling save_council_result.
7. Set SAVED only after save_council_result succeeds.
8. Set FAILED only when an actual terminal error ends the run; include a concise non-sensitive reason in message.

Every status update must include a fresh ISO timestamp. Use message only for a concise progress note, never for a selection or full verdict. Do not silently run for minutes without updating the stage. Status updates are ephemeral observability only and never replace save_council_result.`;

const WRITE_DISABLED_RUN_OBSERVABILITY_INSTRUCTIONS = `HORSEE OAuth diagnostics, run-status updates, and result publishing are not currently configured. check_council_write_access, update_council_run_status, and save_council_result are unavailable; do not attempt to call them or claim that the dashboard or run status was updated. Keep the analysis and final verdict in the ChatGPT conversation.`;

const RACE_RESOLUTION_AND_RESEARCH_INSTRUCTIONS = `For every HORSEE race command, including a short command such as "R2C1 20/08/26 hard", independently resolve the requested date, meeting, and race from current daily racing programmes, then obtain and cross-check the complete racecard before FACT LOCK. The user supplies only the short command; never ask them for the track, runners, race payload, weights, jockeys, or conditions unless exhaustive web research genuinely fails. A fixture calendar proves that a racecourse is scheduled to race; it does not by itself establish the PMU meeting number.

SMSPARIAZ PROGRAMME DISCOVERY — AUTHORITATIVE:
Call get_smspariaz_daily_racecard to decide which races SMSPariaz offers on the current Mauritius day. This server-side tool fetches SMSPariaz directly, rejects stale programmes, and returns every parsed meeting without country filtering. Do not replace its offering list with search results or a third-party racecard. It discovers the programme only; it does not perform Council analysis. Continue to corroborate the selected race's runners and material facts before FACT LOCK as described below.

MANDATORY RACE RESOLUTION — BEFORE FACT LOCK:
1. Resolve the DATE explicitly from the command. Interpret a short date such as 20/08/26 as 20/08/2026 and state the resolved date.
2. Resolve the meeting number (R1, R2, and so on) from a CURRENT DAILY RACING PROGRAMME for that date. Never infer an R-number merely because a racecourse calendar says the track is racing that day.
3. Use this meeting-number source priority:
   A. a current PMU/daily programme source;
   B. a current independent racing programme such as Geny, Zone-Turf, ZEturf, Equidia, OKTurf, OneTurf, Turf-fr, or an equivalent;
   C. France Galop, LeTROT, or the racecourse's official source to corroborate the fixture and race conditions.
4. Require TWO compatible current sources before locking the racecourse, meeting number, and race number. At least one source must be a daily programme capable of mapping the R-number; a fixture calendar alone is not sufficient evidence for that mapping.
5. If sources conflict, continue searching and reconcile the conflict. Do not declare FACT LOCK FAILED after the first conflict, inaccessible page, or poorly indexed result.
6. Search with multiple formulations, including the exact R/C and date (for example "R2C1 20/08/2026"), meeting and course ("R2 Le Lion d'Angers 20 August 2026"), exact race name plus date, racecourse plus off time plus date, and site-specific searches where useful.

RACE RESOLUTION REGRESSION GUARD — 20/08/2026:
R2 must not be inferred as Senonnes merely from a Senonnes fixture calendar. The current PMU programme for that date had R2 = Le Lion-d'Angers and C1 = Prix Cocktail Vision (Prix E. et L. de Tredern), off at 11:21: a 1400m left-handed turf Flat maiden for three-year-olds with seven runners.

RESEARCH PERSISTENCE — AFTER R/C RESOLUTION:
Actively obtain the race name, off time, distance, surface, going, race type/class, restrictions, field size, every declared runner, non-runners, draw, weights, jockey/driver, trainer, official rating or handicap mark when relevant, claims/allowances, shoeing/equipment for trotting, and latest relevant form. Research every runner independently.

If one racecard site is unavailable, do not stop. Try alternative current sources. Make several independent search attempts, including exact race-name/date queries, before treating a material fact as unavailable. When no single page supplies the complete card, assemble it from multiple current sources and cross-check all material facts.

FACT LOCK FAILED is a LAST RESORT. It is allowed only after exhaustive fallback searching when either the meeting/race cannot be reliably identified or a material fact needed to distinguish the runners genuinely remains unresolved. State exactly which sources and search paths were attempted. Never ask the user to supply the racecard unless that web research has genuinely been exhausted.`;

const WRITE_ENABLED_SERVER_INSTRUCTIONS = `COUNCIL WORKFLOW — AFTER SUCCESSFUL FACT LOCK:
1. Analyse EVERY runner blind to odds.
2. Run the Form Analyst.
3. Run the Conditions Analyst.
4. Run the Handicap Analyst.
5. Run the Improvement Analyst.
6. Run the Reliability Analyst.
7. Apply the contradiction gate to the top three.
8. Only then inspect the market and perform the market audit.
9. Produce the COMPLETE mandatory Council verdict.
10. Construct a schema-valid CouncilResult.
11. CALL save_council_result BEFORE ending the response.
12. Do not finish until saving succeeds or an actual save tool error is explicitly reported. Never end after preliminary, discovery, FACT LOCK, or blind analysis.

If save_council_result fails, explicitly report the tool error and do not claim that publishing succeeded. If publishing succeeds, say exactly: "HORSEE dashboard updated."

Use the current ChatGPT conversation context, available web/search and racecard tools, and the user's requested mode. Do not call an OpenAI API from this MCP server. Keep the full analysis in the conversation and save only the structured final result. The complete verdict must include the most likely winner, principal danger, best value horse, final ranking, win probabilities, confidence, strongest reason the selection could lose, and final selection.

Ranking must include every declared runner exactly once, most_likely_winner must exactly match ranking[0], ranking probabilities must total approximately 100%, analysed_at must be an ISO 8601 timestamp, and confidence must be low, medium, or high. The response is incomplete until save_council_result returns success or its tool error has been explicitly reported.`;

const WRITE_DISABLED_SERVER_INSTRUCTIONS = `COUNCIL WORKFLOW — AFTER SUCCESSFUL FACT LOCK:
Analyse EVERY runner blind to odds, then run the Form, Conditions, Handicap, Improvement, and Reliability Analysts. Apply the contradiction gate to the top three. Only then inspect the market, perform the market audit, and produce the COMPLETE mandatory Council verdict. Do not stop after discovery, FACT LOCK, preliminary analysis, or blind analysis.

HORSEE Council result publishing is not currently configured, so save_council_result is not available. Do not attempt to call save_council_result or claim that the dashboard was updated. Keep the full analysis and final verdict in the ChatGPT conversation, including the most likely winner, principal danger, best value horse, final ranking, win probabilities, confidence, strongest reason the selection could lose, and final selection.

Use the current ChatGPT conversation context, available web/search and racecard tools, and the user's requested mode. Do not call an OpenAI API from this MCP server. The HORSEE panel may continue to show the latest previously published result or await its first stored result.`;

export function getHorseeServerInstructions(writePolicy: CouncilWritePolicy): string {
  const observabilityInstructions = writePolicy.enabled
    ? WRITE_ENABLED_RUN_OBSERVABILITY_INSTRUCTIONS
    : WRITE_DISABLED_RUN_OBSERVABILITY_INSTRUCTIONS;
  const publishingInstructions = writePolicy.enabled
    ? WRITE_ENABLED_SERVER_INSTRUCTIONS
    : WRITE_DISABLED_SERVER_INSTRUCTIONS;
  return `${observabilityInstructions}\n\n${RACE_RESOLUTION_AND_RESEARCH_INSTRUCTIONS}\n\n${publishingInstructions}`;
}

const toolAnnotations = {
  readOnlyHint: true,
  destructiveHint: false,
  idempotentHint: true,
  openWorldHint: false,
} as const;

export const SAVE_COUNCIL_RESULT_ANNOTATIONS = {
  readOnlyHint: false,
  destructiveHint: true,
  idempotentHint: false,
  openWorldHint: true,
} as const;

export const CHECK_COUNCIL_WRITE_ACCESS_ANNOTATIONS = {
  readOnlyHint: true,
  destructiveHint: false,
  idempotentHint: true,
  openWorldHint: false,
} as const;

export const UPDATE_COUNCIL_RUN_STATUS_ANNOTATIONS = {
  readOnlyHint: false,
  destructiveHint: false,
  idempotentHint: true,
  openWorldHint: true,
} as const;

export const SMSPARIAZ_RACECARD_ANNOTATIONS = {
  readOnlyHint: true,
  destructiveHint: false,
  idempotentHint: true,
  openWorldHint: true,
} as const;

export type HorseeSecurityScheme =
  | { type: "noauth" }
  | { type: "oauth2"; scopes: string[] };

export function getHorseeToolSecuritySchemes(
  toolName: string,
  writeScope: string,
): HorseeSecurityScheme[] {
  return [
    "check_council_write_access",
    "update_council_run_status",
    "save_council_result",
  ].includes(toolName)
    ? [{ type: "oauth2", scopes: [writeScope] }]
    : [{ type: "noauth" }];
}

function authorizationFailure(
  policy: CouncilWritePolicy,
  authInfo: { scopes: string[]; resource?: URL } | undefined,
): { error: "invalid_token" | "insufficient_scope" | "temporarily_unavailable"; message: string } | null {
  if (!policy.enabled) {
    return {
      error: "temporarily_unavailable",
      message: "Council writes are disabled until the server OAuth configuration is complete.",
    };
  }
  if (!authInfo) {
    return {
      error: "invalid_token",
      message: "Authentication is required to save a Council result.",
    };
  }
  if (!authInfo.scopes.includes(policy.writeScope)) {
    return {
      error: "insufficient_scope",
      message: `The access token does not grant ${policy.writeScope}.`,
    };
  }
  if (policy.resource && authInfo.resource?.href !== policy.resource) {
    return {
      error: "invalid_token",
      message: "The access token was not issued for this HORSEE MCP resource.",
    };
  }
  return null;
}

export function createHorseeMcpServer(
  store: CouncilResultStore,
  statusStore: CouncilRunStatusStore,
  writePolicy: CouncilWritePolicy,
  securityContext: { requestId?: string } = {},
): McpServer {
  const server = new McpServer(
    { name: HORSEE_SERVER_NAME, version: HORSEE_SERVER_VERSION },
    { instructions: getHorseeServerInstructions(writePolicy) },
  );

  registerAppTool(
    server,
    "open_horsee_council",
    {
      title: "Open HORSEE Council",
      description: "Open the interactive HORSEE Horse Racing Council command and results panel.",
      inputSchema: z.object({}).strict(),
      outputSchema: z.object({
        result: CouncilResultSchema.nullable(),
        status: CouncilRunStatusSchema.nullable(),
        storage: z.enum(["netlify-blobs", "local-file"]),
      }).strict(),
      annotations: toolAnnotations,
      _meta: {
        ui: { resourceUri: HORSEE_WIDGET_URI },
        securitySchemes: getHorseeToolSecuritySchemes(
          "open_horsee_council",
          writePolicy.writeScope,
        ),
        "openai/toolInvocation/invoking": "Opening the Council…",
        "openai/toolInvocation/invoked": "Council panel ready",
      },
    },
    async () => {
      const [result, status] = await Promise.all([
        store.getLatest(),
        statusStore.get(),
      ]);
      const output = { result, status, storage: store.kind };
      return {
        content: [{ type: "text", text: output.result ? "HORSEE Council is open with the latest saved result." : "HORSEE Council is open and awaiting its first result." }],
        structuredContent: output,
      };
    },
  );

  if (writePolicy.enabled) {
    server.registerTool(
      "check_council_write_access",
      {
        title: "Check HORSEE Council write access",
        description: "Verify the connected ChatGPT client's HORSEE OAuth write access without publishing a result or changing any storage.",
        inputSchema: z.object({}).strict(),
        outputSchema: z.object({
          authenticated: z.literal(true),
          write_scope: z.literal("horsee:council:write"),
          resource: z.literal(HORSEE_PRODUCTION_MCP_RESOURCE),
        }).strict(),
        annotations: CHECK_COUNCIL_WRITE_ACCESS_ANNOTATIONS,
        _meta: {
          securitySchemes: getHorseeToolSecuritySchemes(
            "check_council_write_access",
            writePolicy.writeScope,
          ),
        },
      },
      async (_input, extra) => {
        const failure = authorizationFailure(writePolicy, extra.authInfo);
        if (failure) {
          return {
            content: [{ type: "text", text: failure.message }],
            _meta: {
              "mcp/www_authenticate": [
                createCouncilAuthChallenge(writePolicy, failure.error, failure.message),
              ],
            },
            isError: true,
          };
        }

        const output = {
          authenticated: true as const,
          write_scope: "horsee:council:write" as const,
          resource: HORSEE_PRODUCTION_MCP_RESOURCE,
        };
        return { content: [], structuredContent: output };
      },
    );

    server.registerTool(
      "update_council_run_status",
      {
        title: "Update HORSEE Council run status",
        description: "Update the current ephemeral HORSEE run stage for progress visibility. This never publishes a selection or changes Council result history.",
        inputSchema: CouncilRunStatusSchema,
        outputSchema: z.object({ status: CouncilRunStatusSchema }).strict(),
        annotations: UPDATE_COUNCIL_RUN_STATUS_ANNOTATIONS,
        _meta: {
          securitySchemes: getHorseeToolSecuritySchemes(
            "update_council_run_status",
            writePolicy.writeScope,
          ),
        },
      },
      async (status, extra) => {
        const failure = authorizationFailure(writePolicy, extra.authInfo);
        if (failure) {
          return {
            content: [{ type: "text", text: failure.message }],
            _meta: {
              "mcp/www_authenticate": [
                createCouncilAuthChallenge(writePolicy, failure.error, failure.message),
              ],
            },
            isError: true,
          };
        }

        await statusStore.set(status);
        const output = { status };
        return {
          content: [{ type: "text", text: `HORSEE run stage updated to ${status.stage}.` }],
          structuredContent: output,
        };
      },
    );

    server.registerTool(
      "save_council_result",
      {
        title: "Save HORSEE Council result",
        description: "Publish the completed HORSEE Horse Racing Council verdict to the publicly visible Equidia Selection Board and retain it in public Council history. This overwrites the current public latest result. Call it after every completed analysis, before the final response. Every field is required; ranking must contain every declared runner exactly once and its probabilities must total approximately 100%.",
        inputSchema: CouncilResultSchema,
        outputSchema: z.object({ saved: z.literal(true), result: CouncilResultSchema }).strict(),
        annotations: SAVE_COUNCIL_RESULT_ANNOTATIONS,
        _meta: {
          securitySchemes: getHorseeToolSecuritySchemes(
            "save_council_result",
            writePolicy.writeScope,
          ),
        },
      },
      async (result, extra) => {
        const failure = authorizationFailure(writePolicy, extra.authInfo);
        if (failure) {
          logCouncilSecurityEvent("council_write_denied", {
            reason: failure.error,
            request_id: securityContext.requestId,
            client_id: extra.authInfo?.clientId.slice(0, 200),
          });
          return {
            content: [{ type: "text", text: failure.message }],
            _meta: {
              "mcp/www_authenticate": [
                createCouncilAuthChallenge(writePolicy, failure.error, failure.message),
              ],
            },
            isError: true,
          };
        }

        const authorizedAuthInfo = extra.authInfo!;
        const actor = {
          clientId: authorizedAuthInfo.clientId,
          subject: typeof authorizedAuthInfo.extra?.subject === "string"
            ? authorizedAuthInfo.extra.subject
            : undefined,
        };
        await store.save(result, actor);
        logCouncilSecurityEvent("council_write_succeeded", {
          request_id: securityContext.requestId,
          client_id: actor.clientId.slice(0, 200),
          race_id: result.race_id,
        });
        const output = { saved: true as const, result };
        return {
          content: [{ type: "text", text: `Council result published for ${result.racecourse} race ${result.race_number}. The public Council panel is updated.` }],
          structuredContent: output,
        };
      },
    );
  }

  server.registerTool(
    "get_smspariaz_daily_racecard",
    {
      title: "Get current SMSPariaz daily racecard",
      description: "Fetch SMSPariaz directly from the HORSEE server, reject stale documents, and return the complete current Mauritius-day race programme in chronological order. This is programme discovery only and performs no Council analysis.",
      inputSchema: z.object({}).strict(),
      outputSchema: SmspariazRacecardResponseSchema,
      annotations: SMSPARIAZ_RACECARD_ANNOTATIONS,
      _meta: {
        securitySchemes: getHorseeToolSecuritySchemes(
          "get_smspariaz_daily_racecard",
          writePolicy.writeScope,
        ),
      },
    },
    async () => {
      const output = await getSmspariazDailyRacecard();
      return {
        content: [{
          type: "text",
          text: output.success
            ? `${output.race_count} current SMSPariaz race${output.race_count === 1 ? "" : "s"} returned across ${output.meeting_count} meeting${output.meeting_count === 1 ? "" : "s"}.`
            : `${output.error_code}: ${output.error}`,
        }],
        structuredContent: output,
        ...(output.success ? {} : { isError: true }),
      };
    },
  );

  server.registerTool(
    "get_latest_council_result",
    {
      title: "Get latest HORSEE Council result",
      description: "Return the latest saved HORSEE Council result, or null when no analysis has been saved.",
      inputSchema: z.object({}).strict(),
      outputSchema: z.object({
        result: CouncilResultSchema.nullable(),
        status: CouncilRunStatusSchema.nullable(),
      }).strict(),
      annotations: toolAnnotations,
      _meta: {
        securitySchemes: getHorseeToolSecuritySchemes(
          "get_latest_council_result",
          writePolicy.writeScope,
        ),
      },
    },
    async () => {
      const [result, status] = await Promise.all([
        store.getLatest(),
        statusStore.get(),
      ]);
      const output = { result, status };
      return {
        content: [{ type: "text", text: output.result ? "Latest HORSEE Council result returned." : "No HORSEE Council result has been saved yet." }],
        structuredContent: output,
      };
    },
  );

  server.registerTool(
    "get_council_history",
    {
      title: "Get HORSEE Council history",
      description: "Return newest-first saved HORSEE Council results, optionally restricted to one Mauritius calendar date. Existing calls with only limit remain supported.",
      inputSchema: z.object({
        limit: z.number().int().min(1).max(100).default(10),
        date: z.string().refine(isCouncilHistoryDate, "Date must be a valid YYYY-MM-DD value.").optional(),
      }).strict(),
      outputSchema: z.object({ results: z.array(CouncilResultSchema) }).strict(),
      annotations: toolAnnotations,
      _meta: {
        securitySchemes: getHorseeToolSecuritySchemes(
          "get_council_history",
          writePolicy.writeScope,
        ),
      },
    },
    async ({ limit, date }) => {
      const results = date
        ? (await store.getByDate(date)).slice(0, limit)
        : await store.getHistory(limit);
      const output = { results };
      return {
        content: [{ type: "text", text: `${output.results.length} HORSEE Council result${output.results.length === 1 ? "" : "s"} returned.` }],
        structuredContent: output,
      };
    },
  );

  registerAppResource(
    server,
    "HORSEE Horse Racing Council",
    HORSEE_WIDGET_URI,
    { description: "Interactive HORSEE Council command input and live selection board." },
    async () => ({
      contents: [{
        uri: HORSEE_WIDGET_URI,
        mimeType: RESOURCE_MIME_TYPE,
        text: createHorseeWidgetHtml(),
        _meta: {
          ui: {
            prefersBorder: true,
            csp: { connectDomains: [], resourceDomains: [] },
          },
        },
      }],
    }),
  );

  return server;
}
