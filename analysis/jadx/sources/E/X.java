package E;

import A.AbstractC0012i;
import A.C0022t;
import A.C0023u;
import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import P.C0345b;
import P.C0371o;
import P.InterfaceC0360i0;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.C0722j;
import c0.InterfaceC0725m;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1516q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X.e f1517r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(X.e eVar) {
        super(2);
        this.f1517r = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1516q) {
            case 0:
                ((Number) obj2).intValue();
                int iW = C0345b.w(7);
                C.c(this.f1517r, (C0371o) obj, iW);
                break;
            default:
                C0371o c0371o = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o.x()) {
                    c0371o.N();
                } else {
                    C0022t c0022tA = A.r.a(AbstractC0012i.f108c, C0714b.f10073B, c0371o, 0);
                    int i = c0371o.f5454P;
                    InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
                    InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, C0722j.f10095q);
                    InterfaceC0046k.f452a.getClass();
                    B0.D d5 = C0045j.f445b;
                    c0371o.W();
                    if (c0371o.f5453O) {
                        c0371o.l(d5);
                    } else {
                        c0371o.g0();
                    }
                    C0345b.u(C0045j.f448e, c0371o, c0022tA);
                    C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
                    C0044i c0044i = C0045j.f;
                    if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i))) {
                        k1.i.o(i, c0371o, i, c0044i);
                    }
                    C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
                    this.f1517r.invoke(C0023u.f149a, c0371o, 6);
                    c0371o.p(true);
                }
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(X.e eVar, int i) {
        super(2);
        this.f1517r = eVar;
    }
}
