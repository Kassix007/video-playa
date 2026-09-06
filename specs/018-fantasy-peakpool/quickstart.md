# Fantasy Peakpool Validation Quickstart

## Current PMU release verification — 2026-09-06

PMU replaces ATR for new and owner-approved converted pending bets. Production Netlify deploy `6a9cd9448bf68dcc68113f3b` and migrations through `202609060003` are live. Four pending bets converted with audit; three settled as losses against verified PMU results, one remains unmatched/review. PMU enabled, ATR disabled, active five-minute Vault URL points to PMU, unauthorized worker POST returns 401. Wallet/ledger totals both 3350.00. No settled history was repriced.

Production shell and PMU label/history asset checks return 200/pass. Signed-out layouts at 375, 768 and 1280 have no horizontal overflow or console errors. Current programme has 31 PDF races; sampled expanded race has unreconciled runners, so no production test bet was placed. Full authenticated player/admin QA remains T059. Local SQL coverage is 128 assertions, including PMU dead heats, non-runner refunds, replay, grants, legacy-path blocking and NFD accent normalization. Older ATR gate instructions below are historical.

Windows CLI learning: use the installed Node binary and npm CLI directly if the PowerShell npm wrapper fails. Netlify cache `b3ca12a867cd0704` had a missing semver module; the existing `4b0449b98640e64c` CLI completed deployment. Keep activation migration inside explicit BEGIN/COMMIT: this Supabase CLI did not implicitly wrap LOCK TABLE.

## Prerequisites

- Node.js 22 and repository dependencies installed.
- Docker plus Supabase CLI for local database/RLS tests.
- A Supabase Free project for hosted OAuth/cron validation.
- Google OAuth client credentials configured only in Google/Supabase dashboards.
- No SMSPariaz account or credential is needed or permitted.

## Local configuration

Copy `.env.example` to an ignored local environment file and fill only local/project values:

```text
VITE_SUPABASE_URL
VITE_SUPABASE_PUBLISHABLE_KEY
SUPABASE_URL
SUPABASE_SECRET_KEY
FANTASY_PEAKPOOL_SYNC_TOKEN
FANTASY_ATR_RESULTS_ENABLED=false
```

Never put a secret/legacy service-role value in a `VITE_` variable.

## Database

```powershell
npx supabase start
npx supabase db reset
npx supabase test db
```

Expected: migrations apply from an empty database; pgTAP proves player/admin RLS, one opening balance, atomic placement/replay/overspend, adjustments, wins/losses/refunds/dead heat, duplicate settlement, review state, manual confirmation, and correction.

## Application and domain checks

```powershell
npm run test:mcp
npm run build
npm run dev
```

Open `http://localhost:5173/#/peakpool`. With a configured local Supabase session, validate Google sign-in, balance, race programme, unavailable raw prices, bet history, ledger, leaderboard, and admin gating. Without Supabase variables, the page must show a safe setup-unavailable state rather than crash.

## Price evidence gate

Run the read-only fixture/parser tests. Current digit values and `NP` must produce `normalized_price = null` and must never become payout inputs. New placement intentionally sends no odds snapshot or expected price; the selected active runner and exact stake are accepted for later ATR-final pricing.

Legacy normalized snapshots remain immutable evidence, but ATR finalized SP is payout authority for all settlements after the forward migration.

## Result-provider gate

Keep `FANTASY_ATR_RESULTS_ENABLED=false` until a bounded deployment smoke check receives real ATR public result HTML from an ordinary server fetch. Challenge/interstitial content must be detected and recorded without executing it. With the adapter disabled, post-off races must become or remain `NEEDS_REVIEW` and manual admin confirmation must work with a reason.

For an enabled fixture, confirm every automatically accepted winner has a published finalized starting-price token in the stored observation and administrator evidence view. Verify the pending receipt has no invented potential return and settlement records and uses the winner-specific ATR raw and decimal prices.

Implementation evidence recorded on 2026-09-04:

- finalized single-winner and dead-heat ATR fixtures retain `4/1 F` and `7/2` starting-price representations;
- missing, script-like, and zero-denominator winner prices produce `NEEDS_REVIEW`;
- the Node and Edge adapters apply the same winner-price gate;
- the service-only observation RPC applies a second price-shape check before automatic confirmation;
- the protected admin payload exposes bounded observation facts, while settlement SQL uses `stake × ATR finalized decimal price ÷ joint_winner_count`;
- `npm run test:fantasy` passed 30/30 and `npm run build` passed.

Database coverage now contains 106 pgTAP assertions spanning the complete placement, authorization, leaderboard, settlement, refund, dead-heat, review, and correction matrix. The suite has not yet executed locally because Docker Desktop's Linux engine is stopped and the current Windows process cannot start its service. Once Docker is available, the three database commands above are the remaining database proof; no additional SQL cases are planned.

## Google OAuth redirects

Add local and production site roots—not hash fragments—to the Supabase redirect allow list, for example:

```text
http://localhost:5173/
https://<video-playa-production-host>/
```

The application restores the Supabase session at the root and then uses `#/peakpool` internally.

## First administrator

1. Sign in once through Google so the profile exists.
2. In a trusted Supabase SQL session, look up the intended `auth.users.id` by the known account.
3. Run the documented one-time UUID-scoped bootstrap update from `docs/fantasy-peakpool.md`.
4. Confirm the role through the admin dashboard. Never expose a role-update RPC to players.

## Responsive/accessibility validation

At 375px, 768px, and 1280px:

- navigate, sign in/out, select a runner, enter a stake, cancel/confirm, filter bets, read the leaderboard, and exercise admin dialogs by keyboard;
- confirm no page-level horizontal scroll, useful focus placement, visible focus states, Escape behavior, labelled status messages, and reduced-motion behavior;
- confirm long course/race/runner names wrap without obscuring actions.

Evidence recorded on 2026-09-04:

- 375px, 768px, and 1280px signed-out/setup-unavailable layouts have no page-level horizontal overflow and produce no browser-console errors;
- mobile navigation is keyboard reachable and Escape closes the drawer;
- reduced-motion styles cover animated Peakpool controls;
- authenticated player, betslip, history, leaderboard-data, and administrator interactions remain unexecuted because genuine Google OAuth is not configured. Those flows must be run with real player/admin test identities before T059 can close.

Local database evidence recorded on 2026-09-04:

- Docker Desktop ran the Supabase stack using Linux containers on the Windows host;
- `npx supabase db reset` applied every migration successfully;
- `npx supabase test db` passed all **106/106** pgTAP assertions;
- no test-only email or JWT authentication backdoor was added when Google OAuth was unavailable.

## Safety verification

```powershell
git diff --check
rg -n "service_role|secret_key|client_secret|BEGIN (RSA|OPENSSH)|/placebet/|/checklogin/" .env.example src server netlify supabase docs specs/018-fantasy-peakpool
```

Review matches: safe placeholders and explicit prohibition documentation are acceptable; browser secrets, credentials, or executable SMSPariaz bet/account calls are not.

## Expected fail-closed production state

Peakpool pre-race values remain unverified and excluded. Production betting is enabled only by the ATR-final-pricing migration: active runners can be selected without a quote, pending returns remain unresolved, and a winner is credited only after a strongly matched finalized ATR result supplies a valid starting price.

## Production smoke verification

Production rollout is documented in [docs/fantasy-peakpool.md](../../docs/fantasy-peakpool.md). On Windows, local pgTAP requires Docker Desktop in Linux-container mode, while production Edge deployment may use Supabase's hosted `--use-api` bundler.

After migrations, Edge, Netlify, Vault, and OAuth are configured—but before enabling any scheduled result access—run:

```powershell
$env:FANTASY_PRODUCTION_SITE_URL = 'https://<production-video-playa-host>'
$env:VITE_SUPABASE_URL = 'https://<project-ref>.supabase.co'
$env:VITE_SUPABASE_PUBLISHABLE_KEY = '<production-publishable-key>'
npm run verify:fantasy-prod
```

Expected: the site shell and anonymous bootstrap return 200, anonymous profile/wallet fields are null, public collection contracts are intact, and an unauthenticated sync POST returns 401. The command is read-only and does not print the key.

Production evidence recorded on 2026-09-04:

- Netlify production deploy `6a9aab3b7abb934d2aee06e3` is live at `https://videoplaya.kassinathdoss.dev`;
- the deployed application shell returns HTTP 200;
- an unauthenticated `POST /api/fantasy-peakpool/sync` returns HTTP 401;
- hosted Supabase, Google OAuth, Edge functions, Vault/cron, and betting activation remain unconfigured because no Supabase project login/reference or production credentials are available. The deployed surface therefore remains deliberately fail-closed.

Production authentication follow-up recorded on 2026-09-05:

- Netlify production deploy `6a9b322f07bb9f00c6510b50` includes the build-scoped public Supabase URL and publishable key;
- `#/peakpool` displays `Sign in with Google` instead of `Fantasy backend setup required`;
- activating the control reaches Google's hosted sign-in page with the expected hosted Supabase callback and the Video Playa root return URL;
- no Google credentials were entered or handled during automated verification, so post-login player/admin viewport QA remains T059.

OAuth callback follow-up recorded on 2026-09-05:

- Netlify production deploy `6a9b3388b4f57323ccae6be2` recognizes Supabase OAuth success and error fragments before the hash router falls through;
- the callback mounts Peakpool session restoration and replaces the credential-bearing fragment with `#/peakpool`;
- a safe `access_denied` callback simulation returned to Peakpool with retry messaging and no unmatched-route state;
- `npm run test:fantasy` passed 32/32 and the production Netlify build/deploy passed.

PKCE hardening follow-up recorded on 2026-09-05:

- Netlify production deploy `6a9b34a4efff480ddc3ae802` switches new Google sign-ins from implicit token fragments to PKCE authorization-code exchange;
- callback codes are exchanged and removed before React Router mounts, so credentials cannot become an unmatched hash route or be repeated by its warning;
- existing implicit fragments remain recognized solely for bounded cleanup of logins initiated before this deploy;
- production OAuth initiation had no Video Playa console errors or warnings; Google's own standard self-XSS console notice is unrelated and contains no application session credentials;
- `npm run test:fantasy` passed 34/34 and the production build/deploy passed.

Market-sync credential follow-up recorded on 2026-09-05:

- the hosted Supabase secret API key is configured as a write-only Netlify production Functions variable and remains outside the browser build;
- an authenticated production sync passed configuration and reached the public sources;
- the canonical racecard supplied 55 races, while the public Peakpool market endpoint returned an empty array at the check time, so the parser failed closed and no race snapshot was ingested.

Scheduled market-sync activation recorded on 2026-09-05:

- the previously exposed sync bearer was rotated and the replacement was written directly to Netlify and Supabase Vault without being printed;
- Vault contains the production sync URL and a 64-character bearer under the exact names consumed by the cron wrapper;
- `fantasy-peakpool-market-ten-minutes` is active on `*/10 * * * *`;
- production deploy `6a9b396dfcc1fe31e892eaed` accepted the rotated bearer and reached the upstream fail-closed state.

PDF-first production programme recovery recorded on 2026-09-05:

- the valid SMSPariaz daily racecard PDF is now ingested independently of optional market enrichment;
- an empty, unavailable, or structurally invalid market response no longer removes canonical races, while the strict evidence parser remains unchanged for callers that require all-or-nothing validation;
- tolerant enrichment accepted 54 current market races and skipped malformed `R21C4`, whose duplicate runner identifier would previously abort the whole snapshot;
- the scheduled production run populated **55 races**, **7 meetings**, and **567 runner records**; the live page displays the canonical `R21C4` with its runners unreconciled rather than hiding it;
- all raw market values remain excluded because their decimal normalization is not evidence-backed; ATR supplies the post-race winner and finalized payout price;
- `npm run test:fantasy` passed **36/36**, `npm run build` passed, `git diff --check` passed with line-ending warnings only, and Netlify production deploy `6a9bc6e7a24809fc320a2ddb` is live.

Compact programme workspace verification recorded on 2026-09-05:

- Netlify production deploy `6a9bcc80e8ea46172a4b7008` is live at `https://videoplaya.kassinathdoss.dev/#/peakpool`;
- the live workspace reports all **55 PDF races** across **7 meetings**, with meeting counts of 9, 8, 9, 7, 8, 7, and 7;
- only the selected meeting is rendered, every race header starts collapsed, and runner markup is mounted only after the user expands that race;
- Races, My Bets, Leaderboard, Wallet, and Admin are top-level workspace destinations when the current session is entitled to them, so private views no longer sit below the full programme;
- 375px, 768px, and 1280px screenshots confirmed the compact layout without page-level horizontal overflow; native buttons/tabs expose selected and expanded state to accessibility APIs, and reduced-motion styles remain active;
- the PDF remains authoritative for race presence. Optional public enrichment may supply runner names but cannot filter a PDF race, and unverified pre-race numeric values never affect payout. ATR supplies the post-race winner and finalized starting-price multiplier;
- `npm run test:fantasy` passed **38/38**, the production build passed with only the existing Vite chunk advisory, and no secret file or value was staged or committed.
