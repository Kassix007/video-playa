import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { SmspariazAppBetService } from "./smspariaz-app-bet.js";
import { parseSmspariazConfig } from "./smspariaz-config.js";
import { parseSmsfootballProgramme } from "./smspariaz-football.js";
import { MemorySmspariazPreparedBetStore } from "./smspariaz-prepared-store.js";
import type { SmspariazAuthenticatedSession } from "./smspariaz-session-store.js";
import { SAMPLE_ODDS_FRAGMENT, SAMPLE_ODDS_METADATA } from "./test-fixtures/smspariaz/flow-fixtures.js";

const config = parseSmspariazConfig({ SMSPARIAZ_SESSION_ENCRYPTION_KEY: Buffer.alloc(32, 9).toString("base64"), SMSPARIAZ_APP_BET_ENABLED: "true" });
const programme = parseSmsfootballProgramme(SAMPLE_ODDS_METADATA, [SAMPLE_ODDS_FRAGMENT]);
const session = {
  schema_version: 1, generation: 1, state: "AUTHENTICATED", provider_origin: config.baseUrl,
  updated_at: "2026-09-01T10:00:00.000Z", login_id: "42", phone: "23050000000", token: "token", cookies: [],
  app_registered: true, confirmed_at: "2026-09-01T10:00:00.000Z", last_validated_at: "2026-09-01T10:00:00.000Z",
} satisfies SmspariazAuthenticatedSession;

describe("guarded app-bet submission", () => {
  it("does not submit while the app-bet feature flag is disabled", async () => {
    let appPosts = 0;
    const disabledConfig = parseSmspariazConfig({ SMSPARIAZ_SESSION_ENCRYPTION_KEY: Buffer.alloc(32, 10).toString("base64") });
    const provider = {
      verifyAppFlow: async () => ({ valid: true, fingerprint: "f".repeat(64), observed: { site: "a", footballMobile: "b", rootMobile: "c" } }),
      checkLogin: async () => true,
      postProviderForm: async (path: string) => {
        if (path.includes("validatebet")) return { text: '<input id="bookcode" value="BOOK123">', cookies: [] };
        appPosts += 1;
        return { text: "{}", cookies: [] };
      },
    };
    const service = new SmspariazAppBetService(disabledConfig, provider, { getProgramme: async () => programme }, new MemorySmspariazPreparedBetStore(), undefined, () => Date.parse("2026-09-01T10:01:00Z"));
    const disabledSession = { ...session, provider_origin: disabledConfig.baseUrl };
    const prepared = await service.prepare(disabledSession, "principal", { stake: 200, selections: [{ event_id: "303589", market: "1", selection: "1" }] });
    await assert.rejects(() => service.place(disabledSession, "principal", prepared.prepared_bet, true), /APP_BET_DISABLED/);
    assert.equal(appPosts, 0);
  });

  it("submits one prepared ticket through the mocked app path and rejects replay", async () => {
    const appPosts: unknown[] = [];
    const provider = {
      verifyAppFlow: async () => ({ valid: true, fingerprint: "f".repeat(64), observed: { site: "a", footballMobile: "b", rootMobile: "c" } }),
      checkLogin: async () => true,
      postProviderForm: async (path: string, fields: Readonly<Record<string, string>>) => {
        if (path.includes("validatebet")) return { text: '<input id="bookcode" value="BOOK123">', cookies: [] };
        appPosts.push({ path, fields });
        return { text: JSON.stringify({ status: 0, reply: { message: "Accepted", webmessage: "Reference APP-7", reference: "APP-7" } }), cookies: [] };
      },
    };
    const store = new MemorySmspariazPreparedBetStore();
    const service = new SmspariazAppBetService(config, provider, { getProgramme: async () => programme }, store, undefined, () => Date.parse("2026-09-01T10:01:00Z"));
    const prepared = await service.prepare(session, "principal", { stake: 200, selections: [{ event_id: "303589", market: "1", selection: "1" }] });
    const result = await service.place(session, "principal", prepared.prepared_bet, true);
    assert.deepEqual(result, { success: true, reference: "APP-7", confirmation: "Accepted Reference APP-7", stake: 200, payout: 259.65, submitted_via: "smspariaz_app_flow" });
    assert.equal(appPosts.length, 1);
    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /PREPARED_BET_ALREADY_USED/);
    assert.equal(appPosts.length, 1);
  });

  it("fails closed on flow drift before app egress", async () => {
    let verifyCount = 0;
    let appPosts = 0;
    const provider = {
      verifyAppFlow: async () => ({ valid: ++verifyCount === 1, fingerprint: verifyCount === 1 ? "f".repeat(64) : "e".repeat(64), observed: { site: "a", footballMobile: "b", rootMobile: "c" } }),
      checkLogin: async () => true,
      postProviderForm: async (path: string) => {
        if (path.includes("validatebet")) return { text: '<input id="bookcode" value="BOOK123">', cookies: [] };
        appPosts += 1;
        return { text: "{}", cookies: [] };
      },
    };
    const service = new SmspariazAppBetService(config, provider, { getProgramme: async () => programme }, new MemorySmspariazPreparedBetStore(), undefined, () => Date.parse("2026-09-01T10:01:00Z"));
    const prepared = await service.prepare(session, "principal", { stake: 200, selections: [{ event_id: "303589", market: "1", selection: "1" }] });
    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /APP_BET_FLOW_CHANGED/);
    assert.equal(appPosts, 0);
  });

  it("classifies a mocked SMSPariaz rejection as terminal and does not retry", async () => {
    let appPosts = 0;
    const provider = {
      verifyAppFlow: async () => ({ valid: true, fingerprint: "f".repeat(64), observed: { site: "a", footballMobile: "b", rootMobile: "c" } }),
      checkLogin: async () => true,
      postProviderForm: async (path: string) => {
        if (path.includes("validatebet")) return { text: '<input id="bookcode" value="BOOK123">', cookies: [] };
        appPosts += 1;
        return { text: JSON.stringify({ status: 1, reply: { message: "Rejected" } }), cookies: [] };
      },
    };
    const service = new SmspariazAppBetService(config, provider, { getProgramme: async () => programme }, new MemorySmspariazPreparedBetStore(), undefined, () => Date.parse("2026-09-01T10:01:00Z"));
    const prepared = await service.prepare(session, "principal", { stake: 200, selections: [{ event_id: "303589", market: "1", selection: "1" }] });
    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /PROVIDER_REJECTED/);
    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /PREPARED_BET_ALREADY_USED/);
    assert.equal(appPosts, 1);
  });
});
