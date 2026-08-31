package R4;

/* JADX INFO: loaded from: classes.dex */
public final class S0 {
    public static final R0 Companion = new R0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f6849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f6850e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ S0(int i, String str, int i7, String str2, Integer num, Boolean bool) {
        this.f6846a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f6847b = 0;
        } else {
            this.f6847b = i7;
        }
        if ((i & 4) == 0) {
            this.f6848c = "#ffffff";
        } else {
            this.f6848c = str2;
        }
        if ((i & 8) == 0) {
            this.f6849d = 0;
        } else {
            this.f6849d = num;
        }
        if ((i & 16) == 0) {
            this.f6850e = Boolean.FALSE;
        } else {
            this.f6850e = bool;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0)) {
            return false;
        }
        S0 s02 = (S0) obj;
        return kotlin.jvm.internal.m.a(this.f6846a, s02.f6846a) && this.f6847b == s02.f6847b && kotlin.jvm.internal.m.a(this.f6848c, s02.f6848c) && kotlin.jvm.internal.m.a(this.f6849d, s02.f6849d) && kotlin.jvm.internal.m.a(this.f6850e, s02.f6850e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6846a;
        int iC = k1.i.c(this.f6847b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f6848c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f6849d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f6850e;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HeaderConfiguration(headerStyle=" + this.f6846a + ", spaceFromTop=" + this.f6847b + ", headerBgColor=" + this.f6848c + ", spaceFromSides=" + this.f6849d + ", enableFloatingHeader=" + this.f6850e + ")";
    }
}
