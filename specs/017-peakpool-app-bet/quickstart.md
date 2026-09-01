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
