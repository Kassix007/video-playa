package A;

import a.AbstractC0597a;
import android.os.Build;
import android.view.View;
import com.wnapp.smspariaz.R;
import java.util.WeakHashMap;
import r.C1549H;
import w1.C1845h;
import w1.o0;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final WeakHashMap f60v = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0004a f61a = C0005b.c(4, "captionBar");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0004a f62b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0004a f63c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0004a f64d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0004a f65e;
    public final C0004a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0004a f66g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0004a f67h;
    public final C0004a i;
    public final V j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final U f68k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V f69l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V f70m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V f71n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V f72o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V f73p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V f74q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V f75r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f76s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f77t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final D f78u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Z(View view) {
        C0004a c0004aC = C0005b.c(128, "displayCutout");
        this.f62b = c0004aC;
        C0004a c0004aC2 = C0005b.c(8, "ime");
        this.f63c = c0004aC2;
        C0004a c0004aC3 = C0005b.c(32, "mandatorySystemGestures");
        this.f64d = c0004aC3;
        this.f65e = C0005b.c(2, "navigationBars");
        this.f = C0005b.c(1, "statusBars");
        C0004a c0004aC4 = C0005b.c(519, "systemBars");
        this.f66g = c0004aC4;
        C0004a c0004aC5 = C0005b.c(16, "systemGestures");
        this.f67h = c0004aC5;
        C0004a c0004aC6 = C0005b.c(64, "tappableElement");
        this.i = c0004aC6;
        V v6 = new V(new G(0, 0, 0, 0), "waterfall");
        this.j = v6;
        this.f68k = new U(new U(c0004aC4, c0004aC2), c0004aC);
        new U(new U(new U(c0004aC6, c0004aC3), c0004aC5), v6);
        this.f69l = C0005b.d(4, "captionBarIgnoringVisibility");
        this.f70m = C0005b.d(2, "navigationBarsIgnoringVisibility");
        this.f71n = C0005b.d(1, "statusBarsIgnoringVisibility");
        this.f72o = C0005b.d(519, "systemBarsIgnoringVisibility");
        this.f73p = C0005b.d(64, "tappableElementIgnoringVisibility");
        this.f74q = C0005b.d(8, "imeAnimationTarget");
        this.f75r = C0005b.d(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f76s = bool != null ? bool.booleanValue() : true;
        this.f78u = new D(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Z z5, o0 o0Var) {
        boolean z6 = false;
        z5.f61a.f(o0Var, 0);
        z5.f63c.f(o0Var, 0);
        z5.f62b.f(o0Var, 0);
        z5.f65e.f(o0Var, 0);
        z5.f.f(o0Var, 0);
        z5.f66g.f(o0Var, 0);
        z5.f67h.f(o0Var, 0);
        z5.i.f(o0Var, 0);
        z5.f64d.f(o0Var, 0);
        z5.f69l.f(AbstractC0597a.U(o0Var.f18232a.h(4)));
        z5.f70m.f(AbstractC0597a.U(o0Var.f18232a.h(2)));
        z5.f71n.f(AbstractC0597a.U(o0Var.f18232a.h(1)));
        z5.f72o.f(AbstractC0597a.U(o0Var.f18232a.h(519)));
        z5.f73p.f(AbstractC0597a.U(o0Var.f18232a.h(64)));
        C1845h c1845hF = o0Var.f18232a.f();
        if (c1845hF != null) {
            z5.j.f(AbstractC0597a.U(Build.VERSION.SDK_INT >= 30 ? n1.b.c(E0.e.c(c1845hF.f18215a)) : n1.b.f15124e));
        }
        synchronized (a0.n.f8680b) {
            C1549H c1549h = a0.n.i.f8653h;
            if (c1549h != null) {
                if (c1549h.h()) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            a0.n.a();
        }
    }
}
