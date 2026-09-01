# Data Model: Authenticated SMSPariaz App Bets

## Encrypted Session Record

Strict plaintext encrypted as a whole: `schema_version`, monotonic `generation`, `state` (`LOGGED_OUT`, `OTP_PENDING`, `AUTHENTICATED`, `EXPIRED`), exact provider origin, timestamps, optional safe last error, and exactly one state payload.

- `OTP_PENDING`: attempt ID, phone, optional referrer, first-party cookies, request/expiry times. OTP is never a field.
- `AUTHENTICATED`: login ID, phone, token, first-party cookies, app-registration state, confirmation/last-validation times.
- `LOGGED_OUT`: no authentication secrets; a higher generation prevents stale resurrection.
- Undecryptable/corrupt records are preserved and reported, never automatically overwritten.

```text
LOGGED_OUT -> OTP_PENDING -> AUTHENTICATED
     ^            |               |
     |            v               v
     +-------- LOGGED_OUT <---- EXPIRED
```

## Encryption Envelope

`{version:1, alg:"A256GCM", kid, iv, tag, ciphertext}`. IV is 12 random bytes, tag 16 bytes, and binary fields are Base64. Authenticated additional data binds envelope/schema versions, namespace, record key, and provider origin.

## Provider Cookie

Bounded `{name,value,domain,path,expires_at,secure,http_only,same_site}`. Only exact first-party cookies are retained; values are secret and expired cookies are not sent.

## Football Event / Market / Selection

- Event: provider `event_id` (`match.i`), displayed `bet_code` (`match.c`), Mauritius-offset kickoff, country, league, teams, provider update time, and open status.
- Market: provider market ID/name and per-event market booking code.
- Selection: provider selection ID/name, positive displayed decimal odds, and availability.
- Only one selection from an event may appear in one accumulator, matching the page.

## Prepared App Bet

Encrypted durable record with random 256-bit opaque ID, server-keyed OAuth principal hash, session generation, state, canonical selections/provider IDs, game (`s` or full accumulator `a`), fixed-point stake/tax/payout/total odds, provider bookcode, flow fingerprint, timestamps/expiry, and safe terminal result classification.

```text
PREPARED -> SUBMITTING -> SUCCEEDED
    |            |-----> REJECTED
    |            `-----> AMBIGUOUS
    `------------------> EXPIRED
```

Only atomic CAS may enter `SUBMITTING`; every later placement fails. `AMBIGUOUS` is terminal.

## App-Flow Manifest

Reviewed immutable origin, paths, methods, content type, request fields, header/app signal, response classifier, forbidden vocabulary, and expected source hashes. It is never caller-controlled.

## Safe Diagnostic State

Booleans, state/error enums, timestamps, source hashes, flow fingerprint, storage kind, and provider HTTP classification only. It excludes account values, OTP, cookies/tokens, prepared handles, raw bodies, and plaintext references.
