package R4;

import C0.RunnableC0089m;
import O3.C0279e0;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.Toast;
import com.web2native.MainActivity;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: R4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0466k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f7036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f7037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7038c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0466k(MainActivity mainActivity, WebView webView) {
        kotlin.jvm.internal.m.e(webView, "webView");
        this.f7036a = mainActivity;
        this.f7037b = webView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(C0468k1 c0468k1) {
        T1.p pVarF;
        T1.p pVarF2;
        T1.u uVar = c0468k1.f7075e;
        MainActivity mainActivity = c0468k1.f7067a;
        C0279e0 c0279e0 = c0468k1.f7053M;
        String str = null;
        if (kotlin.jvm.internal.m.a((uVar == null || (pVarF2 = uVar.f7418b.f()) == null) ? null : (String) pVarF2.f7404r.f8095e, "noInternetScreen")) {
            c0279e0.a();
            return;
        }
        T1.u uVar2 = c0468k1.f7075e;
        if (uVar2 != null && (pVarF = uVar2.f7418b.f()) != null) {
            str = (String) pVarF.f7404r.f8095e;
        }
        if (kotlin.jvm.internal.m.a(str, "notificationScreen")) {
            c0279e0.a();
            return;
        }
        WebView webView = this.f7037b;
        webView.getUrl();
        if (webView.canGoBack()) {
            c();
            if (webView.canGoBack()) {
                webView.goBack();
                return;
            }
            return;
        }
        if (this.f7038c) {
            mainActivity.finish();
            mainActivity.finishAndRemoveTask();
        }
        if (!this.f7038c) {
            Toast.makeText(this.f7036a, "Press again to exit", 0).show();
        }
        this.f7038c = true;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0089m(4, this), 2000L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(C0468k1 dataObject) {
        boolean zA;
        C0447f0 c0447f0;
        C0447f0 c0447f02;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        WebView webView = dataObject.f7084k;
        C0458i c0458i = dataObject.f7073d;
        Boolean bool = dataObject.f7094p;
        if (bool != null) {
            kotlin.jvm.internal.m.b(bool);
            zA = bool.booleanValue();
        } else {
            zA = (c0458i == null || (c0447f0 = c0458i.f6984I) == null) ? false : kotlin.jvm.internal.m.a(c0447f0.f6946a, Boolean.TRUE);
        }
        Boolean bool2 = dataObject.f7094p;
        String strValueOf = String.valueOf(this.f7037b.getUrl());
        String pattern = (c0458i == null || (c0447f02 = c0458i.f6984I) == null) ? null : c0447f02.f6947b;
        if (!zA) {
            a(dataObject);
            return;
        }
        if (kotlin.jvm.internal.m.a(bool2, Boolean.TRUE)) {
            if (webView != null) {
                webView.evaluateJavascript("window.customBackHandling()", null);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(bool2, Boolean.FALSE)) {
            a(dataObject);
            return;
        }
        if (bool2 != null) {
            throw new C2.e();
        }
        if (pattern == null || J5.m.U0(pattern)) {
            a(dataObject);
            return;
        }
        kotlin.jvm.internal.m.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strValueOf).find()) {
            a(dataObject);
        } else if (webView != null) {
            webView.evaluateJavascript("window.customBackHandling()", null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        WebView webView = this.f7037b;
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            kotlin.jvm.internal.m.d(webBackForwardListCopyBackForwardList, "copyBackForwardList(...)");
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            if (currentIndex > 0) {
                int i = 0;
                while (i < webBackForwardListCopyBackForwardList.getSize()) {
                    String url = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                    int i7 = i + 1;
                    String url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - i7).getUrl();
                    if (url == null || url2 == null || !url.equals(url2)) {
                        break;
                    } else {
                        i = i7;
                    }
                }
                if (i != 0) {
                    for (int i8 = 0; i8 < i; i8++) {
                        webView.goBack();
                    }
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }
}
