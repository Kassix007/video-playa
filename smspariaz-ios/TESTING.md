# SMSPariaz Expo Go testing checklist

Run these tests on the iPhone 16 through Expo Go. Stay logged out for the initial UI pass. Use only the SMSPariaz developer-confirmed no-funds leaderboard QA account for the authenticated request test; do not use a real-money account.

Before starting on Windows:

```powershell
cd C:\Users\shaan\Desktop\projects\video-playa\smspariaz-ios
npm run verify
npx expo install --check
npx expo start --go
```

## Test 1 — Fresh launch

1. Open the QR code in Expo Go.
2. Wait for Metro and the embedded page.

Expected:

- `https://www.smspariaz.com/` loads.
- No native TLS/certificate bypass prompt appears.
- DEBUG shows a sanitized SMSPariaz URL and page title.
- No guarded request is reported during the ordinary public load.

## Test 2 — App-mode activation

Expand DEBUG immediately after the page finishes.

Expected:

```text
logalert found = YES
MOBILE = 1
APP MODE ACTIVE
```

The activation attempt should be between 1 and 5. The retry process must stop after success; it never creates an infinite timer.

## Test 3 — UI gate and betslip construction

Browse to a public market and select an odd. This constructs a local page betslip; do not enter credentials and do not submit anything.

Expected:

- `.footer-betslip` changes to YES.
- App-specific login/register navigation is visible while logged out.
- `#mobile-place-bet` becomes available when the site's normal selection logic creates that container.

Stop before any remote submission action.

## Test 4 — Button detection

With an appropriate public selection visible, inspect DEBUG.

Expected:

- `#mobile-place-bet` or `#placebet` changes to YES when the remote site creates it.
- The debug panel detects the element but never clicks it.
- The React Native shell contains no native wagering button.

The logged-out site may show a login link instead of `#placebet`; that is a valid result and should not be bypassed.

## Test 5 — Development QA request and release guard

First verify both policy branches safely from Windows:

```powershell
npm run test:guard
```

Expected automated result:

- protected non-QA fetch, XHR, beacon, and form transmissions remain at zero;
- normal public requests pass through;
- messages contain only `type`, `method`, and `path`;
- `/checklogin/` is allowed by the project default so SMSPariaz can validate the authenticated session.
- release-like/non-QA `/placebet/` remains blocked;
- explicit development QA `/placebet/` reaches the fake transport and reports `START` and `COMPLETE` without payload data.

For the authorized on-device QA pass:

1. Confirm DEBUG shows `checklogin allowed = YES` and `QA placebet allowed = YES`.
2. Log in again if the earlier blocked validation removed the website's storage keys.
3. Construct the leaderboard QA selection and invoke the remote website control once.

Expected:

- `/checklogin/` validates the session;
- `/placebet/` reaches the confirmed no-funds QA handler;
- DEBUG shows `QA START xhr POST /placebet/`, followed by `QA COMPLETE` or `QA ERROR` and an HTTP status where available;
- `QA placebet requests` increments once;
- no account fields, token, phone, message, request body, or response body appears in React Native logs.

A non-development/release bundle must continue to report `QA placebet allowed = NO` and block the endpoint.

## Test 6 — Reload

Press Reload in DEBUG.

Expected:

- the page reloads;
- page-specific diagnostics reset;
- the bounded app-mode sequence runs again;
- DEBUG returns to `MOBILE = 1`.

## Test 7 — Website storage persistence

1. Note only the three storage-existence booleans in DEBUG; never inspect values.
2. Close the project in Expo Go.
3. Reopen it from Expo Go's recent projects.

Expected/limitation:

- WKWebView normally retains website cookies and DOM storage in the Expo Go host container.
- Expo Go owns that container, so persistence and isolation are not guaranteed to match a standalone SMSPariaz app.
- Do not interpret key existence as proof that an authenticated session is valid.

## Test 8 — Neutral page and state limitation

1. Press Neutral Page.
2. Confirm the WebView becomes `about:blank`.
3. Press Home to return to SMSPariaz.

Expected:

- no server mutation occurs;
- returning Home reloads the request guard and app-mode hook;
- Neutral Page does **not** clear cookies, localStorage, or sessionStorage.

Fully clearing WKWebView website data is not reliably available through `react-native-webview` inside Expo Go. Do not add custom native code for this milestone. If a truly fresh container is essential, use a separately authorized future standalone build or remove/reinstall Expo Go with the understanding that this clears the host app broadly.

## Test 9 — Navigation and external links

1. Use Back, Forward, Reload, and Home.
2. If a public page contains an external top-level link, tap it once.

Expected:

- SMSPariaz and subdomain navigation stays in the WebView.
- required third-party frames/resources remain usable.
- an external top-level destination is cancelled in the WebView and shown in a confirmation prompt before iOS opens it.
- `target="_blank"` SMSPariaz links reuse the same WebView instead of creating nested WebViews.

## Test 10 — Error reporting

Temporarily disconnect the iPhone network, reload, then restore the network.

Expected:

- a lightweight WebView/HTTP error banner shows status or description and sanitized URL metadata;
- no cookie, header, token, OTP, phone number, or request body is logged;
- Reload recovers after connectivity returns.

## Completion record

Record these results without credentials or account data:

```text
Date:
Expo Go version:
iOS version:
LAN or tunnel:
Public page loaded: YES/NO
logalert found: YES/NO
MOBILE = 1: YES/NO
App UI observed: YES/NO
Guard test PASS: YES/NO
On-device errors (sanitized):
```
