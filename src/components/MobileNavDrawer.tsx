import { useEffect, useRef } from "react";
import { createPortal } from "react-dom";
import { Link } from "react-router-dom";
import type { NavigationItem } from "../config/routes";
import ThemeToggle from "./ThemeToggle";

type MobileNavDrawerProps = {
  activeIndex: number;
  items: readonly NavigationItem[];
  onDismiss: () => void;
  onNavigate: () => void;
  open: boolean;
};

const focusableSelector = [
  "a[href]",
  "button:not([disabled])",
  "input:not([disabled])",
  "select:not([disabled])",
  "textarea:not([disabled])",
  '[tabindex]:not([tabindex="-1"])',
].join(",");

export default function MobileNavDrawer({
  activeIndex,
  items,
  onDismiss,
  onNavigate,
  open,
}: MobileNavDrawerProps) {
  const drawerRef = useRef<HTMLElement>(null);
  const closeButtonRef = useRef<HTMLButtonElement>(null);

  useEffect(() => {
    if (!open) return undefined;

    const previousOverflow = document.body.style.overflow;
    document.body.style.overflow = "hidden";
    const focusFrame = window.requestAnimationFrame(() => closeButtonRef.current?.focus());

    const handleKeyDown = (event: KeyboardEvent) => {
      if (event.key === "Escape") {
        event.preventDefault();
        onDismiss();
        return;
      }

      if (event.key !== "Tab" || !drawerRef.current) return;

      const focusable = Array.from(
        drawerRef.current.querySelectorAll<HTMLElement>(focusableSelector),
      ).filter((element) => element.offsetParent !== null);

      if (focusable.length === 0) return;

      const first = focusable[0];
      const last = focusable[focusable.length - 1];

      if (event.shiftKey && document.activeElement === first) {
        event.preventDefault();
        last?.focus();
      } else if (!event.shiftKey && document.activeElement === last) {
        event.preventDefault();
        first?.focus();
      }
    };

    document.addEventListener("keydown", handleKeyDown);

    return () => {
      window.cancelAnimationFrame(focusFrame);
      document.body.style.overflow = previousOverflow;
      document.removeEventListener("keydown", handleKeyDown);
    };
  }, [onDismiss, open]);

  return createPortal(
    <div className="mobile-nav-layer" data-open={open} aria-hidden={!open}>
      <button
        aria-label="Close navigation menu"
        className="mobile-nav-backdrop"
        onClick={onDismiss}
        tabIndex={open ? 0 : -1}
        type="button"
      />
      <aside
        aria-label="Mobile navigation"
        aria-modal={open ? "true" : undefined}
        className="mobile-nav-drawer"
        id="mobile-navigation"
        ref={drawerRef}
        role="dialog"
      >
        <div className="mobile-nav-head">
          <div className="mobile-nav-title">
            <span aria-hidden="true">Directory</span>
            <strong>Choose your desk</strong>
          </div>
          <button
            aria-label="Close navigation menu"
            className="mobile-nav-close"
            onClick={onDismiss}
            ref={closeButtonRef}
            tabIndex={open ? 0 : -1}
            type="button"
          >
            <span aria-hidden="true" />
            <span aria-hidden="true" />
          </button>
        </div>

        <nav aria-label="Primary navigation" className="mobile-nav-list">
          <p className="mobile-nav-label">On this channel</p>
          <ul>
            {items.map((item, index) => {
              const isActive = activeIndex === index;

              return (
                <li className={isActive ? "active" : undefined} key={item.path}>
                  <Link
                    aria-current={isActive ? "page" : undefined}
                    onClick={onNavigate}
                    tabIndex={open ? 0 : -1}
                    to={item.path}
                  >
                    <span className="mobile-nav-number" aria-hidden="true">
                      {String(index + 1).padStart(2, "0")}
                    </span>
                    <span className="mobile-nav-copy">
                      <strong>{item.label}</strong>
                      <small>{item.description}</small>
                    </span>
                    <span className="mobile-nav-arrow" aria-hidden="true">↗</span>
                  </Link>
                </li>
              );
            })}
          </ul>
        </nav>

        <div className="mobile-nav-appearance">
          <span>Appearance</span>
          <ThemeToggle />
        </div>

        <p className="mobile-nav-signoff">
          <span aria-hidden="true" /> Live links. Zero noise.
        </p>
      </aside>
    </div>,
    document.body,
  );
}
