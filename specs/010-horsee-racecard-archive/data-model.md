# Data Model: HORSEE Racecard and Council Archive

## Time Authority

- **Timezone**: `Indian/Mauritius`
- **Date form**: `YYYY-MM-DD`
- **Month form**: `YYYY-MM`
- **Rule**: Programme freshness and Council day membership are derived in Mauritius time, never by truncating a UTC timestamp.

## DailyRacecardResponse

A discriminated result with `success: true` or `success: false`.

### DailyRacecardSuccess

| Field | Type | Validation |
|---|---|---|
| `success` | literal `true` | Required |
| `programme_date` | date string | Must equal the request-time Mauritius date |
| `timezone` | literal `Indian/Mauritius` | Required |
| `fetched_at` | timestamp string | Mauritius offset timestamp |
| `source` | official URL literal | Required |
| `meeting_count` | non-negative integer | Equals `meetings.length` |
| `race_count` | non-negative integer | Equals `races.length` |
| `french_race_count` | non-negative integer | Count of races labeled France |
| `meetings` | `RacecardMeeting[]` | Complete meeting summary |
| `races` | `RacecardRace[]` | Complete chronological race list |

### DailyRacecardFailure

Carries the common date/time/source metadata plus:

- `error_code`: one of `SMSPARIAZ_RACECARD_FETCH_FAILED`, `SMSPARIAZ_RACECARD_STALE`, `SMSPARIAZ_RACECARD_PARSE_FAILED`, or `SMSPARIAZ_RACECARD_DATE_MISMATCH`.
- `error`: a non-empty human-readable diagnostic safe for the tool caller.

No race or meeting collection is present on failure.

## RacecardMeeting

| Field | Type | Validation |
|---|---|---|
| `meeting_number` | positive integer | Parsed from `R<n>C<n>` IDs |
| `racecourse` | non-empty string | Required |
| `country` | non-empty string | Optional when not reliably labeled |
| `race_count` | positive integer | Equals `race_ids.length` |
| `race_ids` | string array | At least one stable race ID |

## RacecardRace

| Field | Type | Validation |
|---|---|---|
| `race_id` | `R<meeting>C<race>` | Stable and unique within the programme |
| `meeting_number` | positive integer | Must match `race_id` |
| `race_number` | positive integer | Must match `race_id` |
| `racecourse` | non-empty string | Required |
| `off_time` | `HH:mm` | Required source schedule |
| `off_time_mauritius` | `HH:mm` | Required Mauritius display schedule |
| `race_name` | non-empty string | Optional |
| `country` | non-empty string | Optional |
| `discipline` | non-empty string | Optional |
| `distance` | non-empty string | Optional |

Ordering is `off_time`, then `meeting_number`, then `race_number`.

## CouncilResult

The existing strict Council result remains the archive record. Relevant fields are:

- Race identity: `race_id`, `racecourse`, `race_number`, `off_time`, `distance`, `surface`, `going`, `race_type`, `field_size`.
- Selections: `most_likely_winner`, `principal_danger`, `best_value`, and full `ranking`.
- Verdict: `confidence`, `strongest_loss_reason`, `final_selection`, and `council_status`.
- Time: ISO `analysed_at`, which determines the Mauritius analysis day for legacy reads and new storage partitioning.

Each horse selection contains `number`, `name`, and `probability`. Saving another result with the same race identity creates another archive event.

## Council Storage Identity

| Record | Key | Behavior |
|---|---|---|
| Latest result | `latest.json` | Overwritten by every successful save |
| New history event | `results/YYYY-MM-DD/<13-digit-receipt-time>-<uuid>.json` | Immutable, date partition is derived from `analysed_at` in Mauritius |
| Legacy history event | `results/<13-digit-receipt-time>-<uuid>.json` | Read-only compatibility; date derived from payload |
| Private audit event | Existing private audit prefix | Unchanged and never returned by archive APIs |

The UUID component prevents overwrites and deliberately preserves legitimate re-analyses.

## CouncilDay

| Field | Type | Validation |
|---|---|---|
| `date` | valid `YYYY-MM-DD` | Requested/current Mauritius date |
| `timezone` | literal `Indian/Mauritius` | Required |
| `count` | non-negative integer | Equals `results.length` |
| `results` | `CouncilResult[]` | Newest `analysed_at` first |

## CouncilDateCount and MonthResult

- `CouncilDateCount`: `{ date: YYYY-MM-DD, count: positive integer }`.
- Month response: `{ month: YYYY-MM, timezone: Indian/Mauritius, dates: CouncilDateCount[] }`.
- Dates are ascending within the requested month; the count includes both dated keys and legacy records.

## State Transitions

```text
Validated CouncilResult
    -> save immutable dated history event
    -> replace latest result
    -> appears automatically in Today/day-detail/month-count reads

Retrieved PDF
    -> verify transport/content/date
    -> parse complete race map
    -> success response
       or bounded retry -> typed failure
```
