package M2;

import B0.C0050o;
import I2.y;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f3778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y2.a f3779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0050o f3780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3.c f3781d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(y yVar, Y2.a aVar, C0050o c0050o) {
        this.f3778a = yVar;
        this.f3779b = aVar;
        this.f3780c = c0050o;
        k3.c cVar = new k3.c();
        cVar.f14120q = yVar;
        this.f3781d = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a1 -> B:27:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(M2.h r5, L2.i r6, I2.g r7, U2.g r8, java.lang.Object r9, U2.n r10, I2.i r11, s5.c r12) {
        /*
            boolean r0 = r12 instanceof M2.b
            if (r0 == 0) goto L13
            r0 = r12
            M2.b r0 = (M2.b) r0
            int r1 = r0.f3738z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3738z = r1
            goto L18
        L13:
            M2.b r0 = new M2.b
            r0.<init>(r5, r12)
        L18:
            java.lang.Object r5 = r0.f3736x
            int r12 = r0.f3738z
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L42
            if (r12 != r2) goto L3a
            int r6 = r0.f3735w
            I2.i r7 = r0.f3734v
            U2.n r8 = r0.f3733u
            java.lang.Object r9 = r0.f3732t
            U2.g r10 = r0.f3731s
            I2.g r11 = r0.f3730r
            L2.i r12 = r0.f3729q
            m5.AbstractC1362a.e(r5)
            r4 = r11
            r11 = r7
            r7 = r4
            r4 = r10
            r10 = r8
            r8 = r4
            goto La4
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L42:
            m5.AbstractC1362a.e(r5)
            r5 = 0
        L46:
            m5.o r12 = r7.f2359g
            java.lang.Object r12 = r12.getValue()
            java.util.List r12 = (java.util.List) r12
            int r12 = r12.size()
        L52:
            if (r5 >= r12) goto L75
            m5.o r3 = r7.f2359g
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r5)
            J2.j r3 = (J2.j) r3
            J2.k r3 = r3.a(r6, r10)
            if (r3 == 0) goto L72
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            m5.j r12 = new m5.j
            r12.<init>(r3, r5)
            goto L76
        L72:
            int r5 = r5 + 1
            goto L52
        L75:
            r12 = r1
        L76:
            if (r12 == 0) goto Lc9
            java.lang.Object r5 = r12.f15080q
            J2.k r5 = (J2.k) r5
            java.lang.Object r12 = r12.f15081r
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            int r12 = r12 + r2
            r11.getClass()
            r0.f3729q = r6
            r0.f3730r = r7
            r0.f3731s = r8
            r0.f3732t = r9
            r0.f3733u = r10
            r0.f3734v = r11
            r0.f3735w = r12
            r0.f3738z = r2
            java.lang.Object r5 = r5.a(r0)
            r5.a r3 = r5.EnumC1580a.f16356q
            if (r5 != r3) goto La1
            return r3
        La1:
            r4 = r12
            r12 = r6
            r6 = r4
        La4:
            J2.i r5 = (J2.i) r5
            r11.getClass()
            if (r5 == 0) goto Lc5
            M2.a r6 = new M2.a
            I2.n r7 = r5.f2772a
            boolean r5 = r5.f2773b
            J2.h r8 = r12.f3262c
            J2.q r9 = r12.f3260a
            boolean r10 = r9 instanceof J2.p
            if (r10 == 0) goto Lbc
            J2.p r9 = (J2.p) r9
            goto Lbd
        Lbc:
            r9 = r1
        Lbd:
            if (r9 == 0) goto Lc1
            java.lang.String r1 = r9.f2784s
        Lc1:
            r6.<init>(r7, r5, r8, r1)
            return r6
        Lc5:
            r5 = r6
            r6 = r12
            goto L46
        Lc9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to create a decoder that supports: "
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.h.a(M2.h, L2.i, I2.g, U2.g, java.lang.Object, U2.n, I2.i, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x004d */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: kotlin.jvm.internal.y */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0149, code lost:
    
        if (r1 == r12) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(M2.h r15, U2.g r16, java.lang.Object r17, U2.n r18, I2.i r19, s5.c r20) throws java.lang.Throwable {
        /*
            r1 = r20
            boolean r2 = r1 instanceof M2.c
            if (r2 == 0) goto L16
            r2 = r1
            M2.c r2 = (M2.c) r2
            int r3 = r2.f3748z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f3748z = r3
        L14:
            r6 = r2
            goto L1c
        L16:
            M2.c r2 = new M2.c
            r2.<init>(r15, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r6.f3746x
            int r2 = r6.f3748z
            r9 = 3
            r10 = 2
            r3 = 1
            r11 = 0
            r5.a r12 = r5.EnumC1580a.f16356q
            if (r2 == 0) goto L6e
            if (r2 == r3) goto L50
            if (r2 == r10) goto L3b
            if (r2 != r9) goto L33
            m5.AbstractC1362a.e(r1)
            goto L14c
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            kotlin.jvm.internal.y r2 = r6.f3742t
            java.lang.Object r0 = r6.f3741s
            kotlin.jvm.internal.y r0 = (kotlin.jvm.internal.y) r0
            java.lang.Object r3 = r6.f3740r
            I2.i r3 = (I2.i) r3
            U2.g r4 = r6.f3739q
            m5.AbstractC1362a.e(r1)     // Catch: java.lang.Throwable -> L4d
            r14 = r6
            goto Lfc
        L4d:
            r0 = move-exception
            goto L166
        L50:
            kotlin.jvm.internal.y r2 = r6.f3745w
            kotlin.jvm.internal.y r3 = r6.f3744v
            kotlin.jvm.internal.y r4 = r6.f3743u
            kotlin.jvm.internal.y r5 = r6.f3742t
            java.lang.Object r7 = r6.f3741s
            I2.i r7 = (I2.i) r7
            java.lang.Object r8 = r6.f3740r
            U2.g r13 = r6.f3739q
            m5.AbstractC1362a.e(r1)     // Catch: java.lang.Throwable -> L6a
            r14 = r6
            r6 = r5
            r5 = r8
            r8 = r4
            r4 = r13
            goto Lcd
        L6a:
            r0 = move-exception
            r2 = r3
            goto L166
        L6e:
            m5.AbstractC1362a.e(r1)
            kotlin.jvm.internal.y r7 = new kotlin.jvm.internal.y
            r7.<init>()
            r1 = r18
            r7.f14268q = r1
            kotlin.jvm.internal.y r8 = new kotlin.jvm.internal.y
            r8.<init>()
            I2.y r1 = r15.f3778a
            I2.g r1 = r1.f2406c
            r8.f14268q = r1
            kotlin.jvm.internal.y r13 = new kotlin.jvm.internal.y
            r13.<init>()
            B0.o r1 = r15.f3780c     // Catch: java.lang.Throwable -> L164
            java.lang.Object r2 = r7.f14268q     // Catch: java.lang.Throwable -> L164
            U2.n r2 = (U2.n) r2     // Catch: java.lang.Throwable -> L164
            U2.n r1 = r1.H(r2)     // Catch: java.lang.Throwable -> L164
            r7.f14268q = r1     // Catch: java.lang.Throwable -> L164
            r16.getClass()     // Catch: java.lang.Throwable -> L164
            java.lang.Object r1 = r8.f14268q     // Catch: java.lang.Throwable -> L164
            I2.g r1 = (I2.g) r1     // Catch: java.lang.Throwable -> L164
            java.lang.Object r2 = r7.f14268q     // Catch: java.lang.Throwable -> L164
            r4 = r2
            U2.n r4 = (U2.n) r4     // Catch: java.lang.Throwable -> L164
            r2 = r16
            r6.f3739q = r2     // Catch: java.lang.Throwable -> L164
            r5 = r17
            r6.f3740r = r5     // Catch: java.lang.Throwable -> L164
            r14 = r19
            r6.f3741s = r14     // Catch: java.lang.Throwable -> L164
            r6.f3742t = r7     // Catch: java.lang.Throwable -> L164
            r6.f3743u = r8     // Catch: java.lang.Throwable -> L164
            r6.f3744v = r13     // Catch: java.lang.Throwable -> L164
            r6.f3745w = r13     // Catch: java.lang.Throwable -> L164
            r6.f3748z = r3     // Catch: java.lang.Throwable -> L164
            r0 = r15
            r3 = r5
            r5 = r14
            java.lang.Object r1 = r0.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L164
            r14 = r6
            if (r1 != r12) goto Lc4
            goto L14b
        Lc4:
            r4 = r16
            r5 = r17
            r6 = r7
            r2 = r13
            r3 = r2
            r7 = r19
        Lcd:
            r2.f14268q = r1     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r3.f14268q     // Catch: java.lang.Throwable -> L6a
            r1 = r0
            L2.e r1 = (L2.e) r1     // Catch: java.lang.Throwable -> L6a
            boolean r2 = r1 instanceof L2.i     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L102
            q5.h r13 = r4.f7663g     // Catch: java.lang.Throwable -> L6a
            M2.d r0 = new M2.d     // Catch: java.lang.Throwable -> L6a
            r2 = r3
            r3 = r8
            r8 = 0
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4d
            r14.f3739q = r4     // Catch: java.lang.Throwable -> L4d
            r14.f3740r = r7     // Catch: java.lang.Throwable -> L4d
            r14.f3741s = r6     // Catch: java.lang.Throwable -> L4d
            r14.f3742t = r2     // Catch: java.lang.Throwable -> L4d
            r14.f3743u = r11     // Catch: java.lang.Throwable -> L4d
            r14.f3744v = r11     // Catch: java.lang.Throwable -> L4d
            r14.f3745w = r11     // Catch: java.lang.Throwable -> L4d
            r14.f3748z = r10     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r1 = M5.AbstractC0263y.B(r13, r0, r14)     // Catch: java.lang.Throwable -> L4d
            if (r1 != r12) goto Lfa
            goto L14b
        Lfa:
            r0 = r6
            r3 = r7
        Lfc:
            M2.a r1 = (M2.a) r1     // Catch: java.lang.Throwable -> L4d
            r6 = r0
            r7 = r3
        L100:
            r3 = r2
            goto L11b
        L102:
            r2 = r3
            boolean r1 = r1 instanceof L2.h     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L15e
            M2.a r1 = new M2.a     // Catch: java.lang.Throwable -> L4d
            r3 = r0
            L2.h r3 = (L2.h) r3     // Catch: java.lang.Throwable -> L4d
            I2.n r3 = r3.f3257a     // Catch: java.lang.Throwable -> L4d
            r5 = r0
            L2.h r5 = (L2.h) r5     // Catch: java.lang.Throwable -> L4d
            boolean r5 = r5.f3258b     // Catch: java.lang.Throwable -> L4d
            L2.h r0 = (L2.h) r0     // Catch: java.lang.Throwable -> L4d
            J2.h r0 = r0.f3259c     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r3, r5, r0, r11)     // Catch: java.lang.Throwable -> L4d
            goto L100
        L11b:
            java.lang.Object r0 = r3.f14268q
            boolean r2 = r0 instanceof L2.i
            if (r2 == 0) goto L124
            L2.i r0 = (L2.i) r0
            goto L125
        L124:
            r0 = r11
        L125:
            if (r0 == 0) goto L131
            J2.q r0 = r0.f3260a
            if (r0 == 0) goto L131
            C0.S.s(r0)     // Catch: java.lang.RuntimeException -> L12f java.lang.Exception -> L131
            goto L131
        L12f:
            r0 = move-exception
            throw r0
        L131:
            java.lang.Object r0 = r6.f14268q
            U2.n r0 = (U2.n) r0
            r14.f3739q = r11
            r14.f3740r = r11
            r14.f3741s = r11
            r14.f3742t = r11
            r14.f3743u = r11
            r14.f3744v = r11
            r14.f3745w = r11
            r14.f3748z = r9
            M2.a r1 = a.AbstractC0597a.V(r1, r4, r0, r7, r14)
            if (r1 != r12) goto L14c
        L14b:
            return r12
        L14c:
            M2.a r1 = (M2.a) r1
            I2.n r0 = r1.f3725a
            android.graphics.Bitmap$Config[] r2 = Y2.j.f8215a
            boolean r2 = r0 instanceof I2.C0167a
            if (r2 == 0) goto L15d
            I2.a r0 = (I2.C0167a) r0
            android.graphics.Bitmap r0 = r0.f2339a
            r0.prepareToDraw()
        L15d:
            return r1
        L15e:
            C2.e r0 = new C2.e     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            throw r0     // Catch: java.lang.Throwable -> L4d
        L164:
            r0 = move-exception
            r2 = r13
        L166:
            java.lang.Object r1 = r2.f14268q
            boolean r2 = r1 instanceof L2.i
            if (r2 == 0) goto L16f
            r11 = r1
            L2.i r11 = (L2.i) r11
        L16f:
            if (r11 == 0) goto L17b
            J2.q r1 = r11.f3260a
            if (r1 == 0) goto L17b
            C0.S.s(r1)     // Catch: java.lang.RuntimeException -> L179 java.lang.Exception -> L17b
            goto L17b
        L179:
            r0 = move-exception
            throw r0
        L17b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.h.b(M2.h, U2.g, java.lang.Object, U2.n, I2.i, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b5 -> B:28:0x00b8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(I2.g r8, U2.g r9, java.lang.Object r10, U2.n r11, I2.i r12, s5.c r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof M2.e
            if (r0 == 0) goto L13
            r0 = r13
            M2.e r0 = (M2.e) r0
            int r1 = r0.f3765y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3765y = r1
            goto L18
        L13:
            M2.e r0 = new M2.e
            r0.<init>(r7, r13)
        L18:
            java.lang.Object r13 = r0.f3763w
            int r1 = r0.f3765y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L44
            if (r1 != r3) goto L3c
            int r8 = r0.f3762v
            I2.i r9 = r0.f3761u
            U2.n r10 = r0.f3760t
            java.lang.Object r11 = r0.f3759s
            U2.g r12 = r0.f3758r
            I2.g r1 = r0.f3757q
            m5.AbstractC1362a.e(r13)
            r6 = r1
            r1 = r8
            r8 = r6
            r6 = r12
            r12 = r9
            r9 = r6
            r6 = r11
            r11 = r10
            r10 = r6
            goto Lb8
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            m5.AbstractC1362a.e(r13)
            r13 = 0
        L48:
            m5.o r1 = r8.f
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
        L54:
            if (r13 >= r1) goto L8e
            m5.o r4 = r8.f
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = r4.get(r13)
            m5.j r4 = (m5.C1371j) r4
            java.lang.Object r5 = r4.f15080q
            L2.f r5 = (L2.f) r5
            java.lang.Object r4 = r4.f15081r
            H5.c r4 = (H5.c) r4
            kotlin.jvm.internal.f r4 = (kotlin.jvm.internal.f) r4
            boolean r4 = r4.d(r10)
            if (r4 == 0) goto L8b
            java.lang.String r4 = "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>"
            kotlin.jvm.internal.m.c(r5, r4)
            I2.y r4 = r7.f3778a
            L2.g r4 = r5.a(r10, r11, r4)
            if (r4 == 0) goto L8b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            m5.j r1 = new m5.j
            r1.<init>(r4, r13)
            goto L8f
        L8b:
            int r13 = r13 + 1
            goto L54
        L8e:
            r1 = r2
        L8f:
            if (r1 == 0) goto Ld7
            java.lang.Object r13 = r1.f15080q
            L2.g r13 = (L2.g) r13
            java.lang.Object r1 = r1.f15081r
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + r3
            r12.getClass()
            r0.f3757q = r8
            r0.f3758r = r9
            r0.f3759s = r10
            r0.f3760t = r11
            r0.f3761u = r12
            r0.f3762v = r1
            r0.f3765y = r3
            java.lang.Object r13 = r13.a(r0)
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r13 != r4) goto Lb8
            return r4
        Lb8:
            L2.e r13 = (L2.e) r13
            r12.getClass()     // Catch: java.lang.Throwable -> Lc2
            if (r13 == 0) goto Lc0
            return r13
        Lc0:
            r13 = r1
            goto L48
        Lc2:
            r8 = move-exception
            boolean r9 = r13 instanceof L2.i
            if (r9 == 0) goto Lca
            r2 = r13
            L2.i r2 = (L2.i) r2
        Lca:
            if (r2 == 0) goto Ld6
            J2.q r9 = r2.f3260a
            if (r9 == 0) goto Ld6
            C0.S.s(r9)     // Catch: java.lang.RuntimeException -> Ld4 java.lang.Exception -> Ld6
            goto Ld6
        Ld4:
            r8 = move-exception
            throw r8
        Ld6:
            throw r8
        Ld7:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unable to create a fetcher that supports: "
            r8.<init>(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.h.c(I2.g, U2.g, java.lang.Object, U2.n, I2.i, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(M2.k r20, s5.c r21) throws java.lang.Throwable {
        /*
            r19 = this;
            r1 = r19
            r7 = r20
            r0 = r21
            k3.c r2 = r1.f3781d
            boolean r3 = r0 instanceof M2.f
            if (r3 == 0) goto L1c
            r3 = r0
            M2.f r3 = (M2.f) r3
            int r4 = r3.f3769t
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1c
            int r4 = r4 - r5
            r3.f3769t = r4
        L1a:
            r9 = r3
            goto L22
        L1c:
            M2.f r3 = new M2.f
            r3.<init>(r1, r0)
            goto L1a
        L22:
            java.lang.Object r0 = r9.f3767r
            int r3 = r9.f3769t
            r10 = 1
            if (r3 == 0) goto L3d
            if (r3 != r10) goto L35
            M2.k r2 = r9.f3766q
            m5.AbstractC1362a.e(r0)     // Catch: java.lang.Throwable -> L31
            return r0
        L31:
            r0 = move-exception
            r7 = r2
            goto Lf0
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3d:
            m5.AbstractC1362a.e(r0)
            java.lang.Object r0 = r7.f3799e     // Catch: java.lang.Throwable -> L99
            r13 = r0
            U2.g r13 = (U2.g) r13     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = r13.f7659b     // Catch: java.lang.Throwable -> L99
            java.lang.Object r3 = r7.f     // Catch: java.lang.Throwable -> L99
            V2.h r3 = (V2.h) r3     // Catch: java.lang.Throwable -> L99
            java.lang.Object r4 = r7.f3800g     // Catch: java.lang.Throwable -> L99
            r5 = r4
            I2.i r5 = (I2.i) r5     // Catch: java.lang.Throwable -> L99
            B0.o r4 = r1.f3780c     // Catch: java.lang.Throwable -> L99
            U2.n r4 = r4.G(r13, r3)     // Catch: java.lang.Throwable -> L99
            V2.g r6 = r4.f7688c     // Catch: java.lang.Throwable -> L99
            I2.y r8 = r1.f3778a     // Catch: java.lang.Throwable -> L99
            I2.g r8 = r8.f2406c     // Catch: java.lang.Throwable -> L99
            java.util.List r8 = r8.f2355b     // Catch: java.lang.Throwable -> L99
            r11 = r8
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.lang.Throwable -> L99
            int r11 = r11.size()     // Catch: java.lang.Throwable -> L99
            r14 = 0
        L66:
            if (r14 >= r11) goto L8d
            java.lang.Object r15 = r8.get(r14)     // Catch: java.lang.Throwable -> L99
            m5.j r15 = (m5.C1371j) r15     // Catch: java.lang.Throwable -> L99
            java.lang.Object r12 = r15.f15080q     // Catch: java.lang.Throwable -> L99
            O2.a r12 = (O2.a) r12     // Catch: java.lang.Throwable -> L99
            java.lang.Object r15 = r15.f15081r     // Catch: java.lang.Throwable -> L99
            H5.c r15 = (H5.c) r15     // Catch: java.lang.Throwable -> L99
            kotlin.jvm.internal.f r15 = (kotlin.jvm.internal.f) r15     // Catch: java.lang.Throwable -> L99
            boolean r15 = r15.d(r0)     // Catch: java.lang.Throwable -> L99
            if (r15 == 0) goto L8a
            java.lang.String r15 = "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>"
            kotlin.jvm.internal.m.c(r12, r15)     // Catch: java.lang.Throwable -> L99
            I2.B r12 = r12.a(r0, r4)     // Catch: java.lang.Throwable -> L99
            if (r12 == 0) goto L8a
            r0 = r12
        L8a:
            int r14 = r14 + 1
            goto L66
        L8d:
            P2.a r15 = r2.p(r13, r0, r4, r5)     // Catch: java.lang.Throwable -> L99
            r8 = 0
            if (r15 == 0) goto L9b
            P2.b r2 = r2.i(r13, r15, r3, r6)     // Catch: java.lang.Throwable -> L99
            goto L9c
        L99:
            r0 = move-exception
            goto Lf0
        L9b:
            r2 = r8
        L9c:
            if (r2 == 0) goto Ld7
            java.util.Map r0 = r2.f5617b     // Catch: java.lang.Throwable -> L99
            U2.p r11 = new U2.p     // Catch: java.lang.Throwable -> L99
            I2.n r12 = r2.f5616a     // Catch: java.lang.Throwable -> L99
            J2.h r14 = J2.h.f2767q     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "coil#disk_cache_key"
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L99
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L99
            if (r3 == 0) goto Lb5
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L99
            r16 = r2
            goto Lb7
        Lb5:
            r16 = r8
        Lb7:
            java.lang.String r2 = "coil#is_sampled"
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L99
            boolean r2 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto Lc4
            r8 = r0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L99
        Lc4:
            if (r8 == 0) goto Lcd
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L99
            r17 = r0
            goto Lcf
        Lcd:
            r17 = 0
        Lcf:
            boolean r0 = r7.f3797c     // Catch: java.lang.Throwable -> L99
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L99
            return r11
        Ld7:
            q5.h r11 = r13.f     // Catch: java.lang.Throwable -> L99
            r3 = r0
            M2.g r0 = new M2.g     // Catch: java.lang.Throwable -> L99
            r8 = 0
            r2 = r13
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L99
            r9.f3766q = r7     // Catch: java.lang.Throwable -> L99
            r9.f3769t = r10     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = M5.AbstractC0263y.B(r11, r0, r9)     // Catch: java.lang.Throwable -> L99
            r5.a r1 = r5.EnumC1580a.f16356q
            if (r0 != r1) goto Lef
            return r1
        Lef:
            return r0
        Lf0:
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto Lfd
            java.lang.Object r1 = r7.f3799e
            U2.g r1 = (U2.g) r1
            U2.c r0 = Q2.g.b(r1, r0)
            return r0
        Lfd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.h.d(M2.k, s5.c):java.lang.Object");
    }
}
