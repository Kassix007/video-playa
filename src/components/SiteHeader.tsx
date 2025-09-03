type SiteHeaderProps = {
  title: string;
  subtitle?: string;
  rightSlot?: React.ReactNode;
};

export default function SiteHeader({ title, subtitle, rightSlot }: SiteHeaderProps) {
  return (
    <section className="site-header">
      <div className="container site-header-inner">
        <div>
          <h1 className="site-title">{title}</h1>
          {subtitle && <p className="site-subtitle">{subtitle}</p>}
        </div>
        {rightSlot && <div className="site-header-right">{rightSlot}</div>}
      </div>
    </section>
  );
}
