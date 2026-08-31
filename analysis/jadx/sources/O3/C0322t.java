package O3;

import java.util.Iterator;

/* JADX INFO: renamed from: O3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0322t implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5049q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Iterator f5050r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0322t() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5049q) {
        }
        return this.f5050r.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5049q) {
        }
        return (String) this.f5050r.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5049q) {
            case 0:
                throw new UnsupportedOperationException("Remove not supported");
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0322t(C0325u c0325u) {
        this.f5050r = c0325u.f5085q.keySet().iterator();
    }
}
