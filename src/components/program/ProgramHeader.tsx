import { type ProgData } from "../../lib/prog";

interface ProgramHeaderProps {
  header: ProgData["header"];
}

export default function ProgramHeader({ header }: ProgramHeaderProps) {
  return (
    <div className="guide-meta">
      {header.lastUpdate && (
        <div>
          <strong>Last Update:</strong> {header.lastUpdate}
        </div>
      )}
      {header.contactEmails.length > 0 && (
        <div>
          <strong>Contacts:</strong> {header.contactEmails.join(" · ")}
        </div>
      )}
      {header.extraLinks.length > 0 && (
        <div className="extra-links">
          <strong>Extra Links:</strong>{" "}
          {header.extraLinks.map((x) => (
            <a
              key={x.url}
              href={x.url}
              target="_blank"
              rel="noreferrer"
              className="link-open"
            >
              {x.label}
            </a>
          ))}
        </div>
      )}
    </div>
  );
}
