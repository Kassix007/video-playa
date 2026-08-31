package O3;

import R4.C0468k1;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.widget.Toast;
import com.web2native.MainActivity;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0279e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4844e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0279e0(C0288h0 c0288h0, String str, boolean z5) {
        this.f4844e = c0288h0;
        AbstractC1887A.d(str);
        this.f4842c = str;
        this.f4840a = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        C0468k1 c0468k1 = (C0468k1) this.f4844e;
        MainActivity mainActivity = c0468k1.f7067a;
        if (!b()) {
            if (this.f4840a) {
                mainActivity.finishAndRemoveTask();
                mainActivity.finish();
            }
            this.f4840a = true;
            Toast.makeText(c0468k1.f7071c, "Press again to exit", 0).show();
            new Handler(Looper.getMainLooper()).postDelayed(new g5.k(this, 0), 2000L);
            return;
        }
        if (!kotlin.jvm.internal.m.a(c0468k1.f7053M.f4842c, "")) {
            c0468k1.f7053M.f4842c = "";
            c();
        } else {
            T1.u uVar = c0468k1.f7075e;
            if (uVar != null) {
                uVar.c();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f4844e
            R4.k1 r0 = (R4.C0468k1) r0
            com.web2native.MainActivity r1 = r0.f7071c
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            kotlin.jvm.internal.m.c(r1, r2)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            R4.i r2 = r0.f7073d
            r3 = 0
            if (r2 == 0) goto L1f
            R4.F1 r2 = r2.f6999b
            goto L20
        L1f:
            r2 = r3
        L20:
            r4 = 1
            r5 = 0
            if (r2 == 0) goto Lb9
            T1.u r2 = r0.f7075e
            if (r2 == 0) goto L37
            W1.j r2 = r2.f7418b
            T1.p r2 = r2.f()
            if (r2 == 0) goto L37
            W1.l r2 = r2.f7404r
            java.lang.Object r2 = r2.f8095e
            java.lang.String r2 = (java.lang.String) r2
            goto L38
        L37:
            r2 = r3
        L38:
            java.lang.String r6 = "splashScreen"
            boolean r2 = kotlin.jvm.internal.m.a(r2, r6)
            if (r2 != 0) goto Lb9
            T1.u r2 = r0.f7075e
            if (r2 == 0) goto L53
            W1.j r2 = r2.f7418b
            T1.p r2 = r2.f()
            if (r2 == 0) goto L53
            W1.l r2 = r2.f7404r
            java.lang.Object r2 = r2.f8095e
            java.lang.String r2 = (java.lang.String) r2
            goto L54
        L53:
            r2 = r3
        L54:
            if (r2 == 0) goto Lb9
            int r2 = r2.length()
            if (r2 != 0) goto L5d
            goto Lb9
        L5d:
            if (r1 != 0) goto Lb9
            boolean r1 = r7.f4843d
            if (r1 != 0) goto Lc4
            T1.u r1 = r0.f7075e
            if (r1 == 0) goto L76
            W1.j r1 = r1.f7418b
            T1.p r1 = r1.f()
            if (r1 == 0) goto L76
            W1.l r1 = r1.f7404r
            java.lang.Object r1 = r1.f8095e
            java.lang.String r1 = (java.lang.String) r1
            goto L77
        L76:
            r1 = r3
        L77:
            boolean r1 = kotlin.jvm.internal.m.a(r1, r6)
            if (r1 != 0) goto Lc4
            T1.u r1 = r0.f7075e
            if (r1 == 0) goto L90
            W1.j r1 = r1.f7418b
            T1.p r1 = r1.f()
            if (r1 == 0) goto L90
            W1.l r1 = r1.f7404r
            java.lang.Object r1 = r1.f8095e
            java.lang.String r1 = (java.lang.String) r1
            goto L91
        L90:
            r1 = r3
        L91:
            if (r1 == 0) goto Lc4
            int r1 = r1.length()
            if (r1 != 0) goto L9a
            goto Lc4
        L9a:
            R4.i r1 = r0.f7073d
            if (r1 == 0) goto La0
            R4.F1 r3 = r1.f6999b
        La0:
            if (r3 == 0) goto Lc4
            boolean r1 = r7.f4843d
            if (r1 != 0) goto Lc4
            r7.f4843d = r4
            boolean r1 = r7.b()
            if (r1 == 0) goto Laf
            goto Lc4
        Laf:
            T1.u r0 = r0.f7075e
            if (r0 == 0) goto Lc4
            java.lang.String r1 = "noInternetScreen"
            T1.u.b(r0, r1)
            return r5
        Lb9:
            if (r1 != 0) goto Lc5
            R4.i r0 = r0.f7073d
            if (r0 == 0) goto Lc1
            R4.F1 r3 = r0.f6999b
        Lc1:
            if (r3 != 0) goto Lc4
            goto Lc5
        Lc4:
            return r5
        Lc5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0279e0.b():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        C0468k1 c0468k1 = (C0468k1) this.f4844e;
        if (b()) {
            if (!this.f4841b) {
                this.f4841b = true;
                WebView webView = c0468k1.f7084k;
                if (webView != null) {
                    webView.reload();
                }
                WebView webView2 = c0468k1.f7084k;
                String url = null;
                if ((webView2 != null ? webView2.getUrl() : null) != null) {
                    WebView webView3 = c0468k1.f7084k;
                    if (webView3 != null) {
                        url = webView3.getUrl();
                    }
                } else {
                    url = "https://www.smspariaz.com";
                }
                WebView webView4 = c0468k1.f7084k;
                if (webView4 != null) {
                    kotlin.jvm.internal.m.b(url);
                    webView4.loadUrl(url);
                }
            }
            this.f4843d = false;
            new Handler(Looper.getMainLooper()).postDelayed(new g5.k(this, 1), 100L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean d() {
        if (!this.f4841b) {
            this.f4841b = true;
            C0288h0 c0288h0 = (C0288h0) this.f4844e;
            this.f4843d = c0288h0.s().getBoolean(this.f4842c, this.f4840a);
        }
        return this.f4843d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(boolean z5) {
        SharedPreferences.Editor editorEdit = ((C0288h0) this.f4844e).s().edit();
        editorEdit.putBoolean(this.f4842c, z5);
        editorEdit.apply();
        this.f4843d = z5;
    }

    public C0279e0(C0468k1 c0468k1) {
        this.f4844e = c0468k1;
    }
}
