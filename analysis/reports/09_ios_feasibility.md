# 09 — iOS feasibility

## Classification

**D — Cannot determine complete functional equivalence from static analysis.**

The Android wrapper itself is simple to reproduce: it is one WebView, ordinary cookies/DOM storage, a custom UA, deep-link routing, and a broad generic JavaScript bridge. However, the remote website—not this APK—contains the authentication, OTP, account, balance, betslip, wager construction, endpoint selection, and response UI. Static analysis cannot show whether that site supports WKWebView/iOS, what it expects instead of the Android UA, or whether the backend has an app-channel allowlist.

There is no evidence of Play Integrity, SafetyNet, App Check, certificate pinning, Android Keystore attestation, signature validation, or a native SMS API that would make the port inherently Android-only. This means the result is not category C on available evidence. It also cannot responsibly be called A or B until the remote contract is known.

## Component mapping

| Android | Authorized iOS equivalent | Notes |
|---|---|---|
| `MainActivity` + Compose shell | SwiftUI `App` + `ContentView` | Straightforward. |
| `android.webkit.WebView` | `WKWebView` | Use a persistent `WKWebsiteDataStore.default()`. |
| `CookieManager` | `WKHTTPCookieStore` / `HTTPCookieStorage` | Website cookies should remain website-managed. |
| DOM storage | WKWebView website data store | Enabled by default. |
| `addJavascriptInterface(..., "WebToNativeInterface")` | `WKScriptMessageHandler` plus a narrowly scoped JS shim | Port only methods proven necessary by the authorized website contract. |
| `evaluateJavascript` / `loadUrl("javascript:...")` | `evaluateJavaScript` / `WKUserScript` | Do not expose unnecessary native capabilities. |
| `SharedPreferences` | `UserDefaults` | Non-secret preferences only. |
| Android private UUID file | Keychain or app support file | Only if the server officially requires an iOS installation ID. |
| Android Keystore / encrypted secrets | Keychain | No SMS-specific Android use was found. |
| WebView/OkHttp networking | WKWebView / `URLSession` | Current bet traffic is web traffic; do not invent a native endpoint. |
| Android App Link | Universal Link | Requires SMSPariaz-associated-domain configuration. |
| `w2n://` custom scheme | iOS URL scheme, if retained | Must be registered and validated. |
| POST_NOTIFICATIONS | `UNUserNotificationCenter` authorization | Only if notifications are required. |

## Architecture supported by evidence

```text
SwiftUI shell
    -> WKWebView
    -> persistent WKWebsiteDataStore
    -> authorized iOS user agent/channel contract
    -> remote SMSPariaz website
    -> remote SMSPariaz backend

Optional, only where website contract requires it:
WKUserScript shim -> WKScriptMessageHandler -> narrowly scoped Swift capability
```

The iOS app should not pretend to be Android. SMSPariaz should define an iOS-specific UA or feature flag, update any channel allowlist, and confirm which bridge methods its website actually invokes.

## What SMSPariaz authorization/backend work is required

1. Confirm that an iOS client is legally and operationally authorized, including App Store and jurisdictional gambling requirements.
2. Provide the current web/client contract or a test environment showing the “Place Bet by App” flow without real wagers.
3. Define an iOS-specific channel identifier; do not reuse `SMSPARIAZAPP001` without explicit approval.
4. Confirm WKWebView compatibility for login, OTP, cookies, SameSite rules, redirects, popups, and payments.
5. Identify only the bridge functions the remote site needs and replace generic Android-only return values with iOS semantics.
6. If the website cannot submit bets directly on iOS, provide a documented iOS API contract, authentication scheme, idempotency behavior, and test endpoint. Do not reverse-engineer or guess it.
7. Configure Universal Links, associated domains, push entitlements, Keychain access groups, and privacy declarations as required.

## Prototype scope

`analysis/ios-prototype` implements a safe SwiftUI/WKWebView shell. It:

- loads `https://www.smspariaz.com` with the normal iOS UA;
- uses persistent website storage/cookies;
- supports back/forward/reload navigation;
- installs a development guard that blocks and locally logs obvious “Place Bet” clicks plus every non-GET form/fetch/XHR/navigation mutation and every beacon;
- contains no real bet endpoint and `APIClient.submitBet` is hard-disabled;
- does not copy the Android UA, fake Android IDs, bypass OTP, bypass TLS, or reproduce attestation.

This prototype demonstrates wrapper feasibility only. It is not evidence that the production backend will authorize an iOS bet.
