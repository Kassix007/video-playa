package w1;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends i0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o0 f18224r = o0.g(null, WindowInsets.CONSUMED);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j0(o0 o0Var, WindowInsets windowInsets) {
        super(o0Var, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.f0, w1.l0
    public n1.b g(int i) {
        return n1.b.c(this.f18202c.getInsets(m0.a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.f0, w1.l0
    public n1.b h(int i) {
        return n1.b.c(this.f18202c.getInsetsIgnoringVisibility(m0.a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.f0, w1.l0
    public boolean q(int i) {
        return this.f18202c.isVisible(m0.a(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public j0(o0 o0Var, j0 j0Var) {
        super(o0Var, j0Var);
    }

    @Override // w1.f0, w1.l0
    public final void d(View view) {
    }
}
