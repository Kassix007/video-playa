package R4;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.web2native.MainActivity;
import i1.C1134a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j3 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l3 f7035r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j3(l3 l3Var, int i) {
        this.f7034q = i;
        this.f7035r = l3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7034q) {
            case 0:
                V v6 = this.f7035r.f7114a.f7044D;
                break;
            case 1:
                l3 l3Var = this.f7035r;
                C0468k1 c0468k1 = l3Var.f7114a;
                WebView webView = c0468k1.f7084k;
                kotlin.jvm.internal.m.b(webView);
                webView.loadUrl("javascript:(function() {var style = document.createElement('style');style.type = 'text/css';style.innerHTML = '@media print { body { background-color: #FFFFFF; } }';document.head.appendChild(style);})()");
                MainActivity mainActivity = l3Var.f7121k;
                Object systemService = mainActivity.getSystemService("print");
                kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.print.PrintManager");
                PrintManager printManager = (PrintManager) systemService;
                WebView webView2 = c0468k1.f7084k;
                kotlin.jvm.internal.m.b(webView2);
                PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = webView2.createPrintDocumentAdapter();
                PrintAttributes.Builder builder = new PrintAttributes.Builder();
                SharedPreferences preferences = l3Var.f7122l.getPreferences(0);
                String string = preferences.getString("printId", null);
                String string2 = preferences.getString("printLabel", null);
                String string3 = preferences.getString("printSize", null);
                builder.setMediaSize((string == null || string2 == null || string3 == null) ? C3.a.B("ISO_A4") : C3.a.B(string3));
                PrintJob printJobPrint = printManager.print("W2N_DOC Document", printDocumentAdapterCreatePrintDocumentAdapter, builder.build());
                kotlin.jvm.internal.m.d(printJobPrint, "print(...)");
                if (printJobPrint.isCompleted()) {
                    Toast.makeText(mainActivity, "Printing Success", 1).show();
                } else if (printJobPrint.isFailed()) {
                    Toast.makeText(mainActivity, "Printing Failed", 1).show();
                }
                break;
            case 2:
                C0506u0 c0506u0 = this.f7035r.f7119g;
                kotlin.jvm.internal.m.b(c0506u0);
                try {
                    c0506u0.f7194a.getWindow().addFlags(128);
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return;
                }
                break;
            case 3:
                V v7 = this.f7035r.f7114a.f7044D;
                break;
            case 4:
                this.f7035r.f7114a.f7067a.setRequestedOrientation(-1);
                break;
            case 5:
                l3 l3Var2 = this.f7035r;
                kotlin.jvm.internal.m.b(l3Var2.f7120h);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSuccess", false);
                    jSONObject.put(FirebaseAnalytics.Param.VALUE, "Domain is not in whitelisted");
                    l3Var2.a(jSONObject);
                } catch (JSONException e8) {
                    e8.printStackTrace();
                    return;
                }
                break;
            case 6:
                l3 l3Var3 = this.f7035r;
                if (l3Var3.f7117d == null) {
                    l3Var3.f7117d = new C0498s0(l3Var3.f7122l, l3Var3.f7114a, 1);
                }
                C0498s0 c0498s0 = l3Var3.f7117d;
                kotlin.jvm.internal.m.b(c0498s0);
                MainActivity mainActivity2 = c0498s0.f7180a;
                if (Build.VERSION.SDK_INT < 30) {
                    mainActivity2.getWindow().clearFlags(1024);
                    mainActivity2.getWindow().getDecorView().setSystemUiVisibility(0);
                    mainActivity2.getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
                    mainActivity2.getWindow().setNavigationBarColor(Color.parseColor("#000000"));
                } else {
                    C0468k1 c0468k12 = c0498s0.f7181b;
                    C1134a c1134a = c0468k12.f7065Y;
                    if (c1134a != null) {
                        ((C3.a) c1134a.f13535r).S(WindowInsets.Type.navigationBars());
                    }
                    C1134a c1134a2 = c0468k12.f7065Y;
                    if (c1134a2 != null) {
                        ((C3.a) c1134a2.f13535r).S(WindowInsets.Type.statusBars());
                    }
                }
                break;
            case 7:
                C0506u0 c0506u02 = this.f7035r.f7119g;
                kotlin.jvm.internal.m.b(c0506u02);
                try {
                    c0506u02.f7194a.getWindow().clearFlags(128);
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
                break;
            case 8:
                l3 l3Var4 = this.f7035r;
                WebView webView3 = l3Var4.f7114a.f7084k;
                kotlin.jvm.internal.m.b(webView3);
                kotlin.jvm.internal.m.b(webView3.getUrl());
                kotlin.jvm.internal.m.b(l3Var4.f7120h);
                break;
            case 9:
                this.f7035r.f7114a.f7059S.getClass();
                break;
            case 10:
                l3 l3Var5 = this.f7035r;
                WebView webView4 = l3Var5.f7114a.f7084k;
                kotlin.jvm.internal.m.b(webView4);
                kotlin.jvm.internal.m.b(webView4.getUrl());
                kotlin.jvm.internal.m.b(l3Var5.f7120h);
                break;
            case 11:
                l3 l3Var6 = this.f7035r;
                if (l3Var6.f7117d == null) {
                    l3Var6.f7117d = new C0498s0(l3Var6.f7122l, l3Var6.f7114a, 1);
                }
                C0498s0 c0498s02 = l3Var6.f7117d;
                kotlin.jvm.internal.m.b(c0498s02);
                c0498s02.c();
                break;
            case 12:
                l3 l3Var7 = this.f7035r;
                WebView webView5 = l3Var7.f7114a.f7084k;
                kotlin.jvm.internal.m.b(webView5);
                WebView webView6 = l3Var7.f7114a.f7084k;
                kotlin.jvm.internal.m.b(webView6);
                String url = webView6.getUrl();
                kotlin.jvm.internal.m.b(url);
                webView5.loadUrl(url);
                break;
            case 13:
                P5.S s6 = this.f7035r.f7114a.f7098t.f;
                Boolean bool = Boolean.TRUE;
                s6.getClass();
                s6.h(null, bool);
                break;
            default:
                V v8 = this.f7035r.f7114a.f7044D;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ j3(l3 l3Var, String str, int i) {
        this.f7034q = i;
        this.f7035r = l3Var;
    }

    public /* synthetic */ j3(l3 l3Var, String str, Boolean bool) {
        this.f7034q = 5;
        this.f7035r = l3Var;
    }
}
