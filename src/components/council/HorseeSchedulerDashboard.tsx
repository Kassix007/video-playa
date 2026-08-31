import { useEffect, useMemo, useState } from "react";
import {
  loadHorseeSchedulerStatus,
  type HorseePublicJob,
  type HorseeSchedulerStatus,
} from "../../services/horsee";

type SchedulerLoadState =
  | { status: "loading" }
  | { status: "ready"; value: HorseeSchedulerStatus }
  | { status: "error"; message: string; value?: HorseeSchedulerStatus };

function formatTimestamp(value: string | null): string {
  if (!value) return "No successful run yet";
  const date = new Date(value);
  if (!Number.isFinite(date.getTime())) return value;
  return new Intl.DateTimeFormat("en-GB", {
    timeZone: "Indian/Mauritius",
    day: "2-digit",
    month: "short",
    hour: "2-digit",
    minute: "2-digit",
    hourCycle: "h23",
  }).format(date);
}

function JobIdentity({ job }: { job: HorseePublicJob }) {
  return (
    <span className="equidia-scheduler-job-identity">
      <b>{job.off_time_mauritius}</b>
      <span>{job.race_id} · {job.racecourse}</span>
      <small>{job.mode ?? job.status}</small>
    </span>
  );
}

export default function HorseeSchedulerDashboard() {
  const [state, setState] = useState<SchedulerLoadState>({ status: "loading" });
  const [copyMessage, setCopyMessage] = useState("Select a READY job to copy its self-contained HARD prompt.");

  useEffect(() => {
    let active = true;
    let controller: AbortController | null = null;
    const load = async () => {
      if (document.visibilityState === "hidden") return;
      controller?.abort();
      controller = new AbortController();
      try {
        const value = await loadHorseeSchedulerStatus(controller.signal);
        if (active) setState({ status: "ready", value });
      } catch (error) {
        if (active && !controller.signal.aborted) {
          setState((current) => ({
            status: "error",
            message: error instanceof Error ? error.message : "Scheduler status could not be loaded.",
            value: current.status === "ready" || current.status === "error" ? current.value : undefined,
          }));
        }
      }
    };
    const onVisibility = () => { if (document.visibilityState === "visible") void load(); };
    void load();
    const interval = window.setInterval(() => void load(), 30_000);
    document.addEventListener("visibilitychange", onVisibility);
    return () => {
      active = false;
      controller?.abort();
      window.clearInterval(interval);
      document.removeEventListener("visibilitychange", onVisibility);
    };
  }, []);

  const snapshot = state.status === "ready" || state.status === "error" ? state.value : undefined;
  const readyJobs = useMemo(() => snapshot
    ? snapshot.upcoming_jobs.filter((job) => job.status === "READY" && job.prompt)
    : [], [snapshot]);
  const nextJob = snapshot?.upcoming_jobs.find((job) => !["SAVED", "MISSED"].includes(job.status)) ?? null;

  const copyPrompt = async (job: HorseePublicJob) => {
    if (!job.prompt) return;
    try {
      await navigator.clipboard.writeText(job.prompt);
      setCopyMessage(`${job.race_id} HARD prompt copied.`);
    } catch {
      setCopyMessage("Prompt copy failed. Check clipboard permission and try again.");
    }
  };

  return (
    <section className="equidia-scheduler" aria-labelledby="equidia-scheduler-heading">
      <header className="equidia-scheduler-head">
        <div>
          <span className="equidia-section-mark">Autopilot / Mauritius clock</span>
          <h3 id="equidia-scheduler-heading">HORSEE scheduler</h3>
        </div>
        <p className="equidia-scheduler-health" data-state={state.status === "ready" ? state.value.archive.status.toLowerCase() : state.status}>
          <i aria-hidden="true" />
          {state.status === "loading" && "Reading queue"}
          {state.status === "error" && (state.value ? "Showing last good status" : "Scheduler unavailable")}
          {state.status === "ready" && `Archive ${state.value.archive.status.toLowerCase().replace("_", " ")}`}
        </p>
      </header>

      {state.status === "loading" && <p className="equidia-scheduler-message">Loading today&apos;s queue…</p>}
      {state.status === "error" && (
        <div className="equidia-scheduler-message" data-state="error" role="alert">
          <strong>Status could not be loaded.</strong> {state.message}
        </div>
      )}
      {snapshot && (
        <>
          <dl className="equidia-scheduler-metrics">
            <div><dt>Programme</dt><dd>{snapshot.counts.programme}</dd></div>
            <div><dt>Ready</dt><dd>{snapshot.counts.ready}</dd></div>
            <div><dt>Saved</dt><dd>{snapshot.counts.completed}</dd></div>
            <div><dt>Recovery</dt><dd>{snapshot.upcoming_jobs.filter((job) => job.mode === "RECOVERY").length}</dd></div>
            <div><dt>Failed</dt><dd>{snapshot.counts.failed}</dd></div>
            <div><dt>Missed</dt><dd>{snapshot.counts.missed}</dd></div>
          </dl>

          <div className="equidia-scheduler-grid">
            <article className="equidia-scheduler-next">
              <span>Next operational job</span>
              {nextJob ? <JobIdentity job={nextJob} /> : <strong>Queue clear</strong>}
              <p>Last run {formatTimestamp(snapshot.last_run_at)} · revision {snapshot.revision}</p>
            </article>

            <article className="equidia-scheduler-archive-health">
              <span>Archive continuity</span>
              <strong>{snapshot.archive.last_archived_day ?? "No archived day yet"}</strong>
              <p>{snapshot.archive.repo ?? "Archive writes not configured"} · {snapshot.archive.pending_days} pending</p>
              {(snapshot.archive.last_error || snapshot.last_error) && <small>{snapshot.archive.last_error ?? snapshot.last_error}</small>}
            </article>
          </div>

          <div className="equidia-scheduler-ready">
            <div>
              <span className="equidia-section-mark">READY / queue-only handoff</span>
              <h4>Copy HARD prompt</h4>
            </div>
            {readyJobs.length ? (
              <ul>
                {readyJobs.map((job) => (
                  <li key={job.id}>
                    <JobIdentity job={job} />
                    <button type="button" onClick={() => void copyPrompt(job)} aria-describedby="equidia-scheduler-copy-status">
                      Copy prompt
                    </button>
                  </li>
                ))}
              </ul>
            ) : <p>No READY prompts at this scheduler observation.</p>}
            <p id="equidia-scheduler-copy-status" className="equidia-scheduler-copy-status" aria-live="polite">{copyMessage}</p>
          </div>
        </>
      )}
    </section>
  );
}
