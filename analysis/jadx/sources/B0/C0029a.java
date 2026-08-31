package B0;

import w.InterfaceC1788i0;

/* JADX INFO: renamed from: B0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0029a extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f362r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0029a(int i, Object obj) {
        super(1);
        this.f361q = i;
        this.f362r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05c4  */
    /* JADX WARN: Type inference failed for: r3v8, types: [B0.b, z0.J] */
    @Override // B5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            int r2 = r1.f361q
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 3
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            switch(r2) {
                case 0: goto L60a;
                case 1: goto L5fe;
                case 2: goto L5ed;
                case 3: goto L54d;
                case 4: goto L53a;
                case 5: goto L52e;
                case 6: goto L51c;
                case 7: goto L4fc;
                case 8: goto L45c;
                case 9: goto L450;
                case 10: goto L444;
                case 11: goto L435;
                case 12: goto L407;
                case 13: goto L3f9;
                case 14: goto L3eb;
                case 15: goto L3d7;
                case 16: goto L3ab;
                case 17: goto L396;
                case 18: goto L1b9;
                case 19: goto L19e;
                case 20: goto L157;
                case 21: goto L14d;
                case 22: goto L13c;
                case 23: goto L130;
                case 24: goto L116;
                case 25: goto Le9;
                case 26: goto Lca;
                case 27: goto Lbe;
                case 28: goto L93;
                default: goto L10;
            }
        L10:
            j0.C r0 = (j0.C) r0
            java.lang.Object r2 = r1.f362r
            j0.F r2 = (j0.F) r2
            float r3 = r2.f13681E
            r0.c(r3)
            float r3 = r2.f13682F
            r0.e(r3)
            float r3 = r2.f13683G
            r0.a(r3)
            float r3 = r2.f13684H
            float r4 = r0.f13671u
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L2e
            goto L36
        L2e:
            int r4 = r0.f13667q
            r4 = r4 | 32
            r0.f13667q = r4
            r0.f13671u = r3
        L36:
            float r3 = r2.f13685I
            float r4 = r0.f13674x
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L3f
            goto L47
        L3f:
            int r4 = r0.f13667q
            r4 = r4 | 2048(0x800, float:2.87E-42)
            r0.f13667q = r4
            r0.f13674x = r3
        L47:
            long r3 = r2.f13686J
            r0.g(r3)
            j0.E r3 = r2.f13687K
            j0.E r4 = r0.f13676z
            boolean r4 = kotlin.jvm.internal.m.a(r4, r3)
            if (r4 != 0) goto L5e
            int r4 = r0.f13667q
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r0.f13667q = r4
            r0.f13676z = r3
        L5e:
            boolean r3 = r2.f13688L
            boolean r4 = r0.f13662A
            if (r4 == r3) goto L6c
            int r4 = r0.f13667q
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r0.f13667q = r4
            r0.f13662A = r3
        L6c:
            long r3 = r2.f13689M
            long r5 = r0.f13672v
            boolean r5 = j0.o.c(r5, r3)
            if (r5 != 0) goto L7e
            int r5 = r0.f13667q
            r5 = r5 | 64
            r0.f13667q = r5
            r0.f13672v = r3
        L7e:
            long r2 = r2.f13690N
            long r4 = r0.f13673w
            boolean r4 = j0.o.c(r4, r2)
            if (r4 != 0) goto L90
            int r4 = r0.f13667q
            r4 = r4 | 128(0x80, float:1.794E-43)
            r0.f13667q = r4
            r0.f13673w = r2
        L90:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L93:
            B0.D0 r2 = B0.D0.f221q
            f0.f r0 = (f0.f) r0
            c0.l r3 = r0.f10100q
            boolean r3 = r3.f10099D
            if (r3 != 0) goto La0
            B0.D0 r2 = B0.D0.f222r
            goto Lbd
        La0:
            f0.f r3 = r0.f12688F
            if (r3 == 0) goto Lb9
            java.lang.Object r4 = r1.f362r
            k3.c r4 = (k3.c) r4
            B0.a r5 = new B0.a
            r6 = 28
            r5.<init>(r6, r4)
            java.lang.Object r4 = r5.invoke(r3)
            if (r4 == r2) goto Lb6
            goto Lb9
        Lb6:
            B0.AbstractC0041g.y(r3, r5)
        Lb9:
            r0.f12688F = r7
            r0.f12687E = r7
        Lbd:
            return r2
        Lbe:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r0 = r1.f362r
            I4.b r0 = (I4.b) r0
            r0.cancel(r6)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        Lca:
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r2 = "it"
            kotlin.jvm.internal.m.e(r0, r2)
            a2.b r0 = new a2.b
            java.lang.Object r2 = r1.f362r
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = "context"
            kotlin.jvm.internal.m.e(r2, r3)
            android.adservices.measurement.MeasurementManager r2 = O3.AbstractC0320s0.b(r2)
            java.lang.String r3 = "get(context)"
            kotlin.jvm.internal.m.d(r2, r3)
            r0.<init>(r2)
            return r0
        Le9:
            java.lang.Object r2 = r1.f362r
            a0.t r2 = (a0.t) r2
            java.lang.Object r3 = r2.f8705g
            monitor-enter(r3)
            a0.s r2 = r2.i     // Catch: java.lang.Throwable -> L113
            kotlin.jvm.internal.m.b(r2)     // Catch: java.lang.Throwable -> L113
            java.lang.Object r4 = r2.f8692b     // Catch: java.lang.Throwable -> L113
            kotlin.jvm.internal.m.b(r4)     // Catch: java.lang.Throwable -> L113
            int r5 = r2.f8694d     // Catch: java.lang.Throwable -> L113
            r.B r6 = r2.f8693c     // Catch: java.lang.Throwable -> L113
            if (r6 != 0) goto L10c
            r.B r6 = new r.B     // Catch: java.lang.Throwable -> L113
            r6.<init>()     // Catch: java.lang.Throwable -> L113
            r2.f8693c = r6     // Catch: java.lang.Throwable -> L113
            r.G r7 = r2.f     // Catch: java.lang.Throwable -> L113
            r7.l(r4, r6)     // Catch: java.lang.Throwable -> L113
        L10c:
            r2.c(r0, r5, r4, r6)     // Catch: java.lang.Throwable -> L113
            monitor-exit(r3)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L113:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L116:
            a0.l r0 = (a0.l) r0
            java.lang.Object r2 = a0.n.f8680b
            monitor-enter(r2)
            long r3 = a0.n.f8682d     // Catch: java.lang.Throwable -> L12d
            r5 = 1
            long r5 = r5 + r3
            a0.n.f8682d = r5     // Catch: java.lang.Throwable -> L12d
            monitor-exit(r2)
            java.lang.Object r2 = r1.f362r
            B5.c r2 = (B5.c) r2
            a0.g r5 = new a0.g
            r5.<init>(r3, r0, r2)
            return r5
        L12d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L130:
            W0.c r0 = (W0.c) r0
            java.lang.Object r2 = r1.f362r
            B0.L r2 = (B0.L) r2
            r2.V(r0)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L13c:
            java.lang.Object r2 = r1.f362r
            Z.f r2 = (Z.f) r2
            Z.i r2 = r2.f8302c
            if (r2 == 0) goto L148
            boolean r8 = r2.a(r0)
        L148:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L14d:
            java.lang.Object r2 = r1.f362r
            P.u r2 = (P.C0382u) r2
            r2.x(r0)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L157:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r2 = "Recomposer effect job completed"
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            r3.<init>(r2)
            r3.initCause(r0)
            java.lang.Object r2 = r1.f362r
            P.v0 r2 = (P.C0385v0) r2
            java.lang.Object r4 = r2.f5555b
            monitor-enter(r4)
            M5.b0 r5 = r2.f5556c     // Catch: java.lang.Throwable -> L18a
            if (r5 == 0) goto L18c
            P5.S r6 = r2.f5570t     // Catch: java.lang.Throwable -> L18a
            P.p0 r8 = P.EnumC0374p0.f5491r     // Catch: java.lang.Throwable -> L18a
            r6.getClass()     // Catch: java.lang.Throwable -> L18a
            r6.h(r7, r8)     // Catch: java.lang.Throwable -> L18a
            P5.S r6 = P.C0385v0.f5552x     // Catch: java.lang.Throwable -> L18a
            r5.a(r3)     // Catch: java.lang.Throwable -> L18a
            r2.f5567q = r7     // Catch: java.lang.Throwable -> L18a
            A.Y r3 = new A.Y     // Catch: java.lang.Throwable -> L18a
            r6 = 18
            r3.<init>(r6, r2, r0)     // Catch: java.lang.Throwable -> L18a
            r5.G(r3)     // Catch: java.lang.Throwable -> L18a
            goto L198
        L18a:
            r0 = move-exception
            goto L19c
        L18c:
            r2.f5557d = r3     // Catch: java.lang.Throwable -> L18a
            P5.S r0 = r2.f5570t     // Catch: java.lang.Throwable -> L18a
            P.p0 r2 = P.EnumC0374p0.f5490q     // Catch: java.lang.Throwable -> L18a
            r0.getClass()     // Catch: java.lang.Throwable -> L18a
            r0.h(r7, r2)     // Catch: java.lang.Throwable -> L18a
        L198:
            monitor-exit(r4)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L19c:
            monitor-exit(r4)
            throw r0
        L19e:
            O0.q r0 = (O0.q) r0
            java.lang.Object r2 = r1.f362r
            O0.e r2 = (O0.e) r2
            O0.j r5 = r0.f4290b
            int r6 = r0.f4291c
            int r7 = r0.f4292d
            java.lang.Object r8 = r0.f4293e
            O0.q r3 = new O0.q
            r4 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            O0.r r0 = r2.a(r3)
            java.lang.Object r0 = r0.f4294q
            return r0
        L1b9:
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r3 = "Iconics.init() not yet executed, icon will be missing"
            java.lang.String r5 = "A 'Iconics.init(context)' has to happen first. Call from your application. Usually this happens via an 'IconicsDrawable' usage."
            java.lang.String r9 = "IconicsDrawable"
            r10 = r0
            K4.d r10 = (K4.d) r10
            java.lang.String r0 = "$this$apply"
            kotlin.jvm.internal.m.e(r10, r0)
            java.lang.Object r0 = r1.f362r
            r11 = r0
            k3.d r11 = (k3.d) r11
            java.lang.Object r0 = r11.f14122r
            r12 = r0
            android.content.res.TypedArray r12 = (android.content.res.TypedArray) r12
            r0 = 9
            java.lang.String r13 = r12.getString(r0)
            if (r13 == 0) goto L27d
            int r0 = r13.length()
            if (r0 != 0) goto L1e3
            goto L27d
        L1e3:
            java.lang.String r14 = "No font identified matching the given `"
            java.util.HashMap r0 = K4.a.f2902a
            android.content.Context r0 = O4.c.f5204b     // Catch: java.lang.Throwable -> L1f2
            if (r0 == 0) goto L1ec
            goto L1f7
        L1ec:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1f2
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L1f2
            throw r0     // Catch: java.lang.Throwable -> L1f2
        L1f2:
            r0 = move-exception
            m5.l r0 = m5.AbstractC1362a.b(r0)
        L1f7:
            boolean r0 = r0 instanceof m5.C1373l
            if (r0 == 0) goto L1fe
            android.util.Log.e(r9, r3)
        L1fe:
            java.lang.String r0 = r13.substring(r6, r4)     // Catch: java.lang.Exception -> L26b
            kotlin.jvm.internal.m.d(r0, r2)     // Catch: java.lang.Exception -> L26b
            java.util.HashMap r15 = O4.c.f5205c     // Catch: java.lang.Exception -> L26b
            java.lang.Object r0 = r15.get(r0)     // Catch: java.lang.Exception -> L26b
            O4.b r0 = (O4.b) r0     // Catch: java.lang.Exception -> L26b
            if (r0 != 0) goto L22b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26b
            r0.<init>(r14)     // Catch: java.lang.Exception -> L26b
            java.lang.String r3 = r13.substring(r6, r4)     // Catch: java.lang.Exception -> L26b
            kotlin.jvm.internal.m.d(r3, r2)     // Catch: java.lang.Exception -> L26b
            r0.append(r3)     // Catch: java.lang.Exception -> L26b
            java.lang.String r2 = "` prefix"
            r0.append(r2)     // Catch: java.lang.Exception -> L26b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L26b
            android.util.Log.w(r9, r0)     // Catch: java.lang.Exception -> L26b
            goto L27d
        L22b:
            java.lang.String r2 = "-"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Exception -> L26b
            java.lang.String r14 = "compile(...)"
            kotlin.jvm.internal.m.d(r2, r14)     // Catch: java.lang.Exception -> L26b
            java.lang.String r14 = "_"
            java.util.regex.Matcher r2 = r2.matcher(r13)     // Catch: java.lang.Exception -> L26b
            java.lang.String r2 = r2.replaceAll(r14)     // Catch: java.lang.Exception -> L26b
            java.lang.String r14 = "replaceAll(...)"
            kotlin.jvm.internal.m.d(r2, r14)     // Catch: java.lang.Exception -> L26b
            O4.a r2 = r0.getIcon(r2)     // Catch: java.lang.Exception -> L26b
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.m.e(r2, r0)     // Catch: java.lang.Exception -> L26b
            java.util.HashMap r0 = K4.a.f2902a     // Catch: java.lang.Exception -> L26b
            android.content.Context r0 = O4.c.f5204b     // Catch: java.lang.Throwable -> L25b
            if (r0 == 0) goto L255
            goto L260
        L255:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L25b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L25b
            throw r0     // Catch: java.lang.Throwable -> L25b
        L25b:
            r0 = move-exception
            m5.l r0 = m5.AbstractC1362a.b(r0)     // Catch: java.lang.Exception -> L26b
        L260:
            boolean r0 = r0 instanceof m5.C1373l     // Catch: java.lang.Exception -> L26b
            if (r0 == 0) goto L267
            android.util.Log.e(r9, r3)     // Catch: java.lang.Exception -> L26b
        L267:
            r10.e(r2)     // Catch: java.lang.Exception -> L26b
            goto L27d
        L26b:
            Q4.a r0 = K4.a.f2904c
            java.lang.String r2 = K4.a.f2903b
            java.lang.String r3 = "TAG"
            kotlin.jvm.internal.m.d(r2, r3)
            java.lang.String r3 = "Wrong icon name: "
            java.lang.String r3 = r3.concat(r13)
            r0.a(r2, r3, r7)
        L27d:
            r0 = 5
            android.content.res.ColorStateList r0 = r12.getColorStateList(r0)
            if (r0 == 0) goto L295
            K4.b r2 = r10.f2944c
            r2.f2907c = r0
            int[] r0 = r10.getState()
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L295
            r10.a()
        L295:
            r0 = 17
            java.lang.Integer r0 = k3.d.r(r11, r12, r0)
            if (r0 == 0) goto L2af
            int r0 = r0.intValue()
            r10.f2953o = r0
            int r2 = r10.f2954p
            r10.setBounds(r6, r6, r0, r2)
            r10.f2954p = r0
            int r2 = r10.f2953o
            r10.setBounds(r6, r6, r2, r0)
        L2af:
            r0 = 12
            java.lang.Integer r0 = k3.d.r(r11, r12, r0)
            if (r0 == 0) goto L2be
            int r0 = r0.intValue()
            r10.f(r0)
        L2be:
            r0 = 6
            android.content.res.ColorStateList r0 = r12.getColorStateList(r0)
            if (r0 == 0) goto L2d6
            K4.b r2 = r10.f
            r2.f2907c = r0
            int[] r0 = r10.getState()
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L2d6
            r10.a()
        L2d6:
            r0 = 7
            java.lang.Integer r0 = k3.d.r(r11, r12, r0)
            if (r0 == 0) goto L2ff
            int r0 = r0.intValue()
            r10.f2960v = r0
            K4.b r2 = r10.f
            android.graphics.Paint r2 = r2.f2905a
            float r0 = (float) r0
            r2.setStrokeWidth(r0)
            boolean r0 = r10.f2955q
            if (r8 == r0) goto L2fc
            r10.f2955q = r8
            int r0 = r10.f2959u
            int r2 = r10.f2960v
            int r2 = r2 + r0
            r10.f(r2)
            r10.a()
        L2fc:
            r10.a()
        L2ff:
            r0 = 2
            android.content.res.ColorStateList r0 = r12.getColorStateList(r0)
            if (r0 == 0) goto L309
            r10.c(r0)
        L309:
            r0 = 8
            java.lang.Integer r0 = k3.d.r(r11, r12, r0)
            if (r0 == 0) goto L320
            int r0 = r0.intValue()
            float r0 = (float) r0
            r10.f2957s = r0
            r10.a()
            r10.f2958t = r0
            r10.a()
        L320:
            android.content.res.ColorStateList r0 = r12.getColorStateList(r4)
            if (r0 == 0) goto L337
            K4.b r2 = r10.f2945d
            r2.f2907c = r0
            int[] r0 = r10.getState()
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L337
            r10.a()
        L337:
            r0 = 4
            java.lang.Integer r0 = k3.d.r(r11, r12, r0)
            if (r0 == 0) goto L352
            int r0 = r0.intValue()
            r10.f2961w = r0
            K4.b r2 = r10.f2945d
            android.graphics.Paint r2 = r2.f2905a
            float r0 = (float) r0
            r2.setStrokeWidth(r0)
            r10.d(r8)
            r10.a()
        L352:
            r0 = 16
            java.lang.Integer r14 = k3.d.r(r11, r12, r0)
            r0 = 14
            java.lang.Integer r15 = k3.d.r(r11, r12, r0)
            r0 = 15
            java.lang.Integer r16 = k3.d.r(r11, r12, r0)
            r0 = 13
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r12.getColor(r0, r2)
            if (r14 == 0) goto L387
            if (r15 == 0) goto L387
            if (r16 == 0) goto L387
            if (r0 == r2) goto L387
            A.P r13 = new A.P
            r18 = 1
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            r10.f2952n = r6
            r13.invoke(r10)
            r10.f2952n = r8
            r10.j()
        L387:
            boolean r0 = r12.getBoolean(r8, r6)
            r10.f2950l = r0
            r10.setAutoMirrored(r0)
            r10.a()
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L396:
            java.lang.Number r0 = (java.lang.Number) r0
            r0.floatValue()
            java.lang.Object r0 = r1.f362r
            W0.c r0 = (W0.c) r0
            r2 = 56
            float r2 = (float) r2
            float r0 = r0.u(r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L3ab:
            j0.C r0 = (j0.C) r0
            java.lang.Object r2 = r1.f362r
            u.c r2 = (u.C1642c) r2
            java.lang.Object r2 = r2.d()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r3 = M.AbstractC0210g0.d(r0, r2)
            float r2 = M.AbstractC0210g0.e(r0, r2)
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L3ca
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3cc
        L3ca:
            float r2 = r3 / r2
        L3cc:
            r0.e(r2)
            long r2 = M.AbstractC0210g0.f3489c
            r0.g(r2)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L3d7:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r1.f362r
            E.Q r2 = (E.Q) r2
            java.lang.Object r2 = r2.invoke()
            java.lang.Float r2 = (java.lang.Float) r2
            r0.add(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L3eb:
            I0.i r0 = (I0.i) r0
            java.lang.Object r2 = r1.f362r
            I0.f r2 = (I0.f) r2
            int r2 = r2.f2230a
            I0.r.d(r0, r2)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L3f9:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L404
            java.lang.Object r0 = r1.f362r
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
            r0.cancel()
        L404:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L407:
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r2 = r1.f362r
            F.U r2 = (F.U) r2
            F.e r2 = r2.f1851b
            int r3 = r2.n()
            if (r3 == 0) goto L420
            int r3 = r2.n()
            float r3 = (float) r3
            float r5 = r0 / r3
        L420:
            int r0 = D5.a.G(r5)
            int r3 = r2.j()
            int r3 = r3 + r0
            int r0 = r2.i(r3)
            P.c0 r2 = r2.f1833s
            r2.f(r0)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L435:
            java.lang.Object r2 = r1.f362r
            Z.i r2 = (Z.i) r2
            if (r2 == 0) goto L43f
            boolean r8 = r2.a(r0)
        L43f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        L444:
            P.F r0 = (P.F) r0
            java.lang.Object r0 = r1.f362r
            E.G r0 = (E.G) r0
            C0.Y r2 = new C0.Y
            r2.<init>(r4, r0)
            return r2
        L450:
            P.F r0 = (P.F) r0
            java.lang.Object r0 = r1.f362r
            E.t r0 = (E.C0136t) r0
            C0.Y r2 = new C0.Y
            r2.<init>(r8, r0)
            return r2
        L45c:
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r2 = r1.f362r
            D.y r2 = (D.y) r2
            float r0 = -r0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 >= 0) goto L471
            boolean r4 = r2.c()
            if (r4 == 0) goto L4f6
        L471:
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L47d
            boolean r4 = r2.a()
            if (r4 != 0) goto L47d
            goto L4f6
        L47d:
            float r4 = r2.f1310g
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L488
            goto L48d
        L488:
            java.lang.String r4 = "entered drag with non-zero pending scroll"
            z.AbstractC1923a.c(r4)
        L48d:
            float r4 = r2.f1310g
            float r4 = r4 + r0
            r2.f1310g = r4
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 <= 0) goto L4e4
            float r4 = r2.f1310g
            int r6 = D5.a.G(r4)
            P.f0 r9 = r2.f1309e
            java.lang.Object r9 = r9.getValue()
            D.o r9 = (D.o) r9
            boolean r10 = r2.f1306b
            r10 = r10 ^ r8
            D.o r9 = r9.f(r6, r10)
            if (r9 == 0) goto L4bd
            D.o r10 = r2.f1307c
            if (r10 == 0) goto L4bd
            D.o r6 = r10.f(r6, r8)
            if (r6 == 0) goto L4be
            r2.f1307c = r6
        L4bd:
            r7 = r9
        L4be:
            if (r7 == 0) goto L4d3
            boolean r6 = r2.f1306b
            r2.f(r7, r6, r8)
            P.W r6 = r2.f1319r
            m5.y r8 = m5.C1386y.f15098a
            r6.setValue(r8)
            float r6 = r2.f1310g
            float r4 = r4 - r6
            r2.h(r4, r7)
            goto L4e4
        L4d3:
            B0.L r6 = r2.j
            if (r6 == 0) goto L4da
            r6.l()
        L4da:
            float r6 = r2.f1310g
            float r4 = r4 - r6
            D.o r6 = r2.g()
            r2.h(r4, r6)
        L4e4:
            float r4 = r2.f1310g
            float r4 = java.lang.Math.abs(r4)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 > 0) goto L4f0
        L4ee:
            r5 = r0
            goto L4f6
        L4f0:
            float r3 = r2.f1310g
            float r0 = r0 - r3
            r2.f1310g = r5
            goto L4ee
        L4f6:
            float r0 = -r5
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L4fc:
            l0.d r0 = (l0.InterfaceC1221d) r0
            java.lang.Object r2 = r1.f362r
            C0.C0 r2 = (C0.C0) r2
            B0.G0 r3 = r0.z()
            j0.m r3 = r3.t()
            B5.e r2 = r2.f801t
            if (r2 == 0) goto L519
            B0.G0 r0 = r0.z()
            java.lang.Object r0 = r0.f235s
            m0.c r0 = (m0.C1348c) r0
            r2.invoke(r3, r0)
        L519:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L51c:
            m5.y r0 = m5.C1386y.f15098a
            java.util.concurrent.atomic.AtomicBoolean r2 = C0.B0.f785b
            boolean r2 = r2.compareAndSet(r6, r8)
            if (r2 == 0) goto L52d
            java.lang.Object r2 = r1.f362r
            O5.e r2 = (O5.e) r2
            r2.j(r0)
        L52d:
            return r0
        L52e:
            P.F r0 = (P.F) r0
            java.lang.Object r0 = r1.f362r
            C0.w0 r0 = (C0.C0109w0) r0
            C0.Y r2 = new C0.Y
            r2.<init>(r6, r0)
            return r2
        L53a:
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            java.lang.Object r2 = r1.f362r
            P.W r2 = (P.W) r2
            android.content.res.Configuration r3 = new android.content.res.Configuration
            r3.<init>(r0)
            P.z r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f9340a
            r2.setValue(r3)
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L54d:
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r2 = r1.f362r
            C.A r2 = (C.A) r2
            float r0 = -r0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 >= 0) goto L562
            boolean r4 = r2.c()
            if (r4 == 0) goto L5e7
        L562:
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L56e
            boolean r4 = r2.a()
            if (r4 != 0) goto L56e
            goto L5e7
        L56e:
            float r4 = r2.f568g
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L579
            goto L57e
        L579:
            java.lang.String r4 = "entered drag with non-zero pending scroll"
            z.AbstractC1923a.c(r4)
        L57e:
            float r4 = r2.f568g
            float r4 = r4 + r0
            r2.f568g = r4
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 <= 0) goto L5d5
            float r4 = r2.f568g
            int r6 = java.lang.Math.round(r4)
            P.f0 r9 = r2.f567e
            java.lang.Object r9 = r9.getValue()
            C.s r9 = (C.s) r9
            boolean r10 = r2.f564b
            r10 = r10 ^ r8
            C.s r9 = r9.f(r6, r10)
            if (r9 == 0) goto L5ae
            C.s r10 = r2.f565c
            if (r10 == 0) goto L5ae
            C.s r6 = r10.f(r6, r8)
            if (r6 == 0) goto L5af
            r2.f565c = r6
        L5ae:
            r7 = r9
        L5af:
            if (r7 == 0) goto L5c4
            boolean r6 = r2.f564b
            r2.f(r7, r6, r8)
            P.W r6 = r2.f580u
            m5.y r8 = m5.C1386y.f15098a
            r6.setValue(r8)
            float r6 = r2.f568g
            float r4 = r4 - r6
            r2.h(r4, r7)
            goto L5d5
        L5c4:
            B0.L r6 = r2.j
            if (r6 == 0) goto L5cb
            r6.l()
        L5cb:
            float r6 = r2.f568g
            float r4 = r4 - r6
            C.s r6 = r2.g()
            r2.h(r4, r6)
        L5d5:
            float r4 = r2.f568g
            float r4 = java.lang.Math.abs(r4)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 > 0) goto L5e1
        L5df:
            r5 = r0
            goto L5e7
        L5e1:
            float r3 = r2.f568g
            float r0 = r0 - r3
            r2.f568g = r5
            goto L5df
        L5e7:
            float r0 = -r5
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L5ed:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r2 = r1.f362r
            C.n r2 = (C.n) r2
            long r3 = r2.f632c
            C.t r0 = r2.a(r0, r3)
            return r0
        L5fe:
            c0.k r0 = (c0.InterfaceC0723k) r0
            java.lang.Object r2 = r1.f362r
            R.e r2 = (R.e) r2
            r2.c(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L60a:
            B0.b r0 = (B0.InterfaceC0031b) r0
            java.lang.Object r2 = r1.f362r
            B0.M r2 = (B0.M) r2
            boolean r3 = r0.A()
            if (r3 != 0) goto L618
            goto L692
        L618:
            B0.M r3 = r0.c()
            boolean r3 = r3.f290b
            if (r3 == 0) goto L623
            r0.t()
        L623:
            B0.M r3 = r0.c()
            java.util.HashMap r3 = r3.f294g
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L631:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L655
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            z0.l r5 = (z0.C1952l) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            B0.v r6 = r0.n()
            B0.M.a(r2, r5, r4, r6)
            goto L631
        L655:
            B0.v r0 = r0.n()
            B0.n0 r0 = r0.f480D
            kotlin.jvm.internal.m.b(r0)
        L65e:
            z0.J r3 = r2.f289a
            B0.v r3 = r3.n()
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L692
            java.util.Map r3 = r2.b(r0)
            java.util.Set r3 = r3.keySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L678:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L68c
            java.lang.Object r4 = r3.next()
            z0.l r4 = (z0.C1952l) r4
            int r5 = r2.c(r0, r4)
            B0.M.a(r2, r4, r5, r0)
            goto L678
        L68c:
            B0.n0 r0 = r0.f480D
            kotlin.jvm.internal.m.b(r0)
            goto L65e
        L692:
            m5.y r0 = m5.C1386y.f15098a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0029a.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0029a(F.U u6, InterfaceC1788i0 interfaceC1788i0) {
        super(1);
        this.f361q = 12;
        this.f362r = u6;
    }
}
