import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { PeakpoolAppBetService } from "./peakpool-app-bet.js";
import { parsePeakpoolConfig } from "./peakpool-config.js";
import { parsePeakpoolProgramme, type PeakpoolProgramme } from "./peakpool-programme.js";
import { parseSmspariazConfig } from "./smspariaz-config.js";
import { MemorySmspariazPreparedBetStore } from "./smspariaz-prepared-store.js";
import type { SmspariazAuthenticatedSession } from "./smspariaz-session-store.js";
import { SAMPLE_PEAKPOOL_FIXTURE } from "./test-fixtures/peakpool/flow-fixtures.js";

const key = Buffer.alloc(32, 19).toString("base64");
const smspariaz = parseSmspariazConfig({ SMSPARIAZ_SESSION_ENCRYPTION_KEY: key });
const enabledConfig = parsePeakpoolConfig({
  PEAKPOOL_ENABLED: "true",
  PEAKPOOL_APP_BET_ENABLED: "true",
  PEAKPOOL_APP_BET_VERIFIED: "true",
}, smspariaz);
const disabledConfig = parsePeakpoolConfig({ PEAKPOOL_ENABLED: "true" }, smspariaz);
const session = {
  schema_version: 1,
  generation: 4,
  state: "AUTHENTICATED",
  provider_origin: smspariaz.baseUrl,
  updated_at: "2026-09-01T10:00:00.000Z",
  login_id: "42",
  phone: "23050000000",
  token: "test-token",
  cookies: [],
  app_registered: true,
  confirmed_at: "2026-09-01T10:00:00.000Z",
  last_validated_at: "2026-09-01T10:00:00.000Z",
} satisfies SmspariazAuthenticatedSession;

function programme(): PeakpoolProgramme {
  return parsePeakpoolProgramme(SAMPLE_PEAKPOOL_FIXTURE, "2026-09-01T10:00:00.000Z");
}

function flow(valid = true, fingerprint = "f".repeat(64)) {
  return {
    valid,
    fingerprint,
    observed: { site: "a".repeat(64), root_mobile: "b".repeat(64) },
  };
}

function input() {
  return {
    unit_stake: 200,
    selection: { meeting_number: "3", race_number: "1", runner_number: "1", bet_type: "place" as const },
  };
}

describe("Peakpool virtual-unit app tickets", () => {
  it("prepares exactly one current Win/Place selection without a placement-capable request", async () => {
    let posts = 0;
    const service = new PeakpoolAppBetService(enabledConfig, {
      verifyPeakpoolAppFlow: async () => flow(),
      checkLogin: async () => true,
      postPeakpoolAppBet: async () => { posts += 1; return { text: "{}" }; },
    }, { getProgramme: async () => programme() }, new MemorySmspariazPreparedBetStore(), undefined, () => Date.parse("2026-09-01T10:00:00Z"));

    const prepared = await service.prepare(session, "principal", input());

    assert.equal(prepared.submitted, false);
    assert.equal(prepared.unit_stake, 200);
    assert.deepEqual(prepared.selection, {
      meeting_number: "3", race_number: "1", runner_number: "1", selection_code: "R3C1H1",
      bet_type: "place", runner_name: "NOUMEA D'ECAJEUL", displayed_pool_value: "940",
    });
    assert.equal(posts, 0);
  });

  it("rejects malformed stakes and unavailable selections before placement", async () => {
    let posts = 0;
    const service = new PeakpoolAppBetService(enabledConfig, {
      verifyPeakpoolAppFlow: async () => flow(), checkLogin: async () => true,
      postPeakpoolAppBet: async () => { posts += 1; return { text: "{}" }; },
    }, { getProgramme: async () => programme() }, new MemorySmspariazPreparedBetStore());

    await assert.rejects(() => service.prepare(session, "principal", { ...input(), unit_stake: 1.5 }), /INVALID_STAKE/);
    await assert.rejects(() => service.prepare(session, "principal", {
      ...input(), selection: { ...input().selection, runner_number: "999" },
    }), /PEAKPOOL_SELECTION_INVALID/);
    assert.equal(posts, 0);
  });

  it("keeps explicit placement disabled unless both runtime flags acknowledge verified virtual-unit flow", async () => {
    let posts = 0;
    const service = new PeakpoolAppBetService(disabledConfig, {
      verifyPeakpoolAppFlow: async () => flow(), checkLogin: async () => true,
      postPeakpoolAppBet: async () => { posts += 1; return { text: "{}" }; },
    }, { getProgramme: async () => programme() }, new MemorySmspariazPreparedBetStore());
    const prepared = await service.prepare(session, "principal", input());

    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /PEAKPOOL_APP_BET_DISABLED/);
    assert.equal(posts, 0);
  });

  it("revalidates the session and fixture before a single explicit app attempt", async () => {
    let posts = 0;
    const changingFixture = structuredClone(SAMPLE_PEAKPOOL_FIXTURE);
    changingFixture[0]!.horses[0]!.type = "941";
    let reads = 0;
    const service = new PeakpoolAppBetService(enabledConfig, {
      verifyPeakpoolAppFlow: async () => flow(), checkLogin: async () => true,
      postPeakpoolAppBet: async () => { posts += 1; return { text: JSON.stringify({ status: 0, reply: { message: "Accepted" } }) }; },
    }, {
      getProgramme: async () => parsePeakpoolProgramme(reads++ === 0 ? SAMPLE_PEAKPOOL_FIXTURE : changingFixture, "2026-09-01T10:00:00.000Z"),
    }, new MemorySmspariazPreparedBetStore());
    const prepared = await service.prepare(session, "principal", input());

    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /PEAKPOOL_FIXTURE_CHANGED/);
    assert.equal(posts, 0);

    const expired = new PeakpoolAppBetService(enabledConfig, {
      verifyPeakpoolAppFlow: async () => flow(), checkLogin: async () => false,
      postPeakpoolAppBet: async () => { posts += 1; return { text: "{}" }; },
    }, { getProgramme: async () => programme() }, new MemorySmspariazPreparedBetStore());
    const pending = await expired.prepare(session, "principal", input());
    await assert.rejects(() => expired.place(session, "principal", pending.prepared_bet, true), /SESSION_EXPIRED/);
    assert.equal(posts, 0);
  });

  it("submits only an approved prepared ticket once and makes unparseable outcomes non-retryable", async () => {
    const posts: string[] = [];
    const store = new MemorySmspariazPreparedBetStore();
    const service = new PeakpoolAppBetService(enabledConfig, {
      verifyPeakpoolAppFlow: async () => flow(),
      checkLogin: async () => true,
      postPeakpoolAppBet: async (request) => {
        posts.push(request.fields.message);
        return { text: JSON.stringify({ status: 0, reply: { message: "Peakpool ticket accepted", out: "Leaderboard updated" } }) };
      },
    }, { getProgramme: async () => programme() }, store, undefined, () => Date.parse("2026-09-01T10:00:00Z"));
    const prepared = await service.prepare(session, "principal", input());
    const result = await service.place(session, "principal", prepared.prepared_bet, true);

    assert.deepEqual(result, {
      success: true,
      reference: null,
      confirmation: "Peakpool ticket accepted Leaderboard updated",
      unit_stake: 200,
      submitted_via: "smspariaz_peakpool_app_flow",
    });
    assert.deepEqual(posts, ["200R3C1H1P"]);
    await assert.rejects(() => service.place(session, "principal", prepared.prepared_bet, true), /PREPARED_BET_ALREADY_USED/);
    assert.equal(posts.length, 1);
  });
});
