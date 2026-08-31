package a0;

import P.AbstractC0362j0;
import java.util.ArrayList;
import java.util.HashMap;
import m5.C1371j;
import r.C1549H;
import r.P;

/* JADX INFO: renamed from: a0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0602d extends AbstractC0606h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f8650n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B5.c f8651e;
    public final B5.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1549H f8653h;
    public ArrayList i;
    public l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f8654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8656m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0602d(long j, l lVar, B5.c cVar, B5.c cVar2) {
        super(j, lVar);
        this.f8651e = cVar;
        this.f = cVar2;
        this.j = l.f8672u;
        this.f8654k = f8650n;
        this.f8655l = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(long j) {
        synchronized (n.f8680b) {
            this.j = this.j.j(j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void B(C1549H c1549h) {
        this.f8653h = c1549h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0602d C(B5.c cVar, B5.c cVar2) throws Throwable {
        if (this.f8663c) {
            AbstractC0362j0.a("Cannot use a disposed snapshot");
        }
        if (this.f8656m && this.f8664d < 0) {
            AbstractC0362j0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = n.f8680b;
        synchronized (obj) {
            try {
                long j = n.f8682d;
                n.f8682d = j + 1;
                n.f8681c = n.f8681c.j(j);
                l lVarD = d();
                r(lVarD.j(j));
                try {
                    C0603e c0603e = new C0603e(j, n.e(lVarD, g() + 1, j), n.l(cVar, e(), true), n.b(cVar2, i()), this);
                    if (this.f8656m || this.f8663c) {
                        return c0603e;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j7 = n.f8682d;
                        n.f8682d = j7 + 1;
                        s(j7);
                        n.f8681c = n.f8681c.j(g());
                    }
                    r(n.e(d(), jG + 1, g()));
                    return c0603e;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void b() {
        n.f8681c = n.f8681c.g(g()).d(this.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public void c() {
        if (this.f8663c) {
            return;
        }
        this.f8663c = true;
        synchronized (n.f8680b) {
            o();
        }
        l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public int h() {
        return this.f8652g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public B5.c i() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public void k() {
        this.f8655l++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // a0.AbstractC0606h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f8655l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            P.AbstractC0362j0.a(r1)
        Lc:
            int r1 = r0.f8655l
            int r1 = r1 + (-1)
            r0.f8655l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f8656m
            if (r1 != 0) goto L94
            r.H r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.f8656m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            P.AbstractC0362j0.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.f16139b
            long[] r1 = r1.f16138a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            a0.u r13 = (a0.u) r13
            a0.w r13 = r13.d()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f8708a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            a0.l r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = n5.l.h0(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            B0.G0 r6 = a0.n.f8679a
            r14 = 0
            r13.f8708a = r14
        L83:
            a0.w r13 = r13.f8709b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0602d.l():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public void m() {
        if (this.f8656m || this.f8663c) {
            return;
        }
        v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public void n(u uVar) {
        C1549H c1549hX = x();
        if (c1549hX == null) {
            int i = P.f16163a;
            c1549hX = new C1549H();
            B(c1549hX);
        }
        c1549hX.a(uVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public final void p() {
        int length = this.f8654k.length;
        for (int i = 0; i < length; i++) {
            n.u(this.f8654k[i]);
        }
        o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public void t(int i) {
        this.f8652g = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.AbstractC0606h
    public AbstractC0606h u(B5.c cVar) throws Throwable {
        if (this.f8663c) {
            AbstractC0362j0.a("Cannot use a disposed snapshot");
        }
        if (this.f8656m && this.f8664d < 0) {
            AbstractC0362j0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = n.f8680b;
        synchronized (obj) {
            try {
                long j = n.f8682d;
                n.f8682d = j + 1;
                n.f8681c = n.f8681c.j(j);
                try {
                    C0604f c0604f = new C0604f(j, n.e(d(), jG + 1, j), n.l(cVar, e(), true), this);
                    if (this.f8656m || this.f8663c) {
                        return c0604f;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j7 = n.f8682d;
                        n.f8682d = j7 + 1;
                        s(j7);
                        n.f8681c = n.f8681c.j(g());
                    }
                    r(n.e(d(), jG2 + 1, g()));
                    return c0604f;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() {
        A(g());
        if (this.f8656m || this.f8663c) {
            return;
        }
        long jG = g();
        synchronized (n.f8680b) {
            long j = n.f8682d;
            n.f8682d = j + 1;
            s(j);
            n.f8681c = n.f8681c.j(g());
        }
        r(n.e(d(), jG + 1, g()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0199  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0.r w() {
        /*
            r23 = this;
            r1 = r23
            r.H r4 = r1.x()
            r0 = 0
            if (r4 == 0) goto L19
            a0.c r2 = a0.n.i
            long r2 = r2.f8662b
            a0.l r5 = a0.n.f8681c
            a0.l r5 = r5.g(r2)
            java.util.HashMap r2 = a0.n.c(r2, r1, r5)
            r5 = r2
            goto L1a
        L19:
            r5 = r0
        L1a:
            n5.s r2 = n5.s.f15299q
            java.lang.Object r7 = a0.n.f8680b
            monitor-enter(r7)
            a0.n.d(r1)     // Catch: java.lang.Throwable -> L7a
            r8 = 1
            r10 = 0
            if (r4 == 0) goto L7d
            int r3 = r4.f16141d     // Catch: java.lang.Throwable -> L7a
            if (r3 != 0) goto L2c
            goto L7d
        L2c:
            a0.c r11 = a0.n.i     // Catch: java.lang.Throwable -> L7a
            long r2 = a0.n.f8682d     // Catch: java.lang.Throwable -> L7a
            a0.l r6 = a0.n.f8681c     // Catch: java.lang.Throwable -> L7a
            long r12 = r11.f8662b     // Catch: java.lang.Throwable -> L7a
            a0.l r6 = r6.g(r12)     // Catch: java.lang.Throwable -> L7a
            a0.r r2 = r1.z(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L7a
            a0.j r3 = a0.j.f8665b     // Catch: java.lang.Throwable -> L7a
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> L7a
            if (r3 != 0) goto L46
            monitor-exit(r7)
            return r2
        L46:
            r1.b()     // Catch: java.lang.Throwable -> L7a
            r.H r2 = r11.f8653h     // Catch: java.lang.Throwable -> L7a
            long r5 = r11.f8662b     // Catch: java.lang.Throwable -> L7a
            a0.l r3 = a0.n.f8681c     // Catch: java.lang.Throwable -> L7a
            r3.g(r5)     // Catch: java.lang.Throwable -> L7a
            long r12 = a0.n.f8682d     // Catch: java.lang.Throwable -> L7a
            long r8 = r8 + r12
            a0.n.f8682d = r8     // Catch: java.lang.Throwable -> L7a
            a0.l r3 = a0.n.f8681c     // Catch: java.lang.Throwable -> L7a
            a0.l r3 = r3.g(r5)     // Catch: java.lang.Throwable -> L7a
            a0.n.f8681c = r3     // Catch: java.lang.Throwable -> L7a
            r11.f8662b = r12     // Catch: java.lang.Throwable -> L7a
            r11.f8661a = r3     // Catch: java.lang.Throwable -> L7a
            r11.f8652g = r10     // Catch: java.lang.Throwable -> L7a
            r11.f8653h = r0     // Catch: java.lang.Throwable -> L7a
            r11.o()     // Catch: java.lang.Throwable -> L7a
            a0.l r3 = a0.n.f8681c     // Catch: java.lang.Throwable -> L7a
            a0.l r3 = r3.j(r12)     // Catch: java.lang.Throwable -> L7a
            a0.n.f8681c = r3     // Catch: java.lang.Throwable -> L7a
            r1.B(r0)     // Catch: java.lang.Throwable -> L7a
            r11.f8653h = r0     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r3 = a0.n.f8684g     // Catch: java.lang.Throwable -> L7a
            goto Lba
        L7a:
            r0 = move-exception
            goto L1bd
        L7d:
            r1.b()     // Catch: java.lang.Throwable -> L7a
            a0.c r3 = a0.n.i     // Catch: java.lang.Throwable -> L7a
            r.H r5 = r3.f8653h     // Catch: java.lang.Throwable -> L7a
            long r11 = r3.f8662b     // Catch: java.lang.Throwable -> L7a
            a0.l r6 = a0.n.f8681c     // Catch: java.lang.Throwable -> L7a
            r6.g(r11)     // Catch: java.lang.Throwable -> L7a
            long r13 = a0.n.f8682d     // Catch: java.lang.Throwable -> L7a
            long r8 = r8 + r13
            a0.n.f8682d = r8     // Catch: java.lang.Throwable -> L7a
            a0.l r6 = a0.n.f8681c     // Catch: java.lang.Throwable -> L7a
            a0.l r6 = r6.g(r11)     // Catch: java.lang.Throwable -> L7a
            a0.n.f8681c = r6     // Catch: java.lang.Throwable -> L7a
            r3.f8662b = r13     // Catch: java.lang.Throwable -> L7a
            r3.f8661a = r6     // Catch: java.lang.Throwable -> L7a
            r3.f8652g = r10     // Catch: java.lang.Throwable -> L7a
            r3.f8653h = r0     // Catch: java.lang.Throwable -> L7a
            r3.o()     // Catch: java.lang.Throwable -> L7a
            a0.l r3 = a0.n.f8681c     // Catch: java.lang.Throwable -> L7a
            a0.l r3 = r3.j(r13)     // Catch: java.lang.Throwable -> L7a
            a0.n.f8681c = r3     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto Lb8
            boolean r3 = r5.h()     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto Lb8
            java.lang.Object r2 = a0.n.f8684g     // Catch: java.lang.Throwable -> L7a
            r3 = r2
            r2 = r5
            goto Lba
        Lb8:
            r3 = r2
            r2 = r0
        Lba:
            monitor-exit(r7)
            r5 = 1
            r1.f8656m = r5
            if (r2 == 0) goto Le1
            R.h r5 = new R.h
            r5.<init>(r2)
            boolean r6 = r2.g()
            if (r6 != 0) goto Le1
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r7 = r10
        Ld3:
            if (r7 >= r6) goto Le1
            java.lang.Object r8 = r3.get(r7)
            B5.e r8 = (B5.e) r8
            r8.invoke(r5, r1)
            int r7 = r7 + 1
            goto Ld3
        Le1:
            if (r4 == 0) goto L104
            boolean r5 = r4.h()
            if (r5 == 0) goto L104
            R.h r5 = new R.h
            r5.<init>(r4)
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r7 = r10
        Lf6:
            if (r7 >= r6) goto L104
            java.lang.Object r8 = r3.get(r7)
            B5.e r8 = (B5.e) r8
            r8.invoke(r5, r1)
            int r7 = r7 + 1
            goto Lf6
        L104:
            java.lang.Object r3 = a0.n.f8680b
            monitor-enter(r3)
            r1.p()     // Catch: java.lang.Throwable -> L14d
            a0.n.g()     // Catch: java.lang.Throwable -> L14d
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            if (r2 == 0) goto L15c
            java.lang.Object[] r14 = r2.f16139b     // Catch: java.lang.Throwable -> L14d
            long[] r2 = r2.f16138a     // Catch: java.lang.Throwable -> L14d
            int r15 = r2.length     // Catch: java.lang.Throwable -> L14d
            int r15 = r15 + (-2)
            if (r15 < 0) goto L15c
            r5 = r10
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
        L124:
            r7 = r2[r5]     // Catch: java.lang.Throwable -> L14d
            r20 = 7
            long r9 = ~r7     // Catch: java.lang.Throwable -> L14d
            long r9 = r9 << r20
            long r9 = r9 & r7
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L156
            int r9 = r5 - r15
            int r9 = ~r9     // Catch: java.lang.Throwable -> L14d
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        L139:
            if (r10 >= r9) goto L154
            long r21 = r7 & r18
            int r21 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r21 >= 0) goto L150
            int r21 = r5 << 3
            int r21 = r21 + r10
            r21 = r14[r21]     // Catch: java.lang.Throwable -> L14d
            a0.u r21 = (a0.u) r21     // Catch: java.lang.Throwable -> L14d
            a0.n.q(r21)     // Catch: java.lang.Throwable -> L14d
            goto L150
        L14d:
            r0 = move-exception
            goto L1bb
        L150:
            long r7 = r7 >> r13
            int r10 = r10 + 1
            goto L139
        L154:
            if (r9 != r13) goto L162
        L156:
            if (r5 == r15) goto L162
            int r5 = r5 + 1
            r10 = 0
            goto L124
        L15c:
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
        L162:
            if (r4 == 0) goto L19e
            java.lang.Object[] r2 = r4.f16139b     // Catch: java.lang.Throwable -> L14d
            long[] r4 = r4.f16138a     // Catch: java.lang.Throwable -> L14d
            int r5 = r4.length     // Catch: java.lang.Throwable -> L14d
            int r5 = r5 + (-2)
            if (r5 < 0) goto L19e
            r7 = 0
        L16e:
            r8 = r4[r7]     // Catch: java.lang.Throwable -> L14d
            long r14 = ~r8     // Catch: java.lang.Throwable -> L14d
            long r14 = r14 << r20
            long r14 = r14 & r8
            long r14 = r14 & r11
            int r10 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r10 == 0) goto L199
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L14d
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r14 = 0
        L181:
            if (r14 >= r10) goto L197
            long r21 = r8 & r18
            int r15 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r15 >= 0) goto L193
            int r15 = r7 << 3
            int r15 = r15 + r14
            r15 = r2[r15]     // Catch: java.lang.Throwable -> L14d
            a0.u r15 = (a0.u) r15     // Catch: java.lang.Throwable -> L14d
            a0.n.q(r15)     // Catch: java.lang.Throwable -> L14d
        L193:
            long r8 = r8 >> r13
            int r14 = r14 + 1
            goto L181
        L197:
            if (r10 != r13) goto L19e
        L199:
            if (r7 == r5) goto L19e
            int r7 = r7 + 1
            goto L16e
        L19e:
            java.util.ArrayList r2 = r1.i     // Catch: java.lang.Throwable -> L14d
            if (r2 == 0) goto L1b5
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L14d
            r10 = 0
        L1a7:
            if (r10 >= r4) goto L1b5
            java.lang.Object r5 = r2.get(r10)     // Catch: java.lang.Throwable -> L14d
            a0.u r5 = (a0.u) r5     // Catch: java.lang.Throwable -> L14d
            a0.n.q(r5)     // Catch: java.lang.Throwable -> L14d
            int r10 = r10 + 1
            goto L1a7
        L1b5:
            r1.i = r0     // Catch: java.lang.Throwable -> L14d
            monitor-exit(r3)
            a0.j r0 = a0.j.f8665b
            return r0
        L1bb:
            monitor-exit(r3)
            throw r0
        L1bd:
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0602d.w():a0.r");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1549H x() {
        return this.f8653h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: e()LB5/c; */
    @Override // a0.AbstractC0606h
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public B5.c e() {
        return this.f8651e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r z(long j, C1549H c1549h, HashMap map, l lVar) {
        ArrayList arrayList;
        ArrayList arrayListU0;
        ArrayList arrayList2;
        l lVar2;
        Object[] objArr;
        long[] jArr;
        l lVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j7;
        ArrayList arrayList3;
        w wVarG;
        l lVarI = d().j(g()).i(this.j);
        Object[] objArr3 = c1549h.f16139b;
        long[] jArr3 = c1549h.f16138a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i7 = 0;
            arrayList2 = null;
            arrayListU0 = null;
            while (true) {
                long j8 = jArr3[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j8 & 255) < 128) {
                            objArr2 = objArr3;
                            u uVar = (u) objArr3[(i7 << 3) + i9];
                            jArr2 = jArr3;
                            w wVarD = uVar.d();
                            i = i9;
                            ArrayList arrayList4 = arrayList2;
                            w wVarS = n.s(wVarD, j, lVar);
                            if (wVarS == null) {
                                lVar3 = lVarI;
                                arrayList3 = arrayListU0;
                                j7 = j8;
                            } else {
                                arrayList3 = arrayListU0;
                                j7 = j8;
                                w wVarS2 = n.s(wVarD, g(), lVarI);
                                if (wVarS2 == null) {
                                    lVar3 = lVarI;
                                } else {
                                    lVar3 = lVarI;
                                    if (wVarS2.f8708a != 1 && !wVarS.equals(wVarS2)) {
                                        w wVarS3 = n.s(wVarD, g(), d());
                                        if (wVarS3 == null) {
                                            n.r();
                                            throw null;
                                        }
                                        if (map == null || (wVarG = (w) map.get(wVarS)) == null) {
                                            wVarG = uVar.g(wVarS2, wVarS, wVarS3);
                                        }
                                        if (wVarG == null) {
                                            return new C0607i();
                                        }
                                        if (!wVarG.equals(wVarS3)) {
                                            if (wVarG.equals(wVarS)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new C1371j(uVar, wVarS.b(g())));
                                                arrayListU0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListU0.add(uVar);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!wVarG.equals(wVarS2) ? new C1371j(uVar, wVarG) : new C1371j(uVar, wVarS2.b(g())));
                                            }
                                        }
                                        arrayListU0 = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListU0 = arrayList3;
                        } else {
                            lVar3 = lVarI;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i9;
                            j7 = j8;
                        }
                        j8 = j7 >> 8;
                        i9 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        lVarI = lVar3;
                    }
                    lVar2 = lVarI;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i8 != 8) {
                        break;
                    }
                } else {
                    lVar2 = lVarI;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i7 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i7++;
                jArr3 = jArr;
                objArr3 = objArr;
                lVarI = lVar2;
            }
        } else {
            arrayList = null;
            arrayListU0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1371j c1371j = (C1371j) arrayList2.get(i10);
                u uVar2 = (u) c1371j.f15080q;
                w wVar = (w) c1371j.f15081r;
                wVar.f8708a = j;
                synchronized (n.f8680b) {
                    wVar.f8709b = uVar2.d();
                    uVar2.h(wVar);
                }
            }
        }
        if (arrayListU0 != null) {
            int size2 = arrayListU0.size();
            for (int i11 = 0; i11 < size2; i11++) {
                c1549h.l((u) arrayListU0.get(i11));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListU0 = n5.l.u0(arrayList6, arrayListU0);
            }
            this.i = arrayListU0;
        }
        return j.f8665b;
    }
}
