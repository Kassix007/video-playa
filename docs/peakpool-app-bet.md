# HORSEE Peakpool virtual-unit app bets

This document covers feature 017: the isolated HORSEE MCP integration for SMSPariaz's fixed virtual-unit Peakpool/leaderboard flow. It is not the Supabase Fantasy Peakpool application at `#/peakpool`. Feature 018 never authenticates to SMSPariaz or calls a provider placement endpoint.

## Safety state

Provider placement is disabled by default. The implementation accepts one server-generated Win or Place selection, stores an opaque short-lived prepared handle, requires explicit approval plus a separate OAuth scope, atomically claims the handle, and permits at most one provider attempt. It rejects raw messages, caller-selected routes, redirects, cross-product handles, payment-like fields, changed source fingerprints, stale fixtures, expired sessions, and unregistered app state before egress.

An ambiguous transport or response outcome is terminal and is never retried automatically. Logs and diagnostics exclude OTPs, tokens, cookies, phone numbers, raw messages, virtual balances, and prepared handles.

## Configuration

The shared encrypted SMSPariaz session feature must already be configured. Add these server-only values to the relevant Netlify deploy context:

```text
PEAKPOOL_ENABLED=false
PEAKPOOL_APP_BET_ENABLED=false
PEAKPOOL_APP_BET_VERIFIED=false
HORSEE_OAUTH_PEAKPOOL_PREPARE_SCOPE=horsee:peakpool:prepare
HORSEE_OAUTH_PEAKPOOL_PLACE_SCOPE=horsee:peakpool:place
```

- `PEAKPOOL_ENABLED=true` constructs the isolated runtime only when encrypted session storage is complete.
- `PEAKPOOL_APP_BET_ENABLED=true` requests placement capability but is insufficient by itself.
- `PEAKPOOL_APP_BET_VERIFIED=true` acknowledges that the current authenticated provider flow passed the owner-authorized no-cash verification. Both placement flags must be true before submission is possible.
- The prepare and place scopes are intentionally distinct. Do not merge them with Council, session, SMSFootball, or Fantasy Peakpool authority.

Keep all three feature flags false for an unconfigured deployment. Never put session encryption keys, OAuth credentials, or provider secrets in browser-visible `VITE_` variables.

## MCP tools

| Tool | Authority | Behavior |
|---|---|---|
| `smspariaz_get_peakpool` | No authentication | Reads the bounded public programme; never prepares or submits. |
| `smspariaz_prepare_peakpool_app_bet` | `horsee:peakpool:prepare` | Resolves one current Win/Place runner and returns an opaque preview handle; performs no placement request. |
| `smspariaz_place_peakpool_app_bet` | `horsee:peakpool:place` | Requires an opaque prepared handle and literal `approved: true`; performs at most one guarded attempt when both activation flags are true. |
| `smspariaz_debug_peakpool_status` | SMSPariaz session scope | Returns only safe configuration, fingerprint, and state diagnostics. |

The caller cannot provide a raw provider message, URL, form fields, cookies, token, phone number, or arbitrary stake grammar to the placement tool.

## Fail-closed errors

- `NOT_CONFIGURED`: the isolated runtime or shared encrypted session dependency is incomplete.
- `PEAKPOOL_APP_BET_DISABLED`: the two-step placement gate is not active.
- `PEAKPOOL_PROGRAMME_UNAVAILABLE` / `PEAKPOOL_PROGRAMME_INVALID`: bounded public programme retrieval or validation failed.
- `PEAKPOOL_SELECTION_INVALID`: the selected runner, bet type, or integer virtual-unit stake is invalid.
- `PEAKPOOL_FIXTURE_CHANGED`: the programme changed between preparation and placement.
- `PEAKPOOL_APP_FLOW_CHANGED`: origin, route, form shape, redirect behavior, or source fingerprint no longer matches the immutable profile.
- `SESSION_EXPIRED` / `APP_REGISTRATION_REQUIRED`: authenticated app state is no longer valid.
- `PREPARED_BET_INVALID`, `PREPARED_BET_EXPIRED`, or `PREPARED_BET_ALREADY_USED`: the opaque ticket cannot be claimed for this principal/session/product.
- `PROVIDER_REJECTED`: the provider explicitly rejected the single attempt.
- `SUBMISSION_AMBIGUOUS`: transport or response evidence cannot prove an outcome; no automatic retry is allowed.

## Verification and activation

Automated verification uses recorded sanitized fixtures and injected transports only:

```powershell
npm run test:mcp
npm run build
git diff --check
```

Before enabling placement, follow the exact owner-authorized procedure in [the feature quickstart](../specs/017-peakpool-app-bet/quickstart.md). Use only a pre-agreed non-cash account/test arrangement. Capture and redact the current authenticated request and response, confirm the virtual-unit semantics, and verify that reusing the prepared handle is blocked locally.

If any route, field, script fingerprint, session behavior, or response classification differs, keep placement disabled. Update the specification, fixtures, profile, and tests; never relax the closed-world provider boundary to make drift pass.
