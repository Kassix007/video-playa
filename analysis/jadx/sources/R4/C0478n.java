package R4;

/* JADX INFO: renamed from: R4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0478n {
    public static final C0474m Companion = new C0474m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7132a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0478n(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f7132a = Boolean.FALSE;
        } else {
            this.f7132a = bool;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0478n) && kotlin.jvm.internal.m.a(this.f7132a, ((C0478n) obj).f7132a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f7132a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Beacon(enable=" + this.f7132a + ")";
    }
}
