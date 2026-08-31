package y2;

import B0.G0;
import H2.m;
import t2.l;

/* JADX INFO: renamed from: y2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1913i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f18609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f18610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G0 f18611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3.d f18612d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1913i(l lVar, m mVar, G0 g02) {
        this.f18609a = lVar;
        this.f18610b = mVar;
        this.f18611c = g02;
        this.f18612d = new k3.d(2, lVar, g02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a4 -> B:23:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(y2.C1913i r8, x2.m r9, t2.C1617b r10, D2.j r11, java.lang.Object r12, D2.n r13, t2.C1618c r14, s5.c r15) throws java.lang.Throwable {
        /*
            r8.getClass()
            boolean r0 = r15 instanceof y2.C1906b
            if (r0 == 0) goto L16
            r0 = r15
            y2.b r0 = (y2.C1906b) r0
            int r1 = r0.f18544A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f18544A = r1
            goto L1b
        L16:
            y2.b r0 = new y2.b
            r0.<init>(r8, r15)
        L1b:
            java.lang.Object r15 = r0.f18553y
            int r1 = r0.f18544A
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L4d
            if (r1 != r3) goto L45
            int r8 = r0.f18552x
            t2.c r9 = r0.f18551w
            D2.n r10 = r0.f18550v
            java.lang.Object r11 = r0.f18549u
            D2.j r12 = r0.f18548t
            t2.b r13 = r0.f18547s
            x2.m r14 = r0.f18546r
            y2.i r1 = r0.f18545q
            m5.AbstractC1362a.e(r15)
            r7 = r1
            r1 = r8
            r8 = r7
            r7 = r14
            r14 = r9
            r9 = r7
            r7 = r13
            r13 = r10
            r10 = r7
            r7 = r12
            r12 = r11
            r11 = r7
            goto La7
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            m5.AbstractC1362a.e(r15)
            r15 = 0
        L51:
            t2.l r1 = r8.f18609a
            java.util.List r1 = r10.f16680e
            int r4 = r1.size()
            if (r15 >= r4) goto L79
            java.lang.Object r1 = r1.get(r15)
            v2.b r1 = (v2.C1754b) r1
            r1.getClass()
            v2.d r4 = new v2.d
            d6.w r5 = r9.f18378a
            U5.i r6 = r1.f17514b
            v2.h r1 = r1.f17513a
            r4.<init>(r5, r13, r6, r1)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            m5.j r1 = new m5.j
            r1.<init>(r4, r15)
            goto L7a
        L79:
            r1 = r2
        L7a:
            if (r1 == 0) goto Lca
            java.lang.Object r15 = r1.f15080q
            v2.d r15 = (v2.C1756d) r15
            java.lang.Object r1 = r1.f15081r
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + r3
            r14.getClass()
            r0.f18545q = r8
            r0.f18546r = r9
            r0.f18547s = r10
            r0.f18548t = r11
            r0.f18549u = r12
            r0.f18550v = r13
            r0.f18551w = r14
            r0.f18552x = r1
            r0.f18544A = r3
            java.lang.Object r15 = r15.a(r0)
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r15 != r4) goto La7
            return r4
        La7:
            v2.f r15 = (v2.C1758f) r15
            r14.getClass()
            if (r15 == 0) goto Lc8
            y2.a r8 = new y2.a
            android.graphics.drawable.BitmapDrawable r10 = r15.f17529a
            boolean r11 = r15.f17530b
            v2.e r12 = r9.f18380c
            d6.w r9 = r9.f18378a
            boolean r13 = r9 instanceof v2.k
            if (r13 == 0) goto Lbf
            v2.k r9 = (v2.k) r9
            goto Lc0
        Lbf:
            r9 = r2
        Lc0:
            if (r9 == 0) goto Lc4
            java.lang.String r2 = r9.f17540s
        Lc4:
            r8.<init>(r10, r11, r12, r2)
            return r8
        Lc8:
            r15 = r1
            goto L51
        Lca:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unable to create a decoder that supports: "
            r8.<init>(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C1913i.a(y2.i, x2.m, t2.b, D2.j, java.lang.Object, D2.n, t2.c, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x0050 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0193 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: kotlin.jvm.internal.y */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0193, code lost:
    
        if (r1 == r10) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(y2.C1913i r24, D2.j r25, java.lang.Object r26, D2.n r27, t2.C1618c r28, s5.c r29) throws java.lang.Throwable {
        /*
            r0 = r24
            r1 = r29
            boolean r2 = r1 instanceof y2.C1907c
            if (r2 == 0) goto L18
            r2 = r1
            y2.c r2 = (y2.C1907c) r2
            int r3 = r2.f18555A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f18555A = r3
        L16:
            r6 = r2
            goto L1e
        L18:
            y2.c r2 = new y2.c
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r6.f18564y
            int r2 = r6.f18555A
            r7 = 3
            r8 = 2
            r3 = 1
            r9 = 0
            r5.a r10 = r5.EnumC1580a.f16356q
            if (r2 == 0) goto L72
            if (r2 == r3) goto L53
            if (r2 == r8) goto L3d
            if (r2 != r7) goto L35
            m5.AbstractC1362a.e(r1)
            goto L196
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            kotlin.jvm.internal.y r2 = r6.f18560u
            java.lang.Object r0 = r6.f18559t
            kotlin.jvm.internal.y r0 = (kotlin.jvm.internal.y) r0
            java.lang.Object r3 = r6.f18558s
            t2.c r3 = (t2.C1618c) r3
            D2.j r4 = r6.f18557r
            y2.i r5 = r6.f18556q
            m5.AbstractC1362a.e(r1)     // Catch: java.lang.Throwable -> L50
            goto L110
        L50:
            r0 = move-exception
            goto L1b5
        L53:
            kotlin.jvm.internal.y r0 = r6.f18563x
            kotlin.jvm.internal.y r2 = r6.f18562w
            kotlin.jvm.internal.y r3 = r6.f18561v
            kotlin.jvm.internal.y r4 = r6.f18560u
            java.lang.Object r5 = r6.f18559t
            t2.c r5 = (t2.C1618c) r5
            java.lang.Object r11 = r6.f18558s
            D2.j r12 = r6.f18557r
            y2.i r13 = r6.f18556q
            m5.AbstractC1362a.e(r1)     // Catch: java.lang.Throwable -> L50
            r17 = r3
            r20 = r4
            r21 = r5
            r19 = r11
            r15 = r13
            goto Ld6
        L72:
            m5.AbstractC1362a.e(r1)
            kotlin.jvm.internal.y r11 = new kotlin.jvm.internal.y
            r11.<init>()
            r1 = r27
            r11.f14268q = r1
            kotlin.jvm.internal.y r12 = new kotlin.jvm.internal.y
            r12.<init>()
            t2.l r1 = r0.f18609a
            t2.b r1 = r1.f16719g
            r12.f14268q = r1
            kotlin.jvm.internal.y r13 = new kotlin.jvm.internal.y
            r13.<init>()
            B0.G0 r1 = r0.f18611c     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r2 = r11.f14268q     // Catch: java.lang.Throwable -> L1b3
            D2.n r2 = (D2.n) r2     // Catch: java.lang.Throwable -> L1b3
            D2.n r1 = r1.c0(r2)     // Catch: java.lang.Throwable -> L1b3
            r11.f14268q = r1     // Catch: java.lang.Throwable -> L1b3
            r25.getClass()     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r1 = r12.f14268q     // Catch: java.lang.Throwable -> L1b3
            t2.b r1 = (t2.C1617b) r1     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r2 = r11.f14268q     // Catch: java.lang.Throwable -> L1b3
            r4 = r2
            D2.n r4 = (D2.n) r4     // Catch: java.lang.Throwable -> L1b3
            r6.f18556q = r0     // Catch: java.lang.Throwable -> L1b3
            r2 = r25
            r6.f18557r = r2     // Catch: java.lang.Throwable -> L1b3
            r5 = r26
            r6.f18558s = r5     // Catch: java.lang.Throwable -> L1b3
            r14 = r28
            r6.f18559t = r14     // Catch: java.lang.Throwable -> L1b3
            r6.f18560u = r11     // Catch: java.lang.Throwable -> L1b3
            r6.f18561v = r12     // Catch: java.lang.Throwable -> L1b3
            r6.f18562w = r13     // Catch: java.lang.Throwable -> L1b3
            r6.f18563x = r13     // Catch: java.lang.Throwable -> L1b3
            r6.f18555A = r3     // Catch: java.lang.Throwable -> L1b3
            r3 = r5
            r5 = r14
            java.lang.Object r1 = r0.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1b3
            if (r1 != r10) goto Lc8
            goto L195
        Lc8:
            r15 = r24
            r19 = r26
            r21 = r28
            r20 = r11
            r17 = r12
            r0 = r13
            r2 = r0
            r12 = r25
        Ld6:
            r0.f14268q = r1     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r2.f14268q     // Catch: java.lang.Throwable -> L50
            r1 = r0
            x2.e r1 = (x2.e) r1     // Catch: java.lang.Throwable -> L50
            boolean r3 = r1 instanceof x2.m     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L11e
            M5.s r0 = r12.f1412t     // Catch: java.lang.Throwable -> L50
            y2.d r14 = new y2.d     // Catch: java.lang.Throwable -> L50
            r22 = 0
            r16 = r2
            r18 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L119
            r4 = r18
            r11 = r20
            r3 = r21
            r6.f18556q = r15     // Catch: java.lang.Throwable -> L50
            r6.f18557r = r4     // Catch: java.lang.Throwable -> L50
            r6.f18558s = r3     // Catch: java.lang.Throwable -> L50
            r6.f18559t = r11     // Catch: java.lang.Throwable -> L50
            r6.f18560u = r2     // Catch: java.lang.Throwable -> L50
            r6.f18561v = r9     // Catch: java.lang.Throwable -> L50
            r6.f18562w = r9     // Catch: java.lang.Throwable -> L50
            r6.f18563x = r9     // Catch: java.lang.Throwable -> L50
            r6.f18555A = r8     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = M5.AbstractC0263y.B(r0, r14, r6)     // Catch: java.lang.Throwable -> L50
            if (r1 != r10) goto L10e
            goto L195
        L10e:
            r0 = r11
            r5 = r15
        L110:
            y2.a r1 = (y2.C1905a) r1     // Catch: java.lang.Throwable -> L50
            r11 = r0
            r17 = r5
        L115:
            r21 = r3
            r12 = r4
            goto L13d
        L119:
            r0 = move-exception
            r2 = r16
            goto L1b5
        L11e:
            r4 = r12
            r11 = r20
            r3 = r21
            boolean r1 = r1 instanceof x2.d     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L1ad
            y2.a r1 = new y2.a     // Catch: java.lang.Throwable -> L50
            r5 = r0
            x2.d r5 = (x2.d) r5     // Catch: java.lang.Throwable -> L50
            android.graphics.drawable.Drawable r5 = r5.f18356a     // Catch: java.lang.Throwable -> L50
            r8 = r0
            x2.d r8 = (x2.d) r8     // Catch: java.lang.Throwable -> L50
            boolean r8 = r8.f18357b     // Catch: java.lang.Throwable -> L50
            x2.d r0 = (x2.d) r0     // Catch: java.lang.Throwable -> L50
            v2.e r0 = r0.f18358c     // Catch: java.lang.Throwable -> L50
            r1.<init>(r5, r8, r0, r9)     // Catch: java.lang.Throwable -> L50
            r17 = r15
            goto L115
        L13d:
            java.lang.Object r0 = r2.f14268q
            boolean r2 = r0 instanceof x2.m
            if (r2 == 0) goto L146
            x2.m r0 = (x2.m) r0
            goto L147
        L146:
            r0 = r9
        L147:
            if (r0 == 0) goto L14e
            d6.w r0 = r0.f18378a
            H2.f.a(r0)
        L14e:
            java.lang.Object r0 = r11.f14268q
            r19 = r0
            D2.n r19 = (D2.n) r19
            r6.f18556q = r9
            r6.f18557r = r9
            r6.f18558s = r9
            r6.f18559t = r9
            r6.f18560u = r9
            r6.f18561v = r9
            r6.f18562w = r9
            r6.f18563x = r9
            r6.f18555A = r7
            r17.getClass()
            java.util.List r0 = r12.f1401g
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L172
            goto L193
        L172:
            android.graphics.drawable.Drawable r2 = r1.f18540a
            boolean r2 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 != 0) goto L17d
            boolean r2 = r12.f1403k
            if (r2 != 0) goto L17d
            goto L193
        L17d:
            M5.s r2 = r12.f1413u
            y2.h r16 = new y2.h
            r23 = 0
            r20 = r0
            r18 = r1
            r22 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r0 = r16
            java.lang.Object r0 = M5.AbstractC0263y.B(r2, r0, r6)
            r1 = r0
        L193:
            if (r1 != r10) goto L196
        L195:
            return r10
        L196:
            y2.a r1 = (y2.C1905a) r1
            android.graphics.drawable.Drawable r0 = r1.f18540a
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L1a1
            r9 = r0
            android.graphics.drawable.BitmapDrawable r9 = (android.graphics.drawable.BitmapDrawable) r9
        L1a1:
            if (r9 == 0) goto L1ac
            android.graphics.Bitmap r0 = r9.getBitmap()
            if (r0 == 0) goto L1ac
            r0.prepareToDraw()
        L1ac:
            return r1
        L1ad:
            C2.e r0 = new C2.e     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            throw r0     // Catch: java.lang.Throwable -> L50
        L1b3:
            r0 = move-exception
            r2 = r13
        L1b5:
            java.lang.Object r1 = r2.f14268q
            boolean r2 = r1 instanceof x2.m
            if (r2 == 0) goto L1be
            r9 = r1
            x2.m r9 = (x2.m) r9
        L1be:
            if (r9 == 0) goto L1c5
            d6.w r1 = r9.f18378a
            H2.f.a(r1)
        L1c5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C1913i.b(y2.i, D2.j, java.lang.Object, D2.n, t2.c, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c9 -> B:29:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(t2.C1617b r18, D2.j r19, java.lang.Object r20, D2.n r21, t2.C1618c r22, s5.c r23) {
        /*
            r17 = this;
            r0 = r23
            boolean r1 = r0 instanceof y2.C1909e
            if (r1 == 0) goto L17
            r1 = r0
            y2.e r1 = (y2.C1909e) r1
            int r2 = r1.f18583z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f18583z = r2
            r2 = r17
            goto L1e
        L17:
            y2.e r1 = new y2.e
            r2 = r17
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f18581x
            int r3 = r1.f18583z
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L52
            if (r3 != r5) goto L4a
            int r3 = r1.f18580w
            t2.c r6 = r1.f18579v
            D2.n r7 = r1.f18578u
            java.lang.Object r8 = r1.f18577t
            D2.j r9 = r1.f18576s
            t2.b r10 = r1.f18575r
            y2.i r11 = r1.f18574q
            m5.AbstractC1362a.e(r0)
            r16 = r9
            r9 = r1
            r1 = r16
            r16 = r8
            r8 = r3
            r3 = r16
            r16 = r7
            r7 = r6
            r6 = r16
            goto Lcf
        L4a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L52:
            m5.AbstractC1362a.e(r0)
            r0 = 0
            r3 = r20
            r6 = r21
            r7 = r22
            r8 = r0
            r9 = r1
            r11 = r2
            r0 = r18
            r1 = r19
        L63:
            t2.l r10 = r11.f18609a
            java.util.List r10 = r0.f16679d
            int r12 = r10.size()
        L6b:
            if (r8 >= r12) goto L9d
            java.lang.Object r13 = r10.get(r8)
            m5.j r13 = (m5.C1371j) r13
            java.lang.Object r14 = r13.f15080q
            x2.f r14 = (x2.f) r14
            java.lang.Object r13 = r13.f15081r
            java.lang.Class r13 = (java.lang.Class) r13
            java.lang.Class r15 = r3.getClass()
            boolean r13 = r13.isAssignableFrom(r15)
            if (r13 == 0) goto L9a
            java.lang.String r13 = "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>"
            kotlin.jvm.internal.m.c(r14, r13)
            x2.g r13 = r14.a(r3, r6)
            if (r13 == 0) goto L9a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            m5.j r10 = new m5.j
            r10.<init>(r13, r8)
            goto L9e
        L9a:
            int r8 = r8 + 1
            goto L6b
        L9d:
            r10 = r4
        L9e:
            if (r10 == 0) goto Lea
            java.lang.Object r8 = r10.f15080q
            x2.g r8 = (x2.g) r8
            java.lang.Object r10 = r10.f15081r
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r10 = r10 + r5
            r7.getClass()
            r9.f18574q = r11
            r9.f18575r = r0
            r9.f18576s = r1
            r9.f18577t = r3
            r9.f18578u = r6
            r9.f18579v = r7
            r9.f18580w = r10
            r9.f18583z = r5
            java.lang.Object r8 = r8.a(r9)
            r5.a r12 = r5.EnumC1580a.f16356q
            if (r8 != r12) goto Lc9
            return r12
        Lc9:
            r16 = r10
            r10 = r0
            r0 = r8
            r8 = r16
        Lcf:
            r12 = r0
            x2.e r12 = (x2.e) r12
            r7.getClass()     // Catch: java.lang.Throwable -> Lda
            if (r12 == 0) goto Ld8
            return r12
        Ld8:
            r0 = r10
            goto L63
        Lda:
            r0 = move-exception
            boolean r1 = r12 instanceof x2.m
            if (r1 == 0) goto Le2
            r4 = r12
            x2.m r4 = (x2.m) r4
        Le2:
            if (r4 == 0) goto Le9
            d6.w r1 = r4.f18378a
            H2.f.a(r1)
        Le9:
            throw r0
        Lea:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create a fetcher that supports: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C1913i.c(t2.b, D2.j, java.lang.Object, D2.n, t2.c, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(M2.k r17, s5.c r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r1 = r16
            r7 = r17
            r0 = r18
            k3.d r2 = r1.f18612d
            boolean r3 = r0 instanceof y2.C1910f
            if (r3 == 0) goto L1c
            r3 = r0
            y2.f r3 = (y2.C1910f) r3
            int r4 = r3.f18588u
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1c
            int r4 = r4 - r5
            r3.f18588u = r4
        L1a:
            r9 = r3
            goto L22
        L1c:
            y2.f r3 = new y2.f
            r3.<init>(r1, r0)
            goto L1a
        L22:
            java.lang.Object r0 = r9.f18586s
            int r3 = r9.f18588u
            r10 = 1
            if (r3 == 0) goto L3f
            if (r3 != r10) goto L37
            M2.k r2 = r9.f18585r
            y2.i r3 = r9.f18584q
            m5.AbstractC1362a.e(r0)     // Catch: java.lang.Throwable -> L33
            return r0
        L33:
            r0 = move-exception
            r7 = r2
            goto Lc4
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3f:
            m5.AbstractC1362a.e(r0)
            java.lang.Object r0 = r7.f3799e     // Catch: java.lang.Throwable -> L9e
            D2.j r0 = (D2.j) r0     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r3 = r0.f1397b     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r4 = r7.f     // Catch: java.lang.Throwable -> L9e
            E2.h r4 = (E2.h) r4     // Catch: java.lang.Throwable -> L9e
            android.graphics.Bitmap$Config[] r5 = H2.f.f2137a     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r5 = r7.f3800g     // Catch: java.lang.Throwable -> L9e
            t2.c r5 = (t2.C1618c) r5     // Catch: java.lang.Throwable -> L9e
            B0.G0 r6 = r1.f18611c     // Catch: java.lang.Throwable -> L9e
            D2.n r6 = r6.P(r0, r4)     // Catch: java.lang.Throwable -> L9e
            E2.g r8 = r6.f1425e     // Catch: java.lang.Throwable -> L9e
            t2.l r11 = r1.f18609a     // Catch: java.lang.Throwable -> L9e
            t2.b r11 = r11.f16719g     // Catch: java.lang.Throwable -> L9e
            java.util.List r11 = r11.f16677b     // Catch: java.lang.Throwable -> L9e
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.Throwable -> L9e
            int r12 = r12.size()     // Catch: java.lang.Throwable -> L9e
            r13 = 0
        L68:
            if (r13 >= r12) goto L92
            java.lang.Object r14 = r11.get(r13)     // Catch: java.lang.Throwable -> L9e
            m5.j r14 = (m5.C1371j) r14     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r15 = r14.f15080q     // Catch: java.lang.Throwable -> L9e
            A2.a r15 = (A2.a) r15     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r14 = r14.f15081r     // Catch: java.lang.Throwable -> L9e
            java.lang.Class r14 = (java.lang.Class) r14     // Catch: java.lang.Throwable -> L9e
            java.lang.Class r10 = r3.getClass()     // Catch: java.lang.Throwable -> L9e
            boolean r10 = r14.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> L9e
            if (r10 == 0) goto L8e
            java.lang.String r10 = "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>"
            kotlin.jvm.internal.m.c(r15, r10)     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r10 = r15.a(r3, r6)     // Catch: java.lang.Throwable -> L9e
            if (r10 == 0) goto L8e
            r3 = r10
        L8e:
            int r13 = r13 + 1
            r10 = 1
            goto L68
        L92:
            r10 = r6
            B2.a r6 = r2.v(r0, r3, r10, r5)     // Catch: java.lang.Throwable -> L9e
            if (r6 == 0) goto La1
            B2.b r2 = r2.u(r0, r6, r4, r8)     // Catch: java.lang.Throwable -> L9e
            goto La2
        L9e:
            r0 = move-exception
            r3 = r1
            goto Lc4
        La1:
            r2 = 0
        La2:
            if (r2 == 0) goto La9
            D2.r r0 = k3.d.w(r7, r0, r6, r2)     // Catch: java.lang.Throwable -> L9e
            return r0
        La9:
            M5.s r11 = r0.f1411s     // Catch: java.lang.Throwable -> L9e
            r2 = r0
            y2.g r0 = new y2.g     // Catch: java.lang.Throwable -> L9e
            r8 = 0
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9e
            r9.f18584q = r1     // Catch: java.lang.Throwable -> L9e
            r9.f18585r = r7     // Catch: java.lang.Throwable -> L9e
            r2 = 1
            r9.f18588u = r2     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = M5.AbstractC0263y.B(r11, r0, r9)     // Catch: java.lang.Throwable -> L9e
            r5.a r2 = r5.EnumC1580a.f16356q
            if (r0 != r2) goto Lc3
            return r2
        Lc3:
            return r0
        Lc4:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto Ld3
            B0.G0 r2 = r3.f18611c
            java.lang.Object r2 = r7.f3799e
            D2.j r2 = (D2.j) r2
            D2.e r0 = B0.G0.r(r2, r0)
            return r0
        Ld3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C1913i.d(M2.k, s5.c):java.lang.Object");
    }
}
