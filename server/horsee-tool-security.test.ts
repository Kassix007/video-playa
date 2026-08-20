import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { decorateHorseeToolSecuritySchemes } from "./horsee-tool-security.js";
import {
  CHECK_COUNCIL_WRITE_ACCESS_ANNOTATIONS,
  SAVE_COUNCIL_RESULT_ANNOTATIONS,
  UPDATE_COUNCIL_RUN_STATUS_ANNOTATIONS,
} from "./horsee-mcp.js";

describe("HORSEE tool securitySchemes", () => {
  it("marks all privileged Council tools as OAuth-protected", () => {
    const payload = {
      result: {
        tools: [
          { name: "get_latest_council_result", _meta: {} },
          { name: "check_council_write_access", _meta: {} },
          { name: "update_council_run_status", _meta: {} },
          { name: "save_council_result", _meta: {} },
        ],
      },
    };

    decorateHorseeToolSecuritySchemes(payload, "horsee:council:write");
    const tools = payload.result.tools as Array<Record<string, unknown>>;

    assert.deepEqual(tools[0].securitySchemes, [{ type: "noauth" }]);
    for (const tool of tools.slice(1)) {
      assert.deepEqual(tool.securitySchemes, [
        { type: "oauth2", scopes: ["horsee:council:write"] },
      ]);
      assert.deepEqual((tool._meta as Record<string, unknown>).securitySchemes, [
        { type: "oauth2", scopes: ["horsee:council:write"] },
      ]);
    }
  });

  it("marks the OAuth diagnostic as read-only and closed-world", () => {
    assert.deepEqual(CHECK_COUNCIL_WRITE_ACCESS_ANNOTATIONS, {
      readOnlyHint: true,
      destructiveHint: false,
      idempotentHint: true,
      openWorldHint: false,
    });
  });

  it("marks run-status updates as idempotent external progress writes", () => {
    assert.deepEqual(UPDATE_COUNCIL_RUN_STATUS_ANNOTATIONS, {
      readOnlyHint: false,
      destructiveHint: false,
      idempotentHint: true,
      openWorldHint: true,
    });
  });

  it("marks publishing a Council result as an external destructive write", () => {
    assert.deepEqual(SAVE_COUNCIL_RESULT_ANNOTATIONS, {
      readOnlyHint: false,
      destructiveHint: true,
      idempotentHint: false,
      openWorldHint: true,
    });
  });
});
