package R4;

/* JADX INFO: loaded from: classes.dex */
public final class U1 {
    public static final T1 Companion = new T1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6866d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ U1(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f6863a = null;
        } else {
            this.f6863a = str;
        }
        if ((i & 2) == 0) {
            this.f6864b = null;
        } else {
            this.f6864b = str2;
        }
        if ((i & 4) == 0) {
            this.f6865c = null;
        } else {
            this.f6865c = str3;
        }
        if ((i & 8) == 0) {
            this.f6866d = null;
        } else {
            this.f6866d = str4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U1)) {
            return false;
        }
        U1 u12 = (U1) obj;
        return kotlin.jvm.internal.m.a(this.f6863a, u12.f6863a) && kotlin.jvm.internal.m.a(this.f6864b, u12.f6864b) && kotlin.jvm.internal.m.a(this.f6865c, u12.f6865c) && kotlin.jvm.internal.m.a(this.f6866d, u12.f6866d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6863a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6864b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6865c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f6866d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbR = C0.S.r("PageIndicator(activeColor=", this.f6863a, ", inactiveColor=", this.f6864b, ", position=");
        sbR.append(this.f6865c);
        sbR.append(", type=");
        sbR.append(this.f6866d);
        sbR.append(")");
        return sbR.toString();
    }
}
