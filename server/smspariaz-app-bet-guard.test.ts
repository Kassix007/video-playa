import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { buildGuardedAppBetRequest } from "./smspariaz-app-bet.js";

describe("real-money app-bet egress guard", () => {
  const session = { login_id: "42", phone: "23050000000", token: "token" };
  it("constructs only the four audited app fields", () => {
    assert.deepEqual(buildGuardedAppBetRequest("https://www.smspariaz.com", "/placebet/", session, "BOOK123"), {
      path: "/placebet/",
      fields: { loginid: "42", phone: "23050000000", token: "token", message: "nBOOK123" },
    });
  });
  it("rejects non-app destinations and wallet/payment/SMS vocabulary", () => {
    assert.throws(() => buildGuardedAppBetRequest("https://www.smspariaz.com", "/wallet/placebet/", session, "BOOK123"), /APP_BET_FLOW_CHANGED/);
    assert.throws(() => buildGuardedAppBetRequest("https://evil.example", "/placebet/", session, "BOOK123"), /APP_BET_FLOW_CHANGED/);
    assert.throws(() => buildGuardedAppBetRequest("https://www.smspariaz.com", "/placebet/", session, "deposit"), /APP_BET_FLOW_CHANGED/);
  });
});
