package R4;

import B0.C0050o;
import android.content.res.Configuration;
import android.webkit.WebView;
import m5.C1386y;

/* JADX INFO: renamed from: R4.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0520x2 implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0050o f7215r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0520x2(int i, C0050o c0050o) {
        this.f7214q = i;
        this.f7215r = c0050o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        WebView webView;
        switch (this.f7214q) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.m.e(it, "it");
                C0468k1 c0468k1 = (C0468k1) this.f7215r.f499q;
                if (C3.a.C(c0468k1, it) && c0468k1.f7053M.b() && (webView = c0468k1.f7084k) != null) {
                    webView.loadUrl(it);
                }
                break;
            default:
                Configuration configuration = (Configuration) obj;
                a5.y yVar = (a5.y) this.f7215r.f500r;
                if (yVar != null) {
                    kotlin.jvm.internal.m.b(configuration);
                    yVar.f9010d.k(configuration);
                }
                break;
        }
        return C1386y.f15098a;
    }
}
