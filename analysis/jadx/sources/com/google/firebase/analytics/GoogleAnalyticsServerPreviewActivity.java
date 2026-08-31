package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0779c0;
import com.google.android.gms.internal.measurement.C0863t0;

/* JADX INFO: loaded from: classes.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0863t0 c0863t0E = C0863t0.e(this, null);
        Intent intent = getIntent();
        c0863t0E.getClass();
        c0863t0E.c(new C0779c0(c0863t0E, intent, 3));
        finish();
    }
}
