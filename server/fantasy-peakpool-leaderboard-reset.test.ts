import assert from "node:assert/strict";
import { readFile } from "node:fs/promises";
import { test } from "node:test";

const migrationPath = "supabase/migrations/202609070001_fantasy_leaderboard_reset.sql";

test("leaderboard reset migration is audited, round-aware, immutable, and protected", async () => {
  const sql = await readFile(migrationPath, "utf8");
  assert.match(sql, /add column leaderboard_round bigint not null default 1/i);
  assert.match(sql, /add column leaderboard_reset_at timestamptz/i);
  assert.match(sql, /private\.require_fantasy_admin\(\)/i);
  assert.match(sql, /LEADERBOARD_RESET_PENDING_BETS/i);
  assert.match(sql, /coalesce\(p_confirmation, ''\)\s*<>\s*'RESET LEADERBOARD'/i);
  assert.match(sql, /for update/i);
  assert.match(sql, /'leaderboard_reset', true/i);
  assert.match(sql, /'LEADERBOARD_RESET'/i);
  assert.match(sql, /created_at >= settings\.leaderboard_reset_at/i);
  assert.match(sql, /not \(metadata @> '\{"leaderboard_reset": true\}'::jsonb\)/i);
  assert.match(sql, /revoke all on function public\.admin_reset_fantasy_leaderboard\(text, text, uuid\) from public, anon/i);
  assert.match(sql, /grant execute on function public\.admin_reset_fantasy_leaderboard\(text, text, uuid\) to authenticated/i);
});
