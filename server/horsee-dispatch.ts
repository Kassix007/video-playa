import { z } from "zod";
import type { HorseeJob } from "./horsee-job-schema.js";

export const HorseeDispatchResultSchema = z.discriminatedUnion("accepted", [
  z.object({
    accepted: z.literal(true),
    provider: z.string().min(1).max(100),
    dispatched_at: z.string().refine((value) => Number.isFinite(Date.parse(value))),
    provider_job_id: z.string().min(1).max(200).optional(),
  }).strict(),
  z.object({
    accepted: z.literal(false),
    provider: z.string().min(1).max(100),
    retryable: z.boolean(),
    message: z.string().min(1).max(500),
  }).strict(),
]);

export type HorseeDispatchResult = z.infer<typeof HorseeDispatchResultSchema>;

export interface HorseeDispatcher {
  readonly name: string;
  dispatch(job: HorseeJob): Promise<HorseeDispatchResult>;
}

export class QueueOnlyDispatcher implements HorseeDispatcher {
  readonly name = "queue-only";

  async dispatch(job: HorseeJob): Promise<HorseeDispatchResult> {
    void job;
    return {
      accepted: false,
      provider: this.name,
      retryable: true,
      message: "No automated dispatcher is configured.",
    };
  }
}
