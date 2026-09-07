# Tasks: Authenticated SMSPariaz App Bets

**Input**: Design documents from `specs/016-smspariaz-app-bet/`

**Prerequisites**: `plan.md`, `spec.md`, `research.md`, `data-model.md`, `contracts/mcp-tools.md`

**Tests**: Tests are mandatory because FR-021 and SC-002 through SC-008 require safety, compatibility, and no-production-submission evidence.

**Organization**: Tasks are grouped by user story. Test tasks precede their implementations and use injected transports plus fixtures; automated tests never send a production submission.

## Phase 1: Setup (Shared Infrastructure)

**Purpose**: Establish strict configuration, test seams, and flow evidence shared by the feature.

- [X] T001 Create strict SMSPariaz environment parsing and disabled-by-default app-bet configuration in `server/smspariaz-config.ts`
- [X] T002 [P] Add configuration validation and safe-disabled deployment tests in `server/smspariaz-config.test.ts`
- [X] T003 [P] Add sanitized production-flow fixtures and fingerprint constants for the audited scripts and requests in `server/test-fixtures/smspariaz/flow-fixtures.ts`

---

## Phase 2: Foundational (Blocking Prerequisites)

**Purpose**: Build security boundaries, encrypted persistence primitives, per-tool authorization, and safe telemetry required by every story.

**CRITICAL**: No user-story implementation begins until this phase passes its focused tests.

- [X] T004 Write AES-256-GCM round-trip, tamper, wrong-key, and previous-key rotation tests in `server/smspariaz-crypto.test.ts`
- [X] T005 Implement versioned AES-256-GCM encrypted envelopes with key identifiers in `server/smspariaz-crypto.ts`
- [X] T006 [P] Write structured logging allowlist and sentinel-secret redaction tests in `server/smspariaz-observability.test.ts`
- [X] T007 [P] Implement bounded structured SMSPariaz events, safe error classification, and in-memory diagnostic status in `server/smspariaz-observability.ts`
- [X] T008 Write per-tool OAuth scope and closed-world unknown-tool rejection tests in `server/horsee-tool-security.test.ts` and `server/council-auth.test.ts`
- [X] T009 Refactor resource authentication for independent Council, SMSPariaz session, and SMSPariaz app-bet scopes in `server/council-auth.ts` and `netlify/functions/oauth-protected-resource.ts`
- [X] T010 Replace default-public tool decoration with an explicit closed-world security registry while preserving existing HORSEE policies in `server/horsee-mcp.ts` and `server/horsee-tool-security.ts`

**Checkpoint**: Encryption, redaction, configuration, and authorization boundaries are independently tested and fail closed.

---

## Phase 3: User Story 1 - Establish and Restore a Legitimate Session (Priority: P1) MVP

**Goal**: Complete the legitimate OTP flow, persist cookies and token state encrypted on hosted storage, restore and validate it, and explicitly destroy it.

**Independent Test**: Use an injected provider transport to start and confirm OTP, restart the service around the same encrypted store, restore a valid session, classify an expired session, and log out without exposing the OTP or secrets.

### Tests for User Story 1

- [X] T011 [P] [US1] Write encrypted session-store tests for restore, expiry, corrupt ciphertext, key rotation, atomic mutation, and logout in `server/smspariaz-session-store.test.ts`
- [X] T012 [P] [US1] Write provider authentication tests for exact OTP/checklogin form requests, cookie retention, missing OTP, rejected OTP, expiry, no redirects, and bounded responses in `server/smspariaz-provider.test.ts`
- [X] T013 [P] [US1] Write MCP contract tests for session status, start login, confirm OTP, logout, masking, and actionable errors in `server/smspariaz-mcp-session.test.ts`

### Implementation for User Story 1

- [X] T014 [US1] Implement deployment-isolated Netlify Blob and atomic local encrypted session persistence in `server/smspariaz-session-store.ts`
- [X] T015 [US1] Implement the exact SMSPariaz `/otp/`, `/confirm/`, and `/checklogin/` transport with a cookie jar, app user agent, manual redirects, and injected fetch in `server/smspariaz-provider.ts`
- [X] T016 [US1] Implement session status, pending-login expiry, OTP confirmation, authenticated restore, and explicit logout orchestration in `server/smspariaz-mcp.ts`
- [X] T017 [US1] Register `smspariaz_session_status`, `smspariaz_start_login`, `smspariaz_confirm_otp`, and `smspariaz_logout` with strict schemas and session scope in `server/smspariaz-mcp.ts`

**Checkpoint**: A mocked legitimate OTP session survives a service reconstruction and expires or logs out safely.

---

## Phase 4: User Story 2 - Read the Programme and Prepare a Ticket (Priority: P1)

**Goal**: Return authoritative SMSFootball events and create a provider-validated, non-submitting prepared app ticket with a short-lived opaque identity.

**Independent Test**: Parse recorded metadata/cache/validation fixtures, resolve valid selections, flag odds changes and closed or malformed choices, and prove no `/placebet/` request occurs.

### Tests for User Story 2

- [X] T018 [P] [US2] Write programme parsing tests for events, markets, codes, odds, kickoff, malformed fragments, and open/closed status in `server/smspariaz-football.test.ts`
- [X] T019 [P] [US2] Write prepared-ticket persistence tests for TTL, principal/session binding, integrity, and atomic lifecycle transitions in `server/smspariaz-prepared-store.test.ts`
- [X] T020 [P] [US2] Write betslip tests for valid construction, provider booking-code parsing, changed odds, suspended events, malformed selections, totals, and zero submission calls in `server/smspariaz-app-bet.test.ts`
- [X] T021 [P] [US2] Write MCP contract tests for `smspariaz_get_smsfootball` and `smspariaz_prepare_app_bet` schemas and non-submitting behavior in `server/smspariaz-mcp-football.test.ts`

### Implementation for User Story 2

- [X] T022 [US2] Implement authoritative `odds_json.php`, `odds_<n>`, and coming-next retrieval plus structured parsing in `server/smspariaz-football.ts`
- [X] T023 [US2] Implement encrypted prepared-ticket storage and the PREPARED/SUBMITTING/terminal state machine in `server/smspariaz-prepared-store.ts`
- [X] T024 [US2] Implement event resolution, odds comparison, SMSPariaz stake math, `validatebet.php` booking, and strict `#bookcode` parsing without submission in `server/smspariaz-app-bet.ts`
- [X] T025 [US2] Register the public `smspariaz_get_smsfootball` and session-scoped `smspariaz_prepare_app_bet` tools in `server/smspariaz-mcp.ts`

**Checkpoint**: Current programme data and prepared tickets are independently usable, and preparation cannot reach the app submission endpoint.

---

## Phase 5: User Story 3 - Explicitly Submit Only the App/Leaderboard Ticket (Priority: P1)

**Goal**: Revalidate and submit one prepared ticket exactly once through the positively allowlisted app/leaderboard transaction, with no wallet, paid-SMS, payment, or fallback path.

**Independent Test**: Mock the audited request and prove success parsing while every changed endpoint, field, script fingerprint, redirect, payment term, replay, concurrency race, session failure, or provider ambiguity fails before unsafe or duplicate egress.

### Tests for User Story 3

- [X] T026 [P] [US3] Write guard tests for exact origin/path/method/headers/fields, forbidden wallet/payment/SMS routes, redirects, script-fingerprint drift, and zero egress on rejection in `server/smspariaz-app-bet-guard.test.ts`
- [X] T027 [P] [US3] Write submission tests for explicit approval, stale odds, closed event, expired handle, principal/session mismatch, replay, concurrent claim, mocked success/failure, and ambiguous no-retry outcomes in `server/smspariaz-app-bet-submit.test.ts`
- [X] T028 [P] [US3] Write MCP contract and scope tests for `smspariaz_place_app_bet`, including disabled-by-default behavior and app-bet scope isolation, in `server/smspariaz-mcp-submit.test.ts`

### Implementation for User Story 3

- [X] T029 [US3] Implement immutable app-flow manifest verification against current `site.js` and `mobile.js` fingerprints in `server/smspariaz-provider.ts`
- [X] T030 [US3] Implement the exact allowlisted `/placebet/` request builder for only `loginid`, `phone`, `token`, and `message=n<bookcode>`, including forbidden-term checks and manual redirects, in `server/smspariaz-app-bet.ts`
- [X] T031 [US3] Implement pre-submit session/programme/odds revalidation, atomic ticket claim, single-attempt submission, response classification, and ambiguous terminal handling in `server/smspariaz-app-bet.ts`
- [X] T032 [US3] Register app-bet-scoped `smspariaz_place_app_bet` with required `approved: true` and prepared handle in `server/smspariaz-mcp.ts`

**Checkpoint**: Only the exact mocked app request can leave the submission boundary, once, after explicit tool invocation; live submission remains disabled without configuration.

---

## Phase 6: User Story 4 - Diagnose Without Revealing Secrets (Priority: P2)

**Goal**: Provide useful redacted operational events and diagnostics for session, app mode, source versions, flow identity, and last classified error.

**Independent Test**: Exercise lifecycle failures using sentinel OTP/token/cookie/key values and verify no sentinel appears in logs, diagnostics, tool output, or thrown errors.

### Tests for User Story 4

- [X] T033 [P] [US4] Write lifecycle telemetry and `smspariaz_debug_status` contract tests with sentinel secrets and bounded diagnostics in `server/smspariaz-debug.test.ts`

### Implementation for User Story 4

- [X] T034 [US4] Emit allowlisted events for login, restore, expiry, programme, validation, submission, response classification, drift, and guard rejection in `server/smspariaz-provider.ts`, `server/smspariaz-football.ts`, and `server/smspariaz-app-bet.ts`
- [X] T035 [US4] Register session-scoped `smspariaz_debug_status` with only safe state, hashes, versions, and last error in `server/smspariaz-mcp.ts`

**Checkpoint**: Operators can distinguish authentication and flow-drift failures without accessing secret material.

---

## Phase 7: User Story 5 - Preserve Existing HORSEE Service (Priority: P2)

**Goal**: Wire the subsystem into the existing hosted function without changing legacy racecard or Council discovery, scopes, storage, or response behavior.

**Independent Test**: Run existing suites with SMSPariaz disabled and enabled; disabled discovery stays byte-for-byte compatible and enabled discovery adds only the specified tools and scopes.

### Tests for User Story 5

- [X] T036 [P] [US5] Extend MCP discovery tests for disabled compatibility, enabled tool catalog, and separate security schemes in `server/horsee-mcp-discovery.test.ts` and `server/smspariaz-mcp-football.test.ts`
- [X] T037 [P] [US5] Extend OAuth metadata and authorization tests for all legacy and SMSPariaz scopes in `server/council-auth.test.ts`

### Implementation for User Story 5

- [X] T038 [US5] Construct and inject SMSPariaz configuration, encrypted stores, provider, orchestration, and tool registration in `netlify/functions/mcp.ts` and `server/horsee-mcp.ts`
- [X] T039 [US5] Preserve scheduler, archive, Council, racecard, UI resource, and legacy tool behavior while conditionally exposing the SMS subsystem in `server/horsee-mcp.ts`

**Checkpoint**: Existing HORSEE suites pass unchanged in safe-disabled mode and new tools appear only under complete configuration.

---

## Phase 8: Polish, Documentation, and Verification

**Purpose**: Complete operator guidance, security review, full verification, and Spec Kit handoff.

- [X] T040 [P] Document architecture, exact audited production flow, OTP setup, persistence, tools, errors, deployment, guard, re-audit procedure, and manual verification limits in `docs/smspariaz-app-bet.md`
- [X] T041 [P] Document environment variables and SMSPariaz tool summary in `README.md` and `specs/016-smspariaz-app-bet/quickstart.md`
- [X] T042 Run all focused and legacy tests through `npm run test:mcp` and confirm automated tests made no production submission
- [X] T043 Run `npm run build` and `git diff --check` from the repository root
- [X] T044 Perform a security diff review of `server/` and `netlify/functions/` covering secret handling, SSRF/redirects, authorization, replay/concurrency, fail-closed flow drift, and real-money egress
- [X] T045 Update delivery status and verification evidence in `specs/016-smspariaz-app-bet/spec.md`
- [X] T046 Review and commit only feature-owned files on `codex/smspariaz-app-bet-mcp`, then push and open a pull request if repository credentials permit

---

## Dependencies & Execution Order

### Phase Dependencies

- **Setup (Phase 1)** has no dependency.
- **Foundation (Phase 2)** depends on configuration and fixtures from Phase 1 and blocks all user stories.
- **US1 (Phase 3)** depends on foundation and provides authenticated state for preparation/submission.
- **US2 (Phase 4)** depends on foundation; provider validation uses US1 when invoked through MCP.
- **US3 (Phase 5)** depends on US1 session state and US2 prepared tickets.
- **US4 (Phase 6)** depends on the lifecycle operations it diagnoses.
- **US5 (Phase 7)** integrates the completed modules into the hosted runtime.
- **Polish (Phase 8)** depends on all selected stories.

### Within Each Story

- Write and run the story's tests before implementation; confirm the intended assertions fail.
- Implement storage/data boundaries before orchestration and MCP handlers.
- Treat the exact app-flow manifest, prepared-ticket atomic claim, and outbound guard as inseparable prerequisites for submission.
- Never enable or exercise a live production submission during automated verification.

### Parallel Opportunities

- T002 and T003 can run after T001's schema is agreed.
- T004/T005, T006/T007, and T008–T010 operate in separate foundation areas.
- Test files within US1, US2, US3, and US5 are independent and marked `[P]`.
- T040 and T041 can run alongside final non-mutating verification.

## Implementation Strategy

1. Complete Setup and Foundation, then validate the closed-world security model.
2. Deliver US1 session lifecycle as the first independently testable increment.
3. Deliver US2 read/prepare with a hard proof that it cannot submit.
4. Add US3 only after its negative guard suite passes; keep production submission disabled by default.
5. Add diagnostics and runtime integration, then run every legacy and new check.
6. Treat a real authenticated app-flow submission as a separately approved manual operation after deployment; do not claim end-to-end success before that evidence exists.
