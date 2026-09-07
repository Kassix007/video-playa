# Implementation Plan: Authenticated SMSPariaz App Bets

**Branch**: `codex/smspariaz-app-bet-mcp` | **Date**: 2026-09-01 | **Spec**: [spec.md](spec.md)

**Input**: Feature specification from `specs/016-smspariaz-app-bet/spec.md`

## Summary

Extend the existing HORSEE Netlify MCP with a separate SMSPariaz provider-session subsystem. Use Direct Authenticated HTTP because the current production Android/web path submits ordinary same-origin form requests with persisted cookies plus `loginid`, `phone`, and `token`; no client-generated signature, native wager bridge, or device identifier is present. Persist OTP-pending and authenticated state as encrypted, deployment-isolated records. Read the authoritative SMSFootball JSON/cache sources, create a provider-validated but non-submitting booking code, and place only a short-lived, OAuth-principal-bound prepared ticket through the audited `n<bookcode>` app route. Compile and recheck the exact production flow manifest, reject redirects/unknown fields/payment routes, and never retry or fall back.

## Technical Context

**Language/Version**: TypeScript 5.8 on Node.js 22 (ES modules)

**Primary Dependencies**: Model Context Protocol SDK 1.30, MCP Apps extension 1.7, Zod 4.4, Netlify Blobs 11, Node built-in `fetch` and `crypto`

**Storage**: Strongly consistent, deployment-isolated Netlify Blobs in hosted contexts; encrypted atomic `.netlify/` JSON fallback in local development

**Testing**: Node test runner through `tsx --test`, injected provider transports/stores/clocks, recorded provider fixtures, existing MCP authorization/discovery tests, and mandatory `npm run build`

**Target Platform**: Existing Netlify Functions deployment on Linux/Node 22; development and tests supported on Windows

**Project Type**: Existing web application plus stateless hosted MCP/web-service functions

**Performance Goals**: Programme and preparation results normally complete within 10 seconds; session status within one provider round trip; bounded external requests and response bodies

**Constraints**: No production submission during automated validation; no Playwright/browser runtime; no plaintext OTP/token/cookie persistence or logging; exact HTTPS origin and path allowlists; manual redirects; no submission retry/fallback; existing HORSEE contracts remain compatible

**Scale/Scope**: One hosted HORSEE deployment, one persisted SMSPariaz session shared only by specifically scoped operators, up to 25 selections per prepared ticket, short-lived prepared tickets, and bounded recent ticket/audit state

## Constitution Check

*GATE: Must pass before Phase 0 research. Re-checked after Phase 1 design.*

- **Specification traceability — PASS**: `specs/016-smspariaz-app-bet/spec.md` and its completed requirements checklist own this materially new outcome.
- **Responsive by default — PASS / not affected**: No Video Playa or MCP Apps user interface is changed. If an approval UI is later added, it requires a follow-up responsive specification and checks at 375px, 768px, and 1280px.
- **Accessible interaction — PASS / not affected**: No interactive browser controls or dialogs are added by this plan.
- **Safe media embedding — PASS / not affected**: No iframe, stream, or media permission changes are introduced.
- **Verified changes — PASS by plan**: The complete existing MCP test suite, new focused tests, `git diff --check`, and `npm run build` are required before handoff.
- **Post-design re-check — PASS**: Research and contracts keep implementation details in planning artifacts, preserve existing interfaces, and add no constitutional exception.

## Project Structure

### Documentation (this feature)

```text
specs/016-smspariaz-app-bet/
├── spec.md
├── plan.md
├── research.md
├── data-model.md
├── quickstart.md
├── contracts/
│   └── mcp-tools.md
├── checklists/
│   └── requirements.md
└── tasks.md
```

### Source Code (repository root)

```text
server/
├── council-auth.ts                    # resource authentication and per-tool scopes
├── horsee-mcp.ts                      # existing server plus SMS tool registrar
├── horsee-tool-security.ts            # closed-world tool security decoration
├── smspariaz-config.ts                # strict environment/configuration parsing
├── smspariaz-crypto.ts                # AES-GCM envelopes and key rotation
├── smspariaz-session-store.ts         # Blob/local encrypted session records
├── smspariaz-prepared-store.ts        # atomic prepared-ticket state machine
├── smspariaz-provider.ts              # exact-origin HTTP, cookies, OTP, flow checks
├── smspariaz-football.ts              # programme parsing and selection resolution
├── smspariaz-app-bet.ts               # prepare/revalidate/guard/submit orchestration
├── smspariaz-mcp.ts                   # strict MCP schemas and handlers
├── smspariaz-observability.ts         # allowlisted redacted events/diagnostics
└── smspariaz-*.test.ts                # focused fixtures and security regressions

netlify/functions/
├── mcp.ts                             # construct and inject the SMS subsystem
└── oauth-protected-resource.ts        # advertise configured protected scopes

docs/
└── smspariaz-app-bet.md               # operator, OTP, deployment, security, re-audit guide

README.md                              # tool/configuration summary
```

**Structure Decision**: Keep the capability in the existing TypeScript server and `/mcp` function. Separate provider session, programme, guarded submission, persistence, and tool-registration modules so no generic outbound request or SMSPariaz secret enters Council code. No new service, browser worker, database, laptop daemon, or frontend application is introduced.

## Complexity Tracking

No constitution violations require justification.

The module split is a security boundary rather than a new deployable project: authentication state, prepared-ticket replay control, public programme parsing, and the single submission egress have different data and test invariants.
