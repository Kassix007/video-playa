# Implementation Plan: Peakpool Virtual-Balance App Bets

**Branch**: `codex/peakpool-app-bet-plan` | **Date**: 2026-09-01 | **Spec**: [spec.md](spec.md)

## Summary

Add a strictly isolated Peakpool capability to HORSEE: read the live horse-racing programme, prepare a single virtual-unit Win/Place ticket, and eventually submit it once through the verified app flow after explicit approval. The initial implementation choice is direct authenticated HTTP because the public app code uses ordinary first-party forms; hosted Playwright is the approved fallback only if a legitimate no-cash verification shows that browser-only state cannot be reproduced.

Peakpool is a product-owner-confirmed fixed-unit/leaderboard product. It must still have its own product profile because its public message and generic provider endpoint differ materially from SMSFootball's server-booked flow.

## Technical Context

**Language/Version**: Node.js 22, TypeScript, ESM.

**Primary Dependencies**: Netlify Functions, MCP TypeScript SDK, Zod, Netlify Blobs, existing HORSEE authentication and storage patterns.

**Storage**: Existing encrypted SMSPariaz session and prepared-ticket persistence once the SMSFootball session foundation lands; encrypted, deploy-isolated Peakpool prepared-ticket records only if the shared store cannot safely hold a product discriminator.

**Testing**: `tsx --test` via `npm run test:mcp`; injected HTTP transports and recorded sanitized public fixtures; `npm run build`.

**Target Platform**: Existing hosted HORSEE Netlify MCP (`/mcp`); the developer's Windows laptop is development-only.

**Project Type**: Server-side MCP extension in the existing web application.

**Performance Goals**: Programme reads and ticket preparation normally complete within 10 seconds of provider availability; source-profile checks are bounded by the existing provider timeout.

**Constraints**: Placement is disabled by default, has separate authorization, requires explicit approval, permits one prepared ticket/attempt, makes no automatic retries, and cannot accept raw provider messages. Tests send no production submission.

**Scale/Scope**: One configured Peakpool account/session and one selection per prepared ticket in the first release; multi-account and multi-selection support are out of scope.

## Constitution Check

| Principle | Result | Evidence |
|---|---|---|
| Specification traceability | Pass | This feature is specified in [spec.md](spec.md), validated by its requirements checklist, and has design artifacts. |
| Responsive/accessibility | Not applicable | This is an MCP/server feature; it does not add an interactive UI. |
| Safe media embedding | Not applicable | No media embedding changes. |
| Verified changes | Planned gate | The implementation phase will run the complete MCP suite and `npm run build`. |

**Post-design re-check**: Pass. The design adds no constitutional violation; its distinct product profile avoids weakening existing HORSEE boundaries.

## Research conclusions

1. The current public app route reads `GET /service/peakpool_json.php?`, creates one code `R<meeting>C<race>H<horse>`, and uses an optional `P` suffix for Place.
2. The public client calls `/checklogin/` and then `/placebet/` with `loginid`, `phone`, `token`, and `message`.
3. Direct HTTP is technically plausible but not production-approved until the owner-authorized non-cash transaction validates all authenticated semantics.
4. The generic endpoint and SMS helper make endpoint-only allowance unsafe; Peakpool must have an immutable product-specific semantic guard.

See [research.md](research.md) for the evidence and open verification gate.

## Proposed implementation phases

### Phase 0 — Preserve the dependency boundary

Merge or otherwise make available the encrypted SMSPariaz session foundation first. Do not duplicate OTP, cookies, token persistence, redaction, provider transport, or generic auth code. Add a product discriminator to any shared prepared-ticket store so a Peakpool handle cannot be consumed by SMSFootball placement.

### Phase 1 — Read-only Peakpool programme

Create a dedicated read-only parser/client for the current Peakpool fixture. Validate bounded race/runner records, derive selection codes from provider identifiers, preserve displayed pool values as display data, and expose `smspariaz_get_peakpool`. Do not interpret displayed pool values as odds or payout and do not call any placement endpoint.

### Phase 2 — Immutable Peakpool flow profile

Create a separate `PeakpoolAppFlowProfile`, holding the verified origin, paths, form shape, script fingerprints, app/session requirements, message grammar, and response classification. It must be impossible for a generic provider client to use that profile for another product. Source drift, redirects, cross-origin destinations, extra fields, or unknown form encoding fail closed.

### Phase 3 — Non-submitting ticket preparation

Add `smspariaz_prepare_peakpool_app_bet`. It resolves exactly one runner from a fresh programme, validates the owner-approved unit stake rule, records the bet type, stores an opaque ticket bound to principal/session/source fingerprint, and returns an expiry. It never produces or exposes a raw provider message.

### Phase 4 — Guarded placement implementation

Add `smspariaz_place_peakpool_app_bet` behind `PEAKPOOL_APP_BET_ENABLED=false` by default and a separate `horsee:peakpool:place` scope. Immediately before the one allowed provider attempt, revalidate the session, app registration, source fingerprints, programme, runner, ticket binding, and profile. Build the exact message from server-side fields only; atomically claim the ticket; classify success/rejection/ambiguity; never retry or fall back.

### Phase 5 — Provider-approved non-cash verification

With the owner's explicit authorization, use an account/test arrangement with only virtual units to capture the legitimate authenticated transaction and response. Confirm or correct direct HTTP headers, cookies, form encoding, app-mode signal, stake grammar, idempotency, and response fields. If browser-specific state is required, switch to hosted Playwright rather than weakening the request profile.

### Phase 6 — Test and deploy

Add tests for programme parsing, selection formation, missing/stale runner, unsupported type, stake rule, session expiry, profile drift, route/field/raw-message injection, SMS/payment path rejection, cross-product handles, concurrency/replay, mocked success/rejection/ambiguous response, and log redaction. Run legacy MCP tests and the project build. Configure encryption/auth scopes and leave placement disabled until the verified profile is approved for activation.

## Project Structure

```text
server/
├── smspariaz-provider.ts                 # shared authenticated provider boundary
├── smspariaz-session-store.ts             # shared encrypted session persistence
├── peakpool-programme.ts                  # new fixture fetch/parse model
├── peakpool-flow-profile.ts               # new immutable product-specific profile
├── peakpool-app-bet.ts                    # new prepare/place orchestration
├── peakpool-*.test.ts                     # isolated fixture, guard, and mocked-flow tests
├── smspariaz-mcp.ts                       # proposed strict Peakpool tool registration
└── horsee-mcp.ts                           # conditional runtime integration

netlify/functions/mcp.ts                   # hosted construction/configuration
specs/017-peakpool-app-bet/
├── spec.md
├── plan.md
├── research.md
├── data-model.md
├── quickstart.md
└── contracts/mcp-tools.md
```

**Structure Decision**: Keep Peakpool modules separate from SMSFootball modules, sharing only already-audited encrypted session/persistence primitives. A shared generic “bet” executor is prohibited because the product-specific message semantics are the safety boundary.
