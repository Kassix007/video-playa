# Feature Specification: About Page Refresh

**Feature Branch**: `014-about-page-refresh`

**Created**: 2026-08-29

**Status**: Draft

**Input**: User description: "Fix the About page so it clearly explains Video Playa and matches the quality of the rest of the site."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Understand the product quickly (Priority: P1)

As a first-time visitor, I can understand what Video Playa does, why it exists, and how it helps me get from a fixture or channel to playback without unnecessary searching.

**Why this priority**: The current page lists implementation technologies but does not explain the product's value to a viewer.

**Independent Test**: Show only the About page to a first-time visitor and confirm that they can describe the product purpose and its three-step viewing flow within 15 seconds.

**Acceptance Scenarios**:

1. **Given** a first-time visitor opens About, **When** they read the opening content, **Then** they learn that Video Playa is a focused desk for schedules, public channels, and direct playback.
2. **Given** the visitor continues through the page, **When** they reach the process section, **Then** they see a clear progression from finding a fixture or channel to opening a stream.
3. **Given** the visitor does not know the project's technology stack, **When** they read the page, **Then** the core product story remains understandable without technical knowledge.

---

### User Story 2 - Understand the product principles (Priority: P2)

As a prospective viewer, I can see the principles that shape Video Playa so I know what kind of experience to expect before using it.

**Why this priority**: Product principles build trust by setting expectations about speed, control, and distraction-free playback.

**Independent Test**: Read the principles section independently and confirm it communicates three distinct promises without relying on the hero or footer.

**Acceptance Scenarios**:

1. **Given** a visitor reaches the principles section, **When** they scan its content, **Then** they can distinguish speed, viewer control, and low-distraction design as separate promises.
2. **Given** a visitor uses either supported color theme, **When** they inspect the principles, **Then** every heading, description, and visual boundary remains readable.

---

### User Story 3 - Continue into the product (Priority: P3)

As an informed visitor, I can move directly from the About page to a useful viewing destination instead of reaching a content dead end.

**Why this priority**: The About page should convert understanding into action while keeping navigation choices limited and clear.

**Independent Test**: Use only the calls to action inside the About content to reach the program guide or dedicated player in one activation.

**Acceptance Scenarios**:

1. **Given** a visitor wants to browse scheduled fixtures, **When** they activate the program-guide action, **Then** they reach the Home destination in one step.
2. **Given** a visitor already has a stream address, **When** they activate the player action, **Then** they reach the dedicated Player destination in one step.
3. **Given** a keyboard-only visitor, **When** they navigate the About page, **Then** both actions receive visible focus and activate without pointer input.

### Edge Cases

- The page is viewed at 320 pixels wide or at high browser zoom.
- A heading or supporting sentence wraps across several lines.
- The page is viewed in either supported color theme.
- A visitor prefers reduced motion.
- A visitor navigates using only a keyboard or screen reader.
- The page is shorter than the viewport and must still lead naturally into the shared footer.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The About page MUST identify Video Playa as a focused destination for schedules, public channels, and direct playback.
- **FR-002**: The page MUST explain the viewer problem the product addresses without requiring technical knowledge.
- **FR-003**: The page MUST present a three-step journey that covers finding content, choosing a destination, and opening playback.
- **FR-004**: The page MUST present three distinct product principles covering speed, viewer control, and a low-distraction experience.
- **FR-005**: The page MUST provide one action to reach the program guide and one action to reach the dedicated player.
- **FR-006**: Calls to action MUST use clear destination-oriented labels rather than generic labels such as "Learn more."
- **FR-007**: The page MUST retain one primary heading and a logical descending heading order.
- **FR-008**: Repeated content groups MUST remain distinguishable when read visually and by assistive technology.
- **FR-009**: Every interactive element MUST be keyboard-operable and MUST provide a visible focus state.
- **FR-010**: Decorative numbering or shapes MUST NOT create redundant announcements for assistive technology.
- **FR-011**: The page MUST remain readable and operable at 375, 768, and 1280 pixels without page-level horizontal scrolling.
- **FR-012**: At compact widths, multi-column content MUST form a single logical reading order without hidden or clipped content.
- **FR-013**: The page MUST preserve readable text, visible boundaries, and focus states in both supported color themes.
- **FR-014**: Any page-entry or interaction motion MUST respect the viewer's reduced-motion preference.
- **FR-015**: The page MUST retain its current route identity and remain compatible with the shared header, navigation, and footer.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: In a five-person comprehension check, at least four participants can state the product purpose and three-step viewing flow within 15 seconds.
- **SC-002**: 100% of About-page actions reach their labeled destination with one activation.
- **SC-003**: At 320, 375, 768, and 1280 pixel widths, all content remains reachable with no page-level horizontal scrolling.
- **SC-004**: All About-page actions can be reached and activated using only a keyboard.
- **SC-005**: The page contains exactly one primary heading and no skipped heading level.
- **SC-006**: In both supported color themes, all text and interactive states meet the project's accessible-interaction standard.

## Assumptions

- The audience includes first-time visitors and returning viewers who want project context.
- The page remains concise and product-focused rather than becoming developer documentation.
- The existing Home and Player destinations remain valid.
- The shared header and redesigned footer continue to frame the page.
- English remains the only content language for this feature.

## Dependencies

- Primary navigation continues to expose Home, Player, and About routes.
- The shared color system continues to provide light and dark themes.
- The shared page header and footer remain available.

## Out of Scope

- A team biography, changelog, roadmap, donation flow, or contact form.
- Detailed developer setup instructions or a full technology inventory.
- New viewing tools, routes, data sources, or backend behavior.
- New imagery, video, or remote content.
- Analytics collection for About-page interactions.
