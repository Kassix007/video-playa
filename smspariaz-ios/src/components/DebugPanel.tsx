import { useState } from 'react';
import { Pressable, ScrollView, StyleSheet, Text, View } from 'react-native';

import { BrowserToolbar } from '@/src/components/BrowserToolbar';
import type { WebViewState } from '@/src/state/webviewState';
import type { UserAgentMode } from '@/src/utils/urls';

type DebugPanelProps = {
  state: WebViewState;
  userAgentMode: UserAgentMode;
  allowChecklogin: boolean;
  allowPlacebetQa: boolean;
  onBack: () => void;
  onForward: () => void;
  onReload: () => void;
  onHome: () => void;
  onNeutralPage: () => void;
  onRerunAppMode: () => void;
  onClearLog: () => void;
};

function yesNo(value: boolean | null): string {
  if (value === null) return 'UNKNOWN';
  return value ? 'YES' : 'NO';
}

function StatusRow({ label, value }: { label: string; value: string }) {
  return (
    <View style={styles.row}>
      <Text style={styles.label}>{label}</Text>
      <Text selectable style={styles.value} numberOfLines={2}>
        {value}
      </Text>
    </View>
  );
}

function ActionButton({ label, onPress }: { label: string; onPress: () => void }) {
  return (
    <Pressable
      accessibilityRole="button"
      onPress={onPress}
      style={({ pressed }) => [styles.actionButton, pressed && styles.actionButtonPressed]}>
      <Text style={styles.actionText}>{label}</Text>
    </Pressable>
  );
}

export function DebugPanel({
  state,
  userAgentMode,
  allowChecklogin,
  allowPlacebetQa,
  onBack,
  onForward,
  onReload,
  onHome,
  onNeutralPage,
  onRerunAppMode,
  onClearLog,
}: DebugPanelProps) {
  const [expanded, setExpanded] = useState(true);
  const appModeActive = state.mobile === 1;

  return (
    <View style={styles.panel}>
      <Pressable
        accessibilityRole="button"
        accessibilityState={{ expanded }}
        onPress={() => setExpanded((current) => !current)}
        style={styles.header}>
        <Text style={styles.headerText}>DEBUG {expanded ? '▲' : '▼'}</Text>
        <Text style={[styles.modeBadge, appModeActive ? styles.active : styles.inactive]}>
          APP MODE {appModeActive ? 'ACTIVE' : 'INACTIVE'}
        </Text>
      </Pressable>

      {expanded ? (
        <ScrollView style={styles.scroll} contentContainerStyle={styles.content}>
          <StatusRow label="Current URL" value={state.url} />
          <StatusRow label="Page title" value={state.title || '—'} />
          <StatusRow label="UA mode" value={`${userAgentMode}${userAgentMode === 'ANDROID_RESEARCH' ? ' (Research only)' : ''}`} />
          <StatusRow label="logalert found" value={yesNo(state.logalertFound)} />
          <StatusRow label="MOBILE" value={state.mobile === null ? 'null' : String(state.mobile)} />
          <StatusRow label="Activation attempt" value={String(state.appModeAttempt)} />
          <StatusRow label="App mode active" value={yesNo(appModeActive)} />
          <StatusRow label="#mobile-place-bet" value={yesNo(state.ui.mobilePlaceBetExists)} />
          <StatusRow label="#placebet" value={yesNo(state.ui.placeBetExists)} />
          <StatusRow label=".footer-betslip" value={yesNo(state.ui.footerBetslipExists)} />
          <StatusRow label="Login control" value={yesNo(state.ui.loginControlExists)} />
          <StatusRow label="Register control" value={yesNo(state.ui.registerControlExists)} />
          <StatusRow label="loginid exists" value={yesNo(state.authStorage.loginIdExists)} />
          <StatusRow label="phone exists" value={yesNo(state.authStorage.phoneExists)} />
          <StatusRow label="token exists" value={yesNo(state.authStorage.tokenExists)} />
          <StatusRow label="Blocked non-QA wagers" value={String(state.blockedWagerCount)} />
          <StatusRow label="All guarded blocks" value={String(state.blockedRequestCount)} />
          <StatusRow label="checklogin allowed" value={yesNo(allowChecklogin)} />
          <StatusRow label="QA placebet allowed" value={yesNo(allowPlacebetQa)} />
          <StatusRow label="QA placebet requests" value={String(state.qaPlacebetRequestCount)} />
          <StatusRow label="Last QA event" value={state.lastQaPlacebetEvent} />
          <StatusRow label="Last debug event" value={state.lastDebugEvent} />

          <BrowserToolbar
            canGoBack={state.canGoBack}
            canGoForward={state.canGoForward}
            isLoading={state.isLoading}
            onBack={onBack}
            onForward={onForward}
            onReload={onReload}
            onHome={onHome}
          />

          <View style={styles.actions}>
            <ActionButton label="Re-run App Mode" onPress={onRerunAppMode} />
            <ActionButton label="Neutral Page" onPress={onNeutralPage} />
            <ActionButton label="Clear Debug Log" onPress={onClearLog} />
          </View>
        </ScrollView>
      ) : null}
    </View>
  );
}

const styles = StyleSheet.create({
  panel: {
    backgroundColor: '#020617',
    borderBottomColor: '#334155',
    borderBottomWidth: 1,
  },
  header: {
    minHeight: 42,
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    paddingHorizontal: 12,
  },
  headerText: {
    color: '#f8fafc',
    fontSize: 13,
    fontWeight: '800',
    letterSpacing: 0.8,
  },
  modeBadge: {
    overflow: 'hidden',
    borderRadius: 999,
    paddingHorizontal: 9,
    paddingVertical: 4,
    color: '#ffffff',
    fontSize: 10,
    fontWeight: '800',
  },
  active: {
    backgroundColor: '#15803d',
  },
  inactive: {
    backgroundColor: '#9f1239',
  },
  scroll: {
    maxHeight: 340,
  },
  content: {
    paddingHorizontal: 12,
    paddingBottom: 12,
  },
  row: {
    flexDirection: 'row',
    alignItems: 'flex-start',
    borderTopColor: '#1e293b',
    borderTopWidth: StyleSheet.hairlineWidth,
    paddingVertical: 4,
  },
  label: {
    width: 132,
    color: '#94a3b8',
    fontSize: 11,
  },
  value: {
    flex: 1,
    color: '#e2e8f0',
    fontSize: 11,
    fontWeight: '600',
  },
  actions: {
    flexDirection: 'row',
    flexWrap: 'wrap',
    gap: 6,
    marginTop: 8,
  },
  actionButton: {
    minHeight: 34,
    justifyContent: 'center',
    borderRadius: 8,
    backgroundColor: '#0f766e',
    paddingHorizontal: 10,
  },
  actionButtonPressed: {
    backgroundColor: '#115e59',
  },
  actionText: {
    color: '#f0fdfa',
    fontSize: 12,
    fontWeight: '700',
  },
});
