package R4;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import com.web2native.MainActivity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i3 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7025q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l3 f7026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f7027s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i3(l3 l3Var, String str, int i) {
        this.f7025q = i;
        this.f7026r = l3Var;
        this.f7027s = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7025q) {
            case 0:
                try {
                    this.f7026r.f7122l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f7027s)));
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return;
                }
                break;
            case 1:
                l3 l3Var = this.f7026r;
                String str = this.f7027s;
                try {
                    WebView webView = l3Var.f7123m;
                    kotlin.jvm.internal.m.b(webView);
                    kotlin.jvm.internal.m.b(str);
                    webView.loadUrl(str);
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
                break;
            case 2:
                WebView webView2 = this.f7026r.f7123m;
                kotlin.jvm.internal.m.b(webView2);
                webView2.loadUrl("javascript:window.WebToNativeInterface.androidAdMobCBHook('" + this.f7027s + "');");
                break;
            default:
                l3 l3Var2 = this.f7026r;
                MainActivity mainActivity = l3Var2.f7122l;
                C0468k1 dataObject = l3Var2.f7114a;
                kotlin.jvm.internal.m.e(dataObject, "dataObject");
                String str2 = this.f7027s;
                if (str2 != null && !J5.m.U0(str2)) {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.has("type") ? jSONObject.getString("type") : null;
                    if (string == null) {
                        string = "url";
                    }
                    String string2 = jSONObject.has("text") ? jSONObject.getString("text") : null;
                    String string3 = jSONObject.has("url") ? jSONObject.getString("url") : null;
                    String string4 = jSONObject.has("extension") ? jSONObject.getString("extension") : null;
                    if (!string.equals("file") || string3 == null || string3.length() == 0) {
                        Q2.g.M(mainActivity, str2);
                    } else {
                        try {
                            mainActivity.runOnUiThread(new h3(string3, mainActivity, string4, string2, dataObject));
                        } catch (Exception e9) {
                            e9.printStackTrace();
                            return;
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ i3(String str, l3 l3Var, int i) {
        this.f7025q = i;
        this.f7027s = str;
        this.f7026r = l3Var;
    }
}
