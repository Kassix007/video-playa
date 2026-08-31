package Z4;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8506b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ u(int i, Long l7, String str) {
        if ((i & 1) == 0) {
            this.f8505a = null;
        } else {
            this.f8505a = l7;
        }
        if ((i & 2) == 0) {
            this.f8506b = null;
        } else {
            this.f8506b = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.f8505a, uVar.f8505a) && kotlin.jvm.internal.m.a(this.f8506b, uVar.f8506b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Long l7 = this.f8505a;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        String str = this.f8506b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OfferCardSchedule(duration=" + this.f8505a + ", unit=" + this.f8506b + ")";
    }
}
