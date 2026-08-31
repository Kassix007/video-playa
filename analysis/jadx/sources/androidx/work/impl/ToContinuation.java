package androidx.work.impl;

import M5.InterfaceC0245f;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;

/* JADX INFO: loaded from: classes.dex */
final class ToContinuation<T> implements Runnable {
    private final InterfaceC0245f continuation;
    private final I4.b futureToObserve;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ToContinuation(I4.b futureToObserve, InterfaceC0245f continuation) {
        m.e(futureToObserve, "futureToObserve");
        m.e(continuation, "continuation");
        this.futureToObserve = futureToObserve;
        this.continuation = continuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0245f getContinuation() {
        return this.continuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final I4.b getFutureToObserve() {
        return this.futureToObserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            this.continuation.g(null);
            return;
        }
        try {
            this.continuation.resumeWith(WorkerWrapperKt.getUninterruptibly(this.futureToObserve));
        } catch (ExecutionException e7) {
            this.continuation.resumeWith(AbstractC1362a.b(WorkerWrapperKt.nonNullCause(e7)));
        }
    }
}
