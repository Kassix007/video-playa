import { defineConfig, loadEnv, type Plugin } from "vite";
import react from "@vitejs/plugin-react";

function resolveProgUrl(target: string) {
  return target.endsWith(".txt") ? target : `${target.replace(/\/$/, "")}/prog.txt`;
}

function progTxtDevProxy(target: string): Plugin {
  const progUrl = resolveProgUrl(target);

  return {
    name: "prog-txt-dev-proxy",
    configureServer(server) {
      server.middlewares.use("/prog.txt", async (_req, res) => {
        try {
          const response = await fetch(progUrl, {
            headers: { "User-Agent": "video-playa-dev-proxy" },
            redirect: "follow",
          });
          const body = await response.text();

          res.statusCode = response.status;
          res.setHeader("Content-Type", response.headers.get("content-type") || "text/plain; charset=utf-8");
          res.setHeader("Cache-Control", "no-store");
          res.end(body);
        } catch (error) {
          const message = error instanceof Error ? error.message : "Unknown error";

          res.statusCode = 502;
          res.setHeader("Content-Type", "text/plain; charset=utf-8");
          res.end(`Proxy error: ${message}`);
        }
      });
    },
  };
}

export default defineConfig(({ mode }) => {
  const env = loadEnv(mode, process.cwd(), "");
  const target = env.PROXY_TARGET || "https://example.com";

  return {
    plugins: [progTxtDevProxy(target), react()],
    base: "/",
  };
});
