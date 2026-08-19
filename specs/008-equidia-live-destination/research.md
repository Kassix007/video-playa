# Research: Equidia Live Destination

## Decision 1: Treat the master manifest as both playback input and inspectable metadata

**Decision**: Keep one canonical public master URL. Assign it directly to the shared player and independently retrieve its text for metadata presentation.

**Rationale**: Playback should start without waiting for decorative metadata, while the dedicated page still explains the adaptive ladder the viewer supplied. Separating these lifecycles prevents a metadata-fetch failure from blocking the player.

**Alternatives considered**:

- Hard-code all five rendition rows: rejected because the public playlist can change independently.
- Wait for metadata before creating the player source: rejected because it adds an avoidable network dependency to the primary viewing action.

## Decision 2: Use a narrow, deterministic HLS master parser

**Decision**: Parse only the master tags this page needs: `#EXT-X-STREAM-INF`, its following URI, `#EXT-X-MEDIA` audio attributes, and the source refresh comment.

**Rationale**: The application does not need to implement HLS playback or a general M3U8 grammar. A small parser is easier to validate and returns an explicit, typed snapshot for presentation.

**Alternatives considered**:

- Add another playlist-parsing dependency: rejected because the existing playback engine already handles media semantics and the page needs only four metadata fields.
- Extract quality information from the player engine: rejected because native HLS does not expose the same rendition metadata and the current player intentionally abstracts engine differences.

## Decision 3: Preserve upstream security boundaries while omitting the rejected referrer

**Decision**: Do not proxy the Equidia CDN, forge an allowed referrer, or rewrite nested playlists. Mark Equidia with a source-scoped `no-referrer` policy and use the scripted HLS fetch loader so browser requests omit the ambient page referrer while continuing to enforce CORS normally.

**Rationale**: Direct probes showed the current child playlist returns `406` when `Referer` identifies localhost or the GitHub raw master, but returns `200` and `Access-Control-Allow-Origin: *` when `Referer` is absent. Referrer omission is a standard privacy behavior and does not grant access the server otherwise withholds. A relay would be a new backend and operating responsibility that the feature explicitly excludes.

**Alternatives considered**:

- Client-side `no-cors` fetch: rejected because opaque responses cannot be read or passed to the player as usable manifests.
- Service worker rewriting: rejected because service workers are subject to the same origin model.
- Public third-party CORS proxy: rejected for privacy, reliability, abuse, and production-security reasons.
- Fabricating an Equidia or mobile-app referrer: rejected because it impersonates another client and would be brittle if upstream authorization changes.

## Decision 4: Add the channel through the central route registry

**Decision**: Register Equidia once in the existing route configuration so desktop navigation, mobile drawer numbering, active state, and route rendering derive from the same source.

**Rationale**: This preserves the modular navigation design and keeps future tabs additive.

**Alternatives considered**:

- Add page-specific links to both navigation components: rejected because it duplicates labels and active-route logic.

## Decision 5: Use an editorial race-control presentation

**Decision**: Build the page around a compact “live paddock” masthead and a horizontal signal-ladder readout using the existing oxblood palette, restrained cream typography, fine rules, and instrument-like numbering.

**Rationale**: Equidia should feel like a deliberate channel desk rather than a generic collection of gradient cards, while remaining consistent with Video Playa's established dark-red system.

**Alternatives considered**:

- Reuse the IPTV directory card grid: rejected because a single dedicated channel needs hierarchy, provenance, and live signal context instead of discovery controls.

## Decision 6: Apply request policy through the fetch-based HLS loader

**Decision**: Sources without a request policy keep the default loader. A source declaring `no-referrer` uses the HLS engine's fetch loader and request-construction hook, and starts on that scripted path instead of first issuing a known-rejected native request.

**Rationale**: Browser XHR does not allow application code to set or remove the forbidden `Referer` header. Fetch accepts a standard request referrer policy, and the HLS engine exposes a fetch loader plus request setup contract. Keeping the behavior opt-in avoids changing the broad IPTV catalog.

**Alternatives considered**:

- Set a site-wide referrer policy: rejected because unrelated streams may depend on the browser's normal policy.
- Attempt native HLS first: rejected for this source because native media loading does not expose a portable per-request referrer-policy hook and would repeat the known `406` before the compatible path.
- Change the user-entered URL or rewrite the public master: rejected because child addresses remain independently owned and may refresh.
