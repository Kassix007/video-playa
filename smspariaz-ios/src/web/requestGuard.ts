export const ALLOW_CHECKLOGIN = true;
// Confirmed by the SMSPariaz developer for leaderboard QA. This source flag is
// additionally gated by React Native's __DEV__, so release bundles still block it.
export const ALLOW_PLACEBET_QA = true;

const DEVELOPMENT_RUNTIME = typeof __DEV__ !== 'undefined' && __DEV__;

export const REQUEST_GUARD_CONFIG = Object.freeze({
  allowChecklogin: ALLOW_CHECKLOGIN,
  allowPlacebetQa: DEVELOPMENT_RUNTIME && ALLOW_PLACEBET_QA,
});

export type RequestGuardOptions = {
  allowChecklogin?: boolean;
  allowPlacebetQa?: boolean;
};

export function buildRequestGuardScript({
  allowChecklogin = REQUEST_GUARD_CONFIG.allowChecklogin,
  allowPlacebetQa = REQUEST_GUARD_CONFIG.allowPlacebetQa,
}: RequestGuardOptions = {}): string {
  return `
(() => {
  'use strict';
  if (window.__smspRequestGuardInstalled) return true;
  window.__smspRequestGuardInstalled = true;

  const allowChecklogin = ${allowChecklogin ? 'true' : 'false'};
  const allowPlacebetQa = ${allowPlacebetQa ? 'true' : 'false'};
  const xhrState = new WeakMap();

  const parseTarget = (value) => {
    try {
      const parsed = new URL(String(value), window.location.href);
      return { path: parsed.pathname.toLowerCase(), displayPath: parsed.pathname };
    } catch (_) {
      return null;
    }
  };

  const matchesEndpoint = (path, endpoint) =>
    path.includes(endpoint + '/') || path.endsWith(endpoint);

  const placebetTarget = (value) => {
    const target = parseTarget(value);
    return target && matchesEndpoint(target.path, '/placebet') ? target : null;
  };

  const blockReason = (value) => {
    const target = parseTarget(value);
    if (!target) return null;
    if (!allowPlacebetQa && matchesEndpoint(target.path, '/placebet')) {
      return { target, reason: 'placebet' };
    }
    if (matchesEndpoint(target.path, '/registerremote')) return { target, reason: 'registerremote' };
    if (!allowChecklogin && matchesEndpoint(target.path, '/checklogin')) {
      return { target, reason: 'checklogin' };
    }
    return null;
  };

  const reportBlocked = (method, value, decision) => {
    const normalizedMethod = String(method || 'UNKNOWN').toUpperCase().slice(0, 12);
    const path = decision && decision.target ? decision.target.displayPath.slice(0, 160) : 'redacted';
    console.warn('[SMSP DEV] blocked ' + path);
    try {
      window.ReactNativeWebView.postMessage(JSON.stringify({
        type: 'REQUEST_BLOCKED',
        method: normalizedMethod,
        path
      }));
    } catch (_) {}
  };

  const reportQaPlacebet = (stage, transport, method, value, status = null) => {
    const target = placebetTarget(value);
    if (!target) return;
    const normalizedMethod = String(method || 'UNKNOWN').toUpperCase().slice(0, 12);
    const normalizedStatus = Number.isFinite(Number(status)) ? Number(status) : null;
    console.info(
      '[SMSP QA] ' + String(stage) + ' ' + normalizedMethod + ' ' + target.displayPath +
      (normalizedStatus === null ? '' : ' HTTP ' + normalizedStatus)
    );
    try {
      window.ReactNativeWebView.postMessage(JSON.stringify({
        type: 'QA_PLACEBET_EVENT',
        stage,
        transport,
        method: normalizedMethod,
        path: target.displayPath.slice(0, 160),
        status: normalizedStatus
      }));
    } catch (_) {}
  };

  if (typeof window.fetch === 'function') {
    const originalFetch = window.fetch.bind(window);
    window.fetch = (input, init = {}) => {
      const method = String(init.method || (input && input.method) || 'GET').toUpperCase();
      const url = (input && input.url) || input;
      const decision = blockReason(url);
      if (decision) {
        reportBlocked(method, url, decision);
        return Promise.reject(new DOMException('Blocked by SMSPariaz development guard', 'SecurityError'));
      }
      if (allowPlacebetQa && placebetTarget(url)) {
        reportQaPlacebet('START', 'fetch', method, url);
        return originalFetch(input, init).then((response) => {
          reportQaPlacebet('COMPLETE', 'fetch', method, url, response.status);
          return response;
        }).catch((error) => {
          reportQaPlacebet('ERROR', 'fetch', method, url);
          throw error;
        });
      }
      return originalFetch(input, init);
    };
  }

  const originalOpen = XMLHttpRequest.prototype.open;
  const originalSend = XMLHttpRequest.prototype.send;
  XMLHttpRequest.prototype.open = function(method, url, ...rest) {
    const normalizedMethod = String(method || 'GET').toUpperCase();
    const decision = blockReason(url);
    const qaTarget = allowPlacebetQa ? placebetTarget(url) : null;
    xhrState.set(this, { method: normalizedMethod, url, decision, qaTarget });

    if (decision) {
      reportBlocked(normalizedMethod, url, decision);
      // Opening about:blank changes XHR state without transmitting anything, so callers
      // may safely set headers before send() is suppressed below.
      return originalOpen.call(this, 'GET', 'about:blank', ...rest);
    }

    return originalOpen.call(this, method, url, ...rest);
  };

  XMLHttpRequest.prototype.send = function(body) {
    const state = xhrState.get(this);
    if (state && state.decision) {
      try { this.abort(); } catch (_) {}
      setTimeout(() => {
        try { this.dispatchEvent(new ProgressEvent('error')); } catch (_) {}
        try { this.dispatchEvent(new ProgressEvent('loadend')); } catch (_) {}
      }, 0);
      return;
    }
    if (state && state.qaTarget) {
      let finished = false;
      const finish = (stage) => {
        if (finished) return;
        finished = true;
        reportQaPlacebet(stage, 'xhr', state.method, state.url, this.status);
      };
      reportQaPlacebet('START', 'xhr', state.method, state.url);
      this.addEventListener('load', () => finish('COMPLETE'), { once: true });
      this.addEventListener('error', () => finish('ERROR'), { once: true });
      this.addEventListener('abort', () => finish('ERROR'), { once: true });
      this.addEventListener('timeout', () => finish('ERROR'), { once: true });
    }
    return originalSend.call(this, body);
  };

  if (typeof navigator.sendBeacon === 'function') {
    const originalBeacon = navigator.sendBeacon.bind(navigator);
    navigator.sendBeacon = (url, data) => {
      const decision = blockReason(url);
      if (decision) {
        reportBlocked('POST', url, decision);
        return false;
      }
      if (allowPlacebetQa && placebetTarget(url)) {
        reportQaPlacebet('START', 'beacon', 'POST', url);
        const accepted = originalBeacon(url, data);
        reportQaPlacebet(accepted ? 'COMPLETE' : 'ERROR', 'beacon', 'POST', url);
        return accepted;
      }
      return originalBeacon(url, data);
    };
  }

  const formTarget = (form, submitter) =>
    (submitter && submitter.getAttribute && submitter.getAttribute('formaction')) ||
    form.getAttribute('action') ||
    window.location.href;
  const formMethod = (form, submitter) =>
    String(
      (submitter && submitter.getAttribute && submitter.getAttribute('formmethod')) ||
      form.getAttribute('method') ||
      'GET'
    ).toUpperCase();

  const originalSubmit = HTMLFormElement.prototype.submit;
  HTMLFormElement.prototype.submit = function() {
    const url = formTarget(this, null);
    const method = formMethod(this, null);
    const decision = blockReason(url);
    if (decision) {
      reportBlocked(method, url, decision);
      return;
    }
    if (allowPlacebetQa && placebetTarget(url)) {
      reportQaPlacebet('START', 'form', method, url);
    }
    return originalSubmit.call(this);
  };

  if (typeof HTMLFormElement.prototype.requestSubmit === 'function') {
    const originalRequestSubmit = HTMLFormElement.prototype.requestSubmit;
    HTMLFormElement.prototype.requestSubmit = function(submitter) {
      const url = formTarget(this, submitter);
      const method = formMethod(this, submitter);
      const decision = blockReason(url);
      if (decision) {
        reportBlocked(method, url, decision);
        return;
      }
      return originalRequestSubmit.call(this, submitter);
    };
  }

  document.addEventListener('submit', (event) => {
    const form = event.target;
    if (!(form instanceof HTMLFormElement)) return;
    const submitter = event.submitter || null;
    const url = formTarget(form, submitter);
    const method = formMethod(form, submitter);
    const decision = blockReason(url);
    if (decision) {
      event.preventDefault();
      event.stopImmediatePropagation();
      reportBlocked(method, url, decision);
    } else if (allowPlacebetQa && placebetTarget(url)) {
      reportQaPlacebet('START', 'form', method, url);
    }
  }, true);

  true;
})();
`;
}
