package Q;

import P.AbstractC0373p;
import P.C0343a;
import P.C0372o0;
import P.D0;
import P.InterfaceC0347c;
import P.x0;

/* JADX INFO: loaded from: classes.dex */
public final class D extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f6469c = new D(1, 0, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q.I
    public final void a(J j, InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar) {
        int iC;
        int iO;
        int iC2 = j.c(0);
        int iO2 = d02.o();
        int i = d02.f5306v;
        int iK = d02.K(d02.f5289b, d02.q(i));
        int iF = d02.f(d02.f5289b, d02.q(i + 1));
        for (int iMax = Math.max(iK, iF - iC2); iMax < iF; iMax++) {
            Object obj = d02.f5290c[d02.g(iMax)];
            if (obj instanceof x0) {
                int i7 = iO2 - iMax;
                x0 x0Var = (x0) obj;
                C0343a c0343a = x0Var.f5577b;
                if (c0343a == null || !c0343a.a()) {
                    iC = -1;
                    iO = -1;
                } else {
                    iC = d02.c(c0343a);
                    iO = d02.o() - d02.M(iC);
                }
                jVar.d(x0Var, i7, iC, iO);
            } else if (obj instanceof C0372o0) {
                ((C0372o0) obj).d();
            }
        }
        if (iC2 <= 0) {
            AbstractC0373p.c("Check failed");
        }
        int i8 = d02.f5306v;
        int iK2 = d02.K(d02.f5289b, d02.q(i8));
        int iF2 = d02.f(d02.f5289b, d02.q(i8 + 1)) - iC2;
        if (iF2 < iK2) {
            AbstractC0373p.c("Check failed");
        }
        d02.H(iF2, iC2, i8);
        int i9 = d02.i;
        if (i9 >= iK2) {
            d02.i = i9 - iC2;
        }
    }
}
