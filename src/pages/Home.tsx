import { useMemo, useState, type CSSProperties } from "react";
import { parseProg, type ProgData } from "../lib/prog";
import { Helmet } from "react-helmet-async";
import SiteHeader from "../components/SiteHeader";

const dayOrder = [
  "MONDAY",
  "TUESDAY",
  "WEDNESDAY",
  "THURSDAY",
  "FRIDAY",
  "SATURDAY",
  "SUNDAY",
  "UNSPECIFIED",
];

const th: CSSProperties = {
  textAlign: "left",
  borderBottom: "1px solid #ddd",
  padding: 8,
  fontWeight: 600,
};

const td: CSSProperties = {
  borderBottom: "1px solid #eee",
  padding: 8,
  verticalAlign: "top",
};

export default function Home() {
  const [data, setData] = useState<ProgData | null>(null);
  const [loading, setLoading] = useState(false);
  const [err, setErr] = useState<string | null>(null);
  const [selectedUrl, setSelectedUrl] = useState<string | null>(null);
  const url = import.meta.env.VITE_PROG_TXT_URL || "/prog.txt"; // fallback

  async function handleBuild() {
    setLoading(true);
    setErr(null);
    try {
      const res = await fetch(url, { cache: "no-store" });
      if (!res.ok)
        throw new Error(`Fetch failed: ${res.status} ${res.statusText}`);
      const text = await res.text();
      const parsed = parseProg(text);
      setData(parsed);
    } catch (e: unknown) {
      const message =
        typeof e === "object" && e !== null && "message" in e
          ? String((e as { message?: unknown }).message)
          : "Unknown error";
      setErr(message);
      setData(null);
    } finally {
      setLoading(false);
    }
  }

  const grouped = useMemo(() => {
    if (!data) return {};
    return data.schedule.reduce<Record<string, typeof data.schedule>>(
      (acc, item) => {
        (acc[item.day] ||= []).push(item);
        return acc;
      },
      {}
    );
  }, [data]);

  return (
    <>
      <Helmet>
        <title>Home | Video Playa  | Arnold Pilon</title>
      </Helmet>

      <SiteHeader
        title="Welcome to Video Playa"
        subtitle="A minimal, fast, and clean starter deployed on GitHub Pages."
        rightSlot={
          <a className="btn" href="#/about">
            Learn more
          </a>
        }
      />

      <div style={{ maxWidth: 960, margin: "0 auto", padding: 16 }}>
        <h1 style={{ fontSize: 24, marginBottom: 8 }}>Program Guide</h1>

        <button
          onClick={handleBuild}
          disabled={loading}
          style={{
            padding: "8px 14px",
            borderRadius: 8,
            border: "1px solid #ccc",
            cursor: loading ? "not-allowed" : "pointer",
            marginBottom: 12,
          }}
        >
          {loading ? "Building…" : "Build links"}
        </button>

        {err && (
          <p style={{ color: "crimson", marginBottom: 12 }}>
            {err} {err.includes("Failed to fetch") && "(CORS/HTTPS issue?)"}
          </p>
        )}

        {data && (
          <>
            <div style={{ fontSize: 14, marginBottom: 12 }}>
              {data.header.lastUpdate && (
                <div>
                  <strong>Last Update:</strong> {data.header.lastUpdate}
                </div>
              )}
              {data.header.contactEmails.length > 0 && (
                <div>
                  <strong>Contacts:</strong>{" "}
                  {data.header.contactEmails.join(" · ")}
                </div>
              )}
              {data.header.extraLinks.length > 0 && (
                <div style={{ marginTop: 6 }}>
                  <strong>Extra Links:</strong>{" "}
                  {data.header.extraLinks.map((x) => (
                    <a
                      key={x.url}
                      href={x.url}
                      target="_blank"
                      rel="noreferrer"
                      style={{ marginRight: 12 }}
                    >
                      {x.label}
                    </a>
                  ))}
                </div>
              )}
            </div>

            {dayOrder
              .filter((d) => grouped[d]?.length)
              .map((day) => (
                <section key={day} style={{ marginBottom: 20 }}>
                  <h2 style={{ fontSize: 18, margin: "8px 0" }}>{day}</h2>
                  <div style={{ overflowX: "auto" }}>
                    <table
                      style={{ width: "100%", borderCollapse: "collapse" }}
                    >
                      <thead>
                        <tr>
                          <th style={th}>Time</th>
                          <th style={th}>Matchup</th>
                          <th style={th}>Channel</th>
                          <th style={th}>Link</th>
                        </tr>
                      </thead>
                      <tbody>
                        {grouped[day]
                          .slice()
                          .sort((a, b) => a.time.localeCompare(b.time))
                          .map((row, i) => (
                            <tr key={`${day}-${i}`}>
                              <td style={td}>{row.time}</td>
                              <td style={td}>{row.matchup}</td>
                              <td style={td}>
                                {[row.channelGroup, row.channelCode]
                                  .filter(Boolean)
                                  .map((s) => String(s).toUpperCase())
                                  .join(" · ")}
                              </td>
                              <td style={td}>
                                <a
                                  href={row.url}
                                  target="_blank"
                                  rel="noreferrer"
                                  style={{ marginRight: 8 }}
                                >
                                  Open
                                </a>
                                <button
                                  onClick={() => setSelectedUrl(row.url)}
                                  style={{
                                    padding: "4px 8px",
                                    borderRadius: 6,
                                    border: "1px solid #ccc",
                                    cursor: "pointer",
                                  }}
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
              ))}
          </>
        )}

        {selectedUrl && (
          <div
            role="dialog"
            aria-modal="true"
            onClick={() => setSelectedUrl(null)}
            style={{
              position: "fixed",
              inset: 0,
              background: "rgba(0,0,0,.55)",
              display: "grid",
              placeItems: "center",
              padding: 16,
              zIndex: 1000,
            }}
          >
            <div
              onClick={(e) => e.stopPropagation()}
              style={{
                width: "min(100%, 1100px)",
                aspectRatio: "16/9",
                background: "#000",
                borderRadius: 10,
                overflow: "hidden",
                position: "relative",
                border: "1px solid #444",
              }}
            >
              <button
                onClick={() => setSelectedUrl(null)}
                aria-label="Close"
                style={{
                  position: "absolute",
                  top: 8,
                  right: 8,
                  padding: "6px 10px",
                  borderRadius: 8,
                  border: "1px solid #666",
                  background: "rgba(20,20,20,.7)",
                  color: "#fff",
                  zIndex: 2,
                }}
              >
                ✕
              </button>

              <iframe
                src={selectedUrl}
                title="Now Playing"
                allow="autoplay; encrypted-media; picture-in-picture; fullscreen"
                // BLOCK popups/new tabs by NOT including `allow-popups`
                sandbox="allow-scripts allow-same-origin allow-presentation"
                referrerPolicy="no-referrer"
                allowFullScreen
                style={{
                  position: "absolute",
                  inset: 0,
                  width: "100%",
                  height: "100%",
                  border: 0,
                }}
              />
            </div>
          </div>
        )}
      </div>
    </>
  );
}
