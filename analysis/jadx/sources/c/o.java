package C;

import A.InterfaceC0008e;
import A.InterfaceC0010g;
import A.L;
import E.E;
import M.I0;
import M5.InterfaceC0261w;
import c0.C0715c;
import c0.InterfaceC0725m;
import t.C1595D;
import t.C1596E;
import u.C1642c;
import u.v0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f638q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f641t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f642u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f643v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f645x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(B5.e eVar, C1642c c1642c, B5.e eVar2, I0 i02, B5.a aVar, InterfaceC0261w interfaceC0261w, X.e eVar3) {
        super(2);
        this.f644w = eVar;
        this.f639r = c1642c;
        this.f641t = eVar2;
        this.f643v = i02;
        this.f640s = aVar;
        this.f642u = interfaceC0261w;
        this.f645x = eVar3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO, INVOKE, INVOKE, IGET, IGET, INVOKE, INVOKE] complete}, expected: {[GOTO, INVOKE, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x064f A[LOOP:12: B:263:0x064d->B:264:0x064f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0470 A[EDGE_INSN: B:350:0x0470->B:162:0x0470 BREAK  A[LOOP:4: B:151:0x0429->B:161:0x046b], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r60, java.lang.Object r61) throws java.lang.Throwable {
        /*
            r59 = this;
            r1 = r59
            r2 = 0
            boolean r0 = W0.k.a(r2, r2)
            r13 = r60
            E.A r13 = (E.A) r13
            r4 = r61
            W0.a r4 = (W0.a) r4
            long r14 = r4.f8007a
            java.lang.Object r4 = r1.f641t
            A.g r4 = (A.InterfaceC0010g) r4
            java.lang.Object r5 = r1.f639r
            A.L r5 = (A.L) r5
            java.lang.Object r6 = r1.f644w
            D.y r6 = (D.y) r6
            P.W r7 = r6.f1320s
            r7.getValue()
            boolean r7 = r6.f1306b
            r16 = 1
            if (r7 != 0) goto L35
            z0.T r7 = r13.f1471r
            boolean r7 = r7.r()
            if (r7 == 0) goto L32
            goto L35
        L32:
            r25 = 0
            goto L37
        L35:
            r25 = r16
        L37:
            w.d0 r7 = w.EnumC1778d0.f17945q
            y4.AbstractC1918b.j(r14, r7)
            z0.T r9 = r13.f1471r
            W0.l r9 = r9.getLayoutDirection()
            float r9 = r5.b(r9)
            z0.T r10 = r13.f1471r
            int r9 = r10.G(r9)
            z0.T r10 = r13.f1471r
            W0.l r10 = r10.getLayoutDirection()
            float r10 = r5.c(r10)
            z0.T r11 = r13.f1471r
            int r10 = r11.G(r10)
            float r11 = r5.d()
            z0.T r12 = r13.f1471r
            z0.T r2 = r13.f1471r
            int r3 = r12.G(r11)
            float r5 = r5.a()
            int r5 = r2.G(r5)
            int r5 = r5 + r3
            int r10 = r10 + r9
            int r21 = r5 - r3
            int r11 = -r10
            int r12 = -r5
            long r11 = W0.b.h(r11, r12, r14)
            java.lang.Object r8 = r1.f640s
            B5.a r8 = (B5.a) r8
            java.lang.Object r8 = r8.invoke()
            D.i r8 = (D.i) r8
            r28 = r0
            D.h r0 = r8.f1216b
            r17 = r14
            E.Y r14 = r8.f1217c
            D.u r15 = r0.f1213b
            r19 = r0
            java.lang.Object r0 = r1.f645x
            D.c r0 = (D.c) r0
            r61 = r4
            D.r r4 = r0.f1195d
            r20 = r5
            if (r4 == 0) goto Lb4
            long r4 = r0.f1193b
            boolean r4 = W0.a.b(r4, r11)
            if (r4 == 0) goto Lb4
            float r4 = r0.f1194c
            float r5 = r2.b()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto Lb4
            D.r r0 = r0.f1195d
            kotlin.jvm.internal.m.b(r0)
            goto Lcc
        Lb4:
            r0.f1193b = r11
            float r4 = r2.b()
            r0.f1194c = r4
            B0.j0 r4 = r0.f1192a
            W0.a r5 = new W0.a
            r5.<init>(r11)
            java.lang.Object r4 = r4.invoke(r13, r5)
            D.r r4 = (D.r) r4
            r0.f1195d = r4
            r0 = r4
        Lcc:
            int[] r4 = r0.f1283a
            int r4 = r4.length
            int r5 = r15.f1289b
            if (r4 == r5) goto Lf1
            r15.f1289b = r4
            java.lang.Object r5 = r15.f1291d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.clear()
            r30 = r0
            x3.k r0 = new x3.k
            r24 = r4
            r4 = 0
            r0.<init>(r4, r4)
            r5.add(r0)
            java.io.Serializable r0 = r15.f1292e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            goto Lf6
        Lf1:
            r30 = r0
            r24 = r4
            r4 = 0
        Lf6:
            if (r61 == 0) goto L833
            float r0 = r61.a()
            int r22 = r2.G(r0)
            E.Y r0 = r19.k()
            int r0 = r0.f1519b
            int r5 = W0.a.g(r17)
            int r5 = r5 - r20
            r19 = r5
            long r4 = (long) r9
            r9 = 32
            long r4 = r4 << r9
            r26 = r4
            long r4 = (long) r3
            r31 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r31
            long r4 = r26 | r4
            D.l r31 = new D.l
            java.lang.Object r9 = r1.f644w
            D.y r9 = (D.y) r9
            r35 = r7
            r38 = r11
            r7 = r22
            r11 = r4
            r5 = r8
            r8 = r9
            r4 = r31
            r31 = r0
            r9 = r3
            r3 = r6
            r6 = r13
            r0 = r19
            r13 = r61
            r19 = r10
            r10 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r33 = r4
            r11 = r9
            r12 = r10
            r9 = r8
            r8 = r5
            r5 = r6
            D.m r29 = new D.m
            r34 = r15
            r32 = r22
            r29.<init>(r30, r31, r32, r33, r34)
            r6 = r29
            r15 = r31
            r31 = r33
            r4 = r34
            A.Y r7 = new A.Y
            r10 = 6
            r7.<init>(r10, r4, r6)
            a0.h r10 = a0.r.c()
            r21 = 0
            if (r10 == 0) goto L170
            B5.c r22 = r10.e()
            r29 = r2
            r2 = r22
        L16d:
            r61 = r5
            goto L175
        L170:
            r29 = r2
            r2 = r21
            goto L16d
        L175:
            a0.h r5 = a0.r.d(r10)
            C.u r9 = r9.f1308d     // Catch: java.lang.Throwable -> L1ab
            r22 = r6
            P.c0 r6 = r9.f685b     // Catch: java.lang.Throwable -> L1ab
            int r6 = r6.e()     // Catch: java.lang.Throwable -> L1ab
            r23 = r7
            java.lang.Object r7 = r9.f688e     // Catch: java.lang.Throwable -> L1ab
            int r7 = E.C.i(r6, r8, r7)     // Catch: java.lang.Throwable -> L1ab
            if (r6 == r7) goto L19a
            r30 = r12
            P.c0 r12 = r9.f685b     // Catch: java.lang.Throwable -> L1ab
            r12.f(r7)     // Catch: java.lang.Throwable -> L1ab
            E.F r12 = r9.f     // Catch: java.lang.Throwable -> L1ab
            r12.b(r6)     // Catch: java.lang.Throwable -> L1ab
            goto L19c
        L19a:
            r30 = r12
        L19c:
            if (r7 < r15) goto L1ae
            if (r15 > 0) goto L1a1
            goto L1ae
        L1a1:
            int r6 = r15 + (-1)
            int r4 = r4.s(r6)     // Catch: java.lang.Throwable -> L1ab
            r26 = 0
        L1a9:
            r12 = r4
            goto L1bb
        L1ab:
            r0 = move-exception
            goto L82f
        L1ae:
            int r4 = r4.s(r7)     // Catch: java.lang.Throwable -> L1ab
            P.c0 r6 = r9.f686c     // Catch: java.lang.Throwable -> L1ab
            int r6 = r6.e()     // Catch: java.lang.Throwable -> L1ab
            r26 = r6
            goto L1a9
        L1bb:
            a0.r.f(r10, r5, r2)
            E.H r2 = r3.f1318q
            E.k r4 = r3.f1315n
            java.util.List r2 = E.C.g(r8, r2, r4)
            boolean r4 = r29.r()
            if (r4 != 0) goto L1e4
            if (r25 != 0) goto L1cf
            goto L1e4
        L1cf:
            k3.c r4 = r3.f1323v
            java.lang.Object r4 = r4.f14120q
            u.l r4 = (u.C1658l) r4
            P.f0 r4 = r4.f16962r
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
        L1e1:
            r27 = r4
            goto L1e7
        L1e4:
            float r4 = r3.f1310g
            goto L1e1
        L1e7:
            androidx.compose.foundation.lazy.layout.b r4 = r3.f1314m
            r5 = r23
            boolean r23 = r29.r()
            D.o r6 = r3.f1307c
            P.W r7 = r3.f1319r
            java.lang.Object r8 = r1.f642u
            r33 = r8
            M5.w r33 = (M5.InterfaceC0261w) r33
            java.lang.Object r8 = r1.f643v
            r40 = r8
            E.E r40 = (E.E) r40
            r8 = r4
            C.m r4 = new C.m
            r10 = 1
            r1 = r5
            r5 = r61
            r61 = r12
            r12 = r15
            r15 = r1
            r41 = r7
            r9 = r20
            r1 = r22
            r58 = r14
            r14 = r6
            r6 = r17
            r17 = r8
            r18 = r58
            r8 = r19
            r4.<init>(r5, r6, r8, r9, r10)
            if (r11 < 0) goto L221
            goto L226
        L221:
            java.lang.String r6 = "negative beforeContentPadding"
            z.AbstractC1923a.a(r6)
        L226:
            if (r30 < 0) goto L22b
        L228:
            r6 = r16
            goto L231
        L22b:
            java.lang.String r6 = "negative afterContentPadding"
            z.AbstractC1923a.a(r6)
            goto L228
        L231:
            n5.s r16 = n5.s.f15299q
            if (r12 > 0) goto L294
            r21 = r18
            int r18 = W0.a.j(r38)
            int r19 = W0.a.i(r38)
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            r26 = 0
            r27 = 0
            r22 = r31
            r17.c(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r23 != 0) goto L262
            r17.b()
            if (r28 != 0) goto L262
            r1 = 0
            int r6 = (int) r1
            r8 = r38
            int r18 = W0.b.f(r6, r8)
            int r1 = (int) r1
            int r19 = W0.b.e(r1, r8)
        L262:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            D.n r6 = D.n.f1243r
            java.lang.Object r1 = r4.invoke(r1, r2, r6)
            r9 = r1
            z0.D r9 = (z0.InterfaceC1927D) r9
            int r1 = -r11
            int r18 = r0 + r30
            D.o r4 = new D.o
            r11 = 0
            r19 = 0
            r13 = r5
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r17 = r1
            r14 = r24
            r21 = r30
            r22 = r32
            r12 = r33
            r20 = r35
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r45 = r3
            goto L824
        L294:
            r7 = r21
            r10 = r31
            r42 = r35
            r8 = r38
            r38 = r15
            r21 = r18
            r15 = r32
            r39 = r33
            int r18 = java.lang.Math.round(r27)
            int r19 = r26 - r18
            if (r61 != 0) goto L2b2
            if (r19 >= 0) goto L2b2
            int r18 = r18 + r19
            r19 = 0
        L2b2:
            r43 = r6
            n5.j r6 = new n5.j
            r6.<init>()
            r44 = r15
            int r15 = -r11
            if (r44 >= 0) goto L2c1
            r20 = r44
            goto L2c3
        L2c1:
            r20 = 0
        L2c3:
            int r7 = r15 + r20
            int r19 = r19 + r7
            r58 = r19
            r19 = r61
            r61 = r15
            r15 = r58
        L2cf:
            if (r15 >= 0) goto L2eb
            if (r19 <= 0) goto L2eb
            r45 = r3
            int r3 = r19 + (-1)
            r46 = r4
            D.q r4 = r1.b(r3)
            r19 = r3
            r3 = 0
            r6.add(r3, r4)
            int r3 = r4.f1282g
            int r15 = r15 + r3
            r3 = r45
            r4 = r46
            goto L2cf
        L2eb:
            r45 = r3
            r46 = r4
            if (r15 >= r7) goto L2f6
            int r3 = r7 - r15
            int r18 = r18 - r3
            r15 = r7
        L2f6:
            r3 = r18
            int r15 = r15 - r7
            int r4 = r0 + r30
            r47 = r4
            if (r4 >= 0) goto L300
            r4 = 0
        L300:
            r48 = r5
            int r5 = -r15
            r49 = r13
            r18 = r15
            r26 = r19
            r15 = 0
            r20 = 0
        L30c:
            int r13 = r6.f15297s
            if (r15 >= r13) goto L326
            if (r5 < r4) goto L318
            r6.g(r15)
            r20 = r43
            goto L30c
        L318:
            int r26 = r26 + 1
            java.lang.Object r13 = r6.get(r15)
            D.q r13 = (D.q) r13
            int r13 = r13.f1282g
            int r5 = r5 + r13
            int r15 = r15 + 1
            goto L30c
        L326:
            r13 = r20
            r15 = r26
        L32a:
            if (r15 >= r12) goto L339
            if (r5 < r4) goto L336
            if (r5 <= 0) goto L336
            boolean r20 = r6.isEmpty()
            if (r20 == 0) goto L339
        L336:
            r20 = r4
            goto L33c
        L339:
            r50 = r13
            goto L37b
        L33c:
            D.q r4 = r1.b(r15)
            r50 = r13
            int r13 = r4.f1282g
            r26 = r13
            D.p[] r13 = r4.f1278b
            r31 = r15
            int r15 = r13.length
            if (r15 != 0) goto L34e
            goto L37b
        L34e:
            int r5 = r5 + r26
            if (r5 > r7) goto L371
            int r15 = r13.length
            if (r15 == 0) goto L369
            int r15 = r13.length
            int r15 = r15 + (-1)
            r13 = r13[r15]
            int r13 = r13.f1262a
            int r15 = r12 + (-1)
            if (r13 == r15) goto L371
            int r15 = r31 + 1
            int r18 = r18 - r26
            r19 = r15
            r13 = r43
            goto L376
        L369:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Array is empty."
            r0.<init>(r1)
            throw r0
        L371:
            r6.addLast(r4)
            r13 = r50
        L376:
            int r15 = r31 + 1
            r4 = r20
            goto L32a
        L37b:
            if (r5 >= r0) goto L3a6
            int r4 = r0 - r5
            int r18 = r18 - r4
            int r5 = r5 + r4
            r7 = r18
        L384:
            if (r7 >= r11) goto L39c
            if (r19 <= 0) goto L39c
            int r13 = r19 + (-1)
            D.q r15 = r1.b(r13)
            r19 = r4
            r4 = 0
            r6.add(r4, r15)
            int r4 = r15.f1282g
            int r7 = r7 + r4
            r4 = r19
            r19 = r13
            goto L384
        L39c:
            r19 = r4
            int r4 = r3 + r19
            if (r7 >= 0) goto L3a9
            int r4 = r4 + r7
            int r5 = r5 + r7
            r7 = 0
            goto L3a9
        L3a6:
            r4 = r3
            r7 = r18
        L3a9:
            int r13 = java.lang.Math.round(r27)
            int r13 = java.lang.Integer.signum(r13)
            int r15 = java.lang.Integer.signum(r4)
            if (r13 != r15) goto L3c7
            int r13 = java.lang.Math.round(r27)
            int r13 = java.lang.Math.abs(r13)
            int r15 = java.lang.Math.abs(r4)
            if (r13 < r15) goto L3c7
            float r13 = (float) r4
            goto L3c9
        L3c7:
            r13 = r27
        L3c9:
            float r27 = r27 - r13
            r15 = 0
            if (r23 == 0) goto L3d8
            if (r4 <= r3) goto L3d8
            int r18 = (r27 > r15 ? 1 : (r27 == r15 ? 0 : -1))
            if (r18 > 0) goto L3d8
            int r4 = r4 - r3
            float r3 = (float) r4
            float r15 = r3 + r27
        L3d8:
            if (r7 < 0) goto L3db
            goto L3e0
        L3db:
            java.lang.String r3 = "negative initial offset"
            z.AbstractC1923a.a(r3)
        L3e0:
            int r3 = -r7
            java.lang.Object r4 = r6.first()
            D.q r4 = (D.q) r4
            r18 = r3
            D.p[] r3 = r4.f1278b
            r19 = r4
            int r4 = r3.length
            if (r4 != 0) goto L3f2
            r3 = 0
            goto L3f5
        L3f2:
            r4 = 0
            r3 = r3[r4]
        L3f5:
            if (r3 == 0) goto L3fa
            int r3 = r3.f1262a
            goto L3fb
        L3fa:
            r3 = 0
        L3fb:
            java.lang.Object r4 = r6.l()
            D.q r4 = (D.q) r4
            if (r4 == 0) goto L416
            D.p[] r4 = r4.f1278b
            r20 = r7
            int r7 = r4.length
            if (r7 != 0) goto L40c
            r4 = 0
            goto L411
        L40c:
            int r7 = r4.length
            int r7 = r7 + (-1)
            r4 = r4[r7]
        L411:
            if (r4 == 0) goto L418
            int r4 = r4.f1262a
            goto L419
        L416:
            r20 = r7
        L418:
            r4 = 0
        L419:
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            r26 = r7
            int r7 = r26.size()
            r51 = r11
            r52 = r13
            r11 = 0
            r27 = 0
        L429:
            D.u r13 = r1.f1242e
            if (r11 >= r7) goto L470
            java.lang.Object r31 = r2.get(r11)
            java.lang.Number r31 = (java.lang.Number) r31
            r53 = r7
            int r7 = r31.intValue()
            if (r7 < 0) goto L469
            if (r7 >= r3) goto L469
            r54 = r11
            int r11 = r13.f1289b
            int r11 = r13.A(r7)
            r13 = 0
            long r36 = r1.a(r13, r11)
            r33 = 0
            int r13 = r10.f1233c
            r32 = r7
            r31 = r10
            r34 = r11
            r35 = r13
            D.p r7 = r31.a(r32, r33, r34, r35, r36)
            if (r27 != 0) goto L461
            java.util.ArrayList r27 = new java.util.ArrayList
            r27.<init>()
        L461:
            r11 = r27
            r11.add(r7)
            r27 = r11
            goto L46b
        L469:
            r54 = r11
        L46b:
            int r11 = r54 + 1
            r7 = r53
            goto L429
        L470:
            if (r27 != 0) goto L475
            r7 = r16
            goto L477
        L475:
            r7 = r27
        L477:
            r11 = -1
            if (r23 == 0) goto L547
            if (r14 == 0) goto L547
            java.lang.Object r14 = r14.f1255l
            r27 = r14
            java.util.Collection r27 = (java.util.Collection) r27
            boolean r27 = r27.isEmpty()
            if (r27 != 0) goto L547
            int r27 = r14.size()
            int r27 = r27 + (-1)
            r53 = r15
            r15 = r27
        L492:
            if (r11 >= r15) goto L4bc
            java.lang.Object r27 = r14.get(r15)
            r54 = r11
            r11 = r27
            D.p r11 = (D.p) r11
            int r11 = r11.f1262a
            if (r11 <= r4) goto L4b7
            if (r15 == 0) goto L4b0
            int r11 = r15 + (-1)
            java.lang.Object r11 = r14.get(r11)
            D.p r11 = (D.p) r11
            int r11 = r11.f1262a
            if (r11 > r4) goto L4b7
        L4b0:
            java.lang.Object r11 = r14.get(r15)
            D.p r11 = (D.p) r11
            goto L4bf
        L4b7:
            int r15 = r15 + (-1)
            r11 = r54
            goto L492
        L4bc:
            r54 = r11
            r11 = 0
        L4bf:
            java.lang.Object r14 = n5.l.r0(r14)
            D.p r14 = (D.p) r14
            java.lang.Object r15 = n5.l.s0(r6)
            D.q r15 = (D.q) r15
            if (r15 == 0) goto L4d2
            int r15 = r15.f1277a
            int r15 = r15 + 1
            goto L4d3
        L4d2:
            r15 = 0
        L4d3:
            if (r11 == 0) goto L540
            int r11 = r11.f1262a
            int r14 = r14.f1262a
            r27 = r15
            int r15 = r12 + (-1)
            int r14 = java.lang.Math.min(r14, r15)
            if (r11 > r14) goto L540
            r55 = r3
            r15 = r27
            r3 = 0
        L4e8:
            r56 = r4
            if (r3 == 0) goto L521
            int r4 = r3.size()
            r27 = r7
            r7 = 0
        L4f3:
            if (r7 >= r4) goto L51e
            java.lang.Object r31 = r3.get(r7)
            r32 = r3
            r3 = r31
            D.q r3 = (D.q) r3
            D.p[] r3 = r3.f1278b
            r31 = r4
            int r4 = r3.length
            r33 = r3
            r3 = 0
        L507:
            if (r3 >= r4) goto L517
            r34 = r3
            r3 = r33[r34]
            int r3 = r3.f1262a
            if (r3 != r11) goto L514
            r3 = r32
            goto L537
        L514:
            int r3 = r34 + 1
            goto L507
        L517:
            int r7 = r7 + 1
            r4 = r31
            r3 = r32
            goto L4f3
        L51e:
            r32 = r3
            goto L524
        L521:
            r27 = r7
            goto L51e
        L524:
            if (r32 != 0) goto L52c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L52e
        L52c:
            r3 = r32
        L52e:
            D.q r4 = r1.b(r15)
            int r15 = r15 + 1
            r3.add(r4)
        L537:
            if (r11 == r14) goto L552
            int r11 = r11 + 1
            r7 = r27
            r4 = r56
            goto L4e8
        L540:
            r55 = r3
            r56 = r4
            r27 = r7
            goto L551
        L547:
            r55 = r3
            r56 = r4
            r27 = r7
            r54 = r11
            r53 = r15
        L551:
            r3 = 0
        L552:
            if (r3 != 0) goto L556
            r3 = r16
        L556:
            int r4 = r26.size()
            r7 = 0
            r22 = 0
        L55d:
            if (r7 >= r4) goto L5e0
            java.lang.Object r11 = r2.get(r7)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            int r14 = r56 + 1
            if (r14 > r11) goto L5d0
            if (r11 >= r12) goto L5d0
            if (r23 == 0) goto L5a2
            r14 = r3
            java.util.Collection r14 = (java.util.Collection) r14
            int r14 = r14.size()
            r15 = 0
        L579:
            if (r15 >= r14) goto L5a2
            java.lang.Object r26 = r3.get(r15)
            r57 = r2
            r2 = r26
            D.q r2 = (D.q) r2
            D.p[] r2 = r2.f1278b
            r26 = r3
            int r3 = r2.length
            r31 = r2
            r2 = 0
        L58d:
            if (r2 >= r3) goto L59b
            r32 = r2
            r2 = r31[r32]
            int r2 = r2.f1262a
            if (r2 != r11) goto L598
            goto L5d4
        L598:
            int r2 = r32 + 1
            goto L58d
        L59b:
            int r15 = r15 + 1
            r3 = r26
            r2 = r57
            goto L579
        L5a2:
            r57 = r2
            r26 = r3
            int r2 = r13.f1289b
            int r2 = r13.A(r11)
            r3 = 0
            long r36 = r1.a(r3, r2)
            r33 = 0
            int r3 = r10.f1233c
            r34 = r2
            r35 = r3
            r31 = r10
            r32 = r11
            D.p r2 = r31.a(r32, r33, r34, r35, r36)
            if (r22 != 0) goto L5c8
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
        L5c8:
            r3 = r22
            r3.add(r2)
            r22 = r3
            goto L5d6
        L5d0:
            r57 = r2
            r26 = r3
        L5d4:
            r31 = r10
        L5d6:
            int r7 = r7 + 1
            r3 = r26
            r10 = r31
            r2 = r57
            goto L55d
        L5e0:
            r26 = r3
            r31 = r10
            if (r22 != 0) goto L5e9
            r2 = r16
            goto L5eb
        L5e9:
            r2 = r22
        L5eb:
            if (r51 > 0) goto L5f5
            if (r44 >= 0) goto L5f0
            goto L5f5
        L5f0:
            r4 = r19
            r7 = r20
            goto L61c
        L5f5:
            int r3 = r6.d()
            r4 = r19
            r7 = r20
            r10 = 0
        L5fe:
            if (r10 >= r3) goto L61c
            java.lang.Object r11 = r6.get(r10)
            D.q r11 = (D.q) r11
            int r11 = r11.f1282g
            if (r7 == 0) goto L61c
            if (r11 > r7) goto L61c
            int r13 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r6)
            if (r10 == r13) goto L61c
            int r7 = r7 - r11
            int r10 = r10 + 1
            java.lang.Object r4 = r6.get(r10)
            D.q r4 = (D.q) r4
            goto L5fe
        L61c:
            int r3 = W0.a.h(r8)
            int r10 = W0.b.e(r5, r8)
            boolean r11 = r26.isEmpty()
            if (r11 == 0) goto L62b
            goto L633
        L62b:
            r11 = r26
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r6 = n5.l.u0(r6, r11)
        L633:
            int r11 = java.lang.Math.min(r10, r0)
            if (r5 >= r11) goto L63c
            r11 = r43
            goto L63d
        L63c:
            r11 = 0
        L63d:
            if (r11 == 0) goto L647
            if (r18 != 0) goto L642
            goto L647
        L642:
            java.lang.String r13 = "non-zero firstLineScrollOffset"
            z.AbstractC1923a.c(r13)
        L647:
            int r13 = r6.size()
            r14 = 0
            r15 = 0
        L64d:
            if (r14 >= r13) goto L662
            java.lang.Object r16 = r6.get(r14)
            r32 = r4
            r4 = r16
            D.q r4 = (D.q) r4
            D.p[] r4 = r4.f1278b
            int r4 = r4.length
            int r15 = r15 + r4
            int r14 = r14 + 1
            r4 = r32
            goto L64d
        L662:
            r32 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r15)
            if (r11 == 0) goto L6f2
            boolean r11 = r27.isEmpty()
            if (r11 == 0) goto L678
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L678
            goto L67d
        L678:
            java.lang.String r2 = "no items"
            z.AbstractC1923a.a(r2)
        L67d:
            int r2 = r6.size()
            int[] r11 = new int[r2]
            r13 = 0
        L684:
            if (r13 >= r2) goto L693
            java.lang.Object r14 = r6.get(r13)
            D.q r14 = (D.q) r14
            int r14 = r14.f
            r11[r13] = r14
            int r13 = r13 + 1
            goto L684
        L693:
            int[] r2 = new int[r2]
            r13 = r48
            r14 = r49
            r14.b(r13, r10, r11, r2)
            G5.d r11 = n5.k.N0(r2)
            int r14 = r11.f2017q
            int r15 = r11.f2018r
            int r11 = r11.f2019s
            if (r11 <= 0) goto L6aa
            if (r14 <= r15) goto L6ae
        L6aa:
            if (r11 >= 0) goto L6e4
            if (r15 > r14) goto L6e4
        L6ae:
            r16 = r2
        L6b0:
            r2 = r16[r14]
            java.lang.Object r18 = r6.get(r14)
            r19 = r5
            r5 = r18
            D.q r5 = (D.q) r5
            D.p[] r2 = r5.a(r2, r3, r10)
            int r5 = r2.length
            r18 = r2
            r2 = 0
        L6c4:
            if (r2 >= r5) goto L6d0
            r20 = r2
            r2 = r18[r20]
            r4.add(r2)
            int r2 = r20 + 1
            goto L6c4
        L6d0:
            if (r14 == r15) goto L6d6
            int r14 = r14 + r11
            r5 = r19
            goto L6b0
        L6d6:
            r18 = r3
            r20 = r4
            r26 = r7
        L6dc:
            r27 = r19
            r22 = r31
            r19 = r10
            goto L777
        L6e4:
            r18 = r3
            r20 = r4
            r27 = r5
            r26 = r7
            r19 = r10
            r22 = r31
            goto L777
        L6f2:
            r19 = r5
            r13 = r48
            r5 = r27
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            int r5 = r5 + (-1)
            if (r5 < 0) goto L722
            r11 = r18
        L704:
            int r14 = r5 + (-1)
            r15 = r27
            java.lang.Object r5 = r15.get(r5)
            D.p r5 = (D.p) r5
            r26 = r7
            int r7 = r5.f1270l
            int r11 = r11 - r7
            r5.e(r11, r3, r10)
            r4.add(r5)
            if (r14 >= 0) goto L71c
            goto L724
        L71c:
            r5 = r14
            r27 = r15
            r7 = r26
            goto L704
        L722:
            r26 = r7
        L724:
            int r5 = r6.size()
            r7 = r18
            r11 = 0
        L72b:
            if (r11 >= r5) goto L755
            java.lang.Object r14 = r6.get(r11)
            D.q r14 = (D.q) r14
            D.p[] r15 = r14.a(r7, r3, r10)
            r16 = r5
            int r5 = r15.length
            r18 = r6
            r6 = 0
        L73d:
            if (r6 >= r5) goto L74b
            r20 = r5
            r5 = r15[r6]
            r4.add(r5)
            int r6 = r6 + 1
            r5 = r20
            goto L73d
        L74b:
            int r5 = r14.f1282g
            int r7 = r7 + r5
            int r11 = r11 + 1
            r5 = r16
            r6 = r18
            goto L72b
        L755:
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
        L75d:
            if (r6 >= r5) goto L771
            java.lang.Object r11 = r2.get(r6)
            D.p r11 = (D.p) r11
            r11.e(r7, r3, r10)
            r4.add(r11)
            int r11 = r11.f1270l
            int r7 = r7 + r11
            int r6 = r6 + 1
            goto L75d
        L771:
            r18 = r3
            r20 = r4
            goto L6dc
        L777:
            r17.c(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = r18
            r10 = r19
            r7 = r20
            r4 = r22
            r2 = r23
            r5 = r27
            if (r2 != 0) goto L7ba
            r17.b()
            if (r28 != 0) goto L7ba
            r14 = 0
            int r6 = (int) r14
            int r3 = java.lang.Math.max(r3, r6)
            int r3 = W0.b.f(r3, r8)
            int r6 = (int) r14
            int r6 = java.lang.Math.max(r10, r6)
            int r6 = W0.b.e(r6, r8)
            if (r6 == r10) goto L7b5
            int r8 = r7.size()
            r9 = 0
        L7a8:
            if (r9 >= r8) goto L7b5
            java.lang.Object r10 = r7.get(r9)
            D.p r10 = (D.p) r10
            r10.f1271m = r6
            int r9 = r9 + 1
            goto L7a8
        L7b5:
            r22 = r6
        L7b7:
            r21 = r3
            goto L7bd
        L7ba:
            r22 = r10
            goto L7b7
        L7bd:
            r.u r19 = r.AbstractC1559j.f16215a
            A.Y r3 = new A.Y
            r6 = 7
            r3.<init>(r6, r1, r4)
            r23 = r3
            r18 = r7
            r17 = r40
            r20 = r51
            java.util.List r8 = E.C.f(r17, r18, r19, r20, r21, r22, r23)
            int r1 = r12 + (-1)
            r4 = r56
            if (r4 != r1) goto L7dd
            if (r5 <= r0) goto L7da
            goto L7dd
        L7da:
            r16 = 0
            goto L7df
        L7dd:
            r16 = r43
        L7df:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            C.r r5 = new C.r
            r10 = 1
            r9 = r2
            r6 = r41
            r5.<init>(r6, r7, r8, r9, r10)
            r2 = r46
            java.lang.Object r0 = r2.invoke(r0, r1, r5)
            r9 = r0
            z0.D r9 = (z0.InterfaceC1927D) r9
            r3 = r55
            java.util.List r0 = E.C.m(r3, r4, r7, r8)
            D.o r4 = new D.o
            r17 = r61
            r19 = r12
            r7 = r16
            r14 = r24
            r6 = r26
            r21 = r30
            r5 = r32
            r15 = r38
            r12 = r39
            r20 = r42
            r22 = r44
            r18 = r47
            r11 = r50
            r8 = r52
            r10 = r53
            r16 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L824:
            boolean r0 = r29.r()
            r3 = r45
            r13 = 0
            r3.f(r4, r0, r13)
            return r4
        L82f:
            a0.r.f(r10, r5, r2)
            throw r0
        L833:
            java.lang.String r0 = "null verticalArrangement when isVertical == true"
            z.AbstractC1923a.b(r0)
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C.o.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x079b A[LOOP:15: B:299:0x0799->B:300:0x079b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01af  */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, java.util.List] */
    @Override // B5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r57, java.lang.Object r58) throws java.lang.Throwable {
        /*
            r56 = this;
            r1 = r56
            int r0 = r1.f638q
            r2 = 2
            r3 = 0
            m5.y r4 = m5.C1386y.f15098a
            r5 = 1
            java.lang.Object r6 = r1.f645x
            java.lang.Object r7 = r1.f643v
            java.lang.Object r8 = r1.f642u
            java.lang.Object r9 = r1.f641t
            java.lang.Object r10 = r1.f640s
            java.lang.Object r11 = r1.f639r
            java.lang.Object r12 = r1.f644w
            switch(r0) {
                case 0: goto L1cb;
                case 1: goto L1c6;
                case 2: goto L49;
                default: goto L1a;
            }
        L1a:
            r20 = r57
            P.o r20 = (P.C0371o) r20
            r0 = r58
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            r13 = r12
            u.v0 r13 = (u.v0) r13
            r14 = r11
            B5.c r14 = (B5.c) r14
            r15 = r10
            c0.m r15 = (c0.InterfaceC0725m) r15
            r16 = r9
            t.D r16 = (t.C1595D) r16
            r17 = r8
            t.E r17 = (t.C1596E) r17
            r18 = r7
            B5.e r18 = (B5.e) r18
            r19 = r6
            X.e r19 = (X.e) r19
            r0 = 12582913(0xc00001, float:1.7632417E-38)
            int r21 = P.C0345b.w(r0)
            androidx.compose.animation.b.a(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r4
        L49:
            r0 = r57
            P.o r0 = (P.C0371o) r0
            r13 = r58
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            u.c r11 = (u.C1642c) r11
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            r13 = r13 & 3
            if (r13 != r2) goto L6d
            boolean r2 = r0.x()
            if (r2 != 0) goto L66
            goto L6d
        L66:
            r0.N()
            r25 = r4
            goto L1c5
        L6d:
            androidx.compose.foundation.layout.FillElement r2 = androidx.compose.foundation.layout.c.f9277a
            B5.e r12 = (B5.e) r12
            java.lang.Object r12 = r12.invoke(r0, r14)
            A.W r12 = (A.W) r12
            A0.h r13 = A.c0.f89a
            A.b0 r13 = new A.b0
            r13.<init>(r5, r12)
            c0.m r2 = c0.AbstractC0727o.a(r2, r13)
            boolean r12 = r0.i(r11)
            java.lang.Object r13 = r0.H()
            P.S r15 = P.C0363k.f5418a
            if (r12 != 0) goto L90
            if (r13 != r15) goto L9a
        L90:
            B0.a r13 = new B0.a
            r12 = 16
            r13.<init>(r12, r11)
            r0.d0(r13)
        L9a:
            B5.c r13 = (B5.c) r13
            c0.m r2 = androidx.compose.ui.graphics.a.a(r2, r13)
            B5.e r9 = (B5.e) r9
            M.I0 r7 = (M.I0) r7
            B5.a r10 = (B5.a) r10
            M5.w r8 = (M5.InterfaceC0261w) r8
            X.e r6 = (X.e) r6
            A.b r11 = A.AbstractC0012i.f108c
            c0.c r12 = c0.C0714b.f10073B
            A.t r11 = A.r.a(r11, r12, r0, r3)
            int r12 = r0.f5454P
            P.i0 r13 = r0.m()
            c0.m r2 = c0.AbstractC0727o.c(r0, r2)
            B0.j r16 = B0.InterfaceC0046k.f452a
            r16.getClass()
            B0.D r3 = B0.C0045j.f445b
            r0.W()
            boolean r5 = r0.f5453O
            if (r5 == 0) goto Lce
            r0.l(r3)
            goto Ld1
        Lce:
            r0.g0()
        Ld1:
            B0.i r5 = B0.C0045j.f448e
            P.C0345b.u(r5, r0, r11)
            B0.i r11 = B0.C0045j.f447d
            P.C0345b.u(r11, r0, r13)
            B0.i r13 = B0.C0045j.f
            boolean r1 = r0.f5453O
            if (r1 != 0) goto Lf2
            java.lang.Object r1 = r0.H()
            r25 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            boolean r1 = kotlin.jvm.internal.m.a(r1, r4)
            if (r1 != 0) goto Lf7
            goto Lf4
        Lf2:
            r25 = r4
        Lf4:
            k1.i.o(r12, r0, r12, r13)
        Lf7:
            B0.i r1 = B0.C0045j.f446c
            P.C0345b.u(r1, r0, r2)
            r2 = -1636564008(0xffffffff9e7403d8, float:-1.2918047E-20)
            r0.S(r2)
            if (r9 == 0) goto L1af
            r2 = 2131820683(0x7f11008b, float:1.9274088E38)
            java.lang.String r2 = N.s.a(r2, r0)
            r4 = 2131820684(0x7f11008c, float:1.927409E38)
            java.lang.String r4 = N.s.a(r4, r0)
            r12 = 2131820686(0x7f11008e, float:1.9274094E38)
            java.lang.String r12 = N.s.a(r12, r0)
            r57 = r6
            androidx.compose.foundation.layout.HorizontalAlignElement r6 = new androidx.compose.foundation.layout.HorizontalAlignElement
            r6.<init>()
            boolean r16 = r0.g(r7)
            boolean r17 = r0.g(r4)
            r16 = r16 | r17
            boolean r17 = r0.g(r10)
            r16 = r16 | r17
            boolean r17 = r0.g(r12)
            r16 = r16 | r17
            boolean r17 = r0.i(r8)
            r16 = r16 | r17
            boolean r17 = r0.g(r2)
            r16 = r16 | r17
            r20 = r2
            java.lang.Object r2 = r0.H()
            if (r16 != 0) goto L14c
            if (r2 != r15) goto L162
        L14c:
            A.p r16 = new A.p
            r23 = 1
            r18 = r4
            r17 = r7
            r22 = r8
            r21 = r10
            r19 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r2 = r16
            r0.d0(r2)
        L162:
            B5.c r2 = (B5.c) r2
            r4 = 1
            c0.m r2 = I0.j.a(r6, r4, r2)
            c0.e r4 = c0.C0714b.f10076q
            r6 = 0
            z0.C r4 = A.AbstractC0017n.d(r4, r6)
            int r6 = r0.f5454P
            P.i0 r7 = r0.m()
            c0.m r2 = c0.AbstractC0727o.c(r0, r2)
            r0.W()
            boolean r8 = r0.f5453O
            if (r8 == 0) goto L185
            r0.l(r3)
            goto L188
        L185:
            r0.g0()
        L188:
            P.C0345b.u(r5, r0, r4)
            P.C0345b.u(r11, r0, r7)
            boolean r3 = r0.f5453O
            if (r3 != 0) goto L1a0
            java.lang.Object r3 = r0.H()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            boolean r3 = kotlin.jvm.internal.m.a(r3, r4)
            if (r3 != 0) goto L1a3
        L1a0:
            k1.i.o(r6, r0, r6, r13)
        L1a3:
            P.C0345b.u(r1, r0, r2)
            r9.invoke(r0, r14)
            r4 = 1
            r0.p(r4)
        L1ad:
            r6 = 0
            goto L1b3
        L1af:
            r57 = r6
            r4 = 1
            goto L1ad
        L1b3:
            r0.p(r6)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            A.u r2 = A.C0023u.f149a
            r6 = r57
            r6.invoke(r2, r0, r1)
            r0.p(r4)
        L1c5:
            return r25
        L1c6:
            java.lang.Object r0 = r56.a(r57, r58)
            return r0
        L1cb:
            r0 = 0
            boolean r3 = W0.k.a(r0, r0)
            r14 = r57
            E.A r14 = (E.A) r14
            r4 = r58
            W0.a r4 = (W0.a) r4
            long r4 = r4.f8007a
            A.g r9 = (A.InterfaceC0010g) r9
            A.L r11 = (A.L) r11
            r13 = r12
            C.A r13 = (C.A) r13
            P.W r15 = r13.f577r
            r15.getValue()
            boolean r15 = r13.f564b
            if (r15 != 0) goto L1f7
            z0.T r15 = r14.f1471r
            boolean r15 = r15.r()
            if (r15 == 0) goto L1f4
            goto L1f7
        L1f4:
            r20 = 0
            goto L1f9
        L1f7:
            r20 = 1
        L1f9:
            w.d0 r15 = w.EnumC1778d0.f17945q
            y4.AbstractC1918b.j(r4, r15)
            z0.T r2 = r14.f1471r
            W0.l r2 = r2.getLayoutDirection()
            float r2 = r11.b(r2)
            z0.T r0 = r14.f1471r
            int r0 = r0.G(r2)
            z0.T r1 = r14.f1471r
            W0.l r1 = r1.getLayoutDirection()
            float r1 = r11.c(r1)
            z0.T r2 = r14.f1471r
            int r1 = r2.G(r1)
            float r2 = r11.d()
            r57 = r1
            z0.T r1 = r14.f1471r
            int r1 = r1.G(r2)
            float r2 = r11.a()
            z0.T r11 = r14.f1471r
            int r2 = r11.G(r2)
            int r2 = r2 + r1
            r38 = r3
            int r3 = r0 + r57
            int r42 = r2 - r1
            r16 = r6
            int r6 = -r3
            r17 = r3
            int r3 = -r2
            long r26 = W0.b.h(r6, r3, r4)
            B5.a r10 = (B5.a) r10
            java.lang.Object r3 = r10.invoke()
            C.h r3 = (C.h) r3
            C.c r6 = r3.f605c
            E.Y r10 = r3.f606d
            r18 = r2
            C.g r2 = r3.f604b
            r19 = r2
            int r2 = W0.a.h(r26)
            r28 = r3
            int r3 = W0.a.g(r26)
            r39 = r4
            P.c0 r4 = r6.f596a
            r4.f(r2)
            P.c0 r2 = r6.f597b
            r2.f(r3)
            java.lang.String r2 = "null verticalArrangement when isVertical == true"
            if (r9 == 0) goto L9f0
            float r3 = r9.a()
            int r43 = r11.G(r3)
            E.Y r3 = r19.k()
            int r3 = r3.f1519b
            int r4 = W0.a.g(r39)
            int r4 = r4 - r18
            long r5 = (long) r0
            r0 = 32
            long r5 = r5 << r0
            r57 = r2
            r30 = r3
            long r2 = (long) r1
            r31 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r31
            long r35 = r5 | r2
            C.n r25 = new C.n
            r32 = r16
            c0.c r32 = (c0.C0715c) r32
            r37 = r12
            C.A r37 = (C.A) r37
            r33 = r1
            r29 = r14
            r34 = r42
            r31 = r43
            r25.<init>(r26, r28, r29, r30, r31, r32, r33, r34, r35, r37)
            r1 = r26
            r3 = r28
            r5 = r30
            r0 = r33
            r30 = r25
            r34 = r29
            a0.h r6 = a0.r.c()
            if (r6 == 0) goto L2c3
            B5.c r14 = r6.e()
            goto L2c4
        L2c3:
            r14 = 0
        L2c4:
            a0.h r12 = a0.r.d(r6)
            r16 = r7
            C.u r7 = r13.f566d     // Catch: java.lang.Throwable -> L2eb
            r19 = r8
            P.c0 r8 = r7.f685b     // Catch: java.lang.Throwable -> L2eb
            int r8 = r8.e()     // Catch: java.lang.Throwable -> L2eb
            r29 = r10
            java.lang.Object r10 = r7.f688e     // Catch: java.lang.Throwable -> L2eb
            int r10 = E.C.i(r8, r3, r10)     // Catch: java.lang.Throwable -> L2eb
            if (r8 == r10) goto L2ee
            r44 = r11
            P.c0 r11 = r7.f685b     // Catch: java.lang.Throwable -> L2eb
            r11.f(r10)     // Catch: java.lang.Throwable -> L2eb
            E.F r11 = r7.f     // Catch: java.lang.Throwable -> L2eb
            r11.b(r8)     // Catch: java.lang.Throwable -> L2eb
            goto L2f0
        L2eb:
            r0 = move-exception
            goto L9ec
        L2ee:
            r44 = r11
        L2f0:
            P.c0 r7 = r7.f686c     // Catch: java.lang.Throwable -> L2eb
            int r7 = r7.e()     // Catch: java.lang.Throwable -> L2eb
            a0.r.f(r6, r12, r14)
            E.H r6 = r13.f576q
            E.k r8 = r13.f573n
            java.util.List r3 = E.C.g(r3, r6, r8)
            boolean r6 = r44.r()
            if (r6 != 0) goto L31d
            if (r20 != 0) goto L30a
            goto L31d
        L30a:
            k3.c r6 = r13.f581v
            java.lang.Object r6 = r6.f14120q
            u.l r6 = (u.C1658l) r6
            P.f0 r6 = r6.f16962r
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            goto L31f
        L31d:
            float r6 = r13.f568g
        L31f:
            androidx.compose.foundation.lazy.layout.b r8 = r13.f572m
            boolean r31 = r44.r()
            C.s r11 = r13.f565c
            r12 = r19
            M5.w r12 = (M5.InterfaceC0261w) r12
            P.W r14 = r13.f580u
            r36 = r16
            E.E r36 = (E.E) r36
            r16 = r13
            C.m r13 = new C.m
            r19 = 0
            r25 = r6
            r46 = r14
            r41 = r15
            r6 = r16
            r14 = r34
            r15 = r39
            r13.<init>(r14, r15, r17, r18, r19)
            if (r0 < 0) goto L349
            goto L34e
        L349:
            java.lang.String r15 = "invalid beforeContentPadding"
            z.AbstractC1923a.a(r15)
        L34e:
            if (r42 < 0) goto L351
            goto L356
        L351:
            java.lang.String r15 = "invalid afterContentPadding"
            z.AbstractC1923a.a(r15)
        L356:
            n5.s r37 = n5.s.f15299q
            if (r5 > 0) goto L3c3
            int r26 = W0.a.j(r1)
            int r27 = W0.a.i(r1)
            java.util.ArrayList r28 = new java.util.ArrayList
            r28.<init>()
            r34 = 0
            r35 = 0
            r32 = 1
            r25 = r8
            r33 = r20
            r25.c(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r15 = r25
            r8 = r30
            if (r31 != 0) goto L38b
            r15.b()
            if (r38 != 0) goto L38b
            r9 = 0
            int r3 = (int) r9
            int r26 = W0.b.f(r3, r1)
            int r3 = (int) r9
            int r27 = W0.b.e(r3, r1)
        L38b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r27)
            C.p r3 = C.p.f646r
            java.lang.Object r1 = r13.invoke(r1, r2, r3)
            r30 = r1
            z0.D r30 = (z0.InterfaceC1927D) r30
            int r0 = -r0
            int r39 = r4 + r42
            C.s r25 = new C.s
            r32 = 0
            r40 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            long r1 = r8.f632c
            r38 = r0
            r35 = r1
            r33 = r12
            r34 = r14
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43)
            r51 = r6
        L3bf:
            r0 = r25
            goto L9e1
        L3c3:
            r15 = r8
            r33 = r20
            r8 = r30
            if (r10 < r5) goto L3cd
            int r10 = r5 + (-1)
            r7 = 0
        L3cd:
            int r16 = java.lang.Math.round(r25)
            int r7 = r7 - r16
            if (r10 != 0) goto L3dc
            if (r7 >= 0) goto L3dc
            int r16 = r16 + r7
            r17 = 0
            goto L3de
        L3dc:
            r17 = r7
        L3de:
            n5.j r7 = new n5.j
            r7.<init>()
            r18 = r10
            int r10 = -r0
            if (r43 >= 0) goto L3ed
            r19 = r43
        L3ea:
            r20 = r10
            goto L3f0
        L3ed:
            r19 = 0
            goto L3ea
        L3f0:
            int r10 = r20 + r19
            int r17 = r17 + r10
            r19 = r17
            r17 = r12
            r12 = r19
            r39 = r13
            r40 = r14
            r19 = r15
            r15 = 0
        L401:
            long r13 = r8.f632c
            if (r12 >= 0) goto L421
            if (r18 <= 0) goto L421
            r51 = r6
            int r6 = r18 + (-1)
            C.t r13 = r8.a(r6, r13)
            r14 = 0
            r7.add(r14, r13)
            int r14 = r13.f680m
            int r15 = java.lang.Math.max(r15, r14)
            int r13 = r13.f679l
            int r12 = r12 + r13
            r18 = r6
            r6 = r51
            goto L401
        L421:
            r51 = r6
            if (r12 >= r10) goto L42a
            int r6 = r10 - r12
            int r16 = r16 - r6
            r12 = r10
        L42a:
            r6 = r16
            int r12 = r12 - r10
            r16 = r39
            int r39 = r4 + r42
            r26 = r15
            if (r39 >= 0) goto L439
            r15 = 0
        L436:
            r27 = r9
            goto L43c
        L439:
            r15 = r39
            goto L436
        L43c:
            int r9 = -r12
            r47 = r1
            r28 = r12
            r32 = r18
            r12 = 0
            r30 = 0
        L446:
            int r1 = r7.f15297s
            if (r12 >= r1) goto L460
            if (r9 < r15) goto L452
            r7.g(r12)
            r30 = 1
            goto L446
        L452:
            int r32 = r32 + 1
            java.lang.Object r1 = r7.get(r12)
            C.t r1 = (C.t) r1
            int r1 = r1.f679l
            int r9 = r9 + r1
            int r12 = r12 + 1
            goto L446
        L460:
            r1 = r26
            r2 = r30
            r12 = r32
        L466:
            if (r12 >= r5) goto L475
            if (r9 < r15) goto L472
            if (r9 <= 0) goto L472
            boolean r26 = r7.isEmpty()
            if (r26 == 0) goto L475
        L472:
            r52 = r2
            goto L478
        L475:
            r52 = r2
            goto L4a5
        L478:
            C.t r2 = r8.a(r12, r13)
            r26 = r15
            int r15 = r2.f679l
            int r9 = r9 + r15
            if (r9 > r10) goto L491
            r30 = r9
            int r9 = r5 + (-1)
            if (r12 == r9) goto L493
            int r2 = r12 + 1
            int r28 = r28 - r15
            r18 = r2
            r2 = 1
            goto L49e
        L491:
            r30 = r9
        L493:
            int r9 = r2.f680m
            int r1 = java.lang.Math.max(r1, r9)
            r7.addLast(r2)
            r2 = r52
        L49e:
            int r12 = r12 + 1
            r15 = r26
            r9 = r30
            goto L466
        L4a5:
            if (r9 >= r4) goto L4e1
            int r2 = r4 - r9
            int r28 = r28 - r2
            int r9 = r9 + r2
            r10 = r28
        L4ae:
            if (r10 >= r0) goto L4d0
            if (r18 <= 0) goto L4d0
            int r15 = r18 + (-1)
            r45 = r0
            C.t r0 = r8.a(r15, r13)
            r26 = r2
            r2 = 0
            r7.add(r2, r0)
            int r2 = r0.f680m
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = r0.f679l
            int r10 = r10 + r0
            r18 = r15
            r2 = r26
            r0 = r45
            goto L4ae
        L4d0:
            r45 = r0
            r26 = r2
            int r2 = r6 + r26
            if (r10 >= 0) goto L4de
            int r2 = r2 + r10
            int r9 = r9 + r10
            r0 = r18
            r10 = 0
            goto L4e8
        L4de:
            r0 = r18
            goto L4e8
        L4e1:
            r45 = r0
            r2 = r6
            r0 = r18
            r10 = r28
        L4e8:
            int r15 = java.lang.Math.round(r25)
            int r15 = java.lang.Integer.signum(r15)
            r18 = r1
            int r1 = java.lang.Integer.signum(r2)
            if (r15 != r1) goto L508
            int r1 = java.lang.Math.round(r25)
            int r1 = java.lang.Math.abs(r1)
            int r15 = java.lang.Math.abs(r2)
            if (r1 < r15) goto L508
            float r1 = (float) r2
            goto L50a
        L508:
            r1 = r25
        L50a:
            float r15 = r25 - r1
            r25 = 0
            if (r31 == 0) goto L51a
            if (r2 <= r6) goto L51a
            int r26 = (r15 > r25 ? 1 : (r15 == r25 ? 0 : -1))
            if (r26 > 0) goto L51a
            int r2 = r2 - r6
            float r2 = (float) r2
            float r2 = r2 + r15
            goto L51c
        L51a:
            r2 = r25
        L51c:
            if (r10 < 0) goto L51f
            goto L524
        L51f:
            java.lang.String r6 = "negative currentFirstItemScrollOffset"
            z.AbstractC1923a.a(r6)
        L524:
            int r6 = -r10
            java.lang.Object r15 = r7.first()
            C.t r15 = (C.t) r15
            if (r45 > 0) goto L52f
            if (r43 >= 0) goto L532
        L52f:
            r53 = r1
            goto L53a
        L532:
            r53 = r1
            r54 = r2
        L536:
            r34 = r10
            r2 = 0
            goto L569
        L53a:
            int r1 = r7.d()
            r54 = r2
            r2 = 0
        L541:
            if (r2 >= r1) goto L536
            java.lang.Object r26 = r7.get(r2)
            r28 = r1
            r1 = r26
            C.t r1 = (C.t) r1
            int r1 = r1.f679l
            if (r10 == 0) goto L536
            if (r1 > r10) goto L536
            r26 = r1
            int r1 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r7)
            if (r2 == r1) goto L536
            int r10 = r10 - r26
            int r2 = r2 + 1
            java.lang.Object r1 = r7.get(r2)
            r15 = r1
            C.t r15 = (C.t) r15
            r1 = r28
            goto L541
        L569:
            int r1 = java.lang.Math.max(r2, r0)
            r24 = 1
            int r0 = r0 + (-1)
            r2 = 0
            if (r1 > r0) goto L587
        L574:
            if (r2 != 0) goto L57b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L57b:
            C.t r10 = r8.a(r0, r13)
            r2.add(r10)
            if (r0 == r1) goto L587
            int r0 = r0 + (-1)
            goto L574
        L587:
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r10 = r0.size()
            r26 = r0
            r0 = -1
            int r10 = r10 + r0
            if (r10 < 0) goto L5b6
        L594:
            int r28 = r10 + (-1)
            java.lang.Object r10 = r3.get(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 >= r1) goto L5b0
            if (r2 != 0) goto L5a9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L5a9:
            C.t r10 = r8.a(r10, r13)
            r2.add(r10)
        L5b0:
            if (r28 >= 0) goto L5b3
            goto L5b6
        L5b3:
            r10 = r28
            goto L594
        L5b6:
            if (r2 != 0) goto L5ba
            r2 = r37
        L5ba:
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            int r10 = r1.size()
            r0 = r18
            r18 = r1
            r1 = 0
        L5c6:
            if (r1 >= r10) goto L5db
            java.lang.Object r30 = r2.get(r1)
            r32 = r1
            r1 = r30
            C.t r1 = (C.t) r1
            int r1 = r1.f680m
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r32 + 1
            goto L5c6
        L5db:
            java.lang.Object r1 = n5.l.r0(r7)
            C.t r1 = (C.t) r1
            int r1 = r1.f671a
            int r10 = r5 + (-1)
            int r1 = java.lang.Math.min(r1, r10)
            java.lang.Object r30 = n5.l.r0(r7)
            r32 = r0
            r0 = r30
            C.t r0 = (C.t) r0
            int r0 = r0.f671a
            r24 = 1
            int r0 = r0 + 1
            if (r0 > r1) goto L61c
            r30 = 0
        L5fd:
            if (r30 != 0) goto L604
            java.util.ArrayList r30 = new java.util.ArrayList
            r30.<init>()
        L604:
            r35 = r6
            r49 = r12
            r6 = r30
            C.t r12 = r8.a(r0, r13)
            r6.add(r12)
            if (r0 == r1) goto L621
            int r0 = r0 + 1
            r30 = r6
            r6 = r35
            r12 = r49
            goto L5fd
        L61c:
            r35 = r6
            r49 = r12
            r6 = 0
        L621:
            if (r31 == 0) goto L748
            if (r11 == 0) goto L748
            java.lang.Object r0 = r11.f664k
            r12 = r0
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L748
            int r12 = r0.size()
            r24 = 1
            int r12 = r12 + (-1)
            r28 = r6
        L63a:
            r6 = -1
            if (r6 >= r12) goto L661
            java.lang.Object r30 = r0.get(r12)
            r6 = r30
            C.t r6 = (C.t) r6
            int r6 = r6.f671a
            if (r6 <= r1) goto L65e
            if (r12 == 0) goto L657
            int r6 = r12 + (-1)
            java.lang.Object r6 = r0.get(r6)
            C.t r6 = (C.t) r6
            int r6 = r6.f671a
            if (r6 > r1) goto L65e
        L657:
            java.lang.Object r6 = r0.get(r12)
            C.t r6 = (C.t) r6
            goto L662
        L65e:
            int r12 = r12 + (-1)
            goto L63a
        L661:
            r6 = 0
        L662:
            java.lang.Object r0 = n5.l.r0(r0)
            C.t r0 = (C.t) r0
            if (r6 == 0) goto L6ba
            int r6 = r6.f671a
            int r12 = r0.f671a
            int r10 = java.lang.Math.min(r12, r10)
            if (r6 > r10) goto L6ba
            r12 = r6
            r6 = r28
        L677:
            r30 = r2
            if (r6 == 0) goto L69d
            int r2 = r6.size()
            r50 = r4
            r4 = 0
        L682:
            if (r4 >= r2) goto L698
            java.lang.Object r28 = r6.get(r4)
            r55 = r2
            r2 = r28
            C.t r2 = (C.t) r2
            int r2 = r2.f671a
            if (r2 != r12) goto L693
            goto L69a
        L693:
            int r4 = r4 + 1
            r2 = r55
            goto L682
        L698:
            r28 = 0
        L69a:
            C.t r28 = (C.t) r28
            goto L6a1
        L69d:
            r50 = r4
            r28 = 0
        L6a1:
            if (r28 != 0) goto L6b1
            if (r6 != 0) goto L6aa
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L6aa:
            C.t r2 = r8.a(r12, r13)
            r6.add(r2)
        L6b1:
            if (r12 == r10) goto L6c0
            int r12 = r12 + 1
            r2 = r30
            r4 = r50
            goto L677
        L6ba:
            r30 = r2
            r50 = r4
            r6 = r28
        L6c0:
            int r2 = r11.f666m
            int r4 = r0.j
            int r2 = r2 - r4
            int r4 = r0.f678k
            int r2 = r2 - r4
            float r2 = (float) r2
            float r2 = r2 - r53
            int r4 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r4 <= 0) goto L745
            int r0 = r0.f671a
            r24 = 1
            int r0 = r0 + 1
            r4 = r6
            r6 = 0
        L6d7:
            if (r0 >= r5) goto L743
            float r10 = (float) r6
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 >= 0) goto L743
            if (r0 > r1) goto L700
            int r10 = r7.d()
            r11 = 0
        L6e5:
            if (r11 >= r10) goto L6fa
            java.lang.Object r12 = r7.get(r11)
            r25 = r2
            r2 = r12
            C.t r2 = (C.t) r2
            int r2 = r2.f671a
            if (r2 != r0) goto L6f5
            goto L6fd
        L6f5:
            int r11 = r11 + 1
            r2 = r25
            goto L6e5
        L6fa:
            r25 = r2
            r12 = 0
        L6fd:
            C.t r12 = (C.t) r12
            goto L720
        L700:
            r25 = r2
            if (r4 == 0) goto L71f
            int r2 = r4.size()
            r10 = 0
        L709:
            if (r10 >= r2) goto L71a
            java.lang.Object r11 = r4.get(r10)
            r12 = r11
            C.t r12 = (C.t) r12
            int r12 = r12.f671a
            if (r12 != r0) goto L717
            goto L71b
        L717:
            int r10 = r10 + 1
            goto L709
        L71a:
            r11 = 0
        L71b:
            r12 = r11
            C.t r12 = (C.t) r12
            goto L720
        L71f:
            r12 = 0
        L720:
            if (r12 == 0) goto L72a
            int r0 = r0 + 1
            int r2 = r12.f679l
        L726:
            int r6 = r6 + r2
            r2 = r25
            goto L6d7
        L72a:
            if (r4 != 0) goto L731
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L731:
            C.t r2 = r8.a(r0, r13)
            r4.add(r2)
            int r0 = r0 + 1
            java.lang.Object r2 = n5.l.r0(r4)
            C.t r2 = (C.t) r2
            int r2 = r2.f679l
            goto L726
        L743:
            r6 = r4
            goto L752
        L745:
            r24 = 1
            goto L752
        L748:
            r30 = r2
            r50 = r4
            r28 = r6
            r24 = 1
            r6 = r28
        L752:
            if (r6 == 0) goto L766
            java.lang.Object r0 = n5.l.r0(r6)
            C.t r0 = (C.t) r0
            int r0 = r0.f671a
            if (r0 <= r1) goto L766
            java.lang.Object r0 = n5.l.r0(r6)
            C.t r0 = (C.t) r0
            int r1 = r0.f671a
        L766:
            int r0 = r26.size()
            r2 = r6
            r6 = 0
        L76c:
            if (r6 >= r0) goto L78b
            java.lang.Object r4 = r3.get(r6)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 <= r1) goto L788
            if (r2 != 0) goto L781
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L781:
            C.t r4 = r8.a(r4, r13)
            r2.add(r4)
        L788:
            int r6 = r6 + 1
            goto L76c
        L78b:
            if (r2 != 0) goto L78f
            r2 = r37
        L78f:
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r3 = r32
            r6 = 0
        L799:
            if (r6 >= r1) goto L7aa
            java.lang.Object r4 = r2.get(r6)
            C.t r4 = (C.t) r4
            int r4 = r4.f680m
            int r3 = java.lang.Math.max(r3, r4)
            int r6 = r6 + 1
            goto L799
        L7aa:
            java.lang.Object r1 = r7.first()
            boolean r1 = kotlin.jvm.internal.m.a(r15, r1)
            if (r1 == 0) goto L7c5
            boolean r1 = r30.isEmpty()
            if (r1 == 0) goto L7c5
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L7c5
            r4 = r24
        L7c2:
            r10 = r47
            goto L7c7
        L7c5:
            r4 = 0
            goto L7c2
        L7c7:
            int r1 = W0.b.f(r3, r10)
            int r3 = W0.b.e(r9, r10)
            r6 = r50
            int r12 = java.lang.Math.min(r3, r6)
            if (r9 >= r12) goto L7da
            r12 = r24
            goto L7db
        L7da:
            r12 = 0
        L7db:
            if (r12 == 0) goto L7e5
            if (r35 != 0) goto L7e0
            goto L7e5
        L7e0:
            java.lang.String r13 = "non-zero itemsScrollOffset"
            z.AbstractC1923a.c(r13)
        L7e5:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r7.d()
            int r25 = r30.size()
            int r25 = r25 + r14
            int r14 = r2.size()
            int r14 = r14 + r25
            r13.<init>(r14)
            if (r12 == 0) goto L86b
            boolean r0 = r30.isEmpty()
            if (r0 == 0) goto L809
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L809
            goto L80e
        L809:
            java.lang.String r0 = "no extra items"
            z.AbstractC1923a.a(r0)
        L80e:
            int r0 = r7.d()
            int[] r2 = new int[r0]
            r12 = 0
        L815:
            if (r12 >= r0) goto L824
            java.lang.Object r14 = r7.get(r12)
            C.t r14 = (C.t) r14
            int r14 = r14.f678k
            r2[r12] = r14
            int r12 = r12 + 1
            goto L815
        L824:
            int[] r0 = new int[r0]
            if (r27 == 0) goto L862
            r12 = r27
            r14 = r40
            r12.b(r14, r3, r2, r0)
            G5.d r2 = n5.k.N0(r0)
            int r12 = r2.f2017q
            r18 = r0
            int r0 = r2.f2018r
            int r2 = r2.f2019s
            if (r2 <= 0) goto L83f
            if (r12 <= r0) goto L843
        L83f:
            if (r2 >= 0) goto L85e
            if (r0 > r12) goto L85e
        L843:
            r25 = r2
        L845:
            r2 = r18[r12]
            java.lang.Object r26 = r7.get(r12)
            r37 = r4
            r4 = r26
            C.t r4 = (C.t) r4
            r4.k(r2, r1, r3)
            r13.add(r4)
            if (r12 == r0) goto L8db
            int r12 = r12 + r25
            r4 = r37
            goto L845
        L85e:
            r37 = r4
            goto L8db
        L862:
            z.AbstractC1923a.b(r57)
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L86b:
            r37 = r4
            r14 = r40
            int r4 = r18.size()
            r18 = r35
            r12 = 0
        L876:
            if (r12 >= r4) goto L899
            r25 = r0
            r0 = r30
            java.lang.Object r26 = r0.get(r12)
            r0 = r26
            C.t r0 = (C.t) r0
            r57 = r4
            int r4 = r0.f679l
            int r4 = r18 - r4
            r0.k(r4, r1, r3)
            r13.add(r0)
            int r12 = r12 + 1
            r18 = r4
            r0 = r25
            r4 = r57
            goto L876
        L899:
            r25 = r0
            int r0 = r7.d()
            r12 = r35
            r4 = 0
        L8a2:
            if (r4 >= r0) goto L8bc
            java.lang.Object r18 = r7.get(r4)
            r57 = r0
            r0 = r18
            C.t r0 = (C.t) r0
            r0.k(r12, r1, r3)
            r13.add(r0)
            int r0 = r0.f679l
            int r12 = r12 + r0
            int r4 = r4 + 1
            r0 = r57
            goto L8a2
        L8bc:
            int r0 = r25.size()
            r4 = 0
        L8c1:
            if (r4 >= r0) goto L8db
            java.lang.Object r18 = r2.get(r4)
            r57 = r0
            r0 = r18
            C.t r0 = (C.t) r0
            r0.k(r12, r1, r3)
            r13.add(r0)
            int r0 = r0.f679l
            int r12 = r12 + r0
            int r4 = r4 + 1
            r0 = r57
            goto L8c1
        L8db:
            r32 = 1
            r26 = r1
            r27 = r3
            r30 = r8
            r35 = r9
            r28 = r13
            r25 = r19
            r25.c(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r0 = r28
            r32 = r49
            r49 = r31
            if (r49 != 0) goto L926
            r25.b()
            if (r38 != 0) goto L926
            r12 = 0
            int r2 = (int) r12
            int r1 = java.lang.Math.max(r1, r2)
            int r1 = W0.b.f(r1, r10)
            int r2 = (int) r12
            int r2 = java.lang.Math.max(r3, r2)
            int r2 = W0.b.e(r2, r10)
            if (r2 == r3) goto L921
            int r3 = r0.size()
            r4 = 0
        L914:
            if (r4 >= r3) goto L921
            java.lang.Object r10 = r0.get(r4)
            C.t r10 = (C.t) r10
            r10.f682o = r2
            int r4 = r4 + 1
            goto L914
        L921:
            r30 = r2
        L923:
            r29 = r1
            goto L929
        L926:
            r30 = r3
            goto L923
        L929:
            r.u r27 = r.AbstractC1559j.f16215a
            B0.a r1 = new B0.a
            r2 = 2
            r1.<init>(r2, r8)
            r26 = r0
            r31 = r1
            r25 = r36
            r28 = r45
            java.util.List r48 = E.C.f(r25, r26, r27, r28, r29, r30, r31)
            r28 = r26
            if (r37 == 0) goto L952
            java.lang.Object r0 = n5.l.m0(r28)
            C.t r0 = (C.t) r0
            if (r0 == 0) goto L950
            int r0 = r0.f671a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L960
        L950:
            r0 = 0
            goto L960
        L952:
            java.lang.Object r0 = r7.j()
            C.t r0 = (C.t) r0
            if (r0 == 0) goto L950
            int r0 = r0.f671a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L960:
            if (r37 == 0) goto L977
            java.lang.Object r1 = n5.l.s0(r28)
            C.t r1 = (C.t) r1
            if (r1 == 0) goto L973
            int r1 = r1.f671a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
        L970:
            r1 = r32
            goto L986
        L973:
            r1 = r32
            r12 = 0
            goto L986
        L977:
            java.lang.Object r1 = r7.l()
            C.t r1 = (C.t) r1
            if (r1 == 0) goto L973
            int r1 = r1.f671a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            goto L970
        L986:
            if (r1 < r5) goto L98d
            if (r9 <= r6) goto L98b
            goto L98d
        L98b:
            r24 = 0
        L98d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r30)
            C.r r45 = new C.r
            r50 = 0
            r47 = r28
            r45.<init>(r46, r47, r48, r49, r50)
            r13 = r16
            r6 = r45
            r3 = r47
            r4 = r48
            java.lang.Object r1 = r13.invoke(r1, r2, r6)
            r30 = r1
            z0.D r30 = (z0.InterfaceC1927D) r30
            if (r0 == 0) goto L9b5
            int r6 = r0.intValue()
            goto L9b6
        L9b5:
            r6 = 0
        L9b6:
            if (r12 == 0) goto L9bd
            int r0 = r12.intValue()
            goto L9be
        L9bd:
            r0 = 0
        L9be:
            java.util.List r37 = E.C.m(r6, r0, r3, r4)
            C.s r25 = new C.s
            long r0 = r8.f632c
            r35 = r0
            r40 = r5
            r26 = r15
            r33 = r17
            r38 = r20
            r28 = r24
            r27 = r34
            r32 = r52
            r29 = r53
            r31 = r54
            r34 = r14
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43)
            goto L3bf
        L9e1:
            boolean r1 = r44.r()
            r6 = r51
            r2 = 0
            r6.f(r0, r1, r2)
            return r0
        L9ec:
            a0.r.f(r6, r12, r14)
            throw r0
        L9f0:
            r57 = r2
            z.AbstractC1923a.b(r57)
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C.o.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(A a7, L l7, H5.h hVar, InterfaceC0010g interfaceC0010g, InterfaceC0261w interfaceC0261w, j0.t tVar, E e7, C0715c c0715c) {
        super(2);
        this.f644w = a7;
        this.f639r = l7;
        this.f640s = hVar;
        this.f641t = interfaceC0010g;
        this.f642u = interfaceC0261w;
        this.f643v = e7;
        this.f645x = c0715c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(D.y yVar, L l7, H5.h hVar, D.c cVar, InterfaceC0010g interfaceC0010g, InterfaceC0008e interfaceC0008e, InterfaceC0261w interfaceC0261w, j0.t tVar, E e7) {
        super(2);
        this.f644w = yVar;
        this.f639r = l7;
        this.f640s = hVar;
        this.f645x = cVar;
        this.f641t = interfaceC0010g;
        this.f642u = interfaceC0261w;
        this.f643v = e7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v0 v0Var, B5.c cVar, InterfaceC0725m interfaceC0725m, C1595D c1595d, C1596E c1596e, B5.e eVar, X.e eVar2, int i) {
        super(2);
        this.f644w = v0Var;
        this.f639r = cVar;
        this.f640s = interfaceC0725m;
        this.f641t = c1595d;
        this.f642u = c1596e;
        this.f643v = eVar;
        this.f645x = eVar2;
    }
}
