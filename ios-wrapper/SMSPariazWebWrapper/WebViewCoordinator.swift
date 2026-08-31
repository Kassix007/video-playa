import Foundation
import WebKit

@MainActor
final class WebViewCoordinator: NSObject, WKNavigationDelegate, WKUIDelegate {
    let bridge = NativeBridge()

    private weak var webView: WKWebView?
    private let state: BrowserState

    init(state: BrowserState) {
        self.state = state
        super.init()
    }

    func attach(_ webView: WKWebView) {
        self.webView = webView
        state.goBack = { [weak webView] in webView?.goBack() }
        state.goForward = { [weak webView] in webView?.goForward() }
        state.reload = { [weak webView] in webView?.reload() }
        publishState(from: webView)
    }

    func publishState(from webView: WKWebView) {
        state.title = webView.title ?? ""
        state.canGoBack = webView.canGoBack
        state.canGoForward = webView.canGoForward
        state.isLoading = webView.isLoading
    }

    func webView(_ webView: WKWebView, didStartProvisionalNavigation navigation: WKNavigation!) {
        publishState(from: webView)
    }

    func webView(_ webView: WKWebView, didFinish navigation: WKNavigation!) {
        publishState(from: webView)

        // This is the mode handoff found in the official Android wrapper. The
        // research guard still prevents login, OTP, and wager POSTs. Production
        // use requires an explicit SMSPariaz iOS contract and test environment.
        webView.evaluateJavaScript(
            "if (typeof window.logalert === 'function') { window.logalert(); }"
        ) { _, error in
            if let error {
                let errorCode = (error as NSError).code
                self.bridge.recordNativeDecision(
                    method: "JS",
                    url: webView.url,
                    reason: "mode-hook-error-\(errorCode)"
                )
            }
        }
    }

    func webView(
        _ webView: WKWebView,
        decidePolicyFor navigationAction: WKNavigationAction,
        decisionHandler: @escaping (WKNavigationActionPolicy) -> Void
    ) {
        let method = (navigationAction.request.httpMethod ?? "GET").uppercased()
        let safeMethods = Set(["GET", "HEAD", "OPTIONS"])

        guard safeMethods.contains(method) else {
            bridge.recordNativeDecision(
                method: method,
                url: navigationAction.request.url,
                reason: "state-changing-navigation"
            )
            decisionHandler(.cancel)
            return
        }

        if navigationAction.shouldPerformDownload {
            bridge.recordNativeDecision(
                method: method,
                url: navigationAction.request.url,
                reason: "download"
            )
            decisionHandler(.cancel)
            return
        }

        decisionHandler(.allow)
    }

    func webView(
        _ webView: WKWebView,
        decidePolicyFor navigationResponse: WKNavigationResponse,
        decisionHandler: @escaping (WKNavigationResponsePolicy) -> Void
    ) {
        if navigationResponse.canShowMIMEType {
            decisionHandler(.allow)
        } else {
            bridge.recordNativeDecision(
                method: "GET",
                url: navigationResponse.response.url,
                reason: "unsupported-download"
            )
            decisionHandler(.cancel)
        }
    }

    func webView(
        _ webView: WKWebView,
        createWebViewWith configuration: WKWebViewConfiguration,
        for navigationAction: WKNavigationAction,
        windowFeatures: WKWindowFeatures
    ) -> WKWebView? {
        guard navigationAction.targetFrame == nil,
              let url = navigationAction.request.url,
              (navigationAction.request.httpMethod ?? "GET").uppercased() == "GET" else {
            return nil
        }

        // Keep target=_blank navigation inside the guarded research WebView.
        webView.load(URLRequest(url: url))
        return nil
    }
}
