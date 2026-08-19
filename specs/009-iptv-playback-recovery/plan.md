# Implementation Plan: IPTV Playback Recovery

**Branch**: `009-iptv-playback-recovery` | **Date**: 2026-08-19 | **Spec**: [spec.md](spec.md)

**Input**: Feature specification from `/specs/009-iptv-playback-recovery/spec.md`

## Summary

Improve client-only IPTV success rates through a bounded recovery state machine: native HLS may fall back once to HLS.js, and the IPTV page may then advance through at most three distinct catalog URLs for the same channel/feed. Default directory results omit upstream warning-labeled streams, while an explicit filter restores the full eligible catalog. No proxy, restreaming service, or forbidden header manipulation is introduced.

## Technical Context

**Language/Version**: TypeScript 5.8, CSS, React JSX  
**Primary Dependencies**: React 18.3, React Router 7.8, HLS.js 1.7, existing shared player and IPTV API service  
**Storage**: In-memory page state only for tune attempts and outcomes  
**Testing**: ESLint, TypeScript/Vite production build, Chrome DevTools Protocol browser validation  
**Target Platform**: Modern desktop and mobile browsers at 375px, 768px, and 1280px widths  
**Project Type**: Client-side single-page web application  
**Performance Goals**: Begin the next engine/source attempt within one second of terminal failure; no eager HLS bundle load unless needed  
**Constraints**: Maximum two HLS engine paths per URL and three URLs per tune session; no backend, proxy, forbidden headers, DRM, or geography bypass  
**Scale/Scope**: Shared player plus an IPTV directory currently containing roughly 15,000 filtered entries

## Constitution Check

*GATE: Passed before research and re-checked after design.*

- **Specification traceability**: PASS. Feature 009 owns this materially new recovery behavior.
- **Responsive by default**: PASS. The recovery strip and third filter are validated at all constitutional widths.
- **Accessible interaction**: PASS. Status uses live regions; filters/buttons remain native, labeled, focused, and keyboard-operable.
- **Safe media embedding**: PASS. No iframe, permission expansion, proxy, or new embedding boundary is introduced.
- **Verified changes**: PASS. Tasks require build, lint, controlled fallback, bounded-alternate, rapid-selection, and responsive checks.

Post-design re-check: PASS. Recovery limits and cancellation rules are explicit in the UI contract and tune-session state model.

## Project Structure

### Documentation (this feature)

```text
specs/009-iptv-playback-recovery/
├── spec.md
├── plan.md
├── research.md
├── data-model.md
├── quickstart.md
├── contracts/
│   └── ui-contract.md
├── checklists/
│   └── requirements.md
└── tasks.md
```

### Source Code (repository root)

```text
src/
├── components/player/
│   ├── StreamPlayer.tsx
│   └── StreamPlayer.css
├── pages/
│   ├── Iptv.tsx
│   └── MediaPages.css
└── services/
    └── iptv.ts
```

**Structure Decision**: Keep engine recovery inside the reusable player and channel/source recovery inside the IPTV route. Catalog normalization remains in the existing service. No new dependency or global state container is warranted.

## Complexity Tracking

No constitution violations require justification.
