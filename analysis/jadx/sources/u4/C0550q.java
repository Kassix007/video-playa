package U4;

import M5.AbstractC0263y;
import R4.C0458i;
import R4.C0468k1;
import R4.C0515w1;
import R4.I1;
import R4.P0;
import R4.f3;
import R4.g3;
import R4.o3;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.K1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import k5.C1190b;
import y4.AbstractC1918b;

/* JADX INFO: renamed from: U4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0550q extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7850a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0468k1 f7851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7853d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0550q(WebView webView, C0468k1 dataObjects) {
        Z2.c cVar = new Z2.c();
        kotlin.jvm.internal.m.e(dataObjects, "dataObjects");
        this.f7852c = cVar;
        this.f7851b = dataObjects;
        this.f7853d = new Z2.b(webView);
        WebSettings settings = webView.getSettings();
        kotlin.jvm.internal.m.d(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z5) {
        I1 i12;
        I1 i13;
        switch (this.f7850a) {
            case 2:
                C0468k1 c0468k1 = this.f7851b;
                C0458i c0458i = c0468k1.f7073d;
                if (!((c0458i == null || (i13 = c0458i.f6997V) == null) ? false : kotlin.jvm.internal.m.a(i13.f6774a, Boolean.TRUE))) {
                    C0458i c0458i2 = c0468k1.f7073d;
                    if (kotlin.jvm.internal.m.a(str, (c0458i2 == null || (i12 = c0458i2.f6997V) == null) ? null : i12.f6775b)) {
                        c0468k1.f7059S.getClass();
                    }
                }
                P5.S s6 = c0468k1.f7098t.j;
                Boolean bool = Boolean.TRUE;
                s6.getClass();
                s6.h(null, bool);
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z5);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f7850a) {
            case 2:
                super.onLoadResource(webView, str);
                this.f7851b.f7053M.b();
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        T1.u uVar;
        C0515w1 c0515w1;
        C0515w1 c0515w12;
        switch (this.f7850a) {
            case 0:
                if (url != null) {
                    ArrayList arrayList = new ArrayList();
                    C0468k1 c0468k1 = this.f7851b;
                    C0458i c0458i = c0468k1.f7073d;
                    List list = null;
                    if ((c0458i != null ? c0458i.f7010p : null) != null) {
                        if (((c0458i == null || (c0515w12 = c0458i.f7010p) == null) ? null : c0515w12.f7201b) != null) {
                            if (c0458i != null && (c0515w1 = c0458i.f7010p) != null) {
                                list = c0515w1.f7201b;
                            }
                            kotlin.jvm.internal.m.b(list);
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                String str = ((o3) list.get(i)).f7148a;
                                if (str != null) {
                                    arrayList.add(str);
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty() && AbstractC1918b.x(arrayList, url) != -1 && (uVar = c0468k1.f7075e) != null) {
                        uVar.c();
                        break;
                    }
                }
                break;
            case 1:
            default:
                super.onPageFinished(view, url);
                break;
            case 2:
                kotlin.jvm.internal.m.e(view, "view");
                kotlin.jvm.internal.m.e(url, "url");
                super.onPageFinished(view, url);
                C0468k1 c0468k12 = this.f7851b;
                c0468k12.f7103y = true;
                K1.v(view, c0468k12);
                view.evaluateJavascript("window.navigator.share = function (obj) {return new Promise((resolve, reject) => {window.WebToNativeInterface.share(JSON.stringify(obj));resolve();});};", null);
                view.evaluateJavascript("window.navigator.canShare = function(data = {}) { return Boolean(        data.text ||         data.url ||         data.title ||         (Array.isArray(data.files) &&          data.files.length > 0 &&          data.files.every(file => file instanceof File))    ); };", null);
                view.evaluateJavascript("window.print = function () {  try{if(window.WebToNativeInterface.createWebPagePrint){window.WebToNativeInterface.createWebPagePrint()}}catch(e){}};", null);
                view.evaluateJavascript("document.addEventListener('scroll', (event) => {  let scrollElement = event.target;  if (scrollElement === document || scrollElement === document.documentElement || scrollElement === document.body) {  } else {        if (window.scrollY === 0 && scrollElement.scrollTop != 0) {            window.scrollTo(0, 1)        }    }}, true);", null);
                view.evaluateJavascript("logalert();", null);
                C1190b c1190b = (C1190b) this.f7852c;
                c1190b.getClass();
                c1190b.f.k(url);
                c0468k12.f7094p = null;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap bitmap) {
        String url2;
        I1 i12;
        I1 i13;
        switch (this.f7850a) {
            case 1:
                kotlin.jvm.internal.m.e(view, "view");
                kotlin.jvm.internal.m.e(url, "url");
                Log.i("RequestInspectorWebView", "Page started loading, enabling request inspection. URL: ".concat(url));
                String extraJavaScriptToInject = ((Z2.c) this.f7852c).f8412a;
                kotlin.jvm.internal.m.e(extraJavaScriptToInject, "extraJavaScriptToInject");
                view.evaluateJavascript("javascript: \nfunction getFullUrl(url) {\n    if (url.startsWith(\"/\")) {\n        return location.protocol + '//' + location.host + url;\n    } else {\n        return url;\n    }\n}\n\nfunction recordFormSubmission(form) {\n    var jsonArr = [];\n    for (i = 0; i < form.elements.length; i++) {\n        var parName = form.elements[i].name;\n        var parValue = form.elements[i].value;\n        var parType = form.elements[i].type;\n        var parChecked = form.elements[i].checked;\n        var parId = form.elements[i].id;\n\n        jsonArr.push({\n            name: parName,\n            value: parValue,\n            type: parType,\n            checked:parChecked,\n            id:parId\n        });\n    }\n\n    const path = form.attributes['action'] === undefined ? \"/\" : form.attributes['action'].nodeValue;\n    const method = form.attributes['method'] === undefined ? \"GET\" : form.attributes['method'].nodeValue;\n    const url = getFullUrl(path);\n    const encType = form.attributes['enctype'] === undefined ? \"application/x-www-form-urlencoded\" : form.attributes['enctype'].nodeValue;\n    const err = new Error();\n    RequestInspection.recordFormSubmission(\n        url,\n        method,\n        JSON.stringify(jsonArr),\n        \"{}\",\n        err.stack,\n        encType\n    );\n}\n\nfunction handleFormSubmission(e) {\n    const form = e ? e.target : this;\n    recordFormSubmission(form);\n    form._submit();\n}\n\nHTMLFormElement.prototype._submit = HTMLFormElement.prototype.submit;\nHTMLFormElement.prototype.submit = handleFormSubmission;\nwindow.addEventListener('submit', function (submitEvent) {\n    const form = submitEvent ? submitEvent.target : this;\n    recordFormSubmission(form);\n}, true);\n\nlet lastXmlhttpRequestPrototypeMethod = null;\nlet xmlhttpRequestHeaders = {};\nlet xmlhttpRequestUrl = null;\nXMLHttpRequest.prototype._open = XMLHttpRequest.prototype.open;\nXMLHttpRequest.prototype.open = function (method, url, async, user, password) {\n    lastXmlhttpRequestPrototypeMethod = method;\n    xmlhttpRequestUrl = url;\n    const asyncWithDefault = async === undefined ? true : async;\n    this._open(method, url, asyncWithDefault, user, password);\n};\nXMLHttpRequest.prototype._setRequestHeader = XMLHttpRequest.prototype.setRequestHeader;\nXMLHttpRequest.prototype.setRequestHeader = function (header, value) {\n    xmlhttpRequestHeaders[header] = value;\n    this._setRequestHeader(header, value);\n};\nXMLHttpRequest.prototype._send = XMLHttpRequest.prototype.send;\nXMLHttpRequest.prototype.send = function (body) {\n    const err = new Error();\n    const url = getFullUrl(xmlhttpRequestUrl);\n    RequestInspection.recordXhr(\n        url,\n        lastXmlhttpRequestPrototypeMethod,\n        body || \"\",\n        JSON.stringify(xmlhttpRequestHeaders),\n        err.stack\n    );\n    lastXmlhttpRequestPrototypeMethod = null;\n    xmlhttpRequestUrl = null;\n    xmlhttpRequestHeaders = {};\n    this._send(body);\n};\n\nwindow._fetch = window.fetch;\nwindow.fetch = function () {\n    const firstArgument = arguments[0];\n    let url;\n    let method;\n    let body;\n    let headers;\n    if (typeof firstArgument === 'string') {\n        url = firstArgument;\n        method = arguments[1] && 'method' in arguments[1] ? arguments[1]['method'] : \"GET\";\n        body = arguments[1] && 'body' in arguments[1] ? arguments[1]['body'] : \"\";\n        headers = JSON.stringify(arguments[1] && 'headers' in arguments[1] ? arguments[1]['headers'] : {});\n    } else {\n        // Request object\n        url = firstArgument.url;\n        method = firstArgument.method;\n        body = firstArgument.body;\n        headers = JSON.stringify(Object.fromEntries(firstArgument.headers.entries()));\n    }\n    const fullUrl = getFullUrl(url);\n    const err = new Error();\n    RequestInspection.recordFetch(fullUrl, method, body, headers, err.stack);\n    return window._fetch.apply(this, arguments);\n}\n        \n".concat(extraJavaScriptToInject), null);
                super.onPageStarted(view, url, bitmap);
                break;
            case 2:
                C0468k1 c0468k1 = this.f7851b;
                if (!c0468k1.f7053M.b()) {
                    if (view != null) {
                        view.stopLoading();
                    }
                    WebView webView = c0468k1.f7084k;
                    if (webView != null) {
                        webView.stopLoading();
                    }
                } else {
                    super.onPageStarted(view, url, bitmap);
                    C0458i c0458i = c0468k1.f7073d;
                    boolean z5 = false;
                    if (!((c0458i == null || (i13 = c0458i.f6997V) == null) ? false : kotlin.jvm.internal.m.a(i13.f6774a, Boolean.TRUE))) {
                        String strValueOf = String.valueOf(view != null ? view.getUrl() : null);
                        C0458i c0458i2 = c0468k1.f7073d;
                        if (strValueOf.equals((c0458i2 == null || (i12 = c0458i2.f6997V) == null) ? null : i12.f6775b)) {
                            c0468k1.f7059S.f("notification", false);
                        }
                    }
                    if (view != null && (url2 = view.getUrl()) != null && J5.m.K0(url2, "gis_transform")) {
                        z5 = true;
                    }
                    if (z5) {
                        WebView webView2 = c0468k1.f7084k;
                        if (webView2 != null) {
                            webView2.stopLoading();
                        }
                        WebView webView3 = c0468k1.f7084k;
                        if (webView3 != null) {
                            webView3.goBack();
                        }
                        c0468k1.f7041A = url;
                        T1.u uVar = c0468k1.f7075e;
                        if (uVar != null) {
                            T1.u.b(uVar, "googleGsiLoginScreen");
                        }
                    }
                    C1190b c1190b = (C1190b) this.f7852c;
                    if (url == null) {
                        c1190b.getClass();
                    } else {
                        P5.S s6 = c1190b.f14130d;
                        s6.getClass();
                        s6.h(null, url);
                    }
                }
                break;
            default:
                super.onPageStarted(view, url, bitmap);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f7850a) {
            case 2:
                String strValueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceError != null) {
                    C0468k1 dataObject = this.f7851b;
                    kotlin.jvm.internal.m.e(dataObject, "dataObject");
                    dataObject.f7053M.f4842c = strValueOf;
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        switch (this.f7850a) {
            case 2:
                Log.e("onReceivedHttpAuthRequest", (webView != null ? webView.getUrl() : null) + "," + str);
                k3.c cVar = new k3.c();
                cVar.f14120q = httpAuthHandler;
                AlertDialog.Builder builder = new AlertDialog.Builder(webView != null ? webView.getContext() : null);
                builder.setTitle("Authentication Required");
                builder.setMessage("Enter your credentials");
                EditText editText = new EditText(webView != null ? webView.getContext() : null);
                editText.setHint("Username");
                EditText editText2 = new EditText(webView != null ? webView.getContext() : null);
                editText2.setHint("Password");
                editText2.setInputType(129);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(40, 0, 40, 0);
                LinearLayout linearLayout = new LinearLayout(webView != null ? webView.getContext() : null);
                linearLayout.setOrientation(1);
                linearLayout.addView(editText, layoutParams);
                linearLayout.addView(editText2, layoutParams);
                builder.setView(linearLayout);
                builder.setPositiveButton("OK", new f3(editText, editText2, cVar, 0));
                builder.setNegativeButton("Cancel", new g3(0, cVar));
                builder.show();
                break;
            default:
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Type inference failed for r5v12. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Map] */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Object objPrevious;
        Z2.a aVar;
        Object objPrevious2;
        P0 p02;
        P0 p03;
        switch (this.f7850a) {
            case 1:
                kotlin.jvm.internal.m.e(view, "view");
                kotlin.jvm.internal.m.e(request, "request");
                Z2.b bVar = (Z2.b) this.f7853d;
                String string = request.getUrl().toString();
                kotlin.jvm.internal.m.d(string, "toString(...)");
                bVar.getClass();
                synchronized (bVar.f8411a) {
                    try {
                        ArrayList arrayList = bVar.f8411a;
                        ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                objPrevious = listIterator.previous();
                                if (string.equals(((Z2.a) objPrevious).f8405b)) {
                                }
                            } else {
                                objPrevious = null;
                            }
                        }
                        aVar = (Z2.a) objPrevious;
                        if (aVar == null) {
                            ArrayList arrayList2 = bVar.f8411a;
                            ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                            while (true) {
                                if (listIterator2.hasPrevious()) {
                                    objPrevious2 = listIterator2.previous();
                                    if (J5.m.K0(string, ((Z2.a) objPrevious2).f8405b)) {
                                    }
                                } else {
                                    objPrevious2 = null;
                                }
                            }
                            aVar = (Z2.a) objPrevious2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                Z2.f fVar = aVar != null ? aVar.f8404a : Z2.f.f8427t;
                String string2 = request.getUrl().toString();
                kotlin.jvm.internal.m.d(string2, "toString(...)");
                String cookie = CookieManager.getInstance().getCookie(string2);
                if (cookie == null) {
                    cookie = "";
                }
                HashMap map = new HashMap();
                map.put("cookie", cookie);
                if (aVar != null) {
                    HashMap map2 = aVar.f;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(n5.y.I(map2.size()));
                    for (Map.Entry entry : map2.entrySet()) {
                        String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                        linkedHashMap.put(lowerCase, entry.getValue());
                    }
                    map.putAll(linkedHashMap);
                }
                Map<String, String> requestHeaders = request.getRequestHeaders();
                kotlin.jvm.internal.m.d(requestHeaders, "getRequestHeaders(...)");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(n5.y.I(requestHeaders.size()));
                Iterator it = requestHeaders.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    String str = (String) entry2.getKey();
                    kotlin.jvm.internal.m.b(str);
                    String lowerCase2 = str.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                    linkedHashMap2.put(lowerCase2, entry2.getValue());
                }
                map.putAll(linkedHashMap2);
                boolean zIsRedirect = request.isRedirect();
                String method = request.getMethod();
                kotlin.jvm.internal.m.d(method, "getMethod(...)");
                String str2 = aVar != null ? aVar.f8407d : "";
                String str3 = aVar != null ? aVar.f8409g : "";
                String str4 = aVar != null ? aVar.f8410h : null;
                boolean zIsForMainFrame = request.isForMainFrame();
                boolean zHasGesture = request.hasGesture();
                ?? r13 = aVar != null ? aVar.f8408e : n5.t.f15300q;
                if (J5.m.K0(new Z2.e(fVar, string2, method, str2, r13, map, str3, str4, zIsForMainFrame, zIsRedirect, zHasGesture).toString(), "id_token")) {
                    String str5 = (String) r13.get("id_token");
                    T5.e eVar = M5.H.f3811a;
                    AbstractC0263y.t(AbstractC0263y.a(R5.n.f7261a), null, null, new Z2.d(this, str5, null), 3);
                }
                return null;
            case 2:
                C0468k1 c0468k1 = this.f7851b;
                String strValueOf = String.valueOf(request != null ? request.getUrl() : null);
                try {
                    C0458i c0458i = c0468k1.f7073d;
                    if (((c0458i == null || (p03 = c0458i.f6989N) == null) ? null : p03.f6830c) != null) {
                        String str6 = (c0458i == null || (p02 = c0458i.f6989N) == null) ? null : p02.f6830c;
                        kotlin.jvm.internal.m.b(str6);
                        if (J5.m.K0(strValueOf, str6) && R4.V.f6870d == null) {
                            R4.V.f6870d = new R4.V();
                        }
                    }
                    break;
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                return null;
            default:
                return super.shouldInterceptRequest(view, request);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0284 A[Catch: Exception -> 0x0276, TryCatch #4 {Exception -> 0x0276, blocks: (B:140:0x025e, B:142:0x0264, B:148:0x0271, B:152:0x0279, B:155:0x0284, B:157:0x028c, B:159:0x0293, B:139:0x0256, B:136:0x0243), top: B:303:0x0243, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0323 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0198  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r19, android.webkit.WebResourceRequest r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            int r3 = r1.f7850a
            switch(r3) {
                case 0: goto L49b;
                case 1: goto L439;
                default: goto Lb;
            }
        Lb:
            java.lang.String r3 = "view"
            kotlin.jvm.internal.m.e(r0, r3)
            java.lang.String r3 = "request"
            kotlin.jvm.internal.m.e(r2, r3)
            R4.k1 r3 = r1.f7851b
            O3.e0 r4 = r3.f7053M
            boolean r4 = r4.b()
            if (r4 == 0) goto L198
            java.lang.Object r4 = r1.f7852c
            k5.b r4 = (k5.C1190b) r4
            r4.getClass()
            R4.i r3 = r3.f7073d
            if (r3 == 0) goto L33
            java.lang.Boolean r3 = r3.f6991P
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.m.a(r3, r6)
            goto L34
        L33:
            r3 = 0
        L34:
            if (r3 == 0) goto L39
        L36:
            r5 = 0
            goto L438
        L39:
            java.lang.Object r3 = r1.f7853d
            Z.m r3 = (Z.m) r3
            r3.getClass()
            java.lang.String r6 = "blob"
            android.net.Uri r7 = r2.getUrl()
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "toString(...)"
            kotlin.jvm.internal.m.d(r7, r8)
            android.net.Uri r8 = android.net.Uri.parse(r7)
            java.lang.String r8 = r8.getHost()
            android.net.Uri r9 = android.net.Uri.parse(r7)
            java.lang.String r9 = r9.getScheme()
            java.lang.Object r10 = r3.f8312r
            R4.k1 r10 = (R4.C0468k1) r10
            com.web2native.MainActivity r11 = r10.f7071c
            android.webkit.WebView r12 = r10.f7084k
            R4.i r13 = r10.f7073d
            com.web2native.MainActivity r14 = r10.f7067a
            O3.e0 r15 = r10.f7053M
            boolean r15 = r15.b()
            if (r15 == 0) goto L198
            if (r13 == 0) goto L82
            R4.I1 r15 = r13.f6997V
            if (r15 == 0) goto L82
            java.lang.Boolean r15 = r15.f6774a
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.m.a(r15, r5)
            goto L83
        L82:
            r5 = 0
        L83:
            if (r5 != 0) goto La2
            android.net.Uri r2 = r2.getUrl()
            java.lang.String r2 = r2.toString()
            if (r13 == 0) goto L96
            R4.I1 r5 = r13.f6997V
            if (r5 == 0) goto L96
            java.lang.String r5 = r5.f6775b
            goto L97
        L96:
            r5 = 0
        L97:
            boolean r2 = kotlin.jvm.internal.m.a(r2, r5)
            if (r2 == 0) goto La2
            g5.h r2 = r10.f7059S
            r2.getClass()
        La2:
            if (r13 == 0) goto La7
            java.util.List r2 = r13.f6985J
            goto La8
        La7:
            r2 = 0
        La8:
            if (r2 == 0) goto Ld5
            if (r13 == 0) goto Laf
            java.util.List r2 = r13.f6985J
            goto Lb0
        Laf:
            r2 = 0
        Lb0:
            kotlin.jvm.internal.m.b(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Ld5
            java.lang.Object r2 = r2.next()
            R4.e3 r2 = (R4.e3) r2
            java.lang.String r5 = r2.f6942a
            boolean r5 = kotlin.jvm.internal.m.a(r5, r7)
            if (r5 == 0) goto Ld5
            java.lang.String r2 = r2.f6943b
            goto Ld6
        Ld5:
            r2 = r7
        Ld6:
            boolean r5 = kotlin.jvm.internal.m.a(r2, r7)
            if (r5 != 0) goto Leb
            if (r2 == 0) goto Leb
            if (r12 == 0) goto Le3
            r12.stopLoading()
        Le3:
            if (r12 == 0) goto L198
            r12.loadUrl(r2)
        Le8:
            r5 = 1
            goto L438
        Leb:
            java.lang.String r2 = "accounts.google.com"
            boolean r2 = J5.m.K0(r7, r2)
            if (r2 != 0) goto L14a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r13 == 0) goto Lfd
            R4.w1 r5 = r13.f7010p
            goto Lfe
        Lfd:
            r5 = 0
        Lfe:
            if (r5 == 0) goto L138
            if (r13 == 0) goto L109
            R4.w1 r5 = r13.f7010p
            if (r5 == 0) goto L109
            java.util.List r5 = r5.f7200a
            goto L10a
        L109:
            r5 = 0
        L10a:
            if (r5 == 0) goto L138
            if (r13 == 0) goto L115
            R4.w1 r5 = r13.f7010p
            if (r5 == 0) goto L115
            java.util.List r5 = r5.f7200a
            goto L116
        L115:
            r5 = 0
        L116:
            kotlin.jvm.internal.m.b(r5)
            r16 = r5
            java.util.Collection r16 = (java.util.Collection) r16
            int r15 = r16.size()
            r4 = 0
        L122:
            if (r4 >= r15) goto L138
            java.lang.Object r17 = r5.get(r4)
            r20 = r4
            r4 = r17
            R4.o3 r4 = (R4.o3) r4
            java.lang.String r4 = r4.f7148a
            if (r4 == 0) goto L135
            r2.add(r4)
        L135:
            int r4 = r20 + 1
            goto L122
        L138:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L147
            int r2 = y4.AbstractC1918b.x(r2, r7)
            r4 = -1
            if (r2 == r4) goto L147
            r2 = 1
            goto L148
        L147:
            r2 = 0
        L148:
            if (r2 == 0) goto L14e
        L14a:
            r2 = 1
            r4 = 0
            goto L39d
        L14e:
            java.lang.String r2 = "upi://"
            r4 = 0
            boolean r2 = J5.t.G0(r7, r2, r4)
            java.lang.String r5 = "android.intent.action.VIEW"
            if (r2 != 0) goto L381
            java.lang.String r2 = "gcash://"
            boolean r2 = J5.t.G0(r7, r2, r4)
            if (r2 == 0) goto L163
            goto L381
        L163:
            if (r8 == 0) goto L178
            java.lang.String r2 = "appleid.apple.com"
            boolean r2 = J5.m.K0(r8, r2)
            if (r2 != 0) goto L175
            java.lang.String r2 = "m.facebook.com"
            boolean r2 = J5.m.K0(r8, r2)
            if (r2 == 0) goto L178
        L175:
            r4 = 0
            goto L437
        L178:
            java.lang.String r2 = "sms:"
            r4 = 0
            boolean r2 = J5.t.G0(r7, r2, r4)
            if (r2 == 0) goto L19b
            android.net.Uri r0 = android.net.Uri.parse(r7)     // Catch: java.lang.Exception -> L194
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L194
            r2.<init>(r5, r0)     // Catch: java.lang.Exception -> L194
            java.lang.String r0 = "Share"
            android.content.Intent r0 = android.content.Intent.createChooser(r2, r0)     // Catch: java.lang.Exception -> L194
            r11.startActivity(r0)     // Catch: java.lang.Exception -> L194
            goto L198
        L194:
            r0 = move-exception
            r0.printStackTrace()
        L198:
            r2 = 1
            goto L3fa
        L19b:
            java.lang.String r2 = "tel:"
            r4 = 0
            boolean r2 = J5.t.G0(r7, r2, r4)
            if (r2 == 0) goto L1b6
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.DIAL"
            r0.<init>(r2)
            android.net.Uri r2 = android.net.Uri.parse(r7)
            r0.setData(r2)
            r11.startActivity(r0)
            goto L198
        L1b6:
            java.lang.String r2 = "mailto:"
            boolean r2 = J5.t.G0(r7, r2, r4)
            if (r2 == 0) goto L1d8
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L1cd
            java.lang.String r2 = "android.intent.action.SENDTO"
            android.net.Uri r3 = android.net.Uri.parse(r7)     // Catch: java.lang.Exception -> L1cd
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> L1cd
            r11.startActivity(r0)     // Catch: java.lang.Exception -> L1cd
            goto L198
        L1cd:
            java.lang.String r0 = "No apps available to handle mails"
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r11, r0, r2)
            r0.show()
            goto L198
        L1d8:
            java.lang.String r2 = "open-url-in-custom-tab"
            boolean r2 = J5.m.K0(r7, r2)
            if (r2 != 0) goto L33d
            java.lang.String r2 = "loadIn=customTab"
            boolean r2 = J5.m.K0(r7, r2)
            if (r2 == 0) goto L1ea
            goto L33d
        L1ea:
            java.lang.String r2 = "open-url-in-browser"
            boolean r2 = J5.m.K0(r7, r2)
            if (r2 != 0) goto L323
            java.lang.String r2 = "loadIn=defaultBrowser"
            boolean r2 = J5.m.K0(r7, r2)
            if (r2 != 0) goto L323
            kotlin.jvm.internal.m.b(r9)
            java.lang.String r2 = "whatsapp"
            boolean r2 = J5.m.K0(r9, r2)
            if (r2 == 0) goto L207
            goto L323
        L207:
            java.lang.String r2 = "data:image"
            r4 = 0
            boolean r8 = J5.t.G0(r7, r2, r4)
            if (r8 != 0) goto L437
            java.lang.String r8 = "data:"
            boolean r8 = J5.t.G0(r7, r8, r4)
            if (r8 == 0) goto L21a
            goto L437
        L21a:
            java.lang.String r8 = "intent://"
            boolean r8 = J5.t.G0(r7, r8, r4)
            if (r8 != 0) goto L2de
            java.lang.String r8 = "rib://"
            boolean r8 = J5.t.G0(r7, r8, r4)
            if (r8 == 0) goto L22c
            goto L2de
        L22c:
            java.lang.String r8 = "w2n://"
            boolean r8 = J5.t.G0(r7, r8, r4)
            if (r8 == 0) goto L239
            r3.r(r7)
            goto L198
        L239:
            java.lang.String r8 = "http"
            boolean r8 = J5.t.G0(r7, r8, r4)
            if (r8 != 0) goto L2d4
            java.lang.String r0 = ""
            java.lang.String r8 = "://"
            r9 = 6
            int r8 = J5.m.S0(r7, r8, r4, r9)     // Catch: java.lang.Exception -> L256
            java.lang.String r8 = r7.substring(r4, r8)     // Catch: java.lang.Exception -> L256
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.m.d(r8, r4)     // Catch: java.lang.Exception -> L256
            r0 = r8
        L254:
            r4 = 0
            goto L25e
        L256:
            java.lang.String r4 = "Failed to get urlSchemeProtocol"
            java.io.PrintStream r8 = java.lang.System.out     // Catch: java.lang.Exception -> L276
            r8.println(r4)     // Catch: java.lang.Exception -> L276
            goto L254
        L25e:
            boolean r2 = J5.t.G0(r7, r2, r4)     // Catch: java.lang.Exception -> L276
            if (r2 != 0) goto L198
            int r2 = r0.length()     // Catch: java.lang.Exception -> L276
            if (r2 <= 0) goto L26c
            r2 = 1
            goto L26d
        L26c:
            r2 = 0
        L26d:
            if (r2 == 0) goto L284
            if (r12 == 0) goto L278
            java.lang.String r15 = r12.getUrl()     // Catch: java.lang.Exception -> L276
            goto L279
        L276:
            r0 = move-exception
            goto L2a1
        L278:
            r15 = 0
        L279:
            kotlin.jvm.internal.m.b(r15)     // Catch: java.lang.Exception -> L276
            boolean r0 = J5.m.K0(r15, r0)     // Catch: java.lang.Exception -> L276
            if (r0 == 0) goto L284
            goto L198
        L284:
            java.lang.String r0 = "about:blank#blocked"
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Exception -> L276
            if (r0 != 0) goto L198
            r4 = 0
            boolean r0 = J5.t.G0(r7, r6, r4)     // Catch: java.lang.Exception -> L276
            if (r0 != 0) goto L36
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L276
            android.net.Uri r2 = android.net.Uri.parse(r7)     // Catch: java.lang.Exception -> L276
            r0.<init>(r5, r2)     // Catch: java.lang.Exception -> L276
            r11.startActivity(r0)     // Catch: java.lang.Exception -> L276
            goto L198
        L2a1:
            java.lang.String r2 = "truecallersdk"
            r4 = 0
            boolean r2 = J5.t.G0(r7, r2, r4)
            if (r2 == 0) goto L2b5
            java.lang.String r2 = "Truecaller app not installed"
            r5 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r11, r2, r5)
            r2.show()
            goto L2cf
        L2b5:
            r5 = 1
            boolean r2 = J5.t.G0(r7, r6, r4)
            if (r2 == 0) goto L2c6
            boolean r2 = J5.t.G0(r7, r6, r4)
            if (r2 == 0) goto L2cf
            r3.r(r7)
            goto L2cf
        L2c6:
            java.lang.String r2 = "App failed to load the url"
            android.widget.Toast r2 = android.widget.Toast.makeText(r11, r2, r5)
            r2.show()
        L2cf:
            r0.printStackTrace()
            goto L198
        L2d4:
            java.lang.Object r2 = r3.f8313s
            K2.a r2 = (K2.a) r2
            boolean r5 = r2.d(r0, r7)
            goto L438
        L2de:
            android.content.Context r2 = r0.getContext()     // Catch: java.net.URISyntaxException -> L2f6
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.m.d(r2, r3)     // Catch: java.net.URISyntaxException -> L2f6
            r3 = 1
            android.content.Intent r4 = android.content.Intent.parseUri(r7, r3)     // Catch: java.net.URISyntaxException -> L2f6
            if (r4 == 0) goto L198
            r0.stopLoading()     // Catch: java.net.URISyntaxException -> L2f6
            r2.startActivity(r4)     // Catch: java.net.URISyntaxException -> L2f6 android.content.ActivityNotFoundException -> L2f8
            goto Le8
        L2f6:
            r0 = move-exception
            goto L31a
        L2f8:
            java.lang.String r0 = "browser_fallback_url"
            java.lang.String r0 = r4.getStringExtra(r0)     // Catch: java.net.URISyntaxException -> L2f6
            if (r0 == 0) goto L30e
            android.content.Intent r3 = new android.content.Intent     // Catch: java.net.URISyntaxException -> L2f6
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.net.URISyntaxException -> L2f6
            r3.<init>(r5, r0)     // Catch: java.net.URISyntaxException -> L2f6
            r2.startActivity(r3)     // Catch: java.net.URISyntaxException -> L2f6
            goto Le8
        L30e:
            java.lang.String r0 = "Issue in opening the app/link"
            r4 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r11, r0, r4)     // Catch: java.net.URISyntaxException -> L2f6
            r0.show()     // Catch: java.net.URISyntaxException -> L2f6
            goto Le8
        L31a:
            java.lang.String r2 = "MainActivity"
            java.lang.String r3 = "Can't resolve intent://"
            android.util.Log.e(r2, r3, r0)
            goto L198
        L323:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L331
            android.net.Uri r2 = android.net.Uri.parse(r7)     // Catch: java.lang.Exception -> L331
            r0.<init>(r5, r2)     // Catch: java.lang.Exception -> L331
            r11.startActivity(r0)     // Catch: java.lang.Exception -> L331
            goto L198
        L331:
            java.lang.String r0 = "No apps available to handle the request"
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r11, r0, r2)
            r0.show()
            goto L198
        L33d:
            java.lang.String r0 = "#ffffff"
            int r0 = android.graphics.Color.parseColor(r0)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 | r2
            L.s r2 = new L.s
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            r3.putInt(r4, r0)
            r2.f3065e = r3
            Z.m r0 = r2.b()
            android.net.Uri r2 = android.net.Uri.parse(r7)
            java.lang.Object r3 = r0.f8312r
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.String r4 = "com.android.chrome"
            r3.setPackage(r4)     // Catch: java.lang.Exception -> L377
            kotlin.jvm.internal.m.b(r2)     // Catch: java.lang.Exception -> L377
            r3.setData(r2)     // Catch: java.lang.Exception -> L377
            java.lang.Object r0 = r0.f8313s     // Catch: java.lang.Exception -> L377
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: java.lang.Exception -> L377
            r14.startActivity(r3, r0)     // Catch: java.lang.Exception -> L377
            goto L198
        L377:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5, r2)
            r14.startActivity(r0)
            goto L198
        L381:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L392
            r0.<init>(r5)     // Catch: java.lang.Exception -> L392
            android.net.Uri r2 = android.net.Uri.parse(r7)     // Catch: java.lang.Exception -> L392
            r0.setData(r2)     // Catch: java.lang.Exception -> L392
            r11.startActivity(r0)     // Catch: java.lang.Exception -> L392
            goto L198
        L392:
            java.lang.String r0 = "No upi app available on device."
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r11, r0, r2)
            r0.show()
            goto L3fa
        L39d:
            if (r13 == 0) goto L3ac
            R4.P0 r0 = r13.f6989N
            if (r0 == 0) goto L3ac
            java.lang.Boolean r0 = r0.f6831d
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.m.a(r0, r3)
            goto L3ad
        L3ac:
            r0 = r4
        L3ad:
            java.lang.String r3 = "googleGsiLoginScreen"
            java.lang.String r5 = "gis_transform"
            if (r0 == 0) goto L40d
            if (r13 == 0) goto L3bc
            R4.P0 r0 = r13.f6989N
            if (r0 == 0) goto L3bc
            java.lang.String r0 = r0.f6829b
            goto L3bd
        L3bc:
            r0 = 0
        L3bd:
            if (r0 != 0) goto L3c0
            goto L40d
        L3c0:
            java.lang.String r0 = "redirect_uri"
            boolean r4 = J5.m.K0(r7, r0)
            if (r4 == 0) goto L3fa
            android.net.Uri r4 = android.net.Uri.parse(r7)
            java.lang.String r0 = r4.getQueryParameter(r0)
            r10.f7091n0 = r0
            java.lang.String r0 = "state"
            r4.getQueryParameter(r0)
            java.lang.String r0 = r10.f7091n0
            boolean r0 = kotlin.jvm.internal.m.a(r0, r5)
            if (r0 == 0) goto L3fc
            if (r13 == 0) goto L3e8
            R4.P0 r0 = r13.f6989N
            if (r0 == 0) goto L3e8
            java.lang.String r15 = r0.f6832e
            goto L3e9
        L3e8:
            r15 = 0
        L3e9:
            java.lang.String r0 = "POPUP_FLOW"
            boolean r0 = kotlin.jvm.internal.m.a(r15, r0)
            if (r0 == 0) goto L3fc
            r10.f7041A = r7
            T1.u r0 = r10.f7075e
            if (r0 == 0) goto L3fa
            T1.u.b(r0, r3)
        L3fa:
            r5 = r2
            goto L438
        L3fc:
            R4.V r0 = R4.V.f6870d
            if (r0 != 0) goto L407
            R4.V r0 = new R4.V
            r0.<init>()
            R4.V.f6870d = r0
        L407:
            R4.V r0 = R4.V.f6870d
            kotlin.jvm.internal.m.b(r0)
            goto L3fa
        L40d:
            boolean r0 = J5.m.K0(r7, r5)
            if (r0 == 0) goto L41d
            r10.f7041A = r7
            T1.u r0 = r10.f7075e
            if (r0 == 0) goto L3fa
            T1.u.b(r0, r3)
            goto L3fa
        L41d:
            if (r13 == 0) goto L428
            java.lang.Boolean r0 = r13.f6979D
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.m.a(r0, r3)
            goto L429
        L428:
            r0 = r4
        L429:
            if (r0 != 0) goto L437
            r10.f7041A = r7
            T1.u r0 = r10.f7075e
            if (r0 == 0) goto L3fa
            java.lang.String r3 = "externalUrlsForLogin"
            T1.u.b(r0, r3)
            goto L3fa
        L437:
            r5 = r4
        L438:
            return r5
        L439:
            r0 = 0
            if (r2 == 0) goto L441
            android.net.Uri r2 = r2.getUrl()
            goto L442
        L441:
            r2 = r0
        L442:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "accounts.google.com"
            boolean r3 = J5.m.K0(r2, r3)
            r4 = 0
            if (r3 == 0) goto L49a
            R4.k1 r3 = r1.f7851b
            R4.i r5 = r3.f7073d
            if (r5 == 0) goto L462
            R4.P0 r5 = r5.f6989N
            if (r5 == 0) goto L462
            java.lang.Boolean r5 = r5.f6831d
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.m.a(r5, r6)
            goto L463
        L462:
            r5 = r4
        L463:
            if (r5 == 0) goto L49a
            R4.i r5 = r3.f7073d
            if (r5 == 0) goto L46f
            R4.P0 r5 = r5.f6989N
            if (r5 == 0) goto L46f
            java.lang.String r0 = r5.f6829b
        L46f:
            if (r0 != 0) goto L472
            goto L49a
        L472:
            java.lang.String r0 = "redirect_uri"
            boolean r5 = J5.m.K0(r2, r0)
            if (r5 == 0) goto L49a
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r0 = r2.getQueryParameter(r0)
            r3.f7091n0 = r0
            java.lang.String r0 = "state"
            r2.getQueryParameter(r0)
            R4.V r0 = R4.V.f6870d
            if (r0 != 0) goto L494
            R4.V r0 = new R4.V
            r0.<init>()
            R4.V.f6870d = r0
        L494:
            R4.V r0 = R4.V.f6870d
            kotlin.jvm.internal.m.b(r0)
            r4 = 1
        L49a:
            return r4
        L49b:
            java.lang.Object r3 = r1.f7852c
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = "view"
            kotlin.jvm.internal.m.e(r0, r4)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.m.e(r2, r0)
            android.net.Uri r0 = r2.getUrl()
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.m.d(r2, r0)
            java.lang.String r0 = "mailto:"
            r4 = 0
            boolean r0 = J5.t.G0(r2, r0, r4)
            r5 = 1
            if (r0 == 0) goto L4d5
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L4d0
            java.lang.String r6 = "android.intent.action.SENDTO"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> L4d0
            r0.<init>(r6, r2)     // Catch: java.lang.Exception -> L4d0
            r3.startActivity(r0)     // Catch: java.lang.Exception -> L4d0
        L4ce:
            r4 = r5
            goto L538
        L4d0:
            r0 = move-exception
            r0.printStackTrace()
            goto L538
        L4d5:
            java.lang.String r0 = "http"
            boolean r0 = J5.t.G0(r2, r0, r4)
            if (r0 != 0) goto L538
            java.lang.String r0 = "about:blank#blocked"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Exception -> L4f4
            if (r0 != 0) goto L4ce
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L4f4
            java.lang.String r6 = "android.intent.action.VIEW"
            android.net.Uri r7 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> L4f4
            r0.<init>(r6, r7)     // Catch: java.lang.Exception -> L4f4
            r3.startActivity(r0)     // Catch: java.lang.Exception -> L4f4
            goto L4ce
        L4f4:
            r0 = move-exception
            java.lang.String r3 = "truecallersdk"
            boolean r3 = J5.t.G0(r2, r3, r4)
            R4.k1 r6 = r1.f7851b
            if (r3 == 0) goto L50b
            com.web2native.MainActivity r2 = r6.f7071c
            java.lang.String r3 = "Truecaller app not installed"
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r5)
            r2.show()
            goto L534
        L50b:
            java.lang.String r3 = "blob"
            boolean r7 = J5.t.G0(r2, r3, r4)
            if (r7 == 0) goto L529
            boolean r3 = J5.t.G0(r2, r3, r4)
            if (r3 == 0) goto L534
            java.lang.Object r3 = r1.f7853d
            P.W r3 = (P.W) r3
            java.lang.Object r3 = r3.getValue()
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            if (r3 == 0) goto L534
            r3.loadUrl(r2)
            goto L534
        L529:
            com.web2native.MainActivity r2 = r6.f7071c
            java.lang.String r3 = "App failed to load the url"
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r5)
            r2.show()
        L534:
            r0.printStackTrace()
            goto L4ce
        L538:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.C0550q.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }

    public C0550q(C0468k1 c0468k1, C1190b c1190b) {
        this.f7851b = c0468k1;
        this.f7852c = c1190b;
        this.f7853d = new Z.m(c0468k1);
    }

    public C0550q(C0468k1 c0468k1, Context context, P.W w3) {
        this.f7851b = c0468k1;
        this.f7852c = context;
        this.f7853d = w3;
    }
}
