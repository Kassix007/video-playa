import { createCouncilResultStore, type CouncilArchiveStore } from "./council-store.js";
import { HorseeArchiveService } from "./horsee-archive.js";
import { parseHorseeConfig, type HorseeConfig } from "./horsee-config.js";
import { QueueOnlyDispatcher, type HorseeDispatcher } from "./horsee-dispatch.js";
import { createHorseeJobStore, type HorseeJobStore } from "./horsee-job-store.js";
import { runHorseeScheduler } from "./horsee-scheduler.js";

type HorseeRuntimeEnvironment = Readonly<Record<string, string | undefined>>;

export interface HorseeRuntime {
  config: HorseeConfig;
  jobStore: HorseeJobStore;
  councilStore: CouncilArchiveStore;
  archive: HorseeArchiveService;
  dispatcher: HorseeDispatcher;
  runScheduler(): ReturnType<typeof runHorseeScheduler>;
}

export function createHorseeRuntime(
  environment: HorseeRuntimeEnvironment = process.env,
): HorseeRuntime {
  const config = parseHorseeConfig(environment);
  const jobStore = createHorseeJobStore(environment);
  const councilStore = createCouncilResultStore(environment);
  const archive = new HorseeArchiveService({ config, jobStore, councilStore });
  const dispatcher = new QueueOnlyDispatcher();
  return {
    config,
    jobStore,
    councilStore,
    archive,
    dispatcher,
    runScheduler: () => runHorseeScheduler({ config, jobStore, resultStore: councilStore }),
  };
}
