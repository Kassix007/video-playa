/**
 * Sanitized, read-only production evidence captured on 2026-09-01.
 * It contains no account, cookie, or transaction information.  The hashes
 * are an immutable audit input: a different current script disables placement.
 */
export const AUDITED_PEAKPOOL_FLOW = Object.freeze({
  auditedAt: "2026-09-01",
  origin: "https://www.smspariaz.com",
  appUserAgent: "SMSPARIAZAPP001",
  paths: Object.freeze({
    programme: "/service/peakpool_json.php?",
    checkLogin: "/checklogin/",
    placeAppBet: "/placebet/",
    siteScript: "/js/site.js?v=1.590",
    mobileScript: "/js/mobile.js",
    peakpoolPage: "/peakpool/",
  }),
  appRequestFields: Object.freeze(["loginid", "message", "phone", "token"]),
  scriptSha256: Object.freeze({
    site: "373d10892efd82b87f21f580c400ff9a1e0eeeaa96fd7319ca816f7da4cb9b79",
    mobile: "a558938c793dc970fa1eec1e684c7b1d3aab67a4eaf71881c9e2c654d04b6e06",
  }),
  session: Object.freeze({
    appMode: "MOBILE=1",
    localStorageKeys: Object.freeze(["loginid", "phone", "token"]),
  }),
  messageGrammar: "<positive-integer-units>R<meeting>C<race>H<runner>[P]",
});

/** A small recorded subset of the 31-race public fixture observed on 2026-09-01. */
export const SAMPLE_PEAKPOOL_FIXTURE = Object.freeze([
  {
    meeting_number: "3",
    date: "2026-09-01",
    track: "CABOURG",
    number: "1",
    time: "13:51",
    name: "PRIX D'HIEVILLE",
    horses: [
      { no: "1", name: "NOUMEA D'ECAJEUL", type: "940" },
      { no: "2", name: "NASHWA SPEED", type: "2430" },
    ],
  },
  {
    meeting_number: "1",
    date: "2026-09-01",
    track: "DEAUVILLE",
    number: "1",
    time: "15:55",
    name: "PRIX DES TERRES NOIRES",
    horses: [
      { no: "1", name: "CALAS", type: "608" },
      { no: "5", name: "KRASKHOV", type: "NP" },
    ],
  },
]);
