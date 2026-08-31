package B0;

import c0.AbstractC0724l;
import java.util.List;
import y0.AbstractC1904a;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;

/* JADX INFO: renamed from: B0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0034c0 extends AbstractC1933J implements InterfaceC1925B, InterfaceC0031b, InterfaceC0038e0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f374A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public B5.c f377D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f378E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Object f380G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f381H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f382I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f383J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f384K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f385L;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f389P;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f393T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f394U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public B5.c f395V;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public float f397X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f399Z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final P f400v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f401w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f404z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f402x = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f403y = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public I f375B = I.f239s;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f376C = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f379F = true;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final M f386M = new M(this, 0);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final R.e f387N = new R.e(new C0034c0[16]);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f388O = true;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f390Q = W0.b.b(0, 0, 15);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final C0032b0 f391R = new C0032b0(this, 1);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final C0032b0 f392S = new C0032b0(this, 0);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f396W = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final C0032b0 f398Y = new C0032b0(this, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0034c0(P p7) {
        this.f400v = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final boolean A() {
        return this.f381H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final void J() {
        L.S(this.f400v.f299a, false, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.AbstractC1933J
    public final int K() {
        return this.f400v.a().K();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.AbstractC1933J
    public final int N() {
        return this.f400v.a().N();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    @Override // z0.AbstractC1933J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(long r9, float r11, B5.c r12) {
        /*
            r8 = this;
            r0 = 1
            r8.f382I = r0
            long r1 = r8.f376C
            boolean r1 = W0.i.a(r9, r1)
            r2 = 0
            B0.P r3 = r8.f400v
            if (r1 == 0) goto L12
            boolean r1 = r8.f399Z
            if (r1 == 0) goto L25
        L12:
            boolean r1 = r3.f306k
            if (r1 != 0) goto L1e
            boolean r1 = r3.j
            if (r1 != 0) goto L1e
            boolean r1 = r8.f399Z
            if (r1 == 0) goto L22
        L1e:
            r8.f384K = r0
            r8.f399Z = r2
        L22:
            r8.c0()
        L25:
            B0.Y r1 = r3.f312q
            B0.L r4 = r3.f299a
            if (r1 == 0) goto L49
            B0.P r5 = r1.f353v
            B0.L r6 = r5.f299a
            boolean r6 = B0.AbstractC0041g.q(r6)
            if (r6 == 0) goto L37
            r1 = r0
            goto L45
        L37:
            B0.V r1 = r1.f345F
            B0.V r6 = B0.V.f333s
            if (r1 != r6) goto L43
            boolean r1 = r5.f300b
            if (r1 != 0) goto L43
            r5.f301c = r0
        L43:
            boolean r1 = r5.f301c
        L45:
            if (r1 != r0) goto L49
            r1 = r0
            goto L4a
        L49:
            r1 = r2
        L4a:
            if (r1 == 0) goto L85
            B0.n0 r1 = r3.a()
            B0.n0 r1 = r1.f480D
            if (r1 == 0) goto L58
            z0.z r1 = r1.f323y
            if (r1 != 0) goto L62
        L58:
            B0.t0 r1 = B0.O.a(r4)
            C0.A r1 = (C0.A) r1
            z0.I r1 = r1.getPlacementScope()
        L62:
            B0.Y r5 = r3.f312q
            kotlin.jvm.internal.m.b(r5)
            B0.L r4 = r4.s()
            if (r4 == 0) goto L71
            B0.P r4 = r4.f269V
            r4.f305h = r2
        L71:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5.f356y = r4
            r4 = 32
            long r6 = r9 >> r4
            int r4 = (int) r6
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r9
            int r6 = (int) r6
            z0.AbstractC1932I.d(r1, r5, r4, r6)
        L85:
            B0.Y r1 = r3.f312q
            if (r1 == 0) goto L8e
            boolean r1 = r1.f340A
            if (r1 != 0) goto L8e
            goto L8f
        L8e:
            r0 = r2
        L8f:
            if (r0 == 0) goto L96
            java.lang.String r0 = "Error: Placement happened before lookahead."
            y0.AbstractC1904a.b(r0)
        L96:
            r8.e0(r9, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0034c0.U(long, float, B5.c):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List Y() {
        P p7 = this.f400v;
        p7.f299a.a0();
        boolean z5 = this.f388O;
        R.e eVar = this.f387N;
        if (!z5) {
            return eVar.h();
        }
        L l7 = p7.f299a;
        R.e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l8 = (L) objArr[i7];
            if (eVar.f6678s <= i7) {
                eVar.c(l8.f269V.f311p);
            } else {
                C0034c0 c0034c0 = l8.f269V.f311p;
                Object[] objArr2 = eVar.f6676q;
                Object obj = objArr2[i7];
                objArr2[i7] = c0034c0;
            }
        }
        eVar.o(((R.b) l7.n()).f6670q.f6678s, eVar.f6678s);
        this.f388O = false;
        return eVar.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z() {
        boolean z5 = this.f381H;
        this.f381H = true;
        L l7 = this.f400v.f299a;
        C0042g0 c0042g0 = l7.f268U;
        if (!z5) {
            c0042g0.f430b.O0();
            if (l7.q()) {
                L.S(l7, true, 6);
            } else if (l7.f269V.f303e) {
                L.Q(l7, true, 6);
            }
        }
        n0 n0Var = c0042g0.f430b.f479C;
        for (n0 n0Var2 = c0042g0.f431c; !kotlin.jvm.internal.m.a(n0Var2, n0Var) && n0Var2 != null; n0Var2 = n0Var2.f479C) {
            if (n0Var2.f497U) {
                n0Var2.I0();
            }
        }
        R.e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l8 = (L) objArr[i7];
            if (l8.t() != Integer.MAX_VALUE) {
                l8.f269V.f311p.Z();
                L.T(l8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1925B
    public final AbstractC1933J a(long j) {
        I i;
        P p7 = this.f400v;
        L l7 = p7.f299a;
        I i7 = l7.f265R;
        I i8 = I.f239s;
        if (i7 == i8) {
            l7.c();
        }
        if (AbstractC0041g.q(p7.f299a)) {
            Y y6 = p7.f312q;
            kotlin.jvm.internal.m.b(y6);
            y6.f357z = i8;
            y6.a(j);
        }
        L l8 = p7.f299a;
        L lS = l8.s();
        if (lS != null) {
            P p8 = lS.f269V;
            if (this.f375B != i8 && !l8.f267T) {
                AbstractC1904a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = p8.f302d.ordinal();
            if (iOrdinal == 0) {
                i = I.f237q;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + p8.f302d);
                }
                i = I.f238r;
            }
            this.f375B = i;
        } else {
            this.f375B = i8;
        }
        h0(j);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b0() {
        if (this.f381H) {
            this.f381H = false;
            P p7 = this.f400v;
            C0042g0 c0042g0 = p7.f299a.f268U;
            n0 n0Var = c0042g0.f430b.f479C;
            for (n0 n0Var2 = c0042g0.f431c; !kotlin.jvm.internal.m.a(n0Var2, n0Var) && n0Var2 != null; n0Var2 = n0Var2.f479C) {
                AbstractC0724l abstractC0724lD0 = n0Var2.D0(o0.g(1048576));
                if (abstractC0724lD0 != null && (abstractC0724lD0.f10100q.f10103t & 1048576) != 0) {
                    boolean zG = o0.g(1048576);
                    AbstractC0724l abstractC0724lB0 = n0Var2.B0();
                    if (zG || (abstractC0724lB0 = abstractC0724lB0.f10104u) != null) {
                        for (AbstractC0724l abstractC0724lD02 = n0Var2.D0(zG); abstractC0724lD02 != null && (abstractC0724lD02.f10103t & 1048576) != 0; abstractC0724lD02 = abstractC0724lD02.f10105v) {
                            if ((abstractC0724lD02.f10102s & 1048576) != 0) {
                                AbstractC0724l abstractC0724lF = abstractC0724lD02;
                                R.e eVar = null;
                                while (abstractC0724lF != null) {
                                    if ((abstractC0724lF.f10102s & 1048576) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                        int i = 0;
                                        for (AbstractC0724l abstractC0724l = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
                                            if ((abstractC0724l.f10102s & 1048576) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    abstractC0724lF = abstractC0724l;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new R.e(new AbstractC0724l[16]);
                                                    }
                                                    if (abstractC0724lF != null) {
                                                        eVar.c(abstractC0724lF);
                                                        abstractC0724lF = null;
                                                    }
                                                    eVar.c(abstractC0724l);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    abstractC0724lF = AbstractC0041g.f(eVar);
                                }
                            }
                            if (abstractC0724lD02 == abstractC0724lB0) {
                                break;
                            }
                        }
                    }
                }
                if (n0Var2.f498V != null) {
                    n0Var2.U0(null, false);
                    n0Var2.f478B.R(false);
                }
            }
            R.e eVarW = p7.f299a.w();
            Object[] objArr = eVarW.f6676q;
            int i7 = eVarW.f6678s;
            for (int i8 = 0; i8 < i7; i8++) {
                ((L) objArr[i8]).f269V.f311p.b0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final M c() {
        return this.f386M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c0() {
        P p7 = this.f400v;
        if (p7.f307l > 0) {
            R.e eVarW = p7.f299a.w();
            Object[] objArr = eVarW.f6676q;
            int i = eVarW.f6678s;
            for (int i7 = 0; i7 < i; i7++) {
                L l7 = (L) objArr[i7];
                P p8 = l7.f269V;
                boolean z5 = p8.j;
                C0034c0 c0034c0 = p8.f311p;
                if ((z5 || p8.f306k) && !c0034c0.f384K) {
                    l7.R(false);
                }
                c0034c0.c0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0() {
        this.f394U = true;
        P p7 = this.f400v;
        L lS = p7.f299a.s();
        float f = n().f490N;
        L l7 = p7.f299a;
        C0042g0 c0042g0 = l7.f268U;
        C0056v c0056v = c0042g0.f430b;
        for (n0 n0Var = c0042g0.f431c; n0Var != c0056v; n0Var = n0Var.f479C) {
            kotlin.jvm.internal.m.c(n0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            f += ((B) n0Var).f490N;
        }
        if (f != this.f393T) {
            this.f393T = f;
            if (lS != null) {
                lS.L();
            }
            if (lS != null) {
                lS.A();
            }
        }
        if (this.f381H) {
            l7.f268U.f430b.O0();
        } else {
            if (lS != null) {
                lS.A();
            }
            Z();
            if (this.f401w && lS != null) {
                lS.R(false);
            }
        }
        if (lS != null) {
            P p8 = lS.f269V;
            if (!this.f401w && p8.f302d == G.f227s) {
                if (this.f403y != Integer.MAX_VALUE) {
                    AbstractC1904a.b("Place was called on a node which was placed already");
                }
                int i = p8.i;
                this.f403y = i;
                p8.i = i + 1;
            }
        } else {
            this.f403y = 0;
        }
        t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e0(long j, float f, B5.c cVar) {
        P p7 = this.f400v;
        L l7 = p7.f299a;
        L l8 = p7.f299a;
        if (l7.f278e0) {
            AbstractC1904a.a("place is called on a deactivated node");
        }
        p7.f302d = G.f227s;
        boolean z5 = !this.f374A;
        this.f376C = j;
        this.f378E = f;
        this.f377D = cVar;
        this.f374A = true;
        this.f394U = false;
        C0.A a7 = (C0.A) O.a(l8);
        a7.getRectManager().f(l8, j, z5);
        if (this.f384K || !this.f381H) {
            this.f386M.f293e = false;
            p7.d(false);
            this.f395V = cVar;
            this.f396W = j;
            this.f397X = f;
            v0 snapshotObserver = a7.getSnapshotObserver();
            snapshotObserver.a(l8, snapshotObserver.f, this.f398Y);
        } else {
            n0 n0VarA = p7.a();
            n0VarA.R0(W0.i.c(j, n0VarA.f18668u), f, cVar);
            d0();
        }
        p7.f302d = G.f229u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.AbstractC1933J, z0.InterfaceC1925B
    public final Object g() {
        return this.f380G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h0(long j) {
        P p7 = this.f400v;
        L l7 = p7.f299a;
        L l8 = p7.f299a;
        if (l7.f278e0) {
            AbstractC1904a.a("measure is called on a deactivated node");
        }
        t0 t0VarA = O.a(l8);
        L lS = l8.s();
        boolean z5 = true;
        l8.f267T = l8.f267T || (lS != null && lS.f267T);
        if (!l8.q() && W0.a.b(this.f18667t, j)) {
            ((C0.A) t0VarA).q(l8, false);
            l8.U();
            return false;
        }
        this.f386M.f292d = false;
        R.e eVarW = l8.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            ((L) objArr[i7]).f269V.f311p.f386M.getClass();
        }
        this.f404z = true;
        long j7 = p7.a().f18666s;
        X(j);
        G g7 = p7.f302d;
        G g8 = G.f229u;
        if (g7 != g8) {
            AbstractC1904a.b("layout state is not idle before measure starts");
        }
        this.f390Q = j;
        G g9 = G.f225q;
        p7.f302d = g9;
        this.f383J = false;
        v0 snapshotObserver = ((C0.A) O.a(l8)).getSnapshotObserver();
        snapshotObserver.a(l8, snapshotObserver.f521c, this.f391R);
        if (p7.f302d == g9) {
            this.f384K = true;
            this.f385L = true;
            p7.f302d = g8;
        }
        if (W0.k.a(p7.a().f18666s, j7) && p7.a().f18664q == this.f18664q && p7.a().f18665r == this.f18665r) {
            z5 = false;
        }
        W((((long) p7.a().f18665r) & 4294967295L) | (((long) p7.a().f18664q) << 32));
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0038e0
    public final void k(boolean z5) {
        P p7 = this.f400v;
        if (z5 != p7.a().f320v) {
            p7.a().f320v = z5;
            this.f399Z = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final C0056v n() {
        return this.f400v.f299a.f268U.f430b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final void o(C0029a c0029a) {
        R.e eVarW = this.f400v.f299a.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            c0029a.invoke(((L) objArr[i7]).f269V.f311p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final InterfaceC0031b q() {
        P p7;
        L lS = this.f400v.f299a.s();
        if (lS == null || (p7 = lS.f269V) == null) {
            return null;
        }
        return p7.f311p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final void requestLayout() {
        this.f400v.f299a.R(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0031b
    public final void t() {
        boolean zH0;
        this.f389P = true;
        M m4 = this.f386M;
        m4.h();
        boolean z5 = this.f384K;
        P p7 = this.f400v;
        if (z5) {
            R.e eVarW = p7.f299a.w();
            Object[] objArr = eVarW.f6676q;
            int i = eVarW.f6678s;
            for (int i7 = 0; i7 < i; i7++) {
                L l7 = (L) objArr[i7];
                boolean zQ = l7.q();
                P p8 = l7.f269V;
                if (zQ) {
                    C0034c0 c0034c0 = p8.f311p;
                    if (c0034c0.f375B == I.f237q) {
                        W0.a aVar = c0034c0.f404z ? new W0.a(c0034c0.f18667t) : null;
                        if (aVar != null) {
                            if (l7.f265R == I.f239s) {
                                l7.c();
                            }
                            zH0 = p8.f311p.h0(aVar.f8007a);
                        } else {
                            zH0 = false;
                        }
                        if (zH0) {
                            L.S(p7.f299a, false, 7);
                        }
                    }
                }
            }
        }
        if (this.f385L || (!n().f322x && this.f384K)) {
            this.f384K = false;
            G g7 = p7.f302d;
            p7.f302d = G.f227s;
            p7.e(false);
            L l8 = p7.f299a;
            v0 snapshotObserver = ((C0.A) O.a(l8)).getSnapshotObserver();
            snapshotObserver.a(l8, snapshotObserver.f523e, this.f392S);
            p7.f302d = g7;
            if (n().f322x && p7.j) {
                requestLayout();
            }
            this.f385L = false;
        }
        if (m4.f290b && m4.e()) {
            m4.g();
        }
        this.f389P = false;
    }
}
