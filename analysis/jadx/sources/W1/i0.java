package w1;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class i0 extends h0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n1.b f18216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n1.b f18217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n1.b f18218q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i0(o0 o0Var, WindowInsets windowInsets) {
        super(o0Var, windowInsets);
        this.f18216o = null;
        this.f18217p = null;
        this.f18218q = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public n1.b i() {
        if (this.f18217p == null) {
            this.f18217p = n1.b.c(this.f18202c.getMandatorySystemGestureInsets());
        }
        return this.f18217p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public n1.b k() {
        if (this.f18216o == null) {
            this.f18216o = n1.b.c(this.f18202c.getSystemGestureInsets());
        }
        return this.f18216o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.l0
    public n1.b m() {
        if (this.f18218q == null) {
            this.f18218q = n1.b.c(this.f18202c.getTappableElementInsets());
        }
        return this.f18218q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.f0, w1.l0
    public o0 n(int i, int i7, int i8, int i9) {
        return o0.g(null, this.f18202c.inset(i, i7, i8, i9));
    }

    public i0(o0 o0Var, i0 i0Var) {
        super(o0Var, i0Var);
        this.f18216o = null;
        this.f18217p = null;
        this.f18218q = null;
    }

    @Override // w1.g0, w1.l0
    public void u(n1.b bVar) {
    }
}
