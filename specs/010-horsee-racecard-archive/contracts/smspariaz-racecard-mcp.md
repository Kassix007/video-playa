# MCP Contract: SMSPariaz Daily Racecard

## Tool

- **Name**: `get_smspariaz_daily_racecard`
- **Input**: strict empty object `{}`
- **Side effects**: none
- **Annotations**: read-only, non-destructive, non-idempotence hint disabled, open-world source access enabled
- **Security**: follows the existing HORSEE read-tool security scheme; OAuth remains required for Council writes only

## Success Output

```json
{
  "success": true,
  "programme_date": "2026-08-21",
  "timezone": "Indian/Mauritius",
  "fetched_at": "2026-08-21T08:00:02+04:00",
  "source": "https://www.smspariaz.com/racecard/",
  "meeting_count": 7,
  "race_count": 51,
  "french_race_count": 31,
  "meetings": [
    {
      "meeting_number": 1,
      "racecourse": "Example",
      "country": "France",
      "race_count": 8,
      "race_ids": ["R1C1"]
    }
  ],
  "races": [
    {
      "race_id": "R1C1",
      "meeting_number": 1,
      "race_number": 1,
      "racecourse": "Example",
      "off_time": "13:42",
      "off_time_mauritius": "13:42",
      "race_name": "Prix Example",
      "country": "France",
      "discipline": "Harness",
      "distance": "2700m"
    }
  ]
}
```

Optional race/meeting fields are omitted when they cannot be extracted reliably. Races are chronological.

## Failure Output

```json
{
  "success": false,
  "programme_date": "2026-08-21",
  "timezone": "Indian/Mauritius",
  "fetched_at": "2026-08-21T08:00:02+04:00",
  "source": "https://www.smspariaz.com/racecard/",
  "error_code": "SMSPARIAZ_RACECARD_STALE",
  "error": "Expected the Mauritius programme for 2026-08-21, but SMSPariaz returned 2026-08-20."
}
```

Failures are returned as structured content and mark the MCP call as an error. A stale or partially parsed card is never returned as success.

## Compatibility

- The tool is additive to existing HORSEE discovery.
- `save_council_result`, `get_latest_council_result`, `get_council_history`, Auth0 challenges, and write scopes retain their existing behavior.
- The tool performs programme discovery only and never invokes Council analysis or persistence.
