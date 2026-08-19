# Feature Specification: Broadcast Color System and Responsive Header

**Feature Branch**: `002-color-system`

**Created**: 2026-08-15

**Status**: Ready

**Input**: User description: "New spec for color palette. Make it consistent across web and mobile. Fix the header for both mobile and web. Be creative and not generic AI-generated."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Recognizable Visual System (Priority: P1)

A viewer should immediately recognize Video Playa as a deliberate broadcast guide, with the same visual identity across navigation, page headers, schedules, buttons, links, dialogs, and footer surfaces.

**Why this priority**: A coherent identity makes the product easier to understand and prevents individual components from looking assembled from unrelated templates.

**Independent Test**: Compare the home and about pages in light and dark modes; the same roles—page background, surface, primary action, secondary accent, text, border, focus, and error—remain visually consistent.

**Acceptance Scenarios**:

1. **Given** a viewer is using dark mode, **When** they move between pages, **Then** every shared component uses the same carbon, warm-neutral, signal, and accent color roles.
2. **Given** a viewer selects light mode, **When** the interface updates, **Then** hierarchy and brand character remain intact without washed-out text or low-contrast controls.

---

### User Story 2 - Useful Header at Every Width (Priority: P1)

A viewer should be able to identify the product, see the current page, move between primary pages, and change appearance without the header clipping, wrapping unpredictably, or dominating the screen.

**Why this priority**: The header is the first and most repeated interface element, and its current mobile arrangement consumes excessive space and overflows at narrow widths.

**Independent Test**: Open either route at 375px, 768px, and 1280px widths; product identity, both navigation destinations, and all appearance options remain visible and operable.

**Acceptance Scenarios**:

1. **Given** a 1280px viewport, **When** the page loads, **Then** brand, navigation, and appearance controls form one balanced horizontal header.
2. **Given** a 375px viewport, **When** the page loads, **Then** brand and appearance controls occupy a compact first row and navigation occupies a complete second row with no horizontal clipping.
3. **Given** keyboard navigation, **When** focus moves through the header, **Then** every interactive control has a visible focus indication and the active page remains distinguishable without relying on color alone.

---

### User Story 3 - Editorial Page Introduction (Priority: P2)

A viewer should understand the page purpose from a distinctive, concise introduction that feels connected to a live broadcast guide rather than a generic software dashboard.

**Why this priority**: Clear page framing strengthens both usability and product personality after the navigation problems are resolved.

**Independent Test**: View the home and about introductions independently; each has a route-appropriate label, one primary heading, supporting copy, and any available action without layout collision.

**Acceptance Scenarios**:

1. **Given** the home route, **When** the introduction is shown, **Then** the live-guide context is clear before the viewer builds the schedule.
2. **Given** a narrow screen, **When** an introduction includes an action, **Then** text and action stack cleanly and the action remains comfortably tappable.

### Edge Cases

- Long translated navigation or theme labels must not force content outside the viewport.
- At 200% zoom, header controls must remain available without overlapping the page introduction.
- If decorative effects are unavailable or motion is reduced, active navigation must remain obvious through shape, border, and text treatment.
- Long headings must wrap within the introduction without colliding with decorative elements or actions.
- Both light and dark palettes must retain clear boundaries on displays with low brightness or reduced color saturation.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The product MUST define one semantic color system covering background, raised surface, text, muted text, primary signal, secondary accent, border, link, focus, error, overlay, and shadow roles.
- **FR-002**: Dark and light appearance modes MUST express the same visual identity and information hierarchy.
- **FR-003**: The primary signal color MUST be reserved for actions, live status, and selected appearance state rather than large decorative areas.
- **FR-004**: Text and interactive controls MUST meet WCAG AA contrast expectations in normal, hover, focus, active, and disabled states.
- **FR-005**: The shared header MUST present product identity, primary navigation, and appearance selection on every route.
- **FR-006**: At widths of 760px and below, the shared header MUST use a predictable two-row composition with no horizontal overflow.
- **FR-007**: At widths above 760px, the shared header MUST use a single-row composition with balanced spacing between identity, navigation, and appearance controls.
- **FR-008**: Active navigation MUST be identifiable through at least two visual signals, including one that does not depend on hue.
- **FR-009**: Page introductions MUST support a short context label, one primary heading, supporting text, and an optional action.
- **FR-010**: Decorative header and introduction details MUST not capture input, obscure content, or prevent use when motion is reduced.
- **FR-011**: Header controls MUST remain keyboard accessible and provide a clearly visible focus state.
- **FR-012**: The color system and header behavior MUST remain consistent on the home and about routes.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: At 375px, 768px, and 1280px widths, 100% of header identity, navigation, and appearance controls are visible without page-level horizontal scrolling.
- **SC-002**: At 200% zoom, all header controls remain reachable and no text overlaps another interactive element.
- **SC-003**: All normal-size text and interactive states meet a contrast ratio of at least 4.5:1, with large text meeting at least 3:1.
- **SC-004**: A viewer can identify the active route and switch appearance mode using only a keyboard in under 15 seconds.
- **SC-005**: Home and about pages use the same semantic color roles for 100% of shared components.
- **SC-006**: Reduced-motion mode preserves complete navigation clarity with no required information communicated solely by animation.

## Assumptions

- “Web” refers to wide desktop and laptop layouts, while “mobile” includes viewports down to 375px.
- Existing light, dark, and system appearance choices remain in scope.
- Existing routes and navigation destinations remain unchanged.
- The desired personality is editorial sports-broadcast rather than gaming neon, corporate blue, or gradient-heavy technology branding.
- Page content and schedule behavior outside the shared color and header system remain unchanged.
