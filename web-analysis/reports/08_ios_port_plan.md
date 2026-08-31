# 08 — Minimum authorized iOS port plan

## Classification

**Client mechanics: modified Case A. Production authorization: Case D until SMSPariaz confirms backend policy.**

The Android mode is not “custom UA alone.” It is:

```text
Android WebView
    + remote SMSPariaz website
    + post-load evaluateJavascript("logalert();")
    + persistent localStorage/cookies
```

No Android bridge method submits the wager. Public `mobile.js` performs both session validation and wager POST.

## Minimum iOS architecture supported by evidence

```text
SwiftUI shell
    |
WKWebView + WKWebsiteDataStore.default()
    |
WKNavigationDelegate.didFinish
    |
authorized page-mode call (current web hook: logalert())
    |
remote site sets MOBILE=1 and renders app login/bet UI
    |
website localStorage: loginid + phone + token
    |
POST /checklogin/ then POST /placebet/
    |
SMSPariaz backend
```

The Swift layer does not need to read, copy, or submit the website's auth values. WKWebView should keep them inside its persistent website data store.

## Android-to-iOS mapping

| Android evidence | iOS equivalent |
|---|---|
| `android.webkit.WebView` | `WKWebView` |
| `CookieManager` + DOM storage | `WKWebsiteDataStore.default()` |
| `WebViewClient.onPageFinished` | `WKNavigationDelegate.webView(_:didFinish:)` |
| `evaluateJavascript("logalert();")` | `evaluateJavaScript("if (typeof logalert === 'function') logalert();")` |
| Deep links | Universal Links/custom URL scheme |
| Generic `WebToNativeInterface` share/print | optional, narrowly scoped native capabilities; not required for bet |
| Website localStorage auth | leave in WKWebView; do not exfiltrate to Swift/Keychain |
| Website jQuery requests | WKWebView networking; no native `URLSession` bet client needed |

## Backend/authorization work

SMSPariaz must explicitly confirm:

1. an iOS wrapper is authorized to invoke the page-mode hook;
2. whether `/checklogin/` or `/placebet/` validates `SMSPARIAZAPP001`, PHP session state, platform/client hints, IP, or any app registration signal;
3. that an iPhone/WKWebView session may receive and use the same OTP-issued website token;
4. whether a new documented hook such as `enableIOSAppMode()` should replace reuse of the legacy name `logalert()`;
5. whether an iOS channel identifier such as `SMSPARIAZIOS001` is required and allowlisted;
6. a non-production/no-funds environment for OTP, session expiry, duplicate submission, network failure, and server rejection tests.

Do not ship `SMSPARIAZAPP001` on iOS. The controlled tests show it is unnecessary for public app-mode activation, and backend use remains unknown.

## Prototype

`ios-wrapper/` implements the evidenced wrapper structure with a normal iPhone UA. It calls `logalert()` after navigation and contains a document-start safety guard plus browser policy that blocks every non-GET mutation and logs only method/URL metadata locally. It does not implement `WebToNativeInterface`, login automation, OTP automation, or wager submission.

Production work should remove the analysis guard only after SMSPariaz provides explicit authorization, an iOS contract, and a no-funds test environment.
