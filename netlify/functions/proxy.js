function resolveProgUrl(target) {
  return target.endsWith(".txt") ? target : `${target.replace(/\/$/, "")}/prog.txt`;
}

export async function handler() {
  const target = process.env.PROXY_TARGET;

  if (!target) {
    return {
      statusCode: 500,
      body: "Proxy error: PROXY_TARGET is not configured.",
    };
  }

  try {
    const response = await fetch(resolveProgUrl(target), {
      headers: { "User-Agent": "video-playa-proxy" },
      redirect: "follow",
    });
    const body = await response.text();

    return {
      statusCode: response.status,
      body,
      headers: {
        "Content-Type": response.headers.get("content-type") || "text/plain; charset=utf-8",
        "Access-Control-Allow-Origin": "*",
        "Cache-Control": "no-store",
      },
    };
  } catch (err) {
    return {
      statusCode: 500,
      body: `Proxy error: ${err instanceof Error ? err.message : "Unknown error"}`,
    };
  }
}
