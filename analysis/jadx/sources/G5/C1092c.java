package g5;

import R4.C0468k1;
import android.app.DownloadManager;
import android.content.Intent;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* JADX INFO: renamed from: g5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1092c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0468k1 f13136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DownloadManager f13137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f13138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13140e;
    public Intent f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1092c(C0468k1 dataObject) {
        m.e(dataObject, "dataObject");
        this.f13136a = dataObject;
        Object systemService = dataObject.f7067a.getSystemService("download");
        m.c(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        this.f13137b = (DownloadManager) systemService;
        this.f13138c = new JSONObject();
        this.f13140e = -11L;
        dataObject.f7059S.h();
        WebView webView = dataObject.f7084k;
        if (webView != null) {
            webView.setDownloadListener(new DownloadListener() { // from class: g5.a
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
                @Override // android.webkit.DownloadListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onDownloadStart(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, long r21) {
                    /*
                        r16 = this;
                        r1 = r17
                        r2 = r20
                        java.lang.String r3 = ";"
                        r4 = r16
                        g5.c r5 = r4.f13133a
                        org.json.JSONObject r6 = r5.f13138c
                        java.lang.String r7 = "mimeType"
                        java.lang.String r8 = "contentDisposition"
                        java.lang.String r9 = "userAgent"
                        java.lang.String r10 = "url"
                        r6.put(r10, r1)     // Catch: java.lang.Exception -> L2c
                        r0 = r18
                        r6.put(r9, r0)     // Catch: java.lang.Exception -> L2c
                        r0 = r19
                        r6.put(r8, r0)     // Catch: java.lang.Exception -> L2c
                        r6.put(r7, r2)     // Catch: java.lang.Exception -> L2c
                        java.lang.String r0 = "contentLength"
                        r11 = r21
                        r6.put(r0, r11)     // Catch: java.lang.Exception -> L2c
                        goto L30
                    L2c:
                        r0 = move-exception
                        r0.printStackTrace()
                    L30:
                        R4.k1 r11 = r5.f13136a
                        com.web2native.MainActivity r12 = r11.f7071c
                        com.web2native.MainActivity r13 = r11.f7067a
                        java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
                        int r14 = k1.AbstractC1175c.a(r12, r0)
                        if (r14 == 0) goto L64
                        int r14 = android.os.Build.VERSION.SDK_INT
                        r15 = 29
                        if (r14 >= r15) goto L64
                        g5.h r1 = r11.f7059S
                        R4.k1 r2 = r1.f13150b
                        int r2 = r2.f7070b0
                        com.web2native.MainActivity r1 = r1.f13149a
                        boolean r3 = k1.AbstractC1175c.i(r1, r0)
                        if (r3 == 0) goto L5b
                        java.lang.String[] r0 = new java.lang.String[]{r0}
                        k1.AbstractC1175c.h(r1, r0, r2)
                        goto L27a
                    L5b:
                        java.lang.String[] r0 = new java.lang.String[]{r0}
                        k1.AbstractC1175c.h(r1, r0, r2)
                        goto L27a
                    L64:
                        kotlin.jvm.internal.m.b(r1)
                        java.lang.String r0 = "blob"
                        r14 = 0
                        boolean r0 = J5.t.G0(r1, r0, r14)
                        if (r0 == 0) goto L85
                        android.webkit.WebView r0 = r11.f7084k
                        if (r0 == 0) goto L27a
                        R4.l3 r3 = r11.f7048H
                        kotlin.jvm.internal.m.b(r3)
                        kotlin.jvm.internal.m.b(r2)
                        java.lang.String r1 = r3.b(r1, r2)
                        r0.loadUrl(r1)
                        goto L27a
                    L85:
                        java.lang.String r1 = "Downloading File..."
                        java.lang.String r0 = "getString(...)"
                        java.lang.String r2 = "/"
                        java.lang.String r10 = r6.getString(r10)     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.d(r10, r0)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r7 = r6.getString(r7)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r8 = r6.getString(r8)     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.d(r8, r0)     // Catch: java.lang.Exception -> Ld5
                        android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Exception -> Ld5
                        r17 = 1
                        java.lang.String r15 = r0.getCookie(r10)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r14 = "."
                        java.lang.String r4 = "substring(...)"
                        if (r7 == 0) goto Lcd
                        java.lang.String r0 = "application/force-download"
                        boolean r0 = r7.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> Ld5
                        if (r0 != 0) goto Lcd
                        java.lang.String r0 = "application/octet-stream"
                        boolean r0 = r7.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> Ld5
                        if (r0 != 0) goto Lcd
                        java.lang.String r0 = "application/vnd.android.package-archive"
                        boolean r0 = r7.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> Ld5
                        if (r0 != 0) goto Lcd
                        java.lang.String r0 = "application/pdf"
                        boolean r0 = r7.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> Ld5
                        if (r0 == 0) goto Ld0
                    Lcd:
                        r20 = r7
                        goto Ld8
                    Ld0:
                        r21 = r1
                        r22 = r15
                        goto L122
                    Ld5:
                        r0 = move-exception
                        goto L26b
                    Ld8:
                        android.webkit.MimeTypeMap r7 = android.webkit.MimeTypeMap.getSingleton()     // Catch: java.lang.Exception -> Ld5
                        r21 = r1
                        java.lang.String r1 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r10)     // Catch: java.lang.Exception -> Ld5
                        if (r1 == 0) goto Lea
                        int r0 = r1.length()     // Catch: java.lang.Exception -> Ld5
                        if (r0 != 0) goto Lee
                    Lea:
                        r22 = r15
                        r15 = 6
                        goto Lf1
                    Lee:
                        r22 = r15
                        goto L10f
                    Lf1:
                        int r0 = J5.m.W0(r15, r8, r14)     // Catch: java.lang.Exception -> L10b
                        int r0 = r0 + 1
                        int r15 = r8.length()     // Catch: java.lang.Exception -> L10b
                        int r15 = r15 + (-1)
                        java.lang.String r0 = r8.substring(r0, r15)     // Catch: java.lang.Exception -> L10b
                        kotlin.jvm.internal.m.d(r0, r4)     // Catch: java.lang.Exception -> L10b
                        java.lang.String r0 = r7.getMimeTypeFromExtension(r0)     // Catch: java.lang.Exception -> L10b
                        if (r0 == 0) goto L10f
                        goto L111
                    L10b:
                        r0 = move-exception
                        r0.printStackTrace()     // Catch: java.lang.Exception -> Ld5
                    L10f:
                        r0 = r20
                    L111:
                        if (r1 == 0) goto L121
                        int r15 = r1.length()     // Catch: java.lang.Exception -> Ld5
                        if (r15 <= 0) goto L121
                        java.lang.String r1 = r7.getMimeTypeFromExtension(r1)     // Catch: java.lang.Exception -> Ld5
                        if (r1 == 0) goto L121
                        r7 = r1
                        goto L122
                    L121:
                        r7 = r0
                    L122:
                        java.lang.String r0 = android.webkit.URLUtil.guessFileName(r10, r8, r7)     // Catch: java.lang.Exception -> Ld5
                        r5.f13139d = r0     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.b(r0)     // Catch: java.lang.Exception -> Ld5
                        boolean r0 = J5.m.K0(r0, r3)     // Catch: java.lang.Exception -> Ld5
                        if (r0 == 0) goto L13e
                        java.lang.String r0 = r5.f13139d     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.b(r0)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r1 = ""
                        java.lang.String r0 = J5.t.E0(r0, r3, r1)     // Catch: java.lang.Exception -> Ld5
                        r5.f13139d = r0     // Catch: java.lang.Exception -> Ld5
                    L13e:
                        java.lang.String r0 = r5.f13139d     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.b(r0)     // Catch: java.lang.Exception -> Ld5
                        int r0 = r0.length()     // Catch: java.lang.Exception -> Ld5
                        r1 = 25
                        if (r0 <= r1) goto L1ae
                        java.lang.String r0 = r5.f13139d     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.b(r0)     // Catch: java.lang.Exception -> Ld5
                        r15 = 6
                        int r0 = J5.m.W0(r15, r0, r14)     // Catch: java.lang.Exception -> Ld5
                        r1 = 21
                        if (r0 <= r1) goto L1ae
                        java.lang.String r0 = r5.f13139d     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.b(r0)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r1 = r5.f13139d     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.b(r1)     // Catch: java.lang.Exception -> Ld5
                        r15 = 6
                        int r1 = J5.m.W0(r15, r1, r14)     // Catch: java.lang.Exception -> Ld5
                        int r1 = r1 + 1
                        java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.d(r0, r4)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r1 = r5.f13139d     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.b(r1)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r3 = r5.f13139d     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.b(r3)     // Catch: java.lang.Exception -> Ld5
                        r15 = 6
                        int r3 = J5.m.W0(r15, r3, r14)     // Catch: java.lang.Exception -> Ld5
                        int r3 = r3 + (-1)
                        r15 = 0
                        java.lang.String r1 = r1.substring(r15, r3)     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.d(r1, r4)     // Catch: java.lang.Exception -> Ld5
                        int r1 = r1.length()     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r3 = r5.f13139d     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.b(r3)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r1 = r3.substring(r15, r1)     // Catch: java.lang.Exception -> Ld5
                        kotlin.jvm.internal.m.d(r1, r4)     // Catch: java.lang.Exception -> Ld5
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
                        r3.<init>()     // Catch: java.lang.Exception -> Ld5
                        r3.append(r1)     // Catch: java.lang.Exception -> Ld5
                        r3.append(r14)     // Catch: java.lang.Exception -> Ld5
                        r3.append(r0)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> Ld5
                        r5.f13139d = r0     // Catch: java.lang.Exception -> Ld5
                    L1ae:
                        java.lang.String r0 = "data:"
                        r15 = 0
                        boolean r0 = J5.t.G0(r10, r0, r15)     // Catch: java.lang.Exception -> Ld5
                        if (r0 == 0) goto L1e5
                        java.lang.String r0 = "File downloading .."
                        r1 = r17
                        android.widget.Toast r0 = android.widget.Toast.makeText(r12, r0, r1)     // Catch: java.lang.Exception -> Ld5
                        r0.show()     // Catch: java.lang.Exception -> Ld5
                        R4.s0 r0 = new R4.s0     // Catch: java.lang.Exception -> Ld5
                        r0.<init>(r13, r11, r15)     // Catch: java.lang.Exception -> Ld5
                        T5.e r1 = M5.H.f3811a     // Catch: java.lang.Exception -> Ld5
                        N5.f r1 = R5.n.f7261a     // Catch: java.lang.Exception -> Ld5
                        R5.d r1 = M5.AbstractC0263y.a(r1)     // Catch: java.lang.Exception -> Ld5
                        R4.m0 r2 = new R4.m0     // Catch: java.lang.Exception -> Ld5
                        r3 = 0
                        r2.<init>(r0, r10, r3)     // Catch: java.lang.Exception -> Ld5
                        r0 = 3
                        M5.AbstractC0263y.t(r1, r3, r3, r2, r0)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r0 = "File downloaded in Downloads folder"
                        r1 = 1
                        android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r1)     // Catch: java.lang.Exception -> Ld5
                        r0.show()     // Catch: java.lang.Exception -> Ld5
                        goto L27a
                    L1e5:
                        R4.i r0 = r11.f7073d     // Catch: java.lang.Exception -> Ld5
                        if (r0 == 0) goto L1f6
                        R4.Y r0 = r0.f7020z     // Catch: java.lang.Exception -> Ld5
                        if (r0 == 0) goto L1f6
                        java.lang.Boolean r0 = r0.f6884a     // Catch: java.lang.Exception -> Ld5
                        java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Ld5
                        boolean r14 = kotlin.jvm.internal.m.a(r0, r1)     // Catch: java.lang.Exception -> Ld5
                        goto L1f7
                    L1f6:
                        r14 = r15
                    L1f7:
                        if (r14 == 0) goto L21a
                        android.content.pm.ApplicationInfo r0 = r13.getApplicationInfo()     // Catch: java.lang.Exception -> Ld5
                        android.content.pm.PackageManager r1 = r12.getPackageManager()     // Catch: java.lang.Exception -> Ld5
                        java.lang.CharSequence r0 = r0.loadLabel(r1)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r1 = r5.f13139d     // Catch: java.lang.Exception -> Ld5
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
                        r3.<init>(r2)     // Catch: java.lang.Exception -> Ld5
                        r3.append(r0)     // Catch: java.lang.Exception -> Ld5
                        r3.append(r2)     // Catch: java.lang.Exception -> Ld5
                        r3.append(r1)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> Ld5
                        goto L21c
                    L21a:
                        java.lang.String r0 = r5.f13139d     // Catch: java.lang.Exception -> Ld5
                    L21c:
                        android.app.DownloadManager$Request r1 = new android.app.DownloadManager$Request     // Catch: java.lang.Exception -> Ld5
                        android.net.Uri r2 = android.net.Uri.parse(r10)     // Catch: java.lang.Exception -> Ld5
                        r1.<init>(r2)     // Catch: java.lang.Exception -> Ld5
                        android.app.DownloadManager$Request r2 = r1.setMimeType(r7)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r3 = "content-disposition"
                        android.app.DownloadManager$Request r2 = r2.addRequestHeader(r3, r8)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r3 = "User-Agent"
                        java.lang.String r4 = r6.getString(r9)     // Catch: java.lang.Exception -> Ld5
                        android.app.DownloadManager$Request r2 = r2.addRequestHeader(r3, r4)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r3 = "cookie"
                        r4 = r22
                        android.app.DownloadManager$Request r2 = r2.addRequestHeader(r3, r4)     // Catch: java.lang.Exception -> Ld5
                        r3 = r21
                        android.app.DownloadManager$Request r2 = r2.setDescription(r3)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r4 = r5.f13139d     // Catch: java.lang.Exception -> Ld5
                        android.app.DownloadManager$Request r2 = r2.setTitle(r4)     // Catch: java.lang.Exception -> Ld5
                        java.lang.String r4 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Exception -> Ld5
                        android.app.DownloadManager$Request r0 = r2.setDestinationInExternalPublicDir(r4, r0)     // Catch: java.lang.Exception -> Ld5
                        r2 = 1
                        android.app.DownloadManager$Request r0 = r0.setNotificationVisibility(r2)     // Catch: java.lang.Exception -> Ld5
                        r0.allowScanningByMediaScanner()     // Catch: java.lang.Exception -> Ld5
                        android.app.DownloadManager r0 = r5.f13137b     // Catch: java.lang.Exception -> Ld5
                        long r0 = r0.enqueue(r1)     // Catch: java.lang.Exception -> Ld5
                        r5.f13140e = r0     // Catch: java.lang.Exception -> Ld5
                        android.widget.Toast r0 = android.widget.Toast.makeText(r12, r3, r2)     // Catch: java.lang.Exception -> Ld5
                        r0.show()     // Catch: java.lang.Exception -> Ld5
                        goto L27a
                    L26b:
                        java.io.PrintStream r1 = java.lang.System.out
                        r1.println(r0)
                        java.lang.String r0 = "Download File Error..."
                        r1 = 1
                        android.widget.Toast r0 = android.widget.Toast.makeText(r12, r0, r1)
                        r0.show()
                    L27a:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: g5.C1090a.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
                }
            });
        }
    }
}
