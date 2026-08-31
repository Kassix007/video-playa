package R4;

import B0.C0050o;
import M5.AbstractC0263y;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import com.google.android.gms.common.api.Status;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.web2native.MainActivity;
import com.web2native.OrufyConnectHandlerUtil;
import com.wnapp.smspariaz.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import n5.AbstractC1397A;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0468k1 f7114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U f7115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0506u0 f7116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0498s0 f7117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OrufyConnectHandlerUtil f7118e;
    public B0.G0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0506u0 f7119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f7120h;
    public V i;
    public V j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final MainActivity f7121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MainActivity f7122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WebView f7123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f7124n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f7125o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f7126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SharedPreferences f7127q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l3(C0468k1 dataObject) {
        G g7;
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        this.f7114a = dataObject;
        this.f7121k = dataObject.f7071c;
        MainActivity mainActivity = dataObject.f7067a;
        this.f7122l = mainActivity;
        this.f7125o = l3.class.getSimpleName();
        this.f7123m = dataObject.f7084k;
        C0458i c0458i = dataObject.f7073d;
        if ((c0458i == null || (g7 = c0458i.f7007m) == null) ? false : kotlin.jvm.internal.m.a(g7.f6758a, Boolean.TRUE)) {
            this.f7118e = dataObject.f7052L;
        }
        this.f7127q = mainActivity.getPreferences(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(JSONObject results) {
        String string;
        kotlin.jvm.internal.m.e(results, "results");
        try {
            string = results.toString();
        } catch (Exception unused) {
            string = "{\"type\":\"RESPONSE_EXCEPTION\"}";
        }
        kotlin.jvm.internal.m.b(string);
        this.f7122l.runOnUiThread(new E1.n(results, string, this, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void addEventToAppsFlyer(String str, String str2) {
        V v6 = this.f7114a.f7042B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void addFbEvents(String str, String str2) {
        V v6 = this.f7114a.f7046F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void addFbPurchaseEvent(String str, String str2, String str3) {
        V v6 = this.f7114a.f7046F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void askBluetoothPermission() {
        V v6 = this.f7114a.f7082i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b(String blobUrl, String str) {
        kotlin.jvm.internal.m.e(blobUrl, "blobUrl");
        if (!J5.t.G0(blobUrl, "blob", false)) {
            return "javascript: console.log('It is not a Blob URL');";
        }
        this.f7124n = str;
        return "javascript: var xhr = new XMLHttpRequest();xhr.open('GET', '" + blobUrl + "', true);xhr.setRequestHeader('Content-type','" + str + ";charset=UTF-8');xhr.responseType = 'blob';xhr.onload = function(e) {    if (this.status == 200) {        var blobPdf = this.response;        var reader = new FileReader();        reader.readAsDataURL(blobPdf);        reader.onloadend = function() {            base64data = reader.result;            WebToNativeInterface.getBase64FromBlobData(base64data);        }    }};xhr.send();";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void biometricAuthWithDismissOnCancel(String str) {
        JSONObject jSONObject = str != null ? new JSONObject(str) : new JSONObject("");
        String string = jSONObject.has("prompt") ? jSONObject.getString("prompt") : null;
        Boolean boolValueOf = jSONObject.has("isAuthenticationOptional") ? Boolean.valueOf(jSONObject.getBoolean("isAuthenticationOptional")) : null;
        c();
        new Handler(Looper.getMainLooper()).post(new j3(this, string, boolValueOf));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        T1.p pVarF;
        if (this.i == null) {
            if (this.f7120h == null) {
                this.f7120h = new r();
            }
            C0468k1 c0468k1 = this.f7114a;
            T1.u uVar = c0468k1.f7075e;
            kotlin.jvm.internal.m.a((uVar == null || (pVarF = uVar.f7418b.f()) == null) ? null : (String) pVarF.f7404r.f8095e, "splashScreen");
            MainActivity mainActivity = c0468k1.f7069b;
            kotlin.jvm.internal.m.b(this.f7120h);
            this.i = new V();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void callBiometric(String str) {
        c();
        new Handler(Looper.getMainLooper()).post(new j3(this, str, (Boolean) null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void checkBiometricStatus() {
        c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void checkIfAppUpdateAvailable() throws JSONException {
        C0050o c0050o = this.f7114a.f7049I;
        if (c0050o != null) {
            Y4.d dVar = (Y4.d) c0050o.f500r;
            dVar.f8277e.put("type", "checkIfAppUpdateAvailable");
            S3.k kVarB = dVar.f8278g.b();
            L0 l02 = new L0(6, new Y4.b(dVar, 2));
            kVarB.getClass();
            O3.Q0 q02 = S3.f.f7307a;
            kVarB.a(q02, l02);
            kVarB.f7317b.e(new S3.h((Executor) q02, (S3.b) new L0(7, dVar)));
            kVarB.i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void checkPermission(String str) throws JSONException {
        if (str != null) {
            g5.h hVar = this.f7114a.f7059S;
            hVar.f13167v = "checkPermission";
            hVar.f13153e = true;
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                kotlin.jvm.internal.m.d(string, "getString(...)");
                arrayList.add(string);
            }
            JSONObject jSONObject = new JSONObject();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                String str2 = (String) obj;
                jSONObject.put(str2, hVar.a(str2));
            }
            String str3 = hVar.f13167v;
            kotlin.jvm.internal.m.b(str3);
            if (hVar.f13153e) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("type", str3);
                    jSONObject2.put("permissionStatus", jSONObject);
                } catch (JSONException e7) {
                    e7.printStackTrace();
                }
                l3 l3Var = hVar.f13150b.f7048H;
                if (l3Var != null) {
                    l3Var.a(jSONObject2);
                }
                hVar.f13153e = false;
                hVar.f13165t = null;
                hVar.f13167v = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void clearWebViewCache(String str) {
        boolean z5 = false;
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (jSONObject.has("reload")) {
                    if (jSONObject.getBoolean("reload")) {
                        z5 = true;
                    }
                }
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        }
        if (this.f7114a.f7084k != null) {
            this.f7122l.runOnUiThread(new k3(this, z5));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void closeApp() {
        C0468k1 c0468k1 = this.f7114a;
        c0468k1.f7067a.finish();
        c0468k1.f7067a.finishAndRemoveTask();
        System.exit(-1);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void createWebPagePrint() {
        WebView webView = this.f7114a.f7084k;
        kotlin.jvm.internal.m.b(webView);
        webView.post(new j3(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void customBackHandling(String str) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            this.f7114a.f7094p = Boolean.valueOf(jSONObject.has("enable") ? jSONObject.getBoolean("enable") : false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void deleteAppData(String str) {
        Log.e("NativeDataStoreLog", "deleteAppData - " + str);
        if (str == null || str.equals("")) {
            return;
        }
        V v6 = this.f7114a.f7104z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void deleteCloudData(String str) {
        Log.e("NativeDataStoreLog", "deleteCloudData - " + str);
        if (str == null || str.equals("")) {
            return;
        }
        V v6 = this.f7114a.f7104z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void deleteSecret() {
        c();
        new Handler(Looper.getMainLooper()).post(new j3(this, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void doneVoiceSearch(JSONObject results) {
        kotlin.jvm.internal.m.e(results, "results");
        a(results);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void downloadFile(String jsString) throws JSONException {
        JSONObject jSONObject;
        String str;
        kotlin.jvm.internal.m.e(jsString, "jsString");
        System.out.println((Object) "jsString : ".concat(jsString));
        C0498s0 c0498s0 = new C0498s0(this.f7122l, this.f7114a, 0);
        if (J5.m.U0(jsString)) {
            return;
        }
        try {
            jSONObject = new JSONObject(jsString);
        } catch (JSONException e7) {
            e7.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject != null && jSONObject.has("url")) {
            String string = jSONObject.getString("url");
            String string2 = jSONObject.has("fileName") ? jSONObject.getString("fileName") : null;
            boolean z5 = jSONObject.has("isBlob") ? jSONObject.getBoolean("isBlob") : false;
            String string3 = jSONObject.has("mimeType") ? jSONObject.getString("mimeType") : null;
            String string4 = jSONObject.has("cookies") ? jSONObject.getString("cookies") : null;
            String string5 = jSONObject.has("userAgent") ? jSONObject.getString("userAgent") : null;
            boolean z6 = jSONObject.has("openFileAfterDownload") ? jSONObject.getBoolean("openFileAfterDownload") : false;
            if (z5) {
                T5.e eVar = M5.H.f3811a;
                AbstractC0263y.t(AbstractC0263y.a(R5.n.f7261a), null, null, new C0487p0(c0498s0, string, string2, null), 3);
                str = string2;
            } else {
                str = string2;
                String fileName = string2 == null ? C0.S.k("download_", System.currentTimeMillis()) : str;
                kotlin.jvm.internal.m.b(string);
                String str2 = string3 == null ? "application/octet-stream" : string3;
                kotlin.jvm.internal.m.e(fileName, "fileName");
                T5.e eVar2 = M5.H.f3811a;
                AbstractC0263y.t(AbstractC0263y.a(T5.d.f7468q), null, null, new C0494r0(string, fileName, c0498s0, str2, string4, string5, null), 3);
            }
            if (!z6 || str == null || string3 == null) {
                return;
            }
            c0498s0.f7180a.runOnUiThread(new RunnableC0463j0(c0498s0, str.toString(), string3.toString(), 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void enableSwipeRefresh(boolean z5) {
        P5.S s6 = this.f7114a.f7098t.j;
        Boolean boolValueOf = Boolean.valueOf(z5);
        s6.getClass();
        s6.h(null, boolValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void firstCallWhenAppStarted() {
        C0468k1 c0468k1 = this.f7114a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "firstCallWhenAppStarted");
            jSONObject.put("result", c0468k1.f7064X);
            a(jSONObject);
            c0468k1.f7064X = false;
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void forceUpdateCookies() {
        try {
            CookieManager.getInstance().flush();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JavascriptInterface
    public final void getAddOnStatus(String str) throws JSONException {
        l3 l3Var;
        C0468k1 c0468k1 = this.f7114a;
        C0458i c0458i = c0468k1.f7073d;
        if (c0458i == null || (l3Var = c0468k1.f7048H) == null) {
            return;
        }
        kotlin.jvm.internal.m.b(l3Var);
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("addOnName")) {
                String string = jSONObject.get("addOnName").toString();
                if (string.length() > 0) {
                    switch (string.hashCode()) {
                        case -2130284112:
                            if (string.equals("BARCODE_SCANNING")) {
                                AbstractC1397A.z(string, false, l3Var);
                                break;
                            }
                            break;
                        case -1685530166:
                            if (string.equals("CUSTOM_MEDIA_PLAYER")) {
                                AbstractC1397A.z(string, false, l3Var);
                                break;
                            }
                            break;
                        case -1609307472:
                            if (string.equals("IN_APP_REVIEW")) {
                                AbstractC1397A.z(string, true, l3Var);
                                break;
                            }
                            break;
                        case -1513804767:
                            if (string.equals("IN_APP_UPDATE")) {
                                AbstractC1397A.z(string, true, l3Var);
                                break;
                            }
                            break;
                        case -1332646433:
                            if (string.equals("SECONDARY_NAVIGATION")) {
                                if (c0458i.f7008n == null) {
                                    AbstractC1397A.z(string, false, l3Var);
                                } else {
                                    AbstractC1397A.z(string, true, l3Var);
                                }
                                break;
                            }
                            break;
                        case -1203780440:
                            if (string.equals("BOTTOM_NAVIGATION")) {
                                J2 j22 = c0458i.f7002e;
                                if ((j22 != null ? j22.f6781a : null) != null && kotlin.jvm.internal.m.a(j22.f6781a, Boolean.TRUE)) {
                                    AbstractC1397A.z(string, true, l3Var);
                                } else {
                                    AbstractC1397A.z(string, false, l3Var);
                                }
                                break;
                            }
                            break;
                        case -980472437:
                            if (string.equals("FLOATING_BUTTON")) {
                                if (c0458i.i == null) {
                                    AbstractC1397A.z(string, false, l3Var);
                                } else {
                                    AbstractC1397A.z(string, true, l3Var);
                                }
                                break;
                            }
                            break;
                        case -403567856:
                            if (string.equals("ONBOARDING_SCREEN")) {
                                if (c0458i.f6998a == null) {
                                    AbstractC1397A.z(string, false, l3Var);
                                } else {
                                    AbstractC1397A.z(string, true, l3Var);
                                }
                                break;
                            }
                            break;
                        case -147606480:
                            if (string.equals("FACEBOOK_APP_EVENTS")) {
                                AbstractC1397A.z(string, false, l3Var);
                                break;
                            }
                            break;
                        case 426896697:
                            if (string.equals("BACKGROUND_APP_AS_A_SERVICE")) {
                                AbstractC1397A.z(string, false, l3Var);
                                break;
                            }
                            break;
                        case 675811123:
                            if (string.equals("OFFER_CARD")) {
                                L1 l12 = c0458i.f7009o;
                                if ((l12 != null ? l12.f6791a : null) != null && l12.f6791a.booleanValue()) {
                                    AbstractC1397A.z(string, true, l3Var);
                                } else {
                                    AbstractC1397A.z(string, false, l3Var);
                                }
                                break;
                            }
                            break;
                        case 894518542:
                            if (string.equals("APPSFLYER")) {
                                AbstractC1397A.z(string, false, l3Var);
                                break;
                            }
                            break;
                        case 999311470:
                            if (string.equals("ONESIGNAL")) {
                                AbstractC1397A.z(string, false, l3Var);
                                break;
                            }
                            break;
                        case 1221186815:
                            if (string.equals("BIOMETRIC_AUTHENTICATION")) {
                                C0490q c0490q = c0458i.f7011q;
                                if ((c0490q != null ? c0490q.f7154a : null) == null) {
                                    AbstractC1397A.z(string, false, l3Var);
                                } else {
                                    AbstractC1397A.z(string, c0490q.f7154a.booleanValue(), l3Var);
                                }
                                break;
                            }
                            break;
                        case 1388242959:
                            if (string.equals("APP_SHORTCUTS")) {
                                if (c0458i.j == null) {
                                    AbstractC1397A.z(string, false, l3Var);
                                } else {
                                    AbstractC1397A.z(string, true, l3Var);
                                }
                                break;
                            }
                            break;
                        case 1532909472:
                            if (string.equals("AUTO_READ_SMS")) {
                                AbstractC1397A.z(string, false, l3Var);
                                break;
                            }
                            break;
                        case 1648262745:
                            if (string.equals("IN_APP_PURCHASE")) {
                                AbstractC1397A.z(string, false, l3Var);
                                break;
                            }
                            break;
                        case 1658740727:
                            if (string.equals("SOCIAL_LOGIN")) {
                                P0 p02 = c0458i.f6989N;
                                if ((p02 != null ? p02.f6829b : null) != null) {
                                    AbstractC1397A.z(string, true, l3Var);
                                } else {
                                    AbstractC1397A.z(string, false, l3Var);
                                }
                                break;
                            }
                            break;
                        case 1963193254:
                            if (string.equals("BACKGROUND_LOCATION")) {
                                AbstractC1397A.z(string, false, l3Var);
                                break;
                            }
                            break;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void getAll() {
        if (this.j == null) {
            this.j = new V(this.f7114a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final int getAndroidVersion() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e7) {
            e7.printStackTrace();
            return 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void getAppData(String str) {
        Log.e("NativeDataStoreLog", "getAppData - " + str);
        if (str == null || str.equals("")) {
            return;
        }
        V v6 = this.f7114a.f7104z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015a A[Catch: Exception -> 0x0147, TryCatch #1 {Exception -> 0x0147, blocks: (B:20:0x0131, B:22:0x013b, B:30:0x014d, B:36:0x016f, B:35:0x015a), top: B:73:0x0131 }] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getBase64FromBlobData(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = ""
            java.lang.String r0 = "base64Data"
            kotlin.jvm.internal.m.e(r2, r0)
            java.text.DateFormat r0 = java.text.DateFormat.getDateTimeInstance()
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            java.lang.String r0 = r0.format(r4)
            kotlin.jvm.internal.m.b(r0)
            java.lang.String r4 = "pattern"
            java.lang.String r5 = ", "
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = "compile(...)"
            kotlin.jvm.internal.m.d(r5, r6)
            java.util.regex.Matcher r0 = r5.matcher(r0)
            java.lang.String r5 = "_"
            java.lang.String r0 = r0.replaceFirst(r5)
            java.lang.String r7 = "replaceFirst(...)"
            kotlin.jvm.internal.m.d(r0, r7)
            java.lang.String r8 = " "
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)
            kotlin.jvm.internal.m.d(r8, r6)
            java.util.regex.Matcher r0 = r8.matcher(r0)
            java.lang.String r0 = r0.replaceAll(r5)
            java.lang.String r5 = "replaceAll(...)"
            kotlin.jvm.internal.m.d(r0, r5)
            java.lang.String r8 = ":"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)
            kotlin.jvm.internal.m.d(r8, r6)
            java.lang.String r9 = "-"
            java.util.regex.Matcher r0 = r8.matcher(r0)
            java.lang.String r0 = r0.replaceAll(r9)
            kotlin.jvm.internal.m.d(r0, r5)
            android.webkit.MimeTypeMap r5 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r8 = r1.f7124n
            java.lang.String r5 = r5.getExtensionFromMimeType(r8)
            R4.k1 r8 = r1.f7114a
            R4.i r9 = r8.f7073d
            if (r9 == 0) goto L80
            R4.Y r9 = r9.f7020z
            if (r9 == 0) goto L80
            java.lang.Boolean r9 = r9.f6884a
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r9 = kotlin.jvm.internal.m.a(r9, r11)
            goto L81
        L80:
            r9 = 0
        L81:
            java.lang.String r11 = "_."
            java.lang.String r12 = "/"
            com.web2native.MainActivity r13 = r1.f7121k
            if (r9 == 0) goto Lcd
            java.io.File r9 = new java.io.File
            java.lang.String r14 = android.os.Environment.DIRECTORY_DOWNLOADS
            com.web2native.MainActivity r15 = r8.f7067a
            android.content.pm.ApplicationInfo r15 = r15.getApplicationInfo()
            android.content.pm.PackageManager r10 = r13.getPackageManager()
            java.lang.CharSequence r10 = r15.loadLabel(r10)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            r15.append(r12)
            r15.append(r10)
            java.lang.String r10 = r15.toString()
            java.io.File r10 = android.os.Environment.getExternalStoragePublicDirectory(r10)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r12)
            r14.append(r0)
            r14.append(r11)
            r14.append(r5)
            java.lang.String r0 = r14.toString()
            r9.<init>(r0)
            goto Lf0
        Lcd:
            java.io.File r9 = new java.io.File
            java.lang.String r10 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r10 = android.os.Environment.getExternalStoragePublicDirectory(r10)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r12)
            r14.append(r0)
            r14.append(r11)
            r14.append(r5)
            java.lang.String r0 = r14.toString()
            r9.<init>(r0)
        Lf0:
            java.lang.String r0 = r1.f7124n
            java.lang.String r10 = "^data:"
            java.lang.String r11 = ";base64,"
            java.lang.String r10 = C0.S.n(r10, r0, r11)
            r11 = 1
            kotlin.jvm.internal.m.e(r10, r4)     // Catch: java.lang.Exception -> L116
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r10)     // Catch: java.lang.Exception -> L116
            kotlin.jvm.internal.m.d(r0, r6)     // Catch: java.lang.Exception -> L116
            java.util.regex.Matcher r0 = r0.matcher(r2)     // Catch: java.lang.Exception -> L116
            java.lang.String r0 = r0.replaceFirst(r3)     // Catch: java.lang.Exception -> L116
            kotlin.jvm.internal.m.d(r0, r7)     // Catch: java.lang.Exception -> L116
            r4 = 0
            byte[] r0 = android.util.Base64.decode(r0, r4)     // Catch: java.lang.Exception -> L116
            goto L12c
        L116:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = r10.substring(r11)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.m.d(r0, r4)
            java.lang.String r0 = J5.t.E0(r2, r0, r3)
            r4 = 0
            byte[] r0 = android.util.Base64.decode(r0, r4)
        L12c:
            if (r0 != 0) goto L130
            goto L2df
        L130:
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L147
            r3.<init>(r9)     // Catch: java.lang.Exception -> L147
            r3.write(r0)     // Catch: java.lang.Exception -> L147
            if (r5 == 0) goto L145
            java.lang.String r0 = "jpg"
            boolean r0 = J5.m.K0(r5, r0)     // Catch: java.lang.Exception -> L147
            if (r0 != r11) goto L145
            r0 = r11
            goto L149
        L145:
            r0 = 0
            goto L149
        L147:
            r0 = move-exception
            goto L176
        L149:
            if (r0 != 0) goto L15a
            if (r5 == 0) goto L157
            java.lang.String r0 = "png"
            boolean r0 = J5.m.K0(r5, r0)     // Catch: java.lang.Exception -> L147
            if (r0 != r11) goto L157
            r0 = r11
            goto L158
        L157:
            r0 = 0
        L158:
            if (r0 == 0) goto L16f
        L15a:
            java.lang.String r0 = r9.getPath()     // Catch: java.lang.Exception -> L147
            java.lang.String r4 = "getPath(...)"
            kotlin.jvm.internal.m.d(r0, r4)     // Catch: java.lang.Exception -> L147
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L147
            R4.l0 r4 = new R4.l0     // Catch: java.lang.Exception -> L147
            r4.<init>()     // Catch: java.lang.Exception -> L147
            android.media.MediaScannerConnection.scanFile(r13, r0, r2, r4)     // Catch: java.lang.Exception -> L147
        L16f:
            r3.flush()     // Catch: java.lang.Exception -> L147
            r3.close()     // Catch: java.lang.Exception -> L147
            goto L183
        L176:
            java.lang.String r3 = "FAILED TO DOWNLOAD THE FILE!"
            r4 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r13, r3, r4)
            r3.show()
            r0.printStackTrace()
        L183:
            boolean r0 = r9.exists()
            java.lang.String r3 = ".provider"
            if (r0 == 0) goto L251
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r4 = "android.intent.action.VIEW"
            r0.setAction(r4)
            android.content.Context r4 = r13.getApplicationContext()
            java.lang.String r4 = r4.getPackageName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = r6.toString()
            android.net.Uri r4 = androidx.core.content.FileProvider.d(r13, r4, r9)
            android.webkit.MimeTypeMap r6 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r6 = r6.getMimeTypeFromExtension(r5)
            r0.setDataAndType(r4, r6)
            r0.addFlags(r11)
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r13, r11, r0, r4)
            java.lang.String r4 = "notification"
            java.lang.Object r4 = r13.getSystemService(r4)
            java.lang.String r6 = "null cannot be cast to non-null type android.app.NotificationManager"
            kotlin.jvm.internal.m.c(r4, r6)
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            r10 = 2131165443(0x7f070103, float:1.7945103E38)
            java.lang.String r12 = "File downloaded"
            java.lang.String r14 = "You have got something new!"
            if (r6 < r7) goto L20f
            C0.U.m()
            android.app.NotificationChannel r6 = C0.U.c()
            android.app.Notification$Builder r7 = new android.app.Notification$Builder
            android.app.Notification$Builder r7 = C0.U.b(r13)
            android.app.Notification$Builder r7 = r7.setContentText(r14)
            android.app.Notification$Builder r7 = r7.setContentTitle(r12)
            android.app.Notification$Builder r0 = r7.setContentIntent(r0)
            android.app.Notification$Builder r0 = C0.U.a(r0)
            android.app.Notification$Builder r0 = r0.setSmallIcon(r10)
            android.app.Notification r0 = r0.build()
            java.lang.String r7 = "build(...)"
            kotlin.jvm.internal.m.d(r0, r7)
            C0.U.o(r4, r6)
            r4.notify(r11, r0)
            goto L251
        L20f:
            k1.h r0 = new k1.h
            java.lang.String r6 = "MYCHANNEL"
            r0.<init>(r13, r6)
            android.app.Notification r6 = r0.f14080o
            r7 = -1
            r6.defaults = r7
            int r7 = r6.flags
            r7 = r7 | r11
            r6.flags = r7
            long r6 = java.lang.System.currentTimeMillis()
            android.app.Notification r15 = r0.f14080o
            r15.when = r6
            r15.icon = r10
            java.lang.CharSequence r6 = k1.h.b(r12)
            r0.f14073e = r6
            java.lang.CharSequence r6 = k1.h.b(r14)
            r0.f = r6
            android.app.Notification r0 = r0.a()
            r4.notify(r11, r0)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r0.<init>(r6)
            C0.m r6 = new C0.m
            r7 = 6
            r6.<init>(r7, r4)
            r14 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r6, r14)
        L251:
            R4.l3 r0 = r8.f7048H
            if (r0 == 0) goto L258
            java.lang.String r0 = r0.f7126p
            goto L259
        L258:
            r0 = r2
        L259:
            if (r0 == 0) goto L2d5
            android.content.Context r0 = r13.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            android.net.Uri r0 = androidx.core.content.FileProvider.d(r13, r0, r9)
            R4.l3 r3 = r8.f7048H
            if (r3 == 0) goto L27d
            java.lang.String r3 = r3.f7126p
            goto L27e
        L27d:
            r3 = r2
        L27e:
            kotlin.jvm.internal.m.b(r3)
            kotlin.jvm.internal.m.b(r0)
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> L297
            java.lang.String r6 = "android.intent.action.SEND"
            r4.<init>(r6)     // Catch: java.lang.Exception -> L297
            boolean r6 = J5.m.U0(r3)     // Catch: java.lang.Exception -> L297
            if (r6 != 0) goto L299
            java.lang.String r6 = "android.intent.extra.TEXT"
            r4.putExtra(r6, r3)     // Catch: java.lang.Exception -> L297
            goto L299
        L297:
            r0 = move-exception
            goto L2bb
        L299:
            java.lang.String r3 = "android.intent.extra.STREAM"
            r4.putExtra(r3, r0)     // Catch: java.lang.Exception -> L297
            if (r5 != 0) goto L2a2
        */
        //  java.lang.String r5 = "*/*"
        /*
        L2a2:
            java.lang.String r0 = D5.a.w(r5)     // Catch: java.lang.Exception -> L297
            r4.setType(r0)     // Catch: java.lang.Exception -> L297
            r4.addFlags(r11)     // Catch: java.lang.Exception -> L297
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r4.setFlags(r0)     // Catch: java.lang.Exception -> L297
            java.lang.String r0 = "Share File"
            android.content.Intent r0 = android.content.Intent.createChooser(r4, r0)     // Catch: java.lang.Exception -> L297
            r13.startActivity(r0)     // Catch: java.lang.Exception -> L297
            goto L2ce
        L2bb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "the error is "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r0)
        L2ce:
            R4.l3 r0 = r8.f7048H
            if (r0 == 0) goto L2df
            r0.f7126p = r2
            goto L2df
        L2d5:
            java.lang.String r0 = "FILE DOWNLOADED!"
            r4 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r4)
            r0.show()
        L2df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.l3.getBase64FromBlobData(java.lang.String):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void getCloudData(String str) {
        Log.e("NativeDataStoreLog", "getCloudData - " + str);
        if (str == null || str.equals("")) {
            return;
        }
        V v6 = this.f7114a.f7104z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void getDeviceInfo() {
        String installerPackageName;
        String networkOperatorName;
        String str;
        MainActivity mainActivity = this.f7114a.f7067a;
        HashMap map = new HashMap();
        String packageName = mainActivity.getPackageName();
        map.put("appId", packageName);
        map.put("platform", "android");
        map.put("language", Locale.getDefault().getLanguage());
        map.put("os", "Android");
        map.put("osVersion", Build.VERSION.RELEASE);
        map.put("model", Build.MANUFACTURER + " " + Build.MODEL);
        map.put("hardware", Build.FINGERPRINT);
        map.put("timeZone", TimeZone.getDefault().getID());
        PackageManager packageManager = mainActivity.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            map.put("appVersion", packageInfo.versionName);
            map.put("appVersionCode", Integer.valueOf(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("MainActivity", e7.getMessage(), e7);
        }
        if ((mainActivity.getApplicationInfo().flags & 2) != 0) {
            installerPackageName = "debug";
        } else {
            installerPackageName = packageManager.getInstallerPackageName(packageName);
            if (installerPackageName == null) {
                installerPackageName = "adhoc";
            } else if (installerPackageName.equals("com.google.market")) {
                installerPackageName = "playstore";
            }
        }
        map.put("installationType", installerPackageName);
        try {
            Object systemService = mainActivity.getSystemService("phone");
            kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        } catch (Error e8) {
            Log.e("MainActivity", "Could not fetch operator", e8);
            networkOperatorName = null;
        }
        if (networkOperatorName != null) {
            map.put("operator", networkOperatorName);
        }
        synchronized (V.f6867a) {
            try {
                if (V.f6868b == null) {
                    File file = new File(mainActivity.getFilesDir(), "INSTALLATION");
                    try {
                        if (!file.exists()) {
                            V.j(file);
                        }
                        V.f6868b = V.i(file);
                    } catch (Exception e9) {
                        throw new RuntimeException(e9);
                    }
                }
                str = V.f6868b;
            } catch (Throwable th) {
                throw th;
            }
        }
        map.put("installationId", str);
        JSONObject jSONObject = new JSONObject(map);
        try {
            jSONObject.put("reqType", "deviceInfo");
            jSONObject.put("isSuccess", true);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        a(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void getOneSignalId() {
        this.f7114a.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void getPermissionStatus() {
        if (this.j == null) {
            this.j = new V(this.f7114a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void getRegistrationToken() {
        this.f7122l.runOnUiThread(new j3(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void getText() throws JSONException {
        ClipData.Item itemAt;
        if (this.f == null) {
            C0468k1 c0468k1 = this.f7114a;
            if (c0468k1.f7048H != null) {
                Context applicationContext = this.f7121k.getApplicationContext();
                kotlin.jvm.internal.m.d(applicationContext, "getApplicationContext(...)");
                l3 l3Var = c0468k1.f7048H;
                kotlin.jvm.internal.m.b(l3Var);
                this.f = new B0.G0(applicationContext, l3Var);
            }
        }
        B0.G0 g02 = this.f;
        kotlin.jvm.internal.m.b(g02);
        ClipboardManager clipboardManager = (ClipboardManager) g02.f236t;
        if (clipboardManager.hasPrimaryClip()) {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            CharSequence text = (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) ? null : itemAt.getText();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "CLIPBOARD_CONTENT");
            jSONObject.put(FirebaseAnalytics.Param.VALUE, text);
            ((l3) g02.f235s).a(jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void hideFloatingButton() {
        P5.S s6 = this.f7114a.f7098t.f13876h;
        Boolean bool = Boolean.FALSE;
        s6.getClass();
        s6.h(null, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void hideLoader() {
        this.f7122l.runOnUiThread(new j3(this, 13));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void hideSplashScreen() {
        try {
            P5.S s6 = this.f7114a.f7098t.f13873d;
            Boolean bool = Boolean.TRUE;
            s6.getClass();
            s6.h(null, bool);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void initBeaconData(String str) {
        if (str != null) {
            V v6 = this.f7114a.f7087l0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void isLocationServiceEnabled() {
        JSONObject jSONObject = new JSONObject();
        boolean zU = l6.d.u(this.f7114a.f7071c);
        try {
            jSONObject.put("type", "isDeviceGPSEnabled");
            jSONObject.put(FirebaseAnalytics.Param.VALUE, zU);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        a(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void keepScreenNormal() {
        if (this.f7119g != null) {
            this.f7122l.runOnUiThread(new j3(this, 7));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void keepScreenOn() {
        MainActivity mainActivity = this.f7114a.f7067a;
        this.f7119g = new C0506u0(mainActivity);
        mainActivity.runOnUiThread(new j3(this, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void logFirebaseEvent(String str, String str2) {
        Bundle bundleG;
        FirebaseAnalytics firebaseAnalytics;
        k3.c cVar = this.f7114a.f7043C;
        if (cVar != null) {
            k3.d dVar = (k3.d) cVar.f14120q;
            dVar.getClass();
            try {
                bundleG = E3.h.G(str2);
            } catch (Exception e7) {
                Log.i("EXCEPTIONS", e7.toString());
                bundleG = null;
            }
            if (str == null || (firebaseAnalytics = (FirebaseAnalytics) dVar.f14122r) == null) {
                return;
            }
            firebaseAnalytics.logEvent(str, bundleG);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void logFirebaseScreenView(String str, String str2) {
        k3.c cVar = this.f7114a.f7043C;
        if (cVar != null) {
            k3.d dVar = (k3.d) cVar.f14120q;
            dVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, str);
            bundle.putString(FirebaseAnalytics.Param.SCREEN_CLASS, str2);
            FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) dVar.f14122r;
            if (firebaseAnalytics != null) {
                firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void login(String str) {
        OrufyConnectHandlerUtil orufyConnectHandlerUtil;
        G g7;
        C0458i c0458i = this.f7114a.f7073d;
        if (!((c0458i == null || (g7 = c0458i.f7007m) == null) ? false : kotlin.jvm.internal.m.a(g7.f6758a, Boolean.TRUE)) || (orufyConnectHandlerUtil = this.f7118e) == null) {
            return;
        }
        orufyConnectHandlerUtil.login(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void loginWithFacebook() {
        V v6 = this.f7114a.f7046F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void logout() {
        OrufyConnectHandlerUtil orufyConnectHandlerUtil;
        G g7;
        C0458i c0458i = this.f7114a.f7073d;
        if (!((c0458i == null || (g7 = c0458i.f7007m) == null) ? false : kotlin.jvm.internal.m.a(g7.f6758a, Boolean.TRUE)) || (orufyConnectHandlerUtil = this.f7118e) == null) {
            return;
        }
        orufyConnectHandlerUtil.logout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void logoutWithFacebook() {
        V v6 = this.f7114a.f7046F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void makeTapToPayStripePayment(String str) throws JSONException {
        P2 p22;
        C0468k1 c0468k1 = this.f7114a;
        C0458i c0458i = c0468k1.f7073d;
        if ((c0458i == null || (p22 = c0458i.f6981F) == null) ? false : kotlin.jvm.internal.m.a(p22.f6834a, Boolean.TRUE)) {
            if ((str == null || str.length() == 0) || c0468k1.f7059S.f13149a.getPackageManager().hasSystemFeature("android.hardware.nfc")) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "makeTapToPayStripePayment");
            jSONObject.put("failureReason", "NO_NFC_SUPPORT_ON_DEVICE");
            jSONObject.put("paymentStatus", "FAILED");
            a(jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void nfcSupported() throws JSONException {
        P2 p22;
        C0468k1 c0468k1 = this.f7114a;
        C0458i c0458i = c0468k1.f7073d;
        boolean z5 = false;
        if ((c0458i == null || (p22 = c0458i.f6981F) == null) ? false : kotlin.jvm.internal.m.a(p22.f6834a, Boolean.TRUE)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "nfcSupported");
            jSONObject.put("deviceSupportNfc", c0468k1.f7059S.f13149a.getPackageManager().hasSystemFeature("android.hardware.nfc"));
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(c0468k1.f7059S.f13149a);
            if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                z5 = true;
            }
            jSONObject.put("nfcEnabledOnDevice", z5);
            a(jSONObject);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void openAppSettingForPermission(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            g5.h hVar = this.f7114a.f7059S;
            hVar.f13167v = "openAppSettingForPermission";
            hVar.d(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void openShareIntent(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.f7122l.startActivity(Intent.createChooser(intent, "Share"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void openUrlInBrowser(String str) {
        this.f7122l.runOnUiThread(new i3(str, this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void openVoiceSearch() {
        String string;
        int i;
        U u6 = new U();
        u6.f6862a = this.f7122l;
        JSONArray jSONArray = new JSONArray();
        String string2 = Locale.getDefault().toString();
        try {
            if (jSONArray.length() > 0) {
                String string3 = jSONArray.getString(0);
                kotlin.jvm.internal.m.b(string3);
                i = Integer.parseInt(string3);
            } else {
                i = 1;
            }
            try {
                if (jSONArray.length() > 1) {
                    string = jSONArray.getString(1);
                    kotlin.jvm.internal.m.d(string, "getString(...)");
                } else {
                    string = "";
                }
                try {
                    if (jSONArray.length() > 2) {
                        string2 = jSONArray.getString(2);
                    }
                } catch (Exception e7) {
                    e = e7;
                    Log.e("U", String.format("startSpeechRecognitionActivity exception: %s", Arrays.copyOf(new Object[]{e.toString()}, 1)));
                }
            } catch (Exception e8) {
                e = e8;
                string = "";
            }
        } catch (Exception e9) {
            e = e9;
            string = "";
            i = 1;
        }
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", 1000);
        intent.putExtra("android.speech.extra.LANGUAGE", string2);
        if (i > 0) {
            intent.putExtra("android.speech.extra.MAX_RESULTS", i);
        }
        if (!string.equals("")) {
            intent.putExtra("android.speech.extra.PROMPT", string);
        }
        MainActivity mainActivity = u6.f6862a;
        kotlin.jvm.internal.m.b(mainActivity);
        mainActivity.startActivityForResult(intent, 102);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void optInOneSignalPermissionDialog() {
        this.f7114a.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void optOutOneSignalPermissionDialog() {
        this.f7114a.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void pairWithDevice(String str) {
        V v6 = this.f7114a.f7082i0;
        if (v6 == null || str == null) {
            return;
        }
        kotlin.jvm.internal.m.b(v6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void pickDateTime(String str) {
        if (this.f7115b == null) {
            this.f7115b = new U(this.f7122l);
        }
        final U u6 = this.f7115b;
        kotlin.jvm.internal.m.b(u6);
        MainActivity mainActivity = u6.f6862a;
        final J5.i iVar = new J5.i(2, this);
        if (str == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean z5 = jSONObject.has("showDate") ? jSONObject.getBoolean("showDate") : true;
        boolean z6 = jSONObject.has("showTime") ? jSONObject.getBoolean("showTime") : false;
        if (z5 && z6) {
            final Calendar calendar = Calendar.getInstance();
            new DatePickerDialog(mainActivity, R.style.DatePickerStyle, new DatePickerDialog.OnDateSetListener() { // from class: R4.Q
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, final int i, final int i7, final int i8) {
                    final Calendar calendar2 = calendar;
                    calendar2.set(1, i);
                    calendar2.set(2, i7);
                    calendar2.set(5, i8);
                    int i9 = calendar2.get(11);
                    int i10 = calendar2.get(12);
                    MainActivity mainActivity2 = u6.f6862a;
                    final J5.i iVar2 = iVar;
                    new TimePickerDialog(mainActivity2, R.style.DatePickerStyle, new TimePickerDialog.OnTimeSetListener() { // from class: R4.T
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.app.TimePickerDialog.OnTimeSetListener
                        public final void onTimeSet(TimePicker timePicker, int i11, int i12) throws JSONException {
                            Calendar calendar3 = calendar2;
                            calendar3.set(11, i11);
                            calendar3.set(12, i12);
                            System.out.println(calendar3.getTime());
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(FirebaseAnalytics.Param.SUCCESS, true);
                            jSONObject2.put("type", "DATE_TIME_PICKER");
                            jSONObject2.put("date", i + "-" + i7 + "-" + i8);
                            StringBuilder sb = new StringBuilder();
                            sb.append(i11);
                            sb.append(":");
                            sb.append(i12);
                            jSONObject2.put("time", sb.toString());
                            jSONObject2.put("timestamp", String.valueOf(calendar3.getTimeInMillis()));
                            iVar2.invoke(jSONObject2);
                        }
                    }, i9, i10, false).show();
                }
            }, calendar.get(1), calendar.get(2), calendar.get(5)).show();
        } else if (z5) {
            final Calendar calendar2 = Calendar.getInstance();
            new DatePickerDialog(mainActivity, R.style.DatePickerStyle, new DatePickerDialog.OnDateSetListener() { // from class: R4.P
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i7, int i8) throws JSONException {
                    Calendar calendar3 = calendar2;
                    calendar3.set(1, i);
                    calendar3.set(2, i7);
                    calendar3.set(5, i8);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(FirebaseAnalytics.Param.SUCCESS, true);
                    jSONObject2.put("type", "DATE_TIME_PICKER");
                    jSONObject2.put("date", i + "-" + i7 + "-" + i8);
                    jSONObject2.put("timestamp", String.valueOf(calendar3.getTimeInMillis()));
                    iVar.invoke(jSONObject2);
                }
            }, calendar2.get(1), calendar2.get(2), calendar2.get(5)).show();
        } else {
            final Calendar calendar3 = Calendar.getInstance();
            new TimePickerDialog(mainActivity, R.style.DatePickerStyle, new TimePickerDialog.OnTimeSetListener() { // from class: R4.S
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i, int i7) throws JSONException {
                    Calendar calendar4 = calendar3;
                    calendar4.set(11, i);
                    calendar4.set(12, i7);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(FirebaseAnalytics.Param.SUCCESS, true);
                    jSONObject2.put("type", "DATE_TIME_PICKER");
                    jSONObject2.put("time", i + ":" + i7);
                    jSONObject2.put("timestamp", String.valueOf(calendar4.getTimeInMillis()));
                    iVar.invoke(jSONObject2);
                }
            }, calendar3.get(11), calendar3.get(12), false).show();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void print(String str) throws JSONException {
        JSONObject jSONObject;
        if (this.f7116c == null) {
            this.f7116c = new C0506u0(this.f7122l);
        }
        if (str != null) {
            C0506u0 c0506u0 = this.f7116c;
            kotlin.jvm.internal.m.b(c0506u0);
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception e7) {
                e7.printStackTrace();
                jSONObject = null;
            }
            if (jSONObject != null) {
                String string = jSONObject.getString("type");
                String string2 = jSONObject.getString("url");
                if (string == null || string2 == null) {
                    return;
                }
                c0506u0.f7194a.runOnUiThread(new E1.n(c0506u0, string, string2, 1));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void registerNotification() {
        C0468k1 c0468k1 = this.f7114a;
        g5.h hVar = c0468k1.f7059S;
        hVar.f13167v = "registerNotification";
        int i = MainActivity.f11777U;
        if (hVar.f == null) {
            hVar.f = new HashMap();
        }
        HashMap map = c0468k1.f7059S.f;
        if (map != null) {
        }
        HashMap map2 = c0468k1.f7059S.f;
        if (map2 != null) {
        }
        c0468k1.f7059S.f("notification", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void reload() {
        WebView webView = this.f7114a.f7084k;
        kotlin.jvm.internal.m.b(webView);
        webView.post(new j3(this, 12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void removeExternalUserId() {
        this.f7114a.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void removeFullScreenMode() {
        this.f7122l.runOnUiThread(new j3(this, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void requestNotificationPermission() {
        this.f7122l.runOnUiThread(new j3(this, 9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void returnSMSValue(String value) {
        kotlin.jvm.internal.m.e(value, "value");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void saveSecret(String str) {
        c();
        new Handler(Looper.getMainLooper()).post(new j3(this, str, 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void sendBarcodeValue(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "BARCODE_SCAN");
            jSONObject.put(FirebaseAnalytics.Param.VALUE, str);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        a(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setAppData(String str) {
        Log.e("NativeDataStoreLog", "setAppData - " + str);
        if (str == null || str.equals("")) {
            return;
        }
        V v6 = this.f7114a.f7104z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setAppsFlyerUserId(String str) {
        V v6 = this.f7114a.f7042B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setCloudData(String str) {
        Log.e("NativeDataStoreLog", "setCloudData - " + str);
        if (str == null || str.equals("")) {
            return;
        }
        V v6 = this.f7114a.f7104z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setExternalUserId(String str) {
        this.f7114a.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setFirebaseAnalyticsCollection(String str) {
        k3.c cVar = this.f7114a.f7043C;
        if (cVar != null) {
            k3.d dVar = (k3.d) cVar.f14120q;
            dVar.getClass();
            System.out.println((Object) ("Value : " + str));
            boolean zB0 = J5.t.B0(str, "true", true);
            FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) dVar.f14122r;
            if (firebaseAnalytics != null) {
                firebaseAnalytics.setAnalyticsCollectionEnabled(zB0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setFirebaseDefaultParam(String str) {
        Bundle bundleG;
        k3.c cVar = this.f7114a.f7043C;
        if (cVar != null) {
            k3.d dVar = (k3.d) cVar.f14120q;
            dVar.getClass();
            try {
                bundleG = E3.h.G(str);
            } catch (Exception e7) {
                Log.i("EXCEPTIONS", e7.toString());
                bundleG = null;
            }
            FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) dVar.f14122r;
            if (firebaseAnalytics != null) {
                firebaseAnalytics.setDefaultEventParameters(bundleG);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setFirebaseUserId(String str) {
        FirebaseAnalytics firebaseAnalytics;
        k3.c cVar = this.f7114a.f7043C;
        if (cVar == null || (firebaseAnalytics = (FirebaseAnalytics) ((k3.d) cVar.f14120q).f14122r) == null) {
            return;
        }
        firebaseAnalytics.setUserId(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setFirebaseUserProp(String str, String str2) {
        k3.c cVar = this.f7114a.f7043C;
        if (cVar != null) {
            k3.d dVar = (k3.d) cVar.f14120q;
            if (str == null) {
                dVar.getClass();
                return;
            }
            FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) dVar.f14122r;
            if (firebaseAnalytics != null) {
                firebaseAnalytics.setUserProperty(str, str2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setFullScreenMode() {
        this.f7122l.runOnUiThread(new j3(this, 11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setOrientation(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.has("orientation") ? jSONObject.getString("orientation") : null;
                Boolean boolValueOf = jSONObject.has("forceOrientation") ? Boolean.valueOf(jSONObject.getBoolean("forceOrientation")) : null;
                if (string != null) {
                    String lowerCase = string.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    boolean zEquals = lowerCase.equals("portrait");
                    C0468k1 c0468k1 = this.f7114a;
                    if (zEquals) {
                        c0468k1.f7067a.setRequestedOrientation(1);
                    } else if (lowerCase.equals("landscape")) {
                        c0468k1.f7067a.setRequestedOrientation(0);
                    }
                    if (boolValueOf == null || boolValueOf.booleanValue()) {
                        return;
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new j3(this, 4), 1000L);
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setPrintSize(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = "custom";
                String string2 = jSONObject.has("printSize") ? jSONObject.getString("printSize") : null;
                if (jSONObject.has("label")) {
                    string = jSONObject.getString("label");
                    kotlin.jvm.internal.m.d(string, "getString(...)");
                }
                if (string2 != null && string2.length() != 0) {
                    SharedPreferences.Editor editorEdit = this.f7114a.f7067a.getPreferences(0).edit();
                    editorEdit.putString("printId", "customPrintSize");
                    editorEdit.putString("printLabel", string);
                    editorEdit.putString("printSize", string2);
                    editorEdit.apply();
                }
            } catch (JSONException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setText(String str) {
        if (this.f == null) {
            C0468k1 c0468k1 = this.f7114a;
            if (c0468k1.f7048H != null) {
                Context applicationContext = this.f7121k.getApplicationContext();
                kotlin.jvm.internal.m.d(applicationContext, "getApplicationContext(...)");
                l3 l3Var = c0468k1.f7048H;
                kotlin.jvm.internal.m.b(l3Var);
                this.f = new B0.G0(applicationContext, l3Var);
            }
        }
        B0.G0 g02 = this.f;
        kotlin.jvm.internal.m.b(g02);
        kotlin.jvm.internal.m.b(str);
        ClipData clipDataNewPlainText = ClipData.newPlainText("", str);
        kotlin.jvm.internal.m.d(clipDataNewPlainText, "newPlainText(...)");
        ((ClipboardManager) g02.f236t).setPrimaryClip(clipDataNewPlainText);
        if (Build.VERSION.SDK_INT <= 31) {
            Toast.makeText((Context) g02.f234r, "copied", 0).show();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setUser(String str) {
        OrufyConnectHandlerUtil orufyConnectHandlerUtil;
        G g7;
        C0458i c0458i = this.f7114a.f7073d;
        if (!((c0458i == null || (g7 = c0458i.f7007m) == null) ? false : kotlin.jvm.internal.m.a(g7.f6758a, Boolean.TRUE)) || (orufyConnectHandlerUtil = this.f7118e) == null) {
            return;
        }
        orufyConnectHandlerUtil.setUser(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void setUserTags(String str) {
        this.f7114a.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void share(String str) {
        this.f7122l.runOnUiThread(new i3(str, this, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void shareFile(String str, String str2) {
        if (str != null) {
            try {
                this.f7122l.runOnUiThread(new E1.n(str, this, str2, 3));
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void showBannerAd(String str) {
        V v6 = this.f7114a.f7045E;
        if (v6 != null) {
            kotlin.jvm.internal.m.b(v6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void showFloatingButton() {
        P5.S s6 = this.f7114a.f7098t.f13876h;
        Boolean bool = Boolean.TRUE;
        s6.getClass();
        s6.h(null, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void showFullScreenAd(String str) {
        V v6 = this.f7114a.f7045E;
        if (v6 != null) {
            kotlin.jvm.internal.m.b(v6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void showHideStickyFooter(boolean z5) {
        Log.e("Asdfasdf", String.valueOf(z5));
        C0468k1 c0468k1 = this.f7114a;
        c0468k1.f7103y = z5;
        if (c0468k1.f7101w != null) {
            this.f7122l.runOnUiThread(new k3(z5, this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void showInAppReview() {
        S3.k kVar;
        String str;
        C0468k1 dataObjects = this.f7114a;
        kotlin.jvm.internal.m.e(dataObjects, "dataObjects");
        String str2 = this.f7125o;
        SharedPreferences sharedPreferences = this.f7127q;
        MainActivity mainActivity = dataObjects.f7071c;
        B0.G0 g02 = new B0.G0(mainActivity, dataObjects.f7067a, str2, sharedPreferences);
        Context applicationContext = mainActivity.getApplicationContext();
        if (applicationContext != null) {
            mainActivity = applicationContext;
        }
        D4.f fVar = new D4.f(mainActivity);
        C0050o c0050o = new C0050o();
        c0050o.f500r = new Handler(Looper.getMainLooper());
        c0050o.f499q = fVar;
        D4.f fVar2 = (D4.f) c0050o.f499q;
        E4.f fVar3 = D4.f.f1463c;
        fVar3.a("requestInAppReview (%s)", fVar2.f1465b);
        if (fVar2.f1464a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", E4.f.b(fVar3.f1730b, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap map = F4.a.f1952a;
            if (map.containsKey(-1)) {
                str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) F4.a.f1953b.get(-1)) + ")";
            } else {
                str = "";
            }
            A4.a aVar = new A4.a(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null));
            kVar = new S3.k();
            kVar.f(aVar);
        } else {
            S3.e eVar = new S3.e();
            E4.k kVar2 = fVar2.f1464a;
            D4.d dVar = new D4.d(fVar2, eVar, eVar, 0);
            synchronized (kVar2.f) {
                kVar2.f1743e.add(eVar);
                eVar.f7306a.e(new C0050o(kVar2, eVar));
            }
            synchronized (kVar2.f) {
                try {
                    if (kVar2.f1746k.getAndIncrement() > 0) {
                        E4.f fVar4 = kVar2.f1740b;
                        Object[] objArr2 = new Object[0];
                        fVar4.getClass();
                        if (Log.isLoggable("PlayCore", 3)) {
                            Log.d("PlayCore", E4.f.b(fVar4.f1730b, "Already connected to the service.", objArr2));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            kVar2.a().post(new D4.d(kVar2, eVar, dVar, 1));
            kVar = eVar.f7306a;
        }
        kotlin.jvm.internal.m.d(kVar, "requestReviewFlow(...)");
        kVar.f7317b.e(new S3.h((Executor) S3.f.f7307a, (S3.b) new C0.Z0(16)));
        kVar.i();
        kVar.e(new U4.E(c0050o, g02));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void showOfferCard(String str) {
        C0050o c0050o;
        Z4.M m4;
        C0468k1 c0468k1 = this.f7114a;
        C0458i c0458i = c0468k1.f7073d;
        if (c0458i != null) {
            kotlin.jvm.internal.m.b(c0458i);
            if (c0458i.f7009o != null) {
                C0458i c0458i2 = c0468k1.f7073d;
                kotlin.jvm.internal.m.b(c0458i2);
                L1 l12 = c0458i2.f7009o;
                kotlin.jvm.internal.m.b(l12);
                if (l12.f6791a != null) {
                    C0458i c0458i3 = c0468k1.f7073d;
                    kotlin.jvm.internal.m.b(c0458i3);
                    L1 l13 = c0458i3.f7009o;
                    kotlin.jvm.internal.m.b(l13);
                    Boolean bool = l13.f6791a;
                    kotlin.jvm.internal.m.b(bool);
                    if (!bool.booleanValue() || str == null || (c0050o = c0468k1.f7050J) == null || J5.m.U0(str) || (m4 = (Z4.M) c0050o.f500r) == null) {
                        return;
                    }
                    m4.d(str);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void showPermission(String str) {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = null;
            String string = jSONObject.has("permission") ? jSONObject.getString("permission") : null;
            C0468k1 c0468k1 = this.f7114a;
            c0468k1.f7059S.f13166u = jSONObject.has("openAppSetting") ? jSONObject.getBoolean("openAppSetting") : false;
            g5.h hVar = c0468k1.f7059S;
            if (hVar.f13166u && jSONObject.has("alertDialogStyle")) {
                jSONObject2 = new JSONObject(jSONObject.getString("alertDialogStyle"));
            }
            hVar.f13168w = jSONObject2;
            g5.h hVar2 = c0468k1.f7059S;
            hVar2.f13167v = "showPermission";
            hVar2.f(string, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void showRewardsAd(String str) {
        V v6 = this.f7114a.f7045E;
        if (v6 != null) {
            kotlin.jvm.internal.m.b(v6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void signInWithGoogle() {
        P0 p02;
        C0458i c0458i = this.f7114a.f7073d;
        if (((c0458i == null || (p02 = c0458i.f6989N) == null) ? null : p02.f6828a) == null) {
            return;
        }
        try {
            if (V.f6870d == null) {
                V.f6870d = new V();
            }
            kotlin.jvm.internal.m.b(V.f6870d);
        } catch (NullPointerException e7) {
            e7.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void signOutWithGoogle() {
        P0 p02;
        C0458i c0458i = this.f7114a.f7073d;
        if (((c0458i == null || (p02 = c0458i.f6989N) == null) ? null : p02.f6828a) == null) {
            return;
        }
        try {
            if (V.f6870d == null) {
                V.f6870d = new V();
            }
            kotlin.jvm.internal.m.b(V.f6870d);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void startBackgroundService() {
        stopBackgroundService();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void startBluetoothScan() {
        V v6 = this.f7114a.f7082i0;
        if (v6 != null) {
            kotlin.jvm.internal.m.b(v6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void statusBar(String values) {
        kotlin.jvm.internal.m.e(values, "values");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void subscribeToTopic(String str) {
        this.f7122l.runOnUiThread(new j3(this, str, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void systemNavBarColorFun(String str) {
        String string;
        if (str == null) {
            return;
        }
        try {
            string = new JSONObject(str).getString("colour");
        } catch (Exception unused) {
            string = null;
        }
        if (string == null || string.equals("")) {
            return;
        }
        MainActivity mainActivity = this.f7122l;
        mainActivity.runOnUiThread(new N5.c(1, mainActivity, string));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void unpairDevice(String str) {
        V v6 = this.f7114a.f7082i0;
        if (v6 == null || str == null) {
            return;
        }
        kotlin.jvm.internal.m.b(v6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void unsubscribeFromTopic(String str) {
        this.f7122l.runOnUiThread(new j3(this, str, 14));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void updateAppIcon(String str) {
        V v6 = this.f7114a.f7083j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void updateApplication(String str) {
        String lowerCase;
        C0050o c0050o = this.f7114a.f7049I;
        if (c0050o != null) {
            Y4.d dVar = (Y4.d) c0050o.f500r;
            dVar.getClass();
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            dVar.j = y4.m.a(kotlin.jvm.internal.m.a(lowerCase, "immediate") ? 1 : 0).a();
            try {
                S3.k kVarB = dVar.f8278g.b();
                L0 l02 = new L0(8, new Y4.b(dVar, 3));
                kVarB.getClass();
                kVarB.a(S3.f.f7307a, l02);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void webShareWrapper(String str) {
        Q2.g.M(this.f7122l, str);
    }

    @JavascriptInterface
    public final void getPlayerStatus() {
    }

    @JavascriptInterface
    public final void getTriggers() {
    }

    @JavascriptInterface
    public final void pausePlaying() {
    }

    @JavascriptInterface
    public final void playNext() {
    }

    @JavascriptInterface
    public final void playPrevious() {
    }

    @JavascriptInterface
    public final void registerForSMS() {
    }

    @JavascriptInterface
    public final void stopBackgroundService() {
    }

    @JavascriptInterface
    public final void stopPlaying() {
    }

    @JavascriptInterface
    public final void stopTrackingLocation() {
    }

    @JavascriptInterface
    public final void addToPlayList(String str) {
    }

    @JavascriptInterface
    public final void addTrigger(String str) {
    }

    @JavascriptInterface
    public final void addTriggers(String str) {
    }

    @JavascriptInterface
    public final void checkPackageName(String str) {
    }

    @JavascriptInterface
    public final void getAllPurchases(String str) {
    }

    @JavascriptInterface
    public final void getTriggerValueForKey(String str) {
    }

    @JavascriptInterface
    public final void inAppPurchase(String str) {
    }

    @JavascriptInterface
    public final void logoutEmail(String str) {
    }

    @JavascriptInterface
    public final void logoutSMSNumber(String str) {
    }

    @JavascriptInterface
    public final void playMedia(String str) {
    }

    @JavascriptInterface
    public final void removeTriggerForKey(String str) {
    }

    @JavascriptInterface
    public final void removeTriggersForKeys(String str) {
    }

    @JavascriptInterface
    public final void seekTo(String str) {
    }

    @JavascriptInterface
    public final void setEmail(String str) {
    }

    @JavascriptInterface
    public final void setSMSNumber(String str) {
    }

    @JavascriptInterface
    public final void startScanner(String str) {
    }

    @JavascriptInterface
    public final void startTrackingLocation(String str) {
    }
}
