# 02 — Network difference

## Result

For the root page comparison with fixed Android client hints:

### Requests only in NORMAL

None.

### Requests only in SMSPARIAZAPP001

None.

### Common requests with different responses

None after normalizing harmless cache-busting parameters. Status, content type, response byte count, and body hash were identical for all 27 requests.

Evidence: `captures/control_android_hints.har`, `captures/appua_android_hints.har`, `captures/network-normalized.json`, and `captures/derived-comparison.json` (`onlyNormal=0`, `onlyAppua=0`, `responseDifferences=[]`).

The document requests prove the user agents were actually different while the Android client hints were the same:

| Header | Control | App-UA context |
|---|---|---|
| `User-Agent` | normal Android Chrome string | exactly `SMSPARIAZAPP001` |
| `sec-ch-ua-mobile` | `?1` | `?1` |
| `sec-ch-ua-platform` | `"Android"` | `"Android"` |

Both document responses were HTTP 200, 34,575 bytes, SHA-256 `05ef33ab...e27b1bd`, `text/html; charset=UTF-8`, and `Cache-Control: no-store, no-cache, must-revalidate`. No `Vary: User-Agent` header was returned.

## Normalized root-page request list

| Method | Host | Path/query | Type | Status | Content-Type | Initiator |
|---|---|---|---|---:|---|---|
| GET | `www.smspariaz.com` | `/` | document | 200 | `text/html; charset=UTF-8` | navigation |
| GET | `www.smspariaz.com` | `/style/reset.css` | stylesheet | 200 | `text/css` | document |
| GET | `www.smspariaz.com` | `/font/css/fontawesome.css` | stylesheet | 200 | `text/css` | document |
| GET | `www.smspariaz.com` | `/font/css/brands.css` | stylesheet | 200 | `text/css` | document |
| GET | `www.smspariaz.com` | `/font/css/solid.css` | stylesheet | 200 | `text/css` | document |
| GET | `www.smspariaz.com` | `/style/style.css?version=1.6` | stylesheet | 200 | `text/css` | document |
| GET | `www.smspariaz.com` | `/style/print.css` | stylesheet | 200 | `text/css` | document |
| GET | `www.smspariaz.com` | `/images/logo_small.png` | image | 200 | `image/png` | document |
| GET | `www.smspariaz.com` | `//images/logo_fb.png` | image | 200 | `image/png` | document |
| GET | `www.smspariaz.com` | `/media/banner/81pgav9vxh4w0s0g8c.jpeg` | image | 200 | `image/jpeg` | document |
| GET | `www.smspariaz.com` | `/media/banner/y94fq556a5ck84s8ow.jpeg` | image | 200 | `image/jpeg` | document |
| GET | `www.smspariaz.com` | `/media/news/ajoi6pw3s68k4k0kcs_middle.jpeg` | image | 200 | `image/jpeg` | document |
| GET | `www.smspariaz.com` | `/media/news/1us71tvtkgu8wcwgk4_middle.jpeg` | image | 200 | `image/jpeg` | document |
| GET | `www.smspariaz.com` | `/lib/jquery.js` | script | 200 | `application/javascript` | document |
| GET | `www.smspariaz.com` | `/js/site.js?v=1.590` | script | 200 | `application/javascript` | document |
| GET | `www.smspariaz.com` | `/js/mobile.js` | script | 200 | `application/javascript` | document/dynamic script |
| GET | `www.smspariaz.com` | `/font/webfonts/fa-solid-900.woff2` | font | 200 | not declared | CSS |
| GET | `www.smspariaz.com` | `/service/local_json.php` | XHR | 200 | `text/html; charset=UTF-8` | `site.js` `loadLocal`, lines 627-640 |
| GET | `player.twitch.tv` | `/js/embed/v1.js` | script | 200 | `application/x-javascript` | document |
| GET | `v2.zopim.com` | `/?5y8E...=` | script | 302 | `text/html; charset=UTF-8` | document |
| GET | `static.zdassets.com` | `/ekr/asset_composer.js` | script | 200 | `application/javascript` | Zendesk |
| GET | `ekr.zdassets.com` | `/compose/zopim_chat/5y8E...` | fetch | 200 | `application/json` | Zendesk fetch stack in capture JSON |
| GET | `smspariazltd.zendesk.com` | `/embeddable/config` | fetch | 200 | `application/json` | Zendesk |
| GET | `static.zdassets.com` | `/web_widget/classic/latest/web-widget-main-0da2609.js` | script | 200 | JavaScript | Zendesk |
| GET | `static.zdassets.com` | `/web_widget/classic/latest/web-widget-5433-0da2609.js` | script | 200 | JavaScript | Zendesk |
| GET | `static.zdassets.com` | `/web_widget/classic/latest/web-widget-locales/classic/en-us-json-0da2609.js` | script | 200 | JavaScript | Zendesk |
| GET | `static.zdassets.com` | `/web_widget/classic/latest/web-widget-chat-sdk-0da2609.js` | script | 200 | JavaScript | Zendesk |

The complete non-truncated records, queries, sizes, hashes, and available initiator stacks are in `captures/network-normalized.json`.

## State-changing requests

No POST, PUT, PATCH, or DELETE request was attempted during any root-page capture, and the browser safety layer therefore blocked zero requests. No WebSocket constructor was invoked. Instrumentation evidence: `captures/instrumentation-events.json`.

The wager endpoints described in later reports were discovered in downloaded public JavaScript, not observed in HAR and not called.
