package R4;

/* JADX INFO: renamed from: R4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0434c {
    public static final C0430b Companion = new C0430b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6921e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0434c(int i, String str, Integer num, String str2, String str3, String str4) {
        if (13 != (i & 13)) {
            Z5.N.e(i, 13, C0426a.f6909a.b());
            throw null;
        }
        this.f6917a = str;
        if ((i & 2) == 0) {
            this.f6918b = 0;
        } else {
            this.f6918b = num;
        }
        this.f6919c = str2;
        this.f6920d = str3;
        if ((i & 16) == 0) {
            this.f6921e = "BOTTOM";
        } else {
            this.f6921e = str4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0434c)) {
            return false;
        }
        C0434c c0434c = (C0434c) obj;
        return kotlin.jvm.internal.m.a(this.f6917a, c0434c.f6917a) && kotlin.jvm.internal.m.a(this.f6918b, c0434c.f6918b) && kotlin.jvm.internal.m.a(this.f6919c, c0434c.f6919c) && kotlin.jvm.internal.m.a(this.f6920d, c0434c.f6920d) && kotlin.jvm.internal.m.a(this.f6921e, c0434c.f6921e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6917a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f6918b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f6919c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6920d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f6921e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("AdData(regex=");
        sb.append(this.f6917a);
        sb.append(", initialShowDelay=");
        sb.append(this.f6918b);
        sb.append(", adType=");
        k1.i.s(sb, this.f6919c, ", adId=", this.f6920d, ", position=");
        return k1.i.k(sb, this.f6921e, ")");
    }
}
