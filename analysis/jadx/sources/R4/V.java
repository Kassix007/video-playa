package R4;

import M5.AbstractC0263y;
import P.C0371o;
import P.C0372o0;
import android.content.Context;
import android.webkit.WebView;
import com.web2native.MainActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UUID;
import k1.AbstractC1175c;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f6867a = new V();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f6868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f6869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static V f6870d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public V(C0468k1 dataObject) {
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String f(MainActivity mainActivity, String str) {
        String str2 = f6869c;
        if (str2 != null) {
            String str3 = (String) J5.m.d1(str2, new String[]{"="}).get(1);
            if (!J5.m.J0(str3, '\"')) {
                return str3;
            }
            String strSubstring = str3.substring(1, str3.length() - 1);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        if (str == null) {
            return Q2.g.A(mainActivity) + "_" + System.currentTimeMillis();
        }
        return Q2.g.A(mainActivity) + "_" + System.currentTimeMillis() + "." + str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(String url, MainActivity mainActivity, String str, String str2, C0468k1 dataObject) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        mainActivity.runOnUiThread(new RunnableC0452g1(mainActivity, 1));
        if (!J5.t.G0(url, "blob", false)) {
            T5.e eVar = M5.H.f3811a;
            AbstractC0263y.t(AbstractC0263y.a(T5.d.f7468q), null, null, new A2(url, mainActivity, str, str2, null), 3);
            return;
        }
        l3 l3Var = dataObject.f7048H;
        if (l3Var != null) {
            l3Var.f7126p = str2;
        }
        WebView webView = dataObject.f7084k;
        if (webView != null) {
            kotlin.jvm.internal.m.b(l3Var);
            if (str == null) {
                str = "*/*";
            }
            webView.loadUrl(l3Var.b(url, D5.a.w(str)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean h(Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        return AbstractC1175c.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 || AbstractC1175c.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String i(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        byte[] bArr = new byte[(int) randomAccessFile.length()];
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        return new String(bArr, J5.a.f2809a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        byte[] bytes = string.getBytes(J5.a.f2809a);
        kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(String str, C0371o c0371o, int i) {
        c0371o.U(1504894088);
        int i7 = i & 1;
        if (!c0371o.K(i7, i7 != 0)) {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new Z(i, 0, this, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(int i, C0371o c0371o) {
        c0371o.U(-1778009376);
        int i7 = i & 1;
        if (!c0371o.K(i7, i7 != 0)) {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new J5.u(i, 3, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(int i, C0371o c0371o) {
        c0371o.U(-470461657);
        int i7 = i & 1;
        if (!c0371o.K(i7, i7 != 0)) {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new J5.u(i, 5, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(int i, C0371o c0371o) {
        c0371o.U(-1799186357);
        int i7 = i & 1;
        if (!c0371o.K(i7, i7 != 0)) {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new J5.u(i, 7, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(B5.c isRichBottomBarVisibleVar, C0371o c0371o, int i) {
        kotlin.jvm.internal.m.e(isRichBottomBarVisibleVar, "isRichBottomBarVisibleVar");
        c0371o.U(1812373994);
        int i7 = i & 1;
        if (!c0371o.K(i7, i7 != 0)) {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new Z(i, 1, this, isRichBottomBarVisibleVar);
        }
    }
}
