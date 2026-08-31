package M;

import A.AbstractC0017n;
import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import P.C0345b;
import P.C0371o;
import P.InterfaceC0360i0;
import a1.C0609b;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.C0722j;
import c0.InterfaceC0725m;
import m5.C1386y;
import n5.AbstractC1397A;
import z0.InterfaceC1926C;

/* JADX INFO: renamed from: M.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0214i0 extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P.W f3536r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0214i0(P.W w3, int i) {
        super(2);
        this.f3535q = i;
        this.f3536r = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3535q) {
            case 0:
                C0371o c0371o = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o.x()) {
                    c0371o.N();
                } else {
                    InterfaceC0725m interfaceC0725mA = I0.j.a(C0722j.f10095q, false, C0203d.f3446t);
                    InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10076q, false);
                    int i = c0371o.f5454P;
                    InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
                    InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mA);
                    InterfaceC0046k.f452a.getClass();
                    B0.D d5 = C0045j.f445b;
                    c0371o.W();
                    if (c0371o.f5453O) {
                        c0371o.l(d5);
                    } else {
                        c0371o.g0();
                    }
                    C0345b.u(C0045j.f448e, c0371o, interfaceC1926CD);
                    C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
                    C0044i c0044i = C0045j.f;
                    if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i))) {
                        k1.i.o(i, c0371o, i, c0044i);
                    }
                    C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
                    ((B5.e) this.f3536r.getValue()).invoke(c0371o, 0);
                    c0371o.p(true);
                }
                break;
            default:
                C0371o c0371o2 = (C0371o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0371o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1397A.h(I0.j.a(C0722j.f10095q, false, C0609b.f8725q), (B5.e) this.f3536r.getValue(), c0371o2, 0);
                } else {
                    c0371o2.N();
                }
                break;
        }
        return C1386y.f15098a;
    }
}
