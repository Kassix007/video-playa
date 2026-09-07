begin;
create extension if not exists pgtap with schema extensions;
select plan(8);
insert into public.race_events(id,programme_date,external_race_id,meeting_number,race_number,racecourse,normalized_racecourse,race_name,official_off_at,state,racecard_observed_at)
values('92000000-0000-0000-0000-000000000001',timezone('Indian/Mauritius',clock_timestamp())::date,'R99C1',99,1,'Test','test','Winner fixture',clock_timestamp()-interval '1 hour','SETTLED',clock_timestamp());
insert into public.race_runners(id,race_id,runner_number,runner_name,normalized_runner_name,source_selection_code)
values('92000000-0000-0000-0000-000000000011','92000000-0000-0000-0000-000000000001',1,'Alpha','alpha','R99C1H1'),
('92000000-0000-0000-0000-000000000012','92000000-0000-0000-0000-000000000001',2,'Beta','beta','R99C1H2');
insert into public.race_results(race_id,version,status,winner_runner_ids,joint_winner_count)
values('92000000-0000-0000-0000-000000000001',1,'CONFIRMED',array['92000000-0000-0000-0000-000000000011'::uuid],1);
select is(private.fantasy_public_winners('92000000-0000-0000-0000-000000000001')->0->>'runner_name','Alpha','confirmed canonical winner projected');
select is(private.fantasy_public_winners('92000000-0000-0000-0000-000000000001')->0->>'pmu_dividend_cents',null,'missing dividend is not invented');
insert into public.result_observations(id,race_id,provider,source_url,retrieved_at,status,programme_date,course,finishing_order,payload_hash)
values('92000000-0000-0000-0000-000000000021','92000000-0000-0000-0000-000000000001','pmu','https://example.test/results',clock_timestamp(),'CONFIRMED',current_date,'Test','[{"position":1,"runnerNumber":1,"finalizedDividendCents":290}]',repeat('a',64));
insert into public.race_results(race_id,version,status,winner_runner_ids,joint_winner_count,observation_id)
values('92000000-0000-0000-0000-000000000001',2,'CONFIRMED',array['92000000-0000-0000-0000-000000000011'::uuid],1,'92000000-0000-0000-0000-000000000021');
select is(private.fantasy_public_winners('92000000-0000-0000-0000-000000000001')->0->>'pmu_dividend_cents','290','winner dividend comes from the bound confirmed PMU observation');
insert into public.race_results(race_id,version,status,winner_runner_ids,joint_winner_count)
values('92000000-0000-0000-0000-000000000001',3,'CONFIRMED',array['92000000-0000-0000-0000-000000000011'::uuid,'92000000-0000-0000-0000-000000000012'::uuid],2);
select is(jsonb_array_length(private.fantasy_public_winners('92000000-0000-0000-0000-000000000001')),2,'latest dead heat has two winners without old-version duplicates');
set local role anon;
select is((select jsonb_array_length(r->'winners') from jsonb_array_elements(public.get_fantasy_peakpool_bootstrap()->'races') r where r->>'id'='92000000-0000-0000-0000-000000000001'),2,'anonymous programme contains public winners');
select is(public.get_fantasy_peakpool_bootstrap()->'bets','[]'::jsonb,'anonymous result read reveals no private bets');
reset role;
update public.race_events set state='NEEDS_REVIEW' where id='92000000-0000-0000-0000-000000000001';
select is(private.fantasy_public_winners('92000000-0000-0000-0000-000000000001'),'[]'::jsonb,'review state hides previous winners');
update public.race_events set state='SETTLED' where id='92000000-0000-0000-0000-000000000001';
insert into public.race_results(race_id,version,status) values('92000000-0000-0000-0000-000000000001',4,'VOID');
select is(private.fantasy_public_winners('92000000-0000-0000-0000-000000000001'),'[]'::jsonb,'latest void result hides older confirmed winners');
select * from finish();
rollback;
