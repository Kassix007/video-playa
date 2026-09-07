import type { Context } from "@netlify/functions";
import { createClient } from "@supabase/supabase-js";
import { authorizeFantasyPeakpoolSync, syncFantasyPeakpool } from "../../server/fantasy-peakpool-sync.js";

function environment(_context: Context, name: string): string | undefined {
  return process.env[name];
}

export default async function handler(request: Request, context: Context): Promise<Response> {
  if (request.method !== "POST") return Response.json({ error: "method_not_allowed" }, { status: 405 });
  if (!authorizeFantasyPeakpoolSync(request.headers.get("authorization"), environment(context, "FANTASY_PEAKPOOL_SYNC_TOKEN"))) {
    return Response.json({ error: "unauthorized" }, { status: 401, headers: { "Cache-Control": "no-store" } });
  }
  const supabaseUrl = environment(context, "SUPABASE_URL");
  const secretKey = environment(context, "SUPABASE_SECRET_KEY");
  if (!supabaseUrl || !secretKey || secretKey.startsWith("sb_publishable_")) {
    return Response.json({ error: "sync_not_configured" }, { status: 503 });
  }
  try {
    const client = createClient(supabaseUrl, secretKey, { auth: { persistSession: false, autoRefreshToken: false } });
    const result = await syncFantasyPeakpool({
      ingest: async (payload) => {
        const { data, error } = await client.rpc("ingest_fantasy_peakpool_snapshot", { p_payload: payload });
        if (error) throw new Error(`Supabase ingestion rejected: ${error.code}.`);
        return (data ?? {}) as Record<string, unknown>;
      },
    });
    return Response.json({ success: true, ...result }, { headers: { "Cache-Control": "no-store" } });
  } catch (error) {
    console.error(`[FANTASY PEAKPOOL SYNC] ${error instanceof Error ? error.name : "UnknownError"}`);
    return Response.json({ success: false, error: "sync_failed" }, { status: 503, headers: { "Cache-Control": "no-store" } });
  }
}
