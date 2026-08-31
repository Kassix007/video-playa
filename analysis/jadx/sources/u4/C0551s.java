package U4;

import M5.InterfaceC0261w;
import R4.C0468k1;
import android.content.Context;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.wnapp.smspariaz.R;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: U4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0551s extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P.W f7858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P.W f7859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f7860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ P.W f7861u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0551s(C0468k1 c0468k1, P.W w3, P.W w6, Context context, P.W w7, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7857q = c0468k1;
        this.f7858r = w3;
        this.f7859s = w6;
        this.f7860t = context;
        this.f7861u = w7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0551s(this.f7857q, this.f7858r, this.f7859s, this.f7860t, this.f7861u, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0551s c0551s = (C0551s) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c0551s.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        WebView webView = (WebView) ((View) this.f7858r.getValue()).findViewById(R.id.exturls_webview);
        P.W w3 = this.f7859s;
        w3.setValue(webView);
        WebView webView2 = (WebView) w3.getValue();
        kotlin.jvm.internal.m.b(webView2);
        C0468k1 c0468k1 = this.f7857q;
        webView2.loadUrl(String.valueOf(c0468k1.f7041A));
        WebView webView3 = (WebView) w3.getValue();
        kotlin.jvm.internal.m.b(webView3);
        WebSettings settings = webView3.getSettings();
        kotlin.jvm.internal.m.d(settings, "getSettings(...)");
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        WebView webView4 = (WebView) w3.getValue();
        kotlin.jvm.internal.m.b(webView4);
        webView4.setScrollBarStyle(0);
        settings.setUserAgentString("Mozilla/5.0 (Linux; Android 12) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0 Mobile Safari/537.36");
        WebView webView5 = (WebView) w3.getValue();
        kotlin.jvm.internal.m.b(webView5);
        webView5.setWebViewClient(new C0550q(c0468k1, this.f7860t, w3));
        WebView webView6 = (WebView) w3.getValue();
        kotlin.jvm.internal.m.b(webView6);
        webView6.setWebChromeClient(new r(w3, c0468k1));
        settings.setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies((WebView) w3.getValue(), true);
        this.f7861u.setValue(Boolean.TRUE);
        return C1386y.f15098a;
    }
}
