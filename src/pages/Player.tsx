import { useState, type FormEvent } from "react";
import { Helmet } from "react-helmet-async";
import SiteHeader from "../components/SiteHeader";
import StreamPlayer from "../components/player/StreamPlayer";
import { normalizeMediaUrl, type MediaMode, type MediaSource } from "../lib/media";
import "./MediaPages.css";

const modes: Array<{ label: string; value: MediaMode }> = [
  { label: "Auto detect", value: "auto" },
  { label: "HLS / M3U8", value: "hls" },
  { label: "MPEG-DASH", value: "dash" },
  { label: "Direct file", value: "native" },
];

export default function Player() {
  const [input, setInput] = useState("");
  const [mode, setMode] = useState<MediaMode>("auto");
  const [source, setSource] = useState<MediaSource | null>(null);
  const [validationError, setValidationError] = useState<string | null>(null);

  const handleSubmit = (event: FormEvent<HTMLFormElement>) => {
    event.preventDefault();

    try {
      const url = normalizeMediaUrl(input);
      setValidationError(null);
      setSource({ mode, title: "Custom stream", url });
    } catch (error: unknown) {
      setValidationError(error instanceof Error ? error.message : "This media URL is not valid.");
    }
  };

  return (
    <>
      <Helmet>
        <title>Player | Video Playa</title>
        <meta
          name="description"
          content="Test public HLS, M3U8, MPEG-DASH, and browser-supported media URLs in Video Playa."
        />
      </Helmet>

      <SiteHeader
        eyebrow="Bring your own signal"
        title="One URL. Your screen."
        subtitle="Paste a public stream and let the player choose HLS, DASH, or the browser's native media path. No uploads and no account."
        railItems={["HLS + M3U8", "MPEG-DASH", "Native media", "PiP + Cast"]}
      />

      <section className="media-workbench" aria-labelledby="source-heading">
        <div className="media-workbench-heading">
          <div>
            <span>Input deck</span>
            <h2 id="source-heading">Load a media URL</h2>
          </div>
          <p>Your URL stays in this browser tab. Source servers still enforce their own access rules.</p>
        </div>

        <form className="source-form" onSubmit={handleSubmit} noValidate>
          <label className="source-url-field">
            <span>Public stream URL</span>
            <input
              aria-describedby="source-help source-error"
              autoCapitalize="none"
              autoComplete="off"
              inputMode="url"
              onChange={(event) => setInput(event.target.value)}
              placeholder="https://example.com/live/index.m3u8"
              spellCheck={false}
              type="url"
              value={input}
            />
          </label>
          <label className="source-mode-field">
            <span>Format</span>
            <select value={mode} onChange={(event) => setMode(event.target.value as MediaMode)}>
              {modes.map((option) => (
                <option key={option.value} value={option.value}>{option.label}</option>
              ))}
            </select>
          </label>
          <button className="btn source-submit" type="submit">Load signal <span aria-hidden="true">↗</span></button>
        </form>

        <div className="source-form-meta">
          <p id="source-help">Automatic mode recognizes .m3u8 and .mpd manifests; use a format override for signed or extensionless URLs.</p>
          <div className="format-chips" aria-label="Supported format families">
            <span>HLS</span><span>M3U8</span><span>DASH</span><span>MP4</span><span>WebM</span><span>Audio</span>
          </div>
        </div>

        {validationError && <p className="source-validation" id="source-error" role="alert">{validationError}</p>}
      </section>

      <StreamPlayer source={source} />

      <aside className="media-boundary-note">
        <strong>Broad support, real browser rules.</strong>
        <p>DRM licenses, unsupported codecs, missing CORS permission, HTTP-on-HTTPS streams, expired tokens, geography, and custom request headers can still stop a public URL from playing.</p>
      </aside>
    </>
  );
}
