# Peakpool validation guide

## Preconditions

1. The encrypted SMSPariaz session foundation is deployed and its session-only checks work.
2. `PEAKPOOL_APP_BET_ENABLED` is absent or `false` during development and automated tests.
3. A provider-authorized no-cash account/test arrangement exists before any authenticated transaction verification.

## Safe local validation

1. Start the hosted-function emulator with a throwaway encryption key and Peakpool placement disabled.
2. Call `smspariaz_get_peakpool` and verify that the programme comes from the current fixture without authentication or submission.
3. Use recorded fixture tests to exercise valid, missing, stale, duplicate, and malformed runner scenarios.
4. Prepare a Peakpool ticket and assert that the provider request mock receives no placement call.
5. Exercise the placement guard using mocks only: correct prepared handle, cross-product handle, raw-message attempt, altered route, changed script hash, expired session, duplicate call, rejected response, and ambiguous response.
6. Run the full HORSEE test suite and build before deployment.

## Authorized no-cash verification gate

Only after the product owner authorizes it:

1. Start the legitimate OTP session on hosted infrastructure.
2. Passively capture/redact the successful or rejected authenticated Peakpool flow with a pre-agreed virtual-unit test ticket.
3. Compare the captured request and response to the recorded profile; update source fingerprints and tests if necessary.
4. Keep placement disabled until the owner explicitly approves enabling the verified profile.
5. Confirm that a single attempt returns a reference/outcome and that repeating the same prepared handle is blocked locally.

No laptop needs to remain online after the hosted session is established.

## Exact production flags and scopes

Configure the shared encrypted SMSPariaz session foundation first. Peakpool then uses:

```text
PEAKPOOL_ENABLED=true
PEAKPOOL_APP_BET_ENABLED=false
PEAKPOOL_APP_BET_VERIFIED=false
HORSEE_OAUTH_PEAKPOOL_PREPARE_SCOPE=horsee:peakpool:prepare
HORSEE_OAUTH_PEAKPOOL_PLACE_SCOPE=horsee:peakpool:place
```

`PEAKPOOL_ENABLED=true` exposes the isolated programme/preparation surface only when the shared encrypted session configuration is complete. Keep both placement flags false until the authorized test above has captured and reviewed the current request and response. Enabling placement requires both flags to be true; either missing flag keeps it disabled.

## Re-audit after provider drift

If diagnostics report `PEAKPOOL_APP_FLOW_CHANGED` or `PEAKPOOL_FIXTURE_CHANGED`:

1. set `PEAKPOOL_APP_BET_ENABLED=false` immediately;
2. preserve only redacted request-shape, response-shape, and script-hash evidence from the authorized no-cash environment;
3. update the sanitized fixture and immutable profile—never loosen origin, redirect, route, field, raw-message, or product checks;
4. run `npm run test:mcp`, `npm run build`, and `git diff --check`;
5. repeat the owner-authorized no-cash verification before setting either activation acknowledgement.

Automated tests must continue to use injected transports and must never call the production placement endpoint.
