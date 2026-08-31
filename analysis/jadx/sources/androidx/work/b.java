package androidx.work;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f9799r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(AtomicBoolean atomicBoolean, int i) {
        this.f9798q = i;
        this.f9799r = atomicBoolean;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.ListenableFutureKt.c(java.util.concurrent.atomic.AtomicBoolean):void */
    /* JADX DEBUG: Class process forced to load method for inline: androidx.work.WorkerKt.b(java.util.concurrent.atomic.AtomicBoolean):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9798q) {
            case 0:
                this.f9799r.set(true);
                break;
            default:
                this.f9799r.set(true);
                break;
        }
    }
}
