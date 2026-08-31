package U4;

import R4.C0466k;
import R4.C0468k1;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.widget.Toast;
import m5.C1386y;

/* JADX INFO: renamed from: U4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0547n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P.W f7846s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0547n(P.W w3, C0468k1 c0468k1, int i) {
        this.f7844q = i;
        this.f7846s = w3;
        this.f7845r = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f7844q) {
            case 0:
                WebView webView = (WebView) this.f7846s.getValue();
                if (webView != null) {
                    if (webView.canGoBack()) {
                        webView.goBack();
                    } else {
                        T1.u uVar = this.f7845r.f7075e;
                        if (uVar != null) {
                            uVar.c();
                        }
                    }
                }
                return C1386y.f15098a;
            case 1:
                ((C0466k) this.f7846s.getValue()).b(this.f7845r);
                break;
            case 2:
                ((C0466k) this.f7846s.getValue()).b(this.f7845r);
                break;
            case 3:
                WebView webView2 = (WebView) this.f7846s.getValue();
                if (webView2 != null) {
                    if (webView2.canGoBack()) {
                        webView2.goBack();
                    } else {
                        T1.u uVar2 = this.f7845r.f7075e;
                        if (uVar2 != null) {
                            uVar2.c();
                        }
                    }
                }
                return C1386y.f15098a;
            case 4:
                Boolean bool = Boolean.TRUE;
                P.W w3 = this.f7846s;
                boolean zBooleanValue = ((Boolean) w3.getValue()).booleanValue();
                C0468k1 c0468k1 = this.f7845r;
                if (zBooleanValue) {
                    c0468k1.f7067a.finishAndRemoveTask();
                    c0468k1.f7067a.finish();
                }
                w3.setValue(bool);
                Toast.makeText(c0468k1.f7071c, "Press again to exit", 0).show();
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0543j(w3, 2), 2000L);
                break;
            default:
                Boolean bool2 = Boolean.TRUE;
                P.W w6 = this.f7846s;
                boolean zBooleanValue2 = ((Boolean) w6.getValue()).booleanValue();
                C0468k1 c0468k12 = this.f7845r;
                if (zBooleanValue2) {
                    c0468k12.f7067a.finishAndRemoveTask();
                    c0468k12.f7067a.finish();
                }
                w6.setValue(bool2);
                Toast.makeText(c0468k12.f7071c, "Press again to exit", 0).show();
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0543j(w6, 3), 2000L);
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0547n(C0468k1 c0468k1, P.W w3, int i) {
        this.f7844q = i;
        this.f7845r = c0468k1;
        this.f7846s = w3;
    }
}
