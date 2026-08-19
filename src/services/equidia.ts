import type { MediaSource } from "../lib/media";

export const EQUIDIA_MASTER_URL =
  "https://raw.githubusercontent.com/Paradise-91/ParaTV/main/streams/equidia/live2.m3u8";

export const EQUIDIA_SOURCE: MediaSource = {
  mode: "hls",
  referrerPolicy: "no-referrer",
  title: "Equidia Live",
  url: EQUIDIA_MASTER_URL,
};

export type EquidiaVariant = {
  bandwidth: number | null;
  height: number | null;
  label: string;
  url: string;
  width: number | null;
};

export type EquidiaAudioRendition = {
  isDefault: boolean;
  language: string | null;
  name: string;
  url: string | null;
};

export type EquidiaManifest = {
  audio: EquidiaAudioRendition | null;
  refreshNote: string | null;
  variants: EquidiaVariant[];
};

function parseAttributes(value: string): Map<string, string> {
  const attributes = new Map<string, string>();
  const pattern = /([A-Z0-9-]+)=("[^"]*"|[^,]*)/gi;

  for (const match of value.matchAll(pattern)) {
    const rawValue = match[2];
    attributes.set(match[1].toUpperCase(), rawValue.startsWith('"') ? rawValue.slice(1, -1) : rawValue);
  }

  return attributes;
}

function parsePositiveInteger(value: string | undefined): number | null {
  if (!value) return null;
  const parsed = Number.parseInt(value, 10);
  return Number.isFinite(parsed) && parsed > 0 ? parsed : null;
}

function resolveManifestUrl(value: string | undefined, masterUrl: string): string | null {
  if (!value) return null;

  try {
    return new URL(value, masterUrl).href;
  } catch {
    return null;
  }
}

export function parseEquidiaManifest(text: string, masterUrl = EQUIDIA_MASTER_URL): EquidiaManifest {
  const lines = text.split(/\r?\n/).map((line) => line.trim());
  if (lines.find((line) => line.length > 0) !== "#EXTM3U") {
    throw new Error("The Equidia source did not return an HLS manifest.");
  }

  const audioRenditions: EquidiaAudioRendition[] = [];
  const variants: EquidiaVariant[] = [];
  let refreshNote: string | null = null;

  for (let index = 0; index < lines.length; index += 1) {
    const line = lines[index];

    if (/^#\s*last refreshed on\b/i.test(line)) {
      refreshNote = line.replace(/^#\s*/, "");
      continue;
    }

    if (line.startsWith("#EXT-X-MEDIA:")) {
      const attributes = parseAttributes(line.slice("#EXT-X-MEDIA:".length));
      if (attributes.get("TYPE") !== "AUDIO") continue;

      audioRenditions.push({
        isDefault: attributes.get("DEFAULT") === "YES",
        language: attributes.get("LANGUAGE") || null,
        name: attributes.get("NAME") || "Primary audio",
        url: resolveManifestUrl(attributes.get("URI"), masterUrl),
      });
      continue;
    }

    if (!line.startsWith("#EXT-X-STREAM-INF:")) continue;

    const attributes = parseAttributes(line.slice("#EXT-X-STREAM-INF:".length));
    const resolution = attributes.get("RESOLUTION")?.match(/^(\d+)x(\d+)$/i);
    const width = parsePositiveInteger(resolution?.[1]);
    const height = parsePositiveInteger(resolution?.[2]);
    let uri: string | undefined;

    for (let nextIndex = index + 1; nextIndex < lines.length; nextIndex += 1) {
      const candidate = lines[nextIndex];
      if (!candidate || candidate.startsWith("#")) continue;
      uri = candidate;
      index = nextIndex;
      break;
    }

    const url = resolveManifestUrl(uri, masterUrl);
    if (!url) continue;

    variants.push({
      bandwidth: parsePositiveInteger(attributes.get("BANDWIDTH")),
      height,
      label: height ? `${height}p` : `Tier ${variants.length + 1}`,
      url,
      width,
    });
  }

  if (variants.length === 0) {
    throw new Error("The Equidia master did not advertise any video variants.");
  }

  return {
    audio: audioRenditions.find((item) => item.isDefault) || audioRenditions[0] || null,
    refreshNote,
    variants,
  };
}

export async function loadEquidiaManifest(signal?: AbortSignal): Promise<EquidiaManifest> {
  const response = await fetch(EQUIDIA_MASTER_URL, {
    cache: "no-store",
    headers: { Accept: "application/vnd.apple.mpegurl, application/x-mpegURL, text/plain" },
    signal,
  });

  if (!response.ok) {
    throw new Error(`The community manifest returned ${response.status}.`);
  }

  return parseEquidiaManifest(await response.text());
}
