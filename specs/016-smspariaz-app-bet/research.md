# Research: Authenticated SMSPariaz App Bets

## Decision 1: Direct Authenticated HTTP

**Decision**: Use Architecture A. Reproduce the current verified browser requests with a narrow server-side provider client and encrypted cookie/token persistence.

**Rationale**: Current production JavaScript and the decompiled official Android wrapper show that native code only hosts WebView, sets user agent `SMSPARIAZAPP001`, enables DOM storage, and invokes `logalert()` after page load. The football request path itself uses ordinary same-origin jQuery form posts. No wager bridge, device identifier, request signature, or client hash is generated. Direct HTTP is compatible with stateless Netlify Functions and avoids a permanent browser runtime.

**Alternatives considered**: Persistent Playwright was rejected because no JavaScript-only signature or device primitive is required and a bundled browser is a poor fit for the existing function. DOM automation and native bridge emulation were rejected because stable requests and authoritative JSON are directly available.

## Decision 2: Exact Current Production Flow

**Decision**: Treat the following audited chain as the only allowed app/leaderboard flow:

```text
GET /smsfootball/service/odds_json.php?
GET /football/cache/odds_1 ... odds_<nf>
  -> resolve event/market/selection provider IDs and displayed odds

POST /smsfootball/service/validatebet.php
  -> application/x-www-form-urlencoded bet-game, bet-stake, bet-staketax,
     bet-selection; bet-from for an accumulator; bet-payout for a single
  <- HTML containing the validated #bookcode, or BOOKINGERROR/error markup

POST /checklogin/ -> loginid, phone, token
  <- JSON text; status == 0 means valid

POST /placebet/ -> exact fields loginid, phone, token, message
  -> message is exactly lowercase "n" + the validated bookcode
  <- JSON text; status == 0, reply.message, reply.webmessage
```

**Rationale**: The football page first validates a coupon. Only after the response supplies `#bookcode` does football `mobile.js` offer the app action, construct `n<bookcode>`, check the saved login, and post the four exact fields.

**Verified public evidence (2026-09-01)**:

- `/smsfootball/js/site.js`: SHA-256 `b01a832f9556bccce67120174c0e262fbb08bb07c5ab43cf13574c879462054f`
- `/smsfootball/js/mobile.js`: SHA-256 `f441172f80d10aa90c612fdab526c1fd8491a5f752f7c035f123539797f5968a`
- `/js/mobile.js`: SHA-256 `a558938c793dc970fa1eec1e684c7b1d3aab67a4eaf71881c9e2c654d04b6e06`
- No OTP, coupon-validation, session-validation, or app-bet POST was sent during discovery.

**Alternatives considered**: Root horse-racing message construction is not authoritative for football. The `sms:8685?body=n<bookcode>` paid-SMS action and arbitrary `sendSMSOther()` path are explicitly excluded.

## Decision 3: OTP and Session State

**Decision**: Reproduce the legitimate root flow: `GET /login/` for `PHPSESSID`, `POST /otp/` with `number`, then `POST /confirm/` with `number`, `otp`, and optional referral `referer`. On status zero, persist `reply.id`, `reply.phone`, `reply.token`, and only required first-party cookies. Never persist the OTP. Validate through `/checklogin/`. Logout writes a higher-generation secret-free tombstone; the current app exposes no token-revocation API.

**Rationale**: The current client has no CSRF field or signature. The one-time login is the observed app registration; no separate device ID is transmitted.

**Alternatives considered**: Omitting cookies is unsafe until authenticated tests prove them unnecessary. Inventing device-registration or logout endpoints is prohibited.

## Decision 4: Encrypted Hosted Persistence

**Decision**: Encrypt strict versioned session records with AES-256-GCM using a 32-byte Base64 key, random 12-byte IV, authenticated store metadata, and non-secret key ID. Use stable production Netlify Blobs and isolated preview/branch namespaces; use an atomic encrypted `.netlify/` file only locally. Support one optional previous key and rewrap on read.

**Rationale**: The MCP server closes per request, so memory and hosted files cannot persist authentication. Existing code already provides strong Blob reads, CAS, deploy isolation, and atomic local files.

**Alternatives considered**: Process/MCP memory, environment JSON, client-held state, and plaintext Blobs were rejected. An external database/KMS is valid future hardening but unnecessary for this scope.

## Decision 5: OAuth and Closed-World Tool Security

**Decision**: Keep resource JWT verification and authorize explicit scopes: `horsee:council:write` unchanged; `horsee:smspariaz:session` for provider session/prepare operations; `horsee:smspariaz:app-bet` for submission. A resource token may carry any supported scope, while each tool enforces its own. Replace unknown-tool-to-`noauth` with an exhaustive registry. The programme read is explicitly public.

**Rationale**: Council write authority must not silently grant a materially different action. The external authorization server must issue the new scopes; `ggtOAuthHorsee` is not repository code or a live tool.

**Alternatives considered**: Reusing the Council scope and no-auth session tools were rejected for least privilege. Defaulting future tools to a security scheme was rejected because a typo could expose one.

## Decision 6: Durable Explicit Preparation and Replay Control

**Decision**: Preparation creates a random opaque handle backed by an encrypted durable record binding the OAuth principal, session generation, canonical provider IDs, stake/tax/payout, odds, bookcode, flow fingerprint, and expiry. Submission revalidates state and atomically changes `PREPARED` to `SUBMITTING` before one outbound request. Terminal states are `SUCCEEDED`, `REJECTED`, `AMBIGUOUS`, and `EXPIRED`.

**Rationale**: A stateless token cannot prevent concurrent duplicate serverless submissions. CAS supplies a one-use boundary; timeouts/unrecognized bodies become terminal ambiguous outcomes and are never retried.

**Approval limitation**: Separate tools, destructive annotations, an explicit `approved: true`, and one-use state enforce a deliberate operation boundary, but the server cannot cryptographically prove a human clicked approval in the host. A future first-party approval UI is required for cryptographic human attestation. Placement remains absent from autonomous instructions.

## Decision 7: Positive App-Flow Guard

**Decision**: Compile a reviewed manifest with exact HTTPS origin, paths, methods, content type, request keys, required app header semantics, response classifier, and source hashes. Re-fetch/harden current sources before preparation/submission. Construct bytes server-side, compare immediately before egress, use manual redirects, and perform no fallback or POST retry. Submission fields are exactly `loginid`, `phone`, `token`, and `message`; `message` must be `n` plus the validator's bookcode. Reject all other origin/path/method/fields and wallet/payment/cash/paid-SMS/deposit/withdraw/balance/debit/instrument vocabulary.

**Rationale**: The generic `/placebet/` name proves nothing. The validated football booking code plus exact app semantics distinguish the requested free route.

**Alternatives considered**: Denylists alone, caller-configurable endpoints, and redirect following were rejected.

## Decision 8: Programme and Odds Model

**Decision**: Read `/smsfootball/service/odds_json.php?` for dates, labels, update time, and fragment count, then exactly `/football/cache/odds_1` through `odds_<nf>`. Parse compact match/market/selection IDs and divide integer odds by 100. Presence with valid positive odds means open; absent/malformed means unavailable.

**Rationale**: These are the page's authoritative sources and preserve provider IDs that rendered text would lose.

**Alternatives considered**: Third-party feeds, rendered-page scraping, and guessing absent availability were rejected.

## Decision 9: Redacted Observability

**Decision**: Add an SMSPariaz logger with enumerated events and allowlisted fields only: request ID, safe state/error, HTTP status, latency, counts, hashes/fingerprint, and hashed reference. Never accept/spread bodies, raw errors, phone, OTP, tokens, cookies, authorization, keys, or prepared handles.

**Rationale**: The existing arbitrary detail spread is not a safe redaction boundary for provider bearer material.

## Remaining Verification Boundary

Public code verifies construction but not authenticated backend enforcement or success bodies. Build and mock-test the implementation, but keep production placement disabled by default. Manual completion requires operator OTP plus an explicitly approved no-funds app-flow test. Until then, report the flow as statically verified but not end-to-end verified.
