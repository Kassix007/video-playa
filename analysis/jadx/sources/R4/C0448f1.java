package R4;

/* JADX INFO: renamed from: R4.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0448f1 {
    public static final C0444e1 Companion = new C0444e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f6952e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f6954h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0448f1(int i, String str, String str2, String str3, String str4, Double d5, String str5, String str6, Boolean bool) {
        this.f6948a = (i & 1) == 0 ? "MEDIUM" : str;
        if ((i & 2) == 0) {
            this.f6949b = "RECTANGLE";
        } else {
            this.f6949b = str2;
        }
        if ((i & 4) == 0) {
            this.f6950c = "";
        } else {
            this.f6950c = str3;
        }
        if ((i & 8) == 0) {
            this.f6951d = "";
        } else {
            this.f6951d = str4;
        }
        if ((i & 16) == 0) {
            this.f6952e = Double.valueOf(0.8d);
        } else {
            this.f6952e = d5;
        }
        if ((i & 32) == 0) {
            this.f = "#FFFFFF";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.f6953g = "#00ffffff";
        } else {
            this.f6953g = str6;
        }
        if ((i & 128) == 0) {
            this.f6954h = Boolean.FALSE;
        } else {
            this.f6954h = bool;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0448f1)) {
            return false;
        }
        C0448f1 c0448f1 = (C0448f1) obj;
        return kotlin.jvm.internal.m.a(this.f6948a, c0448f1.f6948a) && kotlin.jvm.internal.m.a(this.f6949b, c0448f1.f6949b) && kotlin.jvm.internal.m.a(this.f6950c, c0448f1.f6950c) && kotlin.jvm.internal.m.a(this.f6951d, c0448f1.f6951d) && kotlin.jvm.internal.m.a(this.f6952e, c0448f1.f6952e) && kotlin.jvm.internal.m.a(this.f, c0448f1.f) && kotlin.jvm.internal.m.a(this.f6953g, c0448f1.f6953g) && kotlin.jvm.internal.m.a(this.f6954h, c0448f1.f6954h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6948a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6949b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6950c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f6951d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d5 = this.f6952e;
        int iHashCode5 = (iHashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f6953g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f6954h;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbR = C0.S.r("LoaderConfig(animationSize=", this.f6948a, ", animationShape=", this.f6949b, ", animationBgColor=");
        k1.i.s(sbR, this.f6950c, ", type=", this.f6951d, ", loadPercentOffset=");
        sbR.append(this.f6952e);
        sbR.append(", loaderColor=");
        sbR.append(this.f);
        sbR.append(", bgColor=");
        sbR.append(this.f6953g);
        sbR.append(", enableShadow=");
        sbR.append(this.f6954h);
        sbR.append(")");
        return sbR.toString();
    }
}
