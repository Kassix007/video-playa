import { useEffect, useMemo, useState } from "react";
import {
  getMauritiusToday,
  loadCouncilHistoryDate,
  loadCouncilHistoryDates,
  loadTodayCouncil,
  type CouncilDateCount,
  type CouncilDay,
  type CouncilHorse,
  type CouncilResult,
} from "../../services/council";

type LoadState<T> =
  | { status: "loading" }
  | { status: "ready"; value: T }
  | { status: "error"; message: string };

type ArchiveView = "today" | "history";
type HistorySort = "chronological" | "newest";

const WEEKDAYS = ["Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"];

function formatHorse(horse: CouncilHorse): string {
  return `#${horse.number} ${horse.name} — ${horse.probability}%`;
}

function formatAnalysedAt(value: string): string {
  return new Intl.DateTimeFormat("en-GB", {
    timeZone: "Indian/Mauritius",
    dateStyle: "medium",
    timeStyle: "short",
  }).format(new Date(value));
}

function formatArchiveDate(value: string): string {
  const [year, month, day] = value.split("-").map(Number);
  return new Intl.DateTimeFormat("en-GB", {
    weekday: "long",
    day: "numeric",
    month: "long",
    year: "numeric",
    timeZone: "UTC",
  }).format(new Date(Date.UTC(year, month - 1, day)));
}

function monthLabel(value: string): string {
  const [year, month] = value.split("-").map(Number);
  return new Intl.DateTimeFormat("en-GB", {
    month: "long",
    year: "numeric",
    timeZone: "UTC",
  }).format(new Date(Date.UTC(year, month - 1, 1)));
}

function shiftMonth(value: string, amount: number): string {
  const [year, month] = value.split("-").map(Number);
  const shifted = new Date(Date.UTC(year, month - 1 + amount, 1));
  return `${shifted.getUTCFullYear()}-${String(shifted.getUTCMonth() + 1).padStart(2, "0")}`;
}

function raceTimeValue(result: CouncilResult): number {
  const match = result.off_time.match(/(\d{1,2})\D(\d{2})/);
  return match ? Number(match[1]) * 60 + Number(match[2]) : Number.MAX_SAFE_INTEGER;
}

function CouncilRaceCard({ result }: { result: CouncilResult }) {
  return (
    <details className="equidia-council-card">
      <summary>
        <span className="equidia-council-card-time">{result.off_time}</span>
        <span className="equidia-council-card-race">
          <b>{result.race_id}</b>
          <strong>{result.racecourse} · Race {result.race_number}</strong>
          <small>{result.race_type} · {result.field_size} runners</small>
        </span>
        <span className="equidia-council-card-pick">
          <small>Final selection</small>
          <strong>{result.final_selection}</strong>
          <span>#{result.most_likely_winner.number} {result.most_likely_winner.name} · {result.most_likely_winner.probability}%</span>
          <span>Danger #{result.principal_danger.number} {result.principal_danger.name} · Value #{result.best_value.number} {result.best_value.name}</span>
          <time dateTime={result.analysed_at}>Analysed {formatAnalysedAt(result.analysed_at)} MUT · {result.council_status}</time>
        </span>
        <span className="equidia-confidence" data-confidence={result.confidence}>{result.confidence}</span>
      </summary>

      <div className="equidia-council-card-body">
        <dl className="equidia-council-card-facts">
          <div><dt>Race</dt><dd>{result.racecourse} R{result.race_number} · {result.off_time}</dd></div>
          <div><dt>Conditions</dt><dd>{result.distance} · {result.surface} · {result.going} · {result.race_type}</dd></div>
          <div><dt>Most likely winner</dt><dd>{formatHorse(result.most_likely_winner)}</dd></div>
          <div><dt>Principal danger</dt><dd>{formatHorse(result.principal_danger)}</dd></div>
          <div><dt>Best value</dt><dd>{formatHorse(result.best_value)}</dd></div>
          <div><dt>Confidence</dt><dd>{result.confidence}</dd></div>
          <div><dt>Strongest loss reason</dt><dd>{result.strongest_loss_reason}</dd></div>
          <div><dt>Final selection</dt><dd>{result.final_selection}</dd></div>
          <div><dt>Council status</dt><dd>{result.council_status}</dd></div>
          <div><dt>Analysed</dt><dd>{formatAnalysedAt(result.analysed_at)} MUT</dd></div>
        </dl>

        <div className="equidia-runner-ranking">
          <h4>Complete runner ranking</h4>
          <ol>
            {result.ranking.map((runner) => (
              <li key={runner.number}>
                <span>{runner.number}</span>
                <strong>{runner.name}</strong>
                <i aria-hidden="true"><b style={{ width: `${runner.probability}%` }} /></i>
                <em>{runner.probability}%</em>
              </li>
            ))}
          </ol>
        </div>
      </div>
    </details>
  );
}

function CouncilRaceList({
  results,
  emptyMessage,
  sort = "newest",
}: {
  results: CouncilResult[];
  emptyMessage: string;
  sort?: HistorySort;
}) {
  const sorted = useMemo(() => [...results].sort((left, right) => sort === "newest"
    ? Date.parse(right.analysed_at) - Date.parse(left.analysed_at)
    : raceTimeValue(left) - raceTimeValue(right) || left.race_number - right.race_number), [results, sort]);

  if (sorted.length === 0) return <p className="equidia-archive-empty">{emptyMessage}</p>;
  return <div className="equidia-council-card-list">{sorted.map((result, index) => <CouncilRaceCard key={`${result.race_id}-${result.analysed_at}-${index}`} result={result} />)}</div>;
}

function Calendar({
  month,
  dates,
  selectedDate,
  onSelect,
}: {
  month: string;
  dates: CouncilDateCount[];
  selectedDate: string | null;
  onSelect: (date: string) => void;
}) {
  const [year, monthNumber] = month.split("-").map(Number);
  const firstWeekday = (new Date(Date.UTC(year, monthNumber - 1, 1)).getUTCDay() + 6) % 7;
  const dayCount = new Date(Date.UTC(year, monthNumber, 0)).getUTCDate();
  const countByDate = new Map(dates.map((item) => [item.date, item.count]));
  const today = getMauritiusToday();

  return (
    <div className="equidia-calendar" role="grid" aria-label={`${monthLabel(month)} Council archive`}>
      <div className="equidia-calendar-weekdays" role="row">
        {WEEKDAYS.map((day) => <span role="columnheader" key={day}>{day}</span>)}
      </div>
      <div className="equidia-calendar-days">
        {Array.from({ length: firstWeekday }, (_, index) => <span key={`blank-${index}`} aria-hidden="true" />)}
        {Array.from({ length: dayCount }, (_, index) => {
          const day = index + 1;
          const date = `${month}-${String(day).padStart(2, "0")}`;
          const count = countByDate.get(date) ?? 0;
          return (
            <button
              type="button"
              key={date}
              disabled={count === 0}
              data-selected={selectedDate === date || undefined}
              data-today={today === date || undefined}
              aria-label={`${formatArchiveDate(date)}${count ? `, ${count} Council analyses` : ", no Council analyses"}`}
              onClick={() => onSelect(date)}
            >
              <span>{day}</span>
              {count > 0 && <b>• {count}</b>}
            </button>
          );
        })}
      </div>
    </div>
  );
}

export default function CouncilArchive() {
  const today = getMauritiusToday();
  const [view, setView] = useState<ArchiveView>("today");
  const [todayState, setTodayState] = useState<LoadState<CouncilDay>>({ status: "loading" });
  const [month, setMonth] = useState(today.slice(0, 7));
  const [dateState, setDateState] = useState<LoadState<CouncilDateCount[]>>({ status: "loading" });
  const [selectedDate, setSelectedDate] = useState<string | null>(null);
  const [selectedDayState, setSelectedDayState] = useState<LoadState<CouncilDay> | null>(null);
  const [historySort, setHistorySort] = useState<HistorySort>("chronological");

  useEffect(() => {
    let active = true;
    const load = async () => {
      try {
        const day = await loadTodayCouncil();
        if (active) setTodayState({ status: "ready", value: day });
      } catch (error) {
        if (active) setTodayState({ status: "error", message: error instanceof Error ? error.message : "Today's Council could not be loaded." });
      }
    };
    const loadWhenVisible = () => {
      if (document.visibilityState === "visible") void load();
    };
    void load();
    const interval = window.setInterval(() => void load(), 15_000);
    window.addEventListener("focus", loadWhenVisible);
    document.addEventListener("visibilitychange", loadWhenVisible);
    return () => {
      active = false;
      window.clearInterval(interval);
      window.removeEventListener("focus", loadWhenVisible);
      document.removeEventListener("visibilitychange", loadWhenVisible);
    };
  }, []);

  useEffect(() => {
    if (view !== "history") return;
    const controller = new AbortController();
    setDateState({ status: "loading" });
    setSelectedDate(null);
    setSelectedDayState(null);
    void loadCouncilHistoryDates(month, controller.signal)
      .then((dates) => setDateState({ status: "ready", value: dates }))
      .catch((error: unknown) => {
        if (!controller.signal.aborted) setDateState({ status: "error", message: error instanceof Error ? error.message : "The Council calendar could not be loaded." });
      });
    return () => controller.abort();
  }, [month, view]);

  useEffect(() => {
    if (!selectedDate) return;
    const controller = new AbortController();
    setSelectedDayState({ status: "loading" });
    void loadCouncilHistoryDate(selectedDate, controller.signal)
      .then((day) => setSelectedDayState({ status: "ready", value: day }))
      .catch((error: unknown) => {
        if (!controller.signal.aborted) setSelectedDayState({ status: "error", message: error instanceof Error ? error.message : "That Council day could not be loaded." });
      });
    return () => controller.abort();
  }, [selectedDate]);

  return (
    <section className="equidia-council-archive" aria-labelledby="equidia-archive-heading">
      <header className="equidia-archive-head">
        <div>
          <span className="equidia-section-mark">Council ledger / Mauritius time</span>
          <h3 id="equidia-archive-heading">HORSEE analyses</h3>
        </div>
        <nav aria-label="HORSEE analysis views">
          <button type="button" data-active={view === "today" || undefined} onClick={() => setView("today")}>Today</button>
          <button type="button" data-active={view === "history" || undefined} onClick={() => setView("history")}>History</button>
        </nav>
      </header>

      {view === "today" && (
        <div className="equidia-archive-view">
          <div className="equidia-archive-title">
            <div>
              <h4>Today's Council</h4>
              <p>{todayState.status === "ready" ? formatArchiveDate(todayState.value.date) : "Current Mauritius day"}</p>
            </div>
            {todayState.status === "ready" && <strong>{todayState.value.count} {todayState.value.count === 1 ? "analysis" : "analyses"}</strong>}
          </div>
          {todayState.status === "loading" && <p className="equidia-archive-message">Loading today's saved analyses…</p>}
          {todayState.status === "error" && <p className="equidia-archive-message" data-state="error">{todayState.message}</p>}
          {todayState.status === "ready" && <CouncilRaceList results={todayState.value.results} emptyMessage="No Council analyses have been saved today yet." />}
        </div>
      )}

      {view === "history" && (
        <div className="equidia-archive-view">
          <div className="equidia-calendar-toolbar">
            <button type="button" aria-label="Previous month" onClick={() => setMonth((value) => shiftMonth(value, -1))}>←</button>
            <h4>{monthLabel(month)}</h4>
            <button type="button" aria-label="Next month" onClick={() => setMonth((value) => shiftMonth(value, 1))}>→</button>
            <button type="button" className="equidia-calendar-today" onClick={() => {
              setMonth(today.slice(0, 7));
              setView("today");
            }}>Return to today</button>
          </div>
          {dateState.status === "loading" && <p className="equidia-archive-message">Loading Council calendar…</p>}
          {dateState.status === "error" && <p className="equidia-archive-message" data-state="error">{dateState.message}</p>}
          {dateState.status === "ready" && <Calendar month={month} dates={dateState.value} selectedDate={selectedDate} onSelect={setSelectedDate} />}

          {selectedDate && (
            <div className="equidia-history-day">
              <div className="equidia-archive-title">
                <div><h4>{formatArchiveDate(selectedDate)}</h4><p>All saved Council analyses</p></div>
                <div className="equidia-history-sort" aria-label="Historical analysis order">
                  <button type="button" data-active={historySort === "chronological" || undefined} onClick={() => setHistorySort("chronological")}>Race time</button>
                  <button type="button" data-active={historySort === "newest" || undefined} onClick={() => setHistorySort("newest")}>Newest</button>
                </div>
              </div>
              {selectedDayState?.status === "loading" && <p className="equidia-archive-message">Loading saved analyses…</p>}
              {selectedDayState?.status === "error" && <p className="equidia-archive-message" data-state="error">{selectedDayState.message}</p>}
              {selectedDayState?.status === "ready" && <CouncilRaceList results={selectedDayState.value.results} sort={historySort} emptyMessage="No Council analyses were saved on this date." />}
            </div>
          )}
        </div>
      )}
    </section>
  );
}
