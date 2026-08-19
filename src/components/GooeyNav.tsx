import { useCallback, useLayoutEffect, useRef, useState } from "react";
import { Link } from "react-router-dom";
import type { NavigationItem } from "../config/routes";
import "./GooeyNav.css";

type IndicatorGeometry = {
  height: number;
  left: number;
  top: number;
  width: number;
};

type GooeyNavProps = {
  items: readonly NavigationItem[];
  activeIndex: number;
  ariaLabel?: string;
};

const hiddenIndicator: IndicatorGeometry = { height: 0, left: 0, top: 0, width: 0 };

export default function GooeyNav({
  items,
  activeIndex,
  ariaLabel = "Primary navigation",
}: GooeyNavProps) {
  const navRef = useRef<HTMLElement>(null);
  const itemRefs = useRef<Array<HTMLLIElement | null>>([]);
  const [indicator, setIndicator] = useState<IndicatorGeometry>(hiddenIndicator);
  const [indicatorReady, setIndicatorReady] = useState(false);

  const measureIndicator = useCallback(() => {
    const nav = navRef.current;
    const activeItem = itemRefs.current[activeIndex];

    if (!nav || !activeItem) {
      setIndicatorReady(false);
      return;
    }

    const navRect = nav.getBoundingClientRect();
    const itemRect = activeItem.getBoundingClientRect();

    setIndicator({
      height: itemRect.height,
      left: itemRect.left - navRect.left + nav.scrollLeft,
      top: itemRect.top - navRect.top + nav.scrollTop,
      width: itemRect.width,
    });
    setIndicatorReady(true);
  }, [activeIndex]);

  useLayoutEffect(() => {
    measureIndicator();

    const nav = navRef.current;
    if (!nav) return undefined;

    const activeItem = itemRefs.current[activeIndex];
    if (activeItem) {
      const reducedMotion = window.matchMedia("(prefers-reduced-motion: reduce)").matches;
      const targetLeft = activeItem.offsetLeft - (nav.clientWidth - activeItem.offsetWidth) / 2;
      nav.scrollTo({ left: Math.max(0, targetLeft), behavior: reducedMotion ? "auto" : "smooth" });
    }

    if (typeof ResizeObserver === "undefined") {
      window.addEventListener("resize", measureIndicator);
      return () => window.removeEventListener("resize", measureIndicator);
    }

    const observer = new ResizeObserver(measureIndicator);
    observer.observe(nav);
    if (activeItem) observer.observe(activeItem);

    return () => observer.disconnect();
  }, [activeIndex, items.length, measureIndicator]);

  return (
    <nav className="gooey-nav" aria-label={ariaLabel} ref={navRef}>
      <span
        aria-hidden="true"
        className="gooey-nav-indicator"
        data-ready={indicatorReady}
        style={{
          height: indicator.height,
          transform: `translate3d(${indicator.left}px, ${indicator.top}px, 0)`,
          width: indicator.width,
        }}
      />
      <ul>
        {items.map((item, index) => {
          const isActive = activeIndex === index;

          return (
            <li
              className={isActive ? "active" : undefined}
              key={item.path}
              ref={(element) => {
                itemRefs.current[index] = element;
              }}
            >
              <Link to={item.path} aria-current={isActive ? "page" : undefined}>
                {item.label}
              </Link>
            </li>
          );
        })}
      </ul>
    </nav>
  );
}
