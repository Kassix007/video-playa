/* eslint-disable no-useless-escape */
// src/lib/prog.ts
export type ExtraLink = { label: string; url: string };
export type ProgHeader = {
  lastUpdate?: string;
  contactEmails: string[];
  extraLinks: ExtraLink[];
};
export type ScheduleItem = {
  day: string;
  time: string;
  matchup: string;
  url: string;
  channelGroup?: string; // e.g., pt, hd, bra
  channelCode?: string;  // e.g., SPORTTV1, HD2
};
export type ProgData = { header: ProgHeader; schedule: ScheduleItem[] };

const DAY_RX = /^(MONDAY|TUESDAY|WEDNESDAY|THURSDAY|FRIDAY|SATURDAY|SUNDAY)\s*$/i;
const LAST_UPDATE_RX = /LAST UPDATE:\s*([0-9/\-]+)/i;
const EMAIL_RX = /[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}/g;
const SCHEDULE_LINE_RX = /^(\d{1,2}:\d{2})\s+(.+?)\s*\|\s*(https?:\/\/\S+)/;
const ANY_LINK_RX = /(https?:\/\/[^\s|]+(?:\.txt|\.php|\/)?)/gi;

function deriveChannelBits(rawUrl: string) {
  try {
    const u = new URL(rawUrl);
    const parts = u.pathname.split("/").filter(Boolean);
    const last = parts[parts.length - 1] || "";
    const folder = parts[parts.length - 2] || undefined;
    const code = last.toLowerCase().endsWith(".php")
      ? last.slice(0, -4).toUpperCase()
      : last.toUpperCase();
    return { channelGroup: folder, channelCode: code };
  } catch {
    return { channelGroup: undefined, channelCode: undefined };
  }
}

export function parseProg(text: string): ProgData {
  const lines = text.split(/\r?\n/).map(l => l.trim()).filter(Boolean);

  let currentDay = "UNSPECIFIED";
  const header: ProgHeader = { contactEmails: [], extraLinks: [] };
  const schedule: ScheduleItem[] = [];
  const seenExtra = new Set<string>();

  for (const line of lines) {
    const lu = line.match(LAST_UPDATE_RX);
    if (lu?.[1]) header.lastUpdate = lu[1].trim();

    const emails = line.match(EMAIL_RX);
    if (emails) {
      emails.forEach(e => {
        if (!header.contactEmails.includes(e)) header.contactEmails.push(e);
      });
    }

    const day = line.match(DAY_RX);
    if (day) {
      currentDay = day[1].toUpperCase();
      continue;
    }

    const m = line.match(SCHEDULE_LINE_RX);
    if (m) {
      const [, time, matchup, url] = m;
      const { channelGroup, channelCode } = deriveChannelBits(url);
      schedule.push({
        day: currentDay,
        time: time.trim(),
        matchup: matchup.trim(),
        url: url.trim(),
        channelGroup,
        channelCode,
      });
      continue;
    }

    const genericLinks = [...line.matchAll(ANY_LINK_RX)].map(g => g[0]);
    for (const url of genericLinks) {
      if (!seenExtra.has(url)) {
        seenExtra.add(url);
        let label = url;
        try {
          const u = new URL(url);
          label = u.pathname.split("/").filter(Boolean).pop() || u.hostname;
        } catch {
          // intentionally ignored
        }
        header.extraLinks.push({ label, url });
      }
    }
  }

  return { header, schedule };
}
