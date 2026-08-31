package R4;

/* JADX INFO: loaded from: classes.dex */
public final class b3 {
    public static final a3 Companion = new a3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6916b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b3(String str, String str2, int i) {
        if ((i & 1) == 0) {
            this.f6915a = null;
        } else {
            this.f6915a = str;
        }
        if ((i & 2) == 0) {
            this.f6916b = null;
        } else {
            this.f6916b = str2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return kotlin.jvm.internal.m.a(this.f6915a, b3Var.f6915a) && kotlin.jvm.internal.m.a(this.f6916b, b3Var.f6916b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6915a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6916b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TopAppBarMapping(link=" + this.f6915a + ", type=" + this.f6916b + ")";
    }
}
