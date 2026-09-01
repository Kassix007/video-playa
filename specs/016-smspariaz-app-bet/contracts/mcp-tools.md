# MCP Tool Contracts: SMSPariaz App Bets

All objects reject unknown fields. Provider URLs, methods, headers, cookies, tokens, and payloads are never inputs.

## Security

| Tool | Required security |
|---|---|
| `smspariaz_get_smsfootball` | Explicit `noauth` read |
| `smspariaz_session_status` | `horsee:smspariaz:session` |
| `smspariaz_start_login` | `horsee:smspariaz:session` |
| `smspariaz_confirm_otp` | `horsee:smspariaz:session` |
| `smspariaz_logout` | `horsee:smspariaz:session` |
| `smspariaz_prepare_app_bet` | `horsee:smspariaz:session` |
| `smspariaz_place_app_bet` | `horsee:smspariaz:app-bet` |
| `smspariaz_debug_status` | `horsee:smspariaz:session` |

Unknown tool security fails closed. Stable error shape is `{success:false,error_code,message,retryable}` with codes including `NOT_CONFIGURED`, `AUTH_REQUIRED`, `OTP_REQUIRED`, `OTP_INVALID`, `SESSION_EXPIRED`, `SESSION_KEY_UNAVAILABLE`, `SESSION_STORAGE_CORRUPT`, `APP_REGISTRATION_REQUIRED`, `INVALID_SELECTION`, `EVENT_CLOSED`, `ODDS_CHANGED`, `PREPARED_BET_INVALID`, `PREPARED_BET_EXPIRED`, `PREPARED_BET_ALREADY_USED`, `APP_BET_DISABLED`, `APP_BET_FLOW_CHANGED`, `PROVIDER_REJECTED`, `PROVIDER_UNAVAILABLE`, and `SUBMISSION_AMBIGUOUS`.

## Session Tools

- `smspariaz_session_status({})` returns only `authenticated`, `app_registered`, masked `account`, `session_valid`, `requires_otp`, and state/error.
- `smspariaz_start_login({phone, referrer?})` returns `{success:true,requires_otp:true,attempt_expires_at}`.
- `smspariaz_confirm_otp({otp})` returns safe session status. OTP is not persisted/logged.
- `smspariaz_logout({})` returns `{success:true,authenticated:false,state:"LOGGED_OUT"}`.

## `smspariaz_get_smsfootball`

Input `{}`. Returns programme date/timezone/update plus events with `event_id`, `bet_code`, kickoff, country, league, home/away, status/open flag, and nested markets/selections with provider IDs/codes, displayed odds, and status/open flag.

## `smspariaz_prepare_app_bet`

Input:

```json
{
  "stake": 200,
  "selections": [
    { "event_id": "303589", "market": "FTH", "selection": "HOME", "expected_odds": 1.48 }
  ]
}
```

Market/selection accepts exact provider ID/name and reviewed aliases. Success returns opaque `prepared_bet`, expiry, resolved events, total odds, stake, estimated payout, `all_open`, changed odds/errors, and `submitted:false`. Provider bookcode remains server-side. This tool may call only the audited coupon validator, never `/placebet/`.

## `smspariaz_place_app_bet`

Input `{prepared_bet:"<opaque handle>",approved:true}`. `approved` records caller intent but is not cryptographic human attestation. Success returns provider reference or null, safe confirmation, stake/payout, and `submitted_via:"smspariaz_app_flow"`. Unknown successful bodies are terminal `SUBMISSION_AMBIGUOUS`; no retry occurs.

## `smspariaz_debug_status`

Input `{}`. May return configuration/session/app-mode booleans, enable state, expected/observed hashes, flow fingerprint, safe last error/time, and storage kind. No secrets.
