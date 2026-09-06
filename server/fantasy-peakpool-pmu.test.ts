import assert from "node:assert/strict";
import { test } from "node:test";
import { matchPmuRace, validatePmuResult, pmuDividend, fetchPmuJson, PMU_BASE, pmuParticipants } from "../supabase/functions/_shared/pmu.js";

const race = { id: "race", programme_date: "2026-09-05", racecourse: "La Teste", race_number: 1,
  race_name: "Prix de l'Association Un Grand Pas Pour Maël", official_off_at: new Date(1788598680000).toISOString() };
const course = { numOrdre: 1, numReunion: 3, heureDepart: 1788598680000,
  libelle: 'PRIX DE L\'ASSOCIATION "UN GRAND PAS POUR MAEL"', hippodrome: { libelleCourt: "LA TESTE" },
  arriveeDefinitive: true, rapportsDefinitifsDisponibles: true, ordreArrivee: [[4], [1]], incidents: [] };
const runners = [{ id: "winner", runner_number: 4, runner_name: "LE COMBAT CONTINUE" }, { id: "loser", runner_number: 1, runner_name: "MONT DE SOLEIL" }];
const participants = { participants: runners.map(r => ({ numPmu: r.runner_number, nom: r.runner_name, statut: "PARTANT", ordreArrivee: r.runner_number === 4 ? 1 : 2 })) };
const reports = [{ typePari: "SIMPLE_GAGNANT", audience: "NATIONAL", miseBase: 200, rembourse: false, dividendeUnite: "PourUnEuro",
  rapports: [{ combinaison: "4", dividendePourUnEuro: 500, dividendePourUneMiseDeBase: 1000, dividendeUnite: "PourUnEuro" }] }];

test("PMU matches independent identity despite different meeting numbers", () => {
  assert.equal(matchPmuRace(race, [course])?.numReunion, 3);
  assert.equal(matchPmuRace(race, [course, course]), undefined);
  assert.equal(matchPmuRace(race, [{ ...course, libelle: "OTHER RACE" }]), undefined);
  assert.equal(matchPmuRace(race, [{ ...course, heureDepart: course.heureDepart + 3600000 }]), undefined);
});
test("PMU definitive 500-cent per-euro dividend is gross multiplier 5.00", () => {
  assert.equal(pmuDividend(reports[0], reports[0].rapports[0]), 500);
  const result = validatePmuResult(race, runners, course, participants, reports);
  assert.deepEqual(result.winner_runner_ids, ["winner"]);
  assert.equal(result.finishing_order[0].finalizedDividendCents, 500);
  assert.equal(1000n * BigInt(result.finishing_order[0].finalizedDividendCents!) / 100n, 5000n);
});
test("PMU rejects wrong pool, incomplete finality, bad units and inconsistent winner field", () => {
  for (const change of [
    () => validatePmuResult(race, runners, { ...course, arriveeDefinitive: false }, participants, reports),
    () => validatePmuResult(race, runners, course, participants, [{ ...reports[0], typePari: "E_SIMPLE_GAGNANT" }]),
    () => validatePmuResult(race, runners, course, participants, [...reports, ...reports]),
    () => validatePmuResult(race, runners, course, { participants: participants.participants.slice(0, 1) }, reports),
    () => pmuDividend(reports[0], { ...reports[0].rapports[0], dividendePourUneMiseDeBase: 900 }),
    () => pmuDividend(reports[0], { ...reports[0].rapports[0], dividendeUnite: "Unknown" }),
  ]) assert.throws(change);
});
test("PMU dead-heat dividends stay winner-specific without a second split", () => {
  const joint = validatePmuResult(race, runners, { ...course, ordreArrivee: [[4, 1]] },
    { participants: participants.participants.map(p => ({ ...p, ordreArrivee: 1 })) },
    [{ ...reports[0], rapports: [...reports[0].rapports, { ...reports[0].rapports[0], combinaison: "1", dividendePourUnEuro: 250, dividendePourUneMiseDeBase: 500 }] }]);
  assert.deepEqual(joint.finishing_order.map(r => r.finalizedDividendCents), [500, 250]);
  assert.equal(joint.payout_divisor, 1);
});

test("PMU fetch rejects other hosts before network access and bounds response size", async () => {
  let requests = 0;
  const fetcher = (async () => { requests++; return new Response(new Uint8Array(3_000_001)); }) as typeof fetch;
  await assert.rejects(fetchPmuJson("https://example.com/", fetcher), /PMU_URL_REJECTED/);
  assert.equal(requests, 0);
  await assert.rejects(fetchPmuJson(`${PMU_BASE}/05092026`, fetcher), /PMU_BODY_TOO_LARGE/);
});

test("PMU non-runners cannot also appear in the finishing order", () => {
  assert.throws(() => validatePmuResult(race, runners, course, { participants: participants.participants.map(p => ({ ...p, statut: "NON_PARTANT" })) }, reports), /PMU_NON_RUNNER_CONFLICT/);
});

test("PMU backfill requires strict title identity, allowing only terminal discipline labels", () => {
  assert.ok(matchPmuRace({ ...race, race_name: `${race.race_name} Attelé` }, [course]));
  assert.equal(matchPmuRace({ ...race, race_name: "Unrelated" }, [course]), undefined);
  assert.throws(() => pmuParticipants({ participants: [...participants.participants, participants.participants[0]] }), /PMU_RUNNER_UNMATCHED/);
  assert.equal(pmuParticipants({ participants: [{ numPmu: 1, nom: "Alpha", statut: "NON_PARTANT" }] })[0].active, false);
});

test("result-only title fallback requires a complete independently stored field", () => {
  const abbreviated = { ...race, race_name: "Truncated sponsor title" };
  assert.equal(matchPmuRace(abbreviated, [course]), undefined);
  assert.ok(matchPmuRace(abbreviated, [course], false));
  assert.equal(matchPmuRace(abbreviated, [course, course], false), undefined);
  assert.equal(validatePmuResult(abbreviated, runners, course, participants, reports).match_method, "COMPLETE_CANONICAL_FIELD");
  assert.throws(() => validatePmuResult(abbreviated, [{ ...runners[0], runner_name: "Wrong horse" }, runners[1]], course, participants, reports), /PMU_RUNNER_UNMATCHED/);
});
