import { z } from "zod";

export const CouncilConfidenceSchema = z.enum(["low", "medium", "high"]);

export const CouncilHorseSchema = z.object({
  number: z.number().int().positive(),
  name: z.string().min(1),
  probability: z.number().min(0).max(100),
}).strict();

const CouncilResultShapeSchema = z.object({
  race_id: z.string().min(1),
  racecourse: z.string().min(1),
  race_number: z.number().int().positive(),
  off_time: z.string().min(1),
  distance: z.string().min(1),
  surface: z.string().min(1),
  going: z.string().min(1),
  race_type: z.string().min(1),
  field_size: z.number().int().positive(),
  most_likely_winner: CouncilHorseSchema,
  principal_danger: CouncilHorseSchema,
  best_value: CouncilHorseSchema,
  ranking: z.array(CouncilHorseSchema).min(1),
  confidence: CouncilConfidenceSchema,
  strongest_loss_reason: z.string().min(1),
  final_selection: z.string().min(1),
  council_status: z.string().min(1),
  analysed_at: z.iso.datetime(),
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
