# Feature Specification: Long-Term HORSEE Scheduler and Hybrid Archive

**Feature Branch**: `011-horsee-scheduler-archive`

**Created**: 2026-08-23

**Status**: Complete

**Input**: User description: "Build a production-ready, provider-independent HORSEE scheduler with compact operational storage, daily yearly archives, safe migration, dashboard visibility, and reliable recovery for 6–7+ years without replacing the existing SMSPariaz racecard parser or Council workflow."

**Amendment (2026-09-01)**: Automatic five-minute scheduling is disabled to control function usage. Authorized manual scheduling remains available; the daily archive schedule is unchanged.

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Build Today's Reliable Race Queue (Priority: P1)

As a HORSEE operator, I want the current official SMSPariaz programme reconciled into one durable daily race queue so that every eligible race can be analysed once even when scheduler invocations overlap, repeat, or resume after an interruption.

**Why this priority**: Reliable race discovery and deduplication are the foundation for every downstream prompt, dispatch, result, and archive operation.

**Independent Test**: Invoke scheduling repeatedly and concurrently against a current multi-meeting programme and verify that each race has exactly one stable job, completed jobs remain completed, and no stale programme creates work.

**Acceptance Scenarios**:

1. **Given** the official programme matches the current Mauritius date, **When** scheduling runs, **Then** every discovered race is represented once in the current-day queue with a stable identity.
2. **Given** the same programme and time are processed repeatedly, **When** scheduling runs again, **Then** no duplicate jobs or prompts are created and existing progress is preserved.
3. **Given** the official programme changes during the day, **When** scheduling runs again, **Then** newly listed races are added while completed work is retained and removed races are identified without silently deleting history.
4. **Given** the official programme is stale or unavailable, **When** scheduling runs, **Then** no jobs are created from untrusted data, a concise failure is recorded, and a future run can recover automatically.

---

### User Story 2 - Prepare Council Work at the Right Time (Priority: P1)

As a Council operator, I want each race to become ready approximately 30–44 minutes before its scheduled Mauritius off-time, with a 15–29 minute recovery opportunity, so that analyses are timely without depending on exact quarter-hour invocations.

**Why this priority**: Timing is the principal operational purpose of the scheduler and must tolerate arbitrary invocation times and missed runs.

**Independent Test**: Evaluate jobs at all timing boundaries and verify primary, recovery, pending, and missed outcomes without contacting any reasoning provider.

**Acceptance Scenarios**:

1. **Given** a pending race is 30–44 minutes from off, **When** scheduling runs, **Then** the job becomes ready in primary mode.
2. **Given** a pending race is 15–29 minutes from off because the primary opportunity was missed, **When** scheduling runs, **Then** the job becomes ready in recovery mode.
3. **Given** a race is more than 44 minutes from off, **When** scheduling runs, **Then** it remains pending.
4. **Given** a race is later than the configured recovery cutoff, **When** scheduling runs, **Then** it is marked missed rather than being started normally unless late analysis has been explicitly enabled.
5. **Given** two scheduler runs overlap, **When** the same race becomes eligible, **Then** at most one ready transition is retained and neither run permanently locks future scheduling.

---

### User Story 3 - Hand Off Self-Contained Council Jobs (Priority: P1)

As a future dispatch integrator, I want ready jobs to contain self-contained HARD Council instructions and use a provider-neutral handoff contract so that HORSEE can later work with a desktop helper, an official model service, or another reasoning provider without changing scheduling.

**Why this priority**: Moving timing outside ChatGPT solves the reliability problem only if the scheduler remains independent of a particular AI product or authentication mechanism.

**Independent Test**: Prepare a ready job, inspect its prompt and handoff state, and verify that no model call or browser automation occurs and that a no-op/manual dispatcher leaves the job safely ready.

**Acceptance Scenarios**:

1. **Given** a race becomes ready, **When** its prompt is generated, **Then** the prompt includes the explicit Mauritius date, race identity, full HARD Council protocol, authoritative programme instruction, and structured-save expectation.
2. **Given** a fresh HORSEE-capable reasoning session receives the prompt, **When** it reads the prompt without prior conversation, **Then** it has enough context to initiate the intended Council workflow.
3. **Given** no automated reasoning provider is configured, **When** dispatch is attempted through the default adapter, **Then** the job remains safely available for manual handling.
4. **Given** a job is already dispatched, running, or saved, **When** scheduling repeats, **Then** it is not dispatched again.

---

### User Story 4 - Keep Operational History Compact (Priority: P1)

As the service owner, I want recent Council results and scheduling state stored compactly by day with deterministic race replacement so that operational storage remains bounded while current APIs stay useful.

**Why this priority**: Unbounded per-save objects cannot remain practical on free service tiers over six or more years.

**Independent Test**: Save the same race result twice, query current and historical compatibility views, then inspect operational records and verify one latest result per programme date and race.

**Acceptance Scenarios**:

1. **Given** a valid Council result is saved for a race, **When** the same programme date and race are saved again, **Then** the latest structured result replaces the prior current version instead of creating an unlimited duplicate.
2. **Given** recent results span several dates, **When** latest, daily, history, and date-count views are requested, **Then** the established public behavior remains compatible.
3. **Given** a result fails authoritative Council validation, **When** storage or archive is attempted, **Then** it is rejected and cannot be marked saved.
4. **Given** archived days age beyond the configured hot-retention period, **When** cleanup runs, **Then** only verified archived operational data is eligible for removal while current and recent lookup data remain available.

---

### User Story 5 - Preserve Daily Results for Years (Priority: P1)

As the HORSEE owner, I want each completed day archived once as deterministic structured results plus the parsed racecard used that day, organized in yearly repositories, so that the system retains reconstructable history for at least six to seven years without one commit per race.

**Why this priority**: The long-term archive is the mechanism that makes bounded hot storage safe and operationally affordable.

**Independent Test**: Archive a completed day twice and verify deterministic ordering, one result per race, a racecard snapshot, a monthly discovery index, a content digest, and no second write when content is unchanged.

**Acceptance Scenarios**:

1. **Given** a day has validated Council results and a parsed racecard snapshot, **When** it is archived, **Then** results are written as one line per complete result in deterministic race order and the racecard is stored as a compact daily snapshot.
2. **Given** a daily archive succeeds and is verified, **When** archive state is updated, **Then** the day is marked archived with repository, paths, result count, time, and content digest.
3. **Given** the generated daily content already matches the archive, **When** archiving repeats, **Then** the operation reports no change and creates no useless revision.
4. **Given** the archive is unavailable, misconfigured, rate-limited, or rejects a write, **When** archiving runs, **Then** the failure is recorded, hot data is preserved, and retry remains possible.
5. **Given** multiple archive runs overlap, **When** they target the same day, **Then** deterministic content and safe state transitions prevent duplicate or corrupt archive data.

---

### User Story 6 - Recover and Migrate Existing History Safely (Priority: P2)

As an operator with existing production history, I want a deliberate migration path that validates, groups, deduplicates, archives, and verifies legacy records without deleting them by default so that the new storage model can be adopted without data loss.

**Why this priority**: Existing history is valuable and may use the prior unbounded layout; migration must be safe before retention can reduce it.

**Independent Test**: Run migration against representative legacy records containing duplicates and invalid entries, verify daily outputs and error reporting, and confirm no source data is removed unless an explicit verified-deletion option is supplied.

**Acceptance Scenarios**:

1. **Given** legacy results from multiple Mauritius dates, **When** migration runs, **Then** valid results are grouped by programme date and deduplicated by stable race identity before daily archival.
2. **Given** migrated archive content is verified, **When** migration completes without an explicit deletion request, **Then** all legacy source objects remain intact.
3. **Given** explicit post-verification deletion is requested, **When** any date fails validation or archive verification, **Then** source data for that date is not removed.
4. **Given** a malformed legacy record, **When** migration encounters it, **Then** the record is reported safely without preventing unrelated valid dates from being prepared or retried.

---

### User Story 7 - Operate the Scheduler and Archive Securely (Priority: P2)

As an authenticated HORSEE operator, I want status, ready-job, manual transition, archive, and retry controls protected according to their risk so that operations are observable without exposing credentials or weakening existing authorization.

**Why this priority**: Scheduler and archive mutation controls can cause duplicate work or data loss if left publicly writable, while secrets must never reach clients or logs.

**Independent Test**: Exercise read and mutation operations as anonymous and authorized callers, inspect all returned data and logs, and verify secret values never appear.

**Acceptance Scenarios**:

1. **Given** an unauthorized caller, **When** it attempts a scheduler, job, or archive mutation, **Then** the operation is rejected without revealing configuration details.
2. **Given** an authorized caller, **When** it runs scheduling or performs a valid job transition, **Then** the new state is persisted idempotently.
3. **Given** archive credentials are absent, **When** normal scheduling runs, **Then** scheduling remains functional and archive health reports not configured.
4. **Given** any failure occurs, **When** diagnostics are returned or logged, **Then** tokens, full prompts, full results, and authentication material are excluded.

---

### User Story 8 - See Operational Health on Equidia (Priority: P2)

As an Equidia dashboard user, I want a compact HORSEE Scheduler section showing today's counts, upcoming jobs, ready prompts, and archive health so that I can understand and manually recover operations without redesigning the existing dashboard.

**Why this priority**: A provider-independent queue needs a practical human operating surface while automated dispatch remains a future integration.

**Independent Test**: Seed all job states and archive-health outcomes, open the dashboard at supported viewport sizes, copy a ready prompt, and exercise permitted manual controls with keyboard navigation.

**Acceptance Scenarios**:

1. **Given** today's queue contains jobs in several states, **When** the dashboard loads, **Then** it displays the Mauritius date, programme total, completed, ready, pending, failed, and missed counts accurately.
2. **Given** ready and pending jobs exist, **When** upcoming jobs are shown, **Then** each displays race identity, scheduled time, current state, and an available prompt-copy action for ready work.
3. **Given** archive state exists, **When** the dashboard loads, **Then** it shows health, last archived day, current yearly archive name, pending day count, and the most recent concise error without exposing credentials.
4. **Given** the dashboard is used at 375, 768, or 1280 pixels, **When** users navigate scheduler controls, **Then** content remains readable without page-level horizontal scrolling and actions remain keyboard operable.

---

### User Story 9 - Preserve Existing HORSEE Behavior (Priority: P1)

As an existing HORSEE client, I want racecard discovery, Council schemas, authenticated saving, latest lookup, history views, MCP operations, OAuth behavior, and current dashboard features to keep working so that scheduler adoption is additive rather than disruptive.

**Why this priority**: The scheduler cannot be considered production-ready if it regresses the established Council system it is intended to support.

**Independent Test**: Run the existing authorization, MCP, racecard, Council-save, latest, today, date-count, history, and dashboard regression checks alongside the new scheduler and archive tests.

**Acceptance Scenarios**:

1. **Given** an existing authenticated HORSEE workflow, **When** the new feature is deployed, **Then** its established authorization and Council operations retain compatible request and response behavior.
2. **Given** the scheduler needs the daily programme, **When** it performs discovery, **Then** it uses the existing direct SMSPariaz parser and never substitutes ordinary web search.
3. **Given** an existing history consumer, **When** it queries supported latest, today, dates, or history views, **Then** it continues to receive compatible data despite the compact operational layout.
4. **Given** the archive service is unavailable, **When** users access unrelated HORSEE functionality, **Then** that functionality remains available.

### Edge Cases

- Mauritius midnight occurs while another timezone is still on the previous date or while a scheduler invocation is in progress.
- A race has a missing, malformed, duplicated, or changed scheduled off-time in an updated programme.
- Two meetings contain similar race labels, or a race identity appears more than once in the source programme.
- A programme is valid but contains no races, or the programme date changes between two overlapping runs.
- A job changes state while a concurrent scheduler or operator action is using an older state snapshot.
- A scheduler lock owner crashes, times out, or fails before releasing the lock.
- A dispatched or running job never reports completion and must remain recoverable without automatic duplicate dispatch.
- A Council result exists before its scheduler job reaches a completed state, or a completion is reported without a valid stored result.
- Daily results are updated after an earlier archive, requiring a deliberate deterministic archive update.
- An archive file exists but has unexpected content, a mismatched digest, or an out-of-date monthly index.
- Archive access returns not found, conflict, validation, rate-limit, timeout, or transient service errors.
- Hot cleanup runs concurrently with archiving or encounters an archived marker whose remote content cannot be verified.
- Legacy results lack an explicit programme date, contain multiple revisions of the same race, or fail current schema validation.
- The dashboard request is cancelled, retried, or observes state changing between summary and job-list reads.

## Requirements *(mandatory)*

### Functional Requirements

#### Programme and Queue

- **FR-001**: The system MUST use the existing direct SMSPariaz daily racecard capability as the sole authoritative source for programme discovery and MUST NOT replace it or substitute ordinary web search.
- **FR-002**: The system MUST interpret every programme date, daily boundary, race time, retention boundary, and migration grouping in `Indian/Mauritius`.
- **FR-003**: Each scheduling invocation MUST fetch and validate the current programme before reconciling work and MUST reject a programme that does not match the current Mauritius date.
- **FR-003a**: Automatic five-minute scheduling MUST remain disabled until an explicitly approved usage budget and cadence are defined; authorized manual scheduling remains available.
- **FR-004**: The system MUST maintain one current-day queue containing all discovered races and their operational states.
- **FR-005**: Each job MUST have a deterministic identity composed of programme date and race identity, ensuring one operational job per race per day.
- **FR-006**: Reconciliation MUST add newly discovered races without deleting completed work and MUST retain an observable indication when a previously queued race is removed or materially changed in the authoritative programme.
- **FR-007**: Repeated and overlapping scheduling invocations MUST be idempotent and MUST NOT create duplicate jobs, prompts, ready transitions, or dispatches.
- **FR-008**: Concurrency protection MUST expire automatically after a crashed invocation and MUST NOT permanently disable future scheduling.

#### Timing and Job Lifecycle

- **FR-009**: A pending race MUST become ready in primary mode when its scheduled off-time is between 30 and 44 minutes away, inclusive, by default.
- **FR-010**: A pending race missed by the primary window MUST become ready in recovery mode when its scheduled off-time is between 15 and 29 minutes away, inclusive, by default.
- **FR-011**: A race more than the primary maximum from off MUST remain pending, and a race later than the recovery minimum MUST be marked missed unless an explicit late-analysis policy permits otherwise.
- **FR-012**: Primary, recovery, retention, and recent-result thresholds MUST be centrally configurable with safe defaults and consistency validation.
- **FR-013**: A job MUST progress only through valid states covering pending, ready, dispatched, running, saved, failed, and missed outcomes.
- **FR-014**: The system MUST record job creation and update times, mode, attempts, and concise failure information, plus dispatch and completion times when applicable.
- **FR-015**: Scheduling MUST NOT redispatch jobs already dispatched, running, or saved.
- **FR-016**: A job MUST NOT be marked saved unless a valid authoritative Council result for its programme date and race actually exists.
- **FR-017**: Failures MUST remain retryable on later invocations, MUST increment relevant attempt information, and MUST never silently drop a race.

#### Prompting and Dispatch

- **FR-018**: Every ready job MUST have a self-contained HARD Council prompt that explicitly identifies the race and Mauritius programme date.
- **FR-019**: The prompt MUST instruct the reasoning provider to run the full Council protocol, use the authoritative daily programme, avoid analysis bias, perform the required staged analysis and market audit, produce complete rankings and probabilities, identify danger, value, loss risk, and final selection, and save a structured result when available.
- **FR-020**: Prompt generation MUST NOT rely on retained conversation context.
- **FR-021**: Scheduling MUST remain independent of any specific AI provider, browser session, or user authentication token.
- **FR-022**: The initial dispatch option MUST support safe queue-only or manual operation that leaves unhandled work ready.
- **FR-023**: This feature MUST NOT call a model, automate a browser, automate ChatGPT login, store ChatGPT cookies, or obtain or reuse ChatGPT authentication material.

#### Council Result Hot Storage

- **FR-024**: The existing Council result schema MUST remain authoritative, and every result MUST pass it before being stored, marked saved, migrated, or archived.
- **FR-025**: Operational result storage MUST maintain compact latest, daily, and recent views rather than creating an unlimited permanent object for every save.
- **FR-026**: Within one programme date, saving a result for an existing race identity MUST update the current result for that race instead of appending an unlimited duplicate.
- **FR-027**: If result revision history is retained, it MUST be explicit, bounded, and distinguishable from the current result.
- **FR-028**: Existing public latest, history, date, date-count, today, and Council-save behavior MUST remain backward compatible wherever currently supported.
- **FR-029**: Operational storage MUST retain today's state, the configured number of prior days, a separate latest result, and a bounded recent-result view.
- **FR-030**: Historical Council data MUST leave operational storage only after confirmed archive success and only after exceeding the configured retention period.

#### Long-Term Archive

- **FR-031**: Long-term storage MUST use one yearly archive repository selected from configured owner and yearly naming rules.
- **FR-032**: Each archived date MUST use one deterministic daily result file containing one complete validated Council result per line and sorted by meeting number then race number.
- **FR-033**: Each archived date MUST also include the compact parsed SMSPariaz racecard snapshot used for scheduling, including programme date, source, retrieval time, meetings, and races.
- **FR-034**: The archive MUST maintain a small monthly index that maps each archived day to race counts, completion counts, result and racecard locations, and archive time.
- **FR-035**: Daily archive state MUST track date, status, repository, content locations, result count, archive time, content digest, and concise last error where applicable.
- **FR-036**: The system MUST calculate and retain a SHA-256 digest of deterministic daily result content independently from any archive-provider object identifier.
- **FR-037**: Re-archiving identical daily content MUST be a no-op and MUST NOT create a new archive revision.
- **FR-038**: Re-archiving changed daily content MUST safely update the daily files and related monthly index without duplicating race records.
- **FR-039**: An archive operation MUST verify all required writes before marking the date archived or making its hot data eligible for cleanup.
- **FR-040**: Archive requests MUST use finite timeouts and bounded retry behavior and MUST distinguish not-found, conflict, invalid-request, rate-limit, and transient service failures.
- **FR-041**: Archive failures MUST preserve all hot and legacy source data, record a retryable failure state, and remain isolated from normal scheduler operation.
- **FR-042**: Archive writes SHOULD occur once per completed day whenever possible and MUST NOT create one archive revision per race.
- **FR-043**: Full reasoning-provider transcripts MUST NOT be required or stored by default; the permanent required record is the structured result, parsed racecard, and scheduler/archive metadata.
- **FR-044**: The design MUST permit a future optional verbose-analysis store without making it a dependency of scheduling or permanent structured archives.

#### Retention and Migration

- **FR-045**: Hot retention MUST default to 14 prior days and recent results MUST default to 100 entries, with both values configurable centrally.
- **FR-046**: Cleanup MUST always preserve today's data, current scheduler state, unarchived dates, failed archive dates, latest result access, and the configured recent-result view.
- **FR-047**: Cleanup MUST delete only data older than the configured retention boundary whose archive has been confirmed and verified.
- **FR-048**: A migration operation MUST enumerate existing legacy result history, validate each result, group it by Mauritius programme date, and select one current result per stable date-and-race identity.
- **FR-049**: Migration MUST generate and verify the same deterministic daily archive form used for new data.
- **FR-050**: Migration MUST NOT delete legacy history by default and MUST require an explicit post-verification deletion option before any source removal.
- **FR-051**: Explicit migration deletion MUST be limited to successfully verified dates and MUST leave failed, invalid, or unverifiable source data intact.
- **FR-052**: Migration MUST support safe reruns without duplicating archived results or producing unnecessary archive revisions.

#### Operations, Security, and Dashboard

- **FR-053**: The system MUST expose operational views for scheduler status, today's jobs, ready jobs, and the next upcoming job, plus authorized actions to run scheduling and transition or retry individual jobs.
- **FR-054**: Scheduler, dispatch, job-state, archive, and cleanup mutations MUST require server-side authorization using the existing security model or a dedicated secret; they MUST NOT be blindly public.
- **FR-055**: Archive credentials and scheduler secrets MUST remain server-side and MUST never appear in browser code, frontend bundles, API responses, MCP output, logs, prompts, results, or error messages.
- **FR-056**: Missing archive credentials MUST report a not-configured archive state without preventing scheduling, Council operations, or existing dashboard use.
- **FR-057**: Logs MUST identify programme totals, job state changes, recovery decisions, already-completed work, archive dates and counts, no-op archives, and concise failures without dumping complete prompts, results, transcripts, or credentials.
- **FR-058**: The existing dashboard MUST gain a compact scheduler section without redesigning unrelated Equidia or HORSEE experiences.
- **FR-059**: The scheduler section MUST show the Mauritius date; programme, completed, ready, pending, failed, and missed counts; and upcoming jobs with race identity, off-time, and state.
- **FR-060**: Ready jobs MUST offer a copyable HARD prompt, and authorized manual dispatch, retry, or status controls MAY be provided when they preserve safe transitions.
- **FR-061**: The dashboard MUST show archive health, last archived date, current yearly archive name, pending archive-day count, and the latest concise archive error.
- **FR-062**: Scheduler dashboard controls MUST be labeled, keyboard operable, visibly focusable, and readable without page-level horizontal scrolling at 375, 768, and 1280 pixel widths.

#### Compatibility and Delivery

- **FR-063**: Existing HORSEE MCP tools, Auth0/OAuth behavior, Council write checks, racecard parsing, Council schemas, result save behavior, dashboard functionality, and supported public APIs MUST remain operational and compatible.
- **FR-064**: Scheduled invocation MUST be possible approximately every five minutes through a thin deployment adapter, while core scheduling behavior remains callable independently of any hosting provider.
- **FR-065**: If the selected hosting tier cannot reliably provide five-minute scheduled invocations, the system MUST document an external authorized invocation option without changing scheduler semantics.
- **FR-066**: Automated verification MUST cover all timing boundaries, repeated scheduling, same-race result updates, Mauritius midnight, stale programmes, deterministic daily output, archive create/update/no-op/errors, safe retention, concurrent operations, and legacy migration.
- **FR-067**: Deployment documentation MUST explain architecture, lifecycle, states, timing, operational and archive storage, configuration, migration, failure recovery, manual testing, archive repository setup, scheduler invocation, and future dispatcher integration.
- **FR-068**: The production build and all existing and new automated checks MUST pass before the feature is considered complete.

### Key Entities

- **Daily programme**: The authoritative parsed SMSPariaz racecard for one Mauritius date, including its source and retrieval metadata, meetings, races, and scheduled local times.
- **Scheduler job**: One deterministic programme-date and race work item with race context, timing mode, lifecycle state, timestamps, attempts, optional prompt, and concise failure details.
- **Daily queue**: The reconciled set of scheduler jobs and programme metadata for one Mauritius date.
- **Scheduler state**: Compact operational metadata describing the current programme, last successful and failed runs, concurrency lease, and daily queues that remain within retention.
- **Council result**: The authoritative validated structured analysis for a race; the current operational record is unique by programme date and race identity.
- **Archive day state**: The retryable lifecycle and verification evidence for archiving one programme date.
- **Daily result archive**: Deterministically ordered, line-delimited complete Council results for one programme date.
- **Racecard snapshot**: The compact parsed daily programme that supports later reconstruction of meeting mapping, off-times, and available races.
- **Monthly archive index**: A compact discovery map from archived dates to counts, paths, and archive times within one month.
- **Dispatch adapter**: A provider-neutral contract that accepts a ready job and reports a dispatch outcome without coupling scheduling to a particular reasoning service.
- **Operational lease**: A short-lived ownership record used to coordinate overlapping scheduler or archive mutations without permanently blocking recovery.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: For any current authoritative programme, 100% of discovered races produce exactly one deterministic daily job across repeated and overlapping scheduler invocations.
- **SC-002**: At 44 and 30 minutes before off, eligible races are ready in primary mode; at 29 and 15 minutes they are ready in recovery mode; outside those windows they consistently remain pending or become missed according to policy.
- **SC-003**: A scheduler outage that spans the primary window still prepares 100% of eligible races encountered during the recovery window, without requiring a fixed invocation minute.
- **SC-004**: Repeated scheduling, dispatch, save, archive, cleanup, and migration operations produce no duplicate current jobs or duplicate current daily race results.
- **SC-005**: Saving the same programme-date and race identity 1,000 times leaves one current operational result for that race while supported latest and history views remain valid.
- **SC-006**: Each successfully archived day contains 100% of its valid current Council results exactly once in deterministic race order, plus the parsed racecard and a discoverable monthly index entry.
- **SC-007**: Archiving identical daily content 10 consecutive times creates exactly one content version and reports the remaining nine operations as unchanged.
- **SC-008**: In every simulated archive failure, 100% of affected hot data remains present and the date remains retryable; cleanup removes zero unverified or failed dates.
- **SC-009**: With the default retention policy, operational race history remains bounded to today, the previous 14 days, the latest result, and no more than 100 recent results after verified cleanup.
- **SC-010**: A six-to-seven-year archive can be discovered by year, month, and day without reading unrelated daily result files, and no normal day requires one archive revision per race.
- **SC-011**: Migration of representative legacy history preserves all source records by default, archives 100% of schema-valid deduplicated current results, and removes zero records from any unverified day even when deletion is explicitly requested.
- **SC-012**: Missing or unavailable archive integration causes zero failures in race discovery, queue reconciliation, ready-job retrieval, existing Council operations, or unrelated dashboard use.
- **SC-013**: Automated inspection of client assets, responses, prompts, errors, and logs finds zero archive tokens, scheduler secrets, OAuth credentials, ChatGPT cookies, or authentication tokens.
- **SC-014**: Existing HORSEE authorization, MCP discovery, racecard, Council save, latest, today, date-count, history, and dashboard regression checks pass without consumer changes.
- **SC-015**: At 375, 768, and 1280 pixel widths, the scheduler dashboard has zero page-level horizontal overflow, and 100% of its interactive controls are keyboard reachable with visible focus.
- **SC-016**: Operators can identify today's job totals, copy any ready prompt, find the next job, and determine archive health in under 30 seconds from the existing dashboard.
- **SC-017**: The production build and the complete existing and new automated test suites finish successfully before release.

## Implementation Evidence

- **2026-08-23 automated verification**: `npm run test:mcp` passed 133 tests in 32 suites with zero failures, skips, cancellations, or todos. The final convergence pass added literal 1,000-save, ten-run archive no-op, GitHub timeout, invalid/duplicate programme, source-revision, and transition-observability regressions.
- **2026-08-23 static verification**: `npx eslint server netlify/functions src scripts`, `npx tsc -b`, and the MCP TypeScript build all completed with zero errors.
- **2026-08-23 production build**: `npm run build` completed successfully with Vite 7.3.6; the only notices were the pre-existing HLS and DASH chunk-size advisories.
- **2026-08-23 security/output audit**: New server, function, frontend, script, and documentation paths were inspected for secret-bearing output, full prompt/result logging, unbounded error propagation, browser automation, and implicit model calls. The generated `dist` assets contain none of the server credential names or server-only HARD prompt markers.
- **2026-08-23 browser verification**: The local production bundle and Netlify functions were exercised at true 375, 768, and 1280 pixel viewports. All widths had zero page-level horizontal overflow; the READY copy control was keyboard-reachable, visibly focused, 44 pixels high, wrote the exact HARD prompt to the clipboard, and displayed live copied feedback. Empty, loading, archive-not-configured, and concise 503 states rendered without page exceptions, stack traces, local paths, or secret leakage. The scoped QA health score was 100/100 with zero findings; evidence is retained in `.gstack/qa-reports/qa-report-horsee-localhost-2026-08-23.md`.
- **2026-08-23 final convergence**: A second repository assessment checked all 68 functional requirements, 17 success criteria, 38 acceptance scenarios, 12 architecture decisions, and 5 constitution principles. It found zero missing, partial, contradictory, or unrequested gaps and appended no further tasks.

## Assumptions

- The existing SMSPariaz parser continues to return the authoritative programme date, race identity, meeting, race number, racecourse, and Mauritius off-time required for scheduling.
- The existing Council result schema contains sufficient race identity and analysis-time information to associate current and legacy results with a Mauritius programme date.
- One current Council result per programme-date and race identity is the authoritative long-term record; intentional revisions replace that current record unless a separately bounded revision policy is introduced later.
- The existing authorization model remains the default for user-facing operations, while unattended scheduler invocations may use a separate server-held secret.
- Five-minute invocation is the target operating cadence, but correctness depends on time windows and current state rather than exact clock-minute alignment.
- The default late policy marks races missed once fewer than 15 minutes remain; starting normal analysis later requires an explicit configuration change.
- Hot retention means today plus the configured number of previous Mauritius calendar days.
- Daily archives normally run after a programme day is complete; corrected results may deliberately update a previously archived day using the same verification rules.
- Yearly archive repositories are provisioned by an operator and are writable by a least-privilege server credential; absence of that credential is an expected degradable state.
- The parsed racecard is sufficient for long-term reconstruction; retaining original programme documents and full reasoning transcripts is outside the default scope.
- Existing legacy objects remain readable during migration and are never automatically destroyed.
