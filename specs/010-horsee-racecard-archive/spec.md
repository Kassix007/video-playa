# Feature Specification: HORSEE Racecard and Council Archive

**Feature Branch**: `010-horsee-racecard-archive`

**Created**: 2026-08-21

**Status**: Implemented and verified

**Input**: User description: "Add a read-only current SMSPariaz racecard tool for HORSEE, show all of today's Council analyses on Equidia, and provide a historical analysis calendar without breaking authentication, saves, latest-result lookup, or existing history consumers."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Retrieve the official daily racecard (Priority: P1)

As HORSEE, I want a structured copy of the current official SMSPariaz race programme so that every race, including French and other non-Mauritian meetings, is available as analysis input without relying on search results or third-party racecard sites.

**Why this priority**: The programme is the source data for all downstream analysis. An incomplete or stale card would make every later result unreliable.

**Independent Test**: Supply a representative multi-page programme containing Mauritian and French meetings, request the daily racecard, and verify that every page, meeting, and race is returned in chronological order with the expected Mauritius date.

**Acceptance Scenarios**:

1. **Given** the official daily programme is current, **When** HORSEE requests the racecard, **Then** it receives a structured success result containing every meeting and race found across the entire programme.
2. **Given** the programme includes French or other non-Mauritian meetings, **When** it is parsed, **Then** those meetings and their races remain present without country-based filtering.
3. **Given** the first retrieved programme is stale, **When** its printed date does not match the current date in Mauritius, **Then** the system refreshes the source once and accepts only a matching programme.
4. **Given** both retrieval attempts return a stale programme, **When** the request finishes, **Then** HORSEE receives a structured stale-programme error rather than old race data.
5. **Given** the official programme cannot be fetched or read, **When** the request fails, **Then** HORSEE receives a structured diagnostic error and no fabricated race data.

---

### User Story 2 - Review all analyses from today (Priority: P1)

As an Equidia viewer, I want to see every Council analysis saved during the current Mauritius day so that I can review the full day's guidance instead of only the latest result.

**Why this priority**: A daily race programme produces several analyses, and showing only one hides most of the useful output.

**Independent Test**: Save multiple analyses on the same Mauritius date, open Equidia, and verify that all are visible newest first with their race identity, selections, confidence, rationale, and warnings.

**Acceptance Scenarios**:

1. **Given** multiple analyses exist for the current Mauritius date, **When** the viewer opens Equidia, **Then** every saved analysis appears in the Today collection newest first.
2. **Given** an analysis is collapsed, **When** the viewer expands it, **Then** the full runner ranking, probabilities, selections, confidence, strongest loss reason, final selection, status, and analysis time become available without leaving the page.
3. **Given** no analysis exists for today, **When** the page loads, **Then** a clear empty state appears while live viewing remains usable.
4. **Given** a new analysis is saved through the existing authenticated workflow, **When** today's collection is refreshed, **Then** the new analysis appears without suppressing an earlier analysis for the same race.

---

### User Story 3 - Browse historical analyses by date (Priority: P2)

As an Equidia viewer, I want a calendar that identifies dates with saved Council analyses so that I can choose a past day and review everything recorded on it.

**Why this priority**: Historical results become useful only when viewers can discover which dates contain data and retrieve a complete day without guessing identifiers.

**Independent Test**: Seed analyses on several Mauritius dates, navigate between calendar months, select a populated date, and verify that the date count and returned detail collection match the stored analyses.

**Acceptance Scenarios**:

1. **Given** a month contains saved analyses, **When** the calendar is displayed, **Then** each populated Mauritius date shows its analysis count.
2. **Given** the viewer selects a populated date, **When** its details load, **Then** all analyses for that date appear newest first.
3. **Given** the viewer selects an empty date, **When** its details load, **Then** a clear no-results state appears.
4. **Given** the viewer navigates to another month, **When** the calendar updates, **Then** only the selected month's date counts are shown and future navigation remains available.

---

### User Story 4 - Preserve existing HORSEE consumers (Priority: P1)

As an existing HORSEE client, I want authentication, result saving, latest-result lookup, and legacy history access to keep their established behavior while the racecard and archive are added.

**Why this priority**: The new workflows are additive; breaking current automation or viewer integrations would invalidate the release.

**Independent Test**: Run the existing authorization, discovery, save, latest-result, and history contract checks before exercising the new tool and date-based reads.

**Acceptance Scenarios**:

1. **Given** an unauthenticated client, **When** it attempts a protected HORSEE operation, **Then** the existing authentication requirement remains in force.
2. **Given** a valid analysis payload, **When** it is saved, **Then** the existing save response and latest-result lookup remain compatible.
3. **Given** legacy stored analyses, **When** current or historical collections are requested, **Then** those records remain readable and are assigned to their Mauritius analysis date.
4. **Given** the same race is analysed more than once, **When** each result is saved, **Then** every analysis remains independently retrievable.

### Edge Cases

- The official programme redirects before returning the document or returns a response whose content is not a programme document.
- The programme's printed date is absent, malformed, or differs from the Mauritius date around midnight in another timezone.
- Text extraction splits race headings, times, horse names, or track labels across lines and pages.
- Two races from different meetings share a race number or scheduled time.
- A programme contains only non-Mauritian meetings, no French races, or no races at all.
- A legacy analysis key does not contain an explicit date but its analysis timestamp does.
- Several analyses share the same race identifier and day.
- A calendar month begins or ends midweek, includes leap day, or is in the viewer's local timezone while the archive uses Mauritius dates.
- A request is cancelled or fails while the viewer moves to another month or date.
- A long strongest-loss reason, final selection, or horse name must remain readable at narrow viewport widths.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The system MUST expose a read-only operation named `get_smspariaz_daily_racecard` with no required input.
- **FR-002**: The racecard operation MUST retrieve the programme directly from the current official SMSPariaz programme address and MUST NOT use search engines, cached search results, or third-party racecard sources.
- **FR-003**: Each racecard request MUST bypass application-level caching, follow redirects, and verify that the returned content is a readable programme document before parsing it.
- **FR-004**: The system MUST determine the current calendar date in `Indian/Mauritius` and compare it with the date printed in the programme.
- **FR-005**: When the first programme is stale, the system MUST perform exactly one cache-busted refresh and MUST return a typed stale-programme failure if the refreshed document still does not match the Mauritius date.
- **FR-006**: Racecard success results MUST include the programme date, source address, retrieval timestamp, meeting count, race count, French-race count, and the complete ordered meeting collection.
- **FR-007**: Every parsed race MUST include a stable race identifier, meeting identity, race number, scheduled local time when available, country or locale label when available, and the programme details needed by HORSEE to identify the race and runners.
- **FR-008**: Parsed meetings and races MUST retain all countries and locales present in the programme, including French races, and MUST be ordered by scheduled programme time where available.
- **FR-009**: Racecard failures MUST use structured error codes and diagnostics for fetch, content, parsing, date, and stale-programme failures and MUST NOT return partial data as a success.
- **FR-010**: The racecard operation MUST return source data only and MUST NOT create betting analysis, predictions, saves, or other side effects.
- **FR-011**: Existing HORSEE authorization requirements and read-only/write operation annotations MUST remain unchanged except for registering the new public read-only racecard operation.
- **FR-012**: The system MUST expose a Today collection containing every saved Council analysis whose analysis date falls on the current Mauritius day.
- **FR-013**: The Today collection MUST return analyses newest first and MUST NOT collapse or replace repeated analyses for the same race.
- **FR-014**: Each analysis card MUST show the race ID, racecourse, race number, scheduled time, race type, final selection, selected horse number/name/probability, confidence, principal danger, best value, analysis status, and analysis time before expansion.
- **FR-015**: An analysis card MUST be expandable to reveal the complete race information, every ranked runner and probability, most likely winner, principal danger, best value, confidence, strongest loss reason, final selection, Council status, and analysis time already stored with the result.
- **FR-016**: The history calendar MUST accept a calendar month and return every Mauritius date in that month that has saved analyses, together with the count for each date.
- **FR-017**: Selecting a history date MUST return every analysis for that Mauritius date newest first, including readable legacy records.
- **FR-018**: Current-day and historical filtering MUST occur before responses are sent to the viewer; the client MUST NOT need to download the full archive to find a date.
- **FR-019**: New saves MUST be organized so date-based reads can be performed efficiently, while existing flat or legacy records MUST remain readable without destructive migration.
- **FR-020**: The archive MUST retain all saved analyses unless an existing platform retention policy removes them; this feature MUST NOT add date expiry or deduplication.
- **FR-021**: Existing save, latest-result, and history request and response shapes MUST remain backward compatible.
- **FR-022**: Empty, loading, failure, cancellation, and retry states for Today and history MUST be distinguishable and must not block the live Equidia experience.
- **FR-023**: Calendar and analysis interactions MUST use labeled, keyboard-operable controls with visible focus and meaningful expanded-state information.
- **FR-024**: The Today collection, calendar, and analysis detail MUST remain readable and operable without page-level horizontal scrolling at 375, 768, and 1280 pixel widths.
- **FR-025**: Automated racecard and archive tests MUST use controlled fixtures or stubs and MUST NOT depend on the live SMSPariaz site or current production storage.
- **FR-026**: Loading the HORSEE MCP MUST NOT require browser-only PDF globals; parser dependencies MUST load only when the racecard operation runs, and a parser failure MUST remain isolated to that operation.

### Key Entities

- **Daily racecard**: One dated official programme with source and retrieval metadata plus its complete ordered collection of meetings.
- **Meeting**: A race venue or programme section with identity, locale information, and an ordered race collection.
- **Race**: One scheduled event with stable identity, meeting context, race number, time, and descriptive programme fields that can be extracted reliably.
- **Council analysis**: One immutable saved analysis for a race, including selections, confidence, rationale, warnings, source metadata, and analysis timestamp.
- **Mauritius analysis day**: A `YYYY-MM-DD` date interpreted in `Indian/Mauritius` that groups Council analyses independently of the viewer's timezone.
- **Calendar date count**: A Mauritius analysis date paired with the number of independently saved analyses on that date.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: Against a representative multi-page programme fixture, 100% of meetings and races are returned once, including 100% of French races, in scheduled order.
- **SC-002**: A current programme succeeds on the first retrieval, while a stale programme is never returned as success and causes no more than one refresh attempt.
- **SC-003**: Racecard success and every defined failure mode produce a schema-valid structured result without creating an analysis or saved record.
- **SC-004**: For any seeded Mauritius day, the Today and date-detail collections return 100% of that day's analyses newest first, including duplicate race identifiers and readable legacy records.
- **SC-005**: For any seeded month, every populated date reports a count exactly equal to the number of analyses returned for that date.
- **SC-006**: Existing authorization, tool discovery, save, latest-result, and legacy history contract tests continue to pass without consumer changes.
- **SC-007**: Racecard and archive automated tests complete without a network connection to SMSPariaz and without production storage access.
- **SC-008**: At 375, 768, and 1280 pixel widths, the Equidia Today and calendar flows have zero page-level horizontal overflow and their primary controls remain keyboard operable.
- **SC-009**: The production build completes successfully and the affected Equidia flows show no application runtime errors during desktop, tablet, and mobile browser checks.
- **SC-010**: A production-equivalent Node function bundle initializes the MCP and advertises its existing tools without a `DOMMatrix`, `ImageData`, or `Path2D` startup failure.

## Assumptions

- SMSPariaz continues to publish one current programme document at its stable official address and prints a date that can be reconciled with the Mauritius calendar.
- Programme text and typography can vary, so parsing favors stable headings and labels while retaining raw descriptive text needed for diagnostics.
- Council analysis timestamps are valid ISO timestamps and are the authority for deriving a legacy record's Mauritius date when its storage identity has no date.
- The existing Auth0 and HORSEE authorization model is reused; no new sign-in flow or permission class is introduced.
- The live Equidia player and current Council save workflow remain in scope only for compatibility, not redesign.

## Delivered Evidence

- A live official programme retrieval on 2026-08-21 returned 7 meetings, 51 races, and 31 French races with the current Mauritius date.
- The racecard parser, stale refresh, structured error, date-history, legacy-read, authorization, discovery, save, and compatibility suites passed 59 automated tests.
- The production build and lint checks completed successfully.
- Desktop, tablet, and 360-pixel browser checks exercised Today, month navigation, populated-date selection, analysis expansion, and empty states with no page-level horizontal overflow.
- The production MCP startup failure caused by a missing native PDF.js canvas dependency was reproduced, the parser was made lazy and Node-compatible, and the Netlify MCP artifact was verified to contain the canvas runtime; 60 backend tests, ESLint, and the production build passed.
