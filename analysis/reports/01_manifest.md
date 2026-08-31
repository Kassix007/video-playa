# 01 — Manifest and APK identity

## Artifact

| Field | Value |
|---|---|
| Source APK | `analysis/extracted/smspariaz.apk` |
| Size | 7,946,351 bytes |
| SHA-256 | `89E45BC7710376EF4B6A0354AD32A3AC1F84198FC33370A393F75B86DA60CD72` |
| Package | `com.wnapp.smspariaz` |
| Application label | `SMS PARIAZ LTD` |
| Version name | `1.5` |
| Version code | `15` |
| Minimum SDK | 24 (Android 7.0) |
| Target SDK | 35 |
| Compile SDK | 35 |
| Launcher activity | `com.web2native.MainActivity` |

The package/version/SDK/launcher values agree across `aapt dump badging`, `apkanalyzer`, and the apktool-decoded manifest. Evidence: `analysis/apktool/AndroidManifest.xml:2,18,24-47`; `analysis/jadx/resources/AndroidManifest.xml:7-9,60-100`.

## Components

### Activities

| Activity | Exported | Purpose/evidence |
|---|---:|---|
| `com.web2native.MainActivity` | yes | Launcher and deep-link entry point. Manifest `:24-47`. |
| `com.google.android.gms.common.api.GoogleApiActivity` | no | Google Play services helper. Manifest `:61`. |
| `com.google.android.play.core.common.PlayCoreDialogWrapperActivity` | no | Play Core update/review dialog. Manifest `:131`. |

### Services

| Service | Exported | Permission/role |
|---|---:|---|
| `com.google.android.gms.measurement.AppMeasurementService` | no | Firebase/Google measurement. |
| `com.google.android.gms.measurement.AppMeasurementJobService` | no | Requires `android.permission.BIND_JOB_SERVICE`. |
| `com.google.firebase.components.ComponentDiscoveryService` | no | Firebase component registration. |
| `androidx.work.impl.background.systemalarm.SystemAlarmService` | no | WorkManager. |
| `androidx.work.impl.background.systemjob.SystemJobService` | yes | Requires `android.permission.BIND_JOB_SERVICE`. |
| `androidx.work.impl.foreground.SystemForegroundService` | no | WorkManager foreground execution. |
| `androidx.room.MultiInstanceInvalidationService` | no | Room invalidation helper. |

Evidence: manifest `:59-72,114`.

### Broadcast receivers

| Receiver | Exported/enabled | Role |
|---|---|---|
| `com.google.android.gms.measurement.AppMeasurementReceiver` | not exported | Measurement. |
| `androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver` | not exported | WorkManager force-stop detection. |
| `ConstraintProxy$BatteryChargingProxy` | not exported; disabled by default | Power constraints. |
| `ConstraintProxy$BatteryNotLowProxy` | not exported; disabled by default | Battery constraints. |
| `ConstraintProxy$StorageNotLowProxy` | not exported; disabled by default | Storage constraints. |
| `ConstraintProxy$NetworkStateProxy` | not exported; disabled by default | Network constraints. |
| `androidx.work.impl.background.systemalarm.RescheduleReceiver` | not exported; disabled by default | Boot/time rescheduling. |
| `ConstraintProxyUpdateReceiver` | not exported | WorkManager proxy updates. |
| `androidx.work.impl.diagnostics.DiagnosticsReceiver` | exported | Protected by `android.permission.DUMP`. |
| `androidx.profileinstaller.ProfileInstallReceiver` | exported | Protected by `android.permission.DUMP`. |

Evidence: manifest `:58,73-113,117-130`.

`com.web2native.NotificationDisableBroadcastReceiver` is registered dynamically by `MainActivity.onCreate`, not declared in the manifest. Evidence: `analysis/jadx/sources/com/web2native/MainActivity.java:512-522`.

### Content providers

| Provider | Exported | Authority |
|---|---:|---|
| `androidx.core.content.FileProvider` | no | `com.wnapp.smspariaz.provider` |
| `androidx.startup.InitializationProvider` | no | `com.wnapp.smspariaz.androidx-startup` |
| `com.google.firebase.provider.FirebaseInitProvider` | no | `com.wnapp.smspariaz.firebaseinitprovider` |

Evidence: manifest `:21-23,48-57,69`.

## Permissions and features

Declared permissions:

- `android.permission.INTERNET`
- `android.permission.POST_NOTIFICATIONS`
- `android.permission.ACCESS_NETWORK_STATE`
- `android.permission.WAKE_LOCK`
- `com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE`
- `com.google.android.gms.permission.AD_ID`
- `android.permission.ACCESS_ADSERVICES_ATTRIBUTION`
- `android.permission.ACCESS_ADSERVICES_AD_ID`
- `android.permission.RECEIVE_BOOT_COMPLETED`
- `android.permission.FOREGROUND_SERVICE`
- app-signature permission `com.wnapp.smspariaz.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`

Evidence: manifest `:3-17`.

Optional hardware features are camera, touchscreen, and faketouch (`:6-8`). There is no SMS, phone-number, phone-state, contacts, precise-location, or persistent camera permission.

## Deep links and intent filters

`MainActivity` accepts:

- `http://www.smspariaz.com/...`
- `https://www.smspariaz.com/...`
- `w2n://*` (wildcard host)
- ordinary launcher intents

The HTTP(S) filter has `android:autoVerify="true"`. Evidence: manifest `:25-46`. Runtime intent handling also accepts `url`, `openURL`, and `deepLink` extras and URI data; see `analysis/jadx/sources/l6/d.java:2201-2271`.

## Network security

- No `android:networkSecurityConfig` is declared and no network-security XML exists.
- `android:usesCleartextTraffic="true"`, so cleartext HTTP is globally permitted by the app manifest. Evidence: manifest `:18`.
- The main WebView additionally calls `setMixedContentMode(0)`, Android's `MIXED_CONTENT_ALWAYS_ALLOW`. Evidence: `analysis/jadx/sources/R4/C0468k1.java:269-288`.

This describes client configuration; it does not show that SMSPariaz itself uses HTTP. The embedded main URL is HTTPS.

## Signing certificate

`apksigner verify --verbose --print-certs` reports:

| Property | Value |
|---|---|
| Verification | Valid |
| Signers | 1 |
| V1/JAR | no |
| V2 | yes |
| V3 / V3.1 / V4 | no |
| SourceStamp | no |
| Subject DN | `CN=Web To Native, OU=Web To Native, O=Web To Native, L=Mumbai, ST=Maharashtra, C=91` |
| Public-key algorithm/size | RSA, 2048 bits |
| Certificate SHA-256 | `309effe510420d69b07f947ad2da52e331a2a6b174e38465546314044d28397f` |
| Certificate SHA-1 | `70e4ca2b3a0fda0cb60151e6cafce561f53b6bff` |
| Certificate MD5 | `12814a68aa8e0d7c16ced223c0c2572f` |
| Public-key SHA-256 | `a2ac5a4c778329a7f7f877ea690b6cea12ad8c190066c4858c22ac47f4ce76b7` |

The subject identifies the generic Web To Native builder rather than SMSPariaz itself. That observation does not establish ownership or distribution provenance.

