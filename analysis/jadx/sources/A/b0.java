package A;

import P.C0363k;
import P.C0371o;
import c0.C0722j;
import c0.InterfaceC0725m;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1928E;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.n implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f85q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f86r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, Object obj) {
        super(3);
        this.f85q = i;
        this.f86r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y.i iVar;
        switch (this.f85q) {
            case 0:
                C0371o c0371o = (C0371o) obj2;
                ((Number) obj3).intValue();
                c0371o.S(-1608161351);
                B5.c cVar = (B5.c) this.f86r;
                boolean zG = c0371o.g(cVar);
                Object objH = c0371o.H();
                if (zG || objH == C0363k.f5418a) {
                    objH = new C0024v(cVar);
                    c0371o.d0(objH);
                }
                C0024v c0024v = (C0024v) objH;
                c0371o.p(false);
                return c0024v;
            case 1:
                C0371o c0371o2 = (C0371o) obj2;
                ((Number) obj3).intValue();
                c0371o2.S(-1415685722);
                W w3 = (W) this.f86r;
                boolean zG2 = c0371o2.g(w3);
                Object objH2 = c0371o2.H();
                if (zG2 || objH2 == C0363k.f5418a) {
                    objH2 = new F(w3);
                    c0371o2.d0(objH2);
                }
                F f = (F) objH2;
                c0371o2.p(false);
                return f;
            case 2:
                AbstractC1933J abstractC1933JA = ((InterfaceC1925B) obj2).a(((W0.a) obj3).f8007a);
                return ((InterfaceC1928E) obj).f(abstractC1933JA.f18664q, abstractC1933JA.f18665r, n5.t.f15300q, new Y(24, abstractC1933JA, (t.s) this.f86r));
            default:
                C0371o c0371o3 = (C0371o) obj2;
                ((Number) obj3).intValue();
                c0371o3.S(-756081143);
                v.P p7 = (v.P) c0371o3.k(androidx.compose.foundation.c.f9255a);
                if (p7 instanceof v.V) {
                    c0371o3.S(617653824);
                    c0371o3.p(false);
                    iVar = null;
                } else {
                    c0371o3.S(617786442);
                    Object objH3 = c0371o3.H();
                    if (objH3 == C0363k.f5418a) {
                        objH3 = new y.i();
                        c0371o3.d0(objH3);
                    }
                    iVar = (y.i) objH3;
                    c0371o3.p(false);
                }
                y.i iVar2 = iVar;
                InterfaceC0725m interfaceC0725mB = androidx.compose.foundation.a.b(C0722j.f10095q, iVar2, p7, true, null, (B5.a) this.f86r);
                c0371o3.p(false);
                return interfaceC0725mB;
        }
    }
}
