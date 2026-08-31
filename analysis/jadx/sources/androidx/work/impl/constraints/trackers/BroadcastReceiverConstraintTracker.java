package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class BroadcastReceiverConstraintTracker<T> extends ConstraintTracker<T> {
    private final BroadcastReceiver broadcastReceiver;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverConstraintTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        m.e(context, "context");
        m.e(taskExecutor, "taskExecutor");
        this.broadcastReceiver = new BroadcastReceiver(this) { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            final /* synthetic */ BroadcastReceiverConstraintTracker<T> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.this$0 = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                m.e(context2, "context");
                m.e(intent, "intent");
                this.this$0.onBroadcastReceive(intent);
            }
        };
    }

    public abstract IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(Intent intent);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        Logger.get().debug(BroadcastReceiverConstraintTrackerKt.TAG, getClass().getSimpleName().concat(": registering receiver"));
        getAppContext().registerReceiver(this.broadcastReceiver, getIntentFilter());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        Logger.get().debug(BroadcastReceiverConstraintTrackerKt.TAG, getClass().getSimpleName().concat(": unregistering receiver"));
        getAppContext().unregisterReceiver(this.broadcastReceiver);
    }
}
