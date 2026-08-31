# 04 — App-channel detection

## Test matrix

All variants used fresh cookies/storage and the same public root page. “Bridge” means an inert `window.WebToNativeInterface` Proxy whose properties return `undefined` and whose accesses are logged.

| Variant | UA | Inert bridge | APK `logalert()` reproduced | Resulting `MOBILE` | Bridge accesses | Root requests | App-menu effect |
|---|---|---:|---:|---:|---:|---:|---|
| `normal` | normal Android | no | no | 0 | 0 | 27 | none |
| `appua` | exact app UA | no | no | 0 | 0 | 27 | none |
| `normal_bridge` | normal Android | yes | no | 0 | 0 | 27 | none |
| `appua_bridge` | exact app UA | yes | no | 0 | 0 | 27 | none |
| `native_normal` | normal Android | no | yes | 1 | 0 | 27 | Login/Create Account/app Football links added |
| `native_appua` | exact app UA | no | yes | 1 | 0 | 27 | same |
| `native_appua_bridge` | exact app UA | yes | yes | 1 | 0 | 27 | same |

Evidence: the corresponding JSON files in `captures/` and `captures/derived-comparison.json`.

## Exact detection mechanism

The official Android main WebView uses `U4.C0550q` case/discriminator 2. In `onPageFinished`, after installing generic share/print shims, it executes:

```java
view.evaluateJavascript("logalert();", null);
```

Evidence: `analysis/jadx/sources/u4/C0550q.java:145-160`, particularly line 156; smali `analysis/apktool/smali/U4/q.1.smali:419-423`. Main-WebView client assignment remains evidenced by `analysis/jadx/sources/R4/C0468k1.java:275-277`.

The live site's `js/mobile.js:17-20` defines:

```javascript
function logalert(){
    MOBILE = 1;
    // ...add app menu items...
}
```

This call is sufficient to enter the client-side app mode under either UA and without `WebToNativeInterface`.

## Required-signal conclusion

| Possible signal | Evidence-based result |
|---|---|
| UA only | **No for fresh public pages.** Exact app UA with fixed Android hints produced byte-identical first-party content and `MOBILE=0`. |
| Bridge only | **No.** Inert bridge caused no DOM/network change and had zero property accesses. |
| UA + bridge | **No for fresh public pages.** Same result as control. |
| Cookie flag | No public app-only cookie observed. A random `PHPSESSID` exists in every context. |
| localStorage flag | Login state uses `loginid`, `phone`, and `token`, but none existed while logged out. This is authentication state, not initial channel detection. |
| query parameter | None in the root navigation and none used by the channel code. |
| server-rendered flag | A dormant `MOBILE==2` branch exists in HTML, but all public variants received `MOBILE=0`; how/if the server ever emits `2` is unknown. |
| **Other: native injection** | **Yes.** Android `onPageFinished` invokes `logalert()`, which sets `MOBILE=1`. |

`SMSPARIAZAPP001` may be a legacy marker, telemetry value, or an unobserved backend check during authenticated POSTs. The public GET evidence does not show it enabling app mode. No authenticated request was attempted, so backend UA enforcement remains unknown.
