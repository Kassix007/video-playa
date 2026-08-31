import { Pressable, StyleSheet, Text, View } from 'react-native';

type BrowserToolbarProps = {
  canGoBack: boolean;
  canGoForward: boolean;
  isLoading: boolean;
  onBack: () => void;
  onForward: () => void;
  onReload: () => void;
  onHome: () => void;
};

type ToolbarButtonProps = {
  label: string;
  disabled?: boolean;
  onPress: () => void;
};

function ToolbarButton({ label, disabled = false, onPress }: ToolbarButtonProps) {
  return (
    <Pressable
      accessibilityRole="button"
      disabled={disabled}
      onPress={onPress}
      style={({ pressed }) => [
        styles.button,
        disabled && styles.buttonDisabled,
        pressed && !disabled && styles.buttonPressed,
      ]}>
      <Text style={[styles.buttonText, disabled && styles.buttonTextDisabled]}>{label}</Text>
    </Pressable>
  );
}

export function BrowserToolbar({
  canGoBack,
  canGoForward,
  isLoading,
  onBack,
  onForward,
  onReload,
  onHome,
}: BrowserToolbarProps) {
  return (
    <View style={styles.container}>
      <ToolbarButton label="Back" disabled={!canGoBack} onPress={onBack} />
      <ToolbarButton label="Forward" disabled={!canGoForward} onPress={onForward} />
      <ToolbarButton label={isLoading ? 'Loading…' : 'Reload'} onPress={onReload} />
      <ToolbarButton label="Home" onPress={onHome} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flexDirection: 'row',
    flexWrap: 'wrap',
    gap: 6,
    marginTop: 8,
  },
  button: {
    minHeight: 34,
    minWidth: 68,
    alignItems: 'center',
    justifyContent: 'center',
    borderRadius: 8,
    borderWidth: 1,
    borderColor: '#475569',
    backgroundColor: '#1e293b',
    paddingHorizontal: 10,
  },
  buttonPressed: {
    backgroundColor: '#334155',
  },
  buttonDisabled: {
    borderColor: '#273449',
    backgroundColor: '#111827',
  },
  buttonText: {
    color: '#f8fafc',
    fontSize: 12,
    fontWeight: '600',
  },
  buttonTextDisabled: {
    color: '#64748b',
  },
});
