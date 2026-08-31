package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class Q2 extends Z1 implements RandomAccess {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object[] f10691t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Q2 f10692u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f10693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10694s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Object[] objArr = new Object[0];
        f10691t = objArr;
        f10692u = new Q2(objArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Q2(Object[] objArr, int i, boolean z5) {
        super(z5);
        this.f10693r = objArr;
        this.f10694s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0880w2
    public final /* bridge */ /* synthetic */ InterfaceC0880w2 K(int i) {
        if (i >= this.f10694s) {
            return new Q2(i == 0 ? f10691t : Arrays.copyOf(this.f10693r, i), this.f10694s, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i7;
        d();
        if (i < 0 || i > (i7 = this.f10694s)) {
            throw new IndexOutOfBoundsException(C0776b2.a(this.f10694s, i, (byte) 13, "Index:", ", Size:"));
        }
        int i8 = i + 1;
        Object[] objArr = this.f10693r;
        int length = objArr.length;
        if (i7 < length) {
            System.arraycopy(objArr, i, objArr, i8, i7 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f10693r, 0, objArr2, 0, i);
            System.arraycopy(this.f10693r, i, objArr2, i8, this.f10694s - i);
            this.f10693r = objArr2;
        }
        this.f10693r[i] = obj;
        this.f10694s++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i) {
        if (i < 0 || i >= this.f10694s) {
            throw new IndexOutOfBoundsException(C0776b2.a(this.f10694s, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g(i);
        return this.f10693r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.Z1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        g(i);
        Object[] objArr = this.f10693r;
        Object obj = objArr[i];
        if (i < this.f10694s - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f10694s--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        g(i);
        Object[] objArr = this.f10693r;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10694s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i = this.f10694s;
        int length = this.f10693r.length;
        if (i == length) {
            this.f10693r = Arrays.copyOf(this.f10693r, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f10693r;
        int i7 = this.f10694s;
        this.f10694s = i7 + 1;
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
