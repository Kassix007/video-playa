import SwiftUI
import WebKit

struct SMSPariazWebView: UIViewRepresentable {
    let url: URL
    @ObservedObject var model: WebViewModel
    let apiClient: APIClient

    func makeCoordinator() -> WebViewCoordinator {
        WebViewCoordinator(model: model, apiClient: apiClient)
    }

    func makeUIView(context: Context) -> WKWebView {
        let contentController = WKUserContentController()
        contentController.add(
            context.coordinator.betBridge,
            name: BetBridge.messageHandlerName
        )
        contentController.addUserScript(
            WKUserScript(
                source: BetBridge.developmentGuardScript,
                injectionTime: .atDocumentStart,
                forMainFrameOnly: false
            )
        )

        let configuration = WKWebViewConfiguration()
        configuration.websiteDataStore = .default()
        configuration.userContentController = contentController
        configuration.preferences.javaScriptCanOpenWindowsAutomatically = false

        let webView = WKWebView(frame: .zero, configuration: configuration)
        webView.navigationDelegate = context.coordinator
        webView.uiDelegate = context.coordinator
        webView.allowsBackForwardNavigationGestures = true

        // Deliberately do not copy Android's "SMSPARIAZAPP001" user agent.
        // SMSPariaz must issue/authorize an iOS-specific channel identifier.
        model.attach(webView)
        webView.load(URLRequest(url: url))
        return webView
    }

    func updateUIView(_ webView: WKWebView, context: Context) {
        model.refreshNavigationState()
    }

    static func dismantleUIView(_ webView: WKWebView, coordinator: WebViewCoordinator) {
        webView.configuration.userContentController.removeScriptMessageHandler(
            forName: BetBridge.messageHandlerName
        )
        coordinator.model.detach(webView)
    }
}

