import { verifyFantasyPeakpoolProduction } from "../server/fantasy-peakpool-production.js";

const report = await verifyFantasyPeakpoolProduction({
  siteUrl: process.env.FANTASY_PRODUCTION_SITE_URL ?? "",
  supabaseUrl: process.env.VITE_SUPABASE_URL ?? "",
  publishableKey: process.env.VITE_SUPABASE_PUBLISHABLE_KEY ?? "",
});

console.log(JSON.stringify({ ok: true, ...report }, null, 2));
