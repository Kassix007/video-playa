export default function Footer() {
  return (
    <footer className="footer" role="contentinfo">
      <div className="container footer-inner">
        <p>© {new Date().getFullYear()} Video Playa</p>
        <nav aria-label="Footer">
          <ul className="footer-links">
            <li><a href="https://github.com/<your-username>/video-playa" target="_blank" rel="noreferrer">GitHub</a></li>
            <li><a href="#/about">About</a></li>
          </ul>
        </nav>
      </div>
    </footer>
  );
}
