# Implementation Plan: Long-Term HORSEE Scheduler and Hybrid Archive

**Branch**: `011-horsee-scheduler-archive` | **Date**: 2026-08-23 | **Spec**: [spec.md](spec.md)

**Input**: Feature specification from `specs/011-horsee-scheduler-archive/spec.md`

## Summary

Add a provider-independent HORSEE scheduler that reconciles the existing authoritative SMSPariaz card into deterministic daily jobs, promotes work through primary and recovery timing windows, and exposes self-contained READY prompts without calling an AI provider. Keep operational state in compact, strongly read, CAS-updated Netlify Blob day documents; refactor Council result writes to one current result per date/race while preserving legacy reads and existing API/MCP envelopes. Archive verified daily NDJSON results, the exact parsed racecard, and a monthly index into year-specific GitHub repositories, then delete only archived hot days older than configurable retention. Add separate scheduled and authenticated HTTP adapters, a safe migration CLI, and one read-only scheduler panel on Equidia.

## Technical Context

**Language/Version**: TypeScript 5.8, ECMAScript modules, Node.js 22; React 18 for the existing dashboard

**Primary Dependencies**: Zod 4 for strict schemas; `@netlify/blobs` 11 for strongly consistent operational storage and conditional ETag writes; `@netlify/functions` 6 for scheduled/HTTP adapters; built-in `fetch`, `AbortController`, and `node:crypto`; existing SMSPariaz/PDF and Auth0/OAuth code unchanged

**Storage**: Existing deploy-isolated Netlify Blob namespaces for hot state; compact local JSON files for development; yearly GitHub repositories through the REST Contents API for durable daily archives; legacy `results/**` blobs retained as migration input

**Testing**: Node test runner through `tsx --test server/*.test.ts`; pure/in-memory fakes for scheduling, conditional writes, GitHub responses, retention, and migration; TypeScript/Vite production build; ESLint; browser QA through Netlify Dev at 375, 768, and 1280 pixels

**Target Platform**: Netlify Functions on Node 22 plus the existing Vite single-page application; GitHub REST API for archives

**Project Type**: Existing web application with server-side MCP/domain modules, Netlify function adapters, and a React dashboard

**Performance Goals**: Reconcile a normal daily card and persist one queue within a five-minute cadence; serve one scheduler dashboard snapshot without multiple inconsistent reads; keep routine current/date reads proportional to one compact day or bounded recent cache rather than total multi-year history; complete scheduled adapters within Netlify's 30-second scheduled-function ceiling in normal conditions

**Constraints**: `Indian/Mauritius` is authoritative; the existing SMSPariaz parser and Council schema remain authoritative; scheduler cannot call an AI provider; archive token and mutation secret are server-only; no automatic legacy deletion; no hot cleanup before remote verification; one current result per date/race; existing API/MCP envelopes remain compatible; GitHub Contents writes are multi-file and therefore logically transactional but not physically atomic

**Scale/Scope**: Approximately one racecard and tens of jobs/results per day for at least 6–7 years; hot state bounded to today plus 14 prior days and 100 recent results by default; daily archive batching rather than per-race commits; one scheduler panel added to the existing Equidia page; MCP widget and media player remain unchanged

## Constitution Check

*GATE: Passed before research and passed again after design.*

| Principle | Pre-design evaluation | Post-design evaluation |
|-----------|-----------------------|------------------------|
| Every task is traceable to a specification | PASS — numbered spec 011 contains testable scenarios and measurable outcomes; implementation details are isolated here. | PASS — data model, contracts, quickstart, and forthcoming tasks map back to spec requirements. |
| Responsive by default | PASS — scheduler UI explicitly targets 375, 768, and 1280 pixels. | PASS — dedicated compact grid/list panel and mobile stacking are specified; no new route or wide fixed table is introduced. |
| Accessible interaction | PASS — requirements mandate native labeled controls, focus visibility, keyboard use, and live copy feedback. | PASS — browser contract limits UI mutation to a native Copy button and defines semantic section, list, status text, and focus behavior. |
| Safe media embedding | PASS — no iframe, media source, CSP, or player permission changes are planned. | PASS — the separate MCP widget and existing player are intentionally out of scope. |
| Verified changes | PASS — plan includes current tests, new tests, build, lint, and responsive browser QA. | PASS — quickstart defines runnable verification and no live external dependency is required for automated tests. |

No constitution violations require justification.

## Project Structure

### Documentation (this feature)

```text
specs/011-horsee-scheduler-archive/
├── spec.md
├── plan.md
├── research.md
├── data-model.md
├── quickstart.md
├── contracts/
│   └── horsee-api.md
├── checklists/
│   └── requirements.md
└── tasks.md
```

### Source Code (repository root)

```text
server/
├── mauritius-time.ts                 # add race-time/date arithmetic helpers
├── council-store.ts                  # compact hot days, bounded caches, legacy compatibility
├── horsee-config.ts                  # central Zod environment parsing
├── horsee-job-schema.ts              # job, queue, lease, scheduler and archive schemas
├── horsee-job-store.ts               # hot queue/racecard/archive-state storage + CAS leases
├── horsee-prompt-builder.ts           # self-contained HARD prompt
├── horsee-dispatch.ts                 # provider-neutral interface + queue-only adapter
├── horsee-scheduler.ts                # pure reconciliation/timing and orchestrator
├── github-archive-client.ts           # minimal GET/PUT Contents API client
├── horsee-archive.ts                  # NDJSON, index, verification, retention and archive reads
├── horsee-migration.ts                # pure legacy grouping/deduplication workflow
└── *.test.ts                          # scheduler, store, archive, config, migration regressions

netlify/functions/
├── horsee-scheduler.ts                # five-minute scheduled adapter
├── horsee-scheduler-api.ts            # GET status / authorized POST run
├── horsee-jobs.ts                     # job read and authorized transition routes
├── horsee-archive.ts                  # daily scheduled archive/cleanup adapter
└── horsee-archive-api.ts              # status and authorized manual archive routes

scripts/
└── migrate-council-history-to-archive.ts

src/
├── services/horsee.ts                 # strict secret-free dashboard client DTOs
├── components/council/HorseeSchedulerDashboard.tsx
└── pages/
    ├── Equidia.tsx                    # insert scheduler panel only
    └── Equidia.css                    # panel, status, focus and responsive rules

docs/
└── horsee-scheduler.md

netlify.toml                            # redirects and function schedules
package.json                            # migration command only if needed
tsconfig.mcp.json                       # include TypeScript migration script if selected
README.md                               # concise link/configuration update
```

**Structure Decision**: Keep provider-independent domain behavior under `server/`, where the existing Council and racecard logic already lives. Netlify files remain thin adapters and never own scheduler rules. Preserve the React/Netlify split and add one sibling Council component rather than expanding the already large Equidia page or changing the embedded MCP widget.

## Design Decisions

### Operational write model

- `CouncilResultStore.save()` validates first, CAS-upserts `days/YYYY-MM-DD.json`, then refreshes `latest.json` and bounded `recent.json` as rebuildable caches. Existing method signatures and returned raw `CouncilResult` values do not change.
- New compact reads are canonical. Legacy `results/**` keys remain a read-only compatibility and migration source; after a recorded migration they are not scanned by every routine hot read.
- Scheduler state uses its own deploy-isolated namespace and ETag conditional writes. A short lease reduces redundant work; CAS retries remain the actual lost-update protection.

### Scheduler lifecycle

1. Acquire an expiring scheduler lease.
2. Fetch `getSmspariazDailyRacecard()` and require a current success response.
3. Load the current queue and exact current-day Council results.
4. Reconcile races by `programme_date:race_id`, preserving terminal progress and marking removed pending races missed/source-removed.
5. Truncate the injected clock to wall-clock minutes and apply inclusive primary/recovery windows.
6. Generate a prompt only on a transition to READY; never regenerate or dispatch a terminal/in-flight job.
7. Mark jobs SAVED only when a matching validated result exists.
8. CAS-persist the racecard snapshot, queue, and compact scheduler status; release/expire only the owned lease.

### Archive and history compatibility

- Archive uses the stored racecard and hot-day results, joins race context where available for deterministic meeting/race ordering, produces canonical NDJSON plus compact racecard JSON, calculates SHA-256 over NDJSON, and sequentially upserts result, racecard, then monthly index.
- The date becomes `ARCHIVED` only after read-back verification. Identical remote bytes are no-ops. Partial multi-file success remains `FAILED` locally and is repaired idempotently on retry.
- Existing historical API behavior survives retention through layered reads: compact hot/legacy data first, daily archive fallback for an old date, and monthly index merge for date counts. Hot entries override the matching archive day to avoid double counting a corrected current day.

### Hosting adapters and authorization

- Netlify scheduled functions use `*/5 * * * *` for scheduling and one daily UTC cron for archive/catch-up. Scheduled functions and URL paths are separate because the platform configuration treats them as mutually exclusive.
- Read-only dashboard/job status is public and strictly projected. Mutations accept either the existing verified Council OAuth write authorization or an optional constant-time `HORSEE_SCHEDULER_API_KEY` bearer token for external schedulers/operators.
- The browser ships Copy HARD Prompt only. Mark-dispatched/retry UI waits for a real browser OAuth session; no server secret enters frontend code.

### Failure and observability model

- Domain failures are concise structured codes/messages, with secrets and full payloads excluded. Job failures retain attempts and can be promoted again during a valid later window or explicitly retried.
- Archive unconfigured/unavailable is a degraded subsystem, not a scheduler startup failure.
- Logs contain counts, identities, transitions, hashes/no-op decisions, and redacted error summaries only.

## Verification Strategy

- Extend `npm run test:mcp` with pure boundary tests at 44/30/29/15/14 minutes, Mauritius midnight, stale cards, repeated/overlapping invocations, CAS conflicts, result replacement, archive create/update/no-op/verification failure, safe retention, and migration deletion gates.
- Use injected fakes for racecard fetch, clock, Blob/CAS storage, result lookup, dispatcher, GitHub fetch, and logger; automated tests make no live SMSPariaz, Netlify, GitHub, OAuth, or model calls.
- Run `npm run test:mcp`, ESLint over changed server/function/frontend files, and `npm run build`.
- Run the end-to-end quickstart with Netlify Dev, then browser-check the Equidia flow at 375, 768, and 1280 pixels for zero horizontal overflow, native keyboard operation, visible focus, copy success/failure feedback, and clean console output.
