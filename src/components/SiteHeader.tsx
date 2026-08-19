type SiteHeaderProps = {
  title: string;
  subtitle?: string;
  eyebrow?: string;
  railItems?: string[];
  rightSlot?: React.ReactNode;
};

const defaultRailItems = ["Live fixtures", "Direct links", "Zero channel-hopping"];

export default function SiteHeader({ title, subtitle, eyebrow, railItems = defaultRailItems, rightSlot }: SiteHeaderProps) {
  return (
    <section className="site-header">
      <div className="site-header-inner">
        <div className="site-header-copy">
          {eyebrow && <p className="site-eyebrow"><span aria-hidden="true" />{eyebrow}</p>}
          <h1 className="site-title">{title}</h1>
          {subtitle && <p className="site-subtitle">{subtitle}</p>}
        </div>
        {rightSlot && <div className="site-header-right">{rightSlot}</div>}
      </div>
      <div className="site-header-rail" aria-hidden="true">
        {railItems.map((item) => <span key={item}>{item}</span>)}
      </div>
    </section>
  );
}
