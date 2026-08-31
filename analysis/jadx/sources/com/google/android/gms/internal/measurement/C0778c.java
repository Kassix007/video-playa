package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0778c implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Iterator f10811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Iterator f10812r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0778c(C0783d c0783d, Iterator it, Iterator it2) {
        this.f10811q = it;
        this.f10812r = it2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10811q.hasNext()) {
            return true;
        }
        return this.f10812r.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f10811q;
        if (it.hasNext()) {
            return new C0848q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f10812r;
        if (it2.hasNext()) {
            return new C0848q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
