# Implementation Plan: Equidia Live Destination

**Branch**: `008-equidia-live-destination` | **Date**: 2026-08-19 | **Spec**: [spec.md](spec.md)

**Input**: Feature specification from `/specs/008-equidia-live-destination/spec.md`

## Summary

Add Equidia as a data-driven primary route that automatically initializes the existing shared stream player with the public Equidia HLS master. Fetch and parse the readable master manifest separately into a responsive race-control-style signal board showing variants, audio, and provenance. For the confirmed referrer-sensitive CDN behavior, attach a source-scoped browser `no-referrer` request policy and use the scripted HLS fetch path that can honor it. Keep all other source restrictions honest: no relay, fabricated identity, or unrestricted header manipulation.

## Technical Context

**Language/Version**: TypeScript 5.8, CSS, React JSX  
**Primary Dependencies**: React 18.3, React Router 7.8, react-helmet-async 2.0, existing shared HLS/DASH player  
**Storage**: N/A; source configuration is static and the current manifest snapshot is held in page state only  
**Testing**: TypeScript/Vite production build, ESLint, browser-driven route and responsive validation  
**Target Platform**: Modern desktop and mobile browsers at 375px, 768px, and 1280px widths  
**Project Type**: Client-side single-page web application  
**Performance Goals**: Start player initialization immediately; parse a small master manifest synchronously after retrieval; avoid adding eager playback-engine code to the initial bundle  
**Constraints**: Client-only, no proxy, no fabricated referrer/identity, no DRM/geography bypass; request-policy changes must be opt-in per source; upstream manifest and nested CDN availability are independent  
**Scale/Scope**: One first-class route, one manifest parser/service, one responsive page, one navigation item, and one optional shared-media request policy

## Constitution Check

*GATE: Passed before research and re-checked after design.*

- **Specification traceability**: PASS. Feature 008 owns the new destination, acceptance scenarios, and security boundary.
- **Responsive by default**: PASS. The quickstart covers 375px, 768px, and 1280px with explicit overflow checks.
- **Accessible interaction**: PASS. Existing native navigation/player controls are reused; new links have clear labels, focus states, and 44px targets.
- **Safe media embedding**: PASS. No iframe, expanded permission, relay, forged header, or new embedding surface is introduced. Omitting the application's referrer is a source-scoped browser privacy policy, not impersonation or cross-origin permission bypass.
- **Verified changes**: PASS. Tasks require lint, production build, and browser validation at mobile and desktop widths.

Post-design re-check: PASS. The data model is ephemeral, the UI contract contains failure states, and the validation guide exercises source rejection without claiming a bypass.

## Project Structure

### Documentation (this feature)

```text
specs/008-equidia-live-destination/
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
├── components/
│   └── player/StreamPlayer.tsx
├── config/
│   └── routes.ts
├── pages/
│   ├── Equidia.tsx
│   └── Equidia.css
└── services/
    └── equidia.ts
```

**Structure Decision**: Extend the existing route-driven single-page structure. Channel-specific data retrieval, parsing, and safe source policy belong in `src/services/equidia.ts`; the optional media request policy is typed in `src/lib/media.ts`; the shared player applies that policy through its reusable HLS engine path; the route composition and editorial presentation remain in the page module.

## Complexity Tracking

No constitution violations require justification.
