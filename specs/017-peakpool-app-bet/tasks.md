# Tasks: Peakpool Virtual-Balance App Bets

**Input**: Design documents from `specs/017-peakpool-app-bet/`

**Prerequisites**: `plan.md`, `spec.md`, `research.md`, `data-model.md`, `contracts/mcp-tools.md`, `quickstart.md`

**Tests**: Tests are mandatory under FR-002 through FR-016 and SC-001 through SC-005. Every provider transport is injected or mocked; no automated test sends a production placement request.

**Organization**: Tasks are grouped by user story. Product-profile tasks are deliberately separate from the existing SMSFootball flow so a shared `/placebet/` endpoint cannot weaken either product's guard.

## Phase 1: Setup (Shared Infrastructure)

**Purpose**: Bring the approved encrypted session dependency into the branch and establish Peakpool-specific evidence/configuration.

- [X] T001 Rebase this branch onto the reviewed encrypted SMSPariaz session foundation from `codex/smspariaz-app-bet-mcp`
- [X] T002 Add separate Peakpool feature configuration and default-disabled flags in `server/peakpool-config.ts`
- [X] T003 [P] Add current sanitized Peakpool fixture, source hashes, and product-flow evidence in `server/test-fixtures/peakpool/flow-fixtures.ts`
- [X] T004 [P] Add configuration and current source-evidence tests in `server/peakpool-config.test.ts`

---

## Phase 2: Foundational (Blocking Prerequisites)

**Purpose**: Establish a typed product discriminator, closed-world egress profile, safe telemetry, and scope registration before any Peakpool user story.

**CRITICAL**: No Peakpool programme, preparation, or placement tool may be registered until this phase passes.

- [X] T005 Write cross-product prepared-ticket, raw-message, route, redirect, and generic-message rejection tests in `server/peakpool-flow-profile.test.ts`
- [X] T006 Implement the immutable Peakpool app-flow profile and server-only message construction in `server/peakpool-flow-profile.ts`
- [X] T007 Extend the shared provider boundary with product-specific closed-world form profiles without widening the SMSFootball profile in `server/smspariaz-provider.ts`
- [X] T008 Extend provider boundary regression tests for both product profiles in `server/smspariaz-provider.test.ts`
- [X] T009 Extend encrypted prepared-ticket records with an immutable product discriminator and cross-product claim rejection in `server/smspariaz-prepared-store.ts`
- [X] T010 Extend prepared-ticket persistence tests for product isolation in `server/smspariaz-prepared-store.test.ts`
- [X] T011 Add separate Peakpool prepare/place OAuth scopes and closed-world tool security registry coverage in `server/council-auth.ts`, `server/horsee-mcp.ts`, and their tests
- [X] T012 Add bounded redacted Peakpool telemetry events and diagnostics state in `server/smspariaz-observability.ts` and `server/smspariaz-observability.test.ts`

**Checkpoint**: Peakpool has an isolated, disabled-by-default profile; neither product can submit the other's ticket or a raw provider message.

---

## Phase 3: User Story 1 - Inspect the Current Peakpool Programme (Priority: P1) 🎯 MVP

**Goal**: Return current Peakpool races/runners and provider selection codes without authenticating or submitting.

**Independent Test**: Parse the sanitized fixture, expose the expected structured programme, and prove no placement-capable request occurs.

### Tests for User Story 1

- [X] T013 [P] [US1] Write programme parsing, malformed fixture, duplicate-code, and bounded-fetch tests in `server/peakpool-programme.test.ts`
- [X] T014 [P] [US1] Write MCP discovery/contract tests for the public programme tool in `server/peakpool-mcp-programme.test.ts` *(covered by the combined `server/peakpool-mcp.test.ts` contract suite)*

### Implementation for User Story 1

- [X] T015 [US1] Implement authoritative `peakpool_json.php` retrieval and typed parsing in `server/peakpool-programme.ts`
- [X] T016 [US1] Register public `smspariaz_get_peakpool` conditionally in `server/smspariaz-mcp.ts` and `server/horsee-mcp.ts`

**Checkpoint**: The live read-only programme can be returned independently with no possible placement egress.

---

## Phase 4: User Story 2 - Prepare a Virtual-Unit Peakpool Ticket (Priority: P1)

**Goal**: Resolve exactly one current runner and virtual-unit Win/Place selection into an encrypted, short-lived, non-submitting prepared handle.

**Independent Test**: Prepare valid and invalid selections from a fixture, verify all result fields, and prove no `/placebet/` call occurs.

### Tests for User Story 2

- [X] T017 [P] [US2] Write ticket preparation tests for valid Win/Place, malformed/unknown runner, stale fixture, invalid unit stake, and zero submissions in `server/peakpool-app-bet.test.ts`
- [X] T018 [P] [US2] Write MCP contract/scope tests for `smspariaz_prepare_peakpool_app_bet` in `server/peakpool-mcp-prepare.test.ts` *(covered by the combined `server/peakpool-mcp.test.ts` contract suite)*

### Implementation for User Story 2

- [X] T019 [US2] Implement Peakpool selection resolution, virtual-unit validation, and encrypted prepared-ticket creation in `server/peakpool-app-bet.ts`
- [X] T020 [US2] Register `smspariaz_prepare_peakpool_app_bet` with its independent prepare scope in `server/smspariaz-mcp.ts`

**Checkpoint**: A caller can inspect an exact ticket preview but cannot construct or submit a raw provider request.

---

## Phase 5: User Story 3 - Explicitly Place a Peakpool Virtual-Balance App Bet (Priority: P1)

**Goal**: Revalidate and send exactly one approved prepared Peakpool ticket through the app profile, while placement remains disabled by default.

**Independent Test**: Use mocked provider responses to prove exact one-attempt success/rejection/ambiguity behavior and no egress on guard failure.

### Tests for User Story 3

- [X] T021 [P] [US3] Write placement tests for approval, session expiry, app registration, fixture drift, source drift, replay, concurrent claim, mocked success/rejection, and ambiguity in `server/peakpool-app-bet-submit.test.ts`
- [X] T022 [P] [US3] Write MCP placement contract, flag, and isolated app-bet scope tests in `server/peakpool-mcp-submit.test.ts` *(covered by `server/peakpool-mcp.test.ts` plus the submission suite)*

### Implementation for User Story 3

- [X] T023 [US3] Implement pre-submit revalidation, atomic claim, one-attempt profile submission, and response classification in `server/peakpool-app-bet.ts`
- [X] T024 [US3] Register `smspariaz_place_peakpool_app_bet` requiring a prepared handle and `approved: true` in `server/smspariaz-mcp.ts`
- [X] T025 [US3] Wire Peakpool configuration, programme client, app service, and tool registration into `netlify/functions/mcp.ts`

**Checkpoint**: Only the exact mocked Peakpool request can leave the provider boundary after explicit approval; live placement stays disabled without configuration.

---

## Phase 6: User Story 4 - Preserve Existing Product Boundaries (Priority: P2)

**Goal**: Keep SMSFootball, Council, racecard, scheduler, archive, and existing HORSEE discovery behavior intact while exposing Peakpool only under complete configuration.

**Independent Test**: Compare safe-disabled and enabled tool discovery; prove Peakpool handles cannot pass SMSFootball placement and vice versa.

### Tests for User Story 4

- [X] T026 [P] [US4] Extend HORSEE discovery/security regression coverage for disabled and enabled Peakpool tools in `server/horsee-mcp-discovery.test.ts` and `server/horsee-tool-security.test.ts`
- [X] T027 [P] [US4] Add cross-product prepared-handle and no-regression tests in `server/peakpool-product-isolation.test.ts` *(covered across the prepared-store, provider, flow-profile, MCP, and existing-product regression suites)*

### Implementation for User Story 4

- [X] T028 [US4] Condition Peakpool runtime construction and tool decoration on complete configuration in `netlify/functions/mcp.ts` and `server/horsee-mcp.ts`
- [X] T029 [US4] Ensure safe diagnostics expose Peakpool state without secrets in `server/smspariaz-mcp.ts` and `server/peakpool-debug.test.ts` *(covered by MCP and observability tests)*

**Checkpoint**: Existing tools retain their behavior, and cross-product actions fail before egress.

---

## Phase 7: Polish, Verification, and Handoff

**Purpose**: Document the deployed capability, validate all safety conditions, and leave the provider-approved no-cash verification as an explicit manual gate.

- [X] T030 [P] Document environment variables, tools, virtual-unit boundaries, error codes, and re-audit steps in `docs/peakpool-app-bet.md` and `README.md`
- [X] T031 [P] Update the exact owner-authorized no-cash verification procedure in `specs/017-peakpool-app-bet/quickstart.md`
- [X] T032 Run `npm run test:mcp` and confirm fake/injected transports made no production placement request *(231/231 passed; transports are injected/mocked)*
- [X] T033 Run `npm run build` and `git diff --check` *(passed; Vite chunk-size advisory and line-ending warnings only)*
- [X] T034 Perform a security diff review covering product isolation, encrypted secrets, authorization, redirect/SSRF prevention, raw-message rejection, replay, and logging redaction
- [X] T035 Update delivery evidence/status in `specs/017-peakpool-app-bet/spec.md` and mark completed tasks in this file
- [ ] T036 Commit only Peakpool-owned files, push the rebased branch, and update the dependent pull request base if repository credentials permit *(not safe while shared files contain overlapping feature-018 and pre-existing user changes; requires deliberate commit partitioning)*

## Dependencies & Execution Order

- Phase 1 must finish before Phase 2.
- Phase 2 blocks every user story.
- US1 provides the programme source used by US2 and US3.
- US2 provides the prepared-ticket handle used by US3.
- US4 validates cross-product behavior after US1–US3 integration.
- Phase 7 runs only after every selected user story passes its focused tests.

## Parallel Opportunities

- T003/T004 can proceed together after T002's configuration shape is known.
- T005/T006 and T009/T010 are separate isolation layers after the flow profile is designed.
- T013/T014, T017/T018, T021/T022, and T026/T027 work on different test files and are marked `[P]`.
- T030/T031 can proceed alongside final non-mutating verification.

## Implementation Strategy

1. Land the isolated product profile before any Peakpool client/tool code.
2. Deliver public programme reads first and validate them independently.
3. Add preparation next; prove it cannot submit.
4. Add placement only behind the default-disabled feature flag and its own scope.
5. Run complete mocked/legacy verification; reserve the real virtual-unit request for the product owner’s explicit authorization.
