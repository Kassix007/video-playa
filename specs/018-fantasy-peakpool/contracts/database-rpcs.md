# Database RPC Contracts

## PMU release contract (supersedes ATR pricing below)

- Placement returns `PMU_FINAL_PENDING`; new bets default to PMU without pre-race odds.
- `record_pmu_fantasy_result(uuid,jsonb,text,text)` is service-role only. It validates identity, every winner/dividend and non-runner set before transactional settlement. Replays never duplicate credits. Gross return is stake × NATIONAL Simple Gagnant dividend per euro, with no extra stake or dead-heat split.
- `claim_pmu_fantasy_result_check_batch(integer)` claims at most three eligible races, prioritizing pending bets, with persisted backoff and expiry.
- `get_pmu_release_status()` is service-role only; returns conversion counts, aggregate ledger reconciliation and boolean cron readiness, never credentials.
- Legacy confirmed settlement/correction rejects PMU bets with `PMU_VERIFIED_DIVIDEND_REQUIRED`. Explicit race void refunds retain admin authorization. Browser offers retry/void instead of unsupported winner-only PMU confirmation.
- Migration `202609060002` converts pending ATR selections only and retargets the existing five-minute Vault job.

All errors use stable uppercase codes and user-safe messages. RPCs never return emails, credentials, provider tokens, raw service errors, or another player's private data.

## `place_fantasy_bet`

**Grant**: `authenticated`

```text
place_fantasy_bet(
  p_runner_id uuid,
  p_odds_snapshot_id uuid,
  p_stake numeric,
  p_expected_price numeric,
  p_idempotency_key uuid
) -> jsonb
```

New clients send null for both quote parameters. The function derives user, wallet, and race from trusted rows, locks the wallet/settings/race, uses database time, permits `WIN` only, rejects inactive runners and close-buffer races, inserts one unpriced pending bet and `BET_STAKE`, then updates balance. The quote parameters remain for backward-compatible replay of legacy clients but are not payout authority.

Success:

```json
{
  "bet_id": "uuid",
  "stake": "100.00",
  "pricing_status": "ATR_FINAL_PENDING",
  "new_balance": "900.00",
  "accepted_at": "2026-09-04T10:00:00Z",
  "idempotent_replay": false
}
```

Stable errors: `AUTH_REQUIRED`, `PLAYER_NOT_INITIALIZED`, `BETTING_DISABLED`, `INVALID_STAKE`, `STAKE_BELOW_MINIMUM`, `STAKE_ABOVE_MAXIMUM`, `INSUFFICIENT_BALANCE`, `RACE_UNAVAILABLE`, `RACE_CLOSED`, `SERVER_TIME_UNAVAILABLE`, `RUNNER_UNAVAILABLE`, `UNSUPPORTED_MARKET`, `BET_CONFLICT`.

Reusing the same user/idempotency key with identical inputs returns the original receipt with `idempotent_replay = true`. Reusing it with different inputs returns `BET_CONFLICT`.

## `admin_update_game_settings`

**Grant**: `authenticated`; function requires protected admin role.

Accepts a complete validated settings object plus `p_reason`. Locks the singleton, records before/after audit evidence, increments version, and returns the safe updated settings. Starting-balance changes do not touch existing wallets.

## `admin_adjust_wallet`

**Grant**: `authenticated`; function requires admin.

```text
admin_adjust_wallet(
  p_user_id uuid,
  p_amount numeric,
  p_reason text,
  p_idempotency_key uuid
) -> jsonb
```

Locks the target wallet, rejects zero/more-than-two-decimal changes and negative resulting balances, creates one `ADMIN_ADJUSTMENT`, updates balance/version, and creates an audit event. Unique actor/request identity makes retries idempotent.

## `admin_confirm_race_result`

**Grant**: `authenticated`; function requires admin.

Accepts race ID, winner runner UUID array, confirmed non-runner UUID array, optional observation ID, required reason, and idempotency key. It validates all runners belong to the race, stores a confirmed result version, audits the decision, and calls settlement in the same transaction. Multiple winners activate the dead-heat divisor.

## `admin_void_race`

**Grant**: `authenticated`; function requires admin.

Locks the race, records a VOID result with reason, refunds all pending stakes exactly once, marks bets/race void, and returns settlement counts.

## `admin_retry_result_check`

**Grant**: `authenticated`; function requires admin.

Moves only an eligible unresolved race's `next_result_check_at` to database time, records the reason/audit, and never performs settlement itself.

## `admin_correct_race_result`

**Grant**: `authenticated`; function requires admin.

Requires race, replacement winners/non-runners, observation, reason, and request identity. Creates a new result version, an explicit reversal settlement run, balancing `SETTLEMENT_REVERSAL` ledger entries for prior payouts/refunds, then applies the new settlement. Earlier ledger rows are immutable.

## `ingest_fantasy_peakpool_snapshot`

**Grant**: service/secret role only.

Accepts one strictly validated canonical racecard plus reconciled public market snapshot and payload evidence. Upserts canonical races/runners, inserts rather than overwrites odds snapshots, preserves accepted off times, and never alters wallets or bets. Market-only races are rejected; canonical races without market prices remain visible and unavailable.

## `claim_result_check_batch`

**Grant**: service/secret role only.

Atomically claims at most 20 eligible `CLOSED`, `RESULT_PENDING`, or retryable `NEEDS_REVIEW` races whose `next_result_check_at <= clock_timestamp()` and automatic window has not expired. It increments attempts and computes progressive backoff. Expired unresolved races stay `NEEDS_REVIEW`.

## `record_result_observation_and_settle`

**Grant**: service/secret role only.

Stores the provider-independent observation. Only a complete, conflict-free `CONFIRMED` decision invokes idempotent settlement; all other decisions update review/scheduling state without wallet mutation.

For each winning bet, settlement matches the selected runner to the ATR position-one row and parses only bounded fractional or evens finalized SP. Gross return is `stake × ATR decimal multiplier ÷ joint-winner count`, rounded once to two decimals. Raw SP, decimal multiplier, divisor, result, observation, and calculation are immutable payout metadata. `ATR_FINAL_PRICE_UNAVAILABLE` withholds settlement.

## Read contracts

- `get_fantasy_peakpool_bootstrap()` returns safe settings, current user profile/role, wallet balance, today's meeting/race/runner market view, the user's recent bets/ledger, and public leaderboard. Private blocks are null for signed-out requests.
- `get_fantasy_peakpool_admin()` returns admin-only player/bet/race/audit summaries and rejects non-admin callers.
- Direct table reads remain limited by grants and RLS even if a caller ignores these convenience RPCs.
