package R4;

/* JADX INFO: loaded from: classes.dex */
public final class Y {
    public static final X Companion = new X();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6888e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f6890h;
    public final String i;
    public final Integer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6891k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Y(int i, Boolean bool, boolean z5, String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2, String str7) {
        if (640 != (i & 640)) {
            Z5.N.e(i, 640, W.f6880a.b());
            throw null;
        }
        this.f6884a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.f6885b = false;
        } else {
            this.f6885b = z5;
        }
        if ((i & 4) == 0) {
            this.f6886c = "Download History";
        } else {
            this.f6886c = str;
        }
        if ((i & 8) == 0) {
            this.f6887d = "#231232";
        } else {
            this.f6887d = str2;
        }
        if ((i & 16) == 0) {
            this.f6888e = "#23ffff";
        } else {
            this.f6888e = str3;
        }
        if ((i & 32) == 0) {
            this.f = "#23ffff";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.f6889g = "#23ffff";
        } else {
            this.f6889g = str5;
        }
        this.f6890h = num;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
        this.j = num2;
        if ((i & 1024) == 0) {
            this.f6891k = "#ffffff";
        } else {
            this.f6891k = str7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y6 = (Y) obj;
        return kotlin.jvm.internal.m.a(this.f6884a, y6.f6884a) && this.f6885b == y6.f6885b && kotlin.jvm.internal.m.a(this.f6886c, y6.f6886c) && kotlin.jvm.internal.m.a(this.f6887d, y6.f6887d) && kotlin.jvm.internal.m.a(this.f6888e, y6.f6888e) && kotlin.jvm.internal.m.a(this.f, y6.f) && kotlin.jvm.internal.m.a(this.f6889g, y6.f6889g) && kotlin.jvm.internal.m.a(this.f6890h, y6.f6890h) && kotlin.jvm.internal.m.a(this.i, y6.i) && kotlin.jvm.internal.m.a(this.j, y6.j) && kotlin.jvm.internal.m.a(this.f6891k, y6.f6891k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f6884a;
        int iE = k1.i.e((bool == null ? 0 : bool.hashCode()) * 31, 31, this.f6885b);
        String str = this.f6886c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6887d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6888e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f6889g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f6890h;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.j;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.f6891k;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadFileManager(enable=");
        sb.append(this.f6884a);
        sb.append(", showOfflineOnNoInternetScreen=");
        sb.append(this.f6885b);
        sb.append(", title=");
        k1.i.s(sb, this.f6886c, ", titleBarBgColor=", this.f6887d, ", titleBarContentColor=");
        k1.i.s(sb, this.f6888e, ", btnBgColor=", this.f, ", borderColor=");
        sb.append(this.f6889g);
        sb.append(", borderWidth=");
        sb.append(this.f6890h);
        sb.append(", downloadButtonText=");
        sb.append(this.i);
        sb.append(", roundedCornerPercent=");
        sb.append(this.j);
        sb.append(", textColor=");
        return k1.i.k(sb, this.f6891k, ")");
    }
}
