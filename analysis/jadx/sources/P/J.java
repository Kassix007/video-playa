package P;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5317q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A0 f5318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f5319s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5320t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5321u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public J(A0 a02, int i, int i7) {
        this.f5318r = a02;
        this.f5319s = i7;
        this.f5320t = i;
        this.f5321u = a02.f5272x;
        if (a02.f5271w) {
            C0.f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5317q) {
            case 0:
                return this.f5320t < this.f5319s;
            default:
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5317q) {
            case 0:
                A0 a02 = this.f5318r;
                int i = a02.f5272x;
                int i7 = this.f5321u;
                if (i != i7) {
                    C0.f();
                }
                int i8 = this.f5320t;
                this.f5320t = C0.a(a02.f5265q, i8) + i8;
                return new B0(a02, i8, i7);
            default:
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5317q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public J(A0 a02, int i, K k7, C0345b c0345b) {
        this.f5318r = a02;
        this.f5319s = i;
        this.f5320t = a02.f5272x;
    }
}
