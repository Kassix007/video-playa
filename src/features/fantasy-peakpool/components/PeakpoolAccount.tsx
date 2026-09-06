import { useFantasyAuth } from "../auth-context";

function displayIdentity(metadata: Record<string, unknown>): { name: string; avatar?: string } {
  const name = [metadata.full_name, metadata.name].find((value) => typeof value === "string" && value.trim());
  const avatar = typeof metadata.avatar_url === "string" && metadata.avatar_url.startsWith("https://")
    ? metadata.avatar_url
    : undefined;
  return { name: typeof name === "string" ? name : "Fantasy player", ...(avatar ? { avatar } : {}) };
}

export default function PeakpoolAccount() {
  const auth = useFantasyAuth();
  if (!auth.configured) {
    return <p className="peakpool-account-status" role="status">Fantasy backend setup required</p>;
  }
  if (auth.loading) return <p className="peakpool-account-status" role="status">Restoring session…</p>;
  if (!auth.user) {
    return (
      <div className="peakpool-account-stack">
        <button className="peakpool-primary-button" onClick={() => void auth.signInWithGoogle()} type="button">
          Sign in with Google
        </button>
        {auth.error && <p className="peakpool-error" role="alert">{auth.error}</p>}
      </div>
    );
  }
  const identity = displayIdentity(auth.user.user_metadata);
  return (
    <div className="peakpool-account">
      {identity.avatar && <img alt="" className="peakpool-avatar" referrerPolicy="no-referrer" src={identity.avatar} />}
      <span>{identity.name}</span>
      <button className="peakpool-secondary-button" onClick={() => void auth.signOut()} type="button">Sign out</button>
    </div>
  );
}
