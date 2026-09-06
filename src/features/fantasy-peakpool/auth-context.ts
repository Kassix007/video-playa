import { createContext, useContext } from "react";
import type { Session, User } from "@supabase/supabase-js";

export type FantasyAuthState = {
  configured: boolean;
  loading: boolean;
  session: Session | null;
  user: User | null;
  error: string | null;
  signInWithGoogle: () => Promise<void>;
  signOut: () => Promise<void>;
};

export const FantasyAuthContext = createContext<FantasyAuthState | null>(null);

export function useFantasyAuth(): FantasyAuthState {
  const context = useContext(FantasyAuthContext);
  if (!context) throw new Error("useFantasyAuth must be used inside FantasyAuthProvider.");
  return context;
}
