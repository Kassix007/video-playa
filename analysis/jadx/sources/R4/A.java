package R4;

/* JADX INFO: loaded from: classes.dex */
public final class A {
    public static final C0525z Companion = new C0525z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6721e;
    public final String f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ A(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        if ((i & 1) == 0) {
            this.f6717a = null;
        } else {
            this.f6717a = str;
        }
        if ((i & 2) == 0) {
            this.f6718b = null;
        } else {
            this.f6718b = str2;
        }
        if ((i & 4) == 0) {
            this.f6719c = null;
        } else {
            this.f6719c = str3;
        }
        if ((i & 8) == 0) {
            this.f6720d = null;
        } else {
            this.f6720d = str4;
        }
        if ((i & 16) == 0) {
            this.f6721e = null;
        } else {
            this.f6721e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a7 = (A) obj;
        return kotlin.jvm.internal.m.a(this.f6717a, a7.f6717a) && kotlin.jvm.internal.m.a(this.f6718b, a7.f6718b) && kotlin.jvm.internal.m.a(this.f6719c, a7.f6719c) && kotlin.jvm.internal.m.a(this.f6720d, a7.f6720d) && kotlin.jvm.internal.m.a(this.f6721e, a7.f6721e) && kotlin.jvm.internal.m.a(this.f, a7.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6717a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6718b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6719c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f6720d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f6721e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbR = C0.S.r("ButtonData(bgColor=", this.f6717a, ", fileName=", this.f6718b, ", shape=");
        k1.i.s(sbR, this.f6719c, ", position=", this.f6720d, ", url=");
        sbR.append(this.f6721e);
        sbR.append(", regex=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
