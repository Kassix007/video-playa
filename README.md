# Video Playa + HORSEE Council

Video Playa is a React/Vite stream desk. Its Equidia page includes the HORSEE Horse Racing Council, implemented as a remote MCP server and an MCP Apps UI.

The Equidia player remains a normal browser player. HORSEE adds this separate flow:

```text
HORSEE MCP App → exact race command as a ChatGPT message
               → Council analysis in the ChatGPT conversation
               → save_council_result
               → structured verdict in the MCP App and Equidia dashboard
```

No OpenAI API is called by the browser or server, and no OpenAI API key is required. ChatGPT performs the reasoning in the user's conversation. The MCP server only exposes the interface, result tools, and storage.

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
- Deploy Previews use `horsee-council-results-deploy-preview-<REVIEW_ID>`.
- Branch deploys use `horsee-council-results-branch-<BRANCH>`.
- An unrecognized Netlify context fails safe into a non-production namespace containing `DEPLOY_ID`.

This prevents a PR preview or branch deploy from changing the production selection board. Every store retains up to 50 results. Result history is ordered and pruned by the server's receipt time, not the caller-provided `analysed_at` display field. Both storage implementations sit behind `CouncilResultStore`, so the backend can be replaced without changing tool schemas.

Build the site, MCP widget, and both TypeScript targets with:

```bash
npm run build
npm run test:mcp
```

## Endpoints

- Streamable HTTP MCP: `http://localhost:8888/mcp`
- Latest structured result for the Equidia dashboard: `http://localhost:8888/api/council/latest`
- OAuth protected-resource metadata: `http://localhost:8888/.well-known/oauth-protected-resource`
- Production MCP: `https://<your-netlify-domain>/mcp`

The MCP server identity is `horsee-council` version `1.0.0`.

## MCP tools

- `open_horsee_council` — public read-only (`noauth`); returns the latest result and renders `ui://horsee-council/v1.html`
- `save_council_result` — OAuth-protected write; requires `horsee:council:write` and accepts the strict final verdict
- `get_latest_council_result` — public read-only (`noauth`); returns the latest saved verdict
- `get_council_history` — public read-only (`noauth`); returns a newest-first history (maximum 50)

The result schema rejects unknown fields, inconsistent verdicts, and unbounded inputs. Ranking must contain exactly `field_size` unique runners; `most_likely_winner` must exactly match `ranking[0]`; the winner, principal danger, and best value horse must match ranked runners; every probability must be numeric from 0 through 100; and ranking probabilities must total 99.5–100.5%. Confidence is strictly `low`, `medium`, or `high`. A race is limited to 40 runners, horse names to 120 characters, the strongest loss reason to 2,000 characters, and the remaining text fields to documented schema-specific limits.

## Council write authorization

Read tools remain public, but `save_council_result` is never an anonymous production writer. It advertises an OAuth 2.0 `securitySchemes` entry and enforces the same scope at the server. Bearer tokens are verified with the configured identity provider's JWKS for signature, exact issuer, expiry/not-before, HORSEE resource audience, and `horsee:council:write` scope. Invalid bearer tokens receive HTTP `401` with `WWW-Authenticate`; authenticated tokens missing the write scope receive `403`; and a tool call without authorization receives the MCP `mcp/www_authenticate` challenge and cannot reach storage.

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

The authorization server must implement the OAuth 2.1 MCP flow and publish its own OAuth or OIDC discovery metadata. The resource value must be carried into the token's `aud` or `resource` claim. Grant `horsee:council:write` only to approved ChatGPT principals/clients; do not issue it as a general public scope. If the three required variables are absent, partial, or invalid on Netlify, writes are deliberately disabled while public reads continue to work. No OpenAI API key is involved, and no shared write secret is placed in model instructions or tool arguments.

Each successful write creates a server-only audit record alongside the result store. The record contains server receipt time, OAuth client ID, a one-way hash of the subject when present, race ID, and a result hash; it never contains the bearer token or the full verdict. Netlify retains the newest 500 audit records per deployment namespace. Local development writes the equivalent private records to `.netlify/horsee-council-write-audit.json`. Denied request-source and authentication events, plus successful/denied tool writes, are emitted as structured Netlify Function logs for monitoring.

For local Inspector testing only, set `HORSEE_COUNCIL_DEV_WRITE_TOKEN` before starting Netlify Dev. This development bearer token is ignored in every non-`dev` Netlify deployment and is never a production authorization mode.

## Test with MCP Inspector

Start Netlify Dev with an uncommitted local test token, then launch the current Inspector:

```powershell
$env:HORSEE_COUNCIL_DEV_WRITE_TOKEN = "replace-with-a-local-test-token"
npx netlify dev
```

In another terminal, run `npx @modelcontextprotocol/inspector@latest`. Choose Streamable HTTP, connect to `http://localhost:8888/mcp`, and add `Authorization: Bearer replace-with-a-local-test-token` in the Inspector authentication/header settings. Verify initialization, `tools/list`, and calls to all four tools. Call `open_horsee_council` first to inspect the MCP Apps resource and its `text/html;profile=mcp-app` response. Use a complete structured verdict when testing `save_council_result`, then confirm it is returned by both read tools.

Repeat `save_council_result` without the Authorization header and verify that it returns `isError: true`, includes `mcp/www_authenticate`, and does not alter latest/history. Repeat with a malformed verdict to verify schema rejection before storage.

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
5. Create the connection and review the four discovered tools and their annotations.
6. Add HORSEE to a conversation and ask it to open the Council. Enter a command such as `R1C1 hard` in the rendered panel.

`RUN COUNCIL` sends the exact command as a standard MCP Apps `ui/message`. The `window.openai.sendFollowUpMessage` bridge is only a ChatGPT compatibility fallback. Outside a supported host, the button stays disabled and the page states that the Council bridge is offline; stored results may still be viewed.

## Implementation notes

- The app resource uses the stable MCP Apps bridge (`ui/initialize`, tool input/result notifications, `tools/call`, and `ui/message`).
- OAuth is a resource-server boundary only; use an established OAuth 2.1 identity provider rather than implementing an authorization server in this repository.
- `server/generated/horsee-widget.ts` is rebuilt from `mcp-app/horsee-widget.ts` by `npm run build:mcp-widget`; do not edit the generated module directly.
- The full Council analysis belongs in the ChatGPT conversation. Only the strict final verdict is stored.
- No API keys, ChatGPT credentials, or conversation tokens are stored.

Current references: [OpenAI plugin authentication guide](https://developers.openai.com/plugins/build/auth), [OpenAI MCP server guide](https://developers.openai.com/plugins/build/mcp-server), [OpenAI MCP Apps UI guide](https://developers.openai.com/plugins/build/ui), [Netlify build environment variables](https://docs.netlify.com/build/configure-builds/environment-variables/), [Netlify rate limiting](https://www.netlify.com/blog/how-to-rate-limit-ai-features-and-avoid-surprise-costs/), and [MCP Apps specification](https://modelcontextprotocol.io/extensions/apps/overview).
