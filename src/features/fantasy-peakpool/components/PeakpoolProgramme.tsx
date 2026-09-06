import { useEffect, useMemo, useState } from "react";
import { createFantasyProgrammeView } from "../programme-view";
import type { FantasyMeeting, FantasyRace, FantasyRunner } from "../types";

function mauritiusTime(value: string): string {
  const date = new Date(value);
  if (!Number.isFinite(date.getTime())) return "Time unavailable";
  return new Intl.DateTimeFormat("en-MU", {
    timeZone: "Indian/Mauritius", hour: "2-digit", minute: "2-digit", hourCycle: "h23",
  }).format(date);
}

export default function PeakpoolProgramme({
  meetings,
  onSelect,
  selectedRunnerId,
}: {
  meetings: FantasyMeeting[];
  onSelect: (race: FantasyRace, runner: FantasyRunner) => void;
  selectedRunnerId?: string;
}) {
  const [activeMeetingKey, setActiveMeetingKey] = useState<string>();
  const [expandedRaceId, setExpandedRaceId] = useState<string | null>(null);
  const view = useMemo(() => createFantasyProgrammeView(meetings, activeMeetingKey), [activeMeetingKey, meetings]);
  useEffect(() => {
    if (view.activeKey !== activeMeetingKey) setActiveMeetingKey(view.activeKey);
  }, [activeMeetingKey, view.activeKey]);
  useEffect(() => { setExpandedRaceId(null); }, [view.activeKey]);

  if (!meetings.length) {
    return <div className="peakpool-empty" role="status"><strong>No fantasy races available</strong><span>Today's canonical programme has not been synchronized yet.</span></div>;
  }
  const meeting = view.activeMeeting;
  if (!meeting) return null;
  return (
    <div className="peakpool-programme-browser">
      <div className="peakpool-programme-summary" role="status">
        <strong>{view.totalRaces} races</strong>
        <span>from today&apos;s SMSPariaz daily PDF</span>
        <small>{meetings.length} meetings · select a meeting, then expand a race</small>
      </div>
      <div className="peakpool-meeting-tabs" aria-label="Choose a race meeting" role="tablist">
        {view.meetingOptions.map((option) => (
          <button
            aria-selected={option.key === view.activeKey}
            className={option.key === view.activeKey ? "is-active" : ""}
            key={option.key}
            onClick={() => setActiveMeetingKey(option.key)}
            role="tab"
            type="button"
          >
            <span>R{option.meetingNumber}</span>
            <strong>{option.racecourse}</strong>
            <small>{option.raceCount} races</small>
          </button>
        ))}
      </div>
      <section className="peakpool-meeting" key={`${meeting.meetingNumber}-${meeting.racecourse}`} role="tabpanel">
        <header>
          <div><span>Meeting {meeting.meetingNumber}</span><h3>{meeting.racecourse}</h3></div>
          <small>{meeting.races.length} races</small>
        </header>
        <div className="peakpool-races">
          {meeting.races.map((race) => (
            <article className={`peakpool-race${expandedRaceId === race.id ? " is-expanded" : ""}`} key={race.id}>
              <button
                aria-expanded={expandedRaceId === race.id}
                className="peakpool-race-head"
                onClick={() => setExpandedRaceId(expandedRaceId === race.id ? null : race.id)}
                type="button"
              >
                <div><span className="peakpool-race-id">{race.externalRaceId}</span><h4>{race.raceName ?? `Race ${race.raceNumber}`}</h4></div>
                <div className="peakpool-race-meta">
                  <div className="peakpool-race-time"><strong>{mauritiusTime(race.officialOffAt)}</strong><span>{race.state.replaceAll("_", " ")}</span></div>
                  <span aria-hidden="true" className="peakpool-disclosure">⌄</span>
                </div>
              </button>
              {expandedRaceId === race.id && (
                race.runners.length ? (
                  <div className="peakpool-runner-list" role="list">
                    {race.runners.map((runner) => (
                      <div className="peakpool-runner" key={runner.id} role="listitem">
                        <span className="peakpool-runner-number">{runner.number}</span>
                        <span className="peakpool-runner-name">{runner.name}</span>
                        <span className="peakpool-runner-price">
                          <strong>PMU final dividend</strong>
                          <small>{runner.available ? "Priced after result" : "Non-runner"}</small>
                        </span>
                        <button
                          aria-pressed={selectedRunnerId === runner.id}
                          disabled={!runner.available}
                          onClick={() => onSelect(race, runner)}
                          type="button"
                        >WIN</button>
                      </div>
                    ))}
                  </div>
                ) : <p className="peakpool-runners-unavailable">Runners have not been reconciled for this canonical race.</p>
              )}
            </article>
          ))}
        </div>
      </section>
    </div>
  );
}
