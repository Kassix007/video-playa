package R4;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k3 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7108q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l3 f7109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f7110s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ k3(l3 l3Var, boolean z5) {
        this.f7109r = l3Var;
        this.f7110s = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7108q) {
            case 0:
                boolean z5 = this.f7110s;
                l3 l3Var = this.f7109r;
                if (!z5) {
                    C0468k1 c0468k1 = l3Var.f7114a;
                    WebView webView = c0468k1.f7084k;
                    c0468k1.f7102x = webView != null ? webView.getUrl() : null;
                    c0468k1.f7098t.d(false);
                    b4.e eVar = c0468k1.f7101w;
                    kotlin.jvm.internal.m.b(eVar);
                    eVar.setVisibility(8);
                } else {
                    b4.e eVar2 = l3Var.f7114a.f7101w;
                    kotlin.jvm.internal.m.b(eVar2);
                    eVar2.setVisibility(0);
                    l3Var.f7114a.f7098t.d(true);
                }
                break;
            default:
                l3 l3Var2 = this.f7109r;
                WebView webView2 = l3Var2.f7114a.f7084k;
                kotlin.jvm.internal.m.b(webView2);
                webView2.clearCache(true);
                C0468k1 c0468k12 = l3Var2.f7114a;
                WebView webView3 = c0468k12.f7084k;
                kotlin.jvm.internal.m.b(webView3);
                webView3.clearHistory();
                WebView webView4 = c0468k12.f7084k;
                kotlin.jvm.internal.m.b(webView4);
                webView4.clearFormData();
                webView4.getSettings().setCacheMode(2);
                if (this.f7110s) {
                    webView4.reload();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ k3(boolean z5, l3 l3Var) {
        this.f7110s = z5;
        this.f7109r = l3Var;
    }
}
