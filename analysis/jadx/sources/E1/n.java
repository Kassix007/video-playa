package E1;

import R4.C0502t0;
import R4.C0506u0;
import R4.V;
import R4.l3;
import android.webkit.WebView;
import androidx.work.WorkerParameters;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkerWrapper;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1647q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1649s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1650t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i) {
        this.f1647q = i;
        this.f1648r = obj;
        this.f1649s = obj2;
        this.f1650t = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f1647q) {
            case 0:
                p pVar = (p) this.f1648r;
                l6.d dVar = (l6.d) this.f1649s;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1650t;
                try {
                    w wVarJ = AbstractC0836n2.j(pVar.f1653a);
                    if (wVarJ == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    v vVar = (v) ((k) wVarJ.f1633b);
                    synchronized (vVar.f1665d) {
                        vVar.f = threadPoolExecutor;
                        break;
                    }
                    ((k) wVarJ.f1633b).a(new o(dVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    dVar.z(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                C0506u0 c0506u0 = (C0506u0) this.f1648r;
                String str = (String) this.f1649s;
                String str2 = (String) this.f1650t;
                WebView webView = new WebView(c0506u0.f7194a);
                webView.setWebViewClient(new C0502t0(0, c0506u0));
                if (str.equals("html")) {
                    webView.loadDataWithBaseURL(null, str2, "text/HTML", "UTF-8", null);
                    return;
                } else {
                    if (str.equals("url")) {
                        webView.loadUrl(str2);
                        return;
                    }
                    return;
                }
            case 2:
                JSONObject jSONObject = (JSONObject) this.f1648r;
                String str3 = (String) this.f1649s;
                l3 l3Var = (l3) this.f1650t;
                if (!jSONObject.has("contacts")) {
                    WebView webView2 = l3Var.f7123m;
                    kotlin.jvm.internal.m.b(webView2);
                    webView2.loadUrl("javascript:window.WebToNativeInterface.androidCBHook('" + str3 + "');");
                    return;
                }
                try {
                    String strEncode = URLEncoder.encode(str3, "UTF-8");
                    kotlin.jvm.internal.m.d(strEncode, "encode(...)");
                    WebView webView3 = l3Var.f7123m;
                    kotlin.jvm.internal.m.b(webView3);
                    webView3.loadUrl("javascript:window.WebToNativeInterface.androidCBHook(" + strEncode + ");");
                    return;
                } catch (UnsupportedEncodingException e7) {
                    throw new RuntimeException(e7);
                }
            case 3:
                String str4 = (String) this.f1648r;
                l3 l3Var2 = (l3) this.f1649s;
                V.g(str4, l3Var2.f7122l, (String) this.f1650t, null, l3Var2.f7114a);
                return;
            case 4:
                ((Processor) this.f1648r).lambda$startWork$1((I4.b) this.f1649s, (WorkerWrapper) this.f1650t);
                return;
            default:
                WorkLauncherImpl.startWork$lambda$0((WorkLauncherImpl) this.f1648r, (StartStopToken) this.f1649s, (WorkerParameters.RuntimeExtras) this.f1650t);
                return;
        }
    }
}
