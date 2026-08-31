import { sanitizeUrlForDisplay } from '@/src/utils/urls';

export function sanitizeDiagnosticText(value: string, maximumLength = 180): string {
  return value
    .replace(/([?&](?:token|otp|password|authorization|phone|loginid)=)[^&\s]*/gi, '$1<redacted>')
    .slice(0, maximumLength);
}

export function logNavigationDecision(kind: string, url: string): void {
  if (!__DEV__) return;
  console.info(`[SMSP DEV] ${kind}`, sanitizeUrlForDisplay(url));
}

export function logWebViewError(kind: string, url: string, description: string): void {
  if (!__DEV__) return;
  console.warn(
    `[SMSP DEV] ${kind}`,
    sanitizeUrlForDisplay(url),
    sanitizeDiagnosticText(description),
  );
}
