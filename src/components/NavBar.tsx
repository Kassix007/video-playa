import { NavLink } from "react-router-dom";

export default function NavBar() {
  return (
    <header className="navbar" role="banner" aria-label="Main Navigation">
      <div className="container nav-inner">
        <div className="brand">
          <a href="#/">Video Playa</a>
        </div>
        <nav aria-label="Primary">
          <ul className="nav-list">
            <li>
              <NavLink to="/" end className={({ isActive }) => isActive ? "nav-link active" : "nav-link"}>
                Home
              </NavLink>
            </li>
            <li>
              <NavLink to="/about" className={({ isActive }) => isActive ? "nav-link active" : "nav-link"}>
                About
              </NavLink>
            </li>
          </ul>
        </nav>
      </div>
    </header>
  );
}
