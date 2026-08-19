# Tasks: Equidia Live Destination

**Input**: Design documents from `/specs/008-equidia-live-destination/`

**Prerequisites**: `plan.md`, `spec.md`, `research.md`, `data-model.md`, `contracts/ui-contract.md`, `quickstart.md`

**Organization**: Tasks are grouped by user story so the direct destination, signal context, and recovery behavior remain independently verifiable.

## Phase 1: Setup (Shared Infrastructure)

**Purpose**: Confirm the owning feature and existing shared surfaces before implementation.

- [x] T001 Confirm `specs/008-equidia-live-destination/` is active in `.specify/feature.json` and the existing route/player interfaces match `specs/008-equidia-live-destination/plan.md`

---

## Phase 2: Foundational (Blocking Prerequisites)

**Purpose**: Provide one typed source of truth for Equidia playback and current manifest metadata.

- [x] T002 Create the canonical source, typed manifest model, deterministic parser, and abortable loader in `src/services/equidia.ts`

**Checkpoint**: The page can consume playback identity and metadata without coupling their lifecycles.

---

## Phase 3: User Story 1 - Open Equidia directly (Priority: P1) 🎯 MVP

**Goal**: Reach a dedicated route from desktop/mobile navigation and initialize the shared player automatically.

**Independent Test**: Select Equidia in both navigation modes and verify `/#/equidia` opens with the shared player assigned to the Equidia master.

- [x] T003 [US1] Register the Equidia route and navigation metadata in `src/config/routes.ts`
- [x] T004 [US1] Create the dedicated route composition, metadata lifecycle, and automatic shared-player source in `src/pages/Equidia.tsx`

**Checkpoint**: Equidia is a stable first-class destination with working active navigation and automatic source assignment.

---

## Phase 4: User Story 2 - Understand the live signal (Priority: P2)

**Goal**: Present the current adaptive ladder, French audio, and source provenance as a distinctive channel desk.

**Independent Test**: Load the supplied manifest and verify all five current tiers, French audio, refresh provenance, and non-interactive rendition semantics.

- [x] T005 [US2] Render semantic channel identity, current signal metrics, rendition ladder, and provenance states in `src/pages/Equidia.tsx`
- [x] T006 [US2] Implement the oxblood race-control visual system and responsive signal-board layout in `src/pages/Equidia.css`

**Checkpoint**: Current stream metadata is understandable without looking like a generic card grid.

---

## Phase 5: User Story 3 - Recover from an unavailable feed (Priority: P3)

**Goal**: Preserve a stable, honest, useful page when metadata or nested media playback fails.

**Independent Test**: Block the manifest or allow the reported Equidia source to fail and verify independent metadata failure, stable player error, and original-source actions.

- [x] T007 [US3] Add independent metadata failure copy, source-boundary guidance, and safe external-source actions in `src/pages/Equidia.tsx` and `src/pages/Equidia.css`

**Checkpoint**: Source failure never breaks navigation, hides the page, or claims a prohibited bypass.

---

## Phase 6: Polish & Cross-Cutting Concerns

**Purpose**: Validate requirements across browser sizes and record delivered evidence.

- [x] T008 Validate desktop/mobile navigation, metadata, player failure recovery, keyboard focus, and horizontal overflow using `specs/008-equidia-live-destination/quickstart.md`
- [x] T009 Run ESLint and the production build defined in `package.json`
- [x] T010 Record verification evidence and delivered status in `specs/008-equidia-live-destination/spec.md`, `specs/008-equidia-live-destination/checklists/requirements.md`, and `specs/008-equidia-live-destination/tasks.md`

---

## Dependencies & Execution Order

- **Setup** → **Foundational** → **US1** → **US2** → **US3** → **Polish**.
- T002 blocks the page's typed metadata lifecycle.
- T003 blocks route-level browser validation; T004 depends on T002 and T003.
- T005 depends on T002/T004; T006 depends on the page class structure produced by T005.
- T007 depends on the page and visual structure from T004–T006.
- T008–T010 run after all desired user stories are integrated.

## Parallel Opportunities

- After T004 establishes the page contract, service parser checks and visual refinement can be reviewed independently because they live in separate files.
- Static lint/build verification and Spec Kit placeholder checks can run together after implementation.

## Implementation Strategy

1. Deliver the direct Equidia route and automatic player source first.
2. Layer in current manifest interpretation without delaying playback.
3. Add the distinctive responsive presentation and explicit failure boundary.
4. Validate the whole journey at mobile and desktop widths, then mark every task complete.

---

## Phase 7: Referrer-Sensitive Playback Follow-up

**Purpose**: Let the existing client play the current Equidia CDN without a relay by omitting the source-rejected ambient referrer through a browser-standard, source-scoped request policy.

**Independent Test**: From localhost, open Equidia and verify the current nested Hexaglobe requests omit `Referer`, return successfully, and bring the shared player to Ready or Playing while ordinary sources retain default behavior.

- [x] T011 Confirm the current CDN's referrer-dependent response and document the safe request-policy decision in `specs/008-equidia-live-destination/research.md`
- [x] T012 [US3] Add an optional, restricted media referrer policy to `src/lib/media.ts`
- [x] T013 [US3] Apply source-scoped fetch-loader request setup and compatible HLS path selection in `src/components/player/StreamPlayer.tsx`
- [x] T014 [US3] Declare Equidia's no-referrer policy in `src/services/equidia.ts`
- [x] T015 Validate live Equidia playback, request headers, unaffected ordinary-source behavior, and desktop/mobile overflow using `specs/008-equidia-live-destination/quickstart.md`
- [x] T016 Run ESLint and the production build defined in `package.json`
- [x] T017 Record follow-up evidence and delivered status in `specs/008-equidia-live-destination/spec.md`, `specs/008-equidia-live-destination/checklists/requirements.md`, and `specs/008-equidia-live-destination/tasks.md`
