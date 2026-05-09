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
                  <td className="cell-time">{row.time}</td>
                  <td className="cell-matchup">{row.matchup}</td>
                  <td className="cell-channel">
                    {[row.channelGroup, row.channelCode]
                      .filter(Boolean)
                      .map((s) => String(s).toUpperCase())
                      .join(" · ")}
                  </td>
                  <td className="action-cell">
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
                      style={{ padding: "4px 8px", fontSize: "0.75rem" }}
                    >
                      Watch here
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
