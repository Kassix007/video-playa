import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  PEAKPOOL_APP_FLOW_FINGERPRINT,
  PEAKPOOL_APP_FLOW_PROFILE,
  PeakpoolAppFlowError,
  assertPeakpoolAppBetRequest,
  assertPeakpoolAppFlowEvidence,
  assertPeakpoolAppResponseIsNotRedirect,
  buildPeakpoolAppBetRequest,
  verifyPeakpoolAppFlowEvidence,
} from "./peakpool-flow-profile.js";

const session = { login_id: "42", phone: "23050000000", token: "opaque-session-token" };

function isFlowChanged(error: unknown): boolean {
  return error instanceof PeakpoolAppFlowError && error.code === "PEAKPOOL_APP_FLOW_CHANGED";
}

describe("Peakpool app-flow profile", () => {
  it("server-generates the exact isolated Win and Place messages", () => {
    const win = buildPeakpoolAppBetRequest(session, {
      unit_stake: 200,
      meeting_number: 3,
      race_number: "1",
      runner_number: 4,
      bet_type: "win",
    });
    const place = buildPeakpoolAppBetRequest(session, {
      unit_stake: 200,
      meeting_number: 3,
      race_number: "1",
      runner_number: 4,
      bet_type: "place",
    });

    assert.equal(win.product, "peakpool_virtual_balance");
    assert.equal(win.origin, "https://www.smspariaz.com");
    assert.equal(win.method, "POST");
    assert.equal(win.path, "/placebet/");
    assert.deepEqual(win.fields, {
      loginid: "42",
      phone: "23050000000",
      token: "opaque-session-token",
      message: "200R3C1H4",
    });
    assert.equal(place.fields.message, "200R3C1H4P");
    assert.equal(buildPeakpoolAppBetRequest(session, {
      unit_stake: 1, meeting_number: 21, race_number: 3, runner_number: 0, bet_type: "win",
    }).fields.message, "1R21C3H0");
    assert.equal(Object.isFrozen(win), true);
    assert.equal(Object.isFrozen(win.fields), true);
  });

  it("rejects malformed stake, identifiers, and non-Peakpool bet types", () => {
    const valid = { unit_stake: 1, meeting_number: 1, race_number: 1, runner_number: 1, bet_type: "win" as const };
    for (const input of [
      { ...valid, unit_stake: 0 },
      { ...valid, unit_stake: 1.5 },
      { ...valid, unit_stake: Number.MAX_SAFE_INTEGER + 1 },
      { ...valid, meeting_number: "01" },
      { ...valid, race_number: "1P" },
      { ...valid, runner_number: -1 },
      { ...valid, runner_number: "00" },
      { ...valid, bet_type: "sms" },
    ]) {
      assert.throws(
        () => buildPeakpoolAppBetRequest(session, input as never),
        isFlowChanged,
      );
    }
  });

  it("rejects routes, fields, and generic/raw messages before any provider egress", () => {
    const request = buildPeakpoolAppBetRequest(session, {
      unit_stake: 200, meeting_number: 3, race_number: 1, runner_number: 4, bet_type: "win",
    });
    assert.throws(
      () => assertPeakpoolAppBetRequest({ ...request, path: "/wallet/placebet/" } as never),
      isFlowChanged,
    );
    assert.throws(
      () => assertPeakpoolAppBetRequest({
        ...request,
        fields: { ...request.fields, message: "nBOOK123" },
      }),
      isFlowChanged,
    );
    assert.throws(
      () => assertPeakpoolAppBetRequest({
        product: "peakpool_virtual_balance",
        origin: "https://www.smspariaz.com",
        method: "POST",
        path: "/placebet/",
        fields: { ...request.fields, message: "200R3C1H4" },
      }),
      isFlowChanged,
    );
    assert.throws(
      () => assertPeakpoolAppBetRequest({
        ...request,
        fields: { ...request.fields, message: "deposit", wallet: "1" },
      } as never),
      isFlowChanged,
    );
    assert.throws(
      () => assertPeakpoolAppBetRequest({ ...request, origin: "https://payments.example" } as never),
      isFlowChanged,
    );
  });

  it("fails closed on redirects and source-evidence drift", () => {
    assert.throws(() => assertPeakpoolAppResponseIsNotRedirect(302, "https://payments.example"), isFlowChanged);
    assert.throws(() => assertPeakpoolAppResponseIsNotRedirect(200, "/unexpected"), isFlowChanged);

    const verified = assertPeakpoolAppFlowEvidence(PEAKPOOL_APP_FLOW_PROFILE.source_sha256);
    assert.equal(verified.valid, true);
    assert.equal(verified.fingerprint, PEAKPOOL_APP_FLOW_FINGERPRINT);

    const drifted = verifyPeakpoolAppFlowEvidence({
      ...PEAKPOOL_APP_FLOW_PROFILE.source_sha256,
      site: "0".repeat(64),
    });
    assert.equal(drifted.valid, false);
    assert.notEqual(drifted.fingerprint, PEAKPOOL_APP_FLOW_FINGERPRINT);
    assert.throws(
      () => assertPeakpoolAppFlowEvidence({ ...PEAKPOOL_APP_FLOW_PROFILE.source_sha256, root_mobile: "0".repeat(64) }),
      isFlowChanged,
    );
  });
});
