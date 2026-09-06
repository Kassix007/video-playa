import { createClient, type SupabaseClient } from "@supabase/supabase-js";

type BrowserEnv = Record<string, string | boolean | undefined>;

type OAuthCallbackClient = {
  auth: {
    exchangeCodeForSession(code: string): Promise<{ error: unknown }>;
  };
};

type OAuthCallbackOptions = {
  client?: OAuthCallbackClient | null;
  history?: Pick<History, "replaceState">;
  location?: Pick<Location, "pathname" | "search">;
  storage?: Pick<Storage, "getItem" | "removeItem" | "setItem">;
};

export type SupabaseBrowserConfig = {
  url: string;
  publishableKey: string;
};

export function isSupabaseOAuthCallbackHash(hash: string): boolean {
  const fragment = hash.startsWith("#/") ? hash.slice(2) : hash.startsWith("#") ? hash.slice(1) : hash;
  return /^(?:access_token|error)=/.test(fragment);
}

export async function completeSupabaseOAuthCodeCallback(options: OAuthCallbackOptions = {}): Promise<boolean> {
  const callbackLocation = options.location ?? window.location;
  const callbackHistory = options.history ?? window.history;
  const callbackStorage = options.storage ?? window.sessionStorage;
  if (callbackStorage.getItem("fantasy-peakpool-return") !== "1") return false;

  const params = new URLSearchParams(callbackLocation.search);
  const code = params.get("code");
  const providerError = params.has("error");
  if (!code && !providerError) return false;

  let failed = providerError;
  if (code) {
    const client = options.client ?? getSupabaseBrowserClient();
    failed = !client || Boolean((await client.auth.exchangeCodeForSession(code)).error);
  }

  callbackStorage.removeItem("fantasy-peakpool-return");
  if (failed) callbackStorage.setItem("fantasy-peakpool-oauth-error", "1");
  callbackHistory.replaceState(null, "", `${callbackLocation.pathname}#/peakpool`);
  return true;
}

export function readSupabaseBrowserConfig(env: BrowserEnv): SupabaseBrowserConfig | null {
  const url = typeof env.VITE_SUPABASE_URL === "string" ? env.VITE_SUPABASE_URL.trim() : "";
  const publishableKey = typeof env.VITE_SUPABASE_PUBLISHABLE_KEY === "string"
    ? env.VITE_SUPABASE_PUBLISHABLE_KEY.trim()
    : "";
  if (!url && !publishableKey) return null;
  if (!url || !publishableKey) throw new Error("Both browser Supabase variables are required.");
  const parsed = new URL(url);
  const loopbackHttp = parsed.protocol === "http:" && (parsed.hostname === "127.0.0.1" || parsed.hostname === "localhost");
  if ((!loopbackHttp && parsed.protocol !== "https:") || parsed.username || parsed.password || parsed.pathname !== "/" || parsed.search || parsed.hash) {
    throw new Error("The browser Supabase URL must be a bare HTTPS project origin or a loopback HTTP origin for local development.");
  }
  if (!publishableKey.startsWith("sb_publishable_") && !publishableKey.startsWith("eyJ")) {
    throw new Error("Only a Supabase publishable/legacy anon key may be used in browser code.");
  }
  return { url: parsed.origin, publishableKey };
}

let browserClient: SupabaseClient | null | undefined;

export function getSupabaseBrowserClient(): SupabaseClient | null {
  if (browserClient !== undefined) return browserClient;
  const config = readSupabaseBrowserConfig((import.meta as unknown as { env?: BrowserEnv }).env ?? {});
  browserClient = config
    ? createClient(config.url, config.publishableKey, {
      auth: { persistSession: true, autoRefreshToken: true, detectSessionInUrl: false, flowType: "pkce" },
    })
    : null;
  return browserClient;
}

export function getOAuthRedirectUrl(location: Pick<Location, "origin"> = window.location): string {
  return new URL("/", location.origin).toString();
}
