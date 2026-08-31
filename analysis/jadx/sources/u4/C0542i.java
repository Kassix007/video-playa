package U4;

/* JADX INFO: renamed from: U4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0542i implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P.W f7832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P.W f7833s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0542i(P.W w3, P.W w6, int i) {
        this.f7831q = i;
        this.f7832r = w3;
        this.f7833s = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    @Override // B5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f7831q
            m5.y r1 = m5.C1386y.f15098a
            P.W r2 = r14.f7833s
            P.W r3 = r14.f7832r
            r4 = 0
            switch(r0) {
                case 0: goto L12e;
                default: goto Lc;
            }
        Lc:
            i0.b r15 = (i0.C1130b) r15
            java.lang.Object r15 = r3.getValue()
            g5.c r15 = (g5.C1092c) r15
            android.content.Intent r15 = r15.f
            if (r15 == 0) goto L128
            java.lang.Object r0 = r3.getValue()
            g5.c r0 = (g5.C1092c) r0
            java.lang.Object r5 = r3.getValue()
            g5.c r5 = (g5.C1092c) r5
            r5.getClass()
            java.lang.String r6 = "extra_download_id"
            r7 = -1
            long r6 = r15.getLongExtra(r6, r7)
            long r8 = r5.f13140e
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r15 != 0) goto L78
            android.app.DownloadManager$Query r15 = new android.app.DownloadManager$Query
            r15.<init>()
            long r8 = r5.f13140e
            long[] r10 = new long[r6]
            r10[r4] = r8
            r15.setFilterById(r10)
            android.app.DownloadManager r5 = r5.f13137b
            android.database.Cursor r15 = r5.query(r15)
            java.lang.String r5 = "query(...)"
            kotlin.jvm.internal.m.d(r15, r5)
            boolean r5 = r15.moveToFirst()
            if (r5 == 0) goto L75
            java.lang.String r5 = "status"
            int r5 = r15.getColumnIndex(r5)
            r8 = 8
            int r5 = r15.getInt(r5)
            if (r8 != r5) goto L75
            java.lang.String r5 = "local_uri"
            int r5 = r15.getColumnIndex(r5)
            if (r5 < 0) goto L75
            java.lang.String r15 = r15.getString(r5)
            android.net.Uri r15 = android.net.Uri.parse(r15)
            goto L79
        L75:
            r15.close()
        L78:
            r15 = r7
        L79:
            R4.k1 r5 = r0.f13136a
            java.lang.String r0 = r0.f13139d
            if (r0 == 0) goto L120
            if (r15 != 0) goto L8d
            java.io.File r15 = new java.io.File
            java.lang.String r8 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r8 = android.os.Environment.getExternalStoragePublicDirectory(r8)
            r15.<init>(r8, r0)
            goto L9b
        L8d:
            java.lang.String r15 = r15.getPath()
            if (r15 == 0) goto L9a
            java.io.File r8 = new java.io.File
            r8.<init>(r15)
            r15 = r8
            goto L9b
        L9a:
            r15 = r7
        L9b:
            if (r15 != 0) goto L9f
            goto L120
        L9f:
            android.webkit.MimeTypeMap r8 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r9 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r0)
            if (r9 == 0) goto Laf
            int r10 = r9.length()
            if (r10 != 0) goto Lcb
        Laf:
            java.lang.String r10 = "."
            r11 = 6
            int r10 = J5.m.W0(r11, r0, r10)     // Catch: java.lang.Exception -> Lc7
            int r10 = r10 + r6
            java.lang.String r0 = r0.substring(r10)     // Catch: java.lang.Exception -> Lc7
            java.lang.String r10 = "substring(...)"
            kotlin.jvm.internal.m.d(r0, r10)     // Catch: java.lang.Exception -> Lc7
            java.lang.String r0 = r8.getMimeTypeFromExtension(r0)     // Catch: java.lang.Exception -> Lc7
            if (r0 == 0) goto Lcb
            goto Lcc
        Lc7:
            r0 = move-exception
            r0.printStackTrace()
        Lcb:
            r0 = r7
        Lcc:
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r11 = "android.intent.action.VIEW"
            r10.<init>(r11)
            r11 = 335544320(0x14000000, float:6.4623485E-27)
            r10.setFlags(r11)
            com.web2native.MainActivity r11 = r5.f7067a
            com.web2native.MainActivity r12 = r5.f7071c
            android.content.Context r11 = r11.getApplicationContext()
            com.web2native.MainActivity r5 = r5.f7067a
            java.lang.String r5 = r5.getPackageName()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r5)
            java.lang.String r5 = ".provider"
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            android.net.Uri r15 = androidx.core.content.FileProvider.d(r11, r5, r15)
            if (r0 != 0) goto L10d
            if (r9 == 0) goto L10d
            java.lang.String r5 = r8.getMimeTypeFromExtension(r9)
            if (r5 == 0) goto L10d
            java.lang.String r0 = r8.getMimeTypeFromExtension(r9)
            r10.setDataAndType(r15, r0)
            goto L110
        L10d:
            r10.setDataAndType(r15, r0)
        L110:
            r10.addFlags(r6)
            r12.startActivity(r10)     // Catch: android.content.ActivityNotFoundException -> L117
            goto L120
        L117:
            java.lang.String r15 = "No application available to open this file"
            android.widget.Toast r15 = android.widget.Toast.makeText(r12, r15, r4)
            r15.show()
        L120:
            java.lang.Object r15 = r3.getValue()
            g5.c r15 = (g5.C1092c) r15
            r15.f = r7
        L128:
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r2.setValue(r15)
            return r1
        L12e:
            java.lang.String r15 = (java.lang.String) r15
            r3.setValue(r15)
            android.os.Handler r15 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r15.<init>(r0)
            U4.j r0 = new U4.j
            r0.<init>(r2, r4)
            r2 = 1000(0x3e8, double:4.94E-321)
            r15.postDelayed(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.C0542i.invoke(java.lang.Object):java.lang.Object");
    }
}
