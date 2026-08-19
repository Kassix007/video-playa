const API_BASE = "https://iptv-org.github.io/api";

type RawStream = {
  channel: string | null;
  feed: string | null;
  label: string | null;
  quality: string | null;
  referrer: string | null;
  title: string;
  url: string;
  user_agent: string | null;
};

type RawCountry = {
  code: string;
  flag: string;
  name: string;
};

type RawBlocklistEntry = {
  channel: string;
  reason: string;
};

export type IptvCountry = {
  code: string;
  flag: string;
  name: string;
};

export type IptvStream = {
  channelId: string | null;
  countryCode: string;
  feed: string | null;
  label: string | null;
  quality: string | null;
  title: string;
  url: string;
};

export type IptvCatalog = {
  countries: Map<string, IptvCountry>;
  streams: IptvStream[];
};

export function getIptvStreamIdentity(stream: IptvStream): string {
  if (stream.channelId) return `channel:${stream.channelId}|feed:${stream.feed || "main"}`;
  return `title:${stream.title.trim().toLocaleLowerCase()}`;
}

export function getEquivalentIptvStreams(
  streams: readonly IptvStream[],
  selected: IptvStream,
): IptvStream[] {
  const identity = getIptvStreamIdentity(selected);
  return [
    selected,
    ...streams.filter(
      (stream) => stream.url !== selected.url && getIptvStreamIdentity(stream) === identity,
    ),
  ];
}

export function hasIptvAvailabilityWarning(stream: IptvStream): boolean {
  return Boolean(stream.label?.trim());
}

async function fetchJson<T>(path: string, signal: AbortSignal): Promise<T> {
  const response = await fetch(`${API_BASE}/${path}`, { signal });
  if (!response.ok) throw new Error(`IPTV.org returned ${response.status} for ${path}.`);
  return response.json() as Promise<T>;
}

function deriveCountryCode(channelId: string | null): string {
  if (!channelId) return "UNKNOWN";
  const match = channelId.match(/\.([a-z]{2})$/i);
  return match?.[1]?.toUpperCase() || "UNKNOWN";
}

export async function loadIptvCatalog(signal: AbortSignal): Promise<IptvCatalog> {
  const [rawStreams, rawCountries, rawBlocklist] = await Promise.all([
    fetchJson<RawStream[]>("streams.json", signal),
    fetchJson<RawCountry[]>("countries.json", signal),
    fetchJson<RawBlocklistEntry[]>("blocklist.json", signal),
  ]);

  const countries = new Map<string, IptvCountry>(
    rawCountries.map((country) => [country.code.toUpperCase(), country]),
  );
  countries.set("UNKNOWN", { code: "UNKNOWN", flag: "◌", name: "Unknown" });

  const blockedChannels = new Set(rawBlocklist.map((entry) => entry.channel));
  const seenUrls = new Set<string>();
  const securePage = window.location.protocol === "https:";

  const streams = rawStreams.flatMap<IptvStream>((stream) => {
    if (!stream.url || !stream.title || stream.referrer || stream.user_agent) return [];
    if (stream.channel && blockedChannels.has(stream.channel)) return [];
    const title = stream.title.trim();
    if (!/^[\p{L}\p{N}]/u.test(title) || (title.match(/\p{L}/gu) || []).length < 2) return [];

    let parsed: URL;
    try {
      parsed = new URL(stream.url);
    } catch {
      return [];
    }

    if (parsed.protocol !== "http:" && parsed.protocol !== "https:") return [];
    if (securePage && parsed.protocol !== "https:") return [];
    if (seenUrls.has(parsed.href)) return [];
    seenUrls.add(parsed.href);

    return [{
      channelId: stream.channel,
      countryCode: deriveCountryCode(stream.channel),
      feed: stream.feed,
      label: stream.label,
      quality: stream.quality,
      title,
      url: parsed.href,
    }];
  });

  streams.sort((left, right) => left.title.localeCompare(right.title));
  return { countries, streams };
}
