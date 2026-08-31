package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class D2 extends Z1 implements RandomAccess, InterfaceC0875v2, O2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long[] f10619t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final D2 f10620u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long[] f10621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10622s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long[] jArr = new long[0];
        f10619t = jArr;
        f10620u = new D2(jArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D2(long[] jArr, int i, boolean z5) {
        super(z5);
        this.f10621r = jArr;
        this.f10622s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i7;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i < 0 || i > (i7 = this.f10622s)) {
            throw new IndexOutOfBoundsException(C0776b2.a(this.f10622s, i, (byte) 13, "Index:", ", Size:"));
        }
        int i8 = i + 1;
        long[] jArr = this.f10621r;
        int length = jArr.length;
        if (i7 < length) {
            System.arraycopy(jArr, i, jArr, i8, i7 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f10621r, 0, jArr2, 0, i);
            System.arraycopy(this.f10621r, i, jArr2, i8, this.f10622s - i);
            this.f10621r = jArr2;
        }
        this.f10621r[i] = jLongValue;
        this.f10622s++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.Z1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = AbstractC0885x2.f11122a;
        collection.getClass();
        if (!(collection instanceof D2)) {
            return super.addAll(collection);
        }
        D2 d22 = (D2) collection;
        int i = d22.f10622s;
        if (i == 0) {
            return false;
        }
        int i7 = this.f10622s;
        if (Integer.MAX_VALUE - i7 < i) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i;
        long[] jArr = this.f10621r;
        if (i8 > jArr.length) {
            this.f10621r = Arrays.copyOf(jArr, i8);
        }
        System.arraycopy(d22.f10621r, 0, this.f10621r, this.f10622s, d22.f10622s);
        this.f10622s = i8;
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
        if (!(obj instanceof D2)) {
            return super.equals(obj);
        }
        D2 d22 = (D2) obj;
        if (this.f10622s != d22.f10622s) {
            return false;
        }
        long[] jArr = d22.f10621r;
        for (int i = 0; i < this.f10622s; i++) {
            if (this.f10621r[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long g(int i) {
        j(i);
        return this.f10621r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        j(i);
        return Long.valueOf(this.f10621r[i]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: K(I)Lcom/google/android/gms/internal/measurement/w2; */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0880w2
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final D2 K(int i) {
        if (i >= this.f10622s) {
            return new D2(i == 0 ? f10619t : Arrays.copyOf(this.f10621r, i), this.f10622s, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.Z1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i7 = 0; i7 < this.f10622s; i7++) {
            long j = this.f10621r[i7];
            Charset charset = AbstractC0885x2.f11122a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(long j) {
        d();
        int i = this.f10622s;
        int length = this.f10621r.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f10621r, 0, jArr, 0, this.f10622s);
            this.f10621r = jArr;
        }
        long[] jArr2 = this.f10621r;
        int i7 = this.f10622s;
        this.f10622s = i7 + 1;
        jArr2[i7] = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f10622s;
        for (int i7 = 0; i7 < i; i7++) {
            if (this.f10621r[i7] == jLongValue) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i) {
        if (i < 0 || i >= this.f10622s) {
            throw new IndexOutOfBoundsException(C0776b2.a(this.f10622s, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.Z1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        d();
        j(i);
        long[] jArr = this.f10621r;
        long j = jArr[i];
        if (i < this.f10622s - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f10622s--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i7) {
        d();
        if (i7 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f10621r;
        System.arraycopy(jArr, i7, jArr, i, this.f10622s - i7);
        this.f10622s -= i7 - i;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        j(i);
        long[] jArr = this.f10621r;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10622s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }
}
