package H4;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f2180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2181r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(Object obj) {
        this.f2180q = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f2181r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2181r) {
            throw new NoSuchElementException();
        }
        this.f2181r = true;
        return this.f2180q;
    }
}
