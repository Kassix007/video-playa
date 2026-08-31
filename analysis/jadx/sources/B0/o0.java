package B0;

import C0.C0097q;
import E.C0122e;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import c0.AbstractC0724l;
import c0.InterfaceC0723k;
import h0.C1112e;
import h0.C1115h;
import h0.InterfaceC1119l;
import r.C1543B;
import t.C1609h;
import v0.C1749r;
import x0.C1882a;
import y0.AbstractC1904a;
import z0.InterfaceC1955o;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1543B f501a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1543B c1543b = r.L.f16158a;
        f501a = new C1543B();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(AbstractC0724l abstractC0724l, int i, int i7) {
        if (!(abstractC0724l instanceof AbstractC0049n)) {
            b(abstractC0724l, i & abstractC0724l.f10102s, i7);
            return;
        }
        AbstractC0049n abstractC0049n = (AbstractC0049n) abstractC0724l;
        b(abstractC0724l, abstractC0049n.f472E & i, i7);
        int i8 = (~abstractC0049n.f472E) & i;
        for (AbstractC0724l abstractC0724l2 = abstractC0049n.f473F; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10105v) {
            a(abstractC0724l2, i8, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: c0.l */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: h0.l */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(AbstractC0724l abstractC0724l, int i, int i7) {
        if (i7 != 0 || abstractC0724l.m0()) {
            if ((i & 2) != 0 && (abstractC0724l instanceof InterfaceC0060z)) {
                AbstractC0041g.m((InterfaceC0060z) abstractC0724l);
                if (i7 == 2) {
                    n0 n0VarS = AbstractC0041g.s(abstractC0724l, 2);
                    n0VarS.f481E = true;
                    n0VarS.f496T.invoke();
                    if (n0VarS.f498V != null) {
                        n0VarS.U0(null, false);
                        n0VarS.f478B.R(false);
                    }
                }
            }
            if ((i & 128) != 0 && (abstractC0724l instanceof InterfaceC0059y) && i7 != 2) {
                AbstractC0041g.u(abstractC0724l).C();
            }
            if ((i & 256) != 0 && (abstractC0724l instanceof InterfaceC0052q) && i7 != 2) {
                L lU = AbstractC0041g.u(abstractC0724l);
                if (!lU.p() && !lU.q() && !lU.f277d0) {
                    C0.A a7 = (C0.A) O.a(lU);
                    ((R.e) a7.f748f0.f367e.f499q).c(lU);
                    lU.f277d0 = true;
                    a7.L(null);
                }
            }
            if ((i & 4) != 0 && (abstractC0724l instanceof InterfaceC0051p)) {
                AbstractC0041g.l((InterfaceC0051p) abstractC0724l);
            }
            if ((i & 8) != 0 && (abstractC0724l instanceof A0)) {
                AbstractC0041g.u(abstractC0724l).f255H = true;
            }
            if ((i & 64) != 0 && (abstractC0724l instanceof w0)) {
                P p7 = AbstractC0041g.u((w0) abstractC0724l).f269V;
                p7.f311p.f379F = true;
                Y y6 = p7.f312q;
                if (y6 != null) {
                    y6.f350K = true;
                }
            }
            if ((i & 2048) != 0 && (abstractC0724l instanceof InterfaceC1119l)) {
                InterfaceC1119l interfaceC1119l = (InterfaceC1119l) abstractC0724l;
                C0043h.f437b = null;
                interfaceC1119l.C(C0043h.f436a);
                if (C0043h.f437b != null) {
                    AbstractC0724l abstractC0724l2 = (AbstractC0724l) interfaceC1119l;
                    if (!abstractC0724l2.f10100q.f10099D) {
                        AbstractC1904a.b("visitChildren called on an unattached node");
                    }
                    R.e eVar = new R.e(new AbstractC0724l[16]);
                    AbstractC0724l abstractC0724l3 = abstractC0724l2.f10100q;
                    AbstractC0724l abstractC0724l4 = abstractC0724l3.f10105v;
                    if (abstractC0724l4 == null) {
                        AbstractC0041g.b(eVar, abstractC0724l3);
                    } else {
                        eVar.c(abstractC0724l4);
                    }
                    while (true) {
                        int i8 = eVar.f6678s;
                        if (i8 == 0) {
                            break;
                        }
                        AbstractC0724l abstractC0724lF = (AbstractC0724l) eVar.m(i8 - 1);
                        if ((abstractC0724lF.f10103t & 1024) == 0) {
                            AbstractC0041g.b(eVar, abstractC0724lF);
                        } else {
                            while (true) {
                                if (abstractC0724lF == null) {
                                    break;
                                }
                                if ((abstractC0724lF.f10102s & 1024) != 0) {
                                    R.e eVar2 = null;
                                    while (abstractC0724lF != null) {
                                        if (abstractC0724lF instanceof h0.o) {
                                            h0.o oVar = (h0.o) abstractC0724lF;
                                            C1112e c1112e = ((C1115h) ((C0.A) AbstractC0041g.v(oVar)).getFocusOwner()).f13412e;
                                            if (c1112e.f13405d.a(oVar) && !c1112e.f) {
                                                c1112e.f13402a.invoke(new C0097q(0, c1112e, C1112e.class, "invalidateNodes", "invalidateNodes()V", 0, 5));
                                                c1112e.f = true;
                                            }
                                        } else if ((abstractC0724lF.f10102s & 1024) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                            int i9 = 0;
                                            for (AbstractC0724l abstractC0724l5 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l5 != null; abstractC0724l5 = abstractC0724l5.f10105v) {
                                                if ((abstractC0724l5.f10102s & 1024) != 0) {
                                                    i9++;
                                                    if (i9 == 1) {
                                                        abstractC0724lF = abstractC0724l5;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new R.e(new AbstractC0724l[16]);
                                                        }
                                                        if (abstractC0724lF != null) {
                                                            eVar2.c(abstractC0724lF);
                                                            abstractC0724lF = null;
                                                        }
                                                        eVar2.c(abstractC0724l5);
                                                    }
                                                }
                                            }
                                            if (i9 == 1) {
                                            }
                                        }
                                        abstractC0724lF = AbstractC0041g.f(eVar2);
                                    }
                                } else {
                                    abstractC0724lF = abstractC0724lF.f10105v;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(abstractC0724l instanceof C0035d)) {
                return;
            }
            C0035d c0035d = (C0035d) abstractC0724l;
            C1112e c1112e2 = ((C1115h) ((C0.A) AbstractC0041g.v(c0035d)).getFocusOwner()).f13412e;
            if (!c1112e2.f13406e.a(c0035d) || c1112e2.f) {
                return;
            }
            c1112e2.f13402a.invoke(new C0097q(0, c1112e2, C1112e.class, "invalidateNodes", "invalidateNodes()V", 0, 5));
            c1112e2.f = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(AbstractC0724l abstractC0724l) {
        if (!abstractC0724l.f10099D) {
            AbstractC1904a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(abstractC0724l, -1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int d(InterfaceC0723k interfaceC0723k) {
        int i = interfaceC0723k instanceof InterfaceC1955o ? 3 : 1;
        if (interfaceC0723k instanceof v.T) {
            i |= 4;
        }
        if (interfaceC0723k instanceof AppendedSemanticsElement) {
            i |= 8;
        }
        if (interfaceC0723k instanceof C1749r) {
            i |= 16;
        }
        if ((interfaceC0723k instanceof A0.c) || (interfaceC0723k instanceof A.F)) {
            i |= 32;
        }
        if (interfaceC0723k instanceof C0122e) {
            i |= 256;
        }
        if (interfaceC0723k instanceof C1609h) {
            i |= 64;
        }
        return interfaceC0723k instanceof F0.a ? 524288 | i : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(AbstractC0724l abstractC0724l) {
        int i = abstractC0724l.f10102s;
        if (i != 0) {
            return i;
        }
        Class<?> cls = abstractC0724l.getClass();
        C1543B c1543b = f501a;
        int iD = c1543b.d(cls);
        if (iD >= 0) {
            return c1543b.f16111c[iD];
        }
        int i7 = abstractC0724l instanceof InterfaceC0060z ? 3 : 1;
        if (abstractC0724l instanceof InterfaceC0051p) {
            i7 |= 4;
        }
        if (abstractC0724l instanceof A0) {
            i7 |= 8;
        }
        if (abstractC0724l instanceof y0) {
            i7 |= 16;
        }
        if (abstractC0724l instanceof A0.f) {
            i7 |= 32;
        }
        if (abstractC0724l instanceof w0) {
            i7 |= 64;
        }
        if (abstractC0724l instanceof InterfaceC0059y) {
            i7 |= 128;
        }
        if (abstractC0724l instanceof InterfaceC0052q) {
            i7 |= 256;
        }
        if (abstractC0724l instanceof h0.o) {
            i7 |= 1024;
        }
        if (abstractC0724l instanceof InterfaceC1119l) {
            i7 |= 2048;
        }
        if (abstractC0724l instanceof C0035d) {
            i7 |= 4096;
        }
        if (abstractC0724l instanceof t0.c) {
            i7 |= 8192;
        }
        if (abstractC0724l instanceof C1882a) {
            i7 |= 16384;
        }
        if (abstractC0724l instanceof InterfaceC0047l) {
            i7 |= 32768;
        }
        if (abstractC0724l instanceof E0) {
            i7 |= 262144;
        }
        if (abstractC0724l instanceof F0.a) {
            i7 |= 524288;
        }
        c1543b.g(i7, cls);
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int f(AbstractC0724l abstractC0724l) {
        if (!(abstractC0724l instanceof AbstractC0049n)) {
            return e(abstractC0724l);
        }
        AbstractC0049n abstractC0049n = (AbstractC0049n) abstractC0724l;
        int iF = abstractC0049n.f472E;
        for (AbstractC0724l abstractC0724l2 = abstractC0049n.f473F; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10105v) {
            iF |= f(abstractC0724l2);
        }
        return iF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean g(int i) {
        return (i & 128) != 0;
    }
}
