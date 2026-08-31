> **Public-web follow-up (2026-08-28):** This document records APK-only findings. Subsequent safe, unauthenticated browser analysis found that `SMSPARIAZAPP001` does not change public HTML/DOM/network behavior. The actual client-side mode handoff is the APK's post-load `evaluateJavascript("logalert();")`; public `mobile.js` then sets `MOBILE=1` and contains the `/checklogin/` and `/placebet/` flow. This supersedes the UA hypothesis below. See [`web-analysis/reports/FINAL_WEB_ANALYSIS.md`](../../web-analysis/reports/FINAL_WEB_ANALYSIS.md).

Application type: Native Kotlin/Java Android shell using Jetpack Compose and a Web To Native `android.webkit.WebView` wrapper
Main URL: `https://www.smspariaz.com`
WebView used: YES
JavaScript bridge: YES — `WebToNativeInterface` on the main WebView; no wager method found
Networking stack: Chromium WebView for SMSPariaz traffic; generic OkHttp 4.12.0, `HttpURLConnection`, and Firebase SDK code are bundled but no native SMSPariaz API client was found
Authentication method: Remote website session state (cookies/DOM storage); the server-side login/token mechanism is not present in the APK
OTP registration: No native SMS/OTP registration flow found; any active OTP flow belongs to remote website content and cannot be determined statically
Device registration: No SMSPariaz-specific native device registration found; generic device-info/UUID and Firebase Installations capabilities exist but are not shown feeding SMSPariaz authentication
Place-bet endpoint identifiable: NO in the APK; the public-web follow-up identifies `POST /placebet/` statically in remote `mobile.js` without calling it
Android-specific server requirement: UNKNOWN — public client-side app mode is now confirmed as post-load `logalert()` injection, while authenticated backend channel policy remains untested
iOS feasibility: Modified A for client mechanics / D for production authorization — WKWebView can reproduce the evidenced hook, but SMSPariaz must authorize and test the backend channel

# SMSPariaz APK static-analysis final report

## Scope and confidence

This was a static-only analysis of `smspariaz.apk`. The APK was unpacked with unzip/apktool, decompiled with JADX, and checked with Android SDK manifest/signing tools and targeted string/smali searches. No SMSPariaz page, API, account, OTP flow, or wager endpoint was contacted. No real bet was created or submitted.

JADX completed with 32 reconstruction errors in a heavily obfuscated/generic framework. Important findings were therefore cross-checked against apktool smali, decoded resources, and raw DEX strings. The APK analyzed has SHA-256 `89E45BC7710376EF4B6A0354AD32A3AC1F84198FC33370A393F75B86DA60CD72`.

## What the application actually is

`com.web2native.MainActivity.onCreate` creates `R4.C0468k1`, which inflates `R.layout.web_view`, configures the WebView, and hosts it inside Jetpack Compose. `C0468k1.j` is initialized to `https://www.smspariaz.com`, and `U4.AbstractC0534a.y` loads that value.

Evidence:

- Activity construction: `analysis/jadx/sources/com/web2native/MainActivity.java:271-296`, method `onCreate`.
- Main WebView construction/settings: `analysis/jadx/sources/R4/C0468k1.java:232-315`, constructor `C0468k1`.
- Main URL field: `analysis/jadx/sources/R4/C0468k1.java:220-223`.
- URL load: `analysis/jadx/sources/U4/AbstractC0534a.java:3668-3676`, method `y`; smali confirmation at `analysis/apktool/smali/R4/k1.1.smali:187-191`.
- Package and launcher: `analysis/apktool/AndroidManifest.xml:18,24-47`.

There is no bundled SMSPariaz HTML/JavaScript application, `assets/www`, or `index.html`. There is also no Cordova, Capacitor, React Native, Flutter, Xamarin, or Trusted Web Activity payload. The product interface and its wager logic are downloaded from the website at runtime. See `02_architecture.md`.

## Current Android architecture

```text
com.web2native.MainActivity / Jetpack Compose
                    |
                    v
      android.webkit.WebView (Chromium)
      URL: https://www.smspariaz.com
      UA:  SMSPARIAZAPP001
          /                         \
         v                           v
Remote SMSPariaz HTML/JS       WebToNativeInterface
cookies + DOM storage          generic device/UI helpers
         |                     (no bet/OTP/auth method found)
         v
Remote HTTPS request construction and authentication
(not included in the APK)
         |
         v
SMSPariaz backend (not included in the APK)
```

The native bridge is a side capability of the website wrapper, not an observable wager transport. The APK contains no native path of the form `placeBet -> request builder -> SMS API`.

## WebView behavior and channel marker

The main WebView enables JavaScript and DOM storage, accepts first- and third-party cookies, clears cache/history/form data at construction, uses `LOAD_NO_CACHE`, permits file/content access, and sets mixed-content mode to `MIXED_CONTENT_ALWAYS_ALLOW`. Most significantly, it replaces the complete browser user agent with `SMSPARIAZAPP001`.

Evidence: `analysis/jadx/sources/R4/C0468k1.java:255-291`, constructor `C0468k1`; the user-agent assignment is at `:279` and cookie configuration at `:280-288`.

The custom user agent is the only APK-resident SMSPariaz-specific request characteristic beyond the origin. It is a plausible app-channel discriminator for the remote website's “Place Bet by App” behavior, but that is an inference, not proof: the server and current website JavaScript are not in the APK. No initial custom request headers are configured. Generic placeholder/header support exists in `analysis/jadx/sources/K2/a.java:161-198,330-350`, but `analysis/apktool/assets/appConfig.json:1-134` defines no `customHeaders`.

## JavaScript/native bridges

The main WebView registers:

```text
JavaScript name: WebToNativeInterface
Android object:  R4.l3
Registration:    MainActivity.onCreate
```

Evidence: `analysis/jadx/sources/com/web2native/MainActivity.java:404-411`, method `onCreate`.

The bridge exposes generic Web To Native functions for UI, sharing, file handling, device information, analytics helpers, cookies, and optional integrations. Its complete inventory is in `07_js_bridge.md`. No exposed method is named or semantically implements bet, wager, stake, betslip, ticket submission, account balance, login, OTP verification, or an HTTP bet call.

An auxiliary external/login WebView has a separate `RequestInspection` bridge (`Z2.b`) with `recordFetch`, `recordXhr`, and `recordFormSubmission`. It inspects a generic Google `id_token` flow and is not attached to the main SMSPariaz WebView. Evidence: `analysis/jadx/sources/b5/C0702c.java:64-113`; `analysis/jadx/sources/Z2/b.java:20-29,55-71,245-256`; constructor separation in `analysis/apktool/smali/u4/q.1.smali:36-91`.

## “Place Bet by App” result

Static tracing stops at the remote-code boundary:

```text
User sees/clicks remote website control
                |
                v
Remote HTML/JavaScript downloaded at runtime
                |
                v
Unknown remote request construction/auth lookup/API endpoint
                |
                v
Unknown SMSPariaz response and remote UI handling
```

The exact control, JavaScript callback, HTTP method, endpoint, content type, payload, authentication lookup, response schema, and success/failure UI are not present in the APK. The only complete SMSPariaz URL found across DEX, resources, assets, XML/JSON, native libraries, and string tables is `https://www.smspariaz.com`. Evidence: field/load references above and the extraction inventory in `03_endpoints.md`.

Consequently, there is no evidence for `Android.placeBet(...)`, `WebToNativeInterface.placeBet(...)`, or an equivalent native callback. Claiming an endpoint or payload would be a guess. Full negative search and path analysis: `05_place_bet_flow.md`.

## Network, authentication, and registration

SMSPariaz traffic uses Chromium's WebView networking, `CookieManager`, and WebView website storage. OkHttp 4.12.0 is bundled as a generic dependency, while `HttpURLConnection` appears in Firebase Installations and generic download helpers; no native SMSPariaz Retrofit/OkHttp/Volley/Ktor client, base URL, interceptor, bearer token, refresh token, or app API key was found. Evidence: `analysis/jadx/sources/R4/C0468k1.java:255-291`; `analysis/jadx/sources/R4/B2.java:39-48`; `analysis/jadx/sources/R4/C0491q0.java`; detailed dependency evidence in `04_network.md`.

The manifest requests no SMS, phone-number, phone-state, or contacts permission. Native bridge functions named `returnSMSValue`, `registerForSMS`, `setSMSNumber`, and `logoutSMSNumber` are inert compatibility stubs rather than an OTP implementation. A generic `getDeviceInfo()` method can expose model/build/locale/time-zone/app metadata and an app-private UUID, but it does not return a phone number, OTP, IMEI, SSAID, advertising ID, APK signature, or SMSPariaz access token. Evidence: `analysis/jadx/sources/R4/l3.java:959-1031`; UUID generation/storage at `analysis/jadx/sources/R4/V.java:84-101`; full lifecycle analysis in `06_registration.md`.

Therefore the defensible conclusion is: authentication and any OTP exchange happen in remote web content if they are currently used. Cookies/DOM storage are the visible local session mechanisms, but the exact server authentication protocol is unknown.

## Android-specific security requirements

No Play Integrity, SafetyNet, Firebase App Check, Android Keystore attestation, package-signature validation, device-bound key, root/emulator detection, or configured certificate pinning was found. No `networkSecurityConfig` is declared; the manifest permits cleartext and the WebView permits mixed content. Standard library `TrustManager`/OkHttp TLS code is not evidence of app-specific pinning.

Evidence: `analysis/apktool/AndroidManifest.xml:18`; mixed-content setting `analysis/jadx/sources/R4/C0468k1.java:270,287`; complete searches and library interpretation in `08_android_dependencies.md`.

This does **not** prove that the backend accepts iOS. The server may rely on policy, an allowlist, the `SMSPARIAZAPP001` user agent, or behavior not observable in the APK. Android-specific server requirement therefore remains **UNKNOWN**, not “no.”

## Proposed authorized iOS architecture

```text
SwiftUI application shell
          |
          v
WKWebView + persistent WKWebsiteDataStore
authorized iOS-specific channel identifier
          |                         \
          v                          v
SMSPariaz remote HTML/JS      WKScriptMessageHandler
          |                   only documented capabilities
          v                          |
Website HTTPS requests        narrowly scoped Swift layer
          |                          |
          +-----------+--------------+
                      v
     Documented backend contract / URLSession only if required
                      |
                      v
             SMSPariaz backend
```

The correct production design is a WKWebView wrapper first, because that is what the APK evidence supports. `WKScriptMessageHandler` should reproduce only bridge calls that SMSPariaz confirms its site needs. `URLSession` should be added only for a documented, authorized iOS API contract; the missing Android wager endpoint must not be invented. Persistent website cookies belong in `WKWebsiteDataStore.default()`, while native secrets—if the authorized design introduces any—belong in Keychain.

Do not copy `SMSPARIAZAPP001` or fake Android identifiers on iOS. SMSPariaz must define and authorize an iOS-specific channel contract.

## Prototype

`analysis/ios-prototype` contains the requested SwiftUI/WKWebView project and source files. It uses the normal iOS user agent, persistent website storage, navigation controls, a development guard that blocks obvious wager-like clicks and every non-GET form/fetch/XHR/navigation mutation plus every beacon, and metadata-only local logging. This deliberately prevents login and OTP mutations as well as wager submission. `APIClient.submitBet` always throws and cannot submit a wager. It does not bypass login, OTP, TLS, pinning, attestation, or device checks.

Because this workspace is Windows and has no Apple SDK/Swift compiler, the Xcode project was statically validated but not compiled. Its exact safety limits and Xcode instructions are in `analysis/ios-prototype/README.md`.

## Required work for a real, authorized iPhone client

1. Obtain written authorization and a non-production SMSPariaz test environment with no real funds.
2. Obtain the current website/client contract for the “Place Bet by App” flow, including login/OTP behavior, cookie/SameSite requirements, redirects, popups, and payments.
3. Define an iOS-specific channel identifier and backend allowlisting policy instead of impersonating Android.
4. Confirm the remote site works in WKWebView and identify the small subset of native bridge functions it actually calls.
5. If the site cannot perform the authorized action directly, obtain a documented iOS API: endpoint, request schema, authentication, idempotency, error model, and test credentials.
6. Configure Universal Links/custom schemes, Keychain, push capabilities, privacy disclosures, jurisdiction/geofencing controls, age/responsible-gambling requirements, and App Store eligibility as applicable.
7. Compile and test on Apple hardware against the non-production environment, including interrupted OTP, expired sessions, duplicate submissions, network loss, and server rejection. Keep real-wager submission disabled until SMSPariaz explicitly approves production activation.

## Plain-English answer

**Can this Android application realistically be ported to iPhone?**

Yes, the application shell can realistically be ported: it is primarily a WebView wrapper, and SwiftUI plus WKWebView can reproduce that structure. What cannot be established from this APK is whether an iPhone will be authorized to expose and complete “Place Bet by App.” That behavior lives in remote website/backend code, and the Android app supplies a distinctive user agent that may participate in server-side channel selection.

So the realistic answer is **“yes, with SMSPariaz cooperation; not safely or reliably from the APK alone.”** SMSPariaz must provide an authorized iOS channel, a no-funds test environment, and the current web/API authentication contract. No Android security mechanism needs to be bypassed based on the client evidence, and none should be emulated or defeated.

## Report index

- `01_manifest.md` — package, components, permissions, links, network security, signing.
- `02_architecture.md` — framework classification and WebView construction/settings.
- `03_endpoints.md` — complete embedded URL/host inventory and endpoint result.
- `04_network.md` — WebView traffic path and bundled network libraries.
- `05_place_bet_flow.md` — remote-code boundary and negative native-path result.
- `06_registration.md` — OTP, registration, identifiers, and storage.
- `07_js_bridge.md` — every exposed JavaScript bridge method.
- `08_android_dependencies.md` — attestation, pinning, device/security checks.
- `09_ios_feasibility.md` — feasibility classification and component mapping.
