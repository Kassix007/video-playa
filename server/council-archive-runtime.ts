import { ArchiveAwareCouncilResultStore } from "./council-archive-store.js";
import { createCouncilResultStore, type CouncilArchiveStore } from "./council-store.js";
import { HorseeArchiveService } from "./horsee-archive.js";
import { parseHorseeConfig } from "./horsee-config.js";
import { createHorseeJobStore } from "./horsee-job-store.js";

type HorseeRuntimeEnvironment = Readonly<Record<string, string | undefined>>;

/**
 * Builds the backwards-compatible Council store used by existing read APIs.
 * Writes and recent reads stay on the compact hot store; old missing dates are
 * resolved from the public yearly GitHub archives.
 */
export function createArchiveAwareCouncilResultStore(
  environment: HorseeRuntimeEnvironment = process.env,
): CouncilArchiveStore {
  const config = parseHorseeConfig(environment);
  const hotStore = createCouncilResultStore(environment);
  const archive = new HorseeArchiveService({
    config,
    councilStore: hotStore,
    jobStore: createHorseeJobStore(environment),
  });
  return new ArchiveAwareCouncilResultStore(hotStore, archive, { hotRetentionDays: config.hotRetentionDays });
}
