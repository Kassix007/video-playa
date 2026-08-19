import { useCallback, useDeferredValue, useEffect, useMemo, useRef, useState } from "react";
import { Helmet } from "react-helmet-async";
import SiteHeader from "../components/SiteHeader";
import StreamPlayer, { type PlaybackStatus } from "../components/player/StreamPlayer";
import type { MediaSource } from "../lib/media";
import {
  getEquivalentIptvStreams,
  hasIptvAvailabilityWarning,
  loadIptvCatalog,
  type IptvCatalog,
  type IptvStream,
} from "../services/iptv";
import "./MediaPages.css";

const PAGE_SIZE = 48;
const MAX_SOURCE_ATTEMPTS = 3;

type AvailabilityFilter = "best-chance" | "all";
type SourceOutcome = "failed" | "working";

export default function Iptv() {
  const playerAnchorRef = useRef<HTMLDivElement>(null);
  const [catalog, setCatalog] = useState<IptvCatalog | null>(null);
  const [catalogError, setCatalogError] = useState<string | null>(null);
  const [retryCount, setRetryCount] = useState(0);
  const [search, setSearch] = useState("");
  const [country, setCountry] = useState("ALL");
  const [availability, setAvailability] = useState<AvailabilityFilter>("best-chance");
  const [visibleCount, setVisibleCount] = useState(PAGE_SIZE);
  const [selectedStream, setSelectedStream] = useState<IptvStream | null>(null);
  const [playbackStatus, setPlaybackStatus] = useState<PlaybackStatus>("idle");
  const [attemptedUrls, setAttemptedUrls] = useState<string[]>([]);
  const [tuneMessage, setTuneMessage] = useState("");
  const [sourceOutcomes, setSourceOutcomes] = useState<Record<string, SourceOutcome>>({});
  const tuneGenerationRef = useRef(0);
  const successfulTuneRef = useRef(false);
  const deferredSearch = useDeferredValue(search.trim().toLocaleLowerCase());

  useEffect(() => {
    const controller = new AbortController();

    void loadIptvCatalog(controller.signal)
      .then((nextCatalog) => {
        setCatalog(nextCatalog);
        setCatalogError(null);
      })
      .catch((error: unknown) => {
        if (controller.signal.aborted) return;
        setCatalogError(error instanceof Error ? error.message : "The IPTV catalog could not be loaded.");
      });

    return () => controller.abort();
  }, [retryCount]);

  const availableCountries = useMemo(() => {
    if (!catalog) return [];
    const codes = new Set(catalog.streams.map((stream) => stream.countryCode));
    return [...codes]
      .map((code) => catalog.countries.get(code) || { code, flag: "◌", name: code })
      .sort((left, right) => left.name.localeCompare(right.name));
  }, [catalog]);

  const filteredStreams = useMemo(() => {
    if (!catalog) return [];

    return catalog.streams.filter((stream) => {
      const matchesCountry = country === "ALL" || stream.countryCode === country;
      const matchesAvailability = availability === "all" || !hasIptvAvailabilityWarning(stream);
      const searchable = `${stream.title} ${stream.channelId || ""} ${stream.feed || ""}`.toLocaleLowerCase();
      return matchesCountry && matchesAvailability && (!deferredSearch || searchable.includes(deferredSearch));
    });
  }, [availability, catalog, country, deferredSearch]);

  const displayedStreams = filteredStreams.slice(0, visibleCount);
  const selectedSource = useMemo<MediaSource | null>(
    () => selectedStream
      ? { mode: "auto", title: selectedStream.title, url: selectedStream.url }
      : null,
    [selectedStream],
  );
  const equivalentSources = useMemo(
    () => catalog && selectedStream ? getEquivalentIptvStreams(catalog.streams, selectedStream) : [],
    [catalog, selectedStream],
  );
  const maximumAttempts = Math.min(MAX_SOURCE_ATTEMPTS, equivalentSources.length || 1);

  const handleSearch = (value: string) => {
    setSearch(value);
    setVisibleCount(PAGE_SIZE);
  };

  const handleCountry = (value: string) => {
    setCountry(value);
    setVisibleCount(PAGE_SIZE);
  };

  const handleAvailability = (value: AvailabilityFilter) => {
    setAvailability(value);
    setVisibleCount(PAGE_SIZE);
  };

  const handleTune = (stream: IptvStream) => {
    tuneGenerationRef.current += 1;
    successfulTuneRef.current = false;
    setAttemptedUrls([stream.url]);
    setPlaybackStatus("loading");
    setTuneMessage("Trying the selected source in this browser.");
    setSelectedStream(stream);
    window.requestAnimationFrame(() => {
      playerAnchorRef.current?.scrollIntoView({
        behavior: window.matchMedia("(prefers-reduced-motion: reduce)").matches ? "auto" : "smooth",
        block: "start",
      });
    });
  };

  const handlePlaybackStatus = useCallback((status: PlaybackStatus) => {
    setPlaybackStatus(status);
  }, []);

  useEffect(() => {
    if (!selectedStream) return undefined;

    if (playbackStatus === "ready" || playbackStatus === "playing") {
      successfulTuneRef.current = true;
      setSourceOutcomes((current) => current[selectedStream.url] === "working"
        ? current
        : { ...current, [selectedStream.url]: "working" });
      setTuneMessage("Connected in this browser. Automatic source recovery is complete.");
      return undefined;
    }

    if (playbackStatus !== "error") return undefined;

    setSourceOutcomes((current) => current[selectedStream.url] === "failed"
      ? current
      : { ...current, [selectedStream.url]: "failed" });

    if (successfulTuneRef.current) {
      setTuneMessage("This source connected, then dropped. Automatic switching stays stopped after a successful start.");
      return undefined;
    }

    const nextSource = equivalentSources.find((stream) => !attemptedUrls.includes(stream.url));
    if (!nextSource || attemptedUrls.length >= maximumAttempts) {
      setTuneMessage(
        attemptedUrls.length > 1
          ? `All ${attemptedUrls.length} bounded in-app source attempts failed here.`
          : "No untried equivalent source is available for this channel.",
      );
      return undefined;
    }

    const generation = tuneGenerationRef.current;
    setTuneMessage(`Source ${attemptedUrls.length} failed. Trying another catalog URL for the same channel.`);
    const retryTimer = window.setTimeout(() => {
      if (tuneGenerationRef.current !== generation) return;
      successfulTuneRef.current = false;
      setPlaybackStatus("loading");
      setAttemptedUrls((current) => current.includes(nextSource.url) ? current : [...current, nextSource.url]);
      setSelectedStream(nextSource);
    }, 500);

    return () => window.clearTimeout(retryTimer);
  }, [attemptedUrls, equivalentSources, maximumAttempts, playbackStatus, selectedStream]);

  const retry = () => {
    setCatalog(null);
    setCatalogError(null);
    setRetryCount((count) => count + 1);
  };

  return (
    <>
      <Helmet>
        <title>IPTV | Video Playa</title>
        <meta name="description" content="Browse and test public IPTV.org stream links inside Video Playa." />
      </Helmet>

      <SiteHeader
        eyebrow="Open signal index"
        title="Public channels. One clean dial."
        subtitle="Search a community-maintained catalog, choose a signal, and test it in our local player. Availability varies by source and region."
        railItems={["Public streams", "Country filters", "Local playback", "No proxy"]}
        rightSlot={
          <a className="btn" href="https://github.com/iptv-org/api" target="_blank" rel="noreferrer">
            Source catalog <span aria-hidden="true">↗</span>
          </a>
        }
      />

      <div ref={playerAnchorRef} className="player-anchor">
        <StreamPlayer autoPlay onStatusChange={handlePlaybackStatus} source={selectedSource} />
      </div>

      {selectedStream && (
        <section className="iptv-tune-session" aria-label="IPTV source recovery" aria-live="polite">
          <div>
            <span>Current tune</span>
            <strong>{selectedStream.title}</strong>
          </div>
          <p>{tuneMessage}</p>
          <span className="iptv-attempt-count">
            Source {Math.min(attemptedUrls.length, maximumAttempts)} / {maximumAttempts}
          </span>
        </section>
      )}

      <section className="iptv-directory" aria-labelledby="directory-heading">
        <div className="directory-heading">
          <div>
            <span>Community directory</span>
            <h2 id="directory-heading">Find a signal</h2>
          </div>
          <p aria-live="polite">
            {catalog ? `${filteredStreams.length.toLocaleString()} eligible streams` : catalogError ? "Catalog unavailable" : "Loading catalog…"}
          </p>
        </div>

        <div className="directory-controls">
          <label>
            <span>Search channels</span>
            <input
              disabled={!catalog}
              onChange={(event) => handleSearch(event.target.value)}
              placeholder="News, music, local TV…"
              type="search"
              value={search}
            />
          </label>
          <label>
            <span>Country</span>
            <select disabled={!catalog} value={country} onChange={(event) => handleCountry(event.target.value)}>
              <option value="ALL">All countries</option>
              {availableCountries.map((item) => (
                <option value={item.code} key={item.code}>{item.flag} {item.name}</option>
              ))}
            </select>
          </label>
          <label>
            <span>Availability</span>
            <select
              disabled={!catalog}
              value={availability}
              onChange={(event) => handleAvailability(event.target.value as AvailabilityFilter)}
            >
              <option value="best-chance">Best chance</option>
              <option value="all">All sources</option>
            </select>
          </label>
        </div>

        {!catalog && !catalogError && (
          <div className="directory-state" role="status">
            <span className="directory-loader" aria-hidden="true" />
            <strong>Scanning the public dial</strong>
            <p>The catalog is large; only a small result window will be rendered.</p>
          </div>
        )}

        {catalogError && (
          <div className="directory-state error" role="alert">
            <strong>Catalog connection failed</strong>
            <p>{catalogError}</p>
            <button type="button" className="btn" onClick={retry}>Try again</button>
          </div>
        )}

        {catalog && displayedStreams.length === 0 && (
          <div className="directory-state">
            <strong>No signal matches that filter</strong>
            <p>Try a shorter channel name or switch back to all countries.</p>
          </div>
        )}

        {displayedStreams.length > 0 && (
          <ol className="channel-grid">
            {displayedStreams.map((stream, index) => {
              const countryInfo = catalog?.countries.get(stream.countryCode);
              const isSelected = selectedStream?.url === stream.url;

              return (
                <li key={stream.url} className={isSelected ? "selected" : undefined}>
                  <article className="channel-card">
                    <div className="channel-card-index" aria-hidden="true">
                      {String(index + 1).padStart(2, "0")}
                    </div>
                    <div className="channel-card-copy">
                      <span className="channel-country">
                        {countryInfo?.flag || "◌"} {countryInfo?.name || stream.countryCode}
                      </span>
                      <h3>{stream.title}</h3>
                      <p>{stream.channelId || "Unmapped channel"}{stream.feed ? ` · ${stream.feed}` : ""}</p>
                      <div className="channel-tags">
                        <span>{stream.quality || "Auto quality"}</span>
                        {stream.label && <span className="warning">{stream.label}</span>}
                        {sourceOutcomes[stream.url] && (
                          <span className={`session-outcome ${sourceOutcomes[stream.url]}`}>
                            {sourceOutcomes[stream.url] === "working" ? "Worked here" : "Failed here"}
                          </span>
                        )}
                      </div>
                    </div>
                    <button className="channel-tune" type="button" onClick={() => handleTune(stream)}>
                      <span>{isSelected ? "Tuned" : "Tune in"}</span>
                      <i aria-hidden="true">▶</i>
                    </button>
                  </article>
                </li>
              );
            })}
          </ol>
        )}

        {visibleCount < filteredStreams.length && (
          <button className="load-more" type="button" onClick={() => setVisibleCount((count) => count + PAGE_SIZE)}>
            Show {Math.min(PAGE_SIZE, filteredStreams.length - visibleCount)} more
            <span aria-hidden="true">↓</span>
          </button>
        )}

        <aside className="catalog-credit">
          <span aria-hidden="true">i</span>
          <p><strong>Directory, not broadcaster.</strong> IPTV.org collects user-submitted public links and does not host the video. Video Playa filters blocked, header-dependent, duplicate, and insecure entries; source uptime, rights, region access, and browser compatibility still vary.</p>
        </aside>
      </section>
    </>
  );
}
