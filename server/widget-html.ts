import { HORSEE_WIDGET_SCRIPT } from "./generated/horsee-widget.js";

export function createHorseeWidgetHtml(): string {
  return `<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <style>
      :root { color-scheme: light dark; font-family: Inter, ui-sans-serif, system-ui, sans-serif; }
      * { box-sizing: border-box; }
      body { margin: 0; color: #f4f0e8; background: #111714; }
      .council { border: 1px solid #47534d; background: linear-gradient(128deg, #20332b, #151c18 45%); min-width: 0; overflow: hidden; }
      .head { align-items: end; border-bottom: 1px solid #56635c; display: flex; gap: 16px; justify-content: space-between; margin: 0 22px; padding: 22px 0 16px; }
      .mark { color: #d8b64c; display: block; font-size: 10px; font-weight: 900; letter-spacing: .16em; margin-bottom: 5px; text-transform: uppercase; }
      h1, h2 { font-family: Georgia, Cambria, serif; letter-spacing: -.04em; margin: 0; }
      h1 { font-size: clamp(27px, 6vw, 39px); }
      h2 { font-size: 22px; }
      .bridge { align-items: center; color: #ef766d; display: flex; flex: 0 0 auto; font-size: 10px; font-weight: 850; gap: 8px; letter-spacing: .09em; margin: 0; text-transform: uppercase; }
      .bridge::before { background: currentColor; border-radius: 50%; box-shadow: 0 0 0 4px color-mix(in srgb, currentColor 16%, transparent); content: ""; height: 7px; width: 7px; }
      .bridge[data-state="online"] { color: #68d39b; }
      .console { display: grid; gap: 16px; grid-template-columns: minmax(0, 1fr) minmax(210px, .38fr); padding: 22px; }
      label { display: flex; font-size: 11px; font-weight: 900; gap: 9px; letter-spacing: .09em; margin-bottom: 8px; text-transform: uppercase; }
      label span { color: #aab4ae; font-size: 9px; }
      .controls { display: grid; grid-template-columns: minmax(0, 1fr) auto; }
      input { background: #101512; border: 1px solid #56635c; border-right: 0; color: #fff; font: 800 15px ui-monospace, monospace; letter-spacing: .04em; min-height: 52px; min-width: 0; padding: 0 15px; width: 100%; }
      input:focus-visible, button:focus-visible { outline: 3px solid #f2d26e; outline-offset: 2px; }
      button { background: #a98724; border: 1px solid #a98724; color: #111; cursor: pointer; font-size: 11px; font-weight: 900; letter-spacing: .08em; min-height: 52px; min-width: 142px; padding: 0 17px; text-transform: uppercase; }
      button:hover:not(:disabled) { background: #d8b64c; }
      button:disabled { cursor: not-allowed; opacity: .48; }
      .help { color: #aab4ae; font-size: 10px; line-height: 1.5; margin: 8px 0 0; }
      code { color: #f4f0e8; }
      .feedback { align-content: center; background: #202923; border-left: 3px solid #56635c; display: grid; gap: 5px; min-height: 84px; padding: 14px 16px; }
      .feedback strong { font-size: 11px; letter-spacing: .08em; text-transform: uppercase; }
      .feedback span { color: #aab4ae; font-size: 11px; line-height: 1.5; }
      .run-status { align-items: center; background: #17201b; border-top: 1px solid #47534d; display: grid; gap: 14px 22px; grid-template-columns: minmax(150px, .22fr) minmax(150px, 1fr) minmax(175px, .65fr); padding: 18px 22px; }
      .run-status-label { color: #68d39b; display: block; font-size: 10px; font-weight: 900; letter-spacing: .13em; margin-bottom: 5px; text-transform: uppercase; }
      .run-status-command { font: 800 14px ui-monospace, monospace; margin: 0; overflow-wrap: anywhere; }
      .run-status-meta { display: grid; gap: 5px; }
      .run-status-meta strong, .run-status-meta time { font-size: 11px; letter-spacing: .06em; text-transform: uppercase; }
      .run-status-meta time { color: #aab4ae; }
      .run-status-message { color: #aab4ae; font-size: 11px; line-height: 1.5; margin: 0; }
      .run-status[data-state="idle"] .run-status-label { color: #aab4ae; }
      .run-status[data-state="saved"] .run-status-label { color: #68d39b; }
      .run-status[data-state="failed"] .run-status-label { color: #ef766d; }
      .results { background: #1c241f; border-top: 1px solid #47534d; display: grid; gap: 20px; grid-template-columns: minmax(155px, .25fr) minmax(0, 1fr); padding: 22px; }
      dl { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); margin: 0; }
      dl > div { border-bottom: 1px solid #3a463f; display: grid; gap: 6px; min-width: 0; padding: 11px 13px; }
      dl > div:nth-child(odd) { border-right: 1px solid #3a463f; }
      dt { color: #aab4ae; font-size: 9px; font-weight: 850; letter-spacing: .08em; text-transform: uppercase; }
      dd { font-family: Georgia, Cambria, serif; font-size: 14px; line-height: 1.45; margin: 0; overflow-wrap: anywhere; }
      .waiting { color: #aab4ae; }
      @media (max-width: 620px) {
        .head { align-items: flex-start; flex-direction: column; }
        .console, .results, .run-status { grid-template-columns: 1fr; }
      }
      @media (max-width: 410px) {
        .head { margin: 0 14px; }
        .console, .results, .run-status { padding-left: 14px; padding-right: 14px; }
        label { align-items: flex-start; flex-direction: column; gap: 3px; }
        .controls, dl { gap: 8px; grid-template-columns: 1fr; }
        input { border-right: 1px solid #56635c; }
        button { width: 100%; }
        dl > div:nth-child(odd) { border-right: 0; }
      }
    </style>
  </head>
  <body>
    <main class="council" aria-labelledby="title">
      <header class="head">
        <div><span class="mark">HORSEE / race command desk</span><h1 id="title">Horse Racing Council</h1></div>
        <p id="bridge" class="bridge" data-state="offline" aria-live="polite">Council bridge offline</p>
      </header>
      <section class="console">
        <form id="form">
          <label for="command">Council command <span>Race + horse, with optional mode</span></label>
          <div class="controls">
            <input id="command" type="text" placeholder="R1C1 hard" autocomplete="off" spellcheck="false" />
            <button id="run" type="submit" disabled>Run Council</button>
          </div>
          <p class="help">Try <code>R1C1 hard</code>, <code>R2C7 hard</code>, or <code>R1C4</code>.</p>
        </form>
        <div class="feedback" aria-live="polite"><strong id="feedback-title">Connecting to ChatGPT</strong><span id="feedback-detail">Checking the MCP Apps bridge.</span></div>
      </section>
      <section id="run-status" class="run-status" data-state="idle" aria-live="polite" aria-labelledby="run-status-title">
        <div>
          <strong id="run-status-title" class="run-status-label">HORSEE IDLE</strong>
          <p id="run-status-command" class="run-status-command">No active Council run</p>
        </div>
        <div class="run-status-meta">
          <strong id="run-status-stage">Stage: awaiting command</strong>
          <time id="run-status-updated">Updated: —</time>
        </div>
        <p id="run-status-message" class="run-status-message">Run stages are separate from the saved Selection Board.</p>
      </section>
      <section class="results" aria-labelledby="results-title">
        <div><span class="mark">Council return / live fields</span><h2 id="results-title">Selection board</h2></div>
        <dl id="result-list"></dl>
      </section>
    </main>
    <script type="module">${HORSEE_WIDGET_SCRIPT}</script>
  </body>
</html>`;
}
