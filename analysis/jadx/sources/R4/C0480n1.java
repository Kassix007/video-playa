package R4;

/* JADX INFO: renamed from: R4.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0480n1 {
    public static final C0476m1 Companion = new C0476m1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7137b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0480n1(String str, String str2, int i) {
        if ((i & 1) == 0) {
            this.f7136a = null;
        } else {
            this.f7136a = str;
        }
        if ((i & 2) == 0) {
            this.f7137b = null;
        } else {
            this.f7137b = str2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0480n1)) {
            return false;
        }
        C0480n1 c0480n1 = (C0480n1) obj;
        return kotlin.jvm.internal.m.a(this.f7136a, c0480n1.f7136a) && kotlin.jvm.internal.m.a(this.f7137b, c0480n1.f7137b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f7136a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7137b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Mapping(link=" + this.f7136a + ", type=" + this.f7137b + ")";
    }
}
