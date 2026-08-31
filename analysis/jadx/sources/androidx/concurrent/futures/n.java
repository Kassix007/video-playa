package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n implements I4.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WeakReference f9376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f9377r = new m(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(k kVar) {
        this.f9376q = new WeakReference(kVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // I4.b
    public final void addListener(Runnable runnable, Executor executor) {
        this.f9377r.addListener(runnable, executor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        k kVar = (k) this.f9376q.get();
        boolean zCancel = this.f9377r.cancel(z5);
        if (zCancel && kVar != null) {
            kVar.f9371a = null;
            kVar.f9372b = null;
            kVar.f9373c.set(null);
        }
        return zCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9377r.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9377r.isCancelled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9377r.isDone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f9377r.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f9377r.get(j, timeUnit);
    }
}
