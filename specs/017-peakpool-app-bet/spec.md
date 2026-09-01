# Feature Specification: Peakpool Virtual-Balance App Bets

**Feature Branch**: `codex/peakpool-app-bet-plan`

**Created**: 2026-09-01

**Status**: Planned — implementation gated on provider-flow verification

**Input**: User description: "Analyse horse racing Peakpool place bet by app and implementation plan." The product owner clarified that Peakpool uses a fixed, non-cash unit balance and leaderboard winnings; it is not a real-money wallet, deposit, withdrawal, or SMS-paid product.

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Inspect the current Peakpool programme (Priority: P1)

As a HORSEE operator, I want to view the current Peakpool horse-racing programme and its available selections so that I can propose a virtual-unit leaderboard ticket without sending any bet.

**Why this priority**: Reliable read-only programme data is required before any preparation or explicit approval can be considered.

**Independent Test**: Load a recorded Peakpool fixture and confirm that every returned race, runner, displayed pool value, and provider selection code is accurately represented with no submission attempt.

**Acceptance Scenarios**:

1. **Given** the current Peakpool fixture is available, **When** an operator requests it, **Then** HORSEE returns races, runners, displayed pool values, and stable provider selection codes in structured form.
2. **Given** the fixture is unavailable or malformed, **When** it is requested, **Then** HORSEE returns a clear read-only error and does not construct or send a bet request.

---

### User Story 2 - Prepare a virtual-unit Peakpool ticket (Priority: P1)

As a HORSEE operator, I want a separate preview of a Peakpool selection and unit stake so that I can review the exact virtual-balance action before approval.

**Why this priority**: Preparation makes analysis and submission distinct, preventing autonomous leaderboard activity.

**Independent Test**: Prepare valid, malformed, unavailable, and stale selections against a fixture snapshot and prove that no submission-capable call occurs.

**Acceptance Scenarios**:

1. **Given** an available runner and a valid unit stake, **When** an operator prepares a Peakpool ticket, **Then** HORSEE returns the resolved race, runner, bet type, unit stake, expiry, and any available provider balance/payout information without submitting it.
2. **Given** an invalid stake, missing runner, changed fixture, or unsupported bet type, **When** the ticket is prepared, **Then** HORSEE rejects it with a specific validation error and makes no submission attempt.

---

### User Story 3 - Explicitly place only a Peakpool virtual-balance app bet (Priority: P1)

As a Peakpool account holder, I want an approved prepared ticket submitted through the verified app flow so that virtual units are used only after my explicit decision and the resulting leaderboard confirmation is returned.

**Why this priority**: Peakpool placement is the requested business capability, but it must remain isolated from every other SMSPariaz product that shares infrastructure.

**Independent Test**: With a mocked provider transaction, submit a prepared Peakpool ticket once and prove that cross-product messages, payment-like input, changed source evidence, replay, and failed session validation are rejected before provider egress.

**Acceptance Scenarios**:

1. **Given** HORSEE analysis or a prepared ticket without approval, **When** the user does not invoke the placement action, **Then** no Peakpool bet is submitted.
2. **Given** a valid, unexpired, approved Peakpool ticket and valid app session, **When** the account holder invokes placement, **Then** HORSEE sends only the verified Peakpool app request and returns the provider confirmation or safe failure.
3. **Given** the request is not demonstrably the current Peakpool virtual-balance message shape, **When** placement is requested, **Then** HORSEE fails closed and requires a developer re-audit rather than using a generic or alternate bet path.

---

### User Story 4 - Preserve the existing SMSFootball app capability (Priority: P2)

As an existing HORSEE user, I want Peakpool isolated from the SMSFootball app/leaderboard capability so that one product cannot accidentally submit or interpret the other's ticket format.

**Why this priority**: Both flows currently use shared provider infrastructure, so product-level separation is the primary safety boundary.

**Independent Test**: Attempt to submit a Peakpool handle through SMSFootball logic and vice versa; each attempt fails before egress while legacy tools retain their contracts.

**Acceptance Scenarios**:

1. **Given** a Peakpool ticket, **When** a non-Peakpool placement route or payload is attempted, **Then** it is rejected before any provider request.
2. **Given** Peakpool configuration is absent or disabled, **When** legacy HORSEE tools are discovered or called, **Then** their availability and behavior remain unchanged.

### Edge Cases

- The public Peakpool fixture has no races, stale races, duplicate codes, malformed runner records, or a race disappears after preparation.
- A session is missing, expired, revoked, or requires the provider's app registration step.
- The provider changes the app script, endpoint, request fields, message grammar, source hashes, response schema, or required app-mode signal.
- The submitted unit balance is insufficient, the ticket has already been accepted, the provider times out, or a success response lacks a usable reference.
- A caller tries to substitute a fixed-odds, football, paid-SMS, deposit, withdrawal, wallet, card, bank, cash, or arbitrary message into a Peakpool request.
- Two placement requests race for the same prepared ticket.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The system MUST treat Peakpool as a separate virtual-balance, leaderboard product profile, independent of SMSFootball and every cash, wallet, deposit, withdrawal, or paid-SMS product.
- **FR-002**: The system MUST retrieve the current Peakpool fixture from the provider's authoritative read-only source and return structured races, runners, displayed values, and provider selection codes where available.
- **FR-003**: The system MUST provide a non-submitting ticket-preparation operation that validates one Peakpool selection, its supported bet type, and a virtual-unit stake against current data.
- **FR-004**: The system MUST require a server-issued, short-lived prepared-ticket identity and an explicit approval invocation before placement.
- **FR-005**: The system MUST never permit HORSEE analysis, programme retrieval, preparation, diagnostics, or session checks to submit a Peakpool bet.
- **FR-006**: The placement boundary MUST construct the provider message itself from an approved Peakpool ticket; callers MUST NOT provide a raw provider message, endpoint, cookie, token, or request header.
- **FR-007**: The placement boundary MUST allow only the developer-verified current Peakpool app flow and MUST reject all other paths, methods, fields, redirects, hostnames, product identifiers, or message shapes before egress.
- **FR-008**: The system MUST reject paid-SMS, fixed-odds, football, wallet, cash, payment, deposit, withdrawal, balance-management, card, bank, and arbitrary-message paths or parameters at the Peakpool placement boundary.
- **FR-009**: The system MUST fail closed with `PEAKPOOL_APP_FLOW_CHANGED` when current provider evidence no longer matches the recorded product-specific request profile.
- **FR-010**: The system MUST validate and restore the authenticated app session without storing plaintext OTPs or exposing complete session tokens, cookies, or account identifiers.
- **FR-011**: The system MUST atomically permit at most one attempt for each prepared Peakpool ticket and MUST not retry an ambiguous provider outcome.
- **FR-012**: The system MUST return the provider's confirmation/reference and virtual-unit result when supplied, without fabricating balance or leaderboard values that the provider did not return.
- **FR-013**: The system MUST expose separate authorization for session management, Peakpool preparation, and Peakpool placement.
- **FR-014**: The system MUST record redacted lifecycle and guard events without logging OTPs, full tokens, full cookies, raw provider messages, or unit-balance account data beyond what is necessary for safe diagnostics.
- **FR-015**: The system MUST preserve existing HORSEE racecard, Council, and SMSFootball tool behavior unless an approved specification changes it.
- **FR-016**: The system MUST not enable live Peakpool placement until an authorized, non-cash provider test verifies the current authenticated transaction and response semantics.

### Key Entities

- **Peakpool Fixture**: The current provider programme of races, runners, displayed values, source version, and availability state.
- **Peakpool Selection**: A single race/runner/bet-type choice resolved to the provider's product-specific code.
- **Prepared Peakpool Ticket**: A short-lived, integrity-protected snapshot of the selection, virtual-unit stake, session generation, source evidence, and explicit product identity.
- **Peakpool App-Flow Profile**: The verified destination, method, headers, form fields, message grammar, source fingerprints, app-mode requirements, and response classification for Peakpool only.
- **Peakpool Placement Result**: The classified provider response including confirmation, virtual-unit result, and leaderboard information when supplied.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: In recorded fixture tests, 100% of valid Peakpool races and runners used for preparation are returned with their provider codes and no placement request occurs.
- **SC-002**: In ticket-preparation tests, 100% of malformed, stale, closed, or cross-product selections are rejected before any placement-capable request.
- **SC-003**: In guard tests, 100% of non-Peakpool, payment-like, paid-SMS, arbitrary-message, changed-route, redirect, and flow-drift attempts are rejected before egress.
- **SC-004**: In mocked placement tests, 100% of approved valid prepared tickets result in no more than one provider attempt; ambiguous outcomes are never automatically retried.
- **SC-005**: Existing HORSEE test suites pass with Peakpool disabled and expose no new Peakpool placement capability without explicit configuration.
- **SC-006**: A maintainer can identify session expiry, fixture drift, rejected virtual-balance placement, and source-profile drift from safe diagnostics in under five minutes.

## Assumptions

- Peakpool operates with a fixed non-cash unit balance and leaderboard winnings, as confirmed by the product owner on 2026-09-01.
- The product owner can provide an authorized account and a no-cash/non-production test arrangement for the final authenticated transaction verification.
- Peakpool is a one-selection product in the currently observed public client flow; multi-selection support requires separate evidence and a specification update.
- The first implementation will depend on the encrypted SMSPariaz session foundation proposed in the separate SMSFootball feature; it will not duplicate authentication or store state outside that boundary.
- Current public source is evidence, not a permanent contract. Any source or semantic change disables placement until re-audited.
