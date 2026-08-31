package n5;

import C0.S;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.K1;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC1403f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object[] f15294t = new Object[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f15296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15297s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j() {
        this.f15296r = f15294t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i7 = this.f15297s;
        if (i < 0 || i > i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        if (i == i7) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        q();
        i(this.f15297s + 1);
        int iP = p(this.f15295q + i);
        int i8 = this.f15297s;
        if (i < ((i8 + 1) >> 1)) {
            if (iP == 0) {
                Object[] objArr = this.f15296r;
                kotlin.jvm.internal.m.e(objArr, "<this>");
                iP = objArr.length;
            }
            int i9 = iP - 1;
            int i10 = this.f15295q;
            if (i10 == 0) {
                Object[] objArr2 = this.f15296r;
                kotlin.jvm.internal.m.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i10 - 1;
            }
            int i11 = this.f15295q;
            if (i9 >= i11) {
                Object[] objArr3 = this.f15296r;
                objArr3[length] = objArr3[i11];
                k.D0(i11, i11 + 1, i9 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f15296r;
                k.D0(i11 - 1, i11, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f15296r;
                objArr5[objArr5.length - 1] = objArr5[0];
                k.D0(0, 1, i9 + 1, objArr5, objArr5);
            }
            this.f15296r[i9] = obj;
            this.f15295q = length;
        } else {
            int iP2 = p(i8 + this.f15295q);
            if (iP < iP2) {
                Object[] objArr6 = this.f15296r;
                k.D0(iP + 1, iP, iP2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f15296r;
                k.D0(1, 0, iP2, objArr7, objArr7);
                Object[] objArr8 = this.f15296r;
                objArr8[0] = objArr8[objArr8.length - 1];
                k.D0(iP + 1, iP, objArr8.length - 1, objArr8, objArr8);
            }
            this.f15296r[iP] = obj;
        }
        this.f15297s++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        int i7 = this.f15297s;
        if (i < 0 || i > i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.f15297s) {
            return addAll(elements);
        }
        q();
        i(elements.size() + this.f15297s);
        int iP = p(this.f15297s + this.f15295q);
        int iP2 = p(this.f15295q + i);
        int size = elements.size();
        if (i >= ((this.f15297s + 1) >> 1)) {
            int i8 = iP2 + size;
            if (iP2 < iP) {
                int i9 = size + iP;
                Object[] objArr = this.f15296r;
                if (i9 <= objArr.length) {
                    k.D0(i8, iP2, iP, objArr, objArr);
                } else if (i8 >= objArr.length) {
                    k.D0(i8 - objArr.length, iP2, iP, objArr, objArr);
                } else {
                    int length = iP - (i9 - objArr.length);
                    k.D0(0, length, iP, objArr, objArr);
                    Object[] objArr2 = this.f15296r;
                    k.D0(i8, iP2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f15296r;
                k.D0(size, 0, iP, objArr3, objArr3);
                Object[] objArr4 = this.f15296r;
                if (i8 >= objArr4.length) {
                    k.D0(i8 - objArr4.length, iP2, objArr4.length, objArr4, objArr4);
                } else {
                    k.D0(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f15296r;
                    k.D0(i8, iP2, objArr5.length - size, objArr5, objArr5);
                }
            }
            h(iP2, elements);
            return true;
        }
        int i10 = this.f15295q;
        int length2 = i10 - size;
        if (iP2 < i10) {
            Object[] objArr6 = this.f15296r;
            k.D0(length2, i10, objArr6.length, objArr6, objArr6);
            if (size >= iP2) {
                Object[] objArr7 = this.f15296r;
                k.D0(objArr7.length - size, 0, iP2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f15296r;
                k.D0(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f15296r;
                k.D0(0, size, iP2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f15296r;
            k.D0(length2, i10, iP2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f15296r;
            length2 += objArr11.length;
            int i11 = iP2 - i10;
            int length3 = objArr11.length - length2;
            if (length3 >= i11) {
                k.D0(length2, i10, iP2, objArr11, objArr11);
            } else {
                k.D0(length2, i10, i10 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f15296r;
                k.D0(0, this.f15295q + length3, iP2, objArr12, objArr12);
            }
        }
        this.f15295q = length2;
        h(m(iP2 - size), elements);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addFirst(Object obj) {
        q();
        i(this.f15297s + 1);
        int length = this.f15295q;
        if (length == 0) {
            Object[] objArr = this.f15296r;
            kotlin.jvm.internal.m.e(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f15295q = i;
        this.f15296r[i] = obj;
        this.f15297s++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addLast(Object obj) {
        q();
        i(d() + 1);
        this.f15296r[p(d() + this.f15295q)] = obj;
        this.f15297s = d() + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            q();
            o(this.f15295q, p(d() + this.f15295q));
        }
        this.f15295q = 0;
        this.f15297s = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1403f
    public final int d() {
        return this.f15297s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f15296r[this.f15295q];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1403f
    public final Object g(int i) {
        int i7 = this.f15297s;
        if (i < 0 || i >= i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        if (i == AbstractC0836n2.u(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        q();
        int iP = p(this.f15295q + i);
        Object[] objArr = this.f15296r;
        Object obj = objArr[iP];
        if (i < (this.f15297s >> 1)) {
            int i8 = this.f15295q;
            if (iP >= i8) {
                k.D0(i8 + 1, i8, iP, objArr, objArr);
            } else {
                k.D0(1, 0, iP, objArr, objArr);
                Object[] objArr2 = this.f15296r;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i9 = this.f15295q;
                k.D0(i9 + 1, i9, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f15296r;
            int i10 = this.f15295q;
            objArr3[i10] = null;
            this.f15295q = k(i10);
        } else {
            int iP2 = p(AbstractC0836n2.u(this) + this.f15295q);
            if (iP <= iP2) {
                Object[] objArr4 = this.f15296r;
                k.D0(iP, iP + 1, iP2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f15296r;
                k.D0(iP, iP + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f15296r;
                objArr6[objArr6.length - 1] = objArr6[0];
                k.D0(0, 1, iP2 + 1, objArr6, objArr6);
            }
            this.f15296r[iP2] = null;
        }
        this.f15297s--;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iD = d();
        if (i < 0 || i >= iD) {
            throw new IndexOutOfBoundsException(S.j(i, iD, "index: ", ", size: "));
        }
        return this.f15296r[p(this.f15295q + i)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f15296r.length;
        while (i < length && it.hasNext()) {
            this.f15296r[i] = it.next();
            i++;
        }
        int i7 = this.f15295q;
        for (int i8 = 0; i8 < i7 && it.hasNext(); i8++) {
            this.f15296r[i8] = it.next();
        }
        this.f15297s = collection.size() + this.f15297s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f15296r;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f15294t) {
            if (i < 10) {
                i = 10;
            }
            this.f15296r = new Object[i];
            return;
        }
        int length = objArr.length;
        int i7 = length + (length >> 1);
        if (i7 - i < 0) {
            i7 = i;
        }
        if (i7 - 2147483639 > 0) {
            i7 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i7];
        k.D0(0, this.f15295q, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f15296r;
        int length2 = objArr3.length;
        int i8 = this.f15295q;
        k.D0(length2 - i8, 0, i8, objArr3, objArr2);
        this.f15295q = 0;
        this.f15296r = objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iP = p(d() + this.f15295q);
        int length = this.f15295q;
        if (length < iP) {
            while (length < iP) {
                if (kotlin.jvm.internal.m.a(obj, this.f15296r[length])) {
                    i = this.f15295q;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iP) {
            return -1;
        }
        int length2 = this.f15296r.length;
        while (true) {
            if (length >= length2) {
                for (int i7 = 0; i7 < iP; i7++) {
                    if (kotlin.jvm.internal.m.a(obj, this.f15296r[i7])) {
                        length = i7 + this.f15296r.length;
                        i = this.f15295q;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.m.a(obj, this.f15296r[length])) {
                i = this.f15295q;
                break;
            }
            length++;
        }
        return length - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return d() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.f15296r[this.f15295q];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int k(int i) {
        kotlin.jvm.internal.m.e(this.f15296r, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object l() {
        if (isEmpty()) {
            return null;
        }
        return this.f15296r[p(AbstractC0836n2.u(this) + this.f15295q)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f15296r[p(AbstractC0836n2.u(this) + this.f15295q)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iP = p(this.f15297s + this.f15295q);
        int i7 = this.f15295q;
        if (i7 < iP) {
            length = iP - 1;
            if (i7 <= length) {
                while (!kotlin.jvm.internal.m.a(obj, this.f15296r[length])) {
                    if (length != i7) {
                        length--;
                    }
                }
                i = this.f15295q;
                return length - i;
            }
            return -1;
        }
        if (i7 > iP) {
            int i8 = iP - 1;
            while (true) {
                if (-1 >= i8) {
                    Object[] objArr = this.f15296r;
                    kotlin.jvm.internal.m.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i9 = this.f15295q;
                    if (i9 <= length) {
                        while (!kotlin.jvm.internal.m.a(obj, this.f15296r[length])) {
                            if (length != i9) {
                                length--;
                            }
                        }
                        i = this.f15295q;
                    }
                } else {
                    if (kotlin.jvm.internal.m.a(obj, this.f15296r[i8])) {
                        length = i8 + this.f15296r.length;
                        i = this.f15295q;
                        break;
                    }
                    i8--;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m(int i) {
        return i < 0 ? i + this.f15296r.length : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(int i, int i7) {
        if (i < i7) {
            k.J0(i, i7, null, this.f15296r);
            return;
        }
        Object[] objArr = this.f15296r;
        k.J0(i, objArr.length, null, objArr);
        k.J0(0, i7, null, this.f15296r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int p(int i) {
        Object[] objArr = this.f15296r;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iP;
        kotlin.jvm.internal.m.e(elements, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f15296r.length != 0) {
            int iP2 = p(d() + this.f15295q);
            int i = this.f15295q;
            if (i < iP2) {
                iP = i;
                while (i < iP2) {
                    Object obj = this.f15296r[i];
                    if (elements.contains(obj)) {
                        z5 = true;
                    } else {
                        this.f15296r[iP] = obj;
                        iP++;
                    }
                    i++;
                }
                k.J0(iP, iP2, null, this.f15296r);
            } else {
                int length = this.f15296r.length;
                boolean z6 = false;
                int i7 = i;
                while (i < length) {
                    Object[] objArr = this.f15296r;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z6 = true;
                    } else {
                        this.f15296r[i7] = obj2;
                        i7++;
                    }
                    i++;
                }
                iP = p(i7);
                for (int i8 = 0; i8 < iP2; i8++) {
                    Object[] objArr2 = this.f15296r;
                    Object obj3 = objArr2[i8];
                    objArr2[i8] = null;
                    if (elements.contains(obj3)) {
                        z6 = true;
                    } else {
                        this.f15296r[iP] = obj3;
                        iP = k(iP);
                    }
                }
                z5 = z6;
            }
            if (z5) {
                q();
                this.f15297s = m(iP - this.f15295q);
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        q();
        Object[] objArr = this.f15296r;
        int i = this.f15295q;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f15295q = k(i);
        this.f15297s = d() - 1;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        q();
        int iP = p(AbstractC0836n2.u(this) + this.f15295q);
        Object[] objArr = this.f15296r;
        Object obj = objArr[iP];
        objArr[iP] = null;
        this.f15297s = d() - 1;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i7) {
        K1.j(i, i7, this.f15297s);
        int i8 = i7 - i;
        if (i8 == 0) {
            return;
        }
        if (i8 == this.f15297s) {
            clear();
            return;
        }
        if (i8 == 1) {
            g(i);
            return;
        }
        q();
        if (i < this.f15297s - i7) {
            int iP = p(this.f15295q + (i - 1));
            int iP2 = p(this.f15295q + (i7 - 1));
            while (i > 0) {
                int i9 = iP + 1;
                int iMin = Math.min(i, Math.min(i9, iP2 + 1));
                Object[] objArr = this.f15296r;
                int i10 = iP2 - iMin;
                int i11 = iP - iMin;
                k.D0(i10 + 1, i11 + 1, i9, objArr, objArr);
                iP = m(i11);
                iP2 = m(i10);
                i -= iMin;
            }
            int iP3 = p(this.f15295q + i8);
            o(this.f15295q, iP3);
            this.f15295q = iP3;
        } else {
            int iP4 = p(this.f15295q + i7);
            int iP5 = p(this.f15295q + i);
            int i12 = this.f15297s;
            while (true) {
                i12 -= i7;
                if (i12 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f15296r;
                i7 = Math.min(i12, Math.min(objArr2.length - iP4, objArr2.length - iP5));
                Object[] objArr3 = this.f15296r;
                int i13 = iP4 + i7;
                k.D0(iP5, iP4, i13, objArr3, objArr3);
                iP4 = p(i13);
                iP5 = p(iP5 + i7);
            }
            int iP6 = p(this.f15297s + this.f15295q);
            o(m(iP6 - i8), iP6);
        }
        this.f15297s -= i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iP;
        kotlin.jvm.internal.m.e(elements, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f15296r.length != 0) {
            int iP2 = p(d() + this.f15295q);
            int i = this.f15295q;
            if (i < iP2) {
                iP = i;
                while (i < iP2) {
                    Object obj = this.f15296r[i];
                    if (elements.contains(obj)) {
                        this.f15296r[iP] = obj;
                        iP++;
                    } else {
                        z5 = true;
                    }
                    i++;
                }
                k.J0(iP, iP2, null, this.f15296r);
            } else {
                int length = this.f15296r.length;
                boolean z6 = false;
                int i7 = i;
                while (i < length) {
                    Object[] objArr = this.f15296r;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.f15296r[i7] = obj2;
                        i7++;
                    } else {
                        z6 = true;
                    }
                    i++;
                }
                iP = p(i7);
                for (int i8 = 0; i8 < iP2; i8++) {
                    Object[] objArr2 = this.f15296r;
                    Object obj3 = objArr2[i8];
                    objArr2[i8] = null;
                    if (elements.contains(obj3)) {
                        this.f15296r[iP] = obj3;
                        iP = k(iP);
                    } else {
                        z6 = true;
                    }
                }
                z5 = z6;
            }
            if (z5) {
                q();
                this.f15297s = m(iP - this.f15295q);
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iD = d();
        if (i < 0 || i >= iD) {
            throw new IndexOutOfBoundsException(S.j(i, iD, "index: ", ", size: "));
        }
        int iP = p(this.f15295q + i);
        Object[] objArr = this.f15296r;
        Object obj2 = objArr[iP];
        objArr[iP] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[d()]);
    }

    public j(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f15294t;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(k1.i.i(i, "Illegal Capacity: "));
        }
        this.f15296r = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        int length = array.length;
        int i = this.f15297s;
        if (length < i) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i);
            kotlin.jvm.internal.m.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iP = p(this.f15297s + this.f15295q);
        int i7 = this.f15295q;
        if (i7 < iP) {
            k.G0(i7, iP, 2, this.f15296r, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f15296r;
            k.D0(0, this.f15295q, objArr.length, objArr, array);
            Object[] objArr2 = this.f15296r;
            k.D0(objArr2.length - this.f15295q, 0, iP, objArr2, array);
        }
        int i8 = this.f15297s;
        if (i8 < array.length) {
            array[i8] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        q();
        i(elements.size() + d());
        h(p(d() + this.f15295q), elements);
        return true;
    }
}
