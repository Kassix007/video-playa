import Foundation
import SwiftUI
import WebKit

@MainActor
final class WebViewModel: ObservableObject {
    @Published var canGoBack = false
    @Published var canGoForward = false
    @Published var statusMessage = "Development guard active — wager submission is disabled."

    fileprivate weak var webView: WKWebView?

    func attach(_ webView: WKWebView) {
        self.webView = webView
        refreshNavigationState()
    }

    func detach(_ webView: WKWebView) {
        if self.webView === webView {
            self.webView = nil
        }
    }

    func refreshNavigationState() {
        canGoBack = webView?.canGoBack ?? false
        canGoForward = webView?.canGoForward ?? false
    }

    func goBack() {
        webView?.goBack()
    }

    func goForward() {
        webView?.goForward()
    }

    func reload() {
        webView?.reload()
    }
}

@MainActor
final class WebViewCoordinator: NSObject, WKNavigationDelegate, WKUIDelegate {
    let model: WebViewModel
    let betBridge: BetBridge

    init(model: WebViewModel, apiClient: APIClient) {
        self.model = model
        self.betBridge = BetBridge(apiClient: apiClient) { event in
            model.statusMessage = "Blocked and logged locally: \(event.kind)"
        }
    }

    func webView(_ webView: WKWebView, didStartProvisionalNavigation navigation: WKNavigation!) {
        model.statusMessage = "Loading… Development guard remains active."
        model.refreshNavigationState()
    }

    func webView(_ webView: WKWebView, didFinish navigation: WKNavigation!) {
        model.statusMessage = "Loaded. Development guard is blocking wager-like actions."
        model.refreshNavigationState()
    }

    func webView(
        _ webView: WKWebView,
        didFail navigation: WKNavigation!,
        withError error: Error
    ) {
        model.statusMessage = "Navigation failed: \(error.localizedDescription)"
        model.refreshNavigationState()
    }

    func webView(
        _ webView: WKWebView,
        didFailProvisionalNavigation navigation: WKNavigation!,
        withError error: Error
    ) {
        model.statusMessage = "Load failed: \(error.localizedDescription)"
        model.refreshNavigationState()
    }

    func webView(
        _ webView: WKWebView,
        decidePolicyFor navigationAction: WKNavigationAction,
        decisionHandler: @escaping (WKNavigationActionPolicy) -> Void
    ) {
        guard let url = navigationAction.request.url,
              let scheme = url.scheme?.lowercased() else {
            decisionHandler(.cancel)
            return
        }

        guard scheme == "https" || scheme == "http" else {
            model.statusMessage = "Blocked unsupported URL scheme: \(scheme)"
            decisionHandler(.cancel)
            return
        }

        let method = navigationAction.request.httpMethod?.uppercased() ?? "GET"
        guard method == "GET" else {
            let event = BlockedBetEvent(
                kind: "blockedMutationNavigation",
                pageURL: webView.url?.absoluteString,
                targetURL: url.absoluteString,
                method: method
            )
            betBridge.record(event)
            model.statusMessage = "Blocked and logged locally: \(method) navigation"
            decisionHandler(.cancel)
            return
        }

        if navigationAction.targetFrame == nil {
            webView.load(navigationAction.request)
            decisionHandler(.cancel)
            return
        }

        decisionHandler(.allow)
    }

    func webView(
        _ webView: WKWebView,
        createWebViewWith configuration: WKWebViewConfiguration,
        for navigationAction: WKNavigationAction,
        windowFeatures: WKWindowFeatures
    ) -> WKWebView? {
        if let requestURL = navigationAction.request.url,
           requestURL.scheme == "https" || requestURL.scheme == "http" {
            webView.load(navigationAction.request)
        }
        return nil
    }
}
