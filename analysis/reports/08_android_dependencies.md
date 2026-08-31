# 08 — Android-specific dependencies and server constraints

## Static findings

| Mechanism | Found? | Evidence/conclusion |
|---|---:|---|
| Google Play Integrity API | no | No Integrity classes, manifest components, or request strings. Play Core update/review libraries are present, which is not Play Integrity. |
| SafetyNet attestation | no | No SafetyNet API usage or attestation nonce/token flow. |
| Firebase App Check | no | Firebase core/installations/analytics are present, but App Check classes/registrars are absent. |
| Hardware/Keystore attestation | no | No `KeyGenParameterSpec` attestation challenge or AndroidKeyStore key generation. |
| APK/package-signature validation | no | The app does not read its own signing certificates or compare fingerprints. |
| Device-bound cryptographic keys | no | None identified. |
| Android ID | capability only | Generic optional-header placeholder maps `DEVICE_ID` to Android ID; no active custom-header config. `K2/a.java:330-350`. |
| Generated installation UUID | yes, on demand | `getDeviceInfo()` creates app-private UUID; `R4/l3.java:1005-1023`, `R4/V.java:94-101`. |
| Firebase Installation ID | library present | Analytics/Firebase infrastructure only; no link to SMS backend registration. |
| Advertising ID | library/permissions present | Google measurement dependency; no SMS-specific use and analytics collection is disabled. |
| Root detection | no app-specific evidence | `test-keys` strings belong to Google signature/services code, not an SMSPariaz root check. |
| Emulator detection | no app-specific evidence | Generic Google/Android libraries mention `Build.FINGERPRINT`; no SMS gate is implemented. |
| Certificate pinning | no configured pin | OkHttp's standard TLS machinery is bundled, but no `CertificatePinner`, pin set, host pin, or `networkSecurityConfig` exists. |
| Custom trust manager | no app-specific override | Bundled OkHttp/Conscrypt platform trust code creates standard system trust managers; no SMS host override. |
| Cleartext allowed | yes | Manifest `usesCleartextTraffic=true`; main URL remains HTTPS. |

Search evidence spans raw `classes.dex`, all JADX sources, apktool smali, manifest/resources, and native libraries. The only native library is AndroidX graphics-path support and contains no SMS/security strings.

## Important server-side unknown

The main WebView replaces its UA with `SMSPARIAZAPP001` (`analysis/jadx/sources/R4/C0468k1.java:279`). This is an app-channel identifier and may be used server-side to select app behavior. The APK cannot prove whether the backend merely changes UI, validates the UA, binds sessions to it, checks another request property, or ignores it.

Therefore:

- **Android-specific cryptographic/attestation requirement found:** NO.
- **Android-specific server requirement:** **UNKNOWN**.
- **Reason for UNKNOWN:** the relevant website and backend are remote; the custom UA is evidence of channel differentiation but not evidence of a security requirement.

Reusing the Android UA on iOS without SMSPariaz authorization would be impersonation of the official channel, not a legitimate porting strategy. The proposed prototype intentionally does not set it.

## TLS posture

The main SMS traffic follows WebView's platform TLS validation. The app does not implement or bypass certificate checks. OkHttp 4.12.0 is bundled for generic framework features and includes ordinary `X509TrustManager`/hostname verification code, but no SMS host pin or custom certificate fingerprint is configured. No pinning bypass was attempted.

