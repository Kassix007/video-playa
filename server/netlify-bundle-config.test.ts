import assert from "node:assert/strict";
import { readFile } from "node:fs/promises";
import { describe, it } from "node:test";

describe("Netlify MCP bundle configuration", () => {
  it("includes the PDF.js worker required by the racecard parser", async () => {
    const config = await readFile(new URL("../netlify.toml", import.meta.url), "utf8");
    const mcpFunction = config.match(/\[functions\.mcp\]([\s\S]*?)(?=\r?\n\[|$)/);

    assert.ok(mcpFunction, "netlify.toml must define an MCP function section");
    assert.match(
      mcpFunction[1],
      /included_files\s*=\s*\[[^\]]*node_modules\/pdfjs-dist\/legacy\/build\/pdf\.worker\.mjs[^\]]*\]/,
    );
  });

  it("does not externalize a host-native canvas binding for the Linux function runtime", async () => {
    const config = await readFile(new URL("../netlify.toml", import.meta.url), "utf8");
    const source = await readFile(new URL("./smspariaz-racecard.ts", import.meta.url), "utf8");
    const mcpFunction = config.match(/\[functions\.mcp\]([\s\S]*?)(?=\r?\n\[|$)/);

    assert.ok(mcpFunction, "netlify.toml must define an MCP function section");
    assert.doesNotMatch(mcpFunction[1], /@napi-rs\/canvas/);
    assert.doesNotMatch(source, /import\(["']@napi-rs\/canvas["']\)/);
  });
});
