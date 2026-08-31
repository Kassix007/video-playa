package v;

import B0.G0;
import i1.C1134a;
import j0.AbstractC1145B;
import l0.C1219b;
import l0.C1224g;
import l0.InterfaceC1221d;
import m5.C1386y;

/* JADX INFO: renamed from: v.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1724t extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f17386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC1145B f17387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f17388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f17389t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f17390u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f17391v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f17392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1224g f17393x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1724t(boolean z5, j0.G g7, long j, float f, float f7, long j7, long j8, C1224g c1224g) {
        super(1);
        this.f17386q = z5;
        this.f17387r = g7;
        this.f17388s = j;
        this.f17389t = f;
        this.f17390u = f7;
        this.f17391v = j7;
        this.f17392w = j8;
        this.f17393x = c1224g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        B0.N n7 = (B0.N) obj;
        n7.a();
        C1219b c1219b = n7.f296q;
        if (this.f17386q) {
            InterfaceC1221d.B(n7, this.f17387r, 0L, 0L, this.f17388s, null, 246);
        } else {
            long j = this.f17388s;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float f = this.f17389t;
            if (fIntBitsToFloat < f) {
                float f7 = this.f17390u;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1219b.d() >> 32));
                float f8 = this.f17390u;
                float f9 = fIntBitsToFloat2 - f8;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c1219b.d() & 4294967295L)) - f8;
                AbstractC1145B abstractC1145B = this.f17387r;
                long j7 = this.f17388s;
                G0 g02 = c1219b.f14425r;
                long jE = g02.E();
                g02.t().k();
                try {
                    ((G0) ((C1134a) g02.f234r).f13535r).t().g(f7, f7, f9, fIntBitsToFloat3, 0);
                    InterfaceC1221d.B(n7, abstractC1145B, 0L, 0L, j7, null, 246);
                } finally {
                    g02.t().i();
                    g02.X(jE);
                }
            } else {
                InterfaceC1221d.B(n7, this.f17387r, this.f17391v, this.f17392w, l6.d.E(j, f), this.f17393x, 208);
            }
        }
        return C1386y.f15098a;
    }
}
