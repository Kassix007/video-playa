const DECIMAL = /^(0|[1-9]\d*)(?:\.(\d{1,2}))?$/;

function minor(value: string): bigint {
  const match = value.match(DECIMAL);
  if (!match) throw new TypeError("Use no more than two decimal places.");
  return BigInt(match[1]) * 100n + BigInt((match[2] ?? "").padEnd(2, "0"));
}

function format(value: bigint): string {
  return `${value / 100n}.${String(value % 100n).padStart(2, "0")}`;
}

export function validateFantasyStake(stake: string, minimum: string, maximum?: string): { valid: boolean; message?: string } {
  try {
    const value = minor(stake);
    if (value <= 0n) return { valid: false, message: "Enter a stake greater than zero." };
    if (value < minor(minimum)) return { valid: false, message: `Minimum stake is ${minimum}.` };
    if (maximum && value > minor(maximum)) return { valid: false, message: `Maximum stake is ${maximum}.` };
    return { valid: true };
  } catch {
    return { valid: false, message: "Use a credit amount with no more than two decimal places." };
  }
}

export function calculatePotentialReturn(stake: string, price: string): string {
  const numerator = minor(stake) * minor(price);
  return format((numerator + 50n) / 100n);
}
