package L2;

import I2.B;
import U2.n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f3250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f3251c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(B b7, n nVar, int i) {
        this.f3249a = i;
        this.f3250b = b7;
        this.f3251c = nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0576  */
    @Override // L2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(q5.InterfaceC1524c r26) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f3249a
            java.lang.String r2 = "toLowerCase(...)"
            r4 = 28
            r5 = 8
            r6 = -1
            r7 = 6
            java.lang.String r8 = "substring(...)"
            java.lang.String r9 = ""
            r10 = 2
            r11 = 0
            r12 = 1
            r13 = 0
            J2.h r14 = J2.h.f2769s
            I2.B r15 = r0.f3250b
            U2.n r3 = r0.f3251c
            switch(r1) {
                case 0: goto L5dc;
                case 1: goto L4c0;
                case 2: goto L223;
                case 3: goto L1d6;
                case 4: goto L14d;
                default: goto L1d;
            }
        L1d:
            java.lang.String r1 = r15.f2337d
            java.lang.String r2 = "Invalid android.resource URI: "
            if (r1 == 0) goto L13b
            boolean r4 = J5.m.U0(r1)
            if (r4 != 0) goto L2a
            r13 = r1
        L2a:
            if (r13 == 0) goto L13b
            java.util.List r1 = I2.q.g(r15)
            java.lang.Object r1 = n5.l.s0(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L129
            java.lang.Integer r1 = J5.t.H0(r1)
            if (r1 == 0) goto L129
            int r1 = r1.intValue()
            android.content.Context r2 = r3.f7686a
            java.lang.String r4 = r2.getPackageName()
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L53
            android.content.res.Resources r4 = r2.getResources()
            goto L5b
        L53:
            android.content.pm.PackageManager r4 = r2.getPackageManager()
            android.content.res.Resources r4 = r4.getResourcesForApplication(r13)
        L5b:
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r4.getValue(r1, r5, r12)
            java.lang.CharSequence r5 = r5.string
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = E3.h.B(r5)
            java.lang.String r6 = "text/xml"
            boolean r6 = kotlin.jvm.internal.m.a(r5, r6)
            if (r6 == 0) goto L105
            java.lang.String r5 = r2.getPackageName()
            boolean r5 = r13.equals(r5)
            java.lang.String r6 = "Invalid resource ID: "
            if (r5 == 0) goto L96
            android.graphics.drawable.Drawable r4 = a.AbstractC0597a.C(r2, r1)
            if (r4 == 0) goto L88
            goto Lb5
        L88:
            java.lang.String r1 = k1.i.i(r1, r6)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L96:
            android.content.res.XmlResourceParser r5 = r4.getXml(r1)
            int r7 = r5.next()
        L9e:
            if (r7 == r10) goto La7
            if (r7 == r12) goto La7
            int r7 = r5.next()
            goto L9e
        La7:
            if (r7 != r10) goto Lfd
            android.content.res.Resources$Theme r5 = r2.getTheme()
            java.lang.ThreadLocal r7 = m1.l.f15039a
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r1, r5)
            if (r4 == 0) goto Lef
        Lb5:
            android.graphics.Bitmap$Config[] r1 = Y2.j.f8215a
            boolean r1 = r4 instanceof android.graphics.drawable.VectorDrawable
            if (r1 != 0) goto Lc2
            boolean r1 = r4 instanceof r2.o
            if (r1 == 0) goto Lc0
            goto Lc2
        Lc0:
            r1 = r11
            goto Lc3
        Lc2:
            r1 = r12
        Lc3:
            L2.h r5 = new L2.h
            if (r1 == 0) goto Le7
            I2.l r6 = U2.i.f7678a
            java.lang.Object r6 = I2.q.e(r3, r6)
            android.graphics.Bitmap$Config r6 = (android.graphics.Bitmap.Config) r6
            V2.h r7 = r3.f7687b
            V2.g r8 = r3.f7688c
            V2.d r3 = r3.f7689d
            V2.d r9 = V2.d.f7960r
            if (r3 != r9) goto Lda
            r11 = r12
        Lda:
            android.graphics.Bitmap r3 = y4.AbstractC1918b.l(r4, r6, r7, r8, r11)
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            r4.<init>(r2, r3)
        Le7:
            I2.n r2 = I2.q.c(r4)
            r5.<init>(r2, r1, r14)
            goto L128
        Lef:
            java.lang.String r1 = k1.i.i(r1, r6)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lfd:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "No start tag found."
            r1.<init>(r2)
            throw r1
        L105:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            java.io.InputStream r2 = r4.openRawResource(r1, r2)
            L2.i r4 = new L2.i
            q6.c r2 = a.AbstractC0597a.R(r2)
            q6.A r2 = a.AbstractC0597a.j(r2)
            q6.l r3 = r3.f
            J2.r r6 = new J2.r
            r6.<init>(r13, r1)
            J2.s r1 = new J2.s
            r1.<init>(r2, r3, r6)
            r4.<init>(r1, r5, r14)
            r5 = r4
        L128:
            return r5
        L129:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r15)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L13b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r15)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L14d:
            java.lang.String r1 = r15.f2338e
            if (r1 != 0) goto L152
            r1 = r9
        L152:
            r10 = 33
            int r7 = J5.m.R0(r1, r10, r11, r7)
            if (r7 == r6) goto L1be
            java.lang.String r6 = q6.x.f16093r
            java.lang.String r6 = r1.substring(r11, r7)
            kotlin.jvm.internal.m.d(r6, r8)
            q6.x r6 = O3.D.r(r6)
            int r7 = r7 + r12
            int r10 = r1.length()
            java.lang.String r1 = r1.substring(r7, r10)
            kotlin.jvm.internal.m.d(r1, r8)
            q6.x r1 = O3.D.r(r1)
            L2.i r7 = new L2.i
            q6.l r3 = r3.f
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.m.e(r3, r8)
            Z4.G r8 = new Z4.G
            r8.<init>(r5)
            q6.J r3 = r6.b.d(r6, r3, r8)
            J2.p r3 = Q2.g.c(r1, r3, r13, r13, r4)
            java.lang.String r1 = r1.b()
            r4 = 46
            java.lang.String r1 = J5.m.i1(r4, r1, r9)
            boolean r4 = J5.m.U0(r1)
            if (r4 == 0) goto L19e
            goto L1ba
        L19e:
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r4)
            kotlin.jvm.internal.m.d(r1, r2)
            o5.e r2 = Y2.g.f8211a
            java.lang.Object r2 = r2.get(r1)
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L1ba
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r13 = r2.getMimeTypeFromExtension(r1)
        L1ba:
            r7.<init>(r3, r13, r14)
            return r7
        L1be:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid jar:file URI: "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L1d6:
            java.lang.String r1 = q6.x.f16093r
            java.lang.String r1 = I2.q.f(r15)
            if (r1 == 0) goto L21b
            q6.x r1 = O3.D.r(r1)
            L2.i r5 = new L2.i
            q6.l r3 = r3.f
            J2.p r3 = Q2.g.c(r1, r3, r13, r13, r4)
            java.lang.String r1 = r1.b()
            r4 = 46
            java.lang.String r1 = J5.m.i1(r4, r1, r9)
            boolean r4 = J5.m.U0(r1)
            if (r4 == 0) goto L1fb
            goto L217
        L1fb:
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r4)
            kotlin.jvm.internal.m.d(r1, r2)
            o5.e r2 = Y2.g.f8211a
            java.lang.Object r2 = r2.get(r1)
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L217
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r13 = r2.getMimeTypeFromExtension(r1)
        L217:
            r5.<init>(r3, r13, r14)
            return r5
        L21b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "filePath == null"
            r1.<init>(r2)
            throw r1
        L223:
            java.lang.String r1 = r15.f2334a
            java.lang.String r2 = r15.f2334a
            java.lang.String r4 = ";base64,"
            int r1 = J5.m.S0(r1, r4, r11, r7)
            java.lang.String r4 = "invalid data uri: "
            if (r1 == r6) goto L4aa
            r9 = 58
            int r9 = J5.m.R0(r2, r9, r11, r7)
            if (r9 == r6) goto L494
            int r9 = r9 + r12
            java.lang.String r4 = r2.substring(r9, r1)
            kotlin.jvm.internal.m.d(r4, r8)
            y5.a r9 = y5.c.f18653c
            int r1 = r1 + r5
            int r10 = r2.length()
            r9.getClass()
            boolean r14 = r9.f18655b
            int r15 = r2.length()
            com.google.android.gms.internal.measurement.K1.i(r1, r10, r15)
            java.lang.String r1 = r2.substring(r1, r10)
            kotlin.jvm.internal.m.d(r1, r8)
            java.nio.charset.Charset r2 = J5.a.f2810b
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "getBytes(...)"
            kotlin.jvm.internal.m.d(r1, r2)
            int r2 = r1.length
            int r8 = r1.length
            com.google.android.gms.internal.measurement.K1.i(r11, r2, r8)
            r8 = 61
            r10 = -2
            if (r2 != 0) goto L274
            r10 = r11
            r16 = r12
            goto L2b1
        L274:
            if (r2 == r12) goto L488
            if (r14 == 0) goto L298
            r16 = r2
            r15 = r11
        L27b:
            if (r15 >= r2) goto L28d
            r11 = r1[r15]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int[] r17 = y5.d.f18656a
            r11 = r17[r11]
            if (r11 >= 0) goto L294
            if (r11 != r10) goto L292
            int r11 = r2 - r15
            int r16 = r16 - r11
        L28d:
            r11 = r16
        L28f:
            r16 = r12
            goto L2ab
        L292:
            int r16 = r16 + (-1)
        L294:
            int r15 = r15 + 1
            r11 = 0
            goto L27b
        L298:
            int r11 = r2 + (-1)
            r11 = r1[r11]
            if (r11 != r8) goto L2a9
            int r16 = r2 + (-1)
            int r11 = r2 + (-2)
            r11 = r1[r11]
            if (r11 != r8) goto L28d
            int r16 = r2 + (-2)
            goto L28d
        L2a9:
            r11 = r2
            goto L28f
        L2ab:
            long r12 = (long) r11
            long r10 = (long) r7
            long r12 = r12 * r10
            long r10 = (long) r5
            long r12 = r12 / r10
            int r10 = (int) r12
        L2b1:
            byte[] r11 = new byte[r10]
            boolean r9 = r9.f18654a
            if (r9 == 0) goto L2ba
            int[] r9 = y5.d.f18657b
            goto L2bc
        L2ba:
            int[] r9 = y5.d.f18656a
        L2bc:
            r12 = -8
            r20 = r5
            r18 = r7
            r7 = r12
            r13 = 0
            r15 = 0
            r19 = 0
        L2c6:
            java.lang.String r5 = ") at index "
            java.lang.String r8 = "toString(...)"
            java.lang.String r6 = "'("
            if (r13 >= r2) goto L3f1
            if (r7 != r12) goto L31f
            int r12 = r13 + 3
            if (r12 >= r2) goto L31f
            int r22 = r13 + 1
            r0 = r1[r13]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r9[r0]
            int r23 = r13 + 2
            r24 = r0
            r0 = r1[r22]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r9[r0]
            r22 = r0
            r0 = r1[r23]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r9[r0]
            int r23 = r13 + 4
            r12 = r1[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r12 = r9[r12]
            int r24 = r24 << 18
            int r22 = r22 << 12
            r22 = r24 | r22
            int r0 = r0 << 6
            r0 = r22 | r0
            r0 = r0 | r12
            if (r0 < 0) goto L31f
            int r5 = r15 + 1
            int r6 = r0 >> 16
            byte r6 = (byte) r6
            r11[r15] = r6
            int r6 = r15 + 2
            int r8 = r0 >> 8
            byte r8 = (byte) r8
            r11[r5] = r8
            int r15 = r15 + 3
            byte r0 = (byte) r0
            r11[r6] = r0
            r0 = r25
            r13 = r23
            r6 = -1
            r8 = 61
        L31d:
            r12 = -8
            goto L2c6
        L31f:
            r0 = r1[r13]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r12 = r9[r0]
            if (r12 >= 0) goto L3ba
            r22 = r1
            r1 = -2
            if (r12 != r1) goto L380
            r12 = -8
            if (r7 == r12) goto L374
            r0 = -6
            if (r7 == r0) goto L337
            r0 = -4
            if (r7 == r0) goto L342
            if (r7 != r1) goto L33a
        L337:
            int r13 = r13 + 1
            goto L36f
        L33a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreachable"
            r0.<init>(r1)
            throw r0
        L342:
            int r13 = r13 + 1
            if (r14 != 0) goto L347
            goto L358
        L347:
            if (r13 >= r2) goto L358
            r0 = r22[r13]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int[] r9 = y5.d.f18656a
            r0 = r9[r0]
            r9 = -1
            if (r0 == r9) goto L355
            goto L358
        L355:
            int r13 = r13 + 1
            goto L347
        L358:
            if (r13 == r2) goto L363
            r0 = r22[r13]
            r12 = 61
            if (r0 != r12) goto L363
            int r13 = r13 + 1
            goto L36f
        L363:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Missing one pad character at index "
            java.lang.String r1 = k1.i.i(r13, r1)
            r0.<init>(r1)
            throw r0
        L36f:
            r0 = r16
        L371:
            r1 = -2
            goto L3f6
        L374:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Redundant pad character at index "
            java.lang.String r1 = k1.i.i(r13, r1)
            r0.<init>(r1)
            throw r0
        L380:
            r12 = 61
            if (r14 == 0) goto L38d
            int r13 = r13 + 1
            r0 = r25
            r8 = r12
            r1 = r22
            r6 = -1
            goto L31d
        L38d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid symbol '"
            r2.<init>(r3)
            char r3 = (char) r0
            r2.append(r3)
            r2.append(r6)
            com.google.android.gms.internal.measurement.I1.M(r20)
            r3 = r20
            java.lang.String r0 = java.lang.Integer.toString(r0, r3)
            kotlin.jvm.internal.m.d(r0, r8)
            r2.append(r0)
            r2.append(r5)
            r2.append(r13)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L3ba:
            r22 = r1
            r21 = 61
            int r13 = r13 + 1
            int r0 = r19 << 6
            r19 = r0 | r12
            int r12 = r7 + 6
            if (r12 < 0) goto L3e4
            int r0 = r15 + 1
            int r5 = r19 >>> r12
            byte r5 = (byte) r5
            r11[r15] = r5
            int r5 = r16 << r12
            int r5 = r5 + (-1)
            r19 = r19 & r5
            int r7 = r7 + (-2)
            r15 = r0
            r8 = r21
            r1 = r22
            r6 = -1
            r12 = -8
            r20 = 8
            r0 = r25
            goto L2c6
        L3e4:
            r0 = r25
            r7 = r12
            r8 = r21
            r1 = r22
            r6 = -1
            r12 = -8
            r20 = 8
            goto L2c6
        L3f1:
            r22 = r1
            r0 = 0
            goto L371
        L3f6:
            if (r7 == r1) goto L480
            r12 = -8
            if (r7 == r12) goto L406
            if (r0 == 0) goto L3fe
            goto L406
        L3fe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The padding option is set to PRESENT, but the input is not properly padded"
            r0.<init>(r1)
            throw r0
        L406:
            if (r19 != 0) goto L478
            if (r14 != 0) goto L40b
            goto L41c
        L40b:
            if (r13 >= r2) goto L41c
            r0 = r22[r13]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int[] r1 = y5.d.f18656a
            r0 = r1[r0]
            r9 = -1
            if (r0 == r9) goto L419
            goto L41c
        L419:
            int r13 = r13 + 1
            goto L40b
        L41c:
            if (r13 < r2) goto L440
            if (r15 != r10) goto L438
            q6.g r0 = new q6.g
            r0.<init>()
            r0.m21write(r11)
            q6.l r1 = r3.f
            J2.s r2 = new J2.s
            r5 = 0
            r2.<init>(r0, r1, r5)
            L2.i r0 = new L2.i
            J2.h r1 = J2.h.f2768r
            r0.<init>(r2, r4, r1)
            return r0
        L438:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
        L440:
            r0 = r22[r13]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Symbol '"
            r2.<init>(r3)
            char r3 = (char) r0
            r2.append(r3)
            r2.append(r6)
            r3 = 8
            com.google.android.gms.internal.measurement.I1.M(r3)
            java.lang.String r0 = java.lang.Integer.toString(r0, r3)
            kotlin.jvm.internal.m.d(r0, r8)
            r2.append(r0)
            r2.append(r5)
            int r13 = r13 + (-1)
            r2.append(r13)
            java.lang.String r0 = " is prohibited after the pad character"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L478:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The pad bits must be zeros"
            r0.<init>(r1)
            throw r0
        L480:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The last unit of input does not have enough bits"
            r0.<init>(r1)
            throw r0
        L488:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "
            java.lang.String r1 = k1.i.i(r2, r1)
            r0.<init>(r1)
            throw r0
        L494:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L4aa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L4c0:
            r16 = r12
            r5 = r13
            java.lang.String r0 = r15.f2334a
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Context r1 = r3.f7686a
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r2 = r15.f2337d
            java.lang.String r4 = "com.android.contacts"
            boolean r4 = kotlin.jvm.internal.m.a(r2, r4)
            java.lang.String r6 = "r"
            java.lang.String r7 = "'."
            if (r4 == 0) goto L510
            java.util.List r4 = I2.q.g(r15)
            java.lang.Object r4 = n5.l.s0(r4)
            java.lang.String r8 = "display_photo"
            boolean r4 = kotlin.jvm.internal.m.a(r4, r8)
            if (r4 == 0) goto L510
            android.content.res.AssetFileDescriptor r2 = r1.openAssetFileDescriptor(r0, r6)
            if (r2 == 0) goto L4f5
            goto L59f
        L4f5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to find a contact photo associated with '"
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L510:
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r4 < r8) goto L599
            java.lang.String r4 = "media"
            boolean r2 = kotlin.jvm.internal.m.a(r2, r4)
            if (r2 != 0) goto L520
            goto L599
        L520:
            java.util.List r2 = I2.q.g(r15)
            int r4 = r2.size()
            r8 = 3
            if (r4 < r8) goto L599
            int r8 = r4 + (-3)
            java.lang.Object r8 = r2.get(r8)
            java.lang.String r9 = "audio"
            boolean r8 = kotlin.jvm.internal.m.a(r8, r9)
            if (r8 == 0) goto L599
            int r4 = r4 - r10
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r4 = "albums"
            boolean r2 = kotlin.jvm.internal.m.a(r2, r4)
            if (r2 == 0) goto L599
            V2.h r2 = r3.f7687b
            V2.c r4 = r2.f7965a
            boolean r6 = r4 instanceof V2.a
            if (r6 == 0) goto L551
            V2.a r4 = (V2.a) r4
            goto L552
        L551:
            r4 = r5
        L552:
            if (r4 == 0) goto L576
            int r4 = r4.f7957a
            V2.c r2 = r2.f7966b
            boolean r6 = r2 instanceof V2.a
            if (r6 == 0) goto L55f
            V2.a r2 = (V2.a) r2
            goto L560
        L55f:
            r2 = r5
        L560:
            if (r2 == 0) goto L576
            int r2 = r2.f7957a
            android.os.Bundle r13 = new android.os.Bundle
            r5 = r16
            r13.<init>(r5)
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>(r4, r2)
            java.lang.String r2 = "android.content.extra.SIZE"
            r13.putParcelable(r2, r5)
            goto L577
        L576:
            r13 = r5
        L577:
            android.content.res.AssetFileDescriptor r2 = t1.AbstractC1614a.c(r1, r0, r13)
            if (r2 == 0) goto L57e
            goto L59f
        L57e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to find a music thumbnail associated with '"
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L599:
            android.content.res.AssetFileDescriptor r2 = r1.openAssetFileDescriptor(r0, r6)
            if (r2 == 0) goto L5c1
        L59f:
            L2.i r4 = new L2.i
            java.io.FileInputStream r5 = r2.createInputStream()
            q6.c r5 = a.AbstractC0597a.R(r5)
            q6.A r5 = a.AbstractC0597a.j(r5)
            q6.l r3 = r3.f
            J2.g r6 = new J2.g
            r6.<init>(r2)
            J2.s r2 = new J2.s
            r2.<init>(r5, r3, r6)
            java.lang.String r0 = r1.getType(r0)
            r4.<init>(r2, r0, r14)
            return r4
        L5c1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to open '"
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L5dc:
            java.util.List r0 = I2.q.g(r15)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = n5.l.i0(r0)
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r8 = 0
            r9 = 62
            java.lang.String r5 = "/"
            r6 = 0
            r7 = 0
            java.lang.String r0 = n5.l.q0(r4, r5, r6, r7, r8, r9)
            L2.i r1 = new L2.i
            android.content.Context r2 = r3.f7686a
            android.content.res.AssetManager r2 = r2.getAssets()
            java.io.InputStream r2 = r2.open(r0)
            q6.c r2 = a.AbstractC0597a.R(r2)
            q6.A r2 = a.AbstractC0597a.j(r2)
            q6.l r3 = r3.f
            J2.a r4 = new J2.a
            r4.<init>(r0)
            J2.s r5 = new J2.s
            r5.<init>(r2, r3, r4)
            java.lang.String r0 = E3.h.B(r0)
            r1.<init>(r5, r0, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.a(q5.c):java.lang.Object");
    }
}
