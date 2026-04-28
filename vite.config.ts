import { defineConfig, loadEnv } from "vite";
import react from "@vitejs/plugin-react";

export default defineConfig(({ mode }) => {
  const env = loadEnv(mode, process.cwd(), "");
  const target = env.PROXY_TARGET || "https://example.com";

  return {
    plugins: [react()],
    base: "/",  // 👈 must match repo name on GitHub Pages
    server: {
      proxy: {
        "/prog.txt": {
          target,
          changeOrigin: true,
          secure: false,
        },
      },
    },
  };
});
