import { sanitizeDiagnosticText } from '@/src/utils/logger';
import { sanitizeUrlForDisplay, SMSPARIAZ_URL } from '@/src/utils/urls';
import type { WebViewMessage } from '@/src/web/webviewScripts';

export type UIStatus = {
  mobilePlaceBetExists: boolean;
  placeBetExists: boolean;
  footerBetslipExists: boolean;
  loginControlExists: boolean;
  registerControlExists: boolean;
};

export type AuthStorageStatus = {
  loginIdExists: boolean;
  phoneExists: boolean;
  tokenExists: boolean;
};

export type WebViewFailure = {
  kind: string;
  url: string;
  description: string;
  statusCode?: number;
};

export type WebViewState = {
  url: string;
  title: string;
  canGoBack: boolean;
  canGoForward: boolean;
  isLoading: boolean;
  logalertFound: boolean | null;
  mobile: number | null;
  appModeAttempt: number;
  ui: UIStatus;
  authStorage: AuthStorageStatus;
  blockedWagerCount: number;
  blockedRequestCount: number;
  qaPlacebetRequestCount: number;
  lastQaPlacebetEvent: string;
  lastDebugEvent: string;
  debugLog: string[];
  failure: WebViewFailure | null;
};

const emptyUI: UIStatus = {
  mobilePlaceBetExists: false,
  placeBetExists: false,
  footerBetslipExists: false,
  loginControlExists: false,
  registerControlExists: false,
};

const emptyAuthStorage: AuthStorageStatus = {
  loginIdExists: false,
  phoneExists: false,
  tokenExists: false,
};

export const initialWebViewState: WebViewState = {
  url: SMSPARIAZ_URL,
  title: '',
  canGoBack: false,
  canGoForward: false,
  isLoading: true,
  logalertFound: null,
  mobile: null,
  appModeAttempt: 0,
  ui: emptyUI,
  authStorage: emptyAuthStorage,
  blockedWagerCount: 0,
  blockedRequestCount: 0,
  qaPlacebetRequestCount: 0,
  lastQaPlacebetEvent: 'No QA placebet request yet',
  lastDebugEvent: 'Waiting for the first page load',
  debugLog: [],
  failure: null,
};

export type WebViewAction =
  | { type: 'PAGE_LOAD_START'; url: string }
  | {
      type: 'NAVIGATION';
      url: string;
      title: string;
      canGoBack: boolean;
      canGoForward: boolean;
      loading: boolean;
    }
  | { type: 'MESSAGE'; message: WebViewMessage }
  | { type: 'FAILURE'; failure: WebViewFailure }
  | { type: 'CLEAR_DEBUG_LOG' };

function appendDebug(state: WebViewState, event: string): Pick<WebViewState, 'lastDebugEvent' | 'debugLog'> {
  const safeEvent = sanitizeDiagnosticText(event, 220);
  return {
    lastDebugEvent: safeEvent,
    debugLog: [...state.debugLog, safeEvent].slice(-40),
  };
}

export function webViewReducer(state: WebViewState, action: WebViewAction): WebViewState {
  switch (action.type) {
    case 'PAGE_LOAD_START': {
      const event = appendDebug(state, `Loading ${sanitizeUrlForDisplay(action.url)}`);
      return {
        ...state,
        url: sanitizeUrlForDisplay(action.url),
        isLoading: true,
        logalertFound: null,
        mobile: null,
        appModeAttempt: 0,
        ui: emptyUI,
        authStorage: emptyAuthStorage,
        failure: null,
        ...event,
      };
    }

    case 'NAVIGATION':
      return {
        ...state,
        url: sanitizeUrlForDisplay(action.url),
        title: sanitizeDiagnosticText(action.title, 160),
        canGoBack: action.canGoBack,
        canGoForward: action.canGoForward,
        isLoading: action.loading,
      };

    case 'MESSAGE': {
      const { message } = action;
      switch (message.type) {
        case 'APP_MODE_STATUS': {
          const event = appendDebug(
            state,
            `App mode attempt ${message.attempt}: logalert=${message.logalertFound}, MOBILE=${String(message.mobile)}`,
          );
          return {
            ...state,
            logalertFound: message.logalertFound,
            mobile: message.mobile,
            appModeAttempt: message.attempt,
            ...event,
          };
        }

        case 'UI_STATUS':
          return {
            ...state,
            ui: {
              mobilePlaceBetExists: message.mobilePlaceBetExists,
              placeBetExists: message.placeBetExists,
              footerBetslipExists: message.footerBetslipExists,
              loginControlExists: message.loginControlExists,
              registerControlExists: message.registerControlExists,
            },
          };

        case 'AUTH_STORAGE_STATUS':
          return {
            ...state,
            authStorage: {
              loginIdExists: message.loginIdExists,
              phoneExists: message.phoneExists,
              tokenExists: message.tokenExists,
            },
          };

        case 'REQUEST_BLOCKED': {
          const isWager = message.path.toLowerCase().includes('/placebet');
          const event = appendDebug(state, `Blocked ${message.method} ${message.path}`);
          return {
            ...state,
            blockedRequestCount: state.blockedRequestCount + 1,
            blockedWagerCount: state.blockedWagerCount + (isWager ? 1 : 0),
            ...event,
          };
        }

        case 'QA_PLACEBET_EVENT': {
          const eventText = [
            `QA ${message.stage}`,
            message.transport,
            message.method,
            message.path,
            message.status === null ? '' : `HTTP ${message.status}`,
          ]
            .filter(Boolean)
            .join(' ');
          const event = appendDebug(state, eventText);
          return {
            ...state,
            qaPlacebetRequestCount:
              state.qaPlacebetRequestCount + (message.stage === 'START' ? 1 : 0),
            lastQaPlacebetEvent: eventText,
            ...event,
          };
        }

        case 'PAGE_INFO':
          return {
            ...state,
            url: sanitizeUrlForDisplay(message.url),
            title: sanitizeDiagnosticText(message.title, 160),
          };

        case 'ERROR': {
          const event = appendDebug(
            state,
            `${sanitizeDiagnosticText(message.context, 64)}: ${sanitizeDiagnosticText(message.message)}`,
          );
          return { ...state, ...event };
        }
      }
    }

    case 'FAILURE': {
      const safeFailure = {
        ...action.failure,
        url: sanitizeUrlForDisplay(action.failure.url),
        description: sanitizeDiagnosticText(action.failure.description),
      };
      const event = appendDebug(
        state,
        `${safeFailure.kind}: ${safeFailure.description}${safeFailure.statusCode ? ` (${safeFailure.statusCode})` : ''}`,
      );
      return { ...state, failure: safeFailure, isLoading: false, ...event };
    }

    case 'CLEAR_DEBUG_LOG':
      return {
        ...state,
        debugLog: [],
        lastDebugEvent: 'Debug log cleared',
      };
  }

  return state;
}
