package A;

import P.C0385v0;
import P.EnumC0374p0;
import java.util.concurrent.CancellationException;
import m5.AbstractC1362a;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f57q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f58r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f59s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i, Object obj, Object obj2) {
        super(1);
        this.f57q = i;
        this.f58r = obj;
        this.f59s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Object a(Object obj) {
        Throwable th = (Throwable) obj;
        C0385v0 c0385v0 = (C0385v0) this.f58r;
        Object obj2 = c0385v0.f5555b;
        Throwable th2 = (Throwable) this.f59s;
        synchronized (obj2) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                try {
                    if (th instanceof CancellationException) {
                        th = null;
                    }
                    if (th != null) {
                        AbstractC1362a.a(th2, th);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            c0385v0.f5557d = th2;
            P5.S s6 = c0385v0.f5570t;
            EnumC0374p0 enumC0374p0 = EnumC0374p0.f5490q;
            s6.getClass();
            s6.h(null, enumC0374p0);
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fd  */
    @Override // B5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.f57q
            r1 = 2
            r2 = 9
            r3 = 0
            r4 = 0
            r5 = 1
            switch(r0) {
                case 0: goto L3e9;
                case 1: goto L3d2;
                case 2: goto L3bb;
                case 3: goto L3a1;
                case 4: goto L38d;
                case 5: goto L34c;
                case 6: goto L2ff;
                case 7: goto L2dc;
                case 8: goto L2cc;
                case 9: goto L2b8;
                case 10: goto L29c;
                case 11: goto L24c;
                case 12: goto L21c;
                case 13: goto L205;
                case 14: goto L1c4;
                case 15: goto L199;
                case 16: goto L170;
                case 17: goto L154;
                case 18: goto L14f;
                case 19: goto L13c;
                case 20: goto Leb;
                case 21: goto Ld7;
                case 22: goto Lc5;
                case 23: goto Lb3;
                case 24: goto L85;
                case 25: goto L67;
                case 26: goto L4d;
                case 27: goto L38;
                case 28: goto L26;
                default: goto Lb;
            }
        Lb:
            r6 = r13
            B0.N r6 = (B0.N) r6
            r6.a()
            java.lang.Object r13 = r12.f58r
            j0.x r13 = (j0.x) r13
            j0.A r7 = r13.f13730e
            java.lang.Object r13 = r12.f59s
            r8 = r13
            j0.B r8 = (j0.AbstractC1145B) r8
            r10 = 0
            r11 = 60
            r9 = 0
            l0.InterfaceC1221d.j(r6, r7, r8, r9, r10, r11)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L26:
            P.F r13 = (P.F) r13
            java.lang.Object r13 = r12.f58r
            u.v0 r13 = (u.v0) r13
            java.lang.Object r0 = r12.f59s
            u.p0 r0 = (u.p0) r0
            A.X r1 = new A.X
            r2 = 10
            r1.<init>(r2, r13, r0)
            return r1
        L38:
            P.F r13 = (P.F) r13
            java.lang.Object r13 = r12.f58r
            u.v0 r13 = (u.v0) r13
            java.lang.Object r0 = r12.f59s
            u.v0 r0 = (u.v0) r0
            a0.q r1 = r13.j
            r1.add(r0)
            A.X r1 = new A.X
            r1.<init>(r2, r13, r0)
            return r1
        L4d:
            P.F r13 = (P.F) r13
            java.lang.Object r13 = r12.f58r
            M5.w r13 = (M5.InterfaceC0261w) r13
            M5.x r0 = M5.EnumC0262x.f3898t
            u.u0 r1 = new u.u0
            java.lang.Object r2 = r12.f59s
            u.v0 r2 = (u.v0) r2
            r1.<init>(r2, r3)
            M5.AbstractC0263y.t(r13, r3, r0, r1, r5)
            U4.f0 r13 = new U4.f0
            r13.<init>(r5)
            return r13
        L67:
            P.F r13 = (P.F) r13
            java.lang.Object r13 = r12.f58r
            u.H r13 = (u.C1629H) r13
            java.lang.Object r0 = r12.f59s
            u.E r0 = (u.C1626E) r0
            R.e r1 = r13.f16784a
            r1.c(r0)
            P.f0 r1 = r13.f16785b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setValue(r2)
            A.X r1 = new A.X
            r2 = 8
            r1.<init>(r2, r13, r0)
            return r1
        L85:
            z0.I r13 = (z0.AbstractC1932I) r13
            java.lang.Object r0 = r12.f58r
            z0.J r0 = (z0.AbstractC1933J) r0
            java.lang.Object r1 = r12.f59s
            t.s r1 = (t.s) r1
            P.b0 r1 = r1.f16635c
            float r1 = r1.e()
            r13.getClass()
            long r4 = (long) r4
            r2 = 32
            long r6 = r4 << r2
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r8
            long r4 = r4 | r6
            z0.AbstractC1932I.a(r13, r0)
            long r6 = r0.f18668u
            long r4 = W0.i.c(r4, r6)
            r0.U(r4, r1, r3)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        Lb3:
            z0.I r13 = (z0.AbstractC1932I) r13
            java.lang.Object r0 = r12.f58r
            z0.J r0 = (z0.AbstractC1933J) r0
            java.lang.Object r1 = r12.f59s
            j0.F r1 = (j0.F) r1
            B0.a r1 = r1.f13691O
            z0.AbstractC1932I.h(r13, r0, r1)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        Lc5:
            z0.I r13 = (z0.AbstractC1932I) r13
            java.lang.Object r0 = r12.f58r
            z0.J r0 = (z0.AbstractC1933J) r0
            java.lang.Object r1 = r12.f59s
            j0.k r1 = (j0.k) r1
            B5.c r1 = r1.f13714E
            z0.AbstractC1932I.h(r13, r0, r1)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        Ld7:
            c0.m r13 = (c0.InterfaceC0725m) r13
            java.lang.Object r0 = r12.f58r
            B0.L r0 = (B0.L) r0
            java.lang.Object r1 = r12.f59s
            c0.m r1 = (c0.InterfaceC0725m) r1
            c0.m r13 = r13.d(r1)
            r0.Y(r13)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        Leb:
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r0 = r12.f58r
            androidx.concurrent.futures.k r0 = (androidx.concurrent.futures.k) r0
            if (r13 == 0) goto L110
            boolean r1 = r13 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L10c
            r0.f9374d = r5
            androidx.concurrent.futures.n r13 = r0.f9372b
            if (r13 == 0) goto L12c
            androidx.concurrent.futures.m r13 = r13.f9377r
            boolean r13 = r13.cancel(r5)
            if (r13 == 0) goto L12c
            r0.f9371a = r3
            r0.f9372b = r3
            r0.f9373c = r3
            goto L12c
        L10c:
            r0.b(r13)
            goto L12c
        L110:
            java.lang.Object r13 = r12.f59s
            M5.B r13 = (M5.B) r13
            r13.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = M5.i0.f3864q
            java.lang.Object r13 = r1.get(r13)
            boolean r1 = r13 instanceof M5.X
            if (r1 != 0) goto L134
            boolean r1 = r13 instanceof M5.C0255p
            if (r1 != 0) goto L12f
            java.lang.Object r13 = M5.AbstractC0263y.z(r13)
            r0.a(r13)
        L12c:
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L12f:
            M5.p r13 = (M5.C0255p) r13
            java.lang.Throwable r13 = r13.f3878a
            throw r13
        L134:
            java.lang.String r13 = "This job has not completed yet"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L13c:
            java.lang.Object r0 = r12.f58r
            P.u r0 = (P.C0382u) r0
            r0.y(r13)
            java.lang.Object r0 = r12.f59s
            r.H r0 = (r.C1549H) r0
            if (r0 == 0) goto L14c
            r0.a(r13)
        L14c:
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L14f:
            java.lang.Object r13 = r12.a(r13)
            return r13
        L154:
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r13 = r12.f58r
            K2.a r13 = (K2.a) r13
            java.lang.Object r1 = r13.f2860c
            java.lang.Object r0 = r12.f59s
            M5.h r0 = (M5.C0247h) r0
            monitor-enter(r1)
            java.io.Serializable r13 = r13.f2861d     // Catch: java.lang.Throwable -> L16c
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch: java.lang.Throwable -> L16c
            r13.remove(r0)     // Catch: java.lang.Throwable -> L16c
            monitor-exit(r1)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L16c:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)
            throw r13
        L170:
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r13 = r12.f58r
            P.e r13 = (P.C0351e) r13
            java.lang.Object r1 = r13.f5394r
            java.lang.Object r0 = r12.f59s
            P.d r0 = (P.C0349d) r0
            monitor-enter(r1)
            java.util.ArrayList r2 = r13.f5396t     // Catch: java.lang.Throwable -> L190
            r2.remove(r0)     // Catch: java.lang.Throwable -> L190
            java.util.ArrayList r0 = r13.f5396t     // Catch: java.lang.Throwable -> L190
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L190
            if (r0 == 0) goto L193
            X.a r13 = r13.f5398v     // Catch: java.lang.Throwable -> L190
            r13.set(r4)     // Catch: java.lang.Throwable -> L190
            goto L193
        L190:
            r0 = move-exception
            r13 = r0
            goto L197
        L193:
            monitor-exit(r1)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L197:
            monitor-exit(r1)
            throw r13
        L199:
            O0.r r13 = (O0.r) r13
            java.lang.Object r0 = r12.f58r
            B0.o r0 = (B0.C0050o) r0
            java.lang.Object r1 = r0.f499q
            O3.D r1 = (O3.D) r1
            java.lang.Object r2 = r12.f59s
            O0.q r2 = (O0.q) r2
            monitor-enter(r1)
            boolean r3 = r13.f4295r     // Catch: java.lang.Throwable -> L1b4
            if (r3 == 0) goto L1b7
            java.lang.Object r0 = r0.f500r     // Catch: java.lang.Throwable -> L1b4
            d2.d0 r0 = (d2.d0) r0     // Catch: java.lang.Throwable -> L1b4
            r0.l(r2, r13)     // Catch: java.lang.Throwable -> L1b4
            goto L1be
        L1b4:
            r0 = move-exception
            r13 = r0
            goto L1c2
        L1b7:
            java.lang.Object r13 = r0.f500r     // Catch: java.lang.Throwable -> L1b4
            d2.d0 r13 = (d2.d0) r13     // Catch: java.lang.Throwable -> L1b4
            r13.m(r2)     // Catch: java.lang.Throwable -> L1b4
        L1be:
            monitor-exit(r1)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L1c2:
            monitor-exit(r1)
            throw r13
        L1c4:
            B5.c r13 = (B5.c) r13
            java.lang.Object r13 = r12.f58r
            O0.e r13 = (O0.e) r13
            O0.g r0 = r13.f4274d
            java.lang.Object r1 = r12.f59s
            O0.q r1 = (O0.q) r1
            r0.getClass()
            O0.p r0 = r1.f4289a
            k3.c r13 = r13.f4275e
            java.lang.Object r13 = r13.f14120q
            O0.o r13 = (O0.o) r13
            int r2 = r1.f4291c
            O0.j r1 = r1.f4290b
            if (r0 != 0) goto L1e2
            goto L1e4
        L1e2:
            boolean r5 = r0 instanceof O0.b
        L1e4:
            if (r5 == 0) goto L1eb
            android.graphics.Typeface r13 = r13.e(r1, r2)
            goto L1f5
        L1eb:
            boolean r4 = r0 instanceof O0.l
            if (r4 == 0) goto L1fa
            O0.l r0 = (O0.l) r0
            android.graphics.Typeface r13 = r13.d(r0, r1, r2)
        L1f5:
            O0.r r3 = new O0.r
            r3.<init>(r13)
        L1fa:
            if (r3 == 0) goto L1fd
            return r3
        L1fd:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r13.<init>(r0)
            throw r13
        L205:
            A.W r13 = (A.W) r13
            java.lang.Object r0 = r12.f58r
            N.z r0 = (N.z) r0
            java.lang.Object r1 = r12.f59s
            A.W r1 = (A.W) r1
            A.y r2 = new A.y
            r2.<init>(r1, r13)
            P.f0 r13 = r0.f3998a
            r13.setValue(r2)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L21c:
            I0.i r13 = (I0.i) r13
            H5.k[] r0 = I0.r.f2326a
            I0.s r0 = I0.p.f2316r
            H5.k[] r4 = I0.r.f2326a
            r2 = r4[r2]
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.a(r13, r2)
            java.lang.Object r0 = r12.f58r
            java.lang.String r0 = (java.lang.String) r0
            I0.r.c(r13, r0)
            F.Q r0 = new F.Q
            java.lang.Object r2 = r12.f59s
            B5.a r2 = (B5.a) r2
            r0.<init>(r2, r1)
            I0.s r1 = I0.h.f2235b
            I0.a r2 = new I0.a
            r2.<init>(r3, r0)
            r13.j(r1, r2)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L24c:
            j0.C r13 = (j0.C) r13
            java.lang.Object r0 = r12.f58r
            M.I0 r0 = (M.I0) r0
            N.r r0 = r0.f3322c
            P.b0 r0 = r0.j
            float r0 = r0.e()
            long r1 = r13.f13663B
            float r1 = i0.C1133e.b(r1)
            boolean r2 = java.lang.Float.isNaN(r0)
            if (r2 != 0) goto L299
            boolean r2 = java.lang.Float.isNaN(r1)
            if (r2 != 0) goto L299
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L272
            goto L299
        L272:
            java.lang.Object r2 = r12.f59s
            u.c r2 = (u.C1642c) r2
            java.lang.Object r2 = r2.d()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r3 = M.AbstractC0210g0.d(r13, r2)
            r13.c(r3)
            float r2 = M.AbstractC0210g0.e(r13, r2)
            r13.e(r2)
            float r0 = r0 + r1
            float r0 = r0 / r1
            r1 = 1056964608(0x3f000000, float:0.5)
            long r0 = j0.AbstractC1145B.g(r1, r0)
            r13.g(r0)
        L299:
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L29c:
            z0.I r13 = (z0.AbstractC1932I) r13
            F.y r0 = new F.y
            java.lang.Object r1 = r12.f59s
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.<init>(r4, r1)
            r13.f18663a = r5
            r0.invoke(r13)
            r13.f18663a = r4
            java.lang.Object r13 = r12.f58r
            P.W r13 = (P.W) r13
            r13.getValue()
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L2b8:
            P.F r13 = (P.F) r13
            java.lang.Object r13 = r12.f58r
            E.W r13 = (E.W) r13
            r.H r0 = r13.f1515c
            java.lang.Object r1 = r12.f59s
            r0.i(r1)
            A.X r0 = new A.X
            r2 = 3
            r0.<init>(r2, r13, r1)
            return r0
        L2cc:
            java.util.Map r13 = (java.util.Map) r13
            E.W r0 = new E.W
            java.lang.Object r1 = r12.f58r
            Z.i r1 = (Z.i) r1
            java.lang.Object r2 = r12.f59s
            Z.c r2 = (Z.c) r2
            r0.<init>(r1, r13, r2)
            return r0
        L2dc:
            java.lang.Number r13 = (java.lang.Number) r13
            int r6 = r13.intValue()
            java.lang.Object r13 = r12.f58r
            D.m r13 = (D.m) r13
            D.u r0 = r13.f1242e
            int r1 = r0.f1289b
            int r8 = r0.A(r6)
            long r10 = r13.a(r4, r8)
            java.lang.Object r13 = r12.f59s
            r5 = r13
            D.l r5 = (D.l) r5
            r7 = 0
            int r9 = r5.f1233c
            D.p r13 = r5.a(r6, r7, r8, r9, r10)
            return r13
        L2ff:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.Object r0 = r12.f58r
            D.u r0 = (D.u) r0
            D.t r13 = r0.r(r13)
            int r0 = r13.f1286a
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r13 = r13.f1287b
            int r2 = r13.size()
            r1.<init>(r2)
            java.lang.Object r2 = r12.f59s
            D.m r2 = (D.m) r2
            r3 = r13
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r6 = r4
        L326:
            if (r4 >= r3) goto L34b
            java.lang.Object r7 = r13.get(r4)
            D.b r7 = (D.C0117b) r7
            long r7 = r7.f1191a
            int r7 = (int) r7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            long r9 = r2.a(r6, r7)
            W0.a r11 = new W0.a
            r11.<init>(r9)
            m5.j r9 = new m5.j
            r9.<init>(r8, r11)
            r1.add(r9)
            int r0 = r0 + r5
            int r6 = r6 + r7
            int r4 = r4 + 1
            goto L326
        L34b:
            return r1
        L34c:
            C0.n r13 = (C0.C0091n) r13
            java.lang.Object r0 = r12.f59s
            B5.e r0 = (B5.e) r0
            java.lang.Object r1 = r12.f58r
            C0.w1 r1 = (C0.w1) r1
            boolean r2 = r1.f1145s
            if (r2 != 0) goto L38a
            androidx.lifecycle.x r13 = r13.f1065a
            androidx.lifecycle.q r13 = r13.getLifecycle()
            r1.f1147u = r0
            androidx.lifecycle.q r2 = r1.f1146t
            if (r2 != 0) goto L36c
            r1.f1146t = r13
            r13.a(r1)
            goto L38a
        L36c:
            androidx.lifecycle.p r13 = r13.b()
            androidx.lifecycle.p r2 = androidx.lifecycle.EnumC0653p.f9558s
            int r13 = r13.compareTo(r2)
            if (r13 < 0) goto L38a
            P.u r13 = r1.f1144r
            C0.v1 r2 = new C0.v1
            r2.<init>(r1, r0, r5)
            X.e r0 = new X.e
            r1 = -2000640158(0xffffffff88c0a762, float:-1.1594931E-33)
            r0.<init>(r1, r5, r2)
            r13.j(r0)
        L38a:
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L38d:
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r13 = r12.f58r
            C0.h0 r13 = (C0.C0080h0) r13
            java.lang.Object r13 = r13.f1042r
            android.view.Choreographer r13 = (android.view.Choreographer) r13
            java.lang.Object r0 = r12.f59s
            C0.g0 r0 = (C0.ChoreographerFrameCallbackC0078g0) r0
            r13.removeFrameCallback(r0)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L3a1:
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r13 = r12.f58r
            C0.f0 r13 = (C0.C0076f0) r13
            java.lang.Object r0 = r12.f59s
            C0.g0 r0 = (C0.ChoreographerFrameCallbackC0078g0) r0
            java.lang.Object r1 = r13.f1030s
            monitor-enter(r1)
            java.util.ArrayList r13 = r13.f1032u     // Catch: java.lang.Throwable -> L3b7
            r13.remove(r0)     // Catch: java.lang.Throwable -> L3b7
            monitor-exit(r1)
            m5.y r13 = m5.C1386y.f15098a
            return r13
        L3b7:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)
            throw r13
        L3bb:
            P.F r13 = (P.F) r13
            java.lang.Object r13 = r12.f58r
            android.content.Context r13 = (android.content.Context) r13
            android.content.Context r0 = r13.getApplicationContext()
            java.lang.Object r2 = r12.f59s
            C0.b0 r2 = (C0.ComponentCallbacks2C0068b0) r2
            r0.registerComponentCallbacks(r2)
            A.X r0 = new A.X
            r0.<init>(r1, r13, r2)
            return r0
        L3d2:
            P.F r13 = (P.F) r13
            java.lang.Object r13 = r12.f58r
            android.content.Context r13 = (android.content.Context) r13
            android.content.Context r0 = r13.getApplicationContext()
            java.lang.Object r1 = r12.f59s
            C0.a0 r1 = (C0.ComponentCallbacks2C0066a0) r1
            r0.registerComponentCallbacks(r1)
            A.X r0 = new A.X
            r0.<init>(r5, r13, r1)
            return r0
        L3e9:
            P.F r13 = (P.F) r13
            java.lang.Object r13 = r12.f58r
            A.Z r13 = (A.Z) r13
            java.lang.Object r0 = r12.f59s
            android.view.View r0 = (android.view.View) r0
            A.D r1 = r13.f78u
            int r2 = r13.f77t
            if (r2 != 0) goto L40d
            java.util.WeakHashMap r2 = w1.AbstractC1835K.f18149a
            w1.AbstractC1826B.l(r0, r1)
            boolean r2 = r0.isAttachedToWindow()
            if (r2 == 0) goto L407
            r0.requestApplyInsets()
        L407:
            r0.addOnAttachStateChangeListener(r1)
            w1.AbstractC1835K.o(r0, r1)
        L40d:
            int r1 = r13.f77t
            int r1 = r1 + r5
            r13.f77t = r1
            A.X r1 = new A.X
            r1.<init>(r4, r13, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A.Y.invoke(java.lang.Object):java.lang.Object");
    }
}
