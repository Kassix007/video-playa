# Fantasy Peakpool deployment

## PMU release (2026-09-06)

Current pricing uses the free public PMU NATIONAL Simple Gagnant definitive dividend per euro, not ATR SP or pre-race odds. The owner approved converting pending bets; settled history remains unchanged. Migrations `202609060001` and `202609060002` add validated settlement, audit pending-only conversion, guard the legacy path and retarget the existing five-minute job. The activation migration needs its explicit transaction for the current Windows CLI.

Deploy `fantasy-pmu-result-checker --use-api` and the Netlify build. Keep `FANTASY_ATR_RESULTS_ENABLED=false`; enable only `FANTASY_PMU_RESULTS_ENABLED=true`. Both flags are server configuration, not browser variables. Authenticated read-only `?status=true` checks pending conversions, wallet/ledger totals, and cron readiness without revealing secrets. `?smoke=true&date=YYYY-MM-DD` checks at most three full PMU results without settlement. Never print or commit the cron bearer.

Gross return includes stake: stake 10 at dividend 5 returns 50, not 60. Published dead-heat dividends are not divided again; verified non-runners get their stake refunded. Missing PMU coverage or exact matches stays pending/review. The PDF still determines race visibility. Players' balances, bets and leaderboard refresh automatically every 30 seconds while the tab is visible. Admin retry requests another bounded check; winner-only confirmation cannot price a PMU selection.

Rollback activation by setting `FANTASY_PMU_RESULTS_ENABLED=false`. Do not undo completed ledger entries or restore ATR pricing over converted bets. The older setup notes below retain historical context; this section supersedes their result/pricing instructions.

Completion migration `202609060004` and the PMU worker are deployed. The worker prioritizes results, then may backfill up to six completely empty future race fields from strictly matched PMU participants. It never replaces existing runners or imports pre-race odds. Participant URL/hash and non-runner status are retained. A result title may differ only when the unique date/course/race/time candidate also agrees with every stored runner number/name; SQL independently enforces the full-field check.

Latest verification: all 31 current races have fields from the existing sync, four PMU bets are settled, and one current-day bet is pending. Wallet and ledger totals reconcile. Signed-in player selection, stake validation, histories and leaderboard work; no test wager was submitted. Admin-session QA remains outstanding. Today's York meeting is absent from PMU, so free PMU results are not universal coverage. Empty-field backfill passes local transactional tests but had no live empty field to mutate on this run.

Fantasy Peakpool is a fantasy-credit game. It never logs in to SMSPariaz, sends an SMS, reads an SMSPariaz account, or calls a betting/account endpoint. Its only SMSPariaz inputs are the public daily racecard and public `service/peakpool_json.php` response.

## 1. Create the Supabase project

Create a Supabase Free project and use the repository migrations as the only database source of truth:

```powershell
npx supabase link --project-ref <project-ref>
npx supabase db push
```

For local verification:

```powershell
npx supabase start
npx supabase db reset
npx supabase test db
```

On Windows, these local commands require Docker Desktop running in Linux-container mode. Production deployment does not require the local Docker engine: the Edge Function can be bundled through Supabase's hosted API with `--use-api`, but the local database suite must still pass on Docker or an isolated CI runner before production approval.

The migrations create the exact-credit wallet/ledger, canonical races, odds history, bets, result evidence, settlement runs, administrator audit trail, RLS, transactional RPCs, and guarded Cron jobs. Do not recreate tables or policies in the Dashboard.

## 2. Google OAuth only

In Google Cloud, create a Web OAuth client and add Supabase's callback URL shown on the Supabase Google provider page. In Supabase Auth, enable Google and disable email/password, anonymous sign-in, phone, and every other provider.

Set the Auth site URL and redirect allow list to site roots because URL fragments are not valid OAuth callbacks:

```text
http://localhost:5173/
https://<production-video-playa-host>/
```

The application restores the Supabase session at the root and returns the user to `#/peakpool`. It does not request or store Google provider access tokens.

## 3. Environment variables

Copy `.env.example` to an ignored local file. Browser configuration contains only:

```text
VITE_SUPABASE_URL
VITE_SUPABASE_PUBLISHABLE_KEY
```

Netlify-only configuration contains:

```text
SUPABASE_URL
SUPABASE_SECRET_KEY
FANTASY_PEAKPOOL_SYNC_TOKEN
```

Supabase Edge configuration contains `FANTASY_RESULT_CRON_TOKEN` and `FANTASY_ATR_RESULTS_ENABLED`. Never prefix a secret with `VITE_`; never expose a secret/service-role key in browser code.

## 4. First administrator bootstrap

1. Sign in once with the intended Google account.
2. In a trusted SQL session, resolve the exact auth UUID.
3. Run one UUID-scoped change:

```sql
update public.profiles
set role = 'admin', updated_at = clock_timestamp()
where id = '<exact-auth-user-uuid>'::uuid and role = 'player';
```

Confirm exactly one row changed. There is deliberately no browser RPC for role changes. Subsequent settings, balance, result, retry, void, and correction operations must use the admin RPCs and create immutable audit evidence.

## 5. Market synchronization

Deploy the Netlify function and configure the same long random `FANTASY_PEAKPOOL_SYNC_TOKEN` in Netlify and Supabase Vault. Create these Vault secrets:

```sql
select vault.create_secret('https://<video-playa-host>/api/fantasy-peakpool/sync', 'fantasy_peakpool_sync_url');
select vault.create_secret('<sync-token>', 'fantasy_peakpool_sync_token');
```

The function reuses `server/smspariaz-racecard.ts`, fetches only the public Peakpool JSON, reconciles canonical races, and calls the service-only ingestion RPC. It contains no provider account code.

### Price evidence gate

Current `horse.type` examples (`940`, `2430`, `NP`) have no documented decimal conversion. They remain stored with body hashes but are never used for placement or payout. Active runners can be selected without a pre-race quote; a winning payout is priced later from the finalized ATR starting price.

## 6. Result checker and Cron

Deploy `fantasy-result-checker`, then create Vault secrets:

```sql
select vault.create_secret('https://<project-ref>.supabase.co/functions/v1/fantasy-result-checker', 'fantasy_result_checker_url');
select vault.create_secret('<cron-token>', 'fantasy_result_cron_token');
```

The result and market jobs run every five and ten minutes respectively, but the wrapper returns without an HTTP invocation while secrets are absent. Each result invocation claims at most 20 current unresolved races and stops after the stored automatic window.

At The Races is disabled by default. Before setting `FANTASY_ATR_RESULTS_ENABLED=true`, run the authorized `?smoke=true&url=<public-racecard-url>` mode from the deployed Edge runtime. Enable only if it reports `PASS` from an ordinary unauthenticated public GET. An F5/JavaScript challenge, login, CAPTCHA, redirect, partial result, or structural mismatch must remain fail-closed; never execute or bypass it.

For automatic confirmation, the finalized ATR result must be `Weighed In`, match the canonical race and runner identities, and publish a bounded starting-price token for every position-one runner. Settlement parses fractional/evens SP at the database boundary and uses that winner-specific decimal multiplier. The immutable payout metadata retains the raw price, multiplier, dead-heat divisor, result/observation IDs, and exact calculation.

Automatic matching requires programme date, approved course identity, DST-aware time, race number/name, complete runner number/name mapping, and `Weighed In`. All ambiguity becomes `NEEDS_REVIEW`. Manual confirmation requires an admin reason.

## 7. RLS model

- Anonymous visitors can read safe settings, canonical races/runners/current snapshots, confirmed result summaries, and the email-free leaderboard.
- Players can additionally read only their profile, wallet, ledger, and bets and can execute only the transactional placement RPC.
- Admin profiles can inspect broader audit data and execute explicit admin RPCs.
- Ingestion and result worker RPCs are granted only to the server secret role.
- Direct writes from `anon` and `authenticated` are revoked. RLS is enabled independently on every exposed table.
- Every definer function pins an empty search path and schema-qualifies objects.

## 8. Free-tier operations

The schedules are far below the current 500,000 monthly Edge invocation allowance. Batch sizes, five-minute claim leases, progressive backoff, and automatic cutoff bound provider and database work. Maintenance clears optional raw bodies after seven days and deletes only 90-day-old invalid snapshots not referenced by a bet. Ledger, accepted quotes, results, settlements, and audits are never pruned.

Supabase Free does not provide paid point-in-time recovery. Export and restore procedures should be tested before the competition carries meaningful history.

## 9. Verification

Run:

```powershell
npm run test:fantasy
npx supabase db reset
npx supabase test db
npm run test:mcp
npm run build
git diff --check
```

Then verify `#/peakpool` at 375px, 768px, and 1280px with keyboard-only navigation and reduced motion. Confirm player/admin denial paths with direct RPC calls, not only hidden buttons.

## 10. Production rollout from Windows

Treat production as a staged release. Keep `game_settings.betting_enabled = false` until the ATR-final-pricing migration and browser deploy are ready. Keep `FANTASY_ATR_RESULTS_ENABLED=false` until the ordinary unauthenticated ATR smoke check passes.

### Pre-deploy gate

From PowerShell on the exact commit to deploy:

```powershell
npm ci
npm run test:fantasy
npm run test:mcp
npm run build
npx supabase link --project-ref <production-project-ref>
npx supabase db push --linked --dry-run
```

Review the dry run and obtain a fresh logical database backup before applying migrations. The repository's SQL migrations are forward-only: do not improvise a destructive down migration during an incident.

### Deployment order

1. Apply migrations with `npx supabase db push --linked` while betting and automatic ATR remain disabled.
2. Put Edge-only values in an ignored file such as `.env.supabase.production`, then run `npx supabase secrets set --env-file .env.supabase.production`.
3. Deploy the result worker with `npx supabase functions deploy fantasy-result-checker --use-api`. The hosted bundler avoids requiring Docker Desktop for this production step. Edge source uses an explicit Deno `npm:` package specifier because the hosted API bundler does not reliably discover the nested `supabase/functions/deno.json` import map; keep that source-level regression test passing.
4. Configure Netlify's production environment with the two browser-safe `VITE_` values and the server-only `SUPABASE_URL`, `SUPABASE_SECRET_KEY`, and `FANTASY_PEAKPOOL_SYNC_TOKEN`. Confirm secret values are scoped to Functions and never printed into build logs.
   The `VITE_SUPABASE_URL` and `VITE_SUPABASE_PUBLISHABLE_KEY` values must include the `builds` scope; setting only the similarly named server variables leaves the deployed UI in `Fantasy backend setup required` mode.
5. Deploy the Netlify site/function from the reviewed commit.
6. Create or rotate the Supabase Vault URLs/tokens only after both destinations exist. Confirm Cron invocations remain no-ops until the required Vault pairs are present.
7. Configure the production site root in Supabase's OAuth redirect allow list and Google OAuth. Hash fragments such as `#/peakpool` must not be registered as callbacks.
   The browser uses PKCE: Supabase returns a short-lived authorization code in the query string, the application exchanges and removes it before mounting the hash router, and access/provider tokens are never routed or written by application console diagnostics. Legacy implicit fragments are recognized only to clean up logins started before the PKCE deployment.
8. Sign in once with the intended operator and perform the UUID-scoped first-admin bootstrap. Confirm exactly one profile changes.

### Read-only production smoke check

Set only public verification values in the current PowerShell process and run:

```powershell
$env:FANTASY_PRODUCTION_SITE_URL = 'https://<production-video-playa-host>'
$env:VITE_SUPABASE_URL = 'https://<project-ref>.supabase.co'
$env:VITE_SUPABASE_PUBLISHABLE_KEY = '<production-publishable-key>'
npm run verify:fantasy-prod
```

The verifier performs no authenticated mutation. It requires HTTPS, loads the deployed application shell, calls the anonymous bootstrap RPC, proves that profile and wallet data are absent, validates race/leaderboard array contracts, and confirms an unauthenticated market-sync request returns 401. It never prints the publishable key.

After that automated check, use separate production player and administrator accounts to complete the 375px, 768px, and 1280px checklist. A pending receipt must state `ATR_FINAL_PENDING`; no pre-race potential return is shown.

### Activation and monitoring gates

- Enable automatic ATR only after the deployed Edge smoke mode passes using an ordinary unauthenticated request. Challenge pages remain a hard stop.
- Enable fantasy betting only after the ATR-final placement/settlement migration, 108-assertion database suite, result-worker configuration check, and browser smoke test pass.
- After each deployment, inspect Edge/Netlify failures, Cron request results, `NEEDS_REVIEW` growth, settlement runs, wallet-ledger reconciliation, and database size. Do not log tokens, response cookies, or raw authentication headers.

### Rollback

- Immediately disable betting and remove/rotate the relevant Vault token if a consequential path is suspect.
- Roll Netlify and the Edge Function back to the last known-good artifact.
- Leave applied database migrations in place unless a reviewed forward repair is supplied; immutable ledger and audit history must not be rewritten.
- Restore a backup only as an incident-response decision after preserving the failed database and audit evidence.
- Re-run `npm run verify:fantasy-prod` and the authenticated smoke matrix before resuming schedules or operator actions.
