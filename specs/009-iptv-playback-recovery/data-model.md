# Data Model: IPTV Playback Recovery

## Playback Path Attempt

| Field | Type | Rules |
|---|---|---|
| `sourceUrl` | HTTPS URL | Matches the currently assigned media source |
| `engine` | native HLS or script-assisted HLS | Each engine appears at most once per source assignment |
| `state` | loading, ready, playing, or failed | Ready/playing ends engine fallback; failed may advance once |

## Equivalent Source Group

| Field | Type | Rules |
|---|---|---|
| `identity` | string | `channel + feed`, or exact normalized title only when channel identity is missing |
| `sources` | IPTV stream[] | Unique eligible URLs only |

## Tune Session

| Field | Type | Rules |
|---|---|---|
| `channelIdentity` | string | Fixed for the lifetime of the session |
| `attemptedUrls` | ordered HTTPS URL[] | Unique; maximum length three |
| `currentSource` | IPTV stream | Must be the final entry in attempted URLs |
| `status` | loading, recovering, ready, playing, or exhausted | Terminal on ready/playing/exhausted |
| `generation` | integer | Changes on manual selection so stale timers/events can be ignored |

### State transitions

- Manual tune → `loading` with one attempted URL.
- Player ready/playing → terminal success.
- Player failed + untried equivalent + fewer than three attempts → `recovering` → `loading` next source.
- Player failed + no permitted next source → `exhausted`.
- Any manual tune invalidates the previous generation immediately.

## Session Outcome

| Field | Type | Rules |
|---|---|---|
| `sourceUrl` | HTTPS URL | Unique key |
| `result` | working or failed | Session-local, replaced only by newer evidence |

## Availability Filter

`best-chance` includes eligible sources with no upstream warning label.  
`all` includes every otherwise eligible source and preserves its label.
