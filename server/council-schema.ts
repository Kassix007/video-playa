import { z } from "zod";

export const CouncilConfidenceSchema = z.enum(["low", "medium", "high"]);

export const CouncilHorseSchema = z.object({
  number: z.number().int().positive(),
  name: z.string().min(1),
  probability: z.number().min(0).max(100),
}).strict();

export const CouncilResultSchema = z.object({
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

export type CouncilResult = z.infer<typeof CouncilResultSchema>;
