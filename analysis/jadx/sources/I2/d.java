package I2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2344q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2345r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d(int i, Object obj) {
        this.f2344q = i;
        this.f2345r = obj;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.WorkContinuationImpl.a(androidx.work.impl.WorkContinuationImpl):m5.y */
    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.WorkManagerImpl.a(androidx.work.impl.WorkManagerImpl):m5.y */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0704 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // B5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() throws java.lang.Exception {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.f2344q
            m5.y r2 = m5.C1386y.f15098a
            java.lang.String r12 = "Orientation"
            r16 = 1073741824(0x40000000, float:2.0)
            java.lang.String r5 = "image/jpeg"
            r7 = 7
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 0
            r15 = 2
            r3 = 0
            r4 = 1
            java.lang.Object r6 = r1.f2345r
            switch(r0) {
                case 0: goto L9d4;
                case 1: goto L951;
                case 2: goto L950;
                case 3: goto L669;
                case 4: goto L65c;
                case 5: goto L606;
                case 6: goto L5ff;
                case 7: goto L5ce;
                case 8: goto L5c6;
                case 9: goto L429;
                case 10: goto L41c;
                case 11: goto L415;
                case 12: goto L40e;
                case 13: goto L403;
                case 14: goto L3fc;
                case 15: goto L3f1;
                case 16: goto L3e1;
                case 17: goto L3d9;
                case 18: goto L3d2;
                case 19: goto L3c9;
                case 20: goto L2f6;
                case 21: goto L2eb;
                default: goto L18;
            }
        L18:
            v2.d r6 = (v2.C1756d) r6
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            D2.n r2 = r6.f17521b
            J2.b r11 = new J2.b
            d6.w r10 = r6.f17520a
            q6.i r9 = r10.O()
            r11.<init>(r9, r4)
            q6.A r9 = a.AbstractC0597a.j(r11)
            r0.inJustDecodeBounds = r4
            q6.A r8 = r9.c()
            q6.f r13 = new q6.f
            r13.<init>(r8, r4)
            android.graphics.BitmapFactory.decodeStream(r13, r14, r0)
            java.lang.Exception r8 = r11.f2753s
            if (r8 != 0) goto L2ea
            r0.inJustDecodeBounds = r3
            android.graphics.Paint r8 = v2.AbstractC1761i.f17536a
            java.lang.String r8 = r0.outMimeType
            v2.h r6 = r6.f17523d
            java.util.Set r13 = v2.j.f17537a
            int r6 = r6.ordinal()
            if (r6 == 0) goto Lb8
            if (r6 == r4) goto L5d
            if (r6 != r15) goto L57
            goto L67
        L57:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L5d:
            if (r8 == 0) goto Lb8
            java.util.Set r6 = v2.j.f17537a
            boolean r6 = r6.contains(r8)
            if (r6 == 0) goto Lb8
        L67:
            H1.g r6 = new H1.g
            J2.m r8 = new J2.m
            q6.A r13 = r9.c()
            q6.f r14 = new q6.f
            r14.<init>(r13, r4)
            r8.<init>(r14, r4)
            r6.<init>(r8)
            v2.g r8 = new v2.g
            H1.c r13 = r6.c(r12)
            if (r13 != 0) goto L83
            goto L8a
        L83:
            java.nio.ByteOrder r14 = r6.f     // Catch: java.lang.NumberFormatException -> L8a
            int r13 = r13.e(r14)     // Catch: java.lang.NumberFormatException -> L8a
            goto L8b
        L8a:
            r13 = r4
        L8b:
            if (r13 == r15) goto L97
            if (r13 == r7) goto L97
            r7 = 4
            if (r13 == r7) goto L97
            r7 = 5
            if (r13 == r7) goto L97
            r7 = r3
            goto L98
        L97:
            r7 = r4
        L98:
            H1.c r12 = r6.c(r12)
            if (r12 != 0) goto L9f
            goto La6
        L9f:
            java.nio.ByteOrder r6 = r6.f     // Catch: java.lang.NumberFormatException -> La6
            int r6 = r12.e(r6)     // Catch: java.lang.NumberFormatException -> La6
            goto La7
        La6:
            r6 = r4
        La7:
            switch(r6) {
                case 3: goto Lb2;
                case 4: goto Lb2;
                case 5: goto Laf;
                case 6: goto Lac;
                case 7: goto Lac;
                case 8: goto Laf;
                default: goto Laa;
            }
        Laa:
            r6 = r3
            goto Lb4
        Lac:
            r6 = 90
            goto Lb4
        Laf:
            r6 = 270(0x10e, float:3.78E-43)
            goto Lb4
        Lb2:
            r6 = 180(0xb4, float:2.52E-43)
        Lb4:
            r8.<init>(r6, r7)
            goto Lba
        Lb8:
            v2.g r8 = v2.C1759g.f17531c
        Lba:
            int r6 = r8.f17533b
            boolean r7 = r8.f17532a
            java.lang.Exception r8 = r11.f2753s
            if (r8 != 0) goto L2e9
            r0.inMutable = r3
            int r8 = android.os.Build.VERSION.SDK_INT
            r12 = 26
            if (r8 < r12) goto Ld1
            android.graphics.ColorSpace r12 = r2.f1423c
            if (r12 == 0) goto Ld1
            d0.l.n(r0, r12)
        Ld1:
            boolean r12 = r2.f1427h
            android.content.Context r13 = r2.f1421a
            E2.h r14 = r2.f1424d
            r0.inPremultiplied = r12
            android.graphics.Bitmap$Config r12 = r2.f1422b
            if (r7 != 0) goto Ldf
            if (r6 <= 0) goto Le9
        Ldf:
            if (r12 == 0) goto Le7
            boolean r15 = a.AbstractC0597a.H(r12)
            if (r15 == 0) goto Le9
        Le7:
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
        Le9:
            boolean r15 = r2.f1426g
            if (r15 == 0) goto Lfb
            android.graphics.Bitmap$Config r15 = android.graphics.Bitmap.Config.ARGB_8888
            if (r12 != r15) goto Lfb
            java.lang.String r15 = r0.outMimeType
            boolean r5 = kotlin.jvm.internal.m.a(r15, r5)
            if (r5 == 0) goto Lfb
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.RGB_565
        Lfb:
            r5 = 26
            if (r8 < r5) goto L113
            android.graphics.Bitmap$Config r5 = d0.l.d(r0)
            android.graphics.Bitmap$Config r8 = d0.l.c()
            if (r5 != r8) goto L113
            android.graphics.Bitmap$Config r5 = d0.l.w()
            if (r12 == r5) goto L113
            android.graphics.Bitmap$Config r12 = d0.l.c()
        L113:
            r0.inPreferredConfig = r12
            a.a r5 = r10.c()
            boolean r8 = r5 instanceof v2.l
            if (r8 == 0) goto L13f
            E2.h r8 = E2.h.f1687c
            boolean r8 = kotlin.jvm.internal.m.a(r14, r8)
            if (r8 == 0) goto L13f
            r0.inSampleSize = r4
            r0.inScaled = r4
            v2.l r5 = (v2.l) r5
            int r2 = r5.f17544a
            r0.inDensity = r2
            android.content.res.Resources r2 = r13.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.densityDpi
            r0.inTargetDensity = r2
            r1 = r4
            r3 = r7
            goto L20e
        L13f:
            int r5 = r0.outWidth
            if (r5 <= 0) goto L207
            int r8 = r0.outHeight
            if (r8 > 0) goto L14b
            r1 = r4
            r3 = r7
            goto L209
        L14b:
            r10 = 90
            r12 = 270(0x10e, float:3.78E-43)
            if (r6 == r10) goto L156
            if (r6 != r12) goto L154
            goto L156
        L154:
            r15 = r5
            goto L157
        L156:
            r15 = r8
        L157:
            if (r6 == r10) goto L15d
            if (r6 != r12) goto L15c
            goto L15d
        L15c:
            r5 = r8
        L15d:
            E2.g r8 = r2.f1425e
            E2.h r10 = E2.h.f1687c
            boolean r12 = kotlin.jvm.internal.m.a(r14, r10)
            if (r12 == 0) goto L169
            r12 = r15
            goto L16f
        L169:
            C3.a r12 = r14.f1688a
            int r12 = H2.f.e(r12, r8)
        L16f:
            boolean r10 = kotlin.jvm.internal.m.a(r14, r10)
            if (r10 == 0) goto L177
            r10 = r5
            goto L17d
        L177:
            C3.a r10 = r14.f1689b
            int r10 = H2.f.e(r10, r8)
        L17d:
            int r14 = r15 / r12
            int r14 = java.lang.Integer.highestOneBit(r14)
            int r17 = r5 / r10
            int r3 = java.lang.Integer.highestOneBit(r17)
            int r1 = r8.ordinal()
            if (r1 == 0) goto L19c
            if (r1 != r4) goto L196
            int r1 = java.lang.Math.max(r14, r3)
            goto L1a0
        L196:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L19c:
            int r1 = java.lang.Math.min(r14, r3)
        L1a0:
            if (r1 >= r4) goto L1a3
            r1 = r4
        L1a3:
            r0.inSampleSize = r1
            double r14 = (double) r15
            r3 = r7
            r17 = r8
            double r7 = (double) r1
            double r14 = r14 / r7
            double r4 = (double) r5
            double r4 = r4 / r7
            double r7 = (double) r12
            r21 = r2
            double r1 = (double) r10
            double r7 = r7 / r14
            double r4 = r1 / r4
            int r1 = r17.ordinal()
            if (r1 == 0) goto L1ca
            r12 = 1
            if (r1 != r12) goto L1c4
            double r4 = java.lang.Math.min(r7, r4)
        L1c1:
            r2 = r21
            goto L1cf
        L1c4:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L1ca:
            double r4 = java.lang.Math.max(r7, r4)
            goto L1c1
        L1cf:
            boolean r2 = r2.f
            if (r2 == 0) goto L1d9
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 <= 0) goto L1d9
            r4 = r18
        L1d9:
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 != 0) goto L1df
            r2 = 1
            goto L1e0
        L1df:
            r2 = 0
        L1e0:
            r7 = r2 ^ 1
            r0.inScaled = r7
            if (r2 != 0) goto L1f7
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 <= 0) goto L1f9
            r2 = 2147483647(0x7fffffff, float:NaN)
            double r7 = (double) r2
            double r7 = r7 / r4
            int r4 = D5.a.F(r7)
            r0.inDensity = r4
            r0.inTargetDensity = r2
        L1f7:
            r1 = 1
            goto L20e
        L1f9:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.inDensity = r2
            double r7 = (double) r2
            double r7 = r7 * r4
            int r2 = D5.a.F(r7)
            r0.inTargetDensity = r2
            goto L1f7
        L207:
            r3 = r7
            r1 = r4
        L209:
            r0.inSampleSize = r1
            r2 = 0
            r0.inScaled = r2
        L20e:
            q6.f r2 = new q6.f     // Catch: java.lang.Throwable -> L2e1
            r2.<init>(r9, r1)     // Catch: java.lang.Throwable -> L2e1
            r4 = 0
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2, r4, r0)     // Catch: java.lang.Throwable -> L2e1
            r9.close()
            java.lang.Exception r4 = r11.f2753s
            if (r4 != 0) goto L2e0
            if (r2 == 0) goto L2d8
            android.content.res.Resources r4 = r13.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.densityDpi
            r2.setDensity(r4)
            if (r3 != 0) goto L232
            if (r6 <= 0) goto L2bc
        L232:
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            int r5 = r2.getWidth()
            float r5 = (float) r5
            float r5 = r5 / r16
            int r7 = r2.getHeight()
            float r7 = (float) r7
            float r7 = r7 / r16
            if (r3 == 0) goto L24e
            r3 = 1065353216(0x3f800000, float:1.0)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.postScale(r8, r3, r5, r7)
        L24e:
            if (r6 <= 0) goto L254
            float r3 = (float) r6
            r4.postRotate(r3, r5, r7)
        L254:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r5 = r2.getWidth()
            float r5 = (float) r5
            int r7 = r2.getHeight()
            float r7 = (float) r7
            r8 = 0
            r3.<init>(r8, r8, r5, r7)
            r4.mapRect(r3)
            float r5 = r3.left
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 != 0) goto L276
            float r7 = r3.top
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L276
        L273:
            r10 = 90
            goto L27e
        L276:
            float r5 = -r5
            float r3 = r3.top
            float r3 = -r3
            r4.postTranslate(r5, r3)
            goto L273
        L27e:
            if (r6 == r10) goto L29a
            r12 = 270(0x10e, float:3.78E-43)
            if (r6 != r12) goto L285
            goto L29a
        L285:
            int r3 = r2.getWidth()
            int r5 = r2.getHeight()
            android.graphics.Bitmap$Config r6 = r2.getConfig()
            if (r6 != 0) goto L295
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L295:
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r5, r6)
            goto L2ae
        L29a:
            int r3 = r2.getHeight()
            int r5 = r2.getWidth()
            android.graphics.Bitmap$Config r6 = r2.getConfig()
            if (r6 != 0) goto L2aa
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L2aa:
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r5, r6)
        L2ae:
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r3)
            android.graphics.Paint r6 = v2.AbstractC1761i.f17536a
            r5.drawBitmap(r2, r4, r6)
            r2.recycle()
            r2 = r3
        L2bc:
            v2.f r3 = new v2.f
            android.content.res.Resources r4 = r13.getResources()
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            r5.<init>(r4, r2)
            int r2 = r0.inSampleSize
            r1 = 1
            if (r2 > r1) goto L2d3
            boolean r0 = r0.inScaled
            if (r0 == 0) goto L2d1
            goto L2d3
        L2d1:
            r1 = 0
            goto L2d4
        L2d3:
            r1 = 1
        L2d4:
            r3.<init>(r5, r1)
            return r3
        L2d8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format."
            r0.<init>(r1)
            throw r0
        L2e0:
            throw r4
        L2e1:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L2e4
        L2e4:
            r0 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r9, r1)
            throw r0
        L2e9:
            throw r8
        L2ea:
            throw r8
        L2eb:
            u2.n r6 = (u2.C1693n) r6
            P.f0 r0 = r6.f17169H
            java.lang.Object r0 = r0.getValue()
            D2.j r0 = (D2.j) r0
            return r0
        L2f6:
            r6.g r6 = (r6.g) r6
            java.lang.ClassLoader r0 = r6.f16380s
            q6.l r1 = r6.f16381t
            java.lang.String r2 = ""
            java.util.Enumeration r2 = r0.getResources(r2)
            java.lang.String r3 = "getResources(...)"
            kotlin.jvm.internal.m.d(r2, r3)
            java.util.ArrayList r2 = java.util.Collections.list(r2)
            java.lang.String r4 = "list(...)"
            kotlin.jvm.internal.m.d(r2, r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r2.size()
            r8 = 0
        L31a:
            if (r8 >= r6) goto L34f
            java.lang.Object r9 = r2.get(r8)
            int r8 = r8 + 1
            java.net.URL r9 = (java.net.URL) r9
            kotlin.jvm.internal.m.b(r9)
            java.lang.String r10 = r9.getProtocol()
            java.lang.String r11 = "file"
            boolean r10 = kotlin.jvm.internal.m.a(r10, r11)
            if (r10 != 0) goto L335
            r10 = 0
            goto L349
        L335:
            java.lang.String r10 = q6.x.f16093r
            java.io.File r10 = new java.io.File
            java.net.URI r9 = r9.toURI()
            r10.<init>(r9)
            q6.x r9 = O3.D.s(r10)
            m5.j r10 = new m5.j
            r10.<init>(r1, r9)
        L349:
            if (r10 == 0) goto L31a
            r5.add(r10)
            goto L31a
        L34f:
            java.lang.String r2 = "META-INF/MANIFEST.MF"
            java.util.Enumeration r0 = r0.getResources(r2)
            kotlin.jvm.internal.m.d(r0, r3)
            java.util.ArrayList r0 = java.util.Collections.list(r0)
            kotlin.jvm.internal.m.d(r0, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.size()
            r4 = 0
        L369:
            if (r4 >= r3) goto L3c4
            java.lang.Object r6 = r0.get(r4)
            int r4 = r4 + 1
            java.net.URL r6 = (java.net.URL) r6
            kotlin.jvm.internal.m.b(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "toString(...)"
            kotlin.jvm.internal.m.d(r6, r8)
            java.lang.String r8 = "jar:file:"
            r9 = 0
            boolean r8 = J5.t.G0(r6, r8, r9)
            if (r8 != 0) goto L38a
        L388:
            r9 = 0
            goto L3be
        L38a:
            java.lang.String r8 = "!"
            r9 = 6
            int r8 = J5.m.W0(r9, r6, r8)
            r9 = -1
            if (r8 != r9) goto L395
            goto L388
        L395:
            java.lang.String r9 = q6.x.f16093r
            java.io.File r9 = new java.io.File
            r10 = 4
            java.lang.String r6 = r6.substring(r10, r8)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.m.d(r6, r8)
            java.net.URI r6 = java.net.URI.create(r6)
            r9.<init>(r6)
            q6.x r6 = O3.D.s(r9)
            Z4.G r8 = new Z4.G
            r8.<init>(r7)
            q6.J r6 = r6.b.d(r6, r1, r8)
            q6.x r8 = r6.g.f16379v
            m5.j r9 = new m5.j
            r9.<init>(r6, r8)
        L3be:
            if (r9 == 0) goto L369
            r2.add(r9)
            goto L369
        L3c4:
            java.util.ArrayList r0 = n5.l.u0(r5, r2)
            return r0
        L3c9:
            q3.b r6 = (q3.C1519b) r6
            q3.a r0 = new q3.a
            r2 = 0
            r0.<init>(r2, r6)
            return r0
        L3d2:
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            kotlin.jvm.internal.b r0 = kotlin.jvm.internal.m.h(r6)
            return r0
        L3d9:
            g5.h r6 = (g5.h) r6
            java.lang.String r0 = r6.f13165t
            r6.a(r0)
            return r2
        L3e1:
            g2.e r6 = (g2.e) r6
            androidx.lifecycle.q r0 = r6.getLifecycle()
            g2.b r1 = new g2.b
            r9 = 0
            r1.<init>(r6, r9)
            r0.a(r1)
            return r2
        L3f1:
            P.c0 r6 = (P.C0348c0) r6
            int r0 = r6.e()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L3fc:
            androidx.work.impl.WorkManagerImpl r6 = (androidx.work.impl.WorkManagerImpl) r6
            m5.y r0 = androidx.work.impl.WorkManagerImpl.a(r6)
            return r0
        L403:
            androidx.work.impl.utils.PreferenceUtils r6 = (androidx.work.impl.utils.PreferenceUtils) r6
            long r0 = r6.getLastCancelAllTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L40e:
            androidx.work.impl.WorkContinuationImpl r6 = (androidx.work.impl.WorkContinuationImpl) r6
            m5.y r0 = androidx.work.impl.WorkContinuationImpl.a(r6)
            return r0
        L415:
            androidx.lifecycle.l0 r6 = (androidx.lifecycle.l0) r6
            androidx.lifecycle.Z r0 = androidx.lifecycle.X.g(r6)
            return r0
        L41c:
            X5.g r6 = (X5.g) r6
            X5.f[] r0 = r6.j
            int r0 = Z5.N.d(r6, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L429:
            W2.d r6 = (W2.d) r6
            J2.q r0 = r6.f8102a
            U2.n r2 = r6.f8103b
            q6.i r3 = r0.O()
            B0.o r4 = D5.a.z(r3)     // Catch: java.lang.Throwable -> L43e
            r3.close()     // Catch: java.lang.Throwable -> L43c
            r0 = 0
            goto L44a
        L43c:
            r0 = move-exception
            goto L44a
        L43e:
            r0 = move-exception
            r4 = r0
            r3.close()     // Catch: java.lang.Throwable -> L444
            goto L448
        L444:
            r0 = move-exception
            m5.AbstractC1362a.a(r4, r0)
        L448:
            r0 = r4
            r4 = 0
        L44a:
            if (r0 != 0) goto L5c5
            java.lang.Object r0 = r4.f499q
            B0.G0 r0 = (B0.G0) r0
            java.lang.Object r3 = r0.f234r
            p3.T r3 = (p3.T) r3
            java.lang.String r5 = "SVG document is empty"
            if (r3 == 0) goto L5bf
            i0.a r3 = r3.f15764o
            if (r3 != 0) goto L45e
            r6 = 0
            goto L46f
        L45e:
            android.graphics.RectF r6 = new android.graphics.RectF
            float r7 = r3.f13516b
            float r8 = r3.f13517c
            float r9 = r3.c()
            float r3 = r3.d()
            r6.<init>(r7, r8, r9, r3)
        L46f:
            r3 = 3
            if (r6 == 0) goto L489
            r7 = 4
            float[] r14 = new float[r7]
            float r7 = r6.left
            r23 = 0
            r14[r23] = r7
            float r7 = r6.top
            r1 = 1
            r14[r1] = r7
            float r7 = r6.right
            r14[r15] = r7
            float r6 = r6.bottom
            r14[r3] = r6
            goto L48c
        L489:
            r23 = 0
            r14 = 0
        L48c:
            if (r14 == 0) goto L49c
            r6 = r14[r15]
            r7 = r14[r23]
            float r6 = r6 - r7
            r7 = r14[r3]
            r1 = 1
            r8 = r14[r1]
            float r7 = r7 - r8
        L499:
            r20 = 0
            goto L4b5
        L49c:
            java.lang.Object r6 = r0.f234r
            p3.T r6 = (p3.T) r6
            if (r6 == 0) goto L5b9
            i0.a r6 = r0.x()
            float r6 = r6.f13518d
            java.lang.Object r7 = r0.f234r
            p3.T r7 = (p3.T) r7
            if (r7 == 0) goto L5b3
            i0.a r7 = r0.x()
            float r7 = r7.f13519e
            goto L499
        L4b5:
            int r8 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            r9 = 512(0x200, float:7.175E-43)
            if (r8 <= 0) goto L4c0
            int r10 = D5.a.G(r6)
            goto L4c1
        L4c0:
            r10 = r9
        L4c1:
            int r11 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r11 <= 0) goto L4c9
            int r9 = D5.a.G(r7)
        L4c9:
            V2.h r12 = r2.f7687b
            V2.g r13 = r2.f7688c
            I2.l r1 = U2.h.f7675b
            java.lang.Object r1 = I2.q.e(r2, r1)
            V2.h r1 = (V2.h) r1
            long r9 = D5.a.t(r10, r9, r12, r13, r1)
            r1 = 32
            r17 = r3
            r12 = r4
            long r3 = r9 >> r1
            int r3 = (int) r3
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r18
            int r4 = (int) r9
            if (r8 <= 0) goto L544
            if (r11 <= 0) goto L544
            float r1 = (float) r3
            float r3 = (float) r4
            float r4 = r1 / r6
            float r3 = r3 / r7
            int r1 = r13.ordinal()
            if (r1 == 0) goto L506
            r8 = 1
            if (r1 != r8) goto L500
            float r3 = java.lang.Math.min(r4, r3)
            goto L50a
        L500:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L506:
            float r3 = java.lang.Math.max(r4, r3)
        L50a:
            float r4 = r3 * r6
            int r4 = (int) r4
            float r3 = r3 * r7
            int r3 = (int) r3
            if (r14 != 0) goto L53f
            r10 = 4
            float[] r8 = new float[r10]
            r20 = 0
            r23 = 0
            r8[r23] = r20
            r1 = 1
            r8[r1] = r20
            r8[r15] = r6
            r8[r17] = r7
            r6 = r8[r23]
            r7 = r8[r1]
            r9 = r8[r15]
            float r9 = r9 - r6
            r8 = r8[r17]
            float r8 = r8 - r7
            java.lang.Object r10 = r0.f234r
            p3.T r10 = (p3.T) r10
            if (r10 == 0) goto L539
            i0.a r11 = new i0.a
            r11.<init>(r6, r7, r9, r8)
            r10.f15764o = r11
            goto L53f
        L539:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L53f:
            r24 = r4
            r4 = r3
            r3 = r24
        L544:
            java.lang.Object r6 = r0.f234r
            p3.T r6 = (p3.T) r6
            if (r6 == 0) goto L5ad
            java.lang.String r7 = "100%"
            p3.C r8 = p3.J0.s(r7)
            r6.f15736r = r8
            java.lang.Object r6 = r0.f234r
            p3.T r6 = (p3.T) r6
            if (r6 == 0) goto L5a7
            p3.C r5 = p3.J0.s(r7)
            r6.f15737s = r5
            I2.l r5 = W2.b.f8101a
            java.lang.Object r2 = I2.q.e(r2, r5)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L584
            Z.m r5 = new Z.m
            r6 = 22
            r5.<init>(r6)
            C.a r6 = new C.a
            r6.<init>(r15)
            p3.c r7 = new p3.c
            r7.<init>(r2)
            r7.y()
            F3.c r2 = r6.h(r7)
            r5.f8312r = r2
            r12.f500r = r5
        L584:
            W2.e r2 = new W2.e
            java.lang.Object r5 = r12.f500r
            Z.m r5 = (Z.m) r5
            r2.<init>(r0, r5, r3, r4)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r4, r0)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r0)
            r2.e(r3)
            I2.a r2 = new I2.a
            r2.<init>(r0)
            J2.i r0 = new J2.i
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L5a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L5ad:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L5b3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L5b9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L5bf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L5c5:
            throw r0
        L5c6:
            java.lang.String r6 = (java.lang.String) r6
            T1.n r0 = new T1.n
            r0.<init>(r6)
            return r0
        L5ce:
            P.S0 r6 = (P.S0) r6
            java.lang.Object r0 = r6.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L5e1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5fe
            java.lang.Object r2 = r0.next()
            r3 = r2
            T1.d r3 = (T1.d) r3
            T1.p r3 = r3.f7354r
            java.lang.String r3 = r3.f7403q
            java.lang.String r4 = "composable"
            boolean r3 = kotlin.jvm.internal.m.a(r3, r4)
            if (r3 == 0) goto L5e1
            r1.add(r2)
            goto L5e1
        L5fe:
            return r1
        L5ff:
            android.content.Context r6 = (android.content.Context) r6
            T1.u r0 = com.google.android.gms.internal.measurement.AbstractC0836n2.l(r6)
            return r0
        L606:
            T1.d r6 = (T1.d) r6
            W1.c r0 = r6.f7360x
            boolean r1 = r0.i
            if (r1 == 0) goto L654
            androidx.lifecycle.z r1 = r0.j
            androidx.lifecycle.p r1 = r1.f9572d
            androidx.lifecycle.p r2 = androidx.lifecycle.EnumC0653p.f9556q
            if (r1 == r2) goto L64c
            T1.d r1 = r0.f8033a
            m5.o r0 = r0.f8042m
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.h0 r0 = (androidx.lifecycle.h0) r0
            r7 = 4
            androidx.lifecycle.j0 r0 = O3.D.p(r1, r0, r7)
            java.lang.Class<W1.b> r1 = W1.b.class
            kotlin.jvm.internal.f r1 = kotlin.jvm.internal.z.a(r1)
            java.lang.Object r0 = r0.f9553a
            E.c0 r0 = (E.c0) r0
            java.lang.String r2 = r1.b()
            if (r2 == 0) goto L644
            java.lang.String r3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r2 = r3.concat(r2)
            androidx.lifecycle.f0 r0 = r0.v(r2, r1)
            W1.b r0 = (W1.b) r0
            androidx.lifecycle.U r0 = r0.f8032b
            return r0
        L644:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Local and anonymous classes can not be ViewModels"
            r0.<init>(r1)
            throw r0
        L64c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed."
            r0.<init>(r1)
            throw r0
        L654:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."
            r0.<init>(r1)
            throw r0
        L65c:
            I2.y r6 = (I2.y) r6
            I2.t r0 = r6.f2404a
            m5.o r0 = r0.f2381d
            java.lang.Object r0 = r0.getValue()
            K2.i r0 = (K2.i) r0
            return r0
        L669:
            J2.e r6 = (J2.e) r6
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            U2.n r2 = r6.f2761b
            J2.b r3 = new J2.b
            java.lang.Object r4 = r6.f2763d
            J2.q r4 = (J2.q) r4
            q6.i r4 = r4.O()
            r9 = 0
            r3.<init>(r4, r9)
            q6.A r4 = a.AbstractC0597a.j(r3)
            r1 = 1
            r0.inJustDecodeBounds = r1
            q6.A r8 = r4.c()
            q6.f r10 = new q6.f
            r10.<init>(r8, r1)
            r8 = 0
            android.graphics.BitmapFactory.decodeStream(r10, r8, r0)
            java.lang.Exception r8 = r3.f2753s
            if (r8 != 0) goto L94f
            r0.inJustDecodeBounds = r9
            android.graphics.Paint r8 = J2.o.f2781a
            java.lang.String r8 = r0.outMimeType
            java.lang.Object r6 = r6.f2764e
            J2.n r6 = (J2.n) r6
            r6.getClass()
            if (r8 == 0) goto L6c7
            boolean r6 = r8.equals(r5)
            if (r6 != 0) goto L6c5
            java.lang.String r6 = "image/webp"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L6c5
            java.lang.String r6 = "image/heic"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L6c5
            java.lang.String r6 = "image/heif"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L6c7
        L6c5:
            r6 = 1
            goto L6c8
        L6c7:
            r6 = 0
        L6c8:
            if (r6 == 0) goto L71d
            H1.g r6 = new H1.g
            J2.m r8 = new J2.m
            q6.A r9 = r4.c()
            q6.f r10 = new q6.f
            r1 = 1
            r10.<init>(r9, r1)
            r9 = 0
            r8.<init>(r10, r9)
            r6.<init>(r8)
            J2.l r8 = new J2.l
            H1.c r9 = r6.c(r12)
            if (r9 != 0) goto L6e8
            goto L6ef
        L6e8:
            java.nio.ByteOrder r10 = r6.f     // Catch: java.lang.NumberFormatException -> L6ef
            int r9 = r9.e(r10)     // Catch: java.lang.NumberFormatException -> L6ef
            goto L6f0
        L6ef:
            r9 = 1
        L6f0:
            if (r9 == r15) goto L6fc
            if (r9 == r7) goto L6fc
            r7 = 4
            if (r9 == r7) goto L6fc
            r7 = 5
            if (r9 == r7) goto L6fc
            r7 = 0
            goto L6fd
        L6fc:
            r7 = 1
        L6fd:
            H1.c r9 = r6.c(r12)
            if (r9 != 0) goto L704
            goto L70b
        L704:
            java.nio.ByteOrder r6 = r6.f     // Catch: java.lang.NumberFormatException -> L70b
            int r6 = r9.e(r6)     // Catch: java.lang.NumberFormatException -> L70b
            goto L70c
        L70b:
            r6 = 1
        L70c:
            switch(r6) {
                case 3: goto L717;
                case 4: goto L717;
                case 5: goto L714;
                case 6: goto L711;
                case 7: goto L711;
                case 8: goto L714;
                default: goto L70f;
            }
        L70f:
            r6 = 0
            goto L719
        L711:
            r6 = 90
            goto L719
        L714:
            r6 = 270(0x10e, float:3.78E-43)
            goto L719
        L717:
            r6 = 180(0xb4, float:2.52E-43)
        L719:
            r8.<init>(r6, r7)
            goto L71f
        L71d:
            J2.l r8 = J2.l.f2774c
        L71f:
            int r6 = r8.f2776b
            boolean r7 = r8.f2775a
            java.lang.Exception r8 = r3.f2753s
            if (r8 != 0) goto L94e
            r9 = 0
            r0.inMutable = r9
            int r8 = android.os.Build.VERSION.SDK_INT
            r12 = 26
            if (r8 < r12) goto L747
            I2.l r9 = U2.i.f7679b
            java.lang.Object r10 = I2.q.e(r2, r9)
            android.graphics.ColorSpace r10 = C0.U.g(r10)
            if (r10 == 0) goto L747
            java.lang.Object r9 = I2.q.e(r2, r9)
            android.graphics.ColorSpace r9 = C0.U.g(r9)
            d0.l.n(r0, r9)
        L747:
            I2.l r9 = U2.i.f7680c
            java.lang.Object r9 = I2.q.e(r2, r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            android.content.Context r10 = r2.f7686a
            r0.inPremultiplied = r9
            I2.l r9 = U2.i.f7678a
            java.lang.Object r9 = I2.q.e(r2, r9)
            android.graphics.Bitmap$Config r9 = (android.graphics.Bitmap.Config) r9
            if (r7 != 0) goto L763
            if (r6 <= 0) goto L76d
        L763:
            if (r9 == 0) goto L76b
            boolean r11 = l6.d.v(r9)
            if (r11 == 0) goto L76d
        L76b:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L76d:
            I2.l r11 = U2.i.f
            java.lang.Object r11 = I2.q.e(r2, r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L789
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
            if (r9 != r11) goto L789
            java.lang.String r11 = r0.outMimeType
            boolean r5 = kotlin.jvm.internal.m.a(r11, r5)
            if (r5 == 0) goto L789
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.RGB_565
        L789:
            r12 = 26
            if (r8 < r12) goto L7a1
            android.graphics.Bitmap$Config r5 = d0.l.d(r0)
            android.graphics.Bitmap$Config r8 = d0.l.c()
            if (r5 != r8) goto L7a1
            android.graphics.Bitmap$Config r5 = d0.l.w()
            if (r9 == r5) goto L7a1
            android.graphics.Bitmap$Config r9 = d0.l.c()
        L7a1:
            r0.inPreferredConfig = r9
            int r5 = r0.outWidth
            if (r5 <= 0) goto L7ab
            int r8 = r0.outHeight
            if (r8 > 0) goto L7ae
        L7ab:
            r1 = 1
            goto L86a
        L7ae:
            r9 = 90
            r12 = 270(0x10e, float:3.78E-43)
            if (r6 == r9) goto L7b9
            if (r6 != r12) goto L7b7
            goto L7b9
        L7b7:
            r11 = r5
            goto L7ba
        L7b9:
            r11 = r8
        L7ba:
            if (r6 == r9) goto L7c0
            if (r6 != r12) goto L7bf
            goto L7c0
        L7bf:
            r5 = r8
        L7c0:
            V2.h r8 = r2.f7687b
            V2.g r9 = r2.f7688c
            I2.l r12 = U2.h.f7675b
            java.lang.Object r12 = I2.q.e(r2, r12)
            V2.h r12 = (V2.h) r12
            long r12 = D5.a.t(r11, r5, r8, r9, r12)
            r8 = 32
            long r14 = r12 >> r8
            int r8 = (int) r14
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            int r12 = (int) r12
            int r13 = r11 / r8
            int r13 = java.lang.Integer.highestOneBit(r13)
            int r14 = r5 / r12
            int r14 = java.lang.Integer.highestOneBit(r14)
            int r15 = r9.ordinal()
            if (r15 == 0) goto L7fc
            r1 = 1
            if (r15 != r1) goto L7f6
            int r13 = java.lang.Math.max(r13, r14)
            goto L801
        L7f6:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L7fc:
            r1 = 1
            int r13 = java.lang.Math.min(r13, r14)
        L801:
            if (r13 >= r1) goto L804
            r13 = 1
        L804:
            r0.inSampleSize = r13
            double r14 = (double) r11
            r11 = r2
            double r1 = (double) r13
            double r14 = r14 / r1
            r21 = r1
            double r1 = (double) r5
            double r1 = r1 / r21
            r21 = r1
            double r1 = (double) r8
            double r12 = (double) r12
            double r14 = r1 / r14
            double r12 = r12 / r21
            int r1 = r9.ordinal()
            if (r1 == 0) goto L82b
            r8 = 1
            if (r1 != r8) goto L825
            double r8 = java.lang.Math.min(r14, r12)
            goto L82f
        L825:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L82b:
            double r8 = java.lang.Math.max(r14, r12)
        L82f:
            V2.d r2 = r11.f7689d
            V2.d r5 = V2.d.f7960r
            if (r2 != r5) goto L83b
            int r2 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r2 <= 0) goto L83b
            r8 = r18
        L83b:
            int r2 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r2 != 0) goto L841
            r2 = 1
            goto L842
        L841:
            r2 = 0
        L842:
            r5 = r2 ^ 1
            r0.inScaled = r5
            if (r2 != 0) goto L859
            int r2 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r2 <= 0) goto L85c
            r2 = 2147483647(0x7fffffff, float:NaN)
            double r11 = (double) r2
            double r11 = r11 / r8
            int r5 = D5.a.F(r11)
            r0.inDensity = r5
            r0.inTargetDensity = r2
        L859:
            r1 = 1
            r9 = 0
            goto L86f
        L85c:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.inDensity = r2
            double r11 = (double) r2
            double r11 = r11 * r8
            int r2 = D5.a.F(r11)
            r0.inTargetDensity = r2
            goto L859
        L86a:
            r0.inSampleSize = r1
            r9 = 0
            r0.inScaled = r9
        L86f:
            q6.f r2 = new q6.f     // Catch: java.lang.Throwable -> L946
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L946
            r8 = 0
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2, r8, r0)     // Catch: java.lang.Throwable -> L946
            r4.close()
            java.lang.Exception r3 = r3.f2753s
            if (r3 != 0) goto L945
            if (r2 == 0) goto L93d
            android.content.res.Resources r3 = r10.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.densityDpi
            r2.setDensity(r3)
            if (r7 != 0) goto L893
            if (r6 <= 0) goto L91d
        L893:
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            int r4 = r2.getWidth()
            float r4 = (float) r4
            float r4 = r4 / r16
            int r5 = r2.getHeight()
            float r5 = (float) r5
            float r5 = r5 / r16
            if (r7 == 0) goto L8af
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.postScale(r8, r7, r4, r5)
        L8af:
            if (r6 <= 0) goto L8b5
            float r7 = (float) r6
            r3.postRotate(r7, r4, r5)
        L8b5:
            android.graphics.RectF r4 = new android.graphics.RectF
            int r5 = r2.getWidth()
            float r5 = (float) r5
            int r7 = r2.getHeight()
            float r7 = (float) r7
            r8 = 0
            r4.<init>(r8, r8, r5, r7)
            r3.mapRect(r4)
            float r5 = r4.left
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 != 0) goto L8d7
            float r7 = r4.top
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L8d7
        L8d4:
            r4 = 90
            goto L8df
        L8d7:
            float r5 = -r5
            float r4 = r4.top
            float r4 = -r4
            r3.postTranslate(r5, r4)
            goto L8d4
        L8df:
            if (r6 == r4) goto L8fb
            r12 = 270(0x10e, float:3.78E-43)
            if (r6 != r12) goto L8e6
            goto L8fb
        L8e6:
            int r4 = r2.getWidth()
            int r5 = r2.getHeight()
            android.graphics.Bitmap$Config r6 = r2.getConfig()
            if (r6 != 0) goto L8f6
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L8f6:
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)
            goto L90f
        L8fb:
            int r4 = r2.getHeight()
            int r5 = r2.getWidth()
            android.graphics.Bitmap$Config r6 = r2.getConfig()
            if (r6 != 0) goto L90b
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L90b:
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)
        L90f:
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r4)
            android.graphics.Paint r6 = J2.o.f2781a
            r5.drawBitmap(r2, r3, r6)
            r2.recycle()
            r2 = r4
        L91d:
            J2.i r3 = new J2.i
            android.content.res.Resources r4 = r10.getResources()
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            r5.<init>(r4, r2)
            I2.n r2 = I2.q.c(r5)
            int r4 = r0.inSampleSize
            r1 = 1
            if (r4 > r1) goto L938
            boolean r0 = r0.inScaled
            if (r0 == 0) goto L936
            goto L938
        L936:
            r1 = r9
            goto L939
        L938:
            r1 = 1
        L939:
            r3.<init>(r2, r1)
            return r3
        L93d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format."
            r0.<init>(r1)
            throw r0
        L945:
            throw r3
        L946:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L949
        L949:
            r0 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r4, r1)
            throw r0
        L94e:
            throw r8
        L94f:
            throw r8
        L950:
            return r6
        L951:
            E.c0 r6 = (E.c0) r6
            java.lang.Class<android.app.ActivityManager> r0 = android.app.ActivityManager.class
            java.lang.Object r2 = r6.f1552q
            android.content.Context r2 = (android.content.Context) r2
            r3 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            java.lang.Object r5 = r2.getSystemService(r0)     // Catch: java.lang.Exception -> L972
            kotlin.jvm.internal.m.b(r5)     // Catch: java.lang.Exception -> L972
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch: java.lang.Exception -> L972
            boolean r5 = r5.isLowRamDevice()     // Catch: java.lang.Exception -> L972
            if (r5 == 0) goto L972
            r3 = 4594572339843380019(0x3fc3333333333333, double:0.15)
        L972:
            r5 = 0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto L9cc
            int r5 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r5 > 0) goto L9cc
            B2.g r5 = new B2.g
            r1 = 1
            r5.<init>(r1)
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch: java.lang.Exception -> L9a0
            kotlin.jvm.internal.m.b(r0)     // Catch: java.lang.Exception -> L9a0
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Exception -> L9a0
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo()     // Catch: java.lang.Exception -> L9a0
            int r1 = r1.flags     // Catch: java.lang.Exception -> L9a0
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r2
            if (r1 == 0) goto L99b
            int r0 = r0.getLargeMemoryClass()     // Catch: java.lang.Exception -> L9a0
            goto L9a2
        L99b:
            int r0 = r0.getMemoryClass()     // Catch: java.lang.Exception -> L9a0
            goto L9a2
        L9a0:
            r0 = 256(0x100, float:3.59E-43)
        L9a2:
            long r0 = (long) r0
            r6 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r6
            double r0 = (double) r0
            double r3 = r3 * r0
            long r0 = (long) r3
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L9bf
            B0.o r2 = new B0.o
            r2.<init>()
            r2.f499q = r5
            O3.D1 r3 = new O3.D1
            r3.<init>(r0, r2)
            r2.f500r = r3
            goto L9c6
        L9bf:
            k3.d r2 = new k3.d
            r0 = 15
            r2.<init>(r0, r5)
        L9c6:
            P2.c r0 = new P2.c
            r0.<init>(r2, r5)
            return r0
        L9cc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "percent must be in the range [0.0, 1.0]."
            r0.<init>(r1)
            throw r0
        L9d4:
            m5.j r6 = (m5.C1371j) r6
            java.util.List r0 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.d.invoke():java.lang.Object");
    }
}
