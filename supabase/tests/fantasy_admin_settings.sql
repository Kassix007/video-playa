begin;
create extension if not exists pgtap with schema extensions;
select plan(3);
insert into auth.users(id,aud,role,raw_app_meta_data,raw_user_meta_data,created_at,updated_at)
values ('20000000-0000-0000-0000-000000000099','authenticated','authenticated','{"provider":"google"}','{"full_name":"Settings fixture"}',now(),now());
update public.profiles set role='admin' where id='20000000-0000-0000-0000-000000000099';
select set_config('request.jwt.claim.sub','20000000-0000-0000-0000-000000000099',true);
select is(public.get_fantasy_peakpool_admin()->'settings',(select to_jsonb(s) from public.game_settings s where id=true),'admin receives actual complete saved settings');
update public.profiles set role='player' where id='20000000-0000-0000-0000-000000000099';
select throws_ok('select public.get_fantasy_peakpool_admin()','42501','ADMIN_REQUIRED','player cannot read protected admin settings');
select ok(not has_function_privilege('anon','public.get_fantasy_peakpool_admin()','execute'),'anonymous execution remains revoked');
select * from finish();
rollback;
