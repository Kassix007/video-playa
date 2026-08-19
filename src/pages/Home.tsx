import { useMemo, useState } from "react";
import { Helmet } from "react-helmet-async";
import ProgramHeader from "../components/program/ProgramHeader";
import ProgramTable from "../components/program/ProgramTable";
import SiteHeader from "../components/SiteHeader";
import { parseProg, type ProgData } from "../lib/prog";

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

export default function Home() {
  const [data, setData] = useState<ProgData | null>(null);
  const [loading, setLoading] = useState(false);
  const [err, setErr] = useState<string | null>(null);
  const url = import.meta.env.VITE_PROG_TXT_URL || "/prog.txt";

  function handleLaunchPlayer(streamUrl: string) {
    const compactLayout = window.matchMedia("(max-width: 760px)").matches;
    const width = Math.min(1280, Math.max(720, window.screen.availWidth - 96));
    const height = Math.min(800, Math.max(520, window.screen.availHeight - 96));
    const left = Math.max(0, Math.round((window.screen.availWidth - width) / 2));
    const top = Math.max(0, Math.round((window.screen.availHeight - height) / 2));
    const features = compactLayout
      ? undefined
      : `popup=yes,width=${width},height=${height},left=${left},top=${top}`;
    const playerWindow = window.open(streamUrl, "_blank", features);

    if (playerWindow) {
      playerWindow.opener = null;
      return;
    }

    window.location.assign(streamUrl);
  }

  async function handleBuild() {
    setLoading(true);
    setErr(null);

    try {
      const res = await fetch(url, { cache: "no-store" });
      if (!res.ok) throw new Error(`Fetch failed: ${res.status} ${res.statusText}`);

      const text = await res.text();
      setData(parseProg(text));
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

    return data.schedule.reduce<Record<string, typeof data.schedule>>((acc, item) => {
      (acc[item.day] ||= []).push(item);
      return acc;
    }, {});
  }, [data]);

  return (
    <>
      <Helmet>
        <title>Home | Video Playa | Arnold Pilon</title>
      </Helmet>

      <SiteHeader
        eyebrow="Tonight’s stream board"
        title="The game is on. Find your feed."
        subtitle="A clean, fast program guide for live fixtures—built for the next kickoff."
        rightSlot={
          <a className="btn" href="#/about">
            How it works <span aria-hidden="true">↗</span>
          </a>
        }
      />

      <div className="guide-shell">
        <h2 className="guide-title">Program Guide</h2>

        <button
          className="btn btn-outline"
          disabled={loading}
          onClick={handleBuild}
          style={{ marginBottom: 12 }}
          type="button"
        >
          {loading ? "Building..." : "Build links"}
        </button>

        {err && (
          <p className="error-text">
            {err} {err.includes("Failed to fetch") && "(CORS/HTTPS issue?)"}
          </p>
        )}

        {data && (
          <>
            <ProgramHeader header={data.header} />

            <aside className="playback-note" aria-label="Playback options">
              <span className="playback-note-mark" aria-hidden="true">↗</span>
              <div>
                <strong>Playback opens separately</strong>
                <p>Use the player or browser controls for Picture-in-Picture, Cast, AirPlay, or screen mirroring.</p>
              </div>
            </aside>

            {dayOrder
              .filter((day) => grouped[day]?.length)
              .map((day) => (
                <ProgramTable day={day} items={grouped[day]} key={day} onWatch={handleLaunchPlayer} />
              ))}
          </>
        )}
      </div>
    </>
  );
}
