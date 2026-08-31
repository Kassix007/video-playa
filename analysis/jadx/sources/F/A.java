package F;

import M5.InterfaceC0261w;
import c0.C0716d;
import x.C1881m;

/* JADX INFO: loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0151e f1752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A.L f1753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f1754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B5.a f1755t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B5.a f1756u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0716d f1757v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1881m f1758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0261w f1759x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C0151e c0151e, A.L l7, float f, H5.h hVar, B5.a aVar, C0716d c0716d, C1881m c1881m, InterfaceC0261w interfaceC0261w) {
        super(2);
        this.f1752q = c0151e;
        this.f1753r = l7;
        this.f1754s = f;
        this.f1755t = hVar;
        this.f1756u = aVar;
        this.f1757v = c0716d;
        this.f1758w = c1881m;
        this.f1759x = interfaceC0261w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034a  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:108:0x0375
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // B5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r52, java.lang.Object r53) {
        /*
            r51 = this;
            r1 = r51
            r3 = r52
            E.A r3 = (E.A) r3
            r0 = r53
            W0.a r0 = (W0.a) r0
            long r4 = r0.f8007a
            F.e r0 = r1.f1752q
            P.W r2 = r0.f1813C
            r2.getValue()
            w.d0 r9 = w.EnumC1778d0.f17946r
            y4.AbstractC1918b.j(r4, r9)
            z0.T r2 = r3.f1471r
            W0.l r2 = r2.getLayoutDirection()
            A.L r6 = r1.f1753r
            W0.l r15 = W0.l.f8022q
            if (r2 != r15) goto L29
            float r2 = r6.b(r2)
            goto L2d
        L29:
            float r2 = r6.c(r2)
        L2d:
            z0.T r7 = r3.f1471r
            int r10 = r7.G(r2)
            z0.T r2 = r3.f1471r
            W0.l r2 = r2.getLayoutDirection()
            if (r2 != r15) goto L40
            float r2 = r6.c(r2)
            goto L44
        L40:
            float r2 = r6.b(r2)
        L44:
            z0.T r7 = r3.f1471r
            int r2 = r7.G(r2)
            float r7 = r6.d()
            z0.T r8 = r3.f1471r
            int r7 = r8.G(r7)
            float r6 = r6.a()
            z0.T r11 = r3.f1471r
            int r6 = r11.G(r6)
            int r6 = r6 + r7
            int r2 = r2 + r10
            int r19 = r2 - r10
            int r8 = -r2
            int r12 = -r6
            long r12 = W0.b.h(r8, r12, r4)
            r0.f1831q = r3
            float r8 = r1.f1754s
            int r18 = r11.G(r8)
            int r8 = W0.a.h(r4)
            int r14 = r8 - r2
            r53 = r2
            r52 = r3
            long r2 = (long) r10
            r8 = 32
            long r2 = r2 << r8
            long r7 = (long) r7
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r16
            long r16 = r2 | r7
            if (r14 >= 0) goto L8c
            r3 = 0
            goto L8d
        L8c:
            r3 = r14
        L8d:
            int r7 = W0.a.g(r12)
            r8 = 5
            r20 = r4
            long r4 = W0.b.b(r3, r7, r8)
            r0.f1840z = r4
            B5.a r4 = r1.f1755t
            java.lang.Object r4 = r4.invoke()
            F.x r4 = (F.x) r4
            x.m r5 = r1.f1758w
            a0.h r7 = a0.r.c()
            r22 = r12
            if (r7 == 0) goto Lb1
            B5.c r12 = r7.e()
            goto Lb2
        Lb1:
            r12 = 0
        Lb2:
            a0.h r8 = a0.r.d(r7)
            int r13 = r0.j()     // Catch: java.lang.Throwable -> L763
            F.D r2 = r0.f1821d     // Catch: java.lang.Throwable -> L763
            r27 = r3
            java.lang.Object r3 = r2.f1780u     // Catch: java.lang.Throwable -> L763
            int r3 = E.C.i(r13, r4, r3)     // Catch: java.lang.Throwable -> L763
            if (r13 == r3) goto Ld7
            r28 = r5
            java.lang.Object r5 = r2.f1778s     // Catch: java.lang.Throwable -> L763
            P.c0 r5 = (P.C0348c0) r5     // Catch: java.lang.Throwable -> L763
            r5.f(r3)     // Catch: java.lang.Throwable -> L763
            java.lang.Object r5 = r2.f1781v     // Catch: java.lang.Throwable -> L763
            E.F r5 = (E.F) r5     // Catch: java.lang.Throwable -> L763
            r5.b(r13)     // Catch: java.lang.Throwable -> L763
            goto Ld9
        Ld7:
            r28 = r5
        Ld9:
            r0.j()     // Catch: java.lang.Throwable -> L763
            java.lang.Object r2 = r2.f1779t     // Catch: java.lang.Throwable -> L763
            P.b0 r2 = (P.C0346b0) r2     // Catch: java.lang.Throwable -> L763
            float r2 = r2.e()     // Catch: java.lang.Throwable -> L763
            r0.l()     // Catch: java.lang.Throwable -> L763
            r28.getClass()     // Catch: java.lang.Throwable -> L763
            r5 = 0
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L763
            r26 = r13
            int r13 = r27 + r18
            float r5 = (float) r13     // Catch: java.lang.Throwable -> L763
            float r2 = r2 * r5
            float r2 = r26 - r2
            int r29 = D5.a.G(r2)     // Catch: java.lang.Throwable -> L763
            a0.r.f(r7, r8, r12)
            E.H r2 = r0.f1811A
            E.k r5 = r0.f1836v
            java.util.List r12 = E.C.g(r4, r2, r5)
            B5.a r2 = r1.f1756u
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            P.W r5 = r0.f1812B
            c0.c r30 = c0.C0714b.f10074C
            r7 = r2
            C.m r2 = new C.m
            r8 = 2
            r24 = r9
            r9 = 5
            r48 = r3
            r3 = r52
            r52 = r13
            r13 = r7
            r7 = r6
            r6 = r53
            r53 = r15
            r15 = r5
            r49 = r20
            r20 = r48
            r21 = r4
            r4 = r49
            r2.<init>(r3, r4, r6, r7, r8)
            if (r10 < 0) goto L135
            goto L13a
        L135:
            java.lang.String r4 = "negative beforeContentPadding"
            z.AbstractC1923a.a(r4)
        L13a:
            if (r19 < 0) goto L13d
            goto L142
        L13d:
            java.lang.String r4 = "negative afterContentPadding"
            z.AbstractC1923a.a(r4)
        L142:
            if (r52 >= 0) goto L146
            r4 = 0
            goto L148
        L146:
            r4 = r52
        L148:
            x.m r5 = r1.f1758w
            M5.w r6 = r1.f1759x
            if (r13 > 0) goto L181
            int r3 = -r10
            int r21 = r14 + r19
            int r4 = W0.a.j(r22)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r7 = W0.a.i(r22)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            F.d r8 = F.C0150d.f1857s
            java.lang.Object r2 = r2.invoke(r4, r7, r8)
            r23 = r2
            z0.D r23 = (z0.InterfaceC1927D) r23
            F.B r16 = new F.B
            r20 = r3
            r22 = r5
            r24 = r6
            r17 = r27
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r25 = r0
            r34 = r11
            r6 = r16
            r3 = 0
            goto L759
        L181:
            r8 = r27
            r27 = r5
            r5 = r24
            r24 = r6
            int r6 = W0.a.g(r22)
            long r6 = W0.b.b(r8, r6, r9)
            r9 = r20
        L193:
            if (r9 <= 0) goto L19c
            if (r29 <= 0) goto L19c
            int r9 = r9 + (-1)
            int r29 = r29 - r4
            goto L193
        L19c:
            int r20 = r29 * (-1)
            if (r9 < r13) goto L1a4
            int r9 = r13 + (-1)
            r20 = 0
        L1a4:
            r28 = r13
            n5.j r13 = new n5.j
            r13.<init>()
            r29 = r13
            int r13 = -r10
            if (r18 >= 0) goto L1b5
            r32 = r18
        L1b2:
            r33 = r13
            goto L1b8
        L1b5:
            r32 = 0
            goto L1b2
        L1b8:
            int r13 = r33 + r32
            int r20 = r20 + r13
            r34 = r11
            r32 = r13
            r13 = r20
            r20 = r9
            r9 = 0
        L1c5:
            c0.d r11 = r1.f1757v
            r35 = r13
            r13 = 0
            if (r35 >= 0) goto L22c
            if (r20 <= 0) goto L22c
            int r20 = r20 + (-1)
            r36 = r12
            W0.l r12 = r34.getLayoutDirection()
            r25 = r0
            r41 = r2
            r2 = r3
            r1 = r9
            r39 = r18
            r3 = r20
            r37 = r22
            r0 = r35
            r40 = r36
            r22 = r4
            r9 = r5
            r4 = r6
            r18 = r10
            r6 = r21
            r10 = r30
            r21 = r52
            r52 = r14
            r14 = r8
            r7 = r16
            r16 = r15
            r15 = r29
            F.l r11 = a.AbstractC0597a.z(r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14)
            r12 = r9
            r9 = 0
            r15.add(r9, r11)
            int r11 = r11.j
            int r1 = java.lang.Math.max(r1, r11)
            int r13 = r0 + r22
            r9 = r1
            r15 = r16
            r10 = r18
            r0 = r25
            r18 = r39
            r1 = r51
            r3 = r2
            r16 = r7
            r8 = r14
            r2 = r41
            r14 = r52
            r52 = r21
            r21 = r6
            r6 = r4
            r5 = r12
            r4 = r22
            r22 = r37
            r12 = r40
            goto L1c5
        L22c:
            r25 = r0
            r41 = r2
            r2 = r3
            r1 = r9
            r40 = r12
            r39 = r18
            r37 = r22
            r0 = r35
            r9 = 0
            r22 = r4
            r12 = r5
            r4 = r6
            r18 = r10
            r6 = r21
            r10 = r30
            r21 = r52
            r52 = r14
            r14 = r8
            r7 = r16
            r16 = r15
            r15 = r29
            r3 = r32
            if (r0 >= r3) goto L255
            r0 = r3
        L255:
            int r0 = r0 - r3
            int r23 = r52 + r19
            if (r23 >= 0) goto L25c
            r13 = r9
            goto L25e
        L25c:
            r13 = r23
        L25e:
            int r9 = -r0
            r32 = r0
            r36 = r1
            r0 = r9
            r35 = r20
            r9 = 0
            r30 = 0
        L269:
            int r1 = r15.f15297s
            r42 = r2
            r2 = 1
            if (r9 >= r1) goto L281
            if (r0 < r13) goto L27a
            r15.g(r9)
            r30 = r2
        L277:
            r2 = r42
            goto L269
        L27a:
            int r35 = r35 + 1
            int r0 = r0 + r22
            int r9 = r9 + 1
            goto L277
        L281:
            r9 = r28
            r1 = r36
            r28 = r3
            r3 = r35
        L289:
            if (r3 >= r9) goto L299
            if (r0 < r13) goto L295
            if (r0 <= 0) goto L295
            boolean r35 = r15.isEmpty()
            if (r35 == 0) goto L299
        L295:
            r35 = r9
            r9 = r12
            goto L2a1
        L299:
            r2 = r3
            r35 = r9
            r9 = r12
            r3 = r0
            r0 = r52
            goto L2e9
        L2a1:
            W0.l r12 = r34.getLayoutDirection()
            r2 = r28
            r28 = r0
            r0 = r2
            r29 = r13
            r2 = r42
            r13 = 0
            F.l r12 = a.AbstractC0597a.z(r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14)
            r48 = r3
            r3 = r2
            r2 = r48
            int r13 = r35 + (-1)
            if (r2 != r13) goto L2c1
            r36 = r14
        L2be:
            r42 = r3
            goto L2c4
        L2c1:
            r36 = r22
            goto L2be
        L2c4:
            int r3 = r28 + r36
            if (r3 > r0) goto L2d3
            if (r2 == r13) goto L2d3
            int r12 = r2 + 1
            int r32 = r32 - r22
            r20 = r12
            r30 = 1
            goto L2dc
        L2d3:
            int r13 = r12.j
            int r1 = java.lang.Math.max(r1, r13)
            r15.addLast(r12)
        L2dc:
            int r2 = r2 + 1
            r28 = r0
            r0 = r3
            r12 = r9
            r13 = r29
            r9 = r35
            r3 = r2
            r2 = 1
            goto L289
        L2e9:
            if (r3 >= r0) goto L33d
            int r12 = r0 - r3
            int r32 = r32 - r12
            int r28 = r3 + r12
            r3 = r32
        L2f3:
            r12 = r18
            if (r3 >= r12) goto L324
            if (r20 <= 0) goto L324
            int r20 = r20 + (-1)
            r18 = r12
            W0.l r12 = r34.getLayoutDirection()
            r44 = r2
            r32 = r3
            r3 = r20
            r2 = r42
            r13 = 0
            F.l r12 = a.AbstractC0597a.z(r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14)
            r29 = r9
            r31 = r13
            r13 = 0
            r15.add(r13, r12)
            int r9 = r12.j
            int r1 = java.lang.Math.max(r1, r9)
            int r9 = r32 + r22
            r3 = r9
            r9 = r29
            r2 = r44
            goto L2f3
        L324:
            r44 = r2
            r32 = r3
            r29 = r9
            r18 = r12
            r2 = r42
            r13 = 0
            if (r32 >= 0) goto L337
            int r3 = r28 + r32
            r12 = r1
            r1 = r3
            r3 = r13
            goto L347
        L337:
            r12 = r1
            r1 = r28
        L33a:
            r3 = r32
            goto L347
        L33d:
            r44 = r2
            r29 = r9
            r2 = r42
            r13 = 0
            r12 = r1
            r1 = r3
            goto L33a
        L347:
            if (r3 < 0) goto L34a
            goto L34f
        L34a:
            java.lang.String r9 = "invalid currentFirstPageScrollOffset"
            z.AbstractC1923a.a(r9)
        L34f:
            int r9 = -r3
            java.lang.Object r10 = r15.first()
            F.l r10 = (F.C0158l) r10
            r13 = r39
            if (r18 > 0) goto L35c
            if (r13 >= 0) goto L35f
        L35c:
            r52 = r2
            goto L36d
        L35f:
            r52 = r14
            r14 = r10
            r10 = r52
            r52 = r2
            r18 = r3
            r31 = r11
            r11 = r22
            goto L3a4
        L36d:
            int r2 = r15.d()
            r18 = r10
            r10 = r3
            r3 = 0
        L375:
            if (r3 >= r2) goto L399
            if (r10 == 0) goto L399
            r31 = r11
            r11 = r22
            if (r11 > r10) goto L39d
            r22 = r2
            int r2 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r15)
            if (r3 == r2) goto L39d
            int r10 = r10 - r11
            int r3 = r3 + 1
            java.lang.Object r2 = r15.get(r3)
            r18 = r2
            F.l r18 = (F.C0158l) r18
            r2 = r22
            r22 = r11
            r11 = r31
            goto L375
        L399:
            r31 = r11
            r11 = r22
        L39d:
            r48 = r18
            r18 = r10
            r10 = r14
            r14 = r48
        L3a4:
            F.z r2 = new F.z
            r22 = r11
            r11 = 1
            r3 = r20
            r20 = r15
            r15 = r3
            r3 = r52
            r32 = r12
            r45 = r22
            r12 = r9
            r9 = r31
            r2.<init>(r3, r4, r6, r7, r9, r10, r11)
            r11 = r9
            r9 = 0
            int r3 = java.lang.Math.max(r9, r15)
            r43 = 1
            int r9 = r15 + (-1)
            if (r3 > r9) goto L3e5
            r15 = 0
        L3c7:
            if (r15 != 0) goto L3ce
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L3ce:
            r46 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.Object r4 = r2.invoke(r4)
            r15.add(r4)
            if (r9 == r3) goto L3e2
            int r9 = r9 + (-1)
            r4 = r46
            goto L3c7
        L3e2:
            r4 = r40
            goto L3e9
        L3e5:
            r46 = r4
            r15 = 0
            goto L3e2
        L3e9:
            r22 = r4
            java.util.Collection r22 = (java.util.Collection) r22
            int r5 = r22.size()
            r9 = 0
        L3f2:
            if (r9 >= r5) goto L419
            java.lang.Object r31 = r4.get(r9)
            java.lang.Number r31 = (java.lang.Number) r31
            r36 = r4
            int r4 = r31.intValue()
            if (r4 >= r3) goto L414
            if (r15 != 0) goto L409
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L409:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r2.invoke(r4)
            r15.add(r4)
        L414:
            int r9 = r9 + 1
            r4 = r36
            goto L3f2
        L419:
            r36 = r4
            n5.s r31 = n5.s.f15299q
            if (r15 != 0) goto L421
            r15 = r31
        L421:
            r39 = r15
            java.util.Collection r39 = (java.util.Collection) r39
            int r2 = r39.size()
            r4 = r32
            r3 = 0
        L42c:
            if (r3 >= r2) goto L43d
            java.lang.Object r5 = r15.get(r3)
            F.l r5 = (F.C0158l) r5
            int r5 = r5.j
            int r4 = java.lang.Math.max(r4, r5)
            int r3 = r3 + 1
            goto L42c
        L43d:
            java.lang.Object r2 = r20.last()
            F.l r2 = (F.C0158l) r2
            int r2 = r2.f1888a
            r3 = r2
            F.z r2 = new F.z
            r9 = r11
            r11 = 0
            r5 = r3
            r3 = r52
            r52 = r15
            r15 = r36
            r36 = r13
            r13 = r5
            r32 = r4
            r40 = r12
            r12 = r43
            r4 = r46
            r2.<init>(r3, r4, r6, r7, r9, r10, r11)
            int r4 = r35 + (-1)
            int r4 = java.lang.Math.min(r13, r4)
            int r5 = r13 + 1
            r13 = 0
            if (r5 > r4) goto L482
        L46a:
            if (r13 != 0) goto L472
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r13 = r6
        L472:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r2.invoke(r6)
            r13.add(r6)
            if (r5 == r4) goto L482
            int r5 = r5 + 1
            goto L46a
        L482:
            int r5 = r22.size()
            r6 = 0
        L487:
            if (r6 >= r5) goto L4b2
            java.lang.Object r7 = r15.get(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r8 = r4 + 1
            r9 = r35
            if (r8 > r7) goto L4ad
            if (r7 >= r9) goto L4ad
            if (r13 != 0) goto L4a2
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L4a2:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r2.invoke(r7)
            r13.add(r7)
        L4ad:
            int r6 = r6 + 1
            r35 = r9
            goto L487
        L4b2:
            r9 = r35
            if (r13 != 0) goto L4b8
            r13 = r31
        L4b8:
            r2 = r13
            java.util.Collection r2 = (java.util.Collection) r2
            int r4 = r2.size()
            r6 = r32
            r5 = 0
        L4c2:
            if (r5 >= r4) goto L4d3
            java.lang.Object r7 = r13.get(r5)
            F.l r7 = (F.C0158l) r7
            int r7 = r7.j
            int r6 = java.lang.Math.max(r6, r7)
            int r5 = r5 + 1
            goto L4c2
        L4d3:
            java.lang.Object r4 = r20.first()
            boolean r4 = kotlin.jvm.internal.m.a(r14, r4)
            if (r4 == 0) goto L4ed
            boolean r4 = r52.isEmpty()
            if (r4 == 0) goto L4ed
            boolean r4 = r13.isEmpty()
            if (r4 == 0) goto L4ed
            r8 = r12
        L4ea:
            r4 = r37
            goto L4ef
        L4ed:
            r8 = 0
            goto L4ea
        L4ef:
            int r7 = W0.b.f(r1, r4)
            int r11 = W0.b.e(r6, r4)
            int r4 = java.lang.Math.min(r7, r0)
            if (r1 >= r4) goto L4ff
            r4 = r12
            goto L500
        L4ff:
            r4 = 0
        L500:
            if (r4 == 0) goto L519
            if (r40 != 0) goto L505
            goto L519
        L505:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "non-zero pagesScrollOffset="
            r5.<init>(r6)
            r6 = r40
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            z.AbstractC1923a.c(r5)
            goto L51b
        L519:
            r6 = r40
        L51b:
            java.util.ArrayList r15 = new java.util.ArrayList
            int r5 = r20.d()
            int r22 = r52.size()
            int r22 = r22 + r5
            int r5 = r13.size()
            int r5 = r5 + r22
            r15.<init>(r5)
            if (r4 == 0) goto L5a1
            boolean r2 = r52.isEmpty()
            if (r2 == 0) goto L53f
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L53f
            goto L544
        L53f:
            java.lang.String r2 = "No extra pages"
            z.AbstractC1923a.a(r2)
        L544:
            int r2 = r20.d()
            int[] r5 = new int[r2]
            r4 = 0
        L54b:
            if (r4 >= r2) goto L552
            r5[r4] = r10
            int r4 = r4 + 1
            goto L54b
        L552:
            int[] r2 = new int[r2]
            r4 = r34
            r6 = r36
            float r12 = r4.f0(r6)
            r4 = r7
            r7 = r2
            A.f r2 = new A.f
            r42 = r3
            r22 = r8
            r3 = 0
            r8 = 0
            r2.<init>(r12, r3, r8)
            r3 = r42
            r6 = r53
            r2.c(r3, r4, r5, r6, r7)
            G5.d r2 = n5.k.N0(r7)
            int r3 = r2.f2017q
            int r5 = r2.f2018r
            int r2 = r2.f2019s
            if (r2 <= 0) goto L57e
            if (r3 <= r5) goto L582
        L57e:
            if (r2 >= 0) goto L59e
            if (r5 > r3) goto L59e
        L582:
            r6 = r7[r3]
            r12 = r20
            java.lang.Object r17 = r12.get(r3)
            r8 = r17
            F.l r8 = (F.C0158l) r8
            r8.b(r6, r4, r11)
            r15.add(r8)
            if (r3 == r5) goto L59b
            int r3 = r3 + r2
            r20 = r12
            r8 = 0
            goto L582
        L59b:
            r8 = r52
            goto L5fd
        L59e:
            r12 = r20
            goto L59b
        L5a1:
            r4 = r7
            r22 = r8
            r12 = r20
            int r3 = r39.size()
            r7 = r6
            r5 = 0
        L5ac:
            if (r5 >= r3) goto L5c9
            r8 = r52
            java.lang.Object r17 = r8.get(r5)
            r52 = r2
            r2 = r17
            F.l r2 = (F.C0158l) r2
            int r7 = r7 - r21
            r2.b(r7, r4, r11)
            r15.add(r2)
            int r5 = r5 + 1
            r2 = r52
            r52 = r8
            goto L5ac
        L5c9:
            r8 = r52
            r52 = r2
            int r2 = r12.d()
            r3 = 0
        L5d2:
            if (r3 >= r2) goto L5e5
            java.lang.Object r5 = r12.get(r3)
            F.l r5 = (F.C0158l) r5
            r5.b(r6, r4, r11)
            r15.add(r5)
            int r6 = r6 + r21
            int r3 = r3 + 1
            goto L5d2
        L5e5:
            int r2 = r52.size()
            r3 = 0
        L5ea:
            if (r3 >= r2) goto L5fd
            java.lang.Object r5 = r13.get(r3)
            F.l r5 = (F.C0158l) r5
            r5.b(r6, r4, r11)
            r15.add(r5)
            int r6 = r6 + r21
            int r3 = r3 + 1
            goto L5ea
        L5fd:
            if (r22 == 0) goto L603
            r7 = r15
        L600:
            r21 = r4
            goto L644
        L603:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r15.size()
            r2.<init>(r3)
            int r3 = r15.size()
            r5 = 0
        L611:
            if (r5 >= r3) goto L642
            java.lang.Object r6 = r15.get(r5)
            r7 = r6
            F.l r7 = (F.C0158l) r7
            r52 = r3
            int r3 = r7.f1888a
            java.lang.Object r17 = r12.first()
            r21 = r4
            r4 = r17
            F.l r4 = (F.C0158l) r4
            int r4 = r4.f1888a
            if (r3 < r4) goto L63b
            int r3 = r7.f1888a
            java.lang.Object r4 = r12.last()
            F.l r4 = (F.C0158l) r4
            int r4 = r4.f1888a
            if (r3 > r4) goto L63b
            r2.add(r6)
        L63b:
            int r5 = r5 + 1
            r3 = r52
            r4 = r21
            goto L611
        L642:
            r7 = r2
            goto L600
        L644:
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L64d
            r22 = r31
            goto L678
        L64d:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r15.size()
            r2.<init>(r3)
            int r3 = r15.size()
            r4 = 0
        L65b:
            if (r4 >= r3) goto L676
            java.lang.Object r5 = r15.get(r4)
            r6 = r5
            F.l r6 = (F.C0158l) r6
            int r6 = r6.f1888a
            java.lang.Object r8 = r12.first()
            F.l r8 = (F.C0158l) r8
            int r8 = r8.f1888a
            if (r6 >= r8) goto L673
            r2.add(r5)
        L673:
            int r4 = r4 + 1
            goto L65b
        L676:
            r22 = r2
        L678:
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L67f
            goto L6aa
        L67f:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r15.size()
            r2.<init>(r3)
            int r3 = r15.size()
            r4 = 0
        L68d:
            if (r4 >= r3) goto L6a8
            java.lang.Object r5 = r15.get(r4)
            r6 = r5
            F.l r6 = (F.C0158l) r6
            int r6 = r6.f1888a
            java.lang.Object r8 = r12.last()
            F.l r8 = (F.C0158l) r8
            int r8 = r8.f1888a
            if (r6 <= r8) goto L6a5
            r2.add(r5)
        L6a5:
            int r4 = r4 + 1
            goto L68d
        L6a8:
            r31 = r2
        L6aa:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L6b3
            r12 = 1
            r13 = 0
            goto L6f3
        L6b3:
            r13 = 0
            java.lang.Object r2 = r7.get(r13)
            r3 = r2
            F.l r3 = (F.C0158l) r3
            int r3 = r3.f1896l
            r27.getClass()
            float r3 = (float) r3
            float r3 = r3 - r26
            float r3 = java.lang.Math.abs(r3)
            float r3 = -r3
            int r4 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r7)
            r12 = 1
            if (r12 > r4) goto L6f2
            r5 = r3
            r3 = r2
            r2 = r12
        L6d2:
            java.lang.Object r6 = r7.get(r2)
            r8 = r6
            F.l r8 = (F.C0158l) r8
            int r8 = r8.f1896l
            float r8 = (float) r8
            float r8 = r8 - r26
            float r8 = java.lang.Math.abs(r8)
            float r8 = -r8
            int r13 = java.lang.Float.compare(r5, r8)
            if (r13 >= 0) goto L6eb
            r3 = r6
            r5 = r8
        L6eb:
            if (r2 == r4) goto L6f0
            int r2 = r2 + 1
            goto L6d2
        L6f0:
            r13 = r3
            goto L6f3
        L6f2:
            r13 = r2
        L6f3:
            F.l r13 = (F.C0158l) r13
            r27.getClass()
            if (r13 == 0) goto L6ff
            int r2 = r13.f1896l
        L6fc:
            r3 = r45
            goto L701
        L6ff:
            r2 = 0
            goto L6fc
        L701:
            if (r3 != 0) goto L707
            r2 = 0
            r28 = 0
            goto L716
        L707:
            r28 = 0
            int r2 = 0 - r2
            float r2 = (float) r2
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = -1090519040(0xffffffffbf000000, float:-0.5)
            r4 = 1056964608(0x3f000000, float:0.5)
            float r2 = D5.a.p(r2, r3, r4)
        L716:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            A.Y r5 = new A.Y
            r6 = 10
            r8 = r16
            r5.<init>(r6, r8, r15)
            r6 = r41
            java.lang.Object r3 = r6.invoke(r3, r4, r5)
            r20 = r3
            z0.D r20 = (z0.InterfaceC1927D) r20
            r3 = r44
            if (r3 < r9) goto L73a
            if (r1 <= r0) goto L738
            goto L73a
        L738:
            r12 = r28
        L73a:
            F.B r6 = new F.B
            r16 = r2
            r8 = r10
            r15 = r13
            r17 = r18
            r10 = r19
            r13 = r23
            r19 = r27
            r3 = r28
            r11 = r29
            r21 = r30
            r23 = r31
            r9 = r36
            r18 = r12
            r12 = r33
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L759:
            boolean r0 = r34.r()
            r1 = r25
            r1.h(r6, r0, r3)
            return r6
        L763:
            r0 = move-exception
            a0.r.f(r7, r8, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F.A.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
