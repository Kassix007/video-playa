const CREDIT_PATTERN = /^(0|[1-9]\d*)(?:\.(\d{1,2}))?$/;

export function parseCredits(value: string): bigint {
  const match = value.match(CREDIT_PATTERN);
  if (!match) throw new TypeError("Credit value must be a non-negative decimal with at most two decimal places.");
  const whole = BigInt(match[1]);
  const fraction = BigInt((match[2] ?? "").padEnd(2, "0"));
  return whole * 100n + fraction;
}

export function formatCredits(minorUnits: bigint): string {
  const negative = minorUnits < 0n;
  const magnitude = negative ? -minorUnits : minorUnits;
  const whole = magnitude / 100n;
  const fraction = String(magnitude % 100n).padStart(2, "0");
  return `${negative ? "-" : ""}${whole}.${fraction}`;
}

function divideRoundedHalfUp(numerator: bigint, denominator: bigint): bigint {
  return (numerator + denominator / 2n) / denominator;
}

export function calculateGrossReturn(stake: string, decimalPrice: string, jointWinners = 1): string {
  if (!Number.isSafeInteger(jointWinners) || jointWinners < 1) throw new TypeError("Dead-heat divisor must be a positive integer.");
  const stakeMinor = parseCredits(stake);
  const priceHundredths = parseCredits(decimalPrice);
  if (stakeMinor <= 0n || priceHundredths <= 0n) throw new TypeError("Stake and decimal price must be positive.");
  const grossMinor = divideRoundedHalfUp(stakeMinor * priceHundredths, 100n * BigInt(jointWinners));
  return formatCredits(grossMinor);
}

export function isBettingOpen(now: Date, officialOffAt: Date, closeBufferSeconds: number): boolean {
  if (!Number.isSafeInteger(closeBufferSeconds) || closeBufferSeconds < 0) throw new TypeError("Close buffer is invalid.");
  return now.getTime() < officialOffAt.getTime() - closeBufferSeconds * 1_000;
}

export function isQuoteFresh(observedAt: Date, now: Date, maxAgeSeconds: number): boolean {
  if (!Number.isSafeInteger(maxAgeSeconds) || maxAgeSeconds < 1) throw new TypeError("Quote age is invalid.");
  const age = now.getTime() - observedAt.getTime();
  return age >= 0 && age <= maxAgeSeconds * 1_000;
}
