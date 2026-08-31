Does SMSPARIAZAPP001 change website behavior: NO for fresh unauthenticated public GETs; authenticated/backend behavior remains UNKNOWN

How Android app mode is detected:
UA: No public effect observed
Cookie: No app-only cookie observed
LocalStorage: Used for authenticated `loginid`, `phone`, and `token`, not initial mode detection
JS bridge: Not used by downloaded SMSPariaz wager code
Server-side detection: A dormant server-rendered `MOBILE==2` path exists, but every public variant received `MOBILE=0`
Other: YES — Android `WebViewClient.onPageFinished` injects `logalert();`; live `mobile.js` sets `MOBILE=1`

"PLACE BET BY APP" found: YES

Location:
DOM: dynamically created `#mobile-place-bet` and `#placebet` inside `.footer-betslip`
JS file: `https://www.smspariaz.com/js/mobile.js` and `https://www.smspariaz.com/js/site.js?v=1.590`
Function: `site.js:addSelection`, `mobile.js:mobile`, `mobile.js:checklogin`, `mobile.js:placebet`

Does it use WebToNativeInterface: NO in the discovered wager path

Does Android native code submit the wager: NO, based on APK and web analysis

Does remote JavaScript appear to submit it: YES

Observed app-specific endpoints:
- POST `https://www.smspariaz.com/otp/` — statically identified, not called
- POST `https://www.smspariaz.com/confirm/` — statically identified, not called
- POST `https://www.smspariaz.com/checklogin/` — statically identified, not called
- POST `https://www.smspariaz.com/placebet/` — statically identified, not called
- POST `https://www.smspariaz.com/registerremote/` — statically identified, not called
- GET `https://www.smspariaz.com/service/local_json.php` — observed during ordinary page load

Could an authorized WKWebView iOS wrapper support the same web flow: YES technically; production authorization is required

Backend change required: UNKNOWN — client code needs no Android bridge, but server-side channel/UA policy was not exercised

# SMSPariaz final public web analysis

## Executive conclusion

The original UA hypothesis is not the actual client-side switch. The official Android wrapper sends `SMSPARIAZAPP001`, but exact-UA comparisons returned byte-identical first-party HTML, JavaScript, DOM structure, storage-key sets, and network responses. Adding an inert `WebToNativeInterface` also did nothing and produced zero bridge accesses.

The real handoff is visible only when APK and live-web evidence are combined:

```text
U4.C0550q.onPageFinished
    -> evaluateJavascript("logalert();")
    -> public mobile.js logalert()
    -> MOBILE = 1
    -> site.js addSelection() calls mobile()
    -> app login/place-bet control appears
    -> checklogin() POST /checklogin/
    -> placebet() POST /placebet/
```

No POST in that flow was sent. The endpoint and payload were recovered from public JavaScript.

## Evidence that distinguishes UA from the real switch

The strongest browser pair used identical Android client hints (`sec-ch-ua-mobile=?1`, platform Android) and differed only in User-Agent. Both root documents were 34,575 bytes with SHA-256 `05ef33abda93051341afd597ffa784967b17b2970d70b4b43ef6f6f79e27b1bd`; both had `MOBILE=0`, 28 links, the same 27 requests, and the same three first-party script hashes. Evidence: `captures/control_android_hints.har`, `captures/appua_android_hints.har`, and `captures/derived-comparison.json`.

Bridge tests likewise had identical DOM/network output and zero Proxy access events: `captures/normal_bridge.json`, `captures/appua_bridge.json`.

Calling only the APK's real post-load hook changed `MOBILE` to 1 and added app login/register menu links under normal UA, app UA, and app UA plus bridge. Evidence: `captures/native_normal.json`, `captures/native_appua.json`, and `captures/native_appua_bridge.json`.

The native call is at `analysis/jadx/sources/u4/C0550q.java:145-160` (`onPageFinished`, call at `:156`) and is confirmed by `analysis/apktool/smali/U4/q.1.smali:419-423`. The website implementation is `web-analysis/js/mobile.js:17-58`.

## Architecture diagrams

### NORMAL BROWSER

```text
Browser
   |
normal UA, no native post-load hook
   |
SMSPariaz website (MOBILE=0)
   |
ordinary web/SMS mode
   |
site.js still downloads app functions, but app button gate is inactive
```

### ANDROID APP

```text
Android MainActivity / Chromium WebView
   |                    |
   |                    +-- User-Agent: SMSPARIAZAPP001
   |
U4.C0550q.onPageFinished
   |
evaluateJavascript("logalert();")
   |
mobile.js: MOBILE=1
   |
site.js odds click -> addSelection() -> mobile()
   |
loginid + phone + token in website localStorage
   |
POST /checklogin/
   |
POST /placebet/
   |
SMSPariaz backend
```

`WebToNativeInterface` exists in the Android wrapper but is not on this wager path.

### AUTHORIZED IOS DESIGN

```text
SwiftUI + WKWebView
   |
normal/authorized iOS channel (do not spoof Android)
   |
WKNavigationDelegate.didFinish
   |
SMSPariaz-authorized page-mode hook
(current evidenced implementation: logalert())
   |
same remote mobile.js/site.js flow
   |
persistent WKWebsiteDataStore auth state
   |
POST /checklogin/ -> POST /placebet/
   |
SMSPariaz backend
```

No `WKScriptMessageHandler` is required for wager submission. The safe prototype's handler is logging-only.

## Plain-English answers

### 1. Is SMSPARIAZAPP001 the actual switch enabling app mode?

**No, not in the public client behavior tested.** Exact-UA and fixed-client-hint comparisons were identical. The actual client switch is the Android WebView client's post-load call to `logalert()`, which sets `MOBILE=1`. The backend might still inspect the UA during authenticated requests; that remains unknown because those requests were not made.

### 2. Is WebToNativeInterface required for placing a bet?

**No based on the downloaded code.** The site never references it, the inert-bridge variants recorded zero accesses, and `placebet()` uses jQuery directly. The APK does install generic share/print bridge shims, but they are unrelated.

### 3. Is there any other Android-specific signal?

**Yes: native JavaScript injection.** `U4.C0550q.onPageFinished` calls `logalert();`. A server-rendered `MOBILE==2` branch also exists but was inactive (`MOBILE=0`) in every public context. No app-only cookie, query flag, or bridge signal appeared.

### 4. Does “PLACE BET BY APP” come entirely from remote web code?

**The UI, auth lookup, request construction, endpoint call, and response rendering do.** Native Android supplies the one-line app-mode trigger and hosts the browser; it does not submit the wager.

### 5. What exact website JavaScript controls it?

- `site.js:755-785` `addSelection()` creates the betslip and calls `mobile()`.
- `mobile.js:431-444` `mobile()` gates the login/button on `MOBILE==1` and local auth presence.
- `site.js:848-871` `validateStake()` enables the button.
- `mobile.js:320-353` `checklogin()` validates the stored session.
- `mobile.js:463-529` `placebet()` constructs and sends the wager request and renders the result.

### 6. What network endpoint would eventually receive it?

`POST https://www.smspariaz.com/placebet/`, with fields `loginid`, `phone`, `token`, and `message`. It is preceded by `POST /checklogin/`. This was identified statically in public `mobile.js`; neither endpoint was called.

### 7. What is the minimum code required for an iPhone version?

A SwiftUI shell, WKWebView using `WKWebsiteDataStore.default()`, normal/authorized iOS identity, navigation/new-window handling, and a documented post-load app-mode call. The existing hook is `logalert()`. No native wager API client and no betting bridge are required by current client evidence.

### 8. What exactly would SMSPariaz need to change or authorize?

SMSPariaz must authorize WKWebView/iOS use of the app-mode hook, confirm whether `/checklogin/` or `/placebet/` enforces Android UA/session/device policy, and provide a no-funds test environment. Prefer a documented iOS hook/channel rather than copying the legacy Android UA. If the backend currently allowlists `SMSPARIAZAPP001`, it must add an iOS channel such as an agreed `SMSPARIAZIOS001` or another documented mechanism.

## Safety and limitations

The harness made only GET/HEAD/OPTIONS requests generated by ordinary public page loads. It blocked service workers, WebSockets, downloads, and every non-safe browser method before page JavaScript ran. No controls were clicked, no forms filled, and no account/OTP/wager action attempted. HAR credentials and cookie values are redacted or hashed.

Authenticated behavior, server-side UA enforcement, transaction response examples, duplicate protection, and real WKWebView device behavior require an authorized test environment. They are not guessed here.

## Report index

- `01_dom_diff.md`
- `02_network_diff.md`
- `03_javascript_analysis.md`
- `04_channel_detection.md`
- `05_place_bet_web_flow.md`
- `06_bridge_usage.md`
- `07_ios_web_compatibility.md`
- `08_ios_port_plan.md`
