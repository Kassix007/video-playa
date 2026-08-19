# Tasks: IPTV Playback Recovery

**Input**: Design documents from `/specs/009-iptv-playback-recovery/`

**Prerequisites**: `plan.md`, `spec.md`, `research.md`, `data-model.md`, `contracts/ui-contract.md`, `quickstart.md`

## Phase 1: Setup

- [x] T001 Confirm feature 009 is active and current player/IPTV interfaces match `specs/009-iptv-playback-recovery/plan.md`

## Phase 2: Foundational

- [x] T002 Export the shared playback lifecycle callback contract from `src/components/player/StreamPlayer.tsx`

## Phase 3: User Story 1 - Recover with another browser playback path (Priority: P1) 🎯 MVP

**Goal**: Attempt native HLS and HLS.js once each before final failure.

**Independent Test**: Force a native media error on a CORS-enabled HLS control source and verify HLS.js reaches Ready without reloading the page.

- [x] T003 [US1] Refactor bounded HLS engine initialization and native-error fallback in `src/components/player/StreamPlayer.tsx`
- [x] T004 [US1] Preserve clear compatibility-recovery and terminal error presentation in `src/components/player/StreamPlayer.tsx` and `src/components/player/StreamPlayer.css`

## Phase 4: User Story 2 - Try another source for the same channel (Priority: P1)

**Goal**: Automatically try up to three distinct equivalent catalog URLs.

**Independent Test**: Fail a source in a multi-source channel group, observe Source 2, and verify manual retuning cancels the old chain.

- [x] T005 [US2] Add exact channel/feed identity and equivalent-source selection helpers in `src/services/iptv.ts`
- [x] T006 [US2] Implement tune-session attempts, bounded automatic alternates, cancellation, and temporary URL outcomes in `src/pages/Iptv.tsx`
- [x] T007 [US2] Add the accessible tune-session strip and result outcome tags in `src/pages/Iptv.tsx` and `src/pages/MediaPages.css`

## Phase 5: User Story 3 - Start with the best browser candidates (Priority: P2)

**Goal**: Default to unlabeled sources while allowing the full eligible catalog.

**Independent Test**: Verify a warning-labeled entry is absent under Best chance and restored under All sources.

- [x] T008 [US3] Add the default availability filter and full-catalog option in `src/pages/Iptv.tsx`
- [x] T009 [US3] Update responsive directory controls for the third filter in `src/pages/MediaPages.css`

## Phase 6: Polish & Validation

- [x] T010 Validate controlled engine fallback, bounded alternate recovery, rapid retuning, filter behavior, and responsive overflow using `specs/009-iptv-playback-recovery/quickstart.md`
- [x] T011 Run ESLint and the production build from `package.json`
- [x] T012 Record delivered evidence and mark feature status in `specs/009-iptv-playback-recovery/spec.md`, `specs/009-iptv-playback-recovery/checklists/requirements.md`, and `specs/009-iptv-playback-recovery/tasks.md`

## Dependencies & Execution Order

- T001 → T002 → T003–T004 → T005–T007 → T008–T009 → T010–T012.
- Player lifecycle reporting is required before the IPTV page can advance source attempts.
- Availability filtering is independent from playback recovery after the catalog loads.

## Parallel Opportunities

- After T002, source grouping in `src/services/iptv.ts` can be reviewed independently from player engine work.
- Static checks and Spec Kit placeholder validation can run concurrently after UI browser validation.

## Implementation Strategy

1. Complete the reusable player fallback first.
2. Build the bounded per-channel tune session around its lifecycle callback.
3. Improve default catalog candidates without hiding the full directory.
4. Validate failure, success, cancellation, and responsive states before closing the spec.
