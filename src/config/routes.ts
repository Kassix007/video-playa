import type { ComponentType } from "react";
import About from "../pages/About";
import Equidia from "../pages/Equidia";
import Home from "../pages/Home";
import Iptv from "../pages/Iptv";
import Player from "../pages/Player";

export type AppRoute = {
  path: string;
  label: string;
  description: string;
  Component: ComponentType;
};

export type NavigationItem = Pick<AppRoute, "path" | "label" | "description">;

export const appRoutes = [
  {
    path: "/",
    label: "Home",
    description: "Live fixtures and direct playback links",
    Component: Home,
  },
  {
    path: "/iptv",
    label: "IPTV",
    description: "Browse public channels and tune them locally",
    Component: Iptv,
  },
  {
    path: "/equidia",
    label: "Equidia",
    description: "Open the dedicated French racing channel desk",
    Component: Equidia,
  },
  {
    path: "/player",
    label: "Player",
    description: "Test your own HLS, DASH, or media URL",
    Component: Player,
  },
  {
    path: "/about",
    label: "About",
    description: "How this distraction-light stream desk works",
    Component: About,
  },
] satisfies readonly AppRoute[];

export const primaryNavigation: readonly NavigationItem[] = appRoutes.map(
  ({ path, label, description }) => ({ path, label, description }),
);

export function getActiveRouteIndex(pathname: string): number {
  return appRoutes.findIndex(({ path }) =>
    path === "/" ? pathname === path : pathname === path || pathname.startsWith(`${path}/`),
  );
}
