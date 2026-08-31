package m0;

/* JADX INFO: renamed from: m0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1346a extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14918r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1346a(int i, Object obj) {
        super(1);
        this.f14917q = i;
        this.f14918r = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: l0.d.g0(l0.d, long, long, long, float, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0249  */
    @Override // B5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r43) {
        /*
            r42 = this;
            r1 = r42
            r0 = r43
            int r2 = r1.f14917q
            java.lang.String r3 = "(this)"
            r4 = 0
            r5 = 1
            r6 = 0
            m5.y r7 = m5.C1386y.f15098a
            java.lang.Object r8 = r1.f14918r
            switch(r2) {
                case 0: goto L4a8;
                case 1: goto L499;
                case 2: goto L48f;
                case 3: goto L485;
                case 4: goto L47c;
                case 5: goto L470;
                case 6: goto L66;
                case 7: goto L56;
                case 8: goto L48;
                case 9: goto L26;
                default: goto L12;
            }
        L12:
            i0.b r0 = (i0.C1130b) r0
            long r2 = r0.f13520a
            w.H0 r8 = (w.H0) r8
            w.i0 r0 = r8.j
            int r4 = r8.i
            long r2 = w.H0.a(r8, r0, r2, r4)
            i0.b r0 = new i0.b
            r0.<init>(r2)
            return r0
        L26:
            z0.m r0 = (z0.InterfaceC1953m) r0
            w.z0 r8 = (w.C1821z0) r8
            w.j r2 = r8.f18126V
            r2.f18002J = r0
            boolean r0 = r2.f18004L
            if (r0 == 0) goto L45
            i0.c r0 = r2.y0()
            if (r0 == 0) goto L45
            long r3 = r2.f18005M
            boolean r0 = r2.z0(r0, r3)
            if (r0 != 0) goto L45
            r2.f18003K = r5
            r2.A0()
        L45:
            r2.f18004L = r6
            return r7
        L48:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            v0.y r8 = (v0.y) r8
            M5.h r2 = r8.f17506s
            if (r2 == 0) goto L53
            r2.g(r0)
        L53:
            r8.f17506s = r4
            return r7
        L56:
            i0.b r0 = (i0.C1130b) r0
            long r2 = r0.f13520a
            v.x r8 = (v.C1728x) r8
            boolean r0 = r8.f17410J
            if (r0 == 0) goto L65
            B5.a r0 = r8.f17411K
            r0.invoke()
        L65:
            return r7
        L66:
            g0.c r0 = (g0.C1069c) r0
            v.v r8 = (v.C1726v) r8
            float r2 = r8.f17398H
            float r3 = r0.b()
            float r3 = r3 * r2
            r2 = 0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 < 0) goto L469
            g0.a r3 = r0.f12812q
            long r9 = r3.d()
            float r3 = i0.C1133e.c(r9)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 <= 0) goto L469
            float r3 = r8.f17398H
            boolean r2 = W0.f.a(r3, r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L90
            r2 = r3
            goto L9d
        L90:
            float r2 = r8.f17398H
            float r7 = r0.b()
            float r7 = r7 * r2
            double r9 = (double) r7
            double r9 = java.lang.Math.ceil(r9)
            float r2 = (float) r9
        L9d:
            g0.a r7 = r0.f12812q
            long r9 = r7.d()
            float r7 = i0.C1133e.c(r9)
            r9 = 2
            float r9 = (float) r9
            float r7 = r7 / r9
            double r10 = (double) r7
            double r10 = java.lang.Math.ceil(r10)
            float r7 = (float) r10
            float r11 = java.lang.Math.min(r2, r7)
            float r2 = r11 / r9
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            long r12 = (long) r7
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            long r14 = (long) r7
            r7 = 32
            long r12 = r12 << r7
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r16
            long r18 = r12 | r14
            g0.a r10 = r0.f12812q
            long r12 = r10.d()
            long r12 = r12 >> r7
            int r10 = (int) r12
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 - r11
            g0.a r12 = r0.f12812q
            long r12 = r12.d()
            long r12 = r12 & r16
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r12 = r12 - r11
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r13 = (long) r10
            int r10 = java.lang.Float.floatToRawIntBits(r12)
            long r4 = (long) r10
            long r13 = r13 << r7
            long r4 = r4 & r16
            long r4 = r4 | r13
            float r21 = r11 * r9
            g0.a r9 = r0.f12812q
            long r9 = r9.d()
            float r9 = i0.C1133e.c(r9)
            int r9 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r9 <= 0) goto L107
            r9 = 1
            goto L108
        L107:
            r9 = r6
        L108:
            H.d r10 = r8.f17400J
            g0.a r13 = r0.f12812q
            long r13 = r13.d()
            r43 = r7
            g0.a r7 = r0.f12812q
            W0.l r7 = r7.getLayoutDirection()
            j0.B r7 = r10.e(r13, r7, r0)
            boolean r10 = r7 instanceof j0.x
            if (r10 == 0) goto L388
            j0.G r2 = r8.f17399I
            j0.x r7 = (j0.x) r7
            j0.A r4 = r7.f13730e
            if (r9 == 0) goto L135
            A.Y r3 = new A.Y
            r4 = 29
            r3.<init>(r4, r7, r2)
            k3.d r0 = r0.a(r3)
            goto L46f
        L135:
            if (r2 == 0) goto L145
            long r9 = r2.f13692e
            long r9 = j0.o.b(r9, r3)
            j0.j r3 = new j0.j
            r5 = 5
            r3.<init>(r9, r5)
            r5 = 1
            goto L147
        L145:
            r5 = r6
            r3 = 0
        L147:
            r9 = r4
            j0.g r9 = (j0.C1152g) r9
            i0.c r9 = r9.b()
            float r10 = r9.f13523b
            float r11 = r9.f13522a
            v.q r13 = r8.f17397G
            if (r13 != 0) goto L15d
            v.q r13 = new v.q
            r13.<init>()
            r8.f17397G = r13
        L15d:
            v.q r13 = r8.f17397G
            kotlin.jvm.internal.m.b(r13)
            j0.g r14 = r13.f17376d
            if (r14 != 0) goto L16c
            j0.g r14 = j0.i.a()
            r13.f17376d = r14
        L16c:
            r14.d()
            float r13 = r9.f13522a
            float r12 = r9.f13525d
            float r15 = r9.f13524c
            float r6 = r9.f13523b
            boolean r18 = java.lang.Float.isNaN(r13)
            if (r18 != 0) goto L18f
            boolean r18 = java.lang.Float.isNaN(r6)
            if (r18 != 0) goto L18f
            boolean r18 = java.lang.Float.isNaN(r15)
            if (r18 != 0) goto L18f
            boolean r18 = java.lang.Float.isNaN(r12)
            if (r18 == 0) goto L194
        L18f:
            java.lang.String r18 = "Invalid rectangle, make sure no value is NaN"
            j0.i.b(r18)
        L194:
            android.graphics.RectF r1 = r14.f13708b
            if (r1 != 0) goto L19f
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r14.f13708b = r1
        L19f:
            android.graphics.RectF r1 = r14.f13708b
            kotlin.jvm.internal.m.b(r1)
            r1.set(r13, r6, r15, r12)
            android.graphics.Path r1 = r14.f13707a
            android.graphics.RectF r6 = r14.f13708b
            kotlin.jvm.internal.m.b(r6)
            android.graphics.Path$Direction r12 = android.graphics.Path.Direction.CCW
            r1.addRect(r6, r12)
            r1 = 0
            r14.c(r14, r4, r1)
            kotlin.jvm.internal.y r1 = new kotlin.jvm.internal.y
            r1.<init>()
            float r4 = r9.f13524c
            float r4 = r4 - r11
            double r12 = (double) r4
            double r12 = java.lang.Math.ceil(r12)
            float r4 = (float) r12
            int r4 = (int) r4
            float r6 = r9.f13525d
            float r6 = r6 - r10
            double r12 = (double) r6
            double r12 = java.lang.Math.ceil(r12)
            float r6 = (float) r12
            int r6 = (int) r6
            long r12 = (long) r4
            long r12 = r12 << r43
            r4 = r2
            r15 = r3
            long r2 = (long) r6
            long r2 = r2 & r16
            long r2 = r2 | r12
            v.q r6 = r8.f17397G
            kotlin.jvm.internal.m.b(r6)
            j0.e r8 = r6.f17373a
            j0.b r12 = r6.f17374b
            if (r8 == 0) goto L1f0
            int r13 = r8.a()
            r18 = r2
            j0.v r2 = new j0.v
            r2.<init>(r13)
            goto L1f3
        L1f0:
            r18 = r2
            r2 = 0
        L1f3:
            if (r2 != 0) goto L1f6
            goto L1fb
        L1f6:
            int r2 = r2.f13729a
            if (r2 != 0) goto L1fb
            goto L212
        L1fb:
            if (r8 == 0) goto L207
            int r2 = r8.a()
            j0.v r3 = new j0.v
            r3.<init>(r2)
            goto L208
        L207:
            r3 = 0
        L208:
            if (r3 != 0) goto L20b
            goto L20f
        L20b:
            int r2 = r3.f13729a
            if (r5 == r2) goto L212
        L20f:
            r23 = 0
            goto L214
        L212:
            r23 = 1
        L214:
            if (r8 == 0) goto L249
            if (r12 == 0) goto L249
            g0.a r2 = r0.f12812q
            long r2 = r2.d()
            long r2 = r2 >> r43
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            android.graphics.Bitmap r3 = r8.f13704a
            int r13 = r3.getWidth()
            float r13 = (float) r13
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 > 0) goto L249
            g0.a r2 = r0.f12812q
            long r24 = r2.d()
            r13 = r3
            long r2 = r24 & r16
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r3 = r13.getHeight()
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L249
            if (r23 != 0) goto L267
        L249:
            long r2 = r18 >> r43
            int r2 = (int) r2
            long r12 = r18 & r16
            int r3 = (int) r12
            j0.e r8 = j0.AbstractC1145B.e(r2, r3, r5)
            r6.f17373a = r8
            android.graphics.Canvas r2 = j0.AbstractC1148c.f13699a
            j0.b r12 = new j0.b
            r12.<init>()
            android.graphics.Canvas r2 = new android.graphics.Canvas
            android.graphics.Bitmap r3 = r8.f13704a
            r2.<init>(r3)
            r12.f13696a = r2
            r6.f17374b = r12
        L267:
            l0.b r2 = r6.f17375c
            if (r2 != 0) goto L272
            l0.b r2 = new l0.b
            r2.<init>()
            r6.f17375c = r2
        L272:
            B0.G0 r3 = r2.f14425r
            l0.a r5 = r2.f14424q
            r6 = r14
            long r13 = com.google.android.gms.internal.measurement.P1.d0(r18)
            r29 = r2
            g0.a r2 = r0.f12812q
            W0.l r2 = r2.getLayoutDirection()
            r26 = r4
            W0.c r4 = r5.f14420a
            r38 = r6
            W0.l r6 = r5.f14421b
            r39 = r9
            j0.m r9 = r5.f14422c
            r40 = r8
            r41 = r9
            long r8 = r5.f14423d
            r5.f14420a = r0
            r5.f14421b = r2
            r5.f14422c = r12
            r5.f14423d = r13
            r12.k()
            long r30 = j0.o.f13718b
            r36 = 0
            r37 = 58
            r32 = 0
            r34 = r13
            l0.InterfaceC1221d.g0(r29, r30, r32, r34, r36, r37)
            float r2 = -r11
            float r10 = -r10
            java.lang.Object r11 = r3.f234r
            i1.a r11 = (i1.C1134a) r11
            r11.A(r2, r10)
            j0.A r7 = r7.f13730e     // Catch: java.lang.Throwable -> L370
            l0.g r20 = new l0.g     // Catch: java.lang.Throwable -> L370
            r24 = 0
            r25 = 30
            r22 = 0
            r23 = 0
            r20.<init>(r21, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> L370
            r27 = 52
            r25 = 0
            r23 = r7
            r24 = r26
            r22 = r29
            r26 = r20
            l0.InterfaceC1221d.j(r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Throwable -> L370
            long r13 = r29.d()     // Catch: java.lang.Throwable -> L370
            long r13 = r13 >> r43
            int r7 = (int) r13     // Catch: java.lang.Throwable -> L370
            float r7 = java.lang.Float.intBitsToFloat(r7)     // Catch: java.lang.Throwable -> L370
            r11 = 1
            float r11 = (float) r11     // Catch: java.lang.Throwable -> L370
            float r7 = r7 + r11
            long r13 = r29.d()     // Catch: java.lang.Throwable -> L370
            long r13 = r13 >> r43
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L370
            float r13 = java.lang.Float.intBitsToFloat(r13)     // Catch: java.lang.Throwable -> L370
            float r7 = r7 / r13
            long r13 = r29.d()     // Catch: java.lang.Throwable -> L370
            long r13 = r13 & r16
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L370
            float r13 = java.lang.Float.intBitsToFloat(r13)     // Catch: java.lang.Throwable -> L370
            float r13 = r13 + r11
            long r20 = r29.d()     // Catch: java.lang.Throwable -> L370
            r14 = r12
            long r11 = r20 & r16
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L370
            float r11 = java.lang.Float.intBitsToFloat(r11)     // Catch: java.lang.Throwable -> L370
            float r13 = r13 / r11
            long r11 = r29.M()     // Catch: java.lang.Throwable -> L370
            r16 = r14
            r43 = r15
            long r14 = r3.E()     // Catch: java.lang.Throwable -> L370
            j0.m r17 = r3.t()     // Catch: java.lang.Throwable -> L370
            r17.k()     // Catch: java.lang.Throwable -> L370
            r28 = r0
            java.lang.Object r0 = r3.f234r     // Catch: java.lang.Throwable -> L372
            i1.a r0 = (i1.C1134a) r0     // Catch: java.lang.Throwable -> L372
            r0.y(r7, r13, r11)     // Catch: java.lang.Throwable -> L372
            r26 = 0
            r27 = 28
            r25 = 0
            r22 = r29
            r23 = r38
            l0.InterfaceC1221d.j(r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Throwable -> L372
            j0.m r0 = r3.t()     // Catch: java.lang.Throwable -> L370
            r0.i()     // Catch: java.lang.Throwable -> L370
            r3.X(r14)     // Catch: java.lang.Throwable -> L370
            java.lang.Object r0 = r3.f234r
            i1.a r0 = (i1.C1134a) r0
            float r2 = -r2
            float r3 = -r10
            r0.A(r2, r3)
            r16.i()
            r5.f14420a = r4
            r5.f14421b = r6
            r0 = r41
            r5.f14422c = r0
            r5.f14423d = r8
            r8 = r40
            android.graphics.Bitmap r0 = r8.f13704a
            r0.prepareToDraw()
            r1.f14268q = r8
            v.s r22 = new v.s
            r27 = r43
            r24 = r1
            r25 = r18
            r23 = r39
            r22.<init>(r23, r24, r25, r27)
            r1 = r22
            r0 = r28
            k3.d r0 = r0.a(r1)
            goto L46f
        L370:
            r0 = move-exception
            goto L37e
        L372:
            r0 = move-exception
            j0.m r1 = r3.t()     // Catch: java.lang.Throwable -> L370
            r1.i()     // Catch: java.lang.Throwable -> L370
            r3.X(r14)     // Catch: java.lang.Throwable -> L370
            throw r0     // Catch: java.lang.Throwable -> L370
        L37e:
            java.lang.Object r1 = r3.f234r
            i1.a r1 = (i1.C1134a) r1
            float r2 = -r2
            float r3 = -r10
            r1.A(r2, r3)
            throw r0
        L388:
            boolean r1 = r7 instanceof j0.z
            if (r1 == 0) goto L41f
            j0.G r1 = r8.f17399I
            j0.z r7 = (j0.z) r7
            i0.d r3 = r7.f13732e
            boolean r6 = l6.d.w(r3)
            if (r6 == 0) goto L3bb
            long r6 = r3.f13530e
            l0.g r21 = new l0.g
            r14 = 0
            r15 = 30
            r12 = 0
            r13 = 0
            r10 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            v.t r10 = new v.t
            r12 = r1
            r15 = r2
            r13 = r6
            r16 = r11
            r17 = r18
            r19 = r4
            r11 = r9
            r10.<init>(r11, r12, r13, r15, r16, r17, r19, r21)
            k3.d r0 = r0.a(r10)
            goto L46f
        L3bb:
            r6 = r9
            v.q r2 = r8.f17397G
            if (r2 != 0) goto L3c7
            v.q r2 = new v.q
            r2.<init>()
            r8.f17397G = r2
        L3c7:
            v.q r2 = r8.f17397G
            kotlin.jvm.internal.m.b(r2)
            j0.g r4 = r2.f17376d
            if (r4 != 0) goto L3d6
            j0.g r4 = j0.i.a()
            r2.f17376d = r4
        L3d6:
            r4.d()
            j0.InterfaceC1144A.a(r4, r3)
            if (r6 != 0) goto L414
            j0.g r2 = j0.i.a()
            float r5 = r3.b()
            float r13 = r5 - r11
            float r5 = r3.a()
            float r14 = r5 - r11
            long r5 = r3.f13530e
            long r15 = l6.d.E(r5, r11)
            long r5 = r3.f
            long r17 = l6.d.E(r5, r11)
            long r5 = r3.f13532h
            long r21 = l6.d.E(r5, r11)
            long r5 = r3.f13531g
            long r19 = l6.d.E(r5, r11)
            i0.d r10 = new i0.d
            r12 = r11
            r10.<init>(r11, r12, r13, r14, r15, r17, r19, r21)
            j0.InterfaceC1144A.a(r2, r10)
            r3 = 0
            r4.c(r4, r2, r3)
            goto L415
        L414:
            r3 = 0
        L415:
            v.u r2 = new v.u
            r2.<init>(r3, r4, r1)
            k3.d r0 = r0.a(r2)
            goto L46f
        L41f:
            r6 = r9
            r17 = r18
            r19 = r4
            boolean r1 = r7 instanceof j0.y
            if (r1 == 0) goto L463
            j0.G r1 = r8.f17399I
            if (r6 == 0) goto L431
            r2 = 0
            r23 = r2
            goto L433
        L431:
            r23 = r17
        L433:
            if (r6 == 0) goto L43e
            g0.a r2 = r0.f12812q
            long r4 = r2.d()
            r25 = r4
            goto L440
        L43e:
            r25 = r19
        L440:
            if (r6 == 0) goto L447
            l0.f r2 = l0.C1223f.f14430b
            r27 = r2
            goto L453
        L447:
            l0.g r10 = new l0.g
            r14 = 0
            r15 = 30
            r12 = 0
            r13 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r27 = r10
        L453:
            t.A r21 = new t.A
            r28 = 1
            r22 = r1
            r21.<init>(r22, r23, r25, r27, r28)
            r1 = r21
            k3.d r0 = r0.a(r1)
            goto L46f
        L463:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L469:
            v.r r1 = v.r.f17377r
            k3.d r0 = r0.a(r1)
        L46f:
            return r0
        L470:
            P.F r0 = (P.F) r0
            u.v0 r8 = (u.v0) r8
            C0.Y r0 = new C0.Y
            r1 = 8
            r0.<init>(r1, r8)
            return r0
        L47c:
            boolean r0 = kotlin.jvm.internal.m.a(r0, r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L485:
            r.D r8 = (r.C1545D) r8
            if (r0 != r8) goto L48a
            goto L48e
        L48a:
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L48e:
            return r3
        L48f:
            r.C r8 = (r.C1544C) r8
            if (r0 != r8) goto L494
            goto L498
        L494:
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L498:
            return r3
        L499:
            p0.B r0 = (p0.AbstractC1428B) r0
            p0.c r8 = (p0.C1435c) r8
            r8.g(r0)
            B5.c r1 = r8.i
            if (r1 == 0) goto L4a7
            r1.invoke(r0)
        L4a7:
            return r7
        L4a8:
            l0.d r0 = (l0.InterfaceC1221d) r0
            m0.c r8 = (m0.C1348c) r8
            j0.A r1 = r8.f14930l
            boolean r2 = r8.f14932n
            if (r2 == 0) goto L4f0
            boolean r2 = r8.f14941w
            if (r2 == 0) goto L4f0
            if (r1 == 0) goto L4f0
            B0.G0 r2 = r0.z()
            long r3 = r2.E()
            j0.m r5 = r2.t()
            r5.k()
            java.lang.Object r5 = r2.f234r     // Catch: java.lang.Throwable -> L4e4
            i1.a r5 = (i1.C1134a) r5     // Catch: java.lang.Throwable -> L4e4
            java.lang.Object r5 = r5.f13535r     // Catch: java.lang.Throwable -> L4e4
            B0.G0 r5 = (B0.G0) r5     // Catch: java.lang.Throwable -> L4e4
            j0.m r5 = r5.t()     // Catch: java.lang.Throwable -> L4e4
            r5.a(r1)     // Catch: java.lang.Throwable -> L4e4
            r8.c(r0)     // Catch: java.lang.Throwable -> L4e4
            j0.m r0 = r2.t()
            r0.i()
            r2.X(r3)
            goto L4f3
        L4e4:
            r0 = move-exception
            j0.m r1 = r2.t()
            r1.i()
            r2.X(r3)
            throw r0
        L4f0:
            r8.c(r0)
        L4f3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C1346a.invoke(java.lang.Object):java.lang.Object");
    }
}
