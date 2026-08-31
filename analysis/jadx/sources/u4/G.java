package U4;

import C0.RunnableC0089m;
import R4.C0468k1;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7741r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ G(C0468k1 c0468k1, int i) {
        this.f7740q = i;
        this.f7741r = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7740q) {
            case 0:
                WebView webView = this.f7741r.f7084k;
                kotlin.jvm.internal.m.b(webView);
                ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                layoutParams.height = -2;
                webView.setLayoutParams(layoutParams);
                webView.post(new RunnableC0089m(20, webView));
                break;
            case 1:
                WebView webView2 = this.f7741r.f7084k;
                kotlin.jvm.internal.m.b(webView2);
                ViewGroup.LayoutParams layoutParams2 = webView2.getLayoutParams();
                layoutParams2.height = -2;
                webView2.setLayoutParams(layoutParams2);
                webView2.post(new RunnableC0089m(20, webView2));
                break;
            default:
                C0468k1 c0468k1 = this.f7741r;
                WebView webView3 = c0468k1.f7084k;
                if (webView3 != null) {
                    webView3.loadUrl(c0468k1.j);
                }
                break;
        }
    }
}
