begin;
create function private.pmu_race_title(p_value text) returns text language sql immutable set search_path='' as $$
 select private.normalized_pmu_identity(regexp_replace(regexp_replace(normalize(coalesce(p_value,''),NFD),U&'[\0300-\036f]','','g'),'\s+(attele|monte)\s*$','','i'));
$$;
create function private.pmu_result_title_matches(p_race_id uuid,p_result jsonb)
returns boolean language sql stable set search_path='' as $$
 select exists(select 1 from public.race_events race where race.id=p_race_id and (
   private.pmu_race_title(race.race_name)=private.pmu_race_title(p_result->>'race_name')
   or (p_result->>'match_method'='COMPLETE_CANONICAL_FIELD'
     and jsonb_typeof(p_result->'participants')='array'
     and jsonb_array_length(p_result->'participants')>0
     and jsonb_array_length(p_result->'participants')=(select count(*) from public.race_runners where race_id=p_race_id)
     and (select count(distinct p->>'runnerNumber') from jsonb_array_elements(p_result->'participants') p)=jsonb_array_length(p_result->'participants')
     and not exists(select 1 from jsonb_array_elements(p_result->'participants') p where not exists(
       select 1 from public.race_runners r where r.race_id=p_race_id and r.runner_number=(p->>'runnerNumber')::integer
       and private.normalized_pmu_identity(r.runner_name)=private.normalized_pmu_identity(p->>'runnerName')))
   )
 ));
$$;
revoke all on function private.pmu_race_title(text),private.pmu_result_title_matches(uuid,jsonb) from public,anon,authenticated;
do $$ declare definition text; old_condition text := 'private.normalized_pmu_identity(p_result->>''race_name'') is distinct from private.normalized_pmu_identity(v_race.race_name)';
begin
 select pg_get_functiondef('public.record_pmu_fantasy_result(uuid,jsonb,text,text)'::regprocedure) into definition;
 if position(old_condition in definition)=0 then raise exception 'PMU_TITLE_MIGRATION_PRECONDITION'; end if;
 execute replace(definition,old_condition,'not private.pmu_result_title_matches(p_race_id,p_result)');
end $$;

create function public.backfill_pmu_fantasy_runners(p_race_id uuid,p_identity jsonb,p_runners jsonb,p_source_url text,p_payload_hash text,p_byte_length integer)
returns jsonb language plpgsql security definer set search_path='' as $$
declare race public.race_events%rowtype; runner jsonb; inserted_count integer:=0;
begin
 select * into race from public.race_events where id=p_race_id for update;
 if not found then raise exception 'PMU_RACE_NOT_FOUND'; end if;
 if exists(select 1 from public.race_runners where race_id=p_race_id) or exists(select 1 from public.bets where race_id=p_race_id) then
   return jsonb_build_object('status','EXISTING_FIELD_PRESERVED');
 end if;
 if race.programme_date<>timezone('Indian/Mauritius',clock_timestamp())::date or race.official_off_at<=clock_timestamp()
   or race.state not in ('OPEN','UPCOMING') then raise exception 'PMU_BACKFILL_RACE_CLOSED'; end if;
 if (p_identity->>'programme_date')::date is distinct from race.programme_date
   or private.normalized_pmu_identity(p_identity->>'course') is distinct from private.normalized_pmu_identity(race.racecourse)
   or (p_identity->>'race_number')::integer is distinct from race.race_number
   or private.pmu_race_title(p_identity->>'race_name') is distinct from private.pmu_race_title(race.race_name)
   or p_identity->>'scheduled_at' is null
   or abs(extract(epoch from ((p_identity->>'scheduled_at')::timestamptz-race.official_off_at)))>300
   or coalesce(p_source_url,'') !~ '^https://online\.turfinfo\.api\.pmu\.fr/rest/client/1/programme/[0-9]{8}/R[0-9]+/C[0-9]+/participants$'
   or coalesce(p_payload_hash,'') !~ '^[a-f0-9]{64}$'
   or p_byte_length is null or p_byte_length not between 1 and 3000000
   or jsonb_typeof(p_runners) is distinct from 'array' then raise exception 'PMU_BACKFILL_EVIDENCE_INVALID'; end if;
 if jsonb_array_length(p_runners) not between 1 and 100 or jsonb_array_length(p_runners)<>
   (select count(distinct r->>'runnerNumber') from jsonb_array_elements(p_runners) r) then raise exception 'PMU_FIELD_INCOMPLETE'; end if;
 insert into public.source_payloads(sha256,source_url,retrieved_at,byte_length,content_type)
 values(p_payload_hash,p_source_url,clock_timestamp(),p_byte_length,'application/json') on conflict(sha256) do nothing;
 for runner in select value from jsonb_array_elements(p_runners) loop
   if coalesce(runner->>'runnerName','')='' or char_length(runner->>'runnerName')>300
     or coalesce(runner->>'runnerNumber','') !~ '^[0-9]+$'
     or jsonb_typeof(runner->'active') is distinct from 'boolean' then raise exception 'PMU_RUNNER_UNMATCHED'; end if;
   insert into public.race_runners(race_id,runner_number,runner_name,normalized_runner_name,active,source_selection_code)
   values(p_race_id,(runner->>'runnerNumber')::integer,runner->>'runnerName',private.normalized_pmu_identity(runner->>'runnerName'),
     (runner->>'active')::boolean,race.external_race_id||'H'||(runner->>'runnerNumber'));
   inserted_count:=inserted_count+1;
 end loop;
 insert into public.admin_audit_events(action,entity_type,entity_id,reason,after_data)
 values('PMU_RUNNER_BACKFILL','race',p_race_id,'Complete PMU field for strictly matched canonical PDF race',
   jsonb_build_object('source_url',p_source_url,'payload_hash',p_payload_hash,'identity',p_identity,'runners',p_runners));
 return jsonb_build_object('status','BACKFILLED','runners',inserted_count);
end $$;
revoke all on function public.backfill_pmu_fantasy_runners(uuid,jsonb,jsonb,text,text,integer) from public,anon,authenticated;
grant execute on function public.backfill_pmu_fantasy_runners(uuid,jsonb,jsonb,text,text,integer) to service_role;
update public.race_events r set next_result_check_at=clock_timestamp(),result_check_claimed_at=null
where state='NEEDS_REVIEW' and automatic_check_until>clock_timestamp()
 and exists(select 1 from public.bets b where b.race_id=r.id and b.state='PENDING');
commit;
