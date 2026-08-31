import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import vm from 'node:vm';
import { fileURLToPath } from 'node:url';
import ts from 'typescript';

const projectRoot = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const source = fs.readFileSync(path.join(projectRoot, 'src/web/requestGuard.ts'), 'utf8');
const transpiled = ts.transpileModule(source, {
  compilerOptions: {
    module: ts.ModuleKind.CommonJS,
    target: ts.ScriptTarget.ES2020,
  },
}).outputText;

const module = { exports: {} };
new Function('exports', 'module', 'require', transpiled)(module.exports, module, () => {
  throw new Error('Unexpected import in requestGuard.ts');
});

const {
  ALLOW_CHECKLOGIN,
  ALLOW_PLACEBET_QA,
  REQUEST_GUARD_CONFIG,
  buildRequestGuardScript,
} = module.exports;
assert.equal(typeof buildRequestGuardScript, 'function');
assert.equal(ALLOW_CHECKLOGIN, true, 'project default should allow session validation');
assert.equal(ALLOW_PLACEBET_QA, true, 'source QA switch should be enabled');
assert.equal(REQUEST_GUARD_CONFIG.allowChecklogin, true);
assert.equal(
  REQUEST_GUARD_CONFIG.allowPlacebetQa,
  false,
  'non-Expo/release-like runtime must keep placebet blocked',
);

function createGuardContext({ allowChecklogin, allowPlacebetQa }) {
  const transmissions = [];
  const messages = [];
  const warnings = [];
  const info = [];
  const documentListeners = new Map();

  class FakeProgressEvent {
    constructor(type) {
      this.type = type;
    }
  }

  class FakeXHR {
    constructor() {
      this.events = [];
      this.headers = [];
      this.opened = null;
      this.listeners = new Map();
      this.status = 0;
    }

    open(method, url) {
      this.opened = { method, url };
    }

    setRequestHeader(name, value) {
      this.headers.push([name, value]);
    }

    send(body) {
      transmissions.push({ transport: 'xhr', method: this.opened?.method, url: this.opened?.url, body });
      this.status = 200;
      this.dispatchEvent(new FakeProgressEvent('load'));
      this.dispatchEvent(new FakeProgressEvent('loadend'));
    }

    abort() {
      this.aborted = true;
    }

    dispatchEvent(event) {
      this.events.push(event.type);
      for (const listener of this.listeners.get(event.type) ?? []) listener(event);
      return true;
    }

    addEventListener(type, listener) {
      const listeners = this.listeners.get(type) ?? [];
      listeners.push(listener);
      this.listeners.set(type, listeners);
    }
  }

  class FakeForm {
    constructor(action, method = 'GET') {
      this.attributes = new Map([
        ['action', action],
        ['method', method],
      ]);
    }

    getAttribute(name) {
      return this.attributes.get(name) ?? null;
    }

    submit() {
      transmissions.push({
        transport: 'form',
        method: this.getAttribute('method'),
        url: this.getAttribute('action'),
      });
    }

    requestSubmit() {
      this.submit();
    }
  }

  const navigator = {
    sendBeacon(url, data) {
      transmissions.push({ transport: 'beacon', method: 'POST', url, body: data });
      return true;
    },
  };

  const context = {
    URL,
    WeakMap,
    Promise,
    DOMException,
    ProgressEvent: FakeProgressEvent,
    setTimeout(callback) {
      callback();
      return 1;
    },
    clearTimeout() {},
    console: {
      warn(message) {
        warnings.push(String(message));
      },
      info(message) {
        info.push(String(message));
      },
    },
    location: { href: 'https://www.smspariaz.com/' },
    navigator,
    XMLHttpRequest: FakeXHR,
    HTMLFormElement: FakeForm,
    WebSocket: class FakeWebSocket {},
    document: {
      addEventListener(type, listener) {
        documentListeners.set(type, listener);
      },
    },
    ReactNativeWebView: {
      postMessage(raw) {
        messages.push(JSON.parse(raw));
      },
    },
    fetch(input, init = {}) {
      transmissions.push({
        transport: 'fetch',
        method: init.method ?? input?.method ?? 'GET',
        url: input?.url ?? input,
        body: init.body,
      });
      return Promise.resolve({ ok: true, status: 204 });
    },
  };
  context.window = context;

  vm.runInNewContext(buildRequestGuardScript({ allowChecklogin, allowPlacebetQa }), context, {
    filename: 'request-guard-injected.js',
  });

  return { context, transmissions, messages, warnings, info, FakeForm, documentListeners };
}

const guarded = createGuardContext({ allowChecklogin: false, allowPlacebetQa: false });

await assert.rejects(
  guarded.context.fetch('https://www.smspariaz.com/placebet/', {
    method: 'POST',
    body: 'loginid=secret&token=secret&message=secret',
  }),
  /Blocked by SMSPariaz development guard/,
);
assert.equal(guarded.transmissions.length, 0, 'blocked fetch must not reach the original transport');

await guarded.context.fetch('https://www.smspariaz.com/service/local_json.php', { method: 'GET' });
assert.equal(guarded.transmissions.length, 1, 'ordinary GET fetch must pass through');

const blockedXHR = new guarded.context.XMLHttpRequest();
blockedXHR.open('POST', 'https://www.smspariaz.com/registerremote/');
blockedXHR.setRequestHeader('content-type', 'application/x-www-form-urlencoded');
blockedXHR.send('private-registration-fields');
assert.equal(
  guarded.transmissions.filter((entry) => entry.transport === 'xhr').length,
  0,
  'blocked XHR must not call the original send',
);
assert.equal(blockedXHR.aborted, true);

const allowedXHR = new guarded.context.XMLHttpRequest();
allowedXHR.open('GET', 'https://www.smspariaz.com/service/local_json.php');
allowedXHR.send();
assert.equal(
  guarded.transmissions.filter((entry) => entry.transport === 'xhr').length,
  1,
  'ordinary XHR must pass through',
);

assert.equal(
  guarded.context.navigator.sendBeacon('https://www.smspariaz.com/checklogin/', 'private-auth-fields'),
  false,
  'checklogin beacon is blocked when the policy is explicitly disabled',
);
assert.equal(
  guarded.transmissions.filter((entry) => entry.transport === 'beacon').length,
  0,
);

const blockedForm = new guarded.FakeForm('https://www.smspariaz.com/placebet/', 'POST');
blockedForm.submit();
assert.equal(
  guarded.transmissions.filter((entry) => entry.transport === 'form').length,
  0,
  'protected form submit must not call the original submit',
);

const allowedForm = new guarded.FakeForm('https://www.smspariaz.com/public-search/', 'GET');
allowedForm.submit();
assert.equal(
  guarded.transmissions.filter((entry) => entry.transport === 'form').length,
  1,
  'unrelated form submit must pass through',
);

assert.ok(guarded.messages.length >= 4, 'blocked requests should be reported');
for (const message of guarded.messages) {
  assert.deepEqual(
    Object.keys(message).sort(),
    ['method', 'path', 'type'],
    'blocked message must contain metadata only',
  );
  assert.equal(message.type, 'REQUEST_BLOCKED');
  assert.equal(JSON.stringify(message).includes('secret'), false, 'blocked metadata must omit payload values');
}

const checkloginAllowed = createGuardContext({ allowChecklogin: true, allowPlacebetQa: false });
await checkloginAllowed.context.fetch('https://www.smspariaz.com/checklogin/', {
  method: 'POST',
  body: 'private-auth-fields',
});
assert.equal(checkloginAllowed.transmissions.length, 1, 'checklogin may pass only when explicitly enabled');

await assert.rejects(
  checkloginAllowed.context.fetch('https://www.smspariaz.com/placebet/', {
    method: 'POST',
    body: 'private-wager-fields',
  }),
  /Blocked by SMSPariaz development guard/,
);
assert.equal(
  checkloginAllowed.transmissions.length,
  1,
  'placebet remains blocked even when checklogin is enabled',
);

const qaAllowed = createGuardContext({ allowChecklogin: true, allowPlacebetQa: true });
await qaAllowed.context.fetch('https://www.smspariaz.com/placebet/', {
  method: 'POST',
  body: 'private-wager-fields-never-logged',
});
assert.equal(qaAllowed.transmissions.length, 1, 'QA fetch should reach the original transport');

const qaXHR = new qaAllowed.context.XMLHttpRequest();
qaXHR.open('POST', 'https://www.smspariaz.com/placebet/');
qaXHR.send('private-xhr-wager-fields-never-logged');
assert.equal(
  qaAllowed.transmissions.filter((entry) => entry.transport === 'xhr').length,
  1,
  'QA XHR should reach the original transport',
);

const qaMessages = qaAllowed.messages.filter((message) => message.type === 'QA_PLACEBET_EVENT');
assert.deepEqual(
  qaMessages.map((message) => `${message.transport}:${message.stage}`),
  ['fetch:START', 'fetch:COMPLETE', 'xhr:START', 'xhr:COMPLETE'],
  'QA lifecycle should report start and completion for fetch and XHR',
);
for (const message of qaMessages) {
  assert.deepEqual(
    Object.keys(message).sort(),
    ['method', 'path', 'stage', 'status', 'transport', 'type'],
    'QA message must contain lifecycle metadata only',
  );
  assert.equal(JSON.stringify(message).includes('private'), false);
}

console.log(JSON.stringify({
  result: 'PASS',
  defaultAllowChecklogin: ALLOW_CHECKLOGIN,
  sourceAllowPlacebetQa: ALLOW_PLACEBET_QA,
  releaseLikeAllowPlacebetQa: REQUEST_GUARD_CONFIG.allowPlacebetQa,
  guardedMessages: guarded.messages.length,
  normalTransmissions: guarded.transmissions.length,
  allowCheckloginTransmissions: checkloginAllowed.transmissions.length,
  qaPlacebetTransmissions: qaAllowed.transmissions.length,
  qaLifecycleMessages: qaMessages.length,
  sensitiveValuesInMessages: false,
}, null, 2));
