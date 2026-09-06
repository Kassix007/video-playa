# Fantasy Peakpool Data Model

## Current PMU pricing contract (2026-09-06)

`bets.pricing_basis` defaults to `PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO`. The owner-approved migration converts only pending ATR bets and writes a `PMU_PRICING_MIGRATION` audit per bet; settled rows and existing ledger entries are untouched. Final observations retain winner-specific `finalizedDividendCents`; bets expose `result_metadata.pmu_dividend_cents`. Gross credit is `round(stake * dividend_cents / 100, 2)`, including stake and without a second dead-heat split. Confirmed non-runners receive their stake back. Validate all evidence before any credit or losing-bet update. ATR/quote descriptions below are historical for converted/new PMU bets.

All timestamps use `timestamptz` in UTC. Browser-visible race times are rendered in `Indian/Mauritius`. Credit and price values use `numeric(18,2)`; constraints reject greater-than-two-decimal inputs rather than silently rounding accepted stakes.

## Enumerations

- `app_role`: `player`, `admin`
- `race_state`: `UPCOMING`, `OPEN`, `CLOSED`, `RESULT_PENDING`, `SETTLED`, `VOID`, `NEEDS_REVIEW`
- `result_state`: `PENDING`, `PROVISIONAL`, `CONFIRMED`, `VOID`, `NEEDS_REVIEW`
- `bet_state`: `PENDING`, `WON`, `LOST`, `VOID`
- `market_type`: `WIN` (schema leaves room for future values; RPC accepts only `WIN`)
- `wallet_transaction_type`: `OPENING_BALANCE`, `ADMIN_ADJUSTMENT`, `BET_STAKE`, `BET_PAYOUT`, `BET_REFUND`, `SETTLEMENT_REVERSAL`
- `settlement_state`: `STARTED`, `COMPLETED`, `FAILED`, `REVERSED`

## `profiles`

| Field | Type | Rules |
|---|---|---|
| `id` | UUID | Primary key and foreign key to `auth.users(id)`; one profile per user. |
| `role` | `app_role` | Required, default `player`; never user-editable. |
| `display_name` | text | Bounded sanitized public name; email is never used as public fallback. |
| `avatar_url` | text nullable | HTTPS URL sourced from trusted OAuth metadata. |
| `created_at`, `updated_at` | timestamp | Server generated. |

New-user trigger inserts the profile, wallet, and opening ledger transaction in one database transaction. Conflict-safe primary keys make repeated initialization a no-op rather than a second grant.

## `game_settings`

Singleton row keyed by `id = true`.

| Field | Type | Rules |
|---|---|---|
| `betting_enabled` | boolean | Default false; the ATR-final-pricing migration activates it after transactional coverage passes. |
| `default_starting_balance` | numeric | Non-negative; applies only to future wallet initialization. |
| `minimum_stake` | numeric | Positive and exactly two decimals or fewer. |
| `maximum_stake` | numeric nullable | When present, greater than or equal to minimum. |
| `close_buffer_seconds` | integer | Default 60; bounded 0–3600. |
| `max_quote_age_seconds` | integer | Positive bounded age used at placement. |
| `result_check_initial_delay_seconds` | integer | Delay after official off before first check. |
| `result_check_max_age_seconds` | integer | Automatic-check cutoff. |
| `result_confirmation_required` | text | Default `WEIGHED_IN`. |
| `version`, `updated_at`, `updated_by` | audit fields | Incremented and attributed through admin RPC only. |

## `wallets`

| Field | Type | Rules |
|---|---|---|
| `id` | UUID | Primary key. |
| `user_id` | UUID | Unique foreign key to profile. |
| `balance` | numeric | Cached exact balance, non-negative, writable only by trusted functions. |
| `version` | bigint | Increments for each balance mutation. |
| `created_at`, `updated_at` | timestamp | Server generated. |

The ledger is authoritative. Tests reconcile `wallets.balance = sum(wallet_transactions.amount)` for every wallet.

## `wallet_transactions`

| Field | Type | Rules |
|---|---|---|
| `id` | UUID | Primary key. |
| `wallet_id`, `user_id` | UUID | Indexed owner links. |
| `type` | transaction enum | Required. |
| `amount` | numeric | Signed: credits positive, debits negative; non-zero except explicit reversal bookkeeping. |
| `balance_after` | numeric | Exact cached balance after this transaction. |
| `bet_id`, `settlement_run_id`, `admin_audit_id` | UUID nullable | Causal references. |
| `reason` | text nullable | Required for administrator and correction operations. |
| `metadata` | JSONB | Calculation, divisor, source, and reversal evidence; never credentials. |
| `created_by` | UUID nullable | User/admin actor; system operations may be null with system metadata. |
| `created_at` | timestamp | Immutable server time. |

Unique partial constraints enforce one opening entry per wallet, one stake per bet, and one payout/refund/reversal per bet and settlement event. No update or delete grants exist.

## `source_payloads`

| Field | Type | Rules |
|---|---|---|
| `sha256` | text | 64-character primary key over exact response bytes. |
| `source_url` | text | Allowlisted public read endpoint. |
| `retrieved_at` | timestamp | Server observation time. |
| `byte_length` | integer | Bounded positive length. |
| `content_type` | text nullable | Observation metadata only. |
| `raw_body` | text nullable | Disabled by default; bounded and never includes headers/cookies. |

## `race_events`

| Field | Type | Rules |
|---|---|---|
| `id` | UUID | Primary key. |
| `source` | text | Constant `smspariaz_daily_racecard`. |
| `programme_date` | date | Mauritius programme date. |
| `external_race_id` | text | SMSPariaz identity such as `R4C8`. |
| `meeting_number`, `race_number` | integer | Positive identifiers. |
| `racecourse`, `normalized_racecourse` | text | Display and matching forms. |
| `race_name`, `discipline`, `distance` | text nullable | Canonical metadata. |
| `official_off_at` | timestamp | UTC instant derived from official Mauritius time. |
| `state` | race enum | Controlled lifecycle. |
| `racecard_observed_at`, `racecard_payload_hash` | evidence | Staleness and revision evidence. |
| `accepted_off_at` | timestamp nullable | First off time used for accepted bets; protects later revisions. |
| `next_result_check_at`, `automatic_check_until`, `result_check_attempts` | scheduling fields | Bounded polling state. |
| `created_at`, `updated_at` | timestamp | Server generated. |

Unique `(source, programme_date, external_race_id)`.

### Race state transitions

```text
UPCOMING -> OPEN -> CLOSED -> RESULT_PENDING -> SETTLED
                   ├──────────────────────────> VOID
                   └──────────────────────────> NEEDS_REVIEW
NEEDS_REVIEW -> SETTLED | VOID
```

Once an accepted bet exists, later source time revisions update observational fields but do not invalidate that bet.

## `race_runners`

| Field | Type | Rules |
|---|---|---|
| `id` | UUID | Primary key. |
| `race_id` | UUID | Parent race. |
| `runner_number` | integer | Source cloth/horse number, including observed zero where provider data allows it. |
| `runner_name`, `normalized_runner_name` | text | Display and matching forms. |
| `active` | boolean | False only from trustworthy evidence; absence alone is not a non-runner confirmation. |
| `source_selection_code` | text | Read-only identity; never sent to a betting endpoint. |
| `created_at`, `updated_at` | timestamp | Server generated. |

Unique `(race_id, runner_number)`.

## `odds_snapshots`

| Field | Type | Rules |
|---|---|---|
| `id` | UUID | Primary key. |
| `race_id`, `runner_id` | UUID | Reconciled canonical identities. |
| `market_type` | market enum | `WIN` in v1. |
| `raw_price` | text | Exact `horse.type` string. |
| `normalized_price` | numeric nullable | Null until an evidence-backed normalizer succeeds. |
| `normalization_rule` | text nullable | Versioned rule identity, never inferred. |
| `availability_reason` | text nullable | e.g. `UNVERIFIED_PRICE_FORMAT`, `NON_RUNNER_DISPLAY_SENTINEL`. |
| `source`, `source_payload_hash` | evidence | Public endpoint and exact body hash. |
| `observed_at`, `valid_until` | timestamp | Staleness controls. |
| `is_valid` | boolean | True only with a permitted positive normalized price and reconciled active runner. |

Snapshots are insert-only. Current-market reads select the newest valid row; accepted bets copy all required quote fields.

## `bets`

| Field | Type | Rules |
|---|---|---|
| `id` | UUID | Primary key. |
| `user_id`, `wallet_id`, `race_id`, `runner_id` | UUID | Indexed ownership and selection. |
| `market_type` | market enum | Must be `WIN` in v1. |
| `stake` | numeric | Positive, within current limits, max two decimals. |
| `locked_price` | numeric nullable | Legacy pre-race quote evidence only; new ATR-final-priced bets leave it null. |
| `locked_raw_price`, `quote_observed_at`, `quote_source`, `quote_payload_hash`, `odds_snapshot_id` | nullable quote evidence | Preserved for legacy bets; not required for new placement. |
| `potential_gross_return` | numeric nullable | Legacy preview only; new bets remain unresolved until ATR settlement. |
| `idempotency_key` | UUID | Unique with user. |
| `state` | bet enum | Default `PENDING`. |
| `accepted_at`, `settled_at` | timestamp | Authoritative server times. |
| `result_metadata` | JSONB | Winner/divisor/calculation evidence. |

Unique `(user_id, idempotency_key)`. Updates are trusted-function-only.

## `result_observations`

| Field | Type | Rules |
|---|---|---|
| `id` | UUID | Primary key. |
| `race_id` | UUID | Canonical race. |
| `provider`, `source_url`, `source_identifier` | text | Provider-independent provenance. |
| `retrieved_at`, `provider_updated_at` | timestamp | Observation timing. |
| `status` | result enum | Observed finality. |
| `programme_date`, `course`, `scheduled_at`, `race_number`, `race_name` | identity evidence | Raw observation facts. |
| `finishing_order`, `non_runners` | JSONB | Minimal structured runner evidence. Each finalized finishing row may carry `finalizedStartingPriceRaw`; every automatically confirmed winner must carry it. |
| `payload_hash`, `sanitized_fragment` | evidence | Hash plus bounded relevant content. |
| `match_evidence` | JSONB | Per-dimension values and conflicts. |
| `confidence` | numeric | 0–1 aid; threshold alone never overrides required dimensions. |
| `created_at` | timestamp | Immutable. |

The finalized ATR winner price is both result evidence and payout authority. Settlement matches the selected runner to its position-one row, converts fractional or evens SP to an exact decimal multiplier, and records the raw value, multiplier, divisor, and calculation in the bet and immutable payout ledger metadata. Missing or malformed winner prices abort settlement without a wallet mutation.

## `race_results`

| Field | Type | Rules |
|---|---|---|
| `id`, `race_id` | UUID | One current result record per race. |
| `status` | result enum | Pending/provisional/confirmed/void/review. |
| `winner_runner_ids` | UUID array | Supports dead heat; every ID must belong to race. |
| `non_runner_ids` | UUID array | Confirmed non-runners only. |
| `joint_winner_count` | integer | Equals winner array length for confirmed result. |
| `observation_id` | UUID nullable | Source evidence. |
| `confirmed_by`, `confirmation_reason`, `confirmed_at` | audit fields | Manual confirmation requires actor and reason. |
| `version` | integer | Increments on correction. |
| `metadata` | JSONB | Match and correction evidence. |

## `settlement_runs`

| Field | Type | Rules |
|---|---|---|
| `id` | UUID | Primary key. |
| `race_id`, `result_id`, `result_version` | identity | Unique together for a settlement event. |
| `state` | settlement enum | Lifecycle. |
| `started_at`, `completed_at` | timestamp | Server times. |
| `initiated_by` | UUID nullable | Admin or system. |
| `reason`, `metadata`, `error_code` | audit fields | Redacted and bounded. |

## `admin_audit_events`

Immutable record of setting changes, wallet adjustments, result confirmation, race voids, retry requests, and corrections. Contains actor, action, entity type/id, required reason, before/after safe JSON, request identity, and server timestamp. Email and secrets are prohibited.

## Public leaderboard

A security-invoker view or narrowly scoped RPC aggregates chosen `display_name`, avatar, wallet balance, sum of non-opening ledger amounts as net result, won bets, and total bets. It never exposes profile email, raw ledger rows, user auth metadata, or admin notes.

## Indexes

- races by `(programme_date, state, official_off_at)` and `next_result_check_at`;
- runners by race and normalized name;
- snapshots by `(race_id, runner_id, market_type, observed_at desc)`;
- bets by `(user_id, accepted_at desc)`, `(race_id, state)`, and unique idempotency;
- ledger by `(user_id, created_at desc)` and causal IDs;
- observations by `(race_id, retrieved_at desc)`;
- audits by `(entity_type, entity_id, created_at desc)`.
