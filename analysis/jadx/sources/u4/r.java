package U4;

import C0.RunnableC0089m;
import R4.C0458i;
import R4.C0468k1;
import R4.C0502t0;
import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.K1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.web2native.MainActivity;
import com.wnapp.smspariaz.R;
import j5.C1164a;
import java.io.IOException;
import k1.AbstractC1175c;
import k5.C1189a;
import k5.C1190b;

/* JADX INFO: loaded from: classes.dex */
public final class r extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7854a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0468k1 f7855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7856c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(C0468k1 dataObject, C1190b c1190b) {
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        this.f7855b = dataObject;
        this.f7856c = c1190b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        switch (this.f7854a) {
            case 1:
                C0468k1 c0468k1 = this.f7855b;
                C0458i c0458i = c0468k1.f7073d;
                if (!(c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f7015u, Boolean.FALSE) : false)) {
                    C0458i c0458i2 = c0468k1.f7073d;
                    if ((c0458i2 != null ? c0458i2.f7015u : null) != null) {
                        E1.u uVar = c0468k1.f7088m;
                        if (((View) uVar.f1661e) == null) {
                            return null;
                        }
                        return BitmapFactory.decodeResource(((C0468k1) uVar.f1660d).f7067a.getApplicationContext().getResources(), 2130837573);
                    }
                }
                return BitmapFactory.decodeResource(c0468k1.f7071c.getResources(), R.drawable.transparent);
            default:
                return super.getDefaultVideoPoster();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView window) {
        switch (this.f7854a) {
            case 0:
                kotlin.jvm.internal.m.e(window, "window");
                super.onCloseWindow(window);
                T1.u uVar = this.f7855b.f7075e;
                if (uVar != null) {
                    uVar.c();
                }
                Log.d("close", "Close the current window");
                break;
            default:
                if (window != null) {
                    window.destroy();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        T1.u uVar;
        T1.d dVarA;
        T1.p pVar;
        String strMessage;
        String str;
        T1.u uVar2;
        T1.p pVarF;
        switch (this.f7854a) {
            case 0:
                kotlin.jvm.internal.m.e(consoleMessage, "consoleMessage");
                String strMessage2 = consoleMessage.message();
                kotlin.jvm.internal.m.d(strMessage2, "message(...)");
                if (J5.m.K0(strMessage2, "Scripts may close only")) {
                    C0468k1 c0468k1 = this.f7855b;
                    T1.u uVar3 = c0468k1.f7075e;
                    if (!kotlin.jvm.internal.m.a((uVar3 == null || (dVarA = uVar3.a()) == null || (pVar = dVarA.f7354r) == null) ? null : (String) pVar.f7404r.f8095e, "splashScreen") && (uVar = c0468k1.f7075e) != null) {
                        uVar.c();
                    }
                }
                break;
            default:
                if (consoleMessage != null && (strMessage = consoleMessage.message()) != null && J5.m.K0(strMessage, "Scripts may close only the windows that were opened by them")) {
                    C0468k1 c0468k12 = this.f7855b;
                    T1.u uVar4 = c0468k12.f7075e;
                    if (kotlin.jvm.internal.m.a((uVar4 == null || (pVarF = uVar4.f7418b.f()) == null) ? null : (String) pVarF.f7404r.f8095e, "googleGsiLoginScreen") && (str = c0468k12.f7041A) != null && J5.m.K0(str, "__/auth/handler") && (uVar2 = c0468k12.f7075e) != null) {
                        T1.u.b(uVar2, "mainScreen");
                    }
                }
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z5, boolean z6, Message message) {
        switch (this.f7854a) {
            case 0:
                Object obj = message != null ? message.obj : null;
                WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
                if (webViewTransport != null) {
                    webViewTransport.setWebView((WebView) ((P.W) this.f7856c).getValue());
                }
                return super.onCreateWindow(webView, z5, z6, message);
            default:
                if (message != null) {
                    C0468k1 c0468k1 = this.f7855b;
                    WebView webView2 = new WebView(c0468k1.f7071c);
                    Object obj2 = message.obj;
                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
                    ((WebView.WebViewTransport) obj2).setWebView(webView2);
                    message.sendToTarget();
                    WebSettings settings = webView2.getSettings();
                    kotlin.jvm.internal.m.d(settings, "getSettings(...)");
                    settings.setJavaScriptEnabled(true);
                    settings.setSupportMultipleWindows(false);
                    settings.setDomStorageEnabled(true);
                    settings.setAllowContentAccess(true);
                    settings.setAllowFileAccess(true);
                    settings.setJavaScriptCanOpenWindowsAutomatically(true);
                    settings.setMixedContentMode(0);
                    settings.setPluginState(WebSettings.PluginState.ON);
                    settings.setMediaPlaybackRequiresUserGesture(false);
                    settings.setUseWideViewPort(true);
                    settings.setLoadWithOverviewMode(true);
                    webView2.getSettings().setJavaScriptEnabled(true);
                    webView2.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    WebView.setWebContentsDebuggingEnabled(true);
                    webView2.setWebViewClient(new C0502t0(1, c0468k1));
                    webView2.setWebChromeClient(new C1189a());
                }
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        switch (this.f7854a) {
            case 1:
                C0468k1 c0468k1 = this.f7855b;
                if (l6.d.u(c0468k1.f7071c) || !kotlin.jvm.internal.m.a(c0468k1.f7059S.a(FirebaseAnalytics.Param.LOCATION), "ALLOWED")) {
                    O3.Y yA = c0468k1.a();
                    MainActivity mainActivity = c0468k1.f7071c;
                    if (SystemClock.uptimeMillis() - yA.f4680b >= 1000) {
                        kotlin.jvm.internal.m.b((R4.V) yA.f4683e);
                        if (!R4.V.h(mainActivity)) {
                            kotlin.jvm.internal.m.b((R4.V) yA.f4683e);
                            if (!R4.V.h(mainActivity) || !l6.d.u(mainActivity)) {
                                yA.f4681c = str;
                                yA.f4682d = callback;
                                c0468k1.f7059S.e();
                            }
                        } else if (!l6.d.u(mainActivity)) {
                            yA.f4682d = callback;
                            yA.f4681c = str;
                        } else {
                            kotlin.jvm.internal.m.b(callback);
                            callback.invoke(str, true, false);
                        }
                    } else {
                        kotlin.jvm.internal.m.b(callback);
                        callback.invoke(str, false, false);
                    }
                } else if (callback != null) {
                    callback.invoke(str, false, false);
                }
                break;
            default:
                super.onGeolocationPermissionsShowPrompt(str, callback);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        switch (this.f7854a) {
            case 1:
                C0468k1 c0468k1 = this.f7855b;
                c0468k1.f7088m.a();
                WebView webView = c0468k1.f7084k;
                if (webView != null) {
                    webView.postDelayed(new RunnableC0089m(19, this), 300L);
                }
                break;
            default:
                super.onHideCustomView();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String message, JsResult result) {
        T1.p pVarF;
        T1.p pVarF2;
        switch (this.f7854a) {
            case 1:
                kotlin.jvm.internal.m.e(message, "message");
                kotlin.jvm.internal.m.e(result, "result");
                C0468k1 c0468k1 = this.f7855b;
                T1.u uVar = c0468k1.f7075e;
                String str2 = null;
                if (!kotlin.jvm.internal.m.a((uVar == null || (pVarF2 = uVar.f7418b.f()) == null) ? null : (String) pVarF2.f7404r.f8095e, "splashScreen")) {
                    T1.u uVar2 = c0468k1.f7075e;
                    if (uVar2 != null && (pVarF = uVar2.f7418b.f()) != null) {
                        str2 = (String) pVarF.f7404r.f8095e;
                    }
                    if (!kotlin.jvm.internal.m.a(str2, "onboardingScreen")) {
                        MainActivity mainActivity = c0468k1.f7067a;
                        AlertDialog.Builder positiveButton = new AlertDialog.Builder(mainActivity).setTitle(Q2.g.A(mainActivity)).setMessage(message).setPositiveButton("Ok", new R4.K(0));
                        positiveButton.create();
                        positiveButton.show();
                        result.confirm();
                        return true;
                    }
                }
                result.cancel();
                return true;
            default:
                return super.onJsAlert(webView, str, message, result);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        T1.p pVarF;
        T1.p pVarF2;
        switch (this.f7854a) {
            case 1:
                C0468k1 c0468k1 = this.f7855b;
                T1.u uVar = c0468k1.f7075e;
                String str3 = null;
                if (!kotlin.jvm.internal.m.a((uVar == null || (pVarF2 = uVar.f7418b.f()) == null) ? null : (String) pVarF2.f7404r.f8095e, "splashScreen")) {
                    T1.u uVar2 = c0468k1.f7075e;
                    if (uVar2 != null && (pVarF = uVar2.f7418b.f()) != null) {
                        str3 = (String) pVarF.f7404r.f8095e;
                    }
                    if (!kotlin.jvm.internal.m.a(str3, "onboardingScreen")) {
                    }
                }
                if (jsResult != null) {
                    jsResult.cancel();
                }
                break;
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        switch (this.f7854a) {
            case 1:
                if (permissionRequest != null) {
                    C0468k1 c0468k1 = this.f7855b;
                    g5.h hVar = c0468k1.f7059S;
                    hVar.getClass();
                    int i = c0468k1.f7072c0;
                    int i7 = c0468k1.f7076e0;
                    MainActivity mainActivity = c0468k1.f7067a;
                    MainActivity mainActivity2 = c0468k1.f7071c;
                    String[] resources = permissionRequest.getResources();
                    kotlin.jvm.internal.m.d(resources, "getResources(...)");
                    boolean z5 = false;
                    boolean z6 = false;
                    for (String str : resources) {
                        if (kotlin.jvm.internal.m.a(str, "android.webkit.resource.AUDIO_CAPTURE")) {
                            z5 = true;
                        }
                        if (kotlin.jvm.internal.m.a(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                            z6 = true;
                        }
                    }
                    if (z5 && z6) {
                        if (AbstractC1175c.a(mainActivity2, "android.permission.RECORD_AUDIO") != 0 && AbstractC1175c.a(mainActivity2, "android.permission.CAMERA") != 0) {
                            hVar.f13163r = permissionRequest;
                            mainActivity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA"}, c0468k1.f7081h0);
                        } else if (AbstractC1175c.a(mainActivity2, "android.permission.RECORD_AUDIO") != 0 && AbstractC1175c.a(mainActivity2, "android.permission.CAMERA") == 0) {
                            hVar.f13163r = permissionRequest;
                            mainActivity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, i7);
                        } else if (AbstractC1175c.a(mainActivity2, "android.permission.CAMERA") == 0 || AbstractC1175c.a(mainActivity2, "android.permission.RECORD_AUDIO") != 0) {
                            permissionRequest.grant(permissionRequest.getResources());
                        } else {
                            hVar.f13163r = permissionRequest;
                            mainActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, i);
                        }
                    } else if (z5 && AbstractC1175c.a(mainActivity2, "android.permission.RECORD_AUDIO") != 0) {
                        hVar.f13163r = permissionRequest;
                        mainActivity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, i7);
                    } else if (!z6 || AbstractC1175c.a(mainActivity2, "android.permission.CAMERA") == 0) {
                        permissionRequest.grant(permissionRequest.getResources());
                    } else {
                        hVar.f13163r = permissionRequest;
                        mainActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, i);
                    }
                }
                break;
            default:
                super.onPermissionRequest(permissionRequest);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        switch (this.f7854a) {
            case 1:
                super.onProgressChanged(webView, i);
                C0468k1 c0468k1 = this.f7855b;
                if (i >= 70) {
                    if (c0468k1.f7103y) {
                        c0468k1.f7102x = null;
                    } else if (!kotlin.jvm.internal.m.a(c0468k1.f7102x, String.valueOf(webView != null ? webView.getUrl() : null))) {
                        c0468k1.f7102x = null;
                    }
                }
                if (i == 100) {
                    C0458i c0458i = c0468k1.f7073d;
                    if ((c0458i != null ? c0458i.f7012r : null) != null) {
                        if (c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f7012r, Boolean.TRUE) : false) {
                            try {
                                CookieManager.getInstance().flush();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                    }
                    P5.S s6 = c0468k1.f7098t.f;
                    Boolean bool = Boolean.FALSE;
                    s6.getClass();
                    s6.h(null, bool);
                }
                if (webView != null) {
                    K1.v(webView, c0468k1);
                }
                c0468k1.f7053M.b();
                ((C1190b) this.f7856c).f14128b.k(Integer.valueOf(i));
                break;
            default:
                super.onProgressChanged(webView, i);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f7854a) {
            case 1:
                C0468k1 c0468k1 = this.f7855b;
                c0468k1.f7068a0 = false;
                E1.u uVar = c0468k1.f7088m;
                C0468k1 c0468k12 = (C0468k1) uVar.f1660d;
                MainActivity mainActivity = c0468k12.f7067a;
                uVar.f1659c = mainActivity.getRequestedOrientation();
                if (((View) uVar.f1661e) == null) {
                    uVar.f1661e = view;
                    uVar.f1658b = mainActivity.getWindow().getDecorView().getSystemUiVisibility();
                    uVar.f1657a = mainActivity.getRequestedOrientation();
                    uVar.f = customViewCallback;
                    View view2 = (View) uVar.f1661e;
                    if (view2 != null) {
                        view2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    }
                    C1164a c1164a = c0468k12.f7090n;
                    View view3 = (View) uVar.f1661e;
                    P5.S s6 = c1164a.f13850b;
                    Boolean bool = Boolean.TRUE;
                    s6.getClass();
                    s6.h(null, bool);
                    c1164a.f13852d.g(view3);
                    View decorView = mainActivity.getWindow().getDecorView();
                    kotlin.jvm.internal.m.d(decorView, "getDecorView(...)");
                    decorView.setSystemUiVisibility(-1281);
                    P5.S s7 = c0468k12.f7098t.f13871b;
                    Boolean bool2 = Boolean.FALSE;
                    s7.getClass();
                    s7.h(null, bool2);
                    mainActivity.setRequestedOrientation(4);
                } else {
                    uVar.a();
                }
                break;
            default:
                super.onShowCustomView(view, customViewCallback);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onShowFileChooser(android.webkit.WebView r34, android.webkit.ValueCallback r35, android.webkit.WebChromeClient.FileChooserParams r36) {
        /*
            r33 = this;
            r0 = r33
            int r1 = r0.f7854a
            switch(r1) {
                case 1: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r1 = super.onShowFileChooser(r34, r35, r36)
            return r1
        Lc:
            java.lang.String r1 = "fileChooserParams"
            r2 = r36
            kotlin.jvm.internal.m.e(r2, r1)
            R4.k1 r1 = r0.f7855b
            g5.h r3 = r1.f7059S
            r4 = r35
            r3.f13162q = r4
            p3.z0 r3 = r1.f7061U
            java.lang.Object r4 = r3.f15879e
            e.g r4 = (e.C1014g) r4
            java.lang.Object r5 = r3.f15876b
            com.web2native.MainActivity r5 = (com.web2native.MainActivity) r5
            java.lang.Object r6 = r3.f
            e.g r6 = (e.C1014g) r6
            java.lang.Object r7 = r3.f15877c
            e.g r7 = (e.C1014g) r7
            java.lang.Object r8 = r3.f15878d
            e.g r8 = (e.C1014g) r8
            java.lang.Object r3 = r3.f15875a
            R4.k1 r3 = (R4.C0468k1) r3
            boolean r9 = r2.isCaptureEnabled()
            java.lang.String[] r10 = r2.getAcceptTypes()
            kotlin.jvm.internal.m.b(r10)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            int r12 = r10.length
            r14 = 0
        L47:
            if (r14 >= r12) goto L12c
            r34 = 1
            r15 = r10[r14]
            java.lang.String r16 = "[,;\\s]"
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r16)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.m.d(r13, r0)
            java.lang.String r0 = "input"
            kotlin.jvm.internal.m.e(r15, r0)
            java.util.regex.Matcher r0 = r13.matcher(r15)
            boolean r13 = r0.find()
            if (r13 != 0) goto L70
            java.lang.String r0 = r15.toString()
            java.util.List r0 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r0)
            goto La3
        L70:
            java.util.ArrayList r13 = new java.util.ArrayList
            r16 = r0
            r0 = 10
            r13.<init>(r0)
            r0 = 0
        L7a:
            int r2 = r16.start()
            java.lang.CharSequence r0 = r15.subSequence(r0, r2)
            java.lang.String r0 = r0.toString()
            r13.add(r0)
            int r0 = r16.end()
            boolean r2 = r16.find()
            if (r2 != 0) goto L128
            int r2 = r15.length()
            java.lang.CharSequence r0 = r15.subSequence(r0, r2)
            java.lang.String r0 = r0.toString()
            r13.add(r0)
            r0 = r13
        La3:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto Ld1
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        Lb1:
            boolean r13 = r2.hasPrevious()
            if (r13 == 0) goto Ld1
            java.lang.Object r13 = r2.previous()
            java.lang.String r13 = (java.lang.String) r13
            int r13 = r13.length()
            if (r13 != 0) goto Lc4
            goto Lb1
        Lc4:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r2 = r2.nextIndex()
            int r2 = r2 + 1
            java.util.List r0 = n5.l.y0(r0, r2)
            goto Ld3
        Ld1:
            n5.s r0 = n5.s.f15299q
        Ld3:
            java.util.Collection r0 = (java.util.Collection) r0
            r2 = 0
            java.lang.String[] r13 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r13)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r13 = r0.length
            r15 = r2
        Le0:
            if (r15 >= r13) goto L11e
            r16 = r0
            r0 = r16[r15]
            r17 = r9
            java.lang.String r9 = "."
            boolean r9 = J5.t.G0(r0, r9, r2)
            if (r9 == 0) goto L109
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            r9 = r34
            java.lang.String r0 = r0.substring(r9)
            java.lang.String r9 = "substring(...)"
            kotlin.jvm.internal.m.d(r0, r9)
            java.lang.String r0 = r2.getMimeTypeFromExtension(r0)
            if (r0 == 0) goto L114
            r11.add(r0)
            goto L114
        L109:
            java.lang.String r2 = "/"
            boolean r2 = J5.m.K0(r0, r2)
            if (r2 == 0) goto L114
            r11.add(r0)
        L114:
            int r15 = r15 + 1
            r0 = r16
            r9 = r17
            r34 = 1
            r2 = 0
            goto Le0
        L11e:
            r17 = r9
            int r14 = r14 + 1
            r0 = r33
            r2 = r36
            goto L47
        L128:
            r34 = 1
            goto L7a
        L12c:
            r17 = r9
            boolean r0 = r11.isEmpty()
        */
        //  java.lang.String r2 = "*/*"
        /*
            if (r0 == 0) goto L139
            r11.add(r2)
        L139:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "the types = "
            r0.<init>(r9)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.io.PrintStream r9 = java.lang.System.out
            r9.println(r0)
            java.util.Iterator r0 = r11.iterator()
            java.lang.String r9 = "open_single_video_file"
            java.lang.String r11 = "open_multiple_video_file"
            java.lang.String r12 = " capture_video"
            java.lang.String r13 = "open_single_file"
            java.lang.String r14 = "open_multiple_file"
            java.lang.String r15 = "audio_recorder"
            r16 = r0
            java.lang.String r0 = "capture_choose_video"
            r18 = r0
            java.lang.String r0 = "open_single_image_file"
            r19 = r6
            java.lang.String r6 = "open_multiple_image_file"
            r20 = r7
            java.lang.String r7 = "capture_image"
            r21 = r7
            java.lang.String r7 = "capture_choose_image"
            r22 = r7
            java.lang.String r7 = "single_file_without_capture_option"
            r23 = r7
            java.lang.String r7 = "video/*"
            r24 = r5
            java.lang.String r5 = "image/*"
            r25 = r1
            java.lang.String r1 = "multiple_files_without_capture_option"
            r26 = r12
            java.lang.String r12 = "video"
            r27 = r14
            java.lang.String r14 = "image"
            if (r17 != 0) goto L1a2
            int r10 = r10.length
            r28 = r2
            r2 = 1
            if (r10 <= r2) goto L1a4
            int r10 = r36.getMode()
            r30 = r1
            r29 = r4
            r31 = r11
            if (r10 != r2) goto L19e
            goto L259
        L19e:
            r1 = r23
            goto L259
        L1a2:
            r28 = r2
        L1a4:
            java.lang.String r2 = ""
        L1a6:
            boolean r10 = r16.hasNext()
            r29 = r10
            java.lang.String r10 = "image_all"
            r30 = r1
            java.lang.String r1 = "audio"
            r31 = r11
            java.lang.String r11 = "video_all"
            if (r29 == 0) goto L1f3
            java.lang.Object r2 = r16.next()
            java.lang.String r2 = (java.lang.String) r2
            r29 = r4
            r4 = 0
            boolean r32 = J5.t.G0(r2, r5, r4)
            if (r32 == 0) goto L1c9
            r2 = r10
            goto L1ec
        L1c9:
            boolean r10 = J5.t.G0(r2, r14, r4)
            if (r10 == 0) goto L1d1
            r2 = r14
            goto L1ec
        L1d1:
            boolean r10 = J5.t.G0(r2, r7, r4)
            if (r10 == 0) goto L1d9
            r2 = r11
            goto L1ec
        L1d9:
            boolean r10 = J5.t.G0(r2, r12, r4)
            if (r10 == 0) goto L1e1
            r2 = r12
            goto L1ec
        L1e1:
            boolean r2 = J5.t.G0(r2, r1, r4)
            if (r2 == 0) goto L1e9
        L1e7:
            r2 = r1
            goto L1ec
        L1e9:
            java.lang.String r1 = "all"
            goto L1e7
        L1ec:
            r4 = r29
            r1 = r30
            r11 = r31
            goto L1a6
        L1f3:
            r29 = r4
            r4 = 0
            boolean r4 = J5.t.G0(r2, r14, r4)
            if (r4 == 0) goto L218
            if (r17 == 0) goto L208
            boolean r1 = r2.equals(r10)
            if (r1 == 0) goto L208
            r1 = r22
            goto L259
        L208:
            if (r17 == 0) goto L20d
            r1 = r21
            goto L259
        L20d:
            int r1 = r36.getMode()
            r2 = 1
            if (r1 != r2) goto L216
            r1 = r6
            goto L259
        L216:
            r1 = r0
            goto L259
        L218:
            if (r17 == 0) goto L223
            boolean r4 = r2.equals(r11)
            if (r4 == 0) goto L223
            r1 = r18
            goto L259
        L223:
            boolean r4 = r2.equals(r12)
            if (r4 != 0) goto L22f
            boolean r4 = r2.equals(r11)
            if (r4 == 0) goto L231
        L22f:
            r2 = 1
            goto L24a
        L231:
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L239
            r1 = r15
            goto L259
        L239:
            int r1 = r36.getMode()
            r2 = 1
            if (r1 != r2) goto L248
            if (r17 == 0) goto L245
            r1 = r27
            goto L259
        L245:
            r1 = r30
            goto L259
        L248:
            r1 = r13
            goto L259
        L24a:
            if (r17 == 0) goto L24f
            r1 = r26
            goto L259
        L24f:
            int r1 = r36.getMode()
            if (r1 != r2) goto L258
            r1 = r31
            goto L259
        L258:
            r1 = r9
        L259:
            int r2 = r1.hashCode()
            r4 = 0
            java.lang.String r10 = "android.permission.CAMERA"
            switch(r2) {
                case -2000042206: goto L379;
                case -1516013172: goto L35c;
                case -1504123732: goto L33f;
                case -1113265519: goto L32f;
                case -986159582: goto L309;
                case -890535658: goto L2f0;
                case -874654084: goto L2de;
                case 112336602: goto L2ce;
                case 287413754: goto L2c0;
                case 716766366: goto L2a9;
                case 1367790690: goto L29d;
                case 1542867842: goto L291;
                case 1807167239: goto L265;
                default: goto L263;
            }
        L263:
            goto L389
        L265:
            boolean r0 = r1.equals(r15)
            if (r0 != 0) goto L26d
            goto L389
        L26d:
            j5.b r0 = r3.f7062V
            P5.S r1 = r0.f13857e
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.getClass()
            r1.h(r4, r2)
            P5.S r1 = r0.f13855c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.getClass()
            r1.h(r4, r2)
            P5.S r1 = r0.f13856d
            r1.getClass()
            r1.h(r4, r2)
            r0.e()
        L28e:
            r2 = 1
            goto L39f
        L291:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L299
            goto L389
        L299:
            r8.u(r5)
            goto L28e
        L29d:
            boolean r0 = r1.equals(r9)
            if (r0 != 0) goto L2a5
            goto L389
        L2a5:
            r8.u(r7)
            goto L28e
        L2a9:
            boolean r0 = r1.equals(r13)
            if (r0 != 0) goto L2b1
            goto L389
        L2b1:
            j5.b r0 = r3.f7062V
            r0.f()
            r0.g()
            r0.e()
            r0.c()
            goto L28e
        L2c0:
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L2c8
            goto L389
        L2c8:
            r4 = r29
            r4.u(r5)
            goto L28e
        L2ce:
            r4 = r29
            r0 = r31
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2da
            goto L389
        L2da:
            r4.u(r7)
            goto L28e
        L2de:
            r4 = r29
            r0 = r30
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2ea
            goto L389
        L2ea:
            r0 = r28
            r4.u(r0)
            goto L28e
        L2f0:
            r0 = r27
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2fa
            goto L389
        L2fa:
            j5.b r0 = r3.f7062V
            r0.f()
            r0.g()
            r0.e()
            r0.c()
            goto L28e
        L309:
            r0 = r26
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L313
            goto L389
        L313:
            r0 = r25
            g5.h r0 = r0.f7059S
            r0.f13161p = r1
            r5 = r24
            int r0 = k1.AbstractC1175c.a(r5, r10)
            if (r0 != 0) goto L328
            r7 = r20
            r7.u(r12)
            goto L28e
        L328:
            r6 = r19
            r6.u(r10)
            goto L28e
        L32f:
            r2 = r23
            r0 = r28
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L33a
            goto L389
        L33a:
            r8.u(r0)
            goto L28e
        L33f:
            r0 = r18
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L348
            goto L389
        L348:
            j5.b r0 = r3.f7062V
            P5.S r1 = r0.f13855c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.getClass()
            r1.h(r4, r2)
            r0.c()
            r0.e()
            goto L28e
        L35c:
            r0 = r22
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L365
            goto L389
        L365:
            j5.b r0 = r3.f7062V
            P5.S r1 = r0.f13856d
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.getClass()
            r1.h(r4, r2)
            r0.c()
            r0.e()
            goto L28e
        L379:
            r6 = r19
            r7 = r20
            r2 = r21
            r5 = r24
            r0 = r25
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L38b
        L389:
            goto L28e
        L38b:
            g5.h r0 = r0.f7059S
            r0.f13161p = r1
            int r0 = k1.AbstractC1175c.a(r5, r10)
            if (r0 != 0) goto L39a
            r7.u(r14)
            goto L28e
        L39a:
            r6.u(r10)
            goto L28e
        L39f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.r.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public r(P.W w3, C0468k1 c0468k1) {
        this.f7856c = w3;
        this.f7855b = c0468k1;
    }
}
