package a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class v implements u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final X.a f8707q = new X.a(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(int i) {
        return (i & this.f8707q.get()) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i) {
        X.a aVar;
        int i7;
        do {
            aVar = this.f8707q;
            i7 = aVar.get();
            if ((i7 & i) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i7, i7 | i));
    }
}
