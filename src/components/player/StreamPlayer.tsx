import { useCallback, useEffect, useMemo, useRef, useState } from "react";
import type Hls from "hls.js";
import type { LoaderContext } from "hls.js";
import type { MediaPlayerClass } from "dashjs";
import { getSourceHost, resolveMediaKind, type MediaSource } from "../../lib/media";
import "./StreamPlayer.css";

export type PlaybackStatus = "idle" | "loading" | "ready" | "playing" | "paused" | "buffering" | "ended" | "error";

type QualityOption = {
  bitrate: number;
  height: number;
  index: number;
  label: string;
};

type PlaybackCapabilities = {
  cast: boolean;
  fullscreen: boolean;
  pictureInPicture: boolean;
};

type StreamPlayerProps = {
  autoPlay?: boolean;
  onStatusChange?: (status: PlaybackStatus) => void;
  source?: MediaSource | null;
};

type ExtendedVideoElement = HTMLVideoElement & {
  remote?: { prompt: () => Promise<void> };
  webkitPresentationMode?: string;
  webkitSetPresentationMode?: (mode: "inline" | "picture-in-picture") => void;
  webkitShowPlaybackTargetPicker?: () => void;
  webkitSupportsPresentationMode?: (mode: string) => boolean;
};

type ExtendedDocument = Document & {
  exitPictureInPicture?: () => Promise<void>;
  pictureInPictureElement?: Element | null;
};

const statusLabels: Record<PlaybackStatus, string> = {
  idle: "Waiting for a source",
  loading: "Loading signal",
  ready: "Ready",
  playing: "Playing",
  paused: "Paused",
  buffering: "Buffering",
  ended: "Ended",
  error: "Playback failed",
};

function describeMediaError(error: MediaError | null): string {
  if (!error) return "The source could not be played.";

  if (error.code === MediaError.MEDIA_ERR_ABORTED) return "Playback was interrupted before the source finished loading.";
  if (error.code === MediaError.MEDIA_ERR_NETWORK) return "The source or one of its media segments could not be reached.";
  if (error.code === MediaError.MEDIA_ERR_DECODE) return "The browser could not decode this stream's media format.";
  if (error.code === MediaError.MEDIA_ERR_SRC_NOT_SUPPORTED) {
    return "The source was rejected. It may be offline, blocked by CORS, or use an unsupported format or codec.";
  }

  return "The source could not be played by this browser.";
}

export default function StreamPlayer({ autoPlay = false, onStatusChange, source = null }: StreamPlayerProps) {
  const videoRef = useRef<ExtendedVideoElement>(null);
  const shellRef = useRef<HTMLDivElement>(null);
  const hlsRef = useRef<Hls | null>(null);
  const dashRef = useRef<MediaPlayerClass | null>(null);
  const [status, setStatus] = useState<PlaybackStatus>(source ? "loading" : "idle");
  const [error, setError] = useState<string | null>(null);
  const [engine, setEngine] = useState("—");
  const [resolution, setResolution] = useState("—");
  const [qualities, setQualities] = useState<QualityOption[]>([]);
  const [activeQuality, setActiveQuality] = useState(-1);
  const [actionNote, setActionNote] = useState<string | null>(null);
  const [capabilities, setCapabilities] = useState<PlaybackCapabilities>({
    cast: false,
    fullscreen: false,
    pictureInPicture: false,
  });

  const sourceKind = useMemo(
    () => (source ? resolveMediaKind(source.url, source.mode) : null),
    [source],
  );

  const destroyEngines = useCallback(() => {
    hlsRef.current?.destroy();
    hlsRef.current = null;
    dashRef.current?.reset();
    dashRef.current = null;
  }, []);

  useEffect(() => {
    const video = videoRef.current;
    if (!video) return;

    video.setAttribute("x-webkit-airplay", "allow");
    const safariPictureInPicture = Boolean(
      video.webkitSupportsPresentationMode?.("picture-in-picture"),
    );
    const standardPictureInPicture = Boolean(
      document.pictureInPictureEnabled && typeof video.requestPictureInPicture === "function",
    );
    const remotePlayback = typeof video.remote?.prompt === "function";
    const airPlay = typeof video.webkitShowPlaybackTargetPicker === "function";

    setCapabilities({
      cast: remotePlayback || airPlay,
      fullscreen: Boolean(document.fullscreenEnabled && shellRef.current?.requestFullscreen),
      pictureInPicture: standardPictureInPicture || safariPictureInPicture,
    });
  }, []);

  useEffect(() => {
    onStatusChange?.(status);
  }, [onStatusChange, status]);

  useEffect(() => {
    const video = videoRef.current;
    if (!video) return undefined;

    let cancelled = false;
    let mediaRecoveryAttempted = false;
    let nativeHlsActive = false;
    let nativeHlsFallbackStarted = false;
    let nativeHlsStartupTimer: number | undefined;
    let scriptedHlsActive = false;
    let startScriptedHls: (() => Promise<void>) | null = null;

    destroyEngines();
    video.pause();
    video.removeAttribute("src");
    video.load();
    setError(null);
    setActionNote(null);
    setQualities([]);
    setActiveQuality(-1);
    setResolution("—");

    if (!source || !sourceKind) {
      setEngine("—");
      setStatus("idle");
      return undefined;
    }

    setStatus("loading");

    const updateResolution = () => {
      if (cancelled) return;
      setResolution(video.videoWidth && video.videoHeight ? `${video.videoWidth} × ${video.videoHeight}` : "Audio / unknown");
    };
    const handleLoaded = () => {
      if (cancelled) return;
      window.clearTimeout(nativeHlsStartupTimer);
      nativeHlsActive = false;
      updateResolution();
      setStatus("ready");
      if (autoPlay) {
        void video.play().catch(() => setActionNote("Press play to start—your browser blocked autoplay."));
      }
    };
    const handlePlaying = () => !cancelled && setStatus("playing");
    const handlePause = () => {
      if (!cancelled && video.currentTime > 0 && !video.ended) setStatus("paused");
    };
    const handleWaiting = () => !cancelled && setStatus("buffering");
    const handleEnded = () => !cancelled && setStatus("ended");
    const tryScriptedHlsFallback = (note: string): boolean => {
      if (cancelled || scriptedHlsActive) return false;
      if (sourceKind === "hls" && nativeHlsActive && !nativeHlsFallbackStarted && startScriptedHls) {
        window.clearTimeout(nativeHlsStartupTimer);
        nativeHlsFallbackStarted = true;
        nativeHlsActive = false;
        scriptedHlsActive = true;
        setError(null);
        setStatus("loading");
        setActionNote(note);
        video.pause();
        video.removeAttribute("src");
        video.load();
        void startScriptedHls().catch((fallbackError: unknown) => {
          if (cancelled) return;
          const message = fallbackError instanceof Error ? fallbackError.message : "Unknown fallback error";
          setError(`The compatibility engine could not start: ${message}`);
          setStatus("error");
        });
        return true;
      }

      return false;
    };

    const handleVideoError = () => {
      if (cancelled || scriptedHlsActive) return;

      if (tryScriptedHlsFallback("Native HLS rejected this feed. Trying the compatibility engine now.")) {
        return;
      }

      if (!video.error) return;
      setError(describeMediaError(video.error));
      setStatus("error");
    };

    video.addEventListener("loadedmetadata", handleLoaded);
    video.addEventListener("resize", updateResolution);
    video.addEventListener("playing", handlePlaying);
    video.addEventListener("pause", handlePause);
    video.addEventListener("waiting", handleWaiting);
    video.addEventListener("ended", handleEnded);
    video.addEventListener("error", handleVideoError);

    const initialize = async () => {
      if (sourceKind === "native") {
        setEngine("Browser native");
        video.src = source.url;
        video.load();
        return;
      }

      if (sourceKind === "hls") {
        startScriptedHls = async () => {
          window.clearTimeout(nativeHlsStartupTimer);
          scriptedHlsActive = true;
          nativeHlsActive = false;

          const { default: HlsEngine, FetchLoader } = await import("hls.js");
          if (cancelled) return;

          if (!HlsEngine.isSupported()) {
            setError("HLS playback needs native HLS or Media Source support that this browser does not expose.");
            setStatus("error");
            return;
          }

          hlsRef.current?.destroy();
          const referrerPolicy = source.referrerPolicy;
          const hls = new HlsEngine({
            backBufferLength: 90,
            enableWorker: true,
            lowLatencyMode: true,
            ...(referrerPolicy === "no-referrer" ? {
              loader: FetchLoader,
              fetchSetup: (context: LoaderContext, initParams: RequestInit) => new Request(context.url, {
                ...initParams,
                referrerPolicy,
              }),
            } : {}),
          });
          hlsRef.current = hls;
          setEngine("HLS.js");

          hls.on(HlsEngine.Events.MANIFEST_PARSED, (_event, data) => {
            if (cancelled) return;
            setQualities(data.levels.map((level, index) => ({
              bitrate: level.bitrate,
              height: level.height,
              index,
              label: level.name || (level.height ? `${level.height}p` : `Level ${index + 1}`),
            })));
          });
          hls.on(HlsEngine.Events.ERROR, (_event, data) => {
            if (cancelled || !data.fatal) return;

            if (data.type === HlsEngine.ErrorTypes.MEDIA_ERROR && !mediaRecoveryAttempted) {
              mediaRecoveryAttempted = true;
              hls.recoverMediaError();
              setActionNote("The media decoder stumbled once; playback recovery was attempted.");
              return;
            }

            setError(
              data.type === HlsEngine.ErrorTypes.NETWORK_ERROR
                ? "The HLS manifest or a segment could not be loaded. Check source uptime, CORS, geography, and token expiry."
                : "The HLS stream uses media this browser could not decode.",
            );
            setStatus("error");
          });
          hls.loadSource(source.url);
          hls.attachMedia(video);
        };

        if (!source.referrerPolicy && video.canPlayType("application/vnd.apple.mpegurl")) {
          nativeHlsActive = true;
          setEngine("Native HLS");
          video.src = source.url;
          video.load();
          nativeHlsStartupTimer = window.setTimeout(() => {
            tryScriptedHlsFallback("Native HLS did not start in time. Trying the compatibility engine now.");
          }, 8_000);
          return;
        }

        await startScriptedHls();
        return;
      }

      const dashModule = await import("dashjs");
      if (cancelled) return;

      if (!window.MediaSource) {
        setError("DASH playback needs Media Source support that this browser does not expose.");
        setStatus("error");
        return;
      }

      const dash = dashModule.MediaPlayer().create();
      dashRef.current = dash;
      setEngine("dash.js");
      dash.on(dashModule.MediaPlayer.events.ERROR, () => {
        if (cancelled) return;
        setError("The DASH manifest or its segments failed. Check source uptime, CORS, DRM, geography, and codec support.");
        setStatus("error");
      });
      dash.initialize(video, source.url, autoPlay);
    };

    void initialize().catch((initializationError: unknown) => {
      if (cancelled) return;
      const message = initializationError instanceof Error ? initializationError.message : "Unknown player error";
      setError(`The playback engine could not start: ${message}`);
      setStatus("error");
    });

    return () => {
      cancelled = true;
      video.removeEventListener("loadedmetadata", handleLoaded);
      video.removeEventListener("resize", updateResolution);
      video.removeEventListener("playing", handlePlaying);
      video.removeEventListener("pause", handlePause);
      video.removeEventListener("waiting", handleWaiting);
      video.removeEventListener("ended", handleEnded);
      video.removeEventListener("error", handleVideoError);
      window.clearTimeout(nativeHlsStartupTimer);
      destroyEngines();
      video.pause();
      video.removeAttribute("src");
      video.load();
    };
  }, [autoPlay, destroyEngines, source, sourceKind]);

  useEffect(() => () => destroyEngines(), [destroyEngines]);

  const handlePictureInPicture = async () => {
    const video = videoRef.current;
    if (!video) return;

    try {
      const extendedDocument = document as ExtendedDocument;
      if (extendedDocument.pictureInPictureElement && extendedDocument.exitPictureInPicture) {
        await extendedDocument.exitPictureInPicture();
      } else if (typeof video.requestPictureInPicture === "function") {
        await video.requestPictureInPicture();
      } else if (video.webkitSetPresentationMode) {
        video.webkitSetPresentationMode(
          video.webkitPresentationMode === "picture-in-picture" ? "inline" : "picture-in-picture",
        );
      }
      setActionNote("Picture-in-Picture requested.");
    } catch {
      setActionNote("Picture-in-Picture was unavailable or dismissed by the browser.");
    }
  };

  const handleCast = async () => {
    const video = videoRef.current;
    if (!video) return;

    try {
      if (typeof video.remote?.prompt === "function") {
        await video.remote.prompt();
      } else {
        video.webkitShowPlaybackTargetPicker?.();
      }
      setActionNote("Device picker requested.");
    } catch {
      setActionNote("No remote device was selected.");
    }
  };

  const handleFullscreen = async () => {
    try {
      await shellRef.current?.requestFullscreen();
    } catch {
      setActionNote("Full screen was unavailable or dismissed by the browser.");
    }
  };

  const handleQualityChange = (value: number) => {
    setActiveQuality(value);
    if (hlsRef.current) hlsRef.current.currentLevel = value;
  };

  const hasSource = Boolean(source);

  return (
    <section className="stream-player" aria-label="Stream player">
      <div className="stream-player-topline">
        <div>
          <span className="stream-player-kicker">Now tuning</span>
          <h2>{source?.title || "Your signal goes here"}</h2>
        </div>
        <span className="stream-status" data-status={status}>
          <i aria-hidden="true" /> {statusLabels[status]}
        </span>
      </div>

      <div className="stream-player-frame" ref={shellRef} data-empty={!hasSource}>
        <video ref={videoRef} controls playsInline preload="metadata" aria-label={source?.title || "Media playback area"} />
        {!hasSource && (
          <div className="stream-player-idle" aria-hidden="true">
            <span className="idle-orbit" />
            <strong>VP</strong>
            <small>Awaiting signal</small>
          </div>
        )}
      </div>

      <div className="stream-player-console">
        <dl className="stream-diagnostics" aria-label="Playback diagnostics">
          <div><dt>Engine</dt><dd>{engine}</dd></div>
          <div><dt>Resolution</dt><dd>{resolution}</dd></div>
          <div><dt>Source</dt><dd title={source?.url}>{source ? getSourceHost(source.url) : "—"}</dd></div>
          <div><dt>Mode</dt><dd>{sourceKind?.toUpperCase() || "—"}</dd></div>
        </dl>

        <div className="stream-actions" aria-label="Presentation controls">
          {qualities.length > 1 && (
            <label className="quality-picker">
              <span>Quality</span>
              <select value={activeQuality} onChange={(event) => handleQualityChange(Number(event.target.value))}>
                <option value={-1}>Auto</option>
                {qualities.map((quality) => (
                  <option key={quality.index} value={quality.index}>
                    {quality.label}{quality.bitrate ? ` · ${Math.round(quality.bitrate / 1000)} kbps` : ""}
                  </option>
                ))}
              </select>
            </label>
          )}
          <button
            type="button"
            className="player-tool"
            disabled={!hasSource || !capabilities.pictureInPicture}
            onClick={handlePictureInPicture}
            title={capabilities.pictureInPicture ? "Open Picture-in-Picture" : "Picture-in-Picture is not supported here"}
          >
            <span aria-hidden="true">▣</span> PiP
          </button>
          <button
            type="button"
            className="player-tool"
            disabled={!hasSource || !capabilities.cast}
            onClick={handleCast}
            title={capabilities.cast ? "Choose a remote playback device" : "Cast or AirPlay is not exposed by this browser"}
          >
            <span aria-hidden="true">◔</span> Cast
          </button>
          <button
            type="button"
            className="player-tool"
            disabled={!hasSource || !capabilities.fullscreen}
            onClick={handleFullscreen}
            title={capabilities.fullscreen ? "Open full screen" : "Full screen is not supported here"}
          >
            <span aria-hidden="true">↗</span> Full screen
          </button>
        </div>
      </div>

      {(error || actionNote) && (
        <div className={error ? "stream-message error" : "stream-message"} role={error ? "alert" : "status"}>
          <strong>{error ? "Signal unavailable" : "Player note"}</strong>
          <p>{error || actionNote}</p>
          {error && source && (
            <a className="stream-source-link" href={source.url} target="_blank" rel="noreferrer">
              Open source directly <span aria-hidden="true">↗</span>
            </a>
          )}
        </div>
      )}
    </section>
  );
}
