package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class W2 implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Iterator f10747s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ U2 f10748t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ W2(U2 u22) {
        Objects.requireNonNull(u22);
        this.f10748t = u22;
        this.f10745q = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Iterator a() {
        if (this.f10747s == null) {
            this.f10747s = this.f10748t.f10716s.entrySet().iterator();
        }
        return this.f10747s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f10745q + 1;
        U2 u22 = this.f10748t;
        if (i >= u22.f10715r) {
            return !u22.f10716s.isEmpty() && a().hasNext();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f10746r = true;
        int i = this.f10745q + 1;
        this.f10745q = i;
        U2 u22 = this.f10748t;
        return i < u22.f10715r ? (V2) u22.f10714q[i] : (Map.Entry) a().next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10746r) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f10746r = false;
        U2 u22 = this.f10748t;
        u22.f();
        int i = this.f10745q;
        if (i >= u22.f10715r) {
            a().remove();
        } else {
            this.f10745q = i - 1;
            u22.d(i);
        }
    }
}
