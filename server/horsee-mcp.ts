import { registerAppResource, registerAppTool, RESOURCE_MIME_TYPE } from "@modelcontextprotocol/ext-apps/server";
import { McpServer } from "@modelcontextprotocol/sdk/server/mcp.js";
import { z } from "zod";
import {
  createCouncilAuthChallenge,
  type CouncilWritePolicy,
} from "./council-auth.js";
import { logCouncilSecurityEvent } from "./council-audit.js";
import { CouncilResultSchema } from "./council-schema.js";
import type { CouncilResultStore } from "./council-store.js";
import { createHorseeWidgetHtml } from "./widget-html.js";

export const HORSEE_SERVER_NAME = "horsee-council";
export const HORSEE_SERVER_VERSION = "1.0.0";
export const HORSEE_WIDGET_URI = "ui://horsee-council/v1.html";

const WRITE_ENABLED_SERVER_INSTRUCTIONS = `When the user submits a race command from HORSEE, perform the complete Horse Racing Council analysis in the conversation. After the final Council verdict is complete, call save_council_result with the structured verdict.

Use the current ChatGPT conversation context, any available racecard or browsing tools, and the user's requested mode. Do not call an OpenAI API from this MCP server. Keep the full analysis in the conversation and save only the structured final result. Ranking must include every declared runner exactly once, most_likely_winner must exactly match ranking[0], ranking probabilities must total approximately 100%, analysed_at must be an ISO 8601 timestamp, and confidence must be low, medium, or high. After saving, present the final result and tell the user the Council panel has been updated.`;

const WRITE_DISABLED_SERVER_INSTRUCTIONS = `When the user submits a race command from HORSEE, perform the complete Horse Racing Council analysis in the ChatGPT conversation. HORSEE Council result publishing is not currently configured. Do not attempt to call save_council_result.

Use the current ChatGPT conversation context, any available racecard or browsing tools, and the user's requested mode. Do not call an OpenAI API from this MCP server. Keep the full analysis and final Council verdict in the conversation. The HORSEE panel may continue to show the latest previously published result or await its first stored result.`;

export function getHorseeServerInstructions(writePolicy: CouncilWritePolicy): string {
  return writePolicy.enabled
    ? WRITE_ENABLED_SERVER_INSTRUCTIONS
    : WRITE_DISABLED_SERVER_INSTRUCTIONS;
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

export type HorseeSecurityScheme =
  | { type: "noauth" }
  | { type: "oauth2"; scopes: string[] };

export function getHorseeToolSecuritySchemes(
  toolName: string,
  writeScope: string,
): HorseeSecurityScheme[] {
  return toolName === "save_council_result"
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
      const output = { result: await store.getLatest(), storage: store.kind };
      return {
        content: [{ type: "text", text: output.result ? "HORSEE Council is open with the latest saved result." : "HORSEE Council is open and awaiting its first result." }],
        structuredContent: output,
      };
    },
  );

  if (writePolicy.enabled) {
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
    "get_latest_council_result",
    {
      title: "Get latest HORSEE Council result",
      description: "Return the latest saved HORSEE Council result, or null when no analysis has been saved.",
      inputSchema: z.object({}).strict(),
      outputSchema: z.object({ result: CouncilResultSchema.nullable() }).strict(),
      annotations: toolAnnotations,
      _meta: {
        securitySchemes: getHorseeToolSecuritySchemes(
          "get_latest_council_result",
          writePolicy.writeScope,
        ),
      },
    },
    async () => {
      const output = { result: await store.getLatest() };
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
      description: "Return a small newest-first history of saved HORSEE Council results.",
      inputSchema: z.object({ limit: z.number().int().min(1).max(50).default(10) }).strict(),
      outputSchema: z.object({ results: z.array(CouncilResultSchema) }).strict(),
      annotations: toolAnnotations,
      _meta: {
        securitySchemes: getHorseeToolSecuritySchemes(
          "get_council_history",
          writePolicy.writeScope,
        ),
      },
    },
    async ({ limit }) => {
      const output = { results: await store.getHistory(limit) };
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
