# Tasks: Fantasy SMSPariaz Peakpool

**Input**: Design documents from `specs/018-fantasy-peakpool/`

**Prerequisites**: plan.md, spec.md, research.md, data-model.md, contracts/, quickstart.md

**Tests**: The request explicitly requires comprehensive domain, database security, concurrency, settlement, and UI verification. Test tasks precede their implementations.

**Organization**: Tasks are grouped by user story and ordered so the fantasy-only safety boundary, exact-value database, and fail-closed evidence gates land before the UI can mutate state.

## Format: `[ID] [P?] [Story] Description`

- **[P]**: Can run in parallel in different files after its stated phase dependencies
- **[Story]**: Maps directly to the numbered user story in spec.md

## Phase 1: Setup (Shared Infrastructure)

**Purpose**: Add project scaffolding without touching unrelated 017 provider-submission modules.

- [X] T001 Add `@supabase/supabase-js` and Supabase validation scripts in `package.json` and `package-lock.json`
- [X] T002 [P] Add safe browser/server placeholders and result/sync feature flags in `.env.example`
- [X] T003 [P] Add local Supabase project configuration and function import settings in `supabase/config.toml` and `supabase/functions/deno.json`
- [X] T004 [P] Add shared fantasy UI/domain directories and exported types in `src/features/fantasy-peakpool/types.ts`

---

## Phase 2: Foundational (Blocking Prerequisites)

**Purpose**: Create the read-only domain boundary and protected database foundation required by every story.

**⚠️ CRITICAL**: No browser mutation or scheduled settlement task may proceed until this phase passes.

- [X] T005 [P] Write raw Peakpool fixture, hashing, normalization-unavailable, malformed input, and bounded-fetch tests in `server/fantasy-peakpool-market.test.ts`
- [X] T006 [P] Write canonical race/runner reconciliation, market-only exclusion, missing-price, and Mauritius off-time tests in `server/fantasy-peakpool-reconciliation.test.ts`
- [X] T007 [P] Write exact credit arithmetic, close-buffer, quote-staleness, dead-heat, and lifecycle tests in `server/fantasy-peakpool-domain.test.ts`
- [X] T008 Implement the strict public JSON parser, byte hash, and fail-closed raw-price classifier in `server/fantasy-peakpool-market.ts`
- [X] T009 Implement canonical race/market reconciliation without changing HORSEE schemas in `server/fantasy-peakpool-reconciliation.ts`
- [X] T010 Implement exact string/minor-unit display helpers and result/bet lifecycle guards in `server/fantasy-peakpool-domain.ts`
- [X] T011 Add enums, profiles, settings, wallets, immutable ledger, races, runners, odds, bets, results, settlement, payload, and audit tables in `supabase/migrations/202609040001_fantasy_peakpool_schema.sql`
- [X] T012 Add grants, RLS policies, private role helpers, immutable-table guards, and safe leaderboard exposure in `supabase/migrations/202609040002_fantasy_peakpool_security.sql`
- [X] T013 Add new-user initialization, exact bet placement, ingestion, result claim/record, settlement, correction, and admin RPCs in `supabase/migrations/202609040003_fantasy_peakpool_rpcs.sql`
- [X] T014 Write pgTAP coverage for initialization, RLS, function grants, atomic placement, replay, overspend, settlement, refund, dead heat, review, and correction in `supabase/tests/fantasy_peakpool.sql` *(expanded to 106 assertions; live execution passed under T058)*
- [X] T015 Add static migration safety tests for RLS, pinned definer search paths, explicit grants, idempotency constraints, and prohibited browser service keys in `server/fantasy-peakpool-migration.test.ts`

**Checkpoint**: Domain fixtures pass; database can be recreated from migrations; player/admin authority and transactional invariants are testable.

---

## Phase 3: User Story 1 - Join the fantasy competition (Priority: P1) 🎯 MVP

**Goal**: Google-only Supabase sign-in initializes one protected player wallet and restores the same session safely.

**Independent Test**: First login produces one player/profile/wallet/opening entry; concurrent/repeated login produces no duplicate; sign-out removes private UI.

- [X] T016 [P] [US1] Add browser client configuration tests for missing variables, publishable-key-only exposure, and redirect-root behavior in `server/fantasy-peakpool-client-config.test.ts`
- [X] T017 [P] [US1] Implement optional publishable Supabase browser client creation in `src/lib/supabase.ts`
- [X] T018 [US1] Implement session restoration, Google sign-in, sign-out, and user-safe auth states in `src/features/fantasy-peakpool/auth.tsx`
- [X] T019 [US1] Implement the signed-out/setup-unavailable/player header states in `src/features/fantasy-peakpool/components/PeakpoolAccount.tsx`
- [X] T020 [US1] Wire the authentication provider and bootstrap read into `src/pages/Peakpool.tsx`

**Checkpoint**: Authentication and one-time wallet initialization work without any market or bet functionality.

---

## Phase 4: User Story 2 - Browse today's trustworthy markets (Priority: P1)

**Goal**: Show only canonical SMSPariaz races, reconcile public runners, preserve raw values, and explain why unverified quotes are unavailable.

**Independent Test**: Recorded daily racecard plus Peakpool fixture produces grouped canonical races; extra market races disappear; every currently unverified raw value is visible but disabled.

- [X] T021 [P] [US2] Write protected Netlify sync contract tests for auth, allowlisted GETs, payload hashing, canonical reconciliation, and zero valid current prices in `server/fantasy-peakpool-sync.test.ts`
- [X] T022 [US2] Implement the server-only synchronizer over canonical racecard and public Peakpool GET in `server/fantasy-peakpool-sync.ts`
- [X] T023 [US2] Add the thin protected Netlify handler in `netlify/functions/fantasy-peakpool-sync.ts`
- [X] T024 [US2] Configure racecard native/PDF bundling and the sync redirect in `netlify.toml`
- [X] T025 [P] [US2] Implement typed Supabase bootstrap/programme reads in `src/services/fantasy-peakpool.ts`
- [X] T026 [P] [US2] Implement meeting/race/runner status components in `src/features/fantasy-peakpool/components/PeakpoolProgramme.tsx`
- [X] T027 [US2] Integrate today's grouped programme, Mauritius time, countdown, loading/empty/error states, and unavailable-price messaging in `src/pages/Peakpool.tsx`

**Checkpoint**: The destination provides useful read-only programme inspection while no unverified quote can be selected.

---

## Phase 5: User Story 3 - Place an atomic fantasy WIN bet (Priority: P1)

**Goal**: Review and explicitly place one locked-price WIN bet through the transactional RPC, with replay and overspend protection.

**Independent Test**: Valid normalized fixture accepts once; stale/changed/unavailable/closed/disabled/insufficient cases make no mutation; concurrent requests never overspend.

- [X] T028 [P] [US3] Extend database tests with valid synthetic normalized snapshots, quote changes, close boundaries, competing-tab wallet serialization, overspend, and idempotency conflicts in `supabase/tests/fantasy_peakpool.sql`
- [X] T029 [P] [US3] Add frontend bet request/receipt mapping and decimal-string validation tests in `server/fantasy-peakpool-bet-contract.test.ts`
- [X] T030 [US3] Implement selection, stake entry, quote review, potential-return display, explicit confirmation, requote, and accessible status states in `src/features/fantasy-peakpool/components/PeakpoolBetslip.tsx`
- [X] T031 [US3] Implement the `place_fantasy_bet` RPC client using UUID request identities and string amounts in `src/services/fantasy-peakpool.ts`
- [X] T032 [US3] Integrate the betslip and refresh accepted receipt/balance/history state in `src/pages/Peakpool.tsx`

**Checkpoint**: The full placement path is implemented and provable with synthetic evidence; current live raw values remain correctly non-bettable.

---

## Phase 6: User Story 5 - Confirm results and settle safely (Priority: P1)

**Goal**: Capture provider-independent evidence, require strong matches, and settle wins/losses/refunds/dead heats/corrections exactly once.

**Independent Test**: Sanitized fixtures prove confirmed, ambiguous, challenge, non-runner, void, dead-heat, duplicate, and corrected results produce the exact expected state and ledger.

- [X] T033 [P] [US5] Add sanitized ATR confirmed, partial, challenge, non-runner, dead-heat, void, correction, alias, and DST fixtures in `server/test-fixtures/fantasy-peakpool/results.ts`
- [X] T034 [P] [US5] Write provider parser and multi-dimension match tests in `server/fantasy-peakpool-results.test.ts`
- [X] T035 [US5] Implement provider-independent observations, ATR challenge detection/parsing, aliases, DST-aware matching, and review decisions in `server/fantasy-peakpool-results.ts`
- [X] T036 [P] [US5] Port the dependency-free result observation/matching contract to `supabase/functions/_shared/results.ts`
- [X] T037 [US5] Implement the disabled-by-default bounded result worker in `supabase/functions/fantasy-result-checker/index.ts`
- [X] T038 [US5] Extend pgTAP assertions for winner payout, loss, non-runner refund, race void, dead heat, duplicate settlement, ambiguity, manual confirmation, and reversal in `supabase/tests/fantasy_peakpool.sql`

**Checkpoint**: Result evidence cannot mutate a wallet unless every confirmation rule passes, and repeated settlement cannot duplicate value.

---

## Phase 7: User Story 4 - Track bets and competition standing (Priority: P2)

**Goal**: Let each player see only their own bet/ledger history while everyone sees safe aggregate rankings.

**Independent Test**: Two players see only their own private records and the same email-free leaderboard aggregates.

- [X] T039 [P] [US4] Extend RLS/leaderboard tests for cross-player denial, anonymous public output, email exclusion, and aggregate correctness in `supabase/tests/fantasy_peakpool.sql`
- [X] T040 [P] [US4] Implement pending/won/lost/void filters and receipt details in `src/features/fantasy-peakpool/components/PeakpoolMyBets.tsx`
- [X] T041 [P] [US4] Implement immutable wallet transaction history in `src/features/fantasy-peakpool/components/PeakpoolLedger.tsx`
- [X] T042 [P] [US4] Implement safe ranked aggregate display in `src/features/fantasy-peakpool/components/PeakpoolLeaderboard.tsx`
- [X] T043 [US4] Integrate histories and leaderboard with bounded Supabase reads in `src/pages/Peakpool.tsx` and `src/services/fantasy-peakpool.ts`

**Checkpoint**: Private data remains owner-only and the public ranking contains only intentional fields.

---

## Phase 8: User Story 6 - Administer the game with an audit trail (Priority: P2)

**Goal**: Provide protected settings, player adjustment, race/result, bet, and audit controls that never rewrite history.

**Independent Test**: Admin actions succeed only with required reasons and audits; identical calls as a player fail at the database boundary.

- [X] T044 [P] [US6] Extend database authorization tests for every admin RPC, required reasons, audit rows, idempotent adjustment, and protected role fields in `supabase/tests/fantasy_peakpool.sql`
- [X] T045 [P] [US6] Implement game settings and player adjustment panels in `src/features/fantasy-peakpool/components/PeakpoolAdminSettings.tsx`
- [X] T046 [P] [US6] Implement searchable bet/player/race audit tables in `src/features/fantasy-peakpool/components/PeakpoolAdminAudit.tsx`
- [X] T047 [P] [US6] Implement retry, manual confirm, void, and correction dialogs with focus/Escape/background-scroll behavior in `src/features/fantasy-peakpool/components/PeakpoolAdminResults.tsx`
- [X] T048 [US6] Add authorized admin RPC clients and safe error mapping in `src/services/fantasy-peakpool.ts`
- [X] T049 [US6] Render the admin area only for admin profiles while retaining database enforcement in `src/pages/Peakpool.tsx`

**Checkpoint**: All consequential administrator actions are reasoned, attributed, immutable, and denied to players independently of UI visibility.

---

## Phase 9: User Story 7 - Operate within free-tier and safety limits (Priority: P2)

**Goal**: Reproduce the deployment from source, run bounded jobs, document evidence gates, and fail closed without secrets or paid dependencies.

**Independent Test**: A fresh local database applies migrations, scheduled jobs claim bounded current races, missing sources/config fail closed, and documentation contains only placeholders.

- [X] T050 [P] [US7] Add bounded Vault/pg_cron/pg_net job definitions disabled until configured in `supabase/migrations/202609040004_fantasy_peakpool_cron.sql`
- [X] T051 [P] [US7] Document project creation, migrations, Google OAuth/redirects, RLS, first-admin bootstrap, secrets, sync, cron, provider gate, and free limits in `docs/fantasy-peakpool.md`
- [X] T052 [P] [US7] Add Fantasy Peakpool setup and safety links in `README.md`
- [X] T053 [US7] Add a non-destructive ATR deployment smoke mode and challenge classification in `supabase/functions/fantasy-result-checker/index.ts`
- [X] T054 [US7] Add maintenance SQL for pruning only unreferenced source bodies and old unusable snapshots in `supabase/migrations/202609040004_fantasy_peakpool_cron.sql`

**Checkpoint**: Operations fit the free tier and every enablement step is explicit, reproducible, and reversible.

---

## Phase 10: Integration, Accessibility, and Delivery Evidence

**Purpose**: Integrate the route and navigation, verify the entire repository, and update owning artifacts without disturbing unrelated changes.

- [X] T055 Add the `#/peakpool` destination and navigation metadata in `src/config/routes.ts`
- [X] T056 Implement responsive, focus-visible, reduced-motion, no-horizontal-scroll fantasy styles in `src/pages/Peakpool.css`
- [X] T057 [P] Add safe Supabase environment typing in `src/vite-env.d.ts`
- [X] T058 Run `npx supabase db reset`, `npx supabase test db`, `npm run test:mcp`, `npm run build`, and `git diff --check`; record results in `specs/018-fantasy-peakpool/spec.md` *(Docker Desktop Linux containers ran locally on Windows; database reset/migrations passed, pgTAP passed 106/106, focused tests passed 30/30, repository tests passed 231/231, and build/diff passed)*
- [ ] T059 Verify signed-out, player, betslip, histories, leaderboard, and admin flows at 375px, 768px, and 1280px with keyboard and reduced motion; record evidence in `specs/018-fantasy-peakpool/quickstart.md` *(partial: signed-out responsive shell, keyboard navigation, Escape, console, overflow, reduced-motion, and locally seeded public programme checks pass; authenticated player/admin flows require the real Google OAuth configuration and test accounts)*
- [X] T060 Scan repository-owned feature files and built output for secrets, provider-account imports, `/checklogin/`, and `/placebet/`; document findings in `specs/018-fantasy-peakpool/spec.md`
- [X] T061 Reconcile every delivered requirement and task state in `specs/018-fantasy-peakpool/spec.md`, `specs/018-fantasy-peakpool/checklists/requirements.md`, and `specs/018-fantasy-peakpool/tasks.md`
- [X] T062 Add a Windows-compatible production rollout, rollback/activation gates, and a tested read-only deployed-boundary verifier in `docs/fantasy-peakpool.md`, `scripts/verify-fantasy-peakpool-production.ts`, and `server/fantasy-peakpool-production.test.ts`

---

## Phase 11: User Story 5 Follow-up - ATR finalized winner evidence (Priority: P1)

**Goal**: Confirm winners from finalized At The Races results, retain each winner's published starting price as evidence, and never use it to reprice an accepted fantasy bet.

**Independent Test**: Finalized single-winner and dead-heat fixtures retain bounded winner prices and confirm; missing/malformed winner-price fixtures require review; settlement metadata and payout calculations still reference only the accepted locked price.

- [X] T062 [P] [US5] Add finalized single-winner, dead-heat, missing-price, and malformed-price fixture assertions in `server/test-fixtures/fantasy-peakpool/results.ts` and `server/fantasy-peakpool-results.test.ts`
- [X] T063 [US5] Parse bounded ATR finalized starting prices on finishing rows and require them for automatic winner confirmation in `server/fantasy-peakpool-results.ts`
- [X] T064 [US5] Port finalized winner-price evidence and fail-closed confirmation rules to `supabase/functions/_shared/results.ts`

**Checkpoint**: ATR confirms a winner only when finality, identity, and finalized winner-price evidence agree; payout authority remains the locked bet.

---

## Phase 12: User Story 6 Follow-up - Inspect finalized winner evidence (Priority: P2)

**Goal**: Let administrators inspect the stored ATR winner and finalized starting price without exposing it as a mutable quote or settlement multiplier.

**Independent Test**: The protected admin payload and evidence table show the observation's winner price, while player/public payloads do not gain private result evidence.

- [X] T065 [US6] Add bounded result observations to the protected admin bootstrap and render finalized winner-price evidence in `supabase/migrations/202609040003_fantasy_peakpool_rpcs.sql`, `src/pages/Peakpool.tsx`, and `src/features/fantasy-peakpool/components/PeakpoolAdminAudit.tsx`

---

## Phase 13: ATR follow-up verification

- [X] T066 Run focused tests and `npm run build`, then record ATR winner-price evidence and locked-payout results in `specs/018-fantasy-peakpool/quickstart.md` and `specs/018-fantasy-peakpool/implementation-status.md`

---

## Phase 14: Hosted Edge deployment compatibility

- [X] T067 Add a source-level regression test proving the result worker uses an explicit Deno package specifier in `server/fantasy-peakpool-production.test.ts`
- [X] T068 Make the result worker independent of local import-map discovery and document the hosted bundler constraint in `supabase/functions/fantasy-result-checker/index.ts` and `docs/fantasy-peakpool.md`
- [X] T069 Run focused tests and `npm run build`, deploy the worker with `--use-api`, and verify its unauthorized and configured authenticated responses

---

## Phase 15: Production Google sign-in configuration

- [X] T070 Configure the production Netlify build with the public Supabase project URL and publishable key, without exposing a server secret
- [X] T071 Rebuild and deploy the production browser bundle, then verify `#/peakpool` presents Google sign-in and initiates the hosted OAuth flow

---

## Phase 16: Hash-router OAuth callback recovery

- [X] T072 Add callback-fragment classification tests covering success, provider error, and ordinary application hashes in `server/fantasy-peakpool-client-config.test.ts`
- [X] T073 Mount Peakpool session restoration for recognized OAuth callback fragments, clean the fragment after restoration, build, deploy, and verify the production callback route

---

## Phase 17: PKCE callback hardening

- [X] T074 Add pre-render PKCE callback exchange tests for marked, unmarked, successful, and failed authorization-code callbacks
- [X] T075 Switch new browser OAuth sessions to PKCE, exchange and clean callbacks before the hash router renders, retain legacy cleanup, deploy, and verify no credential-bearing route reaches the console

---

## Phase 18: Production market-sync credential

- [X] T076 Set the hosted Supabase secret API key as a write-only Netlify production Functions variable, verify it is non-empty without printing it, and retain browser/server scope separation

---

## Phase 19: Production market-sync schedule activation

- [X] T077 Rotate the previously exposed market-sync bearer token, store the replacement as write-only Netlify and Supabase Vault secrets, configure the production sync URL, and verify the existing ten-minute cron can resolve both names without printing credentials

---

## Phase 20: PDF-first production programme recovery

- [X] T078 Add synchronization regression tests proving a valid SMSPariaz daily racecard is ingested when optional market data is empty, unavailable, or contains an invalid race
- [X] T079 Make market enrichment tolerant at the race boundary while preserving the strict evidence parser and keeping every affected runner and price unavailable
- [X] T080 Build, deploy, trigger the production scheduler without exposing credentials, and verify the anonymous bootstrap contains today's canonical races

---

## Phase 21: Compact programme workspace

- [x] T081 Add server-rendered UI regression coverage for one-meeting-at-a-time programme rendering, initially collapsed race headers, and deferred runner markup
- [x] T082 Add the top workspace navigation, PDF race totals, meeting selector, accessible race disclosure controls, and focused visual polish
- [x] T083 Verify the affected signed-out flow at 375px, 768px, and 1280px with no page-level overflow and confirm every PDF meeting remains reachable
- [x] T084 Build, deploy to Netlify production without committing secrets, and verify the live compact programme against the canonical race count

---

## Phase 22: ATR-final payout activation

- [ ] T085 [P] Amend placement, settlement, receipt, and ATR-price contract tests for unpriced pending bets and finalized-SP payouts
- [ ] T086 Add a forward-only migration that permits unpriced placement, preserves legacy quote fields, converts bounded ATR fractional/evens prices exactly at settlement, and enables fantasy betting
- [ ] T087 Update the browser contract and betslip to select active runners without pre-race odds and explain ATR-final pricing before confirmation
- [ ] T088 Reconcile the data model, database/API contracts, research decision, and operator documentation with ATR-final payout authority
- [ ] T089 Run focused, database, repository, build, diff, and secret checks; verify the affected responsive flow
- [ ] T090 Apply the production migration, deploy the browser and result worker, verify result automation configuration, and smoke-test live bet availability without exposing secrets

---

## Dependencies & Execution Order

### Free PMU replacement

- [x] T100 Verify PMU programme, participant, final-arrival and definitive NATIONAL SIMPLE_GAGNANT shapes/units; capture minimal factual fixtures.
- [x] T101 Implement/test strict PMU matching, finality, dividend normalization, pool isolation and dead-heat handling.
- [x] T102 Add bounded protected PMU worker with non-mutating smoke mode, without reusing the unfinished ATR/Zone-Turf worker.
- [x] T103 Add/test transactional PMU settlement and explicit pricing-basis migration, preserving settled history and guarding pending legacy bets.
- [x] T104 Complete UI pricing labels/automatic refresh and verification, then deploy and commit tested changes only. PMU receipt/history tests, production asset checks and signed-out 375/768/1280 checks passed; full authenticated QA is separately tracked by T059.
- [x] T105 Apply the owner-approved pending-only PMU conversion with audit, legacy-path guard, scheduled activation and production verification; preserve settled history. Four converted; three settled, one strict title mismatch remains review-only. Netlify `6a9cd9448bf68dcc68113f3b`, worker enabled, ledger reconciled. T059 remains independent.

### Automatic results completion

- [ ] T095 Verify configured retrieval using bounded actual ATR pages; add real-layout parser fixtures only from successful retrieval.
- [x] T096 Add tested visibility-aware automatic browser refresh with stale-session guards and retained UI state.
- [ ] T097 Add and test a forward-only all-winner settlement evidence guard before any wallet/bet changes.
- [ ] T098 Bound worker retrieval and redact transport errors; verify source access without manufacturing results.
- [ ] T099 Run repository/build/database and responsive checks, reconcile artifacts, and deploy/commit verified work; report any source-access blocker explicitly.

### Result-validation follow-up (independent of payout activation)

- [X] T091 Add failing Node/Edge regressions for the supplied challenge, absent/wrong identity, invalid time, duplicate/unmatched runner fields, and void matching. *(Four regression groups failed before implementation.)*
- [X] T092 Share response-only identity/challenge checks; prevent context metadata from contributing confidence and withhold settlement identifiers on review.
- [X] T093 Make smoke diagnostics explicitly transport-only and reconcile the result contract.
- [X] T094 Run focused/repository tests, build, diff and secret checks; commit the completed result-validation slice without unfinished payout/UI changes. *(244/244 repository tests, production build, staged diff and credential-pattern checks passed. Existing proxy wrapper remains uncommitted; no deployment.)*

### Phase Dependencies

- **Setup** has no dependency.
- **Foundational** depends on Setup and blocks all user stories.
- **US1** and **US2** can proceed after Foundational.
- **US3** depends on Foundational plus the US1 session and US2 market contracts.
- **US5** depends on Foundational; its UI-facing admin resolution integrates later with US6.
- **US4** depends on the foundational read policies and can proceed alongside US3/US5.
- **US6** depends on foundational admin RPCs and US5 result contracts.
- **US7** depends on ingestion/result workers and database RPCs.
- **Integration** depends on all desired stories.
- **ATR finalized winner evidence** depends on the existing US5 parser/result contract; its admin display depends on US6 protected reads.

### User Story Graph

```text
Foundation ─┬─> US1 ─┐
            ├─> US2 ─┼─> US3
            ├─> US5 ─┴─> US6 ─> US7
            └─> US4
All selected stories ─> Integration/verification
```

### Parallel Opportunities

- T002–T004 can run in parallel.
- T005–T007 test different pure domains in parallel; T011–T012 can be reviewed independently before T013 joins them.
- US1 UI and US2 ingestion can proceed in parallel after the foundation.
- T033/T034 and US4's three display components are separate-file parallel work.
- US6's settings, audit, and result-control components are independent until page integration.
- Documentation tasks T051/T052 can run alongside cron maintenance work.

## Parallel Examples

### User Story 2

```text
Task T021: sync contract tests in server/fantasy-peakpool-sync.test.ts
Task T025: browser programme service in src/services/fantasy-peakpool.ts
Task T026: programme components in src/features/fantasy-peakpool/components/PeakpoolProgramme.tsx
```

### User Story 5

```text
Task T033: sanitized result fixtures
Task T034: provider/matcher tests
Task T036: Edge-portable observation contract after the shared shape is fixed
```

### User Story 6

```text
Task T045: settings/adjustment panel
Task T046: audit tables
Task T047: accessible result dialogs
```

## Implementation Strategy

### MVP First

1. Complete Setup and Foundational phases.
2. Complete US1 for one-time Google-authenticated player initialization.
3. Complete US2 for safe read-only canonical programme display.
4. Validate the deployed foundation while every unverified quote remains unavailable.

### Incremental Delivery

1. Add transactional placement with synthetic normalized fixtures, preserving the live evidence gate.
2. Add provider-independent results and idempotent settlement.
3. Add histories/leaderboard and protected administration.
4. Add cron/operations, then integrate and verify all widths and authorization boundaries.

## Notes

- No task authorizes a real SMSPariaz account, SMS, OTP, or betting/account endpoint.
- `server/peakpool-app-bet.ts`, `server/peakpool-flow-profile.ts`, and their provider-session dependencies belong to 017 and are out of bounds for 018.
- Tests must fail before their implementation task and must never call a production wager endpoint.
- A future price normalizer requires new evidence and a specification amendment; it is not a deployment toggle.
- Preserve unrelated dirty-worktree changes and report any pre-existing failing test separately.
