package r;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1550a implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f16188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16189u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1550a(int i) {
        this.f16185q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16186r < this.f16185q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f16186r;
        switch (this.f16188t) {
            case 0:
                objF = ((C1554e) this.f16189u).f(i);
                break;
            case 1:
                objF = ((C1554e) this.f16189u).i(i);
                break;
            default:
                objF = ((C1555f) this.f16189u).f16200r[i];
                break;
        }
        this.f16186r++;
        this.f16187s = true;
        return objF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16187s) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f16186r - 1;
        this.f16186r = i;
        switch (this.f16188t) {
            case 0:
                ((C1554e) this.f16189u).g(i);
                break;
            case 1:
                ((C1554e) this.f16189u).g(i);
                break;
            default:
                ((C1555f) this.f16189u).d(i);
                break;
        }
        this.f16185q--;
        this.f16187s = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1550a(C1555f c1555f) {
        this(c1555f.f16201s);
        this.f16188t = 2;
        this.f16189u = c1555f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1550a(C1554e c1554e, int i) {
        this(c1554e.f16166s);
        this.f16188t = i;
        switch (i) {
            case 1:
                this.f16189u = c1554e;
                this(c1554e.f16166s);
                break;
            default:
                this.f16189u = c1554e;
                break;
        }
    }
}
