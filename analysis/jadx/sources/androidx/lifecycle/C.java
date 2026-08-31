package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G f9477q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C(G g7) {
        this.f9477q = g7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f9477q.f9485a) {
            obj = this.f9477q.f;
            this.f9477q.f = G.f9484k;
        }
        this.f9477q.k(obj);
    }
}
