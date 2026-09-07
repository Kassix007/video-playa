import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { SmspariazAppBetService } from "./smspariaz-app-bet.js";
import { parseSmspariazConfig } from "./smspariaz-config.js";
import { parseSmsfootballProgramme } from "./smspariaz-football.js";
import { createSmspariazObservability } from "./smspariaz-observability.js";
import { MemorySmspariazPreparedBetStore } from "./smspariaz-prepared-store.js";
import type { SmspariazAuthenticatedSession } from "./smspariaz-session-store.js";
import { SAMPLE_ODDS_FRAGMENT, SAMPLE_ODDS_METADATA } from "./test-fixtures/smspariaz/flow-fixtures.js";

const config = parseSmspariazConfig({
  SMSPARIAZ_SESSION_ENCRYPTION_KEY: Buffer.alloc(32, 8).toString("base64"),
  SMSPARIAZ_APP_BET_ENABLED: "true",
});
const programme = parseSmsfootballProgramme(SAMPLE_ODDS_METADATA, [SAMPLE_ODDS_FRAGMENT]);
const session: SmspariazAuthenticatedSession = {
  schema_version: 1, generation: 1, state: "AUTHENTICATED", provider_origin: config.baseUrl,
  updated_at: "2026-09-01T10:00:00.000Z", login_id: "42", phone: "23050000000", token: "token",
  cookies: [], app_registered: true, confirmed_at: "2026-09-01T10:00:00.000Z", last_validated_at: "2026-09-01T10:00:00.000Z",
};

function dependencies() {
  const posts: Array<{ path: string; fields: Readonly<Record<string, string>> }> = [];
  const provider = {
    verifyAppFlow: async () => ({ valid: true, fingerprint: "f".repeat(64), observed: { site: "a", footballMobile: "b", rootMobile: "c" } }),
    checkLogin: async () => true,
    postProviderForm: async (path: string, fields: Readonly<Record<string, string>>) => {
      posts.push({ path, fields });
      return path.includes("validatebet")
        ? { text: '<input type="hidden" id="bookcode" value="BOOK123">', cookies: [] }
        : { text: JSON.stringify({ status: 0, reply: { message: "Accepted", webmessage: "Ref APP-7", reference: "APP-7" } }), cookies: [] };
    },
  };
  const football = { getProgramme: async () => programme };
  return { provider, football, posts };
}

describe("app bet preparation", () => {
  it("resolves a valid single and obtains a booking code without app submission", async () => {
    const deps = dependencies();
    const service = new SmspariazAppBetService(config, deps.provider, deps.football, new MemorySmspariazPreparedBetStore(), createSmspariazObservability(() => undefined), () => Date.parse("2026-09-01T10:01:00Z"));
    const result = await service.prepare(session, "principal", {
      stake: 200,
      selections: [{ event_id: "303589", market: "FTH", selection: "HOME", expected_odds: 1.48 }],
    });
    assert.equal(result.submitted, false);
    assert.equal(result.total_odds, 1.48);
    assert.equal(result.estimated_payout, 259.65);
    assert.equal(result.changed_odds.length, 0);
    assert.equal(deps.posts.length, 1);
    assert.equal(deps.posts[0]?.path, "/smsfootball/service/validatebet.php");
    assert.deepEqual(deps.posts[0]?.fields, {
      "bet-game": "s", "bet-stake": "200", "bet-staketax": "24.56",
      "bet-selection": "90001", "bet-payout": "259.65",
    });
  });

  it("reports changed odds and rejects closed or malformed selections before validation", async () => {
    const deps = dependencies();
    const service = new SmspariazAppBetService(config, deps.provider, deps.football, new MemorySmspariazPreparedBetStore(), undefined, () => Date.parse("2026-09-01T10:01:00Z"));
    const changed = await service.prepare(session, "principal", {
      stake: 200,
      selections: [{ event_id: "303589", market: "1", selection: "1", expected_odds: 1.5 }],
    });
    assert.deepEqual(changed.changed_odds, [{ event_id: "303589", selection_id: "90001", expected: 1.5, current: 1.48 }]);
    await assert.rejects(() => service.prepare(session, "principal", {
      stake: 200, selections: [{ event_id: "missing", market: "1", selection: "1" }],
    }), /INVALID_SELECTION/);
    assert.equal(deps.posts.length, 1);
  });

  it("rejects a suspended provider selection before coupon validation", async () => {
    const deps = dependencies();
    const closed = structuredClone(programme);
    closed.events[0]!.markets[0]!.selections[0] = {
      ...closed.events[0]!.markets[0]!.selections[0]!, open: false, status: "UNAVAILABLE", odds: null,
    };
    const service = new SmspariazAppBetService(config, deps.provider, { getProgramme: async () => closed }, new MemorySmspariazPreparedBetStore(), undefined, () => Date.parse("2026-09-01T10:01:00Z"));
    await assert.rejects(() => service.prepare(session, "principal", {
      stake: 200, selections: [{ event_id: "303589", market: "1", selection: "1" }],
    }), /EVENT_CLOSED/);
    assert.equal(deps.posts.length, 0);
  });
});
