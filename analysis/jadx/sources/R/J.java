package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class J implements C5.d, Set, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1549H f16155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1549H f16156r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public J(C1549H c1549h) {
        this.f16155q = c1549h;
        this.f16156r = c1549h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f16156r.a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        C1549H c1549h = this.f16156r;
        c1549h.getClass();
        int i = c1549h.f16141d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            c1549h.j(it.next());
        }
        return i != c1549h.f16141d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f16156r.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16155q.c(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f16155q.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f16155q, ((J) obj).f16155q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f16155q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f16155q.g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new I5.h(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f16156r.l(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        C1549H c1549h = this.f16156r;
        c1549h.getClass();
        int i = c1549h.f16141d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            c1549h.i(it.next());
        }
        return i != c1549h.f16141d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        boolean z5;
        kotlin.jvm.internal.m.e(elements, "elements");
        C1549H c1549h = this.f16156r;
        c1549h.getClass();
        Object[] objArr = c1549h.f16139b;
        int i = c1549h.f16141d;
        long[] jArr = c1549h.f16138a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j) < 128) {
                            int i10 = (i7 << 3) + i9;
                            if (!n5.l.h0(elements, objArr[i10])) {
                                c1549h.m(i10);
                            }
                        }
                        j >>= 8;
                    }
                    z5 = false;
                    if (i8 != 8) {
                        break;
                    }
                } else {
                    z5 = false;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        } else {
            z5 = false;
        }
        if (i != c1549h.f16141d) {
            return true;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f16155q.f16141d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f16155q.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return kotlin.jvm.internal.l.b(this, array);
    }
}
