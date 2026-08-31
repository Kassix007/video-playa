package m5;

/* JADX INFO: renamed from: m5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1368g implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1368g f15075r = new C1368g();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15076q = 131584;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1368g other = (C1368g) obj;
        kotlin.jvm.internal.m.e(other, "other");
        return this.f15076q - other.f15076q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1368g c1368g = obj instanceof C1368g ? (C1368g) obj : null;
        return c1368g != null && this.f15076q == c1368g.f15076q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f15076q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "2.2.0";
    }
}
