# Fantasy Peakpool Research

## Decision: Use a separate fantasy application and never reuse provider submission code

**Rationale**: The worktree contains uncommitted 017 modules for an authenticated SMSPariaz account and `/placebet/`. The new feature explicitly prohibits those actions. Feature 018 may reuse only the public racecard output, Mauritius helpers, and independently verified read-only fixture concepts.

**Alternatives considered**:

- Extend 017's prepared-ticket or provider client: rejected because those modules authenticate and target a provider transaction endpoint.
- Add fantasy fields to HORSEE race schemas: rejected because that would change existing archive/MCP semantics.

## Decision: Keep canonical PDF parsing in Netlify Node

**Rationale**: `server/smspariaz-racecard.ts` already validates the Mauritius date, MIME/signature, body size, and parsed race identities. PDF extraction depends on `pdf-parse` and `@napi-rs/canvas`, which are unsuitable for the Deno Edge runtime. A thin protected Netlify function can reuse this code without moving unrelated HORSEE storage.

**Alternatives considered**:

- Reimplement the race universe from the Peakpool JSON: rejected because the requirement makes the existing daily racecard authoritative.
- Parse PDFs in Edge Functions: rejected because native/Node dependencies complicate the free runtime and duplicate validated code.

## Decision: Treat `horse.type` as unverified raw display data

**Evidence**: On 2026-09-04 the ordinary public endpoint `https://www.smspariaz.com/service/peakpool_json.php` returned JSON text containing 51 races and 566 horses. Race fields were `meeting_number,date,track,number,time,name,horses`; horse fields were `no,name,type`. Of the observed `type` values, 558 were digit strings between three and five characters and eight were `NP`. Saved examples include `940`, `2430`, `608`, and `NP`. `web-analysis/js/site.js` renders the value verbatim under `Odds` but does not calculate a return or define a scale.

**Decision**: Hash exact response-body bytes with SHA-256 before decoding. Store the raw value, source URL, observed time, byte length, and body hash. Emit no normalized decimal price for digit values or `NP`; mark them `UNVERIFIED_PRICE_FORMAT` or `NON_RUNNER_DISPLAY_SENTINEL`. `NP` alone is not settlement evidence.

**Alternatives considered**:

- Divide digit strings by 100: rejected. No first-party code, rules, metadata, or documentation proves that these are gross decimal prices, profit odds, dividends, or pool estimates.
- Hide canonical races when prices are unavailable: rejected. The UI should show the race and explain that odds are unavailable.

## Decision: Use At The Races as a conditional provider adapter

**Evidence**: The sampled 2026-09-04 SMSPariaz programme contained seven meetings and 52 races; ATR exposed all seven meetings and all canonical races, plus one extra race that the canonical source correctly excludes. Public daily paths use `/results/DD-Month-YYYY`; detail paths use `/racecard/{Course}/{DD-Month-YYYY}/{HHmm}`. Detail pages can expose `Weighed In`, full result rows, cloth numbers, horse names, disqualifications, off/winning time, and `Last Updated`.

**Constraint**: A plain server request in research received HTTP 200 with a small F5/JavaScript challenge and `_fs_ch` cookie instead of results. The implementation must detect this and must not execute the challenge, reuse browser cookies, call disallowed AJAX routes, solve CAPTCHAs, or authenticate.

**Decision**: Ship the provider-independent interface and ATR parser behind `FANTASY_ATR_RESULTS_ENABLED=false`. A bounded deployment smoke check must prove that ordinary unauthenticated fetches return expected public HTML before enabling. Otherwise record the observation and require manual admin confirmation.

**Finalized winner price (amended 2026-09-05)**: ATR's public results describe their abbreviated output as including starting prices. A finalized starting-price token attached to the matched position-one row is required as both result evidence and payout authority. New bets are accepted without pre-race odds. Settlement accepts only bounded fractional or evens SP, converts it deterministically to the gross decimal multiplier (`fraction + 1`), and records both forms. Missing or malformed SP requires review and makes no wallet mutation.

**Matching evidence**:

- exact programme date;
- approved course alias;
- scheduled time converted from `Europe/London` with DST to the Mauritius race time;
- race number plus normalized race name or distance;
- strong cloth-number and normalized horse-name field agreement;
- `Weighed In` finality and unambiguous position-one rows.
- a bounded finalized starting-price token on each position-one row.

**Alternatives considered**:

- Sporting Life: useful future corroboration, but server fetch behavior, exact coverage, finality, and reuse terms were not sufficiently validated.
- Racing Post: public discovery exists, but usable structured coverage and access behavior were not validated.
- Official governing bodies: stronger but fragmented across jurisdictions and disciplines; suitable future adapters, not a universal v1 source.

## Decision: Put exact-value mutations in Postgres RPCs

**Rationale**: The browser cannot safely own concurrency, server time, balances, or payout calculations. PostgreSQL row locks, `numeric`, unique constraints, and single transactions directly enforce the required invariants.

**Security rules**:

- Enable RLS on every exposed table and separately restrict grants.
- Use `(select auth.uid())` for player ownership checks.
- Put role helpers in a non-exposed `private` schema.
- Prefer invoker functions; where definer authority is required, use `security definer set search_path = ''` and schema-qualify every object.
- Revoke default function execution and grant each RPC only to the required role.
- Keep service/secret keys in Netlify or Edge configuration only.

**Official references**:

- [Supabase Row Level Security](https://supabase.com/docs/guides/database/postgres/row-level-security)
- [Database Functions](https://supabase.com/docs/guides/database/functions)
- [Securing the Data API](https://supabase.com/docs/guides/api/securing-your-api)

## Decision: Use Google OAuth through the browser client

**Rationale**: The existing SPA is client-rendered with a hash router. `signInWithOAuth({ provider: 'google', options: { redirectTo } })` supports the required Google-only flow. OAuth callbacks cannot target a URL fragment, so local and production site roots are allowlisted; the application restores the session and then routes to `#/peakpool`. Provider tokens are neither requested nor stored because the app needs identity only.

**Official references**:

- [Login with Google](https://supabase.com/docs/guides/auth/social-login/auth-google)
- [Redirect URLs](https://supabase.com/docs/guides/auth/redirect-urls)

## Decision: Bound scheduled checks for Supabase Free

**Rationale**: Supabase Cron uses `pg_cron` and can invoke Edge Functions via `pg_net`, with secrets held in Vault. Current official limits document 500,000 free Edge invocations per billing period, a 150-second free wall-clock limit, 256 MB memory, and a recommendation of no more than eight concurrent Cron jobs that each run under ten minutes.

**Decision**: Use one result-check job at five-minute cadence only during configured programme windows, claim at most 20 eligible races per run, and calculate `next_check_at` with progressive backoff. A separate low-frequency market-sync invocation calls the protected Netlify synchronizer. Automatic polling stops at `automatic_check_until`; later action is manual.

**Official references**:

- [Supabase Cron](https://supabase.com/docs/guides/cron)
- [Scheduling Edge Functions](https://supabase.com/docs/guides/functions/schedule-functions)
- [Edge Function limits](https://supabase.com/docs/guides/functions/limits)
- [Edge invocation usage](https://supabase.com/docs/guides/platform/manage-your-usage/edge-function-invocations)

## Decision: Keep raw evidence minimal and retention-aware

**Rationale**: Supabase Free currently enforces a 500 MB database-size quota. Full public pages and repeated JSON bodies would grow unnecessarily and may carry copyrighted expression or volatile cookies.

**Decision**: Store exact hashes and minimal factual structured observations by default. The ingestion worker may retain bounded raw public fixture bodies only when explicitly configured for debugging; it never stores response cookies. Result observations retain the relevant sanitized fragment or structured facts, URL, retrieved time, finality, and hash rather than entire pages. Maintenance jobs prune unreferenced old odds bodies while never deleting accepted-bet quote evidence, ledger history, settlement evidence, or audit records.

## Baseline risk

The starting worktree is dirty and the uncommitted 017 changes currently leave one existing MCP test failing (`server/council-auth.test.ts`) while 198 pass. Feature 018 must preserve those changes, avoid importing their account-submission modules, and report the baseline failure separately if it remains after implementation. `git diff --check` was clean at research time apart from line-ending warnings.
