# Feature Specification: Fantasy SMSPariaz Peakpool

**Feature Branch**: `codex/peakpool-app-bet-plan`

**Created**: 2026-09-04

**Status**: PMU production release deployed on 2026-09-06. Four pending bets converted with audit; three settled against PMU and one remains unmatched/review. Settled history preserved. Full authenticated player/admin browser verification remains T059.

**Input**: User description: "Add a fantasy-credit horse-racing competition that uses public SMSPariaz racecards and displayed prices but never accesses an SMSPariaz account or submits a real wager."

## Delivery Verification (updated 2026-09-05)

### PMU production release — 2026-09-06 (current)

- Netlify deploy `6a9cd9448bf68dcc68113f3b` serves the PMU labels/history and 30-second visible-tab refresh. HTTP 200, PMU bundle checks and signed-out 375/768/1280 overflow checks passed; no console errors. Today's public programme contains 31 PDF races, but expanded sampled race has unreconciled runners, so no authenticated placement was fabricated for QA.
- Migrations `202609060001` through `202609060003` are applied. Pending conversion audited four bets without moving balances. Three subsequently settled as losses; one Craon R5 bet remains pending because its truncated canonical title differs from PMU. The race is not guessed or treated as a loss.
- PMU enabled, ATR disabled; the existing active five-minute job targets the protected PMU worker. Unauthorized invocation returns 401. Wallet and immutable ledger totals both equal 3350.00 after live settlement.
- Exact dead-heat and non-runner SQL fixtures pass, and PMU-specific SQL NFD normalization agrees with the adapter for accented titles. Existing settled records are excluded from conversion.
- Remaining scope: T059 authenticated flow QA and future evidence-backed coverage improvements. Public endpoint availability is not a licence or uptime guarantee.
- Final local checks: 253 repository tests and production build passed; SQL suites total 128 assertions. Spec requirements remain 16/16 checked, no clarification markers. Staged credential-pattern scan and diff check passed; unfinished ATR/Zone-Turf edits are excluded from this release commit.

### Current result-validation follow-up

- Requirements checklist revalidated: 16/16; no clarification markers introduced.
- Reproduced four failing regression groups before implementation; Node and Edge now share response-only identity matching and challenge detection.
- All 244 repository tests and the production build pass. The result suite includes 10 tests covering challenge markers, missing/wrong/ambiguous identities, timezone requirements, winner prices, field conflicts, void handling, and transport-only smoke diagnostics.
- No UI, database migration, production deployment, historical-row rewrite, or new retrieval provider is part of this follow-up. Existing challenge observations remain unchanged. Live ATR layout/access verification is still required before declaring settlement automation working.
- Next phase: continue `speckit-implement` for T085–T090 and T059; this result fix does not complete feature 018.

### Historical foundation and deployment evidence

- Spec Kit requirements checklist: **16/16 passed**.
- Focused fantasy suite: **38/38 passed**.
- Database suite: **106/106 pgTAP assertions passed** against a reset local Supabase/Postgres stack on Docker Desktop Linux containers for Windows. Coverage includes initialization, RLS/grants, quote change/staleness, server close boundary, wallet serialization, idempotency conflict, win/loss, non-runner and race-void refunds, dead heat, duplicate settlement, ambiguity/review, manual confirmation, correction/reversal, leaderboard disclosure/aggregates, and every administrator boundary.
- Production build: **passed**. Vite reported only the existing large-chunk advisory.
- `git diff --check`: **passed** with line-ending conversion warnings only.
- Repository suite: **231/231 passed** after reconciling feature 017's OAuth metadata test with its two isolated Peakpool scopes.
- Safety scan: **passed** for feature runtime files and built output. No private key markers, client secrets, provider-account imports, `/checklogin/`, or `/placebet/` calls were found. Matches in specification prose are explicit prohibitions; `service_role` matches are database grants/test roles, never browser credentials.
- Local database execution: **passed**. `npx supabase db reset` applied all migrations, and `npx supabase test db` passed **106/106** assertions. That execution identified and fixed an enum-typing defect in the settlement migration before the final clean run.
- Authenticated responsive QA: **partially pending**. Google OAuth is configured, while the complete real player/admin interaction matrix still requires controlled player and administrator test sessions. The affected signed-out compact programme was verified at 375px, 768px, and 1280px with no page-level horizontal overflow, keyboard-native disclosure controls, reduced-motion coverage, and every PDF meeting reachable.
- Production surface: **deployed fail-closed** to `https://videoplaya.kassinathdoss.dev` as Netlify deploy `6a9bcc80e8ea46172a4b7008`. New Google sign-ins use PKCE. The production market-sync bearer is stored write-only in Netlify and Supabase Vault. The active ten-minute cron ingested all **55** canonical daily-PDF races across **7** meetings and **567** runner records; one malformed optional market race was skipped without suppressing its canonical race. The live workspace shows the canonical race total at the top, renders one meeting at a time, starts every race collapsed, and mounts runner details only after expansion. Fantasy wager activation remains independently blocked by the live price-normalization evidence gate.

Historical task reconciliation before payout activation: **84 of 85 tasks complete**. T059 remained; the later payout and result-validation phases are tracked separately in tasks.md.

## Clarifications

### Session 2026-09-06 — free PMU replacement (supersedes ATR-only pricing)

- The owner requires no paid provider, proxy, subscription, or account. PMU public read-only JSON replaces ATR as the automatic result source where coverage is proven; the SMSPariaz daily PDF remains the sole race universe.
- Fantasy returns use PMU NATIONAL SIMPLE_GAGNANT definitive per-euro dividends, never provisional odds or a different pool chosen opportunistically. Gross credit is stake multiplied by the verified per-unit dividend. Published dead-heat dividends already account for the pool split and MUST NOT be divided again or have stake added again.
- Historical settled results remain unchanged. On 2026-09-06 the owner explicitly approved switching all existing pending selections to PMU dividends and deploying to production. Record an audit of the conversion without changing stakes or balances; new selections also use PMU. Legacy ATR settlement must not price PMU selections. Unmatched races remain pending/review, never guessed or silently lost.
- All winners, runner identities, non-runners, race date/course/time/name, final-arrival and definitive-dividend flags must agree before mutation. Missing coverage stays visible and pending/review.
- Availability of a public endpoint is not a data-use licence or uptime guarantee. No authentication, wagers, CAPTCHA solving, or undisclosed endpoint bypass is authorized.

### PMU acceptance outcomes

### Completion follow-up 2026-09-06

- Administrator settings must open with the actual saved configuration, never placeholder defaults. Saving an unrelated setting must preserve existing result-check timings. Missing or invalid configuration must prevent submission. Player balance adjustments require an explicitly chosen player.

Administrator follow-up delivered: Mechtomine has owner-authorized administrator access, recorded in the audit trail. Saved settings now display correctly, unavailable configuration prevents editing, and balance adjustments require choosing a recipient. The live settings screen passes all required widths; the review dialog opens and closes safely without changing race results. Full mutation-flow verification remains outstanding.

- When the optional Peakpool feed is empty, a uniquely matched PMU race may supply a complete runner list to an otherwise empty canonical PDF race. Require date, course, race number, scheduled time and title agreement; ignore only terminal discipline labels such as Attelé/Monté. Preserve existing runner identities and never replace a race with accepted selections. Keep PMU source URL/hash as evidence and do not import pre-race odds.
- For results only, differing/truncated sponsor titles may be accepted when date/course/race number/time uniquely identify the candidate AND every independently stored runner number/name matches the complete PMU field. Store both titles and the full field evidence; the database must independently check that field before relaxing title equality. A different field or ambiguous candidate must not settle.
- Missing provider coverage remains an explicit limitation, not a fabricated result. Full signed-in QA requires a genuine user-controlled session.

Delivered outcome: all 31 current PDF races have runners from the existing sync, leaving no empty field to exercise the new fallback in production. The previously unmatched Craon R5 result now validates and production has four settled PMU bets, with one current-day pending bet. Genuine player selection/stake validation, history, wallet and leaderboard checks passed without submitting a test wager. Administrator-session verification and results for meetings absent from PMU (today: York) remain explicit limitations. Detailed release evidence is recorded in quickstart.md.

1. A finalized La Teste fixture with winner 4 and a 500-cent per-euro dividend normalizes to 5.00; stake 10.00 yields gross 50.00, not 60.00.
2. Two declared joint winners each use their published dividend with no second divisor.
3. Missing/duplicate/mismatched prices, different pools, partial results, ambiguous races and malformed identities cause no bet, balance or ledger mutation.
4. Provider meeting numbers need not match SMSPariaz meeting numbers; full canonical identity and runner checks are required.
5. Scheduled retrieval uses bounded reads and one programme per date per invocation. Visible pages refresh balances, bets and leaderboard automatically.

### Session 2026-09-04

- Q: How should At The Races' finalized starting price affect fantasy payouts? → A: Originally locked pre-race pricing; superseded by the 2026-09-05 decision below.

### Session 2026-09-05

- Q: How should a fantasy WIN bet be priced when no trustworthy pre-race odds are available? → A: Accept the runner selection and stake without a pre-race price, then use the matched ATR finalized starting price to calculate a winner's payout after the race.

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Join the fantasy competition (Priority: P1)

As a player, I want to sign in with my Google account and receive the configured opening balance so that I can participate without a password, payment, deposit, withdrawal, SMS, or SMSPariaz account.

**Why this priority**: Identity, roles, and an auditable fantasy wallet are the foundation for every other player action.

**Independent Test**: Sign in as a first-time player, confirm one opening ledger entry and the configured balance, sign out, and sign back in without creating a second opening entry.

**Acceptance Scenarios**:

1. **Given** a new authenticated user, **When** the fantasy destination initializes the player, **Then** the user receives the `player` role, one immutable opening-balance transaction, and the configured starting balance.
2. **Given** a returning player, **When** they sign in again, **Then** their existing role, wallet, bets, and ledger are restored without a duplicate opening balance.
3. **Given** an unauthenticated visitor, **When** they open the destination, **Then** they can see only intentionally public competition information and are prompted to sign in before viewing private data or betting.
4. **Given** a production deployment with a configured hosted project, **When** the browser bundle loads, **Then** it contains the project URL and publishable key configuration and presents Google sign-in instead of the setup-unavailable state.
5. **Given** Google returns an implicit OAuth session in the URL fragment, **When** the hash router starts, **Then** a dedicated callback fallback mounts session restoration, removes the credential-bearing fragment, and returns the user to Peakpool without treating tokens as a normal application route.
6. **Given** a new Google sign-in, **When** authorization completes, **Then** the application uses PKCE, exchanges only a short-lived authorization code before rendering, removes it from the URL, and never places access, refresh, or provider tokens in a hash-router route or console warning.

---

### User Story 2 - Browse today's trustworthy markets (Priority: P1)

As a player, I want to see today's SMSPariaz races, runners, prices, and closing status so that I can make a fantasy selection using recognizable public source data.

**Why this priority**: The game must never invent a race or price and cannot accept a bet without a trustworthy current market.

**Independent Test**: Reconcile recorded racecard and market fixtures, then confirm races are grouped by meeting, runners show verified normalized prices, and incomplete or stale markets are unavailable.

**Acceptance Scenarios**:

1. **Given** a race on the authoritative daily SMSPariaz racecard with a current, understood WIN market, **When** a player views today's programme, **Then** the race and active runners display their source-backed fantasy prices and status.
2. **Given** a racecard race without a trustworthy current price, **When** it is displayed, **Then** it remains visible with `Odds currently unavailable` and cannot be selected.
3. **Given** a market race absent from the authoritative daily racecard, **When** market data is reconciled, **Then** it is not offered for betting.
4. **Given** a race within the configured close buffer or already off, **When** the programme is read, **Then** authoritative server time marks it closed regardless of the browser clock.
5. **Given** today's authoritative daily racecard is valid but the optional public market response is empty, malformed, or contains an invalid race, **When** synchronization runs, **Then** every canonical racecard race remains visible, invalid market records are ignored, and affected runners and prices remain unavailable rather than suppressing the programme.
6. **Given** today's programme contains many meetings and races, **When** a player opens Peakpool, **Then** the page shows the total PDF race count, one meeting's races at a time, and collapsed race headers without mounting every runner list.
7. **Given** a collapsed race, **When** the player activates its header, **Then** that race expands accessibly to show its available runner information and can be collapsed again.
8. **Given** a player needs races, their bets, wallet activity, the leaderboard, or administrator controls, **When** the page loads, **Then** those destinations are available from a compact workspace control near the top instead of requiring traversal past the complete programme.

---

### User Story 3 - Place an atomic fantasy WIN bet (Priority: P1)

As a player, I want to review a selected runner and stake before explicitly placing one fantasy bet, with the return determined from ATR's finalized winner odds after the race, so that I can participate without invented pre-race odds.

**Why this priority**: Safe, deterministic bet acceptance is the core competition action.

**Independent Test**: Submit one reviewed runner/stake bet without a pre-race quote, retry it and race a second request against the same wallet, then confirm exactly one accepted bet, one stake debit, and a non-negative balance.

**Acceptance Scenarios**:

1. **Given** an open race, active runner, permitted stake, and sufficient balance, **When** the player explicitly places the reviewed bet, **Then** the system atomically accepts the runner and stake without requiring or inventing a pre-race price, debits one stake ledger entry, and returns the bet receipt and new balance.
2. **Given** the same client request is replayed, **When** it is submitted again, **Then** the original result is returned or the duplicate is safely rejected without another bet or debit.
3. **Given** concurrent requests exceed the wallet balance, **When** they race, **Then** only affordable bets succeed and the balance never becomes negative.
4. **Given** the race is closed, betting is disabled, the runner is inactive, or server time is unavailable, **When** placement is attempted, **Then** no bet or ledger entry is created and the player receives a clear unavailable status.

---

### User Story 4 - Track bets and competition standing (Priority: P2)

As a player, I want to review my pending and settled bets, wallet ledger, and leaderboard standing so that I understand my fantasy performance without seeing another player's private records.

**Why this priority**: A transparent history and public competition ranking make the fantasy balance meaningful.

**Independent Test**: Use two player accounts and confirm each sees only their own bets and ledger while both see a leaderboard containing display identity and aggregate statistics but no email address.

**Acceptance Scenarios**:

1. **Given** a player with bets and wallet activity, **When** they open their history, **Then** they see their own pending, won, lost, and void bets and immutable ledger entries.
2. **Given** multiple players, **When** any visitor reads the leaderboard, **Then** it shows rank, public player identity, balance, net result, wins, and bet count without exposing emails or private transactions.
3. **Given** one player, **When** they attempt to read another player's private bet or ledger details, **Then** access is denied even if they bypass the visible interface.

---

### User Story 5 - Confirm results and settle safely (Priority: P1)

As the competition operator, I want race results matched conservatively and bets settled exactly once so that players are paid from confirmed evidence and ambiguous matches never cause a wrong payout.

**Why this priority**: Incorrect or duplicate settlement would invalidate wallet integrity and competition trust.

**Independent Test**: Feed confirmed wins, losses, non-runners, a void race, a dead heat, duplicate settlement calls, a corrected result, and an ambiguous match; then verify exact ledger and status outcomes.

**Acceptance Scenarios**:

1. **Given** a confidently matched finalized ATR result containing a winner and finalized starting price, **When** settlement runs, **Then** the winning runner and finalized odds are retained as result evidence, winning locked-price bets receive the deterministic return from their accepted pre-race price, losing bets receive no credit, and the race settles once.
2. **Given** a confirmed non-runner or void race, **When** settlement runs, **Then** affected stakes are refunded exactly once and bets become void.
3. **Given** multiple joint winners, **When** settlement runs, **Then** each winning gross return equals stake multiplied by locked price divided by the recorded number of joint winners, rounded deterministically to two decimals.
4. **Given** ambiguous or incomplete result evidence, **When** automatic matching runs, **Then** the race becomes `NEEDS_REVIEW` and no payout or refund is made.
5. **Given** a confirmed result later requires correction, **When** an authorized correction is applied, **Then** prior wallet history remains visible and explicit reversal/correction transactions reconstruct the change.

---

### User Story 6 - Administer the game with an audit trail (Priority: P2)

As an administrator, I want protected controls for game settings, player adjustments, race review, bets, and settlement so that I can operate the competition without directly rewriting balances or evidence.

**Why this priority**: Operations require intervention, but every intervention must preserve player and ledger integrity.

**Independent Test**: Exercise every admin action as an admin and as a player, confirming admin success with audit metadata and player rejection at the authorization boundary.

**Acceptance Scenarios**:

1. **Given** an administrator, **When** they change betting availability, future starting balance, stake limits, or close buffer, **Then** the new configuration is audited and applies according to its stated effective scope.
2. **Given** an administrator adjusting a wallet, **When** they submit a signed amount and reason, **Then** one immutable adjustment records the amount, reason, administrator, timestamp, and resulting balance.
3. **Given** an administrator manually confirms or voids a race, **When** they provide an explicit reason, **Then** evidence and audit metadata are stored and settlement remains idempotent.
4. **Given** a normal player, **When** they invoke any role, balance, odds, race, result, settlement, or configuration mutation, **Then** authorization denies it regardless of interface visibility.

---

### User Story 7 - Operate within free-tier and safety limits (Priority: P2)

As the maintainer, I want bounded result checks, source-controlled setup, and fail-closed integrations so that the game can run on the existing free deployment without secrets or real-wager risk.

**Why this priority**: The feature must be deployable and maintainable without introducing a paid or dangerous dependency.

**Independent Test**: Provision from repository migrations and documented placeholders, run bounded idempotent checks for unsettled races, and verify source failures cannot accept or settle a bet.

**Acceptance Scenarios**:

1. **Given** a fresh supported environment, **When** the documented setup and migrations are applied, **Then** authentication, authorization, scheduled checks, and game data can be configured without undocumented database state or committed secrets.
2. **Given** unsettled post-off races, **When** scheduled checking runs, **Then** only eligible races are queried with bounded retries and backoff, and unresolved races eventually require review.
3. **Given** an upstream outage, stale racecard, unrecognized odds format, inaccessible result source, or transaction failure, **When** a consequential action is requested, **Then** the system fails closed without inventing data or mutating a wallet incorrectly.
4. **Given** a reviewed production release, **When** an operator deploys from Windows, **Then** migrations are previewed before application, server secrets remain outside browser/build output, the deployed public boundary can be checked without mutation, and betting/result activation remains independently gated.

### Edge Cases

- The same Google user initializes from multiple tabs at once.
- The configured opening balance changes while an existing wallet already exists.
- A stake has more than two decimals, is zero/negative, or exceeds configured limits.
- A quote disappears, changes representation, or ages past its allowed lifetime during confirmation.
- The upstream off time moves earlier or later after a bet was accepted.
- A runner temporarily disappears from a market response but has not been confirmed as a non-runner.
- A result provider disagrees on date, course, race number, time, race identity, runner field, or winner identity.
- A dead heat includes an unexpected number of winners or a corrected winner set.
- Settlement, refund, manual confirmation, adjustment, or correction is retried concurrently.
- A deleted or hidden public profile would otherwise leak an email on the leaderboard.
- The result-check budget expires with races still unresolved.
- The application is loaded at 375px, 768px, or 1280px with long race and runner names.
- The hosted Supabase API bundler does not load the function directory's local import map.
- Server-side Supabase variables exist in Netlify while the build-scoped `VITE_SUPABASE_*` variables are absent from the browser bundle.
- An OAuth token fragment is interpreted as an unmatched hash-router pathname before the Peakpool authentication provider mounts.
- Browser console instrumentation records an unmatched route containing an implicit-flow credential fragment.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The system MUST implement a fantasy-credit competition and MUST NOT authenticate to SMSPariaz, place or prepare a real SMSPariaz wager, use SMS, or support deposits, withdrawals, payments, prizes, cash-out, crypto, or player transfers.
- **FR-002**: The system MAY read only ordinarily accessible public SMSPariaz racecard, fixture, runner, and displayed-price information and MUST NOT call a betting endpoint.
- **FR-003**: Players MUST authenticate with Google only; the fantasy application MUST provide no password, email/password registration, SMS code, or SMSPariaz login flow.
- **FR-004**: New authenticated users MUST become players and MUST receive exactly one wallet initialized from the then-current default starting balance with exactly one immutable opening transaction.
- **FR-005**: An administrator's later starting-balance change MUST affect only wallets initialized afterward unless an explicit adjustment is made.
- **FR-006**: Roles and administrator status MUST be protected from player modification, and a safe first-administrator bootstrap procedure MUST be documented.
- **FR-007**: Players MUST be able to read today's fantasy programme, their balance, their bets, their wallet ledger, and the public leaderboard.
- **FR-008**: Players MUST NOT read another player's private bets or ledger or mutate balances, roles, odds, races, results, settlements, or game configuration.
- **FR-009**: Administrators MUST be able to configure betting availability, default starting balance, minimum stake, optional maximum stake, close buffer, quote age, result confirmation, and result-check bounds.
- **FR-010**: Administrators MUST be able to inspect players, balances, all bets, unsettled races, source evidence, settlement runs, and audit information.
- **FR-011**: Administrators MUST be able to make explicit signed wallet adjustments with a required reason, administrator identity, timestamp, and immutable ledger entry; balances MUST never be silently overwritten.
- **FR-012**: All fantasy-credit amounts, prices, returns, and balances MUST use exact deterministic precision and display two decimal places without treating browser floating-point arithmetic as authoritative.
- **FR-013**: The immutable wallet ledger MUST be the authoritative history and MUST support opening balances, admin adjustments, stakes, payouts, refunds, and settlement reversals.
- **FR-014**: Every balance-changing operation MUST run transactionally at a trusted server boundary and MUST derive the resulting balance without trusting a client-supplied balance or payout.
- **FR-015**: Bet placement MUST atomically authenticate the player, lock the wallet, verify game and race availability, active runner, stake limits, server time, and sufficient balance, then create the unpriced pending bet, ledger debit, and resulting balance as one operation.
- **FR-016**: Bet placement MUST require a client-generated idempotency identity enforced uniquely so retries and concurrent duplicate submissions cannot create multiple bets or stake debits.
- **FR-017**: The player MUST select a runner, enter a stake, acknowledge that the return depends on the later ATR finalized starting price, and explicitly activate `Place fantasy bet`; selecting a runner alone MUST NOT place a bet.
- **FR-018**: Accepted bet receipts MUST include the bet identity, stake, ATR-final-pricing status, resulting balance, and authoritative timestamp; no potential return MUST be invented before settlement.
- **FR-019**: Placement MUST NOT require a Peakpool pre-race price or odds snapshot; missing or unverified pre-race odds MUST NOT prevent an otherwise valid active-runner selection.
- **FR-020**: V1 MUST accept WIN bets only and MUST reject place, each-way, accumulator, dutching, grappe, exotic, Peak5, and any other market type.
- **FR-021**: The existing canonical SMSPariaz daily racecard MUST be authoritative for which races can be offered; no secondary source may invent additional SMSPariaz races.
- **FR-022**: Race identity MUST retain programme date, SMSPariaz race identity, meeting and race numbers, course, known race name, official Mauritius off time, discipline, distance, and betting status.
- **FR-023**: A dedicated market adapter MUST reconcile public SMSPariaz runners and displayed prices with canonical races and MUST reject malformed, unexplained, or unverified price representations.
- **FR-024**: Price normalization MUST be evidence-backed by current public data and recorded fixtures; if the raw representation cannot be safely understood, the market MUST be unavailable.
- **FR-025**: Each price observation MUST preserve its raw value, normalized fantasy decimal price, source, observation time, and payload hash or revision evidence where practical; history MUST not be overwritten.
- **FR-026**: Every accepted bet MUST preserve the selected runner, exact stake, acceptance time, and an explicit unresolved ATR-final-pricing status; settlement MUST preserve the matched ATR raw price and deterministic normalized decimal equivalent.
- **FR-027**: On a normal win, the credited gross return MUST equal stake multiplied by the decimal equivalent of that winner's finalized ATR starting price; on a loss, no payout credit is created.
- **FR-028**: Race and result lifecycle states MUST distinguish upcoming, open, closed, result pending, provisional, confirmed, settled, void, and needs-review conditions.
- **FR-029**: All betting-window decisions MUST use authoritative server time and the existing Mauritius time rules, with a configurable close buffer defaulting to 60 seconds before the official off time.
- **FR-030**: A later off-time revision MUST NOT retroactively invalidate an accepted bet unless the race is voided.
- **FR-031**: Result acquisition MUST use a provider-independent observation contract retaining provider, source identity, retrieval time, race identity evidence, finishing order, winner number and name, the winner's finalized starting-price value and representation when published, status, and raw-response evidence where allowed.
- **FR-032**: The initial result source MUST be At The Races through an ordinarily accessible finalized public result, with suitable coverage, and MUST NOT require bypassing authentication, access restrictions, bot protection, or CAPTCHAs.
- **FR-033**: Automatic result matching MUST require multiple independent identity dimensions and retain normalized evidence and confidence; vague name similarity or a matching finalized price alone MUST never trigger settlement.
- **FR-033a**: An ATR finalized starting price MUST be retained as result and payout evidence and MUST be the sole price used to calculate a winning bet's gross return; missing or malformed winner prices MUST withhold settlement for review.
- **FR-034**: Ambiguous or conflicting result matches MUST become `NEEDS_REVIEW` without automatic payout, refund, or loss assignment.
- **FR-035**: Scheduled result checks MUST be idempotent, target only unsettled post-off races, retry with bounded progressive backoff, remain within free-tier limits, and stop automatic polling after a configurable period.
- **FR-036**: Settlement MUST transactionally lock the race, reject duplicate settlement, persist the confirmed result, mark all accepted WIN bets, create each eligible payout once, and mark the race settled.
- **FR-037**: A confirmed non-runner MUST void and refund that runner's affected bets exactly once; temporary source absence alone MUST NOT establish non-runner status.
- **FR-038**: A confirmed abandoned, void, or no-contest race MUST void and refund all accepted stakes exactly once.
- **FR-039**: Dead-heat settlement MUST support multiple winners and use gross return = stake × that winner's ATR finalized decimal price ÷ joint-winner count, with raw price, normalized price, divisor, and calculation retained in settlement metadata.
- **FR-040**: Result corrections MUST retain prior wallet history and use explicit, idempotent reversal and correction records rather than editing earlier ledger entries.
- **FR-041**: Manual result confirmation, race voiding, result-check retry, and settlement correction MUST require administrator authorization and an explicit reason recorded with audit evidence.
- **FR-042**: Every application data set exposed to clients MUST enforce authorization at the data boundary; interface visibility alone MUST NOT grant or deny authority.
- **FR-043**: Anonymous access MUST not expose private betting or wallet data; privileged credentials, provider tokens, emails, and administrator-only notes MUST never appear in public output or browser code.
- **FR-044**: The leaderboard MUST expose only rank, chosen public player identity, balance, net result, wins, and bet count, and MUST compute aggregates at a trusted data boundary rather than from full client-side ledger history.
- **FR-045**: Consequential operations MUST retain enough immutable metadata to reconstruct configuration changes, balance adjustments, bet acceptance, quote evidence, result observations, confirmations, settlements, refunds, and corrections.
- **FR-046**: Timestamps MUST be stored consistently and rendered using Mauritius rules where the user experience requires local race time.
- **FR-047**: The feature MUST fail closed when source data is missing or stale, price representation is unrecognized, result evidence is ambiguous, a transaction fails, authoritative time is unavailable, or the market is closed.
- **FR-048**: Database and authorization state MUST be reproducible from source-controlled migrations, while dashboard-only authentication and scheduling setup MUST be explicitly documented without secrets.
- **FR-049**: Secret values MUST come from deployment configuration, MUST not be committed, and MUST be represented only by safe placeholders in example configuration and documentation.
- **FR-050**: The destination MUST integrate with the existing Video Playa navigation and preserve existing Equidia and HORSEE behavior, except for safe reuse of shared read-only racecard code.
- **FR-051**: Primary player and admin flows MUST be keyboard operable, labelled, visibly focusable, reduced-motion aware, and free of page-level horizontal scrolling at 375px, 768px, and 1280px.
- **FR-052**: Automated verification MUST cover reconciliation, parsing, normalization, stale quotes, close boundaries, concurrency, idempotency, authorization, wallet initialization and adjustment, settlement outcomes, refunds, dead heats, ambiguity, manual confirmation, correction, and Mauritius-time boundaries without sending a real wager.
- **FR-053**: Production rollout MUST document a Windows-compatible deployment order, migration dry run and backup gate, hosted Edge deployment path, environment/Vault separation, read-only post-deploy smoke verification, monitoring, and fail-closed rollback without rewriting immutable ledger or audit history.
- **FR-054**: Hosted Edge Function source MUST use explicit `npm:` or `jsr:` package specifiers so production `--use-api` deployment does not depend on a local import map being discovered by the remote bundler.
- **FR-055**: A configured production browser build MUST receive only the public Supabase project URL and publishable key through build-scoped `VITE_SUPABASE_*` variables; server-only keys MUST remain outside browser code, and deployment verification MUST confirm the Google sign-in control is available.
- **FR-056**: The hash router MUST recognize Supabase OAuth success/error callback fragments, mount session restoration before redirecting, and replace the credential-bearing fragment with `#/peakpool`; ordinary unknown routes MUST NOT be treated as authentication callbacks.
- **FR-057**: New OAuth sign-ins MUST use PKCE with explicit pre-render code exchange, MUST remove callback parameters before mounting the hash router, and MUST retain legacy implicit-fragment cleanup only for already-started sessions.
- **FR-058**: A valid canonical SMSPariaz daily racecard MUST be ingested independently of optional public market enrichment; empty, unavailable, or malformed market data MUST NOT suppress canonical races, and invalid market records MUST be skipped without creating races, runners, or prices.
- **FR-059**: The Peakpool page MUST expose programme, player-history, leaderboard, wallet, and authorized administrator destinations from a compact control near the top and render only the active destination's main content.
- **FR-060**: The programme MUST show the complete canonical PDF race count while rendering one meeting at a time; race headers MUST be collapsed initially, keyboard operable, expose expansion state, and mount runner rows only while expanded.
- **FR-061**: Access-challenge responses MUST produce review-only observations with zero match confidence, no extracted winners or non-runners, and a bounded diagnostic instead of executable page content. Requested race metadata MUST NOT count as independently observed identity.
- **FR-062**: Automatic confirmation and voiding MUST require identity extracted from the response itself: date, course, timezone-qualified scheduled time, race number, and the canonical race name when known. Missing, conflicting, duplicate, or unmatched runner evidence MUST withhold all settlement actions. A transport-only smoke response MUST NOT claim settlement readiness.
- **FR-063**: While the page is visible, settled bets, balances, ledger, and leaderboard MUST refresh automatically within 30 seconds under normal connectivity, without clearing the selected meeting, race expansion, or stake input. Hidden pages MUST pause polling; returning to the page MUST refresh promptly. Responses from a previous signed-in identity MUST never restore private data.
- **FR-064**: Before any settlement mutation, every declared winner MUST match a unique finalized ATR observation row with a valid price; provider, race ownership, winner set, and dead-heat count MUST agree even when nobody backed a winner. Invalid evidence MUST leave all pending bets and balances unchanged.
- **FR-065**: Results retrieval MUST have bounded time, response size, and per-invocation work. Existing operator-configured retrieval may be verified, but no new paid provider, subscription, credentials purchase, or alternate odds authority is authorized by this follow-up.

### Result-validation follow-up acceptance (2026-09-05)

- The supplied `Client Challenge` / `/_fs-ch-` response yields review, zero confidence, and no settlement identifiers in both runtime adapters.
- A requested correct race URL with absent or different response identity cannot confirm a result or void a race.
- A complete finalized fixture confirms only when observed identity, every result runner, non-runner, and winner SP agree; contradictory or duplicate runners require review.
- These checks do not authorize a new acquisition provider, challenge bypass, or changes to historical observations.

### Scope Boundaries

The feature includes a fantasy-only application destination, Google identity, protected roles, exact-credit wallets and ledger, canonical public SMSPariaz race and price ingestion, locked WIN quotes, atomic bet placement, conservative public-result matching, automated and manual settlement, administration, leaderboard, auditability, deployment setup, and tests.

The feature excludes real-money or redeemable value, SMSPariaz accounts or authentication, any bet-submission or account endpoint, SMS or OTP, deposits, withdrawals, payments, cash-out, real prizes, crypto, transfers, and every non-WIN market in v1.

### Key Entities

- **Player Profile**: Authenticated competition identity, protected role, chosen public display identity, and initialization state.
- **Game Settings**: Audited current rules for new-wallet credit, betting availability, stake bounds, close buffer, quote age, and result checking.
- **Wallet**: One player's current exact balance derived from and reconciled with its authoritative ledger.
- **Wallet Transaction**: Immutable signed credit or debit with type, causal operation, actor, reason, time, and idempotency identity.
- **Race Event**: Canonical SMSPariaz-offered race identity, official Mauritius timing, lifecycle status, and source evidence.
- **Race Runner**: A source-identified horse within one race, its active status, number, and normalized identity.
- **Odds Snapshot**: An immutable observed raw price, evidence-backed normalized price, source, hash or revision, validity, and time.
- **Fantasy Bet**: One player's accepted WIN selection, exact stake, locked quote evidence, request identity, status, and settlement outcome.
- **Result Observation**: Provider-independent captured result evidence and matching dimensions for a race, including the published finalized starting-price representation for the winner when available.
- **Race Result**: Provisional, confirmed, void, or review-required conclusion supporting one or more winners and non-runners.
- **Settlement Run**: Idempotent audited attempt that relates a result to bet outcomes and wallet transactions.
- **Audit Event**: Immutable record of a consequential administrator or system decision and its evidence.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: In 100% of first-login concurrency tests, a player receives exactly one wallet and opening transaction, while returning logins preserve the existing balance.
- **SC-002**: In 100% of recorded source fixtures, only canonical PDF races and active reconciled runners are selectable; unrecognized pre-race price representations never become payout inputs.
- **SC-003**: A player can review and place a valid fantasy WIN bet in under 30 seconds after choosing a runner, and receives a complete acceptance receipt within 5 seconds under normal service conditions.
- **SC-004**: In 100% of replay and concurrent overspend tests, each request identity creates at most one bet and debit and no wallet becomes negative.
- **SC-005**: In 100% of close-boundary, inactive-runner, unavailable-time, and disabled-game tests, no bet or wallet mutation occurs.
- **SC-006**: In 100% of settlement replay tests, every bet receives at most one payout or refund for a settlement event and the ledger remains reconcilable to the wallet balance.
- **SC-007**: In 100% of ambiguous or conflicting result fixtures, automatic settlement is withheld and the race is visible for administrator review.
- **SC-007a**: In 100% of finalized ATR result fixtures, the matched winner's published starting price is retained, normalized deterministically, and used for payout; missing or malformed winner prices produce no settlement mutation.
- **SC-008**: In 100% of role tests, players cannot invoke privileged mutations or read another player's private records, while authorized administrators can perform audited operations.
- **SC-009**: The leaderboard exposes no email or private transaction detail in automated disclosure tests and returns ranked aggregates without requiring a client to download the full ledger.
- **SC-010**: The primary player and administrator flows complete without page-level horizontal scrolling or keyboard traps at 375px, 768px, and 1280px.
- **SC-011**: A maintainer can configure a fresh environment from source-controlled migrations and documentation without committing a secret or creating undocumented data state.
- **SC-012**: All feature tests, existing repository tests, and the complete repository build pass without making any outbound wager or changing existing HORSEE semantics.
- **SC-013**: A production operator can run one documented read-only command that verifies the HTTPS application shell, anonymous bootstrap privacy/shape, and protected sync boundary without printing credentials or mutating game data.

## Assumptions

- Fantasy credits have no monetary value, cannot be purchased, redeemed, or transferred, and are used only for ranking and entertainment.
- The game operates one programme day at a time according to existing Mauritius date and time rules.
- The product owner accepts the recommended deterministic dead-heat divisor rule stated in the request.
- An administrator chooses the public display identity policy during deployment; email is never a fallback public identifier.
- Public upstream data may be unavailable or structurally change, and temporary market unavailability is preferable to inferred data.
- A suitable free public result source must pass coverage and structure research before automatic settlement is enabled; manual review remains the fail-safe.
- Existing deployment hosting remains in place and the new backend capabilities must fit within a no-paid-dependency/free-tier operating envelope.
