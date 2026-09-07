import { useEffect, useRef, useState } from "react";
import { confirmFantasyResult, correctFantasyResult, retryFantasyResult, voidFantasyRace } from "../../../services/fantasy-peakpool";
import type { FantasyRace } from "../types";

export default function PeakpoolAdminResults({ races, onChanged }: { races: FantasyRace[]; onChanged: () => Promise<void> }) {
  const dialogRef = useRef<HTMLDialogElement>(null);
  const [race, setRace] = useState<FantasyRace | null>(null);
  const [winnerIds, setWinnerIds] = useState<string[]>([]);
  const [reason, setReason] = useState("");
  const [status, setStatus] = useState<string | null>(null);
  useEffect(() => {
    if (!race) return undefined;
    const previous = document.body.style.overflow;
    document.body.style.overflow = "hidden";
    dialogRef.current?.showModal();
    return () => { document.body.style.overflow = previous; };
  }, [race]);
  const close = () => { dialogRef.current?.close(); setRace(null); setWinnerIds([]); setReason(""); };
  const run = (action: "confirm" | "correct" | "void" | "retry") => {
    if (!race) return;
    const common = { raceId: race.id, reason, idempotencyKey: crypto.randomUUID() };
    const request = action === "confirm" ? confirmFantasyResult({ ...common, winnerIds })
      : action === "correct" ? correctFantasyResult({ ...common, winnerIds })
        : action === "void" ? voidFantasyRace(common) : retryFantasyResult(common);
    void request.then(async () => { setStatus(`${action} recorded.`); close(); await onChanged(); })
      .catch((error: unknown) => setStatus(error instanceof Error ? error.message : "Admin action failed."));
  };
  return <section className="peakpool-card" aria-labelledby="peakpool-admin-results-title">
    <div className="peakpool-section-head"><div><p className="peakpool-kicker">Administrator</p><h2 id="peakpool-admin-results-title">Race review</h2></div></div>
    <div className="peakpool-admin-races">{races.map((item) => <button key={item.id} onClick={() => setRace(item)} type="button"><span>{item.externalRaceId} · {item.racecourse}</span><strong>{item.state}</strong></button>)}</div>
    {status && <p role="status">{status}</p>}
    <dialog aria-labelledby="peakpool-result-dialog-title" className="peakpool-dialog" onCancel={(event) => { event.preventDefault(); close(); }} ref={dialogRef}>
      {race && <form method="dialog" onSubmit={(event) => event.preventDefault()}>
        <div className="peakpool-betslip-head"><h2 id="peakpool-result-dialog-title">Resolve {race.externalRaceId}</h2><button aria-label="Close result dialog" onClick={close} type="button">×</button></div>
        <fieldset><legend>Winner(s), including dead heats</legend>{race.runners.map((runner) => <label key={runner.id}><input checked={winnerIds.includes(runner.id)} onChange={(event) => setWinnerIds((current) => event.target.checked ? [...current, runner.id] : current.filter((id) => id !== runner.id))} type="checkbox" /> {runner.number}. {runner.name}</label>)}</fieldset>
        <label className="peakpool-field">Required reason<textarea onChange={(event) => setReason(event.target.value)} required value={reason} /></label>
        <p className="peakpool-help">PMU payouts require verified final dividend evidence. Use Retry check to fetch it; winner-only confirmation cannot price a bet. Settled history is preserved.</p>
        <div className="peakpool-dialog-actions"><button disabled type="button">Verified PMU result required</button><button disabled={!reason || race.state === "SETTLED"} onClick={() => run("void")} type="button">Void race</button><button disabled={!reason || race.state === "SETTLED"} onClick={() => run("retry")} type="button">Retry check</button></div>
      </form>}
    </dialog>
  </section>;
}
