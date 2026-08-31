import assert from "node:assert/strict";
import { describe, it } from "node:test";
import { GitHubArchiveClient, GitHubArchiveError } from "./github-archive-client.js";

function jsonResponse(value: unknown, status = 200): Response {
  return Response.json(value, { status });
}

describe("GitHub archive Contents client", () => {
  it("creates a missing file and sends the required versioned headers", async () => {
    const requests: Request[] = [];
    const client = new GitHubArchiveClient({
      owner: "owner", token: "secret-token", apiVersion: "2022-11-28", timeoutMs: 1_000,
      fetchImpl: async (input, init) => {
        const request = new Request(input, init); requests.push(request);
        return request.method === "GET"
          ? jsonResponse({ message: "Not Found" }, 404)
          : jsonResponse({ content: { sha: "created-sha" } }, 201);
      },
    });
    const result = await client.upsertFile("archive-2026", "results/2026/08/day.ndjson", "hello\n", "Archive day");
    assert.equal(result.status, "CREATED");
    assert.equal(requests.length, 2);
    assert.equal(requests[1].headers.get("authorization"), "Bearer secret-token");
    assert.equal(requests[1].headers.get("x-github-api-version"), "2022-11-28");
  });

  it("updates an existing file with its GitHub blob sha", async () => {
    const putBodies: Array<Record<string, unknown>> = [];
    const client = new GitHubArchiveClient({
      owner: "owner", token: "secret-token", apiVersion: "2022-11-28", timeoutMs: 1_000,
      fetchImpl: async (input, init) => {
        const request = new Request(input, init);
        if (request.method === "GET") return jsonResponse({ sha: "old-sha", encoding: "base64", content: Buffer.from("old").toString("base64") });
        putBodies.push(await request.json() as Record<string, unknown>);
        return jsonResponse({ content: { sha: "new-sha" } });
      },
    });
    const result = await client.upsertFile("archive-2026", "file", "new", "Update");
    assert.equal(result.status, "UPDATED");
    assert.equal(putBodies[0]?.sha, "old-sha");
  });

  it("does not write identical bytes", async () => {
    let requests = 0;
    const client = new GitHubArchiveClient({
      owner: "owner", token: "secret-token", apiVersion: "2022-11-28", timeoutMs: 1_000,
      fetchImpl: async () => {
        requests += 1;
        return jsonResponse({ sha: "same-sha", encoding: "base64", content: Buffer.from("same").toString("base64") });
      },
    });
    assert.equal((await client.upsertFile("archive-2026", "file", "same", "No-op")).status, "UNCHANGED");
    assert.equal(requests, 1);
  });

  it("retries one conflict with a fresh read", async () => {
    const responses = [
      jsonResponse({ sha: "old", encoding: "base64", content: Buffer.from("old").toString("base64") }),
      jsonResponse({ message: "Conflict" }, 409),
      jsonResponse({ sha: "newer", encoding: "base64", content: Buffer.from("other").toString("base64") }),
      jsonResponse({ content: { sha: "final" } }),
    ];
    const client = new GitHubArchiveClient({
      owner: "owner", token: "secret-token", apiVersion: "2022-11-28", timeoutMs: 1_000,
      fetchImpl: async () => responses.shift() ?? jsonResponse({}, 500),
    });
    assert.equal((await client.upsertFile("archive-2026", "file", "target", "Retry")).sha, "final");
  });

  for (const status of [422, 429, 500]) {
    it(`returns a structured sanitized error for ${status}`, async () => {
      const client = new GitHubArchiveClient({
        owner: "owner", token: "secret-token", apiVersion: "2022-11-28", timeoutMs: 1_000,
        fetchImpl: async (input, init) => new Request(input, init).method === "GET"
          ? jsonResponse({ message: "Not Found" }, 404)
          : jsonResponse({ message: `secret-token provider failure ${status}` }, status),
      });
      await assert.rejects(
        () => client.upsertFile("archive-2026", "file", "content", "Failure"),
        (error: unknown) => error instanceof GitHubArchiveError
          && error.status === status
          && !error.message.includes("secret-token"),
      );
    });
  }

  it("requires a token for writes but permits token-free public reads", async () => {
    const client = new GitHubArchiveClient({
      owner: "owner", apiVersion: "2022-11-28", timeoutMs: 1_000,
      fetchImpl: async () => jsonResponse({ message: "Not Found" }, 404),
    });
    assert.equal(await client.getFile("public-archive", "missing"), null);
    await assert.rejects(() => client.upsertFile("public-archive", "file", "x", "write"), /not configured/i);
  });

  it("omits a configured token for an explicit public read", async () => {
    let request: Request | undefined;
    const client = new GitHubArchiveClient({
      owner: "owner", token: "secret-token", apiVersion: "2022-11-28", timeoutMs: 1_000,
      fetchImpl: async (input, init) => {
        request = new Request(input, init);
        return jsonResponse({ message: "Not Found" }, 404);
      },
    });
    assert.equal(await client.getFile("public-archive", "missing", { authenticate: false }), null);
    assert.equal(request?.headers.get("authorization"), null);
  });

  it("aborts a timed-out request and returns a retryable sanitized timeout", async () => {
    const client = new GitHubArchiveClient({
      owner: "owner", token: "secret-token", apiVersion: "2022-11-28", timeoutMs: 5,
      fetchImpl: async (_input, init) => new Promise<Response>((_resolve, reject) => {
        init?.signal?.addEventListener("abort", () => reject(new DOMException("secret-token", "AbortError")), { once: true });
      }),
    });
    await assert.rejects(
      () => client.getFile("archive-2026", "file"),
      (error: unknown) => error instanceof GitHubArchiveError
        && error.code === "GITHUB_TIMEOUT"
        && error.retryable
        && !error.message.includes("secret-token"),
    );
  });
});
