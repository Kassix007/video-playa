import { SmspariazAppBetService } from "./smspariaz-app-bet.js";
import { parseSmspariazConfig } from "./smspariaz-config.js";
import { parseSmsfootballProgramme, type SmspariazFootballClient } from "./smspariaz-football.js";
import { SmspariazSubsystem } from "./smspariaz-mcp.js";
import { createSmspariazObservability } from "./smspariaz-observability.js";
import { MemorySmspariazPreparedBetStore } from "./smspariaz-prepared-store.js";
import type { SmspariazProviderClient } from "./smspariaz-provider.js";
import { MemorySmspariazSessionStore } from "./smspariaz-session-store.js";
import { PeakpoolAppBetService } from "./peakpool-app-bet.js";
import { parsePeakpoolConfig } from "./peakpool-config.js";
import { parsePeakpoolProgramme } from "./peakpool-programme.js";
import { SAMPLE_ODDS_FRAGMENT, SAMPLE_ODDS_METADATA } from "./test-fixtures/smspariaz/flow-fixtures.js";
import { SAMPLE_PEAKPOOL_FIXTURE } from "./test-fixtures/peakpool/flow-fixtures.js";

export function createTestSmspariazSubsystem(options: { validSession?: boolean; lines?: string[]; peakpool?: boolean } = {}) {
  const config = parseSmspariazConfig({
    SMSPARIAZ_SESSION_ENCRYPTION_KEY: Buffer.alloc(32, 14).toString("base64"),
    SMSPARIAZ_APP_BET_ENABLED: "true",
  });
  const store = new MemorySmspariazSessionStore();
  const programme = parseSmsfootballProgramme(SAMPLE_ODDS_METADATA, [SAMPLE_ODDS_FRAGMENT]);
  const peakpoolProgramme = parsePeakpoolProgramme(SAMPLE_PEAKPOOL_FIXTURE, "2026-09-01T10:00:00.000Z");
  const provider = {
    startLogin: async (phone: string, referrer = "") => ({ phone, referrer, cookies: [], requested_at: "2026-09-01T10:00:00.000Z", expires_at: "2026-09-01T10:10:00.000Z" }),
    confirmOtp: async () => ({ login_id: "42", phone: "23050000000", token: "SENTINEL_TOKEN", cookies: [] }),
    checkLogin: async () => options.validSession ?? true,
    verifyAppFlow: async () => ({ valid: true, fingerprint: "f".repeat(64), observed: { site: "a".repeat(64), footballMobile: "b".repeat(64), rootMobile: "c".repeat(64) } }),
    verifyPeakpoolAppFlow: async () => ({ valid: true, fingerprint: "e".repeat(64), observed: { site: "a".repeat(64), root_mobile: "b".repeat(64) } }),
    postProviderForm: async (path: string) => path.includes("validatebet")
      ? { text: '<input id="bookcode" value="BOOK123">', cookies: [] }
      : { text: JSON.stringify({ status: 0, reply: { message: "Accepted", webmessage: "Reference APP-7", reference: "APP-7" } }), cookies: [] },
    postPeakpoolAppBet: async () => ({ text: JSON.stringify({ status: 0, reply: { message: "Peakpool accepted" } }), cookies: [] }),
  };
  const football = { getProgramme: async () => programme };
  const telemetry = createSmspariazObservability((line) => options.lines?.push(line));
  const preparedStore = new MemorySmspariazPreparedBetStore();
  const appBet = new SmspariazAppBetService(config, provider, football, preparedStore, telemetry, () => Date.parse("2026-09-01T10:01:00Z"));
  const peakpoolConfig = parsePeakpoolConfig({
    PEAKPOOL_ENABLED: options.peakpool ? "true" : undefined,
    PEAKPOOL_APP_BET_ENABLED: options.peakpool ? "true" : undefined,
    PEAKPOOL_APP_BET_VERIFIED: options.peakpool ? "true" : undefined,
  }, config);
  const peakpool = peakpoolConfig.configured
    ? { config: peakpoolConfig, appBet: new PeakpoolAppBetService(peakpoolConfig, provider, { getProgramme: async () => peakpoolProgramme }, preparedStore, telemetry, () => Date.parse("2026-09-01T10:01:00Z")) }
    : undefined;
  const subsystem = new SmspariazSubsystem(
    config,
    store,
    provider as unknown as SmspariazProviderClient,
    football as unknown as SmspariazFootballClient,
    appBet,
    telemetry,
    () => Date.parse("2026-09-01T10:01:00Z"),
    peakpool,
  );
  return { subsystem, store, config, programme };
}
