package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ResultReceiver f11718q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i7, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i, i7, intent);
        if (i == 0 && (resultReceiver = this.f11718q) != null) {
            if (i7 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i7 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        PlayCoreDialogWrapperActivity playCoreDialogWrapperActivity;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f11718q = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f11718q = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            ResultReceiver resultReceiver = this.f11718q;
            if (resultReceiver != null) {
                resultReceiver.send(3, new Bundle());
            }
            finish();
            return;
        }
        try {
            playCoreDialogWrapperActivity = this;
        } catch (IntentSender.SendIntentException unused) {
            playCoreDialogWrapperActivity = this;
        }
        try {
            playCoreDialogWrapperActivity.startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
        } catch (IntentSender.SendIntentException unused2) {
            ResultReceiver resultReceiver2 = playCoreDialogWrapperActivity.f11718q;
            if (resultReceiver2 != null) {
                resultReceiver2.send(3, new Bundle());
            }
            finish();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f11718q);
    }
}
