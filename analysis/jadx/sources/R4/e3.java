package R4;

/* JADX INFO: loaded from: classes.dex */
public final class e3 {
    public static final d3 Companion = new d3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6943b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e3(String str, String str2, int i) {
        if ((i & 1) == 0) {
            this.f6942a = null;
        } else {
            this.f6942a = str;
        }
        if ((i & 2) == 0) {
            this.f6943b = null;
        } else {
            this.f6943b = str2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return kotlin.jvm.internal.m.a(this.f6942a, e3Var.f6942a) && kotlin.jvm.internal.m.a(this.f6943b, e3Var.f6943b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6942a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6943b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "UrlRedirecting(mainUrl=" + this.f6942a + ", redirectUrl=" + this.f6943b + ")";
    }
}
