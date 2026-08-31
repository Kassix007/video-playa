# Tasks: Production Hardening and Security Audit

**Input**: Design documents in `specs/015-production-hardening/`

## Phase 1: Validated security remediation

- [x] T001 [US2] Map the public Council-history routes and the shared GitHub archive request boundary.
- [x] T002 [US2] Obtain an independent security-boundary and compatibility review for `server/github-archive-client.ts` and `server/horsee-archive.ts`.
- [x] T003 [US2] Add explicit public-read request policy to `server/github-archive-client.ts` without changing authenticated operational defaults.
- [x] T004 [US2] Route `readArchivedDay` and `readArchiveMonthIndex` in `server/horsee-archive.ts` through that public-read policy.
- [x] T005 [US2] Add focused regression tests in `server/github-archive-client.test.ts` and `server/horsee-archive.test.ts` for public reads and authenticated operations.
- [x] T006 [US2] Run a fresh read-only bypass/regression review of the candidate diff.

## Phase 2: Production readiness verification

- [x] T007 [US1] Inventory and run native test, static-analysis, and build commands; record limitations in the specification.
- [x] T008 [US2] Complete the standard security-scan report with validated findings, coverage, and limitations.
- [x] T009 [US4] Revalidate this checklist, update `spec.md` delivery state, and checkpoint only task-owned files.
