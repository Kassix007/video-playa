package o5;

import B0.r;
import C0.S;
import com.google.android.gms.internal.measurement.K1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;
import n5.AbstractC1403f;
import n5.k;

/* JADX INFO: renamed from: o5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1420b extends AbstractC1403f implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1420b f15441t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f15442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15444s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1420b c1420b = new C1420b(0);
        c1420b.f15444s = true;
        f15441t = c1420b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1420b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f15442q = new Object[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        int i = this.f15443r;
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.f15442q[i] = obj;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        k();
        int size = elements.size();
        i(this.f15443r, elements, size);
        return size > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        o(0, this.f15443r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1403f
    public final int d() {
        return this.f15443r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f15442q;
            int i = this.f15443r;
            if (i == list.size()) {
                for (int i7 = 0; i7 < i; i7++) {
                    if (m.a(objArr[i7], list.get(i7))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1403f
    public final Object g(int i) {
        k();
        int i7 = this.f15443r;
        if (i < 0 || i >= i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        return m(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i7 = this.f15443r;
        if (i < 0 || i >= i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        return this.f15442q[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f15442q;
        int i = this.f15443r;
        int iHashCode = 1;
        for (int i7 = 0; i7 < i; i7++) {
            Object obj = objArr[i7];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(int i, Collection collection, int i7) {
        ((AbstractList) this).modCount++;
        l(i, i7);
        Iterator it = collection.iterator();
        for (int i8 = 0; i8 < i7; i8++) {
            this.f15442q[i + i8] = it.next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f15443r; i++) {
            if (m.a(this.f15442q[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f15443r == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i, Object obj) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.f15442q[i] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        if (this.f15444s) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i, int i7) {
        int i8 = this.f15443r + i7;
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f15442q;
        if (i8 > objArr.length) {
            int length = objArr.length;
            int i9 = length + (length >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 > 0) {
                i9 = i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i9);
            m.d(objArrCopyOf, "copyOf(...)");
            this.f15442q = objArrCopyOf;
        }
        Object[] objArr2 = this.f15442q;
        k.D0(i + i7, i, this.f15443r, objArr2, objArr2);
        this.f15443r += i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f15443r - 1; i >= 0; i--) {
            if (m.a(this.f15442q[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object m(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f15442q;
        Object obj = objArr[i];
        k.D0(i, i + 1, this.f15443r, objArr, objArr);
        Object[] objArr2 = this.f15442q;
        int i7 = this.f15443r - 1;
        m.e(objArr2, "<this>");
        objArr2[i7] = null;
        this.f15443r--;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(int i, int i7) {
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f15442q;
        k.D0(i, i + i7, this.f15443r, objArr, objArr);
        Object[] objArr2 = this.f15442q;
        int i8 = this.f15443r;
        D5.a.E(objArr2, i8 - i7, i8);
        this.f15443r -= i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int p(int i, int i7, Collection collection, boolean z5) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int i10 = i + i8;
            if (collection.contains(this.f15442q[i10]) == z5) {
                Object[] objArr = this.f15442q;
                i8++;
                objArr[i9 + i] = objArr[i10];
                i9++;
            } else {
                i8++;
            }
        }
        int i11 = i7 - i9;
        Object[] objArr2 = this.f15442q;
        k.D0(i + i9, i7 + i, this.f15443r, objArr2, objArr2);
        Object[] objArr3 = this.f15442q;
        int i12 = this.f15443r;
        D5.a.E(objArr3, i12 - i11, i12);
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f15443r -= i11;
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        k();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            g(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        m.e(elements, "elements");
        k();
        return p(0, this.f15443r, elements, false) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        m.e(elements, "elements");
        k();
        return p(0, this.f15443r, elements, true) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        k();
        int i7 = this.f15443r;
        if (i < 0 || i >= i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        Object[] objArr = this.f15442q;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i7) {
        K1.j(i, i7, this.f15443r);
        return new C1419a(this.f15442q, i, i7 - i, null, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        m.e(array, "array");
        int length = array.length;
        int i = this.f15443r;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f15442q, 0, i, array.getClass());
            m.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        k.D0(0, 0, i, this.f15442q, array);
        int i7 = this.f15443r;
        if (i7 < array.length) {
            array[i7] = null;
        }
        return array;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection
    public final String toString() {
        return D5.a.j(this.f15442q, 0, this.f15443r, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i7 = this.f15443r;
        if (i < 0 || i > i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        return new r(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        m.e(elements, "elements");
        k();
        int i7 = this.f15443r;
        if (i >= 0 && i <= i7) {
            int size = elements.size();
            i(i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        k();
        int i7 = this.f15443r;
        if (i >= 0 && i <= i7) {
            ((AbstractList) this).modCount++;
            l(i, 1);
            this.f15442q[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return k.I0(this.f15442q, 0, this.f15443r);
    }
}
