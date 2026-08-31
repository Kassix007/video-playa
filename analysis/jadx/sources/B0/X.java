package B0;

import m5.C1386y;
import z0.AbstractC1932I;

/* JADX INFO: loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y f337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t0 f338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f339s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y6, t0 t0Var, long j) {
        super(0);
        this.f337q = y6;
        this.f338r = t0Var;
        this.f339s = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        U uZ0;
        P p7 = this.f337q.f353v;
        AbstractC1932I placementScope = null;
        if (AbstractC0041g.q(p7.f299a) || p7.f301c) {
            n0 n0Var = p7.a().f480D;
            if (n0Var != null) {
                placementScope = n0Var.f323y;
            }
        } else {
            n0 n0Var2 = p7.a().f480D;
            if (n0Var2 != null && (uZ0 = n0Var2.z0()) != null) {
                placementScope = uZ0.f323y;
            }
        }
        if (placementScope == null) {
            placementScope = ((C0.A) this.f338r).getPlacementScope();
        }
        U uZ02 = p7.a().z0();
        kotlin.jvm.internal.m.b(uZ02);
        AbstractC1932I.e(placementScope, uZ02, this.f339s);
        return C1386y.f15098a;
    }
}
