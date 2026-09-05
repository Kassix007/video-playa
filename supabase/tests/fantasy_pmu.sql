begin;
create extension if not exists pgtap with schema extensions;
select plan(10);
insert into auth.users(id,aud,role,raw_app_meta_data,raw_user_meta_data,created_at,updated_at)
values ('90000000-0000-0000-0000-000000000001','authenticated','authenticated','{"provider":"google"}','{}',now(),now());
insert into public.race_events(id,programme_date,external_race_id,meeting_number,race_number,racecourse,normalized_racecourse,race_name,official_off_at,state,racecard_observed_at)
values ('90000000-0000-0000-0000-000000000002','2026-09-05','R1C1',1,1,'Test Course','testcourse','Test Race','2026-09-05T12:00:00Z','RESULT_PENDING',now());
insert into public.race_runners(id,race_id,runner_number,runner_name,normalized_runner_name,source_selection_code)
values ('90000000-0000-0000-0000-000000000003','90000000-0000-0000-0000-000000000002',1,'Winner','winner','R1C1H1'),
('90000000-0000-0000-0000-000000000004','90000000-0000-0000-0000-000000000002',2,'Loser','loser','R1C1H2');
insert into public.bets(user_id,wallet_id,race_id,runner_id,stake,idempotency_key)
select w.user_id,w.id,r.race_id,r.id,10,gen_random_uuid() from public.wallets w cross join public.race_runners r
where w.user_id='90000000-0000-0000-0000-000000000001' and r.race_id='90000000-0000-0000-0000-000000000002';
create function pg_temp.evidence() returns jsonb language sql as $$ select '{"provider":"pmu","status":"CONFIRMED","pricing_basis":"PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO","payout_divisor":1,"programme_date":"2026-09-05","course":"Test Course","race_name":"Test Race","race_number":1,"scheduled_at":"2026-09-05T12:00:00Z","winner_runner_ids":["90000000-0000-0000-0000-000000000003"],"non_runner_ids":[],"finishing_order":[{"position":1,"runnerNumber":1,"runnerName":"Winner","finalizedDividendCents":500},{"position":2,"runnerNumber":2,"runnerName":"Loser"}]}'::jsonb $$;
create function pg_temp.settle(e jsonb) returns jsonb language sql as $$ select public.record_pmu_fantasy_result('90000000-0000-0000-0000-000000000002',e,'https://online.turfinfo.api.pmu.fr/rest/client/1/programme/05092026/R1/C1/rapports-definitifs',repeat('a',64)) $$;
select ok(not has_function_privilege('authenticated','public.record_pmu_fantasy_result(uuid,jsonb,text,text)','EXECUTE'),'players cannot settle');
select throws_ok($$select pg_temp.settle(jsonb_set(pg_temp.evidence(),'{finishing_order,0,finalizedDividendCents}','null'))$$,'P0001','PMU_DIVIDEND_INVALID','missing dividend rejects all mutations');
select is((select count(*)::integer from public.bets where state='PENDING' and race_id='90000000-0000-0000-0000-000000000002'),2,'invalid evidence leaves bets pending');
update public.bets set pricing_basis='ATR_FINAL_SP' where race_id='90000000-0000-0000-0000-000000000002';
select throws_ok($$select pg_temp.settle(pg_temp.evidence())$$,'P0001','PMU_LEGACY_BETS_REVIEW','legacy contracts are not repriced');
update public.bets set pricing_basis='PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO' where race_id='90000000-0000-0000-0000-000000000002';
select lives_ok($$select pg_temp.settle(pg_temp.evidence())$$,'validated result settles atomically');
select is((select balance::text from public.wallets where user_id='90000000-0000-0000-0000-000000000001'),'1050.00','ten credits at 5 gross returns fifty (fixture starts after stake acceptance)');
select is((select count(*)::integer from public.bets where state='WON' and race_id='90000000-0000-0000-0000-000000000002'),1,'winner updated');
select is((select count(*)::integer from public.bets where state='LOST' and race_id='90000000-0000-0000-0000-000000000002'),1,'loser updated');
select is(pg_temp.settle(pg_temp.evidence())->>'idempotent_replay','true','retry is idempotent');
select is((select count(*)::integer from public.wallet_transactions where user_id='90000000-0000-0000-0000-000000000001' and type='BET_PAYOUT'),1,'retry never duplicates credit');
select * from finish();
rollback;
