import type { FantasyLedgerEntry } from "../types";

export default function PeakpoolLedger({ entries }: { entries: FantasyLedgerEntry[] }) {
  return (
    <section className="peakpool-card" aria-labelledby="peakpool-ledger-title">
      <div className="peakpool-section-head"><div><p className="peakpool-kicker">Audit history</p><h2 id="peakpool-ledger-title">Wallet ledger</h2></div></div>
      {entries.length ? <div className="peakpool-history-list">
        {entries.map((entry) => <article key={entry.id}>
          <div><strong>{entry.type.replaceAll("_", " ")}</strong><span>{entry.reason ?? new Date(entry.createdAt).toLocaleString("en-MU")}</span></div>
          <dl><div><dt>Amount</dt><dd>{entry.amount}</dd></div><div><dt>Balance</dt><dd>{entry.balanceAfter}</dd></div></dl>
        </article>)}
      </div> : <p className="peakpool-help">No private wallet activity is available.</p>}
    </section>
  );
}
