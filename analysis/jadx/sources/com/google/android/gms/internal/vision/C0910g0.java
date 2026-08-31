package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0910g0 extends M implements G0, RandomAccess {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0910g0 f11269t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f11270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11271s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0910g0 c0910g0 = new C0910g0(new int[0], 0);
        f11269t = c0910g0;
        c0910g0.f11206q = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0910g0(int[] iArr, int i) {
        this.f11270r = iArr;
        this.f11271s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.InterfaceC0924n0
    public final /* synthetic */ InterfaceC0924n0 a(int i) {
        if (i >= this.f11271s) {
            return new C0910g0(Arrays.copyOf(this.f11270r, i), this.f11271s);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i7;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i < 0 || i > (i7 = this.f11271s)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        int[] iArr = this.f11270r;
        if (i7 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i7 - i);
        } else {
            int[] iArr2 = new int[((i7 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f11270r, i, iArr2, i + 1, this.f11271s - i);
            this.f11270r = iArr2;
        }
        this.f11270r[i] = iIntValue;
        this.f11271s++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.M, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = AbstractC0914i0.f11272a;
        collection.getClass();
        if (!(collection instanceof C0910g0)) {
            return super.addAll(collection);
        }
        C0910g0 c0910g0 = (C0910g0) collection;
        int i = c0910g0.f11271s;
        if (i == 0) {
            return false;
        }
        int i7 = this.f11271s;
        if (Integer.MAX_VALUE - i7 < i) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i;
        int[] iArr = this.f11270r;
        if (i8 > iArr.length) {
            this.f11270r = Arrays.copyOf(iArr, i8);
        }
        System.arraycopy(c0910g0.f11270r, 0, this.f11270r, this.f11271s, c0910g0.f11271s);
        this.f11271s = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.M, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0910g0)) {
            return super.equals(obj);
        }
        C0910g0 c0910g0 = (C0910g0) obj;
        if (this.f11271s != c0910g0.f11271s) {
            return false;
        }
        int[] iArr = c0910g0.f11270r;
        for (int i = 0; i < this.f11271s; i++) {
            if (this.f11270r[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i) {
        d();
        int i7 = this.f11271s;
        int[] iArr = this.f11270r;
        if (i7 == iArr.length) {
            int[] iArr2 = new int[((i7 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            this.f11270r = iArr2;
        }
        int[] iArr3 = this.f11270r;
        int i8 = this.f11271s;
        this.f11271s = i8 + 1;
        iArr3[i8] = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h(i);
        return Integer.valueOf(this.f11270r[i]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(int i) {
        if (i < 0 || i >= this.f11271s) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.M, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i7 = 0; i7 < this.f11271s; i7++) {
            i = (i * 31) + this.f11270r[i7];
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i(int i) {
        int i7 = this.f11271s;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i7);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f11271s;
        for (int i7 = 0; i7 < i; i7++) {
            if (this.f11270r[i7] == iIntValue) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.M, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        d();
        h(i);
        int[] iArr = this.f11270r;
        int i7 = iArr[i];
        if (i < this.f11271s - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f11271s--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i7) {
        d();
        if (i7 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f11270r;
        System.arraycopy(iArr, i7, iArr, i, this.f11271s - i7);
        this.f11271s -= i7 - i;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        h(i);
        int[] iArr = this.f11270r;
        int i7 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11271s;
    }

    @Override // com.google.android.gms.internal.vision.M, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
