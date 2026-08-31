package m5;

/* JADX INFO: renamed from: m5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1384w implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final short f15096q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [kotlin.jvm.internal.b.next():java.lang.Object] */
    public /* synthetic */ C1384w(short s6) {
        this.f15096q = s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.m.f(this.f15096q & 65535, ((C1384w) obj).f15096q & 65535);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1384w) {
            return this.f15096q == ((C1384w) obj).f15096q;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Short.hashCode(this.f15096q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return String.valueOf(this.f15096q & 65535);
    }
}
