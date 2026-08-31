package com.web2native;

import R4.C0468k1;
import android.content.Intent;
import android.webkit.WebView;
import com.web2native.NotificationDisableBroadcastReceiver;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a implements NotificationDisableBroadcastReceiver.NotificationBroadcastReceiverListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f11782a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(MainActivity mainActivity) {
        this.f11782a = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.web2native.NotificationDisableBroadcastReceiver.NotificationBroadcastReceiverListener
    public final void onSuccess(Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("notification_data") : null;
        if (stringExtra != null) {
            String strQuote = JSONObject.quote(stringExtra);
            C0468k1 c0468k1 = this.f11782a.f11778Q;
            if (c0468k1 == null) {
                m.k("dataObject");
                throw null;
            }
            WebView webView = c0468k1.f7084k;
            if (webView != null) {
                webView.evaluateJavascript("window.wtnGetForegroundNotificationData(" + strQuote + ")", null);
            }
        }
    }
}
