package R4;

/* JADX INFO: renamed from: R4.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0504t2 {
    public static final C0500s2 Companion = new C0500s2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7192d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0504t2(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f7189a = null;
        } else {
            this.f7189a = str;
        }
        if ((i & 2) == 0) {
            this.f7190b = null;
        } else {
            this.f7190b = str2;
        }
        if ((i & 4) == 0) {
            this.f7191c = null;
        } else {
            this.f7191c = str3;
        }
        if ((i & 8) == 0) {
            this.f7192d = null;
        } else {
            this.f7192d = str4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0504t2)) {
            return false;
        }
        C0504t2 c0504t2 = (C0504t2) obj;
        return kotlin.jvm.internal.m.a(this.f7189a, c0504t2.f7189a) && kotlin.jvm.internal.m.a(this.f7190b, c0504t2.f7190b) && kotlin.jvm.internal.m.a(this.f7191c, c0504t2.f7191c) && kotlin.jvm.internal.m.a(this.f7192d, c0504t2.f7192d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f7189a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7190b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7191c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f7192d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbR = C0.S.r("Rule(regex=", this.f7189a, ", pageType=", this.f7190b, ", label=");
        sbR.append(this.f7191c);
        sbR.append(", type=");
        sbR.append(this.f7192d);
        sbR.append(")");
        return sbR.toString();
    }
}
