import { getHorseeToolSecuritySchemes } from "./horsee-mcp.js";

type JsonObject = Record<string, unknown>;

function isObject(value: unknown): value is JsonObject {
  return typeof value === "object" && value !== null && !Array.isArray(value);
}

function decorateMessage(message: unknown, writeScope: string): boolean {
  if (!isObject(message) || !isObject(message.result) || !Array.isArray(message.result.tools)) {
    return false;
  }

  for (const tool of message.result.tools) {
    if (!isObject(tool) || typeof tool.name !== "string") continue;

    const securitySchemes = getHorseeToolSecuritySchemes(tool.name, writeScope);
    tool.securitySchemes = securitySchemes;
    tool._meta = {
      ...(isObject(tool._meta) ? tool._meta : {}),
      securitySchemes,
    };
  }

  return true;
}

export function decorateHorseeToolSecuritySchemes(
  payload: unknown,
  writeScope: string,
): boolean {
  if (Array.isArray(payload)) {
    let decorated = false;
    for (const message of payload) {
      decorated = decorateMessage(message, writeScope) || decorated;
    }
    return decorated;
  }
  return decorateMessage(payload, writeScope);
}

export async function addHorseeToolSecuritySchemes(
  response: Response,
  writeScope: string,
): Promise<Response> {
  if (!response.headers.get("content-type")?.includes("application/json")) {
    return response;
  }

  const payload = await response.json() as unknown;
  decorateHorseeToolSecuritySchemes(payload, writeScope);

  const headers = new Headers(response.headers);
  headers.delete("content-length");
  return new Response(JSON.stringify(payload), {
    status: response.status,
    statusText: response.statusText,
    headers,
  });
}
