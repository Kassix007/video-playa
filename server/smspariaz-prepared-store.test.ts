import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  MemorySmspariazPreparedBetStore,
  type SmspariazPreparedBet,
} from "./smspariaz-prepared-store.js";

function prepared(): SmspariazPreparedBet {
  return {
    schema_version: 1,
    handle: "A".repeat(43),
    state: "PREPARED",
    principal_hash: "a".repeat(64),
    session_generation: 3,
    game: "s",
    selections: [{
      event_id: "303589", market_id: "1", selection_code: "1", selection_id: "90001",
      odds: 1.48, bet_code: "1234", home: "Port Louis", away: "Curepipe",
    }],
    stake: 200,
    stake_tax: 0,
    total_odds: 1.48,
    estimated_payout: 296,
    bookcode: "BOOK123",
    flow_fingerprint: "f".repeat(64),
    created_at: "2026-09-01T10:00:00.000Z",
    expires_at: "2026-09-01T10:03:00.000Z",
  };
}

describe("prepared app-bet state", () => {
  it("binds a claim to principal, session generation, and TTL", async () => {
    const store = new MemorySmspariazPreparedBetStore();
    await store.create(prepared());
    await assert.rejects(() => store.claim(prepared().handle, "wrong", 3, Date.parse("2026-09-01T10:01:00Z")));
    await assert.rejects(() => store.claim(prepared().handle, prepared().principal_hash, 4, Date.parse("2026-09-01T10:01:00Z")));
    const claimed = await store.claim(prepared().handle, prepared().principal_hash, 3, Date.parse("2026-09-01T10:01:00Z"));
    assert.equal(claimed.state, "SUBMITTING");
  });

  it("allows exactly one atomic claim and leaves expired handles terminal", async () => {
    const store = new MemorySmspariazPreparedBetStore();
    await store.create(prepared());
    const results = await Promise.allSettled([
      store.claim(prepared().handle, prepared().principal_hash, 3, Date.parse("2026-09-01T10:01:00Z")),
      store.claim(prepared().handle, prepared().principal_hash, 3, Date.parse("2026-09-01T10:01:00Z")),
    ]);
    assert.equal(results.filter((result) => result.status === "fulfilled").length, 1);

    const expiredStore = new MemorySmspariazPreparedBetStore();
    await expiredStore.create(prepared());
    await assert.rejects(() => expiredStore.claim(prepared().handle, prepared().principal_hash, 3, Date.parse("2026-09-01T10:04:00Z")));
    assert.equal((await expiredStore.get(prepared().handle))?.state, "EXPIRED");
  });
});
