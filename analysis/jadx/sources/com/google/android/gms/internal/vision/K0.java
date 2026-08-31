package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends M implements RandomAccess {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final K0 f11201t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f11202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11203s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        K0 k02 = new K0(0, new Object[0]);
        f11201t = k02;
        k02.f11206q = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public K0(int i, Object[] objArr) {
        this.f11202r = objArr;
        this.f11203s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.InterfaceC0924n0
    public final /* synthetic */ InterfaceC0924n0 a(int i) {
        if (i < this.f11203s) {
            throw new IllegalArgumentException();
        }
        return new K0(this.f11203s, Arrays.copyOf(this.f11202r, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.M, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i = this.f11203s;
        Object[] objArr = this.f11202r;
        if (i == objArr.length) {
            this.f11202r = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f11202r;
        int i7 = this.f11203s;
        this.f11203s = i7 + 1;
        objArr2[i7] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i) {
        if (i < 0 || i >= this.f11203s) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g(i);
        return this.f11202r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String h(int i) {
        int i7 = this.f11203s;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i7);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.M, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        g(i);
        Object[] objArr = this.f11202r;
        Object obj = objArr[i];
        if (i < this.f11203s - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f11203s--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        g(i);
        Object[] objArr = this.f11202r;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11203s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i7;
        d();
        if (i >= 0 && i <= (i7 = this.f11203s)) {
            Object[] objArr = this.f11202r;
            if (i7 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i7 - i);
            } else {
                Object[] objArr2 = new Object[((i7 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f11202r, i, objArr2, i + 1, this.f11203s - i);
                this.f11202r = objArr2;
            }
            this.f11202r[i] = obj;
            this.f11203s++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i));
    }
}
