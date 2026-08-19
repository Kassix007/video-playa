import { z } from "zod";

export const MAX_COUNCIL_FIELD_SIZE = 40;

export const CouncilConfidenceSchema = z.enum(["low", "medium", "high"]);

export const CouncilHorseSchema = z.object({
  number: z.number().int().positive().max(999),
  name: z.string().trim().min(1).max(120),
  probability: z.number().min(0).max(100),
}).strict();

const CouncilResultShapeSchema = z.object({
  race_id: z.string().trim().min(1).max(160),
  racecourse: z.string().trim().min(1).max(120),
  race_number: z.number().int().positive().max(999),
  off_time: z.string().trim().min(1).max(40),
  distance: z.string().trim().min(1).max(80),
  surface: z.string().trim().min(1).max(80),
  going: z.string().trim().min(1).max(80),
  race_type: z.string().trim().min(1).max(80),
  field_size: z.number().int().positive().max(MAX_COUNCIL_FIELD_SIZE),
  most_likely_winner: CouncilHorseSchema,
  principal_danger: CouncilHorseSchema,
  best_value: CouncilHorseSchema,
  ranking: z.array(CouncilHorseSchema).min(1).max(MAX_COUNCIL_FIELD_SIZE),
  confidence: CouncilConfidenceSchema,
  strongest_loss_reason: z.string().trim().min(1).max(2_000),
  final_selection: z.string().trim().min(1).max(240),
  council_status: z.string().trim().min(1).max(64),
  analysed_at: z.iso.datetime().max(40),
}).strict();

function isSameHorse(
  left: z.infer<typeof CouncilHorseSchema>,
  right: z.infer<typeof CouncilHorseSchema>,
): boolean {
  return left.number === right.number
    && left.name === right.name
    && left.probability === right.probability;
}

export const CouncilResultSchema = CouncilResultShapeSchema.superRefine((result, context) => {
  if (result.ranking.length !== result.field_size) {
    context.addIssue({
      code: "custom",
      path: ["ranking"],
      message: "Ranking must contain exactly field_size runners.",
    });
  }

  const runnerCounts = new Map<number, number>();
  result.ranking.forEach((runner, index) => {
    const count = (runnerCounts.get(runner.number) ?? 0) + 1;
    runnerCounts.set(runner.number, count);
    if (count > 1) {
      context.addIssue({
        code: "custom",
        path: ["ranking", index, "number"],
        message: `Runner number ${runner.number} appears more than once in ranking.`,
      });
    }
  });

  const winnerCount = runnerCounts.get(result.most_likely_winner.number) ?? 0;
  if (winnerCount !== 1) {
    context.addIssue({
      code: "custom",
      path: ["most_likely_winner"],
      message: "Most likely winner must appear exactly once in ranking.",
    });
  }

  const rankingWinner = result.ranking[0];
  if (!rankingWinner || !isSameHorse(result.most_likely_winner, rankingWinner)) {
    context.addIssue({
      code: "custom",
      path: ["most_likely_winner"],
      message: "Most likely winner must exactly match ranking[0].",
    });
  }

  for (const [field, horse, label] of [
    ["principal_danger", result.principal_danger, "Principal danger"],
    ["best_value", result.best_value, "Best value horse"],
  ] as const) {
    const rankedHorse = result.ranking.find((runner) => runner.number === horse.number);
    if (!rankedHorse || !isSameHorse(horse, rankedHorse)) {
      context.addIssue({
        code: "custom",
        path: [field],
        message: `${label} must exactly match one runner in ranking.`,
      });
    }
  }

  const probabilityTotal = result.ranking.reduce(
    (total, runner) => total + runner.probability,
    0,
  );
  if (probabilityTotal < 99.5 || probabilityTotal > 100.5) {
    context.addIssue({
      code: "custom",
      path: ["ranking"],
      message: `Ranking probabilities must total approximately 100% (received ${probabilityTotal}%).`,
    });
  }
});

export type CouncilResult = z.infer<typeof CouncilResultSchema>;
