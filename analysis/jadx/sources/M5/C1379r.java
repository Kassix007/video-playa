package m5;

/* JADX INFO: renamed from: m5.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1379r implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15091q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [kotlin.jvm.internal.b.next():java.lang.Object] */
    public /* synthetic */ C1379r(int i) {
        this.f15091q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.m.f(this.f15091q ^ Integer.MIN_VALUE, ((C1379r) obj).f15091q ^ Integer.MIN_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1379r) {
            return this.f15091q == ((C1379r) obj).f15091q;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f15091q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return String.valueOf(((long) this.f15091q) & 4294967295L);
    }
}
