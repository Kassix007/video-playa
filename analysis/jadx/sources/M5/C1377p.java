package m5;

/* JADX INFO: renamed from: m5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1377p implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte f15089q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [kotlin.jvm.internal.b.next():java.lang.Object] */
    public /* synthetic */ C1377p(byte b7) {
        this.f15089q = b7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.m.f(this.f15089q & 255, ((C1377p) obj).f15089q & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1377p) {
            return this.f15089q == ((C1377p) obj).f15089q;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Byte.hashCode(this.f15089q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return String.valueOf(this.f15089q & 255);
    }
}
