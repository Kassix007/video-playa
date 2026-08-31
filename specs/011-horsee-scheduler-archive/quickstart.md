# Quickstart: Validate the HORSEE Scheduler and Hybrid Archive

This guide validates the completed feature locally and in a production-like Netlify environment. Automated checks use fixtures/fakes; do not point migration deletion or archive writes at production until dry-run output has been reviewed.

## Prerequisites

- Node.js 22.19 or newer
- Project dependencies installed with `npm install`
- Netlify CLI available for full local function/UI validation
- A test GitHub repository named for the current year, such as `Kassix007/horsee-archive-2026`, when exercising live archive writes
- A fine-grained GitHub token with Contents read/write permission only for the test archive repository

## Configuration

Normal scheduling works without GitHub credentials. Configure archive values only in server-side Netlify environment variables or an uncommitted local shell:

```text
HORSEE_GITHUB_ARCHIVE_OWNER=Kassix007
HORSEE_GITHUB_ARCHIVE_PREFIX=horsee-archive-
HORSEE_GITHUB_TOKEN=<server-only token>

HORSEE_HOT_RETENTION_DAYS=14
HORSEE_RECENT_RESULT_LIMIT=100

HORSEE_PRIMARY_MIN_MINUTES=30
HORSEE_PRIMARY_MAX_MINUTES=44
HORSEE_RECOVERY_MIN_MINUTES=15
HORSEE_RECOVERY_MAX_MINUTES=29

HORSEE_SCHEDULER_API_KEY=<optional server-to-server key>
```

Do not prefix any value with `VITE_`. Browser bundles must contain none of these secrets.

Existing HORSEE OAuth variables remain unchanged and may authorize mutation endpoints:

```text
HORSEE_MCP_RESOURCE
HORSEE_OAUTH_ISSUER
HORSEE_OAUTH_JWKS_URI
HORSEE_OAUTH_WRITE_SCOPE
```

## Automated validation

Run the complete server test suite:

```powershell
npm run test:mcp
```

Expected outcomes include:

- 44 and 30 minutes before off become READY/PRIMARY.
- 29 and 15 minutes become READY/RECOVERY.
- 45 minutes remains PENDING; 14 minutes becomes MISSED under defaults.
- repeated and overlapping scheduling produce one job and one prompt.
- a stale SMSPariaz card produces no jobs.
- same-date/race result saves leave one canonical current result.
- NDJSON ordering and SHA-256 are deterministic.
- GitHub create, update, identical no-op, conflict, rate-limit, timeout, and verification failures are handled without token leakage.
- only verified archived dates older than retention are deleted.
- migration groups by Mauritius date, deduplicates newest result, and never deletes by default.
- all existing MCP, OAuth, racecard, save, latest, today, and history regressions continue to pass.

Run lint and the production build:

```powershell
npx eslint server netlify/functions src scripts
npm run build
```

The build must regenerate the MCP widget normally without changing its scheduler scope and must finish with no TypeScript or Vite errors.

## Local end-to-end validation

Start the full Netlify environment rather than Vite alone:

```powershell
npx netlify dev
```

Open:

```text
http://localhost:8888/#/equidia
```

Validate:

1. Existing Equidia playback, manual Council console, Selection Board, Today, and calendar still render.
2. The HORSEE Scheduler section shows the Mauritius date and a coherent snapshot.
3. With no archive token, archive health says `Not configured` while scheduler status still loads.
4. A READY fixture/job exposes Copy HARD Prompt; copying reports success through a polite live region and the prompt contains race/date/HARD requirements.
5. Clipboard denial or unavailable clipboard reports a concise error and does not change job state.
6. Scheduler data refreshes on mount and when returning focus without overlapping requests or clearing the last good snapshot on a transient failure.
7. Browser developer tools show no archive token, scheduler key, OAuth bearer, or full internal provider error in scripts, requests, responses, or logs.

## Responsive and accessibility validation

At 375, 768, and 1280 pixels:

- Assert `document.documentElement.scrollWidth === document.documentElement.clientWidth`.
- Tab through every scheduler control and confirm a visible focus state.
- Activate Copy HARD Prompt using the keyboard.
- Confirm every state has text as well as color.
- Confirm long racecourse, repository, and sanitized error values wrap rather than overflow.
- Confirm the job layout stacks at narrow widths and copy buttons remain at least 44 pixels high.
- Confirm no unexpected motion is introduced when reduced motion is enabled.
- Confirm the console has no runtime, accessibility, or failed-request noise beyond deliberately simulated failures.

## Authorized scheduler invocation

For local OAuth testing, reuse the existing development write token setup documented in the README. For an external server-to-server scheduler, configure `HORSEE_SCHEDULER_API_KEY` only in the invoking server and Netlify, then call:

```text
POST /api/horsee/scheduler/run
Authorization: Bearer <server-only scheduler key>
```

Call twice during the same minute. Both successful reads must describe the same deterministic jobs and prompts; a live overlapping lease may return `409 scheduler_busy`, and the following invocation must work after lease expiry.

Inspect read-only views:

```text
GET /api/horsee/scheduler/status
GET /api/horsee/jobs/today
GET /api/horsee/jobs/ready
GET /api/horsee/jobs/next
GET /api/horsee/archive/status
```

## Archive repository setup

For each year:

1. Create `${HORSEE_GITHUB_ARCHIVE_OWNER}/${HORSEE_GITHUB_ARCHIVE_PREFIX}${year}`.
2. Initialize its default branch with a README so the Contents API has a branch to update.
3. Grant the fine-grained server token Contents read/write permission to that repository only.
4. Do not add the token to the repository, client environment, prompts, or Netlify build output.
5. Run an explicit archive against a completed test day.

Expected files:

```text
results/YYYY/MM/YYYY-MM-DD.ndjson
racecards/YYYY/MM/YYYY-MM-DD.json
indexes/YYYY/MM.json
```

Run the same archive call twice. The second response must report unchanged and the repository must receive no additional content commit for identical files.

Temporarily revoke or replace the token and rerun against a different test date. The date must be FAILED/retryable locally and its hot data must remain present.

## Retention validation

Seed four operational dates:

- today
- an old verified ARCHIVED day
- an old FAILED archive day
- an old unarchived day

Run the authorized cleanup route. Only the old verified day may be removed. Re-run cleanup; it must be a no-op. Confirm `latest` and bounded recent results remain available.

## Migration dry run

Run the migration command without deletion first:

```powershell
npx tsx scripts/migrate-council-history-to-archive.ts --dry-run
```

Review counts for:

- enumerated flat and dated legacy keys
- valid and invalid results
- Mauritius date groups
- duplicate date/race identities
- dates that would create, update, or no-op archive content

Then archive without deletion:

```powershell
npx tsx scripts/migrate-council-history-to-archive.ts
```

Verify archive files and monthly indexes before considering deletion. Only after a backup and review, run:

```powershell
npx tsx scripts/migrate-council-history-to-archive.ts --delete-after-verified
```

The deletion run must print exact verified source-key counts by date, preserve invalid/unverified keys, and be safely rerunnable. Legacy programme dates are derived from `analysed_at` in Mauritius; review records near midnight before destructive migration.

## Production deployment checks

After a published Netlify deploy:

1. Confirm `horsee-scheduler` has a Scheduled badge and next run at the five-minute cron cadence.
2. Confirm `horsee-archive` has its daily schedule.
3. Remember that Deploy Previews do not run scheduled functions automatically; use Netlify's Run now action or the authorized HTTP route.
4. Watch concise logs for programme count, ready/recovery identities, already-completed races, archive counts, and unchanged skips.
5. Confirm no log contains a prompt body, Council result body, token, or Authorization header.
6. Confirm a failed scheduled invocation does not prevent the next five-minute run.
7. Confirm existing `/mcp` discovery and current Council APIs still work from production.

## Expected limitations at first release

- READY jobs are copied manually; no AI/model/browser dispatcher is implemented.
- The public dashboard intentionally omits mutation controls until a browser OAuth session exists.
- The GitHub Contents API may create up to one commit for each changed daily results, racecard, and monthly index file; it never commits per race. Exactly one physical commit per day would require a later Git Data API adapter.
- Scheduled functions have a 30-second ceiling. Normal scheduler and one-day archive work are designed to fit; long migration and large catch-up operations use the CLI/authorized adapter instead.
- Legacy records have no explicit programme date or meeting number. Migration uses Mauritius `analysed_at` and deterministic fallbacks, reporting rather than hiding midnight ambiguity.
