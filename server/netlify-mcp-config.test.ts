import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { config } from "../netlify/functions/mcp.js";

describe("Netlify MCP route security", () => {
  it("exposes only the custom rate-limited MCP route", () => {
    assert.deepEqual(config, {
      path: "/mcp",
      rateLimit: {
        windowLimit: 120,
        windowSize: 60,
        aggregateBy: ["ip", "domain"],
      },
    });
  });
});
