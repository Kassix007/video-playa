import type { FantasyLeaderboardRow } from "../types";

export default function PeakpoolLeaderboard({ rows }: { rows: FantasyLeaderboardRow[] }) {
  return (
    <section className="peakpool-card" aria-labelledby="peakpool-leaderboard-title">
      <div className="peakpool-section-head"><div><p className="peakpool-kicker">Public competition</p><h2 id="peakpool-leaderboard-title">Leaderboard</h2></div></div>
      {rows.length ? <div className="peakpool-table-wrap"><table>
        <thead><tr><th>Rank</th><th>Player</th><th>Balance</th><th>Net P/L</th><th>Wins</th><th>Bets</th></tr></thead>
        <tbody>{rows.map((row) => <tr key={`${row.rank}-${row.player}`}>
          <td>{row.rank}</td><td><span className="peakpool-player-cell">{row.avatarUrl && <img alt="" src={row.avatarUrl} />}{row.player}</span></td>
          <td>{row.balance}</td><td>{row.netProfitLoss}</td><td>{row.wins}</td><td>{row.bets}</td>
        </tr>)}</tbody>
      </table></div> : <p className="peakpool-help">The leaderboard will appear after the first player joins.</p>}
    </section>
  );
}
