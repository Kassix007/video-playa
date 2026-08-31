package R4;

/* JADX INFO: loaded from: classes.dex */
public final class D {
    public static final C Companion = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f6743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6744d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ D(int i, String str, String str2, J j, String str3) {
        if ((i & 1) == 0) {
            this.f6741a = null;
        } else {
            this.f6741a = str;
        }
        if ((i & 2) == 0) {
            this.f6742b = null;
        } else {
            this.f6742b = str2;
        }
        if ((i & 4) == 0) {
            this.f6743c = null;
        } else {
            this.f6743c = j;
        }
        if ((i & 8) == 0) {
            this.f6744d = null;
        } else {
            this.f6744d = str3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d5 = (D) obj;
        return kotlin.jvm.internal.m.a(this.f6741a, d5.f6741a) && kotlin.jvm.internal.m.a(this.f6742b, d5.f6742b) && kotlin.jvm.internal.m.a(this.f6743c, d5.f6743c) && kotlin.jvm.internal.m.a(this.f6744d, d5.f6744d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6741a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6742b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        J j = this.f6743c;
        int iHashCode3 = (iHashCode2 + (j == null ? 0 : j.hashCode())) * 31;
        String str3 = this.f6744d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbR = C0.S.r("ConnectButton(iconPosition=", this.f6741a, ", widgetId=", this.f6742b, ", pageSetting=");
        sbR.append(this.f6743c);
        sbR.append(", fileName=");
        sbR.append(this.f6744d);
        sbR.append(")");
        return sbR.toString();
    }
}
