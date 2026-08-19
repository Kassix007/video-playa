import { Link } from "react-router-dom";

export default function Footer() {
  return (
    <footer className="footer" role="contentinfo">
      <div className="container footer-inner">
        <p>© {new Date().getFullYear()} Video Playa</p>
        <nav aria-label="Footer navigation">
          <ul className="footer-links">
            <li><a href="https://github.com/kassix007/video-playa" target="_blank" rel="noreferrer">GitHub</a></li>
            <li><Link to="/about">About</Link></li>
          </ul>
        </nav>
      </div>
    </footer>
  );
}
