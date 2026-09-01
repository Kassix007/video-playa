# Video Playa + HORSEE Council

Long-term scheduler and archive operations are documented in [docs/horsee-scheduler.md](docs/horsee-scheduler.md).

The authenticated SMSFootball app/leaderboard MCP capability is documented in [docs/smspariaz-app-bet.md](docs/smspariaz-app-bet.md). It is separate from the existing SMSPariaz racecard reader and is disabled until its encryption configuration is present; app placement is disabled by default.

Video Playa is a React/Vite stream desk. Its Equidia page includes the HORSEE Horse Racing Council, implemented as a remote MCP server and an MCP Apps UI.

The Equidia player remains a normal browser player. HORSEE adds this separate flow:

```text
HORSEE MCP App → exact race command as a ChatGPT message
               → OAuth diagnostic + visible run-stage updates
               → Council analysis in the ChatGPT conversation
               → save_council_result when OAuth publishing is configured
               → structured verdict in the MCP App and Equidia dashboard
```

No OpenAI API is called by the browser or server, and no OpenAI API key is required. ChatGPT performs the reasoning in the user's conversation. The MCP server only exposes the interface, OAuth diagnostic, status/result tools, and separated storage.

## Requirements

- Node.js 22.19 or newer (the deployed Netlify runtime is Node 22)
- npm

## Run locally

Install dependencies and start the full Netlify development environment:

```bash
npm install
npx netlify dev
```

Open `http://localhost:8888/#/equidia` for the Equidia page. Use Netlify Dev, rather than only `npm run dev`, when testing the MCP function or latest-result endpoint.

Local Council results are stored in `.netlify/horsee-council-results.json`, which is gitignored. Netlify storage is isolated by deploy context:

- Production always uses `horsee-council-results-production`, so history persists across normal production deployments.
- Deploy Previews use `horsee-council-results-deploy-preview-<REVIEW_ID-or-DEPLOY_ID>`.
- Branch deploys use `horsee-council-results-branch-<BRANCH-or-DEPLOY_ID>`.
- An unrecognized Netlify context fails safe into a non-production namespace containing `DEPLOY_ID`.

This prevents a PR preview or branch deploy from changing the production selection board. Netlify's per-invocation `Context` supplies the authoritative deploy context, deploy ID, and site identity; environment variables are fallbacks for local tests and explicitly configured values. New Council saves use one canonical `days/YYYY-MM-DD.json` document with one current result per race, plus bounded `latest.json`/`recent.json` caches. Legacy flat/dated history remains readable until the deliberate migration command archives it. Verified daily results and racecards live long-term in yearly GitHub repositories; old exact-date and month reads transparently fall back to that archive. Both storage implementations remain behind the existing `CouncilResultStore` contract.

Current run progress is stored separately from verdicts. Netlify uses a single current-status key in `horsee-council-run-status-production`, with the same isolated Deploy Preview and branch suffixes as result storage. Local development uses `.netlify/horsee-council-run-status.json`. This status has no history and can never overwrite, populate, or count as a Council result; only `save_council_result` writes the Selection Board.

Build the site, MCP widget, and both TypeScript targets with:

```bash
npm run build
npm run test:mcp
```

## Endpoints

- Streamable HTTP MCP: `http://localhost:8888/mcp`
- Latest structured result for the Equidia dashboard: `http://localhost:8888/api/council/latest`
- Current Mauritius-day analyses: `http://localhost:8888/api/council/today`
- Analyses for a date: `http://localhost:8888/api/council/history?date=2026-08-20`
- Archive date counts: `http://localhost:8888/api/council/history/dates?month=2026-08`
- Scheduler status: `http://localhost:8888/api/horsee/scheduler/status`
- Today's/READY/next scheduler jobs: `/api/horsee/jobs/today`, `/api/horsee/jobs/ready`, `/api/horsee/jobs/next`
- Archive health: `http://localhost:8888/api/horsee/archive/status`
- OAuth protected-resource metadata: `http://localhost:8888/.well-known/oauth-protected-resource`
- Production MCP: `https://<your-netlify-domain>/mcp`

The MCP server identity is `horsee-council` version `1.1.0`.

The scheduler runs every five minutes and prepares deterministic HARD prompts without calling any reasoning provider. The archive task runs daily, writes deterministic NDJSON, the parsed racecard, and a monthly index to `${HORSEE_GITHUB_ARCHIVE_OWNER}/${HORSEE_GITHUB_ARCHIVE_PREFIX}${year}`, and removes hot days only after verified archive success and retention eligibility. Configure `HORSEE_GITHUB_TOKEN` for writes; absence degrades to `NOT_CONFIGURED` without affecting scheduling or Council use. See [the scheduler/archive operations guide](docs/horsee-scheduler.md) for all environment variables, GitHub setup, authorized API calls, recovery, and the safe `npm run migrate:horsee -- --dry-run` workflow.

## MCP tools

The public bootstrap catalog is available before an OAuth provider is configured. It contains exactly these four read-only tools, each explicitly advertised as `noauth`:

- `open_horsee_council` — returns the latest result and current run status, then renders `ui://horsee-council/v1.html`
- `get_smspariaz_daily_racecard` — fetches SMSPariaz directly, validates the current Mauritius date, retries stale responses with cache bypass, and parses every meeting/race from the complete PDF
- `get_latest_council_result` — returns the latest saved verdict and separately stored current run status
- `get_council_history` — returns up to 100 newest-first results and optionally filters by a Mauritius date while preserving the existing output shape

Only when the complete Council OAuth/write configuration resolves successfully does the server also register:

- `check_council_write_access` — read-only OAuth diagnostic for `horsee:council:write`; verifies access without writing storage or exposing identity/token claims
- `update_council_run_status` — OAuth-protected current-stage update; bounded progress data only, never a selection
- `save_council_result` — OAuth-protected write; requires `horsee:council:write` and accepts the strict final verdict

None of these three privileged tools is ever registered as `noauth`. In bootstrap mode, ChatGPT can create a No Auth connection without resolving OAuth metadata, open the widget, and receive commands through `ui/message`. ChatGPT performs the full Council analysis in the conversation but does not attempt to update status or publish a result; the selection board can therefore remain on the latest previously stored result or await its first result.

For the current Mauritius day, `get_smspariaz_daily_racecard` is authoritative for deciding which races SMSPariaz offers; search results and third-party racecards cannot replace that offering list. Before FACT LOCK, the server instructions still require ChatGPT to corroborate the selected race's conditions and runner facts with compatible current sources and persist across conflicts, blocked pages, and incomplete runner data. A fixture calendar proves only that a course is scheduled to race; it cannot establish the PMU meeting number by itself. The regression guard records that on 20/08/2026 `R2C1` was Le Lion-d'Angers, Prix Cocktail Vision (Prix E. et L. de Tredern), and must not be inferred as Senonnes from a Senonnes fixture calendar.

When publishing is enabled, ChatGPT first calls `check_council_write_access` so OAuth failures surface before a long race analysis. Each accepted command then progresses through `RECEIVED`, `RESOLVING_RACE`, `FACT_LOCK`, `ANALYSING_RUNNERS`, `MARKET_AUDIT`, `VERDICT_READY`, `SAVING`, and `SAVED`; an actual terminal error uses `FAILED`. The widget polls the current status, shows its command and timestamp separately from the Selection Board, and continues for long-running analyses rather than going silent after two minutes.

Successful FACT LOCK still proceeds through blind-to-odds analysis of every runner; separate Form, Conditions, Handicap, Improvement, and Reliability analyst passes; a contradiction gate on the top three; and only then market audit, complete verdict, and construction of a schema-valid result. ChatGPT must call `save_council_result` before ending its response, explicitly report any tool error, and say `HORSEE dashboard updated.` only after a successful publish. Bootstrap instructions retain the full research and analytical sequence but explicitly prohibit the unavailable OAuth diagnostic, status, and save calls.

The result schema rejects unknown fields, inconsistent verdicts, and unbounded inputs. Ranking must contain exactly `field_size` unique runners; `most_likely_winner` must exactly match `ranking[0]`; the winner, principal danger, and best value horse must match ranked runners; every probability must be numeric from 0 through 100; and ranking probabilities must total 99.5–100.5%. Confidence is strictly `low`, `medium`, or `high`. A race is limited to 40 runners, horse names to 120 characters, the strongest loss reason to 2,000 characters, and the remaining text fields to documented schema-specific limits.

## Council write authorization

Result and status viewing remain public, but the OAuth diagnostic, status writer, and result writer all require `horsee:council:write`. Bearer tokens pass through the existing verification path: configured JWKS signature, exact issuer, expiry/not-before, HORSEE resource audience, and scope. Invalid bearer tokens receive HTTP `401` with `WWW-Authenticate`; authenticated tokens missing the write scope receive `403`; and a protected tool call without authorization receives the existing MCP `mcp/www_authenticate` challenge and cannot reach storage. A successful `check_council_write_access` returns only `authenticated`, the write scope, and the canonical `https://videoplaya.kassinathdoss.dev/mcp` resource—never the token, subject, client identity, or raw claims.

Before MCP parsing or authentication, the `/mcp` boundary also enforces the configured request host, rejects a supplied browser `Origin` unless it is allowed, and reads no more than 256 KiB of request body. Server-to-server clients may omit `Origin`. Allowed origins are derived from `HORSEE_MCP_RESOURCE`, Netlify's `URL`, `DEPLOY_PRIME_URL`, and `DEPLOY_URL`. Deploy Preview and branch hosts are additionally matched to the current deploy context and the production Netlify site slug; set `HORSEE_NETLIFY_SITE_NAME` when `URL` uses a custom domain. Add exceptional trusted origins with a comma-separated `HORSEE_ALLOWED_ORIGINS` value. Local development permits only loopback hosts unless one of those values is configured. The function is exposed only at `/mcp` (not the default `/.netlify/functions/mcp` URL), and Netlify applies a platform-level limit of 120 requests per 60 seconds for each IP/domain pair.

Configure these server-side Netlify environment variables for the relevant deploy context:

```text
HORSEE_MCP_RESOURCE=https://your-domain.example/mcp
HORSEE_OAUTH_ISSUER=https://your-oauth-issuer.example/
HORSEE_OAUTH_JWKS_URI=https://your-oauth-issuer.example/.well-known/jwks.json
HORSEE_OAUTH_WRITE_SCOPE=horsee:council:write  # optional override
HORSEE_ALLOWED_ORIGINS=https://trusted-inspector.example  # optional, comma-separated
HORSEE_NETLIFY_SITE_NAME=your-netlify-site-name  # needed for previews when URL is custom
```

The authorization server must implement the OAuth 2.1 MCP flow and publish its own OAuth or OIDC discovery metadata. The resource value must be carried into the token's `aud` or `resource` claim. Grant `horsee:council:write` only to approved ChatGPT principals/clients; do not issue it as a general public scope. If the three required variables are absent, partial, or invalid on Netlify, privileged actions are deliberately disabled, all three OAuth tools are absent from `tools/list`, and the three `noauth` tools continue to work without OAuth discovery. No OpenAI API key is involved, and no shared write secret is placed in model instructions or tool arguments.

Each successful result publish creates a server-only audit record alongside the result store. The record contains server receipt time, OAuth client ID, a one-way hash of the subject when present, race ID, and a result hash; it never contains the bearer token or the full verdict. Netlify retains the newest 500 audit records per deployment namespace. Local development writes the equivalent private records to `.netlify/horsee-council-write-audit.json`. Denied request-source and authentication events, plus successful/denied result writes, are emitted as structured Netlify Function logs for monitoring.

For local Inspector testing only, set `HORSEE_COUNCIL_DEV_WRITE_TOKEN` before starting Netlify Dev. This development bearer token is ignored in every non-`dev` Netlify deployment and is never a production authorization mode.

## SMSPariaz local MCP debugging

Use a throwaway local encryption key and leave app placement off:

```powershell
$env:HORSEE_COUNCIL_DEV_WRITE_TOKEN = "local-dev-token"
$env:SMSPARIAZ_SESSION_ENCRYPTION_KEY = [Convert]::ToBase64String((1..32 | ForEach-Object { Get-Random -Maximum 256 }))
$env:SMSPARIAZ_APP_BET_ENABLED = "false"
npx netlify dev
```

Connect an Inspector to `http://localhost:8888/mcp` using `Bearer local-dev-token`, then call `smspariaz_get_smsfootball` and `smspariaz_debug_status`. See [the SMSPariaz app-bet guide](docs/smspariaz-app-bet.md) for scopes, OTP setup, encrypted local state, and the strict no-wallet/no-paid-SMS guard. Calling OTP or validation tools against a live local server contacts SMSPariaz; the test suite does not.

## Test with MCP Inspector

For bootstrap-mode discovery, start Netlify Dev without OAuth variables or a development write token. Inspector initialization and `tools/list` must succeed with No Auth and return exactly the four public tools.

For write-path testing, start Netlify Dev with an uncommitted local test token, then launch the current Inspector:

```powershell
$env:HORSEE_COUNCIL_DEV_WRITE_TOKEN = "replace-with-a-local-test-token"
npx netlify dev
```

In another terminal, run `npx @modelcontextprotocol/inspector@latest`. Choose Streamable HTTP, connect to `http://localhost:8888/mcp`, and add `Authorization: Bearer replace-with-a-local-test-token` in the Inspector authentication/header settings. Verify initialization, `tools/list`, and all seven tools. Call `get_smspariaz_daily_racecard` to verify current programme discovery, then call `check_council_write_access`; it should confirm access in seconds without creating a result. Call `open_horsee_council` to inspect the MCP Apps resource and its `text/html;profile=mcp-app` response, then exercise `update_council_run_status` and confirm the widget/open payload exposes status while the latest result remains unchanged. Use a complete structured verdict only when deliberately testing `save_council_result`, then confirm it is returned by both result read tools. Local development-token mode exists only for Inspector testing and, like OAuth mode, keeps every privileged tool OAuth-required; it never downgrades one to `noauth`.

Repeat `check_council_write_access` without the Authorization header and verify that it returns `isError: true` with `mcp/www_authenticate`. Repeat `save_council_result` without authorization and confirm latest/history remain unchanged. Repeat with a malformed verdict to verify schema rejection before storage.

The Inspector CLI can check discovery directly:

```bash
npx @modelcontextprotocol/inspector@latest --cli \
  --server-url http://localhost:8888/mcp \
  --transport http \
  --method tools/list
```

## Connect in ChatGPT Developer Mode

ChatGPT requires a publicly reachable HTTPS endpoint or an approved secure/development tunnel; `localhost` cannot be added directly as a public connection.

1. Deploy this branch to Netlify, or expose the local endpoint through a suitable development tunnel.
2. In ChatGPT, open **Settings → Security and login** and enable **Developer mode**. Availability can depend on account or workspace policy.
3. Open **ChatGPT Plugins**, select the plus button, and enter a name and description.
4. Choose the public endpoint connection method and enter the complete URL, including `/mcp` (for example, `https://example.netlify.app/mcp`).
5. Create the connection. In No Auth bootstrap mode, review the four public tools and their `noauth` declarations. After OAuth is completely configured, refresh the connection and review all seven tools, including the three OAuth-only diagnostic/status/save tools.
6. Add HORSEE to a conversation and ask it to open the Council. Enter a command such as `R1C1 hard` in the rendered panel.

`RUN COUNCIL` sends the exact command as a standard MCP Apps `ui/message`. The `window.openai.sendFollowUpMessage` bridge is only a ChatGPT compatibility fallback. Outside a supported host, the button stays disabled and the page states that the Council bridge is offline; stored results may still be viewed.

## Implementation notes

- The app resource uses the stable MCP Apps bridge (`ui/initialize`, tool input/result notifications, `tools/call`, and `ui/message`).
- OAuth is a resource-server boundary only; use an established OAuth 2.1 identity provider rather than implementing an authorization server in this repository.
- `server/generated/horsee-widget.ts` is rebuilt from `mcp-app/horsee-widget.ts` by `npm run build:mcp-widget`; do not edit the generated module directly.
- The full Council analysis belongs in the ChatGPT conversation. Only the strict final verdict is stored.
- No API keys, ChatGPT credentials, or conversation tokens are stored.

Current references: [OpenAI plugin authentication guide](https://developers.openai.com/plugins/build/auth), [OpenAI MCP server guide](https://developers.openai.com/plugins/build/mcp-server), [OpenAI MCP Apps UI guide](https://developers.openai.com/plugins/build/ui), [Netlify build environment variables](https://docs.netlify.com/build/configure-builds/environment-variables/), [Netlify rate limiting](https://www.netlify.com/blog/how-to-rate-limit-ai-features-and-avoid-surprise-costs/), and [MCP Apps specification](https://modelcontextprotocol.io/extensions/apps/overview).
