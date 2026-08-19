# Feature Specification: Portable Playback Launch

**Feature Branch**: `003-portable-playback`

**Created**: 2026-08-18

**Status**: Implemented

**Input**: User description: "Investigate why Watch here fails, determine client-only alternatives, and provide the strongest available mobile, Picture-in-Picture, and casting experience without backend changes."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Reach a Working Player (Priority: P1)

A viewer selects a scheduled event and reaches the provider’s player without being trapped in an embedded error page.

**Why this priority**: Playback access is the schedule’s primary outcome; an embedded rejection makes the central action appear broken even when the schedule and link are valid.

**Independent Test**: Load the schedule, select the player action for any event, and confirm that playback is launched outside the blocked embedded context.

**Acceptance Scenarios**:

1. **Given** a viewer is on a desktop-sized screen, **When** they select “Open player,” **Then** the provider opens in a separate compact browsing context while Video Playa remains available.
2. **Given** a viewer is on a phone or tablet, **When** they select “Open player,” **Then** the provider opens as a normal top-level browser page suitable for mobile playback.

---

### User Story 2 - Use Available Device Playback Controls (Priority: P1)

A viewer understands where to find Picture-in-Picture, Cast, AirPlay, or screen-mirroring controls when the provider or browser makes those controls available.

**Why this priority**: These controls cannot be operated by Video Playa when playback belongs to a separate protected origin, but viewers still need the strongest available path to their TV or floating player.

**Independent Test**: Load a schedule and verify that the playback guidance is visible before opening a player and accurately describes the available control boundary.

**Acceptance Scenarios**:

1. **Given** a provider exposes Picture-in-Picture or remote-playback controls, **When** the player opens top-level, **Then** the viewer can use those provider or browser controls directly.
2. **Given** native playback controls are unavailable, **When** the viewer reads the guidance, **Then** the product does not falsely claim that Video Playa can initiate those features.

---

### User Story 3 - Recover from Popup Blocking (Priority: P2)

A viewer still reaches the selected player when browser settings block creation of a separate window or tab.

**Why this priority**: Popup policies vary by browser and device; playback should not silently fail because a separate context was denied.

**Independent Test**: Block popups, select “Open player,” and verify that the current page navigates to the provider instead.

**Acceptance Scenarios**:

1. **Given** the browser refuses a separate player context, **When** the viewer selects “Open player,” **Then** the selected provider opens in the current tab.
2. **Given** a separate player context opens successfully, **When** playback is launched, **Then** the provider cannot control the original Video Playa window through an opener relationship.

### Edge Cases

- A provider may still reject playback after it opens top-level; Video Playa must not represent provider availability as guaranteed.
- Mobile browsers may ignore requested popup dimensions and open a full tab instead.
- Picture-in-Picture, Cast, and AirPlay availability varies by provider, browser, operating system, and receiving device.
- A browser may allow a new context but subsequently block autoplay until the viewer interacts with the provider’s player.
- Repeated launches must open the event selected by the viewer rather than a previously selected event.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The schedule MUST provide a clearly labeled action that opens each event’s provider player outside the rejected embedded context.
- **FR-002**: Desktop viewers MUST receive a separate, player-oriented browsing context when their browser permits it.
- **FR-003**: Phone and tablet viewers MUST receive a normal top-level provider page rather than an embedded player.
- **FR-004**: When creation of a separate browsing context fails, the product MUST navigate the current tab to the selected provider.
- **FR-005**: A separately opened provider MUST NOT retain control of the original Video Playa page.
- **FR-006**: The schedule MUST explain that Picture-in-Picture, Cast, AirPlay, and screen mirroring depend on provider or browser controls.
- **FR-007**: The product MUST NOT claim that a playback capability is available when it cannot detect or control that capability.
- **FR-008**: The player action MUST be keyboard accessible and include an event-specific accessible label.
- **FR-009**: The existing direct-link action MUST remain available as a simple alternative.
- **FR-010**: The product MUST avoid weakening iframe restrictions because doing so does not resolve the provider rejection and increases risk.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: 100% of schedule rows provide both a direct link and a clearly labeled player-launch action.
- **SC-002**: On desktop, mobile, and tablet layouts, a viewer reaches the selected top-level provider with one activation.
- **SC-003**: With popup blocking enabled, the viewer still reaches the provider rather than experiencing a silent failure.
- **SC-004**: 100% of player-launch controls are keyboard reachable and announce the associated event.
- **SC-005**: Playback guidance names all four supported fallback categories—Picture-in-Picture, Cast, AirPlay, and screen mirroring—without guaranteeing their availability.
- **SC-006**: No active schedule action opens the known-broken embedded player dialog.

## Assumptions

- No backend or provider-player changes are available within this task.
- The provider remains responsible for stream availability, authentication, device controls, and playback errors.
- Browser and operating-system playback controls are acceptable client-only substitutes when first-class application controls are impossible.
- Opening the provider top-level is permitted even when embedding is rejected.
- Video Playa does not receive a direct media URL or supported cross-origin player API.
