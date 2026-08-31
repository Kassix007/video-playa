# SMSPariaz non-submitting iOS prototype

This SwiftUI/WKWebView shell demonstrates only the wrapper architecture found by static APK analysis.

Safety properties:

- It uses the normal iOS WebKit user agent. It does not copy `SMSPARIAZAPP001` or pretend to be Android.
- It has no SMSPariaz API endpoint.
- `APIClient.submitBet` always throws `submissionDisabled` and never calls `URLSession`.
- A document-start development guard blocks and locally logs obvious place-bet controls, every non-GET form/fetch/XHR/navigation request, and every beacon. This intentionally prevents login, OTP, account changes, and wager submission in the prototype.
- Logs contain only event kind, method, and a privacy-masked target; no fields, credentials, cookies, OTPs, or bodies.
- It does not bypass login, OTP, TLS validation, pinning, attestation, or device checks.

Limitations:

- The APK contains no remote website bundle or bet endpoint. Wager-looking GET interactions are detected heuristically; all mutating browser requests are blocked regardless of endpoint name. This is not a production betting client.
- Do not use this prototype with a real account or real funds.
- SMSPariaz must authorize an iOS channel, provide a test environment/contract, and define an iOS-specific identifier before production work.

Open `SMSPariazPrototype.xcodeproj` in Xcode 16 or later and select an iOS 16+ simulator/device. This project was generated and statically reviewed on Windows; it could not be compiled against Apple's SDK in this workspace.
