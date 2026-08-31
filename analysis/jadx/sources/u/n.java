package U;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f7517q = m.f7512e.f7516d;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7519s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Object[] objArr, int i, int i7) {
        this.f7517q = objArr;
        this.f7518r = i;
        this.f7519s = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7519s < this.f7518r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
