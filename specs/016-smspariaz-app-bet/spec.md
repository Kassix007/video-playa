# Feature Specification: Authenticated SMSPariaz App Bets

**Feature Branch**: `codex/smspariaz-app-bet-mcp`

**Created**: 2026-09-01

**Status**: Implemented — pending owner-approved authenticated production verification

**Input**: User description: "Add a hosted, persistent SMSPariaz authenticated-session capability to HORSEE that reads SMSFootball, prepares tickets, and submits only through the verified free 'Using App Tap Here' leaderboard/app flow, with a hard fail-closed prohibition on wallet, SMS-paid, deposit, withdrawal, and every other real-money path."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Establish and Restore a Legitimate Session (Priority: P1)

As the SMSPariaz account holder, I want to complete the legitimate one-time-password login flow and have the resulting authenticated app session retained securely so that HORSEE can use it later without my Windows laptop remaining online.

**Why this priority**: Every programme, ticket, and submission action that depends on an authenticated app identity is unusable until the session can be established, checked, restored, expired, and removed safely.

**Independent Test**: Start login for a test account, confirm it with a supplied one-time password, restart the hosted service, and verify that the account is still reported as authenticated without exposing authentication secrets.

**Acceptance Scenarios**:

1. **Given** no saved SMSPariaz session, **When** the account holder checks status, **Then** the result reports that authentication is required and does not expose account secrets.
2. **Given** SMSPariaz requests a one-time password, **When** the account holder supplies the valid code, **Then** HORSEE completes only the legitimate login and app-registration flow and saves the resulting session securely.
3. **Given** a valid saved session and the user's laptop is offline, **When** a later hosted HORSEE request checks the session, **Then** the authenticated state is restored server-side.
4. **Given** an expired or revoked saved session, **When** HORSEE validates it, **Then** the result clearly reports that a new login is required and does not attempt to bypass authentication or registration.
5. **Given** an authenticated session, **When** the account holder logs out, **Then** the saved SMSPariaz state is destroyed and subsequent protected actions require authentication.

---

### User Story 2 - Read the Programme and Prepare a Ticket (Priority: P1)

As a HORSEE user, I want the current authoritative SMSFootball events and markets in structured form and a separately validated ticket preview so that I can inspect current codes, odds, status, stake, and estimated payout without placing anything.

**Why this priority**: Users need current provider facts and a non-submitting validation step before they can make an informed approval decision.

**Independent Test**: Load a representative current programme fixture, request a ticket with valid and invalid selections, and verify the resolved events, provider codes, current odds, status, totals, changed-odds warnings, and validation errors while proving that no submission occurs.

**Acceptance Scenarios**:

1. **Given** the authoritative SMSFootball programme is available, **When** the user requests it, **Then** HORSEE returns available event identity, kickoff, competition, teams, markets, selections, provider codes, displayed odds, status, and open/closed state wherever the source provides them.
2. **Given** a valid set of open selections and a stake, **When** the user prepares a ticket, **Then** HORSEE resolves each selection against current provider data and returns the ticket's current total odds, stake, estimated payout, and any changed odds without submitting it.
3. **Given** a malformed, unknown, suspended, or closed selection, **When** the user prepares a ticket, **Then** HORSEE rejects or flags it with a specific validation error and performs no submission.

---

### User Story 3 - Explicitly Submit Only the App/Leaderboard Ticket (Priority: P1)

As the account holder, I want an already prepared ticket submitted only after my explicit approval and only through the verified free "Using App Tap Here" leaderboard/app flow so that HORSEE can never drift into a wallet, paid SMS, deposit, withdrawal, or other real-money route.

**Why this priority**: The app/leaderboard action is the requested business capability, while confusing it with another betting path creates unacceptable financial and compliance risk.

**Independent Test**: Against recorded or mocked provider transactions, submit a previously prepared ticket through the verified app flow and prove that every altered endpoint, payment field, wallet route, stale ticket, or unverified flow is rejected before any outbound submission.

**Acceptance Scenarios**:

1. **Given** the user has not explicitly invoked the submission action, **When** HORSEE analyses football or prepares a ticket, **Then** no ticket is submitted.
2. **Given** an explicitly approved, recently prepared ticket and a valid app session, **When** the submission action is invoked, **Then** HORSEE revalidates session, event availability, odds, and app-flow identity before sending the verified app/leaderboard transaction.
3. **Given** SMSPariaz accepts the app-flow ticket, **When** HORSEE parses the response, **Then** the user receives the provider confirmation/reference, stake, payout information when available, and an unambiguous app-flow label.
4. **Given** the target path, request shape, flow fingerprint, or semantics differs from the developer-verified app flow, **When** submission is attempted, **Then** HORSEE fails closed with an app-flow-changed error and sends nothing.
5. **Given** a request contains or targets a wallet, cash, paid-SMS, payment, deposit, withdrawal, or any non-approved wagering mechanism, **When** it reaches the submission boundary, **Then** HORSEE rejects it and never falls back to another route.

---

### User Story 4 - Diagnose the Integration Without Revealing Secrets (Priority: P2)

As the service owner, I want safe operational status and structured events for authentication, programme retrieval, validation, submission, provider responses, and failures so that I can maintain the integration when SMSPariaz changes without exposing private account data.

**Why this priority**: A security-sensitive external integration must make expiry and frontend-flow drift actionable while keeping one-time passwords, tokens, and cookies out of logs and diagnostics.

**Independent Test**: Exercise successful and failed lifecycle events with sentinel secrets and verify that diagnostics identify session, app mode, script versions, flow fingerprint, and last safe error while no sentinel secret appears in output or logs.

**Acceptance Scenarios**:

1. **Given** any login, restore, programme, preparation, or submission outcome, **When** an operational event is recorded, **Then** it contains useful bounded context and no one-time password, complete token, complete cookie, or plaintext secret.
2. **Given** a maintainer requests diagnostics, **When** safe status is returned, **Then** it may report session presence/validity, app registration, detected app mode, relevant source versions, approved-flow fingerprint, and last error without secret values.
3. **Given** the provider changes its flow, **When** the integration detects a mismatch, **Then** the diagnostic result supports a new developer audit and the submission capability remains closed until the verified flow is updated.

---

### User Story 5 - Preserve Existing HORSEE Service (Priority: P2)

As an existing HORSEE user, I want the racecard and Council capabilities to continue working with their existing authorization and response contracts after SMSPariaz app sessions are added.

**Why this priority**: The new capability is an extension of a working production service and must not regress established public and protected workflows.

**Independent Test**: Run the existing HORSEE discovery, authorization, racecard, result, history, scheduler, and archive checks unchanged alongside the new SMSPariaz tests.

**Acceptance Scenarios**:

1. **Given** the SMSPariaz app capability is not configured, **When** existing HORSEE tools are discovered and called, **Then** their availability, authorization, and behavior remain compatible.
2. **Given** the SMSPariaz app capability is configured, **When** existing HORSEE operations run, **Then** SMSPariaz session state remains isolated from Council authorization and storage.

### Edge Cases

- The one-time password is missing, malformed, incorrect, expired, or already used.
- SMSPariaz requires app/device registration or returns a registration state that cannot be reproduced legitimately.
- Cookies and browser storage disagree, only part of a saved session can be decrypted, or the provider revokes a still-present token.
- The programme response is empty, partial, stale, malformed, or changes while a ticket is being prepared.
- Odds change, an event closes, or a selection is suspended between preparation and explicit submission.
- The user attempts to submit without a server-issued prepared-ticket identity, alters the prepared request, or reuses an expired preparation.
- The provider returns success without a parseable reference, an error with a successful transport status, a non-structured response, a timeout, or an ambiguous outcome.
- The approved endpoint remains the same but request fields, headers, app-mode signals, device values, response semantics, or source-script fingerprint changes.
- A redirect, alternate hostname, retry, or fallback would leave the approved app-flow allowlist.
- A field or path uses ambiguous betting terminology but has not been positively verified as part of the free app/leaderboard flow.
- Multiple hosted requests attempt to confirm login, refresh a session, prepare, submit, or log out concurrently.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The system MUST expose distinct operations to inspect SMSPariaz session status, start legitimate login, confirm the provider-issued one-time password, and explicitly log out.
- **FR-002**: The system MUST follow SMSPariaz authentication and app/device registration requirements without bypassing, weakening, or simulating successful authentication.
- **FR-003**: The system MUST never retain a plaintext one-time password after the confirmation request and MUST never emit one-time passwords, complete tokens, complete cookies, credentials, or encryption secrets in logs, diagnostics, errors, or tool results.
- **FR-004**: The system MUST protect sensitive saved session state at rest with a server-held secret and MUST detect missing, invalid, undecryptable, expired, and revoked state cleanly.
- **FR-005**: The hosted service MUST restore valid SMSPariaz session state without depending on the user's Windows laptop or another user-operated computer remaining online.
- **FR-006**: The system MUST expose actionable session outcomes including authentication required, one-time password required, session expired, and app registration required.
- **FR-007**: The system MUST retrieve current SMSFootball events and markets from the authoritative source used by SMSPariaz and return the available provider identifiers, codes, odds, and open/closed status as structured data.
- **FR-008**: The system MUST support preparing and validating a ticket separately from submission, including current event resolution, provider codes, odds, total odds, stake, provider-estimated payout when available, selection status, changed odds, and validation errors.
- **FR-009**: Preparing a ticket, retrieving a programme, checking a session, running diagnostics, and performing HORSEE analysis MUST NOT submit a ticket.
- **FR-010**: Submission MUST require a server-issued, integrity-protected prepared-ticket identity that binds the approved selections, stake, observed odds, approved app-flow fingerprint, and a bounded validity period.
- **FR-011**: Submission MUST occur only through the exact legitimate "Using App Tap Here" app/leaderboard request path and semantics positively verified by a developer from current production evidence.
- **FR-012**: The system MUST revalidate the authenticated session, app registration, each event, each selection, current odds, and open status immediately before submission.
- **FR-013**: The submission boundary MUST positively allowlist the verified app-flow destination and request shape and MUST fail closed when the destination, request, app signal, required state, response semantics, or flow fingerprint differs.
- **FR-014**: The submission boundary MUST reject wallet, cash, payment, paid-SMS, deposit, withdrawal, balance-debit, and every non-approved route or parameter before an outbound submission.
- **FR-015**: The system MUST NOT infer safety from an endpoint or field name containing "bet" and MUST NOT retry or fall back through an alternate submission mechanism.
- **FR-016**: HORSEE analysis MUST remain separate from ticket submission; only an explicit user-approved invocation may initiate the app-flow submission operation.
- **FR-017**: A successful submission result MUST return the provider confirmation/reference when supplied, the submitted stake and payout information when supplied, and identify the action as the SMSPariaz app flow without fabricating missing values.
- **FR-018**: Ambiguous submission outcomes MUST be reported as ambiguous and MUST NOT be automatically retried when doing so could duplicate a ticket.
- **FR-019**: The system MUST record structured, redacted operational events for login, restore, expiry, programme retrieval, ticket validation, app-flow submission, provider response classification, flow drift, and guard rejection.
- **FR-020**: Safe diagnostics MUST reveal enough non-sensitive state to re-audit provider changes, including detected app mode, relevant source versions, approved-flow fingerprint, and last classified error when those facts are known.
- **FR-021**: Automated tests MUST not submit irreversible production transactions and MUST cover session restore/expiry, one-time-password handling, programme parsing, ticket validation, odds/status changes, malformed input, non-app destinations, payment-route rejection, flow drift, mocked success/failure, and secret redaction.
- **FR-022**: Existing HORSEE racecard, Council, history, scheduler, archive, authorization, and user-interface contracts MUST remain backward compatible unless a separately approved specification changes them.
- **FR-023**: The service MUST remain safe when SMSPariaz app capability configuration is missing or disabled: existing HORSEE capabilities continue operating while all SMSPariaz authenticated and submission actions report unavailable.
- **FR-024**: The system MUST NOT claim the app-flow submission works until the exact current legitimate production transaction has been verified without making an unapproved test submission.

### Scope Boundaries

The feature includes legitimate SMSPariaz OTP authentication, required app/device registration, secure session persistence, SMSFootball programme reads, non-submitting ticket preparation, and explicitly approved free app/leaderboard submission.

The feature excludes wallet debits, paid SMS betting, deposits, withdrawals, balance operations, payment instruments, autonomous wagering, authentication bypass, device-registration bypass, and any alternate or inferred betting route.

### Key Entities

- **SMSPariaz Session**: The account's authenticated and app-registered state, its safe status, expiry information, provider-required storage, and last validation time.
- **Login Attempt**: A bounded pending authentication flow that can require a provider-issued one-time password and expires without retaining the plaintext code.
- **Football Event**: A provider-identified fixture with kickoff, competition, participants, markets, selections, codes, odds, and availability.
- **Prepared App Ticket**: A non-submitting, integrity-protected snapshot of resolved selections, stake, odds, payout estimate, provider codes, current status, expiry, and approved app-flow identity.
- **App-Flow Fingerprint**: The developer-verified identity of the free app/leaderboard transaction, including the destination and all semantics that distinguish it from prohibited routes.
- **Submission Result**: The classified provider outcome, confirmation/reference when supplied, submitted values, flow label, and safe failure information.
- **Operational Event**: A redacted lifecycle or guard record that supports diagnosis without containing authentication secrets.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: An account holder can complete the legitimate OTP setup and receive a clear authenticated or actionable failure result within 3 minutes, excluding provider message-delivery delay.
- **SC-002**: After hosted service restart or redeployment, 100% of valid saved-session test cases restore without the user's laptop being online, while 100% of expired or undecryptable cases fail safely.
- **SC-003**: For a representative programme fixture, 100% of available events, markets, provider codes, displayed odds, and open/closed states used by ticket preparation match the authoritative source.
- **SC-004**: In all ticket-preparation tests, the user receives validation results within 10 seconds under normal provider availability and zero submission transactions occur.
- **SC-005**: In 100% of guard tests, changed destinations, unexpected request shapes, payment/wallet fields, redirects, unverified semantics, and flow-fingerprint drift are rejected before an outbound submission.
- **SC-006**: In 100% of submission tests, only an unexpired, integrity-valid prepared ticket can reach the verified app-flow boundary, and all event and odds changes are surfaced before submission.
- **SC-007**: In 100% of automated and manual log-redaction checks using sentinel secrets, no one-time password, complete token, complete cookie, credential, or encryption key appears in logs, diagnostics, errors, or results.
- **SC-008**: All existing HORSEE automated checks and the mandatory project build pass after integration with no removed or silently changed existing MCP tool contract.
- **SC-009**: A maintainer can identify an expired session, missing app registration, or app-flow drift from safe diagnostics in under 5 minutes without accessing plaintext account secrets.
- **SC-010**: No production ticket is submitted during discovery or automated testing without a separate, explicit owner approval for that exact test.

## Assumptions

- The requester is authorized to integrate with and operate the legitimate SMSPariaz account and provider flow.
- SMSPariaz continues to offer a distinct free app/leaderboard path labelled "Using App Tap Here"; the feature remains disabled if current evidence cannot positively distinguish it from real-money paths.
- One SMSPariaz account/session per configured HORSEE deployment is sufficient for the initial release; multi-account tenancy requires a separate scope decision.
- The existing hosted HORSEE service remains the user-facing integration point and existing Council OAuth remains independent from SMSPariaz account authentication.
- The account holder supplies each OTP interactively when SMSPariaz requires one; OTP delivery and provider availability remain external dependencies.
- A prepared ticket has a short server-defined validity period and cannot be modified client-side; the precise duration is selected during planning based on observed provider volatility.
- Production-flow discovery may inspect public scripts, repository APK evidence, and legitimate authenticated traffic, but no production ticket submission occurs without explicit approval.

## Implementation evidence (2026-09-01)

- Direct authenticated HTTP was implemented after static verification of the public production scripts and Android wrapper. The app submission path remains disabled by default and fails closed on source-hash, endpoint, request-shape, redirect, session, registration, odds, or event-status drift.
- `npm run test:mcp` passed: 174 tests across 46 suites. All provider calls in the automated suite use injected mocks; no production submission was made.
- `npm run build` and `git diff --check` passed.
- A live authenticated OTP/login and any `Using App Tap Here` submission remain manual, owner-authorized verification steps. This feature deliberately does not claim live end-to-end placement success until that evidence exists.
