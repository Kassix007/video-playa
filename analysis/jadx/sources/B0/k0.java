package B0;

import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0 f454r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(n0 n0Var, int i) {
        super(0);
        this.f453q = i;
        this.f454r = n0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f453q) {
            case 0:
                n0 n0Var = this.f454r;
                j0.m mVar = n0Var.f494R;
                kotlin.jvm.internal.m.b(mVar);
                n0Var.u0(mVar, n0Var.f493Q);
                break;
            default:
                n0 n0Var2 = this.f454r.f480D;
                if (n0Var2 != null) {
                    n0Var2.I0();
                }
                break;
        }
        return C1386y.f15098a;
    }
}
