# Implementation Plan: Production Hardening and Security Audit

**Branch**: `015-production-hardening` | **Date**: 2026-09-01 | **Spec**: [spec.md](spec.md)

## Summary

Audit the production source and remediate the validated public-archive quota boundary: public Council-history reads must not spend the credential quota used for archive writes and verification. Then run the native quality suite and record any source-backed cleanup scope separately from security findings.

## Technical Context

**Language/Version**: TypeScript, Node.js, React
**Primary Dependencies**: Netlify functions, Vitest, Vite
**Storage**: GitHub yearly archive repositories and the configured Council result store
**Testing**: `npm run test:mcp`, `npm run build`, focused Vitest tests; mobile checks when available
**Target Platform**: Browser SPA and Netlify serverless functions
**Project Type**: Web application with server-side integration modules
**Performance Goals**: Public history behavior stays responsive without consuming the privileged GitHub token for reads
**Constraints**: Preserve public archived-history access; preserve authenticated archive mutation, conflict checks, and verification; do not stage unrelated working-tree changes
**Scale/Scope**: Repository-wide production audit; first approved remediation is the shared archive-read boundary

## Constitution Check

| Principle | Status | Evidence |
|---|---|---|
| Traceability | Pass | This plan and tasks belong to Spec 015. |
| Responsive UI | N/A | The approved remediation is server-side only. |
| Accessible interaction | N/A | The approved remediation is server-side only. |
| Safe media embedding | N/A | No media-embedding change is planned. |
| Verified changes | Planned | Focused regression tests plus `npm run build` are mandatory before handoff. |

## Research and Design

The public `/api/council/history` and `/api/council/history/dates` routes can reach `HorseeArchiveService` through the archive-aware store. The service used `GitHubArchiveClient.getFile`, which attaches the configured GitHub token by default. The narrow compatible fix is an explicit unauthenticated mode only on the semantic public-read methods, `readArchivedDay` and `readArchiveMonthIndex`; all operational reads retain the authenticated default.

Public yearly archives are an established application assumption. If an archive is private or unavailable, the existing public-reader fallback behavior remains empty/hot-store data rather than retrying with privileged credentials.

## Project Structure

```text
server/
  github-archive-client.ts       # GitHub request boundary
  horsee-archive.ts              # public archive-read semantics and archive operations
  *.test.ts                      # focused Vitest regression coverage
netlify/functions/
  council-history*.ts            # public entry points, inspected only for this fix
specs/015-production-hardening/
  spec.md
  plan.md
  tasks.md
  checklists/requirements.md
```

**Structure Decision**: Keep the authorization decision at the shared service boundary rather than duplicating it across Netlify handlers, so all public archive readers receive the same policy while archive operations keep their existing defaults.

## Verification Strategy

1. Add a focused control test showing a configured GitHub client omits `Authorization` when explicitly asked for a public read.
2. Add service-level tests showing both public archive reader methods request that mode and operational archive reads retain the default.
3. Run the focused tests, the repository test suite, static analysis where configured, and `npm run build`.
4. Run the required fresh security bypass/regression review after the patch; record any surviving finding in the standard scan report.
