package androidx.work.impl;

import androidx.work.ListenableWorker;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerWrapperKt$awaitWithin$2$1 extends n implements B5.c {
    final /* synthetic */ I4.b $this_awaitWithin;
    final /* synthetic */ ListenableWorker $worker;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapperKt$awaitWithin$2$1(ListenableWorker listenableWorker, I4.b bVar) {
        super(1);
        this.$worker = listenableWorker;
        this.$this_awaitWithin = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void invoke(Throwable th) {
        if (th instanceof WorkerStoppedException) {
            this.$worker.stop(((WorkerStoppedException) th).getReason());
        }
        this.$this_awaitWithin.cancel(false);
    }
}
