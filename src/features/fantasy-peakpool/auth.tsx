import { useEffect, useMemo, useState, type ReactNode } from "react";
import type { Session } from "@supabase/supabase-js";
import { getOAuthRedirectUrl, getSupabaseBrowserClient, isSupabaseOAuthCallbackHash } from "../../lib/supabase";
import { FantasyAuthContext, type FantasyAuthState } from "./auth-context";

export function FantasyAuthProvider({ children }: { children: ReactNode }) {
  const client = getSupabaseBrowserClient();
  const [session, setSession] = useState<Session | null>(null);
  const [loading, setLoading] = useState(Boolean(client));
  const [error, setError] = useState<string | null>(() => {
    const failed = sessionStorage.getItem("fantasy-peakpool-oauth-error") === "1";
    sessionStorage.removeItem("fantasy-peakpool-oauth-error");
    return failed ? "Google sign-in could not be completed. Please try again." : null;
  });

  useEffect(() => {
    if (!client) return undefined;
    let active = true;
    const oauthCallback = isSupabaseOAuthCallbackHash(window.location.hash);
    void client.auth.getSession().then(({ data, error: sessionError }) => {
      if (!active) return;
      setSession(data.session);
      setError((currentError) => sessionError || (oauthCallback && !data.session)
        ? "Google sign-in could not be completed. Please try again."
        : currentError);
      setLoading(false);
      if (oauthCallback || (data.session && sessionStorage.getItem("fantasy-peakpool-return") === "1")) {
        sessionStorage.removeItem("fantasy-peakpool-return");
        window.history.replaceState(null, "", `${window.location.pathname}${window.location.search}#/peakpool`);
      }
    });
    const { data } = client.auth.onAuthStateChange((_event, nextSession) => {
      setSession(nextSession);
      setLoading(false);
    });
    return () => {
      active = false;
      data.subscription.unsubscribe();
    };
  }, [client]);

  const value = useMemo<FantasyAuthState>(() => ({
    configured: Boolean(client),
    loading,
    session,
    user: session?.user ?? null,
    error,
    signInWithGoogle: async () => {
      if (!client) return;
      setError(null);
      sessionStorage.setItem("fantasy-peakpool-return", "1");
      const { error: signInError } = await client.auth.signInWithOAuth({
        provider: "google",
        options: { redirectTo: getOAuthRedirectUrl() },
      });
      if (signInError) {
        sessionStorage.removeItem("fantasy-peakpool-return");
        setError("Google sign-in could not be started.");
      }
    },
    signOut: async () => {
      if (!client) return;
      setError(null);
      const { error: signOutError } = await client.auth.signOut();
      if (signOutError) setError("Sign out could not be completed.");
    },
  }), [client, error, loading, session]);

  return <FantasyAuthContext.Provider value={value}>{children}</FantasyAuthContext.Provider>;
}
