package t;

import P.S0;
import l0.InterfaceC1221d;
import m5.C1386y;
import u.AbstractC1644d;
import u.InterfaceC1671z;
import u.q0;

/* JADX INFO: renamed from: t.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1611j extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f16614s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611j(long j, S0 s02) {
        super(1);
        this.f16612q = 2;
        this.f16614s = j;
        this.f16613r = s02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        long j;
        InterfaceC1671z interfaceC1671z;
        long j7;
        switch (this.f16612q) {
            case 0:
                q0 q0Var = (q0) obj;
                Object objA = q0Var.a();
                C1612k c1612k = (C1612k) this.f16613r;
                if (kotlin.jvm.internal.m.a(objA, c1612k.f16617G.a())) {
                    j = W0.k.a(c1612k.f16618H, androidx.compose.animation.a.f9229a) ? this.f16614s : c1612k.f16618H;
                } else {
                    S0 s02 = (S0) c1612k.f16617G.f16622d.g(q0Var.a());
                    j = s02 != null ? ((W0.k) s02.getValue()).f8021a : 0L;
                }
                S0 s03 = (S0) c1612k.f16617G.f16622d.g(q0Var.c());
                long j8 = s03 != null ? ((W0.k) s03.getValue()).f8021a : 0L;
                C1601J c1601j = (C1601J) c1612k.f16616F.getValue();
                return (c1601j == null || (interfaceC1671z = (InterfaceC1671z) c1601j.f16588a.invoke(new W0.k(j), new W0.k(j8))) == null) ? AbstractC1644d.o(5, null) : interfaceC1671z;
            case 1:
                C1612k c1612k2 = (C1612k) this.f16613r;
                if (kotlin.jvm.internal.m.a(obj, c1612k2.f16617G.a())) {
                    j7 = W0.k.a(c1612k2.f16618H, androidx.compose.animation.a.f9229a) ? this.f16614s : c1612k2.f16618H;
                } else {
                    S0 s04 = (S0) c1612k2.f16617G.f16622d.g(obj);
                    j7 = s04 != null ? ((W0.k) s04.getValue()).f8021a : 0L;
                }
                return new W0.k(j7);
            default:
                InterfaceC1221d.g0((InterfaceC1221d) obj, this.f16614s, 0L, 0L, D5.a.p(((Number) ((S0) this.f16613r).getValue()).floatValue(), 0.0f, 1.0f), 118);
                return C1386y.f15098a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1611j(C1612k c1612k, long j, int i) {
        super(1);
        this.f16612q = i;
        this.f16613r = c1612k;
        this.f16614s = j;
    }
}
