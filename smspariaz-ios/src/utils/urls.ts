export const SMSPARIAZ_URL = 'https://www.smspariaz.com/';
export const NEUTRAL_URL = 'about:blank';

export type UserAgentMode = 'DEFAULT_IOS' | 'ANDROID_RESEARCH';

// Keep this on DEFAULT_IOS for ordinary development and every production build.
export const USER_AGENT_MODE: UserAgentMode = 'DEFAULT_IOS';

export function customUserAgentForMode(mode: UserAgentMode): string | undefined {
  if (__DEV__ && mode === 'ANDROID_RESEARCH') {
    return 'SMSPARIAZAPP001';
  }

  return undefined;
}

export function isSmsPariazUrl(value: string): boolean {
  try {
    const url = new URL(value);
    const hostname = url.hostname.toLowerCase();
    return (
      url.protocol === 'https:' &&
      (hostname === 'smspariaz.com' || hostname.endsWith('.smspariaz.com'))
    );
  } catch {
    return false;
  }
}

export function isNeutralUrl(value: string): boolean {
  return value === NEUTRAL_URL || value.startsWith('about:blank');
}

export function isExternalSchemeAllowed(value: string): boolean {
  try {
    const protocol = new URL(value).protocol;
    return ['https:', 'http:', 'mailto:', 'tel:', 'sms:'].includes(protocol);
  } catch {
    return false;
  }
}

export function sanitizeUrlForDisplay(value: string): string {
  if (!value) return 'unknown';
  if (isNeutralUrl(value)) return NEUTRAL_URL;

  try {
    const url = new URL(value);
    if (!['https:', 'http:', 'mailto:', 'tel:', 'sms:'].includes(url.protocol)) {
      return `${url.protocol}//redacted`;
    }

    if (url.protocol === 'https:' || url.protocol === 'http:') {
      return `${url.protocol}//${url.host}${url.pathname}`;
    }

    return `${url.protocol}redacted`;
  } catch {
    return 'invalid-url';
  }
}

export function guardedPathForNativeNavigation(
  value: string,
  allowChecklogin = false,
  allowPlacebetQa = false,
): string | null {
  try {
    const pathname = new URL(value, SMSPARIAZ_URL).pathname.toLowerCase();
    const protectedNames = [
      ...(allowPlacebetQa ? [] : ['/placebet/']),
      '/registerremote/',
      ...(allowChecklogin ? [] : ['/checklogin/']),
    ];
    return (
      protectedNames.find(
        (name) => pathname.includes(name) || pathname.endsWith(name.slice(0, -1)),
      ) ?? null
    );
  } catch {
    return null;
  }
}
