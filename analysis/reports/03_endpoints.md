# 03 — Embedded URLs, hosts, and endpoint evidence

## SMSPariaz-specific result

The only complete SMSPariaz URL embedded anywhere in DEX, resources, assets, XML, or native libraries is:

| URL/path | Method | Reference | Purpose |
|---|---|---|---|
| `https://www.smspariaz.com` | initial navigation is a WebView GET | `R4.C0468k1.j`, `analysis/jadx/sources/R4/C0468k1.java:220-223`; load in `U4.AbstractC0534a.y`, `:3668-3676` | Main remote web application |

Deep links may append paths at runtime, but no SMSPariaz API base URL or endpoint path is embedded. There are no complete strings containing `mobile`, `placebet`, `placeBet`, `place_bet`, `betslip`, `submitBet`, `wager`, `stake`, `account`, `balance`, or `8685` associated with the SMSPariaz origin.

## Runtime/library URLs

These complete URLs were extracted from the raw APK. A URL's presence does not prove it is reached in this build.

| URL | Source/purpose |
|---|---|
| `https://www.smspariaz.com` | Main WebView origin; app-specific. |
| `https://firebaseinstallations.googleapis.com/v1/` | Firebase Installations SDK base. `FirebaseInstallationServiceClient.java:205`. |
| `https://alpha-af0d2.firebaseio.com` | Firebase resource value; no SMS use shown. `res/values/strings.xml:80`. |
| `https://firebasestorage.googleapis.com/v0/b/web-to-native-dev.appspot.com/o/user-uploads%2FJnEsGYO67yYziwPpChL8%2Fuser-upload%2Ficon_ANDROID1699509452490.png?alt=media&token=...` | Source URL for the already-bundled offline image. `assets/appConfig.json:86`. |
| `https://app-measurement.com/a` | Google measurement SDK. |
| `https://app-measurement.com/s/d` | Google measurement SDK. |
| `https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps` | Google library diagnostic/ad endpoint. |
| `https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=` | Install-referrer/ads library. |
| `https://play.google.com/store/apps/details?id=` | App update/review navigation. |
| `https://www.google.com` | Generic Google login/search helper. |
| `https://google.com/search?` | Generic search helper. |
| `https://plus.google.com/` | Legacy Google resource. |
| `https://widget.connect.orufy` | Generic Web To Native support-widget special case; connect feature is absent from this app config. |

Firebase path fragments in DEX include `/installations`, `/installations/`, and `/authTokens:generate`. Methods are visible in `com.google.firebase.installations.remote.FirebaseInstallationServiceClient.createFirebaseInstallation` and `.generateAuthToken`; they are Firebase SDK endpoints, not SMSPariaz endpoints.

## Documentation, license, schema, and asset-metadata URLs

The raw scan also found the following non-application endpoints:

- `http://schemas.android.com/aapt`
- `http://schemas.android.com/apk/res-auto`
- `http://schemas.android.com/apk/res/android`
- `http://schemas.android.com/tools`
- `http://www.apache.org/licenses/`
- `http://www.w3.org/1999/02/22-rdf-syntax-ns#`
- `http://www.w3.org/1999/xlink`
- `http://www.w3.org/2000/svg`
- `http://www.w3.org/TR/SVG11/feature#`
- `http://xml.org/sax/features/external-general-entities`
- `http://xml.org/sax/features/external-parameter-entities`
- `http://xml.org/sax/properties/lexical-handler`
- `http://xmlpull.org/v1/doc/features.html#process-docdecl`
- `http://xmlpull.org/v1/doc/features.html#process-namespaces`
- `http://ns.adobe.com/exif/1.0/`
- `http://ns.adobe.com/xap/1.0/`
- `https://android.googlesource.com/toolchain/llvm-project`
- `https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#`
- `https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#`
- `https://developer.android.com/training/articles/direct-boot`
- `https://firebase.google.com/support/guides/disable-analytics`
- `https://firebase.google.com/support/privacy/init-options`
- `https://fontawesome.com/`
- `https://github.com/FortAwesome/Font-Awesome/blob/master/LICENSE.txt`
- `https://goo.gl/NAOOOI`
- `https://goo.gle/compose-feedback`
- `https://mozilla.org/MPL/2.0/`
- `https://phosphoricons.com`
- `https://publicsuffix.org/list/public_suffix_list.dat`
- `https://raw.githubusercontent.com/phosphor-icons/homepage/master/LICENSE`
- `https://youtrack.jetbrains.com/issue/KT-46465`
- `https://youtrack.jetbrains.com/issue/KT-55980`

The DEX also contains incomplete URL-normalization fragments `http://www.`, `https://www.`, and `www.`; they are not endpoints. Evidence: `analysis/jadx/sources/W1/e.java:989-1017`.

## Unique hostnames

After removing incomplete fragments, the unique hosts are:

`alpha-af0d2.firebaseio.com`, `android.googlesource.com`, `app-measurement.com`, `developer.android.com`, `firebase.google.com`, `firebaseinstallations.googleapis.com`, `firebasestorage.googleapis.com`, `fontawesome.com`, `github.com`, `goo.gl`, `goo.gle`, `google.com`, `mozilla.org`, `ns.adobe.com`, `pagead2.googlesyndication.com`, `phosphoricons.com`, `play.google.com`, `plus.google.com`, `publicsuffix.org`, `raw.githubusercontent.com`, `schemas.android.com`, `widget.connect.orufy`, `www.apache.org`, `www.google.com`, `www.googleadservices.com`, `www.smspariaz.com`, `www.w3.org`, `xml.org`, `xmlpull.org`, `youtrack.jetbrains.com`.

## Endpoint conclusion

**Place-bet endpoint identifiable: NO.** The endpoint, HTTP method, payload, and response UI are supplied by web content downloaded after installation, not by the APK. No network call was made during this analysis.

