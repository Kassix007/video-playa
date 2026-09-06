import React from "react";
import ReactDOM from "react-dom/client";
import { HashRouter, Navigate, Routes, Route } from "react-router-dom";
import { HelmetProvider } from "react-helmet-async";
import AppLayout from "./layouts/AppLayout";
import { appRoutes } from "./config/routes";
import { ThemeProvider } from "./theme/ThemeProvider";
import Peakpool from "./pages/Peakpool";
import { completeSupabaseOAuthCodeCallback, isSupabaseOAuthCallbackHash } from "./lib/supabase";
import "./index.css";

function RouteFallback() {
  return isSupabaseOAuthCallbackHash(window.location.hash)
    ? <Peakpool />
    : <Navigate replace to="/" />;
}

async function renderApplication() {
  await completeSupabaseOAuthCodeCallback();
  ReactDOM.createRoot(document.getElementById("root")!).render(
    <React.StrictMode>
      <HelmetProvider>
        <ThemeProvider>
          <HashRouter>
            <Routes>
              <Route element={<AppLayout />}>
                {appRoutes.map(({ path, Component }) => (
                  <Route key={path} path={path} element={<Component />} />
                ))}
                <Route path="*" element={<RouteFallback />} />
              </Route>
            </Routes>
          </HashRouter>
        </ThemeProvider>
      </HelmetProvider>
    </React.StrictMode>,
  );
}

void renderApplication();
