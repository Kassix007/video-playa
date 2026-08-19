# Feature Specification: Scalable Navigation Shell

**Feature Branch**: `004-scalable-navigation`

**Created**: 2026-08-18

**Status**: Implemented and verified

**Input**: User description: "Make navigation between tabs smoother and modular for future tabs, repair the buggy gooey effect, add a UX-friendly mobile hamburger sidebar, preserve mobile responsiveness, and shift the accent from orange toward a darker red."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Move between primary sections smoothly (Priority: P1)

As a viewer, I can move between primary sections without a page reload, visual jump, or ambiguous active state so the application feels continuous and responsive.

**Why this priority**: Navigation is the entry point to every current and future section, and instability here makes the whole product feel unreliable.

**Independent Test**: Open the application on a desktop-sized viewport, switch repeatedly between each primary section, and confirm the destination, active state, and transition remain synchronized.

**Acceptance Scenarios**:

1. **Given** a viewer is on any primary section, **When** they select another section, **Then** the destination content appears without a full-page reload and the active navigation state moves to exactly one item.
2. **Given** a viewer switches sections repeatedly or quickly, **When** each navigation completes, **Then** no stale highlight, duplicate effect, detached particles, or overlapping label remains.
3. **Given** a viewer navigates directly to a supported section URL, **When** the application loads, **Then** the corresponding navigation item is active.

---

### User Story 2 - Navigate comfortably on mobile (Priority: P1)

As a mobile viewer, I can open a clearly labeled menu, understand where each destination leads, choose a section, and return to the content without the header becoming crowded.

**Why this priority**: The current tab treatment does not scale down cleanly, while mobile viewers need large targets, clear focus, and an unobstructed content area.

**Independent Test**: At a 390-pixel viewport, open the hamburger menu, use keyboard and touch-style interactions to choose a destination, dismiss the menu, and verify the content remains free of horizontal overflow.

**Acceptance Scenarios**:

1. **Given** the viewport is mobile-sized, **When** the page loads, **Then** primary navigation and appearance controls collapse behind one accessible hamburger control.
2. **Given** the mobile menu is open, **When** the viewer selects a destination, activates the close control, taps the backdrop, or presses Escape, **Then** the menu closes predictably.
3. **Given** the mobile menu is open, **When** the viewer moves keyboard focus, **Then** focus remains within the menu until it closes and returns to the menu trigger after an explicit dismissal.
4. **Given** the application is viewed at 320 pixels wide or in either orientation, **When** the menu and every current section are used, **Then** controls remain readable, touch targets remain usable, and no horizontal page scrolling appears.

---

### User Story 3 - Extend navigation without duplicating wiring (Priority: P2)

As a developer, I can add another primary section through one shared route definition so the desktop navigation, mobile navigation, and routed content stay aligned.

**Why this priority**: More tabs are planned, so route metadata must not be duplicated across components where labels, paths, and active states can drift.

**Independent Test**: Add a temporary route entry to the shared definition and confirm that it becomes a routable desktop tab and mobile menu item with the expected description and active state.

**Acceptance Scenarios**:

1. **Given** a valid new primary route definition, **When** it is added to the shared navigation source, **Then** it appears in both desktop and mobile navigation without a second navigation-specific edit.
2. **Given** the number or label length of primary routes increases, **When** the desktop navigation cannot fit safely, **Then** it remains contained and does not overlap branding or utilities.

---

### User Story 4 - Recognize a confident dark-red identity (Priority: P2)

As a viewer, I see a distinctive deep-red accent rather than an orange-coral one, while text and controls remain legible in light and dark themes.

**Why this priority**: Color is a repeated brand cue across the header, controls, and active states; an unintended orange cast weakens the intended identity.

**Independent Test**: Compare the primary brand, action, focus, and active-navigation colors in both themes and confirm they read as dark red while meeting contrast and state-recognition needs.

**Acceptance Scenarios**:

1. **Given** either supported theme, **When** a viewer sees the header, active navigation, and primary actions, **Then** the dominant accent reads as deep red rather than orange.
2. **Given** hover, focus, active, and disabled states, **When** the viewer interacts with accented controls, **Then** the state remains distinguishable without depending on color alone.

### Edge Cases

- A section URL is opened directly before the navigation has previously rendered.
- A viewer switches tabs rapidly while the active indicator is still moving.
- The viewport crosses the desktop/mobile breakpoint while the drawer is open.
- A route label is materially longer than current labels or several new routes are added.
- Browser motion reduction is enabled.
- The mobile viewport is 320 pixels wide, landscape-oriented, or has a short height.
- Focus is inside the drawer when it closes because of a route change.
- A viewer uses only the keyboard or a screen reader to open, traverse, and close navigation.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The system MUST use one shared definition for every primary route's path, label, description, and destination content.
- **FR-002**: Desktop navigation MUST expose all primary destinations as tabs and indicate exactly one active destination when the current URL matches a defined primary route.
- **FR-003**: Section changes MUST occur without a full-page reload and MUST provide a restrained content transition that does not delay interaction.
- **FR-004**: The active-tab effect MUST use a single stable visual indicator and MUST NOT leave duplicate labels, particles, or stale visual artifacts after navigation or resizing.
- **FR-005**: Active navigation state MUST be derived from the current destination rather than maintained as a separate competing selection state.
- **FR-006**: At mobile widths, the header MUST replace desktop tabs and header utilities with an accessible hamburger control.
- **FR-007**: The mobile control MUST open an off-canvas navigation panel containing all primary destinations, destination descriptions, a close control, and appearance controls.
- **FR-008**: The mobile panel MUST close after destination selection, explicit close activation, backdrop activation, Escape, or transition to a desktop-sized viewport.
- **FR-009**: The mobile panel MUST prevent background scrolling while open, keep keyboard focus within the panel, and restore focus to the trigger after an explicit dismissal.
- **FR-010**: All navigation controls MUST expose accessible names, visible keyboard focus, current-destination semantics, and touch targets of at least 44 by 44 CSS pixels.
- **FR-011**: Navigation and page transitions MUST honor the viewer's reduced-motion preference by removing nonessential movement.
- **FR-012**: The layout MUST remain free of horizontal page overflow at supported viewport widths from 320 pixels upward.
- **FR-013**: The primary accent family MUST be changed from orange-coral to deep red across brand, action, active, hover, and focus roles in light and dark themes.
- **FR-014**: Accent foregrounds and critical text MUST preserve readable contrast in both themes.
- **FR-015**: The navigation shell MUST tolerate additional primary route entries without requiring duplicate desktop and mobile navigation data.

### Key Entities *(include if feature involves data)*

- **Primary route**: A navigable application section defined by its URL path, user-facing label, short mobile-menu description, and destination content.
- **Navigation state**: The current destination, viewport presentation, and whether the mobile panel is open; the active item is derived from the current destination.
- **Theme palette**: The semantic color roles used by branding, actions, navigation states, focus treatments, and their readable foregrounds.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: In 20 consecutive switches across current primary sections, the destination and single active indicator agree every time with no visible leftover effect artifacts.
- **SC-002**: At viewport widths of 320, 390, 768, and 1440 pixels, the page has no horizontal overflow and all navigation actions remain operable.
- **SC-003**: Every mobile menu dismissal method succeeds in one attempt, and explicit close, backdrop, and Escape dismissals return keyboard focus to the hamburger trigger.
- **SC-004**: A new primary section can be exposed in routing, desktop navigation, and mobile navigation by adding one shared route entry.
- **SC-005**: Automated production build and static type checks complete without errors after the navigation refactor.
- **SC-006**: Both themes use a deep-red primary accent with readable foreground text for primary actions and active navigation states.

## Assumptions

- Current primary destinations remain Home and About; this task makes their presentation extensible but does not invent additional product sections.
- The existing application-side routing model remains the navigation mechanism.
- The mobile breakpoint follows the existing compact-header breakpoint unless testing reveals a fit issue.
- The repaired gooey identity is intentionally restrained to one elastic moving highlight; decorative particle bursts are not required.
- Existing light, dark, and automatic appearance preferences remain available.
- Backend changes and video-provider behavior are outside this navigation task.
