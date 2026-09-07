import { SmspariazAppBetService } from "./smspariaz-app-bet.js";
import { parseSmspariazConfig } from "./smspariaz-config.js";
import { parseSmsfootballProgramme, type SmspariazFootballClient } from "./smspariaz-football.js";
import { SmspariazSubsystem } from "./smspariaz-mcp.js";
import { createSmspariazObservability } from "./smspariaz-observability.js";
import { MemorySmspariazPreparedBetStore } from "./smspariaz-prepared-store.js";
import type { SmspariazProviderClient } from "./smspariaz-provider.js";
import { MemorySmspariazSessionStore } from "./smspariaz-session-store.js";
import { SAMPLE_ODDS_FRAGMENT, SAMPLE_ODDS_METADATA } from "./test-fixtures/smspariaz/flow-fixtures.js";

export function createTestSmspariazSubsystem(options: { validSession?: boolean; lines?: string[] } = {}) {
  const config = parseSmspariazConfig({
    SMSPARIAZ_SESSION_ENCRYPTION_KEY: Buffer.alloc(32, 14).toString("base64"),
    SMSPARIAZ_APP_BET_ENABLED: "true",
  });
  const store = new MemorySmspariazSessionStore();
  const programme = parseSmsfootballProgramme(SAMPLE_ODDS_METADATA, [SAMPLE_ODDS_FRAGMENT]);
  const provider = {
    startLogin: async (phone: string, referrer = "") => ({ phone, referrer, cookies: [], requested_at: "2026-09-01T10:00:00.000Z", expires_at: "2026-09-01T10:10:00.000Z" }),
    confirmOtp: async () => ({ login_id: "42", phone: "23050000000", token: "SENTINEL_TOKEN", cookies: [] }),
    checkLogin: async () => options.validSession ?? true,
    verifyAppFlow: async () => ({ valid: true, fingerprint: "f".repeat(64), observed: { site: "a".repeat(64), footballMobile: "b".repeat(64), rootMobile: "c".repeat(64) } }),
    postProviderForm: async (path: string) => path.includes("validatebet")
      ? { text: '<input id="bookcode" value="BOOK123">', cookies: [] }
      : { text: JSON.stringify({ status: 0, reply: { message: "Accepted", webmessage: "Reference APP-7", reference: "APP-7" } }), cookies: [] },
  };
  const football = { getProgramme: async () => programme };
  const telemetry = createSmspariazObservability((line) => options.lines?.push(line));
  const appBet = new SmspariazAppBetService(config, provider, football, new MemorySmspariazPreparedBetStore(), telemetry, () => Date.parse("2026-09-01T10:01:00Z"));
  const subsystem = new SmspariazSubsystem(
    config,
    store,
    provider as unknown as SmspariazProviderClient,
    football as unknown as SmspariazFootballClient,
    appBet,
    telemetry,
    () => Date.parse("2026-09-01T10:01:00Z"),
  );
  return { subsystem, store, config, programme };
}
