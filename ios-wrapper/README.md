# SMSPariaz WKWebView research wrapper

This is a deliberately non-transactional SwiftUI/WKWebView reference project based on the public web analysis in `../web-analysis/reports/FINAL_WEB_ANALYSIS.md`.

## What it demonstrates

- A persistent `WKWebsiteDataStore.default()` WebView using the normal iOS/WKWebView identity.
- JavaScript, `WKNavigationDelegate`, and `WKUIDelegate` integration.
- The APK-equivalent post-load call `logalert()` that the live site's `mobile.js` uses to set `MOBILE=1`.
- Safe handling of `target=_blank` links within the guarded WebView.
- Metadata-only local diagnostics through `NativeBridge.analysisLog`.

The project does **not** set `SMSPARIAZAPP001`; the controlled captures disproved it as the public client-side app-mode switch. It also does not invent `SMSPARIAZIOS001`. A production identifier or mode hook must be agreed with SMSPariaz.

## Safety boundary

Before page code executes, `SafetyScript` blocks all non-GET/HEAD/OPTIONS fetch, XHR, forms, beacons, WebSockets, and service-worker registration. The native navigation delegate independently cancels non-safe navigations and downloads. Logs contain only a method, source label, and URL stripped of credentials, query strings, and fragments.

Consequently this build cannot complete login, OTP verification, registration, withdrawal, or wager submission. It contains no native request client and no `WebToNativeInterface` implementation.

## Build

1. On macOS, open `SMSPariazWebWrapper.xcodeproj` in Xcode 16 or newer.
2. Choose an iOS 16+ simulator or a development-signed device.
3. Select a signing team if installing on a physical device, then Run.
4. Inspect metadata-only messages under the `SafeWebAnalysis` logging category.

The project was created and statically checked on Windows, where Apple SDK compilation is unavailable. It still requires an Xcode build before use.

## Production boundary

Do not remove the safety guard or distribute this wrapper until SMSPariaz has:

- authorized an iOS/WKWebView channel and the app-mode hook;
- documented any backend channel or UA checks on `/checklogin/` and `/placebet/`;
- supplied a no-funds test environment for OTP, expiry, duplicate, rejection, and failure-path testing; and
- completed the usual legal, responsible-gambling, App Store, privacy, and security review.
