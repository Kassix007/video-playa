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

Local Council results are stored in `.netlify/horsee-council-results.json`, which is gitignored. Production uses the site-wide `horsee-council-results` Netlify Blobs store and retains up to 50 results. Both implementations sit behind `CouncilResultStore`, so the backend can be replaced without changing tool schemas.

Build the site, MCP widget, and both TypeScript targets with:

```bash
npm run build
```

## Endpoints

- Streamable HTTP MCP: `http://localhost:8888/mcp`
- Latest structured result for the Equidia dashboard: `http://localhost:8888/api/council/latest`
- Production MCP: `https://<your-netlify-domain>/mcp`

The MCP server identity is `horsee-council` version `1.0.0`.

## MCP tools

- `open_horsee_council` — read-only; returns the latest result and renders `ui://horsee-council/v1.html`
- `save_council_result` — write, non-destructive; accepts the strict final verdict
- `get_latest_council_result` — read-only; returns the latest saved verdict
- `get_council_history` — read-only; returns a newest-first history (maximum 50)

Horse probabilities are numeric percentages from 0 through 100. Confidence is strictly `low`, `medium`, or `high`. Unknown fields are rejected at every object level.

## Test with MCP Inspector

Start `npx netlify dev`, then launch the current Inspector:

```bash
npx @modelcontextprotocol/inspector@latest
```

Choose Streamable HTTP and connect to `http://localhost:8888/mcp`. Verify initialization, `tools/list`, and calls to all four tools. Call `open_horsee_council` first to inspect the MCP Apps resource and its `text/html;profile=mcp-app` response. Use a complete structured verdict when testing `save_council_result`, then confirm it is returned by both read tools.

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
- `server/generated/horsee-widget.ts` is rebuilt from `mcp-app/horsee-widget.ts` by `npm run build:mcp-widget`; do not edit the generated module directly.
- The full Council analysis belongs in the ChatGPT conversation. Only the strict final verdict is stored.
- No API keys, ChatGPT credentials, or conversation tokens are stored.

Current references: [OpenAI MCP server guide](https://developers.openai.com/plugins/build/mcp-server), [OpenAI MCP Apps UI guide](https://developers.openai.com/plugins/build/chatgpt-ui), [OpenAI connection/testing guide](https://developers.openai.com/plugins/deploy/connect-chatgpt), and [MCP Apps specification](https://modelcontextprotocol.io/extensions/apps/overview).
