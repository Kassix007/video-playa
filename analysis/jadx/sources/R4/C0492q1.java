package R4;

/* JADX INFO: renamed from: R4.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0492q1 {
    public static final C0488p1 Companion = new C0488p1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7163c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0492q1(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f7161a = null;
        } else {
            this.f7161a = str;
        }
        if ((i & 2) == 0) {
            this.f7162b = null;
        } else {
            this.f7162b = str2;
        }
        if ((i & 4) == 0) {
            this.f7163c = null;
        } else {
            this.f7163c = str3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0492q1)) {
            return false;
        }
        C0492q1 c0492q1 = (C0492q1) obj;
        return kotlin.jvm.internal.m.a(this.f7161a, c0492q1.f7161a) && kotlin.jvm.internal.m.a(this.f7162b, c0492q1.f7162b) && kotlin.jvm.internal.m.a(this.f7163c, c0492q1.f7163c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f7161a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7162b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7163c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return k1.i.k(C0.S.r("MenusItemList(label=", this.f7161a, ", fileName=", this.f7162b, ", url="), this.f7163c, ")");
    }
}
