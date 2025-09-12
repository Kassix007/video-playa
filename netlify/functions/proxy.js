export async function handler(event, context) {
  const target = process.env.PROXY_TARGET;

  try {
    const response = await fetch(`${target}/prog.txt`, {
      headers: { "User-Agent": "video-playa-proxy" },
    });

    const body = await response.text();

    return {
      statusCode: response.status,
      body,
      headers: {
        "Content-Type": "text/plain",
        "Access-Control-Allow-Origin": "*"
      }
    };
  } catch (err) {
    return {
      statusCode: 500,
      body: "Proxy error: " + err.message,
    };
  }
}
