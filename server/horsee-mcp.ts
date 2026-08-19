import { registerAppResource, registerAppTool, RESOURCE_MIME_TYPE } from "@modelcontextprotocol/ext-apps/server";
import { McpServer } from "@modelcontextprotocol/sdk/server/mcp.js";
import { z } from "zod";
import { CouncilResultSchema } from "./council-schema.js";
import type { CouncilResultStore } from "./council-store.js";
import { createHorseeWidgetHtml } from "./widget-html.js";

export const HORSEE_SERVER_NAME = "horsee-council";
export const HORSEE_SERVER_VERSION = "1.0.0";
export const HORSEE_WIDGET_URI = "ui://horsee-council/v1.html";

const SERVER_INSTRUCTIONS = `When the user submits a race command from HORSEE, perform the complete Horse Racing Council analysis in the conversation. After the final Council verdict is complete, call save_council_result with the structured verdict.

Use the current ChatGPT conversation context, any available racecard or browsing tools, and the user's requested mode. Do not call an OpenAI API from this MCP server. Keep the full analysis in the conversation and save only the structured final result. Ranking must be ordered, every probability must be numeric from 0 to 100, analysed_at must be an ISO 8601 timestamp, and confidence must be low, medium, or high. After saving, present the final result and tell the user the Council panel has been updated.`;

const toolAnnotations = {
  readOnlyHint: true,
  destructiveHint: false,
  idempotentHint: true,
  openWorldHint: false,
} as const;

export function createHorseeMcpServer(store: CouncilResultStore): McpServer {
  const server = new McpServer(
    { name: HORSEE_SERVER_NAME, version: HORSEE_SERVER_VERSION },
    { instructions: SERVER_INSTRUCTIONS },
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

  server.registerTool(
    "save_council_result",
    {
      title: "Save HORSEE Council result",
      description: "Save the completed HORSEE Horse Racing Council analysis. Call this after every completed analysis, before giving the final response to the user. Every field is required; ranking is ordered and every horse probability is a numeric percentage from 0 to 100.",
      inputSchema: CouncilResultSchema,
      outputSchema: z.object({ saved: z.literal(true), result: CouncilResultSchema }).strict(),
      annotations: {
        readOnlyHint: false,
        destructiveHint: false,
        idempotentHint: false,
        openWorldHint: false,
      },
    },
    async (result) => {
      await store.save(result);
      const output = { saved: true as const, result };
      return {
        content: [{ type: "text", text: `Council result saved for ${result.racecourse} race ${result.race_number}. The Council panel is updated.` }],
        structuredContent: output,
      };
    },
  );

  server.registerTool(
    "get_latest_council_result",
    {
      title: "Get latest HORSEE Council result",
      description: "Return the latest saved HORSEE Council result, or null when no analysis has been saved.",
      inputSchema: z.object({}).strict(),
      outputSchema: z.object({ result: CouncilResultSchema.nullable() }).strict(),
      annotations: toolAnnotations,
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
