import { Helmet } from "react-helmet-async";
import SiteHeader from "../components/SiteHeader";

export default function Home() {
  return (
    <>
      <Helmet>
        <title>Home | Video Playa</title>
      </Helmet>

      <SiteHeader
        title="Welcome to Video Playa"
        subtitle="A minimal, fast, and clean starter deployed on GitHub Pages."
        rightSlot={<a className="btn" href="#/about">Learn more</a>}
      />

      <section className="card">
        <h2>Getting Started</h2>
        <p>
          This is your home page. Replace this content with your app’s main features, a dashboard,
          or a product overview. The layout keeps navigation, header, and footer consistent.
        </p>
      </section>
    </>
  );
}
