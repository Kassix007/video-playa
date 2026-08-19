import { useTheme, type ThemeMode } from "../theme/ThemeContext";

const themeOptions: Array<{ mode: ThemeMode; label: string }> = [
  { mode: "light", label: "Light" },
  { mode: "dark", label: "Dark" },
  { mode: "system", label: "Auto" },
];

export default function ThemeToggle() {
  const { mode, resolvedTheme, setMode } = useTheme();

  return (
    <div className="theme-toggle" role="group" aria-label={`Theme mode. Current theme is ${resolvedTheme}.`}>
      {themeOptions.map((option) => (
        <button
          key={option.mode}
          type="button"
          className={mode === option.mode ? "theme-toggle-option active" : "theme-toggle-option"}
          aria-pressed={mode === option.mode}
          onClick={() => setMode(option.mode)}
        >
          {option.label}
        </button>
      ))}
    </div>
  );
}
