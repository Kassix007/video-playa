package R4;

/* JADX INFO: loaded from: classes.dex */
public final class D0 {
    public static final C0 Companion = new C0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6746b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ D0(String str, String str2, int i) {
        if ((i & 1) == 0) {
            this.f6745a = null;
        } else {
            this.f6745a = str;
        }
        if ((i & 2) == 0) {
            this.f6746b = null;
        } else {
            this.f6746b = str2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        return kotlin.jvm.internal.m.a(this.f6745a, d02.f6745a) && kotlin.jvm.internal.m.a(this.f6746b, d02.f6746b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6745a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6746b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FloatingActionMenuMapping(link=" + this.f6745a + ", type=" + this.f6746b + ")";
    }
}
