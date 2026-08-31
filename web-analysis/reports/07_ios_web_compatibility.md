# 07 — iOS/WebKit web compatibility

## Tests performed

1. Chromium with an iPhone Safari-like UA (`captures/iphone.json`).
2. Playwright WebKit 26.5 with the same iPhone Safari-like UA (`captures/iphone_webkit.json`).
3. Public `/login/` page with iPhone UA (`captures/login_iphone.json`).

All used fresh state, JavaScript enabled, no interaction, no authentication, service workers blocked, WebSockets blocked, and all non-GET/HEAD/OPTIONS requests blocked.

## Results

| Check | Safari-UA Chromium | Playwright WebKit |
|---|---|---|
| Root page status/title | 200 / `SMS PARIAZ LTD` | same |
| Main content and race tables visible | yes | yes |
| Forms/buttons/links/iframes | 2 / 1 / 28 / 2 | same |
| SMSPariaz first-party scripts | same three hashes | same three hashes |
| Page JavaScript errors | 0 | 0 |
| First-party cookie | `PHPSESSID` | `PHPSESSID` |
| Local storage | Zendesk keys created | same key family |
| Session storage | empty | empty |
| Popups during load | none | none |
| State-changing requests | none | none |

Screenshots: `screenshots/iphone.png` and `screenshots/iphone_webkit.png`. The small body-text hash difference is whitespace inserted between adjacent DOM nodes by the two engines; element counts, content, scripts, and visual page are equivalent.

WebKit additionally fetched `/manifest.json`; otherwise the normalized request set matched. No site error occurred. The only console warning in both runs was emitted by the analysis harness because service-worker registration was deliberately disabled.

## Login UI

The public login page rendered with three forms, two buttons, 28 links, and no JavaScript error under the iPhone UA. Its text includes the one-time app login prompt and phone-number input. No field was filled and `/otp/` and `/confirm/` were not called.

## Compatibility observations and limits

- The discovered app flow uses jQuery, DOM APIs, localStorage, and same-origin HTTPS requests, all present in WKWebView/WebKit.
- The page includes `target="_blank"` PDF/magazine links (`html/iphone.html:44,597-598`), so a wrapper needs `WKUIDelegate` handling for new-window navigation. These links were not clicked and download behavior was not exercised.
- No first-party `window.open` or WebSocket code was found in `mobile.js`/`site.js`.
- First-party `PHPSESSID` persistence worked. Authentication cookie/SameSite behavior remains untested because login was intentionally not performed.
- Third-party cookie behavior cannot be certified from a logged-out load. The Zendesk widget used its own storage; only the first-party PHP session cookie was present on the root capture.
- Service-worker/PWA behavior was not tested because service workers were disabled for request safety. It is not needed for the discovered wager path; `service-worker.js` only provides an offline navigation fallback.
- Playwright WebKit on Windows is useful engine evidence but is not a substitute for compiling and testing `WKWebView` on an iPhone.

Public rendering compatibility is therefore positive; authenticated/backend authorization remains the blocking unknown.
