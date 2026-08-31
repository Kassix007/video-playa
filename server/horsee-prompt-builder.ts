import type { HorseeJob } from "./horsee-job-schema.js";

function displayDate(programmeDate: string): string {
  const [year, month, day] = programmeDate.split("-");
  return `${day}/${month}/${year}`;
}

export function buildHorseeHardPrompt(job: HorseeJob): string {
  const date = displayDate(job.programme_date);
  return `${job.race_id} ${date} HARD

Run the FULL HORSEE HARD Council protocol for ${job.racecourse}, meeting ${job.meeting_number}, race ${job.race_number}, scheduled ${job.off_time_mauritius} Indian/Mauritius on ${date}.

Requirements:
- no bias
- full Council
- apply all historical calibrations
- multidimensional analysis
- complete runner-by-runner research
- FACT LOCK before analysis
- blind analysis before market
- Form Analyst
- Conditions Analyst
- Handicap Analyst
- Improvement Analyst
- Reliability Analyst
- contradiction gate
- market audit only after blind analysis
- complete final ranking
- win probabilities totalling approximately 100%
- principal danger
- best value
- strongest reason selection could lose
- final selection
- save the structured CouncilResult when available

Use get_smspariaz_daily_racecard as authoritative programme discovery and require the Mauritius programme date ${job.programme_date}.
Do not substitute ordinary web search for SMSPariaz programme discovery.
Do not rely on any previous conversation context.`;
}

