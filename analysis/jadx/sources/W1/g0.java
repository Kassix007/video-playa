package w1;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends f0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n1.b f18214n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g0(o0 o0Var, WindowInsets windowInsets) {
        super(o0Var, windowInsets);
        this.f18214n = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public o0 b() {
        return o0.g(null, this.f18202c.consumeStableInsets());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public o0 c() {
        return o0.g(null, this.f18202c.consumeSystemWindowInsets());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public final n1.b j() {
        if (this.f18214n == null) {
            WindowInsets windowInsets = this.f18202c;
            this.f18214n = n1.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f18214n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public boolean o() {
        return this.f18202c.isConsumed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public void u(n1.b bVar) {
        this.f18214n = bVar;
    }

    public g0(o0 o0Var, g0 g0Var) {
        super(o0Var, g0Var);
        this.f18214n = null;
        this.f18214n = g0Var.f18214n;
    }
}
