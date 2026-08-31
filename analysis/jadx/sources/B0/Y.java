package B0;

import y0.AbstractC1904a;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC1933J implements InterfaceC1925B, InterfaceC0031b, InterfaceC0038e0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f340A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f341B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public W0.a f342C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public B5.c f344E;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f349J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Object f351L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f352M;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final P f353v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f355x = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f356y = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public I f357z = I.f239s;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f343D = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public V f345F = V.f333s;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final M f346G = new M(this, 1);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final R.e f347H = new R.e(new Y[16]);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f348I = true;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f350K = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y(P p7) {
        this.f353v = p7;
        this.f351L = p7.f311p.f380G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final boolean A() {
        return this.f345F != V.f333s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final void J() {
        L.Q(this.f353v.f299a, false, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.AbstractC1933J
    public final void U(long j, float f, B5.c cVar) {
        d0(j, cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Y(boolean z5) {
        P p7 = this.f353v;
        if (z5 && p7.f301c) {
            return;
        }
        if (z5 || p7.f301c) {
            this.f345F = V.f333s;
            R.e eVarW = p7.f299a.w();
            Object[] objArr = eVarW.f6676q;
            int i = eVarW.f6678s;
            for (int i7 = 0; i7 < i; i7++) {
                Y y6 = ((L) objArr[i7]).f269V.f312q;
                kotlin.jvm.internal.m.b(y6);
                y6.Y(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z() {
        V v6 = this.f345F;
        P p7 = this.f353v;
        boolean z5 = p7.f301c;
        L l7 = p7.f299a;
        V v7 = V.f331q;
        if (z5) {
            this.f345F = V.f332r;
        } else {
            this.f345F = v7;
        }
        if (v6 != v7 && p7.f303e) {
            L.Q(l7, true, 6);
        }
        R.e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l8 = (L) objArr[i7];
            Y y6 = l8.f269V.f312q;
            if (y6 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (y6.f356y != Integer.MAX_VALUE) {
                y6.Z();
                L.T(l8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // z0.InterfaceC1925B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z0.AbstractC1933J a(long r6) {
        /*
            r5 = this;
            B0.P r0 = r5.f353v
            B0.L r1 = r0.f299a
            B0.L r1 = r1.s()
            r2 = 0
            if (r1 == 0) goto L10
            B0.P r1 = r1.f269V
            B0.G r1 = r1.f302d
            goto L11
        L10:
            r1 = r2
        L11:
            B0.G r3 = B0.G.f226r
            if (r1 == r3) goto L25
            B0.L r1 = r0.f299a
            B0.L r1 = r1.s()
            if (r1 == 0) goto L21
            B0.P r1 = r1.f269V
            B0.G r2 = r1.f302d
        L21:
            B0.G r1 = B0.G.f228t
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.f300b = r1
        L28:
            B0.L r1 = r0.f299a
            B0.L r2 = r1.s()
            if (r2 == 0) goto L72
            B0.P r2 = r2.f269V
            B0.I r3 = r5.f357z
            B0.I r4 = B0.I.f239s
            if (r3 == r4) goto L42
            boolean r1 = r1.f267T
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            y0.AbstractC1904a.b(r1)
        L42:
            B0.G r1 = r2.f302d
            int r1 = r1.ordinal()
            if (r1 == 0) goto L6d
            r3 = 1
            if (r1 == r3) goto L6d
            r3 = 2
            if (r1 == r3) goto L6a
            r3 = 3
            if (r1 != r3) goto L54
            goto L6a
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            B0.G r0 = r2.f302d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6a:
            B0.I r1 = B0.I.f238r
            goto L6f
        L6d:
            B0.I r1 = B0.I.f237q
        L6f:
            r5.f357z = r1
            goto L76
        L72:
            B0.I r1 = B0.I.f239s
            r5.f357z = r1
        L76:
            B0.L r0 = r0.f299a
            B0.I r1 = r0.f265R
            B0.I r2 = B0.I.f239s
            if (r1 != r2) goto L81
            r0.c()
        L81:
            r5.e0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.Y.a(long):z0.J");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b0() {
        P p7 = this.f353v;
        if (p7.f310o > 0) {
            R.e eVarW = p7.f299a.w();
            Object[] objArr = eVarW.f6676q;
            int i = eVarW.f6678s;
            for (int i7 = 0; i7 < i; i7++) {
                L l7 = (L) objArr[i7];
                P p8 = l7.f269V;
                if ((p8.f308m || p8.f309n) && !p8.f) {
                    l7.P(false);
                }
                Y y6 = p8.f312q;
                if (y6 != null) {
                    y6.b0();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final M c() {
        return this.f346G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c0() {
        G g7;
        this.f352M = true;
        P p7 = this.f353v;
        L lS = p7.f299a.s();
        V v6 = this.f345F;
        if ((v6 != V.f331q && !p7.f301c) || (v6 != V.f332r && p7.f301c)) {
            Z();
            if (this.f354w && lS != null) {
                lS.P(false);
            }
        }
        if (lS != null) {
            P p8 = lS.f269V;
            if (!this.f354w && ((g7 = p8.f302d) == G.f227s || g7 == G.f228t)) {
                if (this.f356y != Integer.MAX_VALUE) {
                    AbstractC1904a.b("Place was called on a node which was placed already");
                }
                int i = p8.f305h;
                this.f356y = i;
                p8.f305h = i + 1;
            }
        } else {
            this.f356y = 0;
        }
        t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0(long j, B5.c cVar) {
        P p7 = this.f353v;
        L l7 = p7.f299a;
        L l8 = p7.f299a;
        L lS = l7.s();
        G g7 = lS != null ? lS.f269V.f302d : null;
        G g8 = G.f228t;
        if (g7 == g8) {
            p7.f301c = false;
        }
        if (l8.f278e0) {
            AbstractC1904a.a("place is called on a deactivated node");
        }
        p7.f302d = g8;
        this.f340A = true;
        this.f352M = false;
        if (!W0.i.a(j, this.f343D)) {
            if (p7.f309n || p7.f308m) {
                p7.f = true;
            }
            b0();
        }
        t0 t0VarA = O.a(l8);
        if (p7.f || !A()) {
            p7.f(false);
            this.f346G.f293e = false;
            v0 snapshotObserver = ((C0.A) t0VarA).getSnapshotObserver();
            X x6 = new X(this, t0VarA, j);
            snapshotObserver.getClass();
            if (l8.f286x != null) {
                snapshotObserver.a(l8, snapshotObserver.f524g, x6);
            } else {
                snapshotObserver.a(l8, snapshotObserver.f, x6);
            }
        } else {
            U uZ0 = p7.a().z0();
            kotlin.jvm.internal.m.b(uZ0);
            uZ0.r0(W0.i.c(j, uZ0.f18668u));
            c0();
        }
        this.f343D = j;
        this.f344E = cVar;
        p7.f302d = G.f229u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e0(long j) {
        long j7;
        long j8;
        P p7 = this.f353v;
        L l7 = p7.f299a;
        L l8 = p7.f299a;
        if (l7.f278e0) {
            AbstractC1904a.a("measure is called on a deactivated node");
        }
        L lS = l8.s();
        l8.f267T = l8.f267T || (lS != null && lS.f267T);
        if (!l8.f269V.f303e) {
            W0.a aVar = this.f342C;
            if (aVar == null ? false : W0.a.b(aVar.f8007a, j)) {
                t0 t0Var = l8.f251D;
                if (t0Var != null) {
                    ((C0.A) t0Var).q(l8, true);
                }
                l8.U();
                return false;
            }
        }
        this.f342C = new W0.a(j);
        X(j);
        this.f346G.f292d = false;
        R.e eVarW = l8.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            Y y6 = ((L) objArr[i7]).f269V.f312q;
            kotlin.jvm.internal.m.b(y6);
            y6.f346G.getClass();
        }
        if (this.f341B) {
            j7 = this.f18666s;
        } else {
            long j9 = Integer.MIN_VALUE;
            j7 = (j9 & 4294967295L) | (j9 << 32);
        }
        this.f341B = true;
        U uZ0 = p7.a().z0();
        if (!(uZ0 != null)) {
            AbstractC1904a.b("Lookahead result from lookaheadRemeasure cannot be null");
        }
        Y y7 = p7.f312q;
        if (y7 != null) {
            P p8 = y7.f353v;
            p8.f302d = G.f226r;
            C0034c0 c0034c0 = p8.f311p;
            L l9 = p8.f299a;
            p8.f303e = false;
            v0 snapshotObserver = ((C0.A) O.a(l9)).getSnapshotObserver();
            j8 = 4294967295L;
            W w3 = new W(y7, j);
            snapshotObserver.getClass();
            if (l9.f286x != null) {
                snapshotObserver.a(l9, snapshotObserver.f520b, w3);
            } else {
                snapshotObserver.a(l9, snapshotObserver.f521c, w3);
            }
            p8.f = true;
            p8.f304g = true;
            if (AbstractC0041g.q(l9)) {
                c0034c0.f384K = true;
                c0034c0.f385L = true;
            } else {
                c0034c0.f383J = true;
            }
            p8.f302d = G.f229u;
        } else {
            j8 = 4294967295L;
        }
        W((((long) uZ0.f18665r) & j8) | (((long) uZ0.f18664q) << 32));
        return (((int) (j7 >> 32)) == uZ0.f18664q && ((int) (j7 & j8)) == uZ0.f18665r) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.AbstractC1933J, z0.InterfaceC1925B
    public final Object g() {
        return this.f351L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0038e0
    public final void k(boolean z5) {
        U uZ0;
        P p7 = this.f353v;
        U uZ02 = p7.a().z0();
        if (Boolean.valueOf(z5).equals(uZ02 != null ? Boolean.valueOf(uZ02.f320v) : null) || (uZ0 = p7.a().z0()) == null) {
            return;
        }
        uZ0.f320v = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final C0056v n() {
        return this.f353v.f299a.f268U.f430b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final void o(C0029a c0029a) {
        R.e eVarW = this.f353v.f299a.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            Y y6 = ((L) objArr[i7]).f269V.f312q;
            kotlin.jvm.internal.m.b(y6);
            c0029a.invoke(y6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final InterfaceC0031b q() {
        P p7;
        L lS = this.f353v.f299a.s();
        if (lS == null || (p7 = lS.f269V) == null) {
            return null;
        }
        return p7.f312q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final void requestLayout() {
        this.f353v.f299a.P(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final void t() {
        this.f349J = true;
        M m4 = this.f346G;
        m4.h();
        P p7 = this.f353v;
        boolean z5 = p7.f;
        L l7 = p7.f299a;
        if (z5) {
            R.e eVarW = l7.w();
            Object[] objArr = eVarW.f6676q;
            int i = eVarW.f6678s;
            for (int i7 = 0; i7 < i; i7++) {
                L l8 = (L) objArr[i7];
                P p8 = l8.f269V;
                if (p8.f303e && l8.r() == I.f237q) {
                    Y y6 = p8.f312q;
                    kotlin.jvm.internal.m.b(y6);
                    Y y7 = p8.f312q;
                    W0.a aVar = y7 != null ? y7.f342C : null;
                    kotlin.jvm.internal.m.b(aVar);
                    if (y6.e0(aVar.f8007a)) {
                        L.Q(l7, false, 7);
                    }
                }
            }
        }
        C0055u c0055u = n().f518b0;
        kotlin.jvm.internal.m.b(c0055u);
        if (p7.f304g || (!c0055u.f322x && p7.f)) {
            p7.f = false;
            G g7 = p7.f302d;
            p7.f302d = G.f228t;
            t0 t0VarA = O.a(l7);
            p7.g(false);
            v0 snapshotObserver = ((C0.A) t0VarA).getSnapshotObserver();
            K k7 = new K(2, this, c0055u);
            snapshotObserver.getClass();
            if (l7.f286x != null) {
                snapshotObserver.a(l7, snapshotObserver.f525h, k7);
            } else {
                snapshotObserver.a(l7, snapshotObserver.f523e, k7);
            }
            p7.f302d = g7;
            if (p7.f308m && c0055u.f322x) {
                requestLayout();
            }
            p7.f304g = false;
        }
        if (m4.f290b && m4.e()) {
            m4.g();
        }
        this.f349J = false;
    }
}
