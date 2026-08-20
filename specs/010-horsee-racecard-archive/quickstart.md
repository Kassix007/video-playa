# Quickstart: HORSEE Racecard and Council Archive

## 1. Install and run automated checks

```powershell
npm install
npm run test:mcp
npx eslint server src netlify/functions
npm run build
```

Expected release gate: all MCP/backend tests pass, lint reports no errors, and the production build completes. Racecard tests inject controlled fetch/PDF text and do not contact SMSPariaz.

## 2. Run the application locally

```powershell
npx netlify dev
```

Open the local URL printed by Netlify and navigate to `/#/equidia`.

## 3. Verify archive API contracts

Use the port printed by Netlify in place of `8888` if it differs.

```powershell
Invoke-RestMethod 'http://localhost:8888/api/council/today'
Invoke-RestMethod 'http://localhost:8888/api/council/history?date=2026-08-21'
Invoke-RestMethod 'http://localhost:8888/api/council/history/dates?month=2026-08'
```

Confirm that each response uses `Indian/Mauritius`, counts equal collection sizes, and results are newest first. An invalid date or month must return HTTP 400; a non-GET request must return HTTP 405.

## 4. Verify Equidia behavior

With controlled local Council records available:

1. Confirm the existing latest selection board and live player still render.
2. Open Today and confirm every current Mauritius-day analysis appears newest first.
3. Expand an analysis and confirm ranking, probabilities, selections, confidence, loss reason, status, and time are readable.
4. Open History, navigate months, and confirm populated days display accurate counts.
5. Select a populated day and confirm all of its analyses load; select an empty day and confirm the empty state.
6. Return to Today in one action.
7. Repeat at 375, 768, and 1280 pixel widths, checking keyboard focus/operation and page-level horizontal overflow.

## 5. Verify the MCP racecard contract

Run the MCP discovery/contract tests through `npm run test:mcp`, then call `get_smspariaz_daily_racecard` from an MCP client connected to the local or deployed HORSEE endpoint.

Confirm:

- the source is exactly `https://www.smspariaz.com/racecard/`;
- `programme_date` equals the current Mauritius date;
- meeting/race counts match their arrays;
- French races are present when printed in the programme;
- races are chronological;
- no Council result is created by the call.

For a release smoke check only, allow the real source call and record the returned programme date and counts. Do not make the automated suite depend on this check.

## 6. Deployment and migration

Deploy through the existing Netlify pipeline. No destructive data migration is required: new saves use date-partitioned history keys, while existing flat history keys remain readable. PDF extraction uses `pdf-parse` plus its explicit Node canvas runtime. Existing Auth0 variables, write scope, MCP endpoint, Council store, and latest-result key remain unchanged.

Before deployment, build the Netlify function artifacts and confirm the MCP archive includes `@napi-rs/canvas`, the platform-native canvas package, and the PDF.js worker:

```powershell
netlify build --offline
tar -tf .netlify/functions/mcp.zip | Select-String '@napi-rs/canvas'
tar -tf .netlify/functions/mcp.zip | Select-String 'node_modules/pdfjs-dist/legacy/build/pdf.worker.mjs'
```

Use the full Netlify build for this gate: the lower-level `netlify functions:build` command does not apply the site's `netlify.toml` included-file configuration.

After deployment, POST an MCP `initialize` request to `/mcp`, use its session ID for `tools/list`, and call `get_smspariaz_daily_racecard`. Discovery and the tool call must succeed; `DOMMatrix is not defined`, a missing `pdf.worker.mjs`, or an empty racecard fails the deployment gate.
