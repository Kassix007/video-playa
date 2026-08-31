import { createCouncilResultStore } from "../server/council-store.js";
import { HorseeArchiveService } from "../server/horsee-archive.js";
import { parseHorseeConfig } from "../server/horsee-config.js";
import { createHorseeJobStore } from "../server/horsee-job-store.js";
import { runCouncilLegacyMigration } from "../server/horsee-migration.js";

type MigrationCliOptions = {
  dryRun: boolean;
  deleteAfterVerified: boolean;
};

export function parseMigrationArguments(arguments_: string[]): MigrationCliOptions {
  const allowed = new Set(["--dry-run", "--delete-after-verified"]);
  const unknown = arguments_.filter((argument) => !allowed.has(argument));
  if (unknown.length) throw new TypeError(`Unknown migration option: ${unknown.join(", ")}`);
  return {
    dryRun: arguments_.includes("--dry-run"),
    deleteAfterVerified: arguments_.includes("--delete-after-verified"),
  };
}

async function main(): Promise<void> {
  const options = parseMigrationArguments(process.argv.slice(2));
  const runtimeEnvironment = process.env.HORSEE_MIGRATION_PRODUCTION === "true"
    ? { ...process.env, NETLIFY: "true", CONTEXT: "production" }
    : process.env;
  const config = parseHorseeConfig(runtimeEnvironment);
  if (!options.dryRun && !config.archive.configured) {
    throw new Error("HORSEE_GITHUB_TOKEN is required unless --dry-run is used.");
  }
  const councilStore = createCouncilResultStore(runtimeEnvironment);
  const archive = new HorseeArchiveService({
    config,
    councilStore,
    jobStore: createHorseeJobStore(runtimeEnvironment),
    log: (message) => console.info(message),
  });
  const report = await runCouncilLegacyMigration({
    store: councilStore,
    archive,
    dryRun: options.dryRun,
    deleteAfterVerified: options.deleteAfterVerified,
  });
  console.info(JSON.stringify(report, null, 2));
  if (report.days.some((day) => day.status === "FAILED")) process.exitCode = 1;
}

main().catch((error: unknown) => {
  const message = error instanceof Error ? error.message : "Unknown migration failure.";
  console.error(`[HORSEE MIGRATION] ${message.replace(/Bearer\s+\S+/gi, "Bearer [redacted]").slice(0, 500)}`);
  process.exitCode = 1;
});
