package com.web2native;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class NotificationDisableBroadcastReceiver extends BroadcastReceiver {
    public static final int $stable = 8;
    public NotificationBroadcastReceiverListener notificationBroadcastReceiverListener;

    public interface NotificationBroadcastReceiverListener {
        void onSuccess(Intent intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.notificationBroadcastReceiverListener != null) {
            if (m.a(intent != null ? intent.getAction() : null, "com.web2native.NOTIFICATION_DATA_RECEIVED")) {
                NotificationBroadcastReceiverListener notificationBroadcastReceiverListener = this.notificationBroadcastReceiverListener;
                m.b(notificationBroadcastReceiverListener);
                notificationBroadcastReceiverListener.onSuccess(intent);
            }
        }
    }
}
