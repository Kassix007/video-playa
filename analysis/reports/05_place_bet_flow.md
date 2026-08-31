# 05 — “PLACE BET BY APP” static trace

## Result

**No native place-bet implementation exists in the APK. The place-bet endpoint and payload are not statically identifiable.**

The exhaustive text/binary/code search found no app-specific `PLACE BET`, `PLACE BET BY APP`, `BET BY APP`, `placeBet`, `place_bet`, `submitBet`, `sendBet`, `betSlip`, `betslip`, `wager`, or `stake` symbol. Incidental words such as Material icon names containing `ticket` are unrelated UI-font data.

## Exact APK-side flow

```text
MainActivity.onCreate
    -> constructs R4.C0468k1
    -> creates/configures android.webkit.WebView
    -> sets User-Agent to "SMSPARIAZAPP001"
    -> attaches generic bridge as "WebToNativeInterface"
    -> loads https://www.smspariaz.com
    -> remote website supplies the UI and JavaScript
    -> remote website makes its own WebView/Chromium requests
```

Evidence:

1. `MainActivity.onCreate` creates the data/WebView holder: `analysis/jadx/sources/com/web2native/MainActivity.java:271-296`.
2. `C0468k1.<init>` creates the WebView and sets JavaScript, storage, cookies, clients, and the exact custom UA: `analysis/jadx/sources/R4/C0468k1.java:255-291`.
3. `MainActivity.onCreate` exposes `R4.l3` as `WebToNativeInterface`: `MainActivity.java:404-411`.
4. `C0468k1.j` is initialized to the SMS origin: `R4/C0468k1.java:220-223`.
5. Startup/reload loads that field: `analysis/jadx/sources/U4/AbstractC0534a.java:3668-3676`.

## Bridge finding

There is no equivalent of:

```text
WebToNativeInterface.placeBet(...)
Android.placeBet(...)
```

The full `@JavascriptInterface` inventory in `R4.l3` has no bet, stake, wager, ticket-submission, account, balance, login-to-SMSPariaz, OTP-verification, or HTTP-request method. See `07_js_bridge.md` and source `analysis/jadx/sources/R4/l3.java:124-2173`.

The bridge methods named `login`/`logout` belong to an optional Orufy Connect support widget and are gated by absent `connectData`, not SMSPariaz authentication. Evidence: `R4/l3.java:1187-1214`; `analysis/apktool/assets/appConfig.json:1-134`.

## Strongest supported explanation

The custom UA `SMSPARIAZAPP001` is the only APK value specifically shaped like an app-channel discriminator. It is reasonable to infer that the server or remote website can use this UA to identify the Android app and expose/label “PLACE BET BY APP.” This is an **inference**, not proof of the server implementation. Static APK evidence does not show the server-side check.

If that inference is correct, the detailed flow is:

```text
User opens Android app
    -> WebView sends custom User-Agent
    -> SMSPariaz server returns app-aware web UI
    -> user presses a remote DOM control
    -> remote JavaScript constructs request and reads web session state
    -> Chromium sends request with WebView cookies/storage-derived values
    -> remote JavaScript renders success/failure
```

The APK contains only the first two client-side steps. It does not contain the remote DOM handler, request builder, endpoint, authentication lookup, or response handler.

## Why an exact endpoint cannot be reported

- No SMSPariaz JavaScript bundle or `index.html` is bundled.
- Only the origin, not an API path, is embedded.
- Main-WebView requests are not reproduced by a native OkHttp/Retrofit client.
- The `RequestInspection` bridge belongs to an auxiliary external/login WebView and is not attached to the main SMS WebView.
- Static analysis was intentionally not supplemented with live browsing, interception, login, or bet submission.

An exact endpoint could only be established from authorized server documentation/source or a later authorized test environment using a non-production/test account and passive WebView/network observation. No security control would need to be bypassed, but that is outside the authorized static-only scope of this run.

## Required classification fields

| Question | Answer |
|---|---|
| UI action present in APK? | No; it is remote web content. |
| Native callback identified? | No bet-specific callback. |
| Bridge name | `WebToNativeInterface`, generic only. |
| Native bet request construction | None. |
| Native auth/token lookup for a bet | None. |
| SMSPariaz API endpoint | Not identifiable. |
| HTTP method/payload | Not identifiable. |
| Success/failure handler | Remote web JavaScript; not in APK. |

