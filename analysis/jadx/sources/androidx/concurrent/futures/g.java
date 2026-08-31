package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f9366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final I4.b f9367r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(j jVar, I4.b bVar) {
        this.f9366q = jVar;
        this.f9367r = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9366q.value != this) {
            return;
        }
        if (j.ATOMIC_HELPER.b(this.f9366q, this, j.getFutureValue(this.f9367r))) {
            j.complete(this.f9366q);
        }
    }
}
