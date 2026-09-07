import { useEffect, useState } from "react";
import { validateFantasyStake } from "../domain";
import type { FantasyBetReceipt, FantasyRace, FantasyRunner } from "../types";

export default function PeakpoolBetslip({
  selection,
  minimumStake,
  maximumStake,
  bettingEnabled,
  signedIn,
  onClear,
  onPlace,
}: {
  selection: { race: FantasyRace; runner: FantasyRunner } | null;
  minimumStake: string;
  maximumStake?: string;
  bettingEnabled: boolean;
  signedIn: boolean;
  onClear: () => void;
  onPlace: (input: { stake: string; idempotencyKey: string }) => Promise<FantasyBetReceipt>;
}) {
  const [stake, setStake] = useState("");
  const [requestId, setRequestId] = useState<string | null>(null);
  const [submitting, setSubmitting] = useState(false);
  const [error, setError] = useState<string | null>(null);
  const [receipt, setReceipt] = useState<FantasyBetReceipt | null>(null);

  useEffect(() => { setStake(""); setRequestId(null); setError(null); }, [selection?.runner.id]);
  if (!selection) return null;
  const validation = validateFantasyStake(stake, minimumStake, maximumStake);
  const allowed = signedIn && bettingEnabled && selection.runner.available && validation.valid;

  return (
    <aside className="peakpool-betslip" aria-labelledby="peakpool-betslip-title">
      <div className="peakpool-betslip-head">
        <div><p className="peakpool-kicker">Betslip</p><h2 id="peakpool-betslip-title">Review fantasy WIN bet</h2></div>
        <button aria-label="Clear fantasy selection" className="peakpool-icon-button" onClick={onClear} type="button">×</button>
      </div>
      <dl>
        <div><dt>Race</dt><dd>{selection.race.externalRaceId} · {selection.race.racecourse}</dd></div>
        <div><dt>Runner</dt><dd>{selection.runner.number}. {selection.runner.name}</dd></div>
        <div><dt>Pricing</dt><dd>PMU final Simple Gagnant dividend</dd></div>
      </dl>
      <label className="peakpool-field">Stake
        <input
          autoComplete="off"
          inputMode="decimal"
          min={minimumStake}
          onChange={(event) => { setStake(event.target.value); setRequestId(null); setError(null); setReceipt(null); }}
          placeholder={minimumStake}
          value={stake}
        />
      </label>
      {stake && !validation.valid && <p className="peakpool-error" role="alert">{validation.message}</p>}
      <div className="peakpool-return"><span>Potential fantasy return</span><strong>Calculated after the result</strong></div>
      <p className="peakpool-help">If this runner wins, your stake is multiplied by PMU’s final NATIONAL Simple Gagnant return per €1, including stake. No pre-race odds are locked. Missing or unmatched results remain pending review.</p>
      {!signedIn && <p className="peakpool-help">Sign in with Google to place a fantasy bet.</p>}
      {!bettingEnabled && <p className="peakpool-help">Fantasy betting is currently disabled.</p>}
      <button
        className="peakpool-primary-button peakpool-place-button"
        disabled={!allowed || submitting}
        onClick={() => {
          const idempotencyKey = requestId ?? crypto.randomUUID();
          setRequestId(idempotencyKey);
          setSubmitting(true); setError(null);
          void onPlace({ stake, idempotencyKey }).then((nextReceipt) => {
            setReceipt(nextReceipt); setRequestId(null);
          }).catch((placeError: unknown) => {
            setError(placeError instanceof Error ? placeError.message : "Fantasy bet could not be placed.");
          }).finally(() => setSubmitting(false));
        }}
        type="button"
      >{submitting ? "Placing…" : "Place fantasy bet"}</button>
      {error && <p className="peakpool-error" role="alert">{error}</p>}
      {receipt && (
        <div className="peakpool-receipt" role="status">
          <strong>Fantasy bet accepted</strong>
          <span>Bet {receipt.betId}</span><span>New balance {receipt.newBalance}</span>
        </div>
      )}
    </aside>
  );
}
