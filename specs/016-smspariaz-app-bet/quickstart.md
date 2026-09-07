# Validation Quickstart: Authenticated SMSPariaz App Bets

## Safety Boundary

Automated workflows must not send OTP, coupon-validation, session-validation, or app-bet POSTs to production. Tests inject a fake provider transport. Live discovery is public GET-only unless the owner separately approves an exact no-funds test.

## Configuration

```text
SMSPARIAZ_BASE_URL=https://www.smspariaz.com
SMSPARIAZ_SESSION_ENCRYPTION_KEY=<32-byte Base64 secret>
SMSPARIAZ_SESSION_PREVIOUS_ENCRYPTION_KEY=<optional prior key during rotation>
SMSPARIAZ_APP_BET_ENABLED=false
HORSEE_OAUTH_SMSPARIAZ_SESSION_SCOPE=horsee:smspariaz:session
HORSEE_OAUTH_SMSPARIAZ_APP_BET_SCOPE=horsee:smspariaz:app-bet
```

Keep app submission false until the flow fingerprint is audited and a separate production test is approved.

## Automated Verification

```powershell
npm run test:mcp
npm run build
git diff --check
```

Expected: existing HORSEE tests stay green; new tests use no live provider POST; encrypted fixtures contain none of the sentinel phone/token/cookie/OTP; guard failures make zero submission calls; mocked acceptance returns the app-flow label; timeout/unknown body becomes terminal ambiguous without retry.

## Local MCP Exercise Without Submission

1. Start `npx netlify dev` with a local development bearer token, a throwaway encryption key, and `SMSPARIAZ_APP_BET_ENABLED=false`:

   ```powershell
   $env:HORSEE_COUNCIL_DEV_WRITE_TOKEN = "local-dev-token"
   $env:SMSPARIAZ_SESSION_ENCRYPTION_KEY = [Convert]::ToBase64String((1..32 | ForEach-Object { Get-Random -Maximum 256 }))
   $env:SMSPARIAZ_APP_BET_ENABLED = "false"
   npx netlify dev
   ```

   Connect to `http://localhost:8888/mcp` with `Authorization: Bearer local-dev-token`.
2. Verify programme is `noauth`, session tools use the session scope, and placement uses the app-bet scope.
3. Call `smspariaz_get_smsfootball` and inspect provider IDs/odds.
4. Exercise login/OTP/restore/prepare/change/logout/replay against injected fakes.
5. Confirm placement returns `APP_BET_DISABLED` while the flag is false.

## Manual Hosted OTP Setup

1. An authorized operator calls start-login with the registered phone/referrer.
2. The operator receives OTP through the legitimate provider channel.
3. The operator calls confirm-OTP once and never copies OTP into logs/issues.
4. Verify masked valid/app-registered status.
5. Redeploy and confirm hosted restore while the Windows laptop is offline.

## Explicit Production Verification (Separate Approval Required)

Do not automate this section. Re-audit the three source files and validator semantics; use an owner-approved no-funds account/ticket; prepare and review the ticket; obtain explicit approval; enable placement only for the approved deployment; invoke once; verify confirmation, safe logs, terminal state, and replay rejection. Any path/payload/header/app-signal/hash/response drift disables placement with `APP_BET_FLOW_CHANGED`.
