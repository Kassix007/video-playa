# UI Contract: IPTV Playback Recovery

## Shared player callback

- The player reports `idle`, `loading`, `ready`, `playing`, `paused`, `buffering`, `ended`, or `error` whenever the active source lifecycle changes.
- An engine fallback keeps the lifecycle at `loading`, changes the visible engine, and shows a compatibility-recovery note.
- A failed engine's stale events cannot overwrite the current engine or source state.

## Tune-session status

- Hidden before a channel is selected.
- While active, identifies the selected channel and displays `Source N of M`, where `M` is no greater than three.
- During recovery, announces that the prior URL failed and another equivalent URL is being tried.
- On success, announces that the source connected in this browser session.
- On exhaustion, explains that all available bounded in-app attempts failed; it does not claim every external player or region would fail.

## Availability control

- Label: `Availability`.
- Default option: `Best chance` (unlabeled eligible sources).
- Secondary option: `All sources` (restores warning-labeled eligible sources).
- Changing the option resets result pagination but does not interrupt the currently selected player source.

## Result outcome

- A URL that reaches ready/playing may display `Worked here`.
- A URL that reaches terminal error may display `Failed here` unless the tune session advanced before that result belonged to the current generation.
- Outcome is not persisted and is not described as global stream health.

## Responsive and accessible behavior

- The tune strip is a polite live region and does not steal focus.
- The availability filter is a native labeled select.
- At 375px, controls stack, progress text wraps, and all buttons/selects meet the existing mobile target size.
- No status string or source metadata causes page-level horizontal overflow.
