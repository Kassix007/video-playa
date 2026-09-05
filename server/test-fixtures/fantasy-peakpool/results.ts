export const ATR_CONFIRMED_RESULT_HTML = `
<!doctype html><html><head>
<script type="application/ld+json">{"@type":"SportsEvent","startDate":"2026-09-04T14:10:00+01:00","location":{"name":"Test Course"}}</script>
</head><body>
<h1>14:10 Test Course - Race 3 - Prix Example</h1><strong>Weighed In</strong>
<div id="tab-full-result">
  <div class="card-entry" data-position="1"><span class="cloth">4</span><a class="horse-name">Alpha Star</a><span class="starting-price">4/1 F</span></div>
  <div class="card-entry" data-position="2"><span class="cloth">2</span><a class="horse-name">Beta Moon</a><span class="starting-price">7/2</span></div>
</div><div class="last-updated">Last Updated: 15:25</div>
</body></html>`;

export const ATR_DEAD_HEAT_RESULT_HTML = ATR_CONFIRMED_RESULT_HTML.replace(
  'data-position="2"><span class="cloth">2</span>',
  'data-position="1"><span class="cloth">2</span>',
);

export const ATR_PARTIAL_RESULT_HTML = `
<!doctype html><html><body><h1>14:10 Test Course - Race 3</h1><strong>Weighed In</strong>
<p>Full finishing positions to follow</p></body></html>`;

export const ATR_CHALLENGE_HTML = `<!doctype html><html><script>window._fs_ch = true;</script><body>Checking your browser</body></html>`;

export const ATR_MISSING_WINNER_PRICE_HTML = ATR_CONFIRMED_RESULT_HTML.replace(
  '<span class="starting-price">4/1 F</span>',
  "",
);

export const ATR_MALFORMED_WINNER_PRICE_HTML = ATR_CONFIRMED_RESULT_HTML.replace(
  "4/1 F",
  "javascript:alert(1)",
);

export const ATR_ZERO_DENOMINATOR_PRICE_HTML = ATR_CONFIRMED_RESULT_HTML.replace("4/1 F", "4/0");

export const ATR_NON_RUNNER_HTML = ATR_CONFIRMED_RESULT_HTML.replace(
  "</div><div class=\"last-updated\">",
  "</div><div class=\"non-runner\" data-number=\"7\">Withdrawn Horse</div><div class=\"last-updated\">",
);

export const ATR_VOID_HTML = `<!doctype html><html><body><h1>14:10 Test Course - Race 3</h1><strong>Race Abandoned</strong></body></html>`;
