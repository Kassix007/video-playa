package R4;

/* JADX INFO: loaded from: classes.dex */
public final class P0 {
    public static final O0 Companion = new O0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f6831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6832e;
    public final String f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ P0(int i, String str, String str2, String str3, Boolean bool, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f6828a = null;
        } else {
            this.f6828a = str;
        }
        if ((i & 2) == 0) {
            this.f6829b = null;
        } else {
            this.f6829b = str2;
        }
        if ((i & 4) == 0) {
            this.f6830c = null;
        } else {
            this.f6830c = str3;
        }
        if ((i & 8) == 0) {
            this.f6831d = null;
        } else {
            this.f6831d = bool;
        }
        if ((i & 16) == 0) {
            this.f6832e = null;
        } else {
            this.f6832e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return false;
        }
        P0 p02 = (P0) obj;
        return kotlin.jvm.internal.m.a(this.f6828a, p02.f6828a) && kotlin.jvm.internal.m.a(this.f6829b, p02.f6829b) && kotlin.jvm.internal.m.a(this.f6830c, p02.f6830c) && kotlin.jvm.internal.m.a(this.f6831d, p02.f6831d) && kotlin.jvm.internal.m.a(this.f6832e, p02.f6832e) && kotlin.jvm.internal.m.a(this.f, p02.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6828a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6829b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6830c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f6831d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f6832e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbR = C0.S.r("GoogleSocialLogin(clientId=", this.f6828a, ", serverClientId=", this.f6829b, ", logoutUrl=");
        sbR.append(this.f6830c);
        sbR.append(", isLoginFlowEnabled=");
        sbR.append(this.f6831d);
        sbR.append(", flowType=");
        sbR.append(this.f6832e);
        sbR.append(", callbackFunctionName=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
