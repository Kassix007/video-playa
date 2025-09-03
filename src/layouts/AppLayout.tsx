import { Outlet, useLocation } from "react-router-dom";
import NavBar from "../components/NavBar";
import Footer from "../components/Footer";

export default function AppLayout() {
  const { pathname } = useLocation();

  return (
    <div className="app-shell" data-route={pathname}>
      <NavBar />
      <main className="main-area" role="main">
        <div className="container">
          <Outlet />
        </div>
      </main>
      <Footer />
    </div>
  );
}
