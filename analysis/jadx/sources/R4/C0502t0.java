package R4;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.web2native.MainActivity;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: R4.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0502t0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7183b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0502t0(int i, Object obj) {
        this.f7182a = i;
        this.f7183b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        switch (this.f7182a) {
            case 0:
                kotlin.jvm.internal.m.e(view, "view");
                kotlin.jvm.internal.m.e(url, "url");
                MainActivity mainActivity = ((C0506u0) this.f7183b).f7194a;
                Object systemService = mainActivity.getSystemService("print");
                PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
                if (printManager != null) {
                    String strA = Q2.g.A(mainActivity);
                    PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = view.createPrintDocumentAdapter(strA);
                    kotlin.jvm.internal.m.d(printDocumentAdapterCreatePrintDocumentAdapter, "createPrintDocumentAdapter(...)");
                    printManager.print(strA, printDocumentAdapterCreatePrintDocumentAdapter, new PrintAttributes.Builder().build());
                }
                break;
            default:
                super.onPageFinished(view, url);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f7182a) {
            case 1:
                C0468k1 c0468k1 = (C0468k1) this.f7183b;
                if (!c0468k1.f7053M.b()) {
                    if (webView != null) {
                        webView.stopLoading();
                    }
                    WebView webView2 = c0468k1.f7084k;
                    if (webView2 != null) {
                        webView2.stopLoading();
                    }
                } else {
                    super.onPageStarted(webView, str, bitmap);
                    if ((str == null || !J5.m.K0(str, "google.com/url?q")) && !c0468k1.f7063W) {
                        if ((webView != null ? webView.getUrl() : null) != null) {
                            Intent intent = new Intent(c0468k1.f7071c, (Class<?>) MainActivity.class);
                            intent.putExtra("url", webView.getUrl());
                            c0468k1.f7071c.startActivity(intent);
                        }
                    }
                }
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0181 -> B:100:0x0184). Please report as a decompilation issue!!! */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        WebView webView;
        P0 p02;
        P0 p03;
        switch (this.f7182a) {
            case 0:
                kotlin.jvm.internal.m.e(view, "view");
                kotlin.jvm.internal.m.e(request, "request");
                return false;
            default:
                kotlin.jvm.internal.m.e(view, "view");
                kotlin.jvm.internal.m.e(request, "request");
                String string = request.getUrl().toString();
                kotlin.jvm.internal.m.d(string, "toString(...)");
                C0468k1 c0468k1 = (C0468k1) this.f7183b;
                if (!c0468k1.f7053M.b()) {
                    return true;
                }
                if (J5.m.K0(string, "__/auth/handler")) {
                    C0458i c0458i = c0468k1.f7073d;
                    if ((c0458i == null || (p03 = c0458i.f6989N) == null) ? false : kotlin.jvm.internal.m.a(p03.f6831d, Boolean.TRUE)) {
                        C0458i c0458i2 = c0468k1.f7073d;
                        if (((c0458i2 == null || (p02 = c0458i2.f6989N) == null) ? null : p02.f6829b) != null) {
                            c0468k1.f7041A = string;
                            T1.u uVar = c0468k1.f7075e;
                            if (uVar == null) {
                                return true;
                            }
                            T1.u.b(uVar, "googleGsiLoginScreen");
                            return true;
                        }
                    }
                }
                if (!J5.m.K0(string, "google.com/url?q")) {
                    if (J5.t.G0(string, "blob", false)) {
                        WebView webView2 = c0468k1.f7084k;
                        if (webView2 == null) {
                            return true;
                        }
                        webView2.loadUrl(string);
                        return true;
                    }
                    if (J5.t.G0(string, "intent://", false) || J5.t.G0(string, "rib://", false)) {
                        try {
                            Context context = view.getContext();
                            Intent uri = Intent.parseUri(string, 1);
                            if (uri != null) {
                                view.stopLoading();
                                try {
                                    context.startActivity(uri);
                                    break;
                                } catch (ActivityNotFoundException unused) {
                                    String stringExtra = uri.getStringExtra("browser_fallback_url");
                                    if (stringExtra != null) {
                                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(stringExtra)));
                                    } else {
                                        Toast.makeText(c0468k1.f7071c, "Issue in opening the app/link", 0).show();
                                    }
                                }
                            }
                        } catch (URISyntaxException e7) {
                            e7.printStackTrace();
                        }
                        return true;
                    }
                    if (J5.t.G0(string, "http", false)) {
                        if (c0468k1.f7063W) {
                            return true;
                        }
                        Intent intent = new Intent(c0468k1.f7071c, (Class<?>) MainActivity.class);
                        intent.putExtra("url", string);
                        c0468k1.f7071c.startActivity(intent);
                        return true;
                    }
                    String str = "";
                    try {
                        try {
                            String strSubstring = string.substring(0, J5.m.S0(string, "://", 0, 6));
                            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                            str = strSubstring;
                        } catch (Exception unused2) {
                            System.out.println((Object) "Failed to get urlSchemeProtocol");
                        }
                        if (J5.t.G0(string, "data:image", false)) {
                            return true;
                        }
                        if (str.length() > 0) {
                            WebView webView3 = c0468k1.f7084k;
                            String url = webView3 != null ? webView3.getUrl() : null;
                            kotlin.jvm.internal.m.b(url);
                            if (J5.m.K0(url, str)) {
                                return true;
                            }
                        }
                        if (string.equals("about:blank#blocked")) {
                            return true;
                        }
                        if (!J5.t.G0(string, "blob", false)) {
                            c0468k1.f7071c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                            return true;
                        }
                    } catch (Exception e8) {
                        if (J5.t.G0(string, "truecallersdk", false)) {
                            Toast.makeText(c0468k1.f7071c, "Truecaller app not installed", 1).show();
                        } else if (!J5.t.G0(string, "blob", false)) {
                            Toast.makeText(c0468k1.f7071c, "App failed to load the url", 1).show();
                        } else if (J5.t.G0(string, "blob", false) && (webView = c0468k1.f7084k) != null) {
                            webView.loadUrl(string);
                        }
                        e8.printStackTrace();
                        return true;
                    }
                }
                return false;
        }
    }
}
