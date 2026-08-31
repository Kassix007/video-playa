package U;

import java.util.Iterator;
import java.util.Map;
import p0.C1431E;
import p0.G;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7504q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Iterator f7505r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(X.h hVar) {
        n[] nVarArr = new n[8];
        for (int i = 0; i < 8; i++) {
            nVarArr[i] = new p(this);
        }
        this.f7505r = new e(hVar, nVarArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7504q) {
            case 0:
                return ((e) this.f7505r).f7497s;
            default:
                return this.f7505r.hasNext();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7504q) {
            case 0:
                return (Map.Entry) ((e) this.f7505r).next();
            default:
                return (G) this.f7505r.next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7504q) {
            case 0:
                ((e) this.f7505r).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(C1431E c1431e) {
        this.f7505r = c1431e.f15496z.iterator();
    }
}
