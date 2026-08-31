package I2;

import B0.C0050o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2403e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f2404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0050o f2405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f2406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile /* synthetic */ int f2407d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AtomicIntegerFieldUpdater.newUpdater(y.class, "d");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(I2.t r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r0.<init>()
            r0.f2404a = r1
            M5.q0 r2 = M5.AbstractC0263y.c()
            M5.t r3 = M5.C0258t.f3884q
            I2.z r4 = new I2.z
            r5 = 0
            r4.<init>(r3, r5)
            q5.h r2 = E3.h.L(r2, r4)
            M5.AbstractC0263y.a(r2)
            Y2.a r2 = new Y2.a
            r2.<init>(r0)
            B0.o r3 = new B0.o
            r3.<init>()
            r3.f499q = r0
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 1
            r7 = 26
            if (r4 < r7) goto L47
            boolean r8 = Y2.d.f8206a
            if (r8 == 0) goto L34
            goto L49
        L34:
            if (r4 == r7) goto L41
            r7 = 27
            if (r4 != r7) goto L3b
            goto L41
        L3b:
            H2.k r4 = new H2.k
            r4.<init>(r6, r6)
            goto L4e
        L41:
            Y2.f r4 = new Y2.f
            r4.<init>()
            goto L4e
        L47:
            boolean r4 = Y2.d.f8206a
        L49:
            H2.k r4 = new H2.k
            r4.<init>(r6, r5)
        L4e:
            r3.f500r = r4
            r0.f2405b = r3
            I2.g r4 = r1.f2382e
            I2.f r7 = new I2.f
            r7.<init>(r4)
            U2.e r1 = r1.f2379b
            I2.m r4 = r1.f7652n
            I2.l r8 = I2.q.f2371a
            java.util.Map r4 = r4.f2367a
            java.lang.Object r4 = r4.get(r8)
            if (r4 != 0) goto L69
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
        L69:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r8 = 2
            java.util.ArrayList r9 = r7.f2352d
            java.util.ArrayList r10 = r7.f2353e
            if (r4 == 0) goto L86
            I2.p r4 = new I2.p
            r4.<init>(r6)
            r9.add(r4)
            I2.p r4 = new I2.p
            r4.<init>(r8)
            r10.add(r4)
        L86:
            O2.a r4 = new O2.a
            r4.<init>(r5)
            java.lang.Class<android.net.Uri> r11 = android.net.Uri.class
            kotlin.jvm.internal.f r11 = kotlin.jvm.internal.z.a(r11)
            r7.c(r4, r11)
            O2.a r4 = new O2.a
            r11 = 3
            r4.<init>(r11)
            java.lang.Class<java.lang.Integer> r12 = java.lang.Integer.class
            kotlin.jvm.internal.f r12 = kotlin.jvm.internal.z.a(r12)
            r7.c(r4, r12)
            N2.a r4 = new N2.a
            r4.<init>(r5)
            java.lang.Class<I2.B> r12 = I2.B.class
            kotlin.jvm.internal.f r13 = kotlin.jvm.internal.z.a(r12)
            m5.j r14 = new m5.j
            r14.<init>(r4, r13)
            java.util.ArrayList r4 = r7.f2351c
            r4.add(r14)
            L2.a r13 = new L2.a
            r13.<init>(r5)
            kotlin.jvm.internal.f r14 = kotlin.jvm.internal.z.a(r12)
            r7.b(r13, r14)
            L2.a r13 = new L2.a
            r14 = 4
            r13.<init>(r14)
            kotlin.jvm.internal.f r15 = kotlin.jvm.internal.z.a(r12)
            r7.b(r13, r15)
            L2.a r13 = new L2.a
            r15 = 9
            r13.<init>(r15)
            kotlin.jvm.internal.f r15 = kotlin.jvm.internal.z.a(r12)
            r7.b(r13, r15)
            L2.a r13 = new L2.a
            r15 = 6
            r13.<init>(r15)
            java.lang.Class<android.graphics.drawable.Drawable> r15 = android.graphics.drawable.Drawable.class
            kotlin.jvm.internal.f r15 = kotlin.jvm.internal.z.a(r15)
            r7.b(r13, r15)
            L2.a r13 = new L2.a
            r13.<init>(r6)
            java.lang.Class<android.graphics.Bitmap> r15 = android.graphics.Bitmap.class
            kotlin.jvm.internal.f r15 = kotlin.jvm.internal.z.a(r15)
            r7.b(r13, r15)
            I2.l r13 = I2.r.f2372a
            I2.m r13 = r1.f7652n
            I2.l r15 = I2.r.f2372a
            java.util.Map r13 = r13.f2367a
            java.lang.Object r13 = r13.get(r15)
            if (r13 != 0) goto L10e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
        L10e:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r15 = U5.j.f7906a
            U5.i r15 = new U5.i
            r15.<init>(r13)
            int r13 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            J2.n r14 = J2.n.f2780a
            if (r13 < r8) goto L15b
            I2.m r8 = r1.f7652n
            I2.l r13 = I2.r.f2374c
            java.util.Map r8 = r8.f2367a
            java.lang.Object r8 = r8.get(r13)
            if (r8 != 0) goto L131
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
        L131:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L15b
            I2.m r8 = r1.f7652n
            I2.l r13 = I2.r.f2373b
            java.util.Map r8 = r8.f2367a
            java.lang.Object r8 = r8.get(r13)
            if (r8 != 0) goto L146
            r8 = r14
        L146:
            J2.n r8 = (J2.n) r8
            boolean r8 = r8.equals(r14)
            if (r8 == 0) goto L15b
            J2.u r8 = new J2.u
            r8.<init>(r15)
            I2.c r13 = new I2.c
            r13.<init>(r8, r5)
            r10.add(r13)
        L15b:
            J2.c r8 = new J2.c
            I2.m r1 = r1.f7652n
            I2.l r13 = I2.r.f2373b
            java.util.Map r1 = r1.f2367a
            java.lang.Object r1 = r1.get(r13)
            if (r1 != 0) goto L16a
            goto L16b
        L16a:
            r14 = r1
        L16b:
            J2.n r14 = (J2.n) r14
            r8.<init>(r15, r14)
            I2.c r1 = new I2.c
            r1.<init>(r8, r5)
            r10.add(r1)
            O2.a r1 = new O2.a
            r1.<init>(r6)
            java.lang.Class<java.io.File> r5 = java.io.File.class
            kotlin.jvm.internal.f r5 = kotlin.jvm.internal.z.a(r5)
            r7.c(r1, r5)
            L2.a r1 = new L2.a
            r5 = 8
            r1.<init>(r5)
            kotlin.jvm.internal.f r5 = kotlin.jvm.internal.z.a(r12)
            r7.b(r1, r5)
            L2.a r1 = new L2.a
            r1.<init>(r11)
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            kotlin.jvm.internal.f r5 = kotlin.jvm.internal.z.a(r5)
            r7.b(r1, r5)
            O2.a r1 = new O2.a
            r5 = 4
            r1.<init>(r5)
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            kotlin.jvm.internal.f r5 = kotlin.jvm.internal.z.a(r5)
            r7.c(r1, r5)
            O2.a r1 = new O2.a
            r5 = 2
            r1.<init>(r5)
            java.lang.Class<q6.x> r8 = q6.x.class
            kotlin.jvm.internal.f r8 = kotlin.jvm.internal.z.a(r8)
            r7.c(r1, r8)
            N2.a r1 = new N2.a
            r1.<init>(r6)
            kotlin.jvm.internal.f r6 = kotlin.jvm.internal.z.a(r12)
            m5.j r8 = new m5.j
            r8.<init>(r1, r6)
            r4.add(r8)
            N2.a r1 = new N2.a
            r1.<init>(r5)
            kotlin.jvm.internal.f r6 = kotlin.jvm.internal.z.a(r12)
            m5.j r8 = new m5.j
            r8.<init>(r1, r6)
            r4.add(r8)
            L2.a r1 = new L2.a
            r6 = 7
            r1.<init>(r6)
            kotlin.jvm.internal.f r6 = kotlin.jvm.internal.z.a(r12)
            r7.b(r1, r6)
            L2.a r1 = new L2.a
            r1.<init>(r5)
            java.lang.Class<byte[]> r5 = byte[].class
            kotlin.jvm.internal.f r5 = kotlin.jvm.internal.z.a(r5)
            r7.b(r1, r5)
            L2.a r1 = new L2.a
            r5 = 5
            r1.<init>(r5)
            kotlin.jvm.internal.f r5 = kotlin.jvm.internal.z.a(r12)
            r7.b(r1, r5)
            M2.h r1 = new M2.h
            r1.<init>(r0, r2, r3)
            java.util.ArrayList r2 = r7.f2349a
            r2.add(r1)
            I2.g r11 = new I2.g
            java.util.List r12 = n5.AbstractC1397A.E(r2)
            java.util.ArrayList r1 = r7.f2350b
            java.util.List r13 = n5.AbstractC1397A.E(r1)
            java.util.List r14 = n5.AbstractC1397A.E(r4)
            java.util.List r15 = n5.AbstractC1397A.E(r9)
            java.util.List r16 = n5.AbstractC1397A.E(r10)
            r11.<init>(r12, r13, r14, r15, r16)
            r0.f2406c = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.y.<init>(I2.t):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x019d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x003a */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:8))(0)|7|9|123|(1:(1:(1:(6:14|15|86|(1:88)(2:89|(1:91)(2:94|95))|92|93)(2:19|20))(10:21|22|23|121|80|81|118|82|(5:85|86|(0)(0)|92|93)|84))(4:24|116|25|72))(15:29|(1:31)(1:32)|33|(4:(4:36|(3:40|(2:128|44)(1:43)|37)|127|39)(1:44)|124|105|(3:107|108|109)(2:112|113))(0)|(1:46)(1:47)|48|(1:50)(1:51)|52|(1:54)|55|(2:(1:61)(1:60)|62)|63|120|64|(2:66|(3:68|(2:71|72)|84)(1:75))(2:103|104))|125|76|(7:79|121|80|81|118|82|(0))|84|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ab A[Catch: all -> 0x01bb, TRY_LEAVE, TryCatch #5 {all -> 0x01bb, blocks: (B:105:0x01a7, B:107:0x01ab, B:112:0x01bd, B:113:0x01c3), top: B:124:0x01a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bd A[Catch: all -> 0x01bb, TRY_ENTER, TryCatch #5 {all -> 0x01bb, blocks: (B:105:0x01a7, B:107:0x01ab, B:112:0x01bd, B:113:0x01c3), top: B:124:0x01a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a A[Catch: all -> 0x003a, TryCatch #4 {all -> 0x003a, blocks: (B:15:0x0035, B:86:0x0164, B:88:0x016a, B:89:0x0179, B:91:0x017d, B:94:0x018f, B:95:0x0194, B:22:0x004d), top: B:123:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179 A[Catch: all -> 0x003a, TryCatch #4 {all -> 0x003a, blocks: (B:15:0x0035, B:86:0x0164, B:88:0x016a, B:89:0x0179, B:91:0x017d, B:94:0x018f, B:95:0x0194, B:22:0x004d), top: B:123:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [U2.o] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v20, types: [I2.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [I2.i] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [U2.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [I2.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [U2.o] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [U2.o] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6, types: [U2.o] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(U2.g r15, int r16, s5.c r17) {
        /*
            r14 = this;
            r0 = r15
            r1 = r17
            boolean r3 = r1 instanceof I2.w
            if (r3 == 0) goto L17
            r3 = r1
            I2.w r3 = (I2.w) r3
            int r4 = r3.f2396w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f2396w = r4
        L15:
            r7 = r3
            goto L1d
        L17:
            I2.w r3 = new I2.w
            r3.<init>(r14, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r7.f2394u
            int r3 = r7.f2396w
            r8 = 3
            r4 = 2
            r5 = 1
            r9 = 0
            r5.a r10 = r5.EnumC1580a.f16356q
            if (r3 == 0) goto L67
            if (r3 == r5) goto L57
            if (r3 == r4) goto L45
            if (r3 != r8) goto L3d
            I2.i r3 = r7.f2392s
            U2.g r4 = r7.f2391r
            U2.o r5 = r7.f2390q
            m5.AbstractC1362a.e(r1)     // Catch: java.lang.Throwable -> L3a
            goto L164
        L3a:
            r0 = move-exception
            goto L1a7
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L45:
            I2.n r0 = r7.f2393t
            I2.i r3 = r7.f2392s
            U2.g r4 = r7.f2391r
            U2.o r5 = r7.f2390q
            m5.AbstractC1362a.e(r1)     // Catch: java.lang.Throwable -> L3a
            r11 = r4
            r4 = r3
            r3 = r11
            r11 = r5
            r5 = r0
            goto L13e
        L57:
            I2.i r3 = r7.f2392s
            U2.g r5 = r7.f2391r
            U2.o r6 = r7.f2390q
            m5.AbstractC1362a.e(r1)     // Catch: java.lang.Throwable -> L62
            goto L115
        L62:
            r0 = move-exception
            r4 = r5
            r5 = r6
            goto L1a7
        L67:
            m5.AbstractC1362a.e(r1)
            q5.h r1 = r7.getContext()
            M5.b0 r1 = M5.AbstractC0263y.n(r1)
            if (r16 != 0) goto L76
            r3 = r5
            goto L77
        L76:
            r3 = 0
        L77:
            B0.o r6 = r14.f2405b
            r6.getClass()
            r15.getClass()
            android.content.Context r11 = r0.f7658a
            I2.l r12 = U2.i.f7681d
            java.lang.Object r12 = I2.q.d(r15, r12)
            androidx.lifecycle.q r12 = (androidx.lifecycle.AbstractC0654q) r12
            if (r12 != 0) goto La7
            if (r3 == 0) goto La6
            r3 = r11
        L8e:
            boolean r12 = r3 instanceof androidx.lifecycle.InterfaceC0660x
            if (r12 == 0) goto L9a
            androidx.lifecycle.x r3 = (androidx.lifecycle.InterfaceC0660x) r3
            androidx.lifecycle.q r3 = r3.getLifecycle()
            r12 = r3
            goto La7
        L9a:
            boolean r12 = r3 instanceof android.content.ContextWrapper
            if (r12 != 0) goto L9f
            goto La6
        L9f:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L8e
        La6:
            r12 = r9
        La7:
            if (r12 == 0) goto Laf
            U2.k r3 = new U2.k
            r3.<init>(r12, r1)
            goto Lb4
        Laf:
            U2.a r3 = new U2.a
            r3.<init>(r1)
        Lb4:
            U2.d r1 = new U2.d
            r1.<init>(r15, r11)
            java.lang.Object r6 = r6.f499q
            I2.y r6 = (I2.y) r6
            I2.t r6 = r6.f2404a
            U2.e r6 = r6.f2379b
            r1.f7634b = r6
            U2.f r6 = r0.f7672r
            V2.i r11 = r6.f7656d
            if (r11 != 0) goto Lce
            V2.e r12 = V2.i.f7967a
            r1.f7639h = r12
            goto Lcf
        Lce:
            r12 = r11
        Lcf:
            V2.g r13 = r6.f7657e
            if (r13 != 0) goto Ld7
            V2.g r0 = r0.f7669o
            r1.i = r0
        Ld7:
            V2.d r0 = r6.f
            if (r0 != 0) goto Lec
            if (r11 != 0) goto Le8
            V2.e r0 = V2.i.f7967a
            boolean r0 = kotlin.jvm.internal.m.a(r12, r0)
            if (r0 == 0) goto Le8
            V2.d r0 = V2.d.f7960r
            goto Lea
        Le8:
            V2.d r0 = V2.d.f7959q
        Lea:
            r1.j = r0
        Lec:
            U2.g r1 = r1.a()
            I2.i r6 = I2.i.f2361a
            java.lang.Object r0 = r1.f7659b     // Catch: java.lang.Throwable -> L118
            U2.l r11 = U2.l.f7685a     // Catch: java.lang.Throwable -> L118
            boolean r0 = r0.equals(r11)     // Catch: java.lang.Throwable -> L118
            if (r0 != 0) goto L19f
            r3.start()     // Catch: java.lang.Throwable -> L118
            if (r16 != 0) goto L11e
            r7.f2390q = r3     // Catch: java.lang.Throwable -> L118
            r7.f2391r = r1     // Catch: java.lang.Throwable -> L118
            r7.f2392s = r6     // Catch: java.lang.Throwable -> L118
            r7.f2396w = r5     // Catch: java.lang.Throwable -> L118
            java.lang.Object r0 = r3.d(r7)     // Catch: java.lang.Throwable -> L118
            if (r0 != r10) goto L111
            goto L15f
        L111:
            r5 = r6
            r6 = r3
            r3 = r5
            r5 = r1
        L115:
            r1 = r5
            r5 = r6
            goto L120
        L118:
            r0 = move-exception
            r4 = r1
            r5 = r3
            r3 = r6
            goto L1a7
        L11e:
            r5 = r3
            r3 = r6
        L120:
            r1.getClass()     // Catch: java.lang.Throwable -> L19d
            r3.getClass()     // Catch: java.lang.Throwable -> L19d
            V2.i r0 = r1.f7668n     // Catch: java.lang.Throwable -> L19d
            r7.f2390q = r5     // Catch: java.lang.Throwable -> L19d
            r7.f2391r = r1     // Catch: java.lang.Throwable -> L19d
            r7.f2392s = r3     // Catch: java.lang.Throwable -> L19d
            r7.f2393t = r9     // Catch: java.lang.Throwable -> L19d
            r7.f2396w = r4     // Catch: java.lang.Throwable -> L19d
            java.lang.Object r0 = r0.a(r7)     // Catch: java.lang.Throwable -> L19d
            if (r0 != r10) goto L139
            goto L15f
        L139:
            r4 = r3
            r11 = r5
            r5 = r9
            r3 = r1
            r1 = r0
        L13e:
            V2.h r1 = (V2.h) r1     // Catch: java.lang.Throwable -> L19a
            r4.getClass()     // Catch: java.lang.Throwable -> L19a
            q5.h r12 = r3.f7662e     // Catch: java.lang.Throwable -> L19a
            I2.x r0 = new I2.x     // Catch: java.lang.Throwable -> L19a
            r6 = 0
            r2 = r3
            r3 = r1
            r1 = r2
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L195
            r7.f2390q = r11     // Catch: java.lang.Throwable -> L195
            r7.f2391r = r1     // Catch: java.lang.Throwable -> L195
            r7.f2392s = r4     // Catch: java.lang.Throwable -> L195
            r7.f2393t = r9     // Catch: java.lang.Throwable -> L195
            r7.f2396w = r8     // Catch: java.lang.Throwable -> L195
            java.lang.Object r0 = M5.AbstractC0263y.B(r12, r0, r7)     // Catch: java.lang.Throwable -> L195
            if (r0 != r10) goto L160
        L15f:
            return r10
        L160:
            r3 = r4
            r5 = r11
            r4 = r1
            r1 = r0
        L164:
            U2.j r1 = (U2.j) r1     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r1 instanceof U2.p     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L179
            r0 = r1
            U2.p r0 = (U2.p) r0     // Catch: java.lang.Throwable -> L3a
            r4.getClass()     // Catch: java.lang.Throwable -> L3a
            U2.g r0 = r0.f7694b     // Catch: java.lang.Throwable -> L3a
            r3.getClass()     // Catch: java.lang.Throwable -> L3a
            r0.getClass()     // Catch: java.lang.Throwable -> L3a
            goto L18b
        L179:
            boolean r0 = r1 instanceof U2.c     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L18f
            r0 = r1
            U2.c r0 = (U2.c) r0     // Catch: java.lang.Throwable -> L3a
            r4.getClass()     // Catch: java.lang.Throwable -> L3a
            U2.g r0 = r0.f7631b     // Catch: java.lang.Throwable -> L3a
            r3.getClass()     // Catch: java.lang.Throwable -> L3a
            r0.getClass()     // Catch: java.lang.Throwable -> L3a
        L18b:
            r5.a()
            return r1
        L18f:
            C2.e r0 = new C2.e     // Catch: java.lang.Throwable -> L3a
            r0.<init>()     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.Throwable -> L3a
        L195:
            r0 = move-exception
        L196:
            r3 = r4
            r5 = r11
        L198:
            r4 = r1
            goto L1a7
        L19a:
            r0 = move-exception
            r1 = r3
            goto L196
        L19d:
            r0 = move-exception
            goto L198
        L19f:
            U2.m r0 = new U2.m     // Catch: java.lang.Throwable -> L118
            java.lang.String r2 = "The request's data is null."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L118
            throw r0     // Catch: java.lang.Throwable -> L118
        L1a7:
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L1bb
            if (r1 != 0) goto L1bd
            U2.c r0 = Q2.g.b(r4, r0)     // Catch: java.lang.Throwable -> L1bb
            U2.g r1 = r0.f7631b     // Catch: java.lang.Throwable -> L1bb
            r3.getClass()     // Catch: java.lang.Throwable -> L1bb
            r1.getClass()     // Catch: java.lang.Throwable -> L1bb
            r5.a()
            return r0
        L1bb:
            r0 = move-exception
            goto L1c4
        L1bd:
            r3.getClass()     // Catch: java.lang.Throwable -> L1bb
            r4.getClass()     // Catch: java.lang.Throwable -> L1bb
            throw r0     // Catch: java.lang.Throwable -> L1bb
        L1c4:
            r5.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.y.a(U2.g, int, s5.c):java.lang.Object");
    }
}
