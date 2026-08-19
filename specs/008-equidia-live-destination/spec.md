# Feature Specification: Equidia Live Destination

**Feature Branch**: `008-equidia-live-destination`

**Created**: 2026-08-19

**Status**: Implemented and verified

**Input**: User description: "Add a dedicated tab for Equidia using its public adaptive HLS manifest and exposed quality ladder." Follow-up evidence: nested Hexaglobe playlists return `406 Not Acceptable` when playback requests disclose the local application as their referrer.

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Open Equidia directly (Priority: P1)

As a viewer, I can choose Equidia from the primary navigation and arrive at a dedicated live viewing surface without searching the full IPTV directory.

**Why this priority**: Equidia is now a first-class destination, so reaching it quickly is the feature's core value.

**Independent Test**: Select Equidia from both desktop and mobile navigation, then verify that the Equidia page opens with its player already assigned to the public master stream.

**Acceptance Scenarios**:

1. **Given** the viewer is anywhere in the application, **When** they select Equidia in primary navigation, **Then** the dedicated Equidia destination opens and Equidia is identified as the active destination.
2. **Given** the Equidia destination has opened, **When** the page becomes interactive, **Then** the player begins loading the Equidia adaptive master without requiring the viewer to paste a URL.
3. **Given** the viewer uses the mobile navigation drawer, **When** they select Equidia, **Then** the drawer closes, focus and scrolling remain usable, and the Equidia page fits the viewport.

---

### User Story 2 - Understand the live signal (Priority: P2)

As a viewer, I can see the available resolution ladder, audio language, and source provenance so I understand what the public Equidia manifest offers.

**Why this priority**: A dedicated destination should provide useful channel context rather than duplicating a generic player screen.

**Independent Test**: Open Equidia while the public manifest is available and verify that the page presents its five advertised resolution tiers, French audio, and the community-manifest source.

**Acceptance Scenarios**:

1. **Given** the public master manifest is readable, **When** its metadata loads, **Then** every advertised video tier appears with its resolution and approximate bandwidth.
2. **Given** the manifest declares a default French audio rendition, **When** metadata is shown, **Then** the page identifies French as the live audio language.
3. **Given** the manifest contains a refresh note, **When** metadata is shown, **Then** that source-supplied note is presented as provenance rather than as a playback guarantee.

---

### User Story 3 - Recover from an unavailable feed (Priority: P3)

As a viewer, I receive a useful, honest recovery path when the Equidia source is offline, restricted, expired, or rejected by my browser.

**Why this priority**: The manifest points to an independently operated media host whose access policy and uptime are outside the client application's control.

**Independent Test**: Simulate a rejected Equidia media load and verify that the page remains operable, explains the boundary, and offers the original master source in a separate browsing context.

**Acceptance Scenarios**:

1. **Given** the Equidia media host rejects playback, **When** the player reaches an error state, **Then** the page remains intact and exposes the original master source as a recovery action.
2. **Given** metadata cannot be refreshed, **When** the page loads, **Then** playback is still attempted from the known master and the metadata panel shows an unavailable state without blocking the player.
3. **Given** browser or source security rules prevent playback, **When** failure is reported, **Then** the page does not claim to bypass those rules or repeatedly retry without viewer action.
4. **Given** the media host permits cross-origin playback but rejects the referring application address, **When** Equidia is tuned, **Then** the player uses a browser-standard privacy policy that omits the referrer and attempts playback without a relay or fabricated identity.

### Edge Cases

- The public master manifest is readable while one or more nested video or audio manifests are unavailable.
- The manifest changes its quality count, ordering, bandwidth, audio language, or refresh-note format.
- The browser supports native HLS but rejects this particular source, codec, or separated audio/video arrangement.
- The source is geographically restricted, tokenized, temporarily offline, or rejects cross-origin script access.
- The source allows cross-origin media but rejects requests that disclose a localhost or community-master referrer.
- The viewer prefers reduced motion or uses keyboard-only navigation.
- Long source metadata and URLs must not cause horizontal page scrolling at narrow widths.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: Primary navigation MUST expose a dedicated Equidia destination on desktop and mobile layouts.
- **FR-002**: The Equidia destination MUST be represented by its own stable route and page title.
- **FR-003**: The page MUST initialize the shared media player with the known public Equidia adaptive master source without manual URL entry.
- **FR-004**: The page MUST preserve the shared player's native controls, playback status, Picture-in-Picture, remote playback, fullscreen, and error handling where the current browser supports them.
- **FR-005**: The page MUST retrieve and present current master-manifest metadata independently from the media playback lifecycle.
- **FR-006**: Manifest metadata MUST identify each advertised video tier by resolution and approximate bandwidth.
- **FR-007**: Manifest metadata MUST identify the declared default audio language when present.
- **FR-008**: A source-provided refresh note MUST be clearly labeled as provenance and MUST NOT be presented as proof that playback is currently available.
- **FR-009**: Failure to load manifest metadata MUST NOT prevent the known Equidia master source from being assigned to the player.
- **FR-010**: Playback failure MUST retain a safe action to open the original HTTP or HTTPS master source in a separate browsing context.
- **FR-011**: The destination MUST explain that the public directory and media hosts are independently operated and may enforce geography, authorization, codec, or cross-origin restrictions.
- **FR-012**: The destination MUST NOT proxy streams, forge restricted headers, bypass digital rights controls, or imply guaranteed availability.
- **FR-013**: The destination MUST remain fully readable and operable at 375, 768, and 1280 pixel viewport widths without page-level horizontal scrolling.
- **FR-014**: Interactive controls MUST be keyboard-operable, expose meaningful accessible names, show visible focus, and meet a minimum 44 by 44 pixel touch target where applicable.
- **FR-015**: Motion MUST respect the viewer's reduced-motion preference.
- **FR-016**: The presentation MUST use the application's dark-red system while giving Equidia a distinctive live race-control identity rather than a generic streaming-card layout.
- **FR-017**: A known source MAY declare that its playback requests omit the referring page when the media host permits anonymous cross-origin playback but rejects the application's ambient referrer.
- **FR-018**: Referrer omission MUST be scoped to the declared source and MUST NOT fabricate another site's referrer, user agent, cookies, authorization, or origin.
- **FR-019**: When a declared request policy cannot be applied by the preferred playback path, the player MUST select another permitted in-client path that can apply it before reporting failure.
- **FR-020**: Sources without an explicit request policy MUST retain the shared player's existing network behavior.

### Key Entities

- **Equidia Source**: The known public adaptive master address, its display title, provenance, and playback mode.
- **Manifest Snapshot**: The currently retrieved master metadata, including video variants, audio rendition, source note, and retrieval state.
- **Video Variant**: One advertised rendition with resolution, approximate bandwidth, and its nested media address.
- **Audio Rendition**: The declared language, label, default status, and nested audio address.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: A viewer can reach the dedicated Equidia page in one navigation action from any application page on desktop and mobile.
- **SC-002**: The Equidia master is assigned to the player within one second after the destination becomes interactive, excluding external network latency.
- **SC-003**: For the supplied manifest snapshot, the page presents all five advertised resolution tiers and identifies French audio with no manual input.
- **SC-004**: A rejected feed produces one stable failure state and one direct-source recovery action without breaking navigation or the rest of the page.
- **SC-005**: The destination has no page-level horizontal overflow at 375, 768, or 1280 pixel widths.
- **SC-006**: All destination controls can be reached and activated by keyboard, and focus remains visibly identifiable.
- **SC-007**: The destination clearly distinguishes current manifest metadata from guaranteed media availability in its primary explanatory content.
- **SC-008**: In a browser where Equidia previously received `406` solely because the application referrer was disclosed, the same current feed reaches a usable media state without a backend or external-player handoff.
- **SC-009**: Equidia nested playlist requests disclose no referring page, while ordinary IPTV and custom-player sources keep their prior request behavior.

## Assumptions

- The public master currently lives at `https://raw.githubusercontent.com/Paradise-91/ParaTV/main/streams/equidia/live2.m3u8` and may change independently.
- The supplied manifest currently advertises 1080p, 720p, 480p, 240p, and 144p variants plus default French audio.
- The existing shared player remains the single playback component used by IPTV, custom-player, and Equidia destinations.
- Native and script-assisted HLS playback remain subject to browser capabilities and every upstream host's policies.
- The feature is a client-only destination and introduces no media relay or new backend dependency.
- On 2026-08-19 the current Hexaglobe child playlist returned `406` with a localhost or GitHub raw `Referer`, but returned `200` plus cross-origin permission when the referrer was omitted; this source behavior may change independently.

## Referrer-Sensitive Playback Evidence

- Desktop Equidia selected HLS.js directly, reached Ready with media ready state 4, and advanced playback beyond five seconds.
- Sixteen observed Hexaglobe playlist and transport-stream requests returned `200`; none disclosed a `Referer`.
- The observed requests included the 1080p video playlist, French audio playlist, and their live transport-stream segments.
- A normal Mux HLS control source still selected native HLS and retained the browser's default localhost referrer, proving the policy did not leak into ordinary sources.
- Desktop and 375-pixel mobile Equidia views had zero page-level horizontal overflow; the mobile footer and hamburger remained present.
- Browser verification reported no application console problems. Visual review confirmed the live picture, player controls, signal board, source boundary, and footer remain readable on desktop and mobile.
- `npx eslint src` and `npm run build` completed successfully on 2026-08-19.
