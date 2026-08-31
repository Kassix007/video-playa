package B0;

import C0.C0112y;
import c0.AbstractC0724l;
import y0.AbstractC1904a;
import z0.AbstractC1932I;

/* JADX INFO: renamed from: B0.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0030a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f363a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f366d;
    public W0.a i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0050o f364b = new C0050o(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0050o f367e = new C0050o(2);
    public final R.e f = new R.e(new L[16]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f368g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R.e f369h = new R.e(new Z[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0030a0(L l7) {
        this.f363a = l7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(B0.L r5, W0.a r6) {
        /*
            B0.L r0 = r5.f286x
            B0.P r1 = r5.f269V
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            B0.Y r0 = r1.f312q
            kotlin.jvm.internal.m.b(r0)
            long r3 = r6.f8007a
            boolean r6 = r0.e0(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            B0.Y r6 = r1.f312q
            if (r6 == 0) goto L21
            W0.a r1 = r6.f342C
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            kotlin.jvm.internal.m.b(r6)
            long r0 = r1.f8007a
            boolean r6 = r6.e0(r0)
        L2f:
            B0.L r0 = r5.s()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            B0.L r1 = r0.f286x
            r3 = 3
            if (r1 != 0) goto L40
            B0.L.S(r0, r2, r3)
            return r6
        L40:
            B0.I r1 = r5.r()
            B0.I r4 = B0.I.f237q
            if (r1 != r4) goto L4c
            B0.L.Q(r0, r2, r3)
            return r6
        L4c:
            B0.I r5 = r5.r()
            B0.I r1 = B0.I.f238r
            if (r5 != r1) goto L57
            r0.P(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0030a0.b(B0.L, W0.a):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean c(L l7, W0.a aVar) {
        boolean zH0;
        if (aVar != null) {
            if (l7.f265R == I.f239s) {
                l7.c();
            }
            zH0 = l7.f269V.f311p.h0(aVar.f8007a);
        } else {
            C0034c0 c0034c0 = l7.f269V.f311p;
            W0.a aVar2 = c0034c0.f404z ? new W0.a(c0034c0.f18667t) : null;
            if (aVar2 != null) {
                if (l7.f265R == I.f239s) {
                    l7.c();
                }
                zH0 = l7.f269V.f311p.h0(aVar2.f8007a);
            } else {
                l7.getClass();
                zH0 = false;
            }
        }
        L lS = l7.s();
        if (zH0 && lS != null) {
            I i = l7.f269V.f311p.f375B;
            if (i == I.f237q) {
                L.S(lS, false, 3);
                return zH0;
            }
            if (i == I.f238r) {
                lS.R(false);
            }
        }
        return zH0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean h(L l7) {
        if (!l7.q()) {
            return false;
        }
        do {
            if (!i(l7)) {
                L lS = l7.s();
                if ((lS != null ? lS.f269V.f302d : null) != G.f225q) {
                    return false;
                }
            }
            l7 = l7.s();
            if (l7 == null) {
                return false;
            }
        } while (!l7.G());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean i(L l7) {
        C0034c0 c0034c0 = l7.f269V.f311p;
        return c0034c0.f375B == I.f237q || c0034c0.f386M.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: B0.L */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            r0 = 1
            B0.o r1 = r6.f367e
            if (r7 == 0) goto L13
            java.lang.Object r7 = r1.f499q
            R.e r7 = (R.e) r7
            r7.i()
            B0.L r2 = r6.f363a
            r7.c(r2)
            r2.f277d0 = r0
        L13:
            java.lang.Object r7 = r1.f499q
            R.e r7 = (R.e) r7
            B0.r0 r2 = B0.r0.f508b
            r7.q(r2)
            int r2 = r7.f6678s
            java.lang.Object r3 = r1.f500r
            B0.L[] r3 = (B0.L[]) r3
            if (r3 == 0) goto L27
            int r4 = r3.length
            if (r4 >= r2) goto L2f
        L27:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            B0.L[] r3 = new B0.L[r3]
        L2f:
            r4 = 0
            r1.f500r = r4
            r4 = 0
        L33:
            if (r4 >= r2) goto L3e
            java.lang.Object[] r5 = r7.f6676q
            r5 = r5[r4]
            r3[r4] = r5
            int r4 = r4 + 1
            goto L33
        L3e:
            r7.i()
            int r2 = r2 - r0
        L42:
            r7 = -1
            if (r7 >= r2) goto L54
            r7 = r3[r2]
            kotlin.jvm.internal.m.b(r7)
            boolean r0 = r7.f277d0
            if (r0 == 0) goto L51
            B0.C0050o.n(r7)
        L51:
            int r2 = r2 + (-1)
            goto L42
        L54:
            r1.f500r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0030a0.a(boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        R.e eVar = this.f369h;
        int i = eVar.f6678s;
        if (i != 0) {
            Object[] objArr = eVar.f6676q;
            for (int i7 = 0; i7 < i; i7++) {
                Z z5 = (Z) objArr[i7];
                L l7 = z5.f358a;
                boolean z6 = z5.f360c;
                L l8 = z5.f358a;
                if (l7.F()) {
                    if (z5.f359b) {
                        L.Q(l8, z6, 2);
                    } else {
                        L.S(l8, z6, 2);
                    }
                }
            }
            eVar.i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(L l7) {
        R.e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l8 = (L) objArr[i7];
            if (kotlin.jvm.internal.m.a(l8.H(), Boolean.TRUE) && !l8.f278e0) {
                if (((F0) ((k3.d) this.f364b.f499q).f14122r).contains(l8)) {
                    l8.I();
                }
                e(l8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(L l7, boolean z5) {
        if (!this.f365c) {
            AbstractC1904a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z5 ? l7.f269V.f303e : l7.q()) {
            AbstractC1904a.a("node not yet measured");
        }
        g(l7, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(L l7, boolean z5) {
        Y y6;
        M m4;
        R.e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l8 = (L) objArr[i7];
            if ((!z5 && i(l8)) || (z5 && (l8.r() == I.f237q || ((y6 = l8.f269V.f312q) != null && (m4 = y6.f346G) != null && m4.e())))) {
                boolean zQ = AbstractC0041g.q(l8);
                P p7 = l8.f269V;
                if (zQ && !z5) {
                    if (p7.f303e && ((F0) ((k3.d) this.f364b.f499q).f14122r).contains(l8)) {
                        m(l8, true, false);
                    } else {
                        f(l8, true);
                    }
                }
                if (z5 ? p7.f303e : l8.q()) {
                    m(l8, z5, false);
                }
                if (!(z5 ? p7.f303e : l8.q())) {
                    g(l8, z5);
                }
            }
        }
        if (z5 ? l7.f269V.f303e : l7.q()) {
            m(l7, z5, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x00ff */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x00f6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0102 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:97:0x0104 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [R.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [R.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(C0112y c0112y) {
        boolean z5;
        AbstractC0724l abstractC0724l;
        ?? F6;
        L l7;
        C0050o c0050o = this.f364b;
        L l8 = this.f363a;
        if (!l8.F()) {
            AbstractC1904a.a("performMeasureAndLayout called with unattached root");
        }
        if (!l8.G()) {
            AbstractC1904a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f365c) {
            AbstractC1904a.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (this.i != null) {
            this.f365c = true;
            this.f366d = true;
            try {
                if (c0050o.E()) {
                    z5 = false;
                    while (true) {
                        boolean zE = c0050o.E();
                        k3.d dVar = (k3.d) c0050o.f499q;
                        if (!zE) {
                            break;
                        }
                        boolean zIsEmpty = ((F0) dVar.f14122r).isEmpty();
                        boolean z6 = !zIsEmpty;
                        if (zIsEmpty) {
                            k3.d dVar2 = (k3.d) c0050o.f500r;
                            L l9 = (L) ((F0) dVar2.f14122r).first();
                            dVar2.z(l9);
                            l7 = l9;
                        } else {
                            l7 = (L) ((F0) dVar.f14122r).first();
                            dVar.z(l7);
                        }
                        boolean zM = m(l7, z6, true);
                        if (l7 == l8 && zM) {
                            z5 = true;
                        }
                    }
                    if (c0112y != null) {
                        c0112y.invoke();
                    }
                } else {
                    z5 = false;
                }
                this.f365c = false;
                this.f366d = false;
            } catch (Throwable th) {
                this.f365c = false;
                this.f366d = false;
                throw th;
            }
        } else {
            z5 = false;
        }
        R.e eVar = this.f;
        Object[] objArr = eVar.f6676q;
        int i7 = eVar.f6678s;
        int i8 = 0;
        while (i8 < i7) {
            C0042g0 c0042g0 = ((L) objArr[i8]).f268U;
            C0056v c0056v = c0042g0.f430b;
            boolean zG = o0.g(128);
            if (zG) {
                abstractC0724l = c0056v.f517a0;
            } else {
                abstractC0724l = c0056v.f517a0.f10104u;
                if (abstractC0724l == null) {
                }
                i8++;
                i = 0;
            }
            j0.C c7 = n0.f474W;
            AbstractC0724l abstractC0724lD0 = c0056v.D0(zG);
            while (abstractC0724lD0 != null && (abstractC0724lD0.f10103t & 128) != 0) {
                if ((abstractC0724lD0.f10102s & 128) != 0) {
                    ?? r13 = abstractC0724lD0;
                    ?? eVar2 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof InterfaceC0059y) {
                            ((InterfaceC0059y) r13).j0(c0042g0.f430b);
                        } else {
                            if ((r13.f10102s & 128) != 0 && (r13 instanceof AbstractC0049n)) {
                                AbstractC0724l abstractC0724l2 = ((AbstractC0049n) r13).f473F;
                                F6 = r13;
                                eVar2 = eVar2;
                                while (abstractC0724l2 != null) {
                                    if ((abstractC0724l2.f10102s & 128) != 0) {
                                        i++;
                                        eVar2 = eVar2;
                                        if (i == 1) {
                                            F6 = abstractC0724l2;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar2.c(F6);
                                                F6 = 0;
                                            }
                                            eVar2.c(abstractC0724l2);
                                        }
                                    }
                                    abstractC0724l2 = abstractC0724l2.f10105v;
                                    F6 = F6;
                                    eVar2 = eVar2;
                                }
                                if (i == 1) {
                                }
                            }
                            i = 0;
                            r13 = F6;
                            eVar2 = eVar2;
                        }
                        F6 = AbstractC0041g.f(eVar2);
                        i = 0;
                        r13 = F6;
                        eVar2 = eVar2;
                    }
                }
                if (abstractC0724lD0 != abstractC0724l) {
                    abstractC0724lD0 = abstractC0724lD0.f10105v;
                    i = 0;
                }
            }
            i8++;
            i = 0;
        }
        eVar.i();
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x0146 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:107:0x0140 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x0137 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x0144 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [R.e] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [R.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [B0.L, java.lang.Object] */
    public final void k(L l7, long j) {
        AbstractC0724l abstractC0724l;
        ?? F6;
        boolean z5 = l7.f278e0;
        P p7 = l7.f269V;
        if (z5) {
            return;
        }
        L l8 = this.f363a;
        if (l7.equals(l8)) {
            AbstractC1904a.a("measureAndLayout called on root");
        }
        if (!l8.F()) {
            AbstractC1904a.a("performMeasureAndLayout called with unattached root");
        }
        if (!l8.G()) {
            AbstractC1904a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f365c) {
            AbstractC1904a.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (this.i != null) {
            this.f365c = true;
            this.f366d = false;
            try {
                C0050o c0050o = this.f364b;
                ((k3.d) c0050o.f499q).z(l7);
                ((k3.d) c0050o.f500r).z(l7);
                if (b(l7, new W0.a(j)) || p7.f) {
                    if (kotlin.jvm.internal.m.a(l7.H(), Boolean.TRUE)) {
                        l7.I();
                    }
                }
                e(l7);
                if (l7.f265R == I.f239s) {
                    l7.c();
                }
                boolean zH0 = p7.f311p.h0(j);
                L lS = l7.s();
                if (zH0 && lS != null) {
                    I i7 = p7.f311p.f375B;
                    if (i7 == I.f237q) {
                        L.S(lS, false, 3);
                    } else if (i7 == I.f238r) {
                        lS.R(false);
                    }
                }
                if (l7.p() && l7.G()) {
                    l7.O();
                    ((R.e) this.f367e.f499q).c(l7);
                    l7.f277d0 = true;
                }
                d();
                this.f365c = false;
                this.f366d = false;
            } catch (Throwable th) {
                this.f365c = false;
                this.f366d = false;
                throw th;
            }
        }
        R.e eVar = this.f;
        Object[] objArr = eVar.f6676q;
        int i8 = eVar.f6678s;
        int i9 = 0;
        while (i9 < i8) {
            C0042g0 c0042g0 = ((L) objArr[i9]).f268U;
            C0056v c0056v = c0042g0.f430b;
            boolean zG = o0.g(128);
            if (zG) {
                abstractC0724l = c0056v.f517a0;
            } else {
                abstractC0724l = c0056v.f517a0.f10104u;
                if (abstractC0724l == null) {
                }
                i9++;
                i = 0;
            }
            j0.C c7 = n0.f474W;
            AbstractC0724l abstractC0724lD0 = c0056v.D0(zG);
            while (abstractC0724lD0 != null && (abstractC0724lD0.f10103t & 128) != 0) {
                if ((abstractC0724lD0.f10102s & 128) != 0) {
                    ?? r12 = abstractC0724lD0;
                    ?? eVar2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof InterfaceC0059y) {
                            ((InterfaceC0059y) r12).j0(c0042g0.f430b);
                        } else {
                            if ((r12.f10102s & 128) != 0 && (r12 instanceof AbstractC0049n)) {
                                AbstractC0724l abstractC0724l2 = ((AbstractC0049n) r12).f473F;
                                int i10 = i;
                                F6 = r12;
                                eVar2 = eVar2;
                                while (abstractC0724l2 != null) {
                                    if ((abstractC0724l2.f10102s & 128) != 0) {
                                        i10++;
                                        eVar2 = eVar2;
                                        if (i10 == 1) {
                                            F6 = abstractC0724l2;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar2.c(F6);
                                                F6 = 0;
                                            }
                                            eVar2.c(abstractC0724l2);
                                        }
                                    }
                                    abstractC0724l2 = abstractC0724l2.f10105v;
                                    F6 = F6;
                                    eVar2 = eVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            i = 0;
                            r12 = F6;
                            eVar2 = eVar2;
                        }
                        F6 = AbstractC0041g.f(eVar2);
                        i = 0;
                        r12 = F6;
                        eVar2 = eVar2;
                    }
                }
                if (abstractC0724lD0 != abstractC0724l) {
                    abstractC0724lD0 = abstractC0724lD0.f10105v;
                    i = 0;
                }
            }
            i9++;
            i = 0;
        }
        eVar.i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        C0050o c0050o = this.f364b;
        if (c0050o.E()) {
            L l7 = this.f363a;
            if (!l7.F()) {
                AbstractC1904a.a("performMeasureAndLayout called with unattached root");
            }
            if (!l7.G()) {
                AbstractC1904a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f365c) {
                AbstractC1904a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.f365c = true;
                this.f366d = false;
                try {
                    if (!((F0) ((k3.d) c0050o.f499q).f14122r).isEmpty()) {
                        if (l7.f286x != null) {
                            o(l7, true);
                        } else {
                            n(l7);
                        }
                    }
                    o(l7, false);
                    this.f365c = false;
                    this.f366d = false;
                } catch (Throwable th) {
                    this.f365c = false;
                    this.f366d = false;
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean m(L l7, boolean z5, boolean z6) {
        W0.a aVar;
        boolean zB;
        AbstractC1932I placementScope;
        C0056v c0056v;
        L lS;
        Y y6;
        M m4;
        Y y7;
        M m7;
        boolean z7 = l7.f278e0;
        P p7 = l7.f269V;
        if (z7 || (!l7.G() && !p7.f311p.f382I && !h(l7) && !kotlin.jvm.internal.m.a(l7.H(), Boolean.TRUE) && ((!p7.f303e || (l7.r() != I.f237q && ((y7 = p7.f312q) == null || (m7 = y7.f346G) == null || !m7.e()))) && !p7.f311p.f386M.e() && ((y6 = p7.f312q) == null || (m4 = y6.f346G) == null || !m4.e())))) {
            return false;
        }
        L l8 = this.f363a;
        if (l7 == l8) {
            aVar = this.i;
            kotlin.jvm.internal.m.b(aVar);
        } else {
            aVar = null;
        }
        if (z5) {
            zB = p7.f303e ? b(l7, aVar) : false;
            if (z6 && ((zB || p7.f) && kotlin.jvm.internal.m.a(l7.H(), Boolean.TRUE))) {
                l7.I();
            }
        } else {
            boolean zC = l7.q() ? c(l7, aVar) : false;
            if (z6 && l7.p() && (l7 == l8 || ((lS = l7.s()) != null && lS.G() && p7.f311p.f382I))) {
                if (l7 == l8) {
                    if (l7.f265R == I.f239s) {
                        l7.d();
                    }
                    L lS2 = l7.s();
                    if (lS2 == null || (c0056v = lS2.f268U.f430b) == null || (placementScope = c0056v.f323y) == null) {
                        placementScope = ((C0.A) O.a(l7)).getPlacementScope();
                    }
                    AbstractC1932I.f(placementScope, p7.f311p, 0, 0);
                } else {
                    l7.O();
                }
                ((R.e) this.f367e.f499q).c(l7);
                l7.f277d0 = true;
                ((C0.A) O.a(l7)).getRectManager().d(l7);
            }
            zB = zC;
        }
        d();
        return zB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(L l7) {
        R.e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l8 = (L) objArr[i7];
            if (i(l8)) {
                if (AbstractC0041g.q(l8)) {
                    o(l8, true);
                } else {
                    n(l8);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(L l7, boolean z5) {
        W0.a aVar;
        if (l7.f278e0) {
            return;
        }
        if (l7 == this.f363a) {
            aVar = this.i;
            kotlin.jvm.internal.m.b(aVar);
        } else {
            aVar = null;
        }
        if (z5) {
            b(l7, aVar);
        } else {
            c(l7, aVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p(L l7, boolean z5) {
        int iOrdinal = l7.f269V.f302d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f369h.c(new Z(l7, false, z5));
            } else {
                if (iOrdinal != 4) {
                    throw new C2.e();
                }
                if (!l7.q() || z5) {
                    l7.f269V.f311p.f383J = true;
                    if (!l7.f278e0 && (l7.G() || h(l7))) {
                        L lS = l7.s();
                        if (lS == null || !lS.q()) {
                            this.f364b.l(l7, false);
                        }
                        if (!this.f366d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(long j) {
        W0.a aVar = this.i;
        if (aVar == null ? false : W0.a.b(aVar.f8007a, j)) {
            return;
        }
        if (this.f365c) {
            AbstractC1904a.a("updateRootConstraints called while measuring");
        }
        this.i = new W0.a(j);
        L l7 = this.f363a;
        L l8 = l7.f286x;
        P p7 = l7.f269V;
        if (l8 != null) {
            p7.f303e = true;
        }
        p7.f311p.f383J = true;
        this.f364b.l(l7, l8 != null);
    }
}
