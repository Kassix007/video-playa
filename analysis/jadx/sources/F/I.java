package F;

import P.C0346b0;
import a0.AbstractC0606h;
import com.google.android.gms.internal.measurement.I1;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class I extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f1797r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(N n7, int i) {
        super(1);
        this.f1796q = i;
        this.f1797r = n7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        B b7;
        switch (this.f1796q) {
            case 0:
                E.I i = (E.I) obj;
                N n7 = this.f1797r;
                AbstractC0606h abstractC0606hC = a0.r.c();
                B5.c cVarE = abstractC0606hC != null ? abstractC0606hC.e() : null;
                AbstractC0606h abstractC0606hD = a0.r.d(abstractC0606hC);
                try {
                    i.a(n7.f1822e);
                    a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                    return C1386y.f15098a;
                } catch (Throwable th) {
                    a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                    throw th;
                }
            default:
                float fFloatValue = ((Number) obj).floatValue();
                N n8 = this.f1797r;
                long jR = I1.R(n8);
                float f = n8.i + fFloatValue;
                long jH = D5.a.H(f);
                n8.i = f - jH;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j = jR + jH;
                    long jR2 = D5.a.r(j, n8.f1824h, n8.f1823g);
                    boolean z5 = j != jR2;
                    long j7 = jR2 - jR;
                    float f7 = j7;
                    n8.j = f7;
                    if (Math.abs(j7) != 0) {
                        n8.f1816F.setValue(Boolean.valueOf(f7 > 0.0f));
                        n8.f1817G.setValue(Boolean.valueOf(f7 < 0.0f));
                    }
                    int i7 = (int) j7;
                    int i8 = -i7;
                    B bF = ((B) n8.f1830p.getValue()).f(i8);
                    if (bF != null && (b7 = n8.f1819b) != null) {
                        B bF2 = b7.f(i8);
                        if (bF2 != null) {
                            n8.f1819b = bF2;
                        } else {
                            bF = null;
                        }
                    }
                    if (bF != null) {
                        n8.h(bF, n8.f1818a, true);
                        n8.f1812B.setValue(C1386y.f15098a);
                    } else {
                        D d5 = n8.f1821d;
                        N n9 = (N) d5.f1777r;
                        C0346b0 c0346b0 = (C0346b0) d5.f1779t;
                        c0346b0.f(c0346b0.e() + (n9.n() != 0 ? i7 / n9.n() : 0.0f));
                        B0.L l7 = (B0.L) n8.f1838x.getValue();
                        if (l7 != null) {
                            l7.l();
                        }
                    }
                    fFloatValue = (z5 ? Long.valueOf(j7) : Float.valueOf(fFloatValue)).floatValue();
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
