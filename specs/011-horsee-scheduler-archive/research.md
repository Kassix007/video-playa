# Research: Long-Term HORSEE Scheduler and Hybrid Archive

## Decision 1: Keep the scheduler core provider-independent

**Decision**: Model scheduling as injected racecard source, job/result stores, clock, logger, prompt builder, and dispatcher contract. The first dispatcher is queue-only and performs no external reasoning call.

**Rationale**: The failure being solved happens before HORSEE reaches its MCP. Moving discovery, timing, state, and recovery outside ChatGPT is useful only if those responsibilities do not acquire a different provider dependency.

**Alternatives considered**:

- Call a model directly from the scheduler — rejected by the explicit non-goal and because credentials/provider outages would again control scheduling.
- Automate ChatGPT desktop/browser sessions — rejected as unsupported and unsafe.
- Put timing in the dashboard — rejected because a browser tab is not a durable worker.

## Decision 2: Reuse the current SMSPariaz parser and Mauritius helpers

**Decision**: Call `getSmspariazDailyRacecard()` unchanged and reject any non-success or date mismatch. Extend `server/mauritius-time.ts` only with pure conversion helpers for `YYYY-MM-DD` + `HH:mm` and wall-minute differences.

**Rationale**: The parser already fetches SMSPariaz directly, verifies the Mauritius programme date, returns every meeting/race, and exposes injectable test seams. Re-parsing or using web search would regress the established source contract.

**Alternatives considered**:

- Build a second lightweight programme parser — rejected because it creates two authorities.
- Trust UTC dates or the server's local timezone — rejected because day and timing boundaries are explicitly Mauritius-local.
- Compare raw seconds against minute-only off-times — rejected because scheduler jitter near a boundary could turn an intended 30-minute case into 29:59. Scheduling truncates the injected clock to the minute before comparison.

## Decision 3: Use deterministic jobs plus ETag CAS, not locks alone

**Decision**: Store one daily queue keyed by deterministic `${programmeDate}:${race_id}` IDs, open Netlify Blobs with strong consistency, and update compact objects with `getWithMetadata()` plus `setJSON(..., { onlyIfMatch })`. Use `onlyIfNew`/ETag takeover for a short expiring lease and bounded CAS retries for every read-modify-write operation.

**Rationale**: Netlify Blobs defaults to eventual consistency and last-write-wins, but the installed v11 API supports strong reads and atomic conditional writes. The official docs also state that Blobs has no built-in concurrency controller, so an application lease improves efficiency while CAS prevents lost updates. [Netlify Blobs documentation](https://docs.netlify.com/build/data-and-storage/netlify-blobs/)

**Alternatives considered**:

- One Blob per job — rejected because it grows object count and makes daily reconciliation/listing more expensive.
- Unconditional daily JSON writes — rejected because overlapping saves or job transitions could overwrite each other.
- Lease without CAS — rejected because a crashed/expired owner or concurrent Council save could still lose state.
- Permanent distributed lock — rejected because it can disable scheduling after a crash.

## Decision 4: Canonical compact Council day documents with bounded caches

**Decision**: Preserve `CouncilResultStore` and the production namespace, but make `days/YYYY-MM-DD.json` the authoritative hot result document, keyed by exact date and `race_id`. Refresh `latest.json` and `recent.json` as bounded caches after the day write. Keep `results/**` read-only until migration and preserve the bounded private audit records.

**Rationale**: The current implementation writes `results/YYYY-MM-DD/<timestamp>-<uuid>.json` forever and scans legacy keys for date queries. One day document makes a repeated save an update, bounds routine reads, and keeps existing public methods stable.

**Alternatives considered**:

- Replace the store interface and API envelopes — rejected because MCP and existing dashboard code depend on them.
- Keep unlimited revisions and archive them all — rejected because the new requirement explicitly defines one current result per date/race.
- Treat `latest.json` or `recent.json` as authoritative — rejected because cache write failures would risk losing the only durable result.

## Decision 5: Layer archive reads behind existing history behavior

**Decision**: For an old exact date missing from hot storage, read and validate its yearly NDJSON archive; for month counts, merge the yearly monthly index with hot/legacy counts and let hot state override the matching date. `getHistory(limit)` remains satisfied by the bounded recent cache for its existing small MCP limit.

**Rationale**: Retention would otherwise make `/api/council/history` and the calendar silently lose older days, violating backward compatibility. Archive fallback keeps current response envelopes unchanged.

**Alternatives considered**:

- Never delete Council results from Blobs — rejected because it defeats the core storage requirement.
- Change the dashboard to browse GitHub directly — rejected because it couples the frontend to archive layout, leaks provider errors, and cannot support private repositories safely.
- Download every daily archive for a calendar month — rejected because the monthly index exists to make discovery cheap.

## Decision 6: Use the GitHub Contents API through built-in fetch

**Decision**: Implement a small client around repository content GET/PUT with `Authorization: Bearer` only when a token exists, the recommended GitHub JSON Accept header, an explicit API-version header, Base64 content, update blob SHA, finite timeout, and one bounded conflict/transient retry. Sanitize errors before they leave the client.

**Rationale**: The repository has no GitHub SDK, and the required operations are small. GitHub documents `200` updates, `201` creates, `404` reads, and `409`/`422` write failures for this endpoint. It also requires the existing blob SHA for an update and recommends serial writes. [GitHub repository contents API](https://docs.github.com/en/rest/repos/contents)

**Alternatives considered**:

- Add Octokit — rejected as unnecessary dependency weight.
- Use unauthenticated writes — impossible; unauthenticated GET remains useful for public archive fallback.
- Retry indefinitely — rejected because scheduled functions have hard execution limits and rate limits must not create loops.
- Put response bodies/headers in errors — rejected because providers can echo sensitive or excessive data.

## Decision 7: Treat three archive files as one logical idempotent daily batch

**Decision**: Generate deterministic NDJSON, compact racecard JSON, and the updated month index; compare remote bytes and upsert changed files sequentially; read back and verify required content before marking the day `ARCHIVED`. Keep a SHA-256 digest of NDJSON separate from GitHub's blob SHA.

**Rationale**: Identical bytes make reruns no-ops. Sequential daily writes produce a small fixed number of commits per day rather than one per race. A local failed state plus deterministic rerun repairs partial multi-file success.

**Alternatives considered**:

- One commit per race — rejected explicitly and operationally wasteful.
- Huge pretty-printed daily arrays — rejected in favor of stream-friendly one-result-per-line NDJSON.
- Git Data API tree/commit/ref workflow — deferred because it is substantially more complex. It is the appropriate future option only if exactly one physical Git commit per day becomes mandatory.
- Delete hot data immediately after PUT — rejected; remote read-back verification and an archived state are required first.

## Decision 8: Archive the exact stored racecard, not a later refetch

**Decision**: Persist every successful current-day `SmspariazRacecardSuccess` used by reconciliation and archive that snapshot alongside results.

**Rationale**: A later fetch may have changed, disappeared, or rolled to the next date. Reconstructing what the scheduler actually saw requires the exact parsed card.

**Alternatives considered**:

- Refetch during archive — rejected because it is no longer guaranteed to represent scheduling input.
- Archive the original PDF — rejected as unnecessary for the required reconstruction and materially larger.
- Archive only jobs — rejected because jobs omit meeting/racecard context that may matter later.

## Decision 9: Separate scheduled and HTTP adapters

**Decision**: Use one Netlify function with `schedule: "*/5 * * * *"` for scheduler invocation, one daily scheduled archive function, and separate URL-addressable functions for authorized manual run/status/job/archive operations.

**Rationale**: Netlify's current function configuration makes `schedule` and `path` mutually exclusive. Scheduled functions are available on all plans and cron is evaluated in UTC, but scheduled runs have a 30-second limit and only fire automatically on published deploys. [Netlify scheduled functions](https://docs.netlify.com/build/functions/scheduled-functions/), [Netlify function limits](https://docs.netlify.com/build/functions/configuration/)

**Alternatives considered**:

- One function that is both scheduled and HTTP-addressable — rejected by the current platform contract.
- Tie core logic to Netlify event payloads — rejected because an authorized external invoker must be able to recover scheduling if hosting constraints change.
- Archive within every five-minute run — rejected because GitHub work increases duration and failure coupling under the 30-second scheduled limit.

## Decision 10: Reuse OAuth and allow one optional server-only scheduler key

**Decision**: Public GET endpoints return strict secret-free projections. Mutation endpoints accept the existing verified Council OAuth write scope or an optional `HORSEE_SCHEDULER_API_KEY` bearer token checked in constant time. The platform-triggered scheduled adapter calls the domain service directly.

**Rationale**: Existing Auth0/OAuth behavior remains intact, while a non-browser external scheduler needs a narrow unattended credential. The browser currently has no OAuth session/token plumbing and must never receive the scheduler key.

**Alternatives considered**:

- Public POST endpoints — rejected as an obvious duplicate-work and state-tampering risk.
- Embed the scheduler key in frontend code — rejected because the bundle and browser are public.
- Require archive credentials for scheduling — rejected because archive availability is designed to degrade independently.

## Decision 11: Add one composite read-only dashboard snapshot

**Decision**: Add `HorseeSchedulerDashboard` immediately after the existing manual Council console. It polls one `/api/horsee/scheduler/status` projection approximately every 30 seconds, retains the last good snapshot on transient error, and offers only `Copy HARD Prompt` in the browser.

**Rationale**: One projection keeps counts, upcoming jobs, and archive health from the same queue revision and avoids several new Blob reads. Copy-only operation fits the current unauthenticated page without exposing a mutation credential.

**Alternatives considered**:

- Merge scheduler code into `CouncilArchive` — rejected because operational jobs and stored results have different states and refresh behavior.
- Add mutation buttons immediately — rejected because the current page has no authenticated operator session.
- Modify the MCP Apps widget — rejected because its CSP has no connect domains and the request specifically names the existing Equidia dashboard; the embedded widget remains unchanged.

## Decision 12: Make migration explicit and rerunnable

**Decision**: Implement a TypeScript CLI run through `tsx` that enumerates flat and dated legacy keys, validates results, derives Mauritius dates from `analysed_at`, keeps the newest valid result per exact race ID, archives/verifies one day at a time, and deletes only verified keys when `--delete-after-verified` is present.

**Rationale**: Reusing the TypeScript schema/archive code avoids drift. Default no-delete preserves recoverability, and per-day verification limits any explicit deletion scope.

**Alternatives considered**:

- Automatic migration on deploy — rejected because it can exceed function limits and makes release rollback unsafe.
- Standalone JavaScript duplicating schemas — rejected because the authoritative validators already exist in TypeScript.
- Infer a legacy programme date from race labels — rejected; `analysed_at` in Mauritius is the only consistent available rule and its midnight limitation must be reported.

## Resolved Risks and Assumptions

- `CouncilResult` has no `programme_date` or `meeting_number`. Hot/migration dates use Mauritius `analysed_at`; archive ordering joins the stored racecard by race ID, then falls back to parsed `R<n>C<n>`, `race_number`, `race_id`, and timestamp.
- The earlier history feature retained repeated analyses. Spec 011 intentionally changes the canonical current record and calendar count to one result per date/race; legacy source objects remain untouched until explicit migration deletion.
- GitHub Contents writes are not atomic. A day remains unverified until all required remote bytes and index data read back successfully.
- Archive credentials are optional for normal operation. Public archives may still be readable without a token; private archives require the server token for reads.
- Automated tests use fakes and fixtures only. Live Netlify/GitHub/SMSPariaz checks are manual production-readiness steps, not test-suite dependencies.
