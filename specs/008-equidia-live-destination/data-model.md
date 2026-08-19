# Data Model: Equidia Live Destination

## Equidia Source

Represents the stable application-facing identity for the public channel.

| Field | Type | Rules |
|---|---|---|
| `title` | string | Non-empty display name |
| `masterUrl` | HTTPS URL | Must use HTTP or HTTPS; current value is the public community master |
| `mode` | media mode | Fixed to HLS for explicit player selection |
| `sourceLabel` | string | Human-readable provenance, not an availability claim |
| `referrerPolicy` | `no-referrer` or absent | Optional, source-owned privacy policy; omission preserves default shared-player behavior |

## Manifest Snapshot

Represents the last successfully parsed master response for the current page visit.

| Field | Type | Rules |
|---|---|---|
| `variants` | Video Variant[] | Ordered as declared; may be empty |
| `audio` | Audio Rendition or null | Default audio preferred when several are present |
| `refreshNote` | string or null | Derived only from a recognized source comment |

### Retrieval state

`loading → ready` on a successful fetch and parse.  
`loading → error` on network, response, or parsing failure.  
The playback source exists independently in all three states.

## Video Variant

| Field | Type | Rules |
|---|---|---|
| `url` | HTTPS URL | Resolved against the master URL when relative |
| `width` | integer or null | Positive when present |
| `height` | integer or null | Positive when present |
| `bandwidth` | integer or null | Bits per second; positive when present |
| `label` | string | Resolution-derived label when possible, otherwise stable ordinal |

## Audio Rendition

| Field | Type | Rules |
|---|---|---|
| `url` | HTTPS URL or null | Resolved against the master URL when present |
| `name` | string | Source-declared label or neutral fallback |
| `language` | string or null | Source language code when present |
| `isDefault` | boolean | Derived from the manifest's default flag |

## Relationships

- One Equidia Source may produce one Manifest Snapshot per successful refresh.
- One Manifest Snapshot contains zero or more Video Variants and zero or one selected Audio Rendition.
- Playback consumes the Equidia Source directly, including its optional request policy; the presentation consumes the Manifest Snapshot.
