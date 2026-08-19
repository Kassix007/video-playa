# Feature Specification: Multi-Format Stream Player

**Feature Branch**: `007-multi-format-player`

**Created**: 2026-08-18

**Status**: Implemented and verified

**Input**: User description: "Add our own player in a separate tab where users can input HLS, M3U8, or other links and play them, similar to the Livepush HLS player, with broad format support."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Paste and play a stream URL (Priority: P1)

As a viewer, I can open a dedicated Player destination, paste a public media URL, and start it in Video Playa without uploading the content or visiting another player site.

**Why this priority**: Direct URL playback is the primary requested workflow and also becomes the reusable playback surface for IPTV selections.

**Independent Test**: Paste one working HLS URL, one MPEG-DASH URL, and one directly browser-supported media URL in separate attempts and confirm each uses the appropriate playback path.

**Acceptance Scenarios**:

1. **Given** a valid public HLS or M3U8 URL, **When** the viewer submits it in automatic mode, **Then** the player initializes HLS playback and displays native media controls.
2. **Given** a valid public MPEG-DASH manifest URL, **When** the viewer submits it in automatic mode, **Then** the player initializes DASH playback and displays native media controls.
3. **Given** a valid direct media URL supported by the browser, **When** the viewer submits it, **Then** the browser plays it through the same player surface.
4. **Given** an extensionless or misleading URL, **When** automatic detection is insufficient, **Then** the viewer can explicitly choose HLS, DASH, or direct-file handling and retry.
5. **Given** an HLS source denies script-based cross-origin access but the browser supports HLS natively, **When** the URL is submitted, **Then** playback uses the native browser path before attempting a script-based engine.

---

### User Story 2 - Understand playback state and failure (Priority: P1)

As a viewer, I can tell what playback engine was selected, whether media is loading, ready, playing, paused, or failed, and what common limitation may have prevented playback.

**Why this priority**: Public stream URLs frequently fail for reasons outside the application; a blank video element would leave viewers unable to distinguish bad input from browser or source restrictions.

**Independent Test**: Submit a valid source, an invalid URL, an unsupported scheme, and an unavailable cross-origin manifest, then verify each state and recovery path is clear.

**Acceptance Scenarios**:

1. **Given** an invalid or non-web URL, **When** it is submitted, **Then** playback does not begin and an inline validation message explains the accepted input.
2. **Given** a source fails to load, **When** the player receives the failure, **Then** it reports the selected engine and likely causes such as source downtime, cross-origin policy, mixed content, token expiry, geography, or unsupported codecs.
3. **Given** playback is active, **When** media information becomes available, **Then** the player reports basic status and video resolution without obscuring the video.
4. **Given** one source fails, **When** the viewer edits the URL or mode and submits again, **Then** the old playback engine is fully released before the new attempt.

---

### User Story 3 - Use device playback features (Priority: P2)

As a viewer, I can request full screen, Picture-in-Picture, or a browser-supported remote playback target from the local player when my browser and device expose those capabilities.

**Why this priority**: These capabilities make the local player useful on mobile, desktop, and TV-oriented viewing setups while respecting platform security prompts.

**Independent Test**: On compatible devices, start media and activate each available viewing action; on an incompatible browser, verify unavailable actions are disabled or explained rather than failing silently.

**Acceptance Scenarios**:

1. **Given** Picture-in-Picture is supported and media is ready, **When** the viewer activates it, **Then** the video enters Picture-in-Picture following the browser's user-gesture rules.
2. **Given** remote playback or an operating-system playback picker is supported, **When** the viewer activates Cast, **Then** the browser's device picker is requested.
3. **Given** a capability is unavailable, **When** the player renders, **Then** its control is disabled with an accessible explanation.
4. **Given** any supported device, **When** the viewer activates full screen, **Then** the player requests full-screen presentation.

---

### User Story 4 - Operate the player on mobile and by keyboard (Priority: P2)

As a mobile or keyboard-only viewer, I can enter a URL, select a format mode, operate playback, and use supported presentation actions without horizontal scrolling or inaccessible controls.

**Why this priority**: The player is a primary destination and must remain usable on the compact layouts where direct stream testing is common.

**Independent Test**: Complete the URL submission and playback-control flow at 320 pixels wide and with keyboard-only input.

**Acceptance Scenarios**:

1. **Given** a 320-pixel viewport, **When** the player is used, **Then** the URL input, format chooser, primary action, video surface, status, and presentation controls fit without page-level horizontal scrolling.
2. **Given** reduced motion is enabled, **When** player states change, **Then** nonessential animation is removed.
3. **Given** keyboard-only input, **When** the viewer traverses the player, **Then** focus order and visible focus follow the visual workflow.

### Edge Cases

- The URL contains query parameters or signed tokens and has no useful extension.
- The URL is syntactically valid but points to a webpage rather than media.
- The stream is audio-only.
- A live stream has no finite duration.
- The HLS or DASH manifest loads but its media segments fail.
- The source requires cookies, authorization headers, a referrer, or a custom user-agent.
- The source permits native media loading but omits permission for script-based cross-origin manifest requests.
- Autoplay is blocked until a user gesture.
- Picture-in-Picture, remote playback, or full screen is absent or denied.
- The viewer switches sources repeatedly while a previous engine is still loading.
- The browser supports the manifest format but not one of its encoded codecs.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The application MUST add Player as a primary destination in both desktop and mobile navigation.
- **FR-002**: The Player destination MUST provide a labeled URL field, an automatic format mode, explicit HLS, DASH, and direct-file modes, and a clear load action.
- **FR-003**: The system MUST accept only HTTP and HTTPS media URLs entered by the viewer.
- **FR-004**: Automatic mode MUST recognize common HLS and M3U8, MPEG-DASH, and direct-media URL patterns while preserving explicit override modes for ambiguous URLs.
- **FR-005**: The shared player MUST support HLS live and on-demand manifests in browsers with native HLS or standard media-extension capability.
- **FR-006**: The shared player MUST support MPEG-DASH manifests in browsers with standard media-extension capability.
- **FR-007**: The shared player MUST pass ordinary media files to the browser for all formats and codecs the current browser natively supports.
- **FR-008**: Starting a new source MUST stop playback, release the prior playback engine, clear stale errors, and prevent late events from the prior source changing current state.
- **FR-009**: The player MUST expose native play, pause, seek, volume, caption, and full-screen controls supplied by the browser.
- **FR-010**: The player MUST display its selected engine, lifecycle state, source host, and current resolution when available.
- **FR-011**: Playback failures MUST produce an actionable inline message and MUST NOT crash or navigate the application.
- **FR-012**: The player MUST offer application controls for Picture-in-Picture, full screen, and browser-supported Cast or remote playback.
- **FR-013**: Presentation controls MUST be disabled with accessible explanations when the browser or current media state cannot support them.
- **FR-014**: User-entered URLs MUST remain local to the playback workflow and MUST NOT be sent to an application backend or retained after a reload.
- **FR-015**: The player MUST NOT claim support for DRM-protected media without required licenses, unavailable codecs, sources blocked by cross-origin or mixed-content policy, expired tokens, or custom forbidden request headers.
- **FR-016**: The player and form MUST remain operable without page-level horizontal scrolling from 320 pixels upward.
- **FR-017**: The player MUST expose a reusable interface so an eligible IPTV catalog selection can load the same playback surface without duplicating media-engine behavior.
- **FR-018**: HLS playback MUST prefer the browser's native media path whenever the browser reports native HLS capability, falling back to the script-based engine only when native HLS is unavailable.
- **FR-019**: When playback fails, the player MUST provide a safe action to open the original HTTP or HTTPS source in a separate browsing context.

### Key Entities *(include if feature involves data)*

- **Media source**: The viewer-provided or catalog-provided URL, optional title, and requested format mode.
- **Playback engine**: The selected handling mode—HLS, DASH, or the browser's native media path.
- **Playback session**: The current source, lifecycle state, error, resolution, and supported presentation capabilities.
- **Presentation capability**: Picture-in-Picture, full screen, or remote playback availability exposed by the current browser and device.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: A viewer can paste and initiate a valid stream in three interactions or fewer after opening Player.
- **SC-002**: Verified public HLS, DASH, and direct-media samples each reach a ready or playing state in a compatible browser.
- **SC-003**: Ten consecutive source changes leave exactly one active playback engine and no stale error from a previous source.
- **SC-004**: Invalid URLs and blocked or unsupported sources produce a visible recovery message in every test attempt.
- **SC-005**: At 320, 390, 768, and 1440 pixel widths, the player workflow has no page-level horizontal overflow.
- **SC-006**: Keyboard-only users can submit a URL and reach every available presentation control in logical order.
- **SC-007**: On a browser reporting native HLS capability, submitting an HLS URL identifies the engine as native and performs no script-origin manifest request.

## Assumptions

- “Support everything” means broad standards-based browser playback: HLS/M3U8, MPEG-DASH, and media containers/codecs that the current browser supports.
- Browser media security remains enforced; the application does not proxy streams, forge restricted headers, bypass DRM, or defeat geographic or authorization controls.
- Native media loading is preferred for HLS when available because it can operate under media-element security rules without granting application code access to the manifest response.
- A stream may be public yet still be offline, tokenized, region-limited, mixed-content-only, or missing cross-origin permission.
- Device discovery is delegated to browser and operating-system playback APIs and their required user prompts.
- The initial player uses the browser's proven native media controls rather than recreating every transport control.
