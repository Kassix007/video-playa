import { z } from "zod";

const money = z.union([z.string(), z.number()]).transform(String).refine(value => /^\d+(?:\.\d{1,2})?$/.test(value));
const schema = z.object({
  betting_enabled: z.boolean(),
  default_starting_balance: money,
  minimum_stake: money,
  maximum_stake: money.nullable(),
  close_buffer_seconds: z.number().int().nonnegative(),
  max_quote_age_seconds: z.number().int().positive(),
  result_check_initial_delay_seconds: z.number().int().nonnegative(),
  result_check_max_age_seconds: z.number().int().positive(),
  version: z.number().int().nonnegative(),
});
export type AdminSettings = z.infer<typeof schema>;
export function parseAdminSettings(value: unknown): AdminSettings | null {
  const parsed = schema.safeParse(value);
  return parsed.success ? parsed.data : null;
}
