# Feature Specification: Production Hardening and Security Audit

**Feature Branch**: `015-production-hardening`

**Created**: 2026-08-29

**Status**: Complete

**Input**: User description: "Clean the codebase to a production-ready level and perform a repository-wide security audit."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Ship from a clean, repeatable baseline (Priority: P1)

As a maintainer preparing Video Playa for production, I can run the repository's documented quality checks and receive successful, repeatable results without hidden manual steps.

**Why this priority**: A production release is not trustworthy when its build, type checks, automated tests, or static checks fail or depend on undocumented local state.

**Independent Test**: Start from the repository's declared dependencies and run every detected project check using its documented command; each required check completes successfully or has a documented, approved exception.

**Acceptance Scenarios**:

1. **Given** the repository dependencies are available, **When** the production build runs, **Then** it completes without errors.
2. **Given** the automated test suites run, **When** they finish, **Then** all tests pass and no suite is silently excluded from the production-readiness result.
3. **Given** static analysis is configured, **When** it runs, **Then** production code contains no unresolved error-level finding.
4. **Given** a required check cannot run, **When** readiness is reported, **Then** the exact limitation and its production impact are documented instead of being treated as a pass.

---

### User Story 2 - Receive an evidence-backed security assessment (Priority: P1)

As a maintainer responsible for deployment risk, I receive a repository-wide security report that identifies actual trust boundaries, validates each reported weakness against source evidence, and states what was and was not reviewed.

**Why this priority**: Production readiness requires knowing whether authentication, external requests, user-controlled media, storage, and deployment surfaces create exploitable paths.

**Independent Test**: Review the completed security report and confirm that every finding includes affected source evidence, severity, confidence, root cause, validation, and an attack path, while coverage names all major repository surfaces.

**Acceptance Scenarios**:

1. **Given** the audit begins, **When** repository boundaries are mapped, **Then** browser code, server code, deployment functions, media inputs, external requests, authorization, persistence, and operational configuration are included or explicitly excluded with a reason.
2. **Given** a possible weakness is discovered, **When** it is assessed, **Then** it is reported only after source-backed validation and calibrated severity.
3. **Given** the audit completes, **When** the maintainer reads the report, **Then** they can distinguish validated findings from coverage limitations and non-security quality issues.
4. **Given** a security fix would change behavior or risk, **When** the audit identifies it, **Then** remediation occurs only after explicit approval through the finding-fix workflow.

---

### User Story 3 - Reduce production maintenance risk (Priority: P2)

As a maintainer, I can work in a codebase where obsolete paths, duplicate logic, unsafe shortcuts, and unclear production scripts are removed or documented without changing intended user behavior.

**Why this priority**: Clean code lowers the chance that future fixes break unrelated playback, scheduling, archive, or authorization behavior.

**Independent Test**: Compare the production baseline before and after cleanup; all existing behavior checks continue to pass while validated non-security quality findings are removed or documented.

**Acceptance Scenarios**:

1. **Given** an unused or superseded code path is proven unreferenced, **When** cleanup is applied, **Then** it is removed without reducing required behavior or test coverage.
2. **Given** duplicate logic has one clear shared responsibility, **When** it is consolidated, **Then** all previous callers retain equivalent observable behavior.
3. **Given** a cleanup could change externally visible behavior, **When** the risk is identified, **Then** it is excluded from mechanical cleanup and recorded for a separately approved change.
4. **Given** unrelated working-tree changes already exist, **When** cleanup files are selected, **Then** unrelated changes remain untouched and unstaged.

---

### User Story 4 - Understand the remaining production risks (Priority: P3)

As a maintainer, I receive a concise handoff that separates completed cleanup, validated security findings, accepted limitations, and recommended next tasks so that deployment decisions are based on evidence.

**Why this priority**: A green build alone cannot prove that every risk was reviewed or resolved.

**Independent Test**: Read the final handoff without consulting command output and identify the passed checks, changed files, security findings, coverage gaps, and next required action.

**Acceptance Scenarios**:

1. **Given** the hardening task finishes, **When** results are reported, **Then** cleanup outcomes and security findings are presented as separate categories.
2. **Given** a validated security finding remains, **When** completion is reported, **Then** the report does not describe the repository as fully secure or production-safe.
3. **Given** no validated security finding remains, **When** completion is reported, **Then** the report still states the reviewed scope and known limitations.

### Edge Cases

- The working tree contains user-owned changes unrelated to production hardening.
- A configured check is missing locally or requires an unavailable external service.
- Tests pass individually but interfere when run as a complete suite.
- A dependency or generated artifact is large enough to distort broad searches.
- A potential security issue cannot be reproduced or validated from available source evidence.
- A cleanup candidate is referenced dynamically rather than through an obvious static import.
- A failing check predates this task and is outside the authorized cleanup scope.
- Security findings contain sensitive values that must not be copied into reports or logs.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: The task MUST inventory every project-native build, type-check, lint, and automated-test command before assessing production readiness.
- **FR-002**: Every available required check MUST run from the repository root with its exit result recorded.
- **FR-003**: Failed checks MUST be investigated to source-backed causes before any cleanup change is made.
- **FR-004**: Cleanup MUST be limited to validated non-security quality issues that can be corrected without changing intended externally visible behavior.
- **FR-005**: Removed code MUST be proven unused through repository references, build evidence, or focused tests.
- **FR-006**: Consolidated logic MUST retain the behavior of every existing caller and MUST be covered by applicable tests.
- **FR-007**: Unrelated working-tree changes MUST remain untouched and unstaged.
- **FR-008**: The security audit MUST cover the entire repository while honoring repository ignore rules and inherited security guidance.
- **FR-009**: The audit MUST map trust boundaries involving user-controlled input, media addresses, external network requests, authorization, storage, scheduled operations, deployment functions, and secrets or configuration.
- **FR-010**: Every reported security finding MUST include source evidence, severity, confidence, root cause, validation, attack path, and affected scope.
- **FR-011**: Unvalidated hypotheses MUST NOT be reported as confirmed vulnerabilities.
- **FR-012**: Security report artifacts MUST state coverage and limitations honestly.
- **FR-013**: Security findings MUST NOT be remediated automatically under this audit; each remediation requires explicit approval through the appropriate finding-fix workflow. The user's "make the changes" instruction approves remediation of validated findings in this specification.
- **FR-014**: Sensitive values encountered during review MUST NOT be reproduced in chat, reports, or command history.
- **FR-015**: The final production build and all applicable automated tests MUST run after cleanup changes.
- **FR-016**: The final handoff MUST separate completed cleanup, validated security findings, accepted limitations, and recommended follow-up work.
- **FR-017**: The owning specification and quality checklist MUST reflect the delivered audit and cleanup outcome before completion is reported.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: 100% of detected required project checks either pass or have a documented blocking limitation with no false pass.
- **SC-002**: The final production build completes with zero errors.
- **SC-003**: 100% of executed automated tests pass after cleanup.
- **SC-004**: Production code has zero unresolved error-level findings from configured static analysis.
- **SC-005**: The security audit covers 100% of identified trust-boundary categories or documents a specific limitation for each uncovered category.
- **SC-006**: 100% of reported security findings contain source evidence, calibrated severity, confidence, root cause, validation, and an attack path.
- **SC-007**: Zero unrelated working-tree files are staged or modified by production-hardening cleanup.
- **SC-008**: Every cleanup change has build, reference, or focused-test evidence showing that intended observable behavior is preserved.

## Assumptions

- The requested scope is the complete repository, including browser code, server modules, deployment functions, scripts, and configuration.
- Production cleanup authorizes high-confidence non-security refactoring and removal of proven obsolete code.
- Security remediation requires a follow-up approval per finding; the user's "make the changes" instruction supplies that approval for validated findings in this task.
- Existing product behavior and public interfaces remain stable unless a separate specification authorizes change.
- Generated outputs and dependency directories are excluded from source review when repository ignore rules identify them as non-source artifacts.

## Dependencies

- The repository's declared package scripts and automated tests remain the source of truth for verification.
- The standard security-scan workflow and its report tooling are available.
- Existing feature specifications describe intended behavior that cleanup must preserve.
- Local dependencies required by the project's checks are installed.

## Out of Scope

- Shipping, deployment, publication, or changes to production infrastructure.
- New product features, visual redesigns, or changes to public behavior.
- Deep multi-pass security scanning, penetration testing against live systems, or social-engineering tests.
- Broad dependency upgrades without a source-backed production or security need.
- Rewriting stable subsystems solely to adopt a different style or architecture.

## Delivery Record

- The validated public-history GitHub-token quota issue was remediated through the approved finding-fix workflow.
- Root server tests, production static analysis, production build, and the mobile verification suite passed.
- The completed security report records one remediated medium-severity finding and deployment follow-ups for archive visibility and scheduled-function reachability.
