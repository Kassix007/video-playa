package u;

import M5.C0247h;
import P.C0345b;
import P.C0346b0;
import P.C0354f0;
import m5.C1386y;
import r.C1544C;
import r5.EnumC1580a;

/* JADX INFO: renamed from: u.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1645d0 extends O3.D0 {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C1659m f16897I = new C1659m(0.0f);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final C1659m f16898J = new C1659m(1.0f);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public S f16903E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f16905G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0354f0 f16907s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0354f0 f16908t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f16909u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v0 f16910v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f16911w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0247h f16914z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final A0.d f16912x = new A0.d(26, this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0346b0 f16913y = new C0346b0(0.0f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final U5.c f16899A = new U5.c();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1636O f16900B = new C1636O();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f16901C = Long.MIN_VALUE;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C1544C f16902D = new C1544C();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final T f16904F = new T(this, 1);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final T f16906H = new T(this, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1645d0(T1.d dVar) {
        this.f16907s = C0345b.q(dVar);
        this.f16908t = C0345b.q(dVar);
        this.f16909u = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void p(C1645d0 c1645d0) {
        v0 v0Var = c1645d0.f16910v;
        C0346b0 c0346b0 = c1645d0.f16913y;
        if (v0Var == null) {
            return;
        }
        S s6 = c1645d0.f16903E;
        if (s6 == null) {
            if (c1645d0.f16911w <= 0 || c0346b0.e() == 1.0f || kotlin.jvm.internal.m.a(c1645d0.f16908t.getValue(), c1645d0.f16907s.getValue())) {
                s6 = null;
            } else {
                s6 = new S();
                s6.f16824d = c0346b0.e();
                long j = c1645d0.f16911w;
                s6.f16826g = j;
                s6.f16827h = D5.a.H((1.0d - ((double) c0346b0.e())) * j);
                s6.f16825e.e(0, c0346b0.e());
            }
        }
        if (s6 != null) {
            s6.f16826g = c1645d0.f16911w;
            c1645d0.f16902D.a(s6);
            v0Var.m(s6);
        }
        c1645d0.f16903E = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void q(C1645d0 c1645d0, S s6, long j) {
        long j7 = s6.f16821a + j;
        s6.f16821a = j7;
        long j8 = s6.f16827h;
        if (j7 >= j8) {
            s6.f16824d = 1.0f;
            return;
        }
        E0 e02 = s6.f16822b;
        if (e02 == null) {
            float f = j7 / j8;
            s6.f16824d = (f * 1.0f) + ((1 - f) * s6.f16825e.a(0));
            return;
        }
        C1659m c1659m = s6.f16825e;
        C1659m c1659m2 = s6.f;
        if (c1659m2 == null) {
            c1659m2 = f16897I;
        }
        s6.f16824d = D5.a.p(((C1659m) e02.g(j7, c1659m, f16898J, c1659m2)).a(0), 0.0f, 1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(u.C1645d0 r10, s5.c r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof u.W
            if (r0 == 0) goto L16
            r0 = r11
            u.W r0 = (u.W) r0
            int r1 = r0.f16843t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f16843t = r1
            goto L1b
        L16:
            u.W r0 = new u.W
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.f16841r
            int r1 = r0.f16843t
            r2 = 2
            r3 = 1
            r4 = -9223372036854775808
            m5.y r6 = m5.C1386y.f15098a
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            goto L36
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            u.d0 r10 = r0.f16840q
            m5.AbstractC1362a.e(r11)
            goto L7a
        L3c:
            m5.AbstractC1362a.e(r11)
            r.C r11 = r10.f16902D
            boolean r11 = r11.g()
            if (r11 == 0) goto L4c
            u.S r11 = r10.f16903E
            if (r11 != 0) goto L4c
            return r6
        L4c:
            q5.h r11 = r0.getContext()
            float r11 = u.AbstractC1644d.m(r11)
            r1 = 0
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 != 0) goto L5f
            r10.v()
            r10.f16901C = r4
            return r6
        L5f:
            long r8 = r10.f16901C
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 != 0) goto L7a
            u.T r11 = r10.f16904F
            r0.f16840q = r10
            r0.f16843t = r3
            q5.h r1 = r0.getContext()
            P.T r1 = P.C0345b.o(r1)
            java.lang.Object r11 = r1.e(r11, r0)
            if (r11 != r7) goto L7a
            goto L94
        L7a:
            r.C r11 = r10.f16902D
            boolean r11 = r11.h()
            if (r11 != 0) goto L8a
            u.S r11 = r10.f16903E
            if (r11 == 0) goto L87
            goto L8a
        L87:
            r10.f16901C = r4
            return r6
        L8a:
            r0.f16840q = r10
            r0.f16843t = r2
            java.lang.Object r11 = r10.u(r0)
            if (r11 != r7) goto L7a
        L94:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1645d0.r(u.d0, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(u.C1645d0 r6, s5.c r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof u.C1641b0
            if (r0 == 0) goto L16
            r0 = r7
            u.b0 r0 = (u.C1641b0) r0
            int r1 = r0.f16876u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f16876u = r1
            goto L1b
        L16:
            u.b0 r0 = new u.b0
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f16874s
            int r1 = r0.f16876u
            r2 = 2
            r3 = 1
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L43
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.f16873r
            u.d0 r0 = r0.f16872q
            m5.AbstractC1362a.e(r7)
            goto L80
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            java.lang.Object r6 = r0.f16873r
            u.d0 r1 = r0.f16872q
            m5.AbstractC1362a.e(r7)
            r7 = r6
            r6 = r1
            goto L5b
        L43:
            m5.AbstractC1362a.e(r7)
            P.f0 r7 = r6.f16907s
            java.lang.Object r7 = r7.getValue()
            U5.c r1 = r6.f16899A
            r0.f16872q = r6
            r0.f16873r = r7
            r0.f16876u = r3
            java.lang.Object r1 = r1.e(r0)
            if (r1 != r4) goto L5b
            goto L7b
        L5b:
            r0.f16872q = r6
            r0.f16873r = r7
            r0.f16876u = r2
            M5.h r1 = new M5.h
            q5.c r0 = n5.AbstractC1397A.v(r0)
            r1.<init>(r3, r0)
            r1.s()
            r6.f16914z = r1
            U5.c r0 = r6.f16899A
            r2 = 0
            r0.g(r2)
            java.lang.Object r0 = r1.r()
            if (r0 != r4) goto L7c
        L7b:
            return r4
        L7c:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            boolean r6 = kotlin.jvm.internal.m.a(r7, r6)
            if (r6 == 0) goto L89
            m5.y r6 = m5.C1386y.f15098a
            return r6
        L89:
            r6 = -9223372036854775808
            r0.f16901C = r6
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException
            java.lang.String r7 = "targetState while waiting for composition"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1645d0.s(u.d0, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(u.C1645d0 r7, s5.c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof u.C1643c0
            if (r0 == 0) goto L16
            r0 = r8
            u.c0 r0 = (u.C1643c0) r0
            int r1 = r0.f16889u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f16889u = r1
            goto L1b
        L16:
            u.c0 r0 = new u.c0
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f16887s
            int r1 = r0.f16889u
            r2 = 2
            r3 = 1
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.f16886r
            u.d0 r0 = r0.f16885q
            m5.AbstractC1362a.e(r8)
            goto L89
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.f16886r
            u.d0 r1 = r0.f16885q
            m5.AbstractC1362a.e(r8)
            goto L5b
        L41:
            m5.AbstractC1362a.e(r8)
            P.f0 r8 = r7.f16907s
            java.lang.Object r8 = r8.getValue()
            U5.c r1 = r7.f16899A
            r0.f16885q = r7
            r0.f16886r = r8
            r0.f16889u = r3
            java.lang.Object r1 = r1.e(r0)
            if (r1 != r4) goto L59
            goto L87
        L59:
            r1 = r7
            r7 = r8
        L5b:
            java.lang.Object r8 = r1.f16909u
            U5.c r5 = r1.f16899A
            boolean r8 = kotlin.jvm.internal.m.a(r7, r8)
            r6 = 0
            if (r8 == 0) goto L6a
            r5.g(r6)
            goto L8f
        L6a:
            r0.f16885q = r1
            r0.f16886r = r7
            r0.f16889u = r2
            M5.h r8 = new M5.h
            q5.c r0 = n5.AbstractC1397A.v(r0)
            r8.<init>(r3, r0)
            r8.s()
            r1.f16914z = r8
            r5.g(r6)
            java.lang.Object r8 = r8.r()
            if (r8 != r4) goto L88
        L87:
            return r4
        L88:
            r0 = r1
        L89:
            boolean r1 = kotlin.jvm.internal.m.a(r8, r7)
            if (r1 == 0) goto L92
        L8f:
            m5.y r7 = m5.C1386y.f15098a
            return r7
        L92:
            r1 = -9223372036854775808
            r0.f16901C = r1
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " instead of "
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1645d0.t(u.d0, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.D0
    public final Object j() {
        return this.f16908t.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.D0
    public final Object k() {
        return this.f16907s.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.D0
    public final void l(Object obj) {
        this.f16908t.setValue(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.D0
    public final void m(v0 v0Var) {
        v0 v0Var2 = this.f16910v;
        if (v0Var2 != null && !v0Var.equals(v0Var2)) {
            AbstractC1637P.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f16910v + ", new instance: " + v0Var);
        }
        this.f16910v = v0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, m5.h] */
    @Override // O3.D0
    public final void n() {
        this.f16910v = null;
        ((a0.t) y0.f17085a.getValue()).b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object u(s5.c cVar) {
        float fM = AbstractC1644d.m(cVar.getContext());
        C1386y c1386y = C1386y.f15098a;
        if (fM <= 0.0f) {
            v();
            return c1386y;
        }
        this.f16905G = fM;
        Object objE = C0345b.o(cVar.getContext()).e(this.f16906H, cVar);
        return objE == EnumC1580a.f16356q ? objE : c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() {
        v0 v0Var = this.f16910v;
        if (v0Var != null) {
            v0Var.c();
        }
        this.f16902D.c();
        if (this.f16903E != null) {
            this.f16903E = null;
            y(1.0f);
            x();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object w(float f, Object obj, s5.i iVar) {
        if (0.0f > f || f > 1.0f) {
            AbstractC1637P.a("Expecting fraction between 0 and 1. Got " + f);
        }
        v0 v0Var = this.f16910v;
        if (v0Var != null) {
            Object objA = C1636O.a(this.f16900B, new Z(obj, this.f16907s.getValue(), this, v0Var, f, null), iVar);
            if (objA == EnumC1580a.f16356q) {
                return objA;
            }
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x() {
        v0 v0Var = this.f16910v;
        if (v0Var == null) {
            return;
        }
        v0Var.l(D5.a.H(((double) this.f16913y.e()) * ((Number) v0Var.f17077l.getValue()).longValue()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(float f) {
        this.f16913y.f(f);
    }
}
