import { useState } from "react";
import { adjustFantasyWallet, fantasyErrorMessage, updateFantasySettings } from "../../../services/fantasy-peakpool";

type PlayerRow = { id: string; display_name: string; role: string; balance: string | number };

export default function PeakpoolAdminSettings({ players, onChanged }: { players: PlayerRow[]; onChanged: () => Promise<void> }) {
  const [playerId, setPlayerId] = useState(players[0]?.id ?? "");
  const [amount, setAmount] = useState("");
  const [adjustReason, setAdjustReason] = useState("");
  const [bettingEnabled, setBettingEnabled] = useState(false);
  const [startingBalance, setStartingBalance] = useState("1000.00");
  const [minimumStake, setMinimumStake] = useState("1.00");
  const [maximumStake, setMaximumStake] = useState("");
  const [closeBuffer, setCloseBuffer] = useState("60");
  const [quoteAge, setQuoteAge] = useState("120");
  const [settingsReason, setSettingsReason] = useState("");
  const [status, setStatus] = useState<string | null>(null);

  return <section className="peakpool-card" aria-labelledby="peakpool-admin-settings-title">
    <div className="peakpool-section-head"><div><p className="peakpool-kicker">Administrator</p><h2 id="peakpool-admin-settings-title">Game and balances</h2></div></div>
    <form className="peakpool-admin-form" onSubmit={(event) => {
      event.preventDefault(); setStatus(null);
      void updateFantasySettings({
        bettingEnabled, defaultStartingBalance: startingBalance, minimumStake, maximumStake,
        closeBufferSeconds: Number(closeBuffer), maxQuoteAgeSeconds: Number(quoteAge), initialDelaySeconds: 300,
        maxCheckAgeSeconds: 43200, reason: settingsReason, idempotencyKey: crypto.randomUUID(),
      }).then(async () => { setStatus("Game settings updated and audited."); setSettingsReason(""); await onChanged(); })
        .catch((error: unknown) => setStatus(fantasyErrorMessage(error)));
    }}>
      <label><input checked={bettingEnabled} onChange={(event) => setBettingEnabled(event.target.checked)} type="checkbox" /> Betting enabled</label>
      <label>Default starting balance<input inputMode="decimal" onChange={(event) => setStartingBalance(event.target.value)} value={startingBalance} /></label>
      <label>Minimum stake<input inputMode="decimal" onChange={(event) => setMinimumStake(event.target.value)} value={minimumStake} /></label>
      <label>Maximum stake (optional)<input inputMode="decimal" onChange={(event) => setMaximumStake(event.target.value)} value={maximumStake} /></label>
      <label>Close buffer seconds<input inputMode="numeric" onChange={(event) => setCloseBuffer(event.target.value)} value={closeBuffer} /></label>
      <label>Maximum quote age seconds<input inputMode="numeric" onChange={(event) => setQuoteAge(event.target.value)} value={quoteAge} /></label>
      <label className="peakpool-form-wide">Reason<input onChange={(event) => setSettingsReason(event.target.value)} required value={settingsReason} /></label>
      <button className="peakpool-primary-button" type="submit">Save settings</button>
    </form>
    <form className="peakpool-admin-form" onSubmit={(event) => {
      event.preventDefault(); setStatus(null);
      void adjustFantasyWallet({ userId: playerId, amount, reason: adjustReason, idempotencyKey: crypto.randomUUID() })
        .then(async () => { setStatus("Balance adjustment recorded."); setAmount(""); setAdjustReason(""); await onChanged(); })
        .catch((error: unknown) => setStatus(fantasyErrorMessage(error)));
    }}>
      <label>Player<select onChange={(event) => setPlayerId(event.target.value)} required value={playerId}>
        <option disabled value="">Select player</option>{players.map((player) => <option key={player.id} value={player.id}>{player.display_name} · {player.balance}</option>)}
      </select></label>
      <label>Signed adjustment<input inputMode="decimal" onChange={(event) => setAmount(event.target.value)} placeholder="100.00 or -25.00" required value={amount} /></label>
      <label className="peakpool-form-wide">Reason<input onChange={(event) => setAdjustReason(event.target.value)} required value={adjustReason} /></label>
      <button className="peakpool-primary-button" type="submit">Adjust balance</button>
    </form>
    {status && <p role="status">{status}</p>}
  </section>;
}
