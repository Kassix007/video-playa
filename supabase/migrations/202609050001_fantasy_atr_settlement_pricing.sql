-- Fantasy WIN selections are accepted without invented pre-race odds.
-- Winning payouts use the matched At The Races finalized starting price.

alter table public.bets alter column locked_price drop not null;
alter table public.bets alter column locked_raw_price drop not null;
alter table public.bets alter column quote_observed_at drop not null;
alter table public.bets alter column quote_source drop not null;
alter table public.bets alter column quote_payload_hash drop not null;
alter table public.bets alter column odds_snapshot_id drop not null;
alter table public.bets alter column potential_gross_return drop not null;

create or replace function private.atr_final_decimal_price(p_raw text)
returns numeric
language plpgsql
immutable
strict
set search_path = ''
as $$
declare
  v_price_text text := lower(btrim(p_raw));
  v_numerator numeric;
  v_denominator numeric;
begin
  if v_price_text !~ '^(?:(?:[1-9][0-9]{0,3}/[1-9][0-9]{0,3})|(?:evs|evens))(?:[[:space:]]*(?:f|jf|[2-9]f))?$' then
    return null;
  end if;
  v_price_text := regexp_replace(v_price_text, '[[:space:]]*(?:f|jf|[2-9]f)$', '');
  if v_price_text in ('evs', 'evens') then return 2.00; end if;
  v_numerator := split_part(v_price_text, '/', 1)::numeric;
  v_denominator := split_part(v_price_text, '/', 2)::numeric;
  if v_denominator <= 0 then return null; end if;
  return 1 + (v_numerator / v_denominator);
exception when others then
  return null;
end;
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
    if v_existing.runner_id <> p_runner_id or v_existing.stake <> p_stake then
      raise exception using errcode = '23505', message = 'BET_CONFLICT';
    end if;
    select balance_after into v_receipt_balance from public.wallet_transactions
    where bet_id = v_existing.id and type = 'BET_STAKE';
    return jsonb_build_object(
      'bet_id', v_existing.id, 'stake', v_existing.stake,
      'pricing_status', 'ATR_FINAL_PENDING', 'new_balance', v_receipt_balance,
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

  if (p_odds_snapshot_id is null) <> (p_expected_price is null) then
    raise exception using errcode = 'P0001', message = 'QUOTE_UNAVAILABLE';
  end if;
  if p_odds_snapshot_id is not null then
    select * into v_snapshot from public.odds_snapshots where id = p_odds_snapshot_id;
    if not found or v_snapshot.runner_id <> p_runner_id or v_snapshot.race_id <> v_race.id
      or v_snapshot.market_type <> 'WIN' or not v_snapshot.is_valid or v_snapshot.normalized_price is null then
      raise exception using errcode = 'P0001', message = 'QUOTE_UNAVAILABLE';
    end if;
    if v_snapshot.valid_until is null or v_now > v_snapshot.valid_until
      or v_now - v_snapshot.observed_at > make_interval(secs => v_settings.max_quote_age_seconds) then
      raise exception using errcode = 'P0001', message = 'QUOTE_STALE';
    end if;
    if p_expected_price <> v_snapshot.normalized_price then
      raise exception using errcode = 'P0001', message = 'PRICE_CHANGED';
    end if;
  end if;

  v_new_balance := v_wallet.balance - p_stake;
  insert into public.bets(
    user_id, wallet_id, race_id, runner_id, market_type, stake,
    locked_price, locked_raw_price, quote_observed_at, quote_source, quote_payload_hash,
    odds_snapshot_id, potential_gross_return, idempotency_key, accepted_at
  ) values (
    v_user, v_wallet.id, v_race.id, v_runner.id, 'WIN', p_stake,
    v_snapshot.normalized_price, v_snapshot.raw_price, v_snapshot.observed_at, v_snapshot.source,
    v_snapshot.source_payload_hash, v_snapshot.id,
    case when v_snapshot.normalized_price is null then null else round(p_stake * v_snapshot.normalized_price, 2) end,
    p_idempotency_key, v_now
  ) returning * into v_bet;

  update public.wallets set balance = v_new_balance, version = version + 1, updated_at = v_now where id = v_wallet.id;
  insert into public.wallet_transactions(wallet_id, user_id, type, amount, balance_after, bet_id, metadata, created_by, created_at)
  values (v_wallet.id, v_user, 'BET_STAKE', -p_stake, v_new_balance, v_bet.id,
    jsonb_build_object('pricing_status', 'ATR_FINAL_PENDING'), v_user, v_now);
  update public.race_events set accepted_off_at = coalesce(accepted_off_at, official_off_at), updated_at = v_now where id = v_race.id;

  return jsonb_build_object(
    'bet_id', v_bet.id, 'stake', v_bet.stake, 'pricing_status', 'ATR_FINAL_PENDING',
    'new_balance', v_new_balance, 'accepted_at', v_bet.accepted_at, 'idempotent_replay', false
  );
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
  v_runner public.race_runners%rowtype;
  v_observation public.result_observations%rowtype;
  v_wallet public.wallets%rowtype;
  v_atr_raw_price text;
  v_atr_decimal_price numeric;
  v_credit numeric(18,2);
  v_new_balance numeric(18,2);
  v_won integer := 0;
  v_lost integer := 0;
  v_void integer := 0;
begin
  select * into v_result from public.race_results where id = p_result_id;
  if not found then raise exception using errcode = 'P0001', message = 'RESULT_NOT_FOUND'; end if;
  select * into v_race from public.race_events where id = v_result.race_id for update;
  if v_result.observation_id is not null then
    select * into v_observation from public.result_observations
    where id = v_result.observation_id and race_id = v_result.race_id;
  end if;
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
      select * into v_runner from public.race_runners where id = v_bet.runner_id and race_id = v_result.race_id;
      select row ->> 'finalizedStartingPriceRaw' into v_atr_raw_price
      from jsonb_array_elements(v_observation.finishing_order) row
      where (row ->> 'position')::integer = 1
        and (row ->> 'runnerNumber')::integer = v_runner.runner_number
      limit 1;
      v_atr_decimal_price := private.atr_final_decimal_price(v_atr_raw_price);
      if v_atr_decimal_price is null then
        raise exception using errcode = 'P0001', message = 'ATR_FINAL_PRICE_UNAVAILABLE';
      end if;
      v_credit := round(v_bet.stake * v_atr_decimal_price / v_result.joint_winner_count, 2);
      v_new_balance := v_wallet.balance + v_credit;
      update public.wallets set balance = v_new_balance, version = version + 1, updated_at = clock_timestamp() where id = v_wallet.id;
      insert into public.wallet_transactions(wallet_id, user_id, type, amount, balance_after, bet_id, settlement_run_id, reason, metadata, created_by)
      values (v_wallet.id, v_bet.user_id, 'BET_PAYOUT', v_credit, v_new_balance, v_bet.id, v_run.id, p_reason,
        jsonb_build_object('atr_finalized_starting_price_raw', v_atr_raw_price,
          'atr_finalized_decimal_price', v_atr_decimal_price, 'joint_winner_count', v_result.joint_winner_count,
          'calculation', v_bet.stake || ' x ' || v_atr_decimal_price || ' / ' || v_result.joint_winner_count,
          'result_id', v_result.id, 'observation_id', v_result.observation_id), p_actor);
      update public.bets set state = 'WON', settled_at = clock_timestamp(), result_metadata = jsonb_build_object(
        'result_id', v_result.id, 'observation_id', v_result.observation_id,
        'atr_finalized_starting_price_raw', v_atr_raw_price, 'atr_finalized_decimal_price', v_atr_decimal_price,
        'divisor', v_result.joint_winner_count, 'gross_return', v_credit) where id = v_bet.id;
      v_won := v_won + 1;
    else
      update public.bets set state = 'LOST', settled_at = clock_timestamp(), result_metadata = jsonb_build_object('result_id', v_result.id) where id = v_bet.id;
      v_lost := v_lost + 1;
    end if;
  end loop;

  update public.race_events set state = case
      when v_result.status = 'VOID' then 'VOID'::public.fantasy_race_state
      else 'SETTLED'::public.fantasy_race_state
    end, updated_at = clock_timestamp() where id = v_result.race_id;
  update public.settlement_runs set state = 'COMPLETED', completed_at = clock_timestamp(),
    metadata = jsonb_build_object('won', v_won, 'lost', v_lost, 'void', v_void, 'pricing_source', 'ATR_FINAL_SP')
    where id = v_run.id returning * into v_run;
  return v_run.metadata || jsonb_build_object('idempotent_replay', false, 'settlement_run_id', v_run.id);
end;
$$;

update public.game_settings
set betting_enabled = true, version = version + 1, updated_at = clock_timestamp()
where id = true and betting_enabled = false;

revoke all on function private.atr_final_decimal_price(text) from public, anon, authenticated;
revoke all on function public.place_fantasy_bet(uuid, uuid, numeric, numeric, uuid) from public, anon;
grant execute on function public.place_fantasy_bet(uuid, uuid, numeric, numeric, uuid) to authenticated;
