package Z4;

import C0.S;

/* JADX INFO: renamed from: Z4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0564f {
    public static final C0563e Companion = new C0563e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0570l f8489d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0564f(int i, String str, String str2, String str3, C0570l c0570l) {
        this.f8486a = (i & 1) == 0 ? "SMALL" : str;
        if ((i & 2) == 0) {
            this.f8487b = "RIGHT";
        } else {
            this.f8487b = str2;
        }
        if ((i & 4) == 0) {
            this.f8488c = "#000000";
        } else {
            this.f8488c = str3;
        }
        if ((i & 8) == 0) {
            this.f8489d = null;
        } else {
            this.f8489d = c0570l;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0564f)) {
            return false;
        }
        C0564f c0564f = (C0564f) obj;
        return kotlin.jvm.internal.m.a(this.f8486a, c0564f.f8486a) && kotlin.jvm.internal.m.a(this.f8487b, c0564f.f8487b) && kotlin.jvm.internal.m.a(this.f8488c, c0564f.f8488c) && kotlin.jvm.internal.m.a(this.f8489d, c0564f.f8489d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f8486a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8487b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8488c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C0570l c0570l = this.f8489d;
        return iHashCode3 + (c0570l != null ? c0570l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbR = S.r("Card(size=", this.f8486a, ", position=", this.f8487b, ", bgColor=");
        sbR.append(this.f8488c);
        sbR.append(", content=");
        sbR.append(this.f8489d);
        sbR.append(")");
        return sbR.toString();
    }
}
