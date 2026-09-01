export const AUDITED_SMSPARIAZ_FLOW = Object.freeze({
  auditedAt: "2026-09-01",
  appUserAgent: "SMSPARIAZAPP001",
  paths: Object.freeze({
    login: "/login/",
    otp: "/otp/",
    confirm: "/confirm/",
    checkLogin: "/checklogin/",
    metadata: "/smsfootball/service/odds_json.php?",
    cachePrefix: "/football/cache/odds_",
    comingNext: "/smsfootball/service/odds_cn_json.php",
    validateBet: "/smsfootball/service/validatebet.php",
    placeAppBet: "/placebet/",
    siteScript: "/smsfootball/js/site.js",
    mobileScript: "/smsfootball/js/mobile.js",
    rootMobileScript: "/js/mobile.js",
  }),
  scriptSha256: Object.freeze({
    site: "b01a832f9556bccce67120174c0e262fbb08bb07c5ab43cf13574c879462054f",
    footballMobile: "f441172f80d10aa90c612fdab526c1fd8491a5f752f7c035f123539797f5968a",
    rootMobile: "a558938c793dc970fa1eec1e684c7b1d3aab67a4eaf71881c9e2c654d04b6e06",
  }),
  appRequestFields: Object.freeze(["loginid", "message", "phone", "token"]),
});

/** Closed-world egress allowlist: no other SMSPariaz POST can submit an app ticket. */
export const APP_BET_ALLOWED_ENDPOINTS = Object.freeze(["/placebet/"] as const);

export const SAMPLE_ODDS_METADATA = {
  date: [{ date: "2026-09-01", num: 1, text: "01 Sep" }],
  nextdate: "2026-09-01",
  fd: "01 Sep",
  markets: { "1": "Full Time" },
  selections: { "1": "Home", "3": "Draw", "2": "Away" },
  lu: "2026-09-01 10:00:00",
  nf: 1,
};

export const SAMPLE_ODDS_FRAGMENT = {
  "0": {
    id: 12,
    name: "Mauritius",
    league: [{
      id: 1517,
      name: "Premier League",
      match: [{
        i: 303589,
        c: 1234,
        t: "20:00",
        home: "Port Louis",
        away: "Curepipe",
        mainodds: { H: "90001,148", X: "90002,320", A: "90003,510" },
        market: { "1": { "1": 1234, s: { "1": "90001,148", "3": "90002,320", "2": "90003,510" } } },
      }],
    }],
  },
};
