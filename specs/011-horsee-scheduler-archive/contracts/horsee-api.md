# HORSEE Scheduler and Archive Contracts

## Conventions

- JSON responses use `Content-Type: application/json` and `Cache-Control: no-store`.
- Dates are `YYYY-MM-DD` in `Indian/Mauritius`; timestamps are ISO 8601.
- Read routes expose no archive token, scheduler key, OAuth token, internal ETag, lease owner, provider response body, or unbounded error text.
- Mutation routes accept either an existing valid HORSEE Council OAuth bearer with the configured write scope or `Authorization: Bearer <HORSEE_SCHEDULER_API_KEY>` when that server-side key is configured.
- Unauthorized mutation responses preserve the existing OAuth challenge behavior where OAuth is configured. A valid scheduler key is an alternative server-to-server credential, not a frontend credential.
- Unknown JSON properties and unsupported state transitions are rejected.

## Existing contracts preserved

The following routes retain their current envelopes:

```text
GET /api/council/latest
200 { "result": CouncilResult | null }

GET /api/council/today
200 { "date": "YYYY-MM-DD", "timezone": "Indian/Mauritius", "count": number, "results": CouncilResult[] }

GET /api/council/history?date=YYYY-MM-DD
200 { "date": "YYYY-MM-DD", "timezone": "Indian/Mauritius", "count": number, "results": CouncilResult[] }

GET /api/council/history/dates?month=YYYY-MM
200 { "month": "YYYY-MM", "timezone": "Indian/Mauritius", "dates": [{ "date": "YYYY-MM-DD", "count": number }] }
```

After retention, exact-date and month-count calls may be fulfilled from the yearly archive without changing these shapes.

## Public job projection

```json
{
  "id": "2026-08-23:R4C5",
  "programme_date": "2026-08-23",
  "race_id": "R4C5",
  "meeting_number": 4,
  "race_number": 5,
  "racecourse": "Example Racecourse",
  "off_time_mauritius": "15:03",
  "status": "READY",
  "mode": "PRIMARY",
  "attempts": 0,
  "prompt": "R4C5 23/08/2026 HARD\n\n...",
  "updated_at": "2026-08-23T14:28:00+04:00"
}
```

`prompt` is present only for READY work. Internal source-removal notes, dispatch metadata, and sanitized errors may be included by operator-only responses but are omitted from the public dashboard unless required for display.

## `GET /api/horsee/scheduler/status`

Returns one internally consistent secret-free dashboard snapshot.

### Success `200`

```json
{
  "programme_date": "2026-08-23",
  "timezone": "Indian/Mauritius",
  "observed_at": "2026-08-23T14:20:00+04:00",
  "last_run_at": "2026-08-23T14:20:00+04:00",
  "revision": 7,
  "counts": {
    "programme": 31,
    "completed": 12,
    "ready": 2,
    "pending": 15,
    "dispatched": 0,
    "running": 0,
    "failed": 1,
    "missed": 1
  },
  "upcoming_jobs": [],
  "archive": {
    "status": "HEALTHY",
    "last_archived_day": "2026-08-22",
    "repo": "horsee-archive-2026",
    "pending_days": 1,
    "last_error": null
  },
  "last_error": null
}
```

If no current queue exists, return `200` with today's Mauritius date, revision `0`, zero counts, an empty job array, archive health, and any sanitized last scheduler error. Missing archive credentials produce `archive.status="NOT_CONFIGURED"`, not an endpoint failure.

## `POST /api/horsee/scheduler/run`

Authorization required. Runs one generic scheduler invocation.

### Request

No body is required. A supplied non-empty body is rejected to keep invocation semantics deterministic.

### Success `200`

Returns the same snapshot shape as `GET /api/horsee/scheduler/status` after persistence, plus:

```json
{
  "run": {
    "status": "COMPLETED",
    "created_jobs": 3,
    "ready_jobs": 2,
    "recovered_jobs": 1,
    "saved_jobs": 4,
    "missed_jobs": 0
  }
}
```

### Other responses

- `401`/`403`: authentication or scope failure
- `409`: a live scheduler lease already owns the invocation; response includes `error="scheduler_busy"` and no lease owner
- `422`: current SMSPariaz card is stale/invalid or central configuration is invalid
- `503`: racecard or operational storage is temporarily unavailable; persisted state remains retryable

## `GET /api/horsee/jobs/today`

Returns all public job projections for the current Mauritius date, ordered by off-time, meeting, then race.

```json
{
  "programme_date": "2026-08-23",
  "timezone": "Indian/Mauritius",
  "count": 31,
  "jobs": []
}
```

## `GET /api/horsee/jobs/ready`

Returns only READY jobs with non-empty prompts.

```json
{
  "programme_date": "2026-08-23",
  "timezone": "Indian/Mauritius",
  "count": 2,
  "jobs": []
}
```

## `GET /api/horsee/jobs/next`

Returns the earliest non-terminal job at or after the current scheduling horizon.

```json
{
  "programme_date": "2026-08-23",
  "timezone": "Indian/Mauritius",
  "job": null
}
```

## `POST /api/horsee/jobs/{encoded-id}/dispatch`

Authorization required. Invokes the configured provider-neutral dispatcher.

The initial queue-only dispatcher returns `200` without changing READY state:

```json
{
  "job_id": "2026-08-23:R4C5",
  "accepted": false,
  "provider": "queue-only",
  "status": "READY",
  "message": "No automated dispatcher is configured."
}
```

Future adapters may atomically move READY to DISPATCHED only after handoff is acknowledged. A repeated call on DISPATCHED/RUNNING/SAVED returns the current state without a second handoff.

Errors:

- `400`: malformed job ID
- `401`/`403`: authorization failure
- `404`: job does not exist in the referenced hot queue
- `409`: state is not dispatchable or a conditional write conflicts after bounded retries
- `503`: dispatcher unavailable; job remains READY or becomes retryable FAILED according to the returned dispatch result

## `POST /api/horsee/jobs/{encoded-id}/status`

Authorization required. Records an external provider/operator status transition.

### Request

```json
{
  "status": "RUNNING",
  "error": null
}
```

Accepted target states are `DISPATCHED`, `RUNNING`, `SAVED`, and `FAILED`. `SAVED` additionally verifies a matching `CouncilResult` and rejects the request if none exists. `error` is required and bounded for FAILED, and rejected for non-failure states.

### Success `200`

```json
{ "job": { "id": "2026-08-23:R4C5", "status": "RUNNING" } }
```

Errors use `400`, `401`, `403`, `404`, and `409` as above.

## `GET /api/horsee/archive/status`

Returns the same public archive health object used by scheduler status.

```json
{
  "status": "NOT_CONFIGURED",
  "last_archived_day": null,
  "repo": "horsee-archive-2026",
  "pending_days": 0,
  "last_error": null
}
```

## `POST /api/horsee/archive/run`

Authorization required. Archives one explicit completed Mauritius date or, with no date, processes the bounded backlog of completed days.

### Optional request

```json
{ "date": "2026-08-22" }
```

### Success `200`

```json
{
  "date": "2026-08-22",
  "status": "ARCHIVED",
  "repo": "Kassix007/horsee-archive-2026",
  "result_path": "results/2026/08/2026-08-22.ndjson",
  "racecard_path": "racecards/2026/08/2026-08-22.json",
  "index_path": "indexes/2026/08.json",
  "result_count": 29,
  "content_hash": "64-lowercase-hex",
  "unchanged": false
}
```

`unchanged=true` means all generated required bytes already matched and no write commit was created.

Errors:

- `401`/`403`: authorization failure
- `404`: required hot day/racecard is not available
- `409`: live archive lease or remote update conflict after bounded retry
- `422`: date/configuration/schema failure, including archive not configured for writes
- `503`: GitHub timeout/rate limit/transient error; hot data remains intact

## `POST /api/horsee/archive/cleanup`

Authorization required. Runs verified hot retention independently of archive generation.

### Success `200`

```json
{
  "retention_days": 14,
  "evaluated_dates": 20,
  "deleted_dates": ["2026-08-01"],
  "preserved": [
    { "date": "2026-08-02", "reason": "ARCHIVE_NOT_VERIFIED" }
  ]
}
```

Cleanup never accepts arbitrary keys or paths from the request.

## Error envelope

New routes use:

```json
{
  "error": "stable_machine_code",
  "error_description": "Concise sanitized operator message."
}
```

Provider status may be included as an integer when useful, but response bodies, Authorization headers, tokens, prompts, results, local paths, and stack traces are excluded.

## Dispatcher interface

The server-side provider boundary is:

```ts
export interface HorseeDispatcher {
  readonly name: string;
  dispatch(job: HorseeJob): Promise<HorseeDispatchResult>;
}
```

`HorseeDispatchResult` is a strict discriminated result:

- `{ accepted: true, provider, dispatched_at, provider_job_id? }`
- `{ accepted: false, provider, retryable, message }`

The scheduler never imports a provider implementation. The queue-only adapter returns `accepted: false`, `retryable: true`, and a fixed sanitized message while leaving the job READY.

## Netlify route mapping

Specific routes precede wildcard routes:

```text
/api/horsee/scheduler/status   -> horsee-scheduler-api
/api/horsee/scheduler/run      -> horsee-scheduler-api
/api/horsee/jobs/today         -> horsee-jobs
/api/horsee/jobs/ready         -> horsee-jobs
/api/horsee/jobs/next          -> horsee-jobs
/api/horsee/jobs/*             -> horsee-jobs
/api/horsee/archive/status     -> horsee-archive-api
/api/horsee/archive/run        -> horsee-archive-api
/api/horsee/archive/cleanup    -> horsee-archive-api
```

Scheduled `horsee-scheduler` and `horsee-archive` functions are not mapped to public paths.
