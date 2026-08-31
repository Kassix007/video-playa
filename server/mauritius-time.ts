export const MAURITIUS_TIMEZONE = "Indian/Mauritius";

export function getMauritiusDate(date: Date): string {
  const parts = new Intl.DateTimeFormat("en-GB", {
    timeZone: MAURITIUS_TIMEZONE,
    year: "numeric",
    month: "2-digit",
    day: "2-digit",
  }).formatToParts(date);
  const values = Object.fromEntries(parts.map((part) => [part.type, part.value]));
  return `${values.year}-${values.month}-${values.day}`;
}

export function formatMauritiusTimestamp(date: Date): string {
  const parts = new Intl.DateTimeFormat("en-GB", {
    timeZone: MAURITIUS_TIMEZONE,
    year: "numeric",
    month: "2-digit",
    day: "2-digit",
    hour: "2-digit",
    minute: "2-digit",
    second: "2-digit",
    hourCycle: "h23",
  }).formatToParts(date);
  const values = Object.fromEntries(parts.map((part) => [part.type, part.value]));
  return `${values.year}-${values.month}-${values.day}T${values.hour}:${values.minute}:${values.second}+04:00`;
}

export function truncateToMinute(date: Date): Date {
  const truncated = new Date(date);
  truncated.setUTCSeconds(0, 0);
  return truncated;
}

export function createMauritiusRaceDate(programmeDate: string, offTime: string): Date {
  if (!/^\d{4}-\d{2}-\d{2}$/.test(programmeDate) || !/^\d{2}:\d{2}$/.test(offTime)) {
    throw new TypeError("Race time must use YYYY-MM-DD and HH:mm.");
  }
  const result = new Date(`${programmeDate}T${offTime}:00+04:00`);
  if (!Number.isFinite(result.getTime())) throw new TypeError("Race time is invalid.");
  return result;
}

export function differenceInMauritiusWallMinutes(
  now: Date,
  programmeDate: string,
  offTime: string,
): number {
  const off = createMauritiusRaceDate(programmeDate, offTime);
  return Math.round((off.getTime() - truncateToMinute(now).getTime()) / 60_000);
}

export function subtractMauritiusDays(programmeDate: string, days: number): string {
  if (!/^\d{4}-\d{2}-\d{2}$/.test(programmeDate)
    || !Number.isSafeInteger(days)
    || days < 0) throw new TypeError("Invalid Mauritius date subtraction.");
  const date = new Date(`${programmeDate}T12:00:00Z`);
  if (!Number.isFinite(date.getTime())) throw new TypeError("Invalid Mauritius calendar date.");
  date.setUTCDate(date.getUTCDate() - days);
  return date.toISOString().slice(0, 10);
}
