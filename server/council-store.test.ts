import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { PRODUCTION_STORE_NAME, resolveCouncilStoreName } from "./council-store.js";

describe("Netlify Council store namespaces", () => {
  it("keeps one stable namespace across production deployments", () => {
    const first = resolveCouncilStoreName({
      NETLIFY: "true",
      CONTEXT: "production",
      DEPLOY_ID: "deploy-one",
    });
    const second = resolveCouncilStoreName({
      NETLIFY: "true",
      CONTEXT: "production",
      DEPLOY_ID: "deploy-two",
    });

    assert.equal(first, PRODUCTION_STORE_NAME);
    assert.equal(second, PRODUCTION_STORE_NAME);
  });

  it("isolates Deploy Preview data from production and other previews", () => {
    const production = resolveCouncilStoreName({ NETLIFY: "true", CONTEXT: "production" });
    const previewTwo = resolveCouncilStoreName({
      NETLIFY: "true",
      CONTEXT: "deploy-preview",
      REVIEW_ID: "2",
    });
    const previewThree = resolveCouncilStoreName({
      NETLIFY: "true",
      CONTEXT: "deploy-preview",
      REVIEW_ID: "3",
    });

    assert.notEqual(previewTwo, production);
    assert.notEqual(previewThree, production);
    assert.notEqual(previewTwo, previewThree);
    assert.equal(previewTwo, "horsee-council-results-deploy-preview-2");
  });

  it("isolates branch deploys by branch", () => {
    const branchStore = resolveCouncilStoreName({
      NETLIFY: "true",
      CONTEXT: "branch-deploy",
      BRANCH: "feature/HORSEE auth",
    });

    assert.equal(branchStore, "horsee-council-results-branch-feature-horsee-auth");
    assert.notEqual(branchStore, PRODUCTION_STORE_NAME);
  });
});
