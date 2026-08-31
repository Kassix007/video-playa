package M;

import B0.AbstractC0041g;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0230s f3608r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(C0230s c0230s, int i) {
        super(0);
        this.f3607q = i;
        this.f3608r = c0230s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        int i = this.f3607q;
        C0230s c0230s = this.f3608r;
        switch (i) {
            case 0:
                return s0.f3615a;
            default:
                if (((r0) AbstractC0041g.i(c0230s, t0.f3619b)) == null) {
                    L.b bVar = c0230s.f3614K;
                    if (bVar != null) {
                        c0230s.y0(bVar);
                    }
                } else if (c0230s.f3614K == null) {
                    k3.d dVar = new k3.d(8, c0230s);
                    r rVar = new r(c0230s, 0);
                    y.i iVar = c0230s.f3610G;
                    boolean z5 = c0230s.f3611H;
                    float f = c0230s.f3612I;
                    u.z0 z0Var = L.l.f3046a;
                    L.b bVar2 = new L.b(iVar, z5, f, dVar, rVar);
                    c0230s.x0(bVar2);
                    c0230s.f3614K = bVar2;
                }
                return C1386y.f15098a;
        }
    }
}
