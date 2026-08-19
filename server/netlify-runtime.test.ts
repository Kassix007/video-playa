import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { resolveCouncilStoreName } from "./council-store.js";
import { createCouncilRuntimeEnvironment } from "./netlify-runtime.js";

describe("Netlify Council runtime context", () => {
  it("uses invocation context to isolate a Deploy Preview", () => {
    const environment = createCouncilRuntimeEnvironment(
      {
        deploy: { context: "deploy-preview", id: "preview-deploy-id", published: false },
        site: {
          id: "site-id",
          name: "video-playa",
          url: "https://video-playa.netlify.app",
        },
      },
      {},
    );

    assert.equal(environment.CONTEXT, "deploy-preview");
    assert.equal(environment.DEPLOY_ID, "preview-deploy-id");
    assert.equal(environment.HORSEE_NETLIFY_SITE_NAME, "video-playa");
    assert.equal(
      resolveCouncilStoreName(environment),
      "horsee-council-results-deploy-preview-preview-deploy-id",
    );
  });

  it("keeps the production namespace stable across invocation deploy IDs", () => {
    const first = createCouncilRuntimeEnvironment(
      { deploy: { context: "production", id: "production-one", published: true } },
      {},
    );
    const second = createCouncilRuntimeEnvironment(
      { deploy: { context: "production", id: "production-two", published: true } },
      {},
    );

    assert.equal(resolveCouncilStoreName(first), "horsee-council-results-production");
    assert.equal(resolveCouncilStoreName(second), "horsee-council-results-production");
  });
});
