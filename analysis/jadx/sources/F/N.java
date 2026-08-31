package F;

import E.C0122e;
import E.C0128k;
import P.C0345b;
import P.C0346b0;
import P.C0348c0;
import P.C0354f0;
import P.W;
import i0.C1130b;
import java.util.List;
import m5.C1386y;
import p3.z0;
import w.A0;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public abstract class N implements A0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final E.H f1811A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final W f1812B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final W f1813C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0354f0 f1814D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C0354f0 f1815E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0354f0 f1816F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C0354f0 f1817G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f1819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0354f0 f1820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f1821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1822e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1824h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z0 f1825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public E.J f1828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0354f0 f1830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public W0.c f1831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y.i f1832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0348c0 f1833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0348c0 f1834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final E.K f1835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0128k f1836v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0122e f1837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0354f0 f1838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C.x f1839y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f1840z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public N(int i, float f) {
        double d5 = f;
        if (-0.5d > d5 || d5 > 0.5d) {
            AbstractC1923a.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.f1820c = C0345b.q(new C1130b(0L));
        this.f1821d = new D(i, f, this);
        this.f1822e = i;
        this.f1823g = Long.MAX_VALUE;
        this.f1825k = new z0(new I(this, 1));
        this.f1826l = true;
        this.f1827m = -1;
        this.f1830p = new C0354f0(S.f1844b, P.S.f5374s);
        this.f1831q = S.f1845c;
        this.f1832r = new y.i();
        this.f1833s = new C0348c0(-1);
        this.f1834t = new C0348c0(i);
        P.S s6 = P.S.f5377v;
        C0345b.n(new M(this, 0), s6);
        C0345b.n(new M(this, 1), s6);
        this.f1835u = new E.K(new I(this, 0));
        this.f1836v = new C0128k(0);
        this.f1837w = new C0122e();
        this.f1838x = C0345b.q(null);
        this.f1839y = new C.x(this, 2);
        this.f1840z = W0.b.b(0, 0, 15);
        this.f1811A = new E.H();
        this.f1812B = E.C.h();
        this.f1813C = E.C.h();
        Boolean bool = Boolean.FALSE;
        this.f1814D = C0345b.q(bool);
        this.f1815E = C0345b.q(bool);
        this.f1816F = C0345b.q(bool);
        this.f1817G = C0345b.q(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x005b */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: B5.e */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: B5.e */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: B5.e */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r9.e(r7, r8, r0) == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r(F.N r6, v.W r7, B5.e r8, s5.c r9) {
        /*
            boolean r0 = r9 instanceof F.K
            if (r0 == 0) goto L13
            r0 = r9
            F.K r0 = (F.K) r0
            int r1 = r0.f1805v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1805v = r1
            goto L18
        L13:
            F.K r0 = new F.K
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f1803t
            int r1 = r0.f1805v
            m5.y r2 = m5.C1386y.f15098a
            r3 = 2
            r4 = 1
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L43
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2e
            F.N r6 = r0.f1800q
            m5.AbstractC1362a.e(r9)
            goto L81
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            s5.i r6 = r0.f1802s
            r8 = r6
            B5.e r8 = (B5.e) r8
            v.W r7 = r0.f1801r
            F.N r6 = r0.f1800q
            m5.AbstractC1362a.e(r9)
            goto L5e
        L43:
            m5.AbstractC1362a.e(r9)
            r0.f1800q = r6
            r0.f1801r = r7
            r9 = r8
            s5.i r9 = (s5.i) r9
            r0.f1802s = r9
            r0.f1805v = r4
            E.e r9 = r6.f1837w
            java.lang.Object r9 = r9.f(r0)
            if (r9 != r5) goto L5a
            goto L5b
        L5a:
            r9 = r2
        L5b:
            if (r9 != r5) goto L5e
            goto L80
        L5e:
            p3.z0 r9 = r6.f1825k
            boolean r9 = r9.b()
            if (r9 != 0) goto L6f
            int r9 = r6.j()
            P.c0 r1 = r6.f1834t
            r1.f(r9)
        L6f:
            p3.z0 r9 = r6.f1825k
            r0.f1800q = r6
            r1 = 0
            r0.f1801r = r1
            r0.f1802s = r1
            r0.f1805v = r3
            java.lang.Object r7 = r9.e(r7, r8, r0)
            if (r7 != r5) goto L81
        L80:
            return r5
        L81:
            r7 = -1
            P.c0 r6 = r6.f1833s
            r6.f(r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F.N.r(F.N, v.W, B5.e, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final boolean a() {
        return ((Boolean) this.f1815E.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final boolean b() {
        return this.f1825k.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final boolean c() {
        return ((Boolean) this.f1814D.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final float d(float f) {
        return this.f1825k.d(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.A0
    public final Object e(v.W w3, B5.e eVar, s5.c cVar) {
        return r(this, w3, eVar, cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r18, u.C1649f0 r19, s5.c r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof F.G
            if (r3 == 0) goto L19
            r3 = r2
            F.G r3 = (F.G) r3
            int r4 = r3.f1789v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f1789v = r4
            goto L1e
        L19:
            F.G r3 = new F.G
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f1787t
            int r4 = r3.f1789v
            r5 = 0
            m5.y r6 = m5.C1386y.f15098a
            r7 = 2
            r8 = 1
            r5.a r9 = r5.EnumC1580a.f16356q
            if (r4 == 0) goto L47
            if (r4 == r8) goto L3b
            if (r4 != r7) goto L33
            m5.AbstractC1362a.e(r2)
            return r6
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            int r1 = r3.f1786s
            u.f0 r4 = r3.f1785r
            F.N r8 = r3.f1784q
            m5.AbstractC1362a.e(r2)
            r14 = r4
            r11 = r8
            goto L7f
        L47:
            m5.AbstractC1362a.e(r2)
            int r2 = r0.j()
            if (r1 != r2) goto L5f
            F.D r2 = r0.f1821d
            java.lang.Object r2 = r2.f1779t
            P.b0 r2 = (P.C0346b0) r2
            float r2 = r2.e()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L5f
            goto Lc4
        L5f:
            int r2 = r0.l()
            if (r2 != 0) goto L66
            goto Lc4
        L66:
            r3.f1784q = r0
            r2 = r19
            r3.f1785r = r2
            r3.f1786s = r1
            r3.f1789v = r8
            E.e r4 = r0.f1837w
            java.lang.Object r4 = r4.f(r3)
            if (r4 != r9) goto L79
            goto L7a
        L79:
            r4 = r6
        L7a:
            if (r4 != r9) goto L7d
            goto Lc3
        L7d:
            r11 = r0
            r14 = r2
        L7f:
            double r12 = (double) r5
            r15 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r2 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r2 > 0) goto L8d
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r2 > 0) goto L8d
            goto La3
        L8d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "pageOffsetFraction "
            r2.<init>(r4)
            r2.append(r5)
            java.lang.String r4 = " is not within the range -0.5 to 0.5"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            z.AbstractC1923a.a(r2)
        La3:
            int r12 = r11.i(r1)
            int r1 = r11.n()
            float r1 = (float) r1
            float r13 = r5 * r1
            F.H r10 = new F.H
            r15 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r1 = 0
            r3.f1784q = r1
            r3.f1785r = r1
            r3.f1789v = r7
            v.W r1 = v.W.f17278q
            java.lang.Object r1 = r11.e(r1, r10, r3)
            if (r1 != r9) goto Lc4
        Lc3:
            return r9
        Lc4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: F.N.f(int, u.f0, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120 A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:57:0x00cd, B:59:0x00e0, B:61:0x00e4, B:63:0x00f0, B:74:0x012a, B:69:0x0120, B:66:0x0108), top: B:87:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:57:0x00cd, B:59:0x00e0, B:61:0x00e4, B:63:0x00f0, B:74:0x012a, B:69:0x0120, B:66:0x0108), top: B:87:0x00cd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(F.B r10, boolean r11, boolean r12) {
        /*
            r9 = this;
            F.l r0 = r10.i
            float r1 = r10.j
            if (r11 != 0) goto Ld
            boolean r2 = r9.f1818a
            if (r2 == 0) goto Ld
            r9.f1819b = r10
            return
        Ld:
            r2 = 1
            if (r11 == 0) goto L12
            r9.f1818a = r2
        L12:
            F.D r11 = r9.f1821d
            r3 = 0
            r4 = 0
            if (r12 == 0) goto L21
            java.lang.Object r11 = r11.f1779t
            P.b0 r11 = (P.C0346b0) r11
            r11.f(r1)
            goto L8c
        L21:
            r11.getClass()
            java.util.List r12 = r10.f1760a
            if (r0 == 0) goto L2b
            java.lang.Object r5 = r0.f1891d
            goto L2c
        L2b:
            r5 = r3
        L2c:
            r11.f1780u = r5
            boolean r5 = r11.f1776q
            if (r5 != 0) goto L3b
            r5 = r12
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L58
        L3b:
            r11.f1776q = r2
            if (r0 == 0) goto L42
            int r0 = r0.f1888a
            goto L43
        L42:
            r0 = r4
        L43:
            java.lang.Object r5 = r11.f1778s
            P.c0 r5 = (P.C0348c0) r5
            r5.f(r0)
            java.lang.Object r5 = r11.f1781v
            E.F r5 = (E.F) r5
            r5.b(r0)
            java.lang.Object r11 = r11.f1779t
            P.b0 r11 = (P.C0346b0) r11
            r11.f(r1)
        L58:
            int r11 = r9.f1827m
            r0 = -1
            if (r11 == r0) goto L8c
            r11 = r12
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L8c
            boolean r11 = r9.f1829o
            if (r11 == 0) goto L74
            java.lang.Object r11 = n5.l.r0(r12)
            F.l r11 = (F.C0158l) r11
            int r11 = r11.f1888a
            int r11 = r11 + r2
            goto L7d
        L74:
            java.lang.Object r11 = n5.l.l0(r12)
            F.l r11 = (F.C0158l) r11
            int r11 = r11.f1888a
            int r11 = r11 - r2
        L7d:
            int r12 = r9.f1827m
            if (r12 == r11) goto L8c
            r9.f1827m = r0
            E.J r11 = r9.f1828n
            if (r11 == 0) goto L8a
            r11.cancel()
        L8a:
            r9.f1828n = r3
        L8c:
            P.f0 r11 = r9.f1830p
            r11.setValue(r10)
            boolean r11 = r10.f1768l
            int r12 = r10.f1767k
            F.l r0 = r10.f1766h
            P.f0 r1 = r9.f1814D
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r1.setValue(r11)
            if (r0 == 0) goto La5
            int r11 = r0.f1888a
            goto La6
        La5:
            r11 = r4
        La6:
            if (r11 != 0) goto Lad
            if (r12 == 0) goto Lab
            goto Lad
        Lab:
            r11 = r4
            goto Lae
        Lad:
            r11 = r2
        Lae:
            P.f0 r1 = r9.f1815E
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r1.setValue(r11)
            if (r0 == 0) goto Lbd
            int r11 = r0.f1888a
            r9.f1822e = r11
        Lbd:
            r9.f = r12
            a0.h r11 = a0.r.c()
            if (r11 == 0) goto Lc9
            B5.c r3 = r11.e()
        Lc9:
            a0.h r12 = a0.r.d(r11)
            float r0 = r9.j     // Catch: java.lang.Throwable -> L130
            float r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> L130
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 32
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 <= 0) goto L132
            boolean r0 = r9.f1826l     // Catch: java.lang.Throwable -> L130
            if (r0 == 0) goto L132
            float r0 = r9.j     // Catch: java.lang.Throwable -> L130
            F.B r7 = r9.k()     // Catch: java.lang.Throwable -> L130
            w.d0 r7 = r7.f1764e     // Catch: java.lang.Throwable -> L130
            w.d0 r8 = w.EnumC1778d0.f17945q     // Catch: java.lang.Throwable -> L130
            if (r7 != r8) goto L108
            float r0 = java.lang.Math.signum(r0)     // Catch: java.lang.Throwable -> L130
            long r7 = r9.o()     // Catch: java.lang.Throwable -> L130
            long r7 = r7 & r5
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L130
            float r7 = java.lang.Float.intBitsToFloat(r7)     // Catch: java.lang.Throwable -> L130
            float r7 = -r7
            float r7 = java.lang.Math.signum(r7)     // Catch: java.lang.Throwable -> L130
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L120
            goto L128
        L108:
            float r0 = java.lang.Math.signum(r0)     // Catch: java.lang.Throwable -> L130
            long r7 = r9.o()     // Catch: java.lang.Throwable -> L130
            long r7 = r7 >> r1
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L130
            float r7 = java.lang.Float.intBitsToFloat(r7)     // Catch: java.lang.Throwable -> L130
            float r7 = -r7
            float r7 = java.lang.Math.signum(r7)     // Catch: java.lang.Throwable -> L130
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L120
            goto L128
        L120:
            boolean r0 = r9.p()     // Catch: java.lang.Throwable -> L130
            if (r0 == 0) goto L127
            goto L128
        L127:
            r2 = r4
        L128:
            if (r2 == 0) goto L132
            float r0 = r9.j     // Catch: java.lang.Throwable -> L130
            r9.q(r0, r10)     // Catch: java.lang.Throwable -> L130
            goto L132
        L130:
            r10 = move-exception
            goto L162
        L132:
            a0.r.f(r11, r12, r3)
            int r11 = r9.l()
            long r11 = F.S.a(r10, r11)
            r9.f1823g = r11
            r9.l()
            w.d0 r11 = r10.f1764e
            w.d0 r12 = w.EnumC1778d0.f17946r
            if (r11 != r12) goto L14f
            long r11 = r10.g()
            long r11 = r11 >> r1
        L14d:
            int r11 = (int) r11
            goto L155
        L14f:
            long r11 = r10.g()
            long r11 = r11 & r5
            goto L14d
        L155:
            x.m r10 = r10.f1769m
            r10.getClass()
            int r10 = D5.a.q(r4, r4, r11)
            long r10 = (long) r10
            r9.f1824h = r10
            return
        L162:
            a0.r.f(r11, r12, r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: F.N.h(F.B, boolean, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int i(int i) {
        if (l() > 0) {
            return D5.a.q(i, 0, l() - 1);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int j() {
        return ((C0348c0) this.f1821d.f1778s).e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B k() {
        return (B) this.f1830p.getValue();
    }

    public abstract int l();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m() {
        return ((B) this.f1830p.getValue()).f1761b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int n() {
        return ((B) this.f1830p.getValue()).f1762c + m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long o() {
        return ((C1130b) this.f1820c.getValue()).f13520a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p() {
        return ((int) Float.intBitsToFloat((int) (o() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (o() & 4294967295L))) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(float f, B b7) {
        E.J j;
        E.J j7;
        E.J j8;
        List list = b7.f1760a;
        if (this.f1826l && !list.isEmpty()) {
            boolean z5 = f > 0.0f;
            int i = z5 ? ((C0158l) n5.l.r0(list)).f1888a + 1 : ((C0158l) n5.l.l0(list)).f1888a - 1;
            if (i < 0 || i >= l()) {
                return;
            }
            if (i != this.f1827m) {
                if (this.f1829o != z5 && (j8 = this.f1828n) != null) {
                    j8.cancel();
                }
                this.f1829o = z5;
                this.f1827m = i;
                this.f1828n = this.f1835u.a(i, this.f1840z);
            }
            if (z5) {
                if ((((C0158l) n5.l.r0(list)).f1896l + (b7.f1761b + b7.f1762c)) - b7.f1765g >= f || (j7 = this.f1828n) == null) {
                    return;
                }
                j7.a();
                return;
            }
            if (b7.f - ((C0158l) n5.l.l0(list)).f1896l >= (-f) || (j = this.f1828n) == null) {
                return;
            }
            j.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(int i, float f, boolean z5) {
        D d5 = this.f1821d;
        ((C0348c0) d5.f1778s).f(i);
        ((E.F) d5.f1781v).b(i);
        ((C0346b0) d5.f1779t).f(f);
        d5.f1780u = null;
        if (!z5) {
            this.f1813C.setValue(C1386y.f15098a);
            return;
        }
        B0.L l7 = (B0.L) this.f1838x.getValue();
        if (l7 != null) {
            l7.l();
        }
    }
}
