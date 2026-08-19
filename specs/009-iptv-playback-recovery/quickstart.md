# Quickstart: Validate IPTV Playback Recovery

## Static verification

```powershell
npx eslint src
npm run build
```

Expected: both commands exit successfully; HLS.js remains a lazy playback chunk.

## Controlled engine fallback

1. Open a player source while the test browser reports native HLS.
2. Trigger one native media error before readiness.
3. Verify the same source changes to HLS.js, displays a compatibility-recovery note, and reaches Ready with a CORS-enabled HLS control stream.
4. Verify a second error does not restart native playback.
5. Hold a native-HLS source in silent loading and verify it advances to HLS.js within ten seconds with a compatibility-recovery note.

## IPTV alternative recovery

1. Open IPTV and select a catalog channel with at least two equivalent sources.
2. Cause the first URL to fail and verify the tune strip advances to `Source 2` within one second.
3. Verify no URL repeats and no more than three URLs are attempted.
4. Select a different channel during recovery and verify the prior timer never changes the new selection.

## Availability filtering

1. Load IPTV and confirm `Best chance` is selected.
2. Search for a warning-labeled stream and confirm it is absent from the default results.
3. Select `All sources` and confirm the entry returns with its warning label.

## Responsive validation

At 375px, 768px, and 1280px:

1. Verify search, country, availability, tune progress, player, result grid, and footer remain reachable.
2. Confirm `document.documentElement.scrollWidth <= document.documentElement.clientWidth`.
3. Confirm mobile navigation and keyboard focus still operate.
4. Review console/runtime output for unexpected application errors.
