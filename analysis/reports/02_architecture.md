# 02 — Application architecture

## Classification

This is a **native Android WebView wrapper built with Kotlin/Java and Jetpack Compose around Web To Native framework code**.

It is not a Trusted Web Activity and contains no evidence of Cordova, Capacitor, React Native, Flutter, Xamarin, or a bundled `assets/www`/`index.html` application. The only native libraries are four ABI builds of `libandroidx.graphics.path.so`; there is no `libflutter.so`, React Native bundle, Cordova assets, or Capacitor configuration.

The APK is therefore native in implementation but web-hosted in product behavior: the SMSPariaz interface and betting logic are downloaded from the live website at runtime.

## Main interface construction

1. `com.web2native.MainActivity.onCreate` creates `R4.C0468k1`. Evidence: `analysis/jadx/sources/com/web2native/MainActivity.java:271-296`.
2. `R4.C0468k1.<init>` inflates `R.layout.web_view`, finds `R.id.webView`, and configures it. Evidence: `analysis/jadx/sources/R4/C0468k1.java:232-315`.
3. The WebView is hosted in the activity's Jetpack Compose content. Evidence: `MainActivity.java:538-560`; `C0468k1.java:307-313`.
4. Startup/reload code loads `C0468k1.j`; its default is `https://www.smspariaz.com`. Evidence: `C0468k1.java:220-223`; `analysis/jadx/sources/U4/AbstractC0534a.java:3668-3676`; smali confirmation `analysis/apktool/smali/R4/k1.1.smali:187-191`.

An auxiliary WebView used for external/login pages is created in `b5.C0702c.invokeSuspend` from `R.id.exturls_webview`. Evidence: `analysis/jadx/sources/b5/C0702c.java:64-113`.

## Main WebView settings

| Setting | Value | Evidence |
|---|---|---|
| Initial URL | `https://www.smspariaz.com` | `R4/C0468k1.java:223`; `U4/AbstractC0534a.java:3668-3676` |
| JavaScript | enabled | `R4/C0468k1.java:259-262` |
| DOM storage/localStorage | enabled | `R4/C0468k1.java:261-262` |
| Content/file access | enabled | `R4/C0468k1.java:263-264` |
| JS window opening | enabled | `R4/C0468k1.java:265,289` |
| Cache | cleared at construction; `LOAD_NO_CACHE` (`2`) | `R4/C0468k1.java:266-269` |
| History/form data | cleared at construction | `R4/C0468k1.java:267-268` |
| Mixed content | always allowed (`0`) | `R4/C0468k1.java:270,287` |
| Media playback gesture | not required | `R4/C0468k1.java:271-274` |
| Multiple windows | disabled | `R4/C0468k1.java:289-290` |
| User agent | **`SMSPARIAZAPP001`** | `R4/C0468k1.java:279` |
| First-party cookies | accepted | `R4/C0468k1.java:280-286` |
| Third-party cookies | accepted | `R4/C0468k1.java:287-288` |
| Explicit cookie persistence | `CookieManager.flush()` via bridge | `R4/l3.java:410-416` |
| WebViewClient | `U4.C0550q` discriminator/case 2 | `R4/C0468k1.java:275-277`; smali `apktool/smali/u4/q.1.smali:36-57` |
| WebChromeClient | `U4.r` | `R4/C0468k1.java:275-278` |

No initial custom request headers are applied. Generic framework code can load a URL with a `customHeaders` map, but `appConfig.json` defines no such map. Evidence: `analysis/jadx/sources/K2/a.java:161-198`; `analysis/jadx/sources/Y4/AbstractC1918b.java:1276-1300`; `analysis/apktool/assets/appConfig.json:1-134`.

## JavaScript bridges

The main WebView receives one bridge:

```text
JavaScript name: WebToNativeInterface
Android object: R4.l3
Registration: MainActivity.onCreate
```

Evidence: `analysis/jadx/sources/com/web2native/MainActivity.java:404-411`.

It is a large generic Web To Native bridge for device information, UI, sharing, printing, optional social login, analytics, and disabled add-ons. It contains **no bet, wager, stake, betslip, ticket-submission, account, balance, or OTP verification method**. Full inventory: `07_js_bridge.md`.

An auxiliary external/login WebView receives `RequestInspection` (`Z2.b`) with `recordFetch`, `recordXhr`, and `recordFormSubmission`. It is attached only by the `C0550q(WebView, C0468k1)` constructor used in `b5.C0702c`, not by the main WebView's `C0550q(C0468k1, C1190b)` constructor. Evidence: `analysis/jadx/sources/Z2/b.java:20-29,55-71,245-256`; `b5/C0702c.java:69-99`; smali `analysis/apktool/smali/u4/q.1.smali:36-91`.

## URL handling

`U4.C0550q.shouldOverrideUrlLoading` handles ordinary internal navigation and special schemes including `sms:`, `tel:`, `mailto:`, WhatsApp, `intent://`, and `w2n://`. Evidence references in `analysis/jadx/sources/U4/C0550q.java:425-1119` (JADX did not fully reconstruct this method; corroborating literals are in `analysis/apktool/smali/u4/q.1.smali`).

Routing rules come from `assets/appConfig.json:21-78`:

- non-web links and Facebook/Twitter/Instagram/Maps/LinkedIn/WhatsApp links are external;
- every other URL is internal.

Deep-link intent handling can load a supplied HTTP(S) URL or URI directly into the main WebView, with special handling for WhatsApp and `w2n` transformations. Evidence: `analysis/jadx/sources/l6/d.java:2201-2271`.

## Consequence for static analysis

There is no local SMSPariaz HTML/JavaScript application to inspect. The APK fixes the origin and custom user agent, then delegates product behavior to the current remote site. Static analysis can identify the wrapper behavior but cannot identify remote JavaScript, current API paths, HTTP methods, wager payloads, or server response handling.

