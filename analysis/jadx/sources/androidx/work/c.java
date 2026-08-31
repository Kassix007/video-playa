package androidx.work;

import androidx.concurrent.futures.k;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f9801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f9802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B5.a f9803t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c(AtomicBoolean atomicBoolean, k kVar, B5.a aVar, int i) {
        this.f9800q = i;
        this.f9801r = atomicBoolean;
        this.f9802s = kVar;
        this.f9803t = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9800q) {
            case 0:
                ListenableFutureKt.executeAsync$lambda$4$lambda$3(this.f9801r, this.f9802s, this.f9803t);
                break;
            default:
                WorkerKt.future$lambda$2$lambda$1(this.f9801r, this.f9802s, this.f9803t);
                break;
        }
    }
}
