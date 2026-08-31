# Feature Specification: Editorial Footer Redesign

**Feature Branch**: `012-footer-redesign`

**Created**: 2026-08-28

**Status**: Draft for design approval (implementation exists)

**Input**: User description: "Redesign the Video Playa footer and document it through the existing Spec Kit workflow."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Continue to a viewing destination (Priority: P1)

As a viewer who has reached the end of any page, I can immediately choose another Video Playa destination or open the dedicated player without returning to the header.

**Why this priority**: The footer should turn a dead end into a useful next step for viewers who are still deciding what to watch.

**Independent Test**: Reach the footer from each primary page and confirm that Home, IPTV, Equidia, Player, About, and the project source are clearly grouped, correctly labeled, and reachable in one activation.

**Acceptance Scenarios**:

1. **Given** a viewer reaches the footer on any primary page, **When** they inspect the Watch group, **Then** Home, IPTV, Equidia, and Player are available as distinct destinations.
2. **Given** a viewer wants to start a custom stream, **When** they activate the primary footer action, **Then** they reach the dedicated player in one step.
3. **Given** a viewer wants project context, **When** they inspect the Project group, **Then** About and the project source are available without being mixed into viewing destinations.
4. **Given** a viewer activates the external project source, **When** the destination opens, **Then** the current Video Playa page remains available.

---

### User Story 2 - Understand location and return to the page start (Priority: P2)

As a viewer navigating from the footer, I can identify my current section and return to the top of a long page without manually scrolling.

**Why this priority**: Orientation and recovery reduce unnecessary navigation effort, especially after long schedules and channel directories.

**Independent Test**: Open each primary route, reach the footer, verify that the current route is distinguishable from the other links, and activate the return-to-top control using pointer and keyboard input.

**Acceptance Scenarios**:

1. **Given** a viewer is on a primary Video Playa route, **When** they reach the footer, **Then** the matching footer destination is visibly and programmatically identified as the current page.
2. **Given** a viewer is at the end of a long page, **When** they activate Back to top, **Then** the page returns to its beginning and the control does not change the current route.
3. **Given** a viewer prefers reduced motion, **When** they activate Back to top, **Then** the return does not require prolonged animation.

---

### User Story 3 - Read and operate the footer on any supported display (Priority: P3)

As a viewer using a compact phone, tablet, desktop, keyboard, or either color theme, I can read and operate every footer element without clipping, horizontal scrolling, or loss of focus visibility.

**Why this priority**: The redesigned footer adds more content than the previous strip and must preserve the access guarantees established by the mobile-footer feature.

**Independent Test**: Inspect the footer at 375, 768, and 1280 pixels in both color themes, then navigate every interactive element using only a keyboard.

**Acceptance Scenarios**:

1. **Given** a 375-pixel viewport, **When** the footer is displayed, **Then** its lead content, navigation groups, and bottom bar form a readable single-column flow with no page-level horizontal scrolling.
2. **Given** a 768-pixel or wider viewport, **When** the footer is displayed, **Then** its lead content and navigation remain visually distinct without excessive empty space or overlapping content.
3. **Given** either supported color theme, **When** a viewer reads or focuses footer content, **Then** text, controls, borders, and current-page state remain distinguishable.
4. **Given** keyboard-only navigation, **When** focus moves through the footer, **Then** every interactive element receives a visible focus indicator in a logical order.

### Edge Cases

- A page is shorter than the viewport and the footer must still rest at the bottom of the visible page.
- A page grows after delayed content loads and the footer must remain after that content in normal reading order.
- The viewport is 320 pixels wide or reports a bottom safe-area inset.
- A navigation label wraps to a second line.
- The current calendar year changes while the application remains available.
- A viewer uses high zoom, keyboard-only navigation, or reduced-motion preferences.
- The external project destination is unavailable; the remaining footer navigation must continue to work.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: Every primary application page MUST display the same footer after its main content.
- **FR-002**: The footer MUST identify Video Playa and communicate its purpose as a focused destination for live fixtures, public channels, and direct playback.
- **FR-003**: The footer MUST present Home, IPTV, Equidia, and Player within a group labeled Watch.
- **FR-004**: The footer MUST present About and the external project source within a separate group labeled Project.
- **FR-005**: The footer MUST provide a visually prominent action that reaches the dedicated Player destination in one activation.
- **FR-006**: The destination matching the current primary page MUST expose a current-page state visually and to assistive technology.
- **FR-007**: The external project-source destination MUST preserve the viewer's current Video Playa page when opened.
- **FR-008**: The footer MUST provide a keyboard-operable Back to top control that returns the current document to its beginning without changing routes.
- **FR-009**: The footer MUST display the current year, the Video Playa name, and a concise availability or match-night sign-off.
- **FR-010**: Informational decoration MUST NOT add redundant announcements or controls for assistive technology.
- **FR-011**: Every footer link and button MUST provide a visible focus state and an interaction area of at least 44 by 44 pixels where space permits.
- **FR-012**: The footer MUST remain readable and operable at 375, 768, and 1280 pixels without page-level horizontal scrolling.
- **FR-013**: At widths below 768 pixels, the footer MUST arrange its lead, navigation, and bottom content in a linear reading order without hiding any destination.
- **FR-014**: The footer MUST account for device bottom safe areas and MUST remain in normal document flow.
- **FR-015**: The footer MUST preserve readable text, visible borders, current-page state, and focus indicators in both supported color themes.
- **FR-016**: Motion associated with footer interactions MUST respect the viewer's reduced-motion preference.
- **FR-017**: The redesign MUST preserve the visibility and no-overflow guarantees established by the Mobile Footer Visibility feature.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: At 320, 375, 768, and 1280 pixel widths, 100% of footer text and controls are reachable without page-level horizontal scrolling.
- **SC-002**: All eight footer destinations and the Back to top control can be reached and activated using only a keyboard.
- **SC-003**: A viewer can reach any listed Video Playa destination from the footer with one activation.
- **SC-004**: On every primary route, exactly one applicable footer destination is identified as the current page.
- **SC-005**: In both supported color themes, all footer text and interactive states meet the project's accessible-interaction standard.
- **SC-006**: In a five-person comprehension check, at least four participants can identify the Player action and distinguish Watch destinations from Project destinations within 10 seconds.
- **SC-007**: All primary pages retain a footer that is fully reachable after delayed content changes and on pages shorter than the viewport.

## Assumptions

- The footer serves all public Video Playa viewers and does not require sign-in or role-specific content.
- Footer labels remain in English for this feature.
- The existing Home, IPTV, Equidia, Player, About, and project-source destinations remain valid.
- The current light and dark themes remain the supported visual contexts.
- The prior Mobile Footer Visibility specification remains authoritative for baseline mobile reachability; this feature extends it with richer content and navigation.

## Dependencies

- The primary application routes and their public labels are defined and stable.
- The application shell continues to place one shared footer after page content.
- The theme system continues to expose light and dark visual modes.

## Out of Scope

- Newsletter signup, account controls, social-media feeds, advertising, or personalized footer content.
- New legal, privacy, cookie, or terms pages.
- New viewing destinations or changes to the behavior of existing destinations.
- Analytics collection for footer interactions.
- Localization beyond the current English labels.
