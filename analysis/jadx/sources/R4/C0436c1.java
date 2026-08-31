package R4;

/* JADX INFO: renamed from: R4.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0436c1 {
    public static final C0432b1 Companion = new C0432b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6929c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0436c1(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.f6927a = null;
        } else {
            this.f6927a = bool;
        }
        if ((i & 2) == 0) {
            this.f6928b = null;
        } else {
            this.f6928b = str;
        }
        if ((i & 4) == 0) {
            this.f6929c = null;
        } else {
            this.f6929c = str2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0436c1)) {
            return false;
        }
        C0436c1 c0436c1 = (C0436c1) obj;
        return kotlin.jvm.internal.m.a(this.f6927a, c0436c1.f6927a) && kotlin.jvm.internal.m.a(this.f6928b, c0436c1.f6928b) && kotlin.jvm.internal.m.a(this.f6929c, c0436c1.f6929c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f6927a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f6928b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6929c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("InterComm(enable=");
        sb.append(this.f6927a);
        sb.append(", apiKey=");
        sb.append(this.f6928b);
        sb.append(", appId=");
        return k1.i.k(sb, this.f6929c, ")");
    }
}
