package R4;

/* JADX INFO: loaded from: classes.dex */
public final class G2 {
    public static final F2 Companion = new F2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6767c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ G2(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f6765a = null;
        } else {
            this.f6765a = str;
        }
        if ((i & 2) == 0) {
            this.f6766b = null;
        } else {
            this.f6766b = str2;
        }
        if ((i & 4) == 0) {
            this.f6767c = null;
        } else {
            this.f6767c = str3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2)) {
            return false;
        }
        G2 g22 = (G2) obj;
        return kotlin.jvm.internal.m.a(this.f6765a, g22.f6765a) && kotlin.jvm.internal.m.a(this.f6766b, g22.f6766b) && kotlin.jvm.internal.m.a(this.f6767c, g22.f6767c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6765a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6766b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6767c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return k1.i.k(C0.S.r("Shortcuts(url=", this.f6765a, ", fileName=", this.f6766b, ", label="), this.f6767c, ")");
    }
}
