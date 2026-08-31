package M5;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends e0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i0 f3850u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h0 f3851v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0251l f3852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f3853x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g0(i0 i0Var, h0 h0Var, C0251l c0251l, Object obj) {
        this.f3850u = i0Var;
        this.f3851v = h0Var;
        this.f3852w = c0251l;
        this.f3853x = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.e0
    public final boolean k() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.e0
    public final void l(Throwable th) {
        C0251l c0251l = this.f3852w;
        C0251l c0251lQ = i0.Q(c0251l);
        i0 i0Var = this.f3850u;
        h0 h0Var = this.f3851v;
        Object obj = this.f3853x;
        if (c0251lQ == null || !i0Var.a0(h0Var, c0251lQ, obj)) {
            h0Var.f3862q.e(new R5.i(2), 2);
            C0251l c0251lQ2 = i0.Q(c0251l);
            if (c0251lQ2 == null || !i0Var.a0(h0Var, c0251lQ2, obj)) {
                i0Var.m(i0Var.A(h0Var, obj));
            }
        }
    }
}
