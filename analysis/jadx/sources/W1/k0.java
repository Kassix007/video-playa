package w1;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends j0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o0 f18225s = o0.g(null, WindowInsets.CONSUMED);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k0(o0 o0Var, WindowInsets windowInsets) {
        super(o0Var, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.j0, w1.f0, w1.l0
    public n1.b g(int i) {
        return n1.b.c(this.f18202c.getInsets(n0.a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.j0, w1.f0, w1.l0
    public n1.b h(int i) {
        return n1.b.c(this.f18202c.getInsetsIgnoringVisibility(n0.a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.j0, w1.f0, w1.l0
    public boolean q(int i) {
        return this.f18202c.isVisible(n0.a(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public k0(o0 o0Var, k0 k0Var) {
        super(o0Var, k0Var);
    }
}
