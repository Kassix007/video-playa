import { createCouncilResultStore } from "../../server/council-store.js";

const store = createCouncilResultStore();

export default async function handler(): Promise<Response> {
  return Response.json(
    { result: await store.getLatest() },
    { headers: { "Cache-Control": "no-store" } },
  );
}
