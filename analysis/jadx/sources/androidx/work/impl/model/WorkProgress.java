package androidx.work.impl.model;

import androidx.work.Data;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class WorkProgress {
    private final Data progress;
    private final String workSpecId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkProgress(String workSpecId, Data progress) {
        m.e(workSpecId, "workSpecId");
        m.e(progress, "progress");
        this.workSpecId = workSpecId;
        this.progress = progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Data getProgress() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
