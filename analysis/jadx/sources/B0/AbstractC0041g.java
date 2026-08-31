package B0;

import P.AbstractC0366l0;
import P.C0345b;
import android.view.View;
import c0.AbstractC0724l;
import y0.AbstractC1904a;
import z0.C1952l;

/* JADX INFO: renamed from: B0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0041g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0037e f427a = new C0037e(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f428b = new r0(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(float f, boolean z5, boolean z6) {
        return (((z5 ? 1L : 0L) | (z6 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(R.e eVar, AbstractC0724l abstractC0724l) {
        R.e eVarW = u(abstractC0724l).w();
        int i = eVarW.f6678s - 1;
        Object[] objArr = eVarW.f6676q;
        if (i < objArr.length) {
            while (i >= 0) {
                eVar.c(((L) objArr[i]).f268U.f433e);
                i--;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int c(T t6, C1952l c1952l) {
        T tC0 = t6.c0();
        if (tC0 == null) {
            AbstractC1904a.b("Child of " + t6 + " cannot be null when calculating alignment line");
        }
        if (t6.j0().c().containsKey(c1952l)) {
            Integer num = (Integer) t6.j0().c().get(c1952l);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iB0 = tC0.b0(c1952l);
            if (iB0 != Integer.MIN_VALUE) {
                tC0.f321w = true;
                t6.f322x = true;
                t6.o0();
                tC0.f321w = false;
                t6.f322x = false;
                return iB0 + ((int) (c1952l instanceof C1952l ? tC0.m0() & 4294967295L : tC0.m0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean d(C0035d c0035d) {
        B0 b02 = u(c0035d).f268U.f432d;
        kotlin.jvm.internal.m.c(b02, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return b02.f216E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AbstractC0724l e(InterfaceC0048m interfaceC0048m, int i) {
        AbstractC0724l abstractC0724l = ((AbstractC0724l) interfaceC0048m).f10100q.f10105v;
        if (abstractC0724l == null || (abstractC0724l.f10103t & i) == 0) {
            return null;
        }
        while (abstractC0724l != null) {
            int i7 = abstractC0724l.f10102s;
            if ((i7 & 2) != 0) {
                return null;
            }
            if ((i7 & i) != 0) {
                return abstractC0724l;
            }
            abstractC0724l = abstractC0724l.f10105v;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AbstractC0724l f(R.e eVar) {
        int i;
        if (eVar == null || (i = eVar.f6678s) == 0) {
            return null;
        }
        return (AbstractC0724l) eVar.m(i - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0016 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0016 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: c0.l */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: c0.l */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: c0.l */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: c0.l */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: c0.l */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: c0.l */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0060z g(AbstractC0724l abstractC0724l) {
        if ((abstractC0724l.f10102s & 2) != 0) {
            if (abstractC0724l instanceof InterfaceC0060z) {
                return (InterfaceC0060z) abstractC0724l;
            }
            if (abstractC0724l instanceof AbstractC0049n) {
                AbstractC0724l abstractC0724l2 = ((AbstractC0049n) abstractC0724l).f473F;
                while (abstractC0724l2 != 0) {
                    if (abstractC0724l2 instanceof InterfaceC0060z) {
                        return (InterfaceC0060z) abstractC0724l2;
                    }
                    abstractC0724l2 = (!(abstractC0724l2 instanceof AbstractC0049n) || (abstractC0724l2.f10102s & 2) == 0) ? abstractC0724l2.f10105v : ((AbstractC0049n) abstractC0724l2).f473F;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int h(long j, long j7) {
        boolean zP = p(j);
        if (zP != p(j7)) {
            return zP ? -1 : 1;
        }
        return (Math.min(k(j), k(j7)) >= 0.0f && o(j) != o(j7)) ? o(j) ? -1 : 1 : (int) Math.signum(k(j) - k(j7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B0.l */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(InterfaceC0047l interfaceC0047l, AbstractC0366l0 abstractC0366l0) {
        if (!((AbstractC0724l) interfaceC0047l).f10100q.f10099D) {
            AbstractC1904a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        X.i iVar = (X.i) u(interfaceC0047l).f264Q;
        iVar.getClass();
        return C0345b.r(iVar, abstractC0366l0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0076 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x0085 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x002d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x002d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x007f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [B0.E0, B0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [c0.l] */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final E0 j(E0 e02) {
        C0042g0 c0042g0;
        AbstractC0724l abstractC0724l = (AbstractC0724l) e02;
        if (!abstractC0724l.f10100q.f10099D) {
            AbstractC1904a.b("visitAncestors called on an unattached node");
        }
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10100q.f10104u;
        L lU = u(e02);
        while (lU != null) {
            if ((lU.f268U.f433e.f10103t & 262144) != 0) {
                while (abstractC0724l2 != null) {
                    if ((abstractC0724l2.f10102s & 262144) != 0) {
                        ?? F6 = abstractC0724l2;
                        ?? eVar = 0;
                        while (F6 != 0) {
                            if (F6 instanceof E0) {
                                E0 e03 = (E0) F6;
                                if (kotlin.jvm.internal.m.a(e02.o(), e03.o()) && e02.getClass() == e03.getClass()) {
                                    return e03;
                                }
                            } else if ((F6.f10102s & 262144) != 0 && (F6 instanceof AbstractC0049n)) {
                                AbstractC0724l abstractC0724l3 = ((AbstractC0049n) F6).f473F;
                                int i = 0;
                                F6 = F6;
                                eVar = eVar;
                                while (abstractC0724l3 != null) {
                                    if ((abstractC0724l3.f10102s & 262144) != 0) {
                                        i++;
                                        eVar = eVar;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            F6 = f(eVar);
                        }
                    }
                    abstractC0724l2 = abstractC0724l2.f10104u;
                }
            }
            lU = lU.s();
            abstractC0724l2 = (lU == null || (c0042g0 = lU.f268U) == null) ? null : c0042g0.f432d;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float k(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B0.p */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(InterfaceC0051p interfaceC0051p) {
        if (((AbstractC0724l) interfaceC0051p).f10100q.f10099D) {
            s(interfaceC0051p, 1).I0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(InterfaceC0060z interfaceC0060z) {
        u(interfaceC0060z).C();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(A0 a02) {
        u(a02).D();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean o(long j) {
        return (j & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean p(long j) {
        return (j & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean q(L l7) {
        if (l7.f286x == null) {
            return false;
        }
        L lS = l7.s();
        return (lS != null ? lS.f286x : null) == null || l7.f269V.f300b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: c0.l */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(AbstractC0724l abstractC0724l, B5.a aVar) {
        q0 q0Var = abstractC0724l.f10106w;
        if (q0Var == null) {
            q0Var = new q0((p0) abstractC0724l);
            abstractC0724l.f10106w = q0Var;
        }
        ((C0.A) v(abstractC0724l)).getSnapshotObserver().a(q0Var, C0039f.f416v, aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final n0 s(InterfaceC0048m interfaceC0048m, int i) {
        n0 n0Var = ((AbstractC0724l) interfaceC0048m).f10100q.f10107x;
        kotlin.jvm.internal.m.b(n0Var);
        if (n0Var.B0() != interfaceC0048m || !o0.g(i)) {
            return n0Var;
        }
        n0 n0Var2 = n0Var.f479C;
        kotlin.jvm.internal.m.b(n0Var2);
        return n0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final n0 t(InterfaceC0048m interfaceC0048m) {
        if (!((AbstractC0724l) interfaceC0048m).f10100q.f10099D) {
            AbstractC1904a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        n0 n0VarS = s(interfaceC0048m, 2);
        if (!n0VarS.B0().f10099D) {
            AbstractC1904a.b("LayoutCoordinates is not attached.");
        }
        return n0VarS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final L u(InterfaceC0048m interfaceC0048m) {
        n0 n0Var = ((AbstractC0724l) interfaceC0048m).f10100q.f10107x;
        if (n0Var != null) {
            return n0Var.f478B;
        }
        throw C0.S.i("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final t0 v(InterfaceC0048m interfaceC0048m) {
        t0 t0Var = u(interfaceC0048m).f251D;
        if (t0Var != null) {
            return t0Var;
        }
        throw C0.S.i("This node does not have an owner.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final View w(InterfaceC0048m interfaceC0048m) {
        if (!((AbstractC0724l) interfaceC0048m).f10100q.f10099D) {
            AbstractC1904a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) O.a(u(interfaceC0048m));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x008e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x002d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x002d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x0097 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [B0.E0, B0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [B5.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [c0.l] */
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
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void x(E0 e02, B5.c cVar) {
        C0042g0 c0042g0;
        AbstractC0724l abstractC0724l = (AbstractC0724l) e02;
        if (!abstractC0724l.f10100q.f10099D) {
            AbstractC1904a.b("visitAncestors called on an unattached node");
        }
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10100q.f10104u;
        L lU = u(e02);
        while (lU != null) {
            if ((lU.f268U.f433e.f10103t & 262144) != 0) {
                while (abstractC0724l2 != null) {
                    if ((abstractC0724l2.f10102s & 262144) != 0) {
                        ?? F6 = abstractC0724l2;
                        ?? eVar = 0;
                        while (F6 != 0) {
                            boolean zBooleanValue = true;
                            if (F6 instanceof E0) {
                                E0 e03 = (E0) F6;
                                if (kotlin.jvm.internal.m.a(e02.o(), e03.o()) && e02.getClass() == e03.getClass()) {
                                    zBooleanValue = ((Boolean) cVar.invoke(e03)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((F6.f10102s & 262144) != 0) && (F6 instanceof AbstractC0049n)) {
                                    AbstractC0724l abstractC0724l3 = ((AbstractC0049n) F6).f473F;
                                    int i = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC0724l3 != null) {
                                        if ((abstractC0724l3.f10102s & 262144) != 0) {
                                            i++;
                                            eVar = eVar;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                            }
                            F6 = f(eVar);
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
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x009b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x00aa */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x0042 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x0042 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x00a4 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [B0.E0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [B5.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void y(E0 e02, B5.c cVar) {
        AbstractC0724l abstractC0724l = (AbstractC0724l) e02;
        if (!abstractC0724l.f10100q.f10099D) {
            AbstractC1904a.b("visitSubtreeIf called on an unattached node");
        }
        R.e eVar = new R.e(new AbstractC0724l[16]);
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10100q;
        AbstractC0724l abstractC0724l3 = abstractC0724l2.f10105v;
        if (abstractC0724l3 == null) {
            b(eVar, abstractC0724l2);
        } else {
            eVar.c(abstractC0724l3);
        }
        while (true) {
            int i = eVar.f6678s;
            if (i == 0) {
                return;
            }
            AbstractC0724l abstractC0724l4 = (AbstractC0724l) eVar.m(i - 1);
            if ((abstractC0724l4.f10103t & 262144) != 0) {
                for (AbstractC0724l abstractC0724l5 = abstractC0724l4; abstractC0724l5 != null; abstractC0724l5 = abstractC0724l5.f10105v) {
                    if ((abstractC0724l5.f10102s & 262144) != 0) {
                        ?? F6 = abstractC0724l5;
                        ?? eVar2 = 0;
                        while (F6 != 0) {
                            if (F6 instanceof E0) {
                                E0 e03 = (E0) F6;
                                D0 d02 = (kotlin.jvm.internal.m.a(e02.o(), e03.o()) && e02.getClass() == e03.getClass()) ? (D0) cVar.invoke(e03) : D0.f221q;
                                if (d02 == D0.f223s) {
                                    return;
                                }
                                if (d02 == D0.f222r) {
                                    break;
                                }
                            } else if ((F6.f10102s & 262144) != 0 && (F6 instanceof AbstractC0049n)) {
                                AbstractC0724l abstractC0724l6 = ((AbstractC0049n) F6).f473F;
                                int i7 = 0;
                                F6 = F6;
                                eVar2 = eVar2;
                                while (abstractC0724l6 != null) {
                                    if ((abstractC0724l6.f10102s & 262144) != 0) {
                                        i7++;
                                        eVar2 = eVar2;
                                        if (i7 == 1) {
                                            F6 = abstractC0724l6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar2.c(F6);
                                                F6 = 0;
                                            }
                                            eVar2.c(abstractC0724l6);
                                        }
                                    }
                                    abstractC0724l6 = abstractC0724l6.f10105v;
                                    F6 = F6;
                                    eVar2 = eVar2;
                                }
                                if (i7 == 1) {
                                }
                            }
                            F6 = f(eVar2);
                        }
                    }
                }
            }
            b(eVar, abstractC0724l4);
        }
    }
}
