import assert from "node:assert/strict";
import { test } from "node:test";
import { createElement } from "react";
import { renderToStaticMarkup } from "react-dom/server";
import type { SupabaseClient } from "@supabase/supabase-js";
import { parseAdminSettings } from "../src/features/fantasy-peakpool/admin-settings.js";
import { updateFantasySettings } from "../src/services/fantasy-peakpool.js";

// Load the browser component at test runtime; the MCP compiler has no JSX target.
const { default: PeakpoolAdminSettings } = await import(new URL("../src/features/fantasy-peakpool/components/PeakpoolAdminSettings.tsx", import.meta.url).href);

const saved = { betting_enabled: true, default_starting_balance: "750.00", minimum_stake: "35.00",
  maximum_stake: null, close_buffer_seconds: 90, max_quote_age_seconds: 180,
  result_check_initial_delay_seconds: 480, result_check_max_age_seconds: 86400, version: 3 };
test("admin settings require a complete saved snapshot, including result timings", () => {
  assert.equal(parseAdminSettings(saved)?.minimum_stake, "35.00");
  for (const invalid of [null, {}, {...saved, betting_enabled: "true"}, {...saved, minimum_stake: "oops"},
    {...saved, result_check_initial_delay_seconds: undefined}]) assert.equal(parseAdminSettings(invalid), null);
});
test("settings screen renders saved values, not defaults, and no default adjustment target", () => {
  const html = renderToStaticMarkup(createElement(PeakpoolAdminSettings, { settings: saved,
    players: [{id:"player",display_name:"Test player",role:"player",balance:"700"}], onChanged:async()=>{} }));
  assert.match(html, /checked=""/);
  for (const value of ["750.00", "35.00", "90", "180"]) assert.ok(html.includes(`value="${value}"`));
  assert.match(html, /<option[^>]*value=""[^>]*selected=""[^>]*>Select player/);
});
test("missing settings do not render a submit button", () => {
  const html = renderToStaticMarkup(createElement(PeakpoolAdminSettings, { settings: null, players: [], onChanged:async()=>{} }));
  assert.ok(!html.includes("Save settings"));
});
test("settings RPC preserves saved non-editable result timings", async () => {
  let captured: Record<string,unknown> = {};
  const client = {rpc:async (_name:string,params:Record<string,unknown>)=>{captured=params;return {data:{},error:null};}} as unknown as SupabaseClient;
  const settings=parseAdminSettings(saved)!;
  await updateFantasySettings({bettingEnabled:settings.betting_enabled,defaultStartingBalance:settings.default_starting_balance,
    minimumStake:settings.minimum_stake,maximumStake:settings.maximum_stake??"",closeBufferSeconds:settings.close_buffer_seconds,
    maxQuoteAgeSeconds:settings.max_quote_age_seconds,initialDelaySeconds:settings.result_check_initial_delay_seconds,
    maxCheckAgeSeconds:settings.result_check_max_age_seconds,reason:"fixture",idempotencyKey:"fixture"},client);
  assert.equal(captured.p_result_check_initial_delay_seconds,480);
  assert.equal(captured.p_result_check_max_age_seconds,86400);
  assert.equal(captured.p_maximum_stake,null);
});
