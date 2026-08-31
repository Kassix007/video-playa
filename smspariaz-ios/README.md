# ArnoldPilon — SMSPariaz iOS Expo research prototype

This is an Expo Go-first compatibility prototype for an iPhone 16, developed and launched from Windows. It embeds the public SMSPariaz website in `react-native-webview`, activates the website's discovered app-mode hook, and supports an explicitly authorized no-funds leaderboard QA call with metadata-only lifecycle logging.

This is a technical compatibility and authorized no-funds leaderboard QA prototype, not a production-distributed SMSPariaz iOS betting client. It does not automate login or OTP, bypass backend checks, or create a native wager client.

## Current status

| Item | Value |
|---|---|
| Project created | Yes |
| Expo Go compatible | Yes — pinned to Expo SDK 54, which currently matches App Store Expo Go |
| Windows compatible | Yes |
| Mac required for this prototype | No |
| Main URL | `https://www.smspariaz.com/` |
| WebView library | `react-native-webview` 13.15.0, installed through Expo |
| App-mode trigger | bounded post-load injection of `logalert()` |
| Expected `MOBILE` | `1` |
| Android UA required | No |
| Android bridge required | No for the discovered remote wager path |
| `/placebet/` allowed | **Expo development QA only; automatically blocked in release** |
| `/checklogin/` default | Allowed (`ALLOW_CHECKLOGIN = true`) |
| `/registerremote/` allowed | No |

Expo SDK 57 is the newest stable SDK as of August 2026, but the App Store Expo Go client currently matches SDK 54. This project intentionally uses the current Expo Go-compatible SDK rather than producing a project the installed iPhone client cannot open.

## Architecture

### Discovered Android architecture

```text
Android WebView
    -> page finished
    -> native evaluateJavascript("logalert();")
    -> MOBILE = 1
    -> remote site.js/mobile.js
    -> remote SMSPariaz backend
```

The Android bridge is not used by the discovered wager path. The complete Android UA `SMSPARIAZAPP001` was also not the public client-side app-mode switch. The native shell's important contribution is the post-load JavaScript call.

### Current iOS prototype

```text
Expo React Native in Expo Go
    -> react-native-webview
    -> document-start development request guard
    -> page loaded
    -> bounded injection of logalert()
    -> MOBILE = 1
    -> same remote site.js/mobile.js UI
```

`src/web/injectedAppMode.ts` makes at most five attempts, approximately 400 ms apart, and stops immediately when `MOBILE === 1`. A DOM observer then reports only boolean UI state. It never reads input values.

`src/web/requestGuard.ts` applies these endpoint policies:

- `/placebet/`: allowed only when both React Native `__DEV__` and `ALLOW_PLACEBET_QA` are true. Release/non-QA runtimes block fetch, XHR, beacon, form submission, and top-level navigation;
- `/registerremote/`: always blocked;
- `/checklogin/`: allowed because `ALLOW_CHECKLOGIN` is now `true`, so the remote site can validate an authenticated session. Setting it back to `false` blocks it.

The QA lifecycle log contains only stage (`START`, `COMPLETE`, or `ERROR`), transport, method, `/placebet/` path, and HTTP status. It never records request/response bodies, headers, cookies, login IDs, phone numbers, tokens, OTPs, passwords, authorization values, or bet messages. A native-side navigation policy independently cancels guarded top-level navigation outside development QA.

## Launch from Windows

The project already contains its lockfile. From PowerShell:

```powershell
cd C:\Users\shaan\Desktop\projects\video-playa\smspariaz-ios
node --version
npm install
npx expo start --go
```

Node 22.18.0 was used to create and verify this checkout. Expo SDK 54 requires a supported modern Node version; use a current Node LTS release if setting up another machine.

The terminal displays a QR code. The default connection is LAN mode on port 8081. If Windows Firewall asks about Node.js, allow it on **Private networks** so the iPhone can reach Metro and its live-reload WebSocket on the local network. Public-network access is normally unnecessary.

If LAN discovery is blocked by Wi-Fi isolation, VPN policy, or a restrictive firewall, use Expo's tunnel:

```powershell
npm install --global @expo/ngrok
npx expo start --go --tunnel
```

Tunnel mode needs internet access on both devices and can be slower than LAN mode.

## iPhone 16 steps

1. Install **Expo Go** from the iOS App Store.
2. For LAN mode, connect the iPhone and Windows laptop to the same local network. Temporarily disable a VPN if it blocks LAN discovery.
3. Run `npx expo start --go` in this project on Windows.
4. Open the iPhone Camera app and scan the terminal QR code.
5. Accept the prompt to open the project in Expo Go.
6. Wait while Metro downloads and evaluates the JavaScript bundle.
7. Wait for `smspariaz.com` to load in the embedded browser.
8. Expand DEBUG and confirm `logalert found = YES`, `MOBILE = 1`, and `APP MODE ACTIVE`.

If the QR code opens but Metro cannot connect, stop Expo with `Ctrl+C` and use the tunnel commands above.

## Debug controls

The collapsible DEBUG panel shows only sanitized metadata and booleans:

- URL without query or fragment, page title, and navigation state;
- `logalert` availability, `MOBILE`, and activation attempt;
- presence of `#mobile-place-bet`, `#placebet`, `.footer-betslip`, login, and registration controls;
- existence (never values) of `loginid`, `phone`, and `token` local-storage keys;
- guarded request counts plus QA `/placebet/` request count and last lifecycle event.

Back, Forward, Reload, Home, Re-run App Mode, Neutral Page, and Clear Debug Log are development/navigation controls. There is deliberately no native betting, stake, or submission control.

The Neutral Page action navigates to `about:blank`; Home returns to SMSPariaz. It does not clear cookies or website storage.

## Configuration

Development defaults live in small modules:

- `src/web/requestGuard.ts`: `ALLOW_CHECKLOGIN = true` feeds `REQUEST_GUARD_CONFIG.allowChecklogin`.
- `src/web/requestGuard.ts`: `ALLOW_PLACEBET_QA = true`, additionally gated by `__DEV__`; release builds resolve it to false.
- `src/utils/urls.ts`: `USER_AGENT_MODE = 'DEFAULT_IOS'`.

`ANDROID_RESEARCH` can set `SMSPARIAZAPP001` only while React Native's `__DEV__` flag is true. It is labelled research-only and cannot set that UA in a release bundle. It is unnecessary for app-mode activation and should not be used as a production identity.

Do not invent an iOS production identifier. If SMSPariaz later authorizes iOS, the channel should be modeled explicitly, for example as a default iOS channel or an `authorized(value)` supplied by SMSPariaz.

## Validation

Run all local checks:

```powershell
npm run verify
npx expo install --check
```

The request-guard test uses an isolated fake browser environment. It proves that protected non-QA fetch/XHR/beacon/form calls do not reach their original transports, unrelated calls still pass, `/checklogin/` is allowed, release-like runtime keeps `/placebet/` blocked, and explicit QA mode transmits `/placebet/` while emitting metadata-only start/completion events.

The app-mode test separately proves that a discovered `logalert()` hook yields `MOBILE=1` on the first attempt, only storage-key existence crosses the bridge, query strings are stripped from page metadata, and a missing hook stops after exactly five attempts.

See `TESTING.md` for the on-device checklist. On-device `/placebet/` testing is limited to the SMSPariaz developer-confirmed leaderboard QA account/endpoint that cannot create, settle, or debit a real-money wager.

## Expo Go limitations

- Expo Go owns the native container, so cookie/storage persistence can differ from a standalone app and may be shared with other sessions using the same Expo Go host.
- `react-native-webview` exposes no Expo Go-compatible API for reliably clearing all WKWebView website data. Neutral Page does not clear it. Do not add an unreviewed native clearing module merely for this prototype.
- The developer has confirmed the tested `/placebet/` path is a no-funds leaderboard QA operation. The client-side `__DEV__` gate is still retained so a release build cannot silently inherit the QA allowance.
- App Store signing, entitlements, and a standalone bundle are intentionally outside this first milestone.
- `npm audit` currently reports transitive advisories in the SDK-54 Expo/Metro build toolchain. Its proposed force-fix upgrades Expo to SDK 57, which is incompatible with the current App Store Expo Go client. `expo install --check` and all 18 `expo-doctor` checks pass, so this prototype retains Expo's supported SDK-54 dependency set instead of applying a breaking force-upgrade.

## Future standalone iOS path

A Mac is not required to request a cloud iOS build. After the Expo Go milestone works and SMSPariaz authorizes the channel, the later Windows workflow can use Expo's cloud macOS builders:

```powershell
npm install --global eas-cli
eas login
eas build:configure
eas build --platform ios
```

Standalone installation/signing may require an Apple Developer account depending on the distribution route. Do not start this stage until the Expo Go behavior, server policy, and authorization are confirmed.

## Evidence

The underlying APK/public-web findings are documented in [`../web-analysis/reports/FINAL_WEB_ANALYSIS.md`](../web-analysis/reports/FINAL_WEB_ANALYSIS.md). The public endpoint was identified statically; no wager POST was sent during that research.
