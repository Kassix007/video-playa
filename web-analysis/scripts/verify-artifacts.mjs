import crypto from 'node:crypto';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const workspace = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..', '..');
const webRoot = path.join(workspace, 'web-analysis');
const failures = [];
const checks = [];

function check(condition, message) {
  checks.push({ ok: Boolean(condition), message });
  if (!condition) failures.push(message);
}

function read(relativePath) {
  return fs.readFileSync(path.join(workspace, relativePath), 'utf8');
}

function json(relativePath) {
  return JSON.parse(read(relativePath));
}

function sha256(relativePath) {
  return crypto.createHash('sha256').update(fs.readFileSync(path.join(workspace, relativePath))).digest('hex');
}

const reportNames = [
  '01_dom_diff.md',
  '02_network_diff.md',
  '03_javascript_analysis.md',
  '04_channel_detection.md',
  '05_place_bet_web_flow.md',
  '06_bridge_usage.md',
  '07_ios_web_compatibility.md',
  '08_ios_port_plan.md',
  'FINAL_WEB_ANALYSIS.md',
];

for (const name of reportNames) {
  const reportPath = path.join(webRoot, 'reports', name);
  check(fs.existsSync(reportPath) && fs.statSync(reportPath).size > 500, `report present and non-empty: ${name}`);
}

const finalReport = read('web-analysis/reports/FINAL_WEB_ANALYSIS.md');
check(
  finalReport.startsWith('Does SMSPARIAZAPP001 change website behavior: NO for fresh unauthenticated public GETs; authenticated/backend behavior remains UNKNOWN'),
  'final report begins with the requested answer and qualification',
);

const derived = json('web-analysis/captures/derived-comparison.json');
const primary = derived.primaryComparison;
check(primary.control.userAgent !== primary.appua.userAgent, 'controlled pair has different complete user agents');
check(primary.appua.userAgent === 'SMSPARIAZAPP001', 'app context uses the exact complete app UA');
check(
  primary.control.extraHTTPHeaders['sec-ch-ua-mobile'] === primary.appua.extraHTTPHeaders['sec-ch-ua-mobile']
    && primary.control.extraHTTPHeaders['sec-ch-ua-platform'] === primary.appua.extraHTTPHeaders['sec-ch-ua-platform'],
  'controlled pair holds Android client hints constant',
);
check(primary.document.control.bodySha256 === primary.document.appua.bodySha256, 'controlled documents are byte-identical');
check(primary.structureSha256.control === primary.structureSha256.appua, 'controlled rendered structures are identical');
check(primary.bodyTextSha256.control === primary.bodyTextSha256.appua, 'controlled rendered body text is identical');
check(primary.networkDiff.onlyLeft.length === 0 && primary.networkDiff.onlyRight.length === 0, 'controlled request sets are identical');
check(primary.responseDifferences.length === 0, 'controlled response metadata/bodies have no differences');

const expectedStructureHash = 'd56fddbc7d746b65501944e18d6ecbd40345e619baad5c9186d9d194abe72288';
check(primary.structureSha256.control === expectedStructureHash, 'reported structure hash matches derived evidence');
check(read('web-analysis/reports/01_dom_diff.md').includes(expectedStructureHash), 'DOM report contains the derived structure hash');

const capturesDirectory = path.join(webRoot, 'captures');
const captureFiles = fs.readdirSync(capturesDirectory)
  .filter((name) => name.endsWith('.json'))
  .filter((name) => !['derived-comparison.json', 'instrumentation-events.json', 'network-normalized.json'].includes(name));

let unsafeCapturedRequests = 0;
let browserBlockedRequests = 0;
for (const name of captureFiles) {
  const capture = JSON.parse(fs.readFileSync(path.join(capturesDirectory, name), 'utf8'));
  unsafeCapturedRequests += (capture.requests ?? []).filter(
    (request) => !['GET', 'HEAD', 'OPTIONS'].includes(String(request.method).toUpperCase()),
  ).length;
  browserBlockedRequests += (capture.blockedNetwork ?? []).length;
}
check(captureFiles.length >= 16, 'all planned public browser variants have capture JSON');
check(unsafeCapturedRequests === 0, 'no captured browser request used a state-changing method');
check(browserBlockedRequests === 0, 'no page attempted a browser request that the network layer had to block');

const instrumentation = json('web-analysis/captures/instrumentation-events.json');
const instrumentedEvents = Object.values(instrumentation).flatMap((entry) => entry.pageEvents ?? []);
check(
  instrumentedEvents.every((event) => ['GET', 'HEAD', 'OPTIONS'].includes(String(event.method).toUpperCase())),
  'instrumentation recorded only safe request methods',
);
const bridgeEvents = instrumentedEvents.filter((event) => String(event.kind).toLowerCase().startsWith('bridge'));
check(bridgeEvents.length === 0, 'inert bridge variants recorded no bridge property access');

for (const name of ['native_normal', 'native_appua', 'native_appua_bridge']) {
  const capture = json(`web-analysis/captures/${name}.json`);
  check(Number(capture.summary.globals.MOBILE) === 1, `${name} reaches MOBILE=1 through the reproduced native hook`);
}

const localHashes = {
  'web-analysis/js/mobile.js': '28ef56d4f2faee9f9ed281f930dd9a87c078f396d76b7f7d45f03c49626a50cf',
  'web-analysis/js/site.js': 'c92c88aab54219503311df8baa8fab6280e1db1bb33ed0db28ea827732fa2547',
  'web-analysis/js/jquery.js': 'f7f6a5894f1d19ddad6fa392b2ece2c5e578cbf7da4ea805b6885eb6985b6e3d',
  'web-analysis/js/service-worker.js': 'b3ed26b0e3232f7366628749c69d7556ef2ca332b7ed84f662dc9752b8842846',
};
for (const [file, expected] of Object.entries(localHashes)) {
  check(sha256(file) === expected, `local normalized hash matches report: ${path.basename(file)}`);
}

const mobileJS = read('web-analysis/js/mobile.js');
check(mobileJS.includes("BASE + 'checklogin/'") && mobileJS.includes("BASE + 'placebet/'"), 'saved public JavaScript contains the statically reported endpoints');
check(mobileJS.includes('function logalert()') && mobileJS.includes('MOBILE = 1'), 'saved public JavaScript contains the app-mode hook');

const iosFiles = [
  'SMSPariazApp.swift',
  'ContentView.swift',
  'SMSPariazWebView.swift',
  'WebViewCoordinator.swift',
  'NativeBridge.swift',
];
const project = read('ios-wrapper/SMSPariazWebWrapper.xcodeproj/project.pbxproj');
for (const name of iosFiles) {
  const relativePath = `ios-wrapper/SMSPariazWebWrapper/${name}`;
  check(fs.existsSync(path.join(workspace, relativePath)), `iOS source present: ${name}`);
  check(project.includes(`${name} in Sources`), `Xcode project compiles source: ${name}`);
}

const iosSource = iosFiles.map((name) => read(`ios-wrapper/SMSPariazWebWrapper/${name}`)).join('\n');
check(!iosSource.includes('SMSPARIAZAPP001'), 'iOS production source does not spoof the Android UA');
check(!iosSource.includes('URLSession'), 'iOS wrapper contains no native request client');
check(iosSource.includes('configuration.websiteDataStore = .default()'), 'iOS wrapper uses persistent website data storage');
check(iosSource.includes("typeof window.logalert === 'function'"), 'iOS wrapper reproduces only the evidenced mode hook');
for (const primitive of ['window.fetch', 'XMLHttpRequest', 'HTMLFormElement', 'sendBeacon', 'WebSocket']) {
  check(iosSource.includes(primitive), `research safety script instruments ${primitive}`);
}
check(iosSource.includes('state-changing-navigation') && iosSource.includes('decisionHandler(.cancel)'), 'native navigation policy independently blocks unsafe navigation');

console.log(JSON.stringify({
  result: failures.length === 0 ? 'PASS' : 'FAIL',
  checks: checks.length,
  failures,
  captureFiles: captureFiles.length,
  unsafeCapturedRequests,
  browserBlockedRequests,
}, null, 2));

if (failures.length > 0) process.exitCode = 1;
