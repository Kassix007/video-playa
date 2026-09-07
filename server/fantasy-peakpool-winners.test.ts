import assert from "node:assert/strict";
import { test } from "node:test";
import { createElement } from "react";
import { renderToStaticMarkup } from "react-dom/server";
import type { SupabaseClient } from "@supabase/supabase-js";
import { loadFantasyBootstrap } from "../src/services/fantasy-peakpool.js";
const { default: Winners } = await import(new URL("../src/features/fantasy-peakpool/components/PeakpoolWinners.tsx", import.meta.url).href);
const raw = [{runner_id:"a",runner_number:1,runner_name:"Alpha",pmu_dividend_cents:290},
  {runner_id:"b",runner_number:2,runner_name:"Beta",pmu_dividend_cents:410}];
async function race(state:string,winners:unknown=raw) {
  const client={rpc:async()=>({data:{races:[{id:"race",state,winners,meeting_number:1,racecourse:"Test",runners:[]}]},error:null})} as unknown as SupabaseClient;
  return (await loadFantasyBootstrap(client)).meetings[0].races[0];
}
test("settled public race maps all joint winners and exact PMU dividends",async()=>{
  const result=await race("SETTLED");
  assert.equal(result.winners?.length,2);
  assert.equal(result.winners?.[0].pmuFinalDividend,"2.90");
  const html=renderToStaticMarkup(createElement(Winners,{race:result}));
  assert.match(html,/Dead heat/); assert.match(html,/Alpha/); assert.match(html,/Beta/); assert.match(html,/2.90/);
});
test("pending, review and void races never display winner evidence",async()=>{
  for(const state of ["OPEN","RESULT_PENDING","NEEDS_REVIEW","VOID"]){
    const result=await race(state);
    assert.equal(result.winners?.length??0,0);
    assert.equal(renderToStaticMarkup(createElement(Winners,{race:result})),"");
  }
});
test("missing evidence and malformed dividends are never invented",async()=>{
  const missing=await race("SETTLED",[]);
  assert.match(renderToStaticMarkup(createElement(Winners,{race:missing})),/Winner details unavailable/);
  const result=await race("SETTLED",[{...raw[0],pmu_dividend_cents:"oops"}]);
  assert.equal(result.winners?.[0].pmuFinalDividend,undefined);
});
