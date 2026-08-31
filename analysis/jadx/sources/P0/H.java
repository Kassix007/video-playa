package p0;

import B0.G0;
import B0.N;
import P.C0345b;
import P.C0348c0;
import P.C0354f0;
import i0.C1133e;
import i1.C1134a;
import l0.C1219b;
import o0.AbstractC1412b;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC1412b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public j0.j f15498A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15499B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0354f0 f15500v = C0345b.q(new C1133e(0));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0354f0 f15501w = C0345b.q(Boolean.FALSE);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1430D f15502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0348c0 f15503y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f15504z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public H(C1435c c1435c) {
        C1430D c1430d = new C1430D(c1435c);
        c1430d.f = new A0.d(24, this);
        this.f15502x = c1430d;
        this.f15503y = new C0348c0(0);
        this.f15504z = 1.0f;
        this.f15499B = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final boolean a(float f) {
        this.f15504z = f;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final boolean d(j0.j jVar) {
        this.f15498A = jVar;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final long h() {
        return ((C1133e) this.f15500v.getValue()).f13533a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final void i(N n7) {
        C1219b c1219b = n7.f296q;
        j0.j jVar = this.f15498A;
        C1430D c1430d = this.f15502x;
        if (jVar == null) {
            jVar = (j0.j) c1430d.f15482g.getValue();
        }
        if (((Boolean) this.f15501w.getValue()).booleanValue() && n7.getLayoutDirection() == W0.l.f8023r) {
            long jM = c1219b.M();
            G0 g02 = c1219b.f14425r;
            long jE = g02.E();
            g02.t().k();
            try {
                ((C1134a) g02.f234r).y(-1.0f, 1.0f, jM);
                c1430d.e(n7, this.f15504z, jVar);
            } finally {
                g02.t().i();
                g02.X(jE);
            }
        } else {
            c1430d.e(n7, this.f15504z, jVar);
        }
        this.f15499B = this.f15503y.e();
    }
}
