import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  authenticateCouncilRequest,
  createCouncilAuthChallenge,
  createCouncilUnauthorizedResponse,
  getCouncilProtectedResourceMetadata,
  getCouncilWritePolicy,
  resolveCouncilAuthConfig,
} from "./council-auth.js";

describe("Council write authorization", () => {
  it("is fail-closed on Netlify when OAuth is not fully configured", () => {
    const config = resolveCouncilAuthConfig("https://preview.example/mcp", {
      NETLIFY: "true",
      CONTEXT: "deploy-preview",
      HORSEE_COUNCIL_DEV_WRITE_TOKEN: "must-not-enable-production-writes",
    });

    assert.equal(config.mode, "disabled");
    assert.equal(getCouncilWritePolicy(config).enabled, false);
  });

  it("allows an explicitly configured local Inspector bearer token", async () => {
    const config = resolveCouncilAuthConfig("http://localhost:8888/mcp", {
      CONTEXT: "dev",
      HORSEE_COUNCIL_DEV_WRITE_TOKEN: "inspector-test-token",
    });
    const request = new Request("http://localhost:8888/mcp", {
      headers: { Authorization: "Bearer inspector-test-token" },
    });

    const authInfo = await authenticateCouncilRequest(request, config);
    assert.equal(config.mode, "development-token");
    assert.equal(authInfo?.scopes.includes(config.writeScope), true);
    assert.equal(authInfo?.scopes.includes(config.smspariazSessionScope), true);
    assert.equal(authInfo?.scopes.includes(config.smspariazAppBetScope), true);
    assert.equal(authInfo?.resource?.href, "http://localhost:8888/mcp");
  });

  it("rejects an incorrect local Inspector bearer token", async () => {
    const config = resolveCouncilAuthConfig("http://localhost:8888/mcp", {
      CONTEXT: "dev",
      HORSEE_COUNCIL_DEV_WRITE_TOKEN: "inspector-test-token",
    });
    const request = new Request("http://localhost:8888/mcp", {
      headers: { Authorization: "Bearer wrong-token" },
    });

    await assert.rejects(() => authenticateCouncilRequest(request, config));
  });

  it("publishes protected-resource metadata only for a complete OAuth configuration", () => {
    const config = resolveCouncilAuthConfig("https://horsee.example/mcp", {
      NETLIFY: "true",
      CONTEXT: "production",
      HORSEE_MCP_RESOURCE: "https://horsee.example/mcp",
      HORSEE_OAUTH_ISSUER: "https://identity.example/",
      HORSEE_OAUTH_JWKS_URI: "https://identity.example/.well-known/jwks.json",
    });

    assert.equal(config.mode, "oauth");
    assert.deepEqual(getCouncilProtectedResourceMetadata(config), {
      resource: "https://horsee.example/mcp",
      authorization_servers: ["https://identity.example/"],
      scopes_supported: [
        "horsee:council:write",
        "horsee:smspariaz:session",
        "horsee:smspariaz:app-bet",
      ],
      bearer_methods_supported: ["header"],
    });

    assert.equal(
      createCouncilAuthChallenge(
        getCouncilWritePolicy(config),
        "insufficient_scope",
        "Council write access is required.",
      ),
      "Bearer resource_metadata=\"https://horsee.example/.well-known/oauth-protected-resource\", scope=\"horsee:council:write\", error=\"insufficient_scope\", error_description=\"Council write access is required.\"",
    );
  });

  it("uses 401 for invalid tokens and 403 for insufficient scope", () => {
    const config = resolveCouncilAuthConfig("http://localhost:8888/mcp", {
      CONTEXT: "dev",
      HORSEE_COUNCIL_DEV_WRITE_TOKEN: "inspector-test-token",
    });

    assert.equal(
      createCouncilUnauthorizedResponse(config, "Invalid token.", "invalid_token").status,
      401,
    );
    const insufficientScope = createCouncilUnauthorizedResponse(
      config,
      "Council write access is required.",
      "insufficient_scope",
    );
    assert.equal(insufficientScope.status, 403);
    assert.match(insufficientScope.headers.get("www-authenticate") ?? "", /insufficient_scope/);
  });
});
