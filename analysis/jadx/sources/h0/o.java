package h0;

import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.C0035d;
import B0.C0042g0;
import B0.InterfaceC0047l;
import B0.InterfaceC0048m;
import B0.K;
import B0.L;
import B0.p0;
import C0.A;
import C0.AbstractC0103t0;
import C0.C0097q;
import android.os.Trace;
import c0.AbstractC0724l;
import kotlin.jvm.internal.y;
import s0.C1587a;
import s0.C1589c;
import s0.InterfaceC1588b;
import y0.AbstractC1904a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0724l implements InterfaceC0047l, p0, A0.f, InterfaceC0048m {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final B5.e f13435E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f13436F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f13437G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f13438H;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(int i, B5.e eVar, int i7) {
        i = (i7 & 1) != 0 ? 1 : i;
        this.f13435E = (i7 & 2) != 0 ? null : eVar;
        this.f13438H = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A0() {
        int iOrdinal = z0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            y yVar = new y();
            AbstractC0041g.r(this, new K(yVar, this, 15));
            Object obj = yVar.f14268q;
            if (obj == null) {
                kotlin.jvm.internal.m.k("focusProperties");
                throw null;
            }
            if (((InterfaceC1116i) obj).a()) {
                return;
            }
            ((C1115h) ((A) AbstractC0041g.v(this)).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean B0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zW = false;
            if (!y0().f13418a) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = AbstractC1111d.v(this, i).ordinal();
            if (iOrdinal == 0) {
                zW = AbstractC1111d.w(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zW = true;
                } else if (iOrdinal != 3) {
                    throw new C2.e();
                }
            }
            return zW;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.p0
    public final void E() {
        A0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        int iOrdinal = z0().ordinal();
        if (iOrdinal == 0 || (iOrdinal != 1 && iOrdinal == 2)) {
            C1115h c1115h = (C1115h) ((A) AbstractC0041g.v(this)).getFocusOwner();
            c1115h.b(8, true, false);
            C1112e c1112e = c1115h.f13412e;
            if (c1112e.f) {
                return;
            }
            c1112e.f13402a.invoke(new C0097q(0, c1112e, C1112e.class, "invalidateNodes", "invalidateNodes()V", 0, 5));
            c1112e.f = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x0(n nVar, n nVar2) {
        C0042g0 c0042g0;
        B5.e eVar;
        C1115h c1115h = (C1115h) ((A) AbstractC0041g.v(this)).getFocusOwner();
        o oVar = c1115h.j;
        if (!nVar.equals(nVar2) && (eVar = this.f13435E) != null) {
            eVar.invoke(nVar, nVar2);
        }
        AbstractC0724l abstractC0724l = this.f10100q;
        if (!abstractC0724l.f10099D) {
            AbstractC1904a.b("visitAncestors called on an unattached node");
        }
        AbstractC0724l abstractC0724l2 = this.f10100q;
        L lU = AbstractC0041g.u(this);
        while (lU != null) {
            if ((lU.f268U.f433e.f10103t & 5120) != 0) {
                while (abstractC0724l2 != null) {
                    int i = abstractC0724l2.f10102s;
                    if ((i & 5120) != 0) {
                        if (abstractC0724l2 != abstractC0724l && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            AbstractC0724l abstractC0724lF = abstractC0724l2;
                            R.e eVar2 = null;
                            while (abstractC0724lF != null) {
                                if (abstractC0724lF instanceof C0035d) {
                                    C0035d c0035d = (C0035d) abstractC0724lF;
                                    if (oVar == c1115h.j) {
                                        c0035d.y0();
                                        throw null;
                                    }
                                } else if ((abstractC0724lF.f10102s & 4096) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                    int i7 = 0;
                                    for (AbstractC0724l abstractC0724l3 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l3 != null; abstractC0724l3 = abstractC0724l3.f10105v) {
                                        if ((abstractC0724l3.f10102s & 4096) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                abstractC0724lF = abstractC0724l3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new R.e(new AbstractC0724l[16]);
                                                }
                                                if (abstractC0724lF != null) {
                                                    eVar2.c(abstractC0724lF);
                                                    abstractC0724lF = null;
                                                }
                                                eVar2.c(abstractC0724l3);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC0724lF = AbstractC0041g.f(eVar2);
                            }
                        } else {
                            continue;
                        }
                    }
                    abstractC0724l2 = abstractC0724l2.f10104u;
                }
            }
            lU = lU.s();
            abstractC0724l2 = (lU == null || (c0042g0 = lU.f268U) == null) ? null : c0042g0.f432d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x00b5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x00c4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x0080 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x0080 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:0x00be */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [R.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final C1118k y0() {
        boolean z5;
        C0042g0 c0042g0;
        C1118k c1118k = new C1118k();
        c1118k.f13418a = true;
        m mVar = m.f13426b;
        c1118k.f13419b = mVar;
        c1118k.f13420c = mVar;
        c1118k.f13421d = mVar;
        c1118k.f13422e = mVar;
        c1118k.f = mVar;
        c1118k.f13423g = mVar;
        c1118k.f13424h = mVar;
        c1118k.i = mVar;
        c1118k.j = C1117j.f13415r;
        c1118k.f13425k = C1117j.f13416s;
        int i = this.f13438H;
        if (i == 1) {
            z5 = true;
        } else if (i == 0) {
            z5 = !(((C1587a) ((C1589c) ((InterfaceC1588b) AbstractC0041g.i(this, AbstractC0103t0.f1119m))).f16415a.getValue()).f16414a == 1);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z5 = false;
        }
        c1118k.f13418a = z5;
        AbstractC0724l abstractC0724l = this.f10100q;
        if (!abstractC0724l.f10099D) {
            AbstractC1904a.b("visitAncestors called on an unattached node");
        }
        AbstractC0724l abstractC0724l2 = this.f10100q;
        L lU = AbstractC0041g.u(this);
        loop0: while (lU != null) {
            if ((lU.f268U.f433e.f10103t & 3072) != 0) {
                while (abstractC0724l2 != null) {
                    int i7 = abstractC0724l2.f10102s;
                    if ((i7 & 3072) != 0) {
                        if (abstractC0724l2 != abstractC0724l && (i7 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i7 & 2048) != 0) {
                            ?? F6 = abstractC0724l2;
                            ?? eVar = 0;
                            while (F6 != 0) {
                                if (F6 instanceof InterfaceC1119l) {
                                    ((InterfaceC1119l) F6).C(c1118k);
                                } else if ((F6.f10102s & 2048) != 0 && (F6 instanceof AbstractC0049n)) {
                                    AbstractC0724l abstractC0724l3 = ((AbstractC0049n) F6).f473F;
                                    int i8 = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC0724l3 != null) {
                                        if ((abstractC0724l3.f10102s & 2048) != 0) {
                                            i8++;
                                            eVar = eVar;
                                            if (i8 == 1) {
                                                F6 = abstractC0724l3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new R.e(new AbstractC0724l[16]);
                                                }
                                                if (F6 != 0) {
                                                    eVar.c(F6);
                                                    F6 = 0;
                                                }
                                                eVar.c(abstractC0724l3);
                                            }
                                        }
                                        abstractC0724l3 = abstractC0724l3.f10105v;
                                        F6 = F6;
                                        eVar = eVar;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                F6 = AbstractC0041g.f(eVar);
                            }
                        }
                    }
                    abstractC0724l2 = abstractC0724l2.f10104u;
                }
            }
            lU = lU.s();
            abstractC0724l2 = (lU == null || (c0042g0 = lU.f268U) == null) ? null : c0042g0.f432d;
        }
        return c1118k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final n z0() {
        C1115h c1115h;
        o oVar;
        C0042g0 c0042g0;
        boolean z5 = this.f10099D;
        n nVar = n.f13433t;
        if (!z5 || (oVar = (c1115h = (C1115h) ((A) AbstractC0041g.v(this)).getFocusOwner()).j) == null) {
            return nVar;
        }
        if (this == oVar) {
            c1115h.getClass();
            return n.f13430q;
        }
        if (oVar.f10099D) {
            if (!oVar.f10100q.f10099D) {
                AbstractC1904a.b("visitAncestors called on an unattached node");
            }
            AbstractC0724l abstractC0724l = oVar.f10100q.f10104u;
            L lU = AbstractC0041g.u(oVar);
            while (lU != null) {
                if ((lU.f268U.f433e.f10103t & 1024) != 0) {
                    while (abstractC0724l != null) {
                        if ((abstractC0724l.f10102s & 1024) != 0) {
                            AbstractC0724l abstractC0724lF = abstractC0724l;
                            R.e eVar = null;
                            while (abstractC0724lF != null) {
                                if (abstractC0724lF instanceof o) {
                                    if (this == ((o) abstractC0724lF)) {
                                        return n.f13431r;
                                    }
                                } else if ((abstractC0724lF.f10102s & 1024) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                    int i = 0;
                                    for (AbstractC0724l abstractC0724l2 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10105v) {
                                        if ((abstractC0724l2.f10102s & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC0724lF = abstractC0724l2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new R.e(new AbstractC0724l[16]);
                                                }
                                                if (abstractC0724lF != null) {
                                                    eVar.c(abstractC0724lF);
                                                    abstractC0724lF = null;
                                                }
                                                eVar.c(abstractC0724l2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC0724lF = AbstractC0041g.f(eVar);
                            }
                        }
                        abstractC0724l = abstractC0724l.f10104u;
                    }
                }
                lU = lU.s();
                abstractC0724l = (lU == null || (c0042g0 = lU.f268U) == null) ? null : c0042g0.f432d;
            }
        }
        return nVar;
    }

    @Override // c0.AbstractC0724l
    public final void p0() {
    }
}
