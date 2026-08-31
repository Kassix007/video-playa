import { Helmet } from "react-helmet-async";
import { Link } from "react-router-dom";
import SiteHeader from "../components/SiteHeader";

const viewingSteps = [
  {
    number: "01",
    title: "See what’s on",
    description: "Start with the fixture board or browse public channels without opening a maze of tabs.",
  },
  {
    number: "02",
    title: "Choose your route",
    description: "Follow a scheduled event, tune a channel, or bring a direct media address of your own.",
  },
  {
    number: "03",
    title: "Open the player",
    description: "Move into a focused playback view with the controls that belong to you and your screen.",
  },
] as const;

const principles = [
  {
    number: "01",
    title: "Speed over sprawl",
    description: "The useful path should be the shortest one: fixture, feed, play. Everything else earns its place.",
  },
  {
    number: "02",
    title: "Your feed, your call",
    description: "Use the schedule, explore public channels, or test your own stream. Video Playa keeps the choice with you.",
  },
  {
    number: "03",
    title: "Quiet by design",
    description: "No sign-in detours, promo walls, or channel mazes. Just a clear desk built around the next thing you want to watch.",
  },
] as const;

export default function About() {
  return (
    <>
      <Helmet>
        <title>About | Video Playa</title>
        <meta
          name="description"
          content="Why Video Playa exists: a focused route from live fixtures and public channels to direct playback."
        />
      </Helmet>

      <SiteHeader
        eyebrow="Behind the feed"
        title="Less hunting. More watching."
        subtitle="Video Playa is a quiet stream desk for the moment between finding the game and finally pressing play."
        railItems={["Find the fixture", "Choose the feed", "Press play"]}
        rightSlot={
          <Link className="btn" to="/player">
            Open the player <span aria-hidden="true">→</span>
          </Link>
        }
      />

      <div className="about-page">
        <section className="about-intro" aria-labelledby="about-idea-title">
          <div className="about-intro-copy">
            <p className="about-kicker"><span aria-hidden="true" /> The idea</p>
            <h2 className="about-display-title" id="about-idea-title">
              Built for the gap between kickoff and a working feed.
            </h2>
            <p className="about-lede">
              Watching should not begin with twenty tabs, mystery links, and a race against the clock.
              Video Playa gathers the practical routes into one focused place.
            </p>
            <p className="about-body-copy">
              Check the schedule, browse a public channel, or bring a stream address you already trust.
              The goal stays the same: make the distance between “it’s on” and “I’m watching” feel shorter.
            </p>
            <Link className="about-inline-action" to="/">
              Browse the program guide <span aria-hidden="true">→</span>
            </Link>
          </div>

          <aside className="about-desk" aria-label="What the Video Playa desk includes">
            <p className="about-desk-label">One quiet desk</p>
            <div className="about-desk-row">
              <span>Program guide</span>
              <strong>Scheduled fixtures</strong>
            </div>
            <div className="about-desk-row">
              <span>IPTV directory</span>
              <strong>Public channels</strong>
            </div>
            <div className="about-desk-row">
              <span>Direct player</span>
              <strong>HLS, DASH + media</strong>
            </div>
            <p className="about-desk-note"><span aria-hidden="true" /> Ready when the feed is</p>
          </aside>
        </section>

        <section className="about-flow" aria-labelledby="about-flow-title">
          <div className="about-section-heading">
            <p className="about-kicker"><span aria-hidden="true" /> The route</p>
            <h2 id="about-flow-title">Three moves. No channel maze.</h2>
            <p>From tonight’s fixture to a focused player, each step has one clear job.</p>
          </div>

          <ol className="about-steps">
            {viewingSteps.map((step) => (
              <li key={step.number}>
                <span className="about-step-number" aria-hidden="true">{step.number}</span>
                <h3>{step.title}</h3>
                <p>{step.description}</p>
              </li>
            ))}
          </ol>
        </section>

        <section className="about-principles" aria-labelledby="about-principles-title">
          <div className="about-section-heading about-section-heading-split">
            <div>
              <p className="about-kicker"><span aria-hidden="true" /> The principles</p>
              <h2 id="about-principles-title">The desk stays simple on purpose.</h2>
            </div>
            <p>Every addition has to make finding or playing a feed easier. If it adds noise, it does not belong here.</p>
          </div>

          <div className="about-principle-grid">
            {principles.map((principle) => (
              <article key={principle.number}>
                <span className="about-principle-number" aria-hidden="true">{principle.number}</span>
                <h3>{principle.title}</h3>
                <p>{principle.description}</p>
              </article>
            ))}
          </div>
        </section>

        <section className="about-signoff" aria-labelledby="about-signoff-title">
          <div>
            <p className="about-kicker"><span aria-hidden="true" /> Independent stream desk</p>
            <h2 id="about-signoff-title">Bring the feed. Keep the controls.</h2>
            <p>Video Playa handles the route. Your browser and device handle the watching.</p>
          </div>
          <div className="about-signoff-mark" aria-hidden="true">
            <strong>VP</strong>
            <span>Find · Tune · Play</span>
          </div>
        </section>
      </div>
    </>
  );
}
