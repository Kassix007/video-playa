package Z2;

import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.m;
import n5.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8411a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(WebView webView) {
        webView.addJavascriptInterface(this, "RequestInspection");
        this.f8411a = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        m.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            m.b(next);
            Locale locale = Locale.getDefault();
            m.d(locale, "getDefault(...)");
            String lowerCase = next.toLowerCase(locale);
            m.d(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, jSONObject.getString(next));
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(String str, boolean z5) {
        return (str.equals("radio") || str.equals("checkbox")) && !z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void recordFetch(String url, String method, String body, String headers, String trace) {
        m.e(url, "url");
        m.e(method, "method");
        m.e(body, "body");
        m.e(headers, "headers");
        m.e(trace, "trace");
        Log.i("RequestInspectorJs", "Recorded fetch from JavaScript");
        a aVar = new a(f.f8424q, url, method, body, t.f15300q, a(headers), trace, null);
        synchronized (this.f8411a) {
            this.f8411a.add(aVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void recordFormSubmission(String url, String method, String formParameterList, String headers, String trace, String str) throws JSONException, UnsupportedEncodingException {
        HashMap map;
        String str2;
        String str3;
        String string;
        String str4 = "RequestInspectorJs";
        String str5 = "toString(...)";
        m.e(url, "url");
        m.e(method, "method");
        m.e(formParameterList, "formParameterList");
        m.e(headers, "headers");
        m.e(trace, "trace");
        JSONArray jSONArray = new JSONArray(formParameterList);
        HashMap mapA = a(headers);
        HashMap map2 = new HashMap();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i7 = length;
            Object obj = jSONArray.get(i);
            m.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            int i8 = i;
            String string2 = jSONObject.getString("name");
            String str6 = str4;
            String strOptString = jSONObject.optString(FirebaseAnalytics.Param.VALUE);
            String str7 = str5;
            boolean zOptBoolean = jSONObject.optBoolean("checked");
            String strOptString2 = jSONObject.optString("type");
            m.b(strOptString2);
            if (!b(strOptString2, zOptBoolean)) {
                map2.put(string2, strOptString);
            }
            i = i8 + 1;
            length = i7;
            str4 = str6;
            str5 = str7;
        }
        String str8 = str4;
        String str9 = str5;
        if (str == null) {
            map = mapA;
            str2 = str8;
            Log.e(str2, "Incorrect encoding received from JavaScript: " + str);
            str3 = "";
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode == -1485569826) {
                if (str.equals("application/x-www-form-urlencoded")) {
                    mapA.put("content-type", str);
                    StringBuilder sb = new StringBuilder();
                    int length2 = jSONArray.length();
                    int i9 = 0;
                    while (i9 < length2) {
                        Object obj2 = jSONArray.get(i9);
                        m.c(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject2 = (JSONObject) obj2;
                        String string3 = jSONObject2.getString("name");
                        HashMap map3 = mapA;
                        String strOptString3 = jSONObject2.optString(FirebaseAnalytics.Param.VALUE);
                        int i10 = length2;
                        boolean zOptBoolean2 = jSONObject2.optBoolean("checked");
                        String strOptString4 = jSONObject2.optString("type");
                        int i11 = i9;
                        String strEncode = URLEncoder.encode(strOptString3, "UTF-8");
                        m.b(strOptString4);
                        if (!b(strOptString4, zOptBoolean2)) {
                            if (i11 != 0) {
                                sb.append("&");
                            }
                            sb.append(string3);
                            sb.append("=");
                            sb.append(strEncode);
                        }
                        i9 = i11 + 1;
                        mapA = map3;
                        length2 = i10;
                    }
                    map = mapA;
                    string = sb.toString();
                    m.d(string, str9);
                    str3 = string;
                    str2 = str8;
                }
                map = mapA;
                str2 = str8;
                Log.e(str2, "Incorrect encoding received from JavaScript: " + str);
                str3 = "";
            } else if (iHashCode != -655019664) {
                if (iHashCode == 817335912 && str.equals("text/plain")) {
                    mapA.put("content-type", str);
                    StringBuilder sb2 = new StringBuilder();
                    int length3 = jSONArray.length();
                    int i12 = 0;
                    while (i12 < length3) {
                        Object obj3 = jSONArray.get(i12);
                        m.c(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject3 = (JSONObject) obj3;
                        String string4 = jSONObject3.getString("name");
                        int i13 = length3;
                        String strOptString5 = jSONObject3.optString(FirebaseAnalytics.Param.VALUE);
                        int i14 = i12;
                        boolean zOptBoolean3 = jSONObject3.optBoolean("checked");
                        String strOptString6 = jSONObject3.optString("type");
                        m.b(strOptString6);
                        if (!b(strOptString6, zOptBoolean3)) {
                            if (i14 != 0) {
                                sb2.append("\n");
                            }
                            sb2.append(string4);
                            sb2.append("=");
                            sb2.append(strOptString5);
                        }
                        i12 = i14 + 1;
                        length3 = i13;
                    }
                    string = sb2.toString();
                    m.d(string, str9);
                    map = mapA;
                    str3 = string;
                    str2 = str8;
                }
                map = mapA;
                str2 = str8;
                Log.e(str2, "Incorrect encoding received from JavaScript: " + str);
                str3 = "";
            } else {
                if (str.equals("multipart/form-data")) {
                    mapA.put("content-type", "multipart/form-data; boundary=----WebKitFormBoundaryU7CgQs9WnqlZYKs6");
                    StringBuilder sb3 = new StringBuilder();
                    int length4 = jSONArray.length();
                    int i15 = 0;
                    while (i15 < length4) {
                        Object obj4 = jSONArray.get(i15);
                        m.c(obj4, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject4 = (JSONObject) obj4;
                        String string5 = jSONObject4.getString("name");
                        int i16 = length4;
                        String strOptString7 = jSONObject4.optString(FirebaseAnalytics.Param.VALUE);
                        int i17 = i15;
                        boolean zOptBoolean4 = jSONObject4.optBoolean("checked");
                        String strOptString8 = jSONObject4.optString("type");
                        m.b(strOptString8);
                        if (!b(strOptString8, zOptBoolean4)) {
                            sb3.append("------WebKitFormBoundaryU7CgQs9WnqlZYKs6\n");
                            sb3.append("Content-Disposition: form-data; name=\"" + string5 + "\"");
                            sb3.append("\n\n");
                            sb3.append(strOptString7);
                            sb3.append("\n");
                        }
                        i15 = i17 + 1;
                        length4 = i16;
                    }
                    sb3.append("------WebKitFormBoundaryU7CgQs9WnqlZYKs6--");
                    string = sb3.toString();
                    m.d(string, str9);
                    map = mapA;
                    str3 = string;
                    str2 = str8;
                }
                map = mapA;
                str2 = str8;
                Log.e(str2, "Incorrect encoding received from JavaScript: " + str);
                str3 = "";
            }
        }
        Log.i(str2, "Recorded form submission from JavaScript");
        a aVar = new a(f.f8426s, url, method, str3, map2, map, trace, str);
        synchronized (this.f8411a) {
            this.f8411a.add(aVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public final void recordXhr(String url, String method, String body, String headers, String trace) {
        m.e(url, "url");
        m.e(method, "method");
        m.e(body, "body");
        m.e(headers, "headers");
        m.e(trace, "trace");
        Log.i("RequestInspectorJs", "Recorded XHR from JavaScript");
        a aVar = new a(f.f8425r, url, method, body, t.f15300q, a(headers), trace, null);
        synchronized (this.f8411a) {
            this.f8411a.add(aVar);
        }
    }
}
