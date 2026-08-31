package H4;

/* JADX INFO: loaded from: classes.dex */
public final class k extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient m f2189t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient l f2190u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(m mVar, l lVar) {
        this.f2189t = mVar;
        this.f2190u = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2189t.get(obj) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a
    public final int d(Object[] objArr) {
        return this.f2190u.d(objArr);
    }

    @Override // H4.f
    public final d j() {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final p iterator() {
        return this.f2190u.listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2189t.f2200v;
    }
}
