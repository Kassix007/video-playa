import { useState } from "react";

function winnerEvidence(observation: Record<string, unknown>): string {
  const rows = Array.isArray(observation.finishing_order) ? observation.finishing_order : [];
  const winners = rows.filter((value) => {
    const row = value && typeof value === "object" ? value as Record<string, unknown> : {};
    return Number(row.position) === 1;
  });
  if (!winners.length) return "No finalized winner evidence";
  return winners.map((value) => {
    const row = value as Record<string, unknown>;
    const runner = String(row.runnerName ?? `Runner ${String(row.runnerNumber ?? "?")}`);
    if (observation.provider === "pmu" && Number.isSafeInteger(row.finalizedDividendCents)) {
      return `${runner} · PMU final dividend ×${(Number(row.finalizedDividendCents) / 100).toFixed(2)}`;
    }
    return `${runner} · ATR finalized SP ${String(row.finalizedStartingPriceRaw ?? "price unavailable")}`;
  }).join(" / ");
}

export default function PeakpoolAdminAudit({ bets, observations, audit }: {
  bets: Array<Record<string, unknown>>;
  observations: Array<Record<string, unknown>>;
  audit: Array<Record<string, unknown>>;
}) {
  const [query, setQuery] = useState("");
  const normalized = query.toLowerCase();
  const matchingBets = bets.filter((row) => JSON.stringify(row).toLowerCase().includes(normalized)).slice(0, 100);
  const matchingObservations = observations.filter((row) => JSON.stringify(row).toLowerCase().includes(normalized)).slice(0, 100);
  const matchingAudit = audit.filter((row) => JSON.stringify(row).toLowerCase().includes(normalized)).slice(0, 100);
  return <section className="peakpool-card" aria-labelledby="peakpool-admin-audit-title">
    <div className="peakpool-section-head"><div><p className="peakpool-kicker">Administrator</p><h2 id="peakpool-admin-audit-title">Bet and audit search</h2></div></div>
    <label className="peakpool-field">Search<input onChange={(event) => setQuery(event.target.value)} type="search" value={query} /></label>
    <details open><summary>Bets ({matchingBets.length})</summary><div className="peakpool-code-list">{matchingBets.map((row, index) => <code key={String(row.id ?? index)}>{JSON.stringify(row)}</code>)}</div></details>
    <details open><summary>Result evidence ({matchingObservations.length})</summary><div className="peakpool-code-list">{matchingObservations.map((row, index) => <code key={String(row.id ?? index)}>{winnerEvidence(row)} · {String(row.status ?? "UNKNOWN")} · {String(row.retrieved_at ?? "")}</code>)}</div></details>
    <details><summary>Audit events ({matchingAudit.length})</summary><div className="peakpool-code-list">{matchingAudit.map((row, index) => <code key={String(row.id ?? index)}>{JSON.stringify(row)}</code>)}</div></details>
  </section>;
}
