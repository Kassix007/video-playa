# Research: Production Hardening and Security Audit

## Decision: separate public archive reads from archive operations

**Decision**: Add an opt-in unauthenticated read mode to the GitHub archive client and use it only from `HorseeArchiveService.readArchivedDay` and `readArchiveMonthIndex`.

**Why**: The two public Council-history routes reach these methods without authentication. Passing the configured archive token on those requests lets untrusted traffic consume the credential's GitHub rate limit. Globally removing the token would break write preflight, conflict handling, and post-write verification.

**Alternatives considered**:

- Rate-limit only the Netlify handlers: reduces volume but retains the privileged-token trust-boundary violation and misses non-HTTP callers.
- Remove the token from every GitHub read: protects the token but can break operational archive reads.
- Retry a public-read failure with the token: preserves private archive behavior but recreates the attacker-controlled privileged request path.

## Decision: preserve the public archive contract

The runtime already describes yearly archives as public and the client supports unauthenticated reads when no token is configured. Public-read failures retain current graceful behavior instead of exposing internal errors or escalating to authenticated reads.
