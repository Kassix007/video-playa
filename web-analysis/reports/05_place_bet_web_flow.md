# 05 — “Place Bet by App” web flow

## Result

The complete client-side flow is present in publicly loaded first-party JavaScript. The eventual endpoint is statically identifiable as:

```text
POST https://www.smspariaz.com/placebet/
```

It was **not called**. No odds, stake input, login, OTP, or button was exercised.

## Code flow

```text
GET /service/local_json.php
    |
    v
site.js loadLocal() renders .odds with data-rh/data-horse/data-type/data-odd
    |
    v
local click handler -> addSelection(element)
    |
    v
builds #selection, #bettype, #selodds, #stake, #mobile-place-bet
    |
    v
mobile.js mobile()
    |
    +-- MOBILE != 1: no app button
    |
    +-- MOBILE == 1 and no local auth: link to /login/
    |
    +-- MOBILE == 1 and loginid+phone+token present:
            inserts disabled #placebet -> onclick placebet()
            |
            v
validateStake() enables #placebet for positive numeric stake
            |
            v
placebet()
    constructs message = stake + race/horse selection + optional "P"
    reads loginid, phone, token from localStorage
            |
            v
checklogin(): POST /checklogin/ with loginid, phone, token
            |
            +-- invalid: clear three localStorage keys; show login/session-expired UI
            |
            +-- valid: POST /placebet/
                      fields: loginid, phone, token, message
                      |
                      v
                 JSON parse
                 status == 0 -> reply.out + reply.message success UI
                 otherwise   -> reply.message error UI
```

## Evidence map

| Step | File/function/lines | Selector or endpoint |
|---|---|---|
| Public fixture request | `js/site.js:627-640`, `loadLocal` | GET `/service/local_json.php` (also in both HARs) |
| Odds click binding | `js/site.js:721-733` | `.odds` -> `addSelection(odd)` |
| Bet selection extraction | `js/site.js:755-760`, `addSelection` | `data-rh`, `data-horse`, `data-type`, `data-odd` |
| Betslip construction | `js/site.js:764-783` | `#selection`, `#bettype`, `#selodds`, `#stake`, `#mobile-place-bet` |
| App UI gate | `js/mobile.js:431-444`, `mobile` | `MOBILE==1`; login link or `#placebet` |
| Stake validation/button enable | `js/site.js:848-871`, `validateStake` | `#placebet.disabled` |
| Message construction | `js/mobile.js:463-482`, `placebet` | stake + selection + `P` for place |
| Server session validation | `js/mobile.js:320-353`, `checklogin` | POST `/checklogin/` |
| Wager request | `js/mobile.js:496-504`, `placebet` | POST `/placebet/`; four form fields |
| Response UI | `js/mobile.js:505-526` | `.footer-betslip`; `status`, `reply.out`, `reply.message` |
| Android app-mode activation | `analysis/jadx/sources/u4/C0550q.java:145-160`; `js/mobile.js:17-58` | post-load `logalert()` -> `MOBILE=1` |

## Authentication and OTP preceding the flow

`login()` POSTs the phone number to `/otp/` (`js/mobile.js:60-88`). `verifyOtp()` POSTs number/OTP/referrer to `/confirm/`; a successful JSON response writes `reply.id`, `reply.phone`, and `reply.token` into localStorage under `loginid`, `phone`, and `token` (`:224-260`). Those values are later submitted by `checklogin()` and `placebet()`.

No credentials or tokens were captured. The public login page was rendered only; authentication is the manual boundary specified by the user.

## SMS alternative

`site.js:833-846` constructs the same compact message and navigates to `sms:8685?&body=...`. That is separate from “Place Bet by App,” whose `placebet()` function uses the HTTPS endpoint.

## What remains unknown

- Whether `/placebet/` also validates User-Agent, PHP session, IP, device registration, or another server-side property.
- Exact HTTP response examples and production failure codes.
- Whether an authenticated session causes server-rendered `MOBILE=2`.
- Whether the backend authorizes iOS.

Answering those would require a SMSPariaz-authorized no-funds test environment. Static source discovery is sufficient to identify the endpoint; sending a wager is neither necessary nor permitted.
