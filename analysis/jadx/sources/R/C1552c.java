package r;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: r.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1552c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16191q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16192r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16193s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1554e f16194t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1552c(C1554e c1554e) {
        this.f16194t = c1554e;
        this.f16191q = c1554e.f16166s - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f16193s) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f16192r;
        C1554e c1554e = this.f16194t;
        return kotlin.jvm.internal.m.a(key, c1554e.f(i)) && kotlin.jvm.internal.m.a(entry.getValue(), c1554e.i(this.f16192r));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f16193s) {
            return this.f16194t.f(this.f16192r);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f16193s) {
            return this.f16194t.i(this.f16192r);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16192r < this.f16191q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f16193s) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f16192r;
        C1554e c1554e = this.f16194t;
        Object objF = c1554e.f(i);
        Object objI = c1554e.i(this.f16192r);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16192r++;
        this.f16193s = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16193s) {
            throw new IllegalStateException();
        }
        this.f16194t.g(this.f16192r);
        this.f16192r--;
        this.f16191q--;
        this.f16193s = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f16193s) {
            return this.f16194t.h(this.f16192r, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
