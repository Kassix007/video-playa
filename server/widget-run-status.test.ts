import assert from "node:assert/strict";
import { describe, it } from "node:test";
import {
  councilRunStatusFrom,
  formatCouncilRunStage,
} from "../mcp-app/council-run-status-view.js";
import { createHorseeWidgetHtml } from "./widget-html.js";

describe("HORSEE widget run status", () => {
  it("reads a current status returned beside the separate latest result", () => {
    const status = {
      command: "R2C5 hard",
      stage: "ANALYSING_RUNNERS" as const,
      message: "Council analysts are evaluating every runner.",
      updated_at: "2026-08-20T15:21:34.000Z",
    };

    assert.deepEqual(councilRunStatusFrom({ result: null, status }), status);
    assert.equal(formatCouncilRunStage(status.stage), "ANALYSING RUNNERS");
  });

  it("keeps the run display structurally separate from the Selection Board", () => {
    const html = createHorseeWidgetHtml();
    const statusIndex = html.indexOf('id="run-status"');
    const resultsIndex = html.indexOf('id="result-list"');

    assert.ok(statusIndex >= 0);
    assert.ok(resultsIndex > statusIndex);
    assert.match(html, /id="run-status-stage"/);
    assert.match(html, /id="run-status-updated"/);
    assert.match(html, />Selection board</);
  });
});
