# Peakpool app-flow research

## Decision: Treat Peakpool as a distinct virtual-balance provider profile

**Rationale**: The product owner confirmed on 2026-09-01 that Peakpool begins with a fixed, non-cash unit balance and credits winnings to a leaderboard. The public implementation nevertheless shares generic SMSPariaz page code and `/placebet/` infrastructure with other products. Product semantics must therefore be encoded as a dedicated profile rather than inferred from the endpoint name.

**Alternatives considered**:

- Reuse the SMSFootball app-bet profile: rejected. Football submits a server-issued `n<bookcode>` after its own validation step, while Peakpool constructs a direct race/runner message in browser JavaScript.
- Allow arbitrary `/placebet/` messages: rejected. The public code also has generic and SMS-capable paths, so endpoint allowlisting alone is insufficient.

## Decision: Use the authoritative public Peakpool fixture for programme reads

**Evidence**: The current public page is [Peakpool](https://www.smspariaz.com/peakpool/). Its current `site.js` requests `GET /service/peakpool_json.php?`; a read-only GET on 2026-09-01 returned 31 race records. Each displayed selectable runner is formed from the fixture's `meeting_number`, race `number`, and horse `no`.

**Current source evidence (2026-09-01)**:

- `https://www.smspariaz.com/js/site.js?v=1.590` SHA-256: `373d10892efd82b87f21f580c400ff9a1e0eeeaa96fd7319ca816f7da4cb9b79`
- `https://www.smspariaz.com/js/mobile.js` SHA-256: `a558938c793dc970fa1eec1e684c7b1d3aab67a4eaf71881c9e2c654d04b6e06`
- `loadPeakpool()` and its fixture shape: [site.js](../../../web-analysis/js/site.js#L296)

**Alternatives considered**:

- Rendered DOM scraping: rejected as the primary source because the JSON fixture is the page's direct authoritative input.
- Static fixture use in production: rejected; snapshots are for tests only because the race programme changes.

## Decision: Keep direct authenticated HTTP as the preferred architecture, with a hosted Playwright contingency

**Evidence**: Current public JavaScript calls `checklogin()` before a jQuery `POST /placebet/` with four fields: `loginid`, `phone`, `token`, and `message`. It does not show a client-side signature, device identifier, or native bridge call. `MOBILE=1` is set by the Android WebView's `logalert()` hook; the final jQuery request itself is ordinary same-origin code. See [mobile.js](../../../web-analysis/js/mobile.js#L431) and the Android hook at [C0550q.java](../../../analysis/jadx/sources/u4/C0550q.java#L145).

**Decision gate**: Direct HTTP is not approved for production placement until an owner-authorized no-cash account proves the current authenticated request's cookie, header, app-registration, response, and duplicate-handling semantics. If any required state cannot be reproduced legitimately, use hosted Playwright with a saved server-side browser context instead. The developer's laptop is never part of either runtime.

## Decision: The exact observed message is a candidate profile, not yet a production contract

**Static trace**:

```text
GET  /service/peakpool_json.php?
POST /checklogin/   loginid, phone, token
POST /placebet/     loginid, phone, token, message

win:   <stake>R<meeting>C<race>H<horse>
place: <stake>R<meeting>C<race>H<horse>P
```

`addPeakpoolSelection()` builds exactly one runner selection and gives the user Win/Place controls; `placebet()` appends `P` only for Place. [site.js](../../../web-analysis/js/site.js#L787) and [mobile.js](../../../web-analysis/js/mobile.js#L463) show the path.

**Rationale**: This is enough to plan strict profile validation, but not enough to claim that the server will accept a direct hosted call. The browser source does not prove CSRF requirements, final request headers, cookies, app registration, provider-side unit rules, error schema, idempotency, or leaderboard response data.

## Decision: Product-specific semantic isolation is mandatory

**Rationale**: The same public `sendSMS()` helper constructs the same compact syntax and opens `sms:8685`; generic `sendSMSOther()` also uses `/placebet/`. That does not contradict the owner's virtual-balance classification, but it means a raw message or generic endpoint allowlist would be unsafe from an integration standpoint.

**Required invariants**:

1. The caller supplies only a structured Peakpool selection and unit stake—not a raw `message`.
2. The server reconstructs the message only from a freshly resolved Peakpool fixture and a prepared-ticket snapshot.
3. The profile rejects all other product codes, paths, routes, fields, non-HTTPS redirects, and SMS URI usage before egress.
4. Any change to either source fingerprint or observed request profile returns `PEAKPOOL_APP_FLOW_CHANGED`.

## Remaining verification gate

An authorized non-cash verification must record, with secrets redacted:

- the successful or rejected request method, URL, content type, required headers, cookies, and redirects;
- whether `logalert()`, the Android user agent, `MOBILE==2`, or an app-registration state is required server-side;
- the provider's accepted unit stake grammar and range;
- success, insufficient-unit, stale-race, duplicate, session-expiry, and malformed-selection response schemas;
- whether the provider exposes current unit balance and leaderboard details; and
- the safe handling of a timed-out/ambiguous submission.

No production or irreversible request is required or permitted as part of automated tests.
