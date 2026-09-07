import assert from "node:assert/strict";
import { test } from "node:test";
import type { SupabaseClient } from "@supabase/supabase-js";
import { validateFantasyStake } from "../src/features/fantasy-peakpool/domain.js";
import { placeFantasyBet, loadFantasyBootstrap } from "../src/services/fantasy-peakpool.js";

test("browser stake validation accepts exact decimal strings without inventing a return", () => {
  assert.deepEqual(validateFantasyStake("100.00", "1.00", "500.00"), { valid: true });
  assert.equal(validateFantasyStake("0.001", "1.00").valid, false);
  assert.equal(validateFantasyStake("0", "1.00").valid, false);
  assert.equal(validateFantasyStake("501", "1.00", "500.00").valid, false);
});

test("history shows PMU dividends without relabelling settled ATR evidence", async () => {
  const fake = { rpc: async () => ({ error: null, data: { bets: [
    { id: "pmu", state: "WON", stake: "10", result_metadata: { pmu_dividend_cents: 490 } },
    { id: "legacy", state: "WON", stake: "10", result_metadata: { atr_finalized_starting_price_raw: "4/1" } },
  ] } }) } as unknown as SupabaseClient;
  const result = await loadFantasyBootstrap(fake);
  assert.equal(result.bets[0].pmuFinalDividend, "4.90");
  assert.equal(result.bets[1].atrFinalPrice, "4/1");
  assert.equal(result.bets[1].pmuFinalDividend, undefined);
});

test("bet client submits an unpriced runner selection and maps PMU-final pricing status", async () => {
  let captured: unknown;
  const fake = {
    rpc: async (_name: string, params: unknown) => {
      captured = params;
      return { data: {
        bet_id: "bet", stake: "100.00", pricing_status: "PMU_FINAL_PENDING",
        new_balance: "900.00", accepted_at: "2026-09-04T10:00:00Z", idempotent_replay: false,
      }, error: null };
    },
  } as unknown as SupabaseClient;
  const receipt = await placeFantasyBet({
    runnerId: "runner", stake: "100.00", idempotencyKey: "request",
  }, fake);
  assert.deepEqual(captured, {
    p_runner_id: "runner", p_odds_snapshot_id: null, p_stake: "100.00",
    p_expected_price: null, p_idempotency_key: "request",
  });
  assert.equal(receipt.pricingStatus, "PMU_FINAL_PENDING");
  assert.equal(receipt.potentialGrossReturn, undefined);
});
