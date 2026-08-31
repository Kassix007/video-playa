# 03 — First-party JavaScript analysis

## Files

| Public URL | Canonical saved file | Public-response SHA-256 | Local LF-normalized SHA-256 | Notes |
|---|---|---|---|---|
| `https://www.smspariaz.com/js/mobile.js` | `js/mobile.js` | `a558938c793dc970fa1eec1e684c7b1d3aab67a4eaf71881c9e2c654d04b6e06` | `28ef56d4f2faee9f9ed281f930dd9a87c078f396d76b7f7d45f03c49626a50cf` | App login, OTP, local auth, mobile mode, and wager submission. |
| `https://www.smspariaz.com/js/site.js?v=1.590` | `js/site.js` | `373d10892efd82b87f21f580c400ff9a1e0eeeaa96fd7319ca816f7da4cb9b79` | `c92c88aab54219503311df8baa8fab6280e1db1bb33ed0db28ea827732fa2547` | Fixtures, odds selection, betslip, SMS fallback; dynamically appends `mobile.js`. |
| `https://www.smspariaz.com/lib/jquery.js` | `js/jquery.js` | `f36844906ad2309877aae3121b87fb15b9e09803cb4c333adc7e1e35ac92e14b` | `f7f6a5894f1d19ddad6fa392b2ece2c5e578cbf7da4ea805b6885eb6985b6e3d` | jQuery dependency. |
| `https://www.smspariaz.com/service-worker.js` | `js/service-worker.js` | `ea81c1bff223b5c5aa6efb8eebc9486cb4b946c396960b22d8e7f1a8673998bf` | `b3ed26b0e3232f7366628749c69d7556ef2ca332b7ed84f662dc9752b8842846` | GET/navigation offline fallback only; no wager code. |

The first three response bodies were byte-identical in every primary normal/app-UA/bridge/iPhone capture. The response hashes above apply to the captured bytes; readable canonical copies use normalized line endings and therefore have the separately listed local hashes. Per-variant raw response copies remain under `js/`.

## Channel-related search

There are no matches for any of the following in the first-party HTML, `mobile.js`, or `site.js`:

- `SMSPARIAZAPP001`
- `navigator.userAgent`
- `userAgent`
- `WebToNativeInterface`

Therefore live first-party JavaScript does not directly inspect the app UA or Android bridge.

The relevant channel logic is instead:

1. `js/mobile.js:17-58`, `logalert()`, sets global `MOBILE = 1` and adds app login/register menu items.
2. `js/mobile.js:431-444`, `mobile()`, exposes the app-bet login/button UI only when `MOBILE==1`.
3. `html/appua.html:18-20` initializes `MOBILE=0`, just like the control.
4. `html/appua.html:651-665` contains a separate dormant path: if a server-rendered page ever has `MOBILE==2`, it calls `logalert()` after load. All fresh public variants received `0`, not `2`.
5. The APK itself unconditionally executes `logalert();` on the main WebView at page finish: `analysis/jadx/sources/u4/C0550q.java:145-160`, method `onPageFinished`; smali `analysis/apktool/smali/U4/q.1.smali:419-423`.

## Relevant functions and conditions

| File/function | Lines | Behavior/trigger |
|---|---:|---|
| `site.js` `loadLocal` | 627-753 | GETs `/service/local_json.php`, renders race/odds elements, and binds odds clicks to `addSelection`. This GET occurred in every root HAR. |
| `site.js` `addSelection` | 755-785 | Reads `data-rh`, `data-horse`, `data-type`, and `data-odd`; constructs the betslip including `#stake`, `#mobile-place-bet`, and SMS button; calls `mobile()`. |
| `site.js` `addPeakpoolSelection` | 787-821 | Peakpool variant of betslip construction; calls `mobile()`. |
| `site.js` `validateStake` | 848-872 | Positive stake enables SMS and, when `MOBILE==1`, `#placebet`. |
| `site.js` `sendSMS` | 833-846 | Alternative flow opens `sms:8685` with constructed stake/selection text. |
| `mobile.js` `logalert` | 17-58 | Native app-mode entry: sets `MOBILE=1`; adds login/register/logout navigation based on local token presence. |
| `mobile.js` `login` | 60-88 | POST `/otp/` with phone `number`; renders OTP field on success. Not executed. |
| `mobile.js` `verifyOtp` | 224-260 | POST `/confirm/` with number, OTP, and referrer; on status 0 stores `reply.id`, `reply.phone`, and `reply.token` in localStorage. Not executed. |
| `mobile.js` `checklogin` | 320-353 | Requires `loginid`, `phone`, and `token`; POSTs them to `/checklogin/`; resolves true only when returned status is 0. Not executed. |
| `mobile.js` `mobile` | 431-444 | When `MOBILE==1`, injects either a login link or disabled `#placebet` button into `#mobile-place-bet`. |
| `mobile.js` `placebet` | 463-529 | Constructs message, validates session through `checklogin()`, then POSTs auth fields/message to `/placebet/`; renders response. Not executed. |

## Statically visible endpoint table

`BASE` is `https://www.smspariaz.com/` in the captured document (`html/appua.html:627`).

| Endpoint | Method | Function | Data visible in source | Called in this analysis? |
|---|---|---|---|---:|
| `/otp/` | POST | `login` | phone `number` | no |
| `/confirm/` | POST | `verifyOtp` | `number`, `otp`, `referer` | no |
| `/registerremote/` | POST | `register` | registration/OTP/form fields | no |
| `/checklogin/` | POST | `checklogin` | `loginid`, `phone`, `token` | no |
| `/placebet/` | POST | `sendSMSOther`, `placebet` | `loginid`, `phone`, `token`, `message` | no |
| `/withdraw/` | POST | `withdrawal` | auth fields and withdrawal fields | no |
| `/service/local_json.php` | GET | `loadLocal` | none | yes, ordinary public page load |

The POST data objects are passed to jQuery without an explicit content type. jQuery normally serializes such objects as URL-encoded form data, but the wager source does not spell out the header; that encoding conclusion is a library-level inference, not an observed wager request.
