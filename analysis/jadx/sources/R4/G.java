package R4;

/* JADX INFO: loaded from: classes.dex */
public final class G {
    public static final F Companion = new F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f6759b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ G(int i, Boolean bool, D d5) {
        this.f6758a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.f6759b = null;
        } else {
            this.f6759b = d5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g7 = (G) obj;
        return kotlin.jvm.internal.m.a(this.f6758a, g7.f6758a) && kotlin.jvm.internal.m.a(this.f6759b, g7.f6759b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f6758a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        D d5 = this.f6759b;
        return iHashCode + (d5 != null ? d5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ConnectData(active=" + this.f6758a + ", data=" + this.f6759b + ")";
    }
}
