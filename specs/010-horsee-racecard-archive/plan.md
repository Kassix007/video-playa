# Implementation Plan: HORSEE Racecard and Council Archive

**Branch**: `010-horsee-racecard-archive` | **Date**: 2026-08-21 | **Spec**: [spec.md](spec.md)

**Input**: Feature specification from `/specs/010-horsee-racecard-archive/spec.md`

## Summary

Add one deterministic read-only HORSEE discovery tool that directly retrieves and validates the complete current SMSPariaz PDF, plus date-aware Council history reads and an integrated Equidia Today/calendar interface. Reuse the existing MCP server, Council schema, Auth0 write boundary, Netlify Blobs/local-file stores, Netlify Functions routing, and Equidia styling. New saves remain immutable history events, also update `latest.json`, and are date-partitioned by Mauritius analysis day while legacy flat keys continue to be read.

## Technical Context

**Language/Version**: TypeScript 5.8, React TSX, CSS, Node.js 22 deployment runtime

**Primary Dependencies**: Model Context Protocol SDK 1.30, Zod 4.4, `pdf-parse` 2.4, Netlify Functions 6, Netlify Blobs 11, React 18.3, Vite 7.1

**Storage**: Existing strongly consistent Netlify Blob store in deployed environments; existing atomic local JSON file store during development

**Testing**: Node test runner through `tsx --test`, ESLint, TypeScript/Vite production build, browser validation at desktop/tablet/mobile widths

**Target Platform**: Existing Netlify-hosted MCP/functions backend and modern desktop/mobile browsers

**Project Type**: Existing full-stack single-page web application with serverless API and MCP entry point

**Performance Goals**: One normal source fetch plus at most one bounded retry; reject documents over 20 MiB; apply a 25-second timeout per fetch; serve date-filtered archive responses without sending the full history to the browser

**Constraints**: Direct official SMSPariaz source only; no application racecard cache; Mauritius date authority; no partial parse success; no new secrets or client-side storage credentials; preserve existing MCP and Council response contracts

**Scale/Scope**: One daily multi-page racecard, all retained Council analyses, three new read APIs, one Equidia route, and the existing MCP/store implementation

## Constitution Check

*GATE: Passed before research and re-checked after design.*

- **Every task is traceable to a specification**: PASS. Feature 010 owns the racecard, Today, and archive requirements and maps them to explicit tasks.
- **Responsive by default**: PASS. The design and verification path cover 375, 768, and 1280 pixel widths with zero page-level horizontal overflow.
- **Accessible interaction**: PASS. Calendar navigation and date/analysis selection use native labeled buttons, visible focus, keyboard operation, and `aria-expanded`/status semantics; no new dialog is introduced.
- **Safe media embedding**: PASS. The existing Equidia stream and iframe permissions are unchanged; this feature adds no embed or permission.
- **Verified changes**: PASS. The plan requires isolated backend tests, lint/build, and browser checks of Today, calendar navigation, date detail, and expansion states.

Post-design re-check: PASS. The contracts retain the established OAuth boundary, the data model is additive and legacy-readable, and the UI contract contains the required responsive and accessible states.

## Architecture and Data Flow

```text
SMSPariaz PDF
    -> server racecard fetch/validation/parser
    -> read-only HORSEE MCP tool

save_council_result
    -> latest result + dated immutable history event
    -> Council store date queries
    -> Today / month-count / day-detail functions
    -> Equidia archive service and UI
```

The parser separates transport/date validation from deterministic text parsing so tests can stub both the HTTP response and extracted PDF text. Shared Mauritius date utilities are used by racecard validation, storage partitioning, archive filtering, APIs, and client day selection. Archive reads stay behind the store interface so both Netlify Blobs and local-file development implement identical behavior.

## Project Structure

### Documentation (this feature)

```text
specs/010-horsee-racecard-archive/
|-- spec.md
|-- plan.md
|-- research.md
|-- data-model.md
|-- quickstart.md
|-- contracts/
|   |-- council-archive-api.md
|   `-- smspariaz-racecard-mcp.md
|-- checklists/
|   `-- requirements.md
`-- tasks.md
```

### Source Code (repository root)

```text
server/
|-- mauritius-time.ts
|-- smspariaz-racecard.ts
|-- smspariaz-racecard.test.ts
|-- council-history.ts
|-- council-history.test.ts
|-- council-store.ts
|-- council-store.test.ts
|-- horsee-mcp.ts
|-- horsee-mcp-discovery.test.ts
`-- horsee-mcp-authorization.test.ts

netlify/functions/
|-- council-today.ts
|-- council-history.ts
`-- council-history-dates.ts

src/
|-- services/council.ts
|-- components/council/CouncilArchive.tsx
`-- pages/
    |-- Equidia.tsx
    `-- Equidia.css

README.md
netlify.toml
package.json
package-lock.json
```

**Structure Decision**: Extend each existing layer in place. Source discovery and persistence logic remain in `server/`; thin Netlify handlers expose store queries; the browser service validates archive responses; and the new archive component is composed into the existing Equidia page. No parallel application, database, or state framework is introduced.

## Delivery Phases

1. Establish shared Mauritius date behavior and the racecard response contracts.
2. Implement direct PDF retrieval, validation, parsing, structured errors, logging, and isolated tests.
3. Extend Council storage with date-partitioned writes, legacy-compatible date reads, and month aggregation.
4. Register the racecard tool and date-aware history behavior without changing write authorization.
5. Add the Today/date/month APIs and client response validation.
6. Integrate Today cards, historical calendar, daily detail, responsive styling, and accessible interaction into Equidia.
7. Run automated regression, production build, live source smoke, and responsive browser verification.

## Complexity Tracking

No constitution violations require justification.
