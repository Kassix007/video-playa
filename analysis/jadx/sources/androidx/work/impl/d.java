package androidx.work.impl;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkerWrapper f9826b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d(WorkerWrapper workerWrapper, int i) {
        this.f9825a = i;
        this.f9826b = workerWrapper;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.WorkerWrapper.a(androidx.work.impl.WorkerWrapper):java.lang.Boolean */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9825a) {
            case 0:
                return WorkerWrapper.runWorker$lambda$1(this.f9826b);
            default:
                return WorkerWrapper.trySetRunning$lambda$11(this.f9826b);
        }
    }
}
