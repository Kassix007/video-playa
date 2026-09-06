import assert from "node:assert/strict";
import { test } from "node:test";
import { startFantasyLiveRefresh } from "../src/features/fantasy-peakpool/live-refresh.js";

test("live refresh pauses hidden pages, coalesces requests, resumes and cleans up", async () => {
  let visible = true, calls = 0;
  let tick = () => {}, changed = () => {};
  let resolve = () => {};
  let subscribed = true;
  const stop = startFantasyLiveRefresh({
    visible: () => visible, refresh: async () => { calls++; await new Promise<void>(r => { resolve = r; }); },
    schedule: (callback, ms) => { assert.equal(ms, 30_000); tick = callback; return 1; },
    cancel: () => {}, subscribe: callback => { changed = callback; return () => { subscribed = false; }; },
  });
  tick(); changed(); assert.equal(calls, 1);
  resolve(); await new Promise(r => setImmediate(r));
  visible = false; changed(); tick(); assert.equal(calls, 1);
  visible = true; changed(); assert.equal(calls, 2);
  stop(); resolve(); await new Promise(r => setImmediate(r));
  tick(); changed(); assert.equal(calls, 2); assert.equal(subscribed, false);
});
