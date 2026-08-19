import type { Context } from "@netlify/functions";
import {
  getCouncilProtectedResourceMetadata,
  resolveCouncilAuthConfig,
} from "../../server/council-auth.js";
import { createCouncilRuntimeEnvironment } from "../../server/netlify-runtime.js";

export default async function handler(request: Request, context: Context): Promise<Response> {
  const config = resolveCouncilAuthConfig(
    request.url,
    createCouncilRuntimeEnvironment(context),
  );
  const metadata = getCouncilProtectedResourceMetadata(config);

  if (!metadata) {
    return Response.json(
      {
        error: "authorization_not_configured",
        error_description: "Council writes remain disabled until OAuth is configured.",
      },
      { status: 503, headers: { "Cache-Control": "no-store" } },
    );
  }

  return Response.json(metadata, { headers: { "Cache-Control": "public, max-age=300" } });
}
