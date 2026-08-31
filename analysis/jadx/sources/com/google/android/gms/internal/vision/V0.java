package com.google.android.gms.internal.vision;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class V0 implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Iterator f11240q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11240q.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f11240q.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
