import { Link, useLocation } from "react-router-dom";
import { primaryNavigation } from "../config/routes";

const watchLinks = primaryNavigation.filter(({ path }) => path !== "/about");

export default function Footer() {
  const { pathname } = useLocation();

  function scrollToTop() {
    window.scrollTo({ top: 0, behavior: "smooth" });
  }

  return (
    <footer className="footer" role="contentinfo">
      <div className="footer-rail" aria-hidden="true">
        <span>Live fixtures</span>
        <span>Direct playback</span>
        <span>Less channel-hopping</span>
      </div>

      <div className="container footer-main">
        <div className="footer-lead">
          <Link className="footer-brand" to="/" aria-label="Video Playa home">
            <span className="footer-brand-mark" aria-hidden="true">VP</span>
            <span>Video Playa</span>
          </Link>

          <p className="footer-eyebrow"><span aria-hidden="true" /> Independent stream desk</p>
          <h2 className="footer-title">Find the feed.<br />Catch the moment.</h2>
          <p className="footer-description">
            A focused place for live fixtures, public channels, and direct playback—without the noise.
          </p>

          <Link className="footer-action" to="/player">
            Open the player <span aria-hidden="true">→</span>
          </Link>
        </div>

        <div className="footer-nav-grid">
          <nav aria-label="Watch on Video Playa">
            <p className="footer-nav-title">Watch</p>
            <ul className="footer-links">
              {watchLinks.map(({ path, label }) => (
                <li key={path}>
                  <Link aria-current={pathname === path ? "page" : undefined} to={path}>
                    {label}<span aria-hidden="true">↗</span>
                  </Link>
                </li>
              ))}
            </ul>
          </nav>

          <nav aria-label="About Video Playa">
            <p className="footer-nav-title">Project</p>
            <ul className="footer-links">
              <li>
                <Link aria-current={pathname === "/about" ? "page" : undefined} to="/about">
                  About<span aria-hidden="true">↗</span>
                </Link>
              </li>
              <li>
                <a href="https://github.com/kassix007/video-playa" target="_blank" rel="noreferrer">
                  GitHub<span aria-hidden="true">↗</span>
                </a>
              </li>
            </ul>
          </nav>
        </div>
      </div>

      <div className="container footer-bottom">
        <p>© {new Date().getFullYear()} Video Playa</p>
        <p className="footer-note"><span aria-hidden="true" /> Ready for the next kickoff</p>
        <button className="footer-top" onClick={scrollToTop} type="button">
          Back to top <span aria-hidden="true">↑</span>
        </button>
      </div>
    </footer>
  );
}
