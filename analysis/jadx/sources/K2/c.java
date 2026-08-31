package K2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements AutoCloseable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f2870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f2872s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(f fVar, b bVar) {
        this.f2872s = fVar;
        this.f2870q = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f2871r) {
            return;
        }
        this.f2871r = true;
        f fVar = this.f2872s;
        synchronized (fVar.f2889x) {
            b bVar = this.f2870q;
            int i = bVar.f2869h - 1;
            bVar.f2869h = i;
            if (i == 0 && bVar.f) {
                fVar.G(bVar);
            }
        }
    }
}
