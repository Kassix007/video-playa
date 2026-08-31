# 06 — OTP, phone registration, identity, and storage

## Result

There is **no native SMSPariaz phone-registration or OTP workflow in the APK**. Registration/login/OTP UI and network requests, if present, are part of the remote website.

## Evidence against a native SMS/OTP flow

- The manifest does not request `READ_SMS`, `RECEIVE_SMS`, `SEND_SMS`, `READ_PHONE_STATE`, or `READ_PHONE_NUMBERS`. See `analysis/apktool/AndroidManifest.xml:3-17`.
- The resource string `send_otp` at `analysis/apktool/res/values/strings.xml:155` has no code reference other than generated `R.java`; it is an unused/generic leftover.
- `WebToNativeInterface.returnSMSValue(String)` has an empty body after its null check. Evidence: `analysis/jadx/sources/R4/l3.java:1528-1531`.
- `registerForSMS()`, `logoutSMSNumber(String)`, and `setSMSNumber(String)` are empty stub methods. Evidence: `R4/l3.java:2091-2094,2139-2141,2163-2165`.
- No SMSPariaz register/verify/activation endpoint is embedded.

## What device information the generic bridge can expose

If remote JavaScript explicitly calls `WebToNativeInterface.getDeviceInfo()`, the bridge returns a JSON object through the generic callback hook containing:

| Field | Source |
|---|---|
| `appId` | package name |
| `platform` | literal `android` |
| `language` | default locale |
| `os` / `osVersion` | Android / release version |
| `model` | manufacturer + model |
| `hardware` | `Build.FINGERPRINT` |
| `timeZone` | default time zone |
| `appVersion` / `appVersionCode` | package metadata |
| `installationType` | debug, adhoc, or installer package |
| `operator` | network operator name, when available |
| `installationId` | random UUID persisted in the app-private `INSTALLATION` file |

Evidence: `analysis/jadx/sources/R4/l3.java:959-1031`. UUID creation/persistence is in `analysis/jadx/sources/R4/V.java:84-101`.

This method does **not** collect or return a phone number, OTP, IMEI, IMSI, SSAID, advertising ID, Firebase token, or APK-signature fingerprint.

## Android ID capability versus active configuration

Generic custom-header code supports a placeholder named `DEVICE_ID` and resolves it to `Settings.Secure.ANDROID_ID`. Evidence: `analysis/jadx/sources/K2/a.java:330-350`. The supplied `appConfig.json` has no `customHeaders` section, so static evidence does not show Android ID being added to SMSPariaz requests.

Similarly, Google Ads Identifier classes/permissions are bundled through Firebase/Play services, but no SMSPariaz bridge or API client reads that ID for registration. Firebase analytics collection is disabled in the manifest.

## Token and credential storage

| Storage | Present | Relevant static finding |
|---|---:|---|
| WebView cookies | yes | Accepted, including third-party cookies; `CookieManager.flush()` exposed. Most plausible container for website login state, but cookie names/content are remote and unknown. |
| WebView DOM/local storage | yes | `setDomStorageEnabled(true)`; remote site controls keys/content. |
| SharedPreferences | yes | Generic bridge/activity preferences (for example print settings). No SMS credential/token key identified. |
| App-private files | yes | Generated `INSTALLATION` UUID if `getDeviceInfo()` is called. |
| Native data store | framework capability | `nativeDataStore` is absent from app config, so `get/set/deleteAppData` are effectively disabled in this build. |
| Biometric secret storage | framework capability | `biometricAuth.enable` is `false`; no evidence it stores SMS credentials. |
| EncryptedSharedPreferences | no evidence | Not bundled/used for SMS auth. |
| Android Keystore | no app-specific use | No device-bound SMS keys or Keystore attestation. |
| Room/SQLite | libraries present | WorkManager/Firebase infrastructure; no SMS account database/schema. |
| Firebase Installation ID/token | SDK present | Not connected to SMS registration; `getRegistrationToken()` is a no-op against an empty feature placeholder (`R4/j3.java:38-40`). |

Evidence for WebView state: `analysis/jadx/sources/R4/C0468k1.java:259-288`; bridge preferences: `R4/l3.java:94-108,1698-1702`; disabled config: `analysis/apktool/assets/appConfig.json:1-134` and `analysis/jadx/sources/R4/C0458i.java:339-356`.

## Lifecycle that can be established

```text
First launch
    -> native wrapper creates WebView
    -> loads https://www.smspariaz.com with UA SMSPARIAZAPP001
    -> website controls any phone/OTP/login UI
    -> any website session can persist in CookieManager and DOM storage
    -> future launches reload the same origin
```

The middle registration/OTP/server-response steps are not in this artifact. The APK cannot establish which phone fields are sent, whether OTP is required, what token is returned, or whether the backend registers a device. Reporting such details would require remote web code or authorized server/test evidence.

