import { createHash } from "node:crypto";
import { createRequire } from "node:module";
import { promises as fs } from "node:fs";
import os from "node:os";
import path from "node:path";
import { fileURLToPath } from "node:url";

const require = createRequire(import.meta.url);
const playwrightPath = process.env.PLAYWRIGHT_MODULE
  ?? path.join(os.homedir(), ".agents", "skills", "gstack", "node_modules", "playwright");
const { chromium, webkit } = require(playwrightPath);

const scriptDir = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(scriptDir, "..");
const targetURL = "https://www.smspariaz.com";
const safeMethods = new Set(["GET", "HEAD", "OPTIONS"]);
const sensitiveName = /(authorization|cookie|token|secret|password|passwd|otp|session|csrf|xsrf|code)/i;

const variants = [
  {
    key: "normal",
    label: "Normal Android mobile UA, no bridge",
    userAgent: "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Mobile Safari/537.36",
    viewport: { width: 412, height: 915 },
    bridge: false,
  },
  {
    key: "appua",
    label: "Exact SMSPARIAZAPP001 UA, no bridge",
    userAgent: "SMSPARIAZAPP001",
    viewport: { width: 412, height: 915 },
    bridge: false,
  },
  {
    key: "normal_bridge",
    label: "Normal Android mobile UA, inert bridge present",
    userAgent: "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Mobile Safari/537.36",
    viewport: { width: 412, height: 915 },
    bridge: true,
  },
  {
    key: "appua_bridge",
    label: "Exact SMSPARIAZAPP001 UA, inert bridge present",
    userAgent: "SMSPARIAZAPP001",
    viewport: { width: 412, height: 915 },
    bridge: true,
  },
  {
    key: "iphone",
    label: "Current iPhone Safari-like UA, no bridge",
    userAgent: "Mozilla/5.0 (iPhone; CPU iPhone OS 18_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.6 Mobile/15E148 Safari/604.1",
    viewport: { width: 390, height: 844 },
    deviceScaleFactor: 3,
    bridge: false,
  },
  {
    key: "mobile_normal",
    label: "Public /mobile/ page, normal Android mobile UA",
    targetURL: "https://www.smspariaz.com/mobile/",
    userAgent: "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Mobile Safari/537.36",
    viewport: { width: 412, height: 915 },
    bridge: false,
  },
  {
    key: "mobile_appua",
    label: "Public /mobile/ page, exact SMSPARIAZAPP001 UA",
    targetURL: "https://www.smspariaz.com/mobile/",
    userAgent: "SMSPARIAZAPP001",
    viewport: { width: 412, height: 915 },
    bridge: false,
  },
  {
    key: "login_normal",
    label: "Public /login/ page, normal Android mobile UA",
    targetURL: "https://www.smspariaz.com/login/",
    userAgent: "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Mobile Safari/537.36",
    viewport: { width: 412, height: 915 },
    bridge: false,
  },
  {
    key: "login_appua",
    label: "Public /login/ page, exact SMSPARIAZAPP001 UA",
    targetURL: "https://www.smspariaz.com/login/",
    userAgent: "SMSPARIAZAPP001",
    viewport: { width: 412, height: 915 },
    bridge: false,
  },
  {
    key: "login_iphone",
    label: "Public /login/ page, iPhone Safari-like UA",
    targetURL: "https://www.smspariaz.com/login/",
    userAgent: "Mozilla/5.0 (iPhone; CPU iPhone OS 18_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.6 Mobile/15E148 Safari/604.1",
    viewport: { width: 390, height: 844 },
    deviceScaleFactor: 3,
    bridge: false,
  },
  {
    key: "native_normal",
    label: "Normal Android mobile UA plus the APK's post-load logalert() injection",
    userAgent: "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Mobile Safari/537.36",
    viewport: { width: 412, height: 915 },
    bridge: false,
    injectLogalert: true,
  },
  {
    key: "native_appua",
    label: "Exact SMSPARIAZAPP001 UA plus the APK's post-load logalert() injection",
    userAgent: "SMSPARIAZAPP001",
    viewport: { width: 412, height: 915 },
    bridge: false,
    injectLogalert: true,
  },
  {
    key: "native_appua_bridge",
    label: "Exact app UA, inert bridge, and the APK's post-load logalert() injection",
    userAgent: "SMSPARIAZAPP001",
    viewport: { width: 412, height: 915 },
    bridge: true,
    injectLogalert: true,
  },
  {
    key: "iphone_webkit",
    label: "Playwright WebKit engine with current iPhone Safari-like UA",
    engine: "webkit",
    userAgent: "Mozilla/5.0 (iPhone; CPU iPhone OS 18_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.6 Mobile/15E148 Safari/604.1",
    viewport: { width: 390, height: 844 },
    deviceScaleFactor: 3,
    bridge: false,
  },
  {
    key: "control_android_hints",
    label: "Normal Android UA with fixed Android client hints",
    userAgent: "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Mobile Safari/537.36",
    viewport: { width: 412, height: 915 },
    isMobile: true,
    hasTouch: true,
    extraHTTPHeaders: {
      "sec-ch-ua-mobile": "?1",
      "sec-ch-ua-platform": "\"Android\"",
    },
    bridge: false,
  },
  {
    key: "appua_android_hints",
    label: "Exact SMSPARIAZAPP001 UA with the same fixed Android client hints",
    userAgent: "SMSPARIAZAPP001",
    viewport: { width: 412, height: 915 },
    isMobile: true,
    hasTouch: true,
    extraHTTPHeaders: {
      "sec-ch-ua-mobile": "?1",
      "sec-ch-ua-platform": "\"Android\"",
    },
    bridge: false,
  },
];

const requestedVariants = new Set(
  (process.env.ANALYSIS_VARIANTS ?? "")
    .split(",")
    .map((value) => value.trim())
    .filter(Boolean),
);
const selectedVariants = requestedVariants.size
  ? variants.filter((variant) => requestedVariants.has(variant.key))
  : variants;

function sha256(value) {
  return createHash("sha256").update(value).digest("hex");
}

function redactText(value) {
  return String(value ?? "")
    .replace(/(Bearer\s+)[A-Za-z0-9._~+\/-]+=*/gi, "$1<redacted>")
    .replace(/\beyJ[A-Za-z0-9_-]{10,}\.[A-Za-z0-9_-]{10,}(?:\.[A-Za-z0-9_-]{10,})?\b/g, "<redacted-jwt>")
    .replace(/(["']?(?:access_?token|refresh_?token|id_?token|session|csrf|xsrf|otp|password)["']?\s*[:=]\s*["'])[^"']+(["'])/gi, "$1<redacted>$2");
}

function sanitizedHeaders(headers) {
  return Object.fromEntries(
    Object.entries(headers ?? {}).map(([name, value]) => [
      name,
      sensitiveName.test(name) ? "<redacted>" : redactText(value),
    ]),
  );
}

function sanitizedURL(rawURL) {
  try {
    const url = new URL(rawURL);
    for (const [name, value] of url.searchParams.entries()) {
      if (sensitiveName.test(name) || value.length > 180) {
        url.searchParams.set(name, `<redacted:${sha256(value).slice(0, 12)}>`);
      }
    }
    return url.href;
  } catch {
    return redactText(rawURL);
  }
}

function safeFilename(value) {
  return value.replace(/[^A-Za-z0-9._-]+/g, "_").slice(0, 100) || "script";
}

function isFirstParty(rawURL) {
  try {
    const host = new URL(rawURL).hostname.toLowerCase();
    return host === "smspariaz.com" || host.endsWith(".smspariaz.com");
  } catch {
    return false;
  }
}

function sanitizeHar(har) {
  for (const entry of har.log?.entries ?? []) {
    entry.request.url = sanitizedURL(entry.request.url);
    for (const header of entry.request.headers ?? []) {
      if (sensitiveName.test(header.name)) header.value = "<redacted>";
      else header.value = redactText(header.value);
    }
    for (const cookie of entry.request.cookies ?? []) cookie.value = "<redacted>";
    for (const query of entry.request.queryString ?? []) {
      if (sensitiveName.test(query.name) || String(query.value).length > 180) {
        query.value = `<redacted:${sha256(String(query.value)).slice(0, 12)}>`;
      }
    }
    if (entry.request.postData) {
      entry.request.postData.text = "<blocked-and-redacted>";
      entry.request.postData.params = [];
    }
    for (const header of entry.response.headers ?? []) {
      if (sensitiveName.test(header.name)) header.value = "<redacted>";
      else header.value = redactText(header.value);
    }
    for (const cookie of entry.response.cookies ?? []) cookie.value = "<redacted>";
    if (entry.response.content) delete entry.response.content.text;
  }
  return har;
}

async function instrumentPage(context, bridge) {
  await context.addInitScript(({ bridgeEnabled }) => {
    const events = [];
    Object.defineProperty(window, "__codexAnalysisEvents", {
      value: events,
      configurable: false,
      enumerable: false,
      writable: false,
    });

    const safeMethods = new Set(["GET", "HEAD", "OPTIONS"]);
    const text = (value) => typeof value === "string" ? value : String(value ?? "");
    const push = (event) => {
      events.push({ at: Date.now(), ...event });
    };
    const stack = () => {
      try {
        return new Error().stack?.split("\n").slice(2, 8).join("\n") ?? "";
      } catch {
        return "";
      }
    };

    if (bridgeEnabled) {
      const bridge = new Proxy(Object.create(null), {
        get(_target, property) {
          if (typeof property === "string") push({ kind: "bridgeGet", property, stack: stack() });
          return undefined;
        },
        has(_target, property) {
          if (typeof property === "string") push({ kind: "bridgeHas", property, stack: stack() });
          return false;
        },
      });
      Object.defineProperty(window, "WebToNativeInterface", {
        value: bridge,
        configurable: false,
        enumerable: false,
        writable: false,
      });
    }

    const originalFetch = window.fetch?.bind(window);
    if (originalFetch) {
      window.fetch = (input, init = {}) => {
        const method = text(init.method || input?.method || "GET").toUpperCase();
        const url = text(typeof input === "string" ? input : input?.url);
        push({ kind: "fetch", method, url, contentType: text(init.headers?.["content-type"] ?? ""), stack: stack() });
        if (!safeMethods.has(method)) {
          return Promise.reject(new DOMException("Blocked by static web-analysis harness", "SecurityError"));
        }
        return originalFetch(input, init);
      };
    }

    const xhrMeta = new WeakMap();
    const originalOpen = XMLHttpRequest.prototype.open;
    const originalSend = XMLHttpRequest.prototype.send;
    XMLHttpRequest.prototype.open = function(method, url, ...rest) {
      const meta = { method: text(method).toUpperCase(), url: text(url), stack: stack() };
      xhrMeta.set(this, meta);
      push({ kind: "xhrOpen", ...meta });
      return originalOpen.call(this, method, url, ...rest);
    };
    XMLHttpRequest.prototype.send = function(body) {
      const meta = xhrMeta.get(this) ?? { method: "GET", url: "", stack: stack() };
      push({ kind: "xhrSend", ...meta, contentType: "" });
      if (!safeMethods.has(meta.method)) {
        this.abort();
        throw new DOMException("Blocked by static web-analysis harness", "SecurityError");
      }
      return originalSend.call(this, body);
    };

    const originalSubmit = HTMLFormElement.prototype.submit;
    HTMLFormElement.prototype.submit = function() {
      const method = text(this.method || "GET").toUpperCase();
      push({ kind: "formSubmit", method, url: text(this.action), stack: stack() });
      if (!safeMethods.has(method)) {
        throw new DOMException("Blocked by static web-analysis harness", "SecurityError");
      }
      return originalSubmit.call(this);
    };
    document.addEventListener("submit", (event) => {
      const form = event.target;
      const method = text(form?.method || "GET").toUpperCase();
      push({ kind: "formEvent", method, url: text(form?.action), stack: stack() });
      if (!safeMethods.has(method)) {
        event.preventDefault();
        event.stopImmediatePropagation();
      }
    }, true);

    if (typeof navigator.sendBeacon === "function") {
      navigator.sendBeacon = (url) => {
        push({ kind: "sendBeacon", method: "POST", url: text(url), stack: stack() });
        return false;
      };
    }

    if (typeof window.WebSocket === "function") {
      window.WebSocket = new Proxy(window.WebSocket, {
        construct(_target, args) {
          push({ kind: "webSocket", method: "CONNECT", url: text(args[0]), stack: stack() });
          throw new DOMException("WebSocket blocked by static web-analysis harness", "SecurityError");
        },
      });
    }
  }, { bridgeEnabled: bridge });
}

async function captureDOM(page) {
  return page.evaluate(async () => {
    const normalize = (value) => String(value ?? "").replace(/\s+/g, " ").trim();
    const attrs = (element) => Object.fromEntries(
      Array.from(element.attributes ?? [])
        .filter((attribute) => attribute.name.startsWith("data-"))
        .map((attribute) => [attribute.name, normalize(attribute.value).slice(0, 300)]),
    );
    const hashValue = async (value) => {
      const bytes = new TextEncoder().encode(String(value));
      const digest = await crypto.subtle.digest("SHA-256", bytes);
      return Array.from(new Uint8Array(digest)).map((byte) => byte.toString(16).padStart(2, "0")).join("");
    };
    const storage = async (area) => Promise.all(
      Object.keys(area).sort().map(async (key) => {
        const value = area.getItem(key) ?? "";
        return { key, valueLength: value.length, valueSha256: await hashValue(value) };
      }),
    );

    const summary = {
      url: location.href,
      title: document.title,
      userAgent: navigator.userAgent,
      bridgePresent: "WebToNativeInterface" in window,
      globals: {
        MOBILE: typeof window.MOBILE === "undefined" ? null : window.MOBILE,
        PAGE: typeof window.PAGE === "undefined" ? null : window.PAGE,
        BASE: typeof window.BASE === "undefined" ? null : window.BASE,
      },
      metas: Array.from(document.querySelectorAll("meta")).map((element) => ({
        name: element.getAttribute("name"),
        property: element.getAttribute("property"),
        httpEquiv: element.getAttribute("http-equiv"),
        content: /token|csrf|session|auth/i.test(element.getAttribute("name") ?? "")
          ? "<redacted>"
          : normalize(element.getAttribute("content")).slice(0, 500),
      })),
      scripts: Array.from(document.scripts).map((element, index) => ({
        index,
        src: element.src,
        type: element.type,
        async: element.async,
        defer: element.defer,
        integrity: element.integrity,
        inlineLength: element.src ? 0 : element.textContent.length,
        inlinePreview: element.src ? "" : normalize(element.textContent).slice(0, 300),
      })),
      stylesheets: Array.from(document.querySelectorAll('link[rel~="stylesheet"]')).map((element) => element.href),
      forms: Array.from(document.forms).map((form, index) => ({
        index,
        id: form.id,
        name: form.name,
        action: form.action,
        method: normalize(form.method || "GET").toUpperCase(),
        className: form.className,
        text: normalize(form.innerText).slice(0, 500),
        data: attrs(form),
        fields: Array.from(form.elements).map((field) => ({
          tag: field.tagName,
          type: field.type,
          name: field.name,
          id: field.id,
          className: field.className,
        })),
      })),
      buttons: Array.from(document.querySelectorAll('button, input[type="button"], input[type="submit"], [role="button"]')).map((element, index) => ({
        index,
        tag: element.tagName,
        id: element.id,
        className: element.className,
        text: normalize(element.innerText || element.value || element.textContent).slice(0, 500),
        data: attrs(element),
      })),
      links: Array.from(document.links).map((element, index) => ({
        index,
        text: normalize(element.innerText || element.textContent).slice(0, 300),
        href: element.href,
        id: element.id,
        className: element.className,
        data: attrs(element),
      })),
      iframes: Array.from(document.querySelectorAll("iframe")).map((element, index) => ({
        index,
        src: element.src,
        name: element.name,
        title: element.title,
        id: element.id,
        className: element.className,
        data: attrs(element),
      })),
      hiddenFields: Array.from(document.querySelectorAll('input[type="hidden"]')).map((element) => ({
        name: element.name,
        id: element.id,
        valueLength: element.value.length,
      })),
      bodyText: normalize(document.body?.innerText).slice(0, 200_000),
      localStorage: await storage(localStorage),
      sessionStorage: await storage(sessionStorage),
      analysisEvents: Array.from(window.__codexAnalysisEvents ?? []),
    };

    const clone = document.documentElement.cloneNode(true);
    clone.querySelectorAll("input, textarea").forEach((element) => {
      element.removeAttribute("value");
      if (element.tagName === "TEXTAREA") element.textContent = "";
    });
    clone.querySelectorAll("meta").forEach((element) => {
      if (/token|csrf|session|auth/i.test(element.getAttribute("name") ?? "")) {
        element.setAttribute("content", "<redacted>");
      }
    });
    return { summary, sanitizedHTML: `<!DOCTYPE html>\n${clone.outerHTML}` };
  });
}

async function runVariant(browser, variant) {
  const currentTargetURL = variant.targetURL ?? targetURL;
  const rawHarPath = path.join(root, "captures", `.raw-${variant.key}.har`);
  const harPath = path.join(root, "captures", `${variant.key}.har`);
  const capturePath = path.join(root, "captures", `${variant.key}.json`);
  const htmlPath = path.join(root, "html", `${variant.key}.html`);
  const screenshotPath = path.join(root, "screenshots", `${variant.key}.png`);

  const context = await browser.newContext({
    userAgent: variant.userAgent,
    viewport: variant.viewport,
    deviceScaleFactor: variant.deviceScaleFactor ?? 1,
    isMobile: variant.isMobile ?? false,
    hasTouch: variant.hasTouch ?? false,
    extraHTTPHeaders: variant.extraHTTPHeaders,
    locale: "en-MU",
    timezoneId: "Indian/Mauritius",
    javaScriptEnabled: true,
    serviceWorkers: "block",
    acceptDownloads: false,
    recordHar: { path: rawHarPath, content: "omit", mode: "full" },
  });

  const blockedNetwork = [];
  await context.route("**/*", async (route) => {
    const request = route.request();
    const method = request.method().toUpperCase();
    if (!safeMethods.has(method) || request.resourceType() === "websocket") {
      blockedNetwork.push({
        at: Date.now(),
        method,
        url: sanitizedURL(request.url()),
        resourceType: request.resourceType(),
        headers: sanitizedHeaders(await request.allHeaders()),
      });
      await route.abort("blockedbyclient");
      return;
    }
    await route.continue();
  });
  await instrumentPage(context, variant.bridge);

  const page = await context.newPage();
  const consoleMessages = [];
  const pageErrors = [];
  const requests = [];
  const responses = [];
  const popups = [];
  const scriptFiles = [];
  const responseTasks = [];

  page.on("console", (message) => {
    consoleMessages.push({ type: message.type(), text: redactText(message.text()), location: message.location() });
  });
  page.on("pageerror", (error) => pageErrors.push(redactText(error.stack || error.message)));
  page.on("popup", async (popup) => {
    popups.push({ url: sanitizedURL(popup.url()) });
    await popup.close().catch(() => {});
  });
  page.on("request", (request) => {
    requests.push({
      method: request.method(),
      url: sanitizedURL(request.url()),
      resourceType: request.resourceType(),
      redirectFrom: request.redirectedFrom() ? sanitizedURL(request.redirectedFrom().url()) : null,
    });
  });
  page.on("response", (response) => {
    responseTasks.push((async () => {
      const request = response.request();
      const headers = await response.allHeaders().catch(() => ({}));
      const contentType = headers["content-type"] ?? "";
      const metadata = {
        method: request.method(),
        url: sanitizedURL(response.url()),
        resourceType: request.resourceType(),
        status: response.status(),
        contentType,
        headers: sanitizedHeaders(headers),
        bodyBytes: null,
        bodySha256: null,
        textPreview: null,
      };
      const textual = /(?:text|javascript|json|xml|css|html)/i.test(contentType)
        || ["document", "script", "xhr", "fetch", "stylesheet"].includes(request.resourceType());
      if (textual && request.method() === "GET" && response.status() < 400) {
        try {
          const body = await response.body();
          metadata.bodyBytes = body.length;
          metadata.bodySha256 = sha256(body);
          metadata.textPreview = redactText(body.toString("utf8").slice(0, 500));
          if (request.resourceType() === "script" && isFirstParty(response.url())) {
            const url = new URL(response.url());
            const base = safeFilename(path.basename(url.pathname) || "script.js");
            const filename = `${variant.key}__${safeFilename(url.hostname)}__${base}__${metadata.bodySha256.slice(0, 12)}.js`;
            const destination = path.join(root, "js", filename);
            await fs.writeFile(destination, body);
            scriptFiles.push({ filename, url: sanitizedURL(response.url()), bytes: body.length, sha256: metadata.bodySha256 });
          }
        } catch (error) {
          metadata.bodyError = redactText(error.message);
        }
      }
      responses.push(metadata);
    })());
  });

  let navigationError = null;
  let networkIdle = false;
  try {
    await page.goto(currentTargetURL, { waitUntil: "domcontentloaded", timeout: 30_000 });
    await page.waitForLoadState("networkidle", { timeout: 20_000 });
    networkIdle = true;
  } catch (error) {
    navigationError = redactText(error.message);
  }
  await page.waitForTimeout(5_000);
  await Promise.allSettled(responseTasks);

  let logalertResult = null;
  if (variant.injectLogalert) {
    logalertResult = await page.evaluate(() => {
      if (typeof window.logalert !== "function") {
        return { called: false, reason: "logalert is not defined" };
      }
      window.logalert();
      return { called: true, mobile: window.MOBILE };
    });
  }

  const { summary, sanitizedHTML } = await captureDOM(page);
  const cookies = (await context.cookies()).map((cookie) => ({
    name: cookie.name,
    domain: cookie.domain,
    path: cookie.path,
    secure: cookie.secure,
    httpOnly: cookie.httpOnly,
    sameSite: cookie.sameSite,
    expires: cookie.expires,
    valueLength: cookie.value.length,
    valueSha256: sha256(cookie.value),
  }));
  await page.screenshot({ path: screenshotPath, fullPage: true });
  await fs.writeFile(htmlPath, redactText(sanitizedHTML), "utf8");
  await fs.writeFile(capturePath, JSON.stringify({
    capturedAt: new Date().toISOString(),
    targetURL: currentTargetURL,
    variant,
    finalURL: sanitizedURL(page.url()),
    networkIdle,
    navigationError,
    logalertResult,
    cookies,
    summary,
    requests,
    responses,
    blockedNetwork,
    consoleMessages,
    pageErrors,
    popups,
    scriptFiles,
  }, null, 2), "utf8");

  await context.close();
  const rawHar = JSON.parse(await fs.readFile(rawHarPath, "utf8"));
  await fs.writeFile(harPath, JSON.stringify(sanitizeHar(rawHar), null, 2), "utf8");
  await fs.unlink(rawHarPath);

  return {
    key: variant.key,
    finalURL: summary.url,
    title: summary.title,
    requests: requests.length,
    responses: responses.length,
    blocked: blockedNetwork.length,
    scripts: scriptFiles.length,
    cookies: cookies.length,
    localStorage: summary.localStorage.length,
    sessionStorage: summary.sessionStorage.length,
    bridgeEvents: summary.analysisEvents.filter((event) => event.kind.startsWith("bridge")).length,
    navigationError,
  };
}

await Promise.all([
  fs.mkdir(path.join(root, "captures"), { recursive: true }),
  fs.mkdir(path.join(root, "html"), { recursive: true }),
  fs.mkdir(path.join(root, "js"), { recursive: true }),
  fs.mkdir(path.join(root, "screenshots"), { recursive: true }),
]);

const results = [];
const browsers = new Map();
try {
  for (const variant of selectedVariants) {
    const engineName = variant.engine ?? "chromium";
    if (!browsers.has(engineName)) {
      const engine = engineName === "webkit" ? webkit : chromium;
      browsers.set(engineName, await engine.launch({ headless: true }));
    }
    const browser = browsers.get(engineName);
    results.push(await runVariant(browser, variant));
  }
} finally {
  await Promise.all(Array.from(browsers.values()).map((browser) => browser.close()));
}

await fs.writeFile(path.join(root, "captures", "run-summary.json"), JSON.stringify(results, null, 2), "utf8");
process.stdout.write(`${JSON.stringify(results, null, 2)}\n`);
