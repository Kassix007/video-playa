package r;

import com.google.android.gms.internal.measurement.K1;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class V implements Collection, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16183q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f16184r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public V() {
        int i = N.f16161a;
        this.f16184r = new C1545D(6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f16183q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C1545D) this.f16184r).a(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f16183q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final void clear() {
        switch (this.f16183q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((C1545D) this.f16184r).b();
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f16183q) {
            case 0:
                return ((C1548G) this.f16184r).d(obj);
            default:
                return ((C1545D) this.f16184r).c(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f16183q) {
            case 0:
                kotlin.jvm.internal.m.e(elements, "elements");
                Collection collection = elements;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        if (!((C1548G) this.f16184r).d(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (!((C1545D) this.f16184r).c(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f16183q) {
            case 0:
                return ((C1548G) this.f16184r).i();
            default:
                return ((C1545D) this.f16184r).f16121g == 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f16183q) {
            case 0:
                return K1.w(new U(this, null));
            default:
                C1545D c1545d = (C1545D) this.f16184r;
                c1545d.getClass();
                return new I5.h(new C1547F(c1545d));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f16183q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C1545D) this.f16184r).g(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f16183q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C1545D) this.f16184r).g(collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f16183q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f16183q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C1545D) this.f16184r).i(collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final int size() {
        switch (this.f16183q) {
            case 0:
                return ((C1548G) this.f16184r).f16137e;
            default:
                return ((C1545D) this.f16184r).f16121g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f16183q) {
        }
        return kotlin.jvm.internal.l.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f16183q) {
            case 0:
                kotlin.jvm.internal.m.e(array, "array");
                break;
        }
        return kotlin.jvm.internal.l.b(this, array);
    }

    public V(C1548G parent) {
        kotlin.jvm.internal.m.e(parent, "parent");
        this.f16184r = parent;
    }
}
