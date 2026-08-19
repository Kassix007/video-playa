# Research: IPTV Playback Recovery

## Decision 1: Do not port the upstream tester into browser code

**Decision**: Reuse catalog data, not the upstream link tester's transport mechanism.

**Rationale**: IPTV.org's current `playlist:test` command runs in Node, uses Axios to download raw bytes, can set a custom User-Agent and Referer, supports an optional proxy, and analyzes the result with MediaInfo. Its viewing documentation directs users to a media player such as VLC. Browser JavaScript cannot inherit those network privileges merely by copying the source.

**Alternatives considered**:

- Copy the tester and Axios call into the client: rejected because browser Axios uses browser networking and remains subject to CORS and forbidden-header rules.
- Use an opaque `no-cors` response: rejected because its body and headers cannot be read or supplied to HLS.js.
- Add a public third-party proxy: rejected for privacy, reliability, abuse, and production-security concerns.

**Primary references**:

- https://github.com/iptv-org/iptv/blob/master/scripts/core/streamTester.ts
- https://github.com/iptv-org/iptv/blob/master/.github/docs/stream-testing.md

## Decision 2: Use bounded native-to-script HLS recovery

**Decision**: Preserve native HLS as the first path when reported, then initialize HLS.js once if the native media element emits a terminal error. If native HLS is unavailable, use HLS.js directly.

**Rationale**: Native media loading can work where script-origin manifest access is denied; HLS.js can handle manifests and Media Source combinations rejected by some native decoders. Trying each once maximizes permitted client behavior without looping.

**Alternatives considered**:

- Always use HLS.js first: rejected because it regresses sources that permit media-element loading but deny script XHR.
- Always trust `canPlayType`: rejected because a positive capability response does not guarantee every HLS manifest, codec, or rendition layout will work.

## Decision 3: Retry exact channel/feed alternatives, capped at three URLs

**Decision**: Group alternatives by `channel + feed`; only use exact normalized title when catalog identity is absent. Automatically advance through at most three distinct URLs.

**Rationale**: A live 2026-08-19 catalog snapshot contained 12,701 otherwise eligible HTTPS/header-free sources, with 3,988 streams belonging to 1,352 multi-source groups. Bounded alternates provide meaningful coverage while preventing request storms; including the feed key avoids silently switching to another regional service.

**Alternatives considered**:

- Group by title substring: rejected because similar titles can represent different channels or regions.
- Try every alternate: rejected because some channel groups contain dozens of URLs and would create an unbounded retry chain.

## Decision 4: Default to unlabeled sources

**Decision**: Add an availability filter whose default omits non-empty upstream labels, with an explicit all-sources option.

**Rationale**: In the same live snapshot, 10,347 otherwise eligible sources were unlabeled and 2,354 carried warnings such as geo-blocked or not-24/7. The API exposes the warning but no current checked-at/live status, so this is the strongest honest default ranking available.

**Alternatives considered**:

- Claim unlabeled means working: rejected because absence of a warning is not a health guarantee.
- Probe all catalog URLs from the browser: rejected because it would trigger thousands of cross-origin requests, produce misleading CORS failures, and burden upstream hosts.

## Decision 5: Keep source handoff as the terminal recovery only

**Decision**: Attempt all permitted in-player engine paths and equivalent URLs first. Retain the existing direct-source action only after or alongside the final stable error.

**Rationale**: This matches the user's preference for in-application playback while preserving the only client-safe path for sources intended for native players.
