package J;

import B0.A0;
import B0.InterfaceC0051p;
import B0.InterfaceC0060z;
import H5.k;
import I0.h;
import I0.i;
import I0.p;
import I0.r;
import I0.s;
import L0.C0192d;
import L0.F;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.HashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0724l implements InterfaceC0060z, InterfaceC0051p, A0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f2481E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public F f2482F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public O0.d f2483G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f2484H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f2485I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f2486J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f2487K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public HashMap f2488L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public d f2489M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public f f2490N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public e f2491O;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.A0
    public final void A(i iVar) {
        f fVar = this.f2490N;
        if (fVar == null) {
            fVar = new f(this, 0);
            this.f2490N = fVar;
        }
        C0192d c0192d = new C0192d(this.f2481E);
        k[] kVarArr = r.f2326a;
        iVar.j(p.f2323y, AbstractC0836n2.z(c0192d));
        e eVar = this.f2491O;
        if (eVar != null) {
            boolean z5 = eVar.f2477c;
            s sVar = p.f2291A;
            k[] kVarArr2 = r.f2326a;
            k kVar = kVarArr2[15];
            sVar.a(iVar, Boolean.valueOf(z5));
            C0192d c0192d2 = new C0192d(eVar.f2476b);
            s sVar2 = p.f2324z;
            k kVar2 = kVarArr2[14];
            sVar2.a(iVar, c0192d2);
        }
        iVar.j(h.f2241k, new I0.a(null, new f(this, 1)));
        iVar.j(h.f2242l, new I0.a(null, new f(this, 2)));
        iVar.j(h.f2243m, new I0.a(null, new A0.d(3, this)));
        iVar.j(h.f2234a, new I0.a(null, fVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0018  */
    @Override // B0.InterfaceC0051p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(B0.N r18) {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r1.f10099D
            if (r0 != 0) goto L8
            goto Le9
        L8:
            J.e r0 = r1.f2491O
            if (r0 == 0) goto L18
            boolean r2 = r0.f2477c
            if (r2 == 0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L18
            J.d r0 = r0.f2478d
            if (r0 != 0) goto L1c
        L18:
            J.d r0 = r1.x0()
        L1c:
            L0.a r2 = r0.j
            if (r2 == 0) goto Lf0
            r3 = r18
            l0.b r3 = r3.f296q
            B0.G0 r3 = r3.f14425r
            j0.m r4 = r3.t()
            boolean r3 = r0.f2469k
            if (r3 == 0) goto L47
            long r5 = r0.f2470l
            r0 = 32
            long r7 = r5 >> r0
            int r0 = (int) r7
            float r7 = (float) r0
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r8
            int r0 = (int) r5
            float r8 = (float) r0
            r4.k()
            r6 = 0
            r9 = 1
            r5 = 0
            r4.g(r5, r6, r7, r8, r9)
        L47:
            L0.F r0 = r1.f2482F     // Catch: java.lang.Throwable -> L52
            L0.y r0 = r0.f3091a     // Catch: java.lang.Throwable -> L52
            V0.l r5 = r0.f3236m     // Catch: java.lang.Throwable -> L52
            if (r5 != 0) goto L55
            V0.l r5 = V0.l.f7937b     // Catch: java.lang.Throwable -> L52
            goto L55
        L52:
            r0 = move-exception
            goto Lea
        L55:
            j0.D r6 = r0.f3237n     // Catch: java.lang.Throwable -> L52
            if (r6 != 0) goto L5b
            j0.D r6 = j0.D.f13677d     // Catch: java.lang.Throwable -> L52
        L5b:
            l0.c r7 = r0.f3238o     // Catch: java.lang.Throwable -> L52
            if (r7 != 0) goto L61
            l0.f r7 = l0.C1223f.f14430b     // Catch: java.lang.Throwable -> L52
        L61:
            V0.p r0 = r0.f3227a     // Catch: java.lang.Throwable -> L52
            j0.B r0 = r0.b()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto Lac
            L0.F r8 = r1.f2482F     // Catch: java.lang.Throwable -> L52
            L0.y r8 = r8.f3091a     // Catch: java.lang.Throwable -> L52
            V0.p r8 = r8.f3227a     // Catch: java.lang.Throwable -> L52
            float r8 = r8.c()     // Catch: java.lang.Throwable -> L52
            S0.d r9 = r2.f3096a     // Catch: java.lang.Throwable -> L52
            S0.e r9 = r9.f7286g     // Catch: java.lang.Throwable -> L52
            int r10 = r9.f7292c     // Catch: java.lang.Throwable -> L52
            float r11 = r2.c()     // Catch: java.lang.Throwable -> L52
            float r12 = r2.b()     // Catch: java.lang.Throwable -> L52
            int r11 = java.lang.Float.floatToRawIntBits(r11)     // Catch: java.lang.Throwable -> L52
            long r13 = (long) r11     // Catch: java.lang.Throwable -> L52
            int r11 = java.lang.Float.floatToRawIntBits(r12)     // Catch: java.lang.Throwable -> L52
            long r11 = (long) r11     // Catch: java.lang.Throwable -> L52
            r15 = 32
            long r13 = r13 << r15
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r15
            long r11 = r11 | r13
            r9.c(r0, r11, r8)     // Catch: java.lang.Throwable -> L52
            r9.f(r6)     // Catch: java.lang.Throwable -> L52
            r9.g(r5)     // Catch: java.lang.Throwable -> L52
            r9.e(r7)     // Catch: java.lang.Throwable -> L52
            r0 = 3
            r9.b(r0)     // Catch: java.lang.Throwable -> L52
            r2.d(r4)     // Catch: java.lang.Throwable -> L52
            r9.b(r10)     // Catch: java.lang.Throwable -> L52
            goto Le4
        Lac:
            long r8 = j0.o.f13722g     // Catch: java.lang.Throwable -> L52
            r10 = 16
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto Lb5
            goto Lc8
        Lb5:
            L0.F r0 = r1.f2482F     // Catch: java.lang.Throwable -> L52
            long r8 = r0.b()     // Catch: java.lang.Throwable -> L52
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto Lc6
            L0.F r0 = r1.f2482F     // Catch: java.lang.Throwable -> L52
            long r8 = r0.b()     // Catch: java.lang.Throwable -> L52
            goto Lc8
        Lc6:
            long r8 = j0.o.f13718b     // Catch: java.lang.Throwable -> L52
        Lc8:
            S0.d r0 = r2.f3096a     // Catch: java.lang.Throwable -> L52
            S0.e r0 = r0.f7286g     // Catch: java.lang.Throwable -> L52
            int r10 = r0.f7292c     // Catch: java.lang.Throwable -> L52
            r0.d(r8)     // Catch: java.lang.Throwable -> L52
            r0.f(r6)     // Catch: java.lang.Throwable -> L52
            r0.g(r5)     // Catch: java.lang.Throwable -> L52
            r0.e(r7)     // Catch: java.lang.Throwable -> L52
            r5 = 3
            r0.b(r5)     // Catch: java.lang.Throwable -> L52
            r2.d(r4)     // Catch: java.lang.Throwable -> L52
            r0.b(r10)     // Catch: java.lang.Throwable -> L52
        Le4:
            if (r3 == 0) goto Le9
            r4.i()
        Le9:
            return
        Lea:
            if (r3 == 0) goto Lef
            r4.i()
        Lef:
            throw r0
        Lf0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "no paragraph (layoutCache="
            r0.<init>(r2)
            J.d r2 = r1.f2489M
            r0.append(r2)
            java.lang.String r2 = ", textSubstitution="
            r0.append(r2)
            J.e r2 = r1.f2491O
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            z.AbstractC1923a.b(r0)
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J.g.J(B0.N):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b4  */
    @Override // B0.InterfaceC0060z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z0.InterfaceC1927D c(B0.T r24, z0.InterfaceC1925B r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            J.e r2 = r0.f2491O
            if (r2 == 0) goto L14
            boolean r3 = r2.f2477c
            if (r3 == 0) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L14
            J.d r2 = r2.f2478d
            if (r2 != 0) goto L18
        L14:
            J.d r2 = r0.x0()
        L18:
            r2.b(r1)
            W0.l r3 = r1.getLayoutDirection()
            int r4 = r2.f2467g
            r5 = 1
            if (r4 <= r5) goto L109
            L0.F r4 = r2.f2463b
            J.b r6 = r2.f2471m
            W0.c r7 = r2.i
            kotlin.jvm.internal.m.b(r7)
            O0.d r8 = r2.f2464c
            if (r6 == 0) goto L52
            W0.l r9 = r6.f2454a
            if (r3 != r9) goto L52
            L0.F r9 = E3.h.N(r4, r3)
            L0.F r10 = r6.f2455b
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L52
            float r9 = r7.b()
            W0.d r10 = r6.f2456c
            float r10 = r10.f8008q
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L52
            O0.d r9 = r6.f2457d
            if (r8 != r9) goto L52
            goto L8f
        L52:
            J.b r6 = J.b.f2453h
            if (r6 == 0) goto L77
            W0.l r9 = r6.f2454a
            if (r3 != r9) goto L77
            L0.F r9 = E3.h.N(r4, r3)
            L0.F r10 = r6.f2455b
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L77
            float r9 = r7.b()
            W0.d r10 = r6.f2456c
            float r10 = r10.f8008q
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L77
            O0.d r9 = r6.f2457d
            if (r8 != r9) goto L77
            goto L8f
        L77:
            J.b r6 = new J.b
            L0.F r4 = E3.h.N(r4, r3)
            float r9 = r7.b()
            float r7 = r7.l()
            W0.d r10 = new W0.d
            r10.<init>(r9, r7)
            r6.<init>(r3, r4, r10, r8)
            J.b.f2453h = r6
        L8f:
            r2.f2471m = r6
            int r4 = r2.f2467g
            W0.d r11 = r6.f2456c
            float r7 = r6.f2459g
            float r8 = r6.f
            boolean r9 = java.lang.Float.isNaN(r7)
            r14 = 0
            if (r9 != 0) goto La6
            boolean r9 = java.lang.Float.isNaN(r8)
            if (r9 == 0) goto Ldd
        La6:
            java.lang.String r7 = J.c.f2460a
            L0.F r8 = r6.f2458e
            r15 = 15
            long r9 = W0.b.b(r14, r14, r15)
            O0.d r12 = r6.f2457d
            r13 = 1
            L0.a r7 = C3.a.i(r7, r8, r9, r11, r12, r13)
            float r7 = r7.b()
            r8 = r7
            java.lang.String r7 = J.c.f2461b
            r9 = r8
            L0.F r8 = r6.f2458e
            long r12 = W0.b.b(r14, r14, r15)
            r21 = r12
            r13 = r9
            r9 = r21
            O0.d r12 = r6.f2457d
            r15 = r13
            r13 = 2
            L0.a r7 = C3.a.i(r7, r8, r9, r11, r12, r13)
            float r7 = r7.b()
            float r8 = r7 - r15
            r6.f2459g = r15
            r6.f = r8
            r7 = r15
        Ldd:
            r6 = 1
            if (r4 == r6) goto Lf4
            int r4 = r4 - r6
            float r4 = (float) r4
            float r8 = r8 * r4
            float r8 = r8 + r7
            int r4 = java.lang.Math.round(r8)
            if (r4 >= 0) goto Leb
            goto Lec
        Leb:
            r14 = r4
        Lec:
            int r4 = W0.a.g(r26)
            if (r14 <= r4) goto Lf8
            r14 = r4
            goto Lf8
        Lf4:
            int r14 = W0.a.i(r26)
        Lf8:
            int r4 = W0.a.g(r26)
            int r6 = W0.a.j(r26)
            int r7 = W0.a.h(r26)
            long r6 = W0.b.a(r6, r7, r14, r4)
            goto L10b
        L109:
            r6 = r26
        L10b:
            L0.a r4 = r2.j
            r8 = 0
            r9 = 2
            r10 = 3
            r13 = 32
            if (r4 != 0) goto L11b
        L114:
            r26 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L1cc
        L11b:
            L0.p r14 = r2.f2472n
            if (r14 != 0) goto L120
            goto L114
        L120:
            boolean r14 = r14.a()
            if (r14 == 0) goto L127
            goto L114
        L127:
            W0.l r14 = r2.f2473o
            if (r3 == r14) goto L12c
            goto L114
        L12c:
            long r14 = r2.f2474p
            boolean r14 = W0.a.b(r6, r14)
            if (r14 == 0) goto L13a
            r26 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L16f
        L13a:
            int r14 = W0.a.h(r6)
            r26 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r2.f2474p
            int r11 = W0.a.h(r11)
            if (r14 == r11) goto L14d
            goto L1cc
        L14d:
            int r11 = W0.a.j(r6)
            long r14 = r2.f2474p
            int r12 = W0.a.j(r14)
            if (r11 == r12) goto L15b
            goto L1cc
        L15b:
            int r11 = W0.a.g(r6)
            float r11 = (float) r11
            float r12 = r4.b()
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 < 0) goto L1cc
            M0.j r4 = r4.f3099d
            boolean r4 = r4.f3711d
            if (r4 == 0) goto L16f
            goto L1cc
        L16f:
            long r3 = r2.f2474p
            boolean r3 = W0.a.b(r6, r3)
            if (r3 != 0) goto L1c9
            L0.a r3 = r2.j
            kotlin.jvm.internal.m.b(r3)
            S0.d r4 = r3.f3096a
            M0.e r4 = r4.i
            float r4 = r4.c()
            float r11 = r3.c()
            float r4 = java.lang.Math.min(r4, r11)
            int r4 = E3.h.l(r4)
            float r11 = r3.b()
            int r11 = E3.h.l(r11)
            long r14 = (long) r4
            long r14 = r14 << r13
            long r11 = (long) r11
            long r11 = r11 & r26
            long r11 = r11 | r14
            long r11 = W0.b.d(r6, r11)
            r2.f2470l = r11
            int r4 = r2.f2465d
            if (r4 != r10) goto L1a9
            goto L1c2
        L1a9:
            long r14 = r11 >> r13
            int r4 = (int) r14
            float r4 = (float) r4
            float r10 = r3.c()
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L1c4
            long r10 = r11 & r26
            int r4 = (int) r10
            float r4 = (float) r4
            float r3 = r3.b()
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L1c2
            goto L1c4
        L1c2:
            r3 = r8
            goto L1c5
        L1c4:
            r3 = r5
        L1c5:
            r2.f2469k = r3
            r2.f2474p = r6
        L1c9:
            r3 = r8
            goto L2a2
        L1cc:
            L0.p r4 = r2.f2472n
            if (r4 == 0) goto L1da
            W0.l r11 = r2.f2473o
            if (r3 != r11) goto L1da
            boolean r11 = r4.a()
            if (r11 == 0) goto L1f9
        L1da:
            r2.f2473o = r3
            java.lang.String r15 = r2.f2462a
            L0.F r4 = r2.f2463b
            L0.F r16 = E3.h.N(r4, r3)
            W0.c r3 = r2.i
            kotlin.jvm.internal.m.b(r3)
            O0.d r4 = r2.f2464c
            S0.d r14 = new S0.d
            n5.s r17 = n5.s.f15299q
            r18 = r17
            r20 = r3
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r4 = r14
        L1f9:
            r2.f2472n = r4
            boolean r3 = r2.f2466e
            int r11 = r2.f2465d
            float r12 = r4.b()
            if (r3 != 0) goto L210
            r3 = 2
            if (r11 != r3) goto L209
            goto L210
        L209:
            r3 = 4
            if (r11 != r3) goto L20d
            goto L210
        L20d:
            r3 = 5
            if (r11 != r3) goto L21b
        L210:
            boolean r3 = W0.a.d(r6)
            if (r3 == 0) goto L21b
            int r3 = W0.a.h(r6)
            goto L21e
        L21b:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L21e:
            int r11 = W0.a.j(r6)
            if (r11 != r3) goto L225
            goto L231
        L225:
            int r11 = E3.h.l(r12)
            int r12 = W0.a.j(r6)
            int r3 = D5.a.q(r11, r12, r3)
        L231:
            int r11 = W0.a.g(r6)
            r12 = 0
            long r18 = a.AbstractC0597a.x(r12, r3, r12, r11)
            boolean r3 = r2.f2466e
            int r11 = r2.f2465d
            int r12 = r2.f
            if (r3 != 0) goto L24f
            if (r11 != r9) goto L245
            goto L24c
        L245:
            r3 = 4
            if (r11 != r3) goto L249
            goto L24c
        L249:
            r3 = 5
            if (r11 != r3) goto L24f
        L24c:
            r16 = r5
            goto L254
        L24f:
            if (r12 >= r5) goto L252
            goto L24c
        L252:
            r16 = r12
        L254:
            L0.a r14 = new L0.a
            r15 = r4
            S0.d r15 = (S0.d) r15
            r17 = r11
            r14.<init>(r15, r16, r17, r18)
            r2.f2474p = r6
            float r3 = r14.c()
            int r3 = E3.h.l(r3)
            float r4 = r14.b()
            int r4 = E3.h.l(r4)
            long r11 = (long) r3
            long r11 = r11 << r13
            long r3 = (long) r4
            long r3 = r3 & r26
            long r3 = r3 | r11
            long r3 = W0.b.d(r6, r3)
            r2.f2470l = r3
            int r6 = r2.f2465d
            if (r6 != r10) goto L281
            goto L29a
        L281:
            long r6 = r3 >> r13
            int r6 = (int) r6
            float r6 = (float) r6
            float r7 = r14.c()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L29c
            long r3 = r3 & r26
            int r3 = (int) r3
            float r3 = (float) r3
            float r4 = r14.b()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L29a
            goto L29c
        L29a:
            r3 = r8
            goto L29d
        L29c:
            r3 = r5
        L29d:
            r2.f2469k = r3
            r2.j = r14
            r3 = r5
        L2a2:
            L0.p r4 = r2.f2472n
            if (r4 == 0) goto L2a9
            r4.a()
        L2a9:
            L0.a r4 = r2.j
            kotlin.jvm.internal.m.b(r4)
            M0.j r4 = r4.f3099d
            long r6 = r2.f2470l
            if (r3 == 0) goto L2eb
            B0.n0 r2 = B0.AbstractC0041g.s(r0, r9)
            r2.I0()
            java.util.HashMap r2 = r0.f2488L
            if (r2 != 0) goto L2c6
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r9)
            r0.f2488L = r2
        L2c6:
            z0.l r3 = z0.AbstractC1943c.f18686a
            float r8 = r4.c(r8)
            int r8 = java.lang.Math.round(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2.put(r3, r8)
            z0.l r3 = z0.AbstractC1943c.f18687b
            int r8 = r4.f
            int r8 = r8 - r5
            float r4 = r4.c(r8)
            int r4 = java.lang.Math.round(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
        L2eb:
            long r2 = r6 >> r13
            int r2 = (int) r2
            long r3 = r6 & r26
            int r3 = (int) r3
            long r4 = a.AbstractC0597a.x(r2, r2, r3, r3)
            r6 = r25
            z0.J r4 = r6.a(r4)
            java.util.HashMap r5 = r0.f2488L
            kotlin.jvm.internal.m.b(r5)
            A.z r6 = new A.z
            r7 = 3
            r6.<init>(r4, r7)
            z0.D r1 = r1.O(r2, r3, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J.g.c(B0.T, z0.B, long):z0.D");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d x0() {
        if (this.f2489M == null) {
            this.f2489M = new d(this.f2481E, this.f2482F, this.f2483G, this.f2484H, this.f2485I, this.f2486J, this.f2487K);
        }
        d dVar = this.f2489M;
        m.b(dVar);
        return dVar;
    }
}
