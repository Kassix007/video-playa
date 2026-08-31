package R4;

/* JADX INFO: renamed from: R4.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0435c0 {
    public static final C0431b0 Companion = new C0431b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6926e;
    public final String f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0435c0(int i, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f6922a = null;
        } else {
            this.f6922a = num;
        }
        if ((i & 2) == 0) {
            this.f6923b = null;
        } else {
            this.f6923b = num2;
        }
        if ((i & 4) == 0) {
            this.f6924c = null;
        } else {
            this.f6924c = str;
        }
        if ((i & 8) == 0) {
            this.f6925d = null;
        } else {
            this.f6925d = str2;
        }
        if ((i & 16) == 0) {
            this.f6926e = null;
        } else {
            this.f6926e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0435c0)) {
            return false;
        }
        C0435c0 c0435c0 = (C0435c0) obj;
        return kotlin.jvm.internal.m.a(this.f6922a, c0435c0.f6922a) && kotlin.jvm.internal.m.a(this.f6923b, c0435c0.f6923b) && kotlin.jvm.internal.m.a(this.f6924c, c0435c0.f6924c) && kotlin.jvm.internal.m.a(this.f6925d, c0435c0.f6925d) && kotlin.jvm.internal.m.a(this.f6926e, c0435c0.f6926e) && kotlin.jvm.internal.m.a(this.f, c0435c0.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Integer num = this.f6922a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f6923b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f6924c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6925d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6926e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Element(fontSize=");
        sb.append(this.f6922a);
        sb.append(", fontWeight=");
        sb.append(this.f6923b);
        sb.append(", textColor=");
        k1.i.s(sb, this.f6924c, ", type=", this.f6925d, ", fileName=");
        sb.append(this.f6926e);
        sb.append(", value=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
