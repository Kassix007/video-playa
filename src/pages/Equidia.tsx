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

type CouncilSubmissionState = "idle" | "submitting" | "sent" | "error";

type ChatGPTAppBridge = {
  sendFollowUpMessage?: (message: {
    prompt: string;
    scrollToBottom?: boolean;
  }) => Promise<void> | void;
};

declare global {
  interface Window {
    openai?: ChatGPTAppBridge;
  }
}

const COUNCIL_RESULT_FIELDS = [
  "Most likely winner",
  "Principal danger",
  "Best value horse",
  "Final ranking",
  "Win probabilities",
  "Confidence",
  "Strongest reason selection could lose",
  "Final selection",
] as const;

function hasCouncilBridge(): boolean {
  return typeof window !== "undefined"
    && typeof window.openai?.sendFollowUpMessage === "function";
}

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
  const [councilCommand, setCouncilCommand] = useState("");
  const [councilBridgeAvailable, setCouncilBridgeAvailable] = useState(hasCouncilBridge);
  const [councilSubmissionState, setCouncilSubmissionState] = useState<CouncilSubmissionState>("idle");

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

  useEffect(() => {
    const detectCouncilBridge = () => setCouncilBridgeAvailable(hasCouncilBridge());

    detectCouncilBridge();
    window.addEventListener("focus", detectCouncilBridge);
    document.addEventListener("visibilitychange", detectCouncilBridge);

    return () => {
      window.removeEventListener("focus", detectCouncilBridge);
      document.removeEventListener("visibilitychange", detectCouncilBridge);
    };
  }, []);

  const maxBandwidth = useMemo(
    () => manifestState.status === "ready"
      ? Math.max(...manifestState.manifest.variants.map((variant) => variant.bandwidth || 0), 1)
      : 1,
    [manifestState],
  );

  const audioLabel = manifestState.status === "ready"
    ? languageName(manifestState.manifest.audio?.language || null)
    : "Checking";

  const councilCommandReady = councilCommand.trim().length > 0;

  const runCouncil = async (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();

    const prompt = councilCommand.trim();
    const bridge = window.openai;

    if (!prompt || typeof bridge?.sendFollowUpMessage !== "function") {
      setCouncilBridgeAvailable(false);
      return;
    }

    setCouncilSubmissionState("submitting");

    try {
      await bridge.sendFollowUpMessage({ prompt, scrollToBottom: true });
      setCouncilSubmissionState("sent");
    } catch {
      setCouncilSubmissionState("error");
    }
  };

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

      <section className="equidia-council" aria-labelledby="equidia-council-heading">
        <header className="equidia-council-head">
          <div>
            <span className="equidia-section-mark">HORSEE / race command desk</span>
            <h2 id="equidia-council-heading">Horse Racing Council</h2>
          </div>
          <p
            className="equidia-council-bridge"
            data-state={councilBridgeAvailable ? "online" : "offline"}
            aria-live="polite"
          >
            <i aria-hidden="true" />
            {councilBridgeAvailable ? "Council bridge online" : "Council bridge offline"}
          </p>
        </header>

        <div className="equidia-council-console">
          <form className="equidia-council-form" onSubmit={runCouncil}>
            <label htmlFor="equidia-council-command">
              Council command
              <span>Race + horse, with optional mode</span>
            </label>
            <div className="equidia-council-controls">
              <input
                id="equidia-council-command"
                type="text"
                value={councilCommand}
                onChange={(event) => {
                  setCouncilCommand(event.target.value);
                  if (councilSubmissionState !== "submitting") setCouncilSubmissionState("idle");
                }}
                placeholder="R1C1 hard"
                autoComplete="off"
                spellCheck={false}
                aria-describedby="equidia-council-help equidia-council-feedback"
              />
              <button
                className="equidia-council-run"
                type="submit"
                disabled={!councilBridgeAvailable || !councilCommandReady || councilSubmissionState === "submitting"}
              >
                {councilSubmissionState === "submitting" ? "Sending…" : "Run Council"}
              </button>
            </div>
            <p id="equidia-council-help" className="equidia-council-help">
              Try <code>R1C1 hard</code>, <code>R2C7 hard</code>, or <code>R1C4</code>.
            </p>
          </form>

          <div id="equidia-council-feedback" className="equidia-council-feedback" aria-live="polite">
            {!councilBridgeAvailable && (
              <>
                <strong>Council bridge offline</strong>
                <span>Open HORSEE through ChatGPT to run the Council.</span>
              </>
            )}
            {councilBridgeAvailable && councilSubmissionState === "idle" && (
              <>
                <strong>ChatGPT is ready</strong>
                <span>Your command will be sent as a follow-up message.</span>
              </>
            )}
            {councilBridgeAvailable && councilSubmissionState === "submitting" && (
              <>
                <strong>Sending to ChatGPT</strong>
                <span>Handing the command to the active conversation.</span>
              </>
            )}
            {councilBridgeAvailable && councilSubmissionState === "sent" && (
              <>
                <strong>Command submitted</strong>
                <span>The Council is continuing in your ChatGPT conversation.</span>
              </>
            )}
            {councilBridgeAvailable && councilSubmissionState === "error" && (
              <>
                <strong>Command not submitted</strong>
                <span>ChatGPT did not accept the follow-up. Please try again.</span>
              </>
            )}
          </div>
        </div>

        <div className="equidia-council-results" aria-labelledby="equidia-council-results-heading">
          <div className="equidia-council-results-head">
            <span className="equidia-section-mark">Council return / prepared fields</span>
            <h3 id="equidia-council-results-heading">Selection board</h3>
          </div>
          <dl>
            {COUNCIL_RESULT_FIELDS.map((field) => (
              <div key={field}>
                <dt>{field}</dt>
                <dd>Awaiting Council result</dd>
              </div>
            ))}
          </dl>
        </div>
      </section>

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
