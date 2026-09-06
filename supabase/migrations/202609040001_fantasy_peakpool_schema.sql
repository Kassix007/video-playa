create extension if not exists pgcrypto with schema extensions;

create schema if not exists private;
revoke all on schema private from public, anon, authenticated;

create type public.app_role as enum ('player', 'admin');
create type public.fantasy_race_state as enum ('UPCOMING', 'OPEN', 'CLOSED', 'RESULT_PENDING', 'SETTLED', 'VOID', 'NEEDS_REVIEW');
create type public.fantasy_result_state as enum ('PENDING', 'PROVISIONAL', 'CONFIRMED', 'VOID', 'NEEDS_REVIEW');
create type public.fantasy_bet_state as enum ('PENDING', 'WON', 'LOST', 'VOID');
create type public.fantasy_market_type as enum ('WIN');
create type public.fantasy_wallet_transaction_type as enum ('OPENING_BALANCE', 'ADMIN_ADJUSTMENT', 'BET_STAKE', 'BET_PAYOUT', 'BET_REFUND', 'SETTLEMENT_REVERSAL');
create type public.fantasy_settlement_state as enum ('STARTED', 'COMPLETED', 'FAILED', 'REVERSED');

create table public.profiles (
  id uuid primary key references auth.users(id) on delete cascade,
  role public.app_role not null default 'player',
  display_name text not null check (char_length(display_name) between 1 and 80),
  avatar_url text check (avatar_url is null or (char_length(avatar_url) <= 500 and avatar_url ~ '^https://')),
  created_at timestamptz not null default clock_timestamp(),
  updated_at timestamptz not null default clock_timestamp()
);

create table public.game_settings (
  id boolean primary key default true check (id),
  betting_enabled boolean not null default false,
  default_starting_balance numeric(18,2) not null default 1000.00 check (default_starting_balance >= 0),
  minimum_stake numeric(18,2) not null default 1.00 check (minimum_stake > 0),
  maximum_stake numeric(18,2) check (maximum_stake is null or maximum_stake >= minimum_stake),
  close_buffer_seconds integer not null default 60 check (close_buffer_seconds between 0 and 3600),
  max_quote_age_seconds integer not null default 120 check (max_quote_age_seconds between 1 and 3600),
  result_check_initial_delay_seconds integer not null default 300 check (result_check_initial_delay_seconds between 0 and 86400),
  result_check_max_age_seconds integer not null default 43200 check (result_check_max_age_seconds between 300 and 604800),
  result_confirmation_required text not null default 'WEIGHED_IN' check (char_length(result_confirmation_required) between 1 and 40),
  version bigint not null default 1 check (version > 0),
  updated_at timestamptz not null default clock_timestamp(),
  updated_by uuid references auth.users(id)
);

insert into public.game_settings(id) values (true);

create table public.wallets (
  id uuid primary key default gen_random_uuid(),
  user_id uuid not null unique references public.profiles(id) on delete cascade,
  balance numeric(18,2) not null check (balance >= 0),
  version bigint not null default 1 check (version > 0),
  created_at timestamptz not null default clock_timestamp(),
  updated_at timestamptz not null default clock_timestamp()
);

create table public.source_payloads (
  sha256 text primary key check (sha256 ~ '^[a-f0-9]{64}$'),
  source_url text not null check (char_length(source_url) between 1 and 1000),
  retrieved_at timestamptz not null,
  byte_length integer not null check (byte_length between 1 and 20000000),
  content_type text check (content_type is null or char_length(content_type) <= 200),
  raw_body text check (raw_body is null or octet_length(raw_body) <= 1000000),
  created_at timestamptz not null default clock_timestamp()
);

create table public.race_events (
  id uuid primary key default gen_random_uuid(),
  source text not null default 'smspariaz_daily_racecard' check (source = 'smspariaz_daily_racecard'),
  programme_date date not null,
  external_race_id text not null check (external_race_id ~ '^R[1-9][0-9]*C[1-9][0-9]*$'),
  meeting_number integer not null check (meeting_number > 0),
  race_number integer not null check (race_number > 0),
  racecourse text not null check (char_length(racecourse) between 1 and 200),
  normalized_racecourse text not null check (char_length(normalized_racecourse) between 1 and 200),
  race_name text check (race_name is null or char_length(race_name) <= 300),
  discipline text check (discipline is null or char_length(discipline) <= 100),
  distance text check (distance is null or char_length(distance) <= 100),
  official_off_at timestamptz not null,
  accepted_off_at timestamptz,
  state public.fantasy_race_state not null default 'UPCOMING',
  racecard_observed_at timestamptz not null,
  racecard_payload_hash text check (racecard_payload_hash is null or racecard_payload_hash ~ '^[a-f0-9]{64}$'),
  next_result_check_at timestamptz,
  automatic_check_until timestamptz,
  result_check_attempts integer not null default 0 check (result_check_attempts >= 0),
  result_check_claimed_at timestamptz,
  created_at timestamptz not null default clock_timestamp(),
  updated_at timestamptz not null default clock_timestamp(),
  unique (source, programme_date, external_race_id)
);

create index race_events_programme_state_idx on public.race_events(programme_date, state, official_off_at);
create index race_events_result_check_idx on public.race_events(next_result_check_at) where state in ('CLOSED', 'RESULT_PENDING', 'NEEDS_REVIEW');

create table public.race_runners (
  id uuid primary key default gen_random_uuid(),
  race_id uuid not null references public.race_events(id) on delete cascade,
  runner_number integer not null check (runner_number >= 0),
  runner_name text not null check (char_length(runner_name) between 1 and 300),
  normalized_runner_name text not null check (char_length(normalized_runner_name) between 1 and 300),
  active boolean not null default true,
  source_selection_code text not null check (source_selection_code ~ '^R[1-9][0-9]*C[1-9][0-9]*H[0-9]+$'),
  created_at timestamptz not null default clock_timestamp(),
  updated_at timestamptz not null default clock_timestamp(),
  unique (race_id, runner_number)
);

create index race_runners_name_idx on public.race_runners(race_id, normalized_runner_name);

create table public.odds_snapshots (
  id uuid primary key default gen_random_uuid(),
  race_id uuid not null references public.race_events(id) on delete cascade,
  runner_id uuid not null references public.race_runners(id) on delete cascade,
  market_type public.fantasy_market_type not null default 'WIN',
  raw_price text not null check (char_length(raw_price) between 1 and 100),
  normalized_price numeric(18,2) check (normalized_price is null or normalized_price > 0),
  normalization_rule text check (normalization_rule is null or char_length(normalization_rule) <= 100),
  availability_reason text check (availability_reason is null or char_length(availability_reason) <= 100),
  source text not null check (char_length(source) between 1 and 1000),
  source_payload_hash text not null references public.source_payloads(sha256),
  observed_at timestamptz not null,
  valid_until timestamptz,
  is_valid boolean not null default false,
  created_at timestamptz not null default clock_timestamp(),
  check (not is_valid or (normalized_price is not null and normalization_rule is not null and valid_until is not null)),
  unique (runner_id, market_type, source_payload_hash)
);

create index odds_snapshots_current_idx on public.odds_snapshots(race_id, runner_id, market_type, observed_at desc);

create table public.bets (
  id uuid primary key default gen_random_uuid(),
  user_id uuid not null references public.profiles(id),
  wallet_id uuid not null references public.wallets(id),
  race_id uuid not null references public.race_events(id),
  runner_id uuid not null references public.race_runners(id),
  market_type public.fantasy_market_type not null default 'WIN',
  stake numeric(18,2) not null check (stake > 0),
  locked_price numeric(18,2) not null check (locked_price > 0),
  locked_raw_price text not null check (char_length(locked_raw_price) between 1 and 100),
  quote_observed_at timestamptz not null,
  quote_source text not null,
  quote_payload_hash text not null check (quote_payload_hash ~ '^[a-f0-9]{64}$'),
  odds_snapshot_id uuid not null references public.odds_snapshots(id),
  potential_gross_return numeric(18,2) not null check (potential_gross_return >= 0),
  idempotency_key uuid not null,
  state public.fantasy_bet_state not null default 'PENDING',
  accepted_at timestamptz not null default clock_timestamp(),
  settled_at timestamptz,
  result_metadata jsonb not null default '{}'::jsonb,
  unique (user_id, idempotency_key)
);

create index bets_user_history_idx on public.bets(user_id, accepted_at desc);
create index bets_race_state_idx on public.bets(race_id, state);

create table public.result_observations (
  id uuid primary key default gen_random_uuid(),
  race_id uuid not null references public.race_events(id) on delete cascade,
  provider text not null check (char_length(provider) between 1 and 100),
  source_url text not null check (char_length(source_url) between 1 and 1000),
  source_identifier text check (source_identifier is null or char_length(source_identifier) <= 500),
  retrieved_at timestamptz not null,
  provider_updated_at timestamptz,
  status public.fantasy_result_state not null,
  programme_date date not null,
  course text not null,
  scheduled_at timestamptz,
  race_number integer,
  race_name text,
  finishing_order jsonb not null default '[]'::jsonb check (jsonb_typeof(finishing_order) = 'array'),
  non_runners jsonb not null default '[]'::jsonb check (jsonb_typeof(non_runners) = 'array'),
  payload_hash text not null check (payload_hash ~ '^[a-f0-9]{64}$'),
  sanitized_fragment text check (sanitized_fragment is null or octet_length(sanitized_fragment) <= 20000),
  match_evidence jsonb not null default '{}'::jsonb,
  confidence numeric(5,4) not null default 0 check (confidence between 0 and 1),
  created_at timestamptz not null default clock_timestamp(),
  unique (provider, race_id, payload_hash)
);

create index result_observations_race_idx on public.result_observations(race_id, retrieved_at desc);

create table public.race_results (
  id uuid primary key default gen_random_uuid(),
  race_id uuid not null references public.race_events(id),
  version integer not null check (version > 0),
  status public.fantasy_result_state not null,
  winner_runner_ids uuid[] not null default '{}',
  non_runner_ids uuid[] not null default '{}',
  joint_winner_count integer not null default 0 check (joint_winner_count >= 0),
  observation_id uuid references public.result_observations(id),
  confirmed_by uuid references auth.users(id),
  confirmation_reason text,
  confirmed_at timestamptz,
  metadata jsonb not null default '{}'::jsonb,
  created_at timestamptz not null default clock_timestamp(),
  unique (race_id, version),
  check ((status = 'CONFIRMED' and joint_winner_count = cardinality(winner_runner_ids) and joint_winner_count > 0) or status <> 'CONFIRMED')
);

create table public.settlement_runs (
  id uuid primary key default gen_random_uuid(),
  race_id uuid not null references public.race_events(id),
  result_id uuid not null references public.race_results(id),
  result_version integer not null,
  state public.fantasy_settlement_state not null default 'STARTED',
  started_at timestamptz not null default clock_timestamp(),
  completed_at timestamptz,
  initiated_by uuid references auth.users(id),
  reason text,
  metadata jsonb not null default '{}'::jsonb,
  error_code text,
  unique (race_id, result_id, result_version)
);

create table public.admin_audit_events (
  id uuid primary key default gen_random_uuid(),
  actor_id uuid references auth.users(id),
  action text not null check (char_length(action) between 1 and 100),
  entity_type text not null check (char_length(entity_type) between 1 and 100),
  entity_id uuid,
  reason text not null check (char_length(btrim(reason)) between 3 and 1000),
  before_data jsonb not null default '{}'::jsonb,
  after_data jsonb not null default '{}'::jsonb,
  idempotency_key uuid,
  created_at timestamptz not null default clock_timestamp(),
  unique (actor_id, action, idempotency_key)
);

create index admin_audit_entity_idx on public.admin_audit_events(entity_type, entity_id, created_at desc);

create table public.wallet_transactions (
  id uuid primary key default gen_random_uuid(),
  wallet_id uuid not null references public.wallets(id),
  user_id uuid not null references public.profiles(id),
  type public.fantasy_wallet_transaction_type not null,
  amount numeric(18,2) not null check (amount <> 0),
  balance_after numeric(18,2) not null,
  bet_id uuid references public.bets(id),
  settlement_run_id uuid references public.settlement_runs(id),
  admin_audit_id uuid references public.admin_audit_events(id),
  reason text,
  metadata jsonb not null default '{}'::jsonb,
  created_by uuid references auth.users(id),
  created_at timestamptz not null default clock_timestamp()
);

create unique index wallet_opening_once_idx on public.wallet_transactions(wallet_id) where type = 'OPENING_BALANCE';
create unique index wallet_bet_stake_once_idx on public.wallet_transactions(bet_id) where type = 'BET_STAKE';
create unique index wallet_bet_settlement_once_idx on public.wallet_transactions(bet_id, settlement_run_id, type) where type in ('BET_PAYOUT', 'BET_REFUND', 'SETTLEMENT_REVERSAL');
create index wallet_transactions_user_idx on public.wallet_transactions(user_id, created_at desc);
