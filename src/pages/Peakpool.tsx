import { useCallback, useEffect, useRef, useState } from "react";
import { startFantasyLiveRefresh } from "../features/fantasy-peakpool/live-refresh";
import SiteHeader from "../components/SiteHeader";
import { FantasyAuthProvider } from "../features/fantasy-peakpool/auth";
import { useFantasyAuth } from "../features/fantasy-peakpool/auth-context";
import PeakpoolAccount from "../features/fantasy-peakpool/components/PeakpoolAccount";
import PeakpoolBetslip from "../features/fantasy-peakpool/components/PeakpoolBetslip";
import PeakpoolProgramme from "../features/fantasy-peakpool/components/PeakpoolProgramme";
import PeakpoolMyBets from "../features/fantasy-peakpool/components/PeakpoolMyBets";
import PeakpoolLedger from "../features/fantasy-peakpool/components/PeakpoolLedger";
import PeakpoolLeaderboard from "../features/fantasy-peakpool/components/PeakpoolLeaderboard";
import PeakpoolAdminSettings from "../features/fantasy-peakpool/components/PeakpoolAdminSettings";
import PeakpoolAdminAudit from "../features/fantasy-peakpool/components/PeakpoolAdminAudit";
import PeakpoolAdminResults from "../features/fantasy-peakpool/components/PeakpoolAdminResults";
import type { FantasyBootstrap, FantasyRace, FantasyRunner } from "../features/fantasy-peakpool/types";
import { fantasyErrorMessage, loadFantasyAdmin, loadFantasyBootstrap, placeFantasyBet } from "../services/fantasy-peakpool";
import "./Peakpool.css";

type PeakpoolWorkspaceView = "races" | "bets" | "leaderboard" | "wallet" | "admin";

function PeakpoolContent() {
  const auth = useFantasyAuth();
  const [bootstrap, setBootstrap] = useState<FantasyBootstrap | null>(null);
  const [selected, setSelected] = useState<{ race: FantasyRace; runner: FantasyRunner } | null>(null);
  const [loading, setLoading] = useState(auth.configured);
  const [error, setError] = useState<string | null>(null);
  const [admin, setAdmin] = useState<Record<string, unknown> | null>(null);
  const [activeView, setActiveView] = useState<PeakpoolWorkspaceView>("races");
  const sessionKey = auth.user?.id ?? "anonymous";
  const currentSession = useRef(sessionKey);
  currentSession.current = sessionKey;
  const refreshSequence = useRef(0);

  const refresh = useCallback(async (silent = false) => {
    if (!auth.configured) return;
    const sequence = ++refreshSequence.current;
    const current = () => currentSession.current === sessionKey && sequence === refreshSequence.current;
    if (!silent) setLoading(true);
    try { const data = await loadFantasyBootstrap(); if (current()) { setBootstrap(data); setError(null); } }
    catch (refreshError) { if (current()) setError(fantasyErrorMessage(refreshError)); }
    finally { if (current()) setLoading(false); }
  }, [auth.configured, sessionKey]);

  useEffect(() => { setBootstrap(null); setAdmin(null); setSelected(null); setActiveView("races"); }, [sessionKey]);

  useEffect(() => { if (!auth.loading) void refresh(); }, [auth.loading, auth.user?.id, refresh]);
  useEffect(() => {
    if (auth.loading || !auth.configured) return;
    return startFantasyLiveRefresh({ refresh: () => refresh(true), visible: () => document.visibilityState === "visible",
      schedule: (fn, ms) => window.setTimeout(fn, ms), cancel: handle => window.clearTimeout(handle as number),
      subscribe: fn => { document.addEventListener("visibilitychange", fn); window.addEventListener("online", fn);
        return () => { document.removeEventListener("visibilitychange", fn); window.removeEventListener("online", fn); }; },
    });
  }, [auth.loading, auth.configured, refresh]);

  const refreshAdmin = useCallback(async () => {
    if (bootstrap?.profile?.role !== "admin") return;
    try { const data = await loadFantasyAdmin(); if (currentSession.current === sessionKey) setAdmin(data); }
    catch (adminError) { if (currentSession.current === sessionKey) setError(fantasyErrorMessage(adminError)); }
  }, [bootstrap?.profile?.role, sessionKey]);
  useEffect(() => { void refreshAdmin(); }, [refreshAdmin]);
  const adminRows = (key: string) => Array.isArray(admin?.[key]) ? admin[key] as Array<Record<string, unknown>> : [];
  const raceCount = (bootstrap?.meetings ?? []).reduce((total, meeting) => total + meeting.races.length, 0);
  const workspaceItems: Array<{ id: PeakpoolWorkspaceView; label: string; count?: number }> = [
    { id: "races", label: "Races", count: raceCount },
    ...(auth.user ? [{ id: "bets" as const, label: "My bets", count: bootstrap?.bets.length ?? 0 }] : []),
    { id: "leaderboard", label: "Leaderboard", count: bootstrap?.leaderboard.length ?? 0 },
    ...(auth.user ? [{ id: "wallet" as const, label: "Wallet", count: bootstrap?.ledger.length ?? 0 }] : []),
    ...(bootstrap?.profile?.role === "admin" ? [{ id: "admin" as const, label: "Admin" }] : []),
  ];

  return (
    <div className="peakpool-page">
      <SiteHeader
        eyebrow="Fantasy credits only"
        railItems={["Public SMSPariaz race data", "WIN only", "No real wagers"]}
        rightSlot={<PeakpoolAccount />}
        subtitle="A fail-closed horse-racing competition. No deposits, withdrawals, SMS, or SMSPariaz account."
        title="Fantasy Peakpool"
      />
      <nav className="peakpool-workspace-nav" aria-label="Fantasy workspace">
        <div className="peakpool-workspace-intro">
          <span>Workspace</span>
          <strong>Jump straight to what you need</strong>
        </div>
        <div className="peakpool-workspace-actions">
          {workspaceItems.map((item) => (
            <button
              aria-pressed={activeView === item.id}
              key={item.id}
              onClick={() => setActiveView(item.id)}
              type="button"
            >
              <span>{item.label}</span>
              {item.count !== undefined && <strong>{item.count}</strong>}
            </button>
          ))}
        </div>
      </nav>
      <section className="peakpool-notice" aria-labelledby="peakpool-safety-title">
        <div>
          <p className="peakpool-kicker">Safety boundary</p>
          <h2 id="peakpool-safety-title">Fantasy play, never a real wager</h2>
        </div>
        <p>Public racecards and displayed values are read-only inputs. Credit mutations stay inside the fantasy ledger.</p>
      </section>
      {bootstrap?.wallet && (
        <section className="peakpool-balance" aria-label="Fantasy balance">
          <span>Available balance</span><strong>{bootstrap.wallet.balance}</strong><small>fantasy credits</small>
        </section>
      )}
      {activeView === "races" && <section className="peakpool-programme-section" aria-labelledby="peakpool-programme-title">
        <div className="peakpool-section-head">
          <div><p className="peakpool-kicker">Today's programme · PDF authoritative</p><h2 id="peakpool-programme-title">Choose a meeting</h2></div>
          <button className="peakpool-secondary-button" disabled={loading || !auth.configured} onClick={() => void refresh()} type="button">Refresh</button>
        </div>
        {error && <p className="peakpool-error" role="status">{error} Data will retry automatically.</p>}
        {loading && !bootstrap ? <p role="status">Loading today's fantasy programme…</p>
          : !bootstrap && error ? null
            : <PeakpoolProgramme meetings={bootstrap?.meetings ?? []} onSelect={(race, runner) => setSelected({ race, runner })} selectedRunnerId={selected?.runner.id} />}
      </section>}
      {activeView === "races" && <PeakpoolBetslip
        bettingEnabled={bootstrap?.bettingEnabled ?? false}
        maximumStake={bootstrap?.maximumStake}
        minimumStake={bootstrap?.minimumStake ?? "1.00"}
        onClear={() => setSelected(null)}
        onPlace={async ({ stake, idempotencyKey }) => {
          if (!selected?.runner.available) throw new Error("Runner unavailable.");
          try {
            const receipt = await placeFantasyBet({
              runnerId: selected.runner.id, stake, idempotencyKey,
            });
            await refresh();
            return receipt;
          } catch (placeError) { throw new Error(fantasyErrorMessage(placeError)); }
        }}
        selection={selected}
        signedIn={Boolean(auth.user)}
      />}
      {activeView === "bets" && auth.user && <PeakpoolMyBets bets={bootstrap?.bets ?? []} />}
      {activeView === "wallet" && auth.user && <PeakpoolLedger entries={bootstrap?.ledger ?? []} />}
      {activeView === "leaderboard" && <PeakpoolLeaderboard rows={bootstrap?.leaderboard ?? []} />}
      {activeView === "admin" && bootstrap?.profile?.role === "admin" && <section className="peakpool-admin" aria-labelledby="peakpool-admin-title">
        <div className="peakpool-section-head"><div><p className="peakpool-kicker">Protected controls</p><h2 id="peakpool-admin-title">Fantasy administrator</h2></div></div>
        {error && <p className="peakpool-error" role="status">{error}</p>}
        <PeakpoolAdminSettings settings={admin?.settings} players={adminRows("players") as Array<{ id: string; display_name: string; role: string; balance: string | number }>} onChanged={async () => { await refresh(); await refreshAdmin(); }} />
        <PeakpoolAdminResults races={(bootstrap?.meetings ?? []).flatMap((meeting) => meeting.races)} onChanged={async () => { await refresh(); await refreshAdmin(); }} />
        <PeakpoolAdminAudit audit={adminRows("audit")} bets={adminRows("bets")} observations={adminRows("observations")} />
      </section>}
    </div>
  );
}

export default function Peakpool() {
  return <FantasyAuthProvider><PeakpoolContent /></FantasyAuthProvider>;
}
