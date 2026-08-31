export type GitHubFetch = (
  input: string | URL | Request,
  init?: RequestInit,
) => Promise<Response>;

export interface GitHubArchiveFile {
  path: string;
  sha: string;
  content: string;
}

export type GitHubArchiveWriteResult = {
  status: "CREATED" | "UPDATED" | "UNCHANGED";
  repository: string;
  path: string;
  sha: string;
};

export class GitHubArchiveError extends Error {
  constructor(
    readonly code: string,
    message: string,
    readonly status?: number,
    readonly retryable = false,
  ) {
    super(message);
    this.name = "GitHubArchiveError";
  }
}

export interface GitHubArchiveClientOptions {
  owner: string;
  token?: string;
  apiVersion: string;
  timeoutMs: number;
  fetchImpl?: GitHubFetch;
}

export interface GitHubArchiveReadOptions {
  /** Public archive reads must not consume credentials reserved for archive operations. */
  authenticate?: boolean;
}

function encodedPath(value: string): string {
  return value.split("/").map(encodeURIComponent).join("/");
}

function classifyError(status: number): GitHubArchiveError {
  if (status === 409) return new GitHubArchiveError("GITHUB_CONFLICT", "GitHub archive content changed concurrently.", status, true);
  if (status === 422) return new GitHubArchiveError("GITHUB_VALIDATION_FAILED", "GitHub rejected the archive content update.", status, false);
  if (status === 429) return new GitHubArchiveError("GITHUB_RATE_LIMITED", "GitHub archive requests are temporarily rate-limited.", status, true);
  if (status >= 500) return new GitHubArchiveError("GITHUB_UNAVAILABLE", "GitHub archive service is temporarily unavailable.", status, true);
  if (status === 404) return new GitHubArchiveError("GITHUB_NOT_FOUND", "GitHub archive repository or path was not found.", status, false);
  return new GitHubArchiveError("GITHUB_REQUEST_FAILED", "GitHub archive request failed.", status, false);
}

export class GitHubArchiveClient {
  private readonly fetchImpl: GitHubFetch;

  constructor(private readonly options: GitHubArchiveClientOptions) {
    this.fetchImpl = options.fetchImpl ?? fetch;
  }

  private url(repository: string, path: string): string {
    return `https://api.github.com/repos/${encodeURIComponent(this.options.owner)}/${encodeURIComponent(repository)}/contents/${encodedPath(path)}`;
  }

  private headers(includeAuthorization = true): Headers {
    const headers = new Headers({
      Accept: "application/vnd.github+json",
      "X-GitHub-Api-Version": this.options.apiVersion,
      "User-Agent": "video-playa-horsee-archive",
    });
    if (includeAuthorization && this.options.token) headers.set("Authorization", `Bearer ${this.options.token}`);
    return headers;
  }

  private async request(url: string, init: RequestInit): Promise<Response> {
    const controller = new AbortController();
    const timeout = setTimeout(() => controller.abort(), this.options.timeoutMs);
    try {
      return await this.fetchImpl(url, { ...init, signal: controller.signal });
    } catch (error) {
      if (controller.signal.aborted) {
        throw new GitHubArchiveError("GITHUB_TIMEOUT", "GitHub archive request timed out.", undefined, true);
      }
      throw new GitHubArchiveError(
        "GITHUB_NETWORK_FAILED",
        error instanceof Error && error.name === "AbortError"
          ? "GitHub archive request timed out."
          : "GitHub archive request could not be completed.",
        undefined,
        true,
      );
    } finally {
      clearTimeout(timeout);
    }
  }

  async getFile(
    repository: string,
    path: string,
    options: GitHubArchiveReadOptions = {},
  ): Promise<GitHubArchiveFile | null> {
    const response = await this.request(this.url(repository, path), {
      method: "GET",
      headers: this.headers(options.authenticate ?? Boolean(this.options.token)),
    });
    if (response.status === 404) return null;
    if (!response.ok) throw classifyError(response.status);
    const value = await response.json() as unknown;
    if (!value || typeof value !== "object") {
      throw new GitHubArchiveError("GITHUB_INVALID_RESPONSE", "GitHub returned an invalid archive response.");
    }
    const object = value as Record<string, unknown>;
    if (typeof object.sha !== "string" || typeof object.content !== "string" || object.encoding !== "base64") {
      throw new GitHubArchiveError("GITHUB_INVALID_RESPONSE", "GitHub returned incomplete archive file metadata.");
    }
    return {
      path,
      sha: object.sha,
      content: Buffer.from(object.content.replace(/\s+/g, ""), "base64").toString("utf8"),
    };
  }

  async upsertFile(
    repository: string,
    path: string,
    content: string,
    message: string,
  ): Promise<GitHubArchiveWriteResult> {
    if (!this.options.token) {
      throw new GitHubArchiveError("GITHUB_NOT_CONFIGURED", "GitHub archive writes are not configured.");
    }

    let lastError: GitHubArchiveError | null = null;
    for (let attempt = 0; attempt < 2; attempt += 1) {
      const existing = await this.getFile(repository, path);
      if (existing?.content === content) {
        return { status: "UNCHANGED", repository, path, sha: existing.sha };
      }

      const body: Record<string, unknown> = {
        message,
        content: Buffer.from(content, "utf8").toString("base64"),
      };
      if (existing) body.sha = existing.sha;
      const response = await this.request(this.url(repository, path), {
        method: "PUT",
        headers: new Headers({ ...Object.fromEntries(this.headers()), "Content-Type": "application/json" }),
        body: JSON.stringify(body),
      });
      if (response.ok && [200, 201].includes(response.status)) {
        const value = await response.json() as { content?: { sha?: unknown } };
        if (typeof value.content?.sha !== "string") {
          throw new GitHubArchiveError("GITHUB_INVALID_RESPONSE", "GitHub did not confirm the archive file SHA.");
        }
        return {
          status: existing ? "UPDATED" : "CREATED",
          repository,
          path,
          sha: value.content.sha,
        };
      }

      lastError = classifyError(response.status);
      if (!lastError.retryable || attempt === 1) throw lastError;
    }
    throw lastError ?? new GitHubArchiveError("GITHUB_REQUEST_FAILED", "GitHub archive request failed.");
  }
}
