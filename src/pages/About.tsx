import { Helmet } from "react-helmet-async";
import SiteHeader from "../components/SiteHeader";

export default function About() {
  return (
    <>
      <Helmet>
        <title>About | Video Playa</title>
      </Helmet>

      <SiteHeader
        title="About"
        subtitle="What this project is and how it’s structured."
      />

      <section className="card">
        <h2>Project Overview</h2>
        <ul>
          <li>Vite + React + TypeScript</li>
          <li>Hash-based routing for GitHub Pages</li>
          <li>Modular components for scalability</li>
        </ul>
      </section>
    </>
  );
}
