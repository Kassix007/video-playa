package R4;

/* JADX INFO: loaded from: classes.dex */
public final class I1 {
    public static final H1 Companion = new H1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6775b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ I1(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.f6774a = null;
        } else {
            this.f6774a = bool;
        }
        if ((i & 2) == 0) {
            this.f6775b = null;
        } else {
            this.f6775b = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I1)) {
            return false;
        }
        I1 i12 = (I1) obj;
        return kotlin.jvm.internal.m.a(this.f6774a, i12.f6774a) && kotlin.jvm.internal.m.a(this.f6775b, i12.f6775b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f6774a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f6775b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NotificationPermissionOnLaunch(enable=" + this.f6774a + ", url=" + this.f6775b + ")";
    }
}
