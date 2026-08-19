import {
  getCouncilProtectedResourceMetadata,
  resolveCouncilAuthConfig,
} from "../../server/council-auth.js";

export default async function handler(request: Request): Promise<Response> {
  const config = resolveCouncilAuthConfig(request.url);
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
