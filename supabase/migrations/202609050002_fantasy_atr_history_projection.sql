-- Expose ATR-final pricing state in the safe player history projection and
-- make runner selectability independent of unverified pre-race prices.

create or replace function public.get_fantasy_peakpool_bootstrap()
returns jsonb
language sql
stable
security definer
set search_path = ''
as $$
  select jsonb_build_object(
    'programme_date', timezone('Indian/Mauritius', clock_timestamp())::date,
    'settings', (select (to_jsonb(s) - 'updated_by') || jsonb_build_object(
      'default_starting_balance', s.default_starting_balance::text,
      'minimum_stake', s.minimum_stake::text,
      'maximum_stake', case when s.maximum_stake is null then null else to_jsonb(s.maximum_stake::text) end
    ) from public.game_settings s where id = true),
    'profile', (select jsonb_build_object('id', p.id, 'role', p.role, 'display_name', p.display_name, 'avatar_url', p.avatar_url)
      from public.profiles p where p.id = (select auth.uid())),
    'wallet', (select jsonb_build_object('balance', w.balance::text, 'version', w.version)
      from public.wallets w where w.user_id = (select auth.uid())),
    'races', coalesce((select jsonb_agg(jsonb_build_object(
      'id', r.id, 'external_race_id', r.external_race_id, 'meeting_number', r.meeting_number,
      'race_number', r.race_number, 'racecourse', r.racecourse, 'race_name', r.race_name,
      'official_off_at', r.official_off_at, 'state', r.state,
      'runners', coalesce((select jsonb_agg(jsonb_build_object(
        'id', rr.id, 'runner_number', rr.runner_number, 'runner_name', rr.runner_name,
        'raw_price', os.raw_price, 'normalized_price', os.normalized_price::text, 'odds_snapshot_id', os.id,
        'available', rr.active and coalesce(os.availability_reason, '') <> 'NON_RUNNER_DISPLAY_SENTINEL',
        'availability_reason', os.availability_reason
      ) order by rr.runner_number) from public.race_runners rr
      left join lateral (select o.* from public.odds_snapshots o where o.runner_id = rr.id order by o.observed_at desc limit 1) os on true
      where rr.race_id = r.id), '[]'::jsonb)
    ) order by r.meeting_number, r.race_number) from public.race_events r
      where r.programme_date = timezone('Indian/Mauritius', clock_timestamp())::date), '[]'::jsonb),
    'bets', case when (select auth.uid()) is null then '[]'::jsonb else coalesce((select jsonb_agg(to_jsonb(b) order by b.accepted_at desc)
      from (select b.id, b.race_id, b.runner_id, rr.runner_name,
        concat(r.racecourse, ' R', r.race_number) as race_label,
        b.stake::text as stake, b.locked_price::text as locked_price,
        b.potential_gross_return::text as potential_gross_return, b.result_metadata,
        b.state, b.accepted_at
        from public.bets b
        join public.race_events r on r.id = b.race_id
        join public.race_runners rr on rr.id = b.runner_id
        where b.user_id = (select auth.uid()) order by b.accepted_at desc limit 100) b), '[]'::jsonb) end,
    'ledger', case when (select auth.uid()) is null then '[]'::jsonb else coalesce((select jsonb_agg(to_jsonb(t) order by t.created_at desc)
      from (select id, type, amount::text as amount, balance_after::text as balance_after, reason, created_at
        from public.wallet_transactions where user_id = (select auth.uid()) order by created_at desc limit 100) t), '[]'::jsonb) end,
    'leaderboard', coalesce((select jsonb_agg(to_jsonb(l) order by l.rank)
      from (select rank, player, avatar_url, balance::text as balance,
        net_profit_loss::text as net_profit_loss, wins, bets
        from public.fantasy_leaderboard order by rank limit 100) l), '[]'::jsonb)
  );
$$;
