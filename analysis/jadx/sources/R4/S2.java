package R4;

/* JADX INFO: loaded from: classes.dex */
public final class S2 {
    public static final R2 Companion = new R2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6854c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ S2(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f6852a = null;
        } else {
            this.f6852a = str;
        }
        if ((i & 2) == 0) {
            this.f6853b = null;
        } else {
            this.f6853b = str2;
        }
        if ((i & 4) == 0) {
            this.f6854c = null;
        } else {
            this.f6854c = str3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S2)) {
            return false;
        }
        S2 s22 = (S2) obj;
        return kotlin.jvm.internal.m.a(this.f6852a, s22.f6852a) && kotlin.jvm.internal.m.a(this.f6853b, s22.f6853b) && kotlin.jvm.internal.m.a(this.f6854c, s22.f6854c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6852a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6853b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6854c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return k1.i.k(C0.S.r("Tab(link=", this.f6852a, ", icon=", this.f6853b, ", label="), this.f6854c, ")");
    }
}
