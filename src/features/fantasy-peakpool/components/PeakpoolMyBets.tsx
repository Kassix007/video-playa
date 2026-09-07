import { useState } from "react";
import type { FantasyBet, FantasyBetState } from "../types";

const filters: Array<{ label: string; value: "ALL" | FantasyBetState }> = [
  { label: "All", value: "ALL" }, { label: "Pending", value: "PENDING" }, { label: "Won", value: "WON" },
  { label: "Lost", value: "LOST" }, { label: "Void", value: "VOID" },
];

export default function PeakpoolMyBets({ bets }: { bets: FantasyBet[] }) {
  const [filter, setFilter] = useState<(typeof filters)[number]["value"]>("ALL");
  const visible = filter === "ALL" ? bets : bets.filter((bet) => bet.state === filter);
  return (
    <section className="peakpool-card" aria-labelledby="peakpool-my-bets-title">
      <div className="peakpool-section-head"><div><p className="peakpool-kicker">Private</p><h2 id="peakpool-my-bets-title">My bets</h2></div></div>
      <div className="peakpool-filter-row" aria-label="Filter fantasy bets">
        {filters.map((item) => <button aria-pressed={filter === item.value} key={item.value} onClick={() => setFilter(item.value)} type="button">{item.label}</button>)}
      </div>
      {visible.length ? <div className="peakpool-history-list">
        {visible.map((bet) => <article key={bet.id}>
          <div><strong>{bet.runnerName}</strong><span>{bet.raceLabel}</span></div>
          <dl><div><dt>Stake</dt><dd>{bet.stake}</dd></div><div><dt>Return rate</dt><dd>{bet.pmuFinalDividend ? `PMU ×${bet.pmuFinalDividend}` : bet.atrFinalPrice ? `ATR ${bet.atrFinalPrice}` : bet.state === "PENDING" ? "PMU final pending" : "—"}</dd></div><div><dt>Status</dt><dd>{bet.state}</dd></div></dl>
        </article>)}
      </div> : <p className="peakpool-help" role="status">No {filter === "ALL" ? "" : filter.toLowerCase()} fantasy bets yet.</p>}
    </section>
  );
}
