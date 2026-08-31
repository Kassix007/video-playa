package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import s.AbstractC1585a;

/* JADX INFO: renamed from: r.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1555f implements Collection, Set, C5.b, C5.d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f16199q = AbstractC1585a.f16411a;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f16200r = AbstractC1585a.f16413c;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16201s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1555f(int i) {
        if (i > 0) {
            r.b(this, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iC;
        int i7 = this.f16201s;
        if (obj == null) {
            iC = r.c(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iC = r.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i8 = ~iC;
        int[] iArr = this.f16199q;
        if (i7 >= iArr.length) {
            int i9 = 8;
            if (i7 >= 8) {
                i9 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i9 = 4;
            }
            Object[] objArr = this.f16200r;
            int[] iArr2 = new int[i9];
            this.f16199q = iArr2;
            this.f16200r = new Object[i9];
            if (i7 != this.f16201s) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                n5.k.F0(0, iArr.length, 6, iArr, iArr2);
                n5.k.G0(0, objArr.length, 6, objArr, this.f16200r);
            }
        }
        if (i8 < i7) {
            int[] iArr3 = this.f16199q;
            int i10 = i8 + 1;
            n5.k.C0(i10, i8, i7, iArr3, iArr3);
            Object[] objArr2 = this.f16200r;
            n5.k.D0(i10, i8, i7, objArr2, objArr2);
        }
        int i11 = this.f16201s;
        if (i7 == i11) {
            int[] iArr4 = this.f16199q;
            if (i8 < iArr4.length) {
                iArr4[i8] = i;
                this.f16200r[i8] = obj;
                this.f16201s = i11 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        int size = elements.size() + this.f16201s;
        int i = this.f16201s;
        int[] iArr = this.f16199q;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f16200r;
            int[] iArr2 = new int[size];
            this.f16199q = iArr2;
            this.f16200r = new Object[size];
            if (i > 0) {
                n5.k.F0(0, i, 6, iArr, iArr2);
                n5.k.G0(0, this.f16201s, 6, objArr, this.f16200r);
            }
        }
        if (this.f16201s != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f16201s != 0) {
            this.f16199q = AbstractC1585a.f16411a;
            this.f16200r = AbstractC1585a.f16413c;
            this.f16201s = 0;
        }
        if (this.f16201s != 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? r.c(this, null, 0) : r.c(this, obj, obj.hashCode())) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d(int i) {
        int i7 = this.f16201s;
        Object[] objArr = this.f16200r;
        Object obj = objArr[i];
        if (i7 <= 1) {
            clear();
            return obj;
        }
        int i8 = i7 - 1;
        int[] iArr = this.f16199q;
        if (iArr.length <= 8 || i7 >= iArr.length / 3) {
            if (i < i8) {
                int i9 = i + 1;
                n5.k.C0(i, i9, i7, iArr, iArr);
                Object[] objArr2 = this.f16200r;
                n5.k.D0(i, i9, i7, objArr2, objArr2);
            }
            this.f16200r[i8] = null;
        } else {
            int i10 = i7 > 8 ? i7 + (i7 >> 1) : 8;
            int[] iArr2 = new int[i10];
            this.f16199q = iArr2;
            this.f16200r = new Object[i10];
            if (i > 0) {
                n5.k.F0(0, i, 6, iArr, iArr2);
                n5.k.G0(0, i, 6, objArr, this.f16200r);
            }
            if (i < i8) {
                int i11 = i + 1;
                n5.k.C0(i, i11, i7, iArr, this.f16199q);
                n5.k.D0(i, i11, i7, objArr, this.f16200r);
            }
        }
        if (i7 != this.f16201s) {
            throw new ConcurrentModificationException();
        }
        this.f16201s = i8;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f16201s != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f16201s;
            for (int i7 = 0; i7 < i; i7++) {
                if (!((Set) obj).contains(this.f16200r[i7])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f16199q;
        int i = this.f16201s;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            i7 += iArr[i8];
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f16201s <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1550a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? r.c(this, null, 0) : r.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        d(iC);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        boolean z5 = false;
        for (int i = this.f16201s - 1; -1 < i; i--) {
            if (!n5.l.h0(elements, this.f16200r[i])) {
                d(i);
                z5 = true;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f16201s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return n5.k.I0(this.f16200r, 0, this.f16201s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16201s * 14);
        sb.append('{');
        int i = this.f16201s;
        for (int i7 = 0; i7 < i; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object obj = this.f16200r[i7];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        int i = this.f16201s;
        if (array.length < i) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i);
        } else if (array.length > i) {
            array[i] = null;
        }
        n5.k.D0(0, 0, this.f16201s, this.f16200r, array);
        return array;
    }
}
