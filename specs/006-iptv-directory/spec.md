# Feature Specification: IPTV Directory

**Feature Branch**: `006-iptv-directory`

**Created**: 2026-08-18

**Status**: Implemented and verified

**Input**: User description: "Add an IPTV tab using the iptv-org/api catalog and ideally stream those links in our own player."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Discover public IPTV streams (Priority: P1)

As a viewer, I can open an IPTV section, browse a curated list of public streams, and quickly narrow it by channel name or country.

**Why this priority**: A raw global stream catalog is too large to use without clear loading states, search, filtering, and progressive disclosure.

**Independent Test**: Open the IPTV section, wait for the public catalog to load, search for a known channel, select a country, and verify that the visible results match both filters.

**Acceptance Scenarios**:

1. **Given** the public catalog is available, **When** the viewer opens IPTV, **Then** a bounded first set of eligible streams appears with channel title, country, quality when known, and availability notes when present.
2. **Given** the catalog has loaded, **When** the viewer enters a search term or chooses a country, **Then** results update to match all active filters and the result count remains clear.
3. **Given** more matches exist than are initially shown, **When** the viewer requests more, **Then** the next bounded group appears without losing filters or scroll context.

---

### User Story 2 - Tune a catalog stream locally (Priority: P1)

As a viewer, I can choose an eligible IPTV result and attempt playback inside Video Playa rather than being sent to a third-party player.

**Why this priority**: Integrated playback is the core value of turning the public catalog into a usable TV directory.

**Independent Test**: Select an eligible HLS stream from the results and confirm the local player receives its URL and title, exposes playback controls, and either plays or presents an actionable source-specific failure.

**Acceptance Scenarios**:

1. **Given** an eligible catalog stream, **When** the viewer selects “Tune in,” **Then** the page moves attention to the local player and loads that stream without leaving the application.
2. **Given** a stream is offline, geographically restricted, blocked by cross-origin policy, or encoded with an unsupported codec, **When** playback fails, **Then** the player explains the likely limitation and preserves the selected stream details.
3. **Given** a stream requires request headers that a browser client cannot supply, **When** catalog entries are prepared, **Then** that entry is not presented as locally playable.
4. **Given** a selected HLS stream rejects script-based cross-origin requests, **When** the current browser exposes native HLS playback, **Then** the player uses the native path without requiring cross-origin manifest access from application code.
5. **Given** a selected stream cannot use either local playback path, **When** playback fails, **Then** the viewer can open the original source directly for handling by the browser, operating system, or an external player.

---

### User Story 3 - Understand catalog provenance and limitations (Priority: P2)

As a viewer, I can see that channels come from a community-maintained public directory and that availability, rights, and compatibility belong to each source.

**Why this priority**: Public IPTV links can expire, be region-limited, or have changing availability; transparent provenance prevents misleading reliability claims.

**Independent Test**: Review the IPTV introduction and a labeled result, then confirm the source catalog and availability caveats are visible without opening playback.

**Acceptance Scenarios**:

1. **Given** the IPTV page is loaded, **When** the viewer reads its introduction, **Then** the upstream catalog is credited and the application does not imply ownership or guaranteed availability.
2. **Given** a catalog entry carries a restriction label, **When** it is displayed, **Then** the label is visible before playback.

### Edge Cases

- The catalog request is slow, offline, malformed, or rejected.
- Search produces no matches.
- A stream has no channel identifier, country, quality, or restriction label.
- Multiple streams share one channel name.
- A stream URL uses insecure transport while the application is served securely.
- A source requires a custom referrer or user-agent header.
- A source allows media-element playback but denies script-based manifest requests through its cross-origin policy.
- The upstream catalog changes shape or contains duplicate URLs.
- A channel is identified by the upstream blocklist.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The application MUST add IPTV as a primary destination in both desktop and mobile navigation.
- **FR-002**: The IPTV destination MUST retrieve current stream, country, and blocklist information from the user-approved IPTV.org public catalog.
- **FR-003**: The system MUST exclude duplicate stream URLs and entries identified by the upstream adult-content or rights-removal blocklist.
- **FR-004**: The system MUST exclude insecure sources when the application is running in a secure context.
- **FR-005**: Entries requiring a custom referrer or user-agent MUST NOT be represented as locally playable because a browser client cannot reliably supply those forbidden request headers.
- **FR-006**: Viewers MUST be able to search eligible entries by channel title or identifier.
- **FR-007**: Viewers MUST be able to filter eligible entries by country, including an “All countries” state and an “Unknown” state.
- **FR-008**: The directory MUST initially render no more than 48 results and MUST reveal additional results in bounded groups on request.
- **FR-009**: Each result MUST show a channel title, country when derivable, quality when supplied, restriction label when supplied, and an action to attempt local playback.
- **FR-010**: Selecting a result MUST load it into the shared in-application player and bring that player into view without a full-page reload.
- **FR-011**: Loading, empty, failure, and retry states MUST be distinct and understandable.
- **FR-012**: The page MUST credit IPTV.org as the catalog source and state that stream availability and rights remain the responsibility of upstream broadcasters and maintainers.
- **FR-013**: Catalog results and controls MUST remain usable without page-level horizontal overflow from 320 pixels upward.
- **FR-014**: A catalog failure MUST NOT prevent the rest of the application or the standalone player destination from functioning.
- **FR-015**: Eligible HLS streams MUST use browser-native playback before script-based manifest access whenever the browser reports native HLS capability.
- **FR-016**: A locally blocked stream MUST retain an action that opens the original source URL directly in a separate browsing context.

### Key Entities *(include if feature involves data)*

- **IPTV stream**: A public stream candidate with a channel identifier, title, media URL, optional feed, quality, restriction label, and optional header requirements.
- **Country**: A country code, display name, and flag used to filter and describe stream candidates.
- **Blocklist entry**: An upstream instruction identifying a channel that must not appear because of adult-content or rights-removal concerns.
- **Directory filters**: The viewer's current search phrase and selected country.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: A viewer can reach the IPTV destination and narrow the loaded catalog by name and country in under 15 seconds.
- **SC-002**: No more than 48 stream cards are inserted during the initial result render, even when thousands match.
- **SC-003**: Every displayed stream is unique by URL, is not blocklisted, and does not require unavailable custom request headers.
- **SC-004**: Selecting any displayed result updates the local player and selected channel title in one action.
- **SC-005**: At 320, 390, 768, and 1440 pixel widths, the directory has no page-level horizontal overflow.
- **SC-006**: Catalog loading failures present a retry action while all other application destinations remain operable.
- **SC-007**: On a browser reporting native HLS support, the reported Equidia stream is assigned to the native media path without an application-origin cross-site manifest request.

## Assumptions

- IPTV.org supplies user-submitted links to publicly available streams but does not host the video files or guarantee that a link remains online.
- The catalog is read directly from its public static data endpoints; no backend changes are available for rewriting headers or proxying media.
- Browser security policies, geography, source uptime, codec support, and access tokens may prevent individual streams from playing.
- Native HLS preference can avoid script-specific cross-origin restrictions, but it cannot override source downtime, authorization, geography, or browser media support.
- The initial release emphasizes a fast text-led directory rather than downloading the much larger upstream logo catalog.
- Adult-content and rights-removal blocklist entries are excluded by default.
