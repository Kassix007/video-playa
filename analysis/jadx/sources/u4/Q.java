package U4;

import P.C0345b;
import P.C0371o;
import R4.C0468k1;
import R4.F1;
import R4.O1;
import R4.Y0;
import android.webkit.WebView;
import com.web2native.MainActivity;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f7766u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Q(C0468k1 c0468k1, Object obj, Object obj2, Object obj3, int i, int i7) {
        this.f7762q = i7;
        this.f7764s = c0468k1;
        this.f7765t = obj;
        this.f7763r = obj2;
        this.f7766u = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7762q) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0534a.n((C0468k1) this.f7764s, (F1) this.f7765t, (MainActivity) this.f7763r, (B5.c) this.f7766u, (C0371o) obj, C0345b.w(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                Z4.L.d((MainActivity) this.f7763r, (WebView) this.f7764s, (MainActivity) this.f7765t, (Z4.M) this.f7766u, (C0371o) obj, C0345b.w(4097));
                break;
            case 2:
                ((Integer) obj2).getClass();
                C3.a.h((C0468k1) this.f7764s, (Y0) this.f7765t, (MainActivity) this.f7763r, (B5.c) this.f7766u, (C0371o) obj, C0345b.w(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                Q2.g.e((C0468k1) this.f7764s, (String) this.f7765t, (String) this.f7763r, (String) this.f7766u, (C0371o) obj, C0345b.w(1));
                break;
            default:
                ((Integer) obj2).getClass();
                E3.h.f((C0468k1) this.f7764s, (O1) this.f7765t, (MainActivity) this.f7763r, (B5.c) this.f7766u, (C0371o) obj, C0345b.w(1));
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ Q(MainActivity mainActivity, WebView webView, MainActivity mainActivity2, Z4.M m4, int i) {
        this.f7762q = 1;
        this.f7763r = mainActivity;
        this.f7764s = webView;
        this.f7765t = mainActivity2;
        this.f7766u = m4;
    }
}
