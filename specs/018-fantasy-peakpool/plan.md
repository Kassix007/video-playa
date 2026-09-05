# Implementation Plan: Fantasy SMSPariaz Peakpool

**Branch**: `codex/peakpool-app-bet-plan` | **Date**: 2026-09-04 | **Spec**: [spec.md](spec.md)

**Input**: Feature specification from `specs/018-fantasy-peakpool/spec.md`

## Summary

**2026-09-06 amendment:** PMU supersedes ATR for future automatic results. Implement a separate dependency-free PMU adapter and protected `fantasy-pmu-result-checker` Edge worker; preserve unrelated unfinished ATR/Zone-Turf edits. Only allow public `online.turfinfo.api.pmu.fr/rest/client/1/programme` GETs. Match daily meetings/courses by independently observed metadata and complete participant identities. Require definitive arrival and NATIONAL SIMPLE_GAGNANT reports, `dividendeUnite=PourUnEuro`, consistent cent-denominated base-stake/per-euro values, and exact winner sets. Store provider-specific per-unit payout evidence, never pretend a PMU dividend is ATR SP. Forward SQL must validate all evidence before transaction mutations, preserve past settlements, and gate pending legacy repricing. Deploy in read-only smoke mode before any scheduled activation.

Add `#/peakpool` as a fantasy-only Video Playa destination backed by Supabase Auth and Postgres. The browser uses Google sign-in, a publishable Supabase key, RLS-protected reads, and narrowly granted transactional RPCs. Postgres owns exact balances, immutable ledger entries, roles, locked quotes, idempotent placement, result evidence, and settlement. A protected Netlify read-only synchronizer reuses the canonical Node racecard parser and reconciles it with the public Peakpool runner feed; Supabase Cron/Edge orchestrates bounded result checks.

Research did not establish how SMSPariaz `horse.type` values convert to decimal prices. The implementation therefore keeps those values unavailable and never uses them for payout. A pending fantasy WIN bet records only the active runner, exact stake, and acceptance evidence. After the race, a strongly matched finalized ATR result supplies the winner and fractional starting price; settlement converts that bounded price deterministically to a decimal multiplier and retains both forms as payout evidence. Missing or malformed ATR winner prices withhold settlement for review.

## Technical Context

**Language/Version**: TypeScript 5.8, React 18, Node.js 22, SQL/PLpgSQL, Supabase Edge Functions on Deno.

**Primary Dependencies**: Existing Vite/React/React Router/Zod stack; `@supabase/supabase-js`; existing Netlify Functions; Supabase Auth, Postgres, Data API, Cron, Vault, and Edge Functions.

**Storage**: Supabase Postgres `numeric(18,2)` balances/amounts, immutable ledger and odds history, UUID identities, JSONB source evidence, source-controlled migrations. Existing HORSEE archive storage remains unchanged.

**Testing**: Existing `node:test`/`tsx` suite via `npm run test:mcp`; new pure parser/matching/precision tests; Supabase pgTAP/database tests for RLS and transactional RPCs; TypeScript build via `npm run build`; manual browser checks at 375px, 768px, and 1280px.

**Target Platform**: Existing Netlify-hosted Vite SPA plus Netlify Node functions; Supabase Free project for Auth/database/cron/Edge Functions.

**Project Type**: Existing web application with browser UI, transactional backend, read-only ingestion function, and scheduled result worker.

**Performance Goals**: Authenticated dashboard data and bet receipts return within 5 seconds under normal service conditions; market/result jobs process only bounded current-day batches; programme rendering remains responsive for at least 100 races and 1,000 runners.

**Constraints**: No paid dependency; no SMSPariaz authentication or betting/account endpoint; exact arithmetic only; service/secret keys never in browser bundles; market and result uncertainty fail closed; existing HORSEE contracts unchanged; current worktree contains unrelated uncommitted 017 provider-submission work that must be preserved and not imported.

**Scale/Scope**: One competition, thousands of player profiles, tens of races and hundreds of runners per day, append-only odds/ledger/result evidence with retention controls sized below the current Supabase Free database quota.

## Constitution Check

| Principle | Pre-design result | Design evidence |
|---|---|---|
| Specification traceability | Pass | [spec.md](spec.md) is a distinct 018 outcome and its [requirements checklist](checklists/requirements.md) passes 16/16. |
| Responsive by default | Pass gate | Dedicated responsive page and mandatory 375/768/1280 validation are planned. |
| Accessible interaction | Pass gate | Native controls, explicit confirmation, labelled statuses, focus visibility, keyboard operation, and reduced-motion support are part of the UI contract. |
| Safe media embedding | Not applicable | No iframe or media permission changes. |
| Verified changes | Pass gate | Domain, database, build, secret scan, and browser verification are required before delivery. |

No constitutional exception is required.

## Research Conclusions

1. `server/smspariaz-racecard.ts` remains the canonical race universe and date-staleness boundary. Its Node/PDF dependencies stay in Netlify rather than moving into Edge Functions.
2. Public `/service/peakpool_json.php` returns a root race array with race fields `meeting_number,date,track,number,time,name,horses` and horse fields `no,name,type`. Payload bytes are hashed before parsing.
3. `horse.type` is only proven as an opaque displayed value. Numeric strings and `NP` are stored but no decimal conversion is allowed; all are unavailable for fantasy betting until evidence changes this decision.
4. At The Races covers the sampled SMSPariaz meetings and exposes strong identity, finality, and starting-price evidence, but plain server requests may receive an F5/JavaScript challenge. The adapter must detect that and require review; no challenge execution, browser-cookie reuse, or AJAX bypass is permitted. Automatic confirmation requires the matched winner row to carry a finalized starting price, which is stored for evidence/display and excluded from payout arithmetic.
5. Supabase Data API security requires both grants and RLS. Privileged functions use fixed empty `search_path`, schema-qualified objects, explicit `EXECUTE` grants, server-side time, row locks, and unique constraints.
6. Supabase Cron can invoke an Edge Function through `pg_net`; project URL and key live in Vault. Jobs stay below eight concurrent runs, ten minutes per job, and the Free invocation budget.

See [research.md](research.md) for evidence and alternatives.

## Architecture

### Trusted boundaries

```text
Browser (publishable key + user JWT)
  ├─ RLS reads: own wallet/bets/ledger, markets, safe public profiles
  └─ granted RPCs: place bet and authorized admin operations
                     │
                     ▼
Supabase Postgres (authoritative money-like state)
  ├─ exact wallet + immutable ledger
  ├─ locked odds snapshots + bets
  ├─ RLS/roles/audit
  └─ idempotent settlement functions
                     ▲
                     │ service-only credentials
Netlify read-only sync ── public SMSPariaz racecard + Peakpool JSON only
Supabase Edge result worker ── public ATR HTML only when smoke-approved
```

### Read-only market ingestion

The Netlify synchronizer calls `getSmspariazDailyRacecard()` and a new fantasy market parser that borrows only the observed read-only fixture shape from the existing uncommitted prototype. It reconciles meeting/race/runner identities, calculates official UTC off timestamps using existing Mauritius helpers, and submits one validated snapshot to a service-only database RPC. It has no import or dependency on SMSPariaz sessions, `/checklogin/`, `/placebet/`, prepared-ticket stores, or provider-account code.

### Wallet and bet placement

One SQL RPC is the sole player placement boundary. It resolves `auth.uid()`, checks an existing request identity, locks the wallet and settings/race rows, uses `clock_timestamp()`, rejects inactive runners and races inside the close buffer, validates two-decimal stake limits, inserts the accepted unpriced bet and ledger debit, then updates cached balance. A unique `(user_id, idempotency_key)` and one stake transaction per bet enforce replay safety. Peakpool raw pre-race values are never placement or payout authority.

### Result and settlement

An Edge worker queries only eligible unsettled races in bounded batches. The provider contract returns observations, never a direct settlement command. ATR parsing requires `Weighed In`, exact date, course alias, DST-aware scheduled time, race number/name or distance, runner-field agreement, and a bounded finalized starting-price token on every winner row. Challenges, partial evidence, missing winner prices, conflicts, or unavailable HTML produce `NEEDS_REVIEW`. Confirmed results invoke one transactional settlement RPC; the database matches each winning selection to its ATR finishing row, parses fractional/evens SP with exact numeric arithmetic, and records the raw price, multiplier, dead-heat divisor, and gross credit. Payout/refund/reversal uniqueness constraints remain unchanged.

### Administration

Admin membership lives in protected `profiles.role`. Admin reads use policies; mutations use explicit RPCs that call a non-exposed `private.is_admin()` helper. The first administrator is bootstrapped by a one-time SQL update after their first Google login, using their auth UUID, and that step is documented. Players cannot write roles, settings, wallets, market data, results, or audits.

## Project Structure

### Documentation (this feature)

```text
specs/018-fantasy-peakpool/
├── spec.md
├── plan.md
├── research.md
├── data-model.md
├── quickstart.md
├── contracts/
│   ├── database-rpcs.md
│   └── ingestion-and-results.md
├── checklists/requirements.md
└── tasks.md
```

### Source Code (repository root)

```text
src/
├── config/routes.ts
├── lib/supabase.ts
├── pages/
│   ├── Peakpool.tsx
│   └── Peakpool.css
├── features/fantasy-peakpool/
│   ├── components/
│   ├── auth.tsx
│   ├── domain.ts
│   └── types.ts
└── services/fantasy-peakpool.ts

server/
├── smspariaz-racecard.ts                 # reused unchanged
├── mauritius-time.ts                     # reused unchanged
├── fantasy-peakpool-market.ts
├── fantasy-peakpool-reconciliation.ts
├── fantasy-peakpool-results.ts
├── fantasy-peakpool-domain.ts
└── fantasy-peakpool-*.test.ts

netlify/functions/
└── fantasy-peakpool-sync.ts

supabase/
├── config.toml
├── migrations/
│   ├── 202609040001_fantasy_peakpool_schema.sql
│   ├── 202609040002_fantasy_peakpool_security.sql
│   ├── 202609040003_fantasy_peakpool_rpcs.sql
│   └── 202609040004_fantasy_peakpool_cron.sql
├── functions/
│   ├── _shared/results.ts
│   └── fantasy-result-checker/index.ts
└── tests/
    └── fantasy_peakpool.sql

docs/fantasy-peakpool.md
.env.example
```

**Structure Decision**: Keep browser concerns in the existing React application, all authoritative credit mutations in Postgres, Node-only racecard parsing in a thin Netlify ingestion boundary, and portable result parsing/orchestration in Supabase Edge. Use `fantasy-peakpool-*` names to avoid importing or extending the unrelated 017 account-submission modules.

## Implementation Sequence

1. Add pure market parsing, normalization classification, reconciliation, result parsing/matching, and arithmetic tests.
2. Add source-controlled schema, RLS/grants, initialization trigger, transactional bet/settlement/admin RPCs, leaderboard view/RPC, and pgTAP tests.
3. Add protected Netlify ingestion and disabled-by-default Supabase result worker/cron.
4. Add Supabase browser client, session handling, `#/peakpool`, player UI, leaderboard, betslip, histories, and protected admin panels.
5. Document Google OAuth, redirects, secrets, migrations, first-admin bootstrap, schedules, evidence gates, and free-tier caveats.
6. Run database/domain tests, existing repository tests, `npm run build`, secret scans, and responsive/accessibility browser verification. Update the specification with delivery evidence.
7. Extend ATR result evidence with finalized winner starting prices, expose that evidence to administrators, and use the matched finalized price as the winning settlement multiplier.
8. Add a Windows-aware production rollout and a read-only deployed-boundary verifier covering the application shell, anonymous bootstrap privacy, and protected sync authorization before any activation flag changes.

## Post-design Constitution Check

Pass. The artifacts retain a distinct owning specification, make responsive/accessibility validation explicit, add no media privileges, and define complete verification gates. The design's forced unavailable states are required by the fail-closed product brief and do not weaken the acceptance criteria.

## Complexity Tracking

### Automatic updates and settlement completion

Use visibility-aware 30-second browser refresh with in-flight coalescing, stale-session response guards, and retained programme/betslip state. Add a forward-only pre-settlement evidence guard before the existing transactional settlement function. Verify real ATR retrieval and fixtures before deployment; a challenge remains a blocker for acquisition, not grounds to weaken matching. Preserve and inspect existing proxy configuration without purchasing or introducing another service. Bounded transport and redacted worker diagnostics protect runtime limits and credentials.

### Result-validation follow-up (2026-09-05)

Share pure challenge detection and response-only identity extraction between Node and Edge. Preserve requested metadata as storage context for the existing non-null observation schema, but expose separate observed identity and use only that evidence in matching. Require a unique SportsEvent with a timezone-qualified startDate/location and an unambiguous race heading; unsupported layouts remain review-only. Validate the entire mapped runner field and reject duplicates/contradictions. Smoke output reports transport evidence only, never settlement readiness. Add executable parity regressions using the supplied challenge shape; no proxy or database mutation is part of this fix.

No constitutional violations require justification. The four runtime boundaries are required by existing Node-only PDF parsing, browser OAuth, transactional Postgres state, and bounded scheduled public-result retrieval; none duplicates an existing HORSEE storage system.
