import { createClient } from "npm:@supabase/supabase-js@2";
import { atrDetailUrl, isAtrAccessChallenge, matchEdgeObservation, parseAtrHtml, type EdgeRace, type EdgeRunner } from "../_shared/results.ts";

function env(name: string): string | undefined { return Deno.env.get(name); }
function secretKey(): string | undefined {
  const direct = env("SUPABASE_SECRET_KEY") ?? env("SUPABASE_SERVICE_ROLE_KEY");
  if (direct) return direct;
  try { return JSON.parse(env("SUPABASE_SECRET_KEYS") ?? "{}").default as string | undefined; } catch { return undefined; }
}

async function fetchAtr(url: string, options: RequestInit = {}) {
  const proxyUrl = env("ATR_PROXY_URL");
  const proxyKey = env("ATR_PROXY_KEY");

  if (proxyUrl && proxyKey) {
    const proxyRequestUrl = new URL(proxyUrl);
    proxyRequestUrl.searchParams.set("api_key", proxyKey);
    proxyRequestUrl.searchParams.set("url", url);
    // Most proxy services support these params for JS rendering
    proxyRequestUrl.searchParams.set("render", "true");

    return fetch(proxyRequestUrl.toString(), options);
  }
  return fetch(url, options);
}

function authorized(request: Request): boolean {
  const expected = env("FANTASY_RESULT_CRON_TOKEN");
  const supplied = request.headers.get("authorization")?.replace(/^Bearer\s+/i, "");
  return Boolean(expected && supplied && expected === supplied);
}

Deno.serve(async (request: Request) => {
  const requestUrl = new URL(request.url);
  if (requestUrl.searchParams.get("smoke") === "true") {
    const smokeUrl = requestUrl.searchParams.get("url");
    if (!smokeUrl?.startsWith("https://www.attheraces.com/racecard/")) return Response.json({ error: "invalid_smoke_url" }, { status: 400 });
    const response = await fetchAtr(smokeUrl, { method: "GET", redirect: "manual", headers: { Accept: "text/html" } });
    const html = await response.text();
    const challenge = isAtrAccessChallenge(html);
    return Response.json({ status: response.ok && !challenge ? "TRANSPORT_OK" : "FAIL_CLOSED", settlementReady: false,
      reason: "Transport check only; a race-specific validated result is required", httpStatus: response.status, challenge, byteLength: html.length });
  }

  if (!authorized(request)) return Response.json({ error: "unauthorized" }, { status: 401 });

  const { data: claimed, error: claimError } = await client.rpc("claim_fantasy_result_check_batch", { p_limit: 20 });
  if (claimError) return Response.json({ status: "FAILED", error: claimError.code }, { status: 503 });
  const outcomes: Array<Record<string, unknown>> = [];
  for (const row of (claimed ?? []) as EdgeRace[]) {
    const sourceUrl = atrDetailUrl(row);
    try {
      const response = await fetchAtr(sourceUrl, { method: "GET", redirect: "manual", headers: { Accept: "text/html,application/xhtml+xml" } });
      let html = response.ok && response.status < 300 ? await response.text() : "";

      if (!html || isAtrAccessChallenge(html)) {
        // Fallback to Zone-Turf if ATR is blocked or fails
        const ztUrl = `https://www.zone-turf.fr/rapports/`; // Simplified for now, needs a real URL
        const ztResponse = await fetch(ztUrl, { method: "GET" });
        if (ztResponse.ok) {
          html = await ztResponse.text();
        }
      }

      const observation = html ? await parseAtrHtml(row, sourceUrl, html) : {
        race_id: row.id, provider: "at-the-races", source_url: sourceUrl, retrieved_at: new Date().toISOString(),
        programme_date: row.programme_date, course: row.racecourse, race_number: row.race_number,
        status: "NEEDS_REVIEW", finishing_order: [], non_runners: [], sanitized_fragment: "Failed to retrieve result", payload_hash: "0"
      };
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
