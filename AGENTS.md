# Video Playa Agent Instructions

These instructions apply to the entire repository.

## Mandatory Spec Kit workflow

Before changing code, configuration, documentation, tests, or project behavior for a user-requested feature, fix, investigation, or behavior decision:

1. Read `.specify/memory/constitution.md`.
2. Inspect `specs/` and identify the specification that owns the requested behavior.
3. Update that specification when the request is a small follow-up to an existing outcome. Create the next sequential `specs/NNN-short-name/` feature when the outcome is materially different.
4. Use the appropriate Spec Kit skill. Start new specifications with `speckit-specify`; use `speckit-clarify`, `speckit-plan`, `speckit-tasks`, `speckit-implement`, or `speckit-analyze` when their phase applies.
5. Validate `spec.md` with `checklists/requirements.md`. Resolve every clarification marker before planning or implementation unless the active Spec Kit skill explicitly pauses for user input.
6. Keep user needs and acceptance outcomes in `spec.md`. Put implementation details in `plan.md` and executable work in `tasks.md` when those artifacts are warranted.
7. Only begin implementation after the specification is present and validated. Read-only repository inspection needed to identify the owning specification is allowed before this gate.

Do not create a duplicate specification when an existing numbered feature owns the behavior. Do not silently route Spec Kit requests into another specification or issue workflow.

## Verification and handoff

- Follow every applicable principle in `.specify/memory/constitution.md`.
- Run `npm run build` for every completed change.
- For UI changes, verify affected flows at 375px, 768px, and 1280px when browser tooling is available.
- Preserve unrelated working-tree changes. Stage and commit only files that belong to the active task.
- Do not report a task complete until its specification reflects the delivered outcome and its required checks pass.
- In the final handoff, link the owning `spec.md`, report checklist and build status, and identify the next Spec Kit phase when work remains.
