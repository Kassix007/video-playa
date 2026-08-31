import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import vm from 'node:vm';
import { fileURLToPath } from 'node:url';
import ts from 'typescript';

const projectRoot = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const source = fs.readFileSync(path.join(projectRoot, 'src/web/injectedAppMode.ts'), 'utf8');
const transpiled = ts.transpileModule(source, {
  compilerOptions: {
    module: ts.ModuleKind.CommonJS,
    target: ts.ScriptTarget.ES2020,
  },
}).outputText;

const module = { exports: {} };
new Function('exports', 'module', 'require', transpiled)(module.exports, module, () => {
  throw new Error('Unexpected import in injectedAppMode.ts');
});

const { buildAppModeInjection } = module.exports;
assert.equal(typeof buildAppModeInjection, 'function');

function runAppMode({ includeHook }) {
  const messages = [];
  let hookCalls = 0;
  let scheduledCalls = 0;

  class FakeMutationObserver {
    constructor(callback) {
      this.callback = callback;
    }

    observe() {}
    disconnect() {}
  }

  const links = [{ textContent: 'Login' }, { textContent: 'Create Account' }];
  const selectors = new Set(['.footer-betslip']);
  const context = {
    URL,
    Number,
    MutationObserver: FakeMutationObserver,
    document: {
      title: 'SMS PARIAZ LTD',
      documentElement: {},
      querySelector(selector) {
        return selectors.has(selector) ? { selector } : null;
      },
      querySelectorAll(selector) {
        return selector === 'a' ? links : [];
      },
    },
    location: { href: 'https://www.smspariaz.com/?ignored=sensitive' },
    localStorage: {
      getItem(name) {
        return name === 'loginid' ? 'private-value-never-posted' : null;
      },
    },
    ReactNativeWebView: {
      postMessage(raw) {
        messages.push(JSON.parse(raw));
      },
    },
    setTimeout(callback) {
      scheduledCalls += 1;
      callback();
      return scheduledCalls;
    },
    clearTimeout() {},
  };
  context.window = context;

  if (includeHook) {
    context.logalert = () => {
      hookCalls += 1;
      context.MOBILE = 1;
    };
  }

  vm.runInNewContext(buildAppModeInjection(), context, {
    filename: 'app-mode-injected.js',
  });

  return { messages, hookCalls, scheduledCalls };
}

const activated = runAppMode({ includeHook: true });
assert.equal(activated.hookCalls, 1, 'logalert should run once when it synchronously activates app mode');
const activeStatus = activated.messages.find((message) => message.type === 'APP_MODE_STATUS');
assert.deepEqual(
  activeStatus,
  { type: 'APP_MODE_STATUS', attempt: 1, logalertFound: true, mobile: 1 },
  'first successful attempt should report MOBILE=1',
);
assert.ok(
  activated.messages.some(
    (message) =>
      message.type === 'UI_STATUS' &&
      message.footerBetslipExists === true &&
      message.loginControlExists === true &&
      message.registerControlExists === true,
  ),
  'UI probe should report selector/control booleans',
);
assert.ok(
  activated.messages.some(
    (message) =>
      message.type === 'AUTH_STORAGE_STATUS' &&
      message.loginIdExists === true &&
      message.phoneExists === false &&
      message.tokenExists === false,
  ),
  'storage probe should report existence only',
);
assert.equal(
  JSON.stringify(activated.messages).includes('private-value-never-posted'),
  false,
  'storage values must never cross the bridge',
);
const pageInfo = activated.messages.find((message) => message.type === 'PAGE_INFO');
assert.equal(pageInfo.url, 'https://www.smspariaz.com/', 'page metadata should omit query and fragment');

const missingHook = runAppMode({ includeHook: false });
const missingStatuses = missingHook.messages.filter((message) => message.type === 'APP_MODE_STATUS');
assert.equal(missingHook.hookCalls, 0);
assert.equal(missingStatuses.length, 5, 'missing hook should stop after five bounded attempts');
assert.deepEqual(
  missingStatuses.map((message) => message.attempt),
  [1, 2, 3, 4, 5],
);
assert.ok(missingStatuses.every((message) => message.mobile === null));

console.log(JSON.stringify({
  result: 'PASS',
  activeAttempt: activeStatus.attempt,
  activeMobile: activeStatus.mobile,
  boundedMissingHookAttempts: missingStatuses.length,
  storageValuesInMessages: false,
}, null, 2));
