# 01 — DOM and public-page difference

## Controlled result

The exact `SMSPARIAZAPP001` user agent did **not** change the fresh, unauthenticated root page in this capture.

The strongest pair held the browser viewport, touch/mobile emulation, locale, time zone, and client hints constant. The only intentional difference was the complete `User-Agent` header.

| Property | Normal Android control | `SMSPARIAZAPP001` |
|---|---:|---:|
| Final URL | `https://www.smspariaz.com/` | same |
| HTTP status | 200 | 200 |
| Document bytes | 34,575 | 34,575 |
| Document SHA-256 | `05ef33abda93051341afd597ffa784967b17b2970d70b4b43ef6f6f79e27b1bd` | same |
| Rendered structure SHA-256 | `d56fddbc7d746b65501944e18d6ecbd40345e619baad5c9186d9d194abe72288` | same |
| Rendered body-text SHA-256 | `90388dec3e44a59704573528d771419a3206ed7d942fdfbc6d8fa62aaa397ace` | same |
| `<title>` | `SMS PARIAZ LTD` | same |
| `<meta>` elements | 3 | 3 |
| scripts in DOM | 9 | 9 |
| stylesheets | 6 | 6 |
| forms | 2 | 2 |
| buttons | 1 | 1 |
| links | 28 | 28 |
| iframes | 2 | 2 |
| hidden inputs | 0 | 0 |
| page JavaScript errors | 0 | 0 |
| page global `MOBILE` | `0` | `0` |

Evidence: `captures/control_android_hints.json`, `captures/appua_android_hints.json`, `captures/derived-comparison.json`, `html/control_android_hints.html:18-20`, and `html/appua_android_hints.html:18-20`.

Screenshots: `screenshots/control_android_hints.png` and `screenshots/appua_android_hints.png`. They render the same page and initial empty betslip.

## Element-level differences

There were no differences in title, meta elements, script URLs, stylesheet URLs, forms, buttons, links, iframes, hidden fields, or `data-*` attributes in the controlled pair. The same first-party files were loaded with identical hashes:

- `/js/mobile.js` — `a558938c793dc970fa1eec1e684c7b1d3aab67a4eaf71881c9e2c654d04b6e06`
- `/js/site.js?v=1.590` — `373d10892efd82b87f21f580c400ff9a1e0eeeaa96fd7319ca816f7da4cb9b79`
- `/lib/jquery.js` — `f36844906ad2309877aae3121b87fb15b9e09803cb4c333adc7e1e35ac92e14b`

The initial DOM does not contain a `#placebet` button. That button is constructed later by public JavaScript only after an odds selection is added and app mode is active. No odds or betting control was clicked.

## Cookies and web storage

Both contexts created one first-party cookie named `PHPSESSID` with the same metadata: domain `www.smspariaz.com`, path `/`, session lifetime, `SameSite=Lax`, `Secure=false`, and `HttpOnly=false`. Values were different random session identifiers and were saved only as SHA-256 hashes.

Both created Zendesk-related local-storage keys `ZD-store` and `ZD-suid`; `ZD-suid` values differed because each context was fresh. Session storage was empty. There was no app-only cookie, SMSPariaz feature flag, or SMSPariaz auth key in either fresh context.

An occasional `ZD-buid` appeared in isolated runs under several unrelated variants. It is Zendesk widget state and is not correlated with the app UA or bridge.

## Other public pages

`/mobile/` and `/login/` also returned the same first-party HTML/scripts under normal and app UAs. Their page text and `MOBILE=0` value were identical. Third-party YouTube/Zendesk request noise differed on `/mobile/`, but first-party response hashes did not.

The public login page says that app betting requires a one-time login and renders under normal Android, app UA, and iPhone UA. No fields were filled and no login or OTP request was sent. Evidence: `html/login_normal.html`, `html/login_appua.html`, and `html/login_iphone.html`.

## The DOM change that actually matters

When the harness reproduced the APK's real post-load call `logalert()`:

- `MOBILE` changed from `0` to `1`;
- link count changed from 28 to 31;
- the menu gained another Football link plus Login and Create Account while logged out;
- results were identical with normal UA, app UA, and app UA plus inert bridge.

Evidence: `captures/native_normal.json`, `captures/native_appua.json`, and `captures/native_appua_bridge.json`; function source `js/mobile.js:17-58`.

This is a native-injected JavaScript mode switch, not a UA-driven DOM response.
