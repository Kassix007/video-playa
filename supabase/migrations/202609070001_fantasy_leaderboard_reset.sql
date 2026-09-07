begin;

alter table public.game_settings
  add column leaderboard_round bigint not null default 1 check (leaderboard_round > 0),
  add column leaderboard_reset_at timestamptz;

create or replace view public.fantasy_leaderboard
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
cross join public.game_settings settings
left join lateral (
  select coalesce(sum(amount) filter (
    where type <> 'OPENING_BALANCE'
      and not (metadata @> '{"leaderboard_reset": true}'::jsonb)
      and (settings.leaderboard_reset_at is null or created_at >= settings.leaderboard_reset_at)
  ), 0) as net_profit_loss
  from public.wallet_transactions where user_id = p.id
) t on true
left join lateral (
  select count(*) filter (where state = 'WON') as wins, count(*) as bets
  from public.bets
  where user_id = p.id
    and (settings.leaderboard_reset_at is null or accepted_at >= settings.leaderboard_reset_at)
) b on true
where settings.id = true;

revoke all on public.fantasy_leaderboard from public;
grant select on public.fantasy_leaderboard to anon, authenticated;

comment on view public.fantasy_leaderboard is
'Intentional public aggregate for the active competition round: chosen display identity and totals only; never auth email, reset adjustments, or ledger rows.';

create or replace function public.admin_reset_fantasy_leaderboard(
  p_reason text,
  p_confirmation text,
  p_idempotency_key uuid
)
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_actor uuid := private.require_fantasy_admin();
  v_settings public.game_settings%rowtype;
  v_wallet public.wallets%rowtype;
  v_audit public.admin_audit_events%rowtype;
  v_reset_at timestamptz;
  v_new_round bigint;
  v_player_count integer;
  v_adjustment_count integer := 0;
  v_previous_total numeric(18,2);
  v_amount numeric(18,2);
begin
  if char_length(btrim(coalesce(p_reason, ''))) < 3 then
    raise exception using errcode = '22023', message = 'REASON_REQUIRED';
  end if;
  if coalesce(p_confirmation, '') <> 'RESET LEADERBOARD' then
    raise exception using errcode = '22023', message = 'RESET_CONFIRMATION_REQUIRED';
  end if;
  if p_idempotency_key is null then
    raise exception using errcode = '22023', message = 'IDEMPOTENCY_KEY_REQUIRED';
  end if;

  select * into v_settings from public.game_settings where id = true for update;
  select * into v_audit from public.admin_audit_events
    where actor_id = v_actor and action = 'LEADERBOARD_RESET' and idempotency_key = p_idempotency_key;
  if found then
    return v_audit.after_data || jsonb_build_object('idempotent_replay', true, 'audit_id', v_audit.id);
  end if;

  perform 1 from public.wallets order by id for update;
  if exists (select 1 from public.bets where state = 'PENDING') then
    raise exception using errcode = 'P0001', message = 'LEADERBOARD_RESET_PENDING_BETS';
  end if;

  select count(*)::integer, coalesce(sum(balance), 0)::numeric(18,2)
    into v_player_count, v_previous_total from public.wallets;
  v_reset_at := clock_timestamp();
  v_new_round := v_settings.leaderboard_round + 1;

  insert into public.admin_audit_events(
    actor_id, action, entity_type, reason, before_data, after_data, idempotency_key
  ) values (
    v_actor, 'LEADERBOARD_RESET', 'game_settings', btrim(p_reason),
    jsonb_build_object(
      'leaderboard_round', v_settings.leaderboard_round,
      'leaderboard_reset_at', v_settings.leaderboard_reset_at,
      'player_count', v_player_count,
      'aggregate_balance', v_previous_total
    ),
    jsonb_build_object(
      'leaderboard_round', v_new_round,
      'leaderboard_reset_at', v_reset_at,
      'player_count', v_player_count,
      'starting_balance', v_settings.default_starting_balance,
      'aggregate_balance', v_settings.default_starting_balance * v_player_count
    ),
    p_idempotency_key
  ) returning * into v_audit;

  for v_wallet in select * from public.wallets order by id loop
    v_amount := v_settings.default_starting_balance - v_wallet.balance;
    if v_amount <> 0 then
      update public.wallets
        set balance = v_settings.default_starting_balance,
            version = version + 1,
            updated_at = v_reset_at
        where id = v_wallet.id;
      insert into public.wallet_transactions(
        wallet_id, user_id, type, amount, balance_after, admin_audit_id, reason, metadata, created_by, created_at
      ) values (
        v_wallet.id, v_wallet.user_id, 'ADMIN_ADJUSTMENT', v_amount,
        v_settings.default_starting_balance, v_audit.id, btrim(p_reason),
        jsonb_build_object('leaderboard_reset', true, 'leaderboard_round', v_new_round),
        v_actor, v_reset_at
      );
      v_adjustment_count := v_adjustment_count + 1;
    end if;
  end loop;

  update public.game_settings
    set leaderboard_round = v_new_round,
        leaderboard_reset_at = v_reset_at,
        version = version + 1,
        updated_at = v_reset_at,
        updated_by = v_actor
    where id = true;

  return v_audit.after_data || jsonb_build_object(
    'adjustments_created', v_adjustment_count,
    'idempotent_replay', false,
    'audit_id', v_audit.id
  );
end;
$$;

revoke all on function public.admin_reset_fantasy_leaderboard(text, text, uuid) from public, anon;
grant execute on function public.admin_reset_fantasy_leaderboard(text, text, uuid) to authenticated;

commit;
