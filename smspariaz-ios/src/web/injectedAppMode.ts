export type AppModeInjectionOptions = {
  maxAttempts?: number;
  retryDelayMs?: number;
};

export function buildAppModeInjection({
  maxAttempts = 5,
  retryDelayMs = 400,
}: AppModeInjectionOptions = {}): string {
  const safeAttempts = Math.max(1, Math.min(10, Math.floor(maxAttempts)));
  const safeDelay = Math.max(100, Math.min(2000, Math.floor(retryDelayMs)));

  return `
(() => {
  'use strict';

  const maxAttempts = ${safeAttempts};
  const retryDelayMs = ${safeDelay};
  const runId = Number(window.__smspAppModeRunId || 0) + 1;
  window.__smspAppModeRunId = runId;
  let attempt = 0;

  const post = (message) => {
    try {
      window.ReactNativeWebView.postMessage(JSON.stringify(message));
    } catch (_) {}
  };

  const pageUrl = () => {
    try {
      const parsed = new URL(window.location.href);
      return parsed.origin + parsed.pathname;
    } catch (_) {
      return 'invalid-url';
    }
  };

  const readMobile = () => {
    if (typeof window.MOBILE === 'undefined') return null;
    const numeric = Number(window.MOBILE);
    return Number.isFinite(numeric) ? numeric : null;
  };

  const reportUI = () => {
    const links = Array.from(document.querySelectorAll('a'));
    const normalizedText = (element) => String(element.textContent || '').trim().toLowerCase();
    post({
      type: 'UI_STATUS',
      mobilePlaceBetExists: Boolean(document.querySelector('#mobile-place-bet')),
      placeBetExists: Boolean(document.querySelector('#placebet')),
      footerBetslipExists: Boolean(document.querySelector('.footer-betslip')),
      loginControlExists: links.some((link) => normalizedText(link) === 'login'),
      registerControlExists: links.some((link) => {
        const text = normalizedText(link);
        return text === 'create account' || text === 'register';
      })
    });
  };

  const reportStorageExistence = () => {
    try {
      post({
        type: 'AUTH_STORAGE_STATUS',
        loginIdExists: localStorage.getItem('loginid') !== null,
        phoneExists: localStorage.getItem('phone') !== null,
        tokenExists: localStorage.getItem('token') !== null
      });
    } catch (error) {
      post({
        type: 'ERROR',
        context: 'storage-status',
        message: String(error).slice(0, 300)
      });
    }
  };

  const reportPage = () => {
    post({
      type: 'PAGE_INFO',
      url: pageUrl(),
      title: String(document.title || '').slice(0, 160)
    });
  };

  const installUIObserver = () => {
    if (window.__smspUiObserver) {
      try { window.__smspUiObserver.disconnect(); } catch (_) {}
    }

    let reportTimer = null;
    window.__smspUiObserver = new MutationObserver(() => {
      if (reportTimer !== null) clearTimeout(reportTimer);
      reportTimer = setTimeout(() => {
        reportUI();
        reportStorageExistence();
      }, 120);
    });
    window.__smspUiObserver.observe(document.documentElement, {
      childList: true,
      subtree: true,
      attributes: true,
      attributeFilter: ['class', 'disabled']
    });
  };

  const activate = () => {
    if (window.__smspAppModeRunId !== runId) return;
    attempt += 1;

    try {
      const found = typeof window.logalert === 'function';
      if (found && readMobile() !== 1) {
        window.logalert();
      }

      const mobile = readMobile();
      post({
        type: 'APP_MODE_STATUS',
        attempt,
        logalertFound: found,
        mobile
      });
      reportPage();
      reportUI();
      reportStorageExistence();

      if (mobile === 1) {
        installUIObserver();
        return;
      }
    } catch (error) {
      post({
        type: 'ERROR',
        context: 'app-mode',
        message: String(error).slice(0, 300)
      });
    }

    if (attempt < maxAttempts) {
      setTimeout(activate, retryDelayMs);
    }
  };

  activate();
  true;
})();
`;
}
