-- Owner approved pending-only PMU conversion on 2026-09-06. No credit mutation.
begin;
lock table public.bets in share row exclusive mode;
insert into public.admin_audit_events(action,entity_type,entity_id,reason,before_data,after_data)
select 'PMU_PRICING_MIGRATION','bet',id,'Owner approved pending bet conversion to PMU dividends on 2026-09-06',
  jsonb_build_object('pricing_basis',pricing_basis,'state',state),
  jsonb_build_object('pricing_basis','PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO','state',state)
from public.bets where state='PENDING' and pricing_basis='ATR_FINAL_SP';
update public.bets set pricing_basis='PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO',
  result_metadata=result_metadata || jsonb_build_object('pricing_basis','PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO','previous_pricing_basis','ATR_FINAL_SP','pricing_migration','202609060002')
where state='PENDING' and pricing_basis='ATR_FINAL_SP';

-- Requeue outstanding selections once, including those whose previous ATR window expired.
update public.race_events r set state='RESULT_PENDING',next_result_check_at=clock_timestamp(),
  automatic_check_until=greatest(coalesce(automatic_check_until,clock_timestamp()),clock_timestamp()+interval '24 hours'),
  result_check_claimed_at=null,updated_at=clock_timestamp()
where state not in ('SETTLED','VOID') and official_off_at<=clock_timestamp()
  and exists(select 1 from public.bets b where b.race_id=r.id and b.state='PENDING');

-- Preserve the legacy implementation for old contracts and explicit race voids.
alter function private.settle_fantasy_race(uuid,uuid,text) rename to settle_legacy_fantasy_race;
create function private.settle_fantasy_race(p_result_id uuid,p_actor uuid,p_reason text)
returns jsonb language plpgsql security definer set search_path='' as $$
declare v_result public.race_results%rowtype;
begin
  select * into v_result from public.race_results where id=p_result_id;
  perform 1 from public.race_events where id=v_result.race_id for update;
  if v_result.status<>'VOID' and exists(select 1 from public.bets where race_id=v_result.race_id
    and pricing_basis='PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO') then
    raise exception 'PMU_VERIFIED_DIVIDEND_REQUIRED';
  end if;
  return private.settle_legacy_fantasy_race(p_result_id,p_actor,p_reason);
end;
$$;
revoke all on function private.settle_fantasy_race(uuid,uuid,text) from public,anon,authenticated;
revoke all on function private.settle_legacy_fantasy_race(uuid,uuid,text) from public,anon,authenticated;

-- Keep the existing placement validation and idempotency logic byte-for-byte,
-- changing only the receipt/ledger's pending-pricing label.
do $$ declare definition text;
begin
  select pg_get_functiondef('public.place_fantasy_bet(uuid,uuid,numeric,numeric,uuid)'::regprocedure) into definition;
  if position('ATR_FINAL_PENDING' in definition)=0 then raise exception 'PLACEMENT_MIGRATION_PRECONDITION'; end if;
  execute replace(definition,'ATR_FINAL_PENDING','PMU_FINAL_PENDING');
end $$;

create function public.get_pmu_release_status()
returns jsonb language sql stable security definer set search_path='' as $$
select jsonb_build_object(
  'pending_atr_bets',(select count(*) from public.bets where state='PENDING' and pricing_basis='ATR_FINAL_SP'),
  'pending_pmu_bets',(select count(*) from public.bets where state='PENDING' and pricing_basis='PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO'),
  'settled_pmu_bets',(select count(*) from public.bets where state<>'PENDING' and pricing_basis='PMU_NATIONAL_SIMPLE_GAGNANT_PER_EURO'),
  'converted_bets',(select count(*) from public.admin_audit_events where action='PMU_PRICING_MIGRATION'),
  'wallet_total',(select coalesce(sum(balance),0)::text from public.wallets),
  'ledger_total',(select coalesce(sum(amount),0)::text from public.wallet_transactions),
  'cron_active',exists(select 1 from cron.job where jobname='fantasy-peakpool-results-five-minutes' and active),
  'cron_url_ready',exists(select 1 from vault.decrypted_secrets where name='fantasy_result_checker_url' and decrypted_secret like 'https://%.supabase.co/functions/v1/fantasy-pmu-result-checker'),
  'cron_token_ready',exists(select 1 from vault.decrypted_secrets where name='fantasy_result_cron_token' and length(decrypted_secret)>20)
);
$$;
revoke all on function public.get_pmu_release_status() from public,anon,authenticated;
grant execute on function public.get_pmu_release_status() to service_role;

create function public.claim_pmu_fantasy_result_check_batch(p_limit integer default 3)
returns setof public.race_events language plpgsql security definer set search_path='' as $$
begin
  if p_limit<1 or p_limit>3 then raise exception 'INVALID_BATCH_LIMIT'; end if;
  update public.race_events set state='CLOSED' where state in ('OPEN','UPCOMING') and official_off_at<=clock_timestamp();
  return query with candidates as (
    select r.id from public.race_events r
    where r.state in ('CLOSED','RESULT_PENDING','NEEDS_REVIEW') and r.next_result_check_at<=clock_timestamp()
      and r.automatic_check_until>clock_timestamp()
      and (r.result_check_claimed_at is null or r.result_check_claimed_at<clock_timestamp()-interval '5 minutes')
    order by exists(select 1 from public.bets b where b.race_id=r.id and b.state='PENDING') desc,r.next_result_check_at
    for update skip locked limit p_limit
  ) update public.race_events r set state='RESULT_PENDING',result_check_claimed_at=clock_timestamp(),
    result_check_attempts=r.result_check_attempts+1,
    next_result_check_at=clock_timestamp()+make_interval(mins=>least(60,5*greatest(1,r.result_check_attempts+1))),updated_at=clock_timestamp()
    from candidates c where r.id=c.id returning r.*;
  update public.race_events set state='NEEDS_REVIEW' where state in ('CLOSED','RESULT_PENDING') and automatic_check_until<=clock_timestamp();
end $$;
revoke all on function public.claim_pmu_fantasy_result_check_batch(integer) from public,anon,authenticated;
grant execute on function public.claim_pmu_fantasy_result_check_batch(integer) to service_role;

-- Retarget the existing five-minute job; keep its write-only bearer unchanged.
do $$ declare secret_id uuid; old_url text;
begin
  select id,decrypted_secret into secret_id,old_url from vault.decrypted_secrets where name='fantasy_result_checker_url' limit 1;
  if secret_id is not null then
    perform vault.update_secret(secret_id,regexp_replace(old_url,'/fantasy-result-checker$','/fantasy-pmu-result-checker'));
  end if;
end $$;
commit;
