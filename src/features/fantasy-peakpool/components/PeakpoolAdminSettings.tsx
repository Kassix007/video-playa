import React from "react";
import { adjustFantasyWallet, fantasyErrorMessage, resetFantasyLeaderboard, updateFantasySettings } from "../../../services/fantasy-peakpool";
import { parseAdminSettings, type AdminSettings } from "../admin-settings";

type PlayerRow = { id: string; display_name: string; role: string; balance: string | number };
const { useState } = React;

type Props = { players: PlayerRow[]; onChanged: () => Promise<void> };
export default function PeakpoolAdminSettings({ settings, ...props }: Props & { settings: unknown }) {
  const saved = parseAdminSettings(settings);
  if (!saved) return <p role="status">Saved administrator settings are unavailable. Reload before making changes.</p>;
  return <SettingsEditor key={JSON.stringify(saved)} settings={saved} {...props} />;
}

function SettingsEditor({ players, onChanged, settings }: Props & { settings: AdminSettings }) {
  const [playerId, setPlayerId] = useState("");
  const [amount, setAmount] = useState("");
  const [adjustReason, setAdjustReason] = useState("");
  const [bettingEnabled, setBettingEnabled] = useState(settings.betting_enabled);
  const [startingBalance, setStartingBalance] = useState(settings.default_starting_balance);
  const [minimumStake, setMinimumStake] = useState(settings.minimum_stake);
  const [maximumStake, setMaximumStake] = useState(settings.maximum_stake ?? "");
  const [closeBuffer, setCloseBuffer] = useState(String(settings.close_buffer_seconds));
  const [quoteAge, setQuoteAge] = useState(String(settings.max_quote_age_seconds));
  const [settingsReason, setSettingsReason] = useState("");
  const [resetReason, setResetReason] = useState("");
  const [resetConfirmation, setResetConfirmation] = useState("");
  const [status, setStatus] = useState<string | null>(null);

  return <section className="peakpool-card" aria-labelledby="peakpool-admin-settings-title">
    <div className="peakpool-section-head"><div><p className="peakpool-kicker">Administrator</p><h2 id="peakpool-admin-settings-title">Game and balances</h2></div></div>
    <form className="peakpool-admin-form" onSubmit={(event) => {
      event.preventDefault(); setStatus(null);
      void updateFantasySettings({
        bettingEnabled, defaultStartingBalance: startingBalance, minimumStake, maximumStake,
        closeBufferSeconds: Number(closeBuffer), maxQuoteAgeSeconds: Number(quoteAge), initialDelaySeconds: settings.result_check_initial_delay_seconds,
        maxCheckAgeSeconds: settings.result_check_max_age_seconds, reason: settingsReason, idempotencyKey: crypto.randomUUID(),
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
    <div className="peakpool-admin-danger">
      <div>
        <p className="peakpool-kicker">Danger zone</p>
        <h3>Reset leaderboard</h3>
        <p>Starts a new competition round and restores every fantasy wallet to the current starting balance. Bet and ledger history is preserved. The reset is blocked while any bets are pending.</p>
      </div>
      <form className="peakpool-admin-form" onSubmit={(event) => {
        event.preventDefault(); setStatus(null);
        void resetFantasyLeaderboard({ reason: resetReason, confirmation: resetConfirmation, idempotencyKey: crypto.randomUUID() })
          .then(async (receipt) => {
            setStatus(`Leaderboard reset complete. Round ${String(receipt.leaderboard_round ?? "advanced")}.`);
            setResetReason(""); setResetConfirmation(""); await onChanged();
          })
          .catch((error: unknown) => setStatus(fantasyErrorMessage(error)));
      }}>
        <label className="peakpool-form-wide">Reason<input onChange={(event) => setResetReason(event.target.value)} required value={resetReason} /></label>
        <label>Type RESET LEADERBOARD<input autoComplete="off" onChange={(event) => setResetConfirmation(event.target.value)} required spellCheck={false} value={resetConfirmation} /></label>
        <button className="peakpool-danger-button" disabled={resetReason.trim().length < 3 || resetConfirmation !== "RESET LEADERBOARD"} type="submit">Reset leaderboard</button>
      </form>
    </div>
    {status && <p role="status">{status}</p>}
  </section>;
}
