package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0749h implements E, RandomAccess {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f10405r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new D(10).f10505q = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(int i) {
        this(new ArrayList(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.E
    public final E G() {
        return this.f10505q ? new C0743d0(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        d();
        this.f10405r.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.AbstractC0749h, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        d();
        if (collection instanceof E) {
            collection = ((E) collection).v();
        }
        boolean zAddAll = this.f10405r.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC0749h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f10405r.clear();
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f10405r;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C0754m)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, AbstractC0765y.f10579a);
            if (k0.f10523a.t(bArr, 0, bArr.length)) {
                arrayList.set(i, str);
            }
            return str;
        }
        C0754m c0754m = (C0754m) obj;
        c0754m.getClass();
        String str2 = c0754m.size() == 0 ? "" : new String(c0754m.f10533r, c0754m.d(), c0754m.size(), AbstractC0765y.f10579a);
        int iD = c0754m.d();
        if (k0.f10523a.t(c0754m.f10533r, iD, c0754m.size() + iD)) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.A
    public final A n(int i) {
        ArrayList arrayList = this.f10405r;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new D(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        Object objRemove = this.f10405r.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C0754m)) {
            return new String((byte[]) objRemove, AbstractC0765y.f10579a);
        }
        C0754m c0754m = (C0754m) objRemove;
        c0754m.getClass();
        return c0754m.size() == 0 ? "" : new String(c0754m.f10533r, c0754m.d(), c0754m.size(), AbstractC0765y.f10579a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        Object obj2 = this.f10405r.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0754m)) {
            return new String((byte[]) obj2, AbstractC0765y.f10579a);
        }
        C0754m c0754m = (C0754m) obj2;
        c0754m.getClass();
        return c0754m.size() == 0 ? "" : new String(c0754m.f10533r, c0754m.d(), c0754m.size(), AbstractC0765y.f10579a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10405r.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.E
    public final List v() {
        return Collections.unmodifiableList(this.f10405r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public D(ArrayList arrayList) {
        this.f10405r = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.google.android.gms.internal.clearcut.AbstractC0749h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f10405r.size(), collection);
    }
}
