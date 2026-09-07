begin;
create extension if not exists pgtap with schema extensions;
select plan(108);
-- Historical settlement fixtures intentionally retain the ATR contract.
-- This transaction-local default is rolled back at the end of the suite.
alter table public.bets alter column pricing_basis set default 'ATR_FINAL_SP';

select has_table('public', 'profiles', 'profiles table exists');
select has_table('public', 'wallets', 'wallets table exists');
select has_table('public', 'wallet_transactions', 'ledger table exists');
select has_table('public', 'race_events', 'race table exists');
select has_table('public', 'race_runners', 'runner table exists');
select has_table('public', 'odds_snapshots', 'odds history exists');
select has_table('public', 'bets', 'bets table exists');
select has_table('public', 'result_observations', 'result observations exist');
select has_table('public', 'race_results', 'results table exists');
select has_table('public', 'settlement_runs', 'settlements table exists');
select has_table('public', 'admin_audit_events', 'audit table exists');

select ok((select relrowsecurity from pg_class where oid = 'public.profiles'::regclass), 'profiles RLS enabled');
select ok((select relrowsecurity from pg_class where oid = 'public.wallets'::regclass), 'wallets RLS enabled');
select ok((select relrowsecurity from pg_class where oid = 'public.wallet_transactions'::regclass), 'ledger RLS enabled');
select ok((select relrowsecurity from pg_class where oid = 'public.bets'::regclass), 'bets RLS enabled');
select ok((select relrowsecurity from pg_class where oid = 'public.race_events'::regclass), 'races RLS enabled');
select ok((select relrowsecurity from pg_class where oid = 'public.result_observations'::regclass), 'observations RLS enabled');
select ok((select relrowsecurity from pg_class where oid = 'public.admin_audit_events'::regclass), 'audit RLS enabled');

select has_function('public', 'place_fantasy_bet', array['uuid','uuid','numeric','numeric','uuid'], 'placement RPC exists');
select has_function('public', 'admin_adjust_wallet', array['uuid','numeric','text','uuid'], 'adjustment RPC exists');
select has_function('public', 'admin_confirm_race_result', array['uuid','uuid[]','uuid[]','uuid','text','uuid'], 'manual confirmation RPC exists');
select has_function('public', 'admin_void_race', array['uuid','text','uuid'], 'void RPC exists');
select has_function('public', 'admin_correct_race_result', array['uuid','uuid[]','uuid[]','uuid','text','uuid'], 'correction RPC exists');
select has_function('public', 'ingest_fantasy_peakpool_snapshot', array['jsonb'], 'ingestion RPC exists');

insert into auth.users(id, aud, role, raw_app_meta_data, raw_user_meta_data, created_at, updated_at)
values
  ('10000000-0000-0000-0000-000000000001', 'authenticated', 'authenticated', '{"provider":"google"}', '{"full_name":"Player One"}', now(), now()),
  ('10000000-0000-0000-0000-000000000002', 'authenticated', 'authenticated', '{"provider":"google"}', '{"full_name":"Player Two"}', now(), now()),
  ('10000000-0000-0000-0000-000000000099', 'authenticated', 'authenticated', '{"provider":"google"}', '{"full_name":"Admin"}', now(), now());

select is((select count(*)::integer from public.wallets), 3, 'one wallet per Google user');
select is((select count(*)::integer from public.wallet_transactions where type = 'OPENING_BALANCE'), 3, 'one opening entry per wallet');
select is((select balance::text from public.wallets where user_id = '10000000-0000-0000-0000-000000000001'), '1000.00', 'opening balance uses settings');

update public.profiles set role = 'admin' where id = '10000000-0000-0000-0000-000000000099';
update public.game_settings set betting_enabled = true, max_quote_age_seconds = 300 where id = true;
insert into public.source_payloads(sha256, source_url, retrieved_at, byte_length)
select repeat(ch, 64), 'https://www.smspariaz.com/service/peakpool_json.php', now(), 100
from unnest(array['a','b','c','d','e','f','1','2','3','4']) ch;
insert into public.race_events(id, programme_date, external_race_id, meeting_number, race_number, racecourse,
  normalized_racecourse, official_off_at, state, racecard_observed_at, automatic_check_until)
values ('20000000-0000-0000-0000-000000000001', timezone('Indian/Mauritius', now())::date, 'R1C1', 1, 1,
  'TEST COURSE', 'testcourse', now() + interval '1 hour', 'OPEN', now(), now() + interval '13 hours');
insert into public.race_runners(id, race_id, runner_number, runner_name, normalized_runner_name, source_selection_code)
values
  ('30000000-0000-0000-0000-000000000001', '20000000-0000-0000-0000-000000000001', 1, 'Winner', 'winner', 'R1C1H1'),
  ('30000000-0000-0000-0000-000000000002', '20000000-0000-0000-0000-000000000001', 2, 'Loser', 'loser', 'R1C1H2');
insert into public.odds_snapshots(id, race_id, runner_id, raw_price, normalized_price, normalization_rule,
  source, source_payload_hash, observed_at, valid_until, is_valid)
values
  ('40000000-0000-0000-0000-000000000001', '20000000-0000-0000-0000-000000000001',
   '30000000-0000-0000-0000-000000000001', '450', 4.50, 'fixture-only-v1',
   'https://www.smspariaz.com/service/peakpool_json.php', repeat('a',64), now(), now() + interval '5 minutes', true),
  ('40000000-0000-0000-0000-000000000002', '20000000-0000-0000-0000-000000000001',
   '30000000-0000-0000-0000-000000000002', '300', 3.00, 'fixture-only-v1',
   'https://www.smspariaz.com/service/peakpool_json.php', repeat('b',64), now(), now() + interval '5 minutes', true),
  ('40000000-0000-0000-0000-000000000003', '20000000-0000-0000-0000-000000000001',
   '30000000-0000-0000-0000-000000000002', '290', 2.90, 'fixture-only-v1',
   'https://www.smspariaz.com/service/peakpool_json.php', repeat('c',64), now() - interval '10 minutes', now() - interval '5 minutes', true);

insert into public.race_events(id, programme_date, external_race_id, meeting_number, race_number, racecourse,
  normalized_racecourse, official_off_at, state, racecard_observed_at, next_result_check_at, automatic_check_until)
values
  ('20000000-0000-0000-0000-000000000002', timezone('Indian/Mauritius', now())::date, 'R1C2', 1, 2, 'TEST COURSE', 'testcourse', now() + interval '1 hour', 'OPEN', now(), now() + interval '65 minutes', now() + interval '13 hours'),
  ('20000000-0000-0000-0000-000000000003', timezone('Indian/Mauritius', now())::date, 'R1C3', 1, 3, 'TEST COURSE', 'testcourse', now() + interval '1 hour', 'OPEN', now(), now() + interval '65 minutes', now() + interval '13 hours'),
  ('20000000-0000-0000-0000-000000000004', timezone('Indian/Mauritius', now())::date, 'R1C4', 1, 4, 'TEST COURSE', 'testcourse', now() + interval '1 hour', 'OPEN', now(), now() + interval '65 minutes', now() + interval '13 hours'),
  ('20000000-0000-0000-0000-000000000005', timezone('Indian/Mauritius', now())::date, 'R1C5', 1, 5, 'TEST COURSE', 'testcourse', now() + interval '1 hour', 'OPEN', now(), now() + interval '65 minutes', now() + interval '13 hours'),
  ('20000000-0000-0000-0000-000000000006', timezone('Indian/Mauritius', now())::date, 'R1C6', 1, 6, 'TEST COURSE', 'testcourse', now() + interval '30 seconds', 'OPEN', now(), now() + interval '6 minutes', now() + interval '13 hours');

insert into public.race_runners(id, race_id, runner_number, runner_name, normalized_runner_name, source_selection_code)
values
  ('30000000-0000-0000-0000-000000000003', '20000000-0000-0000-0000-000000000002', 1, 'Joint One', 'jointone', 'R1C2H1'),
  ('30000000-0000-0000-0000-000000000004', '20000000-0000-0000-0000-000000000002', 2, 'Joint Two', 'jointtwo', 'R1C2H2'),
  ('30000000-0000-0000-0000-000000000005', '20000000-0000-0000-0000-000000000003', 1, 'Non Runner', 'nonrunner', 'R1C3H1'),
  ('30000000-0000-0000-0000-000000000006', '20000000-0000-0000-0000-000000000003', 2, 'Race Winner', 'racewinner', 'R1C3H2'),
  ('30000000-0000-0000-0000-000000000007', '20000000-0000-0000-0000-000000000004', 1, 'Void Selection', 'voidselection', 'R1C4H1'),
  ('30000000-0000-0000-0000-000000000008', '20000000-0000-0000-0000-000000000005', 1, 'Review Winner', 'reviewwinner', 'R1C5H1'),
  ('30000000-0000-0000-0000-000000000009', '20000000-0000-0000-0000-000000000005', 2, 'Review Loser', 'reviewloser', 'R1C5H2'),
  ('30000000-0000-0000-0000-000000000010', '20000000-0000-0000-0000-000000000006', 1, 'Closed Runner', 'closedrunner', 'R1C6H1');

insert into public.odds_snapshots(id, race_id, runner_id, raw_price, normalized_price, normalization_rule,
  source, source_payload_hash, observed_at, valid_until, is_valid)
values
  ('40000000-0000-0000-0000-000000000004','20000000-0000-0000-0000-000000000002','30000000-0000-0000-0000-000000000003','500',5.00,'fixture-only-v1','https://www.smspariaz.com/service/peakpool_json.php',repeat('d',64),now(),now()+interval '5 minutes',true),
  ('40000000-0000-0000-0000-000000000005','20000000-0000-0000-0000-000000000002','30000000-0000-0000-0000-000000000004','300',3.00,'fixture-only-v1','https://www.smspariaz.com/service/peakpool_json.php',repeat('e',64),now(),now()+interval '5 minutes',true),
  ('40000000-0000-0000-0000-000000000006','20000000-0000-0000-0000-000000000003','30000000-0000-0000-0000-000000000005','200',2.00,'fixture-only-v1','https://www.smspariaz.com/service/peakpool_json.php',repeat('f',64),now(),now()+interval '5 minutes',true),
  ('40000000-0000-0000-0000-000000000007','20000000-0000-0000-0000-000000000004','30000000-0000-0000-0000-000000000007','250',2.50,'fixture-only-v1','https://www.smspariaz.com/service/peakpool_json.php',repeat('1',64),now(),now()+interval '5 minutes',true),
  ('40000000-0000-0000-0000-000000000008','20000000-0000-0000-0000-000000000005','30000000-0000-0000-0000-000000000008','400',4.00,'fixture-only-v1','https://www.smspariaz.com/service/peakpool_json.php',repeat('2',64),now(),now()+interval '5 minutes',true),
  ('40000000-0000-0000-0000-000000000009','20000000-0000-0000-0000-000000000006','30000000-0000-0000-0000-000000000010','200',2.00,'fixture-only-v1','https://www.smspariaz.com/service/peakpool_json.php',repeat('3',64),now(),now()+interval '5 minutes',true);

insert into public.result_observations(
  id, race_id, provider, source_url, retrieved_at, status, programme_date, course,
  race_number, finishing_order, payload_hash, confidence
) values
  ('80000000-0000-0000-0000-000000000001','20000000-0000-0000-0000-000000000001','attheraces','https://www.attheraces.com/results/test/1',now(),'CONFIRMED',timezone('Indian/Mauritius',now())::date,'TEST COURSE',1,
    '[{"position":1,"runnerNumber":1,"runnerName":"Winner","finalizedStartingPriceRaw":"4/1 F"},{"position":2,"runnerNumber":2,"runnerName":"Loser","finalizedStartingPriceRaw":"2/1"}]',repeat('a',64),1),
  ('80000000-0000-0000-0000-000000000002','20000000-0000-0000-0000-000000000001','attheraces','https://www.attheraces.com/results/test/1-corrected',now(),'CONFIRMED',timezone('Indian/Mauritius',now())::date,'TEST COURSE',1,
    '[{"position":1,"runnerNumber":2,"runnerName":"Loser","finalizedStartingPriceRaw":"2/1"},{"position":2,"runnerNumber":1,"runnerName":"Winner","finalizedStartingPriceRaw":"4/1"}]',repeat('b',64),1),
  ('80000000-0000-0000-0000-000000000003','20000000-0000-0000-0000-000000000002','attheraces','https://www.attheraces.com/results/test/2',now(),'CONFIRMED',timezone('Indian/Mauritius',now())::date,'TEST COURSE',2,
    '[{"position":1,"runnerNumber":1,"runnerName":"Joint One","finalizedStartingPriceRaw":"4/1"},{"position":1,"runnerNumber":2,"runnerName":"Joint Two","finalizedStartingPriceRaw":"2/1"}]',repeat('c',64),1),
  ('80000000-0000-0000-0000-000000000005','20000000-0000-0000-0000-000000000005','attheraces','https://www.attheraces.com/results/test/5',now(),'CONFIRMED',timezone('Indian/Mauritius',now())::date,'TEST COURSE',5,
    '[{"position":1,"runnerNumber":1,"runnerName":"Review Winner","finalizedStartingPriceRaw":"3/1"}]',repeat('d',64),1);

set local role authenticated;
select set_config('request.jwt.claims', '{"sub":"10000000-0000-0000-0000-000000000001","role":"authenticated"}', true);

select is((public.place_fantasy_bet(
  '30000000-0000-0000-0000-000000000001', null,
  100.00, null, '50000000-0000-0000-0000-000000000001'
) ->> 'new_balance'), '900.00', 'unpriced ATR-final bet atomically debits balance');
select is((public.place_fantasy_bet(
  '30000000-0000-0000-0000-000000000001', null,
  100.00, null, '50000000-0000-0000-0000-000000000001'
) ->> 'idempotent_replay'), 'true', 'duplicate request replays original receipt');
select is((select locked_price from public.bets where idempotency_key = '50000000-0000-0000-0000-000000000001'), null, 'pending ATR-final bet has no invented pre-race price');
select is((select count(*)::integer from public.bets), 1, 'duplicate request creates one bet');
select is((select count(*)::integer from public.wallet_transactions where type = 'BET_STAKE'), 1, 'duplicate request creates one debit');
select throws_ok(
  $$ select public.place_fantasy_bet('30000000-0000-0000-0000-000000000001','40000000-0000-0000-0000-000000000001',99.00,4.50,'50000000-0000-0000-0000-000000000001') $$,
  '23505', 'BET_CONFLICT', 'idempotency key cannot be reused with different inputs');
select throws_ok(
  $$ select public.place_fantasy_bet('30000000-0000-0000-0000-000000000002','40000000-0000-0000-0000-000000000002',10.00,3.10,'50000000-0000-0000-0000-000000000002') $$,
  'P0001', 'PRICE_CHANGED', 'material quote change requires a requote');
select throws_ok(
  $$ select public.place_fantasy_bet('30000000-0000-0000-0000-000000000002','40000000-0000-0000-0000-000000000003',10.00,2.90,'50000000-0000-0000-0000-000000000003') $$,
  'P0001', 'QUOTE_STALE', 'expired quote is rejected');
select throws_ok(
  $$ select public.place_fantasy_bet('30000000-0000-0000-0000-000000000010','40000000-0000-0000-0000-000000000009',10.00,2.00,'50000000-0000-0000-0000-000000000004') $$,
  'P0001', 'RACE_CLOSED', 'server close buffer rejects a boundary bet');
select is((public.place_fantasy_bet('30000000-0000-0000-0000-000000000003','40000000-0000-0000-0000-000000000004',20.00,5.00,'50000000-0000-0000-0000-000000000005')->>'new_balance'), '880.00', 'first competing tab request debits the locked wallet');
select is((public.place_fantasy_bet('30000000-0000-0000-0000-000000000005','40000000-0000-0000-0000-000000000006',10.00,2.00,'50000000-0000-0000-0000-000000000006')->>'new_balance'), '870.00', 'second race stake preserves exact balance');
select is((public.place_fantasy_bet('30000000-0000-0000-0000-000000000007','40000000-0000-0000-0000-000000000007',10.00,2.50,'50000000-0000-0000-0000-000000000007')->>'new_balance'), '860.00', 'void-race fixture bet is accepted atomically');
select is((public.place_fantasy_bet('30000000-0000-0000-0000-000000000008','40000000-0000-0000-0000-000000000008',10.00,4.00,'50000000-0000-0000-0000-000000000008')->>'new_balance'), '850.00', 'review fixture bet is accepted atomically');
select throws_ok(
  $$ select public.place_fantasy_bet('30000000-0000-0000-0000-000000000001','40000000-0000-0000-0000-000000000001',950.00,4.50,'50000000-0000-0000-0000-000000000002') $$,
  'P0001', 'INSUFFICIENT_BALANCE', 'overspend is rejected');
select is((select count(*)::integer from public.bets where user_id <> auth.uid()), 0, 'player cannot read another player bets');
select is((select count(*)::integer from public.wallets where user_id <> auth.uid()), 0, 'player cannot read another wallet');
select is((select count(*)::integer from public.wallet_transactions where user_id <> auth.uid()), 0, 'player cannot read another ledger');
select throws_ok($$ update public.profiles set role = 'admin' where id = auth.uid() $$,
  '42501', null, 'player cannot promote their protected role');
select throws_ok(
  $$ select public.admin_adjust_wallet('10000000-0000-0000-0000-000000000002',10.00,'forbidden','60000000-0000-0000-0000-000000000001') $$,
  '42501', 'ADMIN_REQUIRED', 'player cannot invoke admin adjustment');
select throws_ok(
  $$ select public.admin_update_game_settings(true,1000,1,null,60,300,300,43200,'forbidden','60000000-0000-0000-0000-000000000011') $$,
  '42501', 'ADMIN_REQUIRED', 'player cannot update settings');
select throws_ok(
  $$ select public.admin_confirm_race_result('20000000-0000-0000-0000-000000000002',array['30000000-0000-0000-0000-000000000003']::uuid[],'{}'::uuid[],null,'forbidden','60000000-0000-0000-0000-000000000012') $$,
  '42501', 'ADMIN_REQUIRED', 'player cannot confirm results');
select throws_ok(
  $$ select public.admin_void_race('20000000-0000-0000-0000-000000000004','forbidden','60000000-0000-0000-0000-000000000013') $$,
  '42501', 'ADMIN_REQUIRED', 'player cannot void races');
select throws_ok(
  $$ select public.admin_retry_result_check('20000000-0000-0000-0000-000000000005','forbidden','60000000-0000-0000-0000-000000000014') $$,
  '42501', 'ADMIN_REQUIRED', 'player cannot retry result checks');
select throws_ok(
  $$ select public.admin_correct_race_result('20000000-0000-0000-0000-000000000001',array['30000000-0000-0000-0000-000000000002']::uuid[],'{}'::uuid[],null,'forbidden','60000000-0000-0000-0000-000000000015') $$,
  '42501', 'ADMIN_REQUIRED', 'player cannot correct results');
select throws_ok($$ select public.get_fantasy_peakpool_admin() $$,
  '42501', 'ADMIN_REQUIRED', 'player cannot read the admin payload');

reset role;
set local role authenticated;
select set_config('request.jwt.claims', '{"sub":"10000000-0000-0000-0000-000000000099","role":"authenticated"}', true);
select is((public.admin_adjust_wallet('10000000-0000-0000-0000-000000000002',25.00,'Competition credit','60000000-0000-0000-0000-000000000002') ->> 'balance'), '1025.00', 'admin adjustment is applied');
select is((select count(*)::integer from public.admin_audit_events where action = 'WALLET_ADJUSTMENT'), 1, 'admin adjustment is audited');
select is((public.admin_adjust_wallet('10000000-0000-0000-0000-000000000002',25.00,'Competition credit','60000000-0000-0000-0000-000000000002') ->> 'idempotent_replay'), 'true', 'admin adjustment replay is idempotent');
select is((select count(*)::integer from public.wallet_transactions where type = 'ADMIN_ADJUSTMENT'), 1, 'adjustment replay creates one ledger credit');
select throws_ok($$ select public.admin_adjust_wallet('10000000-0000-0000-0000-000000000002',1.00,'','60000000-0000-0000-0000-000000000021') $$,
  '22023', 'REASON_REQUIRED', 'wallet adjustment requires a reason');
select throws_ok($$ select public.admin_update_game_settings(true,1000,1,null,60,300,300,43200,'','60000000-0000-0000-0000-000000000022') $$,
  '22023', 'REASON_REQUIRED', 'settings update requires a reason');
select throws_ok($$ select public.admin_confirm_race_result('20000000-0000-0000-0000-000000000002',array['30000000-0000-0000-0000-000000000003']::uuid[],'{}'::uuid[],null,'','60000000-0000-0000-0000-000000000023') $$,
  '22023', 'RESULT_REASON_AND_WINNER_REQUIRED', 'manual confirmation requires a reason');
select throws_ok($$ select public.admin_void_race('20000000-0000-0000-0000-000000000004','','60000000-0000-0000-0000-000000000024') $$,
  '22023', 'REASON_REQUIRED', 'race void requires a reason');
select throws_ok($$ select public.admin_retry_result_check('20000000-0000-0000-0000-000000000005','','60000000-0000-0000-0000-000000000025') $$,
  '22023', 'REASON_REQUIRED', 'result retry requires a reason');
select throws_ok($$ select public.admin_correct_race_result('20000000-0000-0000-0000-000000000001',array['30000000-0000-0000-0000-000000000002']::uuid[],'{}'::uuid[],null,'','60000000-0000-0000-0000-000000000026') $$,
  '22023', 'CORRECTION_REASON_AND_WINNER_REQUIRED', 'result correction requires a reason');
select is((public.admin_update_game_settings(true,1000,1,null,60,300,300,43200,'Verified test settings','60000000-0000-0000-0000-000000000027')->>'betting_enabled'), 'true', 'admin can update game settings');
select is((select count(*)::integer from public.admin_audit_events where action = 'GAME_SETTINGS_UPDATE'), 1, 'settings change is audited');

reset role;
set local role authenticated;
select set_config('request.jwt.claims', '{"sub":"10000000-0000-0000-0000-000000000002","role":"authenticated"}', true);
select is((public.place_fantasy_bet('30000000-0000-0000-0000-000000000002','40000000-0000-0000-0000-000000000002',50.00,3.00,'51000000-0000-0000-0000-000000000001')->>'new_balance'), '975.00', 'second player accepts a losing fixture bet');
select is((public.place_fantasy_bet('30000000-0000-0000-0000-000000000004','40000000-0000-0000-0000-000000000005',20.00,3.00,'51000000-0000-0000-0000-000000000002')->>'new_balance'), '955.00', 'second player accepts the other dead-heat selection');

reset role;
set local role authenticated;
select set_config('request.jwt.claims', '{"sub":"10000000-0000-0000-0000-000000000001","role":"authenticated"}', true);
select is((select count(*)::integer from public.bets where user_id = '10000000-0000-0000-0000-000000000002'), 0, 'RLS hides an existing second-player bet');

reset role;
set local role authenticated;
select set_config('request.jwt.claims', '{"sub":"10000000-0000-0000-0000-000000000099","role":"authenticated"}', true);
select is((public.admin_confirm_race_result(
  '20000000-0000-0000-0000-000000000001', array['30000000-0000-0000-0000-000000000001']::uuid[],
  '{}'::uuid[], '80000000-0000-0000-0000-000000000001', 'Official weighed-in result', '70000000-0000-0000-0000-000000000001'
) ->> 'won'), '1', 'confirmed winner settles one winning bet');
select is((select state::text from public.bets where runner_id = '30000000-0000-0000-0000-000000000002' and user_id = '10000000-0000-0000-0000-000000000002'), 'LOST', 'losing bet is marked LOST without a credit');
select is((select state::text from public.bets where runner_id = '30000000-0000-0000-0000-000000000001' and user_id = '10000000-0000-0000-0000-000000000001'), 'WON', 'winning bet is marked WON');
select is((select balance::text from public.wallets where user_id = '10000000-0000-0000-0000-000000000001'), '1350.00', 'gross ATR finalized-price return is credited');
select is((select count(*)::integer from public.wallet_transactions where type = 'BET_PAYOUT'), 1, 'settlement creates one payout');
select is((select count(*)::integer from public.settlement_runs where state = 'COMPLETED'), 1, 'settlement completes once');

reset role;
select is((private.settle_fantasy_race((select id from public.race_results where race_id = '20000000-0000-0000-0000-000000000001' order by version desc limit 1), null, 'duplicate check')->>'idempotent_replay'), 'true', 'duplicate settlement returns the completed run');

set local role authenticated;
select set_config('request.jwt.claims', '{"sub":"10000000-0000-0000-0000-000000000099","role":"authenticated"}', true);
select is((public.admin_correct_race_result(
  '20000000-0000-0000-0000-000000000001', array['30000000-0000-0000-0000-000000000002']::uuid[],
  '{}'::uuid[], '80000000-0000-0000-0000-000000000002', 'Corrected official winner', '70000000-0000-0000-0000-000000000002'
)->>'won'), '1', 'correction settles the replacement winner');
select is((select count(*)::integer from public.wallet_transactions where type = 'SETTLEMENT_REVERSAL'), 1, 'correction records an explicit reversal');
select is((select count(*)::integer from public.wallet_transactions where type = 'BET_PAYOUT'), 2, 'prior payout remains immutable beside corrected payout');
select is((select state::text from public.bets where user_id = '10000000-0000-0000-0000-000000000001' and race_id = '20000000-0000-0000-0000-000000000001'), 'LOST', 'correction changes the former winner to LOST');
select is((select state::text from public.bets where user_id = '10000000-0000-0000-0000-000000000002' and race_id = '20000000-0000-0000-0000-000000000001'), 'WON', 'correction pays the replacement winner');
select is((select count(*)::integer from public.admin_audit_events where action = 'RESULT_CORRECTION'), 1, 'correction is audited');

select is((public.admin_confirm_race_result(
  '20000000-0000-0000-0000-000000000002', array['30000000-0000-0000-0000-000000000003','30000000-0000-0000-0000-000000000004']::uuid[],
  '{}'::uuid[], '80000000-0000-0000-0000-000000000003', 'Official dead heat', '70000000-0000-0000-0000-000000000003'
)->>'won'), '2', 'dead heat settles both joint winners');
select is((select amount::text from public.wallet_transactions where bet_id = (select id from public.bets where runner_id = '30000000-0000-0000-0000-000000000003') and type = 'BET_PAYOUT'), '50.00', 'dead-heat payout divides ATR finalized return by two');
select is((select metadata->>'atr_finalized_starting_price_raw' from public.wallet_transactions where bet_id = (select id from public.bets where runner_id = '30000000-0000-0000-0000-000000000003') and type = 'BET_PAYOUT'), '4/1', 'payout ledger retains ATR finalized starting price');
select is((select metadata->>'joint_winner_count' from public.wallet_transactions where bet_id = (select id from public.bets where runner_id = '30000000-0000-0000-0000-000000000003') and type = 'BET_PAYOUT'), '2', 'dead-heat divisor is retained in ledger metadata');

select is((public.admin_confirm_race_result(
  '20000000-0000-0000-0000-000000000003', array['30000000-0000-0000-0000-000000000006']::uuid[],
  array['30000000-0000-0000-0000-000000000005']::uuid[], null, 'Confirmed non runner', '70000000-0000-0000-0000-000000000004'
)->>'void'), '1', 'confirmed non-runner voids the affected bet');
select is((select state::text from public.bets where runner_id = '30000000-0000-0000-0000-000000000005'), 'VOID', 'non-runner bet is marked VOID');
select is((select count(*)::integer from public.wallet_transactions where bet_id = (select id from public.bets where runner_id = '30000000-0000-0000-0000-000000000005') and type = 'BET_REFUND'), 1, 'non-runner stake is refunded exactly once');

select is((public.admin_void_race('20000000-0000-0000-0000-000000000004','Official race abandonment','70000000-0000-0000-0000-000000000005')->>'void'), '1', 'void race refunds every pending bet');
select is((select state::text from public.race_events where id = '20000000-0000-0000-0000-000000000004'), 'VOID', 'void race reaches VOID state');
select is((select count(*)::integer from public.wallet_transactions where bet_id = (select id from public.bets where runner_id = '30000000-0000-0000-0000-000000000007') and type = 'BET_REFUND'), 1, 'race void refund is unique');

reset role;
set local role service_role;
select is((public.record_fantasy_result_observation(
  jsonb_build_object(
    'race_id','20000000-0000-0000-0000-000000000005','provider','attheraces','source_url','https://www.attheraces.com/racecard/Test/04-September-2026/1200',
    'retrieved_at',clock_timestamp(),'status','NEEDS_REVIEW','programme_date',timezone('Indian/Mauritius',now())::date,
    'course','Test Course','race_number',5,'race_name','Review Race','finishing_order',jsonb_build_array(jsonb_build_object('position',1,'runnerNumber',1,'runnerName','Review Winner')),
    'non_runners','[]'::jsonb,'payload_hash',repeat('9',64)
  ),
  jsonb_build_object('status','NEEDS_REVIEW','winner_runner_ids',jsonb_build_array('30000000-0000-0000-0000-000000000008'),'confidence',0.5)
)->>'status'), 'NEEDS_REVIEW', 'ambiguous provider evidence fails closed to review');
select is((select state::text from public.race_events where id = '20000000-0000-0000-0000-000000000005'), 'NEEDS_REVIEW', 'ambiguous race is marked NEEDS_REVIEW');
select is((select state::text from public.bets where runner_id = '30000000-0000-0000-0000-000000000008'), 'PENDING', 'ambiguity makes no payout, refund, or loss assignment');

reset role;
set local role authenticated;
select set_config('request.jwt.claims', '{"sub":"10000000-0000-0000-0000-000000000099","role":"authenticated"}', true);
select is((public.admin_retry_result_check('20000000-0000-0000-0000-000000000005','Operator requested evidence retry','70000000-0000-0000-0000-000000000006')->>'queued'), 'true', 'admin can queue an eligible result retry');
select is((select count(*)::integer from public.admin_audit_events where action = 'RESULT_CHECK_RETRY'), 1, 'result retry is audited');
select is((public.admin_confirm_race_result(
  '20000000-0000-0000-0000-000000000005', array['30000000-0000-0000-0000-000000000008']::uuid[],
  '{}'::uuid[], '80000000-0000-0000-0000-000000000005', 'Manual confirmation after review', '70000000-0000-0000-0000-000000000007'
)->>'won'), '1', 'manual confirmation settles a reviewed race');
select is((select count(*)::integer from public.admin_audit_events where action = 'MANUAL_RESULT_CONFIRMATION'), 4, 'manual confirmations retain required audit rows');
select ok((select bool_and(char_length(btrim(reason)) >= 3) from public.admin_audit_events), 'every admin audit row retains a non-empty reason');

reset role;
set local role anon;
select set_config('request.jwt.claims', '{}', true);
select set_config('request.jwt.claim.sub', '', true);
select is((select count(*)::integer from public.fantasy_leaderboard), 3, 'anonymous visitors can read the public leaderboard');
select is(public.get_fantasy_peakpool_bootstrap()->'profile', 'null'::jsonb, 'anonymous bootstrap contains no private profile');
select ok(position('@' in public.get_fantasy_peakpool_bootstrap()::text) = 0, 'public bootstrap and leaderboard expose no email address');
select is((select bets::integer from public.fantasy_leaderboard where player_id = '10000000-0000-0000-0000-000000000001'), 5, 'leaderboard bet aggregate is correct');
select is((select wins::integer from public.fantasy_leaderboard where player_id = '10000000-0000-0000-0000-000000000001'), 2, 'leaderboard win aggregate reflects corrected and settled outcomes');
select is((select net_profit_loss::text from public.fantasy_leaderboard where player_id = '10000000-0000-0000-0000-000000000001'), '-40.00', 'leaderboard net result reconciles immutable ledger entries');

reset role;
select is((select count(*)::integer from public.wallets w where w.balance <> (select sum(t.amount) from public.wallet_transactions t where t.wallet_id = w.id)), 0, 'every cached wallet balance reconciles to its immutable ledger');
select ok(has_function_privilege('authenticated','public.admin_update_game_settings(boolean,numeric,numeric,numeric,integer,integer,integer,integer,text,uuid)','EXECUTE'), 'authenticated role can reach protected admin RPC boundary');
select ok(not has_function_privilege('anon','public.admin_update_game_settings(boolean,numeric,numeric,numeric,integer,integer,integer,integer,text,uuid)','EXECUTE'), 'anonymous role has no admin RPC execution grant');
select ok(not has_function_privilege('authenticated','public.ingest_fantasy_peakpool_snapshot(jsonb)','EXECUTE'), 'browser role has no ingestion execution grant');

select * from finish();
rollback;
