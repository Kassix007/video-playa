package n5;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15303b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v(int i, Object obj) {
        this.f15302a = i;
        this.f15303b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f15302a == vVar.f15302a && kotlin.jvm.internal.m.a(this.f15303b, vVar.f15303b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f15302a) * 31;
        Object obj = this.f15303b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "IndexedValue(index=" + this.f15302a + ", value=" + this.f15303b + ')';
    }
}
