package m5;

/* JADX INFO: renamed from: m5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1381t implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f15093q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [kotlin.jvm.internal.b.next():java.lang.Object] */
    public /* synthetic */ C1381t(long j) {
        this.f15093q = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C1381t) obj).f15093q;
        long j7 = this.f15093q ^ Long.MIN_VALUE;
        long j8 = j ^ Long.MIN_VALUE;
        if (j7 < j8) {
            return -1;
        }
        return j7 == j8 ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1381t) {
            return this.f15093q == ((C1381t) obj).f15093q;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f15093q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC1362a.h(10, this.f15093q);
    }
}
