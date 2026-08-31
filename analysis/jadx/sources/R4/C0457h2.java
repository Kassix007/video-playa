package R4;

/* JADX INFO: renamed from: R4.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0457h2 {
    public static final C0453g2 Companion = new C0453g2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6968c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0457h2(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f6966a = null;
        } else {
            this.f6966a = str;
        }
        if ((i & 2) == 0) {
            this.f6967b = null;
        } else {
            this.f6967b = str2;
        }
        if ((i & 4) == 0) {
            this.f6968c = null;
        } else {
            this.f6968c = str3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0457h2)) {
            return false;
        }
        C0457h2 c0457h2 = (C0457h2) obj;
        return kotlin.jvm.internal.m.a(this.f6966a, c0457h2.f6966a) && kotlin.jvm.internal.m.a(this.f6967b, c0457h2.f6967b) && kotlin.jvm.internal.m.a(this.f6968c, c0457h2.f6968c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6966a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6967b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6968c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return k1.i.k(C0.S.r("RichBottomBarExpandableItems(url=", this.f6966a, ", label=", this.f6967b, ", icon="), this.f6968c, ")");
    }
}
