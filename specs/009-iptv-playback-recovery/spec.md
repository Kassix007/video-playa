# Feature Specification: IPTV Playback Recovery

**Feature Branch**: `009-iptv-playback-recovery`

**Created**: 2026-08-19

**Status**: Implemented and verified

**Input**: User description: "None of the IPTV links work in the browser. Work around what can be handled inside this client instead of relying on external-player handoff or backend changes."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Recover with another browser playback path (Priority: P1)

As a viewer, I want the in-application player to try every permitted HLS playback path before declaring a public stream unavailable.

**Why this priority**: Some HLS sources fail through a browser's native decoder but succeed through a script-assisted media engine, or vice versa.

**Independent Test**: Use one source rejected by the first HLS path but accepted by the second, then verify that playback recovers in the same player without another viewer action.

**Acceptance Scenarios**:

1. **Given** the browser exposes more than one HLS playback path, **When** the first path fails before or during media startup, **Then** the player releases it and attempts the second path exactly once.
2. **Given** the fallback path begins, **When** its state is shown, **Then** stale errors from the first path disappear and the selected engine reflects the active attempt.
3. **Given** either path reaches usable media, **When** playback becomes ready, **Then** no additional fallback is started.
4. **Given** every permitted path fails, **When** recovery is exhausted, **Then** one stable error and the original-source action remain visible.
5. **Given** the first path remains in loading state without usable media or a terminal error, **When** the bounded startup window expires, **Then** the player advances to its remaining permitted path instead of hanging indefinitely.

---

### User Story 2 - Try another source for the same channel (Priority: P1)

As a viewer, I want the IPTV page to try another catalog URL for the same channel when the selected URL cannot play.

**Why this priority**: The public catalog often contains multiple independently hosted sources for one channel; one dead or restricted URL should not end the attempt when another candidate exists.

**Independent Test**: Select a channel with multiple eligible URLs, make the first fail, and verify that the player advances through distinct alternatives until one succeeds or the bounded attempt limit is reached.

**Acceptance Scenarios**:

1. **Given** the selected channel has an untried equivalent source, **When** all player paths fail for the current URL, **Then** the directory automatically attempts the next equivalent source.
2. **Given** automatic source recovery is active, **When** the player changes URL, **Then** the viewer can see the current attempt number and recovery reason.
3. **Given** a source has already been tried during the current tune action, **When** another recovery decision is made, **Then** that URL is not repeated.
4. **Given** the player succeeds or reaches the attempt limit, **When** its state settles, **Then** automatic source switching stops.

---

### User Story 3 - Start with the best browser candidates (Priority: P2)

As a viewer, I want the directory to prioritize sources without known availability warnings while still allowing me to reveal the full catalog.

**Why this priority**: The catalog explicitly labels feeds that are geo-blocked or not continuously available; putting them into the default result set creates avoidable failures.

**Independent Test**: Open IPTV with the default availability filter, verify warning-labeled sources are omitted, then switch to the full catalog and verify they return with their labels.

**Acceptance Scenarios**:

1. **Given** the catalog contains labeled restricted or intermittent streams, **When** the IPTV page first loads, **Then** the default result set excludes those known lower-probability candidates.
2. **Given** the viewer chooses to include all sources, **When** results update, **Then** warning-labeled entries return and keep their visible labels.
3. **Given** a source is attempted during the current page visit, **When** its outcome becomes known, **Then** the corresponding result can show whether it worked or failed in this browser session.

### Edge Cases

- A browser reports native HLS capability but rejects only a particular manifest or separated audio/video arrangement.
- The first playback path emits multiple error events while the fallback is initializing.
- A channel has dozens of duplicate or alternate sources.
- Different regional feeds share one channel identifier and must not be substituted for each other.
- A stream has no channel identifier or feed identifier.
- A successful source later buffers or ends after it has already become usable.
- A source requires forbidden request headers, cookies, DRM, a token, geography, or missing cross-origin permission.
- The viewer tunes a different channel while an automatic recovery timer is pending.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: When the browser exposes both native and script-assisted HLS playback, the shared player MUST attempt a second permitted path after a terminal failure from the first path.
- **FR-002**: Each playback path MUST be attempted no more than once for one source assignment.
- **FR-003**: Starting a fallback path MUST release the failed path, clear its visible error, and prevent late events from changing the active attempt.
- **FR-004**: The player MUST identify the currently active playback engine and communicate that a compatibility fallback is being attempted.
- **FR-005**: A source MUST be considered successful for recovery purposes once it reaches ready or playing state.
- **FR-006**: The IPTV directory MUST identify equivalent alternatives by matching channel and feed identity; entries without that identity MAY use an exact normalized title match.
- **FR-007**: Automatic source recovery MUST try distinct equivalent URLs only and MUST stop after three total source URLs for one tune action.
- **FR-008**: The IPTV page MUST show the selected channel, current source attempt, maximum bounded attempts, and recovery state while a tune action is active.
- **FR-009**: Selecting a different channel manually MUST cancel the pending recovery chain and begin a new one.
- **FR-010**: The default IPTV result set MUST omit sources carrying a non-empty availability warning label.
- **FR-011**: The viewer MUST be able to switch between the default higher-probability result set and all otherwise eligible sources.
- **FR-012**: Warning labels MUST remain visible when all sources are included.
- **FR-013**: The directory SHOULD mark attempted source URLs as working or failed for the current page visit only.
- **FR-014**: When all player paths and equivalent source attempts are exhausted, the existing original-source recovery action MUST remain available.
- **FR-015**: Recovery MUST NOT introduce a media proxy, restreamer, forged browser-controlled headers, digital-rights bypass, geography bypass, or unbounded retry loop.
- **FR-016**: Recovery controls and status MUST remain accessible, keyboard-operable, reduced-motion aware, and free from page-level horizontal overflow at 375, 768, and 1280 pixel widths.
- **FR-017**: A playback path that produces neither usable media nor a terminal result within ten seconds MUST be treated as a stalled startup and MAY advance to the next permitted path.

### Key Entities

- **Playback path attempt**: One native or script-assisted attempt for a single source URL, with engine and lifecycle outcome.
- **Tune session**: One viewer selection plus its ordered, bounded set of attempted equivalent URLs and current status.
- **Equivalent source group**: Catalog entries sharing the same channel and feed identity, or an exact normalized title when no identity exists.
- **Session outcome**: A temporary working or failed result for one URL during the current page visit.
- **Availability filter**: The viewer's choice between higher-probability unlabeled sources and the full otherwise eligible catalog.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: A controlled source rejected by the first HLS path reaches ready through the second path without viewer intervention.
- **SC-002**: A channel recovery session attempts no URL twice and stops after no more than three distinct source URLs.
- **SC-003**: Selecting a channel with alternatives updates visible attempt progress within one second of each terminal source failure.
- **SC-004**: The default directory excludes every source with a non-empty upstream availability label, while the full-catalog option restores them in one interaction.
- **SC-005**: After recovery exhaustion, exactly one stable player error and one original-source action remain.
- **SC-006**: At 375, 768, and 1280 pixel widths, the recovery status and directory controls introduce zero page-level horizontal overflow.
- **SC-007**: Ten rapid channel selections settle on only the final tune session, with no late automatic switch from an earlier selection.
- **SC-008**: A silent HLS startup stall advances to the remaining playback path within ten seconds and does not leave the player loading indefinitely.

## Assumptions

- IPTV.org is a public link catalog, not a browser playback service, and its official validation tooling runs outside the browser security sandbox.
- The public API no longer supplies current checked-at or live-status fields, so the client cannot pre-filter the entire directory by authoritative live health.
- Equivalent sources exist for only a subset of channels; recovery cannot manufacture an alternative when the catalog supplies none.
- Browser-permitted fallback improves compatibility but cannot make a CORS-blocked, geo-blocked, offline, tokenized, DRM-protected, or header-dependent source playable.
- External-source handoff remains a final recovery action, but successful in-application playback is attempted first.

## Delivered Evidence

- A controlled native-HLS failure recovered through HLS.js and reached Ready without another viewer action.
- A silent native-HLS start advanced to HLS.js after eight seconds instead of remaining on the first engine indefinitely.
- A live current-catalog source, Africa 24 English, reached Ready inside the shared player through native HLS.
- Circle recovery attempted three distinct equivalent URLs, marked all three failed for the session, and stopped with one stable original-source action.
- Manual retuning during a pending Circle retry remained on Africa 24 English, confirming that stale recovery work was cancelled.
- Best chance hid a warning-labeled result; All sources restored it with its `Not 24/7` label.
- Browser checks found zero application runtime problems and zero horizontal overflow at the tested desktop and 375-pixel mobile layouts. Upstream CORS policy failures remained visible as expected external network restrictions.
- `npx eslint src` and `npm run build` completed successfully on 2026-08-19.
