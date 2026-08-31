# 04 — Network stack

## SMSPariaz traffic path

SMSPariaz traffic is issued by Android's Chromium-backed `android.webkit.WebView`. The APK does not contain an SMSPariaz Retrofit/OkHttp/Volley API client.

```text
Remote SMSPariaz HTML/JavaScript
    -> android.webkit.WebView / Chromium
    -> CookieManager + WebView DOM storage
    -> remote HTTPS endpoints not embedded in the APK
```

Evidence for WebView construction and loading: `analysis/jadx/sources/R4/C0468k1.java:255-291`; `analysis/jadx/sources/U4/AbstractC0534a.java:3668-3676`.

## Main request characteristics

| Property | Static result |
|---|---|
| Base web URL | `https://www.smspariaz.com` |
| User-Agent | Replaced completely with `SMSPARIAZAPP001` (`C0468k1.java:279`) |
| Initial custom headers | None |
| First-party cookies | Enabled |
| Third-party cookies | Enabled |
| Cookie flush | Exposed as `WebToNativeInterface.forceUpdateCookies()` |
| DOM/local storage | Enabled |
| Cache | `LOAD_NO_CACHE` and cleared at WebView creation |
| Content-Type / encoding | Determined by remote website code; absent from APK |
| SMS auth header/access token/refresh token | Not present in APK |
| SMS API key | Not present in APK |
| Device/app-version headers | Generic framework supports configurable headers, but this app config defines none |

Generic routing code can synthesize custom headers from configured placeholders such as `DEVICE_ID`, `OS_TYPE`, and app fields. `DEVICE_ID` maps to `Settings.Secure.ANDROID_ID` in `analysis/jadx/sources/K2/a.java:330-350`. However, `analysis/apktool/assets/appConfig.json:1-134` contains no `customHeaders`, so there is no evidence that this capability is active for SMSPariaz.

## Embedded libraries

| Library/stack | Presence | SMSPariaz role |
|---|---|---|
| Android WebView/Chromium | yes | Main website and all observable SMS traffic |
| OkHttp 4.12.0 | bundled | Generic dependency; DEX string `okhttp/4.12.0`. No SMS base URL, interceptor, or API client references it. |
| `HttpURLConnection` / `URLConnection` | yes | Firebase Installations plus generic file/blob download helpers (`R4.B2`, `R4.C0491q0`). |
| Firebase Installations 18.0.0 | bundled | Firebase SDK registration only; not shown feeding SMS auth. |
| Retrofit | no evidence | None. |
| Volley | no evidence | None. |
| Ktor | no evidence | None. |
| Fuel | no evidence | None. |
| Apache HTTP client | no evidence | None. |

The two generic URLConnection helpers are evidence at `analysis/jadx/sources/R4/B2.java:39-48` and `analysis/jadx/sources/R4/C0491q0.java:47-58`. The latter can copy a cookie and a value named `userAgent` while fetching a resource; it is used by generic blob/file logic, not a wager API.

## Request inspection code is not the main SMS client

`Z2.b` and the case-1 `U4.C0550q` inject wrappers around forms, XHR, and `fetch` to observe a Google-login/external WebView and extract an `id_token`. The main WebView uses the case-2 constructor, which does not attach `RequestInspection` and does not inject those wrappers.

Evidence:

- constructor discriminators: `analysis/apktool/smali/u4/q.1.smali:17-91`;
- external WebView use: `analysis/jadx/sources/b5/C0702c.java:69-105`;
- injected instrumentation: `analysis/jadx/sources/U4/C0550q.java:167-180`;
- `id_token` handling: `U4/C0550q.java:293-386`; callback only: `analysis/jadx/sources/Z2/d.java:58-82`.

This code records request metadata but returns `null` from `shouldInterceptRequest`, allowing WebView networking to proceed. It is not a native API submission path.

## Embedded service configuration

The APK contains Firebase/Google configuration (`google_app_id`, `google_api_key`, project `alpha-af0d2`), a Facebook app ID/client token, and an Orufy client ID in `analysis/apktool/res/values/strings.xml:78-86,140-146`. These are SDK/client configuration values. No evidence links them to SMSPariaz authentication or bet submission. Firebase analytics collection is explicitly disabled in the manifest (`analysis/apktool/AndroidManifest.xml:19`).

## What cannot be determined statically

Because the HTML/JavaScript is remote, the following are unknown: current SMS API host/path, method, request JSON/form schema, auth cookie names, bearer-token format, refresh behavior, idempotency controls, response schema, and error mapping. Inferring any of these would be guessing.

