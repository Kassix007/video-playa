import { createCipheriv, createDecipheriv, randomBytes } from "node:crypto";
import { z } from "zod";
import type { SmspariazEncryptionKey } from "./smspariaz-config.js";

const EnvelopeSchema = z.object({
  version: z.literal(1),
  alg: z.literal("A256GCM"),
  kid: z.string().min(1).max(64),
  iv: z.string().min(1),
  tag: z.string().min(1),
  ciphertext: z.string().min(1),
}).strict();

export type SmspariazEncryptedEnvelope = z.infer<typeof EnvelopeSchema>;

export interface SmspariazCipherContext {
  namespace: string;
  recordKey: string;
  providerOrigin: string;
}

function aad(context: SmspariazCipherContext): Buffer {
  return Buffer.from(JSON.stringify({
    envelope_version: 1,
    schema: "smspariaz-private-record",
    namespace: context.namespace,
    record_key: context.recordKey,
    provider_origin: context.providerOrigin,
  }), "utf8");
}

function decodeBase64(value: string, expectedLength?: number): Buffer {
  const bytes = Buffer.from(value, "base64");
  if (bytes.toString("base64") !== value || (expectedLength !== undefined && bytes.length !== expectedLength)) {
    throw new Error("SESSION_STORAGE_CORRUPT");
  }
  return bytes;
}

export function createSmspariazCipher(
  currentKey: SmspariazEncryptionKey,
  previousKey?: SmspariazEncryptionKey,
) {
  if (currentKey.bytes.length !== 32 || previousKey && previousKey.bytes.length !== 32) {
    throw new TypeError("SMSPariaz encryption keys must contain exactly 32 bytes.");
  }

  return {
    encrypt(value: unknown, context: SmspariazCipherContext): SmspariazEncryptedEnvelope {
      const iv = randomBytes(12);
      const cipher = createCipheriv("aes-256-gcm", currentKey.bytes, iv);
      cipher.setAAD(aad(context));
      const ciphertext = Buffer.concat([
        cipher.update(JSON.stringify(value), "utf8"),
        cipher.final(),
      ]);
      return {
        version: 1,
        alg: "A256GCM",
        kid: currentKey.id,
        iv: iv.toString("base64"),
        tag: cipher.getAuthTag().toString("base64"),
        ciphertext: ciphertext.toString("base64"),
      };
    },

    decrypt(envelopeValue: unknown, context: SmspariazCipherContext): { value: unknown; needsRewrap: boolean } {
      const envelope = EnvelopeSchema.parse(envelopeValue);
      const selected = envelope.kid === currentKey.id
        ? currentKey
        : previousKey && envelope.kid === previousKey.id
          ? previousKey
          : undefined;
      if (!selected) throw new Error("SESSION_KEY_UNAVAILABLE");

      try {
        const decipher = createDecipheriv("aes-256-gcm", selected.bytes, decodeBase64(envelope.iv, 12));
        decipher.setAAD(aad(context));
        decipher.setAuthTag(decodeBase64(envelope.tag, 16));
        const plaintext = Buffer.concat([
          decipher.update(decodeBase64(envelope.ciphertext)),
          decipher.final(),
        ]).toString("utf8");
        return { value: JSON.parse(plaintext) as unknown, needsRewrap: selected.id !== currentKey.id };
      } catch (error) {
        if (error instanceof Error && error.message === "SESSION_KEY_UNAVAILABLE") throw error;
        throw new Error("SESSION_STORAGE_CORRUPT");
      }
    },
  };
}

export type SmspariazCipher = ReturnType<typeof createSmspariazCipher>;
