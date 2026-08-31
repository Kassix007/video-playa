package androidx.work;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerExceptionInfo {
    private final Throwable throwable;
    private final String workerClassName;
    private final WorkerParameters workerParameters;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkerExceptionInfo(String workerClassName, WorkerParameters workerParameters, Throwable throwable) {
        m.e(workerClassName, "workerClassName");
        m.e(workerParameters, "workerParameters");
        m.e(throwable, "throwable");
        this.workerClassName = workerClassName;
        this.workerParameters = workerParameters;
        this.throwable = throwable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getWorkerClassName() {
        return this.workerClassName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WorkerParameters getWorkerParameters() {
        return this.workerParameters;
    }
}
