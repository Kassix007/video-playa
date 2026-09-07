# SMSPariaz app-bet MCP

This capability runs inside the hosted HORSEE `/mcp` Netlify Function. It has no dependency on a developer Windows laptop after setup. It is deliberately limited to the verified SMSFootball free app/leaderboard action; it does not implement wallet debit, paid-SMS betting, deposits, withdrawals, balance operations, payment instruments, or any fallback wager route.

## Architecture

The implementation uses Direct Authenticated HTTP, not Playwright. The current official Android wrapper only supplies the `SMSPARIAZAPP001` user agent, WebView DOM storage, and `logalert()` injection. The audited client flow uses normal same-origin form posts and no observed device ID, native bridge, client signature, or request hash.

The service retains first-party cookies plus `loginid`, `phone`, and `token` only in encrypted server-side records. It uses AES-256-GCM envelopes, random 12-byte IVs, authenticated storage context, a current 32-byte key, optional previous key for rotation, a production-stable Netlify Blob namespace, and isolated preview/branch namespaces. Local development uses an encrypted atomic `.netlify/` file. OTPs are passed to the provider once and are never stored or logged.

## Audited production flow

Evidence was collected on 2026-09-01 with public GET requests only; no OTP, validation, check-login, or placement POST was sent during discovery.

```text
GET  /login/                         -> first-party PHP session cookie
POST /otp/                           number
POST /confirm/                       number, otp, referer
                                     -> status=0, reply.id, reply.phone, reply.token
POST /checklogin/                    loginid, phone, token

GET  /smsfootball/service/odds_json.php?
GET  /football/cache/odds_1..odds_<nf>
POST /smsfootball/service/validatebet.php
                                     -> validated #bookcode in HTML
POST /placebet/                      loginid, phone, token, message=n<bookcode>
                                     -> JSON status=0, reply.message, reply.webmessage
```

The audited source hashes are:

- `/smsfootball/js/site.js`: `b01a832f9556bccce67120174c0e262fbb08bb07c5ab43cf13574c879462054f`
- `/smsfootball/js/mobile.js`: `f441172f80d10aa90c612fdab526c1fd8491a5f752f7c035f123539797f5968a`
- `/js/mobile.js`: `a558938c793dc970fa1eec1e684c7b1d3aab67a4eaf71881c9e2c654d04b6e06`

Before preparation and placement, HORSEE re-fetches and hashes all three files. Any hash change disables placement with `APP_BET_FLOW_CHANGED` until a developer re-audits the flow. The paid-SMS URI (`sms:8685?body=n<bookcode>`) and arbitrary-message `sendSMSOther()` are explicitly excluded.

## MCP tools and scopes

| Tool | Scope | Effect |
|---|---|---|
| `smspariaz_get_smsfootball` | noauth | Authoritative programme read only. |
| `smspariaz_session_status` | `horsee:smspariaz:session` | Safe current session state. |
| `smspariaz_start_login` | session | Starts legitimate OTP delivery. |
| `smspariaz_confirm_otp` | session | Confirms supplied OTP once; never saves it. |
| `smspariaz_logout` | session | Replaces saved state with a secret-free tombstone. |
| `smspariaz_prepare_app_bet` | session | Validates an app ticket and creates a short-lived handle; never submits. |
| `smspariaz_place_app_bet` | `horsee:smspariaz:app-bet` | Requires `approved:true`; submits exactly once through the audited app route. |
| `smspariaz_debug_status` | session | Safe configuration, script, flow, and last-error diagnostics. |

Council write authority does not grant either SMSPariaz scope. Unknown tool names fail closed rather than acquiring a default public policy.

## Real-money guard

The only public provider POST helper accepts two reviewed shapes: coupon validation and the four-field `/placebet/` app request. It rejects every other path before `fetch`, manually rejects all redirects, and permits app placement only at `https://www.smspariaz.com/placebet/` with exactly `loginid`, `phone`, `token`, and `message=n<bookcode>`. The server constructs these fields; callers cannot provide paths, headers, cookies, tokens, message text, or parameters.

The guard also rejects wallet, cash, payment, paid-SMS, deposit, withdrawal, balance, debit, credit, card, and bank vocabulary at the app boundary. A prepared ticket binds a random opaque handle to the OAuth principal, session generation, selections, observed odds, booking code, and source-flow fingerprint. An atomic state transition allows one `PREPARED -> SUBMITTING` attempt. Success, rejection, ambiguity, and expiry are terminal; there is no submission retry or fallback.

`approved:true` records an explicit caller decision, but it is not cryptographic proof that a human clicked an approval UI. HORSEE analysis and preparation never call the placement tool. A first-party approval UI would be a separate feature if cryptographic human attestation is required.

## Deployment configuration

Set these Netlify environment variables in the deploy context that hosts the MCP:

```text
SMSPARIAZ_BASE_URL=https://www.smspariaz.com
SMSPARIAZ_SESSION_ENCRYPTION_KEY=<canonical Base64 encoding of 32 random bytes>
SMSPARIAZ_SESSION_PREVIOUS_ENCRYPTION_KEY=<optional old key during one rotation>
SMSPARIAZ_APP_BET_ENABLED=false
HORSEE_OAUTH_SMSPARIAZ_SESSION_SCOPE=horsee:smspariaz:session
HORSEE_OAUTH_SMSPARIAZ_APP_BET_SCOPE=horsee:smspariaz:app-bet
```

Existing OAuth resource, issuer, and JWKS configuration is still required. The authorization server must issue the two new scopes to intended operators. With no valid encryption key, SMSPariaz tools are absent and existing HORSEE behaviour is unchanged. Placement stays disabled unless the explicit enable flag is `true`; deployed production should keep it `false` until the owner separately authorizes a no-funds verification.

## Local debugging

Use Netlify Dev so the MCP function runs, and generate a throwaway local encryption key. Never commit it.

```powershell
$env:HORSEE_COUNCIL_DEV_WRITE_TOKEN = "local-dev-token"
$env:SMSPARIAZ_SESSION_ENCRYPTION_KEY = [Convert]::ToBase64String((1..32 | ForEach-Object { Get-Random -Maximum 256 }))
$env:SMSPARIAZ_APP_BET_ENABLED = "false"
npx netlify dev
```

Connect an MCP Inspector or local client to `http://localhost:8888/mcp` with `Authorization: Bearer local-dev-token`. Check `smspariaz_get_smsfootball` and `smspariaz_debug_status` first. The unit suite uses injected provider transports, so it sends no production POST:

```powershell
npm run test:mcp
npm run build
```

Calling OTP, validation, or session tools against a local running server contacts SMSPariaz. Do that only with an authorized account and explicit owner approval; placement remains disabled by the configuration above.

## Error handling and re-audit

Expected actionable errors include `AUTH_REQUIRED`, `OTP_REQUIRED`, `OTP_INVALID`, `SESSION_EXPIRED`, `APP_REGISTRATION_REQUIRED`, `INVALID_SELECTION`, `INVALID_STAKE`, `EVENT_CLOSED`, `ODDS_CHANGED`, `PREPARED_BET_EXPIRED`, `PREPARED_BET_ALREADY_USED`, `APP_BET_DISABLED`, `APP_BET_FLOW_CHANGED`, `PROVIDER_REJECTED`, `PROVIDER_UNAVAILABLE`, and `SUBMISSION_AMBIGUOUS`.

When scripts, request shape, origin, fields, response semantics, or app registration behaviour changes, keep placement disabled. Re-audit the current public scripts and a legitimate authenticated traffic capture, update the reviewed constants and tests, run the complete suite, deploy with placement still disabled, then obtain separate owner approval before any one-time no-funds placement test. Do not infer safety from an endpoint containing “bet”.
