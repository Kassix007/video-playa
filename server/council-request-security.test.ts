import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  guardCouncilMcpRequest,
  MAX_COUNCIL_REQUEST_BYTES,
} from "./council-request-security.js";

const productionEnvironment = {
  NETLIFY: "true",
  CONTEXT: "production",
  URL: "https://horsee.example",
  HORSEE_MCP_RESOURCE: "https://horsee.example/mcp",
};

describe("HORSEE MCP request boundary", () => {
  it("accepts a server-to-server request on the configured host", async () => {
    const result = await guardCouncilMcpRequest(
      new Request("https://horsee.example/mcp", {
        method: "POST",
        body: "{}",
      }),
      productionEnvironment,
    );

    assert.equal(result.allowed, true);
    if (result.allowed) assert.equal(await result.request.text(), "{}");
  });

  it("rejects an unconfigured request host", async () => {
    const result = await guardCouncilMcpRequest(
      new Request("https://attacker.example/mcp", { method: "POST", body: "{}" }),
      productionEnvironment,
    );

    assert.equal(result.allowed, false);
    if (!result.allowed) assert.equal(result.response.status, 403);
  });

  it("rejects an untrusted browser Origin", async () => {
    const result = await guardCouncilMcpRequest(
      new Request("https://horsee.example/mcp", {
        method: "POST",
        headers: { Origin: "https://attacker.example" },
        body: "{}",
      }),
      productionEnvironment,
    );

    assert.equal(result.allowed, false);
    if (!result.allowed) {
      assert.equal(result.response.status, 403);
      assert.equal(result.reason, "untrusted_origin");
    }
  });

  it("accepts the configured browser Origin", async () => {
    const result = await guardCouncilMcpRequest(
      new Request("https://horsee.example/mcp", {
        method: "POST",
        headers: { Origin: "https://horsee.example" },
        body: "{}",
      }),
      productionEnvironment,
    );

    assert.equal(result.allowed, true);
  });

  it("accepts only the current site's context-bound Deploy Preview host", async () => {
    const previewEnvironment = {
      NETLIFY: "true",
      CONTEXT: "deploy-preview",
      REVIEW_ID: "3",
      URL: "https://horsee.example",
      HORSEE_NETLIFY_SITE_NAME: "video-playa",
    };
    const allowed = await guardCouncilMcpRequest(
      new Request("https://deploy-preview-3--video-playa.netlify.app/mcp", {
        method: "POST",
        body: "{}",
      }),
      previewEnvironment,
    );
    const wrongReview = await guardCouncilMcpRequest(
      new Request("https://deploy-preview-4--video-playa.netlify.app/mcp", {
        method: "POST",
        body: "{}",
      }),
      previewEnvironment,
    );
    const wrongSite = await guardCouncilMcpRequest(
      new Request("https://deploy-preview-3--attacker.netlify.app/mcp", {
        method: "POST",
        body: "{}",
      }),
      previewEnvironment,
    );

    assert.equal(allowed.allowed, true);
    assert.equal(wrongReview.allowed, false);
    assert.equal(wrongSite.allowed, false);
  });

  it("rejects an MCP body above 256 KiB without trusting Content-Length", async () => {
    const result = await guardCouncilMcpRequest(
      new Request("https://horsee.example/mcp", {
        method: "POST",
        body: "x".repeat(MAX_COUNCIL_REQUEST_BYTES + 1),
      }),
      productionEnvironment,
    );

    assert.equal(result.allowed, false);
    if (!result.allowed) assert.equal(result.response.status, 413);
  });
});
