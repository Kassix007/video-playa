import Foundation
import OSLog

enum APIClientError: LocalizedError {
    case submissionDisabled

    var errorDescription: String? {
        switch self {
        case .submissionDisabled:
            return "Real wager submission is disabled in this static-analysis prototype."
        }
    }
}

final class APIClient {
    private let session: URLSession
    private let logger = Logger(
        subsystem: "com.example.SMSPariazPrototype",
        category: "BlockedBetIntent"
    )

    init(session: URLSession = .shared) {
        self.session = session
    }

    func recordBetIntent(_ event: BlockedBetEvent) {
        // Deliberately log only request metadata. Never log credentials, cookies,
        // form fields, OTP values, request bodies, or account information.
        logger.notice(
            "Blocked kind=\(event.kind, privacy: .public) method=\(event.method ?? "unknown", privacy: .public) target=\(event.targetURL ?? "unknown", privacy: .private(mask: .hash))"
        )
    }

    func submitBet(_ request: URLRequest) async throws -> Never {
        _ = session
        _ = request
        throw APIClientError.submissionDisabled
    }
}

