package B0;

import a0.AbstractC0606h;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.P1;
import i0.C1129a;
import i0.C1131c;
import j0.AbstractC1145B;
import java.util.Map;
import m0.C1348c;
import r.C1543B;
import r.C1544C;
import y0.AbstractC1904a;
import z0.C1924A;
import z0.C1952l;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;
import z0.InterfaceC1953m;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends T implements InterfaceC1925B, InterfaceC1953m, u0 {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final j0.C f474W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final C0058x f475X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final C0037e f476Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final C0037e f477Z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final L f478B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public n0 f479C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public n0 f480D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f481E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f482F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public B5.c f483G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public W0.c f484H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public W0.l f485I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public InterfaceC1927D f487K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C1543B f488L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f490N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C1129a f491O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C0058x f492P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C1348c f493Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public j0.m f494R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public j0 f495S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f497U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public s0 f498V;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f486J = 0.8f;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f489M = 0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final k0 f496T = new k0(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        j0.C c7 = new j0.C();
        c7.f13668r = 1.0f;
        c7.f13669s = 1.0f;
        c7.f13670t = 1.0f;
        long j = j0.u.f13728a;
        c7.f13672v = j;
        c7.f13673w = j;
        c7.f13674x = 8.0f;
        c7.f13675y = j0.H.f13693b;
        c7.f13676z = AbstractC1145B.f13658a;
        c7.f13663B = 9205357640488583168L;
        c7.f13664C = I1.B();
        c7.f13665D = W0.l.f8022q;
        f474W = c7;
        f475X = new C0058x();
        f476Y = new C0037e(1);
        f477Z = new C0037e(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n0(L l7) {
        this.f478B = l7;
        this.f484H = l7.f261N;
        this.f485I = l7.f262O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long A0() {
        return this.f484H.Q(this.f478B.f263P.d());
    }

    public abstract AbstractC0724l B0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final boolean C() {
        return B0().f10099D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0724l C0(int i) {
        boolean zG = o0.g(i);
        AbstractC0724l abstractC0724lB0 = B0();
        if (!zG && (abstractC0724lB0 = abstractC0724lB0.f10104u) == null) {
            return null;
        }
        for (AbstractC0724l abstractC0724lD0 = D0(zG); abstractC0724lD0 != null && (abstractC0724lD0.f10103t & i) != 0; abstractC0724lD0 = abstractC0724lD0.f10105v) {
            if ((abstractC0724lD0.f10102s & i) != 0) {
                return abstractC0724lD0;
            }
            if (abstractC0724lD0 == abstractC0724lB0) {
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0724l D0(boolean z5) {
        AbstractC0724l abstractC0724lB0;
        C0042g0 c0042g0 = this.f478B.f268U;
        if (c0042g0.f431c == this) {
            return c0042g0.f433e;
        }
        if (!z5) {
            n0 n0Var = this.f480D;
            if (n0Var != null) {
                return n0Var.B0();
            }
            return null;
        }
        n0 n0Var2 = this.f480D;
        if (n0Var2 == null || (abstractC0724lB0 = n0Var2.B0()) == null) {
            return null;
        }
        return abstractC0724lB0.f10105v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final long E() {
        return this.f18666s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E0(AbstractC0724l abstractC0724l, C0037e c0037e, long j, C0054t c0054t, int i, boolean z5) {
        if (abstractC0724l == null) {
            H0(c0037e, j, c0054t, i, z5);
            return;
        }
        int i7 = c0054t.f515s;
        C1544C c1544c = c0054t.f513q;
        c0054t.g(i7 + 1, c1544c.f16115b);
        c0054t.f515s++;
        c1544c.a(abstractC0724l);
        c0054t.f514r.a(AbstractC0041g.a(-1.0f, z5, false));
        E0(AbstractC0041g.e(abstractC0724l, c0037e.b()), c0037e, j, c0054t, i, z5);
        c0054t.f515s = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final long F(long j) {
        if (!B0().f10099D) {
            AbstractC1904a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        M0();
        for (n0 n0Var = this; n0Var != null; n0Var = n0Var.f480D) {
            s0 s0Var = n0Var.f498V;
            if (s0Var != null) {
                j = s0Var.f(false, j);
            }
            j = K1.H(j, n0Var.f489M);
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F0(AbstractC0724l abstractC0724l, C0037e c0037e, long j, C0054t c0054t, int i, boolean z5, float f) {
        if (abstractC0724l == null) {
            H0(c0037e, j, c0054t, i, z5);
            return;
        }
        int i7 = c0054t.f515s;
        C1544C c1544c = c0054t.f513q;
        c0054t.g(i7 + 1, c1544c.f16115b);
        c0054t.f515s++;
        c1544c.a(abstractC0724l);
        c0054t.f514r.a(AbstractC0041g.a(f, z5, false));
        P0(AbstractC0041g.e(abstractC0724l, c0037e.b()), c0037e, j, c0054t, i, z5, f, true);
        c0054t.f515s = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G0(C0037e c0037e, long j, C0054t c0054t, int i, boolean z5) {
        boolean z6;
        boolean z7;
        AbstractC0724l abstractC0724lC0 = C0(c0037e.b());
        if (!W0(j)) {
            if (i == 1) {
                float fS0 = s0(j, A0());
                if ((Float.floatToRawIntBits(fS0) & Integer.MAX_VALUE) < 2139095040) {
                    if (c0054t.f515s != AbstractC0836n2.u(c0054t)) {
                        if (AbstractC0041g.h(c0054t.d(), AbstractC0041g.a(fS0, false, false)) <= 0) {
                            return;
                        }
                    }
                    F0(abstractC0724lC0, c0037e, j, c0054t, i, false, fS0);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC0724lC0 == null) {
            H0(c0037e, j, c0054t, i, z5);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < N() && fIntBitsToFloat2 < K()) {
            E0(abstractC0724lC0, c0037e, j, c0054t, i, z5);
            return;
        }
        float fS02 = i == 1 ? s0(j, A0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fS02) & Integer.MAX_VALUE) < 2139095040) {
            if (c0054t.f515s != AbstractC0836n2.u(c0054t)) {
                z6 = z5;
                if (AbstractC0041g.h(c0054t.d(), AbstractC0041g.a(fS02, z6, false)) > 0) {
                }
                P0(abstractC0724lC0, c0037e, j, c0054t, i, z6, fS02, z7);
            }
            z6 = z5;
            z7 = true;
            P0(abstractC0724lC0, c0037e, j, c0054t, i, z6, fS02, z7);
        }
        z6 = z5;
        z7 = false;
        P0(abstractC0724lC0, c0037e, j, c0054t, i, z6, fS02, z7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void H0(C0037e c0037e, long j, C0054t c0054t, int i, boolean z5) {
        n0 n0Var = this.f479C;
        if (n0Var != null) {
            n0Var.G0(c0037e, n0Var.x0(j), c0054t, i, z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final C1131c I(InterfaceC1953m interfaceC1953m, boolean z5) {
        n0 n0Var;
        if (!B0().f10099D) {
            AbstractC1904a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC1953m.C()) {
            AbstractC1904a.b("LayoutCoordinates " + interfaceC1953m + " is not attached!");
        }
        C1924A c1924a = interfaceC1953m instanceof C1924A ? (C1924A) interfaceC1953m : null;
        if (c1924a == null || (n0Var = c1924a.f18658q.f325B) == null) {
            n0Var = (n0) interfaceC1953m;
        }
        n0Var.M0();
        n0 n0VarW0 = w0(n0Var);
        C1129a c1129a = this.f491O;
        if (c1129a == null) {
            c1129a = new C1129a();
            this.f491O = c1129a;
        }
        c1129a.f13516b = 0.0f;
        c1129a.f13517c = 0.0f;
        c1129a.f13518d = (int) (interfaceC1953m.E() >> 32);
        c1129a.f13519e = (int) (interfaceC1953m.E() & 4294967295L);
        while (n0Var != n0VarW0) {
            n0Var.S0(c1129a, z5, false);
            if (c1129a.b()) {
                return C1131c.f13521e;
            }
            n0Var = n0Var.f480D;
            kotlin.jvm.internal.m.b(n0Var);
        }
        p0(n0VarW0, c1129a, z5);
        return new C1131c(c1129a.f13516b, c1129a.f13517c, c1129a.f13518d, c1129a.f13519e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I0() {
        s0 s0Var = this.f498V;
        if (s0Var != null) {
            s0Var.invalidate();
            return;
        }
        n0 n0Var = this.f480D;
        if (n0Var != null) {
            n0Var.I0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean J0() {
        if (this.f498V != null && this.f486J <= 0.0f) {
            return true;
        }
        n0 n0Var = this.f480D;
        if (n0Var != null) {
            return n0Var.J0();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long K0(InterfaceC1953m interfaceC1953m, long j) {
        n0 n0Var;
        boolean z5 = interfaceC1953m instanceof C1924A;
        if (z5) {
            ((C1924A) interfaceC1953m).f18658q.f325B.M0();
            return ((C1924A) interfaceC1953m).a(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        C1924A c1924a = z5 ? (C1924A) interfaceC1953m : null;
        if (c1924a == null || (n0Var = c1924a.f18658q.f325B) == null) {
            kotlin.jvm.internal.m.c(interfaceC1953m, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            n0Var = (n0) interfaceC1953m;
        }
        n0Var.M0();
        n0 n0VarW0 = w0(n0Var);
        while (n0Var != n0VarW0) {
            s0 s0Var = n0Var.f498V;
            if (s0Var != null) {
                j = s0Var.f(false, j);
            }
            j = K1.H(j, n0Var.f489M);
            n0Var = n0Var.f480D;
            kotlin.jvm.internal.m.b(n0Var);
        }
        return q0(n0VarW0, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L0() {
        if (this.f498V != null || this.f483G == null) {
            return;
        }
        s0 s0VarD = t0.d(O.a(this.f478B), y0(), this.f496T, false, 8);
        s0VarD.a(this.f18666s);
        s0VarD.d(this.f489M);
        s0VarD.invalidate();
        this.f498V = s0VarD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M0() {
        P p7 = this.f478B.f269V;
        G g7 = p7.f299a.f269V.f302d;
        G g8 = G.f227s;
        G g9 = G.f228t;
        if (g7 == g8 || g7 == g9) {
            if (p7.f311p.f389P) {
                p7.e(true);
            } else {
                p7.d(true);
            }
        }
        if (g7 == g9) {
            Y y6 = p7.f312q;
            if (y6 == null || !y6.f349J) {
                p7.f(true);
            } else {
                p7.g(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0080 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x008f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0089 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r7v7, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void N0() {
        AbstractC0724l abstractC0724lB0;
        boolean zG = o0.g(128);
        AbstractC0724l abstractC0724lD0 = D0(zG);
        if (abstractC0724lD0 == null || (abstractC0724lD0.f10100q.f10103t & 128) == 0) {
            return;
        }
        AbstractC0606h abstractC0606hC = a0.r.c();
        B5.c cVarE = abstractC0606hC != null ? abstractC0606hC.e() : null;
        AbstractC0606h abstractC0606hD = a0.r.d(abstractC0606hC);
        try {
            if (!zG) {
                abstractC0724lB0 = B0().f10104u;
                if (abstractC0724lB0 == null) {
                }
            }
            abstractC0724lB0 = B0();
            for (AbstractC0724l abstractC0724lD02 = D0(zG); abstractC0724lD02 != null; abstractC0724lD02 = abstractC0724lD02.f10105v) {
                if ((abstractC0724lD02.f10103t & 128) == 0) {
                    break;
                }
                if ((abstractC0724lD02.f10102s & 128) != 0) {
                    ?? F6 = abstractC0724lD02;
                    ?? eVar = 0;
                    while (F6 != 0) {
                        if (F6 instanceof InterfaceC0059y) {
                            ((InterfaceC0059y) F6).q(this.f18666s);
                        } else if ((F6.f10102s & 128) != 0 && (F6 instanceof AbstractC0049n)) {
                            AbstractC0724l abstractC0724l = ((AbstractC0049n) F6).f473F;
                            int i = 0;
                            F6 = F6;
                            eVar = eVar;
                            while (abstractC0724l != null) {
                                if ((abstractC0724l.f10102s & 128) != 0) {
                                    i++;
                                    eVar = eVar;
                                    if (i == 1) {
                                        F6 = abstractC0724l;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new R.e(new AbstractC0724l[16]);
                                        }
                                        if (F6 != 0) {
                                            eVar.c(F6);
                                            F6 = 0;
                                        }
                                        eVar.c(abstractC0724l);
                                    }
                                }
                                abstractC0724l = abstractC0724l.f10105v;
                                F6 = F6;
                                eVar = eVar;
                            }
                            if (i == 1) {
                            }
                        }
                        F6 = AbstractC0041g.f(eVar);
                    }
                }
                if (abstractC0724lD02 == abstractC0724lB0) {
                    break;
                }
            }
        } finally {
            a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x005a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x0069 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0026 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x0026 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x0063 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void O0() {
        boolean zG = o0.g(128);
        AbstractC0724l abstractC0724lB0 = B0();
        if (!zG && (abstractC0724lB0 = abstractC0724lB0.f10104u) == null) {
            return;
        }
        for (AbstractC0724l abstractC0724lD0 = D0(zG); abstractC0724lD0 != null && (abstractC0724lD0.f10103t & 128) != 0; abstractC0724lD0 = abstractC0724lD0.f10105v) {
            if ((abstractC0724lD0.f10102s & 128) != 0) {
                ?? F6 = abstractC0724lD0;
                ?? eVar = 0;
                while (F6 != 0) {
                    if (F6 instanceof InterfaceC0059y) {
                        ((InterfaceC0059y) F6).j0(this);
                    } else if ((F6.f10102s & 128) != 0 && (F6 instanceof AbstractC0049n)) {
                        AbstractC0724l abstractC0724l = ((AbstractC0049n) F6).f473F;
                        int i = 0;
                        F6 = F6;
                        eVar = eVar;
                        while (abstractC0724l != null) {
                            if ((abstractC0724l.f10102s & 128) != 0) {
                                i++;
                                eVar = eVar;
                                if (i == 1) {
                                    F6 = abstractC0724l;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new R.e(new AbstractC0724l[16]);
                                    }
                                    if (F6 != 0) {
                                        eVar.c(F6);
                                        F6 = 0;
                                    }
                                    eVar.c(abstractC0724l);
                                }
                            }
                            abstractC0724l = abstractC0724l.f10105v;
                            F6 = F6;
                            eVar = eVar;
                        }
                        if (i == 1) {
                        }
                    }
                    F6 = AbstractC0041g.f(eVar);
                }
            }
            if (abstractC0724lD0 == abstractC0724lB0) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x01eb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:108:0x01ab */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:110:0x01ab */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x01e5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:118:0x018c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:121:0x0187 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:62:0x017e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x018a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:94:0x01dc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190 A[PHI: r5
  0x0190: PHI (r5v3 ??) = (r5v1 ??), (r5v1 ??), (r5v5 ??) binds: [B:50:0x015c, B:52:0x0160, B:66:0x018a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v18, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [R.e] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P0(c0.AbstractC0724l r18, B0.C0037e r19, long r20, B0.C0054t r22, int r23, boolean r24, float r25, boolean r26) {
        /*
            r17 = this;
            if (r18 != 0) goto L12
            r0 = r17
            r1 = r19
            r2 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            r0.H0(r1, r2, r4, r5, r6)
            return
        L12:
            r6 = r23
            r0 = 16
            r1 = 0
            r2 = 0
            r11 = 1
            r3 = 3
            if (r6 != r3) goto L1d
            goto L20
        L1d:
            r4 = 4
            if (r6 != r4) goto L195
        L20:
            r4 = r18
            r5 = r2
        L23:
            if (r4 == 0) goto L195
            boolean r7 = r4 instanceof B0.y0
            if (r7 == 0) goto L153
            B0.y0 r4 = (B0.y0) r4
            r4.getClass()
            int r4 = B0.C0.f219b
            long r4 = B0.C0.f218a
            r7 = 32
            long r7 = r20 >> r7
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            r9 = r17
            B0.L r10 = r9.f478B
            W0.l r12 = r10.f262O
            int r13 = B0.C0.f219b
            r13 = -9223372036854775808
            long r13 = r13 & r4
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            W0.l r14 = W0.l.f8022q
            r15 = 2
            if (r13 == 0) goto L57
            if (r12 != r14) goto L52
            goto L57
        L52:
            int r12 = B0.C0037e.a(r15, r4)
            goto L5b
        L57:
            int r12 = B0.C0037e.a(r1, r4)
        L5b:
            int r12 = -r12
            float r12 = (float) r12
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 < 0) goto L195
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r8 = r9.N()
            W0.l r10 = r10.f262O
            if (r13 == 0) goto L75
            if (r10 != r14) goto L70
            goto L75
        L70:
            int r10 = B0.C0037e.a(r1, r4)
            goto L79
        L75:
            int r10 = B0.C0037e.a(r15, r4)
        L79:
            int r8 = r8 + r10
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L195
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r20 & r7
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            int r10 = B0.C0037e.a(r11, r4)
            int r10 = -r10
            float r10 = (float) r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L195
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r8 = r9.K()
            int r3 = B0.C0037e.a(r3, r4)
            int r3 = r3 + r8
            float r3 = (float) r3
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 >= 0) goto L195
            B0.l0 r0 = new B0.l0
            r2 = r18
            r3 = r19
            r4 = r20
            r8 = r24
            r10 = r26
            r7 = r6
            r1 = r9
            r6 = r22
            r9 = r25
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            r7 = r6
            r6 = r2
            r.x r1 = r7.f514r
            r.C r2 = r7.f513q
            int r3 = r7.f515s
            int r4 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r7)
            r5 = 0
            if (r3 != r4) goto Le9
            int r3 = r7.f515s
            int r4 = r3 + 1
            int r9 = r2.f16115b
            r7.g(r4, r9)
            int r4 = r7.f515s
            int r4 = r4 + r11
            r7.f515s = r4
            r2.a(r6)
            long r4 = B0.AbstractC0041g.a(r5, r8, r11)
            r1.a(r4)
            r0.invoke()
            r7.f515s = r3
            return
        Le9:
            long r3 = r7.d()
            int r9 = r7.f515s
            boolean r10 = B0.AbstractC0041g.o(r3)
            if (r10 == 0) goto L12d
            int r3 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r7)
            r7.f515s = r3
            int r4 = r3 + 1
            int r10 = r2.f16115b
            r7.g(r4, r10)
            int r4 = r7.f515s
            int r4 = r4 + r11
            r7.f515s = r4
            r2.a(r6)
            long r12 = B0.AbstractC0041g.a(r5, r8, r11)
            r1.a(r12)
            r0.invoke()
            r7.f515s = r3
            long r0 = r7.d()
            float r0 = B0.AbstractC0041g.k(r0)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L12a
            int r0 = r9 + 1
            int r1 = r7.f515s
            int r1 = r1 + r11
            r7.g(r0, r1)
        L12a:
            r7.f515s = r9
            return
        L12d:
            float r3 = B0.AbstractC0041g.k(r3)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L152
            int r3 = r7.f515s
            int r4 = r3 + 1
            int r9 = r2.f16115b
            r7.g(r4, r9)
            int r4 = r7.f515s
            int r4 = r4 + r11
            r7.f515s = r4
            r2.a(r6)
            long r4 = B0.AbstractC0041g.a(r5, r8, r11)
            r1.a(r4)
            r0.invoke()
            r7.f515s = r3
        L152:
            return
        L153:
            r6 = r18
            r7 = r22
            r8 = r24
            int r9 = r4.f10102s
            r9 = r9 & r0
            if (r9 == 0) goto L190
            boolean r9 = r4 instanceof B0.AbstractC0049n
            if (r9 == 0) goto L190
            r9 = r4
            B0.n r9 = (B0.AbstractC0049n) r9
            c0.l r9 = r9.f473F
            r10 = r1
        L168:
            if (r9 == 0) goto L18a
            int r12 = r9.f10102s
            r12 = r12 & r0
            if (r12 == 0) goto L187
            int r10 = r10 + 1
            if (r10 != r11) goto L175
            r4 = r9
            goto L187
        L175:
            if (r5 != 0) goto L17e
            R.e r5 = new R.e
            c0.l[] r12 = new c0.AbstractC0724l[r0]
            r5.<init>(r12)
        L17e:
            if (r4 == 0) goto L184
            r5.c(r4)
            r4 = r2
        L184:
            r5.c(r9)
        L187:
            c0.l r9 = r9.f10105v
            goto L168
        L18a:
            if (r10 != r11) goto L190
        L18c:
            r6 = r23
            goto L23
        L190:
            c0.l r4 = B0.AbstractC0041g.f(r5)
            goto L18c
        L195:
            r6 = r18
            r7 = r22
            r8 = r24
            if (r26 == 0) goto L1a1
            r17.F0(r18, r19, r20, r22, r23, r24, r25)
            return
        L1a1:
            r3 = r19
            int r4 = r3.f408q
            switch(r4) {
                case 1: goto L1a9;
                default: goto L1a8;
            }
        L1a8:
            goto L1f0
        L1a9:
            r5 = r2
            r4 = r6
        L1ab:
            if (r4 == 0) goto L1f0
            boolean r9 = r4 instanceof B0.y0
            if (r9 == 0) goto L1b7
            B0.y0 r4 = (B0.y0) r4
            r4.e0()
            goto L1eb
        L1b7:
            int r9 = r4.f10102s
            r9 = r9 & r0
            if (r9 == 0) goto L1eb
            boolean r9 = r4 instanceof B0.AbstractC0049n
            if (r9 == 0) goto L1eb
            r9 = r4
            B0.n r9 = (B0.AbstractC0049n) r9
            c0.l r9 = r9.f473F
            r10 = r1
        L1c6:
            if (r9 == 0) goto L1e8
            int r12 = r9.f10102s
            r12 = r12 & r0
            if (r12 == 0) goto L1e5
            int r10 = r10 + 1
            if (r10 != r11) goto L1d3
            r4 = r9
            goto L1e5
        L1d3:
            if (r5 != 0) goto L1dc
            R.e r5 = new R.e
            c0.l[] r12 = new c0.AbstractC0724l[r0]
            r5.<init>(r12)
        L1dc:
            if (r4 == 0) goto L1e2
            r5.c(r4)
            r4 = r2
        L1e2:
            r5.c(r9)
        L1e5:
            c0.l r9 = r9.f10105v
            goto L1c6
        L1e8:
            if (r10 != r11) goto L1eb
            goto L1ab
        L1eb:
            c0.l r4 = B0.AbstractC0041g.f(r5)
            goto L1ab
        L1f0:
            int r0 = r3.b()
            c0.l r1 = B0.AbstractC0041g.e(r6, r0)
            r9 = 0
            r0 = r17
            r6 = r23
            r2 = r3
            r5 = r7
            r7 = r8
            r3 = r20
            r8 = r25
            r0.P0(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.n0.P0(c0.l, B0.e, long, B0.t, int, boolean, float, boolean):void");
    }

    public abstract void Q0(j0.m mVar, C1348c c1348c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R0(long j, float f, B5.c cVar) {
        U0(cVar, false);
        if (!W0.i.a(this.f489M, j)) {
            this.f489M = j;
            L l7 = this.f478B;
            l7.f269V.f311p.c0();
            s0 s0Var = this.f498V;
            if (s0Var != null) {
                s0Var.d(j);
            } else {
                n0 n0Var = this.f480D;
                if (n0Var != null) {
                    n0Var.I0();
                }
            }
            T.n0(this);
            t0 t0Var = l7.f251D;
            if (t0Var != null) {
                ((C0.A) t0Var).E(l7);
            }
        }
        this.f490N = f;
        if (this.f322x) {
            return;
        }
        Z(new x0(j0(), this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S0(C1129a c1129a, boolean z5, boolean z6) {
        s0 s0Var = this.f498V;
        if (s0Var != null) {
            if (this.f482F) {
                if (z6) {
                    long jA0 = A0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jA0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA0 & 4294967295L)) / 2.0f;
                    long j = this.f18666s;
                    c1129a.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z5) {
                    long j7 = this.f18666s;
                    c1129a.a(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L));
                }
                if (c1129a.b()) {
                    return;
                }
            }
            s0Var.b(c1129a, false);
        }
        long j8 = this.f489M;
        float f = (int) (j8 >> 32);
        c1129a.f13516b += f;
        c1129a.f13518d += f;
        float f7 = (int) (j8 & 4294967295L);
        c1129a.f13517c += f7;
        c1129a.f13519e += f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:116:0x00c4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:119:0x0081 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:121:0x0081 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:124:0x00be */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x00b5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [R.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [R.e] */
    public final void T0(InterfaceC1927D interfaceC1927D) {
        n0 n0Var;
        InterfaceC1927D interfaceC1927D2 = this.f487K;
        if (interfaceC1927D != interfaceC1927D2) {
            this.f487K = interfaceC1927D;
            L l7 = this.f478B;
            int i = 0;
            if (interfaceC1927D2 == null || interfaceC1927D.b() != interfaceC1927D2.b() || interfaceC1927D.a() != interfaceC1927D2.a()) {
                int iB = interfaceC1927D.b();
                int iA = interfaceC1927D.a();
                s0 s0Var = this.f498V;
                if (s0Var != null) {
                    s0Var.a((((long) iB) << 32) | (((long) iA) & 4294967295L));
                } else if (l7.G() && (n0Var = this.f480D) != null) {
                    n0Var.I0();
                }
                W((((long) iA) & 4294967295L) | (((long) iB) << 32));
                if (this.f483G != null) {
                    V0(false);
                }
                boolean zG = o0.g(4);
                AbstractC0724l abstractC0724lB0 = B0();
                if (zG || (abstractC0724lB0 = abstractC0724lB0.f10104u) != null) {
                    for (AbstractC0724l abstractC0724lD0 = D0(zG); abstractC0724lD0 != null && (abstractC0724lD0.f10103t & 4) != 0; abstractC0724lD0 = abstractC0724lD0.f10105v) {
                        if ((abstractC0724lD0.f10102s & 4) != 0) {
                            ?? F6 = abstractC0724lD0;
                            ?? eVar = 0;
                            while (F6 != 0) {
                                if (F6 instanceof InterfaceC0051p) {
                                    ((InterfaceC0051p) F6).d0();
                                } else if ((F6.f10102s & 4) != 0 && (F6 instanceof AbstractC0049n)) {
                                    AbstractC0724l abstractC0724l = ((AbstractC0049n) F6).f473F;
                                    int i7 = 0;
                                    F6 = F6;
                                    eVar = eVar;
                                    while (abstractC0724l != null) {
                                        if ((abstractC0724l.f10102s & 4) != 0) {
                                            i7++;
                                            eVar = eVar;
                                            if (i7 == 1) {
                                                F6 = abstractC0724l;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new R.e(new AbstractC0724l[16]);
                                                }
                                                if (F6 != 0) {
                                                    eVar.c(F6);
                                                    F6 = 0;
                                                }
                                                eVar.c(abstractC0724l);
                                            }
                                        }
                                        abstractC0724l = abstractC0724l.f10105v;
                                        F6 = F6;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                F6 = AbstractC0041g.f(eVar);
                            }
                        }
                        if (abstractC0724lD0 == abstractC0724lB0) {
                            break;
                        }
                    }
                }
                t0 t0Var = l7.f251D;
                if (t0Var != null) {
                    ((C0.A) t0Var).E(l7);
                }
            }
            C1543B c1543b = this.f488L;
            if ((c1543b == null || c1543b.f16113e == 0) && interfaceC1927D.c().isEmpty()) {
                return;
            }
            C1543B c1543b2 = this.f488L;
            Map mapC = interfaceC1927D.c();
            if (c1543b2 != null && c1543b2.f16113e == mapC.size()) {
                Object[] objArr = c1543b2.f16110b;
                int[] iArr = c1543b2.f16111c;
                long[] jArr = c1543b2.f16109a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i8 = 0;
                loop0: while (true) {
                    long j = jArr[i8];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = i; i10 < i9; i10++) {
                            if ((255 & j) < 128) {
                                int i11 = (i8 << 3) + i10;
                                Object obj = objArr[i11];
                                int i12 = iArr[i11];
                                Integer num = (Integer) mapC.get((C1952l) obj);
                                if (num == null || num.intValue() != i12) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i9 != 8) {
                            return;
                        }
                    }
                    if (i8 == length) {
                        return;
                    }
                    i8++;
                    i = 0;
                }
            }
            l7.f269V.f311p.f386M.f();
            C1543B c1543b3 = this.f488L;
            if (c1543b3 == null) {
                C1543B c1543b4 = r.L.f16158a;
                c1543b3 = new C1543B();
                this.f488L = c1543b3;
            }
            c1543b3.a();
            for (Map.Entry entry : interfaceC1927D.c().entrySet()) {
                c1543b3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U0(B5.c cVar, boolean z5) {
        t0 t0Var;
        L l7 = this.f478B;
        boolean z6 = (!z5 && this.f483G == cVar && kotlin.jvm.internal.m.a(this.f484H, l7.f261N) && this.f485I == l7.f262O) ? false : true;
        this.f484H = l7.f261N;
        this.f485I = l7.f262O;
        boolean zF = l7.F();
        k0 k0Var = this.f496T;
        if (!zF || cVar == null) {
            this.f483G = null;
            s0 s0Var = this.f498V;
            if (s0Var != null) {
                s0Var.destroy();
                l7.f272Y = true;
                k0Var.invoke();
                if (B0().f10099D && l7.G() && (t0Var = l7.f251D) != null) {
                    ((C0.A) t0Var).E(l7);
                }
            }
            this.f498V = null;
            this.f497U = false;
            return;
        }
        this.f483G = cVar;
        if (this.f498V != null) {
            if (z6 && V0(true)) {
                ((C0.A) O.a(l7)).getRectManager().e(l7);
                return;
            }
            return;
        }
        s0 s0VarD = t0.d(O.a(l7), y0(), k0Var, l7.f285w, 4);
        s0VarD.a(this.f18666s);
        s0VarD.d(this.f489M);
        this.f498V = s0VarD;
        V0(true);
        l7.f272Y = true;
        k0Var.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean V0(boolean z5) {
        t0 t0Var;
        s0 s0Var = this.f498V;
        boolean z6 = false;
        if (s0Var == null) {
            if (this.f483G == null) {
                return false;
            }
            AbstractC1904a.b("null layer with a non-null layerBlock");
            return false;
        }
        B5.c cVar = this.f483G;
        if (cVar == null) {
            throw C0.S.i("updateLayerParameters requires a non-null layerBlock");
        }
        j0.C c7 = f474W;
        c7.c(1.0f);
        c7.e(1.0f);
        c7.a(1.0f);
        if (c7.f13671u != 0.0f) {
            c7.f13667q |= 32;
            c7.f13671u = 0.0f;
        }
        long j = j0.u.f13728a;
        if (!j0.o.c(c7.f13672v, j)) {
            c7.f13667q |= 64;
            c7.f13672v = j;
        }
        if (!j0.o.c(c7.f13673w, j)) {
            c7.f13667q |= 128;
            c7.f13673w = j;
        }
        if (c7.f13674x != 8.0f) {
            c7.f13667q |= 2048;
            c7.f13674x = 8.0f;
        }
        c7.g(j0.H.f13693b);
        j0.E e7 = c7.f13676z;
        O3.D d5 = AbstractC1145B.f13658a;
        if (!kotlin.jvm.internal.m.a(e7, d5)) {
            c7.f13667q |= 8192;
            c7.f13676z = d5;
        }
        if (c7.f13662A) {
            c7.f13667q |= 16384;
            c7.f13662A = false;
        }
        c7.f13663B = 9205357640488583168L;
        c7.f13666E = null;
        c7.f13667q = 0;
        L l7 = this.f478B;
        c7.f13664C = l7.f261N;
        c7.f13665D = l7.f262O;
        c7.f13663B = P1.d0(this.f18666s);
        ((C0.A) O.a(l7)).getSnapshotObserver().a(this, C0039f.f415u, new A0.d(2, cVar));
        C0058x c0058x = this.f492P;
        if (c0058x == null) {
            c0058x = new C0058x();
            this.f492P = c0058x;
        }
        C0058x c0058x2 = f475X;
        c0058x2.getClass();
        c0058x2.f528a = c0058x.f528a;
        c0058x2.f529b = c0058x.f529b;
        c0058x2.f530c = c0058x.f530c;
        c0058x2.f531d = c0058x.f531d;
        c0058x.f528a = c7.f13668r;
        c0058x.f529b = c7.f13669s;
        c0058x.f530c = c7.f13674x;
        c0058x.f531d = c7.f13675y;
        s0Var.c(c7);
        boolean z7 = this.f482F;
        this.f482F = c7.f13662A;
        this.f486J = c7.f13670t;
        if (c0058x2.f528a == c0058x.f528a && c0058x2.f529b == c0058x.f529b && c0058x2.f530c == c0058x.f530c && j0.H.a(c0058x2.f531d, c0058x.f531d)) {
            z6 = true;
        }
        boolean z8 = !z6;
        if (z5 && ((!z6 || z7 != this.f482F) && (t0Var = l7.f251D) != null)) {
            ((C0.A) t0Var).E(l7);
        }
        return z8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean W0(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        s0 s0Var = this.f498V;
        return s0Var == null || !this.f482F || s0Var.h(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return this.f478B.f261N.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final T c0() {
        return this.f479C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final long e(long j) {
        long jF = F(j);
        C0.A a7 = (C0.A) O.a(this.f478B);
        a7.I();
        return AbstractC1145B.o(a7.f751i0, jF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final boolean e0() {
        return this.f487K != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0053 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x0062 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x001e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x001e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x005c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // z0.AbstractC1933J, z0.InterfaceC1925B
    public final Object g() {
        L l7 = this.f478B;
        if (!l7.f268U.d(64)) {
            return null;
        }
        B0();
        Object objC0 = null;
        for (AbstractC0724l abstractC0724l = l7.f268U.f432d; abstractC0724l != null; abstractC0724l = abstractC0724l.f10104u) {
            if ((abstractC0724l.f10102s & 64) != 0) {
                ?? F6 = abstractC0724l;
                ?? eVar = 0;
                while (F6 != 0) {
                    if (F6 instanceof w0) {
                        objC0 = ((w0) F6).c0(objC0);
                    } else if ((F6.f10102s & 64) != 0 && (F6 instanceof AbstractC0049n)) {
                        AbstractC0724l abstractC0724l2 = ((AbstractC0049n) F6).f473F;
                        int i = 0;
                        F6 = F6;
                        eVar = eVar;
                        while (abstractC0724l2 != null) {
                            if ((abstractC0724l2.f10102s & 64) != 0) {
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
        }
        return objC0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final W0.l getLayoutDirection() {
        return this.f478B.f262O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final InterfaceC1953m h() {
        if (!B0().f10099D) {
            AbstractC1904a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        M0();
        return this.f478B.f268U.f431c.f480D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final L h0() {
        return this.f478B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final InterfaceC1927D j0() {
        InterfaceC1927D interfaceC1927D = this.f487K;
        if (interfaceC1927D != null) {
            return interfaceC1927D;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return this.f478B.f261N.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final T l0() {
        return this.f480D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final long m0() {
        return this.f489M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final void o0() {
        U(this.f489M, this.f490N, this.f483G);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p0(n0 n0Var, C1129a c1129a, boolean z5) {
        if (n0Var == this) {
            return;
        }
        n0 n0Var2 = this.f480D;
        if (n0Var2 != null) {
            n0Var2.p0(n0Var, c1129a, z5);
        }
        long j = this.f489M;
        float f = (int) (j >> 32);
        c1129a.f13516b -= f;
        c1129a.f13518d -= f;
        float f7 = (int) (j & 4294967295L);
        c1129a.f13517c -= f7;
        c1129a.f13519e -= f7;
        s0 s0Var = this.f498V;
        if (s0Var != null) {
            s0Var.b(c1129a, true);
            if (this.f482F && z5) {
                long j7 = this.f18666s;
                c1129a.a(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long q0(n0 n0Var, long j) {
        if (n0Var == this) {
            return j;
        }
        n0 n0Var2 = this.f480D;
        return (n0Var2 == null || kotlin.jvm.internal.m.a(n0Var, n0Var2)) ? x0(j) : x0(n0Var2.q0(n0Var, j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long r0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - N();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - K();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float s0(long j, long j7) {
        if (N() >= Float.intBitsToFloat((int) (j7 >> 32)) && K() >= Float.intBitsToFloat((int) (j7 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jR0 = r0(j7);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - N());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - K()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i7 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i7) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i7);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t0(j0.m mVar, C1348c c1348c) {
        s0 s0Var = this.f498V;
        if (s0Var != null) {
            s0Var.g(mVar, c1348c);
            return;
        }
        long j = this.f489M;
        float f = (int) (j >> 32);
        float f7 = (int) (j & 4294967295L);
        mVar.h(f, f7);
        u0(mVar, c1348c);
        mVar.h(-f, -f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u0(j0.m mVar, C1348c c1348c) {
        j0.m mVar2;
        C1348c c1348c2;
        AbstractC0724l abstractC0724lC0 = C0(4);
        if (abstractC0724lC0 == null) {
            Q0(mVar, c1348c);
            return;
        }
        L l7 = this.f478B;
        l7.getClass();
        N sharedDrawScope = ((C0.A) O.a(l7)).getSharedDrawScope();
        long jD0 = P1.d0(this.f18666s);
        sharedDrawScope.getClass();
        R.e eVar = null;
        while (abstractC0724lC0 != null) {
            if (abstractC0724lC0 instanceof InterfaceC0051p) {
                mVar2 = mVar;
                c1348c2 = c1348c;
                sharedDrawScope.c(mVar2, jD0, this, (InterfaceC0051p) abstractC0724lC0, c1348c2);
            } else {
                mVar2 = mVar;
                c1348c2 = c1348c;
                if ((abstractC0724lC0.f10102s & 4) != 0 && (abstractC0724lC0 instanceof AbstractC0049n)) {
                    int i = 0;
                    for (AbstractC0724l abstractC0724l = ((AbstractC0049n) abstractC0724lC0).f473F; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
                        if ((abstractC0724l.f10102s & 4) != 0) {
                            i++;
                            if (i == 1) {
                                abstractC0724lC0 = abstractC0724l;
                            } else {
                                if (eVar == null) {
                                    eVar = new R.e(new AbstractC0724l[16]);
                                }
                                if (abstractC0724lC0 != null) {
                                    eVar.c(abstractC0724lC0);
                                    abstractC0724lC0 = null;
                                }
                                eVar.c(abstractC0724l);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                mVar = mVar2;
                c1348c = c1348c2;
            }
            abstractC0724lC0 = AbstractC0041g.f(eVar);
            mVar = mVar2;
            c1348c = c1348c2;
        }
    }

    public abstract void v0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final n0 w0(n0 n0Var) {
        L lS = n0Var.f478B;
        L l7 = this.f478B;
        if (lS == l7) {
            AbstractC0724l abstractC0724lB0 = n0Var.B0();
            AbstractC0724l abstractC0724lB02 = B0();
            if (!abstractC0724lB02.f10100q.f10099D) {
                AbstractC1904a.b("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC0724l abstractC0724l = abstractC0724lB02.f10100q.f10104u; abstractC0724l != null; abstractC0724l = abstractC0724l.f10104u) {
                if ((abstractC0724l.f10102s & 2) != 0 && abstractC0724l == abstractC0724lB0) {
                    return n0Var;
                }
            }
            return this;
        }
        while (lS.f253F > l7.f253F) {
            lS = lS.s();
            kotlin.jvm.internal.m.b(lS);
        }
        L lS2 = l7;
        while (lS2.f253F > lS.f253F) {
            lS2 = lS2.s();
            kotlin.jvm.internal.m.b(lS2);
        }
        while (lS != lS2) {
            lS = lS.s();
            lS2 = lS2.s();
            if (lS == null || lS2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (lS2 != l7) {
            if (lS != n0Var.f478B) {
                return lS.f268U.f430b;
            }
            return n0Var;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.u0
    public final boolean x() {
        return (this.f498V == null || this.f481E || !this.f478B.F()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long x0(long j) {
        long j7 = this.f489M;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j7 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j7 >> 32)))) << 32);
        s0 s0Var = this.f498V;
        return s0Var != null ? s0Var.f(true, jFloatToRawIntBits) : jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.e y0() {
        j0 j0Var = this.f495S;
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(0, this, new k0(this, 0));
        this.f495S = j0Var2;
        return j0Var2;
    }

    public abstract U z0();

    @Override // B0.T
    public final InterfaceC1953m d0() {
        return this;
    }
}
