import { useCallback, useEffect, useRef, useState } from "react";
import { Link } from "react-router-dom";
import "./GooeyNav.css";

export type GooeyNavItem = {
  label: string;
  to: string;
};

type GooeyNavProps = {
  items: GooeyNavItem[];
  activeIndex?: number;
  animationTime?: number;
  particleCount?: number;
  particleDistances?: [number, number];
  particleR?: number;
  timeVariance?: number;
  colors?: number[];
  ariaLabel?: string;
};

type ParticleConfig = {
  start: [number, number];
  end: [number, number];
  time: number;
  scale: number;
  color: number;
  rotate: number;
};

const DEFAULT_COLORS = [1, 2, 3, 1, 2, 3, 1, 4];

export default function GooeyNav({
  items,
  activeIndex = 0,
  animationTime = 600,
  particleCount = 15,
  particleDistances = [90, 10],
  particleR = 100,
  timeVariance = 300,
  colors = DEFAULT_COLORS,
  ariaLabel = "Primary",
}: GooeyNavProps) {
  const containerRef = useRef<HTMLDivElement>(null);
  const listRef = useRef<HTMLUListElement>(null);
  const filterRef = useRef<HTMLSpanElement>(null);
  const textRef = useRef<HTMLSpanElement>(null);
  const timeoutRefs = useRef<number[]>([]);
  const [selectedIndex, setSelectedIndex] = useState(activeIndex);

  const clearTimers = useCallback(() => {
    timeoutRefs.current.forEach(window.clearTimeout);
    timeoutRefs.current = [];
  }, []);

  const noise = useCallback((value = 1) => value / 2 - Math.random() * value, []);

  const getXY = useCallback(
    (distance: number, pointIndex: number, totalPoints: number): [number, number] => {
      const angle = ((360 + noise(8)) / totalPoints) * pointIndex * (Math.PI / 180);
      return [distance * Math.cos(angle), distance * Math.sin(angle)];
    },
    [noise],
  );

  const createParticle = useCallback(
    (index: number, time: number): ParticleConfig => {
      const rotate = noise(particleR / 10);

      return {
        start: getXY(particleDistances[0], particleCount - index, particleCount),
        end: getXY(particleDistances[1] + noise(7), particleCount - index, particleCount),
        time,
        scale: 1 + noise(0.2),
        color: colors[Math.floor(Math.random() * colors.length)] ?? colors[0] ?? 1,
        rotate: rotate > 0 ? (rotate + particleR / 20) * 10 : (rotate - particleR / 20) * 10,
      };
    },
    [colors, getXY, noise, particleCount, particleDistances, particleR],
  );

  const removeParticles = useCallback(() => {
    filterRef.current?.querySelectorAll(".gooey-nav-particle").forEach((particle) => {
      particle.remove();
    });
  }, []);

  const makeParticles = useCallback(
    (element: HTMLSpanElement) => {
      const bubbleTime = animationTime * 2 + timeVariance;
      element.style.setProperty("--gooey-time", `${bubbleTime}ms`);
      element.classList.remove("active");

      for (let index = 0; index < particleCount; index += 1) {
        const particleTime = animationTime * 2 + noise(timeVariance * 2);
        const particleConfig = createParticle(index, particleTime);

        const createTimer = window.setTimeout(() => {
          const particle = document.createElement("span");
          const point = document.createElement("span");

          particle.className = "gooey-nav-particle";
          particle.style.setProperty("--start-x", `${particleConfig.start[0]}px`);
          particle.style.setProperty("--start-y", `${particleConfig.start[1]}px`);
          particle.style.setProperty("--end-x", `${particleConfig.end[0]}px`);
          particle.style.setProperty("--end-y", `${particleConfig.end[1]}px`);
          particle.style.setProperty("--gooey-time", `${particleConfig.time}ms`);
          particle.style.setProperty("--scale", `${particleConfig.scale}`);
          particle.style.setProperty("--color", `var(--gooey-color-${particleConfig.color})`);
          particle.style.setProperty("--rotate", `${particleConfig.rotate}deg`);

          point.className = "gooey-nav-point";
          particle.appendChild(point);
          element.appendChild(particle);

          requestAnimationFrame(() => {
            element.classList.add("active");
          });

          const removeTimer = window.setTimeout(() => particle.remove(), particleTime);
          timeoutRefs.current.push(removeTimer);
        }, 30);

        timeoutRefs.current.push(createTimer);
      }
    },
    [animationTime, createParticle, noise, particleCount, timeVariance],
  );

  const updateEffectPosition = useCallback((element: HTMLElement) => {
    if (!containerRef.current || !filterRef.current || !textRef.current) return;

    const containerRect = containerRef.current.getBoundingClientRect();
    const itemRect = element.getBoundingClientRect();
    const styles = {
      left: `${itemRect.x - containerRect.x}px`,
      top: `${itemRect.y - containerRect.y}px`,
      width: `${itemRect.width}px`,
      height: `${itemRect.height}px`,
    };

    Object.assign(filterRef.current.style, styles);
    Object.assign(textRef.current.style, styles);
    textRef.current.textContent = element.textContent;
  }, []);

  const activateItem = useCallback(
    (element: HTMLElement, index: number) => {
      if (selectedIndex === index) return;

      setSelectedIndex(index);
      updateEffectPosition(element);
      clearTimers();
      removeParticles();

      if (textRef.current) {
        textRef.current.classList.remove("active");
        void textRef.current.offsetWidth;
        textRef.current.classList.add("active");
      }

      if (filterRef.current) {
        makeParticles(filterRef.current);
      }
    },
    [clearTimers, makeParticles, removeParticles, selectedIndex, updateEffectPosition],
  );

  useEffect(() => {
    setSelectedIndex(activeIndex);
  }, [activeIndex]);

  useEffect(() => {
    const activeItem = listRef.current?.querySelectorAll("li")[selectedIndex];
    if (!activeItem) return;

    updateEffectPosition(activeItem);
    textRef.current?.classList.add("active");
  }, [selectedIndex, updateEffectPosition]);

  useEffect(() => {
    if (!containerRef.current) return undefined;

    const updateActivePosition = () => {
      const activeItem = listRef.current?.querySelectorAll("li")[selectedIndex];
      if (activeItem) updateEffectPosition(activeItem);
    };

    if (typeof ResizeObserver === "undefined") {
      window.addEventListener("resize", updateActivePosition);
      return () => window.removeEventListener("resize", updateActivePosition);
    }

    const resizeObserver = new ResizeObserver(updateActivePosition);
    resizeObserver.observe(containerRef.current);

    return () => resizeObserver.disconnect();
  }, [selectedIndex, updateEffectPosition]);

  useEffect(() => {
    return () => {
      clearTimers();
      removeParticles();
    };
  }, [clearTimers, removeParticles]);

  return (
    <div className="gooey-nav" ref={containerRef}>
      <nav aria-label={ariaLabel}>
        <ul ref={listRef}>
          {items.map((item, index) => (
            <li key={item.to} className={selectedIndex === index ? "active" : undefined}>
              <Link
                to={item.to}
                aria-current={selectedIndex === index ? "page" : undefined}
                onClick={(event) => activateItem(event.currentTarget.parentElement ?? event.currentTarget, index)}
                onKeyDown={(event) => {
                  if (event.key !== " ") return;
                  event.preventDefault();
                  activateItem(event.currentTarget.parentElement ?? event.currentTarget, index);
                  event.currentTarget.click();
                }}
              >
                {item.label}
              </Link>
            </li>
          ))}
        </ul>
      </nav>
      <span className="gooey-nav-effect gooey-nav-filter" ref={filterRef} />
      <span className="gooey-nav-effect gooey-nav-text" ref={textRef} />
    </div>
  );
}
