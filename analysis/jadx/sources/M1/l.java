package m1;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f15039a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f15040b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15041c = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, m1.b r16, boolean r17, boolean r18) {
        /*
            r7 = r16
            android.content.res.Resources r2 = r12.getResources()
            r0 = 1
            r2.getValue(r13, r14, r0)
            java.lang.String r9 = "ResourcesCompat"
            java.lang.CharSequence r0 = r14.string
            if (r0 == 0) goto Lf3
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r4.startsWith(r0)
            r10 = 0
            r11 = -3
            if (r0 != 0) goto L25
            if (r7 == 0) goto Lce
            r7.a(r11)
            goto Lce
        L25:
            int r0 = r14.assetCookie
            d2.d0 r6 = n1.e.f15133b
            java.lang.String r0 = n1.e.b(r2, r13, r4, r0, r15)
            java.lang.Object r0 = r6.h(r0)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L4d
            if (r7 == 0) goto L4a
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            r12.<init>(r14)
            N5.c r14 = new N5.c
            r15 = 8
            r14.<init>(r15, r7, r0)
            r12.post(r14)
        L4a:
            r10 = r0
            goto Lce
        L4d:
            if (r18 == 0) goto L51
            goto Lce
        L51:
            java.lang.String r0 = r4.toLowerCase()     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            if (r0 == 0) goto L85
            android.content.res.XmlResourceParser r0 = r2.getXml(r13)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            m1.d r1 = m1.b.j(r0, r2)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            if (r1 != 0) goto L79
            java.lang.String r12 = "Failed to find font-family tag"
            android.util.Log.e(r9, r12)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            if (r7 == 0) goto Lce
            r7.a(r11)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            goto Lce
        L73:
            r0 = move-exception
            r12 = r0
            goto Lb6
        L76:
            r0 = move-exception
            r12 = r0
            goto Lc0
        L79:
            int r5 = r14.assetCookie     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r0 = r12
            r3 = r13
            r6 = r15
            r8 = r17
            android.graphics.Typeface r10 = n1.e.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            goto Lce
        L85:
            int r14 = r14.assetCookie     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            Q2.g r0 = n1.e.f15132a     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r1 = r12
            r3 = r13
            r5 = r15
            android.graphics.Typeface r12 = r0.w(r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            if (r12 == 0) goto L99
            java.lang.String r14 = n1.e.b(r2, r13, r4, r14, r15)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r6.l(r14, r12)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
        L99:
            if (r7 == 0) goto Lb0
            if (r12 == 0) goto Lb2
            android.os.Handler r14 = new android.os.Handler     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            android.os.Looper r15 = android.os.Looper.getMainLooper()     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r14.<init>(r15)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            N5.c r15 = new N5.c     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r0 = 8
            r15.<init>(r0, r7, r12)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            r14.post(r15)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
        Lb0:
            r10 = r12
            goto Lce
        Lb2:
            r7.a(r11)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L76
            goto Lb0
        Lb6:
            java.lang.String r14 = "Failed to read xml resource "
            java.lang.String r14 = r14.concat(r4)
            android.util.Log.e(r9, r14, r12)
            goto Lc9
        Lc0:
            java.lang.String r14 = "Failed to parse xml resource "
            java.lang.String r14 = r14.concat(r4)
            android.util.Log.e(r9, r14, r12)
        Lc9:
            if (r7 == 0) goto Lce
            r7.a(r11)
        Lce:
            if (r10 != 0) goto Lf2
            if (r7 != 0) goto Lf2
            if (r18 == 0) goto Ld5
            goto Lf2
        Ld5:
            android.content.res.Resources$NotFoundException r12 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Font resource ID #0x"
            r14.<init>(r15)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r14.append(r13)
            java.lang.String r13 = " could not be retrieved."
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
        Lf2:
            return r10
        Lf3:
            android.content.res.Resources$NotFoundException r12 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Resource \""
            r15.<init>(r0)
            java.lang.String r0 = r2.getResourceName(r13)
            r15.append(r0)
            java.lang.String r0 = "\" ("
            r15.append(r0)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r15.append(r13)
            java.lang.String r13 = ") is not a Font: "
            r15.append(r13)
            r15.append(r14)
            java.lang.String r13 = r15.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.l.a(android.content.Context, int, android.util.TypedValue, int, m1.b, boolean, boolean):android.graphics.Typeface");
    }
}
