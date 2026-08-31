import SwiftUI
import WebKit

struct SMSPariazWebView: UIViewRepresentable {
    private static let startURL = URL(string: "https://www.smspariaz.com/")!

    @ObservedObject var state: BrowserState

    func makeCoordinator() -> WebViewCoordinator {
        WebViewCoordinator(state: state)
    }

    func makeUIView(context: Context) -> WKWebView {
        let controller = WKUserContentController()
        controller.add(context.coordinator.bridge, name: NativeBridge.messageName)
        controller.addUserScript(
            WKUserScript(
                source: SafetyScript.source,
                injectionTime: .atDocumentStart,
                forMainFrameOnly: false
            )
        )

        let configuration = WKWebViewConfiguration()
        configuration.userContentController = controller
        configuration.websiteDataStore = .default()
        configuration.defaultWebpagePreferences.allowsContentJavaScript = true
        configuration.preferences.javaScriptCanOpenWindowsAutomatically = false

        let webView = WKWebView(frame: .zero, configuration: configuration)
        webView.navigationDelegate = context.coordinator
        webView.uiDelegate = context.coordinator
        webView.allowsBackForwardNavigationGestures = true
        webView.allowsLinkPreview = false
        if #available(iOS 16.4, *) {
            webView.isInspectable = true
        }

        context.coordinator.attach(webView)
        webView.load(URLRequest(url: Self.startURL))
        return webView
    }

    func updateUIView(_ webView: WKWebView, context: Context) {}

    static func dismantleUIView(_ webView: WKWebView, coordinator: WebViewCoordinator) {
        webView.configuration.userContentController.removeScriptMessageHandler(
            forName: NativeBridge.messageName
        )
        webView.navigationDelegate = nil
        webView.uiDelegate = nil
    }
}

private enum SafetyScript {
    /// This research-only guard runs before page JavaScript. It permits passive requests
    /// and blocks POST/PUT/PATCH/DELETE, beacons, WebSockets, form mutations, and service
    /// workers. It never records headers, cookies, bodies, credentials, OTPs, or tokens.
    static let source = #"""
    (() => {
      'use strict';
      const safeMethods = new Set(['GET', 'HEAD', 'OPTIONS']);
      const metadataURL = (value) => {
        try {
          const parsed = new URL(String(value), location.href);
          if (parsed.protocol !== 'https:' && parsed.protocol !== 'http:') return 'redacted';
          return parsed.origin + parsed.pathname;
        } catch (_) {
          return 'redacted';
        }
      };
      const report = (source, method, url) => {
        try {
          window.webkit.messageHandlers.analysisLog.postMessage({
            source: String(source).slice(0, 32),
            method: String(method || 'UNKNOWN').toUpperCase().slice(0, 12),
            url: metadataURL(url)
          });
        } catch (_) {}
      };
      const isSafe = (method) => safeMethods.has(String(method || 'GET').toUpperCase());

      const originalFetch = window.fetch.bind(window);
      window.fetch = (input, init = {}) => {
        const method = String(init.method || (input && input.method) || 'GET').toUpperCase();
        const url = (input && input.url) || input;
        report('fetch', method, url);
        if (!isSafe(method)) {
          return Promise.reject(new DOMException('Blocked by the research safety guard', 'SecurityError'));
        }
        return originalFetch(input, init);
      };

      const xhrOpen = XMLHttpRequest.prototype.open;
      const xhrSend = XMLHttpRequest.prototype.send;
      const xhrMetadata = new WeakMap();
      XMLHttpRequest.prototype.open = function(method, url, ...rest) {
        const normalized = String(method || 'GET').toUpperCase();
        const blocked = !isSafe(normalized);
        xhrMetadata.set(this, { method: normalized, url, blocked });
        report('xhr.open', normalized, url);
        if (blocked) return;
        return xhrOpen.call(this, normalized, url, ...rest);
      };
      XMLHttpRequest.prototype.send = function(body) {
        const metadata = xhrMetadata.get(this) || { method: 'GET', url: location.href, blocked: false };
        if (metadata.blocked) {
          throw new DOMException('Blocked by the research safety guard', 'SecurityError');
        }
        return xhrSend.call(this, body);
      };

      const formMethod = (form) => String(form.getAttribute('method') || 'GET').toUpperCase();
      const formURL = (form) => form.getAttribute('action') || location.href;
      const formSubmit = HTMLFormElement.prototype.submit;
      HTMLFormElement.prototype.submit = function() {
        const method = formMethod(this);
        report('form.submit', method, formURL(this));
        if (!isSafe(method)) throw new DOMException('Blocked by the research safety guard', 'SecurityError');
        return formSubmit.call(this);
      };
      if (HTMLFormElement.prototype.requestSubmit) {
        const formRequestSubmit = HTMLFormElement.prototype.requestSubmit;
        HTMLFormElement.prototype.requestSubmit = function(submitter) {
          const method = formMethod(this);
          report('form.requestSubmit', method, formURL(this));
          if (!isSafe(method)) throw new DOMException('Blocked by the research safety guard', 'SecurityError');
          return formRequestSubmit.call(this, submitter);
        };
      }
      document.addEventListener('submit', (event) => {
        const form = event.target;
        if (!(form instanceof HTMLFormElement)) return;
        const method = formMethod(form);
        report('form.event', method, formURL(form));
        if (!isSafe(method)) {
          event.preventDefault();
          event.stopImmediatePropagation();
        }
      }, true);

      if (navigator.sendBeacon) {
        navigator.sendBeacon = (url) => {
          report('beacon', 'POST', url);
          return false;
        };
      }

      if (window.WebSocket) {
        window.WebSocket = function(url) {
          report('websocket', 'CONNECT', url);
          throw new DOMException('Blocked by the research safety guard', 'SecurityError');
        };
      }

      if (navigator.serviceWorker && navigator.serviceWorker.register) {
        navigator.serviceWorker.register = (url) => {
          report('serviceworker', 'REGISTER', url);
          return Promise.reject(new DOMException('Blocked by the research safety guard', 'SecurityError'));
        };
      }
    })();
    """#
}
