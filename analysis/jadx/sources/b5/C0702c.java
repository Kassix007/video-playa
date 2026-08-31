package b5;

import B5.e;
import M5.InterfaceC0261w;
import P.W;
import R4.C0468k1;
import U4.C0550q;
import U4.r;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.wnapp.smspariaz.R;
import k5.C1190b;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import s5.i;

/* JADX INFO: renamed from: b5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0702c extends i implements e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f10014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f10015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f10016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f10017t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0702c(C0468k1 c0468k1, W w3, W w6, W w7, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f10014q = c0468k1;
        this.f10015r = w3;
        this.f10016s = w6;
        this.f10017t = w7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0702c(this.f10014q, this.f10015r, this.f10016s, this.f10017t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0702c c0702c = (C0702c) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c0702c.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        AbstractC1362a.e(obj);
        WebView webView = (WebView) ((View) this.f10015r.getValue()).findViewById(R.id.exturls_webview);
        C0468k1 c0468k1 = this.f10014q;
        c0468k1.getClass();
        W w3 = this.f10016s;
        w3.setValue(webView);
        WebView webView2 = (WebView) w3.getValue();
        m.b(webView2);
        WebSettings settings = webView2.getSettings();
        m.d(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        webView2.clearCache(true);
        webView2.clearHistory();
        webView2.clearFormData();
        settings.setCacheMode(2);
        settings.setMixedContentMode(0);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        C1190b c1190b = new C1190b();
        webView2.setWebViewClient(new C0550q(webView2, c0468k1));
        webView2.setWebChromeClient(new r(c0468k1, c1190b));
        c0468k1.f7086l = c1190b;
        settings.setUserAgentString("Mozilla/5.0 (Linux; Android 12) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0 Mobile Safari/537.36");
        CookieManager.getInstance().setAcceptCookie(true);
        settings.setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView2, true);
        webView2.setOnScrollChangeListener(new ViewOnScrollChangeListenerC0700a(c0468k1, 0));
        String str4 = c0468k1.f7041A;
        if ((str4 == null || !J5.m.K0(str4, "gsi")) && (((str = c0468k1.f7041A) == null || !J5.m.K0(str, "gis_transform")) && (((str2 = c0468k1.f7041A) == null || !J5.m.K0(str2, "gis")) && ((str3 = c0468k1.f7041A) == null || !J5.m.K0(str3, "__/auth/handler"))))) {
            WebView webView3 = (WebView) w3.getValue();
            m.b(webView3);
            webView3.loadUrl(String.valueOf(c0468k1.f7041A));
        } else {
            WebView webView4 = (WebView) w3.getValue();
            m.b(webView4);
            webView4.loadUrl(String.valueOf(c0468k1.f7041A));
        }
        this.f10017t.setValue(Boolean.TRUE);
        return C1386y.f15098a;
    }
}
