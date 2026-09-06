export type FantasyRole = "player" | "admin";
export type FantasyRaceState =
  | "UPCOMING"
  | "OPEN"
  | "CLOSED"
  | "RESULT_PENDING"
  | "SETTLED"
  | "VOID"
  | "NEEDS_REVIEW";
export type FantasyBetState = "PENDING" | "WON" | "LOST" | "VOID";

export type FantasyProfile = {
  id: string;
  role: FantasyRole;
  displayName: string;
  avatarUrl?: string;
};

export type FantasyWallet = { balance: string; version: number };

export type FantasyRunner = {
  id: string;
  number: number;
  name: string;
  rawPrice?: string;
  normalizedPrice?: string;
  oddsSnapshotId?: string;
  available: boolean;
  availabilityReason?: string;
};

export type FantasyRace = {
  id: string;
  externalRaceId: string;
  meetingNumber: number;
  raceNumber: number;
  racecourse: string;
  raceName?: string;
  officialOffAt: string;
  state: FantasyRaceState;
  runners: FantasyRunner[];
};

export type FantasyMeeting = { meetingNumber: number; racecourse: string; races: FantasyRace[] };

export type FantasyBet = {
  id: string;
  runnerName: string;
  raceLabel: string;
  stake: string;
  lockedPrice?: string;
  potentialGrossReturn?: string;
  atrFinalPrice?: string;
  pmuFinalDividend?: string;
  state: FantasyBetState;
  acceptedAt: string;
};

export type FantasyLedgerEntry = {
  id: string;
  type: string;
  amount: string;
  balanceAfter: string;
  reason?: string;
  createdAt: string;
};

export type FantasyLeaderboardRow = {
  rank: number;
  player: string;
  avatarUrl?: string;
  balance: string;
  netProfitLoss: string;
  wins: number;
  bets: number;
};

export type FantasyBootstrap = {
  programmeDate: string;
  bettingEnabled: boolean;
  minimumStake: string;
  maximumStake?: string;
  profile?: FantasyProfile;
  wallet?: FantasyWallet;
  meetings: FantasyMeeting[];
  bets: FantasyBet[];
  ledger: FantasyLedgerEntry[];
  leaderboard: FantasyLeaderboardRow[];
};

export type FantasyBetReceipt = {
  betId: string;
  stake: string;
  pricingStatus: "PMU_FINAL_PENDING";
  lockedPrice?: string;
  potentialGrossReturn?: string;
  newBalance: string;
  acceptedAt: string;
  idempotentReplay: boolean;
};
