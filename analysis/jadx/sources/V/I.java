package v;

import B0.A0;
import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.C0042g0;
import B0.E0;
import B0.InterfaceC0047l;
import B0.InterfaceC0052q;
import B0.n0;
import B0.p0;
import C0.C0100s;
import C0.C0102t;
import M5.AbstractC0263y;
import M5.C0258t;
import M5.InterfaceC0241b0;
import c0.AbstractC0724l;
import y0.AbstractC1904a;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0049n implements A0, InterfaceC0052q, InterfaceC0047l, p0, E0 {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final M f17243N = new M(4);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public y.i f17244G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0100s f17245H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public y.d f17246I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public E.G f17247J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public n0 f17248K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final h0.o f17249L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public F f17250M;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I(y.i iVar, C0100s c0100s) {
        this.f17244G = iVar;
        this.f17245H = c0100s;
        h0.o oVar = new h0.o(0, new C0102t(2, this, I.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 2), 4);
        x0(oVar);
        this.f17249L = oVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.A0
    public final void A(I0.i iVar) {
        boolean zA = this.f17249L.z0().a();
        H5.k[] kVarArr = I0.r.f2326a;
        I0.s sVar = I0.p.f2309k;
        H5.k kVar = I0.r.f2326a[4];
        sVar.a(iVar, Boolean.valueOf(zA));
        if (this.f17250M == null) {
            this.f17250M = new F(0, this);
        }
        iVar.j(I0.h.f2251u, new I0.a(null, this.f17250M));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A0(y.i iVar, y.h hVar) {
        if (!this.f10099D) {
            iVar.b(hVar);
        } else {
            InterfaceC0241b0 interfaceC0241b0 = (InterfaceC0241b0) ((R5.d) l0()).f7234q.get(C0258t.f3885r);
            AbstractC0263y.t(l0(), null, null, new G(iVar, hVar, interfaceC0241b0 != null ? interfaceC0241b0.G(new C1725u(1, iVar, hVar)) : null, null), 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x006b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x007a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x002e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x002e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x0074 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final J B0() {
        E0 e02;
        C0042g0 c0042g0;
        if (this.f10099D) {
            if (!this.f10100q.f10099D) {
                AbstractC1904a.b("visitAncestors called on an unattached node");
            }
            AbstractC0724l abstractC0724l = this.f10100q.f10104u;
            B0.L lU = AbstractC0041g.u(this);
            loop0: while (true) {
                if (lU == null) {
                    e02 = null;
                    break;
                }
                if ((lU.f268U.f433e.f10103t & 262144) != 0) {
                    while (abstractC0724l != null) {
                        if ((abstractC0724l.f10102s & 262144) != 0) {
                            ?? F6 = abstractC0724l;
                            ?? eVar = 0;
                            while (F6 != 0) {
                                if (F6 instanceof E0) {
                                    e02 = (E0) F6;
                                    if (J.f17251F.equals(e02.o())) {
                                        break loop0;
                                    }
                                } else if ((F6.f10102s & 262144) != 0 && (F6 instanceof AbstractC0049n)) {
                                    AbstractC0724l abstractC0724l2 = ((AbstractC0049n) F6).f473F;
                                    int i = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC0724l2 != null) {
                                        if ((abstractC0724l2.f10102s & 262144) != 0) {
                                            i++;
                                            eVar = eVar;
                                            if (i == 1) {
                                                F6 = abstractC0724l2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new R.e(new AbstractC0724l[16]);
                                                }
                                                if (F6 != 0) {
                                                    eVar.c(F6);
                                                    F6 = 0;
                                                }
                                                eVar.c(abstractC0724l2);
                                            }
                                        }
                                        abstractC0724l2 = abstractC0724l2.f10105v;
                                        F6 = F6;
                                        eVar = eVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                F6 = AbstractC0041g.f(eVar);
                            }
                        }
                        abstractC0724l = abstractC0724l.f10104u;
                    }
                }
                lU = lU.s();
                abstractC0724l = (lU == null || (c0042g0 = lU.f268U) == null) ? null : c0042g0.f432d;
            }
            if (e02 instanceof J) {
                return (J) e02;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C0(y.i iVar) {
        y.d dVar;
        if (kotlin.jvm.internal.m.a(this.f17244G, iVar)) {
            return;
        }
        y.i iVar2 = this.f17244G;
        if (iVar2 != null && (dVar = this.f17246I) != null) {
            iVar2.b(new y.e(dVar));
        }
        this.f17246I = null;
        this.f17244G = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.p0
    public final void E() {
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        AbstractC0041g.r(this, new B0.K(yVar, this, 18));
        E.G g7 = (E.G) yVar.f14268q;
        if (this.f17249L.z0().a()) {
            E.G g8 = this.f17247J;
            if (g8 != null) {
                g8.b();
            }
            if (g7 != null) {
                g7.a();
            } else {
                g7 = null;
            }
            this.f17247J = g7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0052q
    public final void g(n0 n0Var) {
        J jB0;
        this.f17248K = n0Var;
        if (this.f17249L.z0().a()) {
            if (!n0Var.B0().f10099D) {
                J jB02 = B0();
                if (jB02 != null) {
                    jB02.x0(null);
                    return;
                }
                return;
            }
            n0 n0Var2 = this.f17248K;
            if (n0Var2 == null || !n0Var2.B0().f10099D || (jB0 = B0()) == null) {
                return;
            }
            jB0.x0(this.f17248K);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.E0
    public final Object o() {
        return f17243N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void r0() {
        E.G g7 = this.f17247J;
        if (g7 != null) {
            g7.b();
        }
        this.f17247J = null;
    }
}
