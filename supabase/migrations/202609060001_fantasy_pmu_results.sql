-- New selections use one explicitly named PMU pool. Existing bets retain their
-- accepted pricing basis until the operator approves an audited migration.
alter table public.bets add column pricing_basis text not null default 'ATR_FINAL_SP'
  check (pricing_basis in ('ATR_FINAL_SP', 'PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO'));
alter table public.bets alter column pricing_basis set default 'PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO';

create or replace function public.record_pmu_fantasy_result(
  p_race_id uuid, p_result jsonb, p_source_url text, p_payload_hash text
) returns jsonb language plpgsql security definer set search_path = '' as $$
declare
  v_race public.race_events%rowtype;
  v_observation public.result_observations%rowtype;
  v_result public.race_results%rowtype;
  v_run public.settlement_runs%rowtype;
  v_bet public.bets%rowtype;
  v_wallet public.wallets%rowtype;
  v_winners uuid[] := array(select jsonb_array_elements_text(p_result->'winner_runner_ids')::uuid);
  v_non_runners uuid[] := array(select jsonb_array_elements_text(p_result->'non_runner_ids')::uuid);
  v_rows jsonb := p_result->'finishing_order';
  v_row jsonb;
  v_cents numeric;
  v_credit numeric;
  v_version integer;
  v_won integer := 0; v_lost integer := 0; v_void integer := 0;
begin
  select * into v_race from public.race_events where id=p_race_id for update;
  if not found then raise exception 'PMU_RACE_NOT_FOUND'; end if;
  if v_race.state in ('SETTLED','VOID') then return jsonb_build_object('idempotent_replay',true); end if;
  if v_race.official_off_at > clock_timestamp() then raise exception 'PMU_RACE_NOT_CLOSED'; end if;
  if coalesce(p_result->>'provider','') <> 'pmu' or coalesce(p_result->>'status','') <> 'CONFIRMED'
    or coalesce(p_result->>'pricing_basis','') <> 'PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO'
    or coalesce(p_result->>'payout_divisor','') <> '1'
    or (p_result->>'programme_date')::date is distinct from v_race.programme_date
    or private.normalized_identity(p_result->>'course') is distinct from private.normalized_identity(v_race.racecourse)
    or private.normalized_identity(p_result->>'race_name') is distinct from private.normalized_identity(v_race.race_name)
    or (p_result->>'race_number')::integer is distinct from v_race.race_number
    or p_result->>'scheduled_at' is null
    or abs(extract(epoch from ((p_result->>'scheduled_at')::timestamptz-v_race.official_off_at))) > 300
    or coalesce(p_source_url,'') !~ '^https://online\.turfinfo\.api\.pmu\.fr/rest/client/1/programme/[0-9]{8}/R[0-9]+/C[0-9]+/rapports-definitifs$'
    or coalesce(p_payload_hash,'') !~ '^[a-f0-9]{64}$'
    or jsonb_typeof(v_rows) is distinct from 'array' or cardinality(v_winners)<1 then
    raise exception 'PMU_EVIDENCE_INVALID';
  end if;
  if exists(select 1 from public.bets where race_id=p_race_id and state='PENDING' and pricing_basis<>'PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO') then
    raise exception 'PMU_LEGACY_BETS_REVIEW';
  end if;
  if cardinality(v_winners) <> (select count(distinct x) from unnest(v_winners) x)
    or cardinality(v_non_runners) <> (select count(distinct x) from unnest(v_non_runners) x)
    or v_winners && v_non_runners
    or exists(select 1 from unnest(v_winners||v_non_runners) x where not exists(select 1 from public.race_runners r where r.id=x and r.race_id=p_race_id))
    or (select count(*) from jsonb_array_elements(v_rows) r where r->>'position'='1') <> cardinality(v_winners)
    or (select count(*) from jsonb_array_elements(v_rows)) <> (select count(distinct r->>'runnerNumber') from jsonb_array_elements(v_rows) r) then
    raise exception 'PMU_WINNER_SET_INVALID';
  end if;
  for v_row in select value from jsonb_array_elements(v_rows) loop
    if coalesce(v_row->>'position','') !~ '^[1-9][0-9]*$'
      or exists(select 1 from public.race_runners r where r.id=any(v_non_runners) and r.race_id=p_race_id
        and r.runner_number=(v_row->>'runnerNumber')::integer) then raise exception 'PMU_ORDER_INVALID'; end if;
    if not exists(select 1 from public.race_runners r where r.race_id=p_race_id
      and r.runner_number=(v_row->>'runnerNumber')::integer
      and private.normalized_identity(r.runner_name)=private.normalized_identity(v_row->>'runnerName')) then raise exception 'PMU_RUNNER_INVALID'; end if;
    if v_row->>'position'='1' then
      if coalesce(v_row->>'finalizedDividendCents','') !~ '^[0-9]+$' then raise exception 'PMU_DIVIDEND_INVALID'; end if;
      v_cents := (v_row->>'finalizedDividendCents')::numeric;
      if v_cents < 100 or v_cents > 100000000 or not exists(select 1 from public.race_runners r where r.id=any(v_winners)
        and r.race_id=p_race_id and r.runner_number=(v_row->>'runnerNumber')::integer) then raise exception 'PMU_DIVIDEND_INVALID'; end if;
    end if;
  end loop;
  if jsonb_typeof(coalesce(p_result->'non_runners','[]'::jsonb)) <> 'array'
    or jsonb_array_length(coalesce(p_result->'non_runners','[]'::jsonb)) <> cardinality(v_non_runners)
    or (select count(distinct n->>'runnerNumber') from jsonb_array_elements(coalesce(p_result->'non_runners','[]'::jsonb)) n) <> cardinality(v_non_runners)
    or exists(select 1 from jsonb_array_elements(coalesce(p_result->'non_runners','[]'::jsonb)) n where not exists(
      select 1 from public.race_runners r where r.id=any(v_non_runners) and r.race_id=p_race_id
      and r.runner_number=(n->>'runnerNumber')::integer and private.normalized_identity(r.runner_name)=private.normalized_identity(n->>'runnerName'))) then
    raise exception 'PMU_NON_RUNNER_INVALID';
  end if;
  insert into public.result_observations(race_id,provider,source_url,retrieved_at,status,programme_date,course,scheduled_at,race_number,race_name,
    finishing_order,non_runners,payload_hash,sanitized_fragment,match_evidence,confidence)
  values(p_race_id,'pmu',p_source_url,clock_timestamp(),'CONFIRMED',v_race.programme_date,p_result->>'course',(p_result->>'scheduled_at')::timestamptz,
    v_race.race_number,p_result->>'race_name',v_rows,coalesce(p_result->'non_runners','[]'),p_payload_hash,'PMU definitive NATIONAL SIMPLE_GAGNANT',
    jsonb_build_object('pricing_basis','PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO','dividend_unit','cents_per_euro'),1)
  on conflict(provider,race_id,payload_hash) do nothing returning * into v_observation;
  if v_observation.id is null then select * into v_observation from public.result_observations where provider='pmu' and race_id=p_race_id and payload_hash=p_payload_hash; end if;
  select coalesce(max(version),0)+1 into v_version from public.race_results where race_id=p_race_id;
  insert into public.race_results(race_id,version,status,winner_runner_ids,non_runner_ids,joint_winner_count,observation_id,confirmation_reason,confirmed_at,metadata)
  values(p_race_id,v_version,'CONFIRMED',v_winners,v_non_runners,cardinality(v_winners),v_observation.id,'PMU definitive result',clock_timestamp(),p_result) returning * into v_result;
  insert into public.settlement_runs(race_id,result_id,result_version,reason)
  values(p_race_id,v_result.id,v_version,'PMU definitive dividend') returning * into v_run;
  for v_bet in select * from public.bets where race_id=p_race_id and state='PENDING' order by user_id,accepted_at for update loop
    select * into v_wallet from public.wallets where id=v_bet.wallet_id for update;
    v_credit:=0; v_cents:=null;
    if v_bet.runner_id=any(v_non_runners) then v_credit:=v_bet.stake; v_void:=v_void+1;
    elsif v_bet.runner_id=any(v_winners) then
      select (row->>'finalizedDividendCents')::numeric into strict v_cents from jsonb_array_elements(v_rows) row
      join public.race_runners r on r.id=v_bet.runner_id and r.runner_number=(row->>'runnerNumber')::integer where row->>'position'='1';
      v_credit:=round(v_bet.stake*v_cents/100,2); v_won:=v_won+1;
    else v_lost:=v_lost+1; end if;
    if v_credit>0 then
      update public.wallets set balance=balance+v_credit,version=version+1,updated_at=clock_timestamp() where id=v_wallet.id;
      insert into public.wallet_transactions(wallet_id,user_id,type,amount,balance_after,bet_id,settlement_run_id,reason,metadata)
      values(v_wallet.id,v_bet.user_id,case when v_bet.runner_id=any(v_non_runners) then 'BET_REFUND'::public.fantasy_wallet_transaction_type else 'BET_PAYOUT'::public.fantasy_wallet_transaction_type end,
        v_credit,v_wallet.balance+v_credit,v_bet.id,v_run.id,'PMU definitive dividend',jsonb_build_object('pricing_basis','PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO','dividend_cents',v_cents,'gross_return',v_credit,'observation_id',v_observation.id));
    end if;
    update public.bets set state=case when v_bet.runner_id=any(v_non_runners) then 'VOID'::public.fantasy_bet_state when v_bet.runner_id=any(v_winners) then 'WON'::public.fantasy_bet_state else 'LOST'::public.fantasy_bet_state end,
      settled_at=clock_timestamp(),result_metadata=jsonb_build_object('pricing_basis','PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO','pmu_dividend_cents',case when v_bet.runner_id=any(v_winners) then v_cents else null end,'gross_return',v_credit,'observation_id',v_observation.id) where id=v_bet.id;
  end loop;
  update public.race_events set state='SETTLED',result_check_claimed_at=null,updated_at=clock_timestamp() where id=p_race_id;
  update public.settlement_runs set state='COMPLETED',completed_at=clock_timestamp(),metadata=jsonb_build_object('won',v_won,'lost',v_lost,'void',v_void) where id=v_run.id;
  return jsonb_build_object('won',v_won,'lost',v_lost,'void',v_void,'observation_id',v_observation.id);
end;
$$;
revoke all on function public.record_pmu_fantasy_result(uuid,jsonb,text,text) from public,anon,authenticated;
grant execute on function public.record_pmu_fantasy_result(uuid,jsonb,text,text) to service_role;
