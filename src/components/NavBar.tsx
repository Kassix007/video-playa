import { useCallback, useEffect, useRef, useState } from "react";
import { Link, useLocation } from "react-router-dom";
import { getActiveRouteIndex, primaryNavigation } from "../config/routes";
import GooeyNav from "./GooeyNav";
import MobileNavDrawer from "./MobileNavDrawer";
import ThemeToggle from "./ThemeToggle";

export default function NavBar() {
  const { pathname } = useLocation();
  const [menuOpen, setMenuOpen] = useState(false);
  const menuButtonRef = useRef<HTMLButtonElement>(null);
  const activeIndex = getActiveRouteIndex(pathname);

  const closeMenu = useCallback((restoreFocus = true) => {
    setMenuOpen(false);
    if (restoreFocus) {
      window.requestAnimationFrame(() => menuButtonRef.current?.focus());
    }
  }, []);

  useEffect(() => {
    const desktopQuery = window.matchMedia("(min-width: 941px)");
    const handleDesktopChange = (event: MediaQueryListEvent) => {
      if (event.matches) setMenuOpen(false);
    };

    desktopQuery.addEventListener("change", handleDesktopChange);
    return () => desktopQuery.removeEventListener("change", handleDesktopChange);
  }, []);

  return (
    <>
      <header className="navbar" role="banner">
        <div className="container nav-inner">
          <Link className="brand-link" to="/" aria-label="Video Playa home">
            <span className="brand-mark" aria-hidden="true">VP</span>
            <span className="brand-copy">
              <span className="brand-name">Video Playa</span>
              <span className="brand-kicker"><span className="live-dot" /> Independent stream desk</span>
            </span>
          </Link>

          <div className="nav-primary">
            <GooeyNav items={primaryNavigation} activeIndex={activeIndex} />
          </div>

          <div className="nav-utilities"><ThemeToggle /></div>

          <button
            aria-controls="mobile-navigation"
            aria-expanded={menuOpen}
            aria-label={menuOpen ? "Close navigation menu" : "Open navigation menu"}
            className="menu-toggle"
            onClick={() => setMenuOpen((current) => !current)}
            ref={menuButtonRef}
            type="button"
          >
            <span className="menu-toggle-label" aria-hidden="true">Menu</span>
            <span className="menu-toggle-lines" aria-hidden="true">
              <span />
              <span />
            </span>
          </button>
        </div>
      </header>

      <MobileNavDrawer
        activeIndex={activeIndex}
        items={primaryNavigation}
        onDismiss={closeMenu}
        onNavigate={() => closeMenu(false)}
        open={menuOpen}
      />
    </>
  );
}
