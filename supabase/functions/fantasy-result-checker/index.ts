import { createClient } from "npm:@supabase/supabase-js@2";
import { atrDetailUrl, isAtrAccessChallenge, matchEdgeObservation, parseAtrHtml, type EdgeRace, type EdgeRunner } from "../_shared/results.ts";

function env(name: string): string | undefined { return Deno.env.get(name); }
function secretKey(): string | undefined {
  const direct = env("SUPABASE_SECRET_KEY") ?? env("SUPABASE_SERVICE_ROLE_KEY");
  if (direct) return direct;
  try { return JSON.parse(env("SUPABASE_SECRET_KEYS") ?? "{}").default as string | undefined; } catch { return undefined; }
}

function authorized(request: Request): boolean {
  const expected = env("FANTASY_RESULT_CRON_TOKEN");
  const supplied = request.headers.get("authorization")?.replace(/^Bearer\s+/i, "");
  return Boolean(expected && supplied && expected === supplied);
}

Deno.serve(async (request: Request) => {
  if (!authorized(request)) return Response.json({ error: "unauthorized" }, { status: 401 });
  const enabled = env("FANTASY_ATR_RESULTS_ENABLED") === "true";
  if (!enabled) return Response.json({ status: "DISABLED", reason: "ATR deployment smoke not approved" });
  const url = env("SUPABASE_URL");
  const key = secretKey();
  if (!url || !key) return Response.json({ status: "FAILED", error: "service_not_configured" }, { status: 503 });
  const client = createClient(url, key, { auth: { persistSession: false, autoRefreshToken: false } });
  const requestUrl = new URL(request.url);
  if (requestUrl.searchParams.get("smoke") === "true") {
    const smokeUrl = requestUrl.searchParams.get("url");
    if (!smokeUrl?.startsWith("https://www.attheraces.com/racecard/")) return Response.json({ error: "invalid_smoke_url" }, { status: 400 });
    const response = await fetch(smokeUrl, { method: "GET", redirect: "manual", headers: { Accept: "text/html" } });
    const html = await response.text();
    const challenge = isAtrAccessChallenge(html);
    return Response.json({ status: response.ok && !challenge ? "TRANSPORT_OK" : "FAIL_CLOSED", settlementReady: false,
      reason: "Transport check only; a race-specific validated result is required", httpStatus: response.status, challenge, byteLength: html.length });
  }

  const { data: claimed, error: claimError } = await client.rpc("claim_fantasy_result_check_batch", { p_limit: 20 });
  if (claimError) return Response.json({ status: "FAILED", error: claimError.code }, { status: 503 });
  const outcomes: Array<Record<string, unknown>> = [];
  for (const row of (claimed ?? []) as EdgeRace[]) {
    const sourceUrl = atrDetailUrl(row);
    try {
      const response = await fetch(sourceUrl, { method: "GET", redirect: "manual", headers: { Accept: "text/html,application/xhtml+xml" } });
      const html = response.ok && response.status < 300 ? await response.text() : "Access challenge or unavailable result";
      const observation = await parseAtrHtml(row, sourceUrl, html);
      const { data: runners, error: runnerError } = await client.from("race_runners")
        .select("id,runner_number,runner_name").eq("race_id", row.id);
      if (runnerError) throw new Error(runnerError.code);
      const decision = matchEdgeObservation(row, (runners ?? []) as EdgeRunner[], observation);
      const { data, error } = await client.rpc("record_fantasy_result_observation", { p_observation: observation, p_decision: decision });
      if (error) throw new Error(error.code);
      outcomes.push({ raceId: row.id, sourceUrl, result: data });
    } catch (error) {
      outcomes.push({ raceId: row.id, sourceUrl, status: "NEEDS_REVIEW", error: error instanceof Error ? error.message : "unknown" });
    }
  }
  return Response.json({ status: "COMPLETED", claimed: outcomes.length, outcomes });
});
