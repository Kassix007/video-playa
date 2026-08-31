package U;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f7521t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(g gVar) {
        this.f7521t = gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f7519s;
        this.f7519s = i + 2;
        Object[] objArr = this.f7517q;
        return new b(this.f7521t, objArr[i], objArr[i + 1]);
    }
}
