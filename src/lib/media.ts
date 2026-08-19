export type MediaMode = "auto" | "hls" | "dash" | "native";
export type MediaKind = Exclude<MediaMode, "auto">;

export type MediaSource = {
  url: string;
  title?: string;
  mode?: MediaMode;
  referrerPolicy?: "no-referrer";
};

export function resolveMediaKind(url: string, mode: MediaMode = "auto"): MediaKind {
  if (mode !== "auto") return mode;

  const normalized = url.toLowerCase();
  const pathname = new URL(url).pathname.toLowerCase();

  if (pathname.endsWith(".m3u8") || normalized.includes(".m3u8?")) return "hls";
  if (pathname.endsWith(".mpd") || normalized.includes(".mpd?")) return "dash";
  return "native";
}

export function normalizeMediaUrl(value: string): string {
  const trimmed = value.trim();
  if (!trimmed) throw new Error("Paste a public media URL first.");

  let parsed: URL;
  try {
    parsed = new URL(trimmed);
  } catch {
    throw new Error("Enter a complete URL beginning with http:// or https://.");
  }

  if (parsed.protocol !== "http:" && parsed.protocol !== "https:") {
    throw new Error("Only HTTP and HTTPS media URLs are supported.");
  }

  if (window.location.protocol === "https:" && parsed.protocol === "http:") {
    throw new Error("This HTTP stream is blocked on a secure page. Use an HTTPS source.");
  }

  return parsed.href;
}

export function getSourceHost(url: string): string {
  try {
    return new URL(url).hostname;
  } catch {
    return "Unknown source";
  }
}
