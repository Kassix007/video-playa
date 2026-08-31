package o5;

import B0.r;
import C0.S;
import com.google.android.gms.internal.measurement.K1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;
import n5.AbstractC1403f;
import n5.k;

/* JADX INFO: renamed from: o5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1419a extends AbstractC1403f implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f15436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1419a f15439t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1420b f15440u;

    /* JADX DEBUG: Class process forced to load method for inline: o5.b.h(o5.b):int */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1419a(Object[] backing, int i, int i7, C1419a c1419a, C1420b root) {
        m.e(backing, "backing");
        m.e(root, "root");
        this.f15436q = backing;
        this.f15437r = i;
        this.f15438s = i7;
        this.f15439t = c1419a;
        this.f15440u = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        k();
        j(this.f15437r + this.f15438s, obj);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        l();
        k();
        int size = elements.size();
        i(this.f15437r + this.f15438s, elements, size);
        return size > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        k();
        o(this.f15437r, this.f15438s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1403f
    public final int d() {
        k();
        return this.f15438s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        k();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f15436q;
            int i = this.f15438s;
            if (i == list.size()) {
                for (int i7 = 0; i7 < i; i7++) {
                    if (m.a(objArr[this.f15437r + i7], list.get(i7))) {
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
        l();
        k();
        int i7 = this.f15438s;
        if (i < 0 || i >= i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        return m(this.f15437r + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        k();
        int i7 = this.f15438s;
        if (i < 0 || i >= i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        return this.f15436q[this.f15437r + i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        k();
        Object[] objArr = this.f15436q;
        int i = this.f15438s;
        int iHashCode = 1;
        for (int i7 = 0; i7 < i; i7++) {
            Object obj = objArr[this.f15437r + i7];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(int i, Collection collection, int i7) {
        ((AbstractList) this).modCount++;
        C1420b c1420b = this.f15440u;
        C1419a c1419a = this.f15439t;
        if (c1419a != null) {
            c1419a.i(i, collection, i7);
        } else {
            C1420b c1420b2 = C1420b.f15441t;
            c1420b.i(i, collection, i7);
        }
        this.f15436q = c1420b.f15442q;
        this.f15438s += i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        k();
        for (int i = 0; i < this.f15438s; i++) {
            if (m.a(this.f15436q[this.f15437r + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        k();
        return this.f15438s == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C1420b c1420b = this.f15440u;
        C1419a c1419a = this.f15439t;
        if (c1419a != null) {
            c1419a.j(i, obj);
        } else {
            C1420b c1420b2 = C1420b.f15441t;
            c1420b.j(i, obj);
        }
        this.f15436q = c1420b.f15442q;
        this.f15438s++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        if (((AbstractList) this.f15440u).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        if (this.f15440u.f15444s) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        k();
        for (int i = this.f15438s - 1; i >= 0; i--) {
            if (m.a(this.f15436q[this.f15437r + i], obj)) {
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
        Object objM;
        ((AbstractList) this).modCount++;
        C1419a c1419a = this.f15439t;
        if (c1419a != null) {
            objM = c1419a.m(i);
        } else {
            C1420b c1420b = C1420b.f15441t;
            objM = this.f15440u.m(i);
        }
        this.f15438s--;
        return objM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(int i, int i7) {
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        C1419a c1419a = this.f15439t;
        if (c1419a != null) {
            c1419a.o(i, i7);
        } else {
            C1420b c1420b = C1420b.f15441t;
            this.f15440u.o(i, i7);
        }
        this.f15438s -= i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int p(int i, int i7, Collection collection, boolean z5) {
        int iP;
        C1419a c1419a = this.f15439t;
        if (c1419a != null) {
            iP = c1419a.p(i, i7, collection, z5);
        } else {
            C1420b c1420b = C1420b.f15441t;
            iP = this.f15440u.p(i, i7, collection, z5);
        }
        if (iP > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f15438s -= iP;
        return iP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
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
        l();
        k();
        return p(this.f15437r, this.f15438s, elements, false) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        m.e(elements, "elements");
        l();
        k();
        return p(this.f15437r, this.f15438s, elements, true) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        l();
        k();
        int i7 = this.f15438s;
        if (i < 0 || i >= i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        Object[] objArr = this.f15436q;
        int i8 = this.f15437r;
        Object obj2 = objArr[i8 + i];
        objArr[i8 + i] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i7) {
        K1.j(i, i7, this.f15438s);
        return new C1419a(this.f15436q, this.f15437r + i, i7 - i, this, this.f15440u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        m.e(array, "array");
        k();
        int length = array.length;
        int i = this.f15438s;
        int i7 = this.f15437r;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f15436q, i7, i + i7, array.getClass());
            m.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        k.D0(0, i7, i + i7, this.f15436q, array);
        int i8 = this.f15438s;
        if (i8 < array.length) {
            array[i8] = null;
        }
        return array;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection
    public final String toString() {
        k();
        return D5.a.j(this.f15436q, this.f15437r, this.f15438s, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        k();
        int i7 = this.f15438s;
        if (i < 0 || i > i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        return new r(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        l();
        k();
        int i7 = this.f15438s;
        if (i >= 0 && i <= i7) {
            j(this.f15437r + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        m.e(elements, "elements");
        l();
        k();
        int i7 = this.f15438s;
        if (i >= 0 && i <= i7) {
            int size = elements.size();
            i(this.f15437r + i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        k();
        Object[] objArr = this.f15436q;
        int i = this.f15438s;
        int i7 = this.f15437r;
        return k.I0(objArr, i7, i + i7);
    }
}
