package g5;

import O3.C0279e0;
import R4.C0468k1;
import T1.p;
import T1.u;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f13174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0279e0 f13175r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ k(C0279e0 c0279e0, int i) {
        this.f13174q = i;
        this.f13175r = c0279e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        p pVarF;
        switch (this.f13174q) {
            case 0:
                this.f13175r.f4840a = false;
                break;
            default:
                C0279e0 c0279e0 = this.f13175r;
                C0468k1 c0468k1 = (C0468k1) c0279e0.f4844e;
                WebView webView = c0468k1.f7084k;
                m.b(webView);
                if (webView.getProgress() < 70) {
                    c0279e0.f4843d = false;
                    new Handler(Looper.getMainLooper()).postDelayed(new k(c0279e0, 1), 100L);
                } else {
                    String str = null;
                    c0279e0.f4842c = null;
                    u uVar2 = c0468k1.f7075e;
                    if (uVar2 != null && (pVarF = uVar2.f7418b.f()) != null) {
                        str = (String) pVarF.f7404r.f8095e;
                    }
                    if (m.a(str, "noInternetScreen") && (uVar = c0468k1.f7075e) != null) {
                        uVar.c();
                    }
                    c0279e0.f4841b = false;
                }
                break;
        }
    }
}
