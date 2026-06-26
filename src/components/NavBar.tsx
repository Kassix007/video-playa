import { useLocation } from "react-router-dom";
import GooeyNav, { type GooeyNavItem } from "./GooeyNav";

const navItems: GooeyNavItem[] = [
  { label: "Home", to: "/" },
  { label: "About", to: "/about" },
];

export default function NavBar() {
  const { pathname } = useLocation();
  const activeIndex = Math.max(
    navItems.findIndex((item) => item.to === pathname),
    0,
  );

  return (
    <header className="navbar" role="banner" aria-label="Main Navigation">
      <div className="container nav-inner">
        <div className="brand">
          <a href="#/">Video Playa</a>
        </div>
        <GooeyNav
          items={navItems}
          activeIndex={activeIndex}
          particleCount={14}
          particleDistances={[54, 8]}
          particleR={80}
          animationTime={500}
          timeVariance={220}
        />
      </div>
    </header>
  );
}
