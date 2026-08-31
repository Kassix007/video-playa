import Foundation
import WebKit

struct BlockedBetEvent {
    let kind: String
    let pageURL: String?
    let targetURL: String?
    let method: String?
}

@MainActor
final class BetBridge: NSObject, WKScriptMessageHandler {
    static let messageHandlerName = "smspariazBetIntent"

    // This guard is intentionally heuristic because the APK contains no wager
    // endpoint or remote web bundle. It blocks obvious labeled controls and
    // request metadata without reading form fields, credentials, or OTP values.
    static let developmentGuardScript = #"""
    (() => {
      const handler = window.webkit?.messageHandlers?.smspariazBetIntent;
      if (!handler) return;

      const wagerPattern = /(place\s*bet|bet\s*by\s*app|submit\s*bet|placebet|betslip|wager)/i;
      const text = value => typeof value === 'string' ? value : '';
      const isWagerLike = value => wagerPattern.test(text(value));
      const post = payload => handler.postMessage({
        pageURL: location.href,
        ...payload
      });

      const describeTarget = target => {
        const element = target?.closest?.('button, a, input, [role="button"]');
        if (!element) return null;
        return {
          element,
          label: text(element.innerText || element.value || element.textContent).trim(),
          targetURL: text(element.href || element.formAction || '')
        };
      };

      document.addEventListener('click', event => {
        const target = describeTarget(event.target);
        if (!target) return;
        if (isWagerLike(target.label) || isWagerLike(target.targetURL)) {
          event.preventDefault();
          event.stopImmediatePropagation();
          post({ kind: 'blockedClick', targetURL: target.targetURL, method: null });
        }
      }, true);

      document.addEventListener('submit', event => {
        const form = event.target;
        const submitter = event.submitter;
        const label = text(submitter?.innerText || submitter?.value || form?.innerText);
        const targetURL = text(form?.action);
        const method = text(form?.method || 'GET').toUpperCase();
        if (method !== 'GET' || isWagerLike(label) || isWagerLike(targetURL)) {
          event.preventDefault();
          event.stopImmediatePropagation();
          post({
            kind: method === 'GET' ? 'blockedWagerForm' : 'blockedMutationForm',
            targetURL,
            method
          });
        }
      }, true);

      const originalFetch = window.fetch?.bind(window);
      if (originalFetch) {
        window.fetch = (input, init = {}) => {
          const targetURL = text(typeof input === 'string' ? input : input?.url);
          const method = text(init.method || input?.method || 'GET').toUpperCase();
          const body = typeof init.body === 'string' ? init.body : '';
          if (method !== 'GET' || isWagerLike(targetURL) || isWagerLike(body)) {
            post({
              kind: method === 'GET' ? 'blockedWagerFetch' : 'blockedMutationFetch',
              targetURL,
              method
            });
            return Promise.reject(new Error('Blocked by non-submitting development guard'));
          }
          return originalFetch(input, init);
        };
      }

      const requestMeta = new WeakMap();
      const originalOpen = XMLHttpRequest.prototype.open;
      const originalSend = XMLHttpRequest.prototype.send;
      XMLHttpRequest.prototype.open = function(method, targetURL, ...rest) {
        requestMeta.set(this, { method: text(method).toUpperCase(), targetURL: text(targetURL) });
        return originalOpen.call(this, method, targetURL, ...rest);
      };
      XMLHttpRequest.prototype.send = function(body) {
        const meta = requestMeta.get(this) || { method: 'GET', targetURL: '' };
        const stringBody = typeof body === 'string' ? body : '';
        if (meta.method !== 'GET' || isWagerLike(meta.targetURL) || isWagerLike(stringBody)) {
          post({
            kind: meta.method === 'GET' ? 'blockedWagerXHR' : 'blockedMutationXHR',
            targetURL: meta.targetURL,
            method: meta.method
          });
          throw new DOMException('Blocked by non-submitting development guard', 'SecurityError');
        }
        return originalSend.call(this, body);
      };

      if (typeof navigator.sendBeacon === 'function') {
        navigator.sendBeacon = targetURL => {
          post({ kind: 'blockedBeacon', targetURL: text(targetURL), method: 'POST' });
          return false;
        };
      }
    })();
    """#

    private let apiClient: APIClient
    private let onBlocked: (BlockedBetEvent) -> Void

    init(apiClient: APIClient, onBlocked: @escaping (BlockedBetEvent) -> Void) {
        self.apiClient = apiClient
        self.onBlocked = onBlocked
    }

    func record(_ event: BlockedBetEvent) {
        apiClient.recordBetIntent(event)
        onBlocked(event)
    }

    func userContentController(
        _ userContentController: WKUserContentController,
        didReceive message: WKScriptMessage
    ) {
        guard message.name == Self.messageHandlerName,
              let dictionary = message.body as? [String: Any],
              let kind = dictionary["kind"] as? String else {
            return
        }

        let event = BlockedBetEvent(
            kind: kind,
            pageURL: dictionary["pageURL"] as? String,
            targetURL: dictionary["targetURL"] as? String,
            method: dictionary["method"] as? String
        )
        record(event)
    }
}
