begin;
-- Preserve the existing protected response and permission boundary.
do $$
declare definition text;
begin
 select pg_get_functiondef('public.get_fantasy_peakpool_admin()'::regprocedure) into definition;
 if position('''settings''' in definition)>0 then raise exception 'ADMIN_SETTINGS_ALREADY_PRESENT'; end if;
 if position('''players'', coalesce' in definition)=0 then raise exception 'ADMIN_SETTINGS_MIGRATION_PRECONDITION'; end if;
 execute replace(definition,'''players'', coalesce',
   '''settings'', (select to_jsonb(s) from public.game_settings s where s.id=true), ''players'', coalesce');
end $$;
commit;
