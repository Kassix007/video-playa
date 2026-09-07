import React from "react";
import type { FantasyRace } from "../types";

export default function PeakpoolWinners({ race }: { race: FantasyRace }) {
  if (race.state !== "SETTLED") return null;
  const winners = race.winners ?? [];
  return React.createElement("div", { className: "peakpool-winners", "aria-label": "Confirmed race result" },
    <strong>{winners.length > 1 ? "Dead heat · winners" : "Winner"}</strong>,
    winners.length ? <ul>{winners.map(winner => <li key={winner.id}>
      <span className="peakpool-winner-name">{winner.number}. {winner.name}</span>
      {winner.pmuFinalDividend ? <span>PMU final dividend ×{winner.pmuFinalDividend}</span> : <span>Final dividend unavailable</span>}
    </li>)}</ul> : <span>Winner details unavailable</span>);
}
