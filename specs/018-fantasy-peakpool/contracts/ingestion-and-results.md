# Ingestion and Result Contracts

## Protected Netlify market synchronization

`POST /.netlify/functions/fantasy-peakpool-sync`

**Authorization**: Server-only bearer value from deployment configuration. Browser and anonymous calls receive 401. Logs never include the token.

**Outbound allowlist**:

- existing canonical SMSPariaz racecard URL selected by `server/smspariaz-racecard.ts`;
- `GET https://www.smspariaz.com/service/peakpool_json.php` only;
- Supabase project Data API/RPC origin only.

No SMSPariaz account, `/checklogin/`, `/placebet/`, SMS, payment, or caller-supplied URL is accepted.

Response:

```json
{
  "success": true,
  "programme_date": "2026-09-04",
  "canonical_races": 52,
  "market_races": 51,
  "reconciled_races": 51,
  "valid_prices": 0,
  "unavailable_prices": 566,
  "payload_sha256": "hex",
  "observed_at": "2026-09-04T09:14:35Z"
}
```

The current evidence gate intentionally reports zero valid prices.

## Public Peakpool parser contract

Input is exact bounded UTF-8 response bytes. Content type may be `text/html`; JSON structure, not the header label, determines validity.

```ts
type PublicPeakpoolRace = {
  meeting_number: string;
  date: string;
  track: string;
  number: string;
  time: string;
  name: string;
  horses: Array<{ no: string; name: string; type: string }>;
};
```

Unknown/missing fields, duplicate race or runner identities, oversized bodies/counts, redirects, unsafe origins, invalid JSON/UTF-8, and empty programmes fail closed. A valid raw price classification is one of:

- digit string -> raw display value, no normalization, `UNVERIFIED_PRICE_FORMAT`;
- exact `NP` -> no normalization, `NON_RUNNER_DISPLAY_SENTINEL`;
- anything else -> no normalization, `UNKNOWN_PRICE_FORMAT`.

## Result-provider interface

```ts
type ResultObservation = {
  // Extracted from response content only. Request identity is never match evidence.
  observedIdentity?: { programmeDate?: string; course?: string; scheduledAt?: string; raceNumber?: number; raceName?: string };
  provider: string;
  sourceUrl: string;
  sourceIdentifier?: string;
  retrievedAt: string;
  providerUpdatedAt?: string;
  programmeDate: string;
  course: string;
  scheduledAt?: string;
  raceNumber?: number;
  raceName?: string;
  distance?: string;
  status: "PENDING" | "PROVISIONAL" | "CONFIRMED" | "VOID" | "NEEDS_REVIEW";
  finishingOrder: Array<{
    position: number;
    runnerNumber: number;
    runnerName: string;
    finalizedStartingPriceRaw?: string;
  }>;
  nonRunners: Array<{ runnerNumber: number; runnerName: string }>;
  rawPayloadSha256: string;
  sanitizedRelevantFragment?: string;
};

interface RaceResultProvider {
  fetchRaceResult(race: CanonicalRace): Promise<ResultObservation>;
}
```

Providers return evidence only. They cannot write a result, bet, or wallet.

## ATR adapter gate

Result-validation amendment (2026-09-05): `Client Challenge`, hyphen/underscore `_fs-ch` markers, and JavaScript-disabled interstitials yield zero-confidence review with empty runner decisions. Legacy non-null date/course storage columns can retain requested context when extraction fails; matching uses only `observedIdentity`, never those fallbacks. Unknown historical observations without separate observed identity cannot auto-confirm. Identity extraction currently supports a single SportsEvent JSON-LD block (including graph/array containers) and one matching race heading; unsupported live layouts remain review-only. Every parsed runner must map uniquely and cannot appear twice or be both a finisher and non-runner.

The non-mutating smoke endpoint now returns `TRANSPORT_OK` or `FAIL_CLOSED`, always with `settlementReady: false`. It does not establish identity, finality, or payout readiness. The acquisition-provider configuration is unchanged by this fix.

The adapter is inactive unless `FANTASY_ATR_RESULTS_ENABLED=true` and a deployment smoke check confirms an ordinary unauthenticated request returns parseable public results/detail HTML. HTTP 200 challenge/interstitial pages are `NEEDS_REVIEW`, not a retry-via-browser signal.

Allowed public paths are daily `/results/DD-Month-YYYY` and race detail `/racecard/{Course}/{DD-Month-YYYY}/{HHmm}`. Internal AJAX routes, logins, copied cookies, challenge execution, or CAPTCHA solving are prohibited.

Automatic confirmation requires all configured dimensions, `Weighed In`, and a bounded finalized starting-price token on each unambiguous position-one row. Extra ATR races never enter the race universe. Multiple unambiguous position-one rows are dead-heat winners. Missing winners, missing winner prices, partial overseas positions, conflicts, unmatched winners, or weak field agreement require review. Settlement converts each selected winner's fractional/evens finalized SP to its decimal equivalent and uses it as the sole payout multiplier; Peakpool pre-race values never affect payout.

## Cron contract

- One invocation claims at most 20 races.
- Checks start only after the configured post-off delay.
- Backoff is progressive and persisted in `next_result_check_at`.
- No historical full scan occurs.
- Automatic attempts stop at `automatic_check_until`.
- Repeated invocations and worker crashes cannot duplicate settlement.
