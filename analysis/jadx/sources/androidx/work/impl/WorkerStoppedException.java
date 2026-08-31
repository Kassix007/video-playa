package androidx.work.impl;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerStoppedException extends CancellationException {
    private final int reason;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkerStoppedException(int i) {
        this.reason = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getReason() {
        return this.reason;
    }
}
