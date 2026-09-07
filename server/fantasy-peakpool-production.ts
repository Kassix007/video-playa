export type ProductionSmokeConfig = {
  siteUrl: string;
  supabaseUrl: string;
  publishableKey: string;
  fetchImpl?: typeof fetch;
};

export type ProductionSmokeReport = {
  site: { url: string; status: number };
  anonymousBootstrap: { url: string; status: number; races: number; leaderboard: number };
  protectedSync: { url: string; status: 401 };
};

function productionOrigin(value: string, label: string): URL {
  let url: URL;
  try {
    url = new URL(value);
  } catch {
    throw new Error(`${label}_INVALID_URL`);
  }
  if (url.protocol !== "https:" || url.username || url.password || url.search || url.hash) {
    throw new Error(`${label}_HTTPS_ORIGIN_REQUIRED`);
  }
  url.pathname = "/";
  return url;
}

async function readJson(response: Response, code: string): Promise<Record<string, unknown>> {
  const contentType = response.headers.get("content-type") ?? "";
  if (!contentType.toLowerCase().includes("application/json")) throw new Error(`${code}_NOT_JSON`);
  const value: unknown = await response.json();
  if (!value || typeof value !== "object" || Array.isArray(value)) throw new Error(`${code}_INVALID_BODY`);
  return value as Record<string, unknown>;
}

export async function verifyFantasyPeakpoolProduction(config: ProductionSmokeConfig): Promise<ProductionSmokeReport> {
  const site = productionOrigin(config.siteUrl, "SITE");
  const supabase = productionOrigin(config.supabaseUrl, "SUPABASE");
  const publishableKey = config.publishableKey.trim();
  if (!publishableKey || /secret|service_role/i.test(publishableKey)) throw new Error("PUBLISHABLE_KEY_REQUIRED");
  const fetchImpl = config.fetchImpl ?? fetch;

  const siteResponse = await fetchImpl(site, { method: "GET", redirect: "follow" });
  if (!siteResponse.ok) throw new Error(`SITE_UNAVAILABLE_${siteResponse.status}`);
  const siteType = siteResponse.headers.get("content-type") ?? "";
  const siteBody = await siteResponse.text();
  if (!siteType.toLowerCase().includes("text/html") || !siteBody.includes('id="root"')) {
    throw new Error("SITE_APP_SHELL_MISSING");
  }

  const bootstrapUrl = new URL("rest/v1/rpc/get_fantasy_peakpool_bootstrap", supabase);
  const bootstrapResponse = await fetchImpl(bootstrapUrl, {
    method: "POST",
    headers: {
      apikey: publishableKey,
      authorization: `Bearer ${publishableKey}`,
      "content-type": "application/json",
    },
    body: "{}",
    redirect: "error",
  });
  if (!bootstrapResponse.ok) throw new Error(`ANONYMOUS_BOOTSTRAP_UNAVAILABLE_${bootstrapResponse.status}`);
  const bootstrap = await readJson(bootstrapResponse, "ANONYMOUS_BOOTSTRAP");
  if (bootstrap.profile !== null || bootstrap.wallet !== null) throw new Error("ANONYMOUS_PRIVATE_DATA_EXPOSED");
  if (!Array.isArray(bootstrap.races) || !Array.isArray(bootstrap.leaderboard)) {
    throw new Error("ANONYMOUS_BOOTSTRAP_CONTRACT_MISMATCH");
  }

  const syncUrl = new URL("api/fantasy-peakpool/sync", site);
  const syncResponse = await fetchImpl(syncUrl, {
    method: "POST",
    headers: { "content-type": "application/json" },
    body: "{}",
    redirect: "error",
  });
  if (syncResponse.status !== 401) throw new Error(`SYNC_AUTH_BOUNDARY_FAILED_${syncResponse.status}`);

  return {
    site: { url: site.origin, status: siteResponse.status },
    anonymousBootstrap: {
      url: bootstrapUrl.toString(),
      status: bootstrapResponse.status,
      races: bootstrap.races.length,
      leaderboard: bootstrap.leaderboard.length,
    },
    protectedSync: { url: syncUrl.toString(), status: 401 },
  };
}
