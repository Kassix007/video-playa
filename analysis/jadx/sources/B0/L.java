package B0;

import C0.b1;
import P.C0384v;
import P.InterfaceC0359i;
import P.InterfaceC0386w;
import c0.AbstractC0724l;
import c0.C0719g;
import c0.C0722j;
import c0.InterfaceC0723k;
import c0.InterfaceC0725m;
import java.util.List;
import m0.C1348c;
import y0.AbstractC1904a;
import z0.InterfaceC1926C;

/* JADX INFO: loaded from: classes.dex */
public final class L implements InterfaceC0359i, u0, InterfaceC0046k {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final F f245f0 = new F();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final E f246g0 = new E();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final C f247h0 = new C(0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public R.e f248A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f249B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public L f250C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public t0 f251D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Z0.r f252E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f253F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f254G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f255H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public I0.i f256I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f257J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final R.e f258K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f259L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public InterfaceC1926C f260M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public W0.c f261N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public W0.l f262O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public b1 f263P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public InterfaceC0386w f264Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public I f265R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public I f266S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f267T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final C0042g0 f268U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final P f269V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public z0.y f270W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public n0 f271X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f272Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC0725m f273Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public InterfaceC0725m f274a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Z0.c f275b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Z0.d f276c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f277d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f278e0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f281s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f282t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f283u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f284v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f285w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public L f286x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f287y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0050o f288z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public L(int i) {
        this(I0.j.f2261a.addAndGet(1), (i & 1) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Q(L l7, boolean z5, int i) {
        L lS;
        if ((i & 1) != 0) {
            z5 = false;
        }
        boolean z6 = (i & 2) != 0;
        boolean z7 = (i & 4) != 0;
        if (l7.f286x == null) {
            AbstractC1904a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        t0 t0Var = l7.f251D;
        if (t0Var == null || l7.f254G || l7.f279q) {
            return;
        }
        ((C0.A) t0Var).F(l7, true, z5, z6);
        if (z7) {
            Y y6 = l7.f269V.f312q;
            kotlin.jvm.internal.m.b(y6);
            P p7 = y6.f353v;
            L lS2 = p7.f299a.s();
            I i7 = p7.f299a.f265R;
            if (lS2 == null || i7 == I.f239s) {
                return;
            }
            while (lS2.f265R == i7 && (lS = lS2.s()) != null) {
                lS2 = lS;
            }
            int iOrdinal = i7.ordinal();
            if (iOrdinal == 0) {
                if (lS2.f286x != null) {
                    Q(lS2, z5, 6);
                    return;
                } else {
                    S(lS2, z5, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (lS2.f286x != null) {
                lS2.P(z5);
            } else {
                lS2.R(z5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void S(L l7, boolean z5, int i) {
        t0 t0Var;
        L lS;
        if ((i & 1) != 0) {
            z5 = false;
        }
        boolean z6 = (i & 2) != 0;
        boolean z7 = (i & 4) != 0;
        if (l7.f254G || l7.f279q || (t0Var = l7.f251D) == null) {
            return;
        }
        ((C0.A) t0Var).F(l7, false, z5, z6);
        if (z7) {
            P p7 = l7.f269V.f311p.f400v;
            L lS2 = p7.f299a.s();
            I i7 = p7.f299a.f265R;
            if (lS2 == null || i7 == I.f239s) {
                return;
            }
            while (lS2.f265R == i7 && (lS = lS2.s()) != null) {
                lS2 = lS;
            }
            int iOrdinal = i7.ordinal();
            if (iOrdinal == 0) {
                S(lS2, z5, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                lS2.R(z5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void T(L l7) {
        P p7 = l7.f269V;
        if (J.f241a[p7.f302d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + p7.f302d);
        }
        if (p7.f303e) {
            Q(l7, true, 6);
            return;
        }
        if (p7.f) {
            l7.P(true);
        }
        if (l7.q()) {
            S(l7, true, 6);
        } else if (l7.p()) {
            l7.R(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String k(L l7) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(l7);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(h(0));
        sb.append(" Other tree: ");
        L l8 = l7.f250C;
        sb.append(l8 != null ? l8.h(0) : null);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A() {
        if (this.f272Y) {
            C0042g0 c0042g0 = this.f268U;
            n0 n0Var = c0042g0.f430b;
            n0 n0Var2 = c0042g0.f431c.f480D;
            this.f271X = null;
            while (true) {
                if (kotlin.jvm.internal.m.a(n0Var, n0Var2)) {
                    break;
                }
                if ((n0Var != null ? n0Var.f498V : null) != null) {
                    this.f271X = n0Var;
                    break;
                }
                n0Var = n0Var != null ? n0Var.f480D : null;
            }
        }
        n0 n0Var3 = this.f271X;
        if (n0Var3 != null && n0Var3.f498V == null) {
            throw C0.S.i("layer was not set");
        }
        if (n0Var3 != null) {
            n0Var3.I0();
            return;
        }
        L lS = s();
        if (lS != null) {
            lS.A();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B() {
        C0042g0 c0042g0 = this.f268U;
        C0056v c0056v = c0042g0.f430b;
        for (n0 n0Var = c0042g0.f431c; n0Var != c0056v; n0Var = n0Var.f479C) {
            kotlin.jvm.internal.m.c(n0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            s0 s0Var = ((B) n0Var).f498V;
            if (s0Var != null) {
                s0Var.invalidate();
            }
        }
        s0 s0Var2 = c0042g0.f430b.f498V;
        if (s0Var2 != null) {
            s0Var2.invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C() {
        this.f284v = true;
        if (this.f286x != null) {
            Q(this, false, 7);
        } else {
            S(this, false, 7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D() {
        if (this.f257J) {
            return;
        }
        this.f268U.getClass();
        if (i0.f443a.f10105v != null || this.f274a0 != null) {
            this.f255H = true;
            return;
        }
        I0.i iVar = this.f256I;
        this.f257J = true;
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f14268q = new I0.i();
        v0 snapshotObserver = ((C0.A) O.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f522d, new K(0, this, yVar));
        this.f257J = false;
        this.f256I = (I0.i) yVar.f14268q;
        this.f255H = false;
        C0.A a7 = (C0.A) O.a(this);
        a7.getSemanticsOwner().b(this, iVar);
        a7.H();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E() {
        L l7;
        if (this.f287y > 0) {
            this.f249B = true;
        }
        if (!this.f279q || (l7 = this.f250C) == null) {
            return;
        }
        l7.E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean F() {
        return this.f251D != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean G() {
        return this.f269V.f311p.f381H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Boolean H() {
        Y y6 = this.f269V.f312q;
        if (y6 != null) {
            return Boolean.valueOf(y6.A());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I() {
        L lS;
        if (this.f265R == I.f239s) {
            d();
        }
        Y y6 = this.f269V.f312q;
        kotlin.jvm.internal.m.b(y6);
        try {
            y6.f354w = true;
            if (!y6.f340A) {
                AbstractC1904a.b("replace() called on item that was not placed");
            }
            y6.f352M = false;
            boolean zA = y6.A();
            y6.d0(y6.f343D, y6.f344E);
            if (zA && !y6.f352M && (lS = y6.f353v.f299a.s()) != null) {
                lS.P(false);
            }
            y6.f354w = false;
        } catch (Throwable th) {
            y6.f354w = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(int i, int i7, int i8) {
        if (i == i7) {
            return;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = i > i7 ? i + i9 : i;
            int i11 = i > i7 ? i7 + i9 : (i7 + i8) - 2;
            C0050o c0050o = this.f288z;
            R.e eVar = (R.e) c0050o.f499q;
            A0.d dVar = (A0.d) c0050o.f500r;
            Object objM = eVar.m(i10);
            dVar.invoke();
            ((R.e) c0050o.f499q).b(i11, (L) objM);
            dVar.invoke();
        }
        L();
        E();
        C();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K(L l7) {
        if (l7.f269V.f307l > 0) {
            this.f269V.b(r0.f307l - 1);
        }
        if (this.f251D != null) {
            l7.i();
        }
        l7.f250C = null;
        l7.f268U.f431c.f480D = null;
        if (l7.f279q) {
            this.f287y--;
            R.e eVar = (R.e) l7.f288z.f499q;
            Object[] objArr = eVar.f6676q;
            int i = eVar.f6678s;
            for (int i7 = 0; i7 < i; i7++) {
                ((L) objArr[i7]).f268U.f431c.f480D = null;
            }
        }
        E();
        L();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L() {
        if (!this.f279q) {
            this.f259L = true;
            return;
        }
        L lS = s();
        if (lS != null) {
            lS.L();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
    public final void M() {
        C0050o c0050o = this.f288z;
        R.e eVar = (R.e) c0050o.f499q;
        R.e eVar2 = (R.e) c0050o.f499q;
        int i = eVar.f6678s;
        while (true) {
            i--;
            if (-1 >= i) {
                eVar2.i();
                ((A0.d) c0050o.f500r).invoke();
                return;
            }
            K((L) eVar2.f6676q[i]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N(int i, int i7) {
        if (i7 < 0) {
            AbstractC1904a.a("count (" + i7 + ") must be greater than 0");
        }
        int i8 = (i7 + i) - 1;
        if (i > i8) {
            return;
        }
        while (true) {
            C0050o c0050o = this.f288z;
            K((L) ((R.e) c0050o.f499q).f6676q[i8]);
            Object objM = ((R.e) c0050o.f499q).m(i8);
            ((A0.d) c0050o.f500r).invoke();
            if (i8 == i) {
                return;
            } else {
                i8--;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void O() {
        L lS;
        if (this.f265R == I.f239s) {
            d();
        }
        C0034c0 c0034c0 = this.f269V.f311p;
        c0034c0.getClass();
        try {
            c0034c0.f401w = true;
            if (!c0034c0.f374A) {
                AbstractC1904a.b("replace called on unplaced item");
            }
            boolean z5 = c0034c0.f381H;
            c0034c0.e0(c0034c0.f376C, c0034c0.f378E, c0034c0.f377D);
            if (z5 && !c0034c0.f394U && (lS = c0034c0.f400v.f299a.s()) != null) {
                lS.R(false);
            }
            c0034c0.f401w = false;
        } catch (Throwable th) {
            c0034c0.f401w = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P(boolean z5) {
        t0 t0Var;
        if (this.f279q || (t0Var = this.f251D) == null) {
            return;
        }
        ((C0.A) t0Var).G(this, true, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(boolean z5) {
        t0 t0Var;
        this.f284v = true;
        if (this.f279q || (t0Var = this.f251D) == null) {
            return;
        }
        ((C0.A) t0Var).G(this, false, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U() {
        R.e eVarW = w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l7 = (L) objArr[i7];
            I i8 = l7.f266S;
            l7.f265R = i8;
            if (i8 != I.f239s) {
                l7.U();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(W0.c cVar) {
        if (kotlin.jvm.internal.m.a(this.f261N, cVar)) {
            return;
        }
        this.f261N = cVar;
        C();
        L lS = s();
        if (lS != null) {
            lS.A();
        }
        B();
        for (AbstractC0724l abstractC0724l = this.f268U.f433e; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
            abstractC0724l.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W(L l7) {
        if (kotlin.jvm.internal.m.a(l7, this.f286x)) {
            return;
        }
        this.f286x = l7;
        P p7 = this.f269V;
        if (l7 != null) {
            if (p7.f312q == null) {
                p7.f312q = new Y(p7);
            }
            C0042g0 c0042g0 = this.f268U;
            n0 n0Var = c0042g0.f430b.f479C;
            for (n0 n0Var2 = c0042g0.f431c; !kotlin.jvm.internal.m.a(n0Var2, n0Var) && n0Var2 != null; n0Var2 = n0Var2.f479C) {
                n0Var2.v0();
            }
        } else {
            p7.f312q = null;
        }
        C();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X(InterfaceC1926C interfaceC1926C) {
        if (kotlin.jvm.internal.m.a(this.f260M, interfaceC1926C)) {
            return;
        }
        this.f260M = interfaceC1926C;
        C();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Y(InterfaceC0725m interfaceC0725m) {
        if (this.f279q && this.f273Z != C0722j.f10095q) {
            AbstractC1904a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f278e0) {
            AbstractC1904a.a("modifier is updated when deactivated");
        }
        if (!F()) {
            this.f274a0 = interfaceC0725m;
            return;
        }
        a(interfaceC0725m);
        if (this.f255H) {
            D();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0051 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x0060 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x001f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x001f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x005a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void Z(b1 b1Var) {
        if (kotlin.jvm.internal.m.a(this.f263P, b1Var)) {
            return;
        }
        this.f263P = b1Var;
        AbstractC0724l abstractC0724l = this.f268U.f433e;
        if ((abstractC0724l.f10103t & 16) != 0) {
            while (abstractC0724l != null) {
                if ((abstractC0724l.f10102s & 16) != 0) {
                    ?? F6 = abstractC0724l;
                    ?? eVar = 0;
                    while (F6 != 0) {
                        if (F6 instanceof y0) {
                            ((y0) F6).S();
                        } else if ((F6.f10102s & 16) != 0 && (F6 instanceof AbstractC0049n)) {
                            AbstractC0724l abstractC0724l2 = ((AbstractC0049n) F6).f473F;
                            int i = 0;
                            F6 = F6;
                            eVar = eVar;
                            while (abstractC0724l2 != null) {
                                if ((abstractC0724l2.f10102s & 16) != 0) {
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
                if ((abstractC0724l.f10103t & 16) == 0) {
                    return;
                } else {
                    abstractC0724l = abstractC0724l.f10105v;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(InterfaceC0725m interfaceC0725m) {
        C0042g0 c0042g0;
        R.e eVar;
        boolean z5;
        this.f273Z = interfaceC0725m;
        C0042g0 c0042g02 = this.f268U;
        C0056v c0056v = c0042g02.f430b;
        AbstractC0724l abstractC0724l = c0042g02.f432d;
        L l7 = c0042g02.f429a;
        AbstractC0724l abstractC0724l2 = c0042g02.f433e;
        AbstractC0724l abstractC0724lB = i0.f443a;
        if (abstractC0724l2 == abstractC0724lB) {
            AbstractC1904a.b("padChain called on already padded chain");
        }
        AbstractC0724l abstractC0724l3 = c0042g02.f433e;
        abstractC0724l3.f10104u = abstractC0724lB;
        abstractC0724lB.f10105v = abstractC0724l3;
        R.e eVar2 = c0042g02.f;
        int i = eVar2 != null ? eVar2.f6678s : 0;
        R.e eVar3 = c0042g02.f434g;
        if (eVar3 == null) {
            eVar3 = new R.e(new InterfaceC0723k[16]);
        }
        int i7 = eVar3.f6678s;
        if (i7 < 16) {
            i7 = 16;
        }
        R.e eVar4 = new R.e(new InterfaceC0725m[i7]);
        eVar4.c(interfaceC0725m);
        C0029a c0029a = null;
        while (true) {
            int i8 = eVar4.f6678s;
            if (i8 == 0) {
                break;
            }
            InterfaceC0725m interfaceC0725m2 = (InterfaceC0725m) eVar4.m(i8 - 1);
            if (interfaceC0725m2 instanceof C0719g) {
                C0719g c0719g = (C0719g) interfaceC0725m2;
                eVar4.c(c0719g.f10092r);
                eVar4.c(c0719g.f10091q);
            } else if (interfaceC0725m2 instanceof InterfaceC0723k) {
                eVar3.c(interfaceC0725m2);
            } else {
                if (c0029a == null) {
                    c0029a = new C0029a(1, eVar3);
                }
                interfaceC0725m2.a(c0029a);
                c0029a = c0029a;
            }
        }
        int i9 = eVar3.f6678s;
        if (i9 == i) {
            AbstractC0724l abstractC0724l4 = abstractC0724lB.f10105v;
            int i10 = 0;
            while (true) {
                if (abstractC0724l4 == null || i10 >= i) {
                    break;
                }
                if (eVar2 == null) {
                    throw C0.S.i("expected prior modifier list to be non-empty");
                }
                InterfaceC0723k interfaceC0723k = (InterfaceC0723k) eVar2.f6676q[i10];
                InterfaceC0723k interfaceC0723k2 = (InterfaceC0723k) eVar3.f6676q[i10];
                char c7 = kotlin.jvm.internal.m.a(interfaceC0723k, interfaceC0723k2) ? (char) 2 : interfaceC0723k.getClass() == interfaceC0723k2.getClass() ? (char) 1 : (char) 0;
                if (c7 == 0) {
                    abstractC0724l4 = abstractC0724l4.f10104u;
                    break;
                }
                if (c7 == 1) {
                    C0042g0.i(interfaceC0723k, interfaceC0723k2, abstractC0724l4);
                }
                abstractC0724l4 = abstractC0724l4.f10105v;
                i10++;
            }
            if (i10 >= i) {
                c0042g02 = c0042g02;
                c0042g0 = c0042g02;
                eVar = eVar3;
                z5 = false;
            } else {
                if (eVar2 == null) {
                    throw C0.S.i("expected prior modifier list to be non-empty");
                }
                if (abstractC0724l4 == null) {
                    throw C0.S.i("structuralUpdate requires a non-null tail");
                }
                boolean z6 = l7.f274a0 != null;
                AbstractC0724l abstractC0724l5 = abstractC0724l4;
                c0042g0 = c0042g02;
                eVar = eVar3;
                c0042g0.g(i10, eVar2, eVar, abstractC0724l5, !z6);
                z5 = true;
            }
        } else {
            InterfaceC0725m interfaceC0725m3 = l7.f274a0;
            if (interfaceC0725m3 != null && i == 0) {
                for (int i11 = 0; i11 < eVar3.f6678s; i11++) {
                    abstractC0724lB = C0042g0.b((InterfaceC0723k) eVar3.f6676q[i11], abstractC0724lB);
                }
                int i12 = 0;
                for (AbstractC0724l abstractC0724l6 = abstractC0724l.f10104u; abstractC0724l6 != null && abstractC0724l6 != i0.f443a; abstractC0724l6 = abstractC0724l6.f10104u) {
                    i12 |= abstractC0724l6.f10102s;
                    abstractC0724l6.f10103t = i12;
                }
                c0042g0 = c0042g02;
                eVar = eVar3;
            } else if (i9 != 0) {
                if (eVar2 == null) {
                    eVar2 = new R.e(new InterfaceC0723k[16]);
                }
                c0042g0 = c0042g02;
                eVar = eVar3;
                c0042g0.g(0, eVar2, eVar, abstractC0724lB, !(interfaceC0725m3 != null));
            } else {
                if (eVar2 == null) {
                    throw C0.S.i("expected prior modifier list to be non-empty");
                }
                AbstractC0724l abstractC0724l7 = abstractC0724lB.f10105v;
                for (int i13 = 0; abstractC0724l7 != null && i13 < eVar2.f6678s; i13++) {
                    abstractC0724l7 = C0042g0.c(abstractC0724l7).f10105v;
                }
                L lS = l7.s();
                c0056v.f480D = lS != null ? lS.f268U.f430b : null;
                c0042g02.f431c = c0056v;
                c0042g0 = c0042g02;
                eVar = eVar3;
                z5 = false;
            }
            z5 = true;
        }
        c0042g0.f = eVar;
        if (eVar2 != null) {
            eVar2.i();
        } else {
            eVar2 = null;
        }
        c0042g0.f434g = eVar2;
        h0 h0Var = i0.f443a;
        AbstractC0724l abstractC0724l8 = h0Var.f10105v;
        if (abstractC0724l8 != null) {
            abstractC0724l = abstractC0724l8;
        }
        abstractC0724l.f10104u = null;
        h0Var.f10105v = null;
        h0Var.f10103t = -1;
        h0Var.f10107x = null;
        if (abstractC0724l == h0Var) {
            AbstractC1904a.b("trimChain did not update the head");
        }
        c0042g0.f433e = abstractC0724l;
        if (z5) {
            c0042g0.h();
        }
        this.f269V.h();
        if (this.f286x == null && c0042g0.d(512)) {
            W(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a0() {
        if (this.f287y <= 0 || !this.f249B) {
            return;
        }
        this.f249B = false;
        R.e eVar = this.f248A;
        if (eVar == null) {
            eVar = new R.e(new L[16]);
            this.f248A = eVar;
        }
        eVar.i();
        R.e eVar2 = (R.e) this.f288z.f499q;
        Object[] objArr = eVar2.f6676q;
        int i = eVar2.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l7 = (L) objArr[i7];
            if (l7.f279q) {
                eVar.d(eVar.f6678s, l7.w());
            } else {
                eVar.c(l7);
            }
        }
        P p7 = this.f269V;
        p7.f311p.f388O = true;
        Y y6 = p7.f312q;
        if (y6 != null) {
            y6.f348I = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(t0 t0Var) {
        L l7;
        d0.b bVar;
        I0.i iVarU;
        if (this.f251D != null) {
            AbstractC1904a.b("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
        }
        L l8 = this.f250C;
        if (l8 != null && !kotlin.jvm.internal.m.a(l8.f251D, t0Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(t0Var);
            sb.append(") than the parent's owner(");
            L lS = s();
            sb.append(lS != null ? lS.f251D : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            L l9 = this.f250C;
            sb.append(l9 != null ? l9.h(0) : null);
            AbstractC1904a.b(sb.toString());
        }
        L lS2 = s();
        P p7 = this.f269V;
        if (lS2 == null) {
            p7.f311p.f381H = true;
            Y y6 = p7.f312q;
            if (y6 != null) {
                y6.f345F = V.f331q;
            }
        }
        C0042g0 c0042g0 = this.f268U;
        c0042g0.f431c.f480D = lS2 != null ? lS2.f268U.f430b : null;
        this.f251D = t0Var;
        this.f253F = (lS2 != null ? lS2.f253F : -1) + 1;
        InterfaceC0725m interfaceC0725m = this.f274a0;
        if (interfaceC0725m != null) {
            a(interfaceC0725m);
        }
        this.f274a0 = null;
        C0.A a7 = (C0.A) t0Var;
        a7.getLayoutNodes().h(this.f280r, this);
        L l10 = this.f250C;
        if (l10 == null || (l7 = l10.f286x) == null) {
            l7 = this.f286x;
        }
        W(l7);
        if (this.f286x == null && c0042g0.d(512)) {
            W(this);
        }
        if (!this.f278e0) {
            for (AbstractC0724l abstractC0724l = c0042g0.f433e; abstractC0724l != null; abstractC0724l = abstractC0724l.f10105v) {
                abstractC0724l.n0();
            }
        }
        R.e eVar = (R.e) this.f288z.f499q;
        Object[] objArr = eVar.f6676q;
        int i = eVar.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            ((L) objArr[i7]).b(t0Var);
        }
        if (!this.f278e0) {
            c0042g0.e();
        }
        C();
        if (lS2 != null) {
            lS2.C();
        }
        n0 n0Var = c0042g0.f430b.f479C;
        for (n0 n0Var2 = c0042g0.f431c; !kotlin.jvm.internal.m.a(n0Var2, n0Var) && n0Var2 != null; n0Var2 = n0Var2.f479C) {
            n0Var2.U0(n0Var2.f483G, true);
            s0 s0Var = n0Var2.f498V;
            if (s0Var != null) {
                s0Var.invalidate();
            }
        }
        Z0.c cVar = this.f275b0;
        if (cVar != null) {
            cVar.invoke(t0Var);
        }
        p7.h();
        if (!this.f278e0 && c0042g0.d(8)) {
            D();
        }
        a7.getClass();
        if (!C0.A.l() || (bVar = a7.f738S) == null || (iVarU = u()) == null || !iVarU.f2257q.b(I0.p.f2314p)) {
            return;
        }
        bVar.f11790g.a(this.f280r);
        bVar.f11785a.y(bVar.f11787c, this.f280r, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        this.f266S = this.f265R;
        this.f265R = I.f239s;
        R.e eVarW = w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l7 = (L) objArr[i7];
            if (l7.f265R != I.f239s) {
                l7.c();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        this.f266S = this.f265R;
        this.f265R = I.f239s;
        R.e eVarW = w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l7 = (L) objArr[i7];
            if (l7.f265R == I.f238r) {
                l7.d();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0359i
    public final void e() {
        d0.b bVar;
        if (!F()) {
            AbstractC1904a.a("onReuse is only expected on attached node");
        }
        Z0.r rVar = this.f252E;
        if (rVar != null) {
            rVar.e();
        }
        z0.y yVar = this.f270W;
        if (yVar != null) {
            yVar.c(false);
        }
        this.f257J = false;
        boolean z5 = this.f278e0;
        C0042g0 c0042g0 = this.f268U;
        if (z5) {
            this.f278e0 = false;
        } else {
            for (AbstractC0724l abstractC0724l = c0042g0.f432d; abstractC0724l != null; abstractC0724l = abstractC0724l.f10104u) {
                if (abstractC0724l.f10099D) {
                    abstractC0724l.s0();
                }
            }
            c0042g0.f();
            for (AbstractC0724l abstractC0724l2 = c0042g0.f432d; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10104u) {
                if (abstractC0724l2.f10099D) {
                    abstractC0724l2.o0();
                }
            }
        }
        int i = this.f280r;
        this.f280r = I0.j.f2261a.addAndGet(1);
        t0 t0Var = this.f251D;
        if (t0Var != null) {
            C0.A a7 = (C0.A) t0Var;
            a7.getLayoutNodes().g(i);
            a7.getLayoutNodes().h(this.f280r, this);
        }
        for (AbstractC0724l abstractC0724l3 = c0042g0.f433e; abstractC0724l3 != null; abstractC0724l3 = abstractC0724l3.f10105v) {
            abstractC0724l3.n0();
        }
        c0042g0.e();
        if (c0042g0.d(8)) {
            D();
        }
        T(this);
        t0 t0Var2 = this.f251D;
        if (t0Var2 != null) {
            C0.A a8 = (C0.A) t0Var2;
            if (C0.A.l() && (bVar = a8.f738S) != null) {
                C0.A a9 = bVar.f11787c;
                k3.d dVar = bVar.f11785a;
                r.w wVar = bVar.f11790g;
                if (wVar.e(i)) {
                    dVar.y(a9, i, false);
                }
                I0.i iVarU = u();
                if (iVarU != null && iVarU.f2257q.b(I0.p.f2314p)) {
                    wVar.a(this.f280r);
                    dVar.y(a9, this.f280r, true);
                }
            }
            a8.getRectManager().f(this, this.f269V.f311p.f376C, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0359i
    public final void f() {
        Z0.r rVar = this.f252E;
        if (rVar != null) {
            rVar.f();
        }
        z0.y yVar = this.f270W;
        if (yVar != null) {
            yVar.f();
        }
        C0042g0 c0042g0 = this.f268U;
        n0 n0Var = c0042g0.f430b.f479C;
        for (n0 n0Var2 = c0042g0.f431c; !kotlin.jvm.internal.m.a(n0Var2, n0Var) && n0Var2 != null; n0Var2 = n0Var2.f479C) {
            n0Var2.f481E = true;
            n0Var2.f496T.invoke();
            if (n0Var2.f498V != null) {
                n0Var2.U0(null, false);
                n0Var2.f478B.R(false);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0359i
    public final void g() {
        d0.b bVar;
        Z0.r rVar = this.f252E;
        if (rVar != null) {
            rVar.g();
        }
        z0.y yVar = this.f270W;
        if (yVar != null) {
            yVar.c(true);
        }
        this.f278e0 = true;
        C0042g0 c0042g0 = this.f268U;
        for (AbstractC0724l abstractC0724l = c0042g0.f432d; abstractC0724l != null; abstractC0724l = abstractC0724l.f10104u) {
            if (abstractC0724l.f10099D) {
                abstractC0724l.s0();
            }
        }
        c0042g0.f();
        for (AbstractC0724l abstractC0724l2 = c0042g0.f432d; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10104u) {
            if (abstractC0724l2.f10099D) {
                abstractC0724l2.o0();
            }
        }
        if (F()) {
            this.f256I = null;
            this.f255H = false;
        }
        t0 t0Var = this.f251D;
        if (t0Var != null) {
            C0.A a7 = (C0.A) t0Var;
            a7.getRectManager().h(this);
            if (C0.A.l() && (bVar = a7.f738S) != null && bVar.f11790g.e(this.f280r)) {
                bVar.f11785a.y(bVar.f11787c, this.f280r, false);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String h(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < i; i7++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        R.e eVarW = w();
        Object[] objArr = eVarW.f6676q;
        int i8 = eVarW.f6678s;
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append(((L) objArr[i9]).h(i + 1));
        }
        String string = sb.toString();
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        d0.b bVar;
        M m4;
        t0 t0Var = this.f251D;
        if (t0Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            L lS = s();
            sb.append(lS != null ? lS.h(0) : null);
            AbstractC1904a.c(sb.toString());
            throw new C2.e();
        }
        L lS2 = s();
        P p7 = this.f269V;
        if (lS2 != null) {
            lS2.A();
            lS2.C();
            C0034c0 c0034c0 = p7.f311p;
            I i = I.f239s;
            c0034c0.f375B = i;
            Y y6 = p7.f312q;
            if (y6 != null) {
                y6.f357z = i;
            }
        }
        M m7 = p7.f311p.f386M;
        m7.f290b = true;
        m7.f291c = false;
        m7.f292d = false;
        m7.f293e = false;
        m7.f = null;
        Y y7 = p7.f312q;
        if (y7 != null && (m4 = y7.f346G) != null) {
            m4.f290b = true;
            m4.f291c = false;
            m4.f292d = false;
            m4.f293e = false;
            m4.f = null;
        }
        Z0.d dVar = this.f276c0;
        if (dVar != null) {
            dVar.invoke(t0Var);
        }
        C0042g0 c0042g0 = this.f268U;
        c0042g0.f();
        this.f254G = true;
        R.e eVar = (R.e) this.f288z.f499q;
        Object[] objArr = eVar.f6676q;
        int i7 = eVar.f6678s;
        for (int i8 = 0; i8 < i7; i8++) {
            ((L) objArr[i8]).i();
        }
        this.f254G = false;
        for (AbstractC0724l abstractC0724l = c0042g0.f432d; abstractC0724l != null; abstractC0724l = abstractC0724l.f10104u) {
            if (abstractC0724l.f10099D) {
                abstractC0724l.o0();
            }
        }
        C0.A a7 = (C0.A) t0Var;
        a7.getLayoutNodes().g(this.f280r);
        C0030a0 c0030a0 = a7.f748f0;
        C0050o c0050o = c0030a0.f364b;
        ((k3.d) c0050o.f499q).z(this);
        ((k3.d) c0050o.f500r).z(this);
        ((R.e) c0030a0.f367e.f499q).l(this);
        a7.f739T = true;
        a7.getRectManager().h(this);
        if (C0.A.l() && (bVar = a7.f738S) != null && bVar.f11790g.e(this.f280r)) {
            bVar.f11785a.y(bVar.f11787c, this.f280r, false);
        }
        this.f251D = null;
        W(null);
        this.f253F = 0;
        C0034c0 c0034c02 = p7.f311p;
        c0034c02.f403y = Integer.MAX_VALUE;
        c0034c02.f402x = Integer.MAX_VALUE;
        c0034c02.f381H = false;
        Y y8 = p7.f312q;
        if (y8 != null) {
            y8.f356y = Integer.MAX_VALUE;
            y8.f355x = Integer.MAX_VALUE;
            y8.f345F = V.f333s;
        }
        if (c0042g0.d(8)) {
            I0.i iVar = this.f256I;
            this.f256I = null;
            this.f255H = false;
            a7.getSemanticsOwner().b(this, iVar);
            a7.H();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(j0.m mVar, C1348c c1348c) {
        this.f268U.f431c.t0(mVar, c1348c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        if (this.f286x != null) {
            Q(this, false, 5);
        } else {
            S(this, false, 5);
        }
        C0034c0 c0034c0 = this.f269V.f311p;
        W0.a aVar = c0034c0.f404z ? new W0.a(c0034c0.f18667t) : null;
        if (aVar != null) {
            t0 t0Var = this.f251D;
            if (t0Var != null) {
                ((C0.A) t0Var).A(this, aVar.f8007a);
                return;
            }
            return;
        }
        t0 t0Var2 = this.f251D;
        if (t0Var2 != null) {
            ((C0.A) t0Var2).z(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List m() {
        Y y6 = this.f269V.f312q;
        kotlin.jvm.internal.m.b(y6);
        R.e eVar = y6.f347H;
        P p7 = y6.f353v;
        p7.f299a.n();
        if (!y6.f348I) {
            return eVar.h();
        }
        L l7 = p7.f299a;
        R.e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l8 = (L) objArr[i7];
            if (eVar.f6678s <= i7) {
                Y y7 = l8.f269V.f312q;
                kotlin.jvm.internal.m.b(y7);
                eVar.c(y7);
            } else {
                Y y8 = l8.f269V.f312q;
                kotlin.jvm.internal.m.b(y8);
                Object[] objArr2 = eVar.f6676q;
                Object obj = objArr2[i7];
                objArr2[i7] = y8;
            }
        }
        eVar.o(((R.b) l7.n()).f6670q.f6678s, eVar.f6678s);
        y6.f348I = false;
        return eVar.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List n() {
        return w().h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List o() {
        return ((R.e) this.f288z.f499q).h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p() {
        return this.f269V.f311p.f384K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean q() {
        return this.f269V.f311p.f383J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final I r() {
        I i;
        Y y6 = this.f269V.f312q;
        return (y6 == null || (i = y6.f357z) == null) ? I.f239s : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final L s() {
        L l7 = this.f250C;
        while (l7 != null && l7.f279q) {
            l7 = l7.f250C;
        }
        return l7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int t() {
        return this.f269V.f311p.f403y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return C0.W.q(this) + " children: " + ((R.b) n()).f6670q.f6678s + " measurePolicy: " + this.f260M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final I0.i u() {
        if (F() && !this.f278e0 && this.f268U.d(8)) {
            return this.f256I;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final R.e v() {
        boolean z5 = this.f259L;
        R.e eVar = this.f258K;
        if (z5) {
            eVar.i();
            eVar.d(eVar.f6678s, w());
            eVar.q(f247h0);
            this.f259L = false;
        }
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final R.e w() {
        a0();
        if (this.f287y == 0) {
            return (R.e) this.f288z.f499q;
        }
        R.e eVar = this.f248A;
        kotlin.jvm.internal.m.b(eVar);
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.u0
    public final boolean x() {
        return F();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(long j, C0054t c0054t, int i, boolean z5) {
        C0042g0 c0042g0 = this.f268U;
        n0 n0Var = c0042g0.f431c;
        j0.C c7 = n0.f474W;
        c0042g0.f431c.G0(n0.f476Y, n0Var.x0(j), c0054t, i, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(int i, L l7) {
        if (l7.f250C != null && l7.f251D != null) {
            AbstractC1904a.b(k(l7));
        }
        l7.f250C = this;
        C0050o c0050o = this.f288z;
        ((R.e) c0050o.f499q).b(i, l7);
        ((A0.d) c0050o.f500r).invoke();
        L();
        if (l7.f279q) {
            this.f287y++;
        }
        E();
        t0 t0Var = this.f251D;
        if (t0Var != null) {
            l7.b(t0Var);
        }
        if (l7.f269V.f307l > 0) {
            P p7 = this.f269V;
            p7.b(p7.f307l + 1);
        }
    }

    public L(int i, boolean z5) {
        this.f279q = z5;
        this.f280r = i;
        this.f281s = 9223372034707292159L;
        this.f282t = 0L;
        this.f283u = 9223372034707292159L;
        this.f284v = true;
        this.f288z = new C0050o(new R.e(new L[16]), new A0.d(1, this));
        this.f258K = new R.e(new L[16]);
        this.f259L = true;
        this.f260M = f245f0;
        this.f261N = O.f298a;
        this.f262O = W0.l.f8022q;
        this.f263P = f246g0;
        InterfaceC0386w.f5574c.getClass();
        this.f264Q = C0384v.f5551b;
        I i7 = I.f239s;
        this.f265R = i7;
        this.f266S = i7;
        this.f268U = new C0042g0(this);
        this.f269V = new P(this);
        this.f272Y = true;
        this.f273Z = C0722j.f10095q;
    }
}
