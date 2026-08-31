package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0930q0 extends M implements InterfaceC0933s0, RandomAccess {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f11310r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C0930q0(10).f11206q = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0930q0(int i) {
        this(new ArrayList(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.InterfaceC0933s0
    public final void M(P p7) {
        d();
        this.f11310r.add(p7);
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.InterfaceC0924n0
    public final InterfaceC0924n0 a(int i) {
        ArrayList arrayList = this.f11310r;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C0930q0(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        d();
        this.f11310r.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.M, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f11310r.size(), collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.InterfaceC0933s0
    public final List b() {
        return Collections.unmodifiableList(this.f11310r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.InterfaceC0933s0
    public final InterfaceC0933s0 c() {
        return this.f11206q ? new Q0(this) : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.M, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f11310r.clear();
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.InterfaceC0933s0
    public final Object e(int i) {
        return this.f11310r.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f11310r;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof P)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, AbstractC0914i0.f11272a);
            if (X0.f11248a.s(bArr, 0, bArr.length)) {
                arrayList.set(i, str);
            }
            return str;
        }
        P p7 = (P) obj;
        p7.getClass();
        String str2 = p7.g() == 0 ? "" : new String(p7.f11221r, p7.k(), p7.g(), AbstractC0914i0.f11272a);
        int iK = p7.k();
        if (X0.f11248a.s(p7.f11221r, iK, p7.g() + iK)) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.M, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        Object objRemove = this.f11310r.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof P)) {
            return new String((byte[]) objRemove, AbstractC0914i0.f11272a);
        }
        P p7 = (P) objRemove;
        p7.getClass();
        return p7.g() == 0 ? "" : new String(p7.f11221r, p7.k(), p7.g(), AbstractC0914i0.f11272a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        Object obj2 = this.f11310r.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof P)) {
            return new String((byte[]) obj2, AbstractC0914i0.f11272a);
        }
        P p7 = (P) obj2;
        p7.getClass();
        return p7.g() == 0 ? "" : new String(p7.f11221r, p7.k(), p7.g(), AbstractC0914i0.f11272a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11310r.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0930q0(ArrayList arrayList) {
        this.f11310r = arrayList;
    }

    @Override // com.google.android.gms.internal.vision.M, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        d();
        if (collection instanceof InterfaceC0933s0) {
            collection = ((InterfaceC0933s0) collection).b();
        }
        boolean zAddAll = this.f11310r.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
