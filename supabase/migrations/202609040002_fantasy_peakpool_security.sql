create or replace function private.is_admin()
returns boolean
language sql
stable
security definer
set search_path = ''
as $$
  select exists (
    select 1 from public.profiles
    where id = (select auth.uid()) and role = 'admin'
  );
$$;

revoke all on function private.is_admin() from public;
grant usage on schema private to authenticated;
grant execute on function private.is_admin() to authenticated;

create or replace function private.reject_immutable_mutation()
returns trigger
language plpgsql
set search_path = ''
as $$
begin
  raise exception using errcode = '55000', message = tg_table_name || ' is immutable';
end;
$$;

create trigger wallet_transactions_immutable before update or delete on public.wallet_transactions
for each row execute function private.reject_immutable_mutation();
create trigger result_observations_immutable before update or delete on public.result_observations
for each row execute function private.reject_immutable_mutation();
create trigger race_results_immutable before update or delete on public.race_results
for each row execute function private.reject_immutable_mutation();
create trigger admin_audit_events_immutable before update or delete on public.admin_audit_events
for each row execute function private.reject_immutable_mutation();

alter table public.profiles enable row level security;
alter table public.game_settings enable row level security;
alter table public.wallets enable row level security;
alter table public.wallet_transactions enable row level security;
alter table public.source_payloads enable row level security;
alter table public.race_events enable row level security;
alter table public.race_runners enable row level security;
alter table public.odds_snapshots enable row level security;
alter table public.bets enable row level security;
alter table public.result_observations enable row level security;
alter table public.race_results enable row level security;
alter table public.settlement_runs enable row level security;
alter table public.admin_audit_events enable row level security;

revoke all on all tables in schema public from anon, authenticated;
revoke execute on all functions in schema public from public, anon, authenticated;
alter default privileges for role postgres in schema public revoke execute on functions from public, anon, authenticated;

grant select on public.game_settings, public.race_events, public.race_runners, public.odds_snapshots, public.race_results to anon, authenticated;
grant select on public.profiles, public.wallets, public.wallet_transactions, public.bets to authenticated;
grant select on public.result_observations, public.settlement_runs, public.admin_audit_events to authenticated;

create policy profiles_select_own_or_admin on public.profiles
for select to authenticated
using ((select auth.uid()) = id or (select private.is_admin()));

create policy game_settings_public_read on public.game_settings
for select to anon, authenticated using (true);

create policy wallets_select_own_or_admin on public.wallets
for select to authenticated
using ((select auth.uid()) = user_id or (select private.is_admin()));

create policy wallet_transactions_select_own_or_admin on public.wallet_transactions
for select to authenticated
using ((select auth.uid()) = user_id or (select private.is_admin()));

create policy race_events_public_read on public.race_events
for select to anon, authenticated using (true);

create policy race_runners_public_read on public.race_runners
for select to anon, authenticated using (true);

create policy odds_snapshots_public_read on public.odds_snapshots
for select to anon, authenticated using (true);

create policy bets_select_own_or_admin on public.bets
for select to authenticated
using ((select auth.uid()) = user_id or (select private.is_admin()));

create policy race_results_public_read on public.race_results
for select to anon, authenticated using (true);

create policy result_observations_admin_read on public.result_observations
for select to authenticated using ((select private.is_admin()));

create policy settlement_runs_admin_read on public.settlement_runs
for select to authenticated using ((select private.is_admin()));

create policy admin_audit_events_admin_read on public.admin_audit_events
for select to authenticated using ((select private.is_admin()));

create view public.fantasy_leaderboard
with (security_barrier = true)
as
select
  row_number() over (order by w.balance desc, p.created_at asc)::bigint as rank,
  p.id as player_id,
  p.display_name as player,
  p.avatar_url,
  w.balance,
  coalesce(t.net_profit_loss, 0)::numeric(18,2) as net_profit_loss,
  coalesce(b.wins, 0)::bigint as wins,
  coalesce(b.bets, 0)::bigint as bets
from public.profiles p
join public.wallets w on w.user_id = p.id
left join lateral (
  select coalesce(sum(amount) filter (where type <> 'OPENING_BALANCE'), 0) as net_profit_loss
  from public.wallet_transactions where user_id = p.id
) t on true
left join lateral (
  select count(*) filter (where state = 'WON') as wins, count(*) as bets
  from public.bets where user_id = p.id
) b on true;

revoke all on public.fantasy_leaderboard from public;
grant select on public.fantasy_leaderboard to anon, authenticated;

comment on view public.fantasy_leaderboard is
'Intentional public aggregate: chosen display identity and competition totals only; never auth email or ledger rows.';
