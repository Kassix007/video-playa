# Video Playa Constitution

## Core principles

### 1. Every task is traceable to a specification
Every requested feature, fix, investigation, or behavior decision must create or update a numbered specification with testable scenarios and acceptance criteria. Small follow-ups update the specification that owns the behavior; materially different outcomes receive the next sequential specification. Implementation details belong in the plan, not the feature specification.

### 2. Responsive by default
Primary flows must remain readable and operable at 375px, 768px, and 1280px widths without page-level horizontal scrolling.

### 3. Accessible interaction
Interactive controls use native elements, visible focus states, meaningful labels, keyboard operation, and reduced-motion support. Dialogs must expose their purpose, focus a useful control, close with Escape, and prevent background scrolling.

### 4. Safe media embedding
External streams open in a least-privilege sandbox. New iframe permissions require a documented user need and a security review in the implementation plan.

### 5. Verified changes
Every change must pass `npm run build`. UI changes also require checks of the affected flow at mobile and desktop widths when browser tooling is available.

## Change control

All work is recorded under `specs/NNN-task-name/`. Every task has a validated `spec.md`; implementation work also receives `plan.md` and `tasks.md` when planning depth warrants them. A task may not be reported complete until its specification reflects the delivered or investigated outcome. Amendments to this constitution must explain why the existing principle is insufficient and update affected templates or specifications.

**Version**: 1.1.0  
**Ratified**: 2026-08-15  
**Last amended**: 2026-08-18
