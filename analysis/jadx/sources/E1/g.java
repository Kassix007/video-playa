package E1;

import android.graphics.Rect;
import android.view.View;
import d2.AbstractC0960G;
import d2.C0995u;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1634c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(AbstractC0960G abstractC0960G) {
        this.f1632a = Integer.MIN_VALUE;
        this.f1634c = new Rect();
        this.f1633b = abstractC0960G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static g a(AbstractC0960G abstractC0960G, int i) {
        if (i == 0) {
            return new C0995u(abstractC0960G, 0);
        }
        if (i == 1) {
            return new C0995u(abstractC0960G, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public g(k kVar) {
        this.f1632a = 0;
        this.f1634c = new C0146d();
        this.f1633b = kVar;
    }
}
