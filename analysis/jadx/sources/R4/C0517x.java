package R4;

/* JADX INFO: renamed from: R4.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0517x {
    public static final C0513w Companion = new C0513w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f7205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f7207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7208e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7209g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0517x(int i, String str, Integer num, String str2, Integer num2, String str3, String str4, String str5) {
        if (63 != (i & 63)) {
            Z5.N.e(i, 63, C0509v.f7197a.b());
            throw null;
        }
        this.f7204a = str;
        this.f7205b = num;
        this.f7206c = str2;
        this.f7207d = num2;
        this.f7208e = str3;
        this.f = str4;
        if ((i & 64) == 0) {
            this.f7209g = null;
        } else {
            this.f7209g = str5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0517x)) {
            return false;
        }
        C0517x c0517x = (C0517x) obj;
        return kotlin.jvm.internal.m.a(this.f7204a, c0517x.f7204a) && kotlin.jvm.internal.m.a(this.f7205b, c0517x.f7205b) && kotlin.jvm.internal.m.a(this.f7206c, c0517x.f7206c) && kotlin.jvm.internal.m.a(this.f7207d, c0517x.f7207d) && kotlin.jvm.internal.m.a(this.f7208e, c0517x.f7208e) && kotlin.jvm.internal.m.a(this.f, c0517x.f) && kotlin.jvm.internal.m.a(this.f7209g, c0517x.f7209g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f7204a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f7205b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f7206c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f7207d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f7208e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f7209g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(borderColor=");
        sb.append(this.f7204a);
        sb.append(", borderWidth=");
        sb.append(this.f7205b);
        sb.append(", btnBgColor=");
        sb.append(this.f7206c);
        sb.append(", roundedCornerPercent=");
        sb.append(this.f7207d);
        sb.append(", text=");
        k1.i.s(sb, this.f7208e, ", textColor=", this.f, ", url=");
        return k1.i.k(sb, this.f7209g, ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0517x(String str, Integer num, String str2, Integer num2, String str3, String str4, String str5) {
        this.f7204a = str;
        this.f7205b = num;
        this.f7206c = str2;
        this.f7207d = num2;
        this.f7208e = str3;
        this.f = str4;
        this.f7209g = str5;
    }
}
