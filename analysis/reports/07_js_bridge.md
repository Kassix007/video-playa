# 07 — JavaScript/native bridges

## Main bridge

| Property | Value |
|---|---|
| JavaScript name | `WebToNativeInterface` |
| Android class | `R4.l3` |
| Registration | `webView.addJavascriptInterface(l3Var, "WebToNativeInterface")` |
| Registration evidence | `analysis/jadx/sources/com/web2native/MainActivity.java:404-411` |
| Constructor/effect configuration | `analysis/jadx/sources/R4/l3.java:94-108` |
| Native-to-JS callback | JSON is routed toward `window.WebToNativeInterface.androidCBHook(...)`; `analysis/jadx/sources/E1/n.java:84-100` |

The bridge is attached to the main WebView for all pages it loads. It is a generic Web To Native framework bridge. **No method name or body is specific to placing a bet.**

### Exposed method inventory, part 1

“Disabled/no-op” means the method is exposed but its body is empty, only touches an uninitialized feature placeholder, or is gated by a feature absent/disabled in `assets/appConfig.json`. Return values are `void` unless the signature says otherwise.

| Source line | Exact signature | Static behavior in this build |
|---:|---|---|
| 125 | `addEventToAppsFlyer(String, String)` | AppsFlyer placeholder only; no AppsFlyer client/action configured. |
| 131 | `addFbEvents(String, String)` | Facebook-event placeholder; no action in body. |
| 137 | `addFbPurchaseEvent(String, String, String)` | Facebook purchase placeholder; no action in body. |
| 143 | `askBluetoothPermission()` | Bluetooth feature placeholder; config absent. |
| 159 | `biometricAuthWithDismissOnCancel(String)` | Parses prompt/options and enters biometric helper; `biometricAuth.enable=false`, so not an SMS flow. |
| 185 | `callBiometric(String)` | Generic biometric prompt; feature disabled. |
| 192 | `checkBiometricStatus()` | Generic biometric status callback; feature disabled. |
| 198 | `checkIfAppUpdateAvailable()` | Generic Play Core update check/callback. |
| 215 | `checkPermission(String)` | Parses generic permission names and returns status JSON. |
| 260 | `clearWebViewCache(String)` | Clears WebView cache/state according to the supplied option. |
| 281 | `closeApp()` | Finishes/removes the app task. |
| 291 | `createWebPagePrint()` | Starts Android WebView printing on the UI thread. |
| 299 | `customBackHandling(String)` | Updates generic custom-back handling state; config says disabled. |
| 308 | `deleteAppData(String)` | Native-data-store placeholder; `nativeDataStore` is absent, so no effect. |
| 318 | `deleteCloudData(String)` | Native/cloud-data placeholder; no configured store. |
| 328 | `deleteSecret()` | Generic biometric-secret helper; feature disabled. |
| 335 | `doneVoiceSearch(JSONObject)` | Sends voice-search result through the generic callback path. |
| 342 | `downloadFile(String)` | Parses generic download JSON and dispatches file-download handling. No SMS endpoint is constructed. |
| 387 | `enableSwipeRefresh(boolean)` | Updates generic swipe-refresh state. |
| 396 | `firstCallWhenAppStarted()` | Returns `{type, result}` indicating whether this is the first bridge call. |
| 411 | `forceUpdateCookies()` | Calls `CookieManager.flush()`. |
| 422 | `getAddOnStatus(String)` | Returns status for generic add-ons/permissions (including an `AUTO_READ_SMS` label); does not register or verify SMS. |
| 594 | `getAll()` | Initializes generic permission/status helper. |
| 602 | `getAndroidVersion() -> int` | Returns `Build.VERSION.SDK_INT`, or `1` after exception. |
| 613 | `getAppData(String)` | Native-data-store placeholder; no configured store. |
| 623 | `getBase64FromBlobData(String)` | Generic blob/data-URL decoding and download/share support; JADX could not fully reconstruct body. |
| 950 | `getCloudData(String)` | Cloud/native-data placeholder; no configured store. |
| 960 | `getDeviceInfo()` | Returns app/platform/OS/model/fingerprint/timezone/version/install-source/operator/random installation UUID JSON. |
| 1036 | `getOneSignalId()` | No-op; OneSignal client is not present/configured. |
| 1042 | `getPermissionStatus()` | Initializes generic permission/status helper. |
| 1050 | `getRegistrationToken()` | UI-thread runnable only reads an empty feature placeholder; no token is returned. |
| 1056 | `getText()` | Reads clipboard text and sends generic callback JSON. |
| 1083 | `hideFloatingButton()` | Hides generic floating action UI when present. |
| 1092 | `hideLoader()` | Hides navigation loader state. |
| 1098 | `hideSplashScreen()` | Hides/removes wrapper splash UI. |
| 1111 | `initBeaconData(String)` | Beacon placeholder; config absent. |
| 1119 | `isLocationServiceEnabled()` | Reports Android location-service enabled state; no location permission is declared. |
| 1133 | `keepScreenNormal()` | Clears keep-screen-on behavior. |
| 1141 | `keepScreenOn()` | Enables keep-screen-on behavior. |
| 1149 | `logFirebaseEvent(String, String)` | Parses parameters and invokes Firebase Analytics; collection is disabled in manifest. |
| 1171 | `logFirebaseScreenView(String, String)` | Invokes Firebase Analytics screen-view API; collection disabled. |
| 1188 | `login(String)` | Orufy Connect support-widget login, gated by absent `connectData`; not SMSPariaz login. |
| 1200 | `loginWithFacebook()` | Facebook placeholder; no action. |
| 1206 | `logout()` | Orufy Connect logout, gated by absent `connectData`; not SMS logout. |
| 1218 | `logoutWithFacebook()` | Facebook placeholder; no action. |
| 1224 | `makeTapToPayStripePayment(String)` | Stripe/Tap-to-Pay generic hook; Stripe config absent. |
| 1242 | `nfcSupported()` | Reports NFC adapter availability in JSON. |
| 1262 | `openAppSettingForPermission(String)` | Opens relevant Android app/settings screen. |
| 1272 | `openShareIntent(String)` | Parses share data and opens Android share UI. |
| 1282 | `openUrlInBrowser(String)` | Opens supplied URL in an external browser intent. |
| 1288 | `openVoiceSearch()` | Starts Android speech recognition when available. |
| 1344 | `optInOneSignalPermissionDialog()` | OneSignal placeholder/no-op. |
| 1350 | `optOutOneSignalPermissionDialog()` | OneSignal placeholder/no-op. |
| 1356 | `pairWithDevice(String)` | Bluetooth placeholder; feature absent. |
| 1366 | `pickDateTime(String)` | Parses picker JSON, shows native date/time UI, and returns callback JSON. |
| 1457 | `print(String)` | Parses generic print request and dispatches print/download handling. |
| 1484 | `registerNotification()` | Requests/records generic notification permission state; no SMS auth token. |
| 1503 | `reload()` | Posts a main-WebView reload. |
| 1511 | `removeExternalUserId()` | OneSignal/external-user placeholder; no-op. |
| 1517 | `removeFullScreenMode()` | Leaves full-screen mode on UI thread. |
| 1523 | `requestNotificationPermission()` | Requests Android notification permission on UI thread. |
| 1529 | `returnSMSValue(String)` | Empty body; no SMS processing. |
| 1535 | `saveSecret(String)` | Generic biometric-secret helper; biometric feature disabled. |
| 1542 | `sendBarcodeValue(String)` | Returns barcode result through generic callback JSON. |
| 1555 | `setAppData(String)` | Native-data-store placeholder; feature absent. |
| 1565 | `setAppsFlyerUserId(String)` | AppsFlyer placeholder; no action. |
| 1571 | `setCloudData(String)` | Cloud/native-data placeholder; feature absent. |
| 1581 | `setExternalUserId(String)` | OneSignal/external-user placeholder; no action. |

Evidence for every signature/body above is `analysis/jadx/sources/R4/l3.java` at the listed line. Configuration evidence is `analysis/apktool/assets/appConfig.json:1-134`; its only enabled product option is `offerCard`.

### Exposed method inventory, part 2

| Source line | Exact signature | Static behavior in this build |
|---:|---|---|
| 1587 | `setFirebaseAnalyticsCollection(String)` | Parses boolean and enables/disables Firebase collection at runtime. Manifest default is disabled. |
| 1603 | `setFirebaseDefaultParam(String)` | Parses JSON into Firebase default event parameters. |
| 1624 | `setFirebaseUserId(String)` | Sets Firebase Analytics user ID if analytics instance exists. |
| 1635 | `setFirebaseUserProp(String, String)` | Sets Firebase Analytics user property. |
| 1652 | `setFullScreenMode()` | Enters full-screen mode. |
| 1658 | `setOrientation(String)` | Maps string to Android requested orientation. |
| 1687 | `setPrintSize(String)` | Parses and stores print-size preferences. |
| 1712 | `setText(String)` | Writes supplied text to clipboard and returns result. |
| 1736 | `setUser(String)` | Orufy Connect user helper, gated by absent connect config. |
| 1748 | `setUserTags(String)` | OneSignal/user-tag placeholder; no action. |
| 1754 | `share(String)` | Generic Web Share API adapter. |
| 1760 | `shareFile(String, String)` | Generic file-sharing adapter. |
| 1772 | `showBannerAd(String)` | Ad placeholder; no configured ad data. |
| 1781 | `showFloatingButton()` | Shows configured floating UI; no floating button config. |
| 1790 | `showFullScreenAd(String)` | Ad placeholder; no configured ad data. |
| 1799 | `showHideStickyFooter(boolean)` | Toggles sticky footer; config has `enable=false`. |
| 1810 | `showInAppReview()` | Starts Play Core in-app review flow. |
| 1878 | `showOfferCard(String)` | Parses and displays generic offer card; `offerCard.enabled=true`. |
| 1908 | `showPermission(String)` | Generic permission rationale/request UI. |
| 1928 | `showRewardsAd(String)` | Reward-ad placeholder; no configured ad data. |
| 1937 | `signInWithGoogle()` | Generic Google sign-in/GSI path; Google social-login config absent. |
| 1955 | `signOutWithGoogle()` | Generic Google sign-out path; config absent. |
| 1973 | `startBackgroundService()` | Generic background-service hook; no app-specific worker/payload. |
| 1979 | `startBluetoothScan()` | Bluetooth placeholder; feature absent. |
| 1988 | `statusBar(String)` | Parses and applies status-bar appearance. |
| 1994 | `subscribeToTopic(String)` | Push-topic placeholder; no Firebase Messaging/OneSignal implementation linked here. |
| 2000 | `systemNavBarColorFun(String)` | Parses and applies system navigation-bar color/appearance. |
| 2019 | `unpairDevice(String)` | Bluetooth placeholder; feature absent. |
| 2029 | `unsubscribeFromTopic(String)` | Push-topic placeholder; no linked implementation. |
| 2035 | `updateAppIcon(String)` | Multiple-app-icon placeholder; config absent. |
| 2041 | `updateApplication(String)` | Generic Play Core app-update flow. |
| 2067 | `webShareWrapper(String)` | Passes Web Share JSON into the generic share adapter. |
| 2072 | `getPlayerStatus()` | Empty stub. |
| 2076 | `getTriggers()` | Empty stub. |
| 2080 | `pausePlaying()` | Empty stub. |
| 2084 | `playNext()` | Empty stub. |
| 2088 | `playPrevious()` | Empty stub. |
| 2092 | `registerForSMS()` | Empty stub. |
| 2096 | `stopBackgroundService()` | Empty stub. |
| 2100 | `stopPlaying()` | Empty stub. |
| 2104 | `stopTrackingLocation()` | Empty stub. |
| 2108 | `addToPlayList(String)` | Empty stub. |
| 2112 | `addTrigger(String)` | Empty stub. |
| 2116 | `addTriggers(String)` | Empty stub. |
| 2120 | `checkPackageName(String)` | Empty stub. |
| 2124 | `getAllPurchases(String)` | Empty stub. |
| 2128 | `getTriggerValueForKey(String)` | Empty stub. |
| 2132 | `inAppPurchase(String)` | Empty stub. |
| 2136 | `logoutEmail(String)` | Empty stub. |
| 2140 | `logoutSMSNumber(String)` | Empty stub. |
| 2144 | `playMedia(String)` | Empty stub. |
| 2148 | `removeTriggerForKey(String)` | Empty stub. |
| 2152 | `removeTriggersForKeys(String)` | Empty stub. |
| 2156 | `seekTo(String)` | Empty stub. |
| 2160 | `setEmail(String)` | Empty stub. |
| 2164 | `setSMSNumber(String)` | Empty stub. |
| 2168 | `startScanner(String)` | Empty stub. |
| 2172 | `startTrackingLocation(String)` | Empty stub. |

The contiguous empty-stub bodies are directly visible at `analysis/jadx/sources/R4/l3.java:2071-2174`.

## Auxiliary `RequestInspection` bridge

| Property | Value |
|---|---|
| JavaScript name | `RequestInspection` |
| Android class | `Z2.b` |
| Attached to | auxiliary `exturls_webview`, not the main SMS WebView |
| Constructor evidence | `analysis/jadx/sources/Z2/b.java:20-29`; `analysis/jadx/sources/b5/C0702c.java:69-99` |

| Source line | Signature | Behavior |
|---:|---|---|
| 56 | `recordFetch(String url, String method, String body, String headers, String trace)` | Stores JavaScript fetch metadata in an in-memory list. |
| 71 | `recordFormSubmission(String url, String method, String formParameterList, String headers, String trace, String encoding)` | Reconstructs generic form metadata/body and stores it in memory. |
| 246 | `recordXhr(String url, String method, String body, String headers, String trace)` | Stores XHR metadata in memory. |

The auxiliary WebViewClient injects wrappers for forms/XHR/fetch at `analysis/jadx/sources/U4/C0550q.java:167-180` and inspects the in-memory metadata at `:293-386`, specifically looking for an `id_token` used by a Google credential callback. It returns `null`, so it observes rather than submits requests.

## Bet/OTP relevance

- No exposed bridge method places, constructs, validates, or submits a wager.
- No exposed bridge method queries an SMSPariaz account or balance.
- SMS-number methods are empty generic stubs.
- The remote website might call generic methods such as `getDeviceInfo`, but the APK contains no remote JavaScript proving that it does.

