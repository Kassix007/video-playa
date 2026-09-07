begin;
create extension if not exists pgtap with schema extensions;
select plan(6);
select is(private.normalized_pmu_identity('Prix Arqana - Critérium de l''Ouest'),private.normalized_pmu_identity('PRIX ARQANA - CRITERIUM DE L''OUEST'),'PMU SQL matches adapter accent normalization');
select isnt(private.normalized_pmu_identity('Prix Other'),private.normalized_pmu_identity('Prix Arqana'),'different titles still fail identity matching');
create function pg_temp.payout_case(joint boolean) returns jsonb language plpgsql as $$
declare u uuid:=gen_random_uuid(); race uuid:=gen_random_uuid(); a uuid:=gen_random_uuid(); b uuid:=gen_random_uuid(); evidence jsonb; result jsonb;
begin
  insert into auth.users(id,aud,role,raw_app_meta_data,raw_user_meta_data,created_at,updated_at)
  values(u,'authenticated','authenticated','{"provider":"google"}','{}',now(),now());
  insert into public.race_events(id,programme_date,external_race_id,meeting_number,race_number,racecourse,normalized_racecourse,race_name,official_off_at,state,racecard_observed_at)
  values(race,'2026-09-05',case when joint then 'R9C1' else 'R9C2' end,9,case when joint then 1 else 2 end,'Test','test','Test','2026-09-05T12:00:00Z','RESULT_PENDING',now());
  insert into public.race_runners(id,race_id,runner_number,runner_name,normalized_runner_name,source_selection_code)
  values(a,race,1,'Alpha','alpha','R9C1H1'),(b,race,2,'Beta','beta','R9C1H2');
  insert into public.bets(user_id,wallet_id,race_id,runner_id,stake,idempotency_key)
  select u,w.id,race,r.id,10,gen_random_uuid() from public.wallets w cross join public.race_runners r where w.user_id=u and r.race_id=race;
  evidence:=jsonb_build_object('provider','pmu','status','CONFIRMED','pricing_basis','PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO','payout_divisor',1,
    'programme_date','2026-09-05','course','Test','race_name','Test','race_number',case when joint then 1 else 2 end,'scheduled_at','2026-09-05T12:00:00Z',
    'winner_runner_ids',case when joint then jsonb_build_array(a,b) else jsonb_build_array(a) end,
    'non_runner_ids',case when joint then '[]'::jsonb else jsonb_build_array(b) end,
    'non_runners',case when joint then '[]'::jsonb else '[{"runnerNumber":2,"runnerName":"Beta"}]'::jsonb end,
    'finishing_order',case when joint then '[{"position":1,"runnerNumber":1,"runnerName":"Alpha","finalizedDividendCents":250},{"position":1,"runnerNumber":2,"runnerName":"Beta","finalizedDividendCents":150}]'::jsonb
      else '[{"position":1,"runnerNumber":1,"runnerName":"Alpha","finalizedDividendCents":500}]'::jsonb end);
  result:=public.record_pmu_fantasy_result(race,evidence,'https://online.turfinfo.api.pmu.fr/rest/client/1/programme/05092026/R9/C1/rapports-definitifs',repeat('b',64));
  return result || jsonb_build_object('credit',(select sum(amount) from public.wallet_transactions where user_id=u and type in ('BET_PAYOUT','BET_REFUND')),
    'refund_has_no_price',not exists(select 1 from public.wallet_transactions where user_id=u and type='BET_REFUND' and metadata->>'dividend_cents' is not null));
end $$;
create temp table pmu_cases as select true as joint,pg_temp.payout_case(true) as result union all select false,pg_temp.payout_case(false);
select is((select result->>'credit' from pmu_cases where joint),'40.00','dead heat credits 25 + 15 without a second split');
select is((select result->>'won' from pmu_cases where joint),'2','both joint winners updated');
select is((select result->>'credit' from pmu_cases where not joint),'60.00','winner payout 50 plus non-runner stake refund 10');
select is((select result->>'refund_has_no_price' from pmu_cases where not joint),'true','refund never inherits a winner price');
select * from finish();
rollback;
