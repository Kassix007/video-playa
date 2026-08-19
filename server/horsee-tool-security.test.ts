import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { decorateHorseeToolSecuritySchemes } from "./horsee-tool-security.js";

describe("HORSEE tool securitySchemes", () => {
  it("marks only save_council_result as OAuth-protected", () => {
    const payload = {
      result: {
        tools: [
          { name: "get_latest_council_result", _meta: {} },
          { name: "save_council_result", _meta: {} },
        ],
      },
    };

    decorateHorseeToolSecuritySchemes(payload, "horsee:council:write");
    const tools = payload.result.tools as Array<Record<string, unknown>>;
    const writeMeta = tools[1]._meta as Record<string, unknown>;

    assert.deepEqual(tools[0].securitySchemes, [{ type: "noauth" }]);
    assert.deepEqual(tools[1].securitySchemes, [
      { type: "oauth2", scopes: ["horsee:council:write"] },
    ]);
    assert.deepEqual(writeMeta.securitySchemes, [
      { type: "oauth2", scopes: ["horsee:council:write"] },
    ]);
  });
});
