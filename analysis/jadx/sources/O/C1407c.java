package o;

import java.util.Map;

/* JADX INFO: renamed from: o.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1407c implements Map.Entry {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f15310q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f15311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1407c f15312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1407c f15313t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1407c(Object obj, Object obj2) {
        this.f15310q = obj;
        this.f15311r = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1407c)) {
            return false;
        }
        C1407c c1407c = (C1407c) obj;
        return this.f15310q.equals(c1407c.f15310q) && this.f15311r.equals(c1407c.f15311r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15310q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15311r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f15310q.hashCode() ^ this.f15311r.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f15310q + "=" + this.f15311r;
    }
}
