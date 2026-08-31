import { createHash } from "node:crypto";
import { promises as fs } from "node:fs";
import path from "node:path";
import { fileURLToPath } from "node:url";

const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), "..");
const capturesDir = path.join(root, "captures");

const sha256 = (value) => createHash("sha256").update(value).digest("hex");
const json = async (name) => JSON.parse(await fs.readFile(path.join(capturesDir, `${name}.json`), "utf8"));

function normalizedURL(rawURL) {
  const url = new URL(rawURL);
  for (const key of Array.from(url.searchParams.keys())) {
    if (/^(?:_|cachebust|cb|ts|timestamp)$/i.test(key)) url.searchParams.delete(key);
  }
  url.searchParams.sort();
  return url.href;
}

function normalizedResponses(capture) {
  return capture.responses.map((response) => {
    const url = new URL(normalizedURL(response.url));
    const event = capture.summary.analysisEvents.find((candidate) => {
      if (!candidate.url) return false;
      try {
        return normalizedURL(new URL(candidate.url, capture.finalURL).href) === url.href;
      } catch {
        return false;
      }
    });
    return {
      key: `${response.method} ${url.href}`,
      method: response.method,
      hostname: url.hostname,
      path: url.pathname,
      query: Object.fromEntries(url.searchParams),
      resourceType: response.resourceType,
      status: response.status,
      contentType: response.contentType,
      bodyBytes: response.bodyBytes,
      bodySha256: response.bodySha256,
      initiator: event?.stack ?? null,
    };
  }).sort((left, right) => left.key.localeCompare(right.key));
}

function structure(capture) {
  const summary = capture.summary;
  return {
    title: summary.title,
    metas: summary.metas,
    scripts: summary.scripts,
    stylesheets: summary.stylesheets,
    forms: summary.forms,
    buttons: summary.buttons,
    links: summary.links,
    iframes: summary.iframes,
    hiddenFields: summary.hiddenFields,
    bodyText: summary.bodyText,
    globals: summary.globals,
  };
}

function setDiff(left, right, selector) {
  const leftSet = new Set(left.map(selector));
  const rightSet = new Set(right.map(selector));
  return {
    onlyLeft: Array.from(leftSet).filter((value) => !rightSet.has(value)).sort(),
    onlyRight: Array.from(rightSet).filter((value) => !leftSet.has(value)).sort(),
  };
}

const names = [
  "normal", "appua", "normal_bridge", "appua_bridge",
  "control_android_hints", "appua_android_hints",
  "native_normal", "native_appua", "native_appua_bridge",
  "mobile_normal", "mobile_appua", "login_normal", "login_appua", "login_iphone",
  "iphone", "iphone_webkit",
];
const captures = Object.fromEntries(await Promise.all(names.map(async (name) => [name, await json(name)])));

const control = captures.control_android_hints;
const appua = captures.appua_android_hints;
const controlNetwork = normalizedResponses(control);
const appuaNetwork = normalizedResponses(appua);
const networkDiff = setDiff(controlNetwork, appuaNetwork, (entry) => entry.key);

const responseDifferences = [];
for (const controlEntry of controlNetwork) {
  const appEntry = appuaNetwork.find((candidate) => candidate.key === controlEntry.key);
  if (!appEntry) continue;
  const differing = ["status", "contentType", "bodyBytes", "bodySha256"]
    .filter((field) => controlEntry[field] !== appEntry[field]);
  if (differing.length) responseDifferences.push({ key: controlEntry.key, differing, control: controlEntry, appua: appEntry });
}

const evidence = {
  generatedAt: new Date().toISOString(),
  primaryComparison: {
    control: control.variant,
    appua: appua.variant,
    document: {
      control: control.responses.find((response) => response.url === "https://www.smspariaz.com/"),
      appua: appua.responses.find((response) => response.url === "https://www.smspariaz.com/"),
    },
    structureSha256: {
      control: sha256(JSON.stringify(structure(control))),
      appua: sha256(JSON.stringify(structure(appua))),
    },
    bodyTextSha256: {
      control: sha256(control.summary.bodyText),
      appua: sha256(appua.summary.bodyText),
    },
    counts: Object.fromEntries(["metas", "scripts", "stylesheets", "forms", "buttons", "links", "iframes", "hiddenFields"]
      .map((field) => [field, { control: control.summary[field].length, appua: appua.summary[field].length }])),
    cookieMetadata: {
      control: control.cookies.map(({ valueSha256, ...cookie }) => cookie),
      appua: appua.cookies.map(({ valueSha256, ...cookie }) => cookie),
    },
    localStorageKeys: {
      control: control.summary.localStorage.map((entry) => entry.key),
      appua: appua.summary.localStorage.map((entry) => entry.key),
    },
    sessionStorageKeys: {
      control: control.summary.sessionStorage.map((entry) => entry.key),
      appua: appua.summary.sessionStorage.map((entry) => entry.key),
    },
    scriptHashes: {
      control: control.scriptFiles,
      appua: appua.scriptFiles,
    },
    networkDiff,
    responseDifferences,
  },
  channelMatrix: Object.fromEntries([
    "normal", "appua", "normal_bridge", "appua_bridge",
    "native_normal", "native_appua", "native_appua_bridge",
  ].map((name) => {
    const capture = captures[name];
    return [name, {
      userAgent: capture.summary.userAgent,
      bridgePresent: capture.summary.bridgePresent,
      bridgeEvents: capture.summary.analysisEvents.filter((event) => event.kind.startsWith("bridge")),
      MOBILE: capture.summary.globals?.MOBILE ?? null,
      logalertResult: capture.logalertResult ?? null,
      links: capture.summary.links.map((link) => ({ text: link.text, href: link.href })),
      requests: capture.requests.length,
      blocked: capture.blockedNetwork,
    }];
  })),
  ios: {
    chromiumUA: {
      pageErrors: captures.iphone.pageErrors,
      consoleWarnings: captures.iphone.consoleMessages.filter((message) => message.type === "warning"),
      counts: Object.fromEntries(["forms", "buttons", "links", "iframes"].map((field) => [field, captures.iphone.summary[field].length])),
    },
    webkit: {
      pageErrors: captures.iphone_webkit.pageErrors,
      consoleWarnings: captures.iphone_webkit.consoleMessages.filter((message) => message.type === "warning"),
      counts: Object.fromEntries(["forms", "buttons", "links", "iframes"].map((field) => [field, captures.iphone_webkit.summary[field].length])),
    },
    requestDiff: setDiff(
      normalizedResponses(captures.iphone),
      normalizedResponses(captures.iphone_webkit),
      (entry) => entry.key,
    ),
  },
};

const instrumentation = Object.fromEntries(names.map((name) => [name, {
  pageEvents: captures[name].summary.analysisEvents,
  browserBlockedRequests: captures[name].blockedNetwork,
  pageErrors: captures[name].pageErrors,
} ]));

await Promise.all([
  fs.writeFile(path.join(capturesDir, "derived-comparison.json"), JSON.stringify(evidence, null, 2), "utf8"),
  fs.writeFile(path.join(capturesDir, "instrumentation-events.json"), JSON.stringify(instrumentation, null, 2), "utf8"),
  fs.writeFile(path.join(capturesDir, "network-normalized.json"), JSON.stringify({
    normal: controlNetwork,
    appua: appuaNetwork,
    onlyNormal: networkDiff.onlyLeft,
    onlyAppua: networkDiff.onlyRight,
    responseDifferences,
  }, null, 2), "utf8"),
]);

process.stdout.write(JSON.stringify({
  structureEqual: evidence.primaryComparison.structureSha256.control === evidence.primaryComparison.structureSha256.appua,
  bodyTextEqual: evidence.primaryComparison.bodyTextSha256.control === evidence.primaryComparison.bodyTextSha256.appua,
  onlyNormal: networkDiff.onlyLeft.length,
  onlyAppua: networkDiff.onlyRight.length,
  responseDifferences: responseDifferences.length,
  normalBlockedRequests: control.blockedNetwork.length,
  appuaBlockedRequests: appua.blockedNetwork.length,
}, null, 2) + "\n");
