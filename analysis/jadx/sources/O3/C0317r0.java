package O3;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: O3.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0317r0 implements InterfaceC0277d1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0323t0 f5036q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [O3.P0.a():void, O3.b1.<init>(O3.t0):void] */
    public /* synthetic */ C0317r0(C0323t0 c0323t0) {
        this.f5036q = c0323t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(String str, Bundle bundle) {
        String string;
        C0323t0 c0323t0 = this.f5036q;
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0288h0 c0288h0 = c0323t0.f5076u;
        C0323t0.l(c0312p0);
        c0312p0.o();
        if (c0323t0.a()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        C0323t0.j(c0288h0);
        c0288h0.f4890N.f(string);
        C0282f0 c0282f0 = c0288h0.f4891O;
        c0323t0.f5052A.getClass();
        c0282f0.b(System.currentTimeMillis());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0277d1
    public void b(int i, Throwable th, byte[] bArr) {
        int i7;
        X x6;
        X x7;
        C0323t0 c0323t0 = this.f5036q;
        X x8 = c0323t0.f5077v;
        if (i != 200 && i != 204) {
            i7 = 304;
            if (i != 304) {
                i7 = i;
            }
            C0323t0.l(x8);
            x8.f4673z.d(Integer.valueOf(i7), th, "Network Request for Deferred Deep Link failed. response, exception");
        }
        i7 = i;
        if (th == null) {
            C0288h0 c0288h0 = c0323t0.f5076u;
            C0323t0.j(c0288h0);
            c0288h0.f4887K.e(true);
            if (bArr == null || bArr.length == 0) {
                C0323t0.l(x8);
                x8.f4665D.b("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    C0323t0.l(x8);
                    x8.f4665D.b("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                Y1 y12 = c0323t0.f5080y;
                C0323t0.j(y12);
                C0323t0 c0323t02 = (C0323t0) y12.f4346r;
                if (TextUtils.isEmpty(strOptString)) {
                    x7 = x8;
                } else {
                    Context context = c0323t02.f5072q;
                    x7 = x8;
                    try {
                        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(strOptString3)) {
                                bundle.putString("gbraid", strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                bundle.putString("gad_source", strOptString4);
                            }
                            bundle.putString("gclid", strOptString2);
                            bundle.putString("_cis", "ddp");
                            c0323t0.f5054C.v("auto", "_cmp", bundle);
                            if (TextUtils.isEmpty(strOptString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                editorEdit.putString("deeplink", strOptString);
                                editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                if (editorEdit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = c0323t02.f5072q;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    } else {
                                        context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e7) {
                                X x9 = ((C0323t0) y12.f4346r).f5077v;
                                C0323t0.l(x9);
                                x9.f4670w.c(e7, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e8) {
                        e = e8;
                        x6 = x7;
                        C0323t0.l(x6);
                        x6.f4670w.c(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                C0323t0.l(x7);
                x6 = x7;
                try {
                    x6.f4673z.e("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                } catch (JSONException e9) {
                    e = e9;
                    C0323t0.l(x6);
                    x6.f4670w.c(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e10) {
                e = e10;
                x6 = x8;
            }
        }
        C0323t0.l(x8);
        x8.f4673z.d(Integer.valueOf(i7), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean c() {
        if (!d()) {
            return false;
        }
        C0323t0 c0323t0 = this.f5036q;
        c0323t0.f5052A.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0288h0 c0288h0 = c0323t0.f5076u;
        C0323t0.j(c0288h0);
        return jCurrentTimeMillis - c0288h0.f4891O.a() > c0323t0.f5075t.v(null, F.f4437j0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean d() {
        C0288h0 c0288h0 = this.f5036q.f5076u;
        C0323t0.j(c0288h0);
        return c0288h0.f4891O.a() > 0;
    }
}
