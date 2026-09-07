create extension if not exists pg_cron;
create extension if not exists pg_net with schema extensions;

create or replace function private.invoke_fantasy_edge_job(
  p_url_secret_name text,
  p_token_secret_name text
)
returns bigint
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_url text;
  v_token text;
  v_request_id bigint;
begin
  select decrypted_secret into v_url from vault.decrypted_secrets where name = p_url_secret_name limit 1;
  select decrypted_secret into v_token from vault.decrypted_secrets where name = p_token_secret_name limit 1;
  if v_url is null or v_token is null then return null; end if;
  select net.http_post(
    url := v_url,
    headers := jsonb_build_object('Content-Type', 'application/json', 'Authorization', 'Bearer ' || v_token),
    body := '{}'::jsonb,
    timeout_milliseconds := 120000
  ) into v_request_id;
  return v_request_id;
end;
$$;

create or replace function private.prune_fantasy_peakpool_evidence()
returns jsonb
language plpgsql
security definer
set search_path = ''
as $$
declare
  v_bodies integer;
  v_snapshots integer;
begin
  update public.source_payloads set raw_body = null
  where raw_body is not null and retrieved_at < clock_timestamp() - interval '7 days';
  get diagnostics v_bodies = row_count;

  delete from public.odds_snapshots o
  where not o.is_valid
    and o.created_at < clock_timestamp() - interval '90 days'
    and not exists (select 1 from public.bets b where b.odds_snapshot_id = o.id);
  get diagnostics v_snapshots = row_count;
  return jsonb_build_object('raw_bodies_cleared', v_bodies, 'unreferenced_unusable_snapshots_deleted', v_snapshots);
end;
$$;

revoke all on function private.invoke_fantasy_edge_job(text, text) from public, anon, authenticated;
revoke all on function private.prune_fantasy_peakpool_evidence() from public, anon, authenticated;

select cron.schedule(
  'fantasy-peakpool-results-five-minutes',
  '*/5 * * * *',
  $$select private.invoke_fantasy_edge_job('fantasy_result_checker_url', 'fantasy_result_cron_token');$$
);

select cron.schedule(
  'fantasy-peakpool-market-ten-minutes',
  '*/10 * * * *',
  $$select private.invoke_fantasy_edge_job('fantasy_peakpool_sync_url', 'fantasy_peakpool_sync_token');$$
);

select cron.schedule(
  'fantasy-peakpool-maintenance-daily',
  '20 22 * * *',
  $$select private.prune_fantasy_peakpool_evidence();$$
);
