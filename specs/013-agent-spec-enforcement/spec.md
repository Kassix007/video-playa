# Feature Specification: Automatic Agent Specification Enforcement

**Feature Branch**: `013-agent-spec-enforcement`

**Created**: 2026-08-29

**Status**: Implemented and verified

**Input**: User description: "Add a root AGENTS.md so agents automatically create or update Spec Kit specifications for each qualifying task."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Start every qualifying task from a specification (Priority: P1)

As a repository maintainer, I want an agent to create or update the owning numbered specification before making changes so that every feature, fix, investigation, and behavior decision remains traceable.

**Why this priority**: The existing constitution requires traceability, but agents do not automatically discover instructions stored only inside the Spec Kit directory.

**Independent Test**: Start a new agent session with a request to change repository behavior and confirm that the agent identifies, creates, or updates a numbered specification before editing task files.

**Acceptance Scenarios**:

1. **Given** a new session receives a qualifying task, **When** the agent begins work, **Then** it reads the project constitution and identifies the owning specification before making changes.
2. **Given** no existing specification owns the requested outcome, **When** the task is classified, **Then** the next sequential feature specification is created and validated before implementation.
3. **Given** the agent needs repository evidence to classify the task, **When** it performs read-only inspection, **Then** that inspection is permitted before the specification gate.

---

### User Story 2 - Reuse the correct existing specification (Priority: P2)

As a repository maintainer, I want small follow-ups recorded in the specification that already owns the behavior so that the repository does not accumulate duplicate or contradictory feature documents.

**Why this priority**: Automatic creation without ownership checks would satisfy numbering mechanically while making the specification set harder to trust.

**Independent Test**: Request a small adjustment to an existing feature and confirm that the agent updates its current specification rather than creating a new numbered directory.

**Acceptance Scenarios**:

1. **Given** an existing specification owns the requested behavior, **When** the request is a small follow-up, **Then** the agent updates that specification.
2. **Given** the requested outcome is materially different from every existing feature, **When** the agent compares the scope, **Then** it creates the next sequential specification.
3. **Given** the user explicitly requests Spec Kit, **When** the agent selects a workflow, **Then** it does not substitute another issue or specification system.

---

### User Story 3 - Receive an evidence-backed completion handoff (Priority: P3)

As a repository maintainer, I want every completed task to report its specification and verification status so that I can see whether governance and quality gates were actually followed.

**Why this priority**: A hidden process rule cannot be audited unless the final handoff names the owning artifact and the checks that passed.

**Independent Test**: Complete a representative task and confirm that the final response links the owning specification, reports checklist and build status, and names the next Spec Kit phase when work remains.

**Acceptance Scenarios**:

1. **Given** implementation is complete, **When** the agent prepares its handoff, **Then** the owning specification reflects the delivered outcome and its quality checklist has no unresolved item.
2. **Given** verification succeeds, **When** completion is reported, **Then** the response identifies the specification, checklist result, and build result.
3. **Given** planning or implementation remains, **When** the agent pauses, **Then** the response identifies the next applicable Spec Kit phase instead of claiming completion.

### Edge Cases

- The repository contains unrelated uncommitted changes when the task begins.
- A request appears to fit more than one existing specification.
- The active feature pointer references a different task from the user's request.
- A task is documentation-only but still changes repository behavior or governance.
- A clarification blocks completion of the specification.
- Verification fails after the specification has been updated.
- A request is a simple informational question and does not ask for a feature, fix, investigation, or behavior decision.

## Requirements *(mandatory)*

### Functional Requirements

- **FR-001**: Repository-wide agent instructions MUST require the project constitution to be read before work on every qualifying task.
- **FR-002**: Repository-wide agent instructions MUST cover user-requested features, fixes, investigations, documentation changes, and behavior decisions.
- **FR-003**: Agents MUST inspect existing numbered specifications before deciding whether to create a new feature directory.
- **FR-004**: Small follow-ups MUST update the specification that owns the existing behavior.
- **FR-005**: Materially different outcomes MUST receive the next sequential numbered specification.
- **FR-006**: Read-only inspection needed to identify the correct specification MUST be allowed before the specification gate.
- **FR-007**: Code, configuration, documentation, test, or behavior changes MUST NOT begin until the owning specification exists and passes its requirements checklist.
- **FR-008**: Agents MUST use the Spec Kit workflow appropriate to the current phase and MUST NOT replace an explicit Spec Kit request with an unrelated issue workflow.
- **FR-009**: Feature specifications MUST describe user needs and testable outcomes without implementation details.
- **FR-010**: Implementation details MUST be recorded in planning artifacts when planning depth warrants them.
- **FR-011**: Every completed repository change MUST pass the verification required by the constitution.
- **FR-012**: Agents MUST preserve unrelated working-tree changes and limit staging or commits to active-task files.
- **FR-013**: Final task handoffs MUST identify the owning specification, checklist status, verification status, and next Spec Kit phase when work remains.
- **FR-014**: Simple informational responses that request no feature, fix, investigation, or behavior decision MUST NOT require a new specification.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: In five fresh-session trials covering a feature, fix, investigation, documentation change, and behavior decision, 100% identify or create an owning numbered specification before modifying task files.
- **SC-002**: In three follow-up trials against existing features, 100% update the owning specification without creating a duplicate numbered directory.
- **SC-003**: In all completion trials, the final handoff reports the owning specification, checklist result, and required verification result.
- **SC-004**: In a working tree containing unrelated changes, no unrelated file is staged or committed during a qualifying task.
- **SC-005**: A simple informational-question trial completes without creating an unnecessary specification.

## Assumptions

- Repository agents automatically discover and follow a root-level `AGENTS.md` file.
- The existing constitution remains the source of truth for project governance.
- Spec Kit skills and the `.specify/` project structure remain installed.
- The existing sequential numbering convention under `specs/` remains active.
- Planning and task artifacts are required only when the work benefits from those phases; the validated feature specification is always required for qualifying tasks.

## Dependencies

- The repository continues to include `.specify/memory/constitution.md`.
- The Spec Kit integration and its skills remain available to repository agents.
- Numbered specifications remain stored under `specs/`.

## Out of Scope

- Replacing or weakening the current project constitution.
- Automatically filing external tracker issues for every task.
- Requiring a specification for casual conversation or a purely informational answer.
- Automatically pushing commits or publishing changes.
- Changing the product's runtime behavior.
