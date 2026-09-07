import type { FantasyMeeting } from "./types.js";

export type FantasyMeetingOption = {
  key: string;
  meetingNumber: number;
  racecourse: string;
  raceCount: number;
};

function meetingKey(meeting: FantasyMeeting): string {
  return `${meeting.meetingNumber}:${meeting.racecourse}`;
}

export function createFantasyProgrammeView(meetings: FantasyMeeting[], requestedMeetingKey?: string) {
  const meetingOptions: FantasyMeetingOption[] = meetings.map((meeting) => ({
    key: meetingKey(meeting),
    meetingNumber: meeting.meetingNumber,
    racecourse: meeting.racecourse,
    raceCount: meeting.races.length,
  }));
  const activeKey = meetingOptions.some((meeting) => meeting.key === requestedMeetingKey)
    ? requestedMeetingKey
    : meetingOptions[0]?.key;
  return {
    totalRaces: meetings.reduce((total, meeting) => total + meeting.races.length, 0),
    meetingOptions,
    activeMeeting: meetings.find((meeting) => meetingKey(meeting) === activeKey),
    activeKey,
  };
}
