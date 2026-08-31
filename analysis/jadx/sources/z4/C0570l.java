package Z4;

/* JADX INFO: renamed from: Z4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0570l {
    public static final C0569k Companion = new C0569k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8496b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0570l(String str, String str2, int i) {
        if ((i & 1) == 0) {
            this.f8495a = null;
        } else {
            this.f8495a = str;
        }
        if ((i & 2) == 0) {
            this.f8496b = null;
        } else {
            this.f8496b = str2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0570l)) {
            return false;
        }
        C0570l c0570l = (C0570l) obj;
        return kotlin.jvm.internal.m.a(this.f8495a, c0570l.f8495a) && kotlin.jvm.internal.m.a(this.f8496b, c0570l.f8496b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f8495a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8496b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CardContent(type=" + this.f8495a + ", url=" + this.f8496b + ")";
    }
}
