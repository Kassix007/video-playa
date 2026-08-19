# Implementation plan: UI stabilization

## Context

The application is a Vite/React SPA with hash routing. The home page had a second, inline implementation of program metadata, schedule tables, and the player modal despite reusable components already existing under `src/components/program`.

## Constitution check

- [x] Mobile tables use a card layout with visible field labels.
- [x] The modal has a label, initial focus, Escape handling, and scroll locking.
- [x] The stream iframe uses the minimum currently required sandbox permissions.
- [x] Production build and responsive browser checks are defined.

## Technical approach

Make `Home` responsible only for fetching, parsing, grouping, and selection state. Render program details through `ProgramHeader`, `ProgramTable`, and `VideoModal`. Add `data-label` metadata to table cells so CSS can produce semantic-looking cards without duplicating markup. Keep the desktop table intact above the mobile breakpoint.

## Verification

- `npm run build`
- Load, error, navigation, theme, modal-open, modal-Escape, and responsive-overflow checks
