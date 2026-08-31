package u;

import m5.C1386y;
import r.C1544C;

/* JADX INFO: loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16828q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f16829r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(C1645d0 c1645d0, int i) {
        super(1);
        this.f16828q = i;
        this.f16829r = c1645d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f16828q) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                C1645d0 c1645d0 = this.f16829r;
                long j = jLongValue - c1645d0.f16901C;
                c1645d0.f16901C = jLongValue;
                long jH = D5.a.H(j / ((double) c1645d0.f16905G));
                C1544C c1544c = c1645d0.f16902D;
                if (c1544c.h()) {
                    Object[] objArr = c1544c.f16114a;
                    int i = c1544c.f16115b;
                    int i7 = 0;
                    for (int i8 = 0; i8 < i; i8++) {
                        S s6 = (S) objArr[i8];
                        C1645d0.q(c1645d0, s6, jH);
                        s6.f16823c = true;
                    }
                    v0 v0Var = c1645d0.f16910v;
                    if (v0Var != null) {
                        v0Var.o();
                    }
                    int i9 = c1544c.f16115b;
                    Object[] objArr2 = c1544c.f16114a;
                    G5.d dVarO = D5.a.O(0, i9);
                    int i10 = dVarO.f2017q;
                    int i11 = dVarO.f2018r;
                    if (i10 <= i11) {
                        while (true) {
                            objArr2[i10 - i7] = objArr2[i10];
                            if (((S) objArr2[i10]).f16823c) {
                                i7++;
                            }
                            if (i10 != i11) {
                                i10++;
                            }
                        }
                    }
                    n5.k.J0(i9 - i7, i9, null, objArr2);
                    c1544c.f16115b -= i7;
                }
                S s7 = c1645d0.f16903E;
                if (s7 != null) {
                    s7.f16826g = c1645d0.f16911w;
                    C1645d0.q(c1645d0, s7, jH);
                    c1645d0.y(s7.f16824d);
                    if (s7.f16824d == 1.0f) {
                        c1645d0.f16903E = null;
                    }
                    c1645d0.x();
                }
                break;
            default:
                this.f16829r.f16901C = ((Number) obj).longValue();
                break;
        }
        return C1386y.f15098a;
    }
}
