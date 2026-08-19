# Feature specification: UI stabilization

## User scenarios

### Scenario 1 — Read the program on any screen

**Given** a program has been loaded  
**When** a viewer opens the guide on a phone or desktop  
**Then** every event’s time, matchup, channel, and actions are readable without page-level horizontal scrolling.

### Scenario 2 — Watch a stream in place

**Given** a schedule row is visible  
**When** a viewer selects “Watch here”  
**Then** a labeled video dialog opens, focuses its close control, locks background scrolling, and closes by button, backdrop, or Escape.

### Scenario 3 — Navigate and choose a theme

**Given** any application route  
**When** a viewer uses the navigation or theme controls with pointer or keyboard  
**Then** the selected route and theme are visibly indicated and persist as expected.

## Requirements

- **FR-001**: The guide must use one shared implementation for program metadata, schedule rows, and the video dialog.
- **FR-002**: Schedule rows must become labeled cards at widths of 520px or less.
- **FR-003**: The video dialog must close with Escape and prevent background page scrolling while open.
- **FR-004**: The video iframe must use least-privilege sandbox permissions and send no referrer.
- **FR-005**: Each page must have one top-level heading and meaningful document metadata.
- **FR-006**: Buttons and links must retain visible keyboard focus styling.

## Edge cases

- A missing or unreachable program source produces a readable error and leaves the build button usable.
- Long matchup or channel text wraps without covering an action.
- A short landscape viewport keeps the full player inside the visible area.
- Reduced-motion preferences suppress decorative navigation animation.

## Success criteria

- **SC-001**: The production TypeScript/Vite build completes with no errors.
- **SC-002**: The guide has no page-level horizontal overflow at 375px, 768px, or 1280px.
- **SC-003**: All primary navigation, theme, build, watch, and close controls are keyboard reachable.
- **SC-004**: No user-facing replacement or mojibake characters appear in rendered copy.
