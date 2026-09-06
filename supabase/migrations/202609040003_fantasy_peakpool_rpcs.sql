create or replace function private.handle_fantasy_user_created()
returns trigger
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_wallet_id uuid;
  v_starting numeric(18,2);
  v_display text;
  v_avatar text;
begin
  if coalesce(new.raw_app_meta_data ->> 'provider', '') <> 'google' then
    raise exception using errcode = 'P0001', message = 'GOOGLE_AUTH_REQUIRED';
  end if;

  v_display := left(coalesce(
    nullif(btrim(new.raw_user_meta_data ->> 'full_name'), ''),
    nullif(btrim(new.raw_user_meta_data ->> 'name'), ''),
    'Player ' || left(new.id::text, 8)
  ), 80);
  v_avatar := nullif(btrim(new.raw_user_meta_data ->> 'avatar_url'), '');
  if v_avatar is not null and (v_avatar !~ '^https://' or char_length(v_avatar) > 500) then
    v_avatar := null;
  end if;

  insert into public.profiles(id, role, display_name, avatar_url)
  values (new.id, 'player', v_display, v_avatar)
  on conflict (id) do nothing;

  select default_starting_balance into v_starting from public.game_settings where id = true;
  insert into public.wallets(user_id, balance)
  values (new.id, v_starting)
  on conflict (user_id) do nothing
  returning id into v_wallet_id;

  if v_wallet_id is not null then
    insert into public.wallet_transactions(wallet_id, user_id, type, amount, balance_after, reason, metadata)
    values (v_wallet_id, new.id, 'OPENING_BALANCE', v_starting, v_starting,
      'Configured fantasy opening balance', jsonb_build_object('settings_balance', v_starting));
  end if;
  return new;
end;
$$;

create trigger on_auth_user_created_fantasy
after insert on auth.users
for each row execute function private.handle_fantasy_user_created();

create or replace function private.require_fantasy_admin()
returns uuid
language plpgsql
security definer
set search_path = ''
as $$
declare v_actor uuid := (select auth.uid());
begin
  if v_actor is null or not (select private.is_admin()) then
    raise exception using errcode = '42501', message = 'ADMIN_REQUIRED';
  end if;
  return v_actor;
end;
$$;

create or replace function private.normalized_identity(p_value text)
returns text
language sql
immutable
set search_path = ''
as $$
  select lower(regexp_replace(coalesce(p_value, ''), '[^a-zA-Z0-9]+', '', 'g'));
$$;

create or replace function public.place_fantasy_bet(
  p_runner_id uuid,
  p_odds_snapshot_id uuid,
  p_stake numeric,
  p_expected_price numeric,
  p_idempotency_key uuid
)
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_user uuid := (select auth.uid());
  v_wallet public.wallets%rowtype;
  v_settings public.game_settings%rowtype;
  v_snapshot public.odds_snapshots%rowtype;
  v_race public.race_events%rowtype;
  v_runner public.race_runners%rowtype;
  v_existing public.bets%rowtype;
  v_bet public.bets%rowtype;
  v_now timestamptz := clock_timestamp();
  v_new_balance numeric(18,2);
  v_receipt_balance numeric(18,2);
begin
  if v_user is null then raise exception using errcode = '42501', message = 'AUTH_REQUIRED'; end if;
  if p_idempotency_key is null then raise exception using errcode = '22023', message = 'BET_CONFLICT'; end if;

  select * into v_wallet from public.wallets where user_id = v_user for update;
  if not found then raise exception using errcode = 'P0001', message = 'PLAYER_NOT_INITIALIZED'; end if;

  select * into v_existing from public.bets where user_id = v_user and idempotency_key = p_idempotency_key;
  if found then
    if v_existing.runner_id <> p_runner_id or v_existing.odds_snapshot_id <> p_odds_snapshot_id
      or v_existing.stake <> p_stake or v_existing.locked_price <> p_expected_price then
      raise exception using errcode = '23505', message = 'BET_CONFLICT';
    end if;
    select balance_after into v_receipt_balance from public.wallet_transactions
    where bet_id = v_existing.id and type = 'BET_STAKE';
    return jsonb_build_object(
      'bet_id', v_existing.id, 'stake', v_existing.stake, 'locked_price', v_existing.locked_price,
      'potential_gross_return', v_existing.potential_gross_return, 'new_balance', v_receipt_balance,
      'accepted_at', v_existing.accepted_at, 'idempotent_replay', true
    );
  end if;

  select * into v_settings from public.game_settings where id = true for update;
  if not v_settings.betting_enabled then raise exception using errcode = 'P0001', message = 'BETTING_DISABLED'; end if;
  if p_stake is null or p_stake <= 0 or p_stake <> round(p_stake, 2) then
    raise exception using errcode = '22023', message = 'INVALID_STAKE';
  end if;
  if p_stake < v_settings.minimum_stake then raise exception using errcode = 'P0001', message = 'STAKE_BELOW_MINIMUM'; end if;
  if v_settings.maximum_stake is not null and p_stake > v_settings.maximum_stake then
    raise exception using errcode = 'P0001', message = 'STAKE_ABOVE_MAXIMUM';
  end if;
  if v_wallet.balance < p_stake then raise exception using errcode = 'P0001', message = 'INSUFFICIENT_BALANCE'; end if;

  select * into v_runner from public.race_runners where id = p_runner_id;
  if not found or not v_runner.active then raise exception using errcode = 'P0001', message = 'RUNNER_UNAVAILABLE'; end if;
  select * into v_race from public.race_events where id = v_runner.race_id for update;
  if not found or v_race.state not in ('OPEN', 'UPCOMING') then raise exception using errcode = 'P0001', message = 'RACE_UNAVAILABLE'; end if;
  if v_now >= v_race.official_off_at - make_interval(secs => v_settings.close_buffer_seconds) then
    raise exception using errcode = 'P0001', message = 'RACE_CLOSED';
  end if;

  select * into v_snapshot from public.odds_snapshots where id = p_odds_snapshot_id;
  if not found or v_snapshot.runner_id <> p_runner_id or v_snapshot.race_id <> v_race.id
    or v_snapshot.market_type <> 'WIN' or not v_snapshot.is_valid or v_snapshot.normalized_price is null then
    raise exception using errcode = 'P0001', message = 'QUOTE_UNAVAILABLE';
  end if;
  if v_snapshot.valid_until is null or v_now > v_snapshot.valid_until
    or v_now - v_snapshot.observed_at > make_interval(secs => v_settings.max_quote_age_seconds) then
    raise exception using errcode = 'P0001', message = 'QUOTE_STALE';
  end if;
  if p_expected_price is null or p_expected_price <> v_snapshot.normalized_price then
    raise exception using errcode = 'P0001', message = 'PRICE_CHANGED';
  end if;

  v_new_balance := v_wallet.balance - p_stake;
  insert into public.bets(
    user_id, wallet_id, race_id, runner_id, market_type, stake, locked_price, locked_raw_price,
    quote_observed_at, quote_source, quote_payload_hash, odds_snapshot_id, potential_gross_return,
    idempotency_key, accepted_at
  ) values (
    v_user, v_wallet.id, v_race.id, v_runner.id, 'WIN', p_stake, v_snapshot.normalized_price,
    v_snapshot.raw_price, v_snapshot.observed_at, v_snapshot.source, v_snapshot.source_payload_hash,
    v_snapshot.id, round(p_stake * v_snapshot.normalized_price, 2), p_idempotency_key, v_now
  ) returning * into v_bet;

  update public.wallets set balance = v_new_balance, version = version + 1, updated_at = v_now where id = v_wallet.id;
  insert into public.wallet_transactions(wallet_id, user_id, type, amount, balance_after, bet_id, metadata, created_by, created_at)
  values (v_wallet.id, v_user, 'BET_STAKE', -p_stake, v_new_balance, v_bet.id,
    jsonb_build_object('odds_snapshot_id', v_snapshot.id, 'locked_price', v_snapshot.normalized_price), v_user, v_now);
  update public.race_events set accepted_off_at = coalesce(accepted_off_at, official_off_at), updated_at = v_now where id = v_race.id;

  return jsonb_build_object(
    'bet_id', v_bet.id, 'stake', v_bet.stake, 'locked_price', v_bet.locked_price,
    'potential_gross_return', v_bet.potential_gross_return, 'new_balance', v_new_balance,
    'accepted_at', v_bet.accepted_at, 'idempotent_replay', false
  );
end;
$$;

create or replace function public.ingest_fantasy_peakpool_snapshot(p_payload jsonb)
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_payload jsonb := p_payload -> 'payload';
  v_race jsonb;
  v_runner jsonb;
  v_race_id uuid;
  v_runner_id uuid;
  v_race_count integer := 0;
  v_runner_count integer := 0;
  v_valid_count integer := 0;
  v_observed timestamptz;
  v_hash text;
  v_state public.fantasy_race_state;
begin
  if p_payload is null or jsonb_typeof(p_payload -> 'races') <> 'array' then
    raise exception using errcode = '22023', message = 'INVALID_INGESTION_PAYLOAD';
  end if;
  v_hash := v_payload ->> 'sha256';
  v_observed := (v_payload ->> 'observed_at')::timestamptz;
  insert into public.source_payloads(sha256, source_url, retrieved_at, byte_length, content_type, raw_body)
  values (v_hash, v_payload ->> 'source_url', v_observed, (v_payload ->> 'byte_length')::integer,
    v_payload ->> 'content_type', v_payload ->> 'raw_body')
  on conflict (sha256) do nothing;

  for v_race in select value from jsonb_array_elements(p_payload -> 'races') loop
    v_state := case
      when (v_race ->> 'official_off_at')::timestamptz > clock_timestamp() then 'OPEN'::public.fantasy_race_state
      else 'CLOSED'::public.fantasy_race_state end;
    insert into public.race_events(
      programme_date, external_race_id, meeting_number, race_number, racecourse, normalized_racecourse,
      race_name, discipline, distance, official_off_at, state, racecard_observed_at, racecard_payload_hash,
      next_result_check_at, automatic_check_until
    ) values (
      (v_race ->> 'programme_date')::date, v_race ->> 'external_race_id',
      (v_race ->> 'meeting_number')::integer, (v_race ->> 'race_number')::integer,
      v_race ->> 'racecourse', private.normalized_identity(v_race ->> 'racecourse'), nullif(v_race ->> 'race_name', ''),
      nullif(v_race ->> 'discipline', ''), nullif(v_race ->> 'distance', ''),
      (v_race ->> 'official_off_at')::timestamptz, v_state, (v_race ->> 'racecard_observed_at')::timestamptz,
      nullif(v_race ->> 'racecard_payload_hash', ''),
      (v_race ->> 'official_off_at')::timestamptz + interval '5 minutes',
      (v_race ->> 'official_off_at')::timestamptz + interval '12 hours'
    ) on conflict (source, programme_date, external_race_id) do update set
      racecourse = excluded.racecourse, normalized_racecourse = excluded.normalized_racecourse,
      race_name = excluded.race_name, discipline = excluded.discipline, distance = excluded.distance,
      official_off_at = excluded.official_off_at, racecard_observed_at = excluded.racecard_observed_at,
      racecard_payload_hash = excluded.racecard_payload_hash,
      state = case when race_events.state = 'OPEN' then excluded.state else race_events.state end,
      updated_at = clock_timestamp()
    returning id into v_race_id;
    v_race_count := v_race_count + 1;

    for v_runner in select value from jsonb_array_elements(coalesce(v_race -> 'runners', '[]'::jsonb)) loop
      insert into public.race_runners(race_id, runner_number, runner_name, normalized_runner_name, active, source_selection_code)
      values (v_race_id, (v_runner ->> 'runner_number')::integer, v_runner ->> 'name',
        private.normalized_identity(v_runner ->> 'name'), true,
        (v_race ->> 'external_race_id') || 'H' || (v_runner ->> 'runner_number'))
      on conflict (race_id, runner_number) do update set
        runner_name = excluded.runner_name, normalized_runner_name = excluded.normalized_runner_name, updated_at = clock_timestamp()
      returning id into v_runner_id;

      insert into public.odds_snapshots(
        race_id, runner_id, market_type, raw_price, normalized_price, normalization_rule,
        availability_reason, source, source_payload_hash, observed_at, valid_until, is_valid
      ) values (
        v_race_id, v_runner_id, 'WIN', v_runner ->> 'raw_price',
        nullif(v_runner ->> 'normalized_price', '')::numeric,
        nullif(v_runner ->> 'normalization_rule', ''), nullif(v_runner ->> 'availability_reason', ''),
        v_payload ->> 'source_url', v_hash, v_observed,
        nullif(v_runner ->> 'valid_until', '')::timestamptz, coalesce((v_runner ->> 'is_valid')::boolean, false)
      ) on conflict (runner_id, market_type, source_payload_hash) do nothing;
      v_runner_count := v_runner_count + 1;
      if coalesce((v_runner ->> 'is_valid')::boolean, false) then v_valid_count := v_valid_count + 1; end if;
    end loop;
  end loop;
  return jsonb_build_object('races', v_race_count, 'runners', v_runner_count, 'valid_prices', v_valid_count, 'payload_sha256', v_hash);
end;
$$;

create or replace function private.settle_fantasy_race(
  p_result_id uuid,
  p_actor uuid,
  p_reason text
)
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_result public.race_results%rowtype;
  v_race public.race_events%rowtype;
  v_run public.settlement_runs%rowtype;
  v_bet public.bets%rowtype;
  v_wallet public.wallets%rowtype;
  v_credit numeric(18,2);
  v_new_balance numeric(18,2);
  v_won integer := 0;
  v_lost integer := 0;
  v_void integer := 0;
begin
  select * into v_result from public.race_results where id = p_result_id;
  if not found then raise exception using errcode = 'P0001', message = 'RESULT_NOT_FOUND'; end if;
  select * into v_race from public.race_events where id = v_result.race_id for update;
  select * into v_run from public.settlement_runs
    where race_id = v_result.race_id and result_id = v_result.id and result_version = v_result.version;
  if found and v_run.state = 'COMPLETED' then
    return v_run.metadata || jsonb_build_object('idempotent_replay', true, 'settlement_run_id', v_run.id);
  end if;
  if not found then
    insert into public.settlement_runs(race_id, result_id, result_version, initiated_by, reason)
    values (v_result.race_id, v_result.id, v_result.version, p_actor, p_reason) returning * into v_run;
  end if;

  for v_bet in select * from public.bets where race_id = v_result.race_id and state = 'PENDING' order by user_id, accepted_at for update loop
    select * into v_wallet from public.wallets where id = v_bet.wallet_id for update;
    if v_result.status = 'VOID' or v_bet.runner_id = any(v_result.non_runner_ids) then
      v_credit := v_bet.stake;
      v_new_balance := v_wallet.balance + v_credit;
      update public.wallets set balance = v_new_balance, version = version + 1, updated_at = clock_timestamp() where id = v_wallet.id;
      insert into public.wallet_transactions(wallet_id, user_id, type, amount, balance_after, bet_id, settlement_run_id, reason, metadata, created_by)
      values (v_wallet.id, v_bet.user_id, 'BET_REFUND', v_credit, v_new_balance, v_bet.id, v_run.id, p_reason,
        jsonb_build_object('result_id', v_result.id, 'result_version', v_result.version), p_actor);
      update public.bets set state = 'VOID', settled_at = clock_timestamp(), result_metadata = jsonb_build_object('result_id', v_result.id) where id = v_bet.id;
      v_void := v_void + 1;
    elsif v_result.status = 'CONFIRMED' and v_bet.runner_id = any(v_result.winner_runner_ids) then
      v_credit := round(v_bet.stake * v_bet.locked_price / v_result.joint_winner_count, 2);
      v_new_balance := v_wallet.balance + v_credit;
      update public.wallets set balance = v_new_balance, version = version + 1, updated_at = clock_timestamp() where id = v_wallet.id;
      insert into public.wallet_transactions(wallet_id, user_id, type, amount, balance_after, bet_id, settlement_run_id, reason, metadata, created_by)
      values (v_wallet.id, v_bet.user_id, 'BET_PAYOUT', v_credit, v_new_balance, v_bet.id, v_run.id, p_reason,
        jsonb_build_object('locked_price', v_bet.locked_price, 'joint_winner_count', v_result.joint_winner_count,
          'calculation', v_bet.stake || ' x ' || v_bet.locked_price || ' / ' || v_result.joint_winner_count), p_actor);
      update public.bets set state = 'WON', settled_at = clock_timestamp(), result_metadata = jsonb_build_object('result_id', v_result.id, 'divisor', v_result.joint_winner_count, 'gross_return', v_credit) where id = v_bet.id;
      v_won := v_won + 1;
    else
      update public.bets set state = 'LOST', settled_at = clock_timestamp(), result_metadata = jsonb_build_object('result_id', v_result.id) where id = v_bet.id;
      v_lost := v_lost + 1;
    end if;
  end loop;

  update public.race_events set state = case
      when v_result.status = 'VOID' then 'VOID'::public.fantasy_race_state
      else 'SETTLED'::public.fantasy_race_state
    end,
    updated_at = clock_timestamp() where id = v_result.race_id;
  update public.settlement_runs set state = 'COMPLETED', completed_at = clock_timestamp(),
    metadata = jsonb_build_object('won', v_won, 'lost', v_lost, 'void', v_void)
    where id = v_run.id returning * into v_run;
  return v_run.metadata || jsonb_build_object('idempotent_replay', false, 'settlement_run_id', v_run.id);
end;
$$;

create or replace function public.admin_adjust_wallet(
  p_user_id uuid,
  p_amount numeric,
  p_reason text,
  p_idempotency_key uuid
)
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_actor uuid := private.require_fantasy_admin();
  v_wallet public.wallets%rowtype;
  v_audit public.admin_audit_events%rowtype;
  v_new_balance numeric(18,2);
begin
  if p_amount is null or p_amount = 0 or p_amount <> round(p_amount, 2) then
    raise exception using errcode = '22023', message = 'INVALID_ADJUSTMENT';
  end if;
  if char_length(btrim(coalesce(p_reason, ''))) < 3 then raise exception using errcode = '22023', message = 'REASON_REQUIRED'; end if;
  select * into v_audit from public.admin_audit_events
    where actor_id = v_actor and action = 'WALLET_ADJUSTMENT' and idempotency_key = p_idempotency_key;
  if found then return v_audit.after_data || jsonb_build_object('idempotent_replay', true, 'audit_id', v_audit.id); end if;
  select * into v_wallet from public.wallets where user_id = p_user_id for update;
  if not found then raise exception using errcode = 'P0001', message = 'PLAYER_NOT_FOUND'; end if;
  v_new_balance := v_wallet.balance + p_amount;
  if v_new_balance < 0 then raise exception using errcode = 'P0001', message = 'NEGATIVE_BALANCE_REJECTED'; end if;
  insert into public.admin_audit_events(actor_id, action, entity_type, entity_id, reason, before_data, after_data, idempotency_key)
  values (v_actor, 'WALLET_ADJUSTMENT', 'wallet', v_wallet.id, btrim(p_reason),
    jsonb_build_object('balance', v_wallet.balance), jsonb_build_object('balance', v_new_balance, 'amount', p_amount), p_idempotency_key)
  returning * into v_audit;
  update public.wallets set balance = v_new_balance, version = version + 1, updated_at = clock_timestamp() where id = v_wallet.id;
  insert into public.wallet_transactions(wallet_id, user_id, type, amount, balance_after, admin_audit_id, reason, created_by)
  values (v_wallet.id, p_user_id, 'ADMIN_ADJUSTMENT', p_amount, v_new_balance, v_audit.id, btrim(p_reason), v_actor);
  return v_audit.after_data || jsonb_build_object('idempotent_replay', false, 'audit_id', v_audit.id);
end;
$$;

create or replace function public.admin_update_game_settings(
  p_betting_enabled boolean,
  p_default_starting_balance numeric,
  p_minimum_stake numeric,
  p_maximum_stake numeric,
  p_close_buffer_seconds integer,
  p_max_quote_age_seconds integer,
  p_result_check_initial_delay_seconds integer,
  p_result_check_max_age_seconds integer,
  p_reason text,
  p_idempotency_key uuid
)
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_actor uuid := private.require_fantasy_admin();
  v_before jsonb;
  v_after jsonb;
begin
  if char_length(btrim(coalesce(p_reason, ''))) < 3 then raise exception using errcode = '22023', message = 'REASON_REQUIRED'; end if;
  if p_default_starting_balance < 0 or p_minimum_stake <= 0 or p_default_starting_balance <> round(p_default_starting_balance, 2)
    or p_minimum_stake <> round(p_minimum_stake, 2) or (p_maximum_stake is not null and (p_maximum_stake < p_minimum_stake or p_maximum_stake <> round(p_maximum_stake, 2)))
    or p_close_buffer_seconds not between 0 and 3600 or p_max_quote_age_seconds not between 1 and 3600
    or p_result_check_initial_delay_seconds not between 0 and 86400 or p_result_check_max_age_seconds not between 300 and 604800 then
    raise exception using errcode = '22023', message = 'INVALID_GAME_SETTINGS';
  end if;
  select to_jsonb(s) into v_before from public.game_settings s where id = true for update;
  update public.game_settings set betting_enabled = p_betting_enabled,
    default_starting_balance = p_default_starting_balance, minimum_stake = p_minimum_stake,
    maximum_stake = p_maximum_stake, close_buffer_seconds = p_close_buffer_seconds,
    max_quote_age_seconds = p_max_quote_age_seconds,
    result_check_initial_delay_seconds = p_result_check_initial_delay_seconds,
    result_check_max_age_seconds = p_result_check_max_age_seconds,
    version = version + 1, updated_at = clock_timestamp(), updated_by = v_actor where id = true;
  select to_jsonb(s) into v_after from public.game_settings s where id = true;
  insert into public.admin_audit_events(actor_id, action, entity_type, reason, before_data, after_data, idempotency_key)
  values (v_actor, 'GAME_SETTINGS_UPDATE', 'game_settings', btrim(p_reason), v_before, v_after, p_idempotency_key)
  on conflict (actor_id, action, idempotency_key) do nothing;
  return v_after;
end;
$$;

create or replace function public.admin_confirm_race_result(
  p_race_id uuid,
  p_winner_runner_ids uuid[],
  p_non_runner_ids uuid[],
  p_observation_id uuid,
  p_reason text,
  p_idempotency_key uuid
)
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_actor uuid := private.require_fantasy_admin();
  v_result public.race_results%rowtype;
  v_version integer;
begin
  if char_length(btrim(coalesce(p_reason, ''))) < 3 or cardinality(p_winner_runner_ids) < 1 then
    raise exception using errcode = '22023', message = 'RESULT_REASON_AND_WINNER_REQUIRED';
  end if;
  if exists (select 1 from unnest(p_winner_runner_ids || coalesce(p_non_runner_ids, '{}')) runner_id
    where not exists (select 1 from public.race_runners rr where rr.id = runner_id and rr.race_id = p_race_id)) then
    raise exception using errcode = '22023', message = 'RESULT_RUNNER_MISMATCH';
  end if;
  perform 1 from public.race_events where id = p_race_id for update;
  if not found then raise exception using errcode = 'P0001', message = 'RACE_NOT_FOUND'; end if;
  select coalesce(max(version), 0) + 1 into v_version from public.race_results where race_id = p_race_id;
  insert into public.race_results(race_id, version, status, winner_runner_ids, non_runner_ids, joint_winner_count,
    observation_id, confirmed_by, confirmation_reason, confirmed_at, metadata)
  values (p_race_id, v_version, 'CONFIRMED', p_winner_runner_ids, coalesce(p_non_runner_ids, '{}'), cardinality(p_winner_runner_ids),
    p_observation_id, v_actor, btrim(p_reason), clock_timestamp(), jsonb_build_object('manual', true, 'idempotency_key', p_idempotency_key))
  returning * into v_result;
  insert into public.admin_audit_events(actor_id, action, entity_type, entity_id, reason, after_data, idempotency_key)
  values (v_actor, 'MANUAL_RESULT_CONFIRMATION', 'race', p_race_id, btrim(p_reason), to_jsonb(v_result), p_idempotency_key);
  return private.settle_fantasy_race(v_result.id, v_actor, btrim(p_reason));
end;
$$;

create or replace function public.admin_void_race(
  p_race_id uuid,
  p_reason text,
  p_idempotency_key uuid
)
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_actor uuid := private.require_fantasy_admin();
  v_result public.race_results%rowtype;
  v_version integer;
begin
  if char_length(btrim(coalesce(p_reason, ''))) < 3 then raise exception using errcode = '22023', message = 'REASON_REQUIRED'; end if;
  perform 1 from public.race_events where id = p_race_id for update;
  if not found then raise exception using errcode = 'P0001', message = 'RACE_NOT_FOUND'; end if;
  select coalesce(max(version), 0) + 1 into v_version from public.race_results where race_id = p_race_id;
  insert into public.race_results(race_id, version, status, confirmed_by, confirmation_reason, confirmed_at, metadata)
  values (p_race_id, v_version, 'VOID', v_actor, btrim(p_reason), clock_timestamp(), jsonb_build_object('manual', true)) returning * into v_result;
  insert into public.admin_audit_events(actor_id, action, entity_type, entity_id, reason, after_data, idempotency_key)
  values (v_actor, 'RACE_VOID', 'race', p_race_id, btrim(p_reason), to_jsonb(v_result), p_idempotency_key);
  return private.settle_fantasy_race(v_result.id, v_actor, btrim(p_reason));
end;
$$;

create or replace function public.admin_retry_result_check(p_race_id uuid, p_reason text, p_idempotency_key uuid)
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare v_actor uuid := private.require_fantasy_admin();
begin
  if char_length(btrim(coalesce(p_reason, ''))) < 3 then raise exception using errcode = '22023', message = 'REASON_REQUIRED'; end if;
  update public.race_events set next_result_check_at = clock_timestamp(), state = 'RESULT_PENDING', updated_at = clock_timestamp()
    where id = p_race_id and state in ('CLOSED', 'RESULT_PENDING', 'NEEDS_REVIEW');
  if not found then raise exception using errcode = 'P0001', message = 'RACE_NOT_RETRYABLE'; end if;
  insert into public.admin_audit_events(actor_id, action, entity_type, entity_id, reason, idempotency_key)
  values (v_actor, 'RESULT_CHECK_RETRY', 'race', p_race_id, btrim(p_reason), p_idempotency_key)
  on conflict (actor_id, action, idempotency_key) do nothing;
  return jsonb_build_object('race_id', p_race_id, 'queued', true);
end;
$$;

create or replace function public.admin_correct_race_result(
  p_race_id uuid,
  p_winner_runner_ids uuid[],
  p_non_runner_ids uuid[],
  p_observation_id uuid,
  p_reason text,
  p_idempotency_key uuid
)
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_actor uuid := private.require_fantasy_admin();
  v_previous_result public.race_results%rowtype;
  v_previous_run public.settlement_runs%rowtype;
  v_tx public.wallet_transactions%rowtype;
  v_wallet public.wallets%rowtype;
  v_new_balance numeric(18,2);
  v_result public.race_results%rowtype;
  v_version integer;
begin
  if char_length(btrim(coalesce(p_reason, ''))) < 3 or cardinality(p_winner_runner_ids) < 1 then
    raise exception using errcode = '22023', message = 'CORRECTION_REASON_AND_WINNER_REQUIRED';
  end if;
  perform 1 from public.race_events where id = p_race_id for update;
  if not found then raise exception using errcode = 'P0001', message = 'RACE_NOT_FOUND'; end if;
  if exists (select 1 from unnest(p_winner_runner_ids || coalesce(p_non_runner_ids, '{}')) runner_id
    where not exists (select 1 from public.race_runners rr where rr.id = runner_id and rr.race_id = p_race_id)) then
    raise exception using errcode = '22023', message = 'RESULT_RUNNER_MISMATCH';
  end if;
  select * into v_previous_result from public.race_results where race_id = p_race_id order by version desc limit 1;
  if not found then raise exception using errcode = 'P0001', message = 'NO_SETTLEMENT_TO_CORRECT'; end if;
  select * into v_previous_run from public.settlement_runs
    where result_id = v_previous_result.id and state = 'COMPLETED' order by completed_at desc limit 1 for update;
  if not found then raise exception using errcode = 'P0001', message = 'NO_SETTLEMENT_TO_CORRECT'; end if;

  for v_tx in select * from public.wallet_transactions
    where settlement_run_id = v_previous_run.id and type in ('BET_PAYOUT', 'BET_REFUND')
    order by user_id, created_at for update loop
    select * into v_wallet from public.wallets where id = v_tx.wallet_id for update;
    v_new_balance := v_wallet.balance - v_tx.amount;
    if v_new_balance < 0 then
      raise exception using errcode = 'P0001', message = 'CORRECTION_REQUIRES_BALANCE_REVIEW';
    end if;
    update public.wallets set balance = v_new_balance, version = version + 1, updated_at = clock_timestamp() where id = v_wallet.id;
    insert into public.wallet_transactions(wallet_id, user_id, type, amount, balance_after, bet_id, settlement_run_id, reason, metadata, created_by)
    values (v_wallet.id, v_tx.user_id, 'SETTLEMENT_REVERSAL', -v_tx.amount, v_new_balance, v_tx.bet_id,
      v_previous_run.id, btrim(p_reason), jsonb_build_object('reverses_transaction_id', v_tx.id), v_actor);
  end loop;
  update public.bets set state = 'PENDING', settled_at = null,
    result_metadata = jsonb_build_object('reversed_result_id', v_previous_result.id)
    where race_id = p_race_id;
  update public.settlement_runs set state = 'REVERSED',
    metadata = metadata || jsonb_build_object('reversed_at', clock_timestamp(), 'reason', btrim(p_reason))
    where id = v_previous_run.id;

  v_version := v_previous_result.version + 1;
  insert into public.race_results(race_id, version, status, winner_runner_ids, non_runner_ids, joint_winner_count,
    observation_id, confirmed_by, confirmation_reason, confirmed_at, metadata)
  values (p_race_id, v_version, 'CONFIRMED', p_winner_runner_ids, coalesce(p_non_runner_ids, '{}'),
    cardinality(p_winner_runner_ids), p_observation_id, v_actor, btrim(p_reason), clock_timestamp(),
    jsonb_build_object('manual_correction', true, 'replaces_result_id', v_previous_result.id))
  returning * into v_result;
  insert into public.admin_audit_events(actor_id, action, entity_type, entity_id, reason, before_data, after_data, idempotency_key)
  values (v_actor, 'RESULT_CORRECTION', 'race', p_race_id, btrim(p_reason), to_jsonb(v_previous_result), to_jsonb(v_result), p_idempotency_key);
  return private.settle_fantasy_race(v_result.id, v_actor, btrim(p_reason));
end;
$$;

create or replace function public.claim_fantasy_result_check_batch(p_limit integer default 20)
returns setof public.race_events
language plpgsql
security definer
set search_path = ''
as $$
begin
  if p_limit < 1 or p_limit > 20 then raise exception using errcode = '22023', message = 'INVALID_BATCH_LIMIT'; end if;
  return query
  with candidates as (
    select id from public.race_events
    where state in ('CLOSED', 'RESULT_PENDING', 'NEEDS_REVIEW')
      and next_result_check_at <= clock_timestamp()
      and automatic_check_until > clock_timestamp()
      and (result_check_claimed_at is null or result_check_claimed_at < clock_timestamp() - interval '5 minutes')
    order by next_result_check_at
    for update skip locked limit p_limit
  )
  update public.race_events r set
    state = 'RESULT_PENDING', result_check_claimed_at = clock_timestamp(),
    result_check_attempts = r.result_check_attempts + 1,
    next_result_check_at = clock_timestamp() + make_interval(mins => least(60, 5 * greatest(1, r.result_check_attempts + 1))),
    updated_at = clock_timestamp()
  from candidates c where r.id = c.id returning r.*;

  update public.race_events set state = 'NEEDS_REVIEW', updated_at = clock_timestamp()
  where state in ('CLOSED', 'RESULT_PENDING') and automatic_check_until <= clock_timestamp();
end;
$$;

create or replace function public.record_fantasy_result_observation(p_observation jsonb, p_decision jsonb)
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_observation public.result_observations%rowtype;
  v_result public.race_results%rowtype;
  v_race_id uuid := (p_observation ->> 'race_id')::uuid;
  v_status public.fantasy_result_state := (p_decision ->> 'status')::public.fantasy_result_state;
  v_winners uuid[] := array(select jsonb_array_elements_text(coalesce(p_decision -> 'winner_runner_ids', '[]'::jsonb))::uuid);
  v_non_runners uuid[] := array(select jsonb_array_elements_text(coalesce(p_decision -> 'non_runner_ids', '[]'::jsonb))::uuid);
  v_version integer;
begin
  insert into public.result_observations(
    race_id, provider, source_url, source_identifier, retrieved_at, provider_updated_at, status,
    programme_date, course, scheduled_at, race_number, race_name, finishing_order, non_runners,
    payload_hash, sanitized_fragment, match_evidence, confidence
  ) values (
    v_race_id, p_observation ->> 'provider', p_observation ->> 'source_url', nullif(p_observation ->> 'source_identifier', ''),
    (p_observation ->> 'retrieved_at')::timestamptz, nullif(p_observation ->> 'provider_updated_at', '')::timestamptz,
    (p_observation ->> 'status')::public.fantasy_result_state, (p_observation ->> 'programme_date')::date,
    p_observation ->> 'course', nullif(p_observation ->> 'scheduled_at', '')::timestamptz,
    nullif(p_observation ->> 'race_number', '')::integer, nullif(p_observation ->> 'race_name', ''),
    coalesce(p_observation -> 'finishing_order', '[]'::jsonb), coalesce(p_observation -> 'non_runners', '[]'::jsonb),
    p_observation ->> 'payload_hash', nullif(p_observation ->> 'sanitized_fragment', ''),
    coalesce(p_decision -> 'match_evidence', '{}'::jsonb), coalesce((p_decision ->> 'confidence')::numeric, 0)
  ) on conflict (provider, race_id, payload_hash) do nothing
  returning * into v_observation;
  if v_observation.id is null then
    select * into v_observation from public.result_observations
      where provider = p_observation ->> 'provider' and race_id = v_race_id and payload_hash = p_observation ->> 'payload_hash';
  end if;

  if v_status <> 'CONFIRMED' or cardinality(v_winners) < 1
    or not exists (
      select 1 from jsonb_array_elements(coalesce(p_observation -> 'finishing_order', '[]'::jsonb)) row
      where (row ->> 'position')::integer = 1
    )
    or cardinality(v_winners) <> (
      select count(*) from jsonb_array_elements(coalesce(p_observation -> 'finishing_order', '[]'::jsonb)) row
      where (row ->> 'position')::integer = 1
    )
    or exists (
      select 1 from jsonb_array_elements(coalesce(p_observation -> 'finishing_order', '[]'::jsonb)) row
      where (row ->> 'position')::integer = 1
        and coalesce(row ->> 'finalizedStartingPriceRaw', '') !~* '^(?:(?:[1-9][0-9]{0,3}/[1-9][0-9]{0,3})|(?:evs|evens))(?:[[:space:]]*(?:f|jf|[2-9]f))?$'
    ) then
    update public.race_events set state = 'NEEDS_REVIEW', result_check_claimed_at = null, updated_at = clock_timestamp() where id = v_race_id;
    return jsonb_build_object('observation_id', v_observation.id, 'settled', false, 'status', 'NEEDS_REVIEW');
  end if;
  if exists (select 1 from unnest(v_winners || v_non_runners) runner_id
    where not exists (select 1 from public.race_runners rr where rr.id = runner_id and rr.race_id = v_race_id)) then
    update public.race_events set state = 'NEEDS_REVIEW', result_check_claimed_at = null, updated_at = clock_timestamp() where id = v_race_id;
    return jsonb_build_object('observation_id', v_observation.id, 'settled', false, 'status', 'NEEDS_REVIEW');
  end if;
  select coalesce(max(version), 0) + 1 into v_version from public.race_results where race_id = v_race_id;
  insert into public.race_results(race_id, version, status, winner_runner_ids, non_runner_ids, joint_winner_count,
    observation_id, confirmation_reason, confirmed_at, metadata)
  values (v_race_id, v_version, 'CONFIRMED', v_winners, v_non_runners, cardinality(v_winners), v_observation.id,
    'Automatic evidence satisfied configured confirmation', clock_timestamp(), p_decision)
  returning * into v_result;
  return private.settle_fantasy_race(v_result.id, null, 'Automatic confirmed result');
end;
$$;

create or replace function public.get_fantasy_peakpool_bootstrap()
returns jsonb
language sql
stable
security definer
set search_path = ''
as $$
  select jsonb_build_object(
    'programme_date', timezone('Indian/Mauritius', clock_timestamp())::date,
    'settings', (select (to_jsonb(s) - 'updated_by') || jsonb_build_object(
      'default_starting_balance', s.default_starting_balance::text,
      'minimum_stake', s.minimum_stake::text,
      'maximum_stake', case when s.maximum_stake is null then null else to_jsonb(s.maximum_stake::text) end
    ) from public.game_settings s where id = true),
    'profile', (select jsonb_build_object('id', p.id, 'role', p.role, 'display_name', p.display_name, 'avatar_url', p.avatar_url)
      from public.profiles p where p.id = (select auth.uid())),
    'wallet', (select jsonb_build_object('balance', w.balance::text, 'version', w.version)
      from public.wallets w where w.user_id = (select auth.uid())),
    'races', coalesce((select jsonb_agg(jsonb_build_object(
      'id', r.id, 'external_race_id', r.external_race_id, 'meeting_number', r.meeting_number,
      'race_number', r.race_number, 'racecourse', r.racecourse, 'race_name', r.race_name,
      'official_off_at', r.official_off_at, 'state', r.state,
      'runners', coalesce((select jsonb_agg(jsonb_build_object(
        'id', rr.id, 'runner_number', rr.runner_number, 'runner_name', rr.runner_name,
        'raw_price', os.raw_price, 'normalized_price', os.normalized_price::text, 'odds_snapshot_id', os.id,
        'available', coalesce(os.is_valid, false), 'availability_reason', os.availability_reason
      ) order by rr.runner_number) from public.race_runners rr
      left join lateral (select o.* from public.odds_snapshots o where o.runner_id = rr.id order by o.observed_at desc limit 1) os on true
      where rr.race_id = r.id), '[]'::jsonb)
    ) order by r.meeting_number, r.race_number) from public.race_events r
      where r.programme_date = timezone('Indian/Mauritius', clock_timestamp())::date), '[]'::jsonb),
    'bets', case when (select auth.uid()) is null then '[]'::jsonb else coalesce((select jsonb_agg(to_jsonb(b) order by b.accepted_at desc)
      from (select b.id, b.race_id, b.runner_id, rr.runner_name,
        concat(r.racecourse, ' R', r.race_number) as race_label,
        b.stake::text as stake, b.locked_price::text as locked_price,
        b.potential_gross_return::text as potential_gross_return, b.state, b.accepted_at
        from public.bets b
        join public.race_events r on r.id = b.race_id
        join public.race_runners rr on rr.id = b.runner_id
        where b.user_id = (select auth.uid()) order by b.accepted_at desc limit 100) b), '[]'::jsonb) end,
    'ledger', case when (select auth.uid()) is null then '[]'::jsonb else coalesce((select jsonb_agg(to_jsonb(t) order by t.created_at desc)
      from (select id, type, amount::text as amount, balance_after::text as balance_after, reason, created_at
        from public.wallet_transactions where user_id = (select auth.uid()) order by created_at desc limit 100) t), '[]'::jsonb) end,
    'leaderboard', coalesce((select jsonb_agg(to_jsonb(l) order by l.rank)
      from (select rank, player, avatar_url, balance::text as balance,
        net_profit_loss::text as net_profit_loss, wins, bets
        from public.fantasy_leaderboard order by rank limit 100) l), '[]'::jsonb)
  );
$$;

create or replace function public.get_fantasy_peakpool_admin()
returns jsonb
language plpgsql
stable
security definer
set search_path = ''
as $$
begin
  perform private.require_fantasy_admin();
  return jsonb_build_object(
    'players', coalesce((select jsonb_agg(jsonb_build_object('id', p.id, 'display_name', p.display_name, 'role', p.role, 'balance', w.balance::text) order by p.display_name)
      from public.profiles p join public.wallets w on w.user_id = p.id), '[]'::jsonb),
    'bets', coalesce((select jsonb_agg(to_jsonb(b) order by b.accepted_at desc) from (select * from public.bets order by accepted_at desc limit 500) b), '[]'::jsonb),
    'races', coalesce((select jsonb_agg(to_jsonb(r) order by r.official_off_at desc) from (select * from public.race_events order by official_off_at desc limit 200) r), '[]'::jsonb),
    'observations', coalesce((select jsonb_agg(to_jsonb(o) order by o.retrieved_at desc) from (
      select id, race_id, provider, source_url, retrieved_at, status, programme_date, course,
        scheduled_at, race_number, race_name, finishing_order, non_runners, payload_hash,
        match_evidence, confidence
      from public.result_observations order by retrieved_at desc limit 500
    ) o), '[]'::jsonb),
    'audit', coalesce((select jsonb_agg(to_jsonb(a) order by a.created_at desc) from (select * from public.admin_audit_events order by created_at desc limit 500) a), '[]'::jsonb)
  );
end;
$$;

revoke all on function public.place_fantasy_bet(uuid, uuid, numeric, numeric, uuid) from public, anon;
grant execute on function public.place_fantasy_bet(uuid, uuid, numeric, numeric, uuid) to authenticated;
revoke all on function public.admin_adjust_wallet(uuid, numeric, text, uuid) from public, anon;
grant execute on function public.admin_adjust_wallet(uuid, numeric, text, uuid) to authenticated;
revoke all on function public.admin_update_game_settings(boolean, numeric, numeric, numeric, integer, integer, integer, integer, text, uuid) from public, anon;
grant execute on function public.admin_update_game_settings(boolean, numeric, numeric, numeric, integer, integer, integer, integer, text, uuid) to authenticated;
revoke all on function public.admin_confirm_race_result(uuid, uuid[], uuid[], uuid, text, uuid) from public, anon;
grant execute on function public.admin_confirm_race_result(uuid, uuid[], uuid[], uuid, text, uuid) to authenticated;
revoke all on function public.admin_void_race(uuid, text, uuid) from public, anon;
grant execute on function public.admin_void_race(uuid, text, uuid) to authenticated;
revoke all on function public.admin_retry_result_check(uuid, text, uuid) from public, anon;
grant execute on function public.admin_retry_result_check(uuid, text, uuid) to authenticated;
revoke all on function public.admin_correct_race_result(uuid, uuid[], uuid[], uuid, text, uuid) from public, anon;
grant execute on function public.admin_correct_race_result(uuid, uuid[], uuid[], uuid, text, uuid) to authenticated;
revoke all on function public.ingest_fantasy_peakpool_snapshot(jsonb) from public, anon, authenticated;
grant execute on function public.ingest_fantasy_peakpool_snapshot(jsonb) to service_role;
revoke all on function public.claim_fantasy_result_check_batch(integer) from public, anon, authenticated;
grant execute on function public.claim_fantasy_result_check_batch(integer) to service_role;
revoke all on function public.record_fantasy_result_observation(jsonb, jsonb) from public, anon, authenticated;
grant execute on function public.record_fantasy_result_observation(jsonb, jsonb) to service_role;
revoke all on function public.get_fantasy_peakpool_bootstrap() from public;
grant execute on function public.get_fantasy_peakpool_bootstrap() to anon, authenticated;
revoke all on function public.get_fantasy_peakpool_admin() from public, anon;
grant execute on function public.get_fantasy_peakpool_admin() to authenticated;
