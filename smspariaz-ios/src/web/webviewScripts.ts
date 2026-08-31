export type AppModeStatusMessage = {
  type: 'APP_MODE_STATUS';
  attempt: number;
  logalertFound: boolean;
  mobile: number | null;
};

export type UIStatusMessage = {
  type: 'UI_STATUS';
  mobilePlaceBetExists: boolean;
  placeBetExists: boolean;
  footerBetslipExists: boolean;
  loginControlExists: boolean;
  registerControlExists: boolean;
};

export type AuthStorageStatusMessage = {
  type: 'AUTH_STORAGE_STATUS';
  loginIdExists: boolean;
  phoneExists: boolean;
  tokenExists: boolean;
};

export type RequestBlockedMessage = {
  type: 'REQUEST_BLOCKED';
  method: string;
  path: string;
};

export type QaPlacebetEventMessage = {
  type: 'QA_PLACEBET_EVENT';
  stage: 'START' | 'COMPLETE' | 'ERROR';
  transport: 'fetch' | 'xhr' | 'beacon' | 'form';
  method: string;
  path: string;
  status: number | null;
};

export type PageInfoMessage = {
  type: 'PAGE_INFO';
  url: string;
  title: string;
};

export type WebViewErrorMessage = {
  type: 'ERROR';
  context: string;
  message: string;
};

export type WebViewMessage =
  | AppModeStatusMessage
  | UIStatusMessage
  | AuthStorageStatusMessage
  | RequestBlockedMessage
  | QaPlacebetEventMessage
  | PageInfoMessage
  | WebViewErrorMessage;

function isRecord(value: unknown): value is Record<string, unknown> {
  return typeof value === 'object' && value !== null;
}

function isBoolean(value: unknown): value is boolean {
  return typeof value === 'boolean';
}

function isNullableNumber(value: unknown): value is number | null {
  return value === null || (typeof value === 'number' && Number.isFinite(value));
}

export function parseWebViewMessage(raw: string): WebViewMessage | null {
  if (!raw || raw.length > 4096) return null;

  let value: unknown;
  try {
    value = JSON.parse(raw);
  } catch {
    return null;
  }

  if (!isRecord(value) || typeof value.type !== 'string') return null;

  switch (value.type) {
    case 'APP_MODE_STATUS':
      if (
        typeof value.attempt === 'number' &&
        Number.isInteger(value.attempt) &&
        isBoolean(value.logalertFound) &&
        isNullableNumber(value.mobile)
      ) {
        return value as AppModeStatusMessage;
      }
      return null;

    case 'UI_STATUS':
      if (
        isBoolean(value.mobilePlaceBetExists) &&
        isBoolean(value.placeBetExists) &&
        isBoolean(value.footerBetslipExists) &&
        isBoolean(value.loginControlExists) &&
        isBoolean(value.registerControlExists)
      ) {
        return value as UIStatusMessage;
      }
      return null;

    case 'AUTH_STORAGE_STATUS':
      if (
        isBoolean(value.loginIdExists) &&
        isBoolean(value.phoneExists) &&
        isBoolean(value.tokenExists)
      ) {
        return value as AuthStorageStatusMessage;
      }
      return null;

    case 'REQUEST_BLOCKED':
      if (
        typeof value.method === 'string' &&
        value.method.length <= 12 &&
        typeof value.path === 'string' &&
        value.path.length <= 160
      ) {
        return value as RequestBlockedMessage;
      }
      return null;

    case 'QA_PLACEBET_EVENT':
      if (
        ['START', 'COMPLETE', 'ERROR'].includes(String(value.stage)) &&
        ['fetch', 'xhr', 'beacon', 'form'].includes(String(value.transport)) &&
        typeof value.method === 'string' &&
        value.method.length <= 12 &&
        typeof value.path === 'string' &&
        value.path.length <= 160 &&
        (value.status === null ||
          (typeof value.status === 'number' && Number.isInteger(value.status)))
      ) {
        return value as QaPlacebetEventMessage;
      }
      return null;

    case 'PAGE_INFO':
      if (
        typeof value.url === 'string' &&
        value.url.length <= 512 &&
        typeof value.title === 'string' &&
        value.title.length <= 160
      ) {
        return value as PageInfoMessage;
      }
      return null;

    case 'ERROR':
      if (
        typeof value.context === 'string' &&
        value.context.length <= 64 &&
        typeof value.message === 'string' &&
        value.message.length <= 512
      ) {
        return value as WebViewErrorMessage;
      }
      return null;

    default:
      return null;
  }
}
