package P;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f5343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5344b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public N(Integer num, Object obj) {
        this.f5343a = num;
        this.f5344b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n7 = (N) obj;
        return this.f5343a.equals(n7.f5343a) && kotlin.jvm.internal.m.a(this.f5344b, n7.f5344b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f5343a.hashCode() * 31;
        Object obj = this.f5344b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "JoinedKey(left=" + this.f5343a + ", right=" + this.f5344b + ')';
    }
}
