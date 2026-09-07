# Peakpool data model

## PeakpoolProgramme

| Field | Meaning | Validation |
|---|---|---|
| `source_fingerprint` | Current source-script profile identity | Must match the approved profile before preparation or placement. |
| `retrieved_at` | Server receipt time | UTC timestamp. |
| `races` | Current provider races | Bounded, non-empty only when the provider returns valid data. |

## PeakpoolRace

| Field | Meaning | Validation |
|---|---|---|
| `meeting_number` | Provider meeting identifier | Must be a safe identifier from the current fixture. |
| `race_number` | Provider race identifier | Must be a safe identifier from the current fixture. |
| `date`, `time`, `track`, `name` | Display details | Provider values; never used as request authority. |
| `runners` | Current runner collection | Each runner is uniquely identified inside the race. |

## PeakpoolRunner

| Field | Meaning | Validation |
|---|---|---|
| `runner_number` | Provider horse number | Must originate from the current fixture. |
| `name` | Display name | Display-only, bounded text. |
| `displayed_pool_value` | Provider's displayed `type` value | Preserve as display data; do not interpret it as fixed odds or payout. |
| `selection_code` | Product-specific code | Derived only as `R<meeting>C<race>H<runner>` from resolved fixture fields. |

## PeakpoolPreparedTicket

| Field | Meaning | Validation |
|---|---|---|
| `handle` | Opaque server-issued identity | Random, unguessable, short-lived, never client-editable. |
| `principal_binding` | Authorized caller binding | Must match on placement. |
| `session_generation` | Authenticated-session binding | Must match the current validated session. |
| `selection_code` | Resolved Peakpool runner | Must still resolve during pre-submit validation. |
| `bet_type` | `win` or `place` when verified | Must be explicitly allowed by the current profile. |
| `unit_stake` | Non-cash Peakpool units | Exact format/range comes from the approved provider profile. |
| `source_fingerprint` | Audited app-flow identity | Must match immediately before submission. |
| `state` | Lifecycle | `PREPARED -> SUBMITTING -> SUCCEEDED | REJECTED | AMBIGUOUS | EXPIRED`. |

## PeakpoolAppFlowProfile

| Field | Meaning |
|---|---|
| `origin`, `path`, `method` | Positively verified provider destination. |
| `request_fields` | Exact ordered/required form field set. |
| `message_grammar` | Server-generated Peakpool-only grammar after authorized verification. |
| `source_hashes` | Current `site.js` and `mobile.js` evidence. |
| `app_requirements` | Verified cookies, app mode, registration, and headers. |
| `response_schema` | Success, provider rejection, and ambiguity classification rules. |

## PeakpoolPlacementResult

| Field | Meaning |
|---|---|
| `success` | Provider-classified outcome. |
| `reference`, `confirmation` | Returned only when the provider supplies them. |
| `unit_stake`, `unit_balance`, `leaderboard` | Returned only from verified provider response fields. |
| `submitted_via` | Constant product identifier: `smspariaz_peakpool_app_flow`. |

## Relationships and state transitions

```text
PeakpoolProgramme -> PeakpoolRace -> PeakpoolRunner
PeakpoolRunner + unit stake + authenticated session -> PeakpoolPreparedTicket
PeakpoolPreparedTicket + explicit approval -> PeakpoolPlacementResult

PREPARED --atomic claim--> SUBMITTING --provider result--> SUCCEEDED | REJECTED | AMBIGUOUS
PREPARED --expiry/session mismatch--> EXPIRED
```
