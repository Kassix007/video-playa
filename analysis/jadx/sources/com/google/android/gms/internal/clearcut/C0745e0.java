package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0745e0 implements ListIterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ListIterator f10500q;

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f10500q.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10500q.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f10500q.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10500q.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f10500q.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10500q.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
