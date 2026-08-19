# Quickstart: Validate Equidia Live Destination

## Prerequisites

- Install project dependencies.
- Ensure the development server can access the public internet for live-manifest validation.

## Static verification

```powershell
npx eslint src
npm run build
```

Expected: both commands exit successfully. Playback engines may remain separate lazy chunks.

## Desktop journey

1. Start the development server and open the application at a 1280px-wide viewport.
2. Select `Equidia` in primary navigation.
3. Verify the URL is `/#/equidia`, the active indicator aligns to Equidia, and the player starts with `Equidia Live` without pasted input.
4. Verify the signal board lists the current manifest variants, audio context, and source provenance.
5. Confirm Picture-in-Picture, cast/remote playback, and fullscreen retain the shared player's supported/unsupported states.
6. Confirm `document.documentElement.scrollWidth` is not greater than `document.documentElement.clientWidth`.

## Mobile journey

1. Resize to 375px by at least 760px.
2. Open the hamburger navigation, select `Equidia`, and verify the drawer closes.
3. Confirm the masthead, player, signal board, source action, and footer remain readable and reachable.
4. Use keyboard navigation to verify visible focus on every actionable element.
5. Confirm there is no page-level horizontal overflow.

## Manifest and playback boundary

1. With the public master readable, confirm five variants for the supplied snapshot: 1080p, 720p, 480p, 240p, and 144p; confirm French audio.
2. Observe playback separately. A Ready state is acceptable when the browser/media host permits it.
3. If the nested media host rejects playback, confirm one stable player error and an `Open source directly` action pointing to the canonical master.
4. Simulate metadata failure by blocking the GitHub raw request. Confirm the metadata board reports failure while the player still retains its source and recovery behavior.

## Referrer-sensitive playback

1. Open Equidia from `http://localhost:5173` with network inspection enabled.
2. Confirm the player selects the scripted HLS engine directly for this source and reaches Ready or Playing with the current live feed.
3. Inspect the current Hexaglobe master, video-playlist, audio-playlist, and segment requests; confirm they omit `Referer` and are accepted by the source rather than returning `406`.
4. Open an ordinary IPTV or user-entered source and confirm it retains the player's default request behavior.
5. Confirm no application proxy, service-worker rewrite, fabricated referrer, or external-player handoff is involved.
