import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { parseSmspariazConfig } from "./smspariaz-config.js";
import { createSmspariazObservability } from "./smspariaz-observability.js";
import { SmspariazProviderClient, SmspariazProviderError } from "./smspariaz-provider.js";

const config = parseSmspariazConfig({
  SMSPARIAZ_SESSION_ENCRYPTION_KEY: Buffer.alloc(32, 4).toString("base64"),
});

describe("SMSPariaz authentication transport", () => {
  it("uses the exact OTP and confirmation form flow while retaining first-party cookies", async () => {
    const calls: Array<{ url: string; init?: RequestInit }> = [];
    const responses = [
      new Response("login", { headers: { "set-cookie": "PHPSESSID=abc; Path=/; Secure; HttpOnly" } }),
      Response.json({ status: 0, reply: "OTP sent" }),
      Response.json({ status: 0, reply: { id: "42", phone: "23050000000", token: "secret-token" } }),
    ];
    const client = new SmspariazProviderClient(config, async (input, init) => {
      calls.push({ url: String(input), init });
      return responses.shift()!;
    }, createSmspariazObservability(() => undefined));

    const pending = await client.startLogin("23050000000", "23051111111");
    const session = await client.confirmOtp(pending, "123456");
    assert.equal(session.login_id, "42");
    assert.equal(session.cookies[0]?.name, "PHPSESSID");
    assert.equal(calls[1]?.url, "https://www.smspariaz.com/otp/");
    assert.equal(String(calls[1]?.init?.body), "number=23050000000");
    assert.equal(String(calls[2]?.init?.body), "number=23050000000&otp=123456&referer=23051111111");
    assert.equal(calls.every((call) => call.init?.redirect === "manual"), true);
    assert.match(String(new Headers(calls[2]?.init?.headers).get("cookie")), /PHPSESSID=abc/);
  });

  it("classifies missing OTP and expired sessions without bypass or retry", async () => {
    const client = new SmspariazProviderClient(config, async () => Response.json({ status: 1, reply: "Expired" }));
    await assert.rejects(
      () => client.confirmOtp({ phone: "23050000000", referrer: "", cookies: [], requested_at: "x", expires_at: "x" }, ""),
      (error: unknown) => error instanceof SmspariazProviderError && error.code === "OTP_REQUIRED",
    );
    const valid = await client.checkLogin({ login_id: "1", phone: "2", token: "3", cookies: [] });
    assert.equal(valid, false);
  });

  it("rejects redirects before following them", async () => {
    const client = new SmspariazProviderClient(config, async () => new Response(null, {
      status: 302,
      headers: { location: "https://payments.example/" },
    }));
    await assert.rejects(
      () => client.startLogin("23050000000", ""),
      (error: unknown) => error instanceof SmspariazProviderError && error.code === "APP_BET_FLOW_CHANGED",
    );
  });

  it("rejects every unregistered or payment-like POST before fetch", async () => {
    let calls = 0;
    const client = new SmspariazProviderClient(config, async () => { calls += 1; return Response.json({ status: 0 }); });
    await assert.rejects(() => client.postProviderForm("/wallet/placebet/", { wallet: "1" }), /allowlisted/);
    await assert.rejects(() => client.postProviderForm("/placebet/", { loginid: "1", phone: "2", token: "3", message: "deposit" }), /audited shape/);
    assert.equal(calls, 0);
  });
});
