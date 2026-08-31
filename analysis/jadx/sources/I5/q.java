package I5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Iterator f2449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f2450r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(p pVar) {
        this.f2450r = pVar;
        this.f2449q = pVar.f2447b.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2449q.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        return this.f2450r.f2448c.invoke(this.f2449q.next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
