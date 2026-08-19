import { useEffect, useMemo, useState } from "react";
import { Helmet } from "react-helmet-async";
import StreamPlayer from "../components/player/StreamPlayer";
import {
  EQUIDIA_MASTER_URL,
  EQUIDIA_SOURCE,
  loadEquidiaManifest,
  type EquidiaManifest,
} from "../services/equidia";
import "./Equidia.css";

type ManifestState =
  | { status: "loading" }
  | { status: "ready"; manifest: EquidiaManifest }
  | { status: "error"; message: string };

function formatBandwidth(bandwidth: number | null): string {
  if (!bandwidth) return "Rate n/a";
  if (bandwidth >= 1_000_000) return `${(bandwidth / 1_000_000).toFixed(2)} Mb/s`;
  return `${Math.round(bandwidth / 1_000)} kb/s`;
}

function languageName(code: string | null): string {
  if (!code) return "Unspecified";
  if (["fra", "fre", "fr"].includes(code.toLowerCase())) return "French";
  return code.toUpperCase();
}

export default function Equidia() {
  const [manifestState, setManifestState] = useState<ManifestState>({ status: "loading" });
  const [refreshKey, setRefreshKey] = useState(0);

  useEffect(() => {
    const controller = new AbortController();
    setManifestState({ status: "loading" });

    void loadEquidiaManifest(controller.signal)
      .then((manifest) => setManifestState({ status: "ready", manifest }))
      .catch((error: unknown) => {
        if (controller.signal.aborted) return;
        setManifestState({
          status: "error",
          message: error instanceof Error ? error.message : "The live manifest could not be inspected.",
        });
      });

    return () => controller.abort();
  }, [refreshKey]);

  const maxBandwidth = useMemo(
    () => manifestState.status === "ready"
      ? Math.max(...manifestState.manifest.variants.map((variant) => variant.bandwidth || 0), 1)
      : 1,
    [manifestState],
  );

  const audioLabel = manifestState.status === "ready"
    ? languageName(manifestState.manifest.audio?.language || null)
    : "Checking";

  return (
    <div className="equidia-page">
      <Helmet>
        <title>Equidia Live | Video Playa</title>
        <meta
          name="description"
          content="A dedicated Equidia live desk with adaptive HLS playback, signal tiers, and source provenance."
        />
      </Helmet>

      <section className="equidia-hero" aria-labelledby="equidia-title">
        <div className="equidia-hero-copy">
          <p className="equidia-live-line">
            <span aria-hidden="true" /> On the rail <b>France / Live racing</b>
          </p>
          <h1 id="equidia-title">Equidia <em>Live</em></h1>
          <p className="equidia-deck">
            The French racing feed, pulled out of the directory and given its own desk. One adaptive
            master chooses the best available lane for your screen.
          </p>
          <div className="equidia-hero-actions">
            <a href="#equidia-player" className="equidia-primary-action">Watch the signal <span aria-hidden="true">↓</span></a>
            <a href={EQUIDIA_MASTER_URL} target="_blank" rel="noreferrer">Read the master file <span aria-hidden="true">↗</span></a>
          </div>
        </div>

        <div className="equidia-tote" aria-label="Equidia channel facts">
          <span className="equidia-tote-index" aria-hidden="true">EQ<br />01</span>
          <dl>
            <div><dt>Transport</dt><dd>Adaptive HLS</dd></div>
            <div><dt>Sound</dt><dd>{audioLabel}</dd></div>
            <div><dt>Source</dt><dd>Community master</dd></div>
          </dl>
          <p>Live availability is decided upstream.</p>
        </div>

        <div className="equidia-running-rail" aria-hidden="true">
          <span>1080</span><span>720</span><span>480</span><span>240</span><span>144</span>
        </div>
      </section>

      <div id="equidia-player" className="equidia-player-anchor">
        <StreamPlayer autoPlay source={EQUIDIA_SOURCE} />
      </div>

      <section className="equidia-signal-board" aria-labelledby="equidia-signal-heading">
        <header className="equidia-board-head">
          <div>
            <span className="equidia-section-mark">Live manifest / adaptive ladder</span>
            <h2 id="equidia-signal-heading">Signal board</h2>
          </div>
          <p className="equidia-board-status" data-state={manifestState.status} aria-live="polite">
            <i aria-hidden="true" />
            {manifestState.status === "loading" && "Reading master"}
            {manifestState.status === "ready" && `${manifestState.manifest.variants.length} lanes reported`}
            {manifestState.status === "error" && "Metadata unavailable"}
          </p>
        </header>

        {manifestState.status === "loading" && (
          <div className="equidia-board-loading" role="status">
            <span aria-hidden="true">01</span>
            <p>Inspecting the public master while the player tunes independently.</p>
          </div>
        )}

        {manifestState.status === "error" && (
          <div className="equidia-board-error" role="status">
            <div>
              <strong>The tote board did not refresh.</strong>
              <p>{manifestState.message} The known master is still assigned to the player above.</p>
            </div>
            <button className="equidia-secondary-action" type="button" onClick={() => setRefreshKey((key) => key + 1)}>
              Read again
            </button>
          </div>
        )}

        {manifestState.status === "ready" && (
          <>
            <div className="equidia-board-metrics" aria-label="Manifest summary">
              <div><span>Renditions</span><strong>{String(manifestState.manifest.variants.length).padStart(2, "0")}</strong></div>
              <div><span>Default audio</span><strong>{languageName(manifestState.manifest.audio?.language || null)}</strong></div>
              <div><span>Selection</span><strong>Automatic</strong></div>
            </div>

            <ol className="equidia-variant-list" aria-label="Advertised Equidia video renditions">
              {manifestState.manifest.variants.map((variant, index) => (
                <li key={variant.url}>
                  <span className="equidia-variant-index" aria-hidden="true">{String(index + 1).padStart(2, "0")}</span>
                  <div className="equidia-variant-name">
                    <strong>{variant.label}</strong>
                    <span>{variant.width && variant.height ? `${variant.width} × ${variant.height}` : "Adaptive tier"}</span>
                  </div>
                  <div className="equidia-variant-meter" aria-hidden="true">
                    <i style={{ width: `${Math.max(8, ((variant.bandwidth || 0) / maxBandwidth) * 100)}%` }} />
                  </div>
                  <span className="equidia-variant-rate">{formatBandwidth(variant.bandwidth)}</span>
                </li>
              ))}
            </ol>

            <footer className="equidia-board-foot">
              <p>{manifestState.manifest.refreshNote || "No refresh note was supplied by the manifest."}</p>
              <span>Metadata describes the playlist—not guaranteed playback.</span>
            </footer>
          </>
        )}
      </section>

      <aside className="equidia-boundary" aria-labelledby="equidia-boundary-title">
        <div className="equidia-boundary-number" aria-hidden="true">// 02</div>
        <div>
          <span className="equidia-section-mark">Transmission note</span>
          <h2 id="equidia-boundary-title">A readable map is not an open gate.</h2>
        </div>
        <p>
          GitHub serves the master file, but its audio and video lanes live on Hexaglobe. That media
          host can still enforce CORS, region, token, uptime, and codec rules. We use the browser's
          permitted path and keep the original source available; we do not forge a way around it.
        </p>
        <a href={EQUIDIA_MASTER_URL} target="_blank" rel="noreferrer">
          Open original source <span aria-hidden="true">↗</span>
        </a>
      </aside>
    </div>
  );
}
