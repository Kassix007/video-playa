package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC0749h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final W f10447s;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f10448r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        W w3 = new W(new ArrayList(10));
        f10447s = w3;
        w3.f10505q = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public W(ArrayList arrayList) {
        this.f10448r = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        d();
        this.f10448r.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f10448r.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.A
    public final A n(int i) {
        ArrayList arrayList = this.f10448r;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new W(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        Object objRemove = this.f10448r.remove(i);
        ((AbstractList) this).modCount++;
        return objRemove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        Object obj2 = this.f10448r.set(i, obj);
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10448r.size();
    }
}
