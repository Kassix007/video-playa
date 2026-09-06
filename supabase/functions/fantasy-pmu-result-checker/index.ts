import { createClient } from "npm:@supabase/supabase-js@2";
import { PMU_BASE, fetchPmuJson, matchPmuRace, pmuDate, programmeCourses, validatePmuResult, type PmuRace, type PmuRunner } from "../_shared/pmu.ts";

function secretKey(): string | undefined {
  const direct = Deno.env.get("SUPABASE_SECRET_KEY") ?? Deno.env.get("SUPABASE_SERVICE_ROLE_KEY");
  if (direct) return direct;
  try { return JSON.parse(Deno.env.get("SUPABASE_SECRET_KEYS") ?? "{}").default; } catch { return undefined; }
}
async function hash(raw: string): Promise<string> {
  return [...new Uint8Array(await crypto.subtle.digest("SHA-256", new TextEncoder().encode(raw)))].map(b => b.toString(16).padStart(2, "0")).join("");
}
Deno.serve(async request => {
  const expected = Deno.env.get("FANTASY_RESULT_CRON_TOKEN");
  if (!expected || request.headers.get("authorization") !== `Bearer ${expected}`) return Response.json({ error: "unauthorized" }, { status: 401 });
  const url = new URL(request.url);
  const smoke = url.searchParams.get("smoke") === "true";
  const releaseStatus = url.searchParams.get("status") === "true";
  if (!smoke && !releaseStatus && Deno.env.get("FANTASY_PMU_RESULTS_ENABLED") !== "true") return Response.json({ status: "DISABLED" });
  const key = secretKey(), projectUrl = Deno.env.get("SUPABASE_URL");
  if (!key || !projectUrl) return Response.json({ error: "service_not_configured" }, { status: 503 });
  const client = createClient(projectUrl, key, { auth: { persistSession: false, autoRefreshToken: false } });
  if (releaseStatus) {
    const { data, error } = await client.rpc("get_pmu_release_status");
    return Response.json(error ? { error: "RELEASE_STATUS_UNAVAILABLE" } : { ...data, enabled: Deno.env.get("FANTASY_PMU_RESULTS_ENABLED") === "true" }, { status: error ? 503 : 200 });
  }
  const started = Date.now();
  const programmes = new Map<string, Awaited<ReturnType<typeof fetchPmuJson>>>();
  try {
    let races: PmuRace[];
    if (smoke) {
      const date = url.searchParams.get("date");
      if (!date) return Response.json({ error: "date_required" }, { status: 400 });
      pmuDate(date);
      let query = client.from("race_events").select("id,programme_date,racecourse,race_number,race_name,official_off_at")
        .eq("programme_date", date).order("official_off_at").limit(200);
      const raceId = url.searchParams.get("race_id");
      if (raceId) {
        if (!/^[0-9a-f-]{36}$/i.test(raceId)) return Response.json({ error: "invalid_race_id" }, { status: 400 });
        query = query.eq("id", raceId);
      }
      const { data, error } = await query;
      if (error) throw new Error("DATABASE_READ_FAILED");
      races = data ?? [];
    } else {
      const { data, error } = await client.rpc("claim_pmu_fantasy_result_check_batch", { p_limit: 3 });
      if (error) throw new Error("DATABASE_CLAIM_FAILED");
      races = data ?? [];
    }
    const outcomes: Record<string, unknown>[] = [];
    let detailChecks = 0;
    for (const race of races) {
      if (Date.now() - started > 70_000) { outcomes.push({ raceId: race.id, status: "DEFERRED_BUDGET" }); continue; }
      try {
        const base = `${PMU_BASE}/${pmuDate(race.programme_date)}`;
        if (!programmes.has(base)) programmes.set(base, await fetchPmuJson(base));
        const programme = programmes.get(base)!;
        const course = matchPmuRace(race, programmeCourses(programme.value));
        if (!course) {
          if (!smoke) await client.from("race_events").update({ state: "NEEDS_REVIEW" }).eq("id", race.id).eq("state", "RESULT_PENDING");
          outcomes.push({ raceId: race.id, status: "UNMATCHED", ...(smoke ? { canonicalIdentity: race,
          candidates: programmeCourses(programme.value).filter(candidate => candidate.numOrdre === race.race_number)
            .map(candidate => ({ course: candidate.hippodrome, name: candidate.libelle, off: candidate.heureDepart })) } : {}) }); continue; }
        if (course.arriveeDefinitive !== true || course.rapportsDefinitifsDisponibles !== true) {
          outcomes.push({ raceId: race.id, status: "PENDING_FINAL_RESULT" }); continue;
        }
        if (smoke && detailChecks >= 3) { outcomes.push({ raceId: race.id, status: "IDENTITY_MATCHED" }); continue; }
        detailChecks++;
        const detailUrl = `${base}/R${course.numReunion}/C${course.numOrdre}`;
        const [participants, reports, runnerResponse] = await Promise.all([
          fetchPmuJson(`${detailUrl}/participants`), fetchPmuJson(`${detailUrl}/rapports-definitifs`),
          client.from("race_runners").select("id,runner_number,runner_name").eq("race_id", race.id),
        ]);
        if (runnerResponse.error) throw new Error("DATABASE_RUNNERS_FAILED");
        const result = validatePmuResult(race, runnerResponse.data as PmuRunner[], course, participants.value, reports.value);
        const payloadHash = await hash(JSON.stringify([course, participants.raw, reports.raw]));
        if (smoke) { outcomes.push({ raceId: race.id, status: "VALIDATED", canonicalIdentity: race, providerIdentity: { course: result.course, name: result.race_name, off: result.scheduled_at }, winners: result.finishing_order.filter(r => r.position === 1), pricingBasis: result.pricing_basis }); continue; }
        const { data, error } = await client.rpc("record_pmu_fantasy_result", { p_race_id: race.id, p_result: result,
          p_source_url: `${detailUrl}/rapports-definitifs`, p_payload_hash: payloadHash });
        if (error) throw new Error(error.message.startsWith("PMU_") ? error.message : "DATABASE_SETTLEMENT_FAILED");
        outcomes.push({ raceId: race.id, status: "RECORDED", result: data });
      } catch (error) {
        if (!smoke) await client.from("race_events").update({ state: "NEEDS_REVIEW" }).eq("id", race.id).eq("state", "RESULT_PENDING");
        const code = error instanceof Error && /^(PMU_[A-Z_]+|DATABASE_[A-Z_]+)$/.test(error.message) ? error.message : "RESULT_CHECK_FAILED";
        outcomes.push({ raceId: race.id, status: "NEEDS_REVIEW", reason: code });
      }
    }
    return Response.json({ status: smoke ? "READ_ONLY" : "COMPLETED", settlementPerformed: outcomes.some(outcome => outcome.status === "RECORDED" && !(outcome.result as Record<string, unknown>)?.idempotent_replay),
      canonicalRaces: races.length, outcomes });
  } catch { return Response.json({ status: "FAILED", error: "RESULT_WORKER_FAILED" }, { status: 503 }); }
});
