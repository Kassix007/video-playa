package R4;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {
    public static final F0 Companion = new F0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6763d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ G0(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f6760a = null;
        } else {
            this.f6760a = str;
        }
        if ((i & 2) == 0) {
            this.f6761b = null;
        } else {
            this.f6761b = str2;
        }
        if ((i & 4) == 0) {
            this.f6762c = null;
        } else {
            this.f6762c = str3;
        }
        if ((i & 8) == 0) {
            this.f6763d = null;
        } else {
            this.f6763d = str4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return kotlin.jvm.internal.m.a(this.f6760a, g02.f6760a) && kotlin.jvm.internal.m.a(this.f6761b, g02.f6761b) && kotlin.jvm.internal.m.a(this.f6762c, g02.f6762c) && kotlin.jvm.internal.m.a(this.f6763d, g02.f6763d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6760a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6761b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6762c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f6763d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbR = C0.S.r("FloatingActionMenuTab(url=", this.f6760a, ", icon=", this.f6761b, ", type=");
        sbR.append(this.f6762c);
        sbR.append(", label=");
        sbR.append(this.f6763d);
        sbR.append(")");
        return sbR.toString();
    }
}
