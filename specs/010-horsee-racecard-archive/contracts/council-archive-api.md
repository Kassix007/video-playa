# HTTP Contracts: Council Today and Archive

All endpoints are read-only, return JSON, set `Cache-Control: no-store`, and interpret dates in `Indian/Mauritius`.

## GET `/api/council/today`

Returns the current Mauritius day:

```json
{
  "date": "2026-08-21",
  "timezone": "Indian/Mauritius",
  "count": 2,
  "results": []
}
```

`results` contains complete existing `CouncilResult` objects newest first. Empty days return `200` with `count: 0` and `results: []`.

## GET `/api/council/history?date=YYYY-MM-DD`

Returns all results for one valid Mauritius calendar date with the same `CouncilDay` envelope as Today. Repeated analyses for one race remain separate.

- Invalid or missing date: `400 { "error": "The date query must be a valid YYYY-MM-DD value." }`
- Non-GET method: `405`, `Allow: GET`

## GET `/api/council/history/dates?month=YYYY-MM`

Returns populated dates and counts for one valid month:

```json
{
  "month": "2026-08",
  "timezone": "Indian/Mauritius",
  "dates": [
    { "date": "2026-08-20", "count": 18 },
    { "date": "2026-08-21", "count": 7 }
  ]
}
```

Dates are ascending and empty months return `dates: []`.

- Invalid or missing month: `400 { "error": "The month query must be a valid YYYY-MM value." }`
- Non-GET method: `405`, `Allow: GET`

## Existing MCP History Compatibility

`get_council_history` retains its existing `limit` input and `{ results: CouncilResult[] }` output. An optional valid `date: YYYY-MM-DD` input narrows the same result shape; calls that provide only `limit` remain unchanged.

## Client Validation

The browser service rejects a success response unless:

- a day response has a string date, the exact Mauritius timezone literal, numeric count, and only schema-valid Council results;
- a month response has a `dates` array whose items each contain a string date and numeric count.

Cancelled requests use the browser abort signal and must not replace a newer view state.
