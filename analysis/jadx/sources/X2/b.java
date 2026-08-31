package x2;

import D2.n;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f18351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f18352c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(Uri uri, n nVar, int i) {
        this.f18350a = i;
        this.f18351b = uri;
        this.f18352c = nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f5  */
    @Override // x2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(q5.InterfaceC1524c r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            int r13 = r12.f18350a
            r0 = 2
            r1 = 0
            r2 = 1
            android.net.Uri r3 = r12.f18351b
            D2.n r4 = r12.f18352c
            v2.e r5 = v2.EnumC1757e.f17526s
            switch(r13) {
                case 0: goto L25b;
                case 1: goto L142;
                default: goto Le;
            }
        Le:
            java.lang.String r13 = r3.getAuthority()
            java.lang.String r6 = "Invalid android.resource URI: "
            if (r13 == 0) goto L130
            boolean r7 = J5.m.U0(r13)
            if (r7 != 0) goto L1d
            r1 = r13
        L1d:
            if (r1 == 0) goto L130
            java.util.List r13 = r3.getPathSegments()
            java.lang.Object r13 = n5.l.s0(r13)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L11e
            java.lang.Integer r13 = J5.t.H0(r13)
            if (r13 == 0) goto L11e
            int r13 = r13.intValue()
            android.content.Context r3 = r4.f1421a
            java.lang.String r6 = r3.getPackageName()
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L46
            android.content.res.Resources r6 = r3.getResources()
            goto L4e
        L46:
            android.content.pm.PackageManager r6 = r3.getPackageManager()
            android.content.res.Resources r6 = r6.getResourcesForApplication(r1)
        L4e:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r6.getValue(r13, r7, r2)
            java.lang.CharSequence r7 = r7.string
            r8 = 47
            r9 = 6
            r10 = 0
            int r8 = J5.m.X0(r7, r8, r10, r9)
            int r9 = r7.length()
            java.lang.CharSequence r7 = r7.subSequence(r8, r9)
            java.lang.String r7 = r7.toString()
            android.webkit.MimeTypeMap r8 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r7 = H2.f.b(r8, r7)
            java.lang.String r8 = "text/xml"
            boolean r8 = kotlin.jvm.internal.m.a(r7, r8)
            if (r8 == 0) goto Lfa
            java.lang.String r7 = r3.getPackageName()
            boolean r1 = r1.equals(r7)
            java.lang.String r7 = "Invalid resource ID: "
            if (r1 == 0) goto L9d
            android.graphics.drawable.Drawable r0 = a.AbstractC0597a.C(r3, r13)
            if (r0 == 0) goto L8f
            goto Lbc
        L8f:
            java.lang.String r13 = k1.i.i(r13, r7)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L9d:
            android.content.res.XmlResourceParser r1 = r6.getXml(r13)
            int r8 = r1.next()
        La5:
            if (r8 == r0) goto Lae
            if (r8 == r2) goto Lae
            int r8 = r1.next()
            goto La5
        Lae:
            if (r8 != r0) goto Lf2
            android.content.res.Resources$Theme r0 = r3.getTheme()
            java.lang.ThreadLocal r1 = m1.l.f15039a
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r13, r0)
            if (r0 == 0) goto Le4
        Lbc:
            boolean r13 = r0 instanceof android.graphics.drawable.VectorDrawable
            if (r13 != 0) goto Lc6
            boolean r13 = r0 instanceof r2.o
            if (r13 == 0) goto Lc5
            goto Lc6
        Lc5:
            r2 = r10
        Lc6:
            x2.d r13 = new x2.d
            if (r2 == 0) goto Le0
            android.graphics.Bitmap$Config r1 = r4.f1422b
            E2.h r6 = r4.f1424d
            E2.g r7 = r4.f1425e
            boolean r4 = r4.f
            android.graphics.Bitmap r0 = com.google.android.gms.internal.measurement.AbstractC0836n2.i(r0, r1, r6, r7, r4)
            android.content.res.Resources r1 = r3.getResources()
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            r3.<init>(r1, r0)
            r0 = r3
        Le0:
            r13.<init>(r0, r2, r5)
            goto L11d
        Le4:
            java.lang.String r13 = k1.i.i(r13, r7)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        Lf2:
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r0 = "No start tag found."
            r13.<init>(r0)
            throw r13
        Lfa:
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            java.io.InputStream r13 = r6.openRawResource(r13, r0)
            x2.m r1 = new x2.m
            q6.c r13 = a.AbstractC0597a.R(r13)
            q6.A r13 = a.AbstractC0597a.j(r13)
            v2.l r2 = new v2.l
            int r0 = r0.density
            r2.<init>(r0)
            v2.m r0 = new v2.m
            r0.<init>(r13, r2)
            r1.<init>(r0, r7, r5)
            r13 = r1
        L11d:
            return r13
        L11e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L130:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L142:
            android.content.Context r13 = r4.f1421a
            android.content.ContentResolver r13 = r13.getContentResolver()
            java.lang.String r6 = r3.getAuthority()
            java.lang.String r7 = "com.android.contacts"
            boolean r6 = kotlin.jvm.internal.m.a(r6, r7)
            java.lang.String r7 = "'."
            if (r6 == 0) goto L18d
            java.lang.String r6 = r3.getLastPathSegment()
            java.lang.String r8 = "display_photo"
            boolean r6 = kotlin.jvm.internal.m.a(r6, r8)
            if (r6 == 0) goto L18d
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r0 = r13.openAssetFileDescriptor(r3, r0)
            if (r0 == 0) goto L16e
            java.io.FileInputStream r1 = r0.createInputStream()
        L16e:
            if (r1 == 0) goto L172
            goto L224
        L172:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to find a contact photo associated with '"
            r13.<init>(r0)
            r13.append(r3)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L18d:
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r6 < r8) goto L21e
            java.lang.String r6 = r3.getAuthority()
            java.lang.String r8 = "media"
            boolean r6 = kotlin.jvm.internal.m.a(r6, r8)
            if (r6 != 0) goto L1a1
            goto L21e
        L1a1:
            java.util.List r6 = r3.getPathSegments()
            int r8 = r6.size()
            r9 = 3
            if (r8 < r9) goto L21e
            int r9 = r8 + (-3)
            java.lang.Object r9 = r6.get(r9)
            java.lang.String r10 = "audio"
            boolean r9 = kotlin.jvm.internal.m.a(r9, r10)
            if (r9 == 0) goto L21e
            int r8 = r8 - r0
            java.lang.Object r0 = r6.get(r8)
            java.lang.String r6 = "albums"
            boolean r0 = kotlin.jvm.internal.m.a(r0, r6)
            if (r0 == 0) goto L21e
            E2.h r0 = r4.f1424d
            C3.a r4 = r0.f1688a
            boolean r6 = r4 instanceof E2.a
            if (r6 == 0) goto L1d2
            E2.a r4 = (E2.a) r4
            goto L1d3
        L1d2:
            r4 = r1
        L1d3:
            if (r4 == 0) goto L1f5
            int r4 = r4.f1676t
            C3.a r0 = r0.f1689b
            boolean r6 = r0 instanceof E2.a
            if (r6 == 0) goto L1e0
            E2.a r0 = (E2.a) r0
            goto L1e1
        L1e0:
            r0 = r1
        L1e1:
            if (r0 == 0) goto L1f5
            int r0 = r0.f1676t
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>(r2)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r4, r0)
            java.lang.String r0 = "android.content.extra.SIZE"
            r6.putParcelable(r0, r2)
            goto L1f6
        L1f5:
            r6 = r1
        L1f6:
            android.content.res.AssetFileDescriptor r0 = t1.AbstractC1614a.c(r13, r3, r6)
            if (r0 == 0) goto L200
            java.io.FileInputStream r1 = r0.createInputStream()
        L200:
            if (r1 == 0) goto L203
            goto L224
        L203:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to find a music thumbnail associated with '"
            r13.<init>(r0)
            r13.append(r3)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L21e:
            java.io.InputStream r1 = r13.openInputStream(r3)
            if (r1 == 0) goto L240
        L224:
            x2.m r0 = new x2.m
            q6.c r1 = a.AbstractC0597a.R(r1)
            q6.A r1 = a.AbstractC0597a.j(r1)
            v2.a r2 = new v2.a
            r2.<init>()
            v2.m r4 = new v2.m
            r4.<init>(r1, r2)
            java.lang.String r13 = r13.getType(r3)
            r0.<init>(r4, r13, r5)
            return r0
        L240:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to open '"
            r13.<init>(r0)
            r13.append(r3)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L25b:
            java.util.List r13 = r3.getPathSegments()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r13 = n5.l.i0(r13)
            r6 = r13
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r10 = 0
            r11 = 62
            java.lang.String r7 = "/"
            r8 = 0
            r9 = 0
            java.lang.String r13 = n5.l.q0(r6, r7, r8, r9, r10, r11)
            x2.m r0 = new x2.m
            android.content.Context r1 = r4.f1421a
            android.content.res.AssetManager r1 = r1.getAssets()
            java.io.InputStream r1 = r1.open(r13)
            q6.c r1 = a.AbstractC0597a.R(r1)
            q6.A r1 = a.AbstractC0597a.j(r1)
            v2.a r2 = new v2.a
            r2.<init>()
            v2.m r3 = new v2.m
            r3.<init>(r1, r2)
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r13 = H2.f.b(r1, r13)
            r0.<init>(r3, r13, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.b.a(q5.c):java.lang.Object");
    }
}
