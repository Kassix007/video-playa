import { defineConfig, loadEnv } from "vite";
import react from "@vitejs/plugin-react";

export default defineConfig(({ mode }) => {
  const env = loadEnv(mode, process.cwd(), ""); // loads PROXY_TARGET but won't expose to client
  const target = env.PROXY_TARGET || "https://example.com"; // safe default

  return {
    plugins: [react()],
    base: "/video-playa/", // keep for GitHub Pages
    server: {
      proxy: {
        "/prog.txt": {
          target,
          changeOrigin: true,
          secure: false, // dev only: allow self-signed if you use https locally
          // optional: rewrite if target path differs
          // rewrite: (path) => path.replace(/^\/prog\.txt$/, "/prog.txt"),
        },
      },
    },
  };
});
