export function startFantasyLiveRefresh(options: {
  refresh: () => Promise<unknown>;
  visible: () => boolean;
  schedule: (callback: () => void, milliseconds: number) => unknown;
  cancel: (handle: unknown) => void;
  subscribe: (callback: () => void) => () => void;
}) {
  let stopped = false;
  let running = false;
  let timer: unknown;
  const schedule = () => {
    options.cancel(timer);
    if (!stopped && options.visible()) timer = options.schedule(() => void run(), 30_000);
  };
  const run = async () => {
    if (stopped || running || !options.visible()) return;
    running = true;
    try { await options.refresh(); } catch { /* UI owns safe errors; keep polling. */ }
    finally { running = false; schedule(); }
  };
  const unsubscribe = options.subscribe(() => {
    options.cancel(timer);
    if (options.visible()) void run();
  });
  schedule();
  return () => { stopped = true; options.cancel(timer); unsubscribe(); };
}
