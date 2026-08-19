# Feature Specification: Mobile Footer Visibility

**Feature Branch**: `005-mobile-footer`

**Created**: 2026-08-18

**Status**: Implemented and verified

**Input**: User description: "The footer is not visible on mobile view."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Reach the complete footer on mobile (Priority: P1)

As a mobile viewer, I can reach and read the entire footer at the end of every page without links or text being clipped by the viewport edge or device safe area.

**Why this priority**: The footer contains product attribution and secondary navigation that are currently partially or completely inaccessible on compact screens.

**Independent Test**: Open every primary page at 320 and 390 pixels wide, scroll to the document end, and confirm the copyright text and every footer link are fully visible and operable.

**Acceptance Scenarios**:

1. **Given** a page shorter than the viewport, **When** it renders on mobile, **Then** the complete footer rests at the bottom of the viewport without clipping.
2. **Given** a page taller than the viewport, **When** the viewer scrolls to the end, **Then** the complete footer is reachable after the page content.
3. **Given** a device with a bottom safe area, **When** the footer is reached, **Then** its links remain above the unsafe region.

### Edge Cases

- The viewport is 320 pixels wide.
- Footer link labels wrap onto another line.
- The device reports a bottom safe-area inset.
- The page content changes height after asynchronous data loads.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The application shell MUST reserve enough vertical space for the complete footer at all supported viewport sizes.
- **FR-002**: The mobile footer MUST provide explicit vertical spacing around its copyright and navigation content.
- **FR-003**: The mobile footer MUST account for device bottom safe areas.
- **FR-004**: Every footer link MUST remain visible, keyboard-focusable, and at least 44 CSS pixels tall or have an equivalent 44-pixel interaction area.
- **FR-005**: Footer improvements MUST NOT introduce page-level horizontal scrolling.
- **FR-006**: The footer MUST remain part of normal document flow rather than obscuring page content.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: At 320, 390, 768, and 1440 pixel widths, scrolling to the document end reveals 100% of the footer text and links.
- **SC-002**: The footer produces no page-level horizontal overflow at any supported width.
- **SC-003**: Every footer link can be focused and activated using only a keyboard.

## Assumptions

- “Visible” means fully reachable and unclipped at the end of the document, not permanently fixed over content.
- Existing footer content and destinations remain unchanged.
- The application continues to use a sticky-footer page layout for short pages.
