import { createHash, randomUUID } from "node:crypto";
import type { CouncilResult } from "./council-schema.js";

export interface CouncilWriteActor {
  clientId: string;
  subject?: string;
}

export interface CouncilWriteAuditEvent {
  event_id: string;
  occurred_at: string;
  action: "save_council_result";
  outcome: "success";
  client_id: string;
  subject_sha256?: string;
  race_id: string;
  result_sha256: string;
}

function sha256(value: string): string {
  return createHash("sha256").update(value).digest("hex");
}

function boundedIdentifier(value: string): string {
  const normalized = value.trim();
  if (normalized.length <= 200) return normalized || "unknown-client";
  return `sha256:${sha256(normalized)}`;
}

export function createCouncilWriteAuditEvent(
  result: CouncilResult,
  actor: CouncilWriteActor,
  occurredAt = Date.now(),
  eventId: string = randomUUID(),
): CouncilWriteAuditEvent {
  return {
    event_id: eventId,
    occurred_at: new Date(occurredAt).toISOString(),
    action: "save_council_result",
    outcome: "success",
    client_id: boundedIdentifier(actor.clientId),
    subject_sha256: actor.subject ? sha256(actor.subject) : undefined,
    race_id: result.race_id,
    result_sha256: sha256(JSON.stringify(result)),
  };
}

type SecurityEventDetails = Readonly<Record<string, string | number | boolean | undefined>>;

export function logCouncilSecurityEvent(
  event: string,
  details: SecurityEventDetails = {},
): void {
  console.info(JSON.stringify({
    service: "horsee-council",
    event,
    occurred_at: new Date().toISOString(),
    ...details,
  }));
}
