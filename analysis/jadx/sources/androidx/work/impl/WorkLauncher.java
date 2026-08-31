package androidx.work.impl;

import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public interface WorkLauncher {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void startWork(StartStopToken workSpecId) {
        m.e(workSpecId, "workSpecId");
        startWork(workSpecId, null);
    }

    void startWork(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void stopWork(StartStopToken workSpecId) {
        m.e(workSpecId, "workSpecId");
        stopWork(workSpecId, WorkInfo.STOP_REASON_UNKNOWN);
    }

    void stopWork(StartStopToken startStopToken, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void stopWorkWithReason(StartStopToken workSpecId, int i) {
        m.e(workSpecId, "workSpecId");
        stopWork(workSpecId, i);
    }
}
