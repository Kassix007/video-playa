package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: r.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1553d implements Collection {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1554e f16195q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1553d(C1554e c1554e) {
        this.f16195q = c1554e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final void clear() {
        this.f16195q.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16195q.a(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f16195q.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1550a(this.f16195q, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1554e c1554e = this.f16195q;
        int iA = c1554e.a(obj);
        if (iA < 0) {
            return false;
        }
        c1554e.g(iA);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1554e c1554e = this.f16195q;
        int i = c1554e.f16166s;
        int i7 = 0;
        boolean z5 = false;
        while (i7 < i) {
            if (collection.contains(c1554e.i(i7))) {
                c1554e.g(i7);
                i7--;
                i--;
                z5 = true;
            }
            i7++;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1554e c1554e = this.f16195q;
        int i = c1554e.f16166s;
        int i7 = 0;
        boolean z5 = false;
        while (i7 < i) {
            if (!collection.contains(c1554e.i(i7))) {
                c1554e.g(i7);
                i7--;
                i--;
                z5 = true;
            }
            i7++;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final int size() {
        return this.f16195q.f16166s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final Object[] toArray() {
        C1554e c1554e = this.f16195q;
        int i = c1554e.f16166s;
        Object[] objArr = new Object[i];
        for (int i7 = 0; i7 < i; i7++) {
            objArr[i7] = c1554e.i(i7);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1554e c1554e = this.f16195q;
        int i = c1554e.f16166s;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i7 = 0; i7 < i; i7++) {
            objArr[i7] = c1554e.i(i7);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
