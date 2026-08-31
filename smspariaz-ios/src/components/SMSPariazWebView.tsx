import { useCallback, useMemo, useReducer, useRef } from 'react';
import { ActivityIndicator, Alert, Linking, StyleSheet, Text, View } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { WebView, type WebViewMessageEvent, type WebViewNavigation, type WebViewProps } from 'react-native-webview';

import { DebugPanel } from '@/src/components/DebugPanel';
import { initialWebViewState, webViewReducer } from '@/src/state/webviewState';
import { logNavigationDecision, logWebViewError } from '@/src/utils/logger';
import {
  customUserAgentForMode,
  guardedPathForNativeNavigation,
  isExternalSchemeAllowed,
  isNeutralUrl,
  isSmsPariazUrl,
  NEUTRAL_URL,
  sanitizeUrlForDisplay,
  SMSPARIAZ_URL,
  USER_AGENT_MODE,
} from '@/src/utils/urls';
import { buildAppModeInjection } from '@/src/web/injectedAppMode';
import { buildRequestGuardScript, REQUEST_GUARD_CONFIG } from '@/src/web/requestGuard';
import { parseWebViewMessage } from '@/src/web/webviewScripts';

export function SMSPariazWebView() {
  const webViewRef = useRef<WebView>(null);
  const [state, dispatch] = useReducer(webViewReducer, initialWebViewState);
  const requestGuardScript = useMemo(() => buildRequestGuardScript(), []);
  const appModeScript = useMemo(() => buildAppModeInjection(), []);
  const customUserAgent = customUserAgentForMode(USER_AGENT_MODE);

  const injectNavigation = useCallback((url: string) => {
    webViewRef.current?.injectJavaScript(
      `window.location.assign(${JSON.stringify(url)}); true;`,
    );
  }, []);

  const rerunAppMode = useCallback(() => {
    webViewRef.current?.injectJavaScript(appModeScript);
  }, [appModeScript]);

  const reportNativeBlock = useCallback((url: string, method = 'NAVIGATION') => {
    const guardedPath = guardedPathForNativeNavigation(
      url,
      REQUEST_GUARD_CONFIG.allowChecklogin,
      REQUEST_GUARD_CONFIG.allowPlacebetQa,
    );
    if (!guardedPath) return false;
    dispatch({
      type: 'MESSAGE',
      message: { type: 'REQUEST_BLOCKED', method, path: guardedPath },
    });
    return true;
  }, []);

  const promptForExternalUrl = useCallback((url: string) => {
    const safeDestination = sanitizeUrlForDisplay(url);
    logNavigationDecision('external-navigation-prompt', url);
    Alert.alert(
      'Open external link?',
      safeDestination,
      [
        { text: 'Cancel', style: 'cancel' },
        {
          text: 'Open',
          onPress: async () => {
            if (!isExternalSchemeAllowed(url)) return;
            const supported = await Linking.canOpenURL(url);
            if (supported) await Linking.openURL(url);
          },
        },
      ],
      { cancelable: true },
    );
  }, []);

  const handleShouldStartLoad: NonNullable<WebViewProps['onShouldStartLoadWithRequest']> =
    useCallback(
      (request) => {
        const { url } = request;
        if (reportNativeBlock(url)) return false;
        if (isNeutralUrl(url) || isSmsPariazUrl(url)) return true;

        // Third-party frames/resources used by the public site may continue loading,
        // while an external top-level destination never silently replaces the app.
        if (request.isTopFrame === false) return true;

        if (request.navigationType === 'click' && isExternalSchemeAllowed(url)) {
          promptForExternalUrl(url);
        } else {
          logNavigationDecision('external-navigation-blocked', url);
        }
        return false;
      },
      [promptForExternalUrl, reportNativeBlock],
    );

  const handleOpenWindow: NonNullable<WebViewProps['onOpenWindow']> = useCallback(
    (event) => {
      const url = event.nativeEvent.targetUrl;
      if (reportNativeBlock(url)) return;
      if (isSmsPariazUrl(url)) {
        injectNavigation(url);
        return;
      }
      if (isExternalSchemeAllowed(url)) promptForExternalUrl(url);
    },
    [injectNavigation, promptForExternalUrl, reportNativeBlock],
  );

  const handleMessage = useCallback((event: WebViewMessageEvent) => {
    const message = parseWebViewMessage(event.nativeEvent.data);
    if (message) dispatch({ type: 'MESSAGE', message });
  }, []);

  const handleNavigation = useCallback((navigation: WebViewNavigation) => {
    dispatch({
      type: 'NAVIGATION',
      url: navigation.url,
      title: navigation.title,
      canGoBack: navigation.canGoBack,
      canGoForward: navigation.canGoForward,
      loading: navigation.loading,
    });
  }, []);

  const handleError: NonNullable<WebViewProps['onError']> = useCallback((event) => {
    const { url, description } = event.nativeEvent;
    logWebViewError('webview-error', url, description);
    dispatch({
      type: 'FAILURE',
      failure: { kind: 'WebView error', url, description },
    });
  }, []);

  const handleHttpError: NonNullable<WebViewProps['onHttpError']> = useCallback((event) => {
    const { url, description, statusCode } = event.nativeEvent;
    logWebViewError('http-error', url, `${statusCode} ${description}`);
    dispatch({
      type: 'FAILURE',
      failure: { kind: 'HTTP error', url, description, statusCode },
    });
  }, []);

  return (
    <SafeAreaView style={styles.safeArea} edges={['top', 'bottom']}>
      <DebugPanel
        state={state}
        userAgentMode={USER_AGENT_MODE}
        allowChecklogin={REQUEST_GUARD_CONFIG.allowChecklogin}
        allowPlacebetQa={REQUEST_GUARD_CONFIG.allowPlacebetQa}
        onBack={() => webViewRef.current?.goBack()}
        onForward={() => webViewRef.current?.goForward()}
        onReload={() => webViewRef.current?.reload()}
        onHome={() => injectNavigation(SMSPARIAZ_URL)}
        onNeutralPage={() => injectNavigation(NEUTRAL_URL)}
        onRerunAppMode={rerunAppMode}
        onClearLog={() => dispatch({ type: 'CLEAR_DEBUG_LOG' })}
      />

      {state.failure ? (
        <View style={styles.errorBanner}>
          <Text style={styles.errorTitle}>{state.failure.kind}</Text>
          <Text style={styles.errorText} numberOfLines={2}>
            {state.failure.statusCode ? `${state.failure.statusCode} · ` : ''}
            {state.failure.description}
          </Text>
        </View>
      ) : null}

      <WebView
        ref={webViewRef}
        source={{ uri: SMSPARIAZ_URL }}
        style={styles.webView}
        javaScriptEnabled
        domStorageEnabled
        sharedCookiesEnabled
        thirdPartyCookiesEnabled
        cacheEnabled
        incognito={false}
        allowsBackForwardNavigationGestures
        allowsInlineMediaPlayback
        javaScriptCanOpenWindowsAutomatically={false}
        setSupportMultipleWindows={false}
        allowFileAccess={false}
        mixedContentMode="never"
        originWhitelist={['https://*', 'http://*', 'about:*', 'mailto:*', 'tel:*', 'sms:*']}
        userAgent={customUserAgent}
        injectedJavaScriptBeforeContentLoaded={requestGuardScript}
        injectedJavaScriptBeforeContentLoadedForMainFrameOnly={false}
        onShouldStartLoadWithRequest={handleShouldStartLoad}
        onOpenWindow={handleOpenWindow}
        onMessage={handleMessage}
        onLoadStart={(event) =>
          dispatch({ type: 'PAGE_LOAD_START', url: event.nativeEvent.url })
        }
        onLoadEnd={rerunAppMode}
        onNavigationStateChange={handleNavigation}
        onError={handleError}
        onHttpError={handleHttpError}
        onContentProcessDidTerminate={() => webViewRef.current?.reload()}
        startInLoadingState
        renderLoading={() => (
          <View style={styles.loading}>
            <ActivityIndicator size="large" color="#0f766e" />
            <Text style={styles.loadingText}>Loading SMSPariaz…</Text>
          </View>
        )}
      />
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  safeArea: {
    flex: 1,
    backgroundColor: '#020617',
  },
  webView: {
    flex: 1,
    backgroundColor: '#ffffff',
  },
  loading: {
    ...StyleSheet.absoluteFillObject,
    alignItems: 'center',
    justifyContent: 'center',
    gap: 10,
    backgroundColor: '#ffffff',
  },
  loadingText: {
    color: '#334155',
    fontSize: 14,
  },
  errorBanner: {
    borderBottomColor: '#fecaca',
    borderBottomWidth: 1,
    backgroundColor: '#fff1f2',
    paddingHorizontal: 12,
    paddingVertical: 7,
  },
  errorTitle: {
    color: '#9f1239',
    fontSize: 12,
    fontWeight: '800',
  },
  errorText: {
    color: '#881337',
    fontSize: 11,
  },
});
