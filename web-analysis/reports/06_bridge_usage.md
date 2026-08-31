# 06 — WebView bridge usage

## Result

The downloaded SMSPariaz HTML, `mobile.js`, and `site.js` contain **zero references** to `WebToNativeInterface`. Runtime variants with an inert bridge recorded **zero property reads, method calls, or `in` checks**.

Evidence:

- Negative search over `js/mobile.js`, `js/site.js`, `html/normal.html`, and `html/appua.html`.
- `captures/normal_bridge.json` and `captures/appua_bridge.json`: `bridgePresent=true`, no `bridgeGet`/`bridgeHas` events.
- `captures/native_appua_bridge.json`: app mode activated by `logalert()`, still no bridge event.

## Observed/native-injected calls

| JS call/capability | Where introduced/called | When | Betting? | Navigation/login? | iOS equivalent |
|---|---|---|---:|---:|---|
| `logalert()` | Android `U4.C0550q.onPageFinished`, JADX `:145-160`; live implementation `js/mobile.js:17-58` | every completed main-WebView page | **Enables app mode**, but not a bridge call | adds app login/register menu | `WKNavigationDelegate.didFinish` + `evaluateJavaScript` under an authorized contract |
| `window.WebToNativeInterface.share(...)` | Generic Android shim installed at `C0550q.java:152` | only if site later calls `navigator.share` | no | no evidence | native `ShareLink`/share sheet or WebKit's supported Web Share behavior |
| `window.WebToNativeInterface.createWebPagePrint()` | Generic Android shim at `C0550q.java:154` | only if site calls `window.print` | no | no | `UIPrintInteractionController`, if authorized/needed |
| Any direct SMSPariaz `WebToNativeInterface.*` call | none found | not observed | no | no | none required |

## Conclusion

`WebToNativeInterface` is **not required for the discovered wager path**. The Android-specific dependency is a native-to-page JavaScript invocation, not a page-to-native bridge invocation.

The wager itself is submitted by jQuery in the page to the remote HTTPS backend. An iOS wrapper does not need a `WKScriptMessageHandler` to place it. A narrow handler is still useful in the research prototype for local, redacted safety logs; it must not implement wager submission.
