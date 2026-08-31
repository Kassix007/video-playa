package K2;

/* JADX INFO: loaded from: classes.dex */
public final class h implements AutoCloseable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f2896q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(c cVar) {
        this.f2896q = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f2896q.close();
    }
}
