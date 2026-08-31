package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0855r2 extends Z1 implements RandomAccess, InterfaceC0870u2, O2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f11022t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0855r2 f11023u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f11024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11025s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = new int[0];
        f11022t = iArr;
        f11023u = new C0855r2(iArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0855r2(int[] iArr, int i, boolean z5) {
        super(z5);
        this.f11024r = iArr;
        this.f11025s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i7;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i < 0 || i > (i7 = this.f11025s)) {
            throw new IndexOutOfBoundsException(C0776b2.a(this.f11025s, i, (byte) 13, "Index:", ", Size:"));
        }
        int i8 = i + 1;
        int[] iArr = this.f11024r;
        int length = iArr.length;
        if (i7 < length) {
            System.arraycopy(iArr, i, iArr, i8, i7 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f11024r, 0, iArr2, 0, i);
            System.arraycopy(this.f11024r, i, iArr2, i8, this.f11025s - i);
            this.f11024r = iArr2;
        }
        this.f11024r[i] = iIntValue;
        this.f11025s++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.Z1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = AbstractC0885x2.f11122a;
        collection.getClass();
        if (!(collection instanceof C0855r2)) {
            return super.addAll(collection);
        }
        C0855r2 c0855r2 = (C0855r2) collection;
        int i = c0855r2.f11025s;
        if (i == 0) {
            return false;
        }
        int i7 = this.f11025s;
        if (Integer.MAX_VALUE - i7 < i) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i;
        int[] iArr = this.f11024r;
        if (i8 > iArr.length) {
            this.f11024r = Arrays.copyOf(iArr, i8);
        }
        System.arraycopy(c0855r2.f11024r, 0, this.f11024r, this.f11025s, c0855r2.f11025s);
        this.f11025s = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.Z1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0855r2)) {
            return super.equals(obj);
        }
        C0855r2 c0855r2 = (C0855r2) obj;
        if (this.f11025s != c0855r2.f11025s) {
            return false;
        }
        int[] iArr = c0855r2.f11024r;
        for (int i = 0; i < this.f11025s; i++) {
            if (this.f11024r[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: K(I)Lcom/google/android/gms/internal/measurement/w2; */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0880w2
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C0855r2 K(int i) {
        if (i >= this.f11025s) {
            return new C0855r2(i == 0 ? f11022t : Arrays.copyOf(this.f11024r, i), this.f11025s, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        j(i);
        return Integer.valueOf(this.f11024r[i]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h(int i) {
        j(i);
        return this.f11024r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.Z1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i7 = 0; i7 < this.f11025s; i7++) {
            i = (i * 31) + this.f11024r[i7];
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(int i) {
        d();
        int i7 = this.f11025s;
        int length = this.f11024r.length;
        if (i7 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f11024r, 0, iArr, 0, this.f11025s);
            this.f11024r = iArr;
        }
        int[] iArr2 = this.f11024r;
        int i8 = this.f11025s;
        this.f11025s = i8 + 1;
        iArr2[i8] = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f11025s;
        for (int i7 = 0; i7 < i; i7++) {
            if (this.f11024r[i7] == iIntValue) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i) {
        if (i < 0 || i >= this.f11025s) {
            throw new IndexOutOfBoundsException(C0776b2.a(this.f11025s, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.Z1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        d();
        j(i);
        int[] iArr = this.f11024r;
        int i7 = iArr[i];
        if (i < this.f11025s - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f11025s--;
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
        int[] iArr = this.f11024r;
        System.arraycopy(iArr, i7, iArr, i, this.f11025s - i7);
        this.f11025s -= i7 - i;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        j(i);
        int[] iArr = this.f11024r;
        int i7 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11025s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
