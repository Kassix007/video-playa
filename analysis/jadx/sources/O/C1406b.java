package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1406b extends AbstractC1409e implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1407c f15307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1407c f15308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15309s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1406b(C1407c c1407c, C1407c c1407c2, int i) {
        this.f15309s = i;
        this.f15307q = c1407c2;
        this.f15308r = c1407c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o.AbstractC1409e
    public final void a(C1407c c1407c) {
        C1407c c1407c2;
        C1407c c1407cB = null;
        if (this.f15307q == c1407c && c1407c == this.f15308r) {
            this.f15308r = null;
            this.f15307q = null;
        }
        C1407c c1407c3 = this.f15307q;
        if (c1407c3 == c1407c) {
            switch (this.f15309s) {
                case 0:
                    c1407c2 = c1407c3.f15313t;
                    break;
                default:
                    c1407c2 = c1407c3.f15312s;
                    break;
            }
            this.f15307q = c1407c2;
        }
        C1407c c1407c4 = this.f15308r;
        if (c1407c4 == c1407c) {
            C1407c c1407c5 = this.f15307q;
            if (c1407c4 != c1407c5 && c1407c5 != null) {
                c1407cB = b(c1407c4);
            }
            this.f15308r = c1407cB;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1407c b(C1407c c1407c) {
        switch (this.f15309s) {
            case 0:
                return c1407c.f15312s;
            default:
                return c1407c.f15313t;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15308r != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        C1407c c1407c = this.f15308r;
        C1407c c1407c2 = this.f15307q;
        this.f15308r = (c1407c == c1407c2 || c1407c2 == null) ? null : b(c1407c);
        return c1407c;
    }
}
