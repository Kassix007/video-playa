# Fantasy Peakpool Implementation Status

**Recorded**: 2026-09-06
**Owning specification**: [spec.md](spec.md)
**Task source**: [tasks.md](tasks.md)

## Headline

The earlier completion percentage is obsolete: the results-source and payout requirements changed. SMSPariaz PDF remains authoritative for racecards; the new free PMU result adapter and protected worker are implemented. Automatic PMU settlement is **not enabled in production**.

Production read-only smoke verification on the 2026-09-05 programme validated three real races, including LE COMBAT CONTINUE at a 5.00 gross dividend. Additional races matched identity, but exact title differences and missing meetings (including Stratford) prevent complete coverage. No production balances changed during verification.

Local verification: 252 repository tests, 108 existing database assertions, ten new PMU database assertions, and production build passed. PMU database migration remains local only. Worker is deployed with activation disabled by default.

Remaining release gates: finish matching/coverage policy, non-runner and dead-heat SQL scenarios, pricing-basis UI/projection, protect PMU bets from the legacy ATR settlement path, configure the scheduler, verify signed-in flows at all three viewport sizes, and rerun final checks. Existing pending ATR-priced bets stay unchanged unless the user explicitly approves conversion. Settled history is preserved.

The sections below describe earlier implementation and must be read in light of this current release status.

## Completed implementation

- Strict public Peakpool parsing, byte-exact hashing, bounded input, raw-value preservation, and fail-closed price classification.
- Reconciliation against the existing canonical SMSPariaz racecard without importing provider-account or wager-submission modules.
- Exact fantasy-credit domain arithmetic, close-buffer logic, quote-age checks, and dead-heat calculations.
- Supabase schema, RLS/grants, immutable ledger, wallet initialization, transactional bet placement, settlement/correction/admin RPCs, and bounded scheduled-job definitions.
- Protected server-side market synchronization and a disabled-by-default public result adapter/worker.
- Google-only Supabase browser authentication, programme, betslip, bet/ledger history, leaderboard, admin settings/audit/result controls, and the `#/peakpool` route.
- Deployment/setup documentation, safe environment placeholders, and explicit provider/price evidence gates.

## Verification already obtained

| Check | Result |
|---|---|
| Focused fantasy tests | **34/34 passed** |
| Local Supabase reset/migrations | **Passed** on Docker Desktop Linux containers for Windows |
| Database pgTAP tests | **106/106 passed** |
| Repository-wide Node tests | **231/231 passed** |
| Production build | **Passed** |
| `git diff --check` | **Passed**; line-ending warnings only |
| Browser console on `#/peakpool` | **No warnings or errors** |
| Responsive signed-out/setup-unavailable state | **Passed at 375px, 768px, and 1280px** with no horizontal overflow |
| Mobile navigation | **Keyboard reachable; Escape closes the drawer** |
| Reduced-motion coverage | **Matching CSS media rules present** |

### ATR finalized winner evidence follow-up

- Finalized At The Races result rows now retain bounded winner starting-price representations, including dead heats.
- Missing, malformed, or zero-denominator winner prices force automatic review.
- The Edge decision and service-only database RPC both enforce the winner-price evidence gate.
- Administrators receive a bounded result-observation feed showing the matched winner and finalized SP.
- Payout calculations remain based exclusively on the accepted bet's pre-race `locked_price`; ATR finalized prices cannot reprice a bet.

The previously unrelated feature-017 OAuth scope expectation has been reconciled; the complete repository suite is green. Feature 018 remains isolated from that provider-account flow.

## Remaining work

### Finish authenticated browser QA

Task T059 is partial. The public route, responsive shell, and a locally seeded public programme were tested, but genuine Google sign-in, initialized player wallet, bet confirmation/receipt, private histories, leaderboard data, and admin dialogs require the real Supabase project, Google OAuth configuration, and player/admin accounts. A test-only authentication bypass was deliberately not added.

The final safety scan and artifact reconciliation are complete. No executable feature or built-output match imports provider-account code, calls `/checklogin/` or `/placebet/`, or exposes a browser secret.

Production operations now include migration dry-run/backup gates, hosted Edge deployment with `--use-api`, explicit Netlify/Edge/Vault secret separation, OAuth and administrator bootstrap ordering, monitoring and forward-only rollback guidance, and `npm run verify:fantasy-prod`. The Edge worker pins its package dependency with an explicit Deno `npm:` specifier because the hosted bundler does not reliably discover the nested import map. The verifier performs only public/read-only requests and proves the deployed application shell, anonymous privacy contract, and 401 sync boundary without logging the publishable key.

The Netlify application and functions are deployed at `https://videoplaya.kassinathdoss.dev` (deploy `6a9b396dfcc1fe31e892eaed`). New OAuth attempts use PKCE. The result worker is deployed through Supabase's hosted bundler to project `lggjvsrqaqtwebqxsavi`. Live fantasy bet availability still fails closed because no current price normalizer has been approved.

The Netlify production Functions scope now contains a write-only, non-empty `SUPABASE_SECRET_KEY`; it is not available to the browser build. An authenticated sync invocation passed the credential/configuration gate and reached both public inputs. The 2026-09-05 canonical racecard contained 55 races, but the contemporaneous public Peakpool market response was an empty array, so ingestion correctly returned `sync_failed` rather than inventing runner market data.

The previously exposed market-sync bearer has been replaced. The replacement is write-only in Netlify, is stored in Supabase Vault alongside the production sync URL, and was accepted by the redeployed function. The active `*/10 * * * *` cron can resolve both Vault names. Its current upstream result remains fail-closed because SMSPariaz is returning an empty Peakpool market array, not because deployment credentials are missing.

## Activation gates after implementation verification

These gates are intentionally separate from the remaining engineering checklist:

1. **Price normalization**: obtain current first-party evidence explaining the raw displayed values, add recorded fixtures and a versioned normalizer, then amend the specification. Until then, the UI must continue to say `Odds currently unavailable`.
2. **Automatic results**: run the deployment smoke mode against the public result source using an ordinary server fetch. Keep `FANTASY_ATR_RESULTS_ENABLED=false` if a challenge/interstitial or unstable response is returned.
3. **Hosted configuration**: complete one Google sign-in, first-administrator setup, Vault secrets, and cron jobs using the documented procedures; then complete authenticated player/admin QA.

## Practical completion assessment

- **Code and UI surface**: mostly implemented.
- **Safety architecture**: implemented and statically tested.
- **Database proof**: complete locally; reset/migrations passed and pgTAP passed 106/106.
- **Authenticated end-to-end proof**: OAuth initiation is verified; post-login player/admin proof awaits a user completing Google authentication and the first-admin bootstrap.
- **Live quote activation**: deliberately blocked on external evidence; no safe completion percentage can be assigned to that research gate.

The shortest path to final verification is: complete Google sign-in, create the first administrator through trusted SQL, finish the documented Vault variables, and exercise authenticated flows at 375px, 768px, and 1280px. No implementation task remains behind that check.
