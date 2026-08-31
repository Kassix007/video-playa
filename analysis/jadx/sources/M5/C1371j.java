package m5;

import java.io.Serializable;

/* JADX INFO: renamed from: m5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1371j implements Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f15080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f15081r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1371j(Object obj, Object obj2) {
        this.f15080q = obj;
        this.f15081r = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1371j)) {
            return false;
        }
        C1371j c1371j = (C1371j) obj;
        return kotlin.jvm.internal.m.a(this.f15080q, c1371j.f15080q) && kotlin.jvm.internal.m.a(this.f15081r, c1371j.f15081r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f15080q;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f15081r;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f15080q + ", " + this.f15081r + ')';
    }
}
