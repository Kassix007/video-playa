begin;
create extension if not exists pgtap with schema extensions;
select plan(18);

select has_function('public', 'admin_reset_fantasy_leaderboard', array['text','text','uuid'], 'leaderboard reset RPC exists');

insert into auth.users(id, aud, role, raw_app_meta_data, raw_user_meta_data, created_at, updated_at)
values
  ('11000000-0000-0000-0000-000000000001', 'authenticated', 'authenticated', '{"provider":"google"}', '{"full_name":"Round Player"}', now(), now()),
  ('11000000-0000-0000-0000-000000000099', 'authenticated', 'authenticated', '{"provider":"google"}', '{"full_name":"Round Admin"}', now(), now());
update public.profiles set role='admin' where id='11000000-0000-0000-0000-000000000099';

insert into public.race_events(id, programme_date, external_race_id, meeting_number, race_number, racecourse,
  normalized_racecourse, official_off_at, state, racecard_observed_at)
values ('21000000-0000-0000-0000-000000000001', timezone('Indian/Mauritius',now())::date, 'R99C1', 99, 1,
  'ROUND COURSE', 'roundcourse', now()-interval '1 hour', 'SETTLED', now());
insert into public.race_runners(id,race_id,runner_number,runner_name,normalized_runner_name,source_selection_code)
values ('31000000-0000-0000-0000-000000000001','21000000-0000-0000-0000-000000000001',1,'Round Runner','roundrunner','R99C1H1');
insert into public.bets(id,user_id,wallet_id,race_id,runner_id,stake,idempotency_key,state,settled_at)
select '51000000-0000-0000-0000-000000000001',p.id,w.id,'21000000-0000-0000-0000-000000000001','31000000-0000-0000-0000-000000000001',100,
  '61000000-0000-0000-0000-000000000001','PENDING',null
from public.profiles p join public.wallets w on w.user_id=p.id where p.id='11000000-0000-0000-0000-000000000001';
update public.wallets set balance=900 where user_id='11000000-0000-0000-0000-000000000001';
insert into public.wallet_transactions(wallet_id,user_id,type,amount,balance_after,bet_id)
select w.id,w.user_id,'BET_STAKE',-100,900,'51000000-0000-0000-0000-000000000001' from public.wallets w where w.user_id='11000000-0000-0000-0000-000000000001';

set local role authenticated;
select set_config('request.jwt.claims','{"sub":"11000000-0000-0000-0000-000000000001","role":"authenticated"}',true);
select throws_ok($$select public.admin_reset_fantasy_leaderboard('Player attempt','RESET LEADERBOARD','71000000-0000-0000-0000-000000000001')$$,'42501','ADMIN_REQUIRED','player cannot reset leaderboard');

reset role; set local role authenticated;
select set_config('request.jwt.claims','{"sub":"11000000-0000-0000-0000-000000000099","role":"authenticated"}',true);
select throws_ok($$select public.admin_reset_fantasy_leaderboard('Monthly reset','wrong','71000000-0000-0000-0000-000000000002')$$,'22023','RESET_CONFIRMATION_REQUIRED','exact confirmation is required');
select throws_ok($$select public.admin_reset_fantasy_leaderboard('','RESET LEADERBOARD','71000000-0000-0000-0000-000000000003')$$,'22023','REASON_REQUIRED','reason is required');
select throws_ok($$select public.admin_reset_fantasy_leaderboard('Monthly reset','RESET LEADERBOARD','71000000-0000-0000-0000-000000000004')$$,'P0001','LEADERBOARD_RESET_PENDING_BETS','pending bets block reset');

reset role;
update public.bets set state='LOST',settled_at=clock_timestamp() where id='51000000-0000-0000-0000-000000000001';
set local role authenticated;
select set_config('request.jwt.claims','{"sub":"11000000-0000-0000-0000-000000000099","role":"authenticated"}',true);
select is((public.admin_reset_fantasy_leaderboard('Monthly reset','RESET LEADERBOARD','71000000-0000-0000-0000-000000000005')->>'leaderboard_round'),'2','reset advances leaderboard round');
select is((select balance::text from public.wallets where user_id='11000000-0000-0000-0000-000000000001'),'1000.00','player wallet returns to configured starting balance');
select is((select count(*)::integer from public.wallet_transactions where user_id='11000000-0000-0000-0000-000000000001' and metadata @> '{"leaderboard_reset":true}'),1,'reset creates one marked immutable adjustment');
select is((select amount::text from public.wallet_transactions where user_id='11000000-0000-0000-0000-000000000001' and metadata @> '{"leaderboard_reset":true}'),'100.00','reset adjustment reconciles the prior balance');
select is((select count(*)::integer from public.bets where user_id='11000000-0000-0000-0000-000000000001'),1,'historical bet is preserved');
select is((select bets::integer from public.fantasy_leaderboard where player_id='11000000-0000-0000-0000-000000000001'),0,'active-round bet count restarts');
select is((select wins::integer from public.fantasy_leaderboard where player_id='11000000-0000-0000-0000-000000000001'),0,'active-round win count restarts');
select is((select net_profit_loss::text from public.fantasy_leaderboard where player_id='11000000-0000-0000-0000-000000000001'),'0.00','reset adjustment is excluded from active-round result');
select is((select count(*)::integer from public.admin_audit_events where action='LEADERBOARD_RESET'),1,'reset is audited once');
select is((public.admin_reset_fantasy_leaderboard('Monthly reset','RESET LEADERBOARD','71000000-0000-0000-0000-000000000005')->>'idempotent_replay'),'true','same request returns an idempotent replay');
select is((select count(*)::integer from public.admin_audit_events where action='LEADERBOARD_RESET'),1,'replay does not create another audit');
select is((select count(*)::integer from public.wallet_transactions where user_id='11000000-0000-0000-0000-000000000001' and metadata @> '{"leaderboard_reset":true}'),1,'replay does not create another adjustment');
select ok(has_function_privilege('authenticated','public.admin_reset_fantasy_leaderboard(text,text,uuid)','EXECUTE'),'authenticated can reach protected RPC boundary');

select * from finish();
rollback;
