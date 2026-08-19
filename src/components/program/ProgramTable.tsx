import { type ProgData } from "../../lib/prog";

interface ProgramTableProps {
  day: string;
  items: ProgData["schedule"];
  onWatch: (url: string) => void;
}

export default function ProgramTable({ day, items, onWatch }: ProgramTableProps) {
  return (
    <section className="day-section">
      <h2 className="day-title">{day}</h2>
      <div className="table-container">
        <table className="prog-table">
          <thead>
            <tr>
              <th>Time</th>
              <th>Matchup</th>
              <th>Channel</th>
              <th>Link</th>
            </tr>
          </thead>
          <tbody>
            {items
              .slice()
              .sort((a, b) => a.time.localeCompare(b.time))
              .map((row, i) => (
                <tr key={`${day}-${i}`}>
                  <td className="cell-time" data-label="Time">{row.time}</td>
                  <td className="cell-matchup" data-label="Matchup">{row.matchup}</td>
                  <td className="cell-channel" data-label="Channel">
                    {[row.channelGroup, row.channelCode]
                      .filter(Boolean)
                      .map((s) => String(s).toUpperCase())
                      .join(" · ")}
                  </td>
                  <td className="action-cell" data-label="Links">
                    <a
                      href={row.url}
                      target="_blank"
                      rel="noreferrer"
                      className="link-open"
                    >
                      Open
                    </a>
                    <button
                      onClick={() => onWatch(row.url)}
                      className="btn btn-outline"
                      aria-label={`Open player for ${row.matchup}`}
                      title="Open separately for browser playback, Picture-in-Picture, and casting controls"
                      type="button"
                    >
                      Open player <span aria-hidden="true">↗</span>
                    </button>
                  </td>
                </tr>
              ))}
          </tbody>
        </table>
      </div>
    </section>
  );
}
