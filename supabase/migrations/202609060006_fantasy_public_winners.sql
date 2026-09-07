begin;
create function private.fantasy_public_winners(p_race_id uuid)
returns jsonb language sql stable set search_path='' as $$
 select coalesce(jsonb_agg(jsonb_build_object(
   'runner_id', rr.id, 'runner_number', rr.runner_number, 'runner_name', rr.runner_name,
   'pmu_dividend_cents', case when o.provider='pmu' and o.status='CONFIRMED' then (
     select (f->>'finalizedDividendCents')::numeric from jsonb_array_elements(o.finishing_order) f
     where f->>'position'='1' and f->>'runnerNumber'=rr.runner_number::text
       and coalesce(f->>'finalizedDividendCents','') ~ '^[0-9]{3,12}$'
     limit 1) else null end
 ) order by rr.runner_number),'[]'::jsonb)
 from public.race_events r
 join lateral (select current_result.* from public.race_results current_result where current_result.race_id=r.id
   order by current_result.version desc limit 1) result on result.status='CONFIRMED'
 join public.race_runners rr on rr.race_id=r.id and rr.id=any(result.winner_runner_ids)
 left join public.result_observations o on o.id=result.observation_id and o.race_id=r.id
 where r.id=p_race_id and r.state='SETTLED';
$$;
revoke all on function private.fantasy_public_winners(uuid) from public,anon,authenticated;
do $$ declare definition text;
begin
 select pg_get_functiondef('public.get_fantasy_peakpool_bootstrap()'::regprocedure) into definition;
 if position('''winners''' in definition)>0 or position('''runners'', coalesce' in definition)=0 then
   raise exception 'PUBLIC_WINNERS_MIGRATION_PRECONDITION'; end if;
 execute replace(definition,'''runners'', coalesce',
   '''winners'', private.fantasy_public_winners(r.id), ''runners'', coalesce');
end $$;
commit;
