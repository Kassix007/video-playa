export const COUNCIL_RUN_STAGE_VALUES = [
  "RECEIVED",
  "RESOLVING_RACE",
  "FACT_LOCK",
  "ANALYSING_RUNNERS",
  "MARKET_AUDIT",
  "VERDICT_READY",
  "SAVING",
  "SAVED",
  "FAILED",
] as const;

export type WidgetCouncilRunStatus = {
  command: string;
  stage: typeof COUNCIL_RUN_STAGE_VALUES[number];
  message?: string;
  updated_at: string;
};

const stageValues = new Set<string>(COUNCIL_RUN_STAGE_VALUES);

export function councilRunStatusFrom(value: unknown): WidgetCouncilRunStatus | null {
  if (!value || typeof value !== "object") return null;
  const payload = value as Record<string, unknown>;
  const nested = payload.status;
  if (!nested || typeof nested !== "object") return null;

  const status = nested as Record<string, unknown>;
  if (
    typeof status.command !== "string"
    || typeof status.stage !== "string"
    || !stageValues.has(status.stage)
    || typeof status.updated_at !== "string"
    || (status.message !== undefined && typeof status.message !== "string")
  ) {
    return null;
  }

  return status as WidgetCouncilRunStatus;
}

export function formatCouncilRunStage(stage: WidgetCouncilRunStatus["stage"]): string {
  return stage.replaceAll("_", " ");
}
