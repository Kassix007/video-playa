import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { PeakpoolAppBetService } from "./peakpool-app-bet.js";
import { parsePeakpoolConfig } from "./peakpool-config.js";
import { parsePeakpoolProgramme } from "./peakpool-programme.js";
import { parseSmspariazConfig } from "./smspariaz-config.js";
import { MemorySmspariazPreparedBetStore } from "./smspariaz-prepared-store.js";
import type { SmspariazAuthenticatedSession } from "./smspariaz-session-store.js";
import { SAMPLE_PEAKPOOL_FIXTURE } from "./test-fixtures/peakpool/flow-fixtures.js";

const smspariaz = parseSmspariazConfig({ SMSPARIAZ_SESSION_ENCRYPTION_KEY: Buffer.alloc(32, 23).toString("base64") });
const config = parsePeakpoolConfig({
  PEAKPOOL_ENABLED: "true",
  PEAKPOOL_APP_BET_ENABLED: "true",
  PEAKPOOL_APP_BET_VERIFIED: "true",
}, smspariaz);
const session = {
  schema_version: 1, generation: 2, state: "AUTHENTICATED", provider_origin: smspariaz.baseUrl,
  updated_at: "2026-09-01T10:00:00.000Z", login_id: "42", phone: "23050000000", token: "test-token", cookies: [],
  app_registered: true, confirmed_at: "2026-09-01T10:00:00.000Z", last_validated_at: "2026-09-01T10:00:00.000Z",
} satisfies SmspariazAuthenticatedSession;
const input = { unit_stake: 20, selection: { meeting_number: "3", race_number: "1", runner_number: "1", bet_type: "win" as const } };
const programme = () => parsePeakpoolProgramme(SAMPLE_PEAKPOOL_FIXTURE, "2026-09-01T10:00:00.000Z");
const verification = (fingerprint = "f".repeat(64)) => ({ valid: true, fingerprint, observed: { site: "a".repeat(64), root_mobile: "b".repeat(64) } });

describe("Peakpool guarded app submission", () => {
  it("rejects source drift and non-registered app state before provider egress", async () => {
    let posts = 0;
    let flowCalls = 0;
    const service = new PeakpoolAppBetService(config, {
      verifyPeakpoolAppFlow: async () => verification(flowCalls++ === 0 ? "f".repeat(64) : "e".repeat(64)),
      checkLogin: async () => true,
      postPeakpoolAppBet: async () => { posts += 1; return { text: "{}" }; },
    }, { getProgramme: async () => programme() }, new MemorySmspariazPreparedBetStore());
    const prepared = await service.prepare(session, "principal", input);
    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /PEAKPOOL_APP_FLOW_CHANGED/);
    assert.equal(posts, 0);

    const appUnregistered = new PeakpoolAppBetService(config, {
      verifyPeakpoolAppFlow: async () => verification(), checkLogin: async () => true,
      postPeakpoolAppBet: async () => { posts += 1; return { text: "{}" }; },
    }, { getProgramme: async () => programme() }, new MemorySmspariazPreparedBetStore());
    const pending = await appUnregistered.prepare(session, "principal", input);
    await assert.rejects(() => appUnregistered.place({ ...session, app_registered: false }, "principal", pending.prepared_bet, true), /APP_REGISTRATION_REQUIRED/);
    assert.equal(posts, 0);
  });

  it("classifies an explicit provider rejection as terminal and does not retry", async () => {
    let posts = 0;
    const service = new PeakpoolAppBetService(config, {
      verifyPeakpoolAppFlow: async () => verification(), checkLogin: async () => true,
      postPeakpoolAppBet: async () => { posts += 1; return { text: JSON.stringify({ status: 1, reply: { message: "Insufficient virtual units" } }) }; },
    }, { getProgramme: async () => programme() }, new MemorySmspariazPreparedBetStore());
    const prepared = await service.prepare(session, "principal", input);

    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /PROVIDER_REJECTED/);
    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /PREPARED_BET_ALREADY_USED/);
    assert.equal(posts, 1);
  });

  it("makes transport and unrecognized-success outcomes ambiguous and non-retryable", async () => {
    let calls = 0;
    const service = new PeakpoolAppBetService(config, {
      verifyPeakpoolAppFlow: async () => verification(), checkLogin: async () => true,
      postPeakpoolAppBet: async () => { calls += 1; throw new Error("network reset"); },
    }, { getProgramme: async () => programme() }, new MemorySmspariazPreparedBetStore());
    const prepared = await service.prepare(session, "principal", input);
    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /SUBMISSION_AMBIGUOUS/);
    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /PREPARED_BET_ALREADY_USED/);
    assert.equal(calls, 1);

    const unrecognized = new PeakpoolAppBetService(config, {
      verifyPeakpoolAppFlow: async () => verification(), checkLogin: async () => true,
      postPeakpoolAppBet: async () => ({ text: JSON.stringify({ status: 0, reply: {} }) }),
    }, { getProgramme: async () => programme() }, new MemorySmspariazPreparedBetStore());
    const empty = await unrecognized.prepare(session, "principal", input);
    await assert.rejects(() => unrecognized.place(session, "principal", empty.prepared_bet, true), /SUBMISSION_AMBIGUOUS/);
  });

  it("atomically sends at most one approved request when placements race", async () => {
    let posts = 0;
    const store = new MemorySmspariazPreparedBetStore();
    const service = new PeakpoolAppBetService(config, {
      verifyPeakpoolAppFlow: async () => verification(), checkLogin: async () => true,
      postPeakpoolAppBet: async () => { posts += 1; return { text: JSON.stringify({ status: 0, reply: { message: "Accepted" } }) }; },
    }, { getProgramme: async () => programme() }, store);
    const prepared = await service.prepare(session, "principal", input);
    const results = await Promise.allSettled([
      service.place(session, "principal", prepared.prepared_bet, true),
      service.place(session, "principal", prepared.prepared_bet, true),
    ]);
    assert.equal(results.filter((result) => result.status === "fulfilled").length, 1);
    assert.equal(posts, 1);
  });
});
