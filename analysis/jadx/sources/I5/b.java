package I5;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Iterator;
import n5.v;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2420q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Iterator f2421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2422s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(Iterator iterator) {
        kotlin.jvm.internal.m.e(iterator, "iterator");
        this.f2421r = iterator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f2420q) {
            case 0:
                break;
            default:
                return this.f2421r.hasNext();
        }
        while (true) {
            int i = this.f2422s;
            it = this.f2421r;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f2422s--;
            }
        }
        return it.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f2420q) {
            case 0:
                break;
            default:
                int i = this.f2422s;
                this.f2422s = i + 1;
                if (i >= 0) {
                    return new v(i, this.f2421r.next());
                }
                AbstractC0836n2.N();
                throw null;
        }
        while (true) {
            int i7 = this.f2422s;
            it = this.f2421r;
            if (i7 > 0 && it.hasNext()) {
                it.next();
                this.f2422s--;
            }
        }
        return it.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2420q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public b(c cVar) {
        this.f2421r = cVar.f2423a.iterator();
        this.f2422s = cVar.f2424b;
    }
}
