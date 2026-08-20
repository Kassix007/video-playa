# Research: HORSEE Racecard and Council Archive

## Decision 1: Fetch the stable official programme URL in the MCP backend

**Decision**: Retrieve `https://www.smspariaz.com/racecard/` for every tool call with no-store headers, redirect following, content checks, a 25-second timeout, and no application cache. Retry once with a unique query value when the first attempt is unusable or stale.

**Rationale**: The backend request avoids stale search retrieval and makes freshness validation deterministic. A bounded retry handles intermediary caches without creating an unbounded scheduled-worker delay.

**Alternatives considered**:

- Search or racing aggregators: rejected because they are not authoritative for what SMSPariaz offers.
- Persisting the PDF in application cache: rejected because it recreates the stale-programme failure.
- Unlimited retries: rejected because scheduled runs need a clean terminal error.

## Decision 2: Treat the Mauritius programme date as a hard validity gate

**Decision**: Derive today with `Intl.DateTimeFormat` in `Indian/Mauritius`; accept one unambiguous date extracted from PDF text or a compatible content-disposition filename. Conflicting, missing, or stale dates fail explicitly.

**Rationale**: Server/UTC midnight does not represent the product day. A hard gate ensures old programmes never masquerade as current input.

**Alternatives considered**:

- Trusting HTTP dates or response freshness headers: rejected because they describe transport/cache state, not the programme's printed date.
- Accepting the newest date found in a document: rejected because conflicting dates indicate an unsafe parse.

## Decision 3: Parse the entire extracted text and fail on incomplete race identity

**Decision**: Extract all PDF pages, build race headings and off-time maps keyed by SMSPariaz IDs such as `R2C5`, require every discovered heading and time to pair, enrich reliable optional fields, and sort by off time then meeting/race number.

**Rationale**: Stable race IDs provide a deterministic join across page layouts. Failing an incomplete pairing is safer than silently omitting a race from the authoritative programme.

**Alternatives considered**:

- Parse page 1 or a fixed meeting count: rejected because French and other meetings span later pages.
- Return partial success with warnings: rejected because scheduled workers would treat missing races as absent.
- OCR/image analysis: rejected because the current official PDF exposes extractable text and OCR would add nondeterminism.

## Decision 4: Use strict runtime schemas for the MCP boundary

**Decision**: Define strict success/failure, meeting, and race schemas and expose the discriminated response as the MCP output schema. Failures set the MCP error state while retaining structured diagnostic content.

**Rationale**: Scheduled clients can distinguish source failure from an empty card and report exact failure codes without parsing prose.

**Alternatives considered**:

- Throw raw transport/parser exceptions: rejected because callers lose a stable error contract.
- Return text only: rejected because downstream race selection needs deterministic fields.

## Decision 5: Partition new history by Mauritius date and preserve legacy reads

**Decision**: Store new immutable events under `results/YYYY-MM-DD/<receipt-time>-<uuid>.json`, continue updating `latest.json`, and merge legacy flat `results/<receipt-time>-<uuid>.json` records into date queries using each result's `analysed_at` Mauritius date.

**Rationale**: Date prefixes make current archive reads focused, UUIDs retain legitimate re-analyses, and read-time compatibility avoids a destructive migration.

**Alternatives considered**:

- One deterministic race key: rejected because overwriting would hide legitimate re-analyses.
- Rewrite all existing blobs: rejected because it adds migration risk with no user-visible benefit.
- Browser-side full-history filtering: rejected because archive growth would increase every page load.

## Decision 6: Add thin read APIs over the existing store

**Decision**: Add Today, exact-date, and month-date-count GET endpoints with strict query validation, `no-store` responses, and a common `Indian/Mauritius` envelope.

**Rationale**: The browser receives only data for the requested view while all storage implementations retain one query contract.

**Alternatives considered**:

- Expand only the MCP history tool: rejected because the public Equidia browser already consumes normal application routes.
- Add a second database/index service: rejected because the existing Blob key prefix supplies the required index.

## Decision 7: Compose an archive component into Equidia

**Decision**: Keep the current latest selection board and live player, then add Today and History views with compact expandable cards, a responsive month grid, per-date counts, cancellation-safe data loading, and a one-action return to Today.

**Rationale**: This preserves the page's identity and avoids large mobile tables while making all result details discoverable.

**Alternatives considered**:

- A separate application or route family: rejected by the existing architecture and user flow.
- One unbounded result table: rejected for mobile readability and archive discovery.
- Optional filters in the first release: deferred so they do not delay the core Today/calendar behavior.

## Decision 8: Isolate automated tests from live services

**Decision**: Inject fetch, clock, and PDF-text extraction dependencies into racecard tests and use controlled Council results for date/store tests. Retain one manual live source smoke check outside the automated suite.

**Rationale**: Tests stay repeatable across dates, timezones, network conditions, and storage environments while still checking the real source during release verification.

**Alternatives considered**:

- Live PDF in every test run: rejected because upstream availability and the current date would make the suite flaky.
- Snapshot only: rejected because freshness, ordering, and error behavior need semantic assertions.

## Decision 9: Load PDF.js lazily and preserve its native Node runtime

**Decision**: Import `@napi-rs/canvas` and `pdf-parse` only inside the real PDF extraction path, initialize missing `DOMMatrix`, `ImageData`, and `Path2D` globals before PDF.js evaluation, and mark the native canvas package as external in the Netlify MCP function bundle.

**Rationale**: Netlify's bundler could not discover PDF.js's dynamic native-module load, which left `DOMMatrix` undefined and crashed the entire MCP during module startup. An explicit lazy dependency keeps unrelated tools available and ensures the Linux deployment artifact contains the required native binary.

**Alternatives considered**:

- Keep the top-level parser import and rely on transitive dependency discovery: rejected because this produced the observed production 502.
- Add a partial handwritten `DOMMatrix` shim: rejected because it would not provide the complete runtime PDF.js expects and could fail on future documents.
- Load the native canvas module at MCP startup: rejected because the racecard parser should not become a startup dependency for unrelated tools.
