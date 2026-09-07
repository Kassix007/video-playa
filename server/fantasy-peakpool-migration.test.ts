import assert from "node:assert/strict";
import { readFile } from "node:fs/promises";
import { test } from "node:test";

const migrationPaths = [
  "supabase/migrations/202609040001_fantasy_peakpool_schema.sql",
  "supabase/migrations/202609040002_fantasy_peakpool_security.sql",
  "supabase/migrations/202609040003_fantasy_peakpool_rpcs.sql",
  "supabase/migrations/202609050001_fantasy_atr_settlement_pricing.sql",
  "supabase/migrations/202609050002_fantasy_atr_history_projection.sql",
];

async function migrations(): Promise<string> {
  return (await Promise.all(migrationPaths.map((path) => readFile(path, "utf8")))).join("\n");
}

test("every exposed fantasy table is protected by RLS and direct mutation grants are revoked", async () => {
  const sql = await migrations();
  const tables = [
    "profiles", "game_settings", "wallets", "wallet_transactions", "source_payloads", "race_events",
    "race_runners", "odds_snapshots", "bets", "result_observations", "race_results", "settlement_runs",
    "admin_audit_events",
  ];
  for (const table of tables) {
    assert.match(sql, new RegExp(`alter table public\\.${table} enable row level security`, "i"), table);
  }
  assert.match(sql, /revoke all on all tables in schema public from anon, authenticated/i);
});

test("all privileged public and private functions pin an empty search path", async () => {
  const sql = await migrations();
  const definerBlocks = sql.split(/create or replace function/i).slice(1).filter((block) => /security definer/i.test(block));
  assert.ok(definerBlocks.length >= 10);
  for (const block of definerBlocks) assert.match(block, /set search_path = ''/i);
});

test("bet, ledger, and settlement uniqueness constraints enforce replay safety", async () => {
  const sql = await migrations();
  assert.match(sql, /unique \(user_id, idempotency_key\)/i);
  assert.match(sql, /wallet_bet_stake_once_idx/i);
  assert.match(sql, /wallet_bet_settlement_once_idx/i);
  assert.match(sql, /for update skip locked/i);
  assert.match(sql, /where user_id = v_user for update/i);
});

test("browser roles cannot invoke ingestion or result-worker RPCs", async () => {
  const sql = await migrations();
  assert.match(sql, /revoke all on function public\.ingest_fantasy_peakpool_snapshot\(jsonb\) from public, anon, authenticated/i);
  assert.match(sql, /grant execute on function public\.ingest_fantasy_peakpool_snapshot\(jsonb\) to service_role/i);
  assert.match(sql, /grant execute on function public\.place_fantasy_bet[^;]+to authenticated/is);
});

test("fantasy migrations contain no SMSPariaz account or wagering endpoint", async () => {
  const sql = await migrations();
  assert.doesNotMatch(sql, /\/placebet\/|\/checklogin\/|loginid|phone|token/i);
});

test("ATR finalized winner prices become the sole winning payout authority", async () => {
  const sql = await migrations();
  assert.match(sql, /private\.atr_final_decimal_price/i);
  assert.match(sql, /v_bet\.stake \* v_atr_decimal_price \/ v_result\.joint_winner_count/i);
  assert.match(sql, /ATR_FINAL_PRICE_UNAVAILABLE/i);
  assert.match(sql, /'atr_finalized_starting_price_raw'/i);
  assert.match(sql, /'observations'.*public\.result_observations/is);
  assert.match(sql, /finalizedStartingPriceRaw[^;]+NEEDS_REVIEW/is);
});
