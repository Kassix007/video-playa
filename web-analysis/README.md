# SMSPariaz public web-channel analysis

This workspace compares fresh, unauthenticated page loads of `https://www.smspariaz.com` under a controlled browser matrix:

1. normal Android mobile user agent;
2. exact `SMSPARIAZAPP001` user agent;
3. normal Android UA plus an inert `WebToNativeInterface` object;
4. exact app UA plus the inert bridge;
5. a strongest-pair repeat with identical Android client hints and only the complete UA changed;
6. the APK's real post-load `logalert()` call under normal/app/bridge variants;
7. public `/mobile/` and `/login/` pages; and
8. iPhone Safari-like Chromium plus Playwright WebKit.

Safety controls are active before page JavaScript runs. Browser-level routing blocks every method except GET, HEAD, and OPTIONS, blocks WebSockets, blocks service workers, and prevents downloads. Page-level hooks independently block non-safe fetch/XHR/form/beacon operations and record metadata only. No login, OTP, account, betslip, or betting control is clicked.

Cookie values and sensitive headers/query values are hashed or redacted. HAR files omit response bodies; public DOM and first-party JavaScript are saved separately for comparison.

Run from the repository root with:

```powershell
node web-analysis/scripts/capture.mjs
```

The harness uses Playwright from the installed gstack browser tooling. Set `PLAYWRIGHT_MODULE` to another Playwright package directory if needed.

Derived comparisons are produced by `scripts/derive-evidence.mjs`. Run the non-networked integrity check with:

```powershell
node web-analysis/scripts/verify-artifacts.mjs
```

The consolidated result is `reports/FINAL_WEB_ANALYSIS.md`; reports `01` through `08` contain the supporting DOM, network, JavaScript, detection, bridge, wager-flow, WebKit, and iOS-port evidence.
