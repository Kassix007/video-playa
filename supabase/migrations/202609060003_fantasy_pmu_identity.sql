begin;
create function private.normalized_pmu_identity(p_value text)
returns text language sql immutable set search_path='' as $$
  select regexp_replace(lower(normalize(coalesce(p_value,''),NFD)), '[^a-z0-9]', '', 'g');
$$;
revoke all on function private.normalized_pmu_identity(text) from public,anon,authenticated;
do $$ declare definition text;
begin
  select pg_get_functiondef('public.record_pmu_fantasy_result(uuid,jsonb,text,text)'::regprocedure) into definition;
  if position('private.normalized_identity(' in definition)=0 then raise exception 'PMU_IDENTITY_MIGRATION_PRECONDITION'; end if;
  execute replace(definition,'private.normalized_identity(','private.normalized_pmu_identity(');
end $$;
update public.race_events r set next_result_check_at=clock_timestamp(),result_check_claimed_at=null
where r.state='NEEDS_REVIEW' and r.automatic_check_until>clock_timestamp()
  and exists(select 1 from public.bets b where b.race_id=r.id and b.state='PENDING' and b.pricing_basis='PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO');
commit;
