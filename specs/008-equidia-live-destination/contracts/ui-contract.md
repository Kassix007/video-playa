# UI Contract: Equidia Live Destination

## Route and navigation

- Stable route: `/#/equidia`
- Primary label: `Equidia`
- The route must participate in the same active-state calculation as every other primary destination.
- The mobile drawer must close after activation and preserve its existing focus behavior.

## Page states

### Player

- Receives the canonical Equidia master immediately on route render.
- Uses title `Equidia Live` and explicit HLS mode.
- Applies the source-declared no-referrer privacy policy to nested HLS requests and selects a compatible in-client engine without first issuing a known-rejected request.
- Retains the shared player's loading, ready, playing, paused, buffering, ended, and error states.
- Retains the shared player's original-source recovery action on error.

### Manifest board

- `loading`: presents a concise live-metadata loading state without hiding or delaying the player.
- `ready`: presents rendition count, ordered variant labels/bandwidths, audio language, and refresh note when supplied.
- `error`: explains that signal metadata is unavailable while playback is still attempted from the known master.

## Accessibility

- The signal board is a labeled section with a real heading.
- Renditions use a semantic list and do not masquerade as selectable controls.
- External source actions name their destination/purpose and open separately with safe relationship attributes.
- Information is not conveyed by red/green color alone.

## Responsive behavior

- At 1280px, channel identity and source context may share a row; the rendition ladder uses the available horizontal space.
- At 768px, the page stacks without reducing control hit areas.
- At 375px, long URLs never render as unbroken visible text, rendition cells wrap or grid vertically, and the page has no horizontal overflow.

## Security and failure boundary

- The UI must not promise that reading the GitHub-hosted master means the nested Hexaglobe media will play.
- No automatic retry loop, header forgery, media proxy, DRM bypass, or geography bypass is part of the contract.
- Referrer omission is opt-in for Equidia only; no alternative referrer, origin, user agent, cookie, or authorization value is synthesized.
