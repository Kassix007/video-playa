package R4;

/* JADX INFO: renamed from: R4.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0447f0 {
    public static final C0443e0 Companion = new C0443e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6947b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0447f0(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.f6946a = null;
        } else {
            this.f6946a = bool;
        }
        if ((i & 2) == 0) {
            this.f6947b = null;
        } else {
            this.f6947b = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0447f0)) {
            return false;
        }
        C0447f0 c0447f0 = (C0447f0) obj;
        return kotlin.jvm.internal.m.a(this.f6946a, c0447f0.f6946a) && kotlin.jvm.internal.m.a(this.f6947b, c0447f0.f6947b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f6946a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f6947b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "EnableCustomBackHandling(enable=" + this.f6946a + ", regEx=" + this.f6947b + ")";
    }
}
