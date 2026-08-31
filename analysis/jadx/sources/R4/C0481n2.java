package R4;

/* JADX INFO: renamed from: R4.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0481n2 {
    public static final C0477m2 Companion = new C0477m2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7139b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0481n2(String str, String str2, int i) {
        if ((i & 1) == 0) {
            this.f7138a = null;
        } else {
            this.f7138a = str;
        }
        if ((i & 2) == 0) {
            this.f7139b = null;
        } else {
            this.f7139b = str2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0481n2)) {
            return false;
        }
        C0481n2 c0481n2 = (C0481n2) obj;
        return kotlin.jvm.internal.m.a(this.f7138a, c0481n2.f7138a) && kotlin.jvm.internal.m.a(this.f7139b, c0481n2.f7139b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f7138a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7139b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RichBottomBarMapping(link=" + this.f7138a + ", type=" + this.f7139b + ")";
    }
}
