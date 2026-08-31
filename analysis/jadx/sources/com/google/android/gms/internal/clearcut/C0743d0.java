package com.google.android.gms.internal.clearcut;

import O3.C0322t;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0743d0 extends AbstractList implements E, RandomAccess {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final D f10499q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0743d0(D d5) {
        this.f10499q = d5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.E
    public final E G() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f10499q.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C0322t c0322t = new C0322t();
        c0322t.f5050r = this.f10499q.iterator();
        return c0322t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C0745e0 c0745e0 = new C0745e0();
        c0745e0.f10500q = this.f10499q.listIterator(i);
        return c0745e0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10499q.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.E
    public final List v() {
        return Collections.unmodifiableList(this.f10499q.f10405r);
    }
}
