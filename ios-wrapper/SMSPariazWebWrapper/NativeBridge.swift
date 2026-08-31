import Foundation
import OSLog
import WebKit

/// A metadata-only analysis logger. It deliberately exposes no login, OTP,
/// account, or wager capability to JavaScript.
final class NativeBridge: NSObject, WKScriptMessageHandler {
    static let messageName = "analysisLog"

    private let logger = Logger(
        subsystem: Bundle.main.bundleIdentifier ?? "SMSPariazWebWrapper",
        category: "SafeWebAnalysis"
    )

    func userContentController(
        _ userContentController: WKUserContentController,
        didReceive message: WKScriptMessage
    ) {
        guard message.name == Self.messageName,
              let metadata = message.body as? [String: Any] else {
            return
        }

        let method = sanitizedMethod(metadata["method"] as? String)
        let source = sanitizedLabel(metadata["source"] as? String)
        let url = redactedURL(metadata["url"] as? String)

        logger.notice("Web request event source=\(source, privacy: .public) method=\(method, privacy: .public) url=\(url, privacy: .public)")
    }

    func recordNativeDecision(method: String?, url: URL?, reason: String) {
        let safeMethod = sanitizedMethod(method)
        let safeURL = redactedURL(url?.absoluteString)
        let safeReason = sanitizedLabel(reason)
        logger.notice("Navigation blocked reason=\(safeReason, privacy: .public) method=\(safeMethod, privacy: .public) url=\(safeURL, privacy: .public)")
    }

    private func sanitizedMethod(_ value: String?) -> String {
        let candidate = (value ?? "UNKNOWN").uppercased()
        let valid = candidate.allSatisfy { $0.isASCII && $0.isLetter }
        return valid ? String(candidate.prefix(12)) : "UNKNOWN"
    }

    private func sanitizedLabel(_ value: String?) -> String {
        let candidate = value ?? "unknown"
        let filtered = candidate.filter {
            $0.isASCII && ($0.isLetter || $0.isNumber || "-_ .".contains($0))
        }
        return String(filtered.prefix(32)).replacingOccurrences(of: " ", with: "-")
    }

    /// Removes query strings, fragments, credentials, and non-HTTP schemes before logging.
    private func redactedURL(_ value: String?) -> String {
        guard let value,
              var components = URLComponents(string: value),
              components.scheme == "https" || components.scheme == "http" else {
            return "redacted"
        }

        components.user = nil
        components.password = nil
        components.query = nil
        components.fragment = nil
        return components.string ?? "redacted"
    }
}
