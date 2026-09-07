import type { SupabaseClient } from "@supabase/supabase-js";
import { getSupabaseBrowserClient } from "../lib/supabase.js";
import type {
  FantasyBet,
  FantasyBetReceipt,
  FantasyBootstrap,
  FantasyLeaderboardRow,
  FantasyLedgerEntry,
  FantasyMeeting,
  FantasyProfile,
  FantasyRace,
  FantasyRunner,
} from "../features/fantasy-peakpool/types.js";

type UnknownRecord = Record<string, unknown>;

function object(value: unknown): UnknownRecord {
  return value && typeof value === "object" && !Array.isArray(value) ? value as UnknownRecord : {};
}

function array(value: unknown): unknown[] {
  return Array.isArray(value) ? value : [];
}

function string(value: unknown, fallback = ""): string {
  return typeof value === "string" || typeof value === "number" ? String(value) : fallback;
}

function integer(value: unknown): number {
  const parsed = Number(value);
  return Number.isSafeInteger(parsed) ? parsed : 0;
}

function money(value: unknown): string {
  const text = string(value, "0");
  return /^-?\d+(?:\.\d{1,2})?$/.test(text)
    ? (text.includes(".") ? `${text}${"0".repeat(2 - (text.split(".")[1]?.length ?? 0))}` : `${text}.00`)
    : "0.00";
}

function mapRunner(value: unknown): FantasyRunner {
  const row = object(value);
  const normalized = row.normalized_price;
  const snapshot = row.odds_snapshot_id;
  const reason = string(row.availability_reason);
  return {
    id: string(row.id),
    number: integer(row.runner_number),
    name: string(row.runner_name, "Unknown runner"),
    ...(row.raw_price !== null && row.raw_price !== undefined ? { rawPrice: string(row.raw_price) } : {}),
    ...(normalized !== null && normalized !== undefined ? { normalizedPrice: money(normalized) } : {}),
    ...(snapshot ? { oddsSnapshotId: string(snapshot) } : {}),
    available: row.available === true,
    ...(reason ? { availabilityReason: reason } : {}),
  };
}

function mapRace(value: unknown): FantasyRace {
  const row = object(value);
  return {
    id: string(row.id),
    externalRaceId: string(row.external_race_id),
    meetingNumber: integer(row.meeting_number),
    raceNumber: integer(row.race_number),
    racecourse: string(row.racecourse),
    ...(row.race_name ? { raceName: string(row.race_name) } : {}),
    officialOffAt: string(row.official_off_at),
    state: string(row.state, "UPCOMING") as FantasyRace["state"],
    runners: array(row.runners).map(mapRunner),
    winners: row.state === "SETTLED" ? array(row.winners).flatMap(value => {
      const winner = object(value);
      if (typeof winner.runner_id !== "string" || typeof winner.runner_name !== "string" || !winner.runner_name.trim()
        || !Number.isSafeInteger(winner.runner_number) || Number(winner.runner_number) < 0) return [];
      const cents = winner.pmu_dividend_cents;
      return [{ id: winner.runner_id, number: Number(winner.runner_number), name: winner.runner_name,
        ...(typeof cents === "number" && Number.isSafeInteger(cents) && cents >= 100
          ? { pmuFinalDividend: `${Math.floor(cents / 100)}.${String(cents % 100).padStart(2,"0")}` } : {}) }];
    }) : [],
  };
}

function meetings(races: FantasyRace[]): FantasyMeeting[] {
  const grouped = new Map<string, FantasyMeeting>();
  for (const race of races) {
    const key = `${race.meetingNumber}:${race.racecourse}`;
    const meeting = grouped.get(key) ?? { meetingNumber: race.meetingNumber, racecourse: race.racecourse, races: [] };
    meeting.races.push(race);
    grouped.set(key, meeting);
  }
  return [...grouped.values()].sort((a, b) => a.meetingNumber - b.meetingNumber);
}

function mapBootstrap(value: unknown): FantasyBootstrap {
  const root = object(value);
  const settings = object(root.settings);
  const profileRow = object(root.profile);
  const walletRow = object(root.wallet);
  const profile: FantasyProfile | undefined = profileRow.id ? {
    id: string(profileRow.id),
    role: string(profileRow.role, "player") as FantasyProfile["role"],
    displayName: string(profileRow.display_name, "Fantasy player"),
    ...(profileRow.avatar_url ? { avatarUrl: string(profileRow.avatar_url) } : {}),
  } : undefined;
  const bets: FantasyBet[] = array(root.bets).map((value) => {
    const row = object(value);
    const result = object(row.result_metadata);
    return {
      id: string(row.id),
      runnerName: string(row.runner_name, `Runner ${string(row.runner_id)}`),
      raceLabel: string(row.race_label, string(row.race_id)),
      stake: money(row.stake),
      ...(row.locked_price !== null && row.locked_price !== undefined ? { lockedPrice: money(row.locked_price) } : {}),
      ...(row.potential_gross_return !== null && row.potential_gross_return !== undefined ? { potentialGrossReturn: money(row.potential_gross_return) } : {}),
      ...(result.atr_finalized_starting_price_raw ? { atrFinalPrice: string(result.atr_finalized_starting_price_raw) } : {}),
      ...(Number.isSafeInteger(result.pmu_dividend_cents) && Number(result.pmu_dividend_cents) >= 100
        ? { pmuFinalDividend: `${Math.floor(Number(result.pmu_dividend_cents) / 100)}.${String(Number(result.pmu_dividend_cents) % 100).padStart(2, "0")}` } : {}),
      state: string(row.state, "PENDING") as FantasyBet["state"],
      acceptedAt: string(row.accepted_at),
    };
  });
  const ledger: FantasyLedgerEntry[] = array(root.ledger).map((value) => {
    const row = object(value);
    return {
      id: string(row.id), type: string(row.type), amount: money(row.amount), balanceAfter: money(row.balance_after),
      ...(row.reason ? { reason: string(row.reason) } : {}), createdAt: string(row.created_at),
    };
  });
  const leaderboard: FantasyLeaderboardRow[] = array(root.leaderboard).map((value) => {
    const row = object(value);
    return {
      rank: integer(row.rank), player: string(row.player, "Fantasy player"),
      ...(row.avatar_url ? { avatarUrl: string(row.avatar_url) } : {}),
      balance: money(row.balance), netProfitLoss: money(row.net_profit_loss), wins: integer(row.wins), bets: integer(row.bets),
    };
  });
  return {
    programmeDate: string(root.programme_date),
    bettingEnabled: settings.betting_enabled === true,
    minimumStake: money(settings.minimum_stake ?? "1.00"),
    ...(settings.maximum_stake !== null && settings.maximum_stake !== undefined ? { maximumStake: money(settings.maximum_stake) } : {}),
    ...(profile ? { profile } : {}),
    ...(walletRow.balance !== undefined ? { wallet: { balance: money(walletRow.balance), version: integer(walletRow.version) } } : {}),
    meetings: meetings(array(root.races).map(mapRace)), bets, ledger, leaderboard,
  };
}

function clientOrThrow(client?: SupabaseClient): SupabaseClient {
  const resolved = client ?? getSupabaseBrowserClient();
  if (!resolved) throw new Error("FANTASY_BACKEND_NOT_CONFIGURED");
  return resolved;
}

export async function loadFantasyBootstrap(client?: SupabaseClient): Promise<FantasyBootstrap> {
  const { data, error } = await clientOrThrow(client).rpc("get_fantasy_peakpool_bootstrap");
  if (error) throw new Error(error.code || "FANTASY_BOOTSTRAP_FAILED");
  return mapBootstrap(data);
}

export async function placeFantasyBet(input: {
  runnerId: string;
  stake: string;
  idempotencyKey: string;
}, client?: SupabaseClient): Promise<FantasyBetReceipt> {
  const { data, error } = await clientOrThrow(client).rpc("place_fantasy_bet", {
    p_runner_id: input.runnerId,
    p_odds_snapshot_id: null,
    p_stake: input.stake,
    p_expected_price: null,
    p_idempotency_key: input.idempotencyKey,
  });
  if (error) throw new Error(error.message || error.code);
  const row = object(data);
  return {
    betId: string(row.bet_id), stake: money(row.stake), pricingStatus: "PMU_FINAL_PENDING",
    newBalance: money(row.new_balance),
    acceptedAt: string(row.accepted_at), idempotentReplay: row.idempotent_replay === true,
  };
}

export async function loadFantasyAdmin(client?: SupabaseClient): Promise<UnknownRecord> {
  const { data, error } = await clientOrThrow(client).rpc("get_fantasy_peakpool_admin");
  if (error) throw new Error(error.message || error.code);
  return object(data);
}

async function adminRpc(name: string, params: UnknownRecord, client?: SupabaseClient): Promise<UnknownRecord> {
  const { data, error } = await clientOrThrow(client).rpc(name, params);
  if (error) throw new Error(error.message || error.code);
  return object(data);
}

export function adjustFantasyWallet(input: { userId: string; amount: string; reason: string; idempotencyKey: string }, client?: SupabaseClient) {
  return adminRpc("admin_adjust_wallet", {
    p_user_id: input.userId, p_amount: input.amount, p_reason: input.reason, p_idempotency_key: input.idempotencyKey,
  }, client);
}

export function resetFantasyLeaderboard(input: { reason: string; confirmation: string; idempotencyKey: string }, client?: SupabaseClient) {
  return adminRpc("admin_reset_fantasy_leaderboard", {
    p_reason: input.reason, p_confirmation: input.confirmation, p_idempotency_key: input.idempotencyKey,
  }, client);
}

export function updateFantasySettings(input: {
  bettingEnabled: boolean; defaultStartingBalance: string; minimumStake: string; maximumStake?: string;
  closeBufferSeconds: number; maxQuoteAgeSeconds: number; initialDelaySeconds: number; maxCheckAgeSeconds: number;
  reason: string; idempotencyKey: string;
}, client?: SupabaseClient) {
  return adminRpc("admin_update_game_settings", {
    p_betting_enabled: input.bettingEnabled, p_default_starting_balance: input.defaultStartingBalance,
    p_minimum_stake: input.minimumStake, p_maximum_stake: input.maximumStake || null,
    p_close_buffer_seconds: input.closeBufferSeconds, p_max_quote_age_seconds: input.maxQuoteAgeSeconds,
    p_result_check_initial_delay_seconds: input.initialDelaySeconds, p_result_check_max_age_seconds: input.maxCheckAgeSeconds,
    p_reason: input.reason, p_idempotency_key: input.idempotencyKey,
  }, client);
}

export function confirmFantasyResult(input: { raceId: string; winnerIds: string[]; nonRunnerIds?: string[]; reason: string; idempotencyKey: string }, client?: SupabaseClient) {
  return adminRpc("admin_confirm_race_result", {
    p_race_id: input.raceId, p_winner_runner_ids: input.winnerIds, p_non_runner_ids: input.nonRunnerIds ?? [],
    p_observation_id: null, p_reason: input.reason, p_idempotency_key: input.idempotencyKey,
  }, client);
}

export function correctFantasyResult(input: { raceId: string; winnerIds: string[]; nonRunnerIds?: string[]; reason: string; idempotencyKey: string }, client?: SupabaseClient) {
  return adminRpc("admin_correct_race_result", {
    p_race_id: input.raceId, p_winner_runner_ids: input.winnerIds, p_non_runner_ids: input.nonRunnerIds ?? [],
    p_observation_id: null, p_reason: input.reason, p_idempotency_key: input.idempotencyKey,
  }, client);
}

export function voidFantasyRace(input: { raceId: string; reason: string; idempotencyKey: string }, client?: SupabaseClient) {
  return adminRpc("admin_void_race", { p_race_id: input.raceId, p_reason: input.reason, p_idempotency_key: input.idempotencyKey }, client);
}

export function retryFantasyResult(input: { raceId: string; reason: string; idempotencyKey: string }, client?: SupabaseClient) {
  return adminRpc("admin_retry_result_check", { p_race_id: input.raceId, p_reason: input.reason, p_idempotency_key: input.idempotencyKey }, client);
}

export function fantasyErrorMessage(error: unknown): string {
  const message = error instanceof Error ? error.message : "";
  const known: Record<string, string> = {
    BETTING_DISABLED: "Fantasy betting is currently disabled.",
    QUOTE_UNAVAILABLE: "Odds currently unavailable.",
    QUOTE_STALE: "That quote expired. Refresh and review the latest price.",
    PRICE_CHANGED: "The price changed. Please review the new quote.",
    RACE_CLOSED: "Betting has closed for this race.",
    INSUFFICIENT_BALANCE: "Your fantasy balance is too low for that stake.",
    LEADERBOARD_RESET_PENDING_BETS: "Settle or void every pending bet before resetting the leaderboard.",
    RESET_CONFIRMATION_REQUIRED: "Type RESET LEADERBOARD exactly to confirm.",
    FANTASY_BACKEND_NOT_CONFIGURED: "Fantasy backend setup is incomplete.",
  };
  return Object.entries(known).find(([code]) => message.includes(code))?.[1] ?? "The fantasy service could not complete that request.";
}
