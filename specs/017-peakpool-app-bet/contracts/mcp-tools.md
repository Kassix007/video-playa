# Proposed Peakpool MCP contracts

These are proposed contracts for implementation after the authenticated no-cash verification gate. They intentionally expose no raw provider request fields.

## `smspariaz_get_peakpool`

**Authorization**: public read-only.

**Input**: none.

**Result**: programme source timestamp/fingerprint and structured races/runners, including provider selection codes and displayed pool values where present.

## `smspariaz_prepare_peakpool_app_bet`

**Authorization**: `horsee:peakpool:prepare` plus a valid SMSPariaz authenticated session.

**Input**:

```json
{
  "unit_stake": 200,
  "selection": {
    "meeting_number": "3",
    "race_number": "1",
    "runner_number": "4",
    "bet_type": "win"
  }
}
```

**Result**: resolved race and runner, product-specific selection code, validated virtual-unit stake, available provider display values, expiry, warnings, and an opaque `prepared_bet` handle. This operation must not submit.

## `smspariaz_place_peakpool_app_bet`

**Authorization**: `horsee:peakpool:place`, deliberately distinct from prepare/session authority.

**Input**:

```json
{
  "prepared_bet": "opaque-server-issued-handle",
  "approved": true
}
```

**Result**:

```json
{
  "success": true,
  "reference": "provider-value-if-present",
  "confirmation": "provider-value-if-present",
  "unit_stake": 200,
  "unit_balance": "only-if-returned-by-provider",
  "leaderboard": "only-if-returned-by-provider",
  "submitted_via": "smspariaz_peakpool_app_flow"
}
```

**Required failures**: `AUTH_REQUIRED`, `SESSION_EXPIRED`, `APP_REGISTRATION_REQUIRED`, `PEAKPOOL_SELECTION_INVALID`, `PEAKPOOL_FIXTURE_CHANGED`, `PEAKPOOL_APP_FLOW_CHANGED`, `PREPARED_BET_EXPIRED`, `PREPARED_BET_ALREADY_USED`, `PEAKPOOL_APP_BET_DISABLED`, `PROVIDER_REJECTED`, and `SUBMISSION_AMBIGUOUS`.

## `smspariaz_debug_peakpool_status`

**Authorization**: session scope.

**Result**: safe configuration state, app-mode/profile status, script fingerprints, fixture freshness, and last classified error. It excludes OTPs, tokens, cookies, account identifiers, raw messages, and balances.
