# Tasks: HORSEE Racecard and Council Archive

**Input**: Design documents from `/specs/010-horsee-racecard-archive/`

**Prerequisites**: `spec.md`, `plan.md`, `research.md`, `data-model.md`, `contracts/smspariaz-racecard-mcp.md`, `contracts/council-archive-api.md`, `quickstart.md`

**Backfill status**: This ledger reconstructs a replayable, dependency-ordered implementation sequence for code delivered and verified on 2026-08-21. Spec Kit requires generated tasks to remain in unchecked executable format; completion evidence is recorded in `spec.md` and `quickstart.md`.

**Organization**: Tasks are grouped by independently testable user story. Automated tests are included because the feature specification explicitly requires isolated racecard, archive, and regression coverage.

## Phase 1: Setup

**Purpose**: Add the one required parser dependency and confirm the existing MCP, storage, functions, and Equidia extension points.

- [ ] T001 Add the `pdf-parse` runtime dependency and lockfile resolution in `package.json` and `package-lock.json`
- [ ] T002 Confirm the existing architecture and record the in-place extension structure in `specs/010-horsee-racecard-archive/plan.md`

---

## Phase 2: Foundational - Shared Date and Store Contracts

**Purpose**: Establish the Mauritius date authority and archive query interface used by all user stories.

**CRITICAL**: User-story work begins after the shared date and store contracts are available.

- [ ] T003 Implement Mauritius date and timestamp formatting in `server/mauritius-time.ts` (FR-004, FR-012, FR-016, FR-017)
- [ ] T004 [P] Implement valid day/month parsing, Council day filtering, newest-first sorting, and month count aggregation in `server/council-history.ts` (FR-012, FR-013, FR-016, FR-017)
- [ ] T005 Extend `CouncilResultStore` with date and month query contracts in `server/council-store.ts` (FR-018, FR-019)

**Checkpoint**: Backend code can use one Mauritius date definition and one storage abstraction.

---

## Phase 3: User Story 1 - Retrieve the Official Daily Racecard (Priority: P1) - MVP

**Goal**: Return the complete current official SMSPariaz programme through a deterministic read-only HORSEE tool.

**Independent Test**: Stub a multi-page current programme containing several meetings and French races, then verify complete chronological output; stub a stale first response and verify one cache-busted retry or a structured stale failure.

### Tests for User Story 1

- [ ] T006 [P] [US1] Add current-day, multi-page, multi-meeting, French-retention, ordering, stale-retry, timezone, and malformed-document tests in `server/smspariaz-racecard.test.ts` (FR-002, FR-003, FR-004, FR-005, FR-006, FR-007, FR-008, FR-009, FR-010, FR-025; SC-001, SC-002, SC-003, SC-007)

### Implementation for User Story 1

- [ ] T007 [US1] Implement strict race, meeting, success, failure, and response schemas in `server/smspariaz-racecard.ts` (FR-006 through FR-009)
- [ ] T008 [US1] Implement direct no-store PDF retrieval, redirect/content/size checks, Mauritius-date validation, and one cache-busted retry in `server/smspariaz-racecard.ts` (FR-002, FR-003, FR-004, FR-005; SC-002)
- [ ] T009 [US1] Implement complete text extraction, stable race pairing, country retention, optional enrichment, completeness failure, chronological ordering, and safe discovery logs in `server/smspariaz-racecard.ts` (FR-006, FR-007, FR-008, FR-009, FR-010)
- [ ] T010 [US1] Register `get_smspariaz_daily_racecard` with strict empty input, structured output, read-only annotations, and discovery-only instructions in `server/horsee-mcp.ts` (FR-001, FR-010, FR-011)
- [ ] T011 [US1] Verify racecard discovery and read-only security metadata in `server/horsee-mcp-discovery.test.ts` (FR-001, FR-011; SC-003, SC-006)

**Checkpoint**: User Story 1 independently supplies authoritative current programme discovery and clean typed failures.

---

## Phase 4: User Story 2 - Review All Analyses from Today (Priority: P1)

**Goal**: Show every analysis from the current Mauritius day newest first, with compact and complete expandable views.

**Independent Test**: Seed several current-day analyses, including repeated race IDs, and verify the Today API and Equidia view return every result newest first and expose all saved details.

### Tests for User Story 2

- [ ] T012 [P] [US2] Add Mauritius-midnight, same-day multiplicity, newest-first, and empty-day tests in `server/council-history.test.ts` (FR-012, FR-013, FR-025; SC-004, SC-007)

### Implementation for User Story 2

- [ ] T013 [US2] Write new Council history events under Mauritius date prefixes and implement newest-first date reads for Netlify and local stores in `server/council-store.ts` (FR-012, FR-013, FR-019, FR-020)
- [ ] T014 [P] [US2] Add the no-store GET Today handler in `netlify/functions/council-today.ts` (FR-012, FR-018, FR-022)
- [ ] T015 [US2] Add typed response validation and abortable Today loading in `src/services/council.ts` (FR-012, FR-022)
- [ ] T016 [US2] Implement Today's compact, expandable, empty, loading, failure, and retry states in `src/components/council/CouncilArchive.tsx` (FR-014, FR-015, FR-022, FR-023)
- [ ] T017 [US2] Compose Today's Council beneath the existing Equidia latest/live experience in `src/pages/Equidia.tsx` (FR-012, FR-021, FR-022)
- [ ] T018 [US2] Style Today cards and expanded rankings for narrow and wide layouts in `src/pages/Equidia.css` (FR-024; SC-008)

**Checkpoint**: User Story 2 independently makes the whole current Mauritius day visible without changing save behavior.

---

## Phase 5: User Story 4 - Preserve Existing HORSEE Consumers (Priority: P1)

**Goal**: Keep write authorization, saves, latest lookup, legacy history, and intentional re-analysis behavior compatible.

**Independent Test**: Run the existing Auth0/write-boundary and tool discovery tests, save repeated analyses, and retrieve both dated and legacy records through unchanged result shapes.

### Tests for User Story 4

- [ ] T019 [P] [US4] Add dated-key format and existing namespace/save/latest compatibility assertions in `server/council-store.test.ts` (FR-019 through FR-021; SC-006)
- [ ] T020 [P] [US4] Preserve OAuth challenge, scope, actor identity, and no-unauthenticated-mutation tests in `server/horsee-mcp-authorization.test.ts` (FR-011, FR-021; SC-006)
- [ ] T021 [P] [US4] Verify OAuth-disabled and OAuth-enabled tool discovery sets include the additive read-only racecard tool in `server/horsee-mcp-discovery.test.ts` (FR-011, FR-021; SC-006)

### Implementation for User Story 4

- [ ] T022 [US4] Merge dated and legacy blob records in date/month reads without overwriting repeated race analyses in `server/council-store.ts` (FR-017, FR-019, FR-020)
- [ ] T023 [US4] Retain the `get_council_history` result shape while adding an optional Mauritius date filter in `server/horsee-mcp.ts` (FR-017, FR-021)
- [ ] T024 [US4] Preserve authenticated `save_council_result` publication to latest and immutable history in `server/horsee-mcp.ts` and `server/council-store.ts` (FR-011, FR-020, FR-021)

**Checkpoint**: Existing HORSEE clients and stored records remain compatible, and repeated analyses remain visible.

---

## Phase 6: User Story 3 - Browse Historical Analyses by Date (Priority: P2)

**Goal**: Show a responsive calendar of populated Mauritius dates and all analyses for a selected day.

**Independent Test**: Seed several days across months, navigate the calendar, compare date badges to day detail counts, and confirm empty-day behavior.

### Tests for User Story 3

- [ ] T025 [P] [US3] Add valid month/date, multiple-analysis count, legacy-count, and empty-month/day coverage in `server/council-history.test.ts` and `server/council-store.test.ts` (FR-016 through FR-020, FR-025; SC-004, SC-005, SC-007)

### Implementation for User Story 3

- [ ] T026 [US3] Implement month-prefixed count aggregation for dated keys plus legacy results in `server/council-store.ts` (FR-016, FR-018, FR-019)
- [ ] T027 [P] [US3] Add strict no-store date-detail GET handling in `netlify/functions/council-history.ts` (FR-017, FR-018, FR-022)
- [ ] T028 [P] [US3] Add strict no-store month-count GET handling in `netlify/functions/council-history-dates.ts` (FR-016, FR-018, FR-022)
- [ ] T029 [US3] Add abortable date-detail and month-count client loaders with runtime response validation in `src/services/council.ts` (FR-016 through FR-018, FR-022)
- [ ] T030 [US3] Implement month navigation, calendar grid, visible date counts, selected-day detail, and one-action return to Today in `src/components/council/CouncilArchive.tsx` (FR-016, FR-017, FR-022, FR-023)
- [ ] T031 [US3] Integrate archive navigation and cancellation-safe state into `src/pages/Equidia.tsx` (FR-022, FR-023)
- [ ] T032 [US3] Add responsive calendar, count badge, focus, selection, and daily-detail styles in `src/pages/Equidia.css` (FR-023, FR-024; SC-008)

**Checkpoint**: User Story 3 independently supports month discovery and complete historical day review.

---

## Phase 7: Routing, Documentation, and Cross-Cutting Verification

**Purpose**: Wire public routes, document the additive release, and run every acceptance gate.

- [ ] T033 Add Today, date-detail, and month-count redirects without changing existing routes in `netlify.toml` (FR-012, FR-016 through FR-018, FR-021)
- [ ] T034 [P] Document the racecard tool, archive routes, local verification, dependency, and migration-free deployment in `README.md` and `specs/010-horsee-racecard-archive/quickstart.md`
- [ ] T035 Run the complete isolated backend regression suite from the `test:mcp` script in `package.json` (FR-025; SC-001 through SC-007)
- [ ] T036 Run ESLint and the production build using `package.json` and resolve all introduced errors (SC-006, SC-009)
- [ ] T037 Validate Today, calendar month navigation, populated/empty date details, expansion, keyboard operation, and zero horizontal overflow at 375, 768, and 1280 pixels using `specs/010-horsee-racecard-archive/quickstart.md` (FR-022 through FR-024; SC-008, SC-009)
- [ ] T038 Perform one non-automated live official-source smoke call and record programme date, meeting count, race count, and French-race count in `specs/010-horsee-racecard-archive/spec.md` (SC-001 through SC-003)

---

## Dependencies and Execution Order

### Phase Dependencies

- **Phase 1** starts immediately.
- **Phase 2** depends on Phase 1 and blocks every story.
- **User Story 1 (Phase 3)** depends on the shared Mauritius date helper only and is the discovery MVP.
- **User Story 2 (Phase 4)** depends on the shared date/store contracts.
- **User Story 4 (Phase 5)** validates and completes compatibility around the storage and MCP changes from Stories 1 and 2.
- **User Story 3 (Phase 6)** depends on the date-aware store from Story 2 and legacy compatibility from Story 4.
- **Phase 7** depends on all selected stories.

### Task Order Within Stories

- Tests precede the implementation they specify.
- Racecard schemas precede fetch/parser code, which precedes MCP registration.
- Date-partitioned storage precedes Today/date/month handlers.
- Backend contracts precede browser service loaders, which precede UI integration and styling.
- Compatibility tests run before final regression and release verification.

## Parallel Opportunities

- T003 and T004 can proceed in parallel before T005 finalizes the store contract.
- T006 can be written while T007 defines the racecard schemas.
- T014 can proceed alongside the first Today UI component structure once the CouncilDay contract is fixed.
- T019, T020, and T021 cover different regression boundaries and can run in parallel.
- T027 and T028 are independent thin handlers.
- T034 can proceed alongside static and browser verification.

## Parallel Example: User Story 3

```text
Task T027: Add the date-detail handler in netlify/functions/council-history.ts
Task T028: Add the month-count handler in netlify/functions/council-history-dates.ts
```

## Implementation Strategy

### MVP First

1. Complete Setup and Foundational phases.
2. Deliver User Story 1 and validate current, stale, malformed, multi-page, French, and ordering behavior.
3. Stop with a usable authoritative racecard tool even before the viewer archive is enabled.

### Incremental Delivery

1. Add Today using the existing saved Council results.
2. Lock backward compatibility and legacy reads.
3. Add month/date history discovery and responsive daily detail.
4. Wire routes, document deployment, and run regression/build/browser/live-source gates.

## Notes

- `[P]` means different files or isolated verification boundaries with no dependency on another incomplete task.
- Story labels map directly to `spec.md`; requirement and success-criterion IDs provide cross-artifact traceability.
- Optional historical filters remain out of scope for the core implementation.
- No database migration, secret change, or parallel application is required.
