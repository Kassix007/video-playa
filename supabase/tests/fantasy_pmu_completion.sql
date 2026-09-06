begin;
create extension if not exists pgtap with schema extensions;
select plan(10);
insert into public.race_events(id,programme_date,external_race_id,meeting_number,race_number,racecourse,normalized_racecourse,race_name,official_off_at,state,racecard_observed_at)
values('91000000-0000-0000-0000-000000000001',timezone('Indian/Mauritius',clock_timestamp())::date,'R99C1',99,1,'Test','test','Prix Test Attelé',clock_timestamp()+interval '1 hour','OPEN',clock_timestamp());
create function pg_temp.identity() returns jsonb language sql as $$
 select jsonb_build_object('programme_date',programme_date,'course',racecourse,'race_number',race_number,'race_name','PRIX TEST','scheduled_at',official_off_at)
 from public.race_events where id='91000000-0000-0000-0000-000000000001';
$$;
create function pg_temp.backfill(identity jsonb,runners jsonb) returns jsonb language sql as $$
 select public.backfill_pmu_fantasy_runners('91000000-0000-0000-0000-000000000001',identity,runners,'https://online.turfinfo.api.pmu.fr/rest/client/1/programme/06092026/R1/C1/participants',repeat('c',64),100);
$$;
select ok(not has_function_privilege('authenticated','public.backfill_pmu_fantasy_runners(uuid,jsonb,jsonb,text,text,integer)','EXECUTE'),'players cannot backfill runners');
select is(private.pmu_race_title('Prix Test Attelé'),'prixtest','SQL discipline normalization matches adapter');
select is(private.pmu_race_title('Prix Delmonte'),'prixdelmonte','do not remove suffix from an actual name');
select throws_ok($$select pg_temp.backfill(pg_temp.identity()||'{"race_name":"Different"}','[{"runnerNumber":1,"runnerName":"Alpha","active":true}]')$$,'P0001','PMU_BACKFILL_EVIDENCE_INVALID','wrong title cannot populate canonical race');
select lives_ok($$select pg_temp.backfill(pg_temp.identity(),'[{"runnerNumber":1,"runnerName":"Alpha","active":true},{"runnerNumber":2,"runnerName":"Beta","active":false}]')$$,'complete verified field backfills');
select is((select count(*)::integer from public.race_runners where race_id='91000000-0000-0000-0000-000000000001' and active),1,'confirmed non-runner is not selectable');
select is(pg_temp.backfill(pg_temp.identity(),'[{"runnerNumber":1,"runnerName":"Replacement","active":true}]')->>'status','EXISTING_FIELD_PRESERVED','existing field cannot be overwritten');
select ok(private.pmu_result_title_matches('91000000-0000-0000-0000-000000000001','{"race_name":"Truncated sponsor title","match_method":"COMPLETE_CANONICAL_FIELD","participants":[{"runnerNumber":1,"runnerName":"Alpha"},{"runnerNumber":2,"runnerName":"Beta"}]}'),'full independently stored field permits result title differences');
select ok(not private.pmu_result_title_matches('91000000-0000-0000-0000-000000000001','{"race_name":"Truncated","match_method":"COMPLETE_CANONICAL_FIELD","participants":[{"runnerNumber":1,"runnerName":"Alpha"}]}'),'incomplete field cannot bypass title validation');
select ok(not private.pmu_result_title_matches('91000000-0000-0000-0000-000000000001','{"race_name":"Truncated","match_method":"COMPLETE_CANONICAL_FIELD","participants":[{"runnerNumber":1,"runnerName":"Wrong"},{"runnerNumber":2,"runnerName":"Beta"}]}'),'wrong name cannot bypass title validation');
select * from finish();
rollback;
