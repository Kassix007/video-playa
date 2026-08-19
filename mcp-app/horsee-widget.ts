import { App } from "@modelcontextprotocol/ext-apps/app-with-deps";

type CouncilResult = {
  race_id: string;
  racecourse: string;
  race_number: number;
  off_time: string;
  distance: string;
  surface: string;
  going: string;
  race_type: string;
  field_size: number;
  most_likely_winner: CouncilHorse;
  principal_danger: CouncilHorse;
  best_value: CouncilHorse;
  ranking: CouncilHorse[];
  confidence: "low" | "medium" | "high";
  strongest_loss_reason: string;
  final_selection: string;
  council_status: string;
  analysed_at: string;
};

type CouncilHorse = { number: number; name: string; probability: number };

type LegacyOpenAIBridge = {
  sendFollowUpMessage?: (message: { prompt: string; scrollToBottom?: boolean }) => Promise<void> | void;
  callTool?: (name: string, args: Record<string, unknown>) => Promise<unknown>;
  toolOutput?: unknown;
};

declare global {
  interface Window { openai?: LegacyOpenAIBridge }
}

function formatHorse(horse: CouncilHorse): string {
  return `#${horse.number} ${horse.name} — ${horse.probability}%`;
}

const fields: Array<[string, (result: CouncilResult) => string]> = [
  ["Race", (result) => `${result.racecourse} R${result.race_number} · ${result.off_time}`],
  ["Conditions", (result) => `${result.distance} · ${result.surface} · ${result.going} · ${result.race_type} · ${result.field_size} runners`],
  ["Most likely winner", (result) => formatHorse(result.most_likely_winner)],
  ["Principal danger", (result) => formatHorse(result.principal_danger)],
  ["Best value", (result) => formatHorse(result.best_value)],
  ["Final ranking", (result) => result.ranking.map(formatHorse).join(" › ")],
  ["Confidence", (result) => result.confidence],
  ["Strongest loss reason", (result) => result.strongest_loss_reason],
  ["Final selection", (result) => result.final_selection],
  ["Council status", (result) => result.council_status],
  ["Analysed at", (result) => new Date(result.analysed_at).toLocaleString()],
];

const form = document.querySelector<HTMLFormElement>("#form")!;
const input = document.querySelector<HTMLInputElement>("#command")!;
const runButton = document.querySelector<HTMLButtonElement>("#run")!;
const bridgeLabel = document.querySelector<HTMLElement>("#bridge")!;
const feedbackTitle = document.querySelector<HTMLElement>("#feedback-title")!;
const feedbackDetail = document.querySelector<HTMLElement>("#feedback-detail")!;
const resultList = document.querySelector<HTMLDListElement>("#result-list")!;

const app = new App({ name: "HORSEE Horse Racing Council", version: "1.1.0" }, {}, { autoResize: true });
let standardBridge = false;
let latestAnalysedAt: string | null = null;

function resultFrom(value: unknown): CouncilResult | null {
  if (!value || typeof value !== "object") return null;
  const payload = value as Record<string, unknown>;
  const nested = payload.result;
  if (!nested || typeof nested !== "object") return null;
  const result = nested as CouncilResult;
  return typeof result.analysed_at === "string" ? result : null;
}

function renderResult(result: CouncilResult | null): void {
  resultList.replaceChildren();
  for (const [label, formatter] of fields) {
    const row = document.createElement("div");
    const term = document.createElement("dt");
    const detail = document.createElement("dd");
    term.textContent = label;
    detail.textContent = result ? formatter(result) : "Awaiting Council result";
    if (!result) detail.className = "waiting";
    row.append(term, detail);
    resultList.append(row);
  }
  if (result) latestAnalysedAt = result.analysed_at;
}

function setFeedback(title: string, detail: string): void {
  feedbackTitle.textContent = title;
  feedbackDetail.textContent = detail;
}

function extractStructuredContent(value: unknown): unknown {
  if (!value || typeof value !== "object") return null;
  const record = value as Record<string, unknown>;
  return record.structuredContent ?? record;
}

async function getLatestResult(): Promise<CouncilResult | null> {
  if (standardBridge) {
    const response = await app.callServerTool({ name: "get_latest_council_result", arguments: {} });
    return resultFrom(response.structuredContent);
  }

  if (typeof window.openai?.callTool === "function") {
    const response = await window.openai.callTool("get_latest_council_result", {});
    return resultFrom(extractStructuredContent(response));
  }

  return resultFrom(extractStructuredContent(window.openai?.toolOutput));
}

async function refreshResult(): Promise<CouncilResult | null> {
  try {
    const result = await getLatestResult();
    if (result) renderResult(result);
    return result;
  } catch {
    return null;
  }
}

async function pollForNewResult(previousAnalysedAt: string | null): Promise<void> {
  const deadline = Date.now() + 120_000;
  while (Date.now() < deadline) {
    await new Promise((resolve) => window.setTimeout(resolve, 3_000));
    const result = await refreshResult();
    if (result && result.analysed_at !== previousAnalysedAt) {
      setFeedback("Council result received", "The selection board has been updated.");
      runButton.disabled = input.value.trim().length === 0;
      return;
    }
  }
  setFeedback("Analysis still running", "The conversation may still update this panel; reopen it to refresh.");
  runButton.disabled = input.value.trim().length === 0;
}

function setBridgeOnline(): void {
  bridgeLabel.dataset.state = "online";
  bridgeLabel.textContent = "Council bridge online";
  runButton.disabled = input.value.trim().length === 0;
  setFeedback("ChatGPT is ready", "Your exact command will be sent to this conversation.");
}

app.ontoolresult = (params) => {
  const result = resultFrom(params.structuredContent);
  if (result) renderResult(result);
};

renderResult(null);

void (async () => {
  try {
    await Promise.race([
      app.connect(),
      new Promise<never>((_, reject) => window.setTimeout(() => reject(new Error("MCP Apps bridge timed out")), 2_000)),
    ]);
    standardBridge = true;
    setBridgeOnline();
    await refreshResult();
  } catch {
    const legacyAvailable = typeof window.openai?.sendFollowUpMessage === "function";
    if (legacyAvailable) {
      setBridgeOnline();
      await refreshResult();
    } else {
      bridgeLabel.dataset.state = "offline";
      bridgeLabel.textContent = "Council bridge offline";
      setFeedback("Council bridge offline", "Open HORSEE through ChatGPT to run the Council.");
    }
  }
})();

input.addEventListener("input", () => {
  const online = standardBridge || typeof window.openai?.sendFollowUpMessage === "function";
  runButton.disabled = !online || input.value.trim().length === 0;
});

form.addEventListener("submit", (event) => {
  event.preventDefault();
  const command = input.value;
  if (!command.trim()) return;

  const previousAnalysedAt = latestAnalysedAt;
  runButton.disabled = true;
  setFeedback("Sending to ChatGPT", "Handing the command to the active conversation.");

  void (async () => {
    try {
      if (standardBridge) {
        const response = await app.sendMessage({ role: "user", content: [{ type: "text", text: command }] });
        if (response.isError) throw new Error("ChatGPT rejected the message.");
      } else if (typeof window.openai?.sendFollowUpMessage === "function") {
        await window.openai.sendFollowUpMessage({ prompt: command, scrollToBottom: true });
      } else {
        throw new Error("Council bridge unavailable.");
      }

      setFeedback("Command submitted", "ChatGPT is running the Council analysis.");
      await pollForNewResult(previousAnalysedAt);
    } catch {
      setFeedback("Command not submitted", "ChatGPT did not accept the follow-up. Please try again.");
      runButton.disabled = input.value.trim().length === 0;
    }
  })();
});
