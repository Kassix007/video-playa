package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1408d extends AbstractC1409e implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1407c f15314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15315r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1410f f15316s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1408d(C1410f c1410f) {
        this.f15316s = c1410f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o.AbstractC1409e
    public final void a(C1407c c1407c) {
        C1407c c1407c2 = this.f15314q;
        if (c1407c == c1407c2) {
            C1407c c1407c3 = c1407c2.f15313t;
            this.f15314q = c1407c3;
            this.f15315r = c1407c3 == null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15315r) {
            return this.f15316s.f15317q != null;
        }
        C1407c c1407c = this.f15314q;
        return (c1407c == null || c1407c.f15312s == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15315r) {
            this.f15315r = false;
            this.f15314q = this.f15316s.f15317q;
        } else {
            C1407c c1407c = this.f15314q;
            this.f15314q = c1407c != null ? c1407c.f15312s : null;
        }
        return this.f15314q;
    }
}
